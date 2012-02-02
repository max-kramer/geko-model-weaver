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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.ecore.EObject;

/**
 * An implementation of the convenience representation (or proxy) of an {@link Advice} that uses a {@link java.util.HashMap
 * HashMap} to map advice content elements to their advice instantiation scope.<br/>
 * <br/>
 * <b>Attention</b>: The collections returned by this implementation are backed up. Changing the returned collections will change
 * collections of this implementation.
 *
 * @see AdviceInstantiationScope
 *
 * @author Max E. Kramer
 */
public class HashMappedAdvice implements Advice {
   /** The encapsulated mapping from advice content elements to their advice instantiation scope. */
   private final Map<EObject, AdviceInstantiationScope> avElements2ScopeMap;

   /** The encapsulated set of advice content elements. */
   private final Set<EObject> avElements;

   /** Creates a new empty HashMappedAdvice. */
   public HashMappedAdvice() {
      this.avElements2ScopeMap = new HashMap<EObject, AdviceInstantiationScope>();
      this.avElements = new HashSet<EObject>();
   }

   @Override
   public AdviceInstantiationScope getAvInstantiationScope(final EObject avElement) {
      return this.avElements2ScopeMap.get(avElement);
   }

   @Override
   public Set<EObject> getAllAvElements() {
      return this.avElements;
   }

   /**
    * Adds the given advice element to the encapsulated set of advice content elements.
    *
    * @param avElement
    *           an advice element
    */
   public void addAvElement(final EObject avElement) {
      this.avElements.add(avElement);
   }

   /**
    * Registers the given advice instantiation scope for the given advice element.
    *
    * @param avElement
    *           an advice element
    * @param avInstantiationScope
    *           th advice instantiation scope for the given advice element
    */
   public void addAvInstantiationScope(final EObject avElement, final AdviceInstantiationScope avInstantiationScope) {
      this.avElements2ScopeMap.put(avElement, avInstantiationScope);
   }

   @Override
   public String toString() {
      return "HashMappedAdvice [avElements2ScopeMap=" + avElements2ScopeMap + ", avElements=" + avElements + "]";
   }
}
