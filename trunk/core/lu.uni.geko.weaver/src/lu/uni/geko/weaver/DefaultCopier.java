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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import lu.uni.geko.common.ecorecopy.Advice2BaseCopier;
import lu.uni.geko.util.adapters.JavaAdapter;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;
import lu.uni.geko.weaver.scope.ScopeType;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

public class DefaultCopier extends Advice2BaseCopier implements Copier {
	private static final long serialVersionUID = -4631517304088959864L;
	
	private BiN2NMap<EObject, EObject> currentBase2AdviceMergeBiMap = null;
	private Map<EObject, AdviceInstantiationScope> currentAdviceEObjects2ScopeMap = null;
	
	private Map<BiN2NMap<EObject, EObject>, Map<EObject, EObject>> perJoinPointMaps = new HashMap<BiN2NMap<EObject,EObject>, Map<EObject,EObject>>();
	private Map<EObject, EObject> globalMap = new HashMap<EObject, EObject>();
	
	@Override
	public EObject copyAdviceEObject(EObject sourceAdviceEObject, EObject currentCopyBaseEObject, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap, Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap) {
		currentBase2AdviceMergeBiMap = base2AdviceMergeBiMap;
		currentAdviceEObjects2ScopeMap = adviceEObjects2ScopeMap;
		EObject copy = copy(sourceAdviceEObject);
		copyReferences();
		currentBase2AdviceMergeBiMap = null;
		currentAdviceEObjects2ScopeMap = null;
		return copy;
	}

	@Override
	public EObject getIfNoNewCopyNeeded(EObject adviceEObject) {
		if (currentAdviceEObjects2ScopeMap == null) {
			throw new RuntimeException("Illegal call to getIfNoNewCopyNeeded(" + adviceEObject + ")!");
		} else {
			AdviceInstantiationScope scope = currentAdviceEObjects2ScopeMap.get(adviceEObject);
			ScopeType scopeType = scope.getType();
			switch (scopeType) {
				case GlobalScope : return getGlobalCopy(adviceEObject);
				case PerJoinPointScope : return getPerJoinPointCopy(adviceEObject);
				// FIXME MK SCOPE implement dynamic and custom scope handling
				default : return getPerJoinPointCopy(adviceEObject);
			}
		}
	}
	
	private EObject getGlobalCopy(EObject adviceEObject) {
		EObject existingCopy = globalMap.get(adviceEObject);
		if (existingCopy == null) {
			// We did not copy this advice element globally so far.
			// But we still have to check whether it will be merged with a base element.
			// Because if this is the case we do not need to copy the advice element.
			existingCopy = getBaseElementToBeMerged(adviceEObject);
		}
		return existingCopy;
	}
	
	private EObject getBaseElementToBeMerged(EObject adviceEObject) {
		Set<EObject> baseElementsToBeMergedWithAdviceElement = currentBase2AdviceMergeBiMap.getAllKeysForValue(adviceEObject);
		if (baseElementsToBeMergedWithAdviceElement != null && baseElementsToBeMergedWithAdviceElement.size() > 0) {
			// if more than one base element is merged with this advice element it does not matter which one we return as references are corrected afterwards anyway
			return JavaAdapter.one(baseElementsToBeMergedWithAdviceElement);
		}
		return null;
	}

	private EObject getPerJoinPointCopy(EObject adviceEObject) {
		EObject existingCopy = null;
		Map<EObject, EObject> currentPerJointPointMap = perJoinPointMaps.get(currentBase2AdviceMergeBiMap);
		if (currentPerJointPointMap == null) {
			currentPerJointPointMap = new HashMap<EObject, EObject>();
			perJoinPointMaps.put(currentBase2AdviceMergeBiMap, currentPerJointPointMap);
		} else {
			existingCopy = currentPerJointPointMap.get(adviceEObject);
		}
		if (existingCopy == null) {
			// We did not copy this advice element for this join point so far.
			// But we still have to check whether it will be merged with a base element.
			// Because if this is the case we do not need to copy the advice element.
			existingCopy = getBaseElementToBeMerged(adviceEObject);
		}
		return existingCopy;
	}
	
	@Override
	public void registerCopy(EObject sourceAdviceEObject, EObject copy) {
		if (currentAdviceEObjects2ScopeMap == null) {
			throw new RuntimeException("Illegal call to registerCopy(" + sourceAdviceEObject + ", " + copy + ")!");
		} else {
			AdviceInstantiationScope scope = currentAdviceEObjects2ScopeMap.get(sourceAdviceEObject);
			ScopeType scopeType = scope.getType();
			switch (scopeType) {
				case GlobalScope : registerGlobalCopy(sourceAdviceEObject, copy); break;
				case PerJoinPointScope : registerPerJoinPointCopy(sourceAdviceEObject, copy); break;
				// FIXME MK SCOPE implement dynamic and custom scope handling
				default : registerPerJoinPointCopy(sourceAdviceEObject, copy); break;
			}
		}
	}
	
	private void registerGlobalCopy(EObject sourceAdviceEObject, EObject copy) {
		EObject registeredCopy = globalMap.put(sourceAdviceEObject, copy);
		if (registeredCopy != null && registeredCopy != copy) {
			throw new RuntimeException("Illegal call to registerGlobalCopy(" + sourceAdviceEObject + ", " + copy + ")!");
		}
	}
	
	private void registerPerJoinPointCopy(EObject sourceAdviceEObject, EObject copy) {
		Map<EObject, EObject> currentPerJointPointMap = perJoinPointMaps.get(currentBase2AdviceMergeBiMap);
		EObject registeredCopy = currentPerJointPointMap.put(sourceAdviceEObject, copy);
		if (registeredCopy != null && registeredCopy != copy) {
			throw new RuntimeException("Illegal call to registerPerJoinPointCopy(" + sourceAdviceEObject + ", " + copy + ")!");
		}
	}
	
	/**
	 * Hooks up cross references; it delegates to {@link #copyReference copyReference}.
    */
   public void copyReferences()
   {
	 Set<Map.Entry<EObject, EObject>> currentEntrySet = new HashSet<Map.Entry<EObject,EObject>>(entrySet());
	 int currentSize = size();
     for (Map.Entry<EObject, EObject> entry  : currentEntrySet)
     {
       EObject eObject = entry.getKey();
       EObject copyEObject = entry.getValue();
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
     }
     
     
	 int newSize = size();
	 if (newSize > currentSize) {
		 copyReferences();
	 }
   }
}
