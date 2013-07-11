/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 *     Flavie Roussy - enumeration attributes taken into account
 *     					duplication corrected
 ******************************************************************************/
package lu.uni.geko.weaver.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lu.uni.geko.common.Av2BaseEqualityHelper;
import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.bridges.JavaBridge;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ecore.BidirectionalReferencesCopyingCopier;
import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.AdviceEffectuation;
import lu.uni.geko.weaver.add.SimpleAdderExt;
import lu.uni.geko.weaver.copy.MainCopier;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;


/**
 * The class responsible for merging elements during the weaving. It stores the information of the advice and advice effectuation
 * for which it is used and initiates all needed merges of base and advice elements.
 *
 * @author Max E. Kramer
 */
public class Merger {
	/** The advice for which this merger is used. */
	private final Advice advice;
	/** The advice effectuation for which this merger is used. */
	private final AdviceEffectuation avEffectuation;
	/** The root element of the woven model. */
	private final EObject wovenRoot;
	/** The copier used for duplicating base elements. */
	private final Copier baseCopier;
	/** The feature equivalence helper for this merger. */
	private final FeatureEquivalenceHelper featureEquivalenceHelper;
	/**
	 * The mapping from base elements to the set of feature conflicts.<br/>
	 * <br/>
	 *
	 * <b>What feature conflicts are:</b><br/>
	 * Whenever two or more base elements are mapped to an advice element this results in a merge of these base elements.<br/>
	 * One of the base elements will be kept and the attributes and references of all the other base elements are introduced to
	 * this kept base element.<br/>
	 * During these subsequent merge operations of two base elements it may happen that both have a feature value that allows for
	 * exactly one value.<br/>
	 * As all base elements are handled in the same way we cannot decide which feature value to keep.<br/>
	 * Therefore we register every conflicting feature value of every base object.<br/>
	 * Such a conflict can be resolved whenever an advice element sets such a feature value (as it means that whatever was set
	 * before is overwritten).<br/>
	 * When all registered conflicts are resolved like this at the end of the merge we are happy. Otherwise we issue an error.<br/>
	 */
	private final Map<EObject, Set<EStructuralFeature>> baseElements2FeatureConflictsMap;
	/** The mapping from merged base elements to the base element that was kept for them. */
	private final Map<EObject, EObject> merged2KeptBaseElementMap;
	/** Convenient access to the message console. */
	private final SimpleMessageConsole console;

	/**
	 * Creates a new Merger for the given advice, advice effectuation and URI of a woven model.
	 *
	 * @param advice
	 *           an advice
	 * @param avEffectuation
	 *           an advice effectuation
	 * @param wovenMURI
	 *           the URI of a woven model
	 */
	public Merger(final Advice advice, final AdviceEffectuation avEffectuation, final URI wovenMURI) {
		this.advice = advice;
		this.avEffectuation = avEffectuation;
		this.wovenRoot = MainResourceLoader.getUniqueContentRootIfCorrectlyTyped(wovenMURI, "wove model", EObject.class);
		this.baseCopier = new BidirectionalReferencesCopyingCopier();
		this.featureEquivalenceHelper = new FeatureEquivalenceHelper(new Av2BaseEqualityHelper());
		this.baseElements2FeatureConflictsMap = new HashMap<EObject, Set<EStructuralFeature>>();
		this.merged2KeptBaseElementMap = new HashMap<EObject, EObject>();
		this.console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
	}

	/**
	 * Performs all merges required for this merger and returns the feature equivalence helper that was used during the merge.
	 * Throws a {@link java.lang.RuntimeException RuntimeException} when not all feature value conflicts have been resolved after
	 * all merges have been performed.<br/>
	 * <br/>
	 * <b>Attention</b>: As a <b>side-effect</b>, the advice elements that became a content of a model element during a merge are
	 * removed from the set of remaining advice elements to be added of the advice effectuation of this merger.
	 *
	 * @return the feature equivalence helper
	 */
	public FeatureEquivalenceHelper performMergesAndReturnFeatureEquivalenceHelper() {
		performMerges();
		boolean resolved = allBaseWithBaseMergeFeatureConflictsResolved();
		if (!resolved) {
			// MAYDO MK check in advance whether base with base merge feature value conflicts will remain and ask user to reformulate
			// pointcut and advice (and do the same for all other kinds of unweavable circumstances)
			throw new RuntimeException(
					"There are still base with base merge feature value conflicts that have not been resolved!");
		}
		return this.featureEquivalenceHelper;
	}

