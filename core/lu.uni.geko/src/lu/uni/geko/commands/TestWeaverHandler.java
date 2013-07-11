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
package lu.uni.geko.commands;

import java.util.ArrayList;
import java.util.List;

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.test.Tester;
import lu.uni.geko.util.bridges.EMFBridge;
import lu.uni.geko.util.datastructures.Quintuple;

import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;

/**
 * A handler for the command that compares the weaving result to the woven archetype in all selected folders.
 *
 * @author Max E. Kramer
 */
public class TestWeaverHandler extends AbstractFolderHandler {
   /** the overall number of repetitions to be performed for each test case. */
   private static final int TEST_COUNT = 42;

   @Override
   protected List<Runnable> getRunnables(final List<IFolder> folders) {
      List<Runnable> runnables = new ArrayList<Runnable>(folders.size());
      for (final IFolder folder : folders) {
         runnables.add(new Runnable() {
            @Override
            public void run() {
               for (int i = 0; i < TEST_COUNT; i++) {
                  Quintuple<List<URI>, URI, URI, URI, URI> modelURIs = Tester.getModelURIsFromFolder(folder);
                  List<URI> baseMURIs = modelURIs.getFirst();
                  URI pointcutMURI = modelURIs.getSecond();
                  URI adviceMURI = modelURIs.getThird();
                  URI pc2AvMappingMURI = modelURIs.getFourth();
                  URI wovenArchetypeMURI = modelURIs.getFifth();
                  URI wovenMURI;
                  if (pc2AvMappingMURI == null) {
                	  if(baseMURIs.size()>1){
                		  wovenMURI = ActionsFacade.weaveSeveralModelsInferringPc2AvMapping(baseMURIs, pointcutMURI, adviceMURI, false);
                	  }
                	  else {
                		  wovenMURI = ActionsFacade.weaveInferringPc2AvMapping(baseMURIs.get(0), pointcutMURI, adviceMURI, false);
                	  }
                     
                  } else {
                	  if(baseMURIs.size()>1){
                		  wovenMURI = ActionsFacade.weaveSeveralModelsWithPc2AvMappingModel(baseMURIs, pointcutMURI, adviceMURI, pc2AvMappingMURI, false);
                	  }
                	  else {
                     wovenMURI = ActionsFacade
                           .weaveWithPc2AvMappingModel(baseMURIs.get(0), pointcutMURI, adviceMURI, pc2AvMappingMURI, false);
                	  }
                  }
                  
                  //get the _ToWeave model to store a right woven model
                  int baseModelPosition = 0;
                  for (URI tmp : baseMURIs) {
      				if (tmp.toString().indexOf("_ToWeave") != -1)
      				{
      					baseModelPosition = baseMURIs.indexOf(tmp);
      				}
      			}
                  wovenMURI = EMFBridge.newURIWithStringAppendedToFilename(baseMURIs.get(baseModelPosition),
                        GeKoConstants.getWovenMFilenameAppendage());
                  Tester.assertWovenMRootEqualsWovenArchetypeMRoot(wovenMURI, wovenArchetypeMURI);
               }
            }
         });
      }
      return runnables;
   }
}
