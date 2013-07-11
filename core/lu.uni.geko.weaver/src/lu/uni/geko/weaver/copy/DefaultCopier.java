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
package lu.uni.geko.weaver.copy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.bridges.JavaBridge;
import lu.uni.geko.util.ecore.AbstractDeferringManuallyReferencingRecursivePkgVariantCopier;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.AdviceEffectuation;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;
import lu.uni.geko.weaver.scope.ScopeType;

import org.eclipse.emf.ecore.EObject;

/**
 * The default implementation of the interface {@link Copier} that is responsible for creating base elements corresponding to
 * existing advice elements for the {@link CopierFactoryExt} extension point.<br/>
 * <br/>
 * It currently implements the {@link ScopeType#GlobalScope global} and
 * {@link ScopeType#PerJoinPointScope per join point} advice instantiation scope.<br/>
 * <br/>
 * To copy the elements it uses a {@link AbstractDeferringManuallyReferencingRecursivePkgVariantCopier} which is a modified
 * version of {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier EcoreUtil.Copier}.
 *
 * @see Copier
 * @see AbstractDeferringManuallyReferencingRecursivePkgVariantCopier
 *
 * @author Max E. Kramer
 */
public class DefaultCopier extends AbstractDeferringManuallyReferencingRecursivePkgVariantCopier implements Copier {
   /** The recommended unique identifier for serialising. */
   private static final long serialVersionUID = 0L;

   /** The advice for which this copier is used. */
   private final Advice advice;
   /** The current advice effectuation for which this copier is used. */
   private AdviceEffectuation currentAvEffectuation;

   /** The mapping from advice effectuation to a mapping of advice elements that have been copied per join point. */
   private final Map<AdviceEffectuation, Map<EObject, EObject>> perJoinPointMaps;
   /** The mapping from advice elements to their base variant for advice elements with a global advice instantiation scope. */
   private final Map<EObject, EObject> globalMap;

   /**
    * Constructs a new DefaultCopier for the given advice.
    *
    * @param advice
    *           an advice
    */
   public DefaultCopier(final Advice advice) {
      this.advice = advice;
      this.perJoinPointMaps = new HashMap<AdviceEffectuation, Map<EObject, EObject>>();
      this.globalMap = new HashMap<EObject, EObject>();
      this.currentAvEffectuation = null;
   }

   @Override
   protected final String getMMPackageNameSuffixToRemove() {
      return GeKoConstants.getAvMMPkgNsURIAppendage();
   }

   @Override
   public final EObject copyAvElement(final EObject sourceAvElement, final EObject currentBaseVariant,
         final AdviceEffectuation avEffectuation) {
      currentAvEffectuation = avEffectuation;
      EObject copy = copy(sourceAvElement);
      copyReferences(sourceAvElement, copy);
      currentAvEffectuation = null;
      return copy;
   }

   @Override
   public final EObject getExistingVariant(final EObject avElement) {
      if (currentAvEffectuation == null) {
         throw new RuntimeException("Illegal call to getIfNoNewCopyNeeded(" + avElement + ")!");
      } else {
         AdviceInstantiationScope scope = this.advice.getAvInstantiationScope(avElement);
         ScopeType scopeType = scope.getType();
         switch (scopeType) {
         case GlobalScope:
            return getGlobalCopy(avElement);
         case PerJoinPointScope:
            return getPerJoinPointCopy(avElement);
            // TODO MK SCOPE implement dynamic and custom scope handling
         default:
            return getPerJoinPointCopy(avElement);
         }
      }
   }

   /**
    * Returns the base variant copy of the given advice element with {@link ScopeType#GlobalScope global} advice instantiation
    * scope.
    *
    * @param avElement
    *           an advice element with global advice instantiation scope
    * @return the base variant copy of the given advice element
    */
   private EObject getGlobalCopy(final EObject avElement) {
      EObject existingCopy = globalMap.get(avElement);
      if (existingCopy == null) {
         // We did not copy this advice element globally so far.
         // But we still have to check whether it will be merged with a base element.
         // Because if this is the case we do not need to copy the advice element.
         existingCopy = getBaseElementToMerge(avElement);
      }
      return existingCopy;
   }

