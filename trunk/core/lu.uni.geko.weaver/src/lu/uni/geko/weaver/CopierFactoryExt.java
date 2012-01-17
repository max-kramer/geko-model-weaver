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

import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.ecore.EObject;

public interface CopierFactoryExt {
	/** extension point ID **/
	String ID = "lu.uni.geko.weaver.copierfactoryext";

	Copier getCopier(EObject rootEObject, BiN2NMap<EObject, EObject> base2AdviceMergeBiMap, AdviceInstantiationScope scope);
}
