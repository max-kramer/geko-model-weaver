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

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import lu.uni.geko.common.AbstractModelTransformer;
import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.datastructures.HashN2NMap;
import lu.uni.geko.util.datastructures.N2NMap;
import lu.uni.geko.util.datastructures.Triple;
import lu.uni.geko.util.tostring.EMFToString;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import Pc2AvMapping.Mapping;
import Pc2AvMapping.MappingEntry;

/**
 * Resolves a mapping from pointcut elements to advice elements by loading, guessing or completing.
 *
 * @author Max E. Kramer
 */
public class Pc2AvMapResolver extends AbstractModelTransformer<N2NMap<EObject, EObject>> {
   /** The URI of the advice model. */
   private final URI adviceMURI;
   /** The URI of the pointcut to advice mapping model (if existing). */
   private final URI pc2AvMappingMURI;

   /**
    * Creates a new Pc2AvMapResolver using the given pointcut, advice and mapping model URIs.
    *
    * @param pointcutMURI
    *           the URI of a pointcut model
    * @param adviceMURI
    *           the URI of an advice model
    * @param pc2AvMappingMURI
    *           the URI of a pointcut to advice mapping model
    */
   public Pc2AvMapResolver(final URI pointcutMURI, final URI adviceMURI, final URI pc2AvMappingMURI) {
      super(pointcutMURI);
      this.adviceMURI = adviceMURI;
      this.pc2AvMappingMURI = pc2AvMappingMURI;
   }

   /**
    * Creates a new Pc2AvMapResolver using the given pointcut and advice model URIs.
    *
    * @param pointcutMURI
    *           the URI of a pointcut model
    * @param adviceMURI
    *           the URI of an advice model
    */
   public Pc2AvMapResolver(final URI pointcutMURI, final URI adviceMURI) {
      this(pointcutMURI, adviceMURI, null);
   }

   @Override
   public N2NMap<EObject, EObject> transform() {
      N2NMap<EObject, EObject> pc2AvN2NMap;
      if (this.pc2AvMappingMURI == null) {
         pc2AvN2NMap = guessPc2AvMapping();
         letUserCompleteMap(pc2AvN2NMap);
      } else {
         pc2AvN2NMap = loadPc2AvMapping();
         completeMappingByGuessing(pc2AvN2NMap);
      }
      boolean doContinue = getConsole().confirm(
            "\nThis is the mapping from pointcut to advice that will be used:\n" + pc2AvN2NMap
                  + "\n\nDo you want to continue with this mapping?");
      if (doContinue) {
         return pc2AvN2NMap;
      } else {
         return null;
      }
   }

   /**
    * Guesses and returns a mapping from pointcut elements to advice elements using the models of this resolver.
    *
    * @return the n-to-n mapping from pointcut elements to advice elements
    */
   private N2NMap<EObject, EObject> guessPc2AvMapping() {
      Set<EObject> pointcutElements = GeKoBridge.getUnspecificPcElements(this.getMURI());
      Set<EObject> adviceElements = GeKoBridge.getUnspecificAvElements(this.adviceMURI);
      return guessPc2AvMap(pointcutElements, adviceElements);
   }

   /**
    * Guesses and returns a mapping from pointcut elements to advice elements using the given pointcut and advice elements.
    *
    * @param pcElements
    *           a set of pointcut elements
    * @param avElements
    *           a set of advice elements
    * @return the n-to-n mapping from pointcut elements to advice elements
    */
   private N2NMap<EObject, EObject> guessPc2AvMap(final Set<EObject> pcElements, final Set<EObject> avElements) {
      N2NMap<EObject, EObject> pc2AvN2NMap = new HashN2NMap<EObject, EObject>();
      guessPc2AvMapUsingExistingMap(pc2AvN2NMap, pcElements, avElements);
      return pc2AvN2NMap;
   }

   /**
    * Guesses a mapping from pointcut elements to advice elements using the given pointcut and advice elements and stores the
    * mapping entries in the given N2NMap.
    *
    * @param pc2AvN2NMap
    *           a n-to-n map into which the mapping from pointcut to advice elements should be stored
    * @param pcElements
    *           a set of pointcut elements
    * @param avElements
    *           a set of advice elements
    */
   private void guessPc2AvMapUsingExistingMap(final N2NMap<EObject, EObject> pc2AvN2NMap, final Set<EObject> pcElements,
         final Set<EObject> avElements) {
      for (EObject pcElement : pcElements) {
         EObject unambiguousMatch = guessMappingForPcElement(pcElement, avElements);
         if (unambiguousMatch != null) {
            pc2AvN2NMap.put(pcElement, unambiguousMatch);
         }
      }
      Set<EObject> mappedPointcutElements = pc2AvN2NMap.keySet();
      int notMappedCount = pcElements.size() - mappedPointcutElements.size();
      if (notMappedCount > 0) {
         getConsole().println(
               "Warning: " + notMappedCount + " elements of the pointcut are not mapped to any advice elements!\n");
         for (EObject pointcutElement : pcElements) {
            if (!mappedPointcutElements.contains(pointcutElement)) {
               getConsole().println(EMFToString.getInstance().toString(pointcutElement));
            }
         }
      }
   }

