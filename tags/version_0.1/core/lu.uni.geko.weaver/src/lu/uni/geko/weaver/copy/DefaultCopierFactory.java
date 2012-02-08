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
package lu.uni.geko.weaver.copy;

import java.util.HashMap;
import java.util.Map;

import lu.uni.geko.weaver.Advice;

import org.eclipse.emf.ecore.EObject;

/**
 * The default implementation of the extension point {@link CopierFactoryExt lu.uni.geko.weaver.copy.copierfactoryext} returning a
 * different copier for every new root element of a woven model.
 *
 * @see CopierFactoryExt
 *
 * @author Max E. Kramer
 */
public class DefaultCopierFactory implements CopierFactoryExt {
   /** The mapping from root elements of woven models to copiers. */
   private static final Map<EObject, Copier> ROOT2COPIERMAP = new HashMap<EObject, Copier>();

   @Override
   public Copier getCopier(final EObject rootEObject, final Advice advice) {
      Copier copier = ROOT2COPIERMAP.get(rootEObject);
      if (copier == null) {
         copier = new DefaultCopier(advice);
         ROOT2COPIERMAP.put(rootEObject, copier);
      }
      return copier;
   }
}
