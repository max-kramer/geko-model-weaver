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
package lu.uni.geko.resources;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

/**
 * A factory for the {@link DefaultSimpleResourceLoader} ensuring that only one instance is used although it is accessed by
 * Eclipse's extension mechanism.
 *
 * @author Max E. Kramer
 */
public class DefaultSimpleResourceLoaderFactory implements IExecutableExtensionFactory {
   /** The singleton instance variable for the class DefaultSimpleResourceLoader. */
   private static DefaultSimpleResourceLoader iNSTANCE = new DefaultSimpleResourceLoader();

   @Override
   public final Object create() throws CoreException {
      return getDefaultSimpleResourceLoaderInstance();
   }

   /**
    * @return the singleton instance of the class DefaultSimpleResourceLoader
    */
   public static DefaultSimpleResourceLoader getDefaultSimpleResourceLoaderInstance() {
      return iNSTANCE;
   }
}
