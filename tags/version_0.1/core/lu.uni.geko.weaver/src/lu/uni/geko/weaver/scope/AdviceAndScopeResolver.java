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

import java.util.Iterator;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.HashMappedAdvice;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Utility class for resolving the advice elements that represent base elements together with their advice instantiation scopes
 * from advice models.
 *
 * @see Advice
 * @see AdviceInstantiationScope
 *
 * @author Max E. Kramer
 */
public final class AdviceAndScopeResolver {
   /** Utility classes should not have a public or default constructor. */
   private AdviceAndScopeResolver() {
   }

   /**
    * Resolves the elements of the advice model at the given URI that represent base model elements together with their advice
    * instantiation scopes.
    *
    * @param avMURI
    *           the URI of an advice model
    * @return the advice encapsulating elements and their scope
    */
   public static Advice resolveAvAndInstantiationScopes(final URI avMURI) {
      HashMappedAdvice advice = new HashMappedAdvice();
      Iterator<EObject> allResourceContentsIterator = MainResourceLoader.getAllContentsIterator(avMURI);
      while (allResourceContentsIterator.hasNext()) {
         EObject nextContent = allResourceContentsIterator.next();
         boolean isAvSpecificElement = GeKoBridge.skipAvSpecificElement(nextContent);
         if (isAvSpecificElement) {
            EClass nextContentClass = nextContent.eClass();
            String nextContentClassName = nextContentClass.getInstanceClass().getSimpleName();
            AdviceInstantiationScope scope = null;
            if (nextContentClassName.equals(GeKoConstants.getAvMMGlobalScopeClassName())) {
               scope = ScopeFactory.createGlobalScope();
            } else if (nextContentClassName.equals(GeKoConstants.getAvMMPerJoinPointScopeClassName())) {
               scope = ScopeFactory.createPerJoinPointScope();
            }
            // MAYDO MK SCOPE implement scope resolution for dynamic and
            // custom scope
            if (scope != null) {
               EStructuralFeature scopeReference = nextContentClass.getEStructuralFeature(GeKoConstants
                     .getAvMMScopeReferenceName());
               Object scopedObject = EcoreBridge.getFeatureValueIfNotManyTyped(nextContent, scopeReference);
               if (scopedObject == null || !(scopedObject instanceof EObject)) {
                  throw new RuntimeException("The scope element '" + nextContent + "' of the advice model '" + avMURI
                        + "' has to reference an EObject!");
               } else {
                  EObject scopedEObject = (EObject) scopedObject;
                  advice.addAvInstantiationScope(scopedEObject, scope);
                  // inherit scope for contained objects but do not overwrite specified scope
                  for (EObject scopedContent : EcoreBridge.getAllContents(scopedEObject)) {
                     AdviceInstantiationScope contentScope = advice.getAvInstantiationScope(scopedEObject);
                     if (contentScope == null) {
                        advice.addAvInstantiationScope(scopedContent, scope);
                     }
                  }
               }
            }
         } else {
            advice.addAvElement(nextContent);
         }
      }
      AdviceInstantiationScope defaultScope = ScopeFactory.createDefaultScope();
      for (EObject avElement : advice.getAllAvElements()) {
         AdviceInstantiationScope scope = advice.getAvInstantiationScope(avElement);
         if (scope == null) {
            advice.addAvInstantiationScope(avElement, defaultScope);
         }
      }
      return advice;
   }
}
