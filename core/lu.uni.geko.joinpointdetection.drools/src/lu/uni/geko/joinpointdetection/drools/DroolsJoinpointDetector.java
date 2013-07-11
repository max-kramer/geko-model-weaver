/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 *     Flavie Roussy - weaving of two linked models
 ******************************************************************************/
package lu.uni.geko.joinpointdetection.drools;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.common.HashMappedJoinPoint;
import lu.uni.geko.common.JoinPoint;
import lu.uni.geko.joinpointdetection.JoinpointDetectorExt;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.tostring.EMFToString;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * An extension of the extension point {@link lu.uni.geko.joinpointdetection.JoinpointDetectorExt
 * lu.uni.geko.joinpointdetection.joinpointdetectorext} that implements the joinpoint detection phase using Drools
 * (www.jboss.org/drools).
 *
 * @see lu.uni.geko.joinpointdetection.JoinpointDetectorExt JoinpointDetectorExt
 *
 * @author Max E. Kramer
 */
public class DroolsJoinpointDetector implements JoinpointDetectorExt {
	@Override
	public List<JoinPoint> detectJoinpoints(final URI pcMURI, final URI baseMURI) {
		Pair<String, Map<Integer, EObject>> pcRulesAndIDs = (new PcRulesGenerator(pcMURI)).transform();
		String pointcutRules = pcRulesAndIDs.getFirst();
		Map<Integer, EObject> pcID2PcEObjectMap = pcRulesAndIDs.getSecond();
		// prepare lists that will contain the result of the joinpoint detection
		ArrayList<ArrayList<EObject>> baseEObjectsPerMatchLists = new ArrayList<ArrayList<EObject>>();
		ArrayList<ArrayList<String>> pcIDsPerMatchLists = new ArrayList<ArrayList<String>>();
		// prepare an iterable for the contents of the base model
		Iterable<EObject> baseContentIterable = createBaseMIterable(baseMURI);
		DroolsBridge.detectJoinpoints(pointcutRules, baseContentIterable, baseEObjectsPerMatchLists, pcIDsPerMatchLists);
		return populateJoinPoints(baseEObjectsPerMatchLists, pcIDsPerMatchLists, pcID2PcEObjectMap);
	}

	/**
	 * Detect Joinpoints for two base models
	 * 
	 * @param pointcutMURI
	 * 			pointcut model URI
	 * @param baseMURIs
	 * 			base models URIs
	 * 
	 * @return
	 * 			joinpoint list
	 */
	@Override
	public List<JoinPoint> detectJoinpoints(URI pcMURI, List<URI> baseMURIs) {
		Pair<String, Map<Integer, EObject>> pcRulesAndIDs = (new PcRulesGenerator(pcMURI)).transform();
		String pointcutRules = pcRulesAndIDs.getFirst();
		Map<Integer, EObject> pcID2PcEObjectMap = pcRulesAndIDs.getSecond();
		// prepare lists that will contain the result of the joinpoint detection
		ArrayList<ArrayList<EObject>> baseEObjectsPerMatchLists = new ArrayList<ArrayList<EObject>>();
		ArrayList<ArrayList<String>> pcIDsPerMatchLists = new ArrayList<ArrayList<String>>();
		// prepare an iterable for the contents of the base models
		final List<EObject> baseContentIterableList = new ArrayList<EObject>();
		Iterable<EObject> baseContentIterableTemp;
		for (final URI baseMURI : baseMURIs) {
			baseContentIterableTemp = createBaseMIterable(baseMURI);
			for (EObject temp : baseContentIterableTemp) {
				baseContentIterableList.add(temp);
			}
		}
		Iterable<EObject> baseContentIterable = new Iterable<EObject>() {
			@Override
			public Iterator<EObject> iterator() {
				return baseContentIterableList.iterator();
			}
		};
		DroolsBridge.detectJoinpoints(pointcutRules, baseContentIterable, baseEObjectsPerMatchLists, pcIDsPerMatchLists);
		return populateJoinPoints(baseEObjectsPerMatchLists, pcIDsPerMatchLists, pcID2PcEObjectMap);
	}

	/**
	 * Creates an iterable for (all contents of) the base model at the given URI.
	 *
	 * @param baseMURI
	 *           base model URI
	 * @return the iterable
	 */
	private Iterable<EObject> createBaseMIterable(final URI baseMURI) {
		Iterable<EObject> baseContentIterable = new Iterable<EObject>() {
			@Override
			public Iterator<EObject> iterator() {
				return MainResourceLoader.getAllContentsIterator(baseMURI);
			}
		};
		return baseContentIterable;
	}

	/**
	 * Populates the mappings from pointcut EObjects to base EObjects for each join point. Analyses the matched pointcut elements
	 * and IDs lists and the mapping from IDs to pointcut elements to.
	 *
	 * @param baseEObjectsPerMatchLists
	 *           a list containing a list of matched base elements for each matched join point
	 * @param pcIDsPerMatchLists
	 *           a list containing lists that contain the IDs of the matched base elements for each matched join point
	 * @param pcID2PcEObjectMap
	 *           a mapping from IDs to the pointcut elements
	 * @return pointcut2BaseMaps: a list of mappings from pointcut EObjects to base EObjects
	 */
	private List<JoinPoint> populateJoinPoints(final ArrayList<ArrayList<EObject>> baseEObjectsPerMatchLists,
			final ArrayList<ArrayList<String>> pcIDsPerMatchLists, final Map<Integer, EObject> pcID2PcEObjectMap) {
		SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
		int matchCount = baseEObjectsPerMatchLists.size();
		if (matchCount == pcIDsPerMatchLists.size()) {
			console.println("\nDetected " + matchCount + " joinpoints:");
			List<JoinPoint> allJoinPoints = new ArrayList<JoinPoint>(matchCount);
			// RATIONALE MK we want to get rid of the temporary IDs as soon as possible and only reason about real EObjects so we
			// return "shortcut" maps
			// The IDs should not be used anywhere outside this plug-in.
			for (int match = 0; match < matchCount; match++) {
				ArrayList<String> matchedPcIDs = pcIDsPerMatchLists.get(match);
				int matchedElementCount = matchedPcIDs.size();
				ArrayList<EObject> matchedBaseEObjects = baseEObjectsPerMatchLists.get(match);
				if (matchedElementCount == matchedBaseEObjects.size()) {
					HashMappedJoinPoint joinPoint = new HashMappedJoinPoint(matchedElementCount);
					allJoinPoints.add(joinPoint);
					for (int matchedElement = 0; matchedElement < matchedElementCount; matchedElement++) {
						Integer matchedPcId = Integer.parseInt(matchedPcIDs.get(matchedElement));
						EObject matchedBaseEObject = matchedBaseEObjects.get(matchedElement);
						EObject pcEObject = pcID2PcEObjectMap.get(matchedPcId);
						joinPoint.addMatch(pcEObject, matchedBaseEObject);
					}
				} else {
					console.printErrorln("The joinpoint detection returned a match that had not exactly"
							+ "as many matched base EObjects as pointcut ids!");
				}
			}
			console.println(EMFToString.getInstance().toString(allJoinPoints));
			return allJoinPoints;
		} else {
			console
			.printErrorln("The joinpoint detection returned not exactly as many matched locations as trace match mappings!");
		}
		return null;
	}

}
