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
package lu.uni.geko.mmtransformer;

import java.util.List;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.util.bridges.EclipseBridge;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;

/**
 * A utility class to access the functionality provided by extensions of the GenModelModifier extension point.
 *
 * @see GenModelModifierExt
 */
public final class MainGenModelModifier {
   /** Utility classes should not have a public or default constructor. */
   private MainGenModelModifier() {
   }

   /**
    * Modifies the generator model generated from the metamodel for a base, pointcut or advice metamodel.
    *
    * @param genModel
    *           the generator model to be modified in-place
    * @param mmURI
    *           the URI of the metamodel for which the generator was created
    */
   public static void modifyGenModelForMMURI(final GenModel genModel, final URI mmURI) {
      List<GenModelModifierExt> genModelModifiers = GeKoBridge.getRegisteredExtensionsInDescPriority(GenModelModifierExt.ID,
            GenModelModifierExt.class);

      for (final GenModelModifierExt genModelModifier : genModelModifiers) {
         Runnable runnable = new Runnable() {
            @Override
            public void run() {
               genModelModifier.modifyGenModelForMMURI(genModel, mmURI);
            }
         };
         EclipseBridge.runInProtectedMode(runnable);
      }
   }
}
