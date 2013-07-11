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
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import Pc2AvMapping.Pc2AvMappingPackage;

/**
 * The default implementation of the extension point {@link SimpleResourceLoaderExt lu.uni.geko.resources.simpleresourceloaderext}
 * using a thread local resource set and the default XMI resource factory.
 *
 * @see SimpleResourceLoaderExt
 *
 * @author Max E. Kramer
 */
public class DefaultSimpleResourceLoader implements SimpleResourceLoaderExt {
   /**
    * A thread local resource set implementation using the default thread local wrapper and the default resource set
    * implementation.
    */
   private class ThreadLocalResourceSet extends ThreadLocal<ResourceSet> {
      @Override
      protected ResourceSet initialValue() {
         return new ResourceSetImpl();
      }
   }

   /**
    * The thread local wrapper for the resource set for this resource loader.
    */
   private final ThreadLocalResourceSet threadLocalResourceSet = new ThreadLocalResourceSet();

   /**
    * An empty constructor. Protected as it has to be instantiated by Eclipse's extension mechanism using the
    * {@link DefaultSimpleResourceLoaderFactory}.
    */
   protected DefaultSimpleResourceLoader() {
      // empty
   }

   // RATIONALE MK this class should be a singleton but as it is an eclipse extension we cannot use the standard singleton pattern
   /**
    * @return the singleton instance of this class
    */
   public static DefaultSimpleResourceLoader getInstance() {
      return DefaultSimpleResourceLoaderFactory.getDefaultSimpleResourceLoaderInstance();
   }

   @Override
   public void initialize() {
      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
      EPackage.Registry.INSTANCE.put(Pc2AvMappingPackage.eNS_URI, Pc2AvMappingPackage.eINSTANCE);
   }

   @Override
   public Collection<String> supportedFileExtensions() {
      return Collections.singleton("*");
   }

   /**
    * @return the thread local resource set for this resource loader
    */
   private ResourceSet getResourceSet() {
      return threadLocalResourceSet.get();
   }

   @Override
   public Resource loadResourceAtURI(final URI resourceURI) {
      Resource resource = null;
      try {
         try {
            resource = getResourceSet().getResource(resourceURI, true);
         } catch (org.eclipse.emf.common.util.WrappedException e) {
            // swallow silently
            e = null; // otherwise checkstyle complains: "Must have at least one statement."
         }
         if (resource != null) {
            resource.load(Collections.emptyMap());
         } else {
            resource = getResourceSet().getResource(resourceURI, true);
            if (resource == null) {
               resource = createResource(resourceURI);
            }
         }
      } catch (IOException e) {
         // soften
         throw new RuntimeException(e);
      }
      return resource;
   }

   /**
    * Creates a resource at the given URI using the thread local resource set.
    *
    * @param uri
    *           the URI to be used
    * @return the created resource
    */
   private Resource createResource(final URI uri) {
      return getResourceSet().createResource(uri);
   }

   @Override
   public boolean isExistingResource(final URI resourceURI) {
      return getResourceSet().getResource(resourceURI, false) != null;
   }
}
