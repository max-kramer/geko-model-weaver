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
package lu.uni.geko.weaver.remove;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;
import lu.uni.geko.weaver.AdviceEffectuation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A utility class for removing base elements and invalid references after weaving an advice.
 *
 * @author Max E. Kramer
 */
public final class Remover {
   /** Utility classes should not have a public or default constructor. */
   private Remover() {
   }

   /**
    * Removes the base elements that have to be removed during the given advice effectuation from their containers and their
    * model.
    *
    * @param avEffectuation
    *           an advice effectuation
    */
   public static void performRemovals(final AdviceEffectuation avEffectuation) {
      Set<EObject> baseElementsToRemove = avEffectuation.getBaseElementsToRemove();
      boolean additionalIterationNeeded = true;
      while (additionalIterationNeeded && baseElementsToRemove.size() > 0) {
         additionalIterationNeeded = false;
         Set<EObject> allBaseElementsToRemove = EcoreBridge.getAllContentsSet(baseElementsToRemove);
         Pair<Boolean, Set<EObject>> currentCleanupResult = removeReferencesAndInconsitencies(allBaseElementsToRemove);
         additionalIterationNeeded = currentCleanupResult.getFirst();
         baseElementsToRemove = currentCleanupResult.getSecond();
         removeElements(allBaseElementsToRemove);
      }
   }

   /**
    * Removes the given base elements from their containers and their model.
    *
    * @param baseElementsToRemove
    *           the base elements to be removed
    */
   private static void removeElements(final Set<EObject> baseElementsToRemove) {
      for (EObject baseElementToRemove : baseElementsToRemove) {
         // MAYDO MK if necessary skip objects during removal where the direct or an indirect parent will be removed
         EcoreUtil.delete(baseElementToRemove);
         SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName()).println(
               "Removing the base object '" + baseElementToRemove + "' from the model.");
      }
   }

   /**
    * Removes references to elements that have been removed and removes elements that do not conform to their metamodel anymore
    * because of removed elements.
    *
    * @param baseElementsToRemove
    *           the base elements to be removed
    * @return a pair containing the information whether a change occured and a set containing the inconsistent elements to be
    *         removed
    */
   private static Pair<Boolean, Set<EObject>> removeReferencesAndInconsitencies(final Set<EObject> baseElementsToRemove) {
      boolean changed = false;
      Set<EObject> inconsistentElementsToRemove = new HashSet<EObject>();
      for (EObject baseElementToRemove : baseElementsToRemove) {
         Collection<Setting> references = EcoreBridge.getReferencesTo(baseElementToRemove);
         for (Setting reference : references) {
            EStructuralFeature referencingFeature = reference.getEStructuralFeature();
            EObject referencingBaseElement = reference.getEObject();
            if (referencingFeature.isMany()) {
               List<EObject> referencedFeatureValues = EcoreBridge.getFeatureValuesIfManyTyped(referencingBaseElement,
                     referencingFeature);
               referencedFeatureValues.remove(baseElementToRemove);
               SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName()).println(
                     "The feature '" + referencingFeature.getName() + "' of the base object '" + referencingBaseElement
                           + "' referenced " + "the deleted object '" + baseElementToRemove
                           + "' so the reference had to be removed!");
               changed = true;
               int size = referencedFeatureValues.size();
               addToInconsistentObjectsIfLowerBoundViolated(referencingBaseElement, inconsistentElementsToRemove,
                     referencingFeature, size);
            } else {
               reference.set(null);
               SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName())
                     .println(
                           "The feature '" + referencingFeature.getName() + "' of the base object '" + referencingBaseElement
                                 + "' referenced " + "the deleted object '" + baseElementToRemove
                                 + "' so it had to be set to null!");
               addToInconsistentObjectsIfLowerBoundViolated(referencingBaseElement, inconsistentElementsToRemove,
                     referencingFeature, 0);
               changed = true;
            }
         }
      }
      return new Pair<Boolean, Set<EObject>>(changed, inconsistentElementsToRemove);
   }

   /**
    * Adds the given base element that references a removed element to the set containing all inconsistent elements to be removed
    * if the given current multiplicity of the given reference violates the lower bound of the reference.
    *
    * @param referencingBaseElement
    *           a base element referencing a removed base element
    * @param inconsistentElementsToRemove
    *           the set containing the inconsistent elements to be removed
    * @param referencingFeature
    *           the feature of the given base element that references the removed base element
    * @param currentMultiplicity
    *           the current multiplicity of the given reference
    * @return whether a change occured (i.e. the referencing base element was identified as inconsistent)
    */
   private static boolean addToInconsistentObjectsIfLowerBoundViolated(final EObject referencingBaseElement,
         final Set<EObject> inconsistentElementsToRemove, final EStructuralFeature referencingFeature,
         final int currentMultiplicity) {
      boolean changed = false;
      int lowerBound = referencingFeature.getLowerBound();
      if (currentMultiplicity < lowerBound) {
         inconsistentElementsToRemove.add(referencingBaseElement);
         SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName()).println(
               "The lower bound of the feature '" + referencingFeature.getName() + "' is '" + lowerBound
                     + "' but the base object '" + referencingBaseElement + "' referenced " + "only '" + currentMultiplicity
                     + "' objects so it had to be removed!");
         changed = true;
      }
      return changed;
   }
}
