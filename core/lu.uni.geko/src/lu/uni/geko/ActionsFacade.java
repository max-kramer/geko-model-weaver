/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 *     Flavie Roussy - generation of only pointcut and advice editors added
 *     					in-place transformations support added
 *     					weaving of two linked models
 ******************************************************************************/
package lu.uni.geko;

import java.util.ArrayList;
import java.util.List;

import lu.uni.geko.common.JoinPoint;
import lu.uni.geko.joinpointdetection.MainJoinpointDetector;
import lu.uni.geko.mapping.Pc2AvMapResolver;
import lu.uni.geko.mmtransformer.MMTransformer;
import lu.uni.geko.mmtransformer.PluginStarter;
import lu.uni.geko.util.datastructures.N2NMap;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.weaver.Weaver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * A utility class following the facade design pattern to grant access to all commands.<br/>
 * Individual plug-ins should not access the functionality of other plug-ins directly if the functionality is also accessible for
 * the user. In such cases an new method should be added to this facade and this method should be called from the user interface
 * command as well as from the depending plug-ins.
 *
 * @author Max E. Kramer
 */
public final class ActionsFacade {
	/** Utility classes should not have a public or default constructor. */
	private ActionsFacade() {
	}

	/**
	 * Generates a pointcut and an advice metamodel from the metamodel at the given URI and registers editor for these new
	 * metamodels and the existing metamodel.
	 *
	 * @param mmURI
	 *           the URI of the base metamodel
	 * @return (pointcutMMURI, adviceMMURI)
	 */
	public static Pair<URI, URI> generateBasePcAndAvEditors(final URI mmURI) {
		return (new MMTransformer(mmURI)).transform();
	}

	/**
	 * Generates a pointcut and an advice metamodel from the metamodel at the given URI and registers editor for these new
	 * metamodels and the existing metamodel.
	 *
	 * @param mmURI
	 *           the URI of the base metamodel
	 * @return (pointcutMMURI, adviceMMURI)
	 */
	public static Pair<URI, URI> generatePcAndAvEditors(final URI mmURI) {
		return (new MMTransformer(mmURI)).generatePcAvMMAndModelCode();
	}

	/**
	 * Generates an advice metamodel from the metamodel at the given URI and generates model code for it.
	 *
	 * @param mmURI
	 *           the URI of the base metamodel
	 * @return the URI of the generated advice metamodel
	 */
	public static URI generateAvMMAndModelCode(final URI mmURI) {
		return (new MMTransformer(mmURI)).generateAvMMAndModelCode();
	}

	/**
	 * Generates a pointcut metamodel from the metamodel at the given URI and generates model code for it.
	 *
	 * @param mmURI
	 *           the URI of the base metamodel
	 * @return the URI of the generated pointcut metamodel
	 */
	public static URI generatePcMMAndModelCode(final URI mmURI) {
		return (new MMTransformer(mmURI)).generatePcMMAndModelCode();
	}

	/**
	 * Detects the joinpoints for the pointcut and base model at the given URIs and returns them.
	 *
	 * @param pcMURI
	 *           the URI of the pointcut model
	 * @param baseMURI
	 *           the URI of the base model
	 * @return a list containing all detected join points
	 */
	public static List<JoinPoint> detectJoinpoints(final URI pcMURI, final URI baseMURI) {
		return MainJoinpointDetector.detectJoinpoints(pcMURI, baseMURI);
	}

	/**
	 * Detects the joinpoints for the pointcut and base model at the given URIs and returns them.
	 *
	 * @param pcMURI
	 *           the URI of the pointcut model
	 * @param baseMURI
	 *           the URI of the base model
	 * @return a list containing all detected join points
	 */
	public static List<JoinPoint> detectJoinpoints(final URI pcMURI, final List<URI> baseMURIs) {
		return MainJoinpointDetector.detectJoinpoints(pcMURI, baseMURIs);
	}

