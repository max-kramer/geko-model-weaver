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

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.common.modeltransform.AbstractTransformer;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.datastructures.N2NMap;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.datastructures.Quintuple;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;
import lu.uni.geko.weaver.scope.ScopeResolver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class AsymmetricWeaver extends AbstractTransformer<URI> {
	private final URI adviceMURI;
	private final URI wovenMURI;
	private final N2NMap<EObject, EObject> pointcut2AdviceMap;
	private List<Map<EObject, EObject>> pointcut2BaseMaps;

	/**
	 * In order to work as expected an AsymmetricWeaver must be used according to the following protocol:</br>
	 * <pre>
	 *  AsymmetricWeaver asymmetricWeaver = new AsymmetricWeaver(baseMURI, ...);
	 *  URI wovenMURI = asymmetricWeaver.copyBaseToWovenMURI();
	 *  // do joinpoint detection using the new result resource that contains a copy of the base
	 *  List<Map<EObject, EObject>> pointcut2BaseMaps = detectJoinpoints(pointcutMURI, wovenMURI, ...);
	 *  // this way the map result of the joinpoint detection will
	 *  // map the copied elements and not the original elements of the base
	 *  asymmetricWeaver.setPointcut2BaseMaps(pointcut2BaseMaps);
	 *  asymmetricWeaver.generate();
	 * </pre>
	 * @param baseMURI
	 * @param adviceMURI
	 * @param pointcut2AdviceMap
	 */
	public AsymmetricWeaver(URI baseMURI, URI adviceMURI, N2NMap<EObject, EObject> pointcut2AdviceMap, boolean inPlace) {
		super(baseMURI);
		this.wovenMURI = inPlace ? baseMURI : EMFAdapter.newUriWithStringAppendedToFilename(baseMURI, GeKoConstants.WOVEN_M_FILENAME_APPENDAGE);
		this.adviceMURI = adviceMURI;
		this.pointcut2AdviceMap = pointcut2AdviceMap;
	}

	
	/**
	 * RATIONALE MK by copying the base model before the joinpoint detection we avoid trouble with invalid mappings
	 * (that would point to elements of the base model instead of the woven model if we would copy afterwards)
	 * @return URI of the woven model that contains a copy of the base (until generate() is called)
	 */
	public URI copyBaseToWovenMURI() {
		EObject baseRootElement = MainResourceLoader.getUniqueResourceContentRoot(this.uri, "base model");
		EObject wovenRootElement = EcoreUtil.copy(baseRootElement);
		MainResourceLoader.saveEObjectAsOnlyContent(wovenRootElement, this.wovenMURI);
		return wovenMURI;
	}
	
	public void setPointcut2BaseMaps(List<Map<EObject, EObject>> pointcut2BaseMaps) {
		this.pointcut2BaseMaps = pointcut2BaseMaps;
	}

	@Override
	public URI generate() {
		return generate(true);
	}
	
	public URI generate(boolean persist) {	
		for (Map<EObject, EObject> pointcut2BaseMap: this.pointcut2BaseMaps) {
			Set<EObject> baseEObjectsToBeRemoved = SetCalculator.calculateBaseEObjectsToBeRemoved(pointcut2BaseMap, this.pointcut2AdviceMap);
			BiN2NMap<EObject, EObject> base2AdviceMergeBiMap = SetCalculator.calculateBase2AdviceMergeMap(pointcut2BaseMap, this.pointcut2AdviceMap);
			Pair<Set<EObject>, Map<EObject, AdviceInstantiationScope>> adviceAndScopePair = ScopeResolver.getAdviceElementsAndAdviceEObjects2ScopeMap(this.adviceMURI);
			Set<EObject> adviceEObjects = adviceAndScopePair.first;
			Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap = adviceAndScopePair.second;
			Set<EObject> adviceEObjectsToBeAdded = SetCalculator.calculateAdviceEObjectsToBeAdded(adviceEObjects, pointcut2AdviceMap);
			console.println("\nInspecting join point: " + pointcut2BaseMap + "\n");
			console.println("baseEObjectsToBeRemoved:\n" + baseEObjectsToBeRemoved + "\n");
			console.println("base2AdviceMergeBiMap:\n" + base2AdviceMergeBiMap + "\n");
			console.println("adviceEObjectsToBeAdded:\n" + adviceEObjectsToBeAdded + "\n");
			Merger merger = new Merger(base2AdviceMergeBiMap, adviceEObjectsToBeAdded, adviceEObjects2ScopeMap, this.wovenMURI);
			Quintuple<Set<EObject>, URI, BiN2NMap<EObject, EObject>, FeatureCorresponder, Map<EObject, AdviceInstantiationScope>> adderParameters = merger.performMergesAndReturnAdderParameters();
			MainAdder.performAdditions(adderParameters);
			Remover remover = new Remover();
			remover.performRemovals(baseEObjectsToBeRemoved);
		}
		console.println("\nFinished weaving at all " + pointcut2BaseMaps.size() + " join points.\n");
		if (persist) {
			console.print("Saving woven model ...");
			MainResourceLoader.saveResource(wovenMURI);
			console.println(" done");
		}
		return this.wovenMURI;
	}
}
