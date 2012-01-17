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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

public class DefaultSimpleResourceLoaderFactory implements IExecutableExtensionFactory {
	private static DefaultSimpleResourceLoader SINGLETON;
	
	@Override
	public Object create() throws CoreException {
		return getDefaultSimpleResourceLoaderSingleton();
	}
	
	public static DefaultSimpleResourceLoader getDefaultSimpleResourceLoaderSingleton() {
		if (SINGLETON == null) {
			SINGLETON = new DefaultSimpleResourceLoader();
		}
		return SINGLETON;
	}
}
