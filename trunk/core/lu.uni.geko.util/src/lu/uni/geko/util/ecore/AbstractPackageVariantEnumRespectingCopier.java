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

import lu.uni.geko.util.bridges.EcorePkgVariantsBridge;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class AbstractPackageVariantEnumRespectingCopier extends EnumRespectingCopier {
   private static final long serialVersionUID = 1650653990013905901L;

   protected abstract String getPackageNameSuffixToBeRemoved();

	@Override
	protected EClass getTarget(
			EClass eClass) {
		return EcorePkgVariantsBridge.getEClassByRemovingAPackageSuffix(eClass, getPackageNameSuffixToBeRemoved());
	}

	@Override
	protected EStructuralFeature getTarget(EStructuralFeature eStructuralFeature) {
		EClass variantEClass = eStructuralFeature.getEContainingClass();
		EClass baseEClass = getTarget(variantEClass);
		String featureName = eStructuralFeature.getName();
		EStructuralFeature baseFeature = baseEClass.getEStructuralFeature(featureName);
		return baseFeature;
	}
}
