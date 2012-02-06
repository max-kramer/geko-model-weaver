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
package lu.uni.geko.ext.ifc;

import java.util.HashMap;
import java.util.Map;

import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.copy.Copier;
import lu.uni.geko.weaver.copy.CopierFactoryExt;

import org.eclipse.emf.ecore.EObject;

/**
 * An extension for the extension point {@link lu.uni.geko.weaver.copy.CopierFactoryExt CopierFactoryExt} that provides access to
 * {@link IfcCopier}.
 *
 * @author Max E. Kramer
 */
public class IfcCopierFactory implements CopierFactoryExt {
   /** The mapping from root model elements to IFC copiers. */
   private static final Map<EObject, Copier> ROOT2COPIERMAP = new HashMap<EObject, Copier>();

   @Override
   public Copier getCopier(final EObject rootEObject, final Advice advice) {
      // FIXME MK either find a way to activate registered extension points only for certain models or document that they only
      // have to be loaded when needed
      Copier copier = ROOT2COPIERMAP.get(rootEObject);
      if (copier == null) {
         copier = new IfcCopier(rootEObject);
         ROOT2COPIERMAP.put(rootEObject, copier);
      }
      return copier;
   }
}
