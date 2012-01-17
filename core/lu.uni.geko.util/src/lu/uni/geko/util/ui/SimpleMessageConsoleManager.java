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
package lu.uni.geko.util.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;

public class SimpleMessageConsoleManager {
	private static final Map<String, SimpleMessageConsole> name2SimpleMessageConsoleMap  = new HashMap<String, SimpleMessageConsole>();
	
	public static SimpleMessageConsole getConsole(String name, String title, Shell shell) {
		SimpleMessageConsole simpleMessageConsole = name2SimpleMessageConsoleMap.get(name);
		if (simpleMessageConsole == null) {
			simpleMessageConsole = new SimpleMessageConsole(name, title, shell);
			ConsolePlugin consolePlugin = ConsolePlugin.getDefault();
			IConsoleManager consoleManager = consolePlugin.getConsoleManager();
			consoleManager.addConsoles(new IConsole[] { simpleMessageConsole.messageConsole });
			name2SimpleMessageConsoleMap.put(name, simpleMessageConsole);
		}
		return simpleMessageConsole;
	}
	
	public static SimpleMessageConsole getConsole(String name) {
		return getConsole(name, "", null);
	}
	
	public static void showConsoleView(SimpleMessageConsole simpleMessageConsole) {
		ConsolePlugin.getDefault().getConsoleManager().showConsoleView(simpleMessageConsole.messageConsole);
	}
}
