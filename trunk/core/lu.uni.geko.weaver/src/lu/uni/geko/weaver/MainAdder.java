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

import java.util.List;
import java.util.Map;
import java.util.Set;

import lu.uni.geko.util.adapters.EclipseAdapter;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.datastructures.Quintuple;
import lu.uni.geko.util.ecore.FeatureCorresponder;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class MainAdder {

	public static void performAdditions(
			Quintuple<Set<EObject>, URI, BiN2NMap<EObject, EObject>, FeatureCorresponder, Map<EObject, AdviceInstantiationScope>> adderParameters) {
		final Set<EObject> adviceEObjectsToBeAdded = adderParameters.first;
		final URI wovenMURI = adderParameters.second;
		final BiN2NMap<EObject, EObject> base2AdviceMergeBiMap = adderParameters.third;
		final FeatureCorresponder featureCorresponder = adderParameters.fourth;
		final Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap = adderParameters.fifth;

		List<Pair<SimpleAdderExt, Integer>> simpleAdders = EclipseAdapter.getRegisteredExecutablesWithPriority(SimpleAdderExt.ID, "class", SimpleAdderExt.class);
		List<Pair<MightyAdderExt, Integer>> mightyAdders = EclipseAdapter.getRegisteredExecutablesWithPriority(MightyAdderExt.ID, "class", MightyAdderExt.class);

		// wrap all the simple resource loaders in order to make them sophisticated
		for (Pair<SimpleAdderExt, Integer> simpleAdderPair : simpleAdders) {
			MightyAdderExt mightyAdder = new SimpleAdderWrapper(simpleAdderPair.first);
			mightyAdders.add(new Pair<MightyAdderExt, Integer>(mightyAdder, simpleAdderPair.second));
		}

		EclipseAdapter.sortExectuablesDescByPriority(MightyAdderExt.ID, mightyAdders);

		for (final Pair<MightyAdderExt, Integer> adderPair : mightyAdders) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					adderPair.first.addAdviceEObjectsToWovenModel(adviceEObjectsToBeAdded, wovenMURI, featureCorresponder, base2AdviceMergeBiMap, adviceEObjects2ScopeMap);
				}
			};
			EclipseAdapter.runInProtectedMode(runnable);
		}
		if (adviceEObjectsToBeAdded.size() > 0) {
            // TODO MK gently handle the case were not all elements could be added by checking in advance if this will happen
			throw new RuntimeException("There are still " + adviceEObjectsToBeAdded.size() + " advice elements that are not contained in any element of the woven model " +
					"but that do not have the type of the unique containment reference that could serve as container for these elements:\n" + adviceEObjectsToBeAdded);
		}
	}
}
