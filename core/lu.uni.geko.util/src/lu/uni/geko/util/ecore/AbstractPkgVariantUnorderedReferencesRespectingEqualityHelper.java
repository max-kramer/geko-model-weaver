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

import lu.uni.geko.util.bridges.JavaPkgNameBridge;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EOperationImpl;

/**
 * An abstract class to be extended by clients to compare variants of EObjects. Clients have to provide methods that return the
 * strings that are appended to the original metamodel package name, namespace URI or namespace prefix to obtain these of the
 * variant.<br/>
 * The implementation is based on {@link UnorderedReferencesRespectingEqualityHelper} that modifies
 * {@link org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper EcoreUtil.EqualityHelper} to ensure that unordered references are
 * considered equal even if they contain the same elements in different order.<br/>
 * <br/>
 * Note that we call the relation that we are defining and comparing with this class equivalence but that the used implementation
 * calls it equality.
 *
 * @see UnorderedReferencesRespectingEqualityHelper UnorderedReferencesRespectingEqualityHelper
 *
 * @author Max E. Kramer
 */
public abstract class AbstractPkgVariantUnorderedReferencesRespectingEqualityHelper extends
UnorderedReferencesRespectingEqualityHelper {
	/** The recommended unique identifier for serialising. */
	private static final long serialVersionUID = 0L;

	/**
	 * @return the string that was appended to the original metamodel package name to obtain the package name of the variant
	 */
	public abstract String getMMPkgNameAppendage();

	/**
	 * @return the string that was appended to the original metamodel package namespace URI to obtain the package namespace URI of
	 *         the variant
	 */
	public abstract String getMMPkgNsURIAppendage();

	/**
	 * @return the string that was appended to the original metamodel package namespace prefix to obtain the package namespace
	 *         prefix of the variant
	 */
	public abstract String getMMPkgNsPrefixAppendage();

	/**
	 * Returns whether the given eObject and the given variant of it are equivalent. <b>ATTENTION</b>: This equality is not
	 * symmetric! The object of the base has to be the first and the object of the advice has to be the second parameter!
	 *
	 * @param eObject
	 *           an eObject
	 * @param variantEObject
	 *           a variant of the given eObject
	 * @return {@code true} when the given eObjects are equivalent and {@code false} otherwise
	 */
	@Override
	public boolean equals(final EObject eObject, final EObject variantEObject) {
		// only "overridden" for the JavaDoc comment
		return super.equals(eObject, variantEObject);
	}

	/**
	 * Delegates all feature comparisons to
	 * {@link org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper#haveEqualFeature(EObject, EObject, EStructuralFeature)
	 * EcoreUtil.EqualityHelper#haveEqualFeature} except for the instanceClassName, instanceTypeName and ePackage features which
	 * are compared after removing the appendages that have to be defined for instances of this class.
	 *
	 * @param eObject
	 *           an eObject
	 * @param variantEObject
	 *           a variant of the given eObject
	 * @param feature
	 *           a feature of the given eObject and the given eVariant
	 * @return {@code true} when the given feature has equivalent values for the given eObject and variant
	 */
	@Override
	protected boolean haveEqualFeature(final EObject eObject, final EObject variantEObject, final EStructuralFeature feature) {
		String featureName = feature.getName();
		if (featureName.equals("instanceClassName") || featureName.equals("instanceTypeName") || featureName.equals("ePackage")) {
			Object value = eObject.eGet(feature);
			Object variantValue = variantEObject.eGet(feature);
			if (value instanceof String && variantValue instanceof String) {
				return haveEquivalentTypes(value, variantValue);
			} else if (value instanceof EPackage && variantValue instanceof EPackage) {
				return haveEquivalentPackages(value, variantValue);
			}
		} else if (eObject instanceof EOperationImpl && variantEObject instanceof EOperationImpl) {
			// FIXME remove this dirty hack once all gen model properties have been propagated to the variant gen models
			return true;
		}
		return super.haveEqualFeature(eObject, variantEObject, feature);
	}

	/**
	 * 
	 * Delegates all attribute comparison to 
	 * {@link org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper#haveEqualAttribute(EObject, EObject, EAttribute)}
	 * except for the case of EEnumLiteral, for which we compare the values and not the objects
	 * 
	 * @param eObject1
	 *           an EObject
	 * @param eObject2
	 *           the second object to compare
	 * @param attribute
	 *           the attribute to compare
	 * 
     * @return whether the two objects have equal values for the attribute.
     * 
     */
	@Override
	protected boolean haveEqualAttribute(EObject eObject1, EObject eObject2,
			EAttribute attribute) {
		// case of EEnumLiteral, compare the values and not the objects
		// FIXME remove this hack once we found out why literal values for base and advice are not the same objects
		if (eObject1 instanceof EEnumLiteral && eObject2 instanceof EEnumLiteral)
		{
			return (eObject1.eGet(attribute).toString().equals(eObject2.eGet(attribute).toString()));
		}
		else {
			return super.haveEqualAttribute(eObject1, eObject2, attribute);
		}
	}
	
	/**
	 * Returns whether the given value and the given value variant have equivalent types.
	 *
	 * @param value
	 *           a value
	 * @param variantValue
	 *           a variant of the given value
	 * @return whether the given value and the given value variant have equivalent types
	 */
	private boolean haveEquivalentTypes(final Object value, final Object variantValue) {
		String variantValueString = (String) variantValue;
		String[] splitClassName = variantValueString.split("\\.");
		String packageName = splitClassName[0];
		for (int i = 1; i < splitClassName.length - 1; i++) {
			packageName += "." + splitClassName[i];
		}
		if (packageName.endsWith(getMMPkgNameAppendage())) {
			variantValueString = JavaPkgNameBridge
					.removePkgSuffixFromCanonicalClassName(variantValueString, getMMPkgNameAppendage());
		}
		return value.equals(variantValueString);
	}

	/**
	 * Returns whether the given value and the given value variant have equivalent packages.
	 *
	 * @param value
	 *           a value
	 * @param variantValue
	 *           a variant of the given value
	 * @return whether the given value and the given value variant have equivalent packages
	 */
	private boolean haveEquivalentPackages(final Object value, final Object variantValue) {
		EPackage ePackage = ((EPackage) value);
		EPackage variantEPackage = ((EPackage) variantValue);
		String name = ePackage.getName();
		String variantName = JavaPkgNameBridge.removeSuffixFromPkgName(variantEPackage.getName(), getMMPkgNameAppendage());
		String nsURI = ePackage.getNsURI();
		String variantNsURI = JavaPkgNameBridge.removeSuffixFromPkgName(variantEPackage.getNsURI(), getMMPkgNsURIAppendage());
		String nsPrefix = ePackage.getNsPrefix();
		String variantNsPrefix = JavaPkgNameBridge.removeSuffixFromPkgName(variantEPackage.getNsPrefix(),
				getMMPkgNsPrefixAppendage());
		return name.equals(variantName) && nsURI.equals(variantNsURI) && nsPrefix.equals(variantNsPrefix);
	}
}

