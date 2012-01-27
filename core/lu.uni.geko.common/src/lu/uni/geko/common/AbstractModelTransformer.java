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
package lu.uni.geko.common;

import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.emf.common.util.URI;

/**
 * A convenience abstract class to be extended by clients that transform a model and need a console and a URI.
 *
 * @param <T>
 *           the return type of the transformation
 */
public abstract class AbstractModelTransformer<T> {
   /** The URI of the model to be transformed. */
   private final URI mURI;

   /** Fast access to the console used for displaying information to the user. */
   private final SimpleMessageConsole console;

   public AbstractModelTransformer(final URI mURI) {
      super();
      this.mURI = mURI;
      this.console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
   }

   public abstract T generate();

   /**
    * @return the URI of the model to be transformed.
    */
   protected URI getMUri() {
      return mURI;
   }

   /**
    * @return fast access to the console used for displaying information to the user.
    */
   protected SimpleMessageConsole getConsole() {
      return console;
   }
}
