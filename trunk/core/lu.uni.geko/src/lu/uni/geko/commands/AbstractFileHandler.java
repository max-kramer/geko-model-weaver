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

import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.adapters.EclipseAdapter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.StructuredSelection;

/**
 * An abstract handler for commands that discriminate selected files based on their type and create a {@link java.lang.Runnable}
 * for the selected files.
 *
 * @author Max E. Kramer
 */
public abstract class AbstractFileHandler extends AbstractHandler {
   /**
    * Returns the number of distinct file types that are used to handle a command.
    *
    * @return number of distinct file types
    */
   protected abstract int getTypeCount();

   /**
    * Returns a type number between 0 (including) and the result of getTypeCount() (excluding) if this file should be selectable
    * and -1 otherwise.
    *
    * @param iFile
    *           a selected file
    * @return the type number for the given file
    */
   protected abstract int getTypeNoIfSelectable(IFile iFile);

   /**
    * Returns a list of runnables that handler the current selection of files based on their file types.
    *
    * @param uris
    *           a list containing a list of URIs for each file type
    * @return a list of runnables handling the selected file URIs of different type
    */
   protected abstract List<Runnable> getRunnables(List<List<URI>> uris);

   @Override
   public Object execute(final ExecutionEvent event) throws ExecutionException {
      List<List<URI>> selectedFileURIs = getSelectedFileURIs(event);
      for (Runnable runnable : getRunnables(selectedFileURIs)) {
         new Thread(runnable).start();
      }
      return null;
   }

   /**
    * Returns a list containing lists of URIs that contain the selected files that correspond to each file type.
    *
    * @param event
    *           the execution event
    * @return a list containing a list of URIs for each file type
    */
   public List<List<URI>> getSelectedFileURIs(final ExecutionEvent event) {
      StructuredSelection structuredSelection = EclipseAdapter.getCurrentStructuredSelection(event);
      List<List<URI>> selectedFileURIs = new ArrayList<List<URI>>();
      for (int type = 0; type < getTypeCount(); type++) {
         selectedFileURIs.add(new ArrayList<URI>());
      }
      for (Object selectedElement : structuredSelection.toArray()) {
         if (selectedElement instanceof IFile) {
            IFile selectedFile = ((IFile) selectedElement);
            int type = getTypeNoIfSelectable(selectedFile);
            if (type >= 0 && type < getTypeCount()) {
               if (selectedFile.exists()) {
                  URI selectedURI = EMFAdapter.getEMFUriForIResource(selectedFile);
                  selectedFileURIs.get(type).add(selectedURI);
               }
            }
         }
      }
      return selectedFileURIs;
   }
}
