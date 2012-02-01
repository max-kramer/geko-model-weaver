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

import java.util.Iterator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * The interface to be implemented by clients that extend the extension point lu.uni.geko.resources.refinedresourceloaderext. The
 * extension point allows for custom loading and storing of model resources. In contrast to the extension point
 * {@link SimpleResourceLoaderExt} it gives extensions full control over the whole process of loading and storing model resources.
 *
 * @author Max E. Kramer
 */
public interface RefinedResourceLoaderExt extends ResourceLoader {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.resources.refinedresourceloaderext";

   /**
    * Returns an iterator for the model at the given URI that can be used to iterate over all its contents.
    *
    * @param uri
    *           the URI of the model to be loaded
    * @return an all contents iterator
    */
   Iterator<EObject> getAllContentsIterator(URI uri);

   /**
    * Returns the root element of the content of the model at the given URI if it is unique (exactly one root element).
    *
    * @param uri
    *           the URI of the model to be loaded
    * @param modelName
    *           the name of the model (for logging and error output)
    * @return the root element
    */
   EObject getUniqueContentRoot(URI uri, String modelName);

   /**
    * Returns the root element of the content of the model at the given URI if it is unique (exactly one root element) and has the
    * type of the given class.
    *
    * @param uri
    *           the URI of the model to be loaded
    * @param modelName
    *           the name of the model (for logging and error output)
    * @param rootElementClass
    *           the class of which the root element has to be an instance of
    * @param <T>
    *           the type of the root element
    * @return the root element
    */
   <T extends EObject> T getUniqueContentRootIfCorrectlyTyped(URI uri, String modelName, Class<T> rootElementClass);

   /**
    * Saves the given EObject as the only content of the model at the given URI.
    *
    * @param eObject
    *           the new root element
    * @param uri
    *           the URI of the model to be replaced or created
    */
   void saveEObjectAsOnlyContent(EObject eObject, URI uri);

   /**
    * Saves the model at the given URI.
    *
    * @param uri
    *           the URI of the model to be saved
    */
   void saveResource(URI uri);
}
