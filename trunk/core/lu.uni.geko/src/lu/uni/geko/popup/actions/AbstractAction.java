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

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public abstract class AbstractAction implements IObjectActionDelegate {
	public AbstractAction() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME, GeKoConstants.CONSOLE_TITLE, targetPart.getSite().getShell());
	}
}
