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
package lu.uni.geko.weaver.add;

import java.util.List;
import java.util.Set;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.util.bridges.EclipseBridge;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.AdviceEffectuation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class MainAdder {

   public static void performAdditions(final Advice advice, final AdviceEffectuation adviceEffectuation,
         final FeatureEquivalenceHelper featureEquivalenceHelper, final URI wovenMURI) {
      List<Pair<SimpleAdderExt, Integer>> simpleAdders = GeKoBridge.getRegisteredExtensionsWithPriority(SimpleAdderExt.ID,
            SimpleAdderExt.class);
      List<Pair<MightyAdderExt, Integer>> mightyAdders = GeKoBridge.getRegisteredExtensionsWithPriority(MightyAdderExt.ID,
            MightyAdderExt.class);

      // wrap all the simple resource loaders in order to make them sophisticated
      for (Pair<SimpleAdderExt, Integer> simpleAdderPair : simpleAdders) {
         MightyAdderExt mightyAdder = new SimpleAdderWrapper(simpleAdderPair.getFirst());
         mightyAdders.add(new Pair<MightyAdderExt, Integer>(mightyAdder, simpleAdderPair.getSecond()));
      }

      EclipseBridge.sortExtensionsDescByPriority(mightyAdders);

      for (final Pair<MightyAdderExt, Integer> adderPair : mightyAdders) {
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
               adderPair.getFirst().addAdviceEObjectsToWovenModel(advice, adviceEffectuation, featureEquivalenceHelper,
                     wovenMURI);
            }
         };
         EclipseBridge.runInProtectedMode(runnable);
      }
      if (!adviceEffectuation.allAvElementsAdded()) {
         Set<EObject> remainingAvElementsToAdd = adviceEffectuation.getRemainingAvElementsToAdd();
         // TODO MK gently handle the case were not all elements could be added by checking in advance if this will happen
         throw new RuntimeException(
               "There are still advice "
                     + remainingAvElementsToAdd.size()
                     + " elements that are not contained in any element of the woven model "
                     + "but that do not have the type of the unique containment reference that could serve as container for these elements:\n"
                     + remainingAvElementsToAdd);
      }
   }
}
