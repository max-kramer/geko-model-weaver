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
import lu.uni.geko.util.adapters.EMFResourceAdapter;
import lu.uni.geko.util.datastructures.BiN2NMap;
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
	public void addAdviceEObjectsToWovenModel(Set<EObject> adviceEObjectsToBeAdded, URI wovenMURI, FeatureCorresponder featureCorresponder, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap, Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap) {
		EObject uniqueWovenRoot = MainResourceLoader.getUniqueResourceContentRoot(wovenMURI, "woven model");
		SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME);
		if (adviceEObjectsToBeAdded.isEmpty()) {
			console.println("There are no remaining advice elements that would have to be added to the woven model");
		} else {
			if (uniqueWovenRoot == null) {
				throw new RuntimeException("There are still " + adviceEObjectsToBeAdded.size() + " advice elements that are not contained in any element of the woven model " +
											"but the woven model has no unique root element that could serve as container for these elements:\n" + adviceEObjectsToBeAdded);
			} else {
				// RATIONALE MK We might add advice elements that contain other advice elements. 
				// If we add these elements in the wrong order and stop whenever we encounter where do not know how to add it we may be unlucky.
				// A possible solution for this could be e.g. to count for each advice element how many other advice elements it contains and to start with the one that contains the most.
				// This, however, is a Theta(n^2) algorithm. i.e. always takes quadratic time.
				// A simpler solution is to skip elements whenever we do not know how to add them and to restart from the beginning of the list once we reached the end.
				// This algorithm has also a quadratic worst-case runtime but as we might be lucky it does not always need quadratic runtime.
				int iterationCount = adviceEObjectsToBeAdded.size();
				// RATIONALE MK do not directly remove elements from the list of elements to be added as this would cause a concurrent modification exception
				Set<EObject> adviceEObjectsAlreadyAdded = new HashSet<EObject>();
				for (int i = 0; i < iterationCount; i++) {
					for (EObject adviceEObjectToBeAdded : adviceEObjectsToBeAdded) {
						EReference containmentReference = this.wrappedAdder.getContainmentReferenceForAdviceEObject(uniqueWovenRoot, adviceEObjectToBeAdded, featureCorresponder);
						if (containmentReference != null) {
							EClassifier uniqueRootContainmentReferenceType = containmentReference.getEType();
							if (featureCorresponder.isSameOrSuperType(adviceEObjectToBeAdded.eClass(), uniqueRootContainmentReferenceType)) {			
								AdviceInstantiationScope adviceInstantiationScope = adviceEObjects2ScopeMap.get(adviceEObjectToBeAdded);
								EObject baseVersionOfAdviceEObjectToBeAdded = MainCopier.copyAdviceEObject(adviceEObjectToBeAdded, uniqueWovenRoot, base2AdviceMergeBiMap, adviceInstantiationScope);
								List<EObject> rootElementContents = EMFAdapter.getFeatureValuesIfManyTyped(uniqueWovenRoot, containmentReference);
								rootElementContents.add(baseVersionOfAdviceEObjectToBeAdded);
								console.println("Added the advice element '" + baseVersionOfAdviceEObjectToBeAdded + "' to the containment reference '" + containmentReference.getName() + "' of the unique root element '" + uniqueWovenRoot + "' of the woven model.");
								adviceEObjectsAlreadyAdded.add(adviceEObjectToBeAdded);
								// recognize that all advice elements that are contained in the current advice element do not need to be added anymore
								Set<EObject> adviceEObjectToBeAddedAllContentsSet = EMFResourceAdapter.getAllContentsSet(adviceEObjectToBeAdded);
								adviceEObjectsAlreadyAdded.addAll(adviceEObjectToBeAddedAllContentsSet);
							}
						}
					}
					adviceEObjectsToBeAdded.removeAll(adviceEObjectsAlreadyAdded);
				}
			}
		}
	}
}