	/**
	 * Performs the merges for this merger by iterating over all base to advice merge entries of the advice effectuation of this
	 * merger.
	 */
	private void performMerges() {
		Map<EObject, List<EObject>> avEffectuationModification = new HashMap<EObject, List<EObject>>();;
		for (Entry<Set<EObject>, Set<EObject>> base2AdviceMergeEntry : avEffectuation.getBase2AvMergeEntries()) {
			Set<EObject> baseElements = base2AdviceMergeEntry.getKey();
			Set<EObject> avElements = base2AdviceMergeEntry.getValue();
			if (baseElements.size() == 1) {
				EObject baseElement = JavaBridge.one(baseElements);
				if (avElements.size() == 1) {
					EObject avElement = JavaBridge.one(avElements);
					merge1BaseWith1AvElement(baseElement, avElement);
				} else {
					avEffectuationModification.putAll(merge1BaseWithNAvElements(baseElement, avElements));
				}
			} else { // baseElements.size() != 1
				if (baseElements.size() >= 1 && avElements.size() == 1) {
					EObject avElement = JavaBridge.one(avElements);
					mergeNBaseWith1AvElement(baseElements, avElement);
				}
				// TODO MK decide what to do with mappings that map multiple pointcut elements to multiple advice elements
			}
		}
		//perform the remove and add operations we get from merge1BaseWithNAvElements
		for( Entry<EObject, List<EObject>> mergeEntry : avEffectuationModification.entrySet()) {
			EObject avElement = mergeEntry.getKey();
			EObject baseElement = mergeEntry.getValue().get(0);
			EObject baseElementCopy = mergeEntry.getValue().get(1);
			avEffectuation.removeBase2AvMerge(baseElement, avElement);
	        avEffectuation.addBase2AvMerge(baseElementCopy, avElement);
		}
		replaceReferencesToMergedBaseElements();
	}

	/**
	 * Merges the given single base element with the given multiple advice elements.
	 *
	 * @param baseElement
	 *           a base element
	 * @param avElementsMapEntrySet
	 *           the original set from the base to advice merge map containing the advice elements to be merged with the given base
	 *           element
	 */
	   private Map<EObject, List<EObject>> merge1BaseWithNAvElements(final EObject baseElement, final Set<EObject> avElementsMapEntrySet) {
		   	  Map<EObject, List<EObject>> res = new HashMap<EObject, List<EObject>>();
		      // copy the advice elements set as it is the real entry in the map and should not be changed accidentally
		      Set<EObject> avElements = new HashSet<EObject>(avElementsMapEntrySet);
		      EObject directlyMergedAvEObject = JavaBridge.pop(avElements);
		      List<EObject> baseElementCopies = new ArrayList<EObject>(avElements.size());
		      for (EObject avElement : avElements) {
		         EObject baseElementCopy = baseCopier.copy(baseElement);
		         // Now we have duplicated the base element that has to be merged with multiple advice elements.
		         // This means our base2AdviceMergeBiMap should no longer map the original base element to all advice elements.
		         // Instead every new duplicate of the base element should map to the corresponding advice elements (and the other way
		         // round).
		         // This change is realized in two steps. First we remove the mapping from the original base element to the advice
		         // element.
		         // Then we add a new mapping from the base duplicate to the advice element.
		         //FR: doing it now, we perform modifications on the avEffectuation object we are iterating on
		         //stores the wanted modifications to perform them later
		         /*avEffectuation.removeBase2AvMerge(baseElement, avElement);
		         avEffectuation.addBase2AvMerge(baseElementCopy, avElement);*/
		         List<EObject> baseSet = new ArrayList<EObject>();
		         baseSet.add(baseElement);
		         baseSet.add(baseElementCopy);
		         res.put(avElement, baseSet);
		         
		         // We did this mapping change as early as possible and now we can go on with processing the copy and merging it.
		         baseCopier.copyReferences();
		         baseElementCopies.add(baseElementCopy);
		         merge1BaseWith1AvElement(baseElementCopy, avElement);
		         
		         //guess the containment reference from the mapping
		         List<Pair<SimpleAdderExt, Integer>> simpleAdders = GeKoBridge.getRegisteredExtensionsWithPriority(SimpleAdderExt.ID,
				            SimpleAdderExt.class);
					SimpleAdderExt simpleAdderExt = simpleAdders.get(0).getFirst();
					Pair<EReference, EObject> containmentPair = simpleAdderExt.getContainmentReferenceAndContainer(wovenRoot,
							avElement, advice, avEffectuation, featureEquivalenceHelper);
					if (containmentPair != null) {
						EReference containmentReference = containmentPair.getFirst();
						EObject possibleContainer = containmentPair.getSecond();
						addToContainmentIfPossible(avElement, baseElementCopy,
									containmentReference, possibleContainer, featureEquivalenceHelper);
					}
		         
		         console.println("Copied the base object '" + baseElement + "' and merged it with the advice object'" + avElement
		               + "': '" + baseElementCopy + "'");
		      }

		      /*Collection<Setting> referencesToBaseElement = EcoreBridge.getReferencesTo(baseElement);
		      for (Setting oldReferenceToBaseElement : referencesToBaseElement) {
		         EStructuralFeature referencingFeature = oldReferenceToBaseElement.getEStructuralFeature();
		         EObject oldReferencingElement = oldReferenceToBaseElement.getEObject();
		         if (referencingFeature.isMany()) {
		            List<EObject> referencedValues = EcoreBridge
		                  .getFeatureValuesIfManyTyped(oldReferencingElement, referencingFeature);
		            int currentSize = referencedValues.size();
		            boolean upperBoundNotExceeded = ensureReferenceDoesNotExceedUpperBound(currentSize, referencingFeature,
		                  baseElementCopies, baseElement);
		            if (upperBoundNotExceeded) {
		               referencedValues.addAll(baseElementCopies);
		               console.println("Added reference copies for the reference to '" + baseElement + "' to the '"
		                     + referencingFeature.getName() + "' feature of the base object '" + oldReferencingElement + "'");

		            }
		         } else { // !referencingFeature.isMany()
		            EStructuralFeature referencingElementContainmentFeature = oldReferencingElement.eContainmentFeature();
		            EObject referenceContainer = oldReferencingElement.eContainer();
		            boolean containedInCopySource = EcoreBridge.containedIn(referenceContainer, baseElement);
		            boolean containedInCopyTarget = EcoreBridge.containedIn(referenceContainer, baseElementCopies);
		            if (!containedInCopySource && !containedInCopyTarget) {
		               if (referencingElementContainmentFeature.isMany()) {
		                  List<EObject> referencingEObjectSiblings = EcoreBridge.getFeatureValuesIfManyTyped(referenceContainer,
		                        referencingElementContainmentFeature);
		                  int currentSize = referencingEObjectSiblings.size();
		                  boolean upperBoundNotExceeded = ensureReferenceDoesNotExceedUpperBound(currentSize,
		                        referencingElementContainmentFeature, baseElementCopies, baseElement, oldReferencingElement);
		                  if (upperBoundNotExceeded) {
		                     for (EObject baseEObjectCopy : baseElementCopies) {
		                        EObject referencingElementCopy = baseCopier.copy(oldReferencingElement);
		                        baseCopier.copyReferences();
		                        referencingElementCopy.eSet(referencingFeature, baseEObjectCopy);
		                        referencingEObjectSiblings.add(referencingElementCopy);
		                        console.println("Added the copy '" + referencingElementCopy + "' of the referencing object '"
		                              + oldReferencingElement + "' for the reference '" + referencingFeature.getName()
		                              + "' referencing the copy '" + baseEObjectCopy + "' of the base object '" + baseElement
		                              + "' to the container '" + referenceContainer + "'");
		                     }
		                  }
		               }
		            }
		         }
		         // TODO MK recursively continue copying referencing objects that reference base objects that have to be copied
		         // until you reach a reference that can be copied
		      }*/
		      merge1BaseWith1AvElement(baseElement, directlyMergedAvEObject);
		      return res;
		   }
	   
	   
	   
