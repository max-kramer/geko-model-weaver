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

public interface RefinedResourceLoaderExt extends ResourceLoader {
	/** extension point ID **/
	String ID = "lu.uni.geko.resources.refinedresourceloaderext";
	
	Iterator<EObject> getAllContentsIterator(URI uri);
	
	EObject getUniqueResourceContentRoot(URI uri, String modelName);
	
	<T extends EObject> T getResourceContentRootIfCorrectlyTyped(URI uri, String modelName, Class<T> rootElementClass);
	
	void saveEObjectAsOnlyContent(EObject eObject, URI uri);
	
	void saveResource(URI uri);

	boolean isExistingResource(URI uri);
}