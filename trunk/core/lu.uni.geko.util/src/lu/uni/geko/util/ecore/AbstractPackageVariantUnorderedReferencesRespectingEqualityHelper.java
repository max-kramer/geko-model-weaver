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

import lu.uni.geko.util.adapters.JavaAdapter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public abstract class AbstractPackageVariantUnorderedReferencesRespectingEqualityHelper extends UnorderedReferencesRespectingEqualityHelper {
   private static final long serialVersionUID = 244404966675802867L;

   public abstract String getMMPkgNameAppendage();

   public abstract String getMMPkgNsURIAppendage();

   public abstract String getMMPkgNsPrefixAppendage();

   /**
    * ATTENTION: This equality is not symmetric! The object of the base has to be the first and the object of the advice has to be the second parameter!
    */
   @Override
   public boolean equals(EObject eObject, EObject variantEObject) {
      // only "overridden" for the JavaDoc comment
      return super.equals(eObject, variantEObject);
   }

   @Override
   protected boolean haveEqualFeature(EObject eObject,
         EObject variantEObject, EStructuralFeature feature) {
      String featureName = feature.getName();
      if (featureName.equals("instanceClassName") || featureName.equals("instanceTypeName") || featureName.equals("ePackage")) {
         Object value = eObject.eGet(feature);
         Object variantValue = variantEObject.eGet(feature);
         if (value instanceof String && variantValue instanceof String) {
            String variantValueString = (String) variantValue;
            String[] splitClassName = variantValueString.split("\\.");
            String packageName = splitClassName[0];
            for (int i = 1; i < splitClassName.length - 1; i++) {
               packageName += "." + splitClassName[i];
            }
            if (packageName.endsWith(getMMPkgNameAppendage())) {
               variantValueString = JavaAdapter.removePackageSuffixFromCanonicalClassName(variantValueString, getMMPkgNameAppendage());
            }
            return value.equals(variantValueString);
         } else if (value instanceof EPackage && variantValue instanceof EPackage) {
            EPackage ePackage = ((EPackage) value);
            EPackage variantEPackage = ((EPackage) variantValue);
            String name = ePackage.getName();
            String variantName = JavaAdapter.removePackageSuffixFromPackageName(variantEPackage.getName(), getMMPkgNameAppendage());
            String nsURI = ePackage.getNsURI();
            String variantNsURI = JavaAdapter.removePackageSuffixFromPackageName(variantEPackage.getNsURI(), getMMPkgNsURIAppendage());
            String nsPrefix = ePackage.getNsPrefix();
            String variantNsPrefix = JavaAdapter.removePackageSuffixFromPackageName(variantEPackage.getNsPrefix(), getMMPkgNsPrefixAppendage());
            return name.equals(variantName) && nsURI.equals(variantNsURI) && nsPrefix.equals(variantNsPrefix);
         }
      }
      return super.haveEqualFeature(eObject, variantEObject, feature);
   }
}