		/**
		 * Adds the given base variant of the given advice element to the given containment reference of the given container if the
		 * reference has the right type. If the addition was successful the elements that are contained in the added element are
		 * registered in the given sets of already contained elements.
		 *
		 * @param avElementoAdd
		 *           the advice element to add
		 * @param baseVariantOfAvElementToAdd
		 *           the base variant of the given advice element
		 * @param containmentReference
		 *           the containment reference to be used for the addition
		 * @param possibleContainer
		 *           the container to be used for the addition
		 * @param avElementsAlreadyAdded
		 *           the set containing the advice elements that have been added
		 * @param baseVariantsOfAlreadyContainedAvElements
		 *           the set containing the base variants of the advice elements that have been added
		 * @param featureEquivalenceHelper
		 *           a feature equivalence helper
		 */
		private void addToContainmentIfPossible(final EObject avElementoAdd, final EObject baseVariantOfAvElementToAdd,
				final EReference containmentReference, final EObject possibleContainer, final FeatureEquivalenceHelper featureEquivalenceHelper) {
			EClassifier uniqueRootContainmentReferenceType = containmentReference.getEType();
			EClass avClass = avElementoAdd.eClass();
			if (featureEquivalenceHelper.isSameOrSuperType(avClass, uniqueRootContainmentReferenceType)) {
				List<EObject> rootElementContents = EcoreBridge.getFeatureValuesIfManyTyped(possibleContainer, containmentReference);
				rootElementContents.add(baseVariantOfAvElementToAdd);
				SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
				console.println("Added the advice element '" + baseVariantOfAvElementToAdd + "' to the containment reference '"
						+ containmentReference.getName() + "' of the unique root element '" + possibleContainer
						+ "' of the woven model.");
			}
		}




	/**
	 * Ensures that the given current size does not exceed the upper bound for the given referencing feature and the given elements
	 * to be referenced by throwing a {@link java.util.RuntimeException RuntimeException} if it is the case and returning
	 * {@code true} otherwise. The given referenced and referencing elements are only used for output.
	 *
	 * @param currentSize
	 *           the current total number of referenced elements
	 * @param referencingFeature
	 *           the referencing structural feature
	 * @param elementsToReference
	 *           the list of elements to be newly referenced
	 * @param referencedElement
	 *           the referenced element
	 * @param referencingElement
	 *           the referencing element
	 * @return {@code true} if the upper bound of the given reference is not exceeded once the given elements to be referenced are
	 *         newly referenced
	 */
	private boolean ensureReferenceDoesNotExceedUpperBound(final int currentSize, final EStructuralFeature referencingFeature,
			final List<EObject> elementsToReference, final EObject referencedElement, final EObject referencingElement) {
		return ensureReferenceDoesNotExceedUpperBound(currentSize, referencingFeature, elementsToReference, referencedElement,
				"the referencing object '" + referencingElement + "' for ");
	}

	/**
	 * Ensures that the given current size does not exceed the upper bound for the given referencing feature and the given elements
	 * to be referenced by throwing a {@link java.util.RuntimeException RuntimeException} if it is the case and returning
	 * {@code true} otherwise. The given referenced element is only used for output.
	 *
	 * @param currentSize
	 *           the current total number of referenced elements
	 * @param referencingFeature
	 *           the referencing structural feature
	 * @param elementsToReference
	 *           the list of elements to be newly referenced
	 * @param referencedElement
	 *           the referenced element
	 * @return {@code true} if the upper bound of the given reference is not exceeded once the given elements to be referenced are
	 *         newly referenced
	 */
	private boolean ensureReferenceDoesNotExceedUpperBound(final int currentSize, final EStructuralFeature referencingFeature,
			final List<EObject> elementsToReference, final EObject referencedElement) {
		return ensureReferenceDoesNotExceedUpperBound(currentSize, referencingFeature, elementsToReference, referencedElement,
				"");
	}

