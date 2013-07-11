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

import lu.uni.geko.util.datastructures.BiN2NMap;

import org.eclipse.emf.ecore.EObject;

/**
 * An implementation of the convenience representation (or proxy) of an {@link AdviceEffectuation} that encapsulates the data
 * needed during the effectuation of an advice .<br/>
 * <br/>
 * <br/>
 * <b>Attention</b>: The collections returned by this implementation are backed up. Changing the returned collections will change
 * collections of this implementation.
 *
 * @author Max E. Kramer
 */
public class HashMappedAdviceEffectuation implements AdviceEffectuation {
   /** The encapsulated base elements to be removed during this advice effectuation. */
   private final Set<EObject> baseElementsToRemove;
   /** The encapsulated advice elements to be added during this advice effectuation. */
   private final Set<EObject> remainingAvElementsToAdd;
   /**
    * The encapsulated bidirectional mapping from base elements to advice elements that have to be merged with them during this
    * advice effectuation.
    */
   private final BiN2NMap<EObject, EObject> base2AvMergeBiN2NMap;

   /**
    * Creates a new HashMappedAdviceEffectuation using the given base elements to be removed, the given advice elements to be
    * added and the given mapping from base elements to advice elements that have to be merged with them.
    *
    * @param baseElementsToRemove
    *           the base elements to be removed during this advice effectuation
    * @param avElementsToAdd
    *           the advice elements to be added during this advice effectuation
    * @param base2AvMergeBiN2NMap
    *           the bidirectional mapping from base elements to advice elements that have to be merged with them during this
    *           advice effectuation
    */
   public HashMappedAdviceEffectuation(final Set<EObject> baseElementsToRemove, final Set<EObject> avElementsToAdd,
         final BiN2NMap<EObject, EObject> base2AvMergeBiN2NMap) {
      this.baseElementsToRemove = baseElementsToRemove;
      this.remainingAvElementsToAdd = avElementsToAdd;
      this.base2AvMergeBiN2NMap = base2AvMergeBiN2NMap;
   }

   @Override
   public final Set<Entry<Set<EObject>, Set<EObject>>> getBase2AvMergeEntries() {
      return this.base2AvMergeBiN2NMap.entrySet();
   }

   @Override
   public final void addBase2AvMerge(final EObject baseElement, final EObject avElement) {
      this.base2AvMergeBiN2NMap.put(baseElement, avElement);
   }

   @Override
   public final void removeBase2AvMerge(final EObject baseElement, final EObject avElement) {
      this.base2AvMergeBiN2NMap.remove(baseElement, avElement);
   }

   @Override
   public final Set<EObject> getAllAvElementsToMerge(final EObject baseElement) {
      return this.base2AvMergeBiN2NMap.getAllValuesForKey(baseElement);
   }

   @Override
   public final Set<EObject> getAllBaseElementsToMerge(final EObject avElement) {
      return this.base2AvMergeBiN2NMap.getAllKeysForValue(avElement);
   }

   @Override
   public final boolean toMergeWithAnAvElement(final EObject baseElement) {
      return this.base2AvMergeBiN2NMap.containsKey(baseElement);
   }

   @Override
   public final boolean toMergeWithThisAvElement(final EObject baseElement, final EObject avElement) {
      return this.base2AvMergeBiN2NMap.getAllValuesForKey(baseElement).contains(avElement);
   }

   @Override
   public final boolean registerAddedAvElement(final EObject avElement) {
      return this.remainingAvElementsToAdd.remove(avElement);
   }

   @Override
   public final void registerAddedAvElements(final Collection<EObject> avElements) {
      this.remainingAvElementsToAdd.removeAll(avElements);
   }

   @Override
   public final boolean allAvElementsAdded() {
      return this.remainingAvElementsToAdd.isEmpty();
   }

   @Override
   public final Set<EObject> getRemainingAvElementsToAdd() {
      return this.remainingAvElementsToAdd;
   }

   @Override
   public final Set<EObject> getBaseElementsToRemove() {
      return this.baseElementsToRemove;
   }
}
