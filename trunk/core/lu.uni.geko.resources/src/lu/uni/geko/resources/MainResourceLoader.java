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

import lu.uni.geko.util.adapters.EclipseAdapter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class MainResourceLoader {
	private static Map<String, RefinedResourceLoaderExt> fileExt2ResourceLoaderMap;
	
	static {
		Collection<SimpleResourceLoaderExt> simpleResourceLoaders = EclipseAdapter.getRegisteredExecutableExtensions(SimpleResourceLoaderExt.ID, "class", SimpleResourceLoaderExt.class);
		Collection<RefinedResourceLoaderExt> refinedResourceLoaders = EclipseAdapter.getRegisteredExecutableExtensions(RefinedResourceLoaderExt.ID, "class", RefinedResourceLoaderExt.class);
		
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
					System.out.println("Warning: The resource loaders '" + registeredResourceLoader + "' and '" + refinedResourceLoader + "'" +
								   "are both responsible for the file extension '" + fileExt + "'!");
				}
			}
			refinedResourceLoader.initialize();
		}
	}

	private static RefinedResourceLoaderExt getResourceLoaderForURI(URI resourceURI) {
		String fileExt = resourceURI.fileExtension();
		RefinedResourceLoaderExt resourceLoader = fileExt2ResourceLoaderMap.get(fileExt);
		if (resourceLoader == null) {
			resourceLoader = fileExt2ResourceLoaderMap.get("*");
			if (resourceLoader == null) {
				throw new RuntimeException("No default resource loader registered!");
			}
		}
		return resourceLoader;
	}
	
	public static Iterator<EObject> getAllContentsIterator(final URI uri) {
		final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
		Callable<Iterator<EObject>> callable = new Callable<Iterator<EObject>>() {
			@Override
			public Iterator<EObject> call() throws Exception {
				return resourceLoader.getAllContentsIterator(uri);
			}
		};
		return EclipseAdapter.callInProtectedMode(callable);
	}
	
	public static EObject getUniqueResourceContentRoot(final URI uri, final String modelName) {
		final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
		Callable<EObject> callable = new Callable<EObject>() {
			@Override
			public EObject call() throws Exception {
				return resourceLoader.getUniqueResourceContentRoot(uri, modelName);
			}
		};
		return EclipseAdapter.callInProtectedMode(callable);
	}
	
	public static <T extends EObject> T getResourceContentRootIfCorrectlyTyped(final URI uri, final String modelName, final Class<T> rootElementClass) {
		final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
		Callable<T> callable = new Callable<T>() {
			@Override
			public T call() throws Exception {
				return resourceLoader.getResourceContentRootIfCorrectlyTyped(uri, modelName, rootElementClass);
			}
		};
		return EclipseAdapter.callInProtectedMode(callable);
	}
	
	public static void saveEObjectAsOnlyContent(final EObject eObject, final URI uri) {
		final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				resourceLoader.saveEObjectAsOnlyContent(eObject, uri);
			}
		};
		EclipseAdapter.runInProtectedMode(runnable);
	}
	
	public static void saveResource(final URI uri) {
		final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				resourceLoader.saveResource(uri);
			}
		};
		EclipseAdapter.runInProtectedMode(runnable);
	}

	public static boolean isExistingResource(final URI uri) {
		final RefinedResourceLoaderExt resourceLoader = getResourceLoaderForURI(uri);
		Callable<Boolean> callable = new Callable<Boolean>() {
			@Override
			public Boolean call() throws Exception {
				return resourceLoader.isExistingResource(uri);
			}
		};
		return EclipseAdapter.callInProtectedMode(callable);
	}
}