	/**
	 * Ensures that the given current size does not exceed the upper bound for the given feature and the given elements to be
	 * referenced by throwing a {@link java.util.RuntimeException RuntimeException} if it is the case and returning {@code true}
	 * otherwise. The given referenced element and indirect reference message are only used for output.
	 *
	 * @param currentSize
	 *           the current total number of referenced elements
	 * @param feature
	 *           the referencing structural feature
	 * @param elementsToReference
	 *           the list of elements to be newly referenced
	 * @param referencedElement
	 *           the referenced element
	 * @param indirectReferenceMessage
	 *           a message for output in case of indirect references
	 * @return {@code true} if the upper bound of the given reference is not exceeded once the given elements to be referenced are
	 *         newly referenced
	 */
	private boolean ensureReferenceDoesNotExceedUpperBound(final int currentSize, final EStructuralFeature feature,
			final List<EObject> elementsToReference, final EObject referencedElement, final String indirectReferenceMessage) {
		return EcoreBridge.ensureUpperBoundNotExceeded(currentSize, feature, elementsToReference, "duplicate "
				+ indirectReferenceMessage + " the reference to the object '" + referencedElement + "' for the duplicates '"
				+ elementsToReference + "'");
	}

	/**
	 * Merges the given single base element with the given single advice element feature-wise.
	 *
	 * @param baseElement
	 *           a base element
	 * @param avElement
	 *           an advice element to be merged with the given base element
	 */
	private void merge1BaseWith1AvElement(final EObject baseElement, final EObject avElement) {
		Collection<Pair<EStructuralFeature, EStructuralFeature>> equivalentFeatures = featureEquivalenceHelper
				.getEquivalentFeatures(baseElement, avElement);
		for (Pair<EStructuralFeature, EStructuralFeature> equivalentFeaturePair : equivalentFeatures) {
			if (equivalentFeaturePair.getFirst().isMany()) {
				adviceMergeEquivalentManyFeature(baseElement, avElement, equivalentFeaturePair.getFirst(),
						equivalentFeaturePair.getSecond());
			} else {
				adviceMergeEquivalentNotManyFeature(baseElement, avElement, equivalentFeaturePair.getFirst(),
						equivalentFeaturePair.getSecond());
			}
		}
	}

	/**
	 * Merges the given multiple base elements with the given single advice element by first merging all base elements to one base
	 * element and then merging this base element with the advice element.
	 *
	 * @param baseElements
	 *           a set containing base elements to be merged with each other
	 * @param avElement
	 *           an advice element to be merged with the given base elements
	 */
	private void mergeNBaseWith1AvElement(final Set<EObject> baseElements, final EObject avElement) {
		EObject keptBaseElement = JavaBridge.pop(baseElements);
		for (EObject disappearingBaseEObject : baseElements) {
			merge1BaseWith1BaseEObject(keptBaseElement, disappearingBaseEObject);
			this.merged2KeptBaseElementMap.put(disappearingBaseEObject, keptBaseElement);
		}
		merge1BaseWith1AvElement(keptBaseElement, avElement);
	}

	/**
	 * Merges the given first base element with the given second base element feature-wise while keeping the first element.
	 *
	 * @param keptBaseEObject
	 *           a base element to be merged with the given second base element so that it is kept as entity
	 * @param disappearingBaseEObject
	 *           a base element to be merged with the given first base element so that it disappears
	 */
	private void merge1BaseWith1BaseEObject(final EObject keptBaseEObject, final EObject disappearingBaseEObject) {
		Collection<Pair<EStructuralFeature, EStructuralFeature>> equivalentFeatures = featureEquivalenceHelper
				.getEquivalentFeatures(keptBaseEObject, disappearingBaseEObject);
		for (Pair<EStructuralFeature, EStructuralFeature> equivalentFeaturePair : equivalentFeatures) {
			if (equivalentFeaturePair.getFirst().isMany()) {
				baseMergeEquivalentManyFeature(keptBaseEObject, disappearingBaseEObject, equivalentFeaturePair.getFirst(),
						equivalentFeaturePair.getSecond());
			} else {
				baseMergeEquivalentNotManyFeature(keptBaseEObject, disappearingBaseEObject, equivalentFeaturePair.getFirst(),
						equivalentFeaturePair.getSecond());
			}
		}
	}

