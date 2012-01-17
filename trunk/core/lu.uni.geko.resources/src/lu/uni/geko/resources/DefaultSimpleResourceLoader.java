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

public class DefaultSimpleResourceLoader implements SimpleResourceLoaderExt  {
	private class ThreadLocalResourceSet extends ThreadLocal<ResourceSet> {
		@Override
		protected ResourceSet initialValue() {
			return new ResourceSetImpl();
		}
	}
	
	private final ThreadLocalResourceSet threadLocalResourceSet = new ThreadLocalResourceSet();
	
	// RATIONALE MK this should be a singleton but as it is an eclipse extension we cannot use the standard singleton pattern
	protected DefaultSimpleResourceLoader() {
		// empty
	}
	
	public static DefaultSimpleResourceLoader getSingleton() {
		return DefaultSimpleResourceLoaderFactory.getDefaultSimpleResourceLoaderSingleton();
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
	
	private ResourceSet getResourceSet() {
		return threadLocalResourceSet.get();
	}

	@Override
	public Resource loadResourceAtURI(URI resourceURI) {
		Resource resource = null;
		try {
			try {
				resource = getResourceSet().getResource(resourceURI, true);
			} catch (org.eclipse.emf.common.util.WrappedException e) {
				// swallow silently
//				e.printStackTrace();
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

	private Resource createResource(URI uri) {
		return getResourceSet().createResource(uri);
	}

	@Override
	public boolean isExistingResource(URI resourceURI) {
		return getResourceSet().getResource(resourceURI, false) != null;
	}
}