   /**
    * Returns a base element that has to be merged with the given advice element if existing and {@code null} otherwise.
    *
    * @param avElement
    *           an advice element
    * @return a base element to be merged with the given advice element
    */
   private EObject getBaseElementToMerge(final EObject avElement) {
      Set<EObject> baseElementsToMergeWithAvElement = currentAvEffectuation.getAllBaseElementsToMerge(avElement);
      if (baseElementsToMergeWithAvElement != null && baseElementsToMergeWithAvElement.size() > 0) {
         // if more than one base element is merged with this advice element it does not matter which one we return as references
         // are corrected afterwards anyway
         return JavaBridge.one(baseElementsToMergeWithAvElement);
      }
      return null;
   }

   /**
    * Returns the base variant copy of the given advice element with {@link ScopeType#PerJoinPointScope per join point} advice
    * instantiation scope.
    *
    * @param avElement
    *           an advice element with global advice instantiation scope
    * @return the base variant copy of the given advice element for the current join point
    */
   private EObject getPerJoinPointCopy(final EObject avElement) {
      EObject existingCopy = null;
      Map<EObject, EObject> currentPerJointPointMap = perJoinPointMaps.get(currentAvEffectuation);
      if (currentPerJointPointMap == null) {
         currentPerJointPointMap = new HashMap<EObject, EObject>();
         perJoinPointMaps.put(currentAvEffectuation, currentPerJointPointMap);
      } else {
         existingCopy = currentPerJointPointMap.get(avElement);
      }
      if (existingCopy == null) {
         // We did not copy this advice element for this join point so far.
         // But we still have to check whether it will be merged with a base element.
         // Because if this is the case we do not need to copy the advice element.
         existingCopy = getBaseElementToMerge(avElement);
      }
      return existingCopy;
   }

   @Override
   public final void registerVariant(final EObject sourceAvElement, final EObject baseVariant) {
      if (currentAvEffectuation == null) {
         throw new RuntimeException("Illegal call to registerCopy(" + sourceAvElement + ", " + baseVariant + ")!");
      } else {
         AdviceInstantiationScope scope = advice.getAvInstantiationScope(sourceAvElement);
         ScopeType scopeType = scope.getType();
         switch (scopeType) {
         case GlobalScope:
            registerGlobalCopy(sourceAvElement, baseVariant);
            break;
         case PerJoinPointScope:
            registerPerJoinPointCopy(sourceAvElement, baseVariant);
            break;
         // MAYDO MK SCOPE implement dynamic and custom scope handling
         default:
            registerPerJoinPointCopy(sourceAvElement, baseVariant);
            break;
         }
      }
   }

   /**
    * Registers the given base variant of the given advice element with {@link ScopeType#GlobalScope global} advice instantiation
    * scope so that new variants will only be created if needed.
    *
    * @param sourceAvElement
    *           the advice element that was used as source of the copying
    * @param baseVariant
    *           the base variant copy of the given advice element
    */
   private void registerGlobalCopy(final EObject sourceAvElement, final EObject baseVariant) {
      EObject registeredCopy = globalMap.put(sourceAvElement, baseVariant);
      if (registeredCopy != null && registeredCopy != baseVariant) {
         throw new RuntimeException("Illegal call to registerGlobalCopy(" + sourceAvElement + ", " + baseVariant + ")!");
      }
   }

   /**
    * Registers the given base variant of the given advice element with {@link ScopeType#PerJoinPointScope per join point} advice
    * instantiation scope so that new variants will only be created if needed.
    *
    * @param sourceAvElement
    *           the advice element that was used as source of the copying
    * @param baseVariant
    *           the base variant copy of the given advice element
    */
   private void registerPerJoinPointCopy(final EObject sourceAvElement, final EObject baseVariant) {
      Map<EObject, EObject> currentPerJointPointMap = perJoinPointMaps.get(currentAvEffectuation);
      EObject registeredCopy = currentPerJointPointMap.put(sourceAvElement, baseVariant);
      if (registeredCopy != null && registeredCopy != baseVariant) {
         throw new RuntimeException("Illegal call to registerPerJoinPointCopy(" + sourceAvElement + ", " + baseVariant + ")!");
      }
   }
}