	/**
	 * Merges the given many feature of the given base elements while keeping the first element.
	 *
	 * @param keptBaseElement
	 *           a base element to be merged with the given second base element so that it is kept as entity
	 * @param disappearingBaseElement
	 *           a base element to be merged with the given first base element so that it disappears
	 * @param keptFeature
	 *           the feature of the base element to be kept
	 * @param disappearingFeature
	 *           the feature of the base element to disappear
	 */
	private void baseMergeEquivalentManyFeature(final EObject keptBaseElement, final EObject disappearingBaseElement,
			final EStructuralFeature keptFeature, final EStructuralFeature disappearingFeature) {
		List<EObject> keptFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(keptBaseElement, keptFeature);
		List<EObject> disappearingFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(disappearingBaseElement,
				disappearingFeature);
		// RATIONALE MK avoid a ConcurrentModificationException for disappearingFeatureValues as adding elements of it to
		// keptFeatureValues removes them from disappearingFeatureValues!
		List<EObject> featureValuesToAdd = new ArrayList<EObject>();
		boolean upperBoundNotExceeded = ensureMergeDoesNotExceedUpperBound(keptFeatureValues, keptFeature,
				disappearingFeatureValues, keptBaseElement, disappearingBaseElement);
		if (upperBoundNotExceeded) {
			for (EObject disappearingFeatureValue : disappearingFeatureValues) {
				featureValuesToAdd.add(disappearingFeatureValue);
				console.println("Added '" + disappearingFeatureValue + "' to the '" + keptFeature.getName()
						+ "' reference of the base object '" + keptBaseElement + "'");
			}
			keptFeatureValues.addAll(featureValuesToAdd);
		}
	}

	/**
	 * Ensures that the upper bound of the given feature will not be exceeded in case the given elements are added to it during the
	 * merge of the given source and target element. Throws a {@link java.util.RuntimeException RuntimeException} if the upper
	 * bound will be exceeded and returns {@code true} otherwise. The given source and target element are only used for output.
	 *
	 * @param targetFeatureValues
	 *           the current values of the given feature
	 * @param targetFeature
	 *           the structural feature
	 * @param elementsToAdd
	 *           the list of elements to be added to the feature during the merge
	 * @param targetElement
	 *           the target element to be merged
	 * @param sourceElement
	 *           the source element to be merged
	 * @return {@code true} if the upper bound of the given feature is not exceeded once the given elements are added
	 */
	private boolean ensureMergeDoesNotExceedUpperBound(final List<EObject> targetFeatureValues,
			final EStructuralFeature targetFeature, final List<EObject> elementsToAdd, final EObject targetElement,
			final EObject sourceElement) {
		return EcoreBridge.ensureUpperBoundNotExceeded(
				targetFeatureValues,
				targetFeature,
				elementsToAdd,
				"merge the two objects '" + targetElement + "' and '" + sourceElement + "' " + "because the '"
						+ targetFeature.getName() + " reference to '" + elementsToAdd + "' would have to be added to '"
						+ targetElement + "' " + "but this cannot be done");
	}

	/**
	 * Merges the given not-many feature of the given base elements while keeping the first element.
	 *
	 * @param keptBaseElement
	 *           a base element to be merged with the given second base element so that it is kept as entity
	 * @param disappearingBaseElement
	 *           a base element to be merged with the given first base element so that it disappears
	 * @param keptFeature
	 *           the feature of the base element to be kept
	 * @param disappearingFeature
	 *           the feature of the base element to disappear
	 */
	private void baseMergeEquivalentNotManyFeature(final EObject keptBaseElement, final EObject disappearingBaseElement,
			final EStructuralFeature keptFeature, final EStructuralFeature disappearingFeature) {
		Object keptFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(keptBaseElement, keptFeature);
		Object disappearingFeatureValue = EcoreBridge
				.getFeatureValueIfNotManyTyped(disappearingBaseElement, disappearingFeature);
		if (keptFeatureValue instanceof EObject) {
			if (disappearingFeatureValue instanceof EObject) {
				if (!keptFeatureValue.equals(disappearingFeatureValue)) {
					registerBaseWithBaseFeatureConflict(keptBaseElement, disappearingBaseElement, keptFeature, disappearingFeature,
							keptFeatureValue, disappearingFeatureValue);
				}
			} else { // disappearingFeatureValue !instanceof EObject
				if (disappearingFeatureValue != null) {
					throw new RuntimeException("The feature value '" + keptFeatureValue + "' of the feature '"
							+ keptFeature.getName() + "' of the base object '" + keptBaseElement + "' is an EObject "
							+ "but the feature value '" + disappearingFeatureValue
							+ "'  of the base object that should be merged with it is not an EObject!");
				}
			}
		} else { // keptFeatureValue !instanceof EObject
			if (disappearingFeatureValue != null && !disappearingFeatureValue.equals("")
					&& !disappearingFeatureValue.equals(keptFeatureValue)) {
				registerBaseWithBaseFeatureConflict(keptBaseElement, disappearingBaseElement, keptFeature, disappearingFeature,
						keptFeatureValue, disappearingFeatureValue);
			}
		}
	}

	/**
	 * Registers a feature conflict for the given base elements, features and values.
	 *
	 * @param keptBaseElement
	 *           a base element to be merged with the given second base element so that it is kept as entity
	 * @param disappearingBaseElement
	 *           a base element to be merged with the given first base element so that it disappears
	 * @param keptFeature
	 *           the feature of the base element to be kept
	 * @param disappearingFeature
	 *           the feature of the base element to disappear
	 * @param keptFeatureValue
	 *           the value of the feature of the kept base element
	 * @param disappearingFeatureValue
	 *           the value of the feature of the disappearing base element
	 *
	 * @see Merger#baseElements2FeatureConflictsMap baseElements2FeatureConflictsMap
	 */
	private void registerBaseWithBaseFeatureConflict(final EObject keptBaseElement, final EObject disappearingBaseElement,
			final EStructuralFeature keptFeature, final EStructuralFeature disappearingFeature, final Object keptFeatureValue,
			final Object disappearingFeatureValue) {
		Set<EStructuralFeature> conflictingFeatures = baseElements2FeatureConflictsMap.get(keptBaseElement);
		if (conflictingFeatures == null) {
			conflictingFeatures = new HashSet<EStructuralFeature>();
			baseElements2FeatureConflictsMap.put(keptBaseElement, conflictingFeatures);
		}
		conflictingFeatures.add(keptFeature);
		console.println("Registered a base with base merge feature value conflict for " + keptBaseElement + " . "
				+ keptFeature.getName() + " = " + keptFeatureValue + " " + "and " + disappearingBaseElement + " . "
				+ disappearingFeature.getName() + " = " + disappearingFeatureValue + ".");
	}

