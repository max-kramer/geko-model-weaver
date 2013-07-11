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

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

import lu.uni.geko.util.bridges.EcoreResourceBridge;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A default implementation of the extension point {@link RefinedResourceLoaderExt lu.uni.geko.resources.refinedresourceloaderext}
 * that wraps a simple resource loader so that it can be used like a refined resource loader (object adapter pattern).
 *
 * @see SimpleResourceLoaderExt
 * @see RefinedResourceLoaderExt
 *
 * @author Max E. Kramer
 */
public class SimpleResourceLoaderWrapper implements RefinedResourceLoaderExt {
   /** The wrapped simple resource loader. */
   private final SimpleResourceLoaderExt wrappedResourceLoader;

   /**
    * Constructs a new SimpleResourceLoaderWrapper using the given simple resource loader.
    *
    * @param wrappedResourceLoader
    *           the simple resource loader to be wrapped
    */
   protected SimpleResourceLoaderWrapper(final SimpleResourceLoaderExt wrappedResourceLoader) {
      this.wrappedResourceLoader = wrappedResourceLoader;
   }

   @Override
   public final void initialize() {
      wrappedResourceLoader.initialize();
   }

   @Override
   public final Collection<String> supportedFileExtensions() {
      return wrappedResourceLoader.supportedFileExtensions();
   }

   @Override
   public final Iterator<EObject> getAllContentsIterator(final URI uri) {
      return wrappedResourceLoader.loadResourceAtURI(uri).getAllContents();
   }

   @Override
   public final EObject getUniqueContentRoot(final URI uri, final String modelName) {
      Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
      return EcoreResourceBridge.getUniqueContentRoot(resource, modelName);
   }

   @Override
   public final <T extends EObject> T getUniqueContentRootIfCorrectlyTyped(final URI uri, final String modelName,
         final Class<T> rootElementClass) {
      Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
      return EcoreResourceBridge.getUniqueContentRootIfCorrectlyTyped(resource, modelName, rootElementClass);
   }

   @Override
   public final void saveEObjectAsOnlyContent(final EObject eObject, final URI uri) {
      try {
         Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
         EcoreResourceBridge.saveEObjectAsOnlyContent(eObject, resource);
      } catch (IOException e) {
         // soften
         throw new RuntimeException(e);
      }
   }

   @Override
   public final void saveResource(final URI uri) {
      try {
         Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
         EcoreResourceBridge.saveResource(resource);
      } catch (IOException e) {
         // soften
         throw new RuntimeException(e);
      }
   }

   @Override
   public final boolean isExistingResource(final URI uri) {
      return wrappedResourceLoader.isExistingResource(uri);
   }
}
