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
package lu.uni.geko.weaver;

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
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.datastructures.Quintuple;
import lu.uni.geko.util.ecore.BidirectionalReferencesCopyingCopier;
import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class Merger {
   private final BiN2NMap<EObject, EObject> base2AdviceMergeBiMap;
   /** Attention: During the merge the advice elements that have been added are removed from this set! **/
   private final Set<EObject> currentAdviceEObjectsToBeAdded;
   private final Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap;
   private final URI wovenMURI;
   private final EObject wovenMRoot;
   private final Copier baseCopier;
   private final FeatureEquivalenceHelper featureEquivalenceHelper;
   // Whenever two or more base elements are mapped to an advice element this results in a merge of these base elements.
   // One of the base elements will be kept and the attributes and references of all the other base elements are introduced to
   // this kept base element.
   // During these subsequent merge operations of two base elements it may happen that both have a feature value that allows for
   // exactly one value.
   // As all base elements are handled in the same way we cannot decide which feature value to keep.
   // Therefore we register every conflicting feature value of every base object.
   // Such a conflict can be resolved whenever an advice element sets such a feature value (as it means that whatever was set
   // before is overwritten).
   // When all registered conflicts are resolved like this at the end of the merge we are happy.
   // Otherwise we issue an error.
   private final Map<EObject, Set<EStructuralFeature>> baseEObjects2FeatureConflictsMap;
   private final Map<EObject, EObject> merged2KeptBaseEObjectMap;
   private final SimpleMessageConsole console;

   public Merger(BiN2NMap<EObject, EObject> base2AdviceMergeBiMap, Set<EObject> adviceEObjectsToBeAdded,
         Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap, URI wovenMURI) {
      this.base2AdviceMergeBiMap = base2AdviceMergeBiMap;
      this.currentAdviceEObjectsToBeAdded = adviceEObjectsToBeAdded;
      this.adviceEObjects2ScopeMap = adviceEObjects2ScopeMap;
      this.wovenMURI = wovenMURI;
      this.wovenMRoot = MainResourceLoader.getUniqueContentRootIfCorrectlyTyped(wovenMURI, "wove model", EObject.class);
      this.baseCopier = new BidirectionalReferencesCopyingCopier();
      this.featureEquivalenceHelper = new FeatureEquivalenceHelper(new Av2BaseEqualityHelper());
      this.baseEObjects2FeatureConflictsMap = new HashMap<EObject, Set<EStructuralFeature>>();
      this.merged2KeptBaseEObjectMap = new HashMap<EObject, EObject>();
      this.console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
   }

   public Quintuple<Set<EObject>, URI, BiN2NMap<EObject, EObject>, FeatureEquivalenceHelper, Map<EObject, AdviceInstantiationScope>> performMergesAndReturnAdderParameters() {
      performMerges();
      boolean resolved = allBaseWithBaseMergeFeatureConflictsResolved();
      if (!resolved) {
         // MAYDO MK check in advance whether base with base merge feature value conflicts will remain and ask user to reformulate
         // pointcut and advice (and do the same for all other kinds of unweavable circumstances)
         throw new RuntimeException("There are still base with base merge feature value conflicts that have not been resolved!");
      }
      return new Quintuple<Set<EObject>, URI, BiN2NMap<EObject, EObject>, FeatureEquivalenceHelper, Map<EObject, AdviceInstantiationScope>>(
            currentAdviceEObjectsToBeAdded, wovenMURI, base2AdviceMergeBiMap, featureEquivalenceHelper, adviceEObjects2ScopeMap);
   }

   /**
    * ATTENTION SIDE-EFFECT: all elements that became a content of a model element during the merge are removed from
    * adviceEObjectsToBeAdded
    */
   private void performMerges() {
      for (Entry<Set<EObject>, Set<EObject>> base2AdviceMergeEntry : base2AdviceMergeBiMap.entrySet()) {
         Set<EObject> baseEObjects = base2AdviceMergeEntry.getKey();
         Set<EObject> adviceEObjects = base2AdviceMergeEntry.getValue();
         if (baseEObjects.size() == 1) {
            EObject baseEObject = JavaBridge.one(baseEObjects);
            if (adviceEObjects.size() == 1) {
               EObject adviceEObject = JavaBridge.one(adviceEObjects);
               merge1BaseWith1AdviceEObject(baseEObject, adviceEObject);
            } else {
               merge1BaseWithNAdviceEObjects(adviceEObjects, baseEObject);
            }
         } else { // baseEObjects.size() != 1
            if (baseEObjects.size() >= 1 && adviceEObjects.size() == 1) {
               EObject adviceEObject = JavaBridge.one(adviceEObjects);
               mergeNBaseWith1AdviceEObject(baseEObjects, adviceEObject);
            } else {
               // TODO MK decide what to do with mappings that map multiple pointcut elements to multiple advice elements
            }
         }
      }
      replaceReferencesToMergedBaseEObjects();
   }

   /**
    * ATTENTION SIDE-EFFECT: the base2AdviceMergeBiMap will be changed to correctly map the base element duplicates to the advice
    * element
    *
    * @param adviceEObjects
    * @param baseEObject
    */
   private void merge1BaseWithNAdviceEObjects(Set<EObject> base2AdviceMergeBiMapValueEntry, EObject baseEObject) {
      // copy the advice elements set as it is the real entry in the map and should not be changed accidentally
      Set<EObject> adviceEObjects = new HashSet<EObject>(base2AdviceMergeBiMapValueEntry);
      EObject directlyMergedAdviceEObject = JavaBridge.pop(adviceEObjects);
      List<EObject> baseEObjectCopies = new ArrayList<EObject>(adviceEObjects.size());
      for (EObject adviceEObject : adviceEObjects) {
         EObject baseEObjectCopy = baseCopier.copy(baseEObject);
         // Now we have duplicated the base element that has to be merged with multiple advice elements.
         // This means our base2AdviceMergeBiMap should no longer map the original base element to all advice elements.
         // Instead every new duplicate of the base element should map to the corresponding advice elements (and the other way
         // round).
         // This change is realized in two steps. First we remove the mapping from the original base element to the advice
         // element.
         // Then we add a new mapping from the base duplicate to the advice element.
         base2AdviceMergeBiMap.remove(baseEObject, adviceEObject);
         base2AdviceMergeBiMap.put(baseEObjectCopy, adviceEObject);
         // We did this mapping change as early as possible and now we can go on with processing the copy and merging it.
         baseCopier.copyReferences();
         baseEObjectCopies.add(baseEObjectCopy);
         merge1BaseWith1AdviceEObject(baseEObjectCopy, adviceEObject);
         console.println("Copied the base object '" + baseEObject + "' and merged it with the advice object'" + adviceEObject
               + "': '" + baseEObjectCopy + "'");
      }
      Collection<Setting> referencesToBaseEObject = EcoreBridge.getReferencesTo(baseEObject);
      for (Setting oldReferenceToBaseEObject : referencesToBaseEObject) {
         EStructuralFeature referencingFeature = oldReferenceToBaseEObject.getEStructuralFeature();
         EObject oldReferencingEObject = oldReferenceToBaseEObject.getEObject();
         if (referencingFeature.isMany()) {
            List<EObject> referencedValues = EcoreBridge.getFeatureValuesIfManyTyped(oldReferencingEObject, referencingFeature);
            int currentSize = referencedValues.size();
            boolean upperBoundReached = upperBoundReached(currentSize, referencingFeature, baseEObject, baseEObjectCopies);
            if (!upperBoundReached) {
               referencedValues.addAll(baseEObjectCopies);
               console.println("Added reference copies for the reference to '" + baseEObject + "' to the '"
                     + referencingFeature.getName() + "' feature of the base object '" + oldReferencingEObject + "'");

            }
         } else { // !referencingFeature.isMany()
            EStructuralFeature referencingEObjectContainmentFeature = oldReferencingEObject.eContainmentFeature();
            EObject referenceContainer = oldReferencingEObject.eContainer();
            boolean containedInCopySource = containedIn(referenceContainer, baseEObject);
            boolean containedInCopyTarget = containedIn(referenceContainer, baseEObjectCopies);
            if (!containedInCopySource && !containedInCopyTarget) {
               if (referencingEObjectContainmentFeature.isMany()) {
                  List<EObject> referencingEObjectSiblings = EcoreBridge.getFeatureValuesIfManyTyped(referenceContainer,
                        referencingEObjectContainmentFeature);
                  int currentSize = referencingEObjectSiblings.size();
                  boolean upperBoundReached = upperBoundReachedForReferencingEObjectContainer(currentSize,
                        referencingEObjectContainmentFeature, baseEObject, baseEObjectCopies, oldReferencingEObject);
                  if (!upperBoundReached) {
                     for (EObject baseEObjectCopy : baseEObjectCopies) {
                        EObject referencingEObjectCopy = baseCopier.copy(oldReferencingEObject);
                        baseCopier.copyReferences();
                        referencingEObjectCopy.eSet(referencingFeature, baseEObjectCopy);
                        referencingEObjectSiblings.add(referencingEObjectCopy);
                        console.println("Added the copy '" + referencingEObjectCopy + "' of the referencing object '"
                              + oldReferencingEObject + "' for the reference '" + referencingFeature.getName()
                              + "' referencing the copy '" + baseEObjectCopy + "' of the base object '" + baseEObject
                              + "' to the container '" + referenceContainer + "'");
                     }
                  }
               }
            }
         }
         // TODO MK recursively continue copying referencing objects that reference base objects that have to be copied
         // until you reach a reference that can be copied
      }
      merge1BaseWith1AdviceEObject(baseEObject, directlyMergedAdviceEObject);
   }

   private boolean containedIn(EObject eObject, Collection<EObject> possibleContainers) {
      for (EObject possibleContainer : possibleContainers) {
         if (containedIn(eObject, possibleContainer)) {
            return true;
         }
      }
      return false;
   }

   private boolean containedIn(EObject eObject, EObject possibleContainer) {
      if (eObject == null) {
         return false;
      } else if (eObject == possibleContainer) {
         return true;
      } else {
         return containedIn(eObject.eContainer(), possibleContainer);
      }
   }

   private boolean upperBoundReachedForReferencingEObjectContainer(int currentSize, EStructuralFeature referencingFeature,
         EObject referencedEObject, List<EObject> objectsToBeReferenced, EObject referencingEObject) {
      return upperBoundReached(currentSize, referencingFeature, referencedEObject, objectsToBeReferenced,
            "the referencing object '" + referencingEObject + "' for ");
   }

   private boolean upperBoundReached(int currentSize, EStructuralFeature referencingFeature, EObject referencedEObject,
         List<EObject> objectsToBeReferenced) {
      return upperBoundReached(currentSize, referencingFeature, referencedEObject, objectsToBeReferenced, "");
   }

   private boolean upperBoundReached(int currentSize, EStructuralFeature referencingFeature, EObject referencedEObject,
         List<EObject> objectsToBeReferenced, String indirectReferenceMessage) {
      int upperBound = referencingFeature.getUpperBound();
      int increase = objectsToBeReferenced.size();
      if (currentSize + increase <= upperBound || upperBound == -1) {
         return false;
      } else {
         throw new RuntimeException("Cannot duplicate " + indirectReferenceMessage + " the reference to the object '"
               + referencedEObject + "' for the duplicates '" + objectsToBeReferenced + "'" + "because the '"
               + referencingFeature.getName() + "' reference already would exceed the upper bound of '" + upperBound + "'!");
      }
   }

   private void merge1BaseWith1AdviceEObject(EObject baseEObject, EObject adviceEObject) {
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

   private void mergeNBaseWith1AdviceEObject(Set<EObject> baseEObjects, EObject adviceEObject) {
      EObject keptBaseEObject = JavaBridge.pop(baseEObjects);
      for (EObject disappearingBaseEObject : baseEObjects) {
         merge1BaseWith1BaseEObject(keptBaseEObject, disappearingBaseEObject);
         this.merged2KeptBaseEObjectMap.put(disappearingBaseEObject, keptBaseEObject);
      }
      merge1BaseWith1AdviceEObject(keptBaseEObject, adviceEObject);
   }

   private void merge1BaseWith1BaseEObject(EObject keptBaseEObject, EObject disappearingBaseEObject) {
      Collection<Pair<EStructuralFeature, EStructuralFeature>> correspondingFeatures = featureEquivalenceHelper
            .getEquivalentFeatures(keptBaseEObject, disappearingBaseEObject);
      for (Pair<EStructuralFeature, EStructuralFeature> correspondingFeaturePair : correspondingFeatures) {
         if (correspondingFeaturePair.getFirst().isMany()) {
            baseMergeCorrespondingManyFeature(keptBaseEObject, disappearingBaseEObject, correspondingFeaturePair.getFirst(),
                  correspondingFeaturePair.getSecond());
         } else {
            baseMergeCorrespondingNotManyFeature(keptBaseEObject, disappearingBaseEObject, correspondingFeaturePair.getFirst(),
                  correspondingFeaturePair.getSecond());
         }
      }
   }

   private void baseMergeCorrespondingManyFeature(EObject keptBaseEObject, EObject disappearingBaseEObject,
         EStructuralFeature keptFeature, EStructuralFeature disappearingFeature) {
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

   private boolean upperBoundReached(EObject targetEObject, EObject sourceEObject, EStructuralFeature targetFeature,
         List<EObject> targetFeatureValues, EObject sourceFeatureValue) {
      int currentSize = targetFeatureValues.size();
      return upperBoundReached(currentSize, targetEObject, sourceEObject, targetFeature, sourceFeatureValue);
   }

   private boolean upperBoundReached(int currentSize, EObject targetEObject, EObject sourceEObject,
         EStructuralFeature targetFeature, EObject sourceFeatureValue) {
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

   private void baseMergeCorrespondingNotManyFeature(EObject keptBaseEObject, EObject disappearingBaseEObject,
         EStructuralFeature keptFeature, EStructuralFeature disappearingFeature) {
      Object keptFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(keptBaseEObject, keptFeature);
      Object disappearingFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(disappearingBaseEObject, disappearingFeature);
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
               throw new RuntimeException("The feature value '" + keptFeatureValue + "' of the feature '" + keptFeature.getName()
                     + "' of the base object '" + keptBaseEObject + "' is an EObject " + "but the feature value '"
                     + disappearingFeatureValue + "'  of the base object that should be merged with it is not an EObject!");
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

   private void registerBaseWithBaseFeatureConflict(EObject keptBaseEObject, EObject disappearingBaseEObject,
         EStructuralFeature keptFeature, EStructuralFeature disappearingFeature, Object keptFeatureValue,
         Object disappearingFeatureValue) {
      Set<EStructuralFeature> conflictingFeatures = baseEObjects2FeatureConflictsMap.get(keptBaseEObject);
      if (conflictingFeatures == null) {
         conflictingFeatures = new HashSet<EStructuralFeature>();
         baseEObjects2FeatureConflictsMap.put(keptBaseEObject, conflictingFeatures);
      }
      conflictingFeatures.add(keptFeature);
      console.println("Registered a base with base merge feature value conflict for " + keptBaseEObject + " . "
            + keptFeature.getName() + " = " + keptFeatureValue + " " + "and " + disappearingBaseEObject + " . "
            + disappearingFeature.getName() + " = " + disappearingFeatureValue + ".");
   }

   private void adviceMergeCorrespondingManyFeature(EObject baseEObject, EObject adviceEObject, EStructuralFeature baseFeature,
         EStructuralFeature adviceFeature) {
      List<EObject> baseFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(baseEObject, baseFeature);
      List<EObject> adviceFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(adviceEObject, adviceFeature);
      for (EObject adviceFeatureValue : adviceFeatureValues) {
         // check whether the advice feature value element will be merged
         // with a feature value element of the base
         boolean willBeMergedWithABaseFeatureValue = false;
         for (EObject baseFeatureValueElement : baseFeatureValues) {
            Collection<EObject> adviceElementsToBeMergedWithBaseFeatureValue = base2AdviceMergeBiMap
                  .getAllValuesForKey(baseFeatureValueElement);
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

   private EObject getBaseElementForAdviceElement(EObject adviceElement) {
      Set<EObject> baseElementsToBeMergedWithAdviceElement = base2AdviceMergeBiMap.getAllKeysForValue(adviceElement);
      if (baseElementsToBeMergedWithAdviceElement == null) {
         // we are inspecting a reference to a new element that has no correspondence in the pointcut
         // this is the only case were we actually need to copy something from the advice
         EObject adviceFeatureValueElementCopy = MainCopier.copyAdviceEObject(adviceElement, wovenMRoot, base2AdviceMergeBiMap,
               adviceEObjects2ScopeMap);
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

   private void adviceMergeCorrespondingNotManyFeature(EObject baseEObject, EObject adviceEObject,
         EStructuralFeature baseFeature, EStructuralFeature adviceFeature) {
      Object baseFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(baseEObject, baseFeature);
      Object adviceFeatureValue = EcoreBridge.getFeatureValueIfNotManyTyped(adviceEObject, adviceFeature);
      if (baseFeatureValue instanceof EObject) {
         if (adviceFeatureValue instanceof EObject) {
            // check whether our base feature value shall be merged with something
            if (base2AdviceMergeBiMap.containsKey((EObject) baseFeatureValue)) {
               // check whether the feature values will be or already were merged anyways
               if (base2AdviceMergeBiMap.getAllValuesForKey((EObject) baseFeatureValue).contains(adviceFeatureValue)) {
                  // do nothing (merge will be done or was already done)
               } else {
                  // the base object references an object that will be merged
                  // but the advice object does not reference this object
                  // so we are inspecting a reference that should be changed
                  // that is completely fine
                  replaceEObjectFeatureValue(baseEObject, baseFeature, (EObject) baseFeatureValue, (EObject) adviceFeatureValue);
               }
            } else { // the base feature value shall not be merged with anything
               replaceEObjectFeatureValue(baseEObject, baseFeature, (EObject) baseFeatureValue, (EObject) adviceFeatureValue);
            }
         } else { // adviceFeatureValue !instanceof EObject
            if (adviceFeatureValue == null) {
               // do nothing
            } else {
               throw new RuntimeException("The base feature value '" + baseFeatureValue + "' of the feature '"
                     + baseFeature.getName() + "' of the base object '" + baseEObject + "' is an EObject "
                     + "but the advice feature value '" + adviceFeatureValue
                     + "'  of the advice object that should be merged with it is not an EObject!");
            }
         }
      } else { // baseFeatureValue !instanceof EObject
         if (adviceFeatureValue == null || adviceFeatureValue.equals("") || adviceFeatureValue.equals(baseFeatureValue)) {
            // do nothing
         } else {
            replaceObjectFeatureValue(baseEObject, baseFeature, baseFeatureValue, adviceFeatureValue);
         }
      }
   }

   private void replaceEObjectFeatureValue(EObject baseEObject, EStructuralFeature baseFeature, EObject baseFeatureValue,
         EObject adviceFeatureValue) {
      EObject baseVersionOfAdviceFeatureValue = getBaseElementForAdviceElement(adviceFeatureValue);
      replaceObjectFeatureValue(baseEObject, baseFeature, baseFeatureValue, baseVersionOfAdviceFeatureValue);
      removeAdviceElementFromToAddListIfAlreadyDone(baseFeature, adviceFeatureValue, baseVersionOfAdviceFeatureValue);
   }

   private void replaceObjectFeatureValue(EObject baseEObject, EStructuralFeature baseFeature, Object baseFeatureValue,
         Object adviceFeatureValue) {
      EcoreUtil.replace(baseEObject, baseFeature, baseFeatureValue, adviceFeatureValue);
      console.println("Changed the '" + baseFeature.getName() + "' feature value of the base object '" + baseEObject + "' from '"
            + baseFeatureValue + "' to '" + adviceFeatureValue + "'.");
      removeBaseWithBaseFeatureConflict(baseEObject, baseFeature);
   }

   public void removeBaseWithBaseFeatureConflict(EObject baseEObject, EStructuralFeature baseFeature) {
      Set<EStructuralFeature> conflictingFeatures = baseEObjects2FeatureConflictsMap.get(baseEObject);
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
    * advice feature will be removed from adviceEObjectsToBeAdded
    */
   private void removeAdviceElementFromToAddListIfAlreadyDone(EStructuralFeature baseFeature, EObject adviceFeatureValue,
         EObject baseVersionOfAdviceFeatureValue) {
      // check whether by adding a reference to the advice feature element
      // this element also became a content of the base object (and thus of the overall model)
      // attention: we need to use the base mm version of the advice feature value to obtain the same feature
      EReference adviceFeatureValueContainmentFeature = baseVersionOfAdviceFeatureValue.eContainmentFeature();
      if (baseFeature.equals(adviceFeatureValueContainmentFeature)) {
         // attention: we need to remove the advice mm versions of the advice feature value and its contents from the list of
         // elements to be added
         boolean madeContent = currentAdviceEObjectsToBeAdded.remove(adviceFeatureValue);
         if (madeContent) {
            console.println("This reference change made '" + baseVersionOfAdviceFeatureValue + "' a new content of  '"
                  + adviceFeatureValue.eContainer() + "'.");
            Set<EObject> adviceFeatureValueAllContentsSet = EcoreBridge.getAllContentsSet(adviceFeatureValue);
            currentAdviceEObjectsToBeAdded.removeAll(adviceFeatureValueAllContentsSet);
         }
      }
   }

   private void replaceReferencesToMergedBaseEObjects() {
      for (Entry<EObject, EObject> merged2KeptBaseEObjectEntry : merged2KeptBaseEObjectMap.entrySet()) {
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
                  + "' referenced " + "the merged base object '" + mergedBaseEObject + "' so the reference was replaced with '"
                  + keptBaseEObject + "'.");
         }
      }
   }

   private boolean allBaseWithBaseMergeFeatureConflictsResolved() {
      for (Set<EStructuralFeature> conflicts : baseEObjects2FeatureConflictsMap.values()) {
         if (conflicts != null && !conflicts.isEmpty()) {
            return false;
         }
      }
      return true;
   }
}
