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

import java.io.IOException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class SimpleMessageConsole {
	// RATIONALE MK hide the MessageConsole so that classes that use SimpleMessageConsole are not forced to depend on org.eclipse.ui.console
	protected final MessageConsole messageConsole;
	private final MessageConsoleStream messageConsoleStream;
	private final Shell shell;
	private final String title;

	protected SimpleMessageConsole(String name, String title, Shell shell) {
		this.messageConsole = new MessageConsole(name, null);
		this.messageConsoleStream = this.messageConsole.newMessageStream();
		this.shell = shell;
		this.title = title;
	}
	
	public void println(String line) {
		print(line + "\n");
	}
	
	public void print(String s) {
		try {
			SimpleMessageConsoleManager.showConsoleView(this);
			messageConsoleStream.print(s);
			messageConsoleStream.flush();
		} catch (IOException e) {
			// swallow
			e.printStackTrace();
		}
	}
	
	public void printErrorln(String line) {
		println("#ERROR# " + line);
	}
	
	public void printWarningln(String line) {
		println("=WARNING= " + line);
	}
	
	public void finalize() throws Throwable {
		super.finalize();
		if ((messageConsoleStream != null) && !(messageConsoleStream.isClosed())) {
			messageConsoleStream.close();
		}
	}
	
	public boolean confirm(String message) {
		// FIXME MK call user-interface methods correctly from non-ui-thread without to much ugly code
		int i = 0;
		if (i == 1) { // instead of commenting out and getting warnings for unused imports
			return MessageDialog.openConfirm(this.shell, this.title, message);
		}
		println(message);
		return true;
	}
}
