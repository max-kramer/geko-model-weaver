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

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

public class DetectJoinpointsHandler extends AbstractFileHandler {
	private static final int BASE_FILE_TYPE = 0;
	private static final int PC_FILE_TYPE = 1;

	@Override
	protected int getTypeCount() {
		return 2;
	}

	@Override
	protected int getTypeNoIfSelectable(final IFile iFile) {
		String fileExt = iFile.getFileExtension();
		if (fileExt.endsWith(GeKoConstants.POINTCUT_FILE_EXT_SUFFIX)) {
			return PC_FILE_TYPE;
		} else {
			// FIXME MK exclude files that are not base files for the selected pointcuts (e.g. based on the file extension or by looking at the mm referenced in the file)
			return BASE_FILE_TYPE;
		}
	}

	@Override
	protected List<Runnable> getRunnables(final List<List<URI>> uris) {
		if (uris.size() == getTypeCount()) {
			List<URI> baseMURIs = uris.get(BASE_FILE_TYPE);
			List<URI> pcMURIs = uris.get(PC_FILE_TYPE);
			List<Runnable> runnables = new ArrayList<Runnable>(baseMURIs.size());
			for (final URI baseMURI : baseMURIs) {
				if (pcMURIs.size() == 1) {
					final URI pointcutMURI = pcMURIs.get(0);
					Runnable runnable = new Runnable() {	
						@Override
						public void run() {
							ActionsFacade.detectJoinpoints(pointcutMURI, baseMURI);
						}
					};
					runnables.add(runnable);
				} // TODO MK support selecting more than one pointcut for joinpoint detection
			}
			return runnables;
		} else {
			throw new RuntimeException(this.getClass().getName() + " needs base and pointcut files!");
		}
	}
}
