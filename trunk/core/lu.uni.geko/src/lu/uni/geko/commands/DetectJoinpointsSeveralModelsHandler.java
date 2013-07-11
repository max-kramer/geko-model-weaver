/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Flavie Roussy - adapted from DetectJoinpointsHandler
 ******************************************************************************/
package lu.uni.geko.commands;

import java.util.ArrayList;
import java.util.List;

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;


/**
 * A handler for the command that detects the joinpoints for the selected pointcut and base model.
 *
 * @author Max E. Kramer
 */
public class DetectJoinpointsSeveralModelsHandler extends AbstractFileHandler {
   /** base model file type ID. */
   private static final int BASE_FILE_TYPE = 0;
   /** pointcut model file type ID. */
   private static final int PC_FILE_TYPE = 1;
   /** number of distinct file types. */
   private static final int TYPE_COUNT = 2;

   @Override
   protected int getTypeCount() {
      return TYPE_COUNT;
   }

   @Override
   protected int getTypeNoIfSelectable(final IFile iFile) {
      String fileExt = iFile.getFileExtension();
      if (fileExt.endsWith(GeKoConstants.getPcFileExtSuffix())) {
         return PC_FILE_TYPE;
      } else {
         // TODO MK exclude files that are not base files for the selected pointcuts (e.g. based on the file extension or by
         // looking at the mm referenced in the file)
         return BASE_FILE_TYPE;
      }
   }

   @Override
   protected List<Runnable> getRunnables(final List<List<URI>> uris) {
      if (uris.size() == getTypeCount()) {
         final List<URI> baseMURIs = uris.get(BASE_FILE_TYPE);
         List<URI> pcMURIs = uris.get(PC_FILE_TYPE);
         List<Runnable> runnables = new ArrayList<Runnable>(baseMURIs.size());
         //for (final URI baseMURI : baseMURIs) {
            if (pcMURIs.size() == 1) {
               final URI pointcutMURI = pcMURIs.get(0);
               Runnable runnable = new Runnable() {
                  @Override
                  public void run() {
                     ActionsFacade.detectJoinpoints(pointcutMURI, baseMURIs);
                  }
               };
               runnables.add(runnable);
            } // MAYDO MK support selecting more than one pointcut for joinpoint detection
         return runnables;
      } else {
         throw new RuntimeException(this.getClass().getName() + " needs base and pointcut files!");
      }
   }
}