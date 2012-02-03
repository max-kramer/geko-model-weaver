/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 ******************************************************************************/
package lu.uni.geko.weaver.merge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lu.uni.geko.common.Av2BaseEqualityHelper;
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
import lu.uni.geko.weaver.copy.MainCopier;

import org.eclipse.emf.common.util.URI;
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
    * The mapping from base elements to the set of feature conflicts.
    *
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
      for (Entry<Set<EObject>, Set<EObject>> base2AdviceMergeEntry : avEffectuation.getBase2AvMergeEntries()) {
         Set<EObject> baseElements = base2AdviceMergeEntry.getKey();
         Set<EObject> avElements = base2AdviceMergeEntry.getValue();
         if (baseElements.size() == 1) {
            EObject baseElement = JavaBridge.one(baseElements);
            if (avElements.size() == 1) {
               EObject avElement = JavaBridge.one(avElements);
               merge1BaseWith1AvElement(baseElement, avElement);
            } else {
               merge1BaseWithNAvElements(baseElement, avElements);
            }
         } else { // baseElements.size() != 1
            if (baseElements.size() >= 1 && avElements.size() == 1) {
               EObject avElement = JavaBridge.one(avElements);
               mergeNBaseWith1AvElement(baseElements, avElement);
            }
            // TODO MK decide what to do with mappings that map multiple pointcut elements to multiple advice elements
         }
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
   private void merge1BaseWithNAvElements(final EObject baseElement, final Set<EObject> avElementsMapEntrySet) {
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
         avEffectuation.removeBase2AvMerge(baseElement, avElement);
         avEffectuation.addBase2AvMerge(baseElementCopy, avElement);
         // We did this mapping change as early as possible and now we can go on with processing the copy and merging it.
         baseCopier.copyReferences();
         baseElementCopies.add(baseElementCopy);
         merge1BaseWith1AvElement(baseElementCopy, avElement);
         console.println("Copied the base object '" + baseElement + "' and merged it with the advice object'" + avElement
               + "': '" + baseElementCopy + "'");
      }
      Collection<Setting> referencesToBaseElement = EcoreBridge.getReferencesTo(baseElement);
      for (Setting oldReferenceToBaseElement : referencesToBaseElement) {
         EStructuralFeature referencingFeature = oldReferenceToBaseElement.getEStructuralFeature();
         EObject oldReferencingElement = oldReferenceToBaseElement.getEObject();
         if (referencingFeature.isMany()) {
            List<EObject> referencedValues = EcoreBridge
                  .getFeatureValuesIfManyTyped(oldReferencingElement, referencingFeature);
            int currentSize = referencedValues.size();
            boolean upperBoundReached = upperBoundReached(currentSize, referencingFeature, baseElementCopies, baseElement);
            if (!upperBoundReached) {
               referencedValues.addAll(baseElementCopies);
               console.println("Added reference copies for the reference to '" + baseElement + "' to the '"
                     + referencingFeature.getName() + "' feature of the base object '" + oldReferencingElement + "'");

            }
         } else { // !referencingFeature.isMany()
            EStructuralFeature referencingEObjectContainmentFeature = oldReferencingElement.eContainmentFeature();
            EObject referenceContainer = oldReferencingElement.eContainer();
            boolean containedInCopySource = EcoreBridge.containedIn(referenceContainer, baseElement);
            boolean containedInCopyTarget = EcoreBridge.containedIn(referenceContainer, baseElementCopies);
            if (!containedInCopySource && !containedInCopyTarget) {
               if (referencingEObjectContainmentFeature.isMany()) {
                  List<EObject> referencingEObjectSiblings = EcoreBridge.getFeatureValuesIfManyTyped(referenceContainer,
                        referencingEObjectContainmentFeature);
                  int currentSize = referencingEObjectSiblings.size();
                  boolean upperBoundReached = ensureUpperBoundNotExceeded(currentSize, referencingEObjectContainmentFeature,
                        baseElementCopies, baseElement, oldReferencingElement);
                  if (!upperBoundReached) {
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
      }
      merge1BaseWith1AvElement(baseElement, directlyMergedAvEObject);
   }

   /**
    * Ensures that the given current size does not exceed the upper bound for the given referencing feature and the given elements
    * to be referenced by throwing a {@link java.util.RuntimeException RuntimeException} if it is the case and returning
    * {@code false} otherwise.
    *
    * @param currentSize
    * @param referencingFeature
    * @param elementsToBeReferenced
    * @param referencedElement
    * @param referencingElement
    * @return
    */
   private boolean ensureUpperBoundNotExceeded(final int currentSize, final EStructuralFeature referencingFeature,
         final List<EObject> elementsToBeReferenced, final EObject referencedElement, final EObject referencingElement) {
      return upperBoundReached(currentSize, referencingFeature, elementsToBeReferenced, referencedElement,
            "the referencing object '" + referencingElement + "' for ");
   }

   private boolean upperBoundReached(final int currentSize, final EStructuralFeature referencingFeature,
         final List<EObject> elementsToBeReferenced, final EObject referencedElement) {
      return upperBoundReached(currentSize, referencingFeature, elementsToBeReferenced, referencedElement, "");
   }

   private boolean upperBoundReached(final int currentSize, final EStructuralFeature referencingFeature,
         final List<EObject> elementsToBeReferenced, final EObject referencedElement, final String indirectReferenceMessage) {
      int upperBound = referencingFeature.getUpperBound();
      int increase = elementsToBeReferenced.size();
      if (currentSize + increase <= upperBound || upperBound == -1) {
         return false;
      } else {
         throw new RuntimeException("Cannot duplicate " + indirectReferenceMessage + " the reference to the object '"
               + referencedElement + "' for the duplicates '" + elementsToBeReferenced + "'" + "because the '"
               + referencingFeature.getName() + "' reference already would exceed the upper bound of '" + upperBound + "'!");
      }
   }

   private void merge1BaseWith1AvElement(final EObject baseEObject, final EObject adviceEObject) {
      Collection<Pair<EStructuralFeature, EStructuralFeature>> correspondingFeatures = featureEquivalenceHelper
            .getEquivalentFeatures(baseEObject, adviceEObject);
      for (Pair<EStructuralFeature, EStructuralFeature> correspondingFeaturePair : correspondingFeatures) {
         if (correspondingFeaturePair.getFirst().isMany()) {
            adviceMergeCorrespondingManyFeature(baseEObject, adviceEObject, correspondingFeaturePair.getFirst(),
                  correspondingFeaturePair.getSecond());
         } else {
            adviceMergeCorrespondingNotManyFeature(baseEObject, adviceEObject, correspondingFeaturePair.getFirst(),
                  correspondingFeaturePair.getSecond());
         }
      }
   }

   private void mergeNBaseWith1AvElement(final Set<EObject> baseElements, final EObject adviceEObject) {
      EObject keptBaseEObject = JavaBridge.pop(baseElements);
      for (EObject disappearingBaseEObject : baseElements) {
         merge1BaseWith1BaseEObject(keptBaseEObject, disappearingBaseEObject);
         this.merged2KeptBaseElementMap.put(disappearingBaseEObject, keptBaseEObject);
      }
      merge1BaseWith1AvElement(keptBaseEObject, adviceEObject);
   }

   private void merge1BaseWith1BaseEObject(final EObject keptBaseEObject, final EObject disappearingBaseEObject) {
      Collection<Pair<EStructuralFeature, EStructuralFeature>> correspondingFeatures = featureEquivalenceHelper
            .getEquivalentFeatures(keptBaseEObject, disappearingBaseEObject);
      for (Pair<EStructuralFeature, EStructuralFeature> correspondingFeaturePair : correspondingFeatures) {
         if (correspondingFeaturePair.getFirst().isMany()) {
            baseMergeCorrespondingManyFeature(keptBaseEObject, disappearingBaseEObject, correspondingFeaturePair.getFirst(),
                  correspondingFeaturePair.getSecond());
         } else {
            baseMergeCorrespondingNotManyFeature(keptBaseEObject, disappearingBaseEObject,
                  correspondingFeaturePair.getFirst(), correspondingFeaturePair.getSecond());
         }
      }
   }

   private void baseMergeCorrespondingManyFeature(final EObject keptBaseEObject, final EObject disappearingBaseEObject,
         final EStructuralFeature keptFeature, final EStructuralFeature disappearingFeature) {
      List<EObject> keptFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(keptBaseEObject, keptFeature);
      List<EObject> disappearingFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(disappearingBaseEObject,
            disappearingFeature);
      // RATIONALE MK avoid a ConcurrentModificationException for disappearingFeatureValues as adding elements of it to
      // keptFeatureValues removes them from disappearingFeatureValues!
      int currentSize = disappearingFeatureValues.size();
      List<EObject> featureValuesToBeAdded = new ArrayList<EObject>();
      for (EObject disappearingFeatureValue : disappearingFeatureValues) {
         boolean upperBoundReached = upperBoundReached(currentSize, keptBaseEObject, disappearingBaseEObject, keptFeature,
               disappearingFeatureValue);
         if (!upperBoundReached) {
            featureValuesToBeAdded.add(disappearingFeatureValue);
            currentSize++;
            console.println("Added '" + disappearingFeatureValue + "' to the '" + keptFeature.getName()
                  + "' reference of the base object '" + keptBaseEObject + "'");
         }
      }
      keptFeatureValues.addAll(featureValuesToBeAdded);
   }

   private boolean upperBoundReached(final EObject targetEObject, final EObject sourceEObject,
         final EStructuralFeature targetFeature, final List<EObject> targetFeatureValues, final EObject sourceFeatureValue) {
      int currentSize = targetFeatureValues.size();
      return upperBoundReached(currentSize, targetEObject, sourceEObject, targetFeature, sourceFeatureValue);
   }

   private boolean upperBoundReached(final int currentSize, final EObject targetEObject, final EObject sourceEObject,
         final EStructuralFeature targetFeature, final EObject sourceFeatureValue) {
      int upperBound = targetFeature.getUpperBound();
      if (currentSize < upperBound || upperBound == -1) {
         return false;
      } else {
         throw new RuntimeException("Cannot merge the two objects '" + targetEObject + "' and '" + sourceEObject + "' "
               + "because the '" + targetFeature.getName() + " reference to '" + sourceFeatureValue
               + "' would have to be added to '" + targetEObject + "' " + "but this cannot be done as the upper bound of '"
               + targetFeature.getUpperBound() + "' has already been reached!");
      }
   }

   private void baseMergeCorrespondingNotManyFeature(final EObject keptBaseEObject, final EObject disappearingBaseEObject,
         final EStructuralFeature keptFeature, final EStructuralFeature disappearingFeature) {
      Object keptFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(keptBaseEObject, keptFeature);
      Object disappearingFeatureValue = EcoreBridge
            .getFeatureValueIfNotManyTyped(disappearingBaseEObject, disappearingFeature);
      if (keptFeatureValue instanceof EObject) {
         if (disappearingFeatureValue instanceof EObject) {
            if (keptFeatureValue.equals(disappearingFeatureValue)) {
               // do nothing
            } else {
               registerBaseWithBaseFeatureConflict(keptBaseEObject, disappearingBaseEObject, keptFeature, disappearingFeature,
                     keptFeatureValue, disappearingFeatureValue);
            }
         } else { // disappearingFeatureValue !instanceof EObject
            if (disappearingFeatureValue == null) {
               // do nothing
            } else {
               throw new RuntimeException("The feature value '" + keptFeatureValue + "' of the feature '"
                     + keptFeature.getName() + "' of the base object '" + keptBaseEObject + "' is an EObject "
                     + "but the feature value '" + disappearingFeatureValue
                     + "'  of the base object that should be merged with it is not an EObject!");
            }
         }
      } else { // keptFeatureValue !instanceof EObject
         if (disappearingFeatureValue == null || disappearingFeatureValue.equals("")
               || disappearingFeatureValue.equals(keptFeatureValue)) {
            // do nothing
         } else {
            registerBaseWithBaseFeatureConflict(keptBaseEObject, disappearingBaseEObject, keptFeature, disappearingFeature,
                  keptFeatureValue, disappearingFeatureValue);
         }
      }
   }

   private void registerBaseWithBaseFeatureConflict(final EObject keptBaseEObject, final EObject disappearingBaseEObject,
         final EStructuralFeature keptFeature, final EStructuralFeature disappearingFeature, final Object keptFeatureValue,
         final Object disappearingFeatureValue) {
      Set<EStructuralFeature> conflictingFeatures = baseElements2FeatureConflictsMap.get(keptBaseEObject);
      if (conflictingFeatures == null) {
         conflictingFeatures = new HashSet<EStructuralFeature>();
         baseElements2FeatureConflictsMap.put(keptBaseEObject, conflictingFeatures);
      }
      conflictingFeatures.add(keptFeature);
      console.println("Registered a base with base merge feature value conflict for " + keptBaseEObject + " . "
            + keptFeature.getName() + " = " + keptFeatureValue + " " + "and " + disappearingBaseEObject + " . "
            + disappearingFeature.getName() + " = " + disappearingFeatureValue + ".");
   }

   private void adviceMergeCorrespondingManyFeature(final EObject baseEObject, final EObject adviceEObject,
         final EStructuralFeature baseFeature, final EStructuralFeature adviceFeature) {
      List<EObject> baseFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(baseEObject, baseFeature);
      List<EObject> adviceFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(adviceEObject, adviceFeature);
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
         if (willBeMergedWithABaseFeatureValue) {
            // do nothing
         } else {
            boolean upperBoundReached = upperBoundReached(baseEObject, adviceEObject, baseFeature, baseFeatureValues,
                  adviceFeatureValue);
            if (!upperBoundReached) {
               EObject baseVersionOfAdviceFeatureValue = getBaseElementForAdviceElement(adviceFeatureValue);
               baseFeatureValues.add(baseVersionOfAdviceFeatureValue);
               console.println("Added '" + baseVersionOfAdviceFeatureValue + "' to the '" + baseFeature.getName()
                     + "' reference of the base object '" + baseEObject + "'");
               removeAdviceElementFromToAddListIfAlreadyDone(baseFeature, adviceFeatureValue, baseVersionOfAdviceFeatureValue);
            }
         }
      }
   }

   private EObject getBaseElementForAdviceElement(final EObject adviceElement) {
      Set<EObject> baseElementsToBeMergedWithAdviceElement = avEffectuation.getAllBaseElementsToMerge(adviceElement);
      if (baseElementsToBeMergedWithAdviceElement == null) {
         // we are inspecting a reference to a new element that has no correspondence in the pointcut
         // this is the only case were we actually need to copy something from the advice
         EObject adviceFeatureValueElementCopy = MainCopier.copyAvElement(adviceElement, wovenRoot, this.advice,
               this.avEffectuation);
         console.println("Copied '" + adviceElement + "': '" + adviceFeatureValueElementCopy + "'");
         return adviceFeatureValueElementCopy;
      } else {
         // TODO MK currently (20111206) this code will never be reached as as we are calling this only from locations where we
         // know that no base element is mapped to this advice element
         if (baseElementsToBeMergedWithAdviceElement.size() == 1) {
            // we are inspecting a reference to an element that will be merged anyways
            // so we simply need to add a reference to this base element
            EObject baseElementToBeMergedWithAdviceElement = JavaBridge.one(baseElementsToBeMergedWithAdviceElement);
            console.println("Using '" + baseElementToBeMergedWithAdviceElement + "' as a placeholder for '" + adviceElement);
            return baseElementToBeMergedWithAdviceElement;
         }
         throw new RuntimeException(
               "GeKo is not yet supporting the merge of base objects that are mapped to more than one advice object!");
      }
   }

   private void adviceMergeCorrespondingNotManyFeature(final EObject baseEObject, final EObject adviceEObject,
         final EStructuralFeature baseFeature, final EStructuralFeature adviceFeature) {
      Object baseFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(baseEObject, baseFeature);
      Object avFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(adviceEObject, adviceFeature);
      if (baseFeatureValue instanceof EObject) {
         EObject baseFeatureEValue = (EObject) baseFeatureValue;
         if (avFeatureValue instanceof EObject) {
            EObject avFeatureEValue = (EObject) avFeatureValue;
            // check whether our base feature value shall be merged with something
            if (this.avEffectuation.toMergeWithAnAvElement(baseFeatureEValue)) {
               // check whether the feature values will be or already were merged anyways
               if (this.avEffectuation.toMergeWithThisAvElement(baseFeatureEValue, avFeatureEValue)) {
                  // do nothing (merge will be done or was already done)
               } else {
                  // the base object references an object that will be merged
                  // but the advice object does not reference this object
                  // so we are inspecting a reference that should be changed
                  // that is completely fine
                  replaceEObjectFeatureValue(baseEObject, baseFeature, baseFeatureEValue, avFeatureEValue);
               }
            } else { // the base feature value shall not be merged with anything
               replaceEObjectFeatureValue(baseEObject, baseFeature, baseFeatureEValue, avFeatureEValue);
            }
         } else { // adviceFeatureValue !instanceof EObject
            if (avFeatureValue == null) {
               // do nothing
            } else {
               throw new RuntimeException("The base feature value '" + baseFeatureEValue + "' of the feature '"
                     + baseFeature.getName() + "' of the base object '" + baseEObject + "' is an EObject "
                     + "but the advice feature value '" + avFeatureValue
                     + "'  of the advice object that should be merged with it is not an EObject!");
            }
         }
      } else { // baseFeatureValue !instanceof EObject
         if (avFeatureValue == null || avFeatureValue.equals("") || avFeatureValue.equals(baseFeatureValue)) {
            // do nothing
         } else {
            replaceObjectFeatureValue(baseEObject, baseFeature, baseFeatureValue, avFeatureValue);
         }
      }
   }

   private void replaceEObjectFeatureValue(final EObject baseEObject, final EStructuralFeature baseFeature,
         final EObject baseFeatureValue, final EObject adviceFeatureValue) {
      EObject baseVersionOfAdviceFeatureValue = getBaseElementForAdviceElement(adviceFeatureValue);
      replaceObjectFeatureValue(baseEObject, baseFeature, baseFeatureValue, baseVersionOfAdviceFeatureValue);
      removeAdviceElementFromToAddListIfAlreadyDone(baseFeature, adviceFeatureValue, baseVersionOfAdviceFeatureValue);
   }

   private void replaceObjectFeatureValue(final EObject baseEObject, final EStructuralFeature baseFeature,
         final Object baseFeatureValue, final Object adviceFeatureValue) {
      EcoreUtil.replace(baseEObject, baseFeature, baseFeatureValue, adviceFeatureValue);
      console.println("Changed the '" + baseFeature.getName() + "' feature value of the base object '" + baseEObject
            + "' from '" + baseFeatureValue + "' to '" + adviceFeatureValue + "'.");
      removeBaseWithBaseFeatureConflict(baseEObject, baseFeature);
   }

   public void removeBaseWithBaseFeatureConflict(final EObject baseEObject, final EStructuralFeature baseFeature) {
      Set<EStructuralFeature> conflictingFeatures = baseElements2FeatureConflictsMap.get(baseEObject);
      if (conflictingFeatures != null) {
         // RATIONALE MK avoid accessing the object two times for the contains and for the remove method
         boolean wasAConflict = conflictingFeatures.remove(baseFeature);
         if (wasAConflict) {
            console.println("This feature value change resolved the base with base merge conflict for " + baseEObject + " . "
                  + baseFeature.getName() + ".");
         }
      }
   }

   /**
    * ATTENTION SIDE-EFFECT: if the advice feature value became a content when it was referenced using the base feature then the
    * advice feature will be removed from adviceElementsToBeAdded
    */
   private void removeAdviceElementFromToAddListIfAlreadyDone(final EStructuralFeature baseFeature,
         final EObject adviceFeatureValue, final EObject baseVersionOfAdviceFeatureValue) {
      // check whether by adding a reference to the advice feature element
      // this element also became a content of the base object (and thus of the overall model)
      // attention: we need to use the base mm version of the advice feature value to obtain the same feature
      EReference adviceFeatureValueContainmentFeature = baseVersionOfAdviceFeatureValue.eContainmentFeature();
      if (baseFeature.equals(adviceFeatureValueContainmentFeature)) {
         // attention: we need to remove the advice mm versions of the advice feature value and its contents from the list of
         // elements to be added
         boolean madeContent = this.avEffectuation.registerAddedAvElement(adviceFeatureValue);
         if (madeContent) {
            console.println("This reference change made '" + baseVersionOfAdviceFeatureValue + "' a new content of  '"
                  + adviceFeatureValue.eContainer() + "'.");
            Set<EObject> adviceFeatureValueAllContentsSet = EcoreBridge.getAllContentsSet(adviceFeatureValue);
            this.avEffectuation.registerAddedAvElements(adviceFeatureValueAllContentsSet);
         }
      }
   }

   private void replaceReferencesToMergedBaseElements() {
      for (Entry<EObject, EObject> merged2KeptBaseEObjectEntry : merged2KeptBaseElementMap.entrySet()) {
         EObject mergedBaseEObject = merged2KeptBaseEObjectEntry.getKey();
         EObject keptBaseEObject = merged2KeptBaseEObjectEntry.getValue();
         Collection<Setting> references = EcoreBridge.getReferencesTo(mergedBaseEObject);
         for (Setting reference : references) {
            EStructuralFeature referencingFeature = reference.getEStructuralFeature();
            EObject referencingEObject = reference.getEObject();
            if (referencingFeature.isMany()) {
               List<EObject> referencedFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(referencingEObject,
                     referencingFeature);
               referencedFeatureValues.remove(mergedBaseEObject);
               referencedFeatureValues.add(keptBaseEObject);
               // TODO MK ensure that we do not have to perform another iteration of cleanup when we changed a reference to a base
               // object that was merged with another base object
            } else {
               reference.set(keptBaseEObject);
               // TODO MK ensure that we do not have to perform another iteration of cleanup when we changed a reference to a base
               // object that was merged with another base object
            }
            console.println("The feature '" + referencingFeature.getName() + "' of the base object '" + referencingEObject
                  + "' referenced " + "the merged base object '" + mergedBaseEObject
                  + "' so the reference was replaced with '" + keptBaseEObject + "'.");
         }
      }
   }

   private boolean allBaseWithBaseMergeFeatureConflictsResolved() {
      for (Set<EStructuralFeature> conflicts : baseElements2FeatureConflictsMap.values()) {
         if (conflicts != null && !conflicts.isEmpty()) {
            return false;
         }
      }
      return true;
   }
}
