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
package lu.uni.geko.ext.ifc;

import java.util.HashMap;
import java.util.Map;

import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.weaver.Copier;
import lu.uni.geko.weaver.CopierFactoryExt;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.ecore.EObject;

public class IfcCopierFactory implements CopierFactoryExt {
	private static final Map<EObject,Copier> ROOT2COPIERMAP = new HashMap<EObject, Copier>();
	
	@Override
	public Copier getCopier(EObject rootEObject, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap,  AdviceInstantiationScope scope) {
		// FIXME MK either find a way to activate registered extension points only for certain models or document that they only have to be loaded when needed
		Copier copier = ROOT2COPIERMAP.get(rootEObject);
		if (copier == null) {
			copier = new IfcCopier(rootEObject);
			ROOT2COPIERMAP.put(rootEObject, copier);
		}
		return copier;
	}

}