	/**
	 * Merges the given many feature of the given base element with the given many feature of the given advice element.
	 *
	 * @param baseElement
	 *           a base element to be merged with the given advice element
	 * @param avElement
	 *           an advice element to be merged with the given base element
	 * @param baseFeature
	 *           the feature of the given base element
	 * @param avFeature
	 *           the feature of the given advice element
	 */
	private void adviceMergeEquivalentManyFeature(final EObject baseElement, final EObject avElement,
			final EStructuralFeature baseFeature, final EStructuralFeature avFeature) {
		List<EObject> baseFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(baseElement, baseFeature);
		List<EObject> adviceFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(avElement, avFeature);
		for (EObject adviceFeatureValue : adviceFeatureValues) {
			// check whether the advice feature value element will be merged
			// with a feature value element of the base
			boolean willBeMergedWithABaseFeatureValue = false;
			for (EObject baseFeatureValueElement : baseFeatureValues) {
				Collection<EObject> adviceElementsToBeMergedWithBaseFeatureValue = avEffectuation
						.getAllAvElementsToMerge(baseFeatureValueElement);
				if (adviceElementsToBeMergedWithBaseFeatureValue != null) {
					willBeMergedWithABaseFeatureValue = adviceElementsToBeMergedWithBaseFeatureValue.contains(adviceFeatureValue);
					if (willBeMergedWithABaseFeatureValue) {
						break;
					}
				}
			}
			if (!willBeMergedWithABaseFeatureValue) {
				boolean upperBoundNotExceeded = ensureMergeDoesNotExceedUpperBound(baseFeatureValues, baseFeature,
						Collections.singletonList(adviceFeatureValue), baseElement, avElement);
				if (upperBoundNotExceeded) {
					EObject baseVariantOfAdviceFeatureValue = getBaseVariantForAdviceElement(adviceFeatureValue);
					baseFeatureValues.add(baseVariantOfAdviceFeatureValue);
					console.println("Added '" + baseVariantOfAdviceFeatureValue + "' to the '" + baseFeature.getName()
							+ "' reference of the base object '" + baseElement + "'");
					registerAvFeatureValueAsAddedIfDone(adviceFeatureValue, baseVariantOfAdviceFeatureValue, baseFeature);
				}
			}
		}
	}

	/**
	 * Returns the base variant of the given advice element by either returning a base element to be merged with the advice element
	 * (if existing) or by returning a new or existing variant copy.
	 *
	 * @param avElement
	 *           an advice element
	 * @return the base variant of the given advice element
	 */
	private EObject getBaseVariantForAdviceElement(final EObject avElement) {
		Set<EObject> baseElementsToBeMergedWithAdviceElement = avEffectuation.getAllBaseElementsToMerge(avElement);
		if (baseElementsToBeMergedWithAdviceElement == null) {
			// we are inspecting a reference to a new element that has no correspondence in the pointcut
			// this is the only case were we actually need to copy something from the advice
			EObject adviceFeatureValueElementCopy = MainCopier.copyAvElement(avElement, wovenRoot, this.advice,
					this.avEffectuation);
			console.println("Copied '" + avElement + "': '" + adviceFeatureValueElementCopy + "'");
			return adviceFeatureValueElementCopy;
		} else {
			// TODO MK currently (20111206) this code will never be reached as as we are calling this only from locations where we
			// know that no base element is mapped to this advice element
			if (baseElementsToBeMergedWithAdviceElement.size() == 1) {
				// we are inspecting a reference to an element that will be merged anyways
				// so we simply need to add a reference to this base element
				EObject baseElementToBeMergedWithAdviceElement = JavaBridge.one(baseElementsToBeMergedWithAdviceElement);
				console.println("Using '" + baseElementToBeMergedWithAdviceElement + "' as a placeholder for '" + avElement);
				return baseElementToBeMergedWithAdviceElement;
			}
			throw new RuntimeException(
					"GeKo is not yet supporting the merge of base objects that are mapped to more than one advice object!");
		}
	}