	/**
	 * Weaves the base, pointcut and advice models at the given URIs to a new woven model by inferring the mapping from pointcut to
	 * advice.
	 *
	 * @param baseMURI
	 *           the URI of the base model
	 * @param pcMURI
	 *           the URI of the pointcut model
	 * @param avMURI
	 *           the URI of the advice model
	 * @param inPlace
	 * 			 in-place or out-of-place transformation
	 * @return the URI of the woven model
	 */
	public static URI weaveInferringPc2AvMapping(final URI baseMURI, final URI pcMURI, final URI avMURI, boolean inPlace) {
		N2NMap<EObject, EObject> pointcut2AdviceN2NMap = (new Pc2AvMapResolver(pcMURI, avMURI)).transform();
		if (pointcut2AdviceN2NMap == null) {
			return null;
		} else {
			return weave(baseMURI, pcMURI, avMURI, pointcut2AdviceN2NMap, inPlace);
		}
	}

	/**
	 * Weaves the base, pointcut and advice models at the given URIs to new woven models by inferring the mapping from pointcut to
	 * advice.
	 *
	 * @param baseMURI
	 *           the URI of the base models
	 * @param pcMURI
	 *           the URI of the pointcut model
	 * @param avMURI
	 *           the URI of the advice model
	 * @param inPlace
	 * 			 in-place or out-of-place transformation
	 * @return the URI of the woven models
	 */
	public static URI weaveSeveralModelsInferringPc2AvMapping(final List<URI> baseMURIs, final URI pcMURI, final URI avMURI, boolean inPlace) {
		N2NMap<EObject, EObject> pointcut2AdviceN2NMap = (new Pc2AvMapResolver(pcMURI, avMURI)).transform();
		if (pointcut2AdviceN2NMap == null) {
			return null;
		} else {
			return weave(baseMURIs, pcMURI, avMURI, pointcut2AdviceN2NMap, inPlace);
		}
	}

	/**
	 * Weaves the base, pointcut and advice models at the given URIs to a new woven model using the mapping from pointcut to advice
	 * at the given URI. Infers a completion of this mapping if needed.
	 *
	 * @param baseMURI
	 *           the URI of the base model
	 * @param pcMURI
	 *           the URI of the pointcut model
	 * @param avMURI
	 *           the URI of the advice model
	 * @param pc2AvMappingMURI
	 *           the URI of the mapping from pointcut to advice elements
	 * @param inPlace
	 * 			 in-place or out-of-place transformation
	 * @return the URI of the woven model
	 */
	public static URI weaveWithPc2AvMappingModel(final URI baseMURI, final URI pcMURI, final URI avMURI,
			final URI pc2AvMappingMURI, boolean inPlace) {
		N2NMap<EObject, EObject> pc2AvN2NMap = (new Pc2AvMapResolver(pcMURI, avMURI, pc2AvMappingMURI)).transform();
		if (pc2AvN2NMap == null) {
			return null;
		} else {
			return weave(baseMURI, pcMURI, avMURI, pc2AvN2NMap, inPlace);
		}
	}

	/**
	 * Weaves the base, pointcut and advice models at the given URIs to new woven models using the mapping from pointcut to advice
	 * at the given URI. Infers a completion of this mapping if needed.
	 *
	 * @param baseMURI
	 *           the URIs of the base models
	 * @param pcMURI
	 *           the URI of the pointcut model
	 * @param avMURI
	 *           the URI of the advice model
	 * @param pc2AvMappingMURI
	 *           the URI of the mapping from pointcut to advice elements
	 * @param inPlace
	 * 			 in-place or out-of-place transformation
	 * @return the URIs of the woven model
	 */
	public static URI weaveSeveralModelsWithPc2AvMappingModel(final List<URI> baseMURIs, final URI pcMURI, final URI avMURI,
			final URI pc2AvMappingMURI, boolean inPlace) {
		N2NMap<EObject, EObject> pc2AvN2NMap = (new Pc2AvMapResolver(pcMURI, avMURI, pc2AvMappingMURI)).transform();
		if (pc2AvN2NMap == null) {
			return null;
		} else {
			return weave(baseMURIs , pcMURI, avMURI, pc2AvN2NMap, inPlace);
		}
	}

