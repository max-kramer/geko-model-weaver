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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * An abstract handler for commands that discriminate only between a single file type and create a {@link java.lang.Runnable} for
 * each selected file URI.
 *
 * @author Max E. Kramer
 */
public abstract class AbstractSingleFileTypeHandler extends AbstractFileHandler {
   /**
    * Returns the runnable for the given URI of the selected file.
    *
    * @param uri
    *           the URI of a selected file
    * @return the runnable handling the selected file
    */
   protected abstract Runnable getRunnable(URI uri);

   /**
    * Returns <code>true</code> when the given file should be selectable for this command handler.
    *
    * @param iFile
    *           a file
    * @return whether or not this file is selectable
    */
   protected abstract boolean isSelectableFile(IFile iFile);

   @Override
   protected final int getTypeCount() {
      return 1;
   }

   @Override
   protected final int getTypeNoIfSelectable(final IFile iFile) {
      return (isSelectableFile(iFile) ? 0 : -1);
   }

   @Override
   protected final List<Runnable> getRunnables(final List<List<URI>> uris) {
      if (uris.size() == 1) {
         List<Runnable> runnables = new ArrayList<Runnable>(uris.get(0).size());
         for (URI uri : uris.get(0)) {
            runnables.add(getRunnable(uri));
         }
         return runnables;
      } else {
         throw new RuntimeException(this.getClass().getName() + " cannot handle files of different type!");
      }
   }
}
