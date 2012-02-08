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

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * A convenience representation (or proxy) encapsulating the data needed during the effectuation of an advice.
 *
 * @see lu.uni.geko.weaver.scope.AdviceInstantiationScope AdviceInstantiationScope
 *
 * @author Max E. Kramer
 */
public interface AdviceEffectuation {
   /**
    * Returns a set containing all entries that represent base elements that have to be merged with advice elements (in this
    * order).
    *
    * @return a set containing all base-advice merge entries
    */
   Set<Entry<Set<EObject>, Set<EObject>>> getBase2AvMergeEntries();

   /**
    * Adds an entry representing that the given base element has to be merged with the given advice element.
    *
    * @param baseElement
    *           a base element
    * @param avElement
    *           an advice element
    */
   void addBase2AvMerge(EObject baseElement, EObject avElement);

   /**
    * Removes the entry representing that the given base element has to be merged with the given advice element.
    *
    * @param baseElement
    *           a base element
    * @param avElement
    *           an advice element
    */
   void removeBase2AvMerge(EObject baseElement, EObject avElement);

   /**
    * Returns a set containing all advice elements that have to be merged with the given base element.
    *
    * @param baseElement
    *           a base element
    * @return all advice elements to be merged with the given base element
    */
   Set<EObject> getAllAvElementsToMerge(EObject baseElement);

   /**
    * Returns a set containing all base elements that have to be merged with the given advice element.
    *
    * @param avElement
    *           an advice element
    * @return all base elements to be merged with the given advice element
    */
   Set<EObject> getAllBaseElementsToMerge(EObject avElement);

   /**
    * Returns whether the given base element has to be merged with any advice element.
    *
    * @param baseElement
    *           a base element
    * @return {@code true} if the given base element has to be merged with at least one advice element and {@code false} otherwise
    */
   boolean toMergeWithAnAvElement(EObject baseElement);

   /**
    * Returns whether the given base element has to be merged with the given advice element.
    *
    * @param baseElement
    *           a base element
    * @param avElement
    *           an advice element
    * @return {@code true} if the given base element has to be merged with the given advice element and {@code false} otherwise
    */
   boolean toMergeWithThisAvElement(EObject baseElement, EObject avElement);

   /**
    * Registers the given advice element as already added so that it has not to be added in the rest of this effectuation and
    * returns whether the given advice element was registered for addition.
    *
    * @param avElement
    *           an advice element
    * @return {@code true} when the given advice element was registered for addition and {@code false} otherwise
    */
   boolean registerAddedAvElement(EObject avElement);

   /**
    * Registers the given advice elements as already added so that they do not have to be added in the rest of this effectuation.
    *
    * @param avElements
    *           a collection of advice elements
    */
   void registerAddedAvElements(Collection<EObject> avElements);

   /**
    * Returns whether all advice elements have been added during this advice effectuation.
    *
    * @return {@code true} if all all advice elements have been added and {@code false} otherwise
    */
   boolean allAvElementsAdded();

   /**
    * Returns a set containing all remaining advice elements that still have to be added during this effectuation.
    *
    * @return all remaining advice elements that still have to be added
    */
   Set<EObject> getRemainingAvElementsToAdd();

   /**
    * Returns a set containing all base elements that have to be removed during this effectuation.
    *
    * @return all base elements that have to be removed
    */
   Set<EObject> getBaseElementsToRemove();
}
