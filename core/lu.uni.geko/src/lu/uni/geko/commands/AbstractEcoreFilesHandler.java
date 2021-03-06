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

import lu.uni.geko.common.GeKoConstants;

import org.eclipse.core.resources.IFile;

/**
 * An abstract handler for commands that are only available if Ecore metamodels have been selected.
 *
 * @author Max E. Kramer
 */
public abstract class AbstractEcoreFilesHandler extends AbstractSingleFileTypeHandler {
   @Override
   protected boolean isSelectableFile(final IFile iFile) {
      String fileExt = iFile.getFileExtension();
      return fileExt.equals(GeKoConstants.getMMFileExt());
   }
}
