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

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

/**
 * A handler for the command that generates and displays the pointcut rules that are used to detect joinpoints for the selected
 * pointcut.
 *
 * @author Max E. Kramer
 */
public class GeneratePointcutRulesHandler extends AbstractSingleFileTypeHandler {

   @Override
   protected Runnable getRunnable(final URI uri) {
      return new Runnable() {
         @Override
         public void run() {
            ActionsFacade.generatePointcutRulesAndIDs(uri);
         }
      };
   }

   @Override
   protected boolean isSelectableFile(final IFile iFile) {
      String fileExt = iFile.getFileExtension();
      return fileExt.endsWith(GeKoConstants.POINTCUT_FILE_EXT_SUFFIX);
   }
}
