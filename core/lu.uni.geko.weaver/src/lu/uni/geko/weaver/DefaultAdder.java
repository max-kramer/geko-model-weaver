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

import java.util.List;
import java.util.Map;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class DefaultAdder implements SimpleAdderExt {
   @Override
   public Pair<EReference, EObject> getContainmentReferenceAndContainer(EObject rootEObject, EObject adviceEObjectToBeAdded,
         FeatureEquivalenceHelper featureCorresponder, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap,
         Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap)  {
	   EObject adviceContainer = adviceEObjectToBeAdded.eContainer();
      if (GeKoBridge.skipAvSpecificElement(adviceContainer)) {
         EReference containmentReference = guessContainmentReferenceForAdviceEObjectAndContainer(rootEObject,
               adviceEObjectToBeAdded, featureCorresponder);
         if (containmentReference == null) {
            return null;
         } else {
            return new Pair<EReference, EObject>(containmentReference, rootEObject);
         }
	   } else {
         EReference adviceContainmentReference = adviceEObjectToBeAdded.eContainmentFeature();
         EObject baseVersionOfAdviceContainer = MainCopier.copyAdviceEObject(adviceContainer, rootEObject, base2AdviceMergeBiMap,
               adviceEObjects2ScopeMap);
         EStructuralFeature baseContainmentFeature = featureCorresponder.getTargetEquivalentFeature(
               adviceContainer, baseVersionOfAdviceContainer, adviceContainmentReference);
         if (baseContainmentFeature instanceof EReference) {
            return new Pair<EReference, EObject>((EReference) baseContainmentFeature, baseVersionOfAdviceContainer);
         } else {
            throw new RuntimeException("The base version of the advice element containment reference '"
                  + adviceContainmentReference + "' for the advice element '" + adviceContainer + "' and its base version '"
                  + baseVersionOfAdviceContainer + "' is not a EReference!");
         }
	   }
	}

   private EReference guessContainmentReferenceForAdviceEObjectAndContainer(EObject possibleContainer,
         EObject adviceEObjectToBeAdded, FeatureEquivalenceHelper featureCorresponder) {
      List<EReference> rootContainmentReferences = possibleContainer.eClass().getEAllContainments();
      // String errorMessage = "There is still an advice element '" + adviceEObjectToBeAdded +
      // "' that is not contained in any element of the woven model but the unique root element of the woven model";
      if (rootContainmentReferences == null) {
         // throw new RuntimeException(errorMessage +
         // " has no containment references that could serve as container for this element!");
         return null;
      } else {
         EReference unambiguousMatch = null;
         boolean ambiguous = false;
         for (EReference rootContainmentReference : rootContainmentReferences) {
            EClassifier referenceType = rootContainmentReference.getEType();
            EClass adviceClass = adviceEObjectToBeAdded.eClass();
            boolean sameOrSuperType = featureCorresponder.isSameOrSuperType(referenceType, adviceClass);
            if (sameOrSuperType) {
               if (unambiguousMatch == null) {
                  unambiguousMatch = rootContainmentReference;
               } else {
                  ambiguous = true;
                  return null;
                  // throw new RuntimeException(errorMessage +
                  // " has no unambiguous containment reference that could serve as container for this element!\n"
                  // + "Two exemplary possible references are '" + unambiguousMatch + "' and '" + rootContainmentReference + "'");
               }
            }
         }
         if (!ambiguous && unambiguousMatch != null) {
            return unambiguousMatch;
         } else {
            return null;
            // throw new RuntimeException(errorMessage +
            // " has no containment reference that has the right type to serve as container for this element!");
         }
      }
   }
}
