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

import lu.uni.geko.common.ecorecopy.Advice2BaseCopier;
import lu.uni.geko.util.datastructures.BiN2NMap;

import org.eclipse.emf.ecore.EObject;

public class DefaultCopier implements Copier {
	private final Advice2BaseCopier advice2BaseCopier;

	public DefaultCopier(BiN2NMap<EObject, EObject> base2AdviceMergeBiMap) {
		this.advice2BaseCopier = new Advice2BaseCopier(base2AdviceMergeBiMap);
	}

	@Override
	public EObject copyAdviceEObject(EObject sourceAdviceEObject, EObject currentCopyBaseEObject) {
		EObject copy = advice2BaseCopier.copy(sourceAdviceEObject);
		advice2BaseCopier.copyReferences();
		return copy;
	}
}
