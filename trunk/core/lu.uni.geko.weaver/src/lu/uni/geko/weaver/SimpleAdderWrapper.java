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

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ecore.FeatureCorresponder;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class SimpleAdderWrapper implements MightyAdderExt {
   private final SimpleAdderExt wrappedAdder;

   public SimpleAdderWrapper(SimpleAdderExt wrappedAdder) {
      this.wrappedAdder = wrappedAdder;
   }

   @Override
   public void addAdviceEObjectsToWovenModel(Set<EObject> adviceEObjectsToBeAdded, URI wovenMURI,
         FeatureCorresponder featureCorresponder, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap,
         Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap) {
      EObject uniqueWovenRoot = MainResourceLoader.getUniqueResourceContentRoot(wovenMURI, "woven model");
      SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
      if (adviceEObjectsToBeAdded.isEmpty()) {
         console.println("There are no remaining advice elements that would have to be added to the woven model");
      } else {
         if (uniqueWovenRoot == null) {
            throw new RuntimeException("There are still " + adviceEObjectsToBeAdded.size()
                  + " advice elements that are not contained in any element of the woven model "
                  + "but the woven model has no unique root element that could serve as container for these elements:\n"
                  + adviceEObjectsToBeAdded);
         } else {
            // RATIONALE MK We might add advice elements that contain other advice elements.
            // If we add these elements in the wrong order and stop whenever we encounter an element where we do not know how to
            // add it we may be unlucky.
            // A possible solution for this could be e.g. to count for each advice element how many other advice elements it
            // contains and to start with the one that contains the most.
            // This, however, is a Theta(n^2) algorithm. i.e. always takes quadratic time.
            // A simpler solution is to skip elements whenever we do not know how to add them and to restart from the beginning of
            // the list once we reached the end.
            // This algorithm has also a quadratic worst-case runtime but as we might be lucky it does not always need quadratic
            // runtime.
            int iterationCount = adviceEObjectsToBeAdded.size();
            // RATIONALE MK do not directly remove elements from the list of elements to be added as this would cause a
            // concurrent
            // modification exception
            Set<EObject> adviceEObjectsAlreadyAdded = new HashSet<EObject>();
            // RATIONALE MK We have to make sure that all advice elements that are contained in an advice element do not need
            // to be added anymore.
            // An easy way to do this would be to remove all contents of the advice version of the advice element from the list
            // of advice elements to be added.
            // This would, however, be incorrect as an advice element that is only introduced once globally for all join points
            // may contain advice elements that are introduced per joinpoint.
            // So we have to make sure that these different base versions of the contained advice elements are all added.
            Set<EObject> baseVersionsOfAlreadyContainedAdviceElements = new HashSet<EObject>();
            for (int i = 0; i < iterationCount; i++) {
               for (EObject adviceEObjectToBeAdded : adviceEObjectsToBeAdded) {
                  EObject baseVersionOfAdviceEObjectToBeAdded = MainCopier.copyAdviceEObject(adviceEObjectToBeAdded,
                        uniqueWovenRoot, base2AdviceMergeBiMap, adviceEObjects2ScopeMap);
                  // make sure that we did not indirectly add this advice element as a content of an already added advice
                  // element
                  if (baseVersionsOfAlreadyContainedAdviceElements.contains(baseVersionOfAdviceEObjectToBeAdded)) {
                     adviceEObjectsAlreadyAdded.add(adviceEObjectToBeAdded);
                  } else {
                     Pair<EReference, EObject> containmentPair = this.wrappedAdder.getContainmentReferenceAndContainer(
                           uniqueWovenRoot, adviceEObjectToBeAdded, featureCorresponder, base2AdviceMergeBiMap,
                           adviceEObjects2ScopeMap);
                     if (containmentPair != null) {
                        EReference containmentReference = containmentPair.first;
                        EObject possibleContainer = containmentPair.second;
                        // do not add advice elements that will indirectly be added anyways during the first iteration
                        boolean isReallyIndirectlyContained = EMFAdapter.isReallyIndirectlyContained(adviceEObjectToBeAdded,
                              adviceEObjectsToBeAdded);
                        isReallyIndirectlyContained = isReallyIndirectlyContained
                              || EMFAdapter.isReallyIndirectlyContained(adviceEObjectToBeAdded,
                              adviceEObjectsAlreadyAdded);
                        if (possibleContainer == uniqueWovenRoot || !isReallyIndirectlyContained || i > 0) {
                           addToContainmentIfPossible(featureCorresponder, possibleContainer, adviceEObjectsAlreadyAdded,
                                 baseVersionsOfAlreadyContainedAdviceElements, adviceEObjectToBeAdded,
                                 baseVersionOfAdviceEObjectToBeAdded, containmentReference);
                        }
                     }
                  }
               }
               adviceEObjectsToBeAdded.removeAll(adviceEObjectsAlreadyAdded);
            }
         }
      }
   }

   private void addToContainmentIfPossible(FeatureCorresponder featureCorresponder, EObject possibleContainer,
         Set<EObject> adviceEObjectsAlreadyAdded, Set<EObject> baseVersionsOfAlreadyContainedAdviceElements,
         EObject adviceEObjectToBeAdded, EObject baseVersionOfAdviceEObjectToBeAdded, EReference containmentReference) {
      EClassifier uniqueRootContainmentReferenceType = containmentReference.getEType();
      if (featureCorresponder.isSameOrSuperType(adviceEObjectToBeAdded.eClass(), uniqueRootContainmentReferenceType)) {
         List<EObject> rootElementContents = EMFAdapter.getFeatureValuesIfManyTyped(possibleContainer, containmentReference);
         rootElementContents.add(baseVersionOfAdviceEObjectToBeAdded);
         SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
         console.println("Added the advice element '" + baseVersionOfAdviceEObjectToBeAdded + "' to the containment reference '"
               + containmentReference.getName() + "' of the unique root element '" + possibleContainer + "' of the woven model.");
         // register the contained elements of the base version of the added advice element
         for (EObject baseVersionOfAdviceContent : EMFAdapter.getAllContents(baseVersionOfAdviceEObjectToBeAdded)) {
            baseVersionsOfAlreadyContainedAdviceElements.add(baseVersionOfAdviceContent);
         }
         adviceEObjectsAlreadyAdded.add(adviceEObjectToBeAdded);
      }
   }
}
