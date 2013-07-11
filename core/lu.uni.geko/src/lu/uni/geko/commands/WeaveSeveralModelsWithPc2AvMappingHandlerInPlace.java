<<<<<<< .mine
/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Flavie Roussy - adapted from WeaveWithPc2AvMappingHandler
 ******************************************************************************/
package lu.uni.geko.commands;

import java.util.List;

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;


/**
 * A handler for the command that .
 *
 * @author Max E. Kramer
 */
public class WeaveSeveralModelsWithPc2AvMappingHandlerInPlace extends WeaveSeveralModelsInferringPc2AvMappingHandler {
   /** pointcut to advice mapping model file type. */
   private static final int PC2AVMAPPING_FILE_TYPE = 3;
   /** number of distinct file types. */
   private static final int TYPE_COUNT = 4;

   @Override
   protected int getTypeCount() {
      return TYPE_COUNT;
   }

   @Override
   protected int getTypeNoIfSelectable(final IFile iFile) {
      String fileExt = iFile.getFileExtension();
      if (fileExt.equals(GeKoConstants.getPc2AvMappingFileExt())) {
         return PC2AVMAPPING_FILE_TYPE;
      } else {
         return super.getTypeNoIfSelectable(iFile);
      }
   }

   @Override
   protected Runnable getRunnable(final List<URI> baseMURIs, final URI pointcutMURI, final URI adviceMURI, final List<List<URI>> uris) {
      List<URI> pc2AvMappingMURIs = uris.get(PC2AVMAPPING_FILE_TYPE);
      final URI pc2AvMappingMURI = pc2AvMappingMURIs.get(0);
      return new Runnable() {
         @Override
         public void run() {
            ActionsFacade.weaveSeveralModelsWithPc2AvMappingModel(baseMURIs, pointcutMURI, adviceMURI, pc2AvMappingMURI, true);
         }
      };
   }
}

=======
/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Flavie Roussy - adapted from WeaveWithPc2AvMappingHandler
 ******************************************************************************/
package lu.uni.geko.commands;

import java.util.List;

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

//begin update version 0.2

/**
 * A handler for the command that .
 *
 * @author Max E. Kramer
 */
public class WeaveSeveralModelsWithPc2AvMappingHandlerInPlace extends WeaveSeveralModelsInferringPc2AvMappingHandler {
   /** pointcut to advice mapping model file type. */
   private static final int PC2AVMAPPING_FILE_TYPE = 3;
   /** number of distinct file types. */
   private static final int TYPE_COUNT = 4;

   @Override
   protected int getTypeCount() {
      return TYPE_COUNT;
   }

   @Override
   protected int getTypeNoIfSelectable(final IFile iFile) {
      String fileExt = iFile.getFileExtension();
      if (fileExt.equals(GeKoConstants.getPc2AvMappingFileExt())) {
         return PC2AVMAPPING_FILE_TYPE;
      } else {
         return super.getTypeNoIfSelectable(iFile);
      }
   }

   @Override
   protected Runnable getRunnable(final List<URI> baseMURIs, final URI pointcutMURI, final URI adviceMURI, final List<List<URI>> uris) {
      List<URI> pc2AvMappingMURIs = uris.get(PC2AVMAPPING_FILE_TYPE);
      final URI pc2AvMappingMURI = pc2AvMappingMURIs.get(0);
      return new Runnable() {
         @Override
         public void run() {
            ActionsFacade.weaveSeveralModelsWithPc2AvMappingModel(baseMURIs, pointcutMURI, adviceMURI, pc2AvMappingMURI, true);
         }
      };
   }
}

//end update version 0.2
>>>>>>> .r82
