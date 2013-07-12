/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Flavie Roussy - adapted from WeaveInferringPc2AvMappingHandler
 ******************************************************************************/
package lu.uni.geko.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

//begin update version 0.2

/**
 * A handler for the command that weaves the selected base, pointcut and advice models to a new woven model by inferring the
 * mapping from pointcut to advice.
 *
 * @author Max E. Kramer
 */
public class WeaveSeveralModelsInferringPc2AvMappingHandler extends AbstractFileHandler {
   /** base model file type ID. */
   private static final int BASE_FILE_TYPE = 0;
   /** pointcut model file type ID. */
   private static final int PC_FILE_TYPE = 1;
   /** advice model file type ID. */
   private static final int ADVICE_FILE_TYPE = 2;
   /** number of distinct file types. */
   private static final int TYPE_COUNT = 3;

   @Override
   protected int getTypeCount() {
      return TYPE_COUNT;
   }

   @Override
   protected int getTypeNoIfSelectable(final IFile iFile) {
      String fileExt = iFile.getFileExtension();
      if (fileExt.endsWith(GeKoConstants.getPcFileExtSuffix())) {
         return PC_FILE_TYPE;
      } else if (fileExt.endsWith(GeKoConstants.getAvFileExtSuffix())) {
         return ADVICE_FILE_TYPE;
      } else {
         // TODO MK exclude files that are not base files for the selected pointcuts (e.g. based on the file extension or by
         // looking at the mm referenced in the file)
         return BASE_FILE_TYPE;
      }
   }

   @Override
   protected List<Runnable> getRunnables(final List<List<URI>> uris) {
      if (uris.size() == getTypeCount()) {
         List<URI> baseMURIs = uris.get(BASE_FILE_TYPE);
         List<URI> pcMURIs = uris.get(PC_FILE_TYPE);
         List<URI> adviceMURIs = uris.get(ADVICE_FILE_TYPE);
         List<Runnable> runnables = new ArrayList<Runnable>(baseMURIs.size());
         // for (final URI baseMURI : baseMURIs) {
            if (pcMURIs.size() == 1 && adviceMURIs.size() == 1) {
               final URI pointcutMURI = pcMURIs.get(0);
               final URI adviceMURI = adviceMURIs.get(0);
               Runnable runnable = getRunnable(baseMURIs, pointcutMURI, adviceMURI, uris);
               runnables.add(runnable);
            //} // MAYDO MK support selecting more than one pointcut and
              // advice for asymmetric weaving
         }
         return runnables;
      } else {
         throw new RuntimeException(this.getClass().getName() + " needs base, pointcut and advice files!");
      }
   }

   /**
    * Returns a runnable handling the files at the given URIs.
    *
    * @param baseMURI
    *           base model URI
    * @param pointcutMURI
    *           pointcut model URI
    * @param adviceMURI
    *           advice model URI
    * @param uris
    *           all selected URIs
    * @return a runnable handling the given files
    */
   protected Runnable getRunnable(final List<URI> baseMURIs, final URI pointcutMURI, final URI adviceMURI, final List<List<URI>> uris) {
      return new Runnable() {
         @Override
         public void run() {
            ActionsFacade.weaveSeveralModelsInferringPc2AvMapping(baseMURIs, pointcutMURI, adviceMURI, false);
         }
      };
   }
}