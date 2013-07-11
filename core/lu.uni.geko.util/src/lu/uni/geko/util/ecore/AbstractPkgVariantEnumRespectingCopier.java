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

/**
 * An abstract class to be extended by clients to create variants of EObjects. Clients have to provide a method that returns the
 * suffix that is to be removed from a metamodel package name to obtain the package name of the variant. <br/>
 * The implementation is based on {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier EcoreUtil.Copier} with various modifications
 * to change the default copying behaviour. The modification in this class makes it usable for package name based variants.
 *
 * @see EnumRespectingCopier
 *
 * @author Max E. Kramer
 */
public abstract class AbstractPkgVariantEnumRespectingCopier extends EnumRespectingCopier {
   /** The recommended unique identifier for serialising. */
   private static final long serialVersionUID = 0L;

   /**
    * @return the suffix that is to be removed from a metamodel package name to obtain the package name of the variant
    */
   protected abstract String getMMPackageNameSuffixToRemove();

   @Override
   protected final EClass getTarget(final EClass eClass) {
      return EcorePkgVariantsBridge.getEClassByRemovingAPkgSuffix(eClass, getMMPackageNameSuffixToRemove());
   }

   @Override
   protected final EStructuralFeature getTarget(final EStructuralFeature eStructuralFeature) {
      EClass variantEClass = eStructuralFeature.getEContainingClass();
      EClass baseEClass = getTarget(variantEClass);
      String featureName = eStructuralFeature.getName();
      EStructuralFeature baseFeature = baseEClass.getEStructuralFeature(featureName);
      return baseFeature;
   }
}
