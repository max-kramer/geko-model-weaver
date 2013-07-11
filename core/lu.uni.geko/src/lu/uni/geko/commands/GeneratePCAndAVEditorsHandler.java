/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Flavie Roussy - adapted from GenerateBasePCAndAVEditorsHanlder
 ******************************************************************************/
package lu.uni.geko.commands;

import lu.uni.geko.ActionsFacade;

import org.eclipse.emf.common.util.URI;

//begin update version 0.2

/**
 * A handler for the command that generates a pointcut and an advice metamodel from the selected base metamodel and registers
 * editors for them.
 *
 * @author Max E. Kramer
 */
public class GeneratePCAndAVEditorsHandler extends AbstractEcoreFilesHandler {
   @Override
   protected Runnable getRunnable(final URI uri) {
      return new Runnable() {
         @Override
         public void run() {
            ActionsFacade.generatePcAndAvEditors(uri);
         }
      };
   }
}

//end update version 0.2
