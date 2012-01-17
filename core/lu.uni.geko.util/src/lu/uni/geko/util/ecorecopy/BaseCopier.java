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
package lu.uni.geko.util.ecorecopy;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

public class BaseCopier extends Copier {
	private static final long serialVersionUID = 1828218323998614540L;
	
	public BaseCopier() {
		// resolveProxies useOriginalReferences
		super(true, true);
	}

	/**
     * Called to handle the copying of a cross reference;
     * this adds values or sets a single value as appropriate for the multiplicity
     * while !!!NOT!!! omitting any bidirectional reference that isn't in the copy map.
     * @param eReference the reference to copy.
     * @param eObject the object from which to copy.
     * @param copyEObject the object to copy to.
     */
	@Override
    protected void copyReference(EReference eReference, EObject eObject, EObject copyEObject) {
		if (eObject.eIsSet(eReference)) {
			if (!eReference.isMany()) {
				Object referencedEObject = eObject.eGet(eReference, resolveProxies);
				if (referencedEObject != null) {
					Object copyReferencedEObject = get(referencedEObject);
					if (copyReferencedEObject == null) {
						if (useOriginalReferences) { // && eReference.getEOpposite() == null)
                             copyEObject.eSet(getTarget(eReference), referencedEObject);
						}
					}
				}
			}
		}
    }
}