	/**
	 * Weaves the base, pointcut and advice models at the given URIs to a new woven model using the given mapping from pointcut to
	 * advice elements.
	 *
	 * @param baseMURI
	 *           the URI of the base model
	 * @param pcMURI
	 *           the URI of the pointcut model
	 * @param avMURI
	 *           the URI of the advice model
	 * @param pc2AvN2NMap
	 *           the mapping from pointcut to advice elements
	 * @param inPlace
	 *           in-place / out-of-place transformation
	 * @return the URI of the woven model
	 */
	private static URI weave(final URI baseMURI, final URI pcMURI, final URI avMURI, final N2NMap<EObject, EObject> pc2AvN2NMap, boolean inPlace) {
		Weaver weaver = new Weaver(baseMURI, avMURI, pc2AvN2NMap, inPlace);
		URI wovenMURI;
		if (inPlace) {
			wovenMURI = baseMURI;
		}
		else {
			wovenMURI = weaver.copyBaseToWovenMURI();
		}
		List<JoinPoint> joinPoints = detectJoinpoints(pcMURI, wovenMURI);
		weaver.setJoinPoints(joinPoints);
		weaver.transform();
		return wovenMURI;
	}

	/**
	 * Weaves the base, pointcut and advice models at the given URIs to a new woven model using the given mapping from pointcut to
	 * advice elements.
	 *
	 * @param baseMURI
	 *           the URI of the base model
	 * @param pcMURI
	 *           the URI of the pointcut model
	 * @param avMURI
	 *           the URI of the advice model
	 * @param pc2AvN2NMap
	 *           the mapping from pointcut to advice elements
	 * @param inPlace
	 *           in-place / out-of-place transformation
	 * @return the URI of the woven model
	 */
	private static URI weave(final List<URI> baseMURIs, final URI pcMURI, final URI avMURI, final N2NMap<EObject, EObject> pc2AvN2NMap, boolean inPlace) {
		//select the position of the base model we want to weave (the others are just referenced)
		//the model to weave is identified with "_ToWeave"
		int baseModelPosition = 0;
		if (baseMURIs.size() > 1) {
			for (URI tmp : baseMURIs) {
				if (tmp.toString().indexOf("_ToWeave") != -1)
				{
					baseModelPosition = baseMURIs.indexOf(tmp);
				}
			}
		}
		
		//the weaver of the base model to weave
		Weaver weaver = new Weaver(baseMURIs.get(baseModelPosition), avMURI, pc2AvN2NMap, inPlace);
		URI wovenMURI;
		if (inPlace) {
			wovenMURI = baseMURIs.get(baseModelPosition);
		}
		else {
			wovenMURI = weaver.copyBaseToWovenMURI();
		}
		List<URI> detectJoinPointURIs = new ArrayList<URI>();
		detectJoinPointURIs.add(wovenMURI);
		for (URI tmp : baseMURIs) {
			if (tmp != baseMURIs.get(baseModelPosition)) {
				detectJoinPointURIs.add(tmp);
			}
		}
		List<JoinPoint> joinPoints = detectJoinpoints(pcMURI, detectJoinPointURIs);
		weaver.setJoinPoints(joinPoints);
		weaver.transform();
		return wovenMURI;
	}

	/**
	 * Installs and starts the model, edit, and editor plug-ins that were created for the metamodel at the given URI.
	 *
	 * @param mmURI
	 *           the URI of the metamodel for which the model, edit, and editor plug-ins were already created
	 */
	public static void installAndStartGeneratedEditorPlugin(final URI mmURI) {
		PluginStarter.installAndStartGeneratedEditorPlugin(mmURI);
	}
}