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

import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;
import lu.uni.geko.weaver.scope.ScopeType;

import org.eclipse.emf.ecore.EObject;

public class DefaultCopierFactory implements CopierFactoryExt {
	/** used for global advice instantiation strategy **/
	private static final Map<EObject,Copier> ROOT2COPIERMAP = new HashMap<EObject, Copier>();
	
	/** used for per join point advice instantiation strategy **/
	private static final Map<BiN2NMap<EObject, EObject>,Copier> JOINPOINT2COPIERMAP = new HashMap<BiN2NMap<EObject, EObject>, Copier>();

	@Override
	public Copier getCopier(EObject rootEObject, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap, AdviceInstantiationScope scope) {
		ScopeType scopeType = scope.getType();
		switch (scopeType) {
			case GlobalScope : return getCopierForGlobalScope(rootEObject, base2AdviceMergeBiMap);
			case PerJoinPointScope : return getCopierForPerJoinPointScope(rootEObject, base2AdviceMergeBiMap);
			
			// FIXME MK !!!! implement copier retrieval for dynamic and custom scope type
			
			default : return getCopierForPerJoinPointScope(rootEObject, base2AdviceMergeBiMap);
		}
	}

	private Copier getCopierForGlobalScope(EObject rootEObject,
			BiN2NMap<EObject, EObject> base2AdviceMergeBiMap) {
		Copier copier = ROOT2COPIERMAP.get(rootEObject);
		if (copier == null) {
			copier = new DefaultCopier(base2AdviceMergeBiMap);
			ROOT2COPIERMAP.put(rootEObject, copier);
		}
		return copier;
	}

	private Copier getCopierForPerJoinPointScope(EObject rootEObject, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap) {
		Copier copier = JOINPOINT2COPIERMAP.get(base2AdviceMergeBiMap);
		if (copier == null) {
			copier = new DefaultCopier(base2AdviceMergeBiMap);
			JOINPOINT2COPIERMAP.put(base2AdviceMergeBiMap, copier);
		}
		return copier;
	}
}
