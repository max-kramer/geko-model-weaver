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
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;

import lu.uni.geko.util.bridges.EclipseBridge;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * A utility class to access the functionality provided by extensions of the {@link SimpleResourceLoader} and
 * {@link RefinedResourceLoader} extension points.
 *
 * @see SimpleResourceLoaderExt
 * @see RefinedResourceLoaderExt
 * @see ResourceLoader
 *
 * @author Max E. Kramer
 */
public final class MainResourceLoader {
   /** The mapping from file extensions to responsible resource loaders. */
   private static Map<String, RefinedResourceLoaderExt> fileExt2ResourceLoaderMap;

   static {
      Collection<SimpleResourceLoaderExt> simpleResourceLoaders = EclipseBridge.getRegisteredExtensions(
            SimpleResourceLoaderExt.ID, "class", SimpleResourceLoaderExt.class);
      Collection<RefinedResourceLoaderExt> refinedResourceLoaders = EclipseBridge.getRegisteredExtensions(
            RefinedResourceLoaderExt.ID, "class", RefinedResourceLoaderExt.class);

      // wrap all the simple resource loaders in order to make them sophisticated
      for (SimpleResourceLoaderExt simpleResourceLoader : simpleResourceLoaders) {
         RefinedResourceLoaderExt refinedResourceLoader = new SimpleResourceLoaderWrapper(simpleResourceLoader);
         refinedResourceLoaders.add(refinedResourceLoader);
      }
      fileExt2ResourceLoaderMap = new HashMap<String, RefinedResourceLoaderExt>(refinedResourceLoaders.size());
      for (RefinedResourceLoaderExt refinedResourceLoader : refinedResourceLoaders) {
         for (String fileExt : refinedResourceLoader.supportedFileExtensions()) {
            RefinedResourceLoaderExt registeredResourceLoader = fileExt2ResourceLoaderMap.put(fileExt, refinedResourceLoader);
            if (registeredResourceLoader != null) {
               System.out.println("Warning: The resource loaders '" + registeredResourceLoader + "' and '"
                     + refinedResourceLoader + "'" + "are both responsible for the file extension '" + fileExt + "'!");
            }
         }
         refinedResourceLoader.initialize();
      }
   }

   /** Utility classes should not have a public or default constructor. */
   private MainResourceLoader() {
   }

   /**
    * Determines the resource loader that is responsible for loading the model at the given URI and returns it.
    *
    * @param uri
    *           the URI of the model to be loaded
    * @return the responsible resource loader
    */
   private static RefinedResourceLoaderExt getResourceLoaderForURI(final URI uri) {
      String fileExt = uri.fileExtension();
      RefinedResourceLoaderExt resourceLoader = fileExt2ResourceLoaderMap.get(fileExt);
      if (resourceLoader == null) {
         resourceLoader = fileExt2ResourceLoaderMap.get("*");
         if (resourceLoader == null) {
            throw new RuntimeException("No default resource loader registered!");
         }
      }
      return resourceLoader;
   }

   /**
    * Returns an iterator for the model at the given URI that can be used to iterate over all its contents.
    *
    * @param uri
    *           the URI of the model to be loaded
    * @return an all contents iterator
    */
   public static Iterator<EObject> getAllContentsIterator(final URI uri) {
      final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
      Callable<Iterator<EObject>> callable = new Callable<Iterator<EObject>>() {
         @Override
         public Iterator<EObject> call() throws Exception {
            return resourceLoader.getAllContentsIterator(uri);
         }
      };
      return EclipseBridge.callInProtectedMode(callable);
   }

   /**
    * Returns the root element of the content of the model at the given URI if it is unique (exactly one root element).
    *
    * @param uri
    *           the URI of the model to be loaded
    * @param modelName
    *           the name of the model (for logging and error output)
    * @return the root element
    */
   public static EObject getUniqueContentRoot(final URI uri, final String modelName) {
      final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
      Callable<EObject> callable = new Callable<EObject>() {
         @Override
         public EObject call() throws Exception {
            return resourceLoader.getUniqueContentRoot(uri, modelName);
         }
      };
      return EclipseBridge.callInProtectedMode(callable);
   }

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
   public static <T extends EObject> T getUniqueContentRootIfCorrectlyTyped(final URI uri, final String modelName,
         final Class<T> rootElementClass) {
      final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
      Callable<T> callable = new Callable<T>() {
         @Override
         public T call() throws Exception {
            return resourceLoader.getUniqueContentRootIfCorrectlyTyped(uri, modelName, rootElementClass);
         }
      };
      return EclipseBridge.callInProtectedMode(callable);
   }

   /**
    * Saves the given EObjects as the only content of the model at the given URI.
    *
    * @param eObject
    *           the new root element
    * @param uri
    *           the URI of the model to be replaced or created
    */
   public static void saveEObjectAsOnlyContent(final EObject eObject, final URI uri) {
      final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
      Runnable runnable = new Runnable() {
         @Override
         public void run() {
            resourceLoader.saveEObjectAsOnlyContent(eObject, uri);
         }
      };
      EclipseBridge.runInProtectedMode(runnable);
   }

   /**
    * Saves the model at the given URI.
    *
    * @param uri
    *           the URI of the model to be saved
    */
   public static void save(final URI uri) {
      final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
      Runnable runnable = new Runnable() {
         @Override
         public void run() {
            resourceLoader.saveResource(uri);
         }
      };
      EclipseBridge.runInProtectedMode(runnable);
   }

   /**
    * Returns whether the model at the given URI is already existing or not.
    *
    * @param uri
    *           the URI of a model
    * @return whether the model is existing
    */
   public static boolean isExisting(final URI uri) {
      final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
      Callable<Boolean> callable = new Callable<Boolean>() {
         @Override
         public Boolean call() throws Exception {
            return resourceLoader.isExistingResource(uri);
         }
      };
      return EclipseBridge.callInProtectedMode(callable);
   }
}
