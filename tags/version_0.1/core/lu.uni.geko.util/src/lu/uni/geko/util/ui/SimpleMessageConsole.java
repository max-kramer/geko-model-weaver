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

/**
 * A simple message console for output to the user wrapping a {@link org.eclipse.ui.console.MessageConsole Eclipse UI
 * MessageConsole}.
 *
 * @author Max E. Kramer
 */
public class SimpleMessageConsole {
   // RATIONALE MK hide the MessageConsole so that classes that use SimpleMessageConsole are not forced to depend on
   // org.eclipse.ui.console
   /** The wrapped message console. */
   private final MessageConsole messageConsole;
   /** The underlying message console stream. */
   private final MessageConsoleStream messageConsoleStream;
   /** The shell for this message console. */
   private final Shell shell;
   /** The titel of this message console. */
   private final String title;

   /**
    * Constructs a new SimpleMessageConsole with the given name, title and shell.
    *
    * @param name
    *           a name
    * @param title
    *           a title
    * @param shell
    *           a swt shell
    */
   protected SimpleMessageConsole(final String name, final String title, final Shell shell) {
      this.messageConsole = new MessageConsole(name, null);
      this.messageConsoleStream = this.getMessageConsole().newMessageStream();
      this.shell = shell;
      this.title = title;
   }

   /**
    * @return the wrapped message console
    */
   protected MessageConsole getMessageConsole() {
      return messageConsole;
   }

   /**
    * Prints the given line to this console, flushes the underlying stream and shows the console view.
    *
    * @param line
    *           the line to print
    */
   public void println(final String line) {
      print(line + "\n");
   }

   /**
    * Prints the given string to this console, flushes the underlying stream and shows the console view.
    *
    * @param s
    *           the string to print
    */
   public void print(final String s) {
      try {
         SimpleMessageConsoleManager.showConsoleView(this);
         messageConsoleStream.print(s);
         messageConsoleStream.flush();
      } catch (IOException e) {
         // swallow
         e.printStackTrace();
      }
   }

   /**
    * Prints the given error line to this console, flushes the underlying stream and shows the console view.
    *
    * @param line
    *           the line to print
    */
   public void printErrorln(final String line) {
      println("#ERROR# " + line);
   }

   /**
    * Prints the given warning line to this console, flushes the underlying stream and shows the console view.
    *
    * @param line
    *           the line to print
    */
   public void printWarningln(final String line) {
      println("=WARNING= " + line);
   }

   @Override
   public void finalize() throws Throwable {
      super.finalize();
      if ((messageConsoleStream != null) && !(messageConsoleStream.isClosed())) {
         messageConsoleStream.close();
      }
   }

   /**
    * Lets the user conform an action using a message dialog with the given message and returns the choice of the user. CURRENTLY
    * NOT WORKING BUT SIMPLY PRINTING AND RETURNING {@code true}.
    *
    * @param message
    *           the message that explains what has to be confirmed
    * @return whether the user confirmed or not
    */
   public boolean confirm(final String message) {
      // FIXME MK call user-interface methods correctly from non-ui-thread without to much ugly code
      int i = 0;
      if (i == 1) { // instead of commenting out and getting warnings for unused imports
         return MessageDialog.openConfirm(this.shell, this.title, message);
      }
      println(message);
      return true;
   }
}
