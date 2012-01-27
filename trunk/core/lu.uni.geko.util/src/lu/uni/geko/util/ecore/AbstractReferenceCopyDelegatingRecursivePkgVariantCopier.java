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

public abstract class AbstractReferenceCopyDelegatingRecursivePkgVariantCopier extends AbstractRecursivePkgVariantEnumRespectingCopier {
   /**
    *
    */
   private static final long serialVersionUID = 3707464144811634815L;

   @Override
   /**
    * Hooks up cross references; it delegates to {@link #copyReference copyReference}.
    */
   public void copyReferences()
   {
   // FIXME MK cleanup the whole reuse of EcoreUtil#Copier by copying the needed code but using an abstract get etc methods instead of directly extending HashMap
   throw new RuntimeException("Illegal call to copyReferences()!");
   }
    // Here we have the problem. This hashmap
   public void copyReferences(EObject eObject, EObject copyEObject) {
   // UNCHANGED CODE from EcoreUtil$Copier.copyReferences() except for two marked modifications
      //### BEGIN MK COPY REFERENCES MODIFICATION 1 / 2 ###
   // RATIONALE MK When used for multiple joinpoints the hashmap EcoreUtil#Copier maps advice elements of the later joinpoints
   // to base elements that were created during the weaving of the first joinpoint that used this advice element!
//     for (Map.Entry<EObject, EObject> entry  : currentEntrySet)
//     {
//       EObject eObject = entry.getKey();
//       EObject copyEObject = entry.getValue();
      int currentSize = size();
    //### END MK COPY REFERENCES MODIFICATION 1 / 2 ###
       EClass eClass = eObject.eClass();
       for (int j = 0, size = eClass.getFeatureCount(); j < size; ++j)
       {
         EStructuralFeature eStructuralFeature = eClass.getEStructuralFeature(j);
         if (eStructuralFeature.isChangeable() && !eStructuralFeature.isDerived())
         {
           if (eStructuralFeature instanceof EReference)
           {
             EReference eReference = (EReference)eStructuralFeature;
             if (!eReference.isContainment() && !eReference.isContainer())
             {
               copyReference(eReference, eObject, copyEObject);
             }
           }
           else if (FeatureMapUtil.isFeatureMap(eStructuralFeature))
           {
             FeatureMap featureMap = (FeatureMap)eObject.eGet(eStructuralFeature);
             FeatureMap copyFeatureMap = (FeatureMap)copyEObject.eGet(getTarget(eStructuralFeature));
             int copyFeatureMapSize = copyFeatureMap.size();
             for (int k = 0, featureMapSize = featureMap.size(); k < featureMapSize; ++k)
             {
               EStructuralFeature feature = featureMap.getEStructuralFeature(k);
               if (feature instanceof EReference)
               {
                 Object referencedEObject = featureMap.getValue(k);
                 Object copyReferencedEObject = get(referencedEObject);
                 if (copyReferencedEObject == null && referencedEObject != null)
                 {
                   EReference reference = (EReference)feature;
                   if (!useOriginalReferences || reference.isContainment() || reference.getEOpposite() != null)
                   {
                     continue;
                   }
                   copyReferencedEObject = referencedEObject;
                 }
                 // If we can't add it, it must already be in the list so find it and move it to the end.
                 //
                 if (!copyFeatureMap.add(feature, copyReferencedEObject))
                 {
                   for (int l = 0; l < copyFeatureMapSize; ++l)
                   {
                     if (copyFeatureMap.getEStructuralFeature(l) == feature && copyFeatureMap.getValue(l) == copyReferencedEObject)
                     {
                       copyFeatureMap.move(copyFeatureMap.size() - 1, l);
                       --copyFeatureMapSize;
                       break;
                     }
                   }
                 }
               }
               else
               {
                 copyFeatureMap.add(featureMap.get(k));
               }
             }
           }
         }
       }
     //### BEGIN MK COPY REFERENCES MODIFICATION 2 / 2 ###
//     }
    int newSize = size();
    if (newSize > currentSize) {
       copyReferences(eObject, copyEObject);
    }
    //### BEGIN MK COPY REFERENCES MODIFICATION 2 / 2 ###
   }
}