	/**
	 * Merges the given not-many feature of the given base element with the given not-many feature of the given advice element.
	 *
	 * @param baseElement
	 *           a base element to be merged with the given advice element
	 * @param avElement
	 *           an advice element to be merged with the given base element
	 * @param baseFeature
	 *           the feature of the given base element
	 * @param avFeature
	 *           the feature of the given advice element
	 */
	private void adviceMergeEquivalentNotManyFeature(final EObject baseElement, final EObject avElement,
			final EStructuralFeature baseFeature, final EStructuralFeature avFeature) {
		Object baseFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(baseElement, baseFeature);
		Object avFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(avElement, avFeature);
		if (baseFeatureValue instanceof EObject) {			
			EObject baseFeatureEValue = (EObject) baseFeatureValue;
			if (avFeatureValue instanceof EObject) {
				EObject avFeatureEValue = (EObject) avFeatureValue;
				// check whether our base feature value shall be merged with something
				if (this.avEffectuation.toMergeWithAnAvElement(baseFeatureEValue)) {
					// check whether the feature values will be or already were merged anyways
					if (!this.avEffectuation.toMergeWithThisAvElement(baseFeatureEValue, avFeatureEValue)) {
						// the base object references an object that will be merged
						// but the advice object does not reference this object
						// so we are inspecting a reference that should be changed
						// that is completely fine
						replaceEObjectFeatureValue(baseElement, baseFeature, baseFeatureEValue, avFeatureEValue);
					}
				} else { // the base feature value shall not be merged with anything
					replaceEObjectFeatureValue(baseElement, baseFeature, baseFeatureEValue, avFeatureEValue);
				}
			} else { // adviceFeatureValue !instanceof EObject
				if (avFeatureValue != null) {
					throw new RuntimeException("The base feature value '" + baseFeatureEValue + "' of the feature '"
							+ baseFeature.getName() + "' of the base object '" + baseElement + "' is an EObject "
							+ "but the advice feature value '" + avFeatureValue
							+ "'  of the advice object that should be merged with it is not an EObject!");
				}
			}
		} else { // baseFeatureValue !instanceof EObject
			if(baseFeature.getEType() instanceof EEnum) { // baseFeature instanceof EEnum
				if(avFeature.getEType() instanceof EEnum) {
					Enum newBaseFeatureValue = ((Enum) baseFeatureValue).valueOf(((Enum) baseFeatureValue).getClass(), ((Enum) avFeatureValue).name());
					replaceObjectFeatureValue(baseElement, baseFeature, baseFeatureValue, newBaseFeatureValue);
				}
				else { // adviceFeatureValue !instanceof EEnum
					throw new RuntimeException("The base feature value '" + baseFeatureValue + "' of the feature '"
							+ baseFeature.getName() + "' of the base object '" + baseElement + "' is an EEnum "
							+ "but the advice feature value '" + avFeatureValue
							+ "'  of the advice object that should be merged with it is not an EEnum!");
				}
			}
			else { //classic attributes or baseFeatureValue is null
				if (avFeatureValue instanceof EObject) { //baseFeatureValue null but avFeatureValue EObject
					EObject baseFeatureEValue = (EObject) baseFeatureValue;
					EObject avFeatureEValue = (EObject) avFeatureValue;
					// check whether our base feature value shall be merged with something
					if (this.avEffectuation.toMergeWithAnAvElement(baseFeatureEValue)) {
						// check whether the feature values will be or already were merged anyways
						if (!this.avEffectuation.toMergeWithThisAvElement(baseFeatureEValue, avFeatureEValue)) {
							// the base object references an object that will be merged
							// but the advice object does not reference this object
							// so we are inspecting a reference that should be changed
							// that is completely fine
							replaceEObjectFeatureValue(baseElement, baseFeature, baseFeatureEValue, avFeatureEValue);
						}
					} else { // the base feature value shall not be merged with anything
						replaceEObjectFeatureValue(baseElement, baseFeature, baseFeatureEValue, avFeatureEValue);
					}
				}
				else if (avFeatureValue != null && !avFeatureValue.equals("") && !avFeatureValue.equals(baseFeatureValue)) {
					replaceObjectFeatureValue(baseElement, baseFeature, baseFeatureValue, avFeatureValue);
				}  
			}
		}
	}

	/**
	 * Replaces the given EObject value of the given feature of the given base element with the given advice feature value.
	 *
	 * @param baseElement
	 *           a base element for which the feature value should be replaced
	 * @param baseFeature
	 *           the feature for which the value should be replaced
	 * @param baseFeatureValue
	 *           the current value to be replaced
	 * @param avFeatureValue
	 *           the replacing advice feature value
	 */
	private void replaceEObjectFeatureValue(final EObject baseElement, final EStructuralFeature baseFeature,
			final EObject baseFeatureValue, final EObject avFeatureValue) {
		EObject baseVariantOfAdviceFeatureValue;
		//TODO FR eenum to keep ?
		/*
		if (baseFeatureValue instanceof EEnumLiteral) {
			console.println("suis au bon endroit");
			EEnum baseFeatureEnum = (EEnum) baseFeature.getEType();
			baseVariantOfAdviceFeatureValue = baseFeatureEnum.getEEnumLiteralByLiteral(((EEnumLiteral) avFeatureValue).toString());
		}
		else {*/
		baseVariantOfAdviceFeatureValue = getBaseVariantForAdviceElement(avFeatureValue);
		//}
		replaceObjectFeatureValue(baseElement, baseFeature, baseFeatureValue, baseVariantOfAdviceFeatureValue);
		registerAvFeatureValueAsAddedIfDone(avFeatureValue, baseVariantOfAdviceFeatureValue, baseFeature);
	}

	/**
	 * Replaces the given value of the given feature of the given base element with the given advice feature value.
	 *
	 * @param baseElement
	 *           a base element for which the feature value should be replaced
	 * @param baseFeature
	 *           the feature for which the value should be replaced
	 * @param baseFeatureValue
	 *           the current value to be replaced
	 * @param avFeatureValue
	 *           the replacing advice feature value
	 */
	private void replaceObjectFeatureValue(final EObject baseElement, final EStructuralFeature baseFeature,
			final Object baseFeatureValue, final Object avFeatureValue) {
		EcoreUtil.replace(baseElement, baseFeature, baseFeatureValue, avFeatureValue);
		console.println("Changed the '" + baseFeature.getName() + "' feature value of the base object '" + baseElement
				+ "' from '" + baseFeatureValue + "' to '" + avFeatureValue + "'.");
		removeBaseWithBaseFeatureConflict(baseElement, baseFeature);
	}

