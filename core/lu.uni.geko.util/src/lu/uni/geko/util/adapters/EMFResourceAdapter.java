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
package lu.uni.geko.util.adapters;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class EMFResourceAdapter {
	
	public static EObject getResourceContentRootIfUnique(Resource resource) {
		List<EObject> resourceContents = resource.getContents();
		if (resourceContents.size() == 1) {
			return resourceContents.get(0);
		} else {
			return null;
		}
	}
	
	public static EObject getUniqueResourceContentRoot(Resource resource, String modelName) {
		EObject uniqueResourceContentRootElement = getResourceContentRootIfUnique(resource);
		if (uniqueResourceContentRootElement != null) {
			return uniqueResourceContentRootElement;
		} else {
			throw new RuntimeException("The " + modelName + " '" + resource + "' has to contain exactly one root element!");
		}
	}
	
	public static <T extends EObject> T getResourceContentRootIfCorrectlyTyped(Resource resource, String modelName, Class<T> rootElementClass) {
		EObject rootElement = getUniqueResourceContentRoot(resource, modelName);
		return JavaAdapter.dynamicCast(rootElement, rootElementClass, "root element '" + rootElement + "' of the " + modelName + " '" + resource + "'");
	}
	
	public static Set<EObject> getAllContentsSet(Resource resource) {
		return getAllContentsSet(resource.getAllContents());
	}

	public static Set<EObject> getAllContentsSet(Set<EObject> eObjects) {
		Set<EObject> allContentsSet = new HashSet<EObject>(eObjects);
		for (EObject eObject : eObjects) {
			Set<EObject> currentAllContentsSet = getAllContentsSet(eObject);
			allContentsSet.addAll(currentAllContentsSet);
		}
		return allContentsSet;
	}
	
	public static Set<EObject> getAllContentsSet(EObject eObject) {
		Iterator<EObject> allContentsIterator = eObject.eAllContents();
		return getAllContentsSet(allContentsIterator);
	}
	
	public static Set<EObject> getAllContentsSet(Iterator<EObject> allContentsIterator) {
		Set<EObject> allContentsSet = new HashSet<EObject>();
		while (allContentsIterator.hasNext()) {
			EObject nextContent = allContentsIterator.next();
			allContentsSet.add(nextContent);
		}
		return allContentsSet;
	}
	
	public static void saveEObjectAsOnlyContent(EObject eObject, Resource resource) throws IOException {
		resource.getContents().clear();
		resource.getContents().add(eObject);
		saveResource(resource);
	}
	
	public static void saveResource(Resource resource) throws IOException {
		resource.save(Collections.EMPTY_MAP);
		resource.setModified(true);
	}
}
