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
package lu.uni.geko.weaver.pc2avmap;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

import lu.uni.geko.util.adapters.EclipseAdapter;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.datastructures.Triple;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Max E. Kramer
 */
public class MainUIDCalculator {
   public static Triple<String, UIDCalculatorExt, Object> calculatePcElementUID(final EObject eObject) {
      List<UIDCalculatorExt> uIDCalculators = EclipseAdapter.getRegisteredExecutablesInDescPriority(UIDCalculatorExt.ID, "class", UIDCalculatorExt.class);

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
               return finalCurrentUIDCalculator.calculatePcElementUID(eObject, finalCurrentUID);
            }
         };
         Pair<String, Object> uIDAndHelper = EclipseAdapter.callInProtectedMode(callable);
         currentUID = uIDAndHelper.first;
         currentUIDHelper = uIDAndHelper.second;
      }
      if (currentUIDCalculator == null) {
         throw new RuntimeException("No extension for extension point '" + UIDCalculatorExt.ID + "' registered!");
      }
      return new Triple<String, UIDCalculatorExt, Object>(currentUID, currentUIDCalculator, currentUIDHelper);
   }
}
