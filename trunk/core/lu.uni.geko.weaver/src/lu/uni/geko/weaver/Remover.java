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

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class Remover {
	private final SimpleMessageConsole console;
	
	public Remover() {
		this.console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
	}
	
	public void performRemovals(Set<EObject> baseEObjectsToBeRemoved) {
		boolean additionalIterationNeeded = true;
		while (additionalIterationNeeded && baseEObjectsToBeRemoved.size() > 0) {
				additionalIterationNeeded = false;
				Set<EObject> allBaseEObjectsToBeRemoved = EcoreBridge.getAllContentsSet(baseEObjectsToBeRemoved);
				Pair<Boolean, Set<EObject>> currentCleanupResult = removeReferencesAndInconsitencies(allBaseEObjectsToBeRemoved);
				additionalIterationNeeded = currentCleanupResult.first;
				baseEObjectsToBeRemoved = currentCleanupResult.second;
				removeEObjects(allBaseEObjectsToBeRemoved);
		}
	}
	
	private void removeEObjects(Set<EObject> allBaseEObjectsToBeRemoved) {
		for (EObject baseEObjectToBeRemoved : allBaseEObjectsToBeRemoved) {
			// MAYDO MK if necessary skip objects during removal where the direct or an indirect parent will be removed
			EcoreUtil.delete(baseEObjectToBeRemoved);
			console.println("Removing the base object '" + baseEObjectToBeRemoved + "' from the model.");
		}
	}

	private Pair<Boolean,Set<EObject>> removeReferencesAndInconsitencies(Set<EObject> baseEObjectsToBeRemoved) {
		boolean changed = false;
		Set<EObject> inconsistentEObjectsToBeRemoved = new HashSet<EObject>();
		for (EObject baseEObjectToBeRemoved : baseEObjectsToBeRemoved) {
			Collection<Setting> references = EcoreBridge.getReferencesTo(baseEObjectToBeRemoved);
			for (Setting reference : references) {
				EStructuralFeature referencingFeature = reference.getEStructuralFeature();
				EObject referencingEObject = reference.getEObject();
				if (referencingFeature.isMany()) {
					List<EObject> referencedFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(referencingEObject, referencingFeature);
					referencedFeatureValues.remove(baseEObjectToBeRemoved);
					console.println("The feature '" + referencingFeature.getName() + "' of the base object '" + referencingEObject + "' referenced " +
									"the deleted object '" + baseEObjectToBeRemoved + "' so the reference had to be removed!");
					changed = true;
					int size = referencedFeatureValues.size();
					addToInconsistentObjectsIfLowerBoundViolated(referencingEObject, inconsistentEObjectsToBeRemoved, referencingFeature, size);
				} else {
					reference.set(null);
					console.println("The feature '" + referencingFeature.getName() + "' of the base object '" + referencingEObject + "' referenced " +
									"the deleted object '" + baseEObjectToBeRemoved + "' so it had to be set to null!");
					addToInconsistentObjectsIfLowerBoundViolated(referencingEObject, inconsistentEObjectsToBeRemoved, referencingFeature, 0);
					changed = true;
				}
			}
		}
		return new Pair<Boolean,Set<EObject>>(changed, inconsistentEObjectsToBeRemoved);
	}

	private boolean addToInconsistentObjectsIfLowerBoundViolated(EObject eObject, Set<EObject> inconsistentEObjectsToBeRemoved, EStructuralFeature contentStructuralFeature, int currentMultiplicity) {
		boolean changed = false;
		int lowerBound = contentStructuralFeature.getLowerBound();
		if (currentMultiplicity < lowerBound) {
			inconsistentEObjectsToBeRemoved.add(eObject);
			console.println("The lower bound of the feature '" + contentStructuralFeature.getName() + "' is '" + lowerBound + "' but the base object '" + eObject + "' referenced " +
					"only '" + currentMultiplicity + "' objects so it had to be removed!");
			changed = true;
		}
		return changed;
	}
}
