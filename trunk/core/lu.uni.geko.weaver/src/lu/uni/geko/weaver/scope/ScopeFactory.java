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

import lu.uni.geko.common.GeKoConstants;

import org.eclipse.emf.ecore.EObject;

public class ScopeFactory {
	private static final AdviceInstantiationScope GLOBAL_SCOPE = new AdviceInstantiationScope() {
		@Override
		public ScopeType getType() {
			return ScopeType.GlobalScope;
		}
	};
	
	private static final AdviceInstantiationScope PER_JOIN_POINT_SCOPE = new AdviceInstantiationScope() {
		@Override
		public ScopeType getType() {
			return ScopeType.PerJoinPointScope;
		}
	};
	
	private static final AdviceInstantiationScope DYNAMIC_SCOPE = new AdviceInstantiationScope() {
		@Override
		public ScopeType getType() {
			return ScopeType.DynamicScope;
		}
	};

	public static AdviceInstantiationScope createGlobalScope() {
		return GLOBAL_SCOPE;
	}
	
	public static AdviceInstantiationScope createPerJoinPointScope() {
		return PER_JOIN_POINT_SCOPE;
	}

	public static AdviceInstantiationScope createDynamicScope() {
		return DYNAMIC_SCOPE;
	}
	
	public static AdviceInstantiationScope createCustomScope(Set<EObject> adviceEObjectsInScope) {
		return new CustomScope(adviceEObjectsInScope);
	}
	
	public static AdviceInstantiationScope createDefaultScope() {
		String defaultTypeName = GeKoConstants.getDefaultAvInstantiationScopeType();
		ScopeType defaultType = ScopeType.valueOf(defaultTypeName);
		switch (defaultType) {
			case GlobalScope : return createGlobalScope();
			case PerJoinPointScope : return createPerJoinPointScope();
			case DynamicScope : return createDynamicScope();
			default : return createPerJoinPointScope();
		}
	}
}
