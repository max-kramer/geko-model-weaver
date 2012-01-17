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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

public interface SimpleResourceLoaderExt extends ResourceLoader {
	/** extension point ID **/
	String ID = "lu.uni.geko.resources.simpleresourceloaderext";
	
	/**
	 * Loads the resource at the given URI and returns it.
	 * @pre responsibleForURI(resourceURI) returns true
	 */
	Resource loadResourceAtURI(URI resourceURI);

	boolean isExistingResource(URI resourceURI);
}
