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

import lu.uni.geko.util.adapters.EMFAdapter;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;

public abstract class AbstractFilesAction extends AbstractAction {
	private List<List<URI>> selectedFileURIs;

	protected abstract int getTypeCount();
	
	/**
	 * returns a type number between 0 (including) and the result of getTypeCount() (excluding) if this file should be selectable and -1 otherwise
	 */
	protected abstract int getTypeNoIfSelectable(IFile iFile);
	
	protected abstract List<Runnable> getRunnables(List<List<URI>> uris);
	
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		try {
			for (Runnable runnable : getRunnables(getSelectedFileURIs())) {
				new Thread(runnable).start();
			}
		} catch (Throwable e) {
			// swallow
			e.printStackTrace();
		}
	}	

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;
			if (structuredSelection.size() >= 1) {
				this.selectedFileURIs = new ArrayList<List<URI>>();
				for (int type = 0; type < getTypeCount(); type++) {
					this.selectedFileURIs.add(new ArrayList<URI>());
				}
				for (Object selectedElement : structuredSelection.toArray()) {
					if (selectedElement instanceof IFile) {
						IFile selectedFile = ((IFile) selectedElement);
						int type = getTypeNoIfSelectable(selectedFile);
						if (type >= 0 && type < getTypeCount()) {
							if (selectedFile.exists()) {
								URI selectedURI = EMFAdapter.getEMFUriForIResource(selectedFile);
								this.selectedFileURIs.get(type).add(selectedURI);
							}
						}
					}
				}
			}
		}
	}

	public List<List<URI>> getSelectedFileURIs() {
		return selectedFileURIs;
	}
}
