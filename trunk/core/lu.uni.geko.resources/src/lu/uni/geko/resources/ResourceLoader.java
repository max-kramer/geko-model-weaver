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

import java.util.Collection;

import org.eclipse.emf.common.util.URI;

/**
 * The common supertype for simple and refined resource loaders defining that resource loaders can be initialised and are
 * responsible for resource with certain file extensions.
 *
 * @author Max E. Kramer
 */
public interface ResourceLoader {
   /**
    * Initialises the resource loader. Can be used e.g. for registering extension factories.
    */
   void initialize();

   /**
    * @return  a collection that contains all the file extensions (excluding the period ("."))for which this resource loader is
    * responsible for. <br/>
    * <br/>
    * <b>Attention:</b> Make sure that no file extension is supported by more than one registered resource loader to ensure
    * deterministic behaviour!
    */
   Collection<String> supportedFileExtensions();

   /**
    * Returns whether the model at the given URI is already existing or not.
    * @param uri the URI of a model
    * @return whether the model is existing
    */
   boolean isExistingResource(URI uri);
}
