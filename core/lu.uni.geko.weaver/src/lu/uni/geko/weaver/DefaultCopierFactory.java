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
package lu.uni.geko.weaver;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public class DefaultCopierFactory implements CopierFactoryExt {
	private static final Map<EObject,Copier> ROOT2COPIERMAP = new HashMap<EObject, Copier>();

	@Override
	public Copier getCopier(EObject rootEObject) {
		Copier copier = ROOT2COPIERMAP.get(rootEObject);
		if (copier == null) {
			copier = new DefaultCopier();
			ROOT2COPIERMAP.put(rootEObject, copier);
		}
		return copier;
	}
}
