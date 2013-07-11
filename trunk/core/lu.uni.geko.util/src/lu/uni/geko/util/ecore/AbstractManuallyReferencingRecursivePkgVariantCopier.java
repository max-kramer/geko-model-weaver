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
package lu.uni.geko.util.ecore;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * An abstract class to be extended by clients to create variants of EObjects. Clients have to provide:<br/>
 * 1) a method that tries to avoid creating a new variant by returning a variant if existing<br/>
 * 2) a method to register variants that were already made (in order to use the registered variant for method 1))<br/>
 * 3) a method that returns the suffix that is to be removed from a metamodel package name to obtain the package name of the
 * variant<br/>
 * The implementation is based on {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier EcoreUtil.Copier} with various modifications
 * to change the default copying behaviour. The modification in this class replaces the automatic copying of references based on
 * the registered copies with a manual copying of references in order to be usable in contexts where the same eObject may have
 * been copied more than once.
 *
 * @see lu.uni.geko.util.ecore.AbstractRecursivePkgVariantEnumRespectingCopier AbstractRecursivePkgVariantEnumRespectingCopier
 *
 * @author Max E. Kramer
 */
public abstract class AbstractManuallyReferencingRecursivePkgVariantCopier extends
      AbstractRecursivePkgVariantEnumRespectingCopier {
   /** The recommended unique identifier for serialising. */
   private static final long serialVersionUID = 0L;

   /**
    * Throws a {@link java.lang.RuntimeException RuntimeException} in order to forbid the automatic copying of references based on
    * the registered copies as this is not usable in contexts where the same eObject may have been copied more than once.
    */
   @Override
   public final void copyReferences() {
      throw new RuntimeException("Illegal call to copyReferences()!");
   }

   /**
    * Copies all references of the given eObject to the given copy of it.
    * @param eObject an eObject
    * @param copyEObject a copy of the given eObject
    */
   public final void copyReferences(final EObject eObject, final EObject copyEObject) {
      // UNCHANGED CODE from EcoreUtil$Copier.copyReferences() except for two marked modifications
      /*
       * BEGIN MK COPY REFERENCES MODIFICATION 1 / 2 ###
       */
      // RATIONALE MK when used for multiple joinpoints the hashmap EcoreUtil#Copier maps advice elements of the later joinpoints
      // to base elements that were created during the weaving of the first joinpoint that used this advice element!
      // Therefore we cannot iterate over the copy entries but have to get the eObject and its copy from the caller.

      // for (Map.Entry<EObject, EObject> entry : currentEntrySet)
      // {
      // EObject eObject = entry.getKey();
      // EObject copyEObject = entry.getValue();
      int currentSize = size();
      /*
       * BEGIN MK COPY REFERENCES MODIFICATION 2 / 2 ###
       */
      EClass eClass = eObject.eClass();
      for (int j = 0, size = eClass.getFeatureCount(); j < size; ++j) {
         EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(j);
         if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived()) {
            if (eStructuralFeature instanceof EReference) {
               EReference eReference = (EReference) eStructuralFeature;
               if (!eReference.isContainment() && !eReference.isContainer()) {
                  copyReference(eReference, eObject, copyEObject);
               }
            } else if (FeatureMapUtil.isFeatureMap(eStructuralFeature)) {
               FeatureMap featureMap = (FeatureMap) eObject.eGet(eStructuralFeature);
               FeatureMap copyFeatureMap = (FeatureMap) copyEObject.eGet(getTarget(eStructuralFeature));
               int copyFeatureMapSize = copyFeatureMap.size();
               for (int k = 0, featureMapSize = featureMap.size(); k < featureMapSize; ++k) {
                  EStructuralFeature feature = featureMap.getEStructuralFeature(k);
                  if (feature instanceof EReference) {
                     Object referencedEObject = featureMap.getValue(k);
                     Object copyReferencedEObject = get(referencedEObject);
                     if (copyReferencedEObject == null && referencedEObject != null) {
                        EReference reference = (EReference) feature;
                        if (!useOriginalReferences || reference.isContainment() || reference.getEOpposite() != null) {
                           continue;
                        }
                        copyReferencedEObject = referencedEObject;
                     }
                     // If we can't add it, it must already be in the list so find it and move it to the end.
                     //
                     if (!copyFeatureMap.add(feature, copyReferencedEObject)) {
                        for (int l = 0; l < copyFeatureMapSize; ++l) {
                           if (copyFeatureMap.getEStructuralFeature(l) == feature
                                 && copyFeatureMap.getValue(l) == copyReferencedEObject) {
                              copyFeatureMap.move(copyFeatureMap.size() - 1, l);
                              --copyFeatureMapSize;
                              break;
                           }
                        }
                     }
                  } else {
                     copyFeatureMap.add(featureMap.get(k));
                  }
               }
            }
         }
      }
      /*
       * BEGIN MK COPY REFERENCES MODIFICATION 2 / 2 ###
       */
      // }
      int newSize = size();
      if (newSize > currentSize) {
         copyReferences(eObject, copyEObject);
      }
      /*
       * END MK COPY REFERENCES MODIFICATION 2 / 2 ###
       */
   }
}
