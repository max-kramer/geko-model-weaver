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
package lu.uni.geko.common.ecorecopy;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.adapters.JavaAdapter;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.util.ecorecopy.Abstract2BaseCopier;

public class Advice2BaseCopier extends Abstract2BaseCopier {
	private static final long serialVersionUID = -7077381667743808845L;
	private final BiN2NMap<EObject, EObject> base2AdviceMergeBiMap;

	public Advice2BaseCopier(BiN2NMap<EObject, EObject> base2AdviceMergeBiMap) {
		this.base2AdviceMergeBiMap = base2AdviceMergeBiMap;
	}

	@Override
	protected String getPackageNameSuffixToBeRemoved() {
		return GeKoConstants.ADVICE_MM_PACKAGE_NSURI_APPENDAGE;
	}
	
	private EObject getIfMappedOrCopiedAndCopyOtherwise(Object adviceObject) {
		if (adviceObject instanceof EObject) {
			Set<EObject> baseElementsToBeMergedWithAdviceElement = base2AdviceMergeBiMap.getAllKeysForValue((EObject) adviceObject);
			if (baseElementsToBeMergedWithAdviceElement != null && baseElementsToBeMergedWithAdviceElement.size() > 0) {
				// if more than one base element is merged with this advice element it does not matter which one we return as references are corrected afterwards anyway
				return JavaAdapter.one(baseElementsToBeMergedWithAdviceElement);
			}
		}
		EObject adviceEObjectCopy = super.get(adviceObject);
		if (adviceEObjectCopy == null) {
			if (adviceObject instanceof EObject) {
				return copyWithoutCheckingWhetherAlreadyCopied((EObject) adviceObject);
			} else {
				throw new RuntimeException("Advice2BaseCopier can only copy EObjects but '" + adviceObject + "' is no EObject!");
			}
		} else {
			return adviceEObjectCopy;
		}
	}
	
	@Override
	/** 
	 * Returns the base object that is mapped to the given advice object (if existing)
	 * and the copy of the advice object (if existing) via <code>super.get(..)</code> otherwise.<br/>
	 * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
	 */
	public EObject get(Object adviceObject) {
		return getIfMappedOrCopiedAndCopyOtherwise(adviceObject);
	}
	
	@Override
	/**
	 * Checks whether the advice object is mapped to a base object
	 * and returns this mapped base object (if existing) or a new copy otherwise.<br/>
	 * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
	 */
	public EObject copy(EObject adviceEObject) {
		return getIfMappedOrCopiedAndCopyOtherwise(adviceEObject);
	}
}
