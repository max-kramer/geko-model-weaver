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
package lu.uni.geko.weaver.scope;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import lu.uni.geko.common.GeKoAdapter;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class ScopeResolver {

	public static Pair<Set<EObject>,Map<EObject, AdviceInstantiationScope>> getAdviceElementsAndAdviceEObjects2ScopeMap(URI adviceMURI) {
		Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap = new HashMap<EObject, AdviceInstantiationScope>();
		Set<EObject> adviceElements = new HashSet<EObject>();
		Iterator<EObject> allResourceContentsIterator = MainResourceLoader.getAllContentsIterator(adviceMURI);
		while (allResourceContentsIterator.hasNext()) {
			EObject nextContent = allResourceContentsIterator.next();
			boolean isAdviceSpecificElement = GeKoAdapter.skipAvSpecificElement(nextContent);
			if (isAdviceSpecificElement) {
				EClass nextContentClass = nextContent.eClass();
				String nextContentClassName = nextContentClass.getInstanceClass().getSimpleName();
				AdviceInstantiationScope scope = null;
				if (nextContentClassName.equals(GeKoConstants.getAvMMGlobalScopeClassName())) {
					scope = ScopeFactory.createGlobalScope();
				} else if (nextContentClassName.equals(GeKoConstants.getAvMMPerJoinPointScopeClassName())) {
					scope = ScopeFactory.createPerJoinPointScope();
				}
                // MAYDO MK SCOPE implement scope resolution for dynamic and
                // custom scope
				if (scope != null) {
					EStructuralFeature scopeReference = nextContentClass.getEStructuralFeature(GeKoConstants.getAvMMScopeReferenceName());
					Object scopedObject = EMFAdapter.getFeatureValueIfNotManyTyped(nextContent, scopeReference);
					if (scopedObject == null || !(scopedObject instanceof EObject)) {
						throw new RuntimeException("The scope element '" + nextContent + "' of the advice model '" + adviceMURI + "' has to reference an EObject!");
					} else {
						EObject scopedEObject = (EObject) scopedObject;
						adviceEObjects2ScopeMap.put(scopedEObject, scope);
						// inherit scope for contained objects but do not overwrite specified scope
						for (EObject scopedContent : EMFAdapter.getAllContents(scopedEObject)) {
							AdviceInstantiationScope contentScope = adviceEObjects2ScopeMap.get(scopedObject);
							if (contentScope == null) {
								adviceEObjects2ScopeMap.put(scopedContent, scope);
							}
						}
					}
				}
			} else {
				adviceElements.add(nextContent);
			}
		}
		AdviceInstantiationScope defaultScope = ScopeFactory.createDefaultScope();
		for (EObject adviceElement : adviceElements) {
			AdviceInstantiationScope scope = adviceEObjects2ScopeMap.get(adviceElement);
			if (scope == null) {
				adviceEObjects2ScopeMap.put(adviceElement, defaultScope);
			}
		}
		return new Pair<Set<EObject>, Map<EObject,AdviceInstantiationScope>>(adviceElements, adviceEObjects2ScopeMap);
	}
}
