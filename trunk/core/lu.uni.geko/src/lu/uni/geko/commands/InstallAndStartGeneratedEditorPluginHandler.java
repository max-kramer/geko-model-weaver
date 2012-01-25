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

import java.util.Collections;
import java.util.List;

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * A handler for the command that installs and starts the editor plugin that was created for the metamodel at the given URI.
 *
 * @author Max E. Kramer
 */
public class InstallAndStartGeneratedEditorPluginHandler extends AbstractFileHandler {
   @Override
   protected int getTypeCount() {
      return 1;
   }

   @Override
   protected int getTypeNoIfSelectable(final IFile iFile) {
      return (iFile.getFileExtension().equals(GeKoConstants.GENMODEL_FILE_EXT) ? 0 : -1);
   }

   // RATIONALE MK avoid problems with plug-in state changes in different threads by starting all plug-ins stepwise
   @Override
   protected List<Runnable> getRunnables(final List<List<URI>> uris) {
      if (uris.size() == 1) {
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
               for (URI uri : uris.get(0)) {
                  ActionsFacade.installAndStartGeneratedEditorPlugin(uri);
               }
               SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME).confirm(
                     "Sorry but up to now you have to perform a last manual step to use the weaving functionality:\n"
                           + "Open the MANIFEST.MF of the plug-in lu.uni.geko.joinpointdetection.drools,\n"
                           + "add your generated model code plug-in to the required bundles\n"
                           + "and add its packages to the imported packages.\n" + "We apologize for the inconvenience.");
            }
         };
         return Collections.singletonList(runnable);
      } else {
         throw new RuntimeException(this.getClass().getName() + " cannot handle files of different type!");
      }
   }
}
