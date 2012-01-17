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
package lu.uni.geko;

import java.util.List;
import java.util.Map;

import lu.uni.geko.joinpointdetection.JoinpointDetector;
import lu.uni.geko.mmtransformer.MMTransformer;
import lu.uni.geko.mmtransformer.PluginStarter;
import lu.uni.geko.pointcutrules.PointcutRulesGenerator;
import lu.uni.geko.util.datastructures.N2NMap;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.weaver.AsymmetricWeaver;
import lu.uni.geko.weaver.Pc2AvMapResolver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class ActionsFacade {
	// TODO MK write Java-Doc comments for all methods in ActionsFacade
	
	/**
	 *
	 * @param mmURI
	 * @return (pointcutMMUri, adviceMMUri)
	 */
	public static Pair<URI, URI> generateBasePCAndAVEditors(final URI mmURI) {
		return (new MMTransformer(mmURI)).generate();
	}

	public static URI generateAdviceMM(final URI mmURI) {
		return (new MMTransformer(mmURI)).generateAdviceMM();
	}
	
	public static URI generatePointcutMM(final URI mmURI) {
		return (new MMTransformer(mmURI)).generatePointcutMM();
	}
	
	public static Pair<String, Map<Integer, EObject>> generatePointcutRulesAndIDs(final URI pointcutMURI) {
		return (new PointcutRulesGenerator(pointcutMURI)).generate();
	}
	
	/**
	 * 
	 * @param pointcutMURI
	 * @param baseMURI
	 * @return pointcut2BaseMaps
	 */
	public static List<Map<EObject, EObject>> detectJoinpoints(final URI pointcutMURI, final URI baseMURI) {
		Pair<String, Map<Integer, EObject>> pointcutRulesAndIDs = generatePointcutRulesAndIDs(pointcutMURI);
		String pointcutRules = pointcutRulesAndIDs.first;
		Map<Integer, EObject> pcID2PcEObjectMap = pointcutRulesAndIDs.second;
		return detectJoinpoints(pointcutRules, pcID2PcEObjectMap, baseMURI);
	}
	
	/**
	 * 
	 * @param pointcutRules
	 * @param pcID2PcEObjectMap
	 * @param baseMURI
	 * @param console
	 * @return pointcut2BaseMaps
	 */
	private static List<Map<EObject, EObject>> detectJoinpoints(final String pointcutRules, final Map<Integer, EObject> pcID2PcEObjectMap, final URI baseMURI) {
		return (new JoinpointDetector(pointcutRules, pcID2PcEObjectMap, baseMURI)).generate();
	}
	
	public static URI weaveAsymmetricallyInferPc2AvMapping(final URI baseMURI, final URI pointcutMURI, final URI adviceMURI, final boolean inPlace, final boolean persist) {
		N2NMap<EObject, EObject> pointcut2AdviceMapping = (new Pc2AvMapResolver(pointcutMURI, adviceMURI)).generate();
		if (pointcut2AdviceMapping == null) {
			return null;
		} else {
			return weaveAsymmetrically(baseMURI, pointcutMURI, adviceMURI, pointcut2AdviceMapping, inPlace, persist);
		}
	}
	
	public static URI weaveAsymmetricallyWithPc2AvMappingModel(final URI baseMURI, final URI pointcutMURI, final URI adviceMURI, final URI pc2AvMappingMURI, final boolean inPlace, final boolean persist) {
		N2NMap<EObject, EObject> pointcut2AdviceMapping = (new Pc2AvMapResolver(pointcutMURI, adviceMURI, pc2AvMappingMURI)).generate();
		if (pointcut2AdviceMapping == null) {
			return null;
		} else {
			return weaveAsymmetrically(baseMURI, pointcutMURI, adviceMURI, pointcut2AdviceMapping, inPlace, persist);
		}
	}
	
	private static URI weaveAsymmetrically(final URI baseMURI, final URI pointcutMURI,
			final URI adviceMURI,
			final N2NMap<EObject, EObject> pointcut2AdviceMapping,
			final boolean inPlace,
			final boolean persist) {
		AsymmetricWeaver asymmetricWeaver = new AsymmetricWeaver(baseMURI, adviceMURI, pointcut2AdviceMapping, inPlace);
		URI wovenMURI = inPlace ? baseMURI : asymmetricWeaver.copyBaseToWovenMURI();
		List<Map<EObject, EObject>> pointcut2BaseMaps = detectJoinpoints(pointcutMURI, wovenMURI);
		asymmetricWeaver.setPointcut2BaseMaps(pointcut2BaseMaps);
		asymmetricWeaver.generate(persist);
		return wovenMURI;
	}

	public static void installAndStartGeneratedEditorPlugin(final URI uri) {
		PluginStarter.installAndStartGeneratedEditorPluginForUri(uri);
	}
}
