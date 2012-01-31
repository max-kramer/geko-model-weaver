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
import java.util.Map;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.bridges.JavaBridge;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.ecore.AbstractDeferringReferenceCopyDelegatingRecursivePkgVariantCopier;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;
import lu.uni.geko.weaver.scope.ScopeType;

import org.eclipse.emf.ecore.EObject;

public class DefaultCopier extends AbstractDeferringReferenceCopyDelegatingRecursivePkgVariantCopier implements Copier {
	private static final long serialVersionUID = -4631517304088959864L;

	private BiN2NMap<EObject, EObject> currentBase2AdviceMergeBiMap = null;
	private Map<EObject, AdviceInstantiationScope> currentAdviceEObjects2ScopeMap = null;

	private final Map<BiN2NMap<EObject, EObject>, Map<EObject, EObject>> perJoinPointMaps = new HashMap<BiN2NMap<EObject,EObject>, Map<EObject,EObject>>();
	private final Map<EObject, EObject> globalMap = new HashMap<EObject, EObject>();

   @Override
   protected String getPackageNameSuffixToBeRemoved() {
      return GeKoConstants.getAvMMPkgNsURIAppendage();
   }

	@Override
	public EObject copyAdviceEObject(EObject sourceAdviceEObject, EObject currentCopyBaseEObject, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap, Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap) {
		currentBase2AdviceMergeBiMap = base2AdviceMergeBiMap;
		currentAdviceEObjects2ScopeMap = adviceEObjects2ScopeMap;
		EObject copy = copy(sourceAdviceEObject);
		copyReferences(sourceAdviceEObject, copy);
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
                // MAYDO MK SCOPE implement dynamic and custom scope handling
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
			return JavaBridge.one(baseElementsToBeMergedWithAdviceElement);
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
            // MAYDO MK SCOPE implement dynamic and custom scope handling
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
}
