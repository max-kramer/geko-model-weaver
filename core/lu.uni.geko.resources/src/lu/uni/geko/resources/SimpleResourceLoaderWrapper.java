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

import lu.uni.geko.util.adapters.EMFResourceAdapter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A default implementation for wrapping simple resource loaders to use them like refined resource loaders (adapter pattern).
 *
 * @author Max E. Kramer
 */
public class SimpleResourceLoaderWrapper implements RefinedResourceLoaderExt {
   /** The wrapped simple resource loader. */
   private final SimpleResourceLoaderExt wrappedResourceLoader;

   /**
    * Constructor initialising all fields.
    *
    * @param wrappedResourceLoader
    *           the simple resource loader to be wrapped
    */
   protected SimpleResourceLoaderWrapper(final SimpleResourceLoaderExt wrappedResourceLoader) {
      this.wrappedResourceLoader = wrappedResourceLoader;
   }

   @Override
   public void initialize() {
      wrappedResourceLoader.initialize();
   }

   @Override
   public Collection<String> supportedFileExtensions() {
      return wrappedResourceLoader.supportedFileExtensions();
   }

   @Override
   public Iterator<EObject> getAllContentsIterator(final URI uri) {
      return wrappedResourceLoader.loadResourceAtURI(uri).getAllContents();
   }

   @Override
   public EObject getUniqueContentRoot(final URI uri, final String modelName) {
      Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
      return EMFResourceAdapter.getUniqueContentRoot(resource, modelName);
   }

   @Override
   public <T extends EObject> T getUniqueContentRootIfCorrectlyTyped(final URI uri, final String modelName,
         final Class<T> rootElementClass) {
      Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
      return EMFResourceAdapter.getUniqueContentRootIfCorrectlyTyped(resource, modelName, rootElementClass);
   }

   @Override
   public void saveEObjectAsOnlyContent(final EObject eObject, final URI uri) {
      try {
         Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
         EMFResourceAdapter.saveEObjectAsOnlyContent(eObject, resource);
      } catch (IOException e) {
         // soften
         throw new RuntimeException(e);
      }
   }

   @Override
   public void saveResource(final URI uri) {
      try {
         Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
         EMFResourceAdapter.saveResource(resource);
      } catch (IOException e) {
         // soften
         throw new RuntimeException(e);
      }
   }

   @Override
   public boolean isExistingResource(final URI uri) {
      return wrappedResourceLoader.isExistingResource(uri);
   }
}