	/**
	 * Removes a feature conflict for the given base element and feature and value (if existing).
	 *
	 * @param baseElement
	 *           a base element for which a feature conflict should be removed
	 * @param baseFeature
	 *           the feature of the given base element for which a feature conflict should be removed
	 *
	 * @see Merger#baseElements2FeatureConflictsMap baseElements2FeatureConflictsMap
	 */
	public void removeBaseWithBaseFeatureConflict(final EObject baseElement, final EStructuralFeature baseFeature) {
		Set<EStructuralFeature> conflictingFeatures = baseElements2FeatureConflictsMap.get(baseElement);
		if (conflictingFeatures != null) {
			// RATIONALE MK avoid accessing the object two times for the contains and for the remove method
			boolean wasAConflict = conflictingFeatures.remove(baseFeature);
			if (wasAConflict) {
				console.println("This feature value change resolved the base with base merge conflict for " + baseElement + " . "
						+ baseFeature.getName() + ".");
			}
		}
	}

	/**
	 * Registers the given advice feature value as already added in the advice effectuation of this merger if its base variant is
	 * contained using the given base feature as containment feature.<br/>
	 * <br/>
	 * <b>Attention</b>: As a <b>side-effect</b>, the advice feature value and all its content are removed from the set of
	 * remaining advice elements to be added of the advice effectuation of this merger.
	 *
	 * @param adviceFeatureValue
	 *           a feature value of an advice element
	 * @param baseVariantOfAdviceFeatureValue
	 *           the base variant of the given advice feature value
	 * @param baseFeature
	 *           a base feature that may be the containment feature of the given base variant advice feature value
	 */
	private void registerAvFeatureValueAsAddedIfDone(final EObject adviceFeatureValue,
			final EObject baseVariantOfAdviceFeatureValue, final EStructuralFeature baseFeature) {
		// check whether by adding a reference to the advice feature element
		// this element also became a content of the base object (and thus of the overall model)
		// attention: we need to use the base mm variant of the advice feature value to obtain the same feature
		EReference adviceFeatureValueContainmentFeature = baseVariantOfAdviceFeatureValue.eContainmentFeature();
		if (baseFeature.equals(adviceFeatureValueContainmentFeature)) {
			// attention: we need to remove the advice mm variants of the advice feature value and its contents from the list of
			// elements to be added
			boolean madeContent = this.avEffectuation.registerAddedAvElement(adviceFeatureValue);
			if (madeContent) {
				console.println("This reference change made '" + baseVariantOfAdviceFeatureValue + "' a new content of  '"
						+ adviceFeatureValue.eContainer() + "'.");
				Set<EObject> adviceFeatureValueAllContentsSet = EcoreBridge.getAllContentsSet(adviceFeatureValue);
				this.avEffectuation.registerAddedAvElements(adviceFeatureValueAllContentsSet);
			}
		}
	}

	/**
	 * Replaces all references to base element that have been merged with other base elements with references to the kept base
	 * elements.
	 */
	private void replaceReferencesToMergedBaseElements() {
		for (Entry<EObject, EObject> merged2KeptBaseElementEntry : merged2KeptBaseElementMap.entrySet()) {
			EObject mergedBaseElement = merged2KeptBaseElementEntry.getKey();
			EObject keptBaseElement = merged2KeptBaseElementEntry.getValue();
			Collection<Setting> references = EcoreBridge.getReferencesTo(mergedBaseElement);
			for (Setting reference : references) {
				EStructuralFeature referencingFeature = reference.getEStructuralFeature();
				EObject referencingElement = reference.getEObject();
				if (referencingFeature.isMany()) {
					List<EObject> referencedFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(referencingElement,
							referencingFeature);
					referencedFeatureValues.remove(mergedBaseElement);
					referencedFeatureValues.add(keptBaseElement);
					// TODO MK ensure that we do not have to perform another iteration of cleanup when we changed a reference to a base
					// object that was merged with another base object
				} else {
					reference.set(keptBaseElement);
					// TODO MK ensure that we do not have to perform another iteration of cleanup when we changed a reference to a base
					// object that was merged with another base object
				}
				console.println("The feature '" + referencingFeature.getName() + "' of the base object '" + referencingElement
						+ "' referenced " + "the merged base object '" + mergedBaseElement
						+ "' so the reference was replaced with '" + keptBaseElement + "'.");
			}
		}
	}

	/**
	 * Returns whether all base with base merge feature conflicts have been resolved.
	 *
	 * @return {@code true} when all feature conflicts have been resolved and {@code false} otherwise
	 *
	 * @see Merger#baseElements2FeatureConflictsMap baseElements2FeatureConflictsMap
	 */
	private boolean allBaseWithBaseMergeFeatureConflictsResolved() {
		for (Set<EStructuralFeature> conflicts : baseElements2FeatureConflictsMap.values()) {
			if (conflicts != null && !conflicts.isEmpty()) {
				return false;
			}
		}
		return true;
	}
}
