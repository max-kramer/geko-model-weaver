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
package lu.uni.geko.common;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * An implementation of the convenience representation (or proxy) of a {@link JoinPoint} using a {@link java.util.HashMap HashMap}
 * for the mapping from pointcut elements to matched base elements.
 *
 * @author Max E. Kramer
 */
public class HashMappedJoinPoint implements JoinPoint {
   /** The encapsulated mapping from pointcut to base elements. */
   private final Map<EObject, EObject> wrappedMap;

   /**
    * Constructs a new HashMappedJoinPoint for the given number of matched elements.
    *
    * @param matchedElementCount
    *           the total number of matched elements
    */
   public HashMappedJoinPoint(final int matchedElementCount) {
      this.wrappedMap = new HashMap<EObject, EObject>(matchedElementCount);
   }

   /**
    * Adds the matching pointcut and base elements to this join point.
    *
    * @param pcElement
    *           a pointcut element
    * @param baseElement
    *           the base element corresponding to the given pointcut element
    */
   public final void addMatch(final EObject pcElement, final EObject baseElement) {
      this.wrappedMap.put(pcElement, baseElement);
   }

   @Override
   public final EObject getBaseElement(final EObject pcElement) {
      return this.wrappedMap.get(pcElement);
   }

   @Override
   public final Set<EObject> getAllPcElements() {
      return this.wrappedMap.keySet();
   }

   @Override
   public final String toString() {
      return "HashMappedJoinPoint [wrappedMap=" + wrappedMap + "]";
   }
}
