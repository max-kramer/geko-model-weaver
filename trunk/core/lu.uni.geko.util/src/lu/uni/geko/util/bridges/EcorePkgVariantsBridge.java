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
package lu.uni.geko.util.bridges;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * @author Max E. Kramer
 */
public class EcorePkgVariantsBridge {

   public static EClass getEClassByRemovingAPackageSuffix(final EClass eClass, final String packageNameSuffixToBeRemoved) {
   	EClassifier classifierVariant = getEClassifierByRemovingAPackageSuffix(eClass, packageNameSuffixToBeRemoved);
   	return ensureIsEClass(classifierVariant);
   }

   public static EClassifier getEClassifierByRemovingAPackageSuffix(final EClassifier eClassifier, final String packageNameSuffixToBeRemoved) {
   	String originalPackageNsURI = eClassifier.getEPackage().getNsURI();
   	String variantPackageNsURI = PackageNameBridge.removePackageSuffixFromPackageName(originalPackageNsURI, packageNameSuffixToBeRemoved);
   	return getEClassifierInPackageVariant(eClassifier, variantPackageNsURI);
   }

   public static EClass getEClassByReplacingAPackageNsURISuffix(final EClass eClass, final String packageNameSuffixToBeRemoved, final String packageNameSuffixReplacement) {
   	EClassifier classifierVariant = getEClassifierByReplacingAPackageNsURISuffix(eClass, packageNameSuffixToBeRemoved, packageNameSuffixReplacement);
   	return ensureIsEClass(classifierVariant);
   }

   public static EClassifier getEClassifierByReplacingAPackageNsURISuffix(final EClassifier eClassifier, final String packageNameSuffixToBeRemoved, final String packageNameSuffixReplacement) {
   	String originalPackageNsURI = eClassifier.getEPackage().getNsURI();
   	String variantPackageNsURI = PackageNameBridge.replacePackageSuffixInPackageName(originalPackageNsURI, packageNameSuffixToBeRemoved, packageNameSuffixReplacement);
   	return getEClassifierInPackageVariant(eClassifier, variantPackageNsURI);
   }

   private static EClassifier getEClassifierInPackageVariant(final EClassifier eClassifier,
   		final String variantPackageNsURI) {
   	EPackage packageVariant = EPackage.Registry.INSTANCE.getEPackage(variantPackageNsURI);
   	String className = eClassifier.getName();
   	return packageVariant.getEClassifier(className);
   }

   private static EClass ensureIsEClass(final EClassifier eClassifier) {
      if (eClassifier instanceof EClass) {
         return (EClass) eClassifier;
      } else {
         throw new RuntimeException("The classifier variant '" + eClassifier + "' is not an EClass although its original is!");
      }
   }

   public static String getCanonicalClassNameWithTrimmedPackageName(final EObject eObject, final String packageNameSuffixToBeRemoved) {
      String className = EcoreBridge.getCanonicalClassNameForEObject(eObject);
      return PackageNameBridge.removePackageSuffixFromCanonicalClassName(className, packageNameSuffixToBeRemoved);
   }
}
