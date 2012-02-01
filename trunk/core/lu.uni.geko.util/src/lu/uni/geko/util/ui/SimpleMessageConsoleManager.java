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

/**
 * A utility class for accessing {@link SimpleMessageConsole SimpleMessageConsoles} by name.
 *
 * @author Max E. Kramer
 */
public final class SimpleMessageConsoleManager {
   /** Utility classes should not have a public or default constructor. */
   private SimpleMessageConsoleManager() {
   }

   /** The mapping from names to simple message consoles. */
   private static final Map<String, SimpleMessageConsole> NAME_2_SIMPLE_MESSAGE_CONSOLE_MAP =
         new HashMap<String, SimpleMessageConsole>();

   /**
    * Returns a console with the given name, title and shell by either reusing an existing one or creating a new one.
    *
    * @param name
    *           a name
    * @param title
    *           a title
    * @param shell
    *           a swt shell
    * @return the console
    */
   public static SimpleMessageConsole getConsole(final String name, final String title, final Shell shell) {
      SimpleMessageConsole simpleMessageConsole = NAME_2_SIMPLE_MESSAGE_CONSOLE_MAP.get(name);
      if (simpleMessageConsole == null) {
         simpleMessageConsole = new SimpleMessageConsole(name, title, shell);
         ConsolePlugin consolePlugin = ConsolePlugin.getDefault();
         IConsoleManager consoleManager = consolePlugin.getConsoleManager();
         consoleManager.addConsoles(new IConsole[] { simpleMessageConsole.getMessageConsole() });
         NAME_2_SIMPLE_MESSAGE_CONSOLE_MAP.put(name, simpleMessageConsole);
      }
      return simpleMessageConsole;
   }

   /**
    * Returns a console with the given name by either reusing an existing one or creating a new one.
    *
    * @param name
    *           a name
    * @return the console
    */
   public static SimpleMessageConsole getConsole(final String name) {
      return getConsole(name, "", null);
   }

   /**
    * Shows the view containing the given message console.
    *
    * @param simpleMessageConsole
    *           a message console
    */
   public static void showConsoleView(final SimpleMessageConsole simpleMessageConsole) {
      ConsolePlugin.getDefault().getConsoleManager().showConsoleView(simpleMessageConsole.getMessageConsole());
   }
}
