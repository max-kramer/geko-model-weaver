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

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.ecorecopy.Abstract2BaseCopier;

import org.eclipse.emf.ecore.EObject;

public abstract class Advice2BaseCopier extends Abstract2BaseCopier {
	private static final long serialVersionUID = -7077381667743808845L;

	@Override
	protected String getPackageNameSuffixToBeRemoved() {
		return GeKoConstants.ADVICE_MM_PACKAGE_NSURI_APPENDAGE;
	}
	
	private EObject getIfNoNewCopyNeededAndCopyOtherwise(Object adviceObject) {
		if (adviceObject instanceof EObject) {
			EObject existingCopy = getIfNoNewCopyNeeded((EObject) adviceObject);
			if (existingCopy != null) {
				return existingCopy;
			}
		}
		if (adviceObject instanceof EObject) {
			return copyWithoutCheckingWhetherAlreadyCopied((EObject) adviceObject);
		} else {
			throw new RuntimeException("Advice2BaseCopier can only copy EObjects but '" + adviceObject + "' is no EObject!");
		}
	}
	
	/**
	 * Tries to retrieve an existing copy for this advice element or a base element that will be merged with this advice element.
	 * If no existing copy or base element can be used this method returns <code>null</code>.
	 */
	public abstract EObject getIfNoNewCopyNeeded(EObject adviceEObject);
	
	/**
	 * Registers the given copy of the give advice element so that it will only be copied again if needed.
	 */
	public abstract void registerCopy(EObject adviceEObject, EObject copy);

	@Override
	/** 
	 * Returns the base object that is mapped to the given advice object (if existing)
	 * and the copy of the advice object (if existing) via <code>super.get(..)</code> otherwise.<br/>
	 * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
	 */
	public EObject get(Object adviceObject) {
		EObject copy = getIfNoNewCopyNeededAndCopyOtherwise(adviceObject);
		registerCopy((EObject) adviceObject, copy);
		return copy;
	}
	
	@Override
	/**
	 * Checks whether the advice object is mapped to a base object
	 * and returns this mapped base object (if existing) or a new copy otherwise.<br/>
	 * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
	 */
	public EObject copy(EObject adviceEObject) {
		EObject copy = getIfNoNewCopyNeededAndCopyOtherwise(adviceEObject);
		registerCopy(adviceEObject, copy);
		return copy;
	}
}
