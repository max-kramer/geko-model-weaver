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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * The interface to be implemented by clients that extend the extension point lu.uni.geko.resources.simpleresourceloaderext. The
 * extension point allows for simple customisation of the loading and storing process of model resources. In contrast to the
 * extension point {@link RefinedResourceLoaderExt} it facilitates extension by giving only control over parts of the process of
 * loading and storing model resources.
 *
 * @author Max E. Kramer
 */
public interface SimpleResourceLoaderExt extends ResourceLoader {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.resources.simpleresourceloaderext";

   /**
    * Loads the resource at the given URI and returns it if {@link ResourceLoader#supportedFileExtensions()
    * ResourceLoader.supportedFileExtensions()} contains the file extension of the given URI.
    *
    * @param uri
    *           the URI of the model resource to be loaded
    * @return the corresponding resource
    */
   Resource loadResourceAtURI(URI uri);
}
