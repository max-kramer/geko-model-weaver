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

import java.util.Map;
import java.util.Set;

import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.ecore.FeatureCorresponder;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public interface MightyAdderExt {
	/** extension point ID **/
	String ID = "lu.uni.geko.weaver.mightyadderext";

	/**
	 * ATTENTION SIDE-EFFECT: The advice elements that have been added during the execution of this method have to be removed from the set of adviceEObjectsToBeAdded!
	 * FIXME MK write Java-Doc for all extension points
	 * @param adviceEObjectsToBeAdded
	 * @param wovenMURI
	 * @param advice2BaseCopier
	 * @param featureCorresponder
	 */
	void addAdviceEObjectsToWovenModel(Set<EObject> adviceEObjectsToBeAdded, URI wovenMURI, FeatureCorresponder featureCorresponder, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap, Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap);
}
