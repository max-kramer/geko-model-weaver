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

public interface ResourceLoader {
	/**
	 * Initializes this resource loader. Can be used e.g. for registering extension factories.
	 */
	void initialize();
	
	/**
	 * Returns a collection that contains all the file extensions (excluding the period ("."))for which this resource loader is responsible for. </br>
	 * ATTENTION: Make sure that no file extension is supported by more than one registered resource loader to ensure deterministic behaviour!
	 */
	Collection<String> supportedFileExtensions();
}
