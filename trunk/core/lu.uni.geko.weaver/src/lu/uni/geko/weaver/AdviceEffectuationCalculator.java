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
import java.util.Map.Entry;
import java.util.Set;

import lu.uni.geko.common.JoinPoint;
import lu.uni.geko.util.datastructures.BiHashN2NMap;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.datastructures.N2NMap;

import org.eclipse.emf.ecore.EObject;

/**
 * A utility class for calculating all data structures needed for advice effectuation i.e. the sets of elements that have to be
 * removed and added during weaving as well as the mapping from base elements to the advice elements that have to be merged with
 * them.
 *
 * @author Max E. Kramer
 */
public final class AdviceEffectuationCalculator {
   /** Utility classes should not have a public or default constructor. */
   private AdviceEffectuationCalculator() {
   }

   /**
    * Calculates and returns the data needed for the advice effectuation for the given join point, advice and mapping from
    * pointcut to advice elements.
    *
    * @param joinPoint
    *           a join point
    * @param advice
    *           an advice
    * @param pc2AvN2NMap
    *           the mapping from pointcut to advice elements for the pointcut involved in the given join point and the given
    *           advice
    * @return the advice effectuation
    */
   public static AdviceEffectuation calculateAdviceEffectuation(final JoinPoint joinPoint, final Advice advice,
         final N2NMap<EObject, EObject> pc2AvN2NMap) {
      Set<EObject> baseElementsToRemove = AdviceEffectuationCalculator.calculateBaseElementsToRemove(joinPoint, pc2AvN2NMap);
      Set<EObject> avElementsToAdd = AdviceEffectuationCalculator.calculateAvElementsToAdd(advice, pc2AvN2NMap);
      BiN2NMap<EObject, EObject> base2AdviceMergeBiN2NMap = AdviceEffectuationCalculator.calculateBase2AvMergeBiN2NMap(
            joinPoint, pc2AvN2NMap);
      return new HashMappedAdviceEffectuation(baseElementsToRemove, avElementsToAdd, base2AdviceMergeBiN2NMap);
   }

   /**
    * Calculates and returns a set containing all base elements to be removed.
    *
    * Let f denote the morphism from the pointcut to the base (joinPoint)<br/>
    * and let g denote the morphism from the pointcut to the advice (pc2AvN2NMap).<br/>
    * An element e of the base must be removed if and only if<br/>
    * - there is an element e' in the pointcut such that f(e')=e<br/>
    * - and there is NO element e'' in the advice such that g(e')=e''
    *
    * @param joinPoint
    *           a joinpoint
    * @param pc2AvN2NMap
    *           the mapping from pointcut to advice elements
    * @return all base elements to be removed during weaving
    */
   private static Set<EObject> calculateBaseElementsToRemove(final JoinPoint joinPoint,
         final N2NMap<EObject, EObject> pc2AvN2NMap) {
      Set<EObject> baseElementsToRemove = new HashSet<EObject>();
      for (EObject ePrime : joinPoint.getAllPcElements()) {
         if (!pc2AvN2NMap.containsKey(ePrime)) {
            EObject e = joinPoint.getBaseElement(ePrime);
            baseElementsToRemove.add(e);
         }
      }
      return baseElementsToRemove;
   }

   // MAYDO MK if performance is an issue calculate baseEObjectsToBeRemoved and base2AdviceMergeMap with a single method
   /**
    * Calculates and returns the bidirectional mapping from base elements to advice elements that have to be merged with them.
    *
    * Let f denote the morphism from the pointcut to the base (joinPoint)<br/>
    * and let g denote the morphism from the pointcut to the advice (pointcut2AdviceMap).<br/>
    * An element e of the base must be merged with an element e'' of the advice if and only if<br/>
    * - there is an element e' in the pointcut such that f(e')=e<br/>
    * - and there is an element e'' in the advice such that g(e')=e''
    *
    * @param joinPoint
    *           a join point
    * @param pc2AvN2NMap
    *           the mapping from pointcut to advice elements
    * @return the mapping from base elements to advice elements that have to be merged with them
    */
   private static BiN2NMap<EObject, EObject> calculateBase2AvMergeBiN2NMap(final JoinPoint joinPoint,
         final N2NMap<EObject, EObject> pc2AvN2NMap) {
      BiN2NMap<EObject, EObject> base2AvMergeBiN2NMap = new BiHashN2NMap<EObject, EObject>();
      for (Entry<Set<EObject>, Set<EObject>> pc2AvN2NMapEntry : pc2AvN2NMap.entrySet()) {
         Set<EObject> es = new HashSet<EObject>();
         Set<EObject> ePrimes = pc2AvN2NMapEntry.getKey();
         for (EObject ePrime : ePrimes) {
            EObject e = joinPoint.getBaseElement(ePrime);
            if (e != null) {
               es.add(e);
            }
         }
         if (!es.isEmpty()) {
            Set<EObject> ePrimePrimes = pc2AvN2NMapEntry.getValue();
            base2AvMergeBiN2NMap.put(es, ePrimePrimes);
         }
      }
      return base2AvMergeBiN2NMap;
   }

   /**
    * Calculates and returns a set containing all advice elements to be removed.
    *
    * Let g denote the morphism from the pointcut to the advice (pc2AvN2NMap).<br/>
    * An element e of the advice must be added to the base if and only if<br/>
    * - there is NO element e' in the pointcut such that g(e')=e
    *
    * @param advice an advice
    * @param pc2AvN2NMap
    *           the mapping from pointcut to advice elements
    * @return all advice elements to be removed
    */
   private static Set<EObject> calculateAvElementsToAdd(final Advice advice, final N2NMap<EObject, EObject> pc2AvN2NMap) {
      Set<EObject> avElementsToAdd = new HashSet<EObject>();
      for (EObject e : advice.getAllAvElements()) {
         if (!pc2AvN2NMap.containsValue(e)) {
            avElementsToAdd.add(e);
         }
      }
      return avElementsToAdd;
   }
}
