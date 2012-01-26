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
package lu.uni.geko.common.ecorecopy;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.ecorecopy.Abstract2BaseCopier;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

public abstract class Advice2BaseCopier extends Abstract2BaseCopier {
	private static final long serialVersionUID = -7077381667743808845L;

	@Override
	protected String getPackageNameSuffixToBeRemoved() {
		return GeKoConstants.getAvMMPackageNsuriAppendage();
	}
	
	private EObject getIfNoNewCopyNeededAndCopyRegisterAndReferenceOtherwise(Object adviceObject) {
		if (adviceObject instanceof EObject) {
			EObject existingCopy = getIfNoNewCopyNeeded((EObject) adviceObject);
			if (existingCopy != null) {
				return existingCopy;
			}
		}
		if (adviceObject instanceof EObject) {
			EObject adviceEObject = (EObject) adviceObject;
			EObject newCopy = copyWithoutCheckingWhetherAlreadyCopied((EObject) adviceEObject);
			registerCopy(adviceEObject, newCopy);
			copyReferences(adviceEObject, newCopy);
			return newCopy;
		} else {
			throw new RuntimeException("Advice2BaseCopier can only copy EObjects but '" + adviceObject + "' is no EObject!");
		}
	}
	
	/**
	 * Tries to retrieve an existing copy for this advice element or a base element that will be merged with this advice element.
	 * If no existing copy or base element can be used this method returns <code>null</code>.
	 */
	public abstract EObject getIfNoNewCopyNeeded(EObject adviceEObject);
	
	/**
	 * Registers the given copy of the give advice element so that it will only be copied again if needed.
	 */
	public abstract void registerCopy(EObject adviceEObject, EObject copy);

	@Override
	/** 
	 * Returns the base object that is mapped to the given advice object (if existing)
	 * and the copy of the advice object (if existing) via <code>super.get(..)</code> otherwise.<br/>
	 * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
	 */
	public EObject get(Object adviceObject) {
		return getIfNoNewCopyNeededAndCopyRegisterAndReferenceOtherwise(adviceObject);
	}
	
	@Override
	/**
	 * Checks whether the advice object is mapped to a base object
	 * and returns this mapped base object (if existing) or a new copy otherwise.<br/>
	 * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
	 */
	public EObject copy(EObject adviceEObject) {
		return getIfNoNewCopyNeededAndCopyRegisterAndReferenceOtherwise(adviceEObject);
	}
	
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
	// RATIONALE MK When used for multiple joinpoints the hashmap EcoreUtil#Copier maps maps advice elements of the later joinpoints 
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
