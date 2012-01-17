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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lu.uni.geko.util.datastructures.BiHashN2NMap;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.datastructures.N2NMap;

import org.eclipse.emf.ecore.EObject;

public class SetCalculator {
	
//	/**
//	 * 	Let f denote the morphism from the pointcut to the base (pointcut2BaseMap).</br>
//	 *  An element e of the base must be kept without changes if and only if</br>
//	 *  - there is NO element e' in the pointcut such that f(e')=e
//	 * @param baseEObjects 
//	 * @param pointcut2BaseMap
//	 * @param pointcut2AdviceMapping
//	 * @return baseEObjectsToBeKept
//	 */
//	public static Set<EObject> calculateBaseEObjectsToBeKept(Set<EObject> baseEObjects, Map<EObject, EObject> pointcut2BaseMap) {
//		Set<EObject> baseEObjectsToBeKept = new HashSet<EObject>();
//		for (EObject e : baseEObjects) {
//			if (!pointcut2BaseMap.containsValue(e)) {
//				baseEObjectsToBeKept.add(e);
//			}
//		}
//		return baseEObjectsToBeKept;
//	}

	/**
	 * 	Let f denote the morphism from the pointcut to the base (pointcut2BaseMap)</br>
	 *  and let g denote the morphism from the pointcut to the advice (pointcut2AdviceMap).</br>
	 *  An element e of the base must be removed if and only if</br>
	 *  - there is an element e' in the pointcut such that f(e')=e</br>
	 *  - and there is NO element e'' in the advice such that g(e')=e'' 	
	 * @param pointcut2BaseMap
	 * @param pointcut2AdviceMap
	 * @return baseEObjectsToBeRemoved
	 */
	public static Set<EObject> calculateBaseEObjectsToBeRemoved(Map<EObject, EObject> pointcut2BaseMap, N2NMap<EObject, EObject> pointcut2AdviceMap) {
		Set<EObject> baseEObjectsToBeRemoved = new HashSet<EObject>();
		for (EObject ePrime : pointcut2BaseMap.keySet()) {
			if (!pointcut2AdviceMap.containsKey(ePrime)) {
				EObject e = pointcut2BaseMap.get(ePrime);
				baseEObjectsToBeRemoved.add(e);
			}
		}
		return baseEObjectsToBeRemoved;
	}

	// MAYDO MK if performance is an issue calculate baseEObjectsToBeRemoved and base2AdviceMergeMap with a single method
	/**
	 * 	Let f denote the morphism from the pointcut to the base (pointcut2BaseMap)</br>
	 *  and let g denote the morphism from the pointcut to the advice (pointcut2AdviceMap).</br>
	 *  An element e of the base must be merged with an element e'' of the advice if and only if</br>
	 *  - there is an element e' in the pointcut such that f(e')=e</br>
	 *  - and there is an element e'' in the advice such that g(e')=e''
	 * @param pointcut2BaseMap
	 * @param pointcut2AdviceMap
	 * @return base2AdviceMergeMap
	 */
	public static BiN2NMap<EObject,EObject> calculateBase2AdviceMergeMap(Map<EObject, EObject> pointcut2BaseMap, N2NMap<EObject, EObject> pointcut2AdviceMap) {
		BiN2NMap<EObject, EObject> base2AdviceMergeMap = new BiHashN2NMap<EObject, EObject>();
		for (Entry<Set<EObject>, Set<EObject>> pc2AvMapEntry : pointcut2AdviceMap.entrySet()) {
			Set<EObject> es = new HashSet<EObject>();
			Set<EObject> ePrimes = pc2AvMapEntry.getKey();
			for (EObject ePrime : ePrimes) {
				EObject e = pointcut2BaseMap.get(ePrime);
				if (e != null) {
					es.add(e);
				}
			}
			if (!es.isEmpty()) {
				Set<EObject> ePrimePrimes = pc2AvMapEntry.getValue();
				base2AdviceMergeMap.put(es, ePrimePrimes);
			}
		}
		return base2AdviceMergeMap;
	}

	/**
	 * 	Let g denote the morphism from the pointcut to the advice (pointcut2AdviceMap).</br>
	 *  An element e of the advice must be added to the base if and only if</br>
	 *  - there is NO element e' in the pointcut such that g(e')=e
	 * @param adviceEObjects
	 * @param pointcut2AdviceMap
	 * @return adviceEObjectsToBeAdded
	 */
	public static Set<EObject> calculateAdviceEObjectsToBeAdded(Set<EObject> adviceEObjects, N2NMap<EObject, EObject> pointcut2AdviceMap) {
		Set<EObject> adviceEObjectsToBeAdded = new HashSet<EObject>();
		for (EObject e : adviceEObjects) {
			if (!pointcut2AdviceMap.containsValue(e)) {
				adviceEObjectsToBeAdded.add(e);
			}
		}
		return adviceEObjectsToBeAdded;
	}
}
