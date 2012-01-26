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

import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import lu.uni.geko.common.GeKoAdapter;
import lu.uni.geko.common.modeltransform.AbstractTransformer;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EMFToStringAdapter;
import lu.uni.geko.util.adapters.JavaAdapter;
import lu.uni.geko.util.datastructures.HashN2NMap;
import lu.uni.geko.util.datastructures.N2NMap;
import lu.uni.geko.util.datastructures.Triple;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import Pc2AvMapping.Mapping;
import Pc2AvMapping.MappingEntry;

public class Pc2AvMapResolver extends AbstractTransformer<N2NMap<EObject, EObject>> {
   private final URI adviceMURI;
   private URI pc2AvMappingMURI; // if the Java compiler would realize that we never assign two times this field would have a
                                 // final modifier

   public Pc2AvMapResolver(URI pointcutMURI, URI adviceMURI) {
      super(pointcutMURI);
      this.adviceMURI = adviceMURI;
   }

   public Pc2AvMapResolver(URI pointcutMURI, URI adviceMURI, URI pc2AvMappingMURI) {
      this(pointcutMURI, adviceMURI);
      this.pc2AvMappingMURI = pc2AvMappingMURI;
   }

   @Override
   public N2NMap<EObject, EObject> generate() {
      N2NMap<EObject, EObject> pc2AvMap;
      if (this.pc2AvMappingMURI == null) {
         pc2AvMap = guessPc2AvMap();
         letUserCompleteMap(pc2AvMap);
      } else {
         pc2AvMap = loadPc2AvMap();
         completeMapByGuessing(pc2AvMap);
      }
      boolean doContinue = console.confirm("\nThis is the mapping from pointcut to advice that will be used:\n" + pc2AvMap
            + "\n\nDo you want to continue with this mapping?");
      if (doContinue) {
         return pc2AvMap;
      } else {
         return null;
      }
   }

   private N2NMap<EObject, EObject> guessPc2AvMap() {
      N2NMap<EObject, EObject> pc2AvMap = new HashN2NMap<EObject, EObject>();
      Set<EObject> pointcutElements = GeKoAdapter.getUnspecificPcElements(this.uri);
      Set<EObject> adviceElements = GeKoAdapter.getUnspecificAvElements(this.adviceMURI);
      return guessPc2AvMap(pc2AvMap, pointcutElements, adviceElements);
   }

   public N2NMap<EObject, EObject> guessPc2AvMap(N2NMap<EObject, EObject> pc2AvMap, Set<EObject> pcElements, Set<EObject> avElements) {
      for (EObject pcElement : pcElements) {
         Triple<String, UIDCalculatorExt, Object> uIDAndCalculatorAndHelper = MainUIDCalculator.calculatePcElementUID(pcElement);
         String pcElementUID = uIDAndCalculatorAndHelper.first;
         UIDCalculatorExt uIDCalculator = uIDAndCalculatorAndHelper.second;
         Object uIDHelper = uIDAndCalculatorAndHelper.third;

         // RATIONALE MK we do not exclude the empty String "" as it might be a valid unique identifier
         // we only want to exclude the cases in which we were unable to calculate a unique identifier
         if (pcElementUID != null) {
            Collection<EObject> potentiallyCorrespondingAvElements = uIDCalculator.getPotentiallyCorrespondingAvElements(avElements, pcElement);
            EObject unambiguousMatch = null;
            boolean ambiguous = false;
            for (EObject avElement : potentiallyCorrespondingAvElements) {
               if (uIDCalculator.isCorresponding(avElement, pcElement, pcElementUID, uIDHelper)) {
                  if (unambiguousMatch == null) {
                     unambiguousMatch = avElement;
                  } else {
                     ambiguous = true;
                  }
               }
            }
            if (!ambiguous && unambiguousMatch != null) {
               pc2AvMap.put(pcElement, unambiguousMatch);
            }
         }
      }
      Set<EObject> mappedPointcutElements = pc2AvMap.keySet();
      int notMappedCount = pcElements.size() - mappedPointcutElements.size();
      if (notMappedCount > 0) {
         console.println("Warning: " + notMappedCount + " elements of the pointcut are not mapped to any advice elements!\n");
         for (EObject pointcutElement : pcElements) {
            if (!mappedPointcutElements.contains(pointcutElement)) {
               console.println(EMFToStringAdapter.INSTANCE.toString(pointcutElement));
            }
         }
      }
      return pc2AvMap;
   }

   private N2NMap<EObject, EObject> loadPc2AvMap() {
      Mapping mapping = MainResourceLoader.getResourceContentRootIfCorrectlyTyped(this.pc2AvMappingMURI,
            "pointcut to advice mapping model", Mapping.class);
      N2NMap<EObject, EObject> pc2AvMap = new HashN2NMap<EObject, EObject>(mapping.getEntries().size());
      for (MappingEntry mappingEntry : mapping.getEntries()) {
         List<EObject> sources = mappingEntry.getSource();
         List<EObject> targets = mappingEntry.getTarget();
         if (sources != null && sources.size() > 0 && targets != null && targets.size() > 0) {
            Set<EObject> sourcesSet = JavaAdapter.toHashSet(sources);
            Set<EObject> targetsSet = JavaAdapter.toHashSet(targets);
            pc2AvMap.put(sourcesSet, targetsSet);
         } else {
            console
                  .printErrorln("A mapping entry of the pointcut to advice mapping model has to map at least one EObject to at least one EObject!");
         }
      }
      return pc2AvMap;
   }

   private void completeMapByGuessing(N2NMap<EObject, EObject> pc2AvMap) {
      Set<EObject> pointcutElements = GeKoAdapter.getUnspecificPcElements(this.uri);
      Set<EObject> adviceElements = GeKoAdapter.getUnspecificAvElements(this.adviceMURI);
      for (Entry<Set<EObject>, Set<EObject>> mappingEntry : pc2AvMap.entrySet()) {
         Set<EObject> mappedPcElements = mappingEntry.getKey();
         pointcutElements.removeAll(mappedPcElements);
         Set<EObject> mappedAvElements = mappingEntry.getValue();
         adviceElements.removeAll(mappedAvElements);
      }
      guessPc2AvMap(pc2AvMap, pointcutElements, adviceElements);
   }

   private void letUserCompleteMap(N2NMap<EObject, EObject> pc2AvMap) {
      // TODO MK implement a way that let's a user complete a guessed mapping
   }
}
