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
package lu.uni.geko.weaver.add;

import java.util.List;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.AdviceEffectuation;
import lu.uni.geko.weaver.copy.MainCopier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * The default implementation of the extension point {@link SimpleAdderExt lu.uni.geko.weaver.add.simpleadderext} that returns the
 * base variant of the containment reference used in the advice where possible and otherwise guesses a containment reference of
 * the root of the woven model based on the type.
 *
 * @see SimpleAdderExt
 *
 * @author Max E. Kramer
 */
public class DefaultSimpleAdder implements SimpleAdderExt {
   @Override
   public final Pair<EReference, EObject> getContainmentReferenceAndContainer(final EObject wovenRoot, final EObject avElementToAdd,
         final Advice advice, final AdviceEffectuation avEffectuation, final FeatureEquivalenceHelper featureEquivalenceHelper) {
      EObject avContainer = avElementToAdd.eContainer();
      // check whether the advice element is contained in a advice specific container
      if (GeKoBridge.skipAvSpecificElement(avContainer)) {
         // try to guess a containment reference of the root of the woven model
         EReference containmentReference = guessContainmentReferenceForAvElementAndContainer(wovenRoot, avElementToAdd,
               featureEquivalenceHelper);
         if (containmentReference == null) {
            return null;
         } else {
            return new Pair<EReference, EObject>(containmentReference, wovenRoot);
         }
      } else {
         // as the container is not advice specific we can simply use the base variant of the used containment reference and
         // container
         EReference avContainmentReference = avElementToAdd.eContainmentFeature();
         EObject baseVariantOfAvContainer = MainCopier.copyAvElement(avContainer, wovenRoot, advice, avEffectuation);
         EStructuralFeature baseContainmentFeature = featureEquivalenceHelper.getTargetEquivalentFeature(avContainer,
               baseVariantOfAvContainer, avContainmentReference);
         if (baseContainmentFeature instanceof EReference) {
            return new Pair<EReference, EObject>((EReference) baseContainmentFeature, baseVariantOfAvContainer);
         } else {
            throw new RuntimeException("The base version of the advice element containment reference '"
                  + avContainmentReference + "' for the advice element '" + avContainer + "' and its base version '"
                  + baseVariantOfAvContainer + "' is not a EReference!");
         }
      }
   }

   /**
    * Determines whether the given possible container has a only one containment reference that could contain the given advice
    * element (based on the type) and returns this reference (if existing and {@code null} otherwise).
    *
    * @param possibleContainer
    *           a possible container for the given advice element
    * @param avElementToAdd
    *           an advice element to be added
    * @param featureEquivalenceHelper
    *           a feature equivalence helper
    * @return the unambiguous containment reference for the type of the given advice element if existing and {@code null}
    *         otherwise
    */
   private EReference guessContainmentReferenceForAvElementAndContainer(final EObject possibleContainer,
         final EObject avElementToAdd, final FeatureEquivalenceHelper featureEquivalenceHelper) {
      List<EReference> rootContainmentReferences = possibleContainer.eClass().getEAllContainments();
      if (rootContainmentReferences == null) {
         return null;
      } else {
         EReference unambiguousMatch = null;
         boolean ambiguous = false;
         for (EReference rootContainmentReference : rootContainmentReferences) {
            EClassifier referenceType = rootContainmentReference.getEType();
            EClass avClass = avElementToAdd.eClass();
            boolean sameOrSuperType = featureEquivalenceHelper.isSameOrSuperType(referenceType, avClass);
            if (sameOrSuperType) {
               if (unambiguousMatch == null) {
                  unambiguousMatch = rootContainmentReference;
               } else {
                  ambiguous = true;
                  return null;
               }
            }
         }
         if (!ambiguous && unambiguousMatch != null) {
            return unambiguousMatch;
         } else {
            return null;
         }
      }
   }
}
