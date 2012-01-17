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

public class SimpleResourceLoaderWrapper implements RefinedResourceLoaderExt {
	private final SimpleResourceLoaderExt wrappedResourceLoader;

	protected SimpleResourceLoaderWrapper(SimpleResourceLoaderExt wrappedResourceLoader) {
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
	public Iterator<EObject> getAllContentsIterator(URI uri) {
		return wrappedResourceLoader.loadResourceAtURI(uri).getAllContents();
	}

	@Override
	public EObject getUniqueResourceContentRoot(URI uri, String modelName) {
		Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
		return EMFResourceAdapter.getUniqueResourceContentRoot(resource, modelName);
	}

	@Override
	public <T extends EObject> T getResourceContentRootIfCorrectlyTyped(
			URI uri, String modelName, Class<T> rootElementClass) {
		Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
		return EMFResourceAdapter.getResourceContentRootIfCorrectlyTyped(resource, modelName, rootElementClass);
	}

	@Override
	public void saveEObjectAsOnlyContent(EObject eObject, URI uri) {
		try {
			Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
			EMFResourceAdapter.saveEObjectAsOnlyContent(eObject, resource);
		} catch (IOException e) {
			// soften
			throw new RuntimeException(e);
		}
	}

	@Override
	public void saveResource(URI uri) {
		try {
			Resource resource = wrappedResourceLoader.loadResourceAtURI(uri);
			EMFResourceAdapter.saveResource(resource);
		} catch (IOException e) {
			// soften
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean isExistingResource(URI uri) {
		return wrappedResourceLoader.isExistingResource(uri);
	}
}
