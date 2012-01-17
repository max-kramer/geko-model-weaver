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

import lu.uni.geko.util.adapters.EclipseAdapter;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.jface.viewers.StructuredSelection;

public abstract class AbstractFolderHandler extends AbstractHandler {
	protected abstract List<Runnable> getRunnables(List<IFolder> folders);
	
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {
		List<IFolder> selectedFolders = getSelectedFolders(event);
		for (Runnable runnable : getRunnables(selectedFolders)) {
			new Thread(runnable).start();
		}
		return null;
	}
	
	public List<IFolder> getSelectedFolders(final ExecutionEvent event) {
		StructuredSelection structuredSelection = EclipseAdapter.getCurrentStructuredSelection(event);
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
