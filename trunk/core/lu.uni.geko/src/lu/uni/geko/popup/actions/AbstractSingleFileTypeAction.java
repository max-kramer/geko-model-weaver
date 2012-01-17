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
package lu.uni.geko.popup.actions;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

public abstract class AbstractSingleFileTypeAction extends AbstractFilesAction {
	protected abstract Runnable getRunnable(URI uri);

	protected abstract boolean isSelectableFile(IFile iFile);

	@Override
	protected int getTypeCount() {
		return 1;
	}

	@Override
	protected int getTypeNoIfSelectable(IFile iFile) {
		return (isSelectableFile(iFile) ? 0 : -1);
	}

	@Override
	protected List<Runnable> getRunnables(List<List<URI>> uris) {
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
