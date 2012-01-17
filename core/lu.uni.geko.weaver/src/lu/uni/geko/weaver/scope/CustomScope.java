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
package lu.uni.geko.weaver.scope;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

public class CustomScope implements AdviceInstantiationScope {
	private final Set<EObject> adviceEObjectsInScope;

	protected CustomScope(Set<EObject> adviceEObjectsInScope) {
		super();
		this.adviceEObjectsInScope = adviceEObjectsInScope;
	}

	protected Set<EObject> getAdviceEObjectsInScope() {
		return adviceEObjectsInScope;
	}

	@Override
	public ScopeType getType() {
		return ScopeType.CustomScope;
	}
}
