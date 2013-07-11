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
 * A utility class hiding details of working with different variants of Ecore packages using the 
 * Eclipse Modeling Framework API for recurring tasks that are not project-specific.<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently 
 * only providing one implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 */
public final class EcorePkgVariantsBridge {
   /** Utility classes should not have a public or default constructor. */
   private EcorePkgVariantsBridge() {
   }

   /**
    * Returns the metaclass variant corresponding to the given metaclass by removing the given 
    * suffix from the package name.
    *
    * @param eClass
    *           the original metaclass
    * @param pkgNameSuffixToRemove
    *           the suffix to be removed from the package name of the original metaclass
    * @return the corresponding metaclass variant
    */
   public static EClass getEClassByRemovingAPkgSuffix(final EClass eClass, final String pkgNameSuffixToRemove) {
      EClassifier classifierVariant = getEClassifierByRemovingAPkgSuffix(eClass, pkgNameSuffixToRemove);
      return JavaBridge.dynamicCast(classifierVariant, EClass.class, "classifier variant");
   }

   /**
    * Returns the classifier variant corresponding to the given classifier by removing the given 
    * suffix from the package name.
    *
    * @param eClassifier
    *           the original classifier
    * @param pkgNameSuffixToRemove
    *           the suffix to be removed from the package name of the original classifier
    * @return the corresponding classifier variant
    */
   public static EClassifier getEClassifierByRemovingAPkgSuffix(final EClassifier eClassifier,
         final String pkgNameSuffixToRemove) {
      String originalPackageNsURI = eClassifier.getEPackage().getNsURI();
      String variantPackageNsURI = JavaPkgNameBridge.removeSuffixFromPkgName(originalPackageNsURI, pkgNameSuffixToRemove);
      //split all class names that are symmetric (for AdviceAdvice, PointcutPointcut and so one)
      //TODO FR: do it properly by calling GeKoConstants
      String classifierName = eClassifier.getName();
      if(classifierName == "PointcutPointcut") {
    	  eClassifier.setName("Pointcut");
      }
      else if(classifierName == "AdviceAdvice") {
    	  eClassifier.setName("Advice");
      }
      else if(classifierName == "GlobalScopeGlobalScope") {
    	  eClassifier.setName("GlobalScope");
      }
      else if(classifierName == "PerJoinPointScopePerJoinPointScope") {
    	  eClassifier.setName("PerJoinPointScope");
      }
      
      if(classifierName.length()%2 == 0 ) {
    	  //if the two parts of the name are equal
    	  //corresponds in the duplication name done in 
    	  //lu.uni.geko.util.bridges.EcoreFactoryBridge.addNewClassToPkg
    	  String classifierNamePart1 = classifierName.substring(0, classifierName.length()/2);
    	  String classifierNamePart2 = classifierName.substring(classifierName.length()/2);
    	  if(classifierNamePart1.equals(classifierNamePart2)) {
    		  eClassifier.setName(classifierNamePart1);
    	  }
      }
      
      return getEClassifierInPkgVariant(eClassifier, variantPackageNsURI);
   }

   /**
    * Returns the metaclass variant corresponding to the given metaclass by replacing the given 
    * suffix in the package namespace URI with the given replacement suffix.
    *
    * @param eClass
    *           the original metaclass
    * @param pkgNsURISuffixToReplace
    *           the suffix to be replaced in the package namespace URI of the original metaclass
    * @param pkgNsURISuffixReplacement
    *           the suffix replacing the old package namespace URI suffix
    * @return the corresponding metaclass variant
    */
   public static EClass getEClassByReplacingAPkgNsURISuffix(final EClass eClass, final String pkgNsURISuffixToReplace,
         final String pkgNsURISuffixReplacement) {
      EClassifier classifierVariant = getEClassifierByReplacingAPkgNsURISuffix(eClass, pkgNsURISuffixToReplace,
            pkgNsURISuffixReplacement);
      return JavaBridge.dynamicCast(classifierVariant, EClass.class, "classifier variant");
   }

   /**
    * Returns the classifier variant corresponding to the given classifier by replacing the given 
    * suffix in the package namespace URI with the given replacement suffix.
    *
    * @param eClassifier
    *           the original classifier
    * @param pkgNsURISuffixToReplace
    *           the suffix to be replaced in the package namespace URI of the original classifier
    * @param pkgNsURISuffixReplacement
    *           the suffix replacing the old package namespace URI suffix
    * @return the corresponding classifier variant
    */
   public static EClassifier getEClassifierByReplacingAPkgNsURISuffix(final EClassifier eClassifier,
         final String pkgNsURISuffixToReplace, final String pkgNsURISuffixReplacement) {
      String originalPackageNsURI = eClassifier.getEPackage().getNsURI();
      String variantPackageNsURI = JavaPkgNameBridge.replaceSuffixInPkgName(originalPackageNsURI, pkgNsURISuffixToReplace,
            pkgNsURISuffixReplacement);
      return getEClassifierInPkgVariant(eClassifier, variantPackageNsURI);
   }

   /**
    * Returns the classifier with the same name as the given classifier from the package variant 
    * using the given package namespace URI.
    *
    * @param eClassifier
    *           a classifier of the package for the given namespace URI
    * @param pkgVariantNsURI
    *           the namespace URI of the package containing a classifier with the given name
    * @return the classifier variant
    */
   private static EClassifier getEClassifierInPkgVariant(final EClassifier eClassifier, final String pkgVariantNsURI) {
      EPackage pkgVariant = EPackage.Registry.INSTANCE.getEPackage(pkgVariantNsURI);
      String className = eClassifier.getName();
      return pkgVariant.getEClassifier(className);
   }

   /**
    * Removes the given suffix from the package name in the canonical class name of the given
    * EObject and returns it.
    *
    * @param eObject
    *           an EObject
    * @param pkgNameSuffixToRemove
    *           the suffix to be removed from the package name in the canonical class name of the 
    *           given EObject
    * @return the trimmed canonical class name
    */
   public static String getPkgNameTrimmedCanonicalClassName(final EObject eObject, final String pkgNameSuffixToRemove) {
      String className = eObject.eClass().getInstanceClass().getCanonicalName();
      return JavaPkgNameBridge.removePkgSuffixFromCanonicalClassName(className, pkgNameSuffixToRemove);
   }
}