   /**
    * Guesses the mapping for the given pointcut element using the given advice elements and returns the unambiguously matched
    * advice element (if existing and {@code null} otherwise). The matching is performed using the registered extensions for the
    * extension point {@link UIDCalculatorExt lu.uni.geko.mapping.uidcalculatorext}.
    *
    * @param pcElement
    *           a pointcut element
    * @param avElements
    *           a set of advice elements
    * @return the advice element that unambiguously matches the given pointcut element (if existing and {@code null} otherwise)
    *
    * @see UIDCalculatorExt
    */
   private EObject guessMappingForPcElement(final EObject pcElement, final Set<EObject> avElements) {
      Triple<String, UIDCalculatorExt, Object> uIDAndCalculatorAndHelper = MainUIDCalculator.calculatePcElementUID(pcElement);
      String pcElementUID = uIDAndCalculatorAndHelper.getFirst();
      UIDCalculatorExt uIDCalculator = uIDAndCalculatorAndHelper.getSecond();
      Object uIDHelper = uIDAndCalculatorAndHelper.getThird();

      // RATIONALE MK we do not exclude the empty String "" as it might be a valid unique identifier
      // we only want to exclude the cases in which we were unable to calculate a unique identifier
      if (pcElementUID != null) {
         Collection<EObject> potentiallyCorrespondingAvElements = uIDCalculator.getPotentiallyCorrespondingAvElements(
               avElements, pcElement);
         EObject unambiguousMatch = null;
         boolean ambiguous = false;
         for (EObject avElement : potentiallyCorrespondingAvElements) {
            if (uIDCalculator.isCorresponding(avElement, pcElementUID, uIDHelper)) {
               if (unambiguousMatch == null) {
                  unambiguousMatch = avElement;
               } else {
                  ambiguous = true;
               }
            }
         }
         if (!ambiguous) {
            return unambiguousMatch;
         }
      }
      return null;
   }

   /**
    * Loads and returns the mapping from pointcut elements to advice elements using the URI of this resolver.
    *
    * @return the n-to-n mapping from pointcut elements to advice elements
    */
   private N2NMap<EObject, EObject> loadPc2AvMapping() {
      Mapping mapping = MainResourceLoader.getUniqueContentRootIfCorrectlyTyped(this.pc2AvMappingMURI,
            "pointcut to advice mapping model", Mapping.class);
      N2NMap<EObject, EObject> pc2AvN2NMap = new HashN2NMap<EObject, EObject>(mapping.getEntries().size());
      for (MappingEntry mappingEntry : mapping.getEntries()) {
         List<EObject> sources = mappingEntry.getSource();
         List<EObject> targets = mappingEntry.getTarget();
         if (sources != null && sources.size() > 0 && targets != null && targets.size() > 0) {
            Set<EObject> sourcesSet = new HashSet<EObject>(sources);
            Set<EObject> targetsSet = new HashSet<EObject>(targets);
            pc2AvN2NMap.put(sourcesSet, targetsSet);
         } else {
            getConsole().printErrorln(
                  "A mapping entry of the pointcut to advice mapping model has to"
                        + " map at least one EObject to at least one EObject!");
         }
      }
      return pc2AvN2NMap;
   }

   /**
    * Completes the given mapping from pointcut elements to advice elements by guessing mapping entries for all pointcut and
    * advice elements that have not been mapped so far.
    *
    * @param pc2AvN2NMap
    *           the n-to-n map which contains the mapping from pointcut to advice elements that should be completed
    */
   private void completeMappingByGuessing(final N2NMap<EObject, EObject> pc2AvN2NMap) {
      Set<EObject> pointcutElements = GeKoBridge.getUnspecificPcElements(this.getMURI());
      Set<EObject> adviceElements = GeKoBridge.getUnspecificAvElements(this.adviceMURI);
      for (Entry<Set<EObject>, Set<EObject>> n2NMapEntry : pc2AvN2NMap.entrySet()) {
         Set<EObject> mappedPcElements = n2NMapEntry.getKey();
         pointcutElements.removeAll(mappedPcElements);
         Set<EObject> mappedAvElements = n2NMapEntry.getValue();
         adviceElements.removeAll(mappedAvElements);
      }
      guessPc2AvMapUsingExistingMap(pc2AvN2NMap, pointcutElements, adviceElements);
   }

   /**
    * Lets the user complete the given mapping from pointcut elements to advice elements. CURRENTLY NOT WORKING.
    *
    * @param pc2AvN2NMap
    *           the n-to-n map which contains the mapping from pointcut to advice elements that should be completed
    */
   private void letUserCompleteMap(final N2NMap<EObject, EObject> pc2AvN2NMap) {
      // TODO MK implement a way that let's a user complete a guessed mapping
   }
}
