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
import lu.uni.geko.util.datastructures.Quintuple;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;

/**
 * A handler for the command that compares the weaving result to the woven archetype in all selected
 * folders.
 * 
 * @author Max E. Kramer
 */
public class TestWeaverHandler extends AbstractFolderHandler {
   /** the overall number of repetitions to be performed for each test case. */
   private static final int TEST_COUNT = 42;

   @Override
   protected final List<Runnable> getRunnables(final List<IFolder> folders) {
      List<Runnable> runnables = new ArrayList<Runnable>(folders.size());
      for (final IFolder folder : folders) {
         runnables.add(new Runnable() {
            @Override
            public void run() {
               Quintuple<URI, URI, URI, URI, URI> modelURIs = Tester.getModelURIsFromFolder(folder);
               URI baseMURI = modelURIs.getFirst();
               URI pointcutMURI = modelURIs.getSecond();
               URI adviceMURI = modelURIs.getThird();
               URI pc2AvMappingMURI = modelURIs.getFourth();
               URI wovenArchetypeMURI = modelURIs.getFifth();
               URI wovenMURI;
               for (int i = 0; i < TEST_COUNT; i++) {
                  if (pc2AvMappingMURI == null) {
                     wovenMURI = ActionsFacade.weaveInferringPc2AvMapping(baseMURI, pointcutMURI, adviceMURI);
                  } else {
                     wovenMURI = ActionsFacade.weaveWithPc2AvMappingModel(baseMURI, pointcutMURI, adviceMURI, pc2AvMappingMURI);
                  }
                  Tester.assertWovenMRootEqualsWovenArchetypeMRoot(wovenMURI, wovenArchetypeMURI);
               }
               String successMessage = "Sucessfully completed all " + TEST_COUNT + " weaver tests in '"
                     + baseMURI.trimSegments(1).lastSegment() + "'.";
               SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName()).println(successMessage);
               System.out.println(successMessage);
            }
         });
      }
      return runnables;
   }
}
