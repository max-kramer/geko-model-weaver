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

/**
 * A utility class to access the functionality provided by extensions of the {@link SimpleAdderExt} and {@link MightyAdderExt}
 * extension points.
 *
 * @see SimpleAdderExt
 * @see MightyAdderExt
 *
 * @author Max E. Kramer
 */
public final class MainAdder {
   /** Utility classes should not have a public or default constructor. */
   private MainAdder() {
   }

   /**
    * Adds the advice elements that have to be added to the woven model at the given woven model URI during the given advice
    * effectuation for the given advice using the given feature equivalence helper. To achieve this all registered extensions for
    * the extension points {@link SimpleAdderExt} and {@link MightyAdderExt} are called in order of decreasing priority (i.e.
    * starting with the extension having the highest integer value priority). Addition attempts for an element are performed until
    * an extension is found that succeeded. This means that if an extension succeeded in adding a new element, no attempt to add
    * it with an an extension with lower priority is performed. Likewise for an element that could not be added using a certain
    * extension, a new attempt for addition is performed using the next extension with lower priority
    *
    * @param advice
    *           an advice
    * @param avEffectuation
    *           an advice effectuation
    * @param featureEquivalenceHelper
    *           a feature equivalence helper
    * @param wovenMURI
    *           the URI of a woven model
    */
   public static void performAdditions(final Advice advice, final AdviceEffectuation avEffectuation,
         final FeatureEquivalenceHelper featureEquivalenceHelper, final URI wovenMURI) {
      List<Pair<SimpleAdderExt, Integer>> simpleAdders = GeKoBridge.getRegisteredExtensionsWithPriority(SimpleAdderExt.ID,
            SimpleAdderExt.class);
      List<Pair<MightyAdderExt, Integer>> mightyAdders = GeKoBridge.getRegisteredExtensionsWithPriority(MightyAdderExt.ID,
            MightyAdderExt.class);

      // wrap all the simple resource loaders in order to make them mighty
      for (Pair<SimpleAdderExt, Integer> simpleAdderPair : simpleAdders) {
         MightyAdderExt mightyAdder = new SimpleAdderWrapper(simpleAdderPair.getFirst());
         mightyAdders.add(new Pair<MightyAdderExt, Integer>(mightyAdder, simpleAdderPair.getSecond()));
      }

      EclipseBridge.sortExtensionsDescByPriority(mightyAdders);

      for (final Pair<MightyAdderExt, Integer> adderPair : mightyAdders) {
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
               adderPair.getFirst().addAvElementsToWovenModel(advice, avEffectuation, featureEquivalenceHelper, wovenMURI);
            }
         };
         EclipseBridge.runInProtectedMode(runnable);
      }
      if (!avEffectuation.allAvElementsAdded()) {
         Set<EObject> remainingAvElementsToAdd = avEffectuation.getRemainingAvElementsToAdd();
         // TODO MK gently handle the case were not all elements could be added by checking in advance if this will happen
         throw new RuntimeException("There are still advice " + remainingAvElementsToAdd.size()
               + " elements that are not contained in any element of the woven model but that do not "
               + "have the type of the unique containment reference that could serve as container for these elements:\n"
               + remainingAvElementsToAdd);
      }
   }
}
