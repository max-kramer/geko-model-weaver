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

import lu.uni.geko.util.bridges.EclipseBridge;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.StructuredSelection;

/**
 * An abstract handler for commands that only take selected folders into account.
 *
 * @author Max E. Kramer
 */
public abstract class AbstractFolderHandler extends AbstractHandler {
   /**
    * Returns a list of runnables for the list of folders corresponding to the selection.
    *
    * @param folders
    *           a list of selected folders
    * @return a list of runnables handling the selected folders
    */
   protected abstract List<Runnable> getRunnables(List<IFolder> folders);

   @Override
   public final Object execute(final ExecutionEvent event) throws ExecutionException {
      List<IFolder> selectedFolders = getSelectedFolders(event);
      for (Runnable runnable : getRunnables(selectedFolders)) {
         new Thread(runnable).start();
      }
      return null;
   }

   /**
    * Returns a list containing all the selected folders.
    *
    * @param event
    *           execution event
    * @return list of folders
    */
   public final List<IFolder> getSelectedFolders(final ExecutionEvent event) {
      StructuredSelection structuredSelection = EclipseBridge.getCurrentStructuredSelection(event);
      List<IFolder> selectedFolders = new ArrayList<IFolder>();
      for (Object selectedElement : structuredSelection.toArray()) {
         if (selectedElement instanceof IFolder) {
            IFolder selectedFolder = ((IFolder) selectedElement);
            if (selectedFolder.exists()) {
               selectedFolders.add(selectedFolder);
            }
         }
      }
      return selectedFolders;
   }
}
