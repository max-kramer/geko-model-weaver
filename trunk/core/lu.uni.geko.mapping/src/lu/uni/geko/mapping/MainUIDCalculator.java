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
package lu.uni.geko.mapping;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.util.bridges.EclipseBridge;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.datastructures.Triple;

import org.eclipse.emf.ecore.EObject;

/**
 * A utility class to access the functionality provided by extensions of the UIDCalculator extension point.
 *
 * @see UIDCalculatorExt
 *
 * @author Max E. Kramer
 */
public final class MainUIDCalculator {
   /** Utility classes should not have a public or default constructor. */
   private MainUIDCalculator() {
   }

   /**
    * Calculates the unique identifier for the given pointcut element. Returns this identifier in a triple together with the
    * calculator that calculated it and a helper that may contain information that was created during the calculation.<br/>
    * <br/>
    * Throws a {@link java.lang.RuntimeException RuntimeException} if no unique identifier calculator extension is registered.
    *
    * @param pcElement
    *           a pointcut element
    * @return a triple containing the unique identifier, the calculator and a helper containing information created during the
    *         calculation
    */
   public static Triple<String, UIDCalculatorExt, Object> calculatePcElementUID(final EObject pcElement) {
      List<UIDCalculatorExt> uIDCalculators = GeKoBridge.getRegisteredExtensionsInDescPriority(UIDCalculatorExt.ID,
            UIDCalculatorExt.class);
      String currentUID = null;
      Iterator<UIDCalculatorExt> uIDCaluclatorIterator = uIDCalculators.iterator();
      UIDCalculatorExt currentUIDCalculator = null;
      Object currentUIDHelper = null;
      while (uIDCaluclatorIterator.hasNext() && currentUID == null) {
         currentUIDCalculator = uIDCaluclatorIterator.next();
         final UIDCalculatorExt finalCurrentUIDCalculator = currentUIDCalculator;
         final String finalCurrentUID = currentUID;
         Callable<Pair<String, Object>> callable = new Callable<Pair<String, Object>>() {
            @Override
            public Pair<String, Object> call() {
               return finalCurrentUIDCalculator.calculatePcElementUID(pcElement, finalCurrentUID);
            }
         };
         Pair<String, Object> uIDAndHelper = EclipseBridge.callInProtectedMode(callable);
         currentUID = uIDAndHelper.getFirst();
         currentUIDHelper = uIDAndHelper.getSecond();
      }
      if (currentUIDCalculator == null) {
         throw new RuntimeException("No extension for extension point '" + UIDCalculatorExt.ID + "' registered!");
      }
      return new Triple<String, UIDCalculatorExt, Object>(currentUID, currentUIDCalculator, currentUIDHelper);
   }
}
