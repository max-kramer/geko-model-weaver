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

import lu.uni.geko.common.GeKoConstants;

import org.eclipse.emf.ecore.EObject;

/**
 * A utility factory for creating advice instantiation scope implementations based on their type.
 *
 * @author Max E. Kramer
 */
public final class ScopeFactory {
   /** Utility classes should not have a public or default constructor. */
   private ScopeFactory() {
   }

   /** The global advice instantiation scope singleton. */
   private static final AdviceInstantiationScope GLOBAL_SCOPE = new AdviceInstantiationScope() {
      @Override
      public ScopeType getType() {
         return ScopeType.GlobalScope;
      }
   };

   /** The global per join point advice instantiation scope singleton. */
   private static final AdviceInstantiationScope PER_JOIN_POINT_SCOPE = new AdviceInstantiationScope() {
      @Override
      public ScopeType getType() {
         return ScopeType.PerJoinPointScope;
      }
   };

   /** The dynamic advice instantiation scope singleton. */
   private static final AdviceInstantiationScope DYNAMIC_SCOPE = new AdviceInstantiationScope() {
      @Override
      public ScopeType getType() {
         return ScopeType.DynamicScope;
      }
   };

   /**
    * @return an implementation of global advice instantiation scope.
    */
   public static AdviceInstantiationScope createGlobalScope() {
      return GLOBAL_SCOPE;
   }

   /**
    * @return an implementation of per join point advice instantiation scope.
    */
   public static AdviceInstantiationScope createPerJoinPointScope() {
      return PER_JOIN_POINT_SCOPE;
   }

   /**
    * @return an implementation of dynamic advice instantiation scope.
    */
   public static AdviceInstantiationScope createDynamicScope() {
      return DYNAMIC_SCOPE;
   }

   /**
    * Returns an implementation of custom advice instantiation scope using the given set of advice elements in the scope.
    *
    * @param avElementsInScope
    *           a set containing the advice elements in this scope
    * @return the custom advice instantiation scope implementation for the give advice elements
    */
   public static AdviceInstantiationScope createCustomScope(final Set<EObject> avElementsInScope) {
      return new CustomScope(avElementsInScope);
   }

   /**
    * Creates an implementation of the default advice instantiation scope that is defined in {@link GeKoConstants}.
    *
    * @return an implementation of the default advice instantiation scope
    */
   public static AdviceInstantiationScope createDefaultScope() {
      String defaultTypeName = GeKoConstants.getDefaultAvInstantiationScopeType();
      ScopeType defaultType = ScopeType.valueOf(defaultTypeName);
      switch (defaultType) {
      case GlobalScope:
         return createGlobalScope();
      case PerJoinPointScope:
         return createPerJoinPointScope();
      case DynamicScope:
         return createDynamicScope();
      default:
         return createPerJoinPointScope();
      }
   }
}
