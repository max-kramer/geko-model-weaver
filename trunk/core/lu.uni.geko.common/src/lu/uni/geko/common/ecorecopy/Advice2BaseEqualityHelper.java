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
import lu.uni.geko.util.adapters.JavaAdapter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

public class Advice2BaseEqualityHelper extends UnorderedReferencesRespectingEqualityHelper {
	private static final long serialVersionUID = 244404966675802867L;

	@Override
	protected boolean haveEqualFeature(EObject baseEObject,
			EObject adviceEObject, EStructuralFeature feature) {
		String featureName = feature.getName();
		if (featureName.equals("instanceClassName") || featureName.equals("instanceTypeName") || featureName.equals("ePackage")) {
			Object baseValue = baseEObject.eGet(feature);
			Object adviceValue = adviceEObject.eGet(feature);
			if (baseValue instanceof String && adviceValue instanceof String) {
				String adviceValueString = (String) adviceValue;
				String[] splitClassName = adviceValueString.split("\\.");
				String packageName = splitClassName[0];
				for (int i = 1; i < splitClassName.length - 1; i++) {
					packageName += "." + splitClassName[i];
				}
				if (packageName.endsWith(GeKoConstants.ADVICE_MM_PACKAGE_NAME_APPENDAGE)) {
					adviceValueString = JavaAdapter.removePackageSuffixFromCanonicalClassName(adviceValueString, GeKoConstants.ADVICE_MM_PACKAGE_NAME_APPENDAGE);
				}
				return baseValue.equals(adviceValueString);
			} else if (baseValue instanceof EPackage && adviceValue instanceof EPackage) {
				EPackage basePackage = ((EPackage) baseValue);
				EPackage advicePackage = ((EPackage) adviceValue);
				String baseName = basePackage.getName();
				String adviceName = JavaAdapter.removePackageSuffixFromPackageName(advicePackage.getName(), GeKoConstants.ADVICE_MM_PACKAGE_NAME_APPENDAGE);
				String baseNsURI = basePackage.getNsURI();
				String adviceNsURI = JavaAdapter.removePackageSuffixFromPackageName(advicePackage.getNsURI(), GeKoConstants.ADVICE_MM_PACKAGE_NSURI_APPENDAGE);
				String baseNsPrefix = basePackage.getNsPrefix();
				String adviceNsPrefix = JavaAdapter.removePackageSuffixFromPackageName(advicePackage.getNsPrefix(), GeKoConstants.ADVICE_MM_PACKAGE_NSPREFIX_APPENDAGE);
				return baseName.equals(adviceName) && baseNsURI.equals(adviceNsURI) && baseNsPrefix.equals(adviceNsPrefix);
			}
		} else if (featureName.equals("lowerBound")) {
			// as we set all lower bounds to zero in the advice mm we have to interpret every lower bound of the base mm as equal
			return true;
		} else if (featureName.equals("abstract")) {
			// as we set the abstract feature of all metaclasses of the advice mm to false we have to interpret every setting of a base metaclass as the same
			return true;
			// TODO MK check for more than the feature name when comparing the lowerBound and abstract feature (in order not to determine something as equal that has another than the meant features bearing the same name)
		}
		return super.haveEqualFeature(baseEObject, adviceEObject, feature);
	}

   /**
    * ATTENTION: This equality is not symmetric! The object of the base has to be the first and the object of the advice has to be the second parameter!
    */
   @Override
   public boolean equals(EObject baseEObject, EObject adviceEObject) {
      // only "overridden" for the JavaDoc comment
      return super.equals(baseEObject, adviceEObject);
   }
}
