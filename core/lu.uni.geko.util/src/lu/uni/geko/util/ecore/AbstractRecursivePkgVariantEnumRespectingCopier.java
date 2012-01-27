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
package lu.uni.geko.util.ecore;

import org.eclipse.emf.ecore.EObject;

public abstract class AbstractRecursivePkgVariantEnumRespectingCopier extends AbstractPackageVariantEnumRespectingCopier  {
	private static final long serialVersionUID = 1735758222681934743L;

	@Override
	/**
	 * Checks whether a base version of this variant has already been produced (the variant has been copied before)
	 * and returns this old copy if existing or a new copy otherwise.<br/>
	 * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
	 */
	public EObject copy(EObject eObject) {
		return getIfCopiedAndCopyOtherwise(eObject);
	}

	private EObject getIfCopiedAndCopyOtherwise(EObject eObject) {
		EObject eObjectCopy = get(eObject);
		if (eObjectCopy == null) {
			eObjectCopy = copyWithoutCheckingWhetherAlreadyCopied(eObject);
		}
		return eObjectCopy;
	}

	/**
	 * Copies the given EObject without checking whether this object was already copied before by simply delegating to <code>super.copy(..)</code>.<br/>
	 * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
	 * @param eObject
	 * @return
	 */
	public EObject copyWithoutCheckingWhetherAlreadyCopied(EObject eObject) {
		return super.copy(eObject);
	}
}
