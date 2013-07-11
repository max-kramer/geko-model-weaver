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
package lu.uni.geko.weaver.scope;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * Implementation of the custom advice instantiation scope type resulting in an instance for every match of a set of advice
 * elements. CURRENTLY NOT USED.
 *
 * @author Max E. Kramer
 */
public class CustomScope implements AdviceInstantiationScope {
   /** The set of advice elements in this scope. */
   private final Set<EObject> avElementsInScope;

   /**
    * Constructs a new CustomScope using the given set of advice elements in this scope.
    *
    * @param avElementsInScope
    *           the set of advice elements in the scope
    */
   protected CustomScope(final Set<EObject> avElementsInScope) {
      super();
      this.avElementsInScope = avElementsInScope;
   }

   /**
    * Returns the set of advice elements in this scope.
    *
    * @return the set of advice elements in this scope
    */
   protected final Set<EObject> getAvElementsInScope() {
      return avElementsInScope;
   }

   @Override
   public final ScopeType getType() {
      return ScopeType.CustomScope;
   }
}
