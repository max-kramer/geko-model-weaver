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

import lu.uni.geko.ActionsFacade;

import org.eclipse.emf.common.util.URI;

/**
 * A handler for the command that generates an advice metamodel from the selected base metamodel and registers an editor for it.
 *
 * @author Max E. Kramer
 */
public class GenerateAdviceMMHandler extends AbstractEcoreFilesHandler {

   @Override
   protected final Runnable getRunnable(final URI uri) {
      return new Runnable() {
         @Override
         public void run() {
            ActionsFacade.generateAvMMAndModelCode(uri);
         }
      };
   }
}
