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
package lu.uni.geko.util.adapters;

import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EMFAdapter {
	public static URI getEMFUriForIResource(IResource iResource) {
		return URI.createPlatformResourceURI(iResource.getFullPath().toString(), true);
	}
	
	public static IPath getIPathForEMFUri(URI uri) {
		return new Path(uri.toPlatformString(true));
	}
	
	public static IFile getIFileForEMFUri(URI uri) {
		IPath path = getIPathForEMFUri(uri);
		return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
	}
	
	public static URI newUriWithStringAppendedToFilename(URI uri, String toAppend) {
		String fileExt = uri.fileExtension();
		if (fileExt != null) {
			URI uriWithoutFileExt = uri.trimFileExtension();
			String resultFileName = uriWithoutFileExt.lastSegment() + toAppend;
			return uriWithoutFileExt.trimSegments(1).appendSegment(resultFileName).appendFileExtension(fileExt);
		}
		else {
			throw new RuntimeException("The uri '" + uri + "' has no file extension so '" + toAppend + "' cannot be appended before the file extension!");
		}

	}

	public static String getCanonicalClassNameWithTrimmedPackageName(EObject eObject, String packageNameSuffixToBeRemoved) {
		String className = getCanonicalClassNameForEObject(eObject);
		return JavaAdapter.removePackageSuffixFromCanonicalClassName(className, packageNameSuffixToBeRemoved);
	}	
	
	public static String getCanonicalClassNameForEObject(EObject eObject) {
		return getCanonicalClassNameForEClassifier(eObject.eClass());
	}
	
	public static String getCanonicalClassNameForEClassifier(EClassifier eClassifier) {
		return eClassifier.getInstanceClass().getCanonicalName();
	}
	
	/**
	 * Returns a List containing the values for the given feature and eObject if the feature is many-typed and null otherwise.
	 */
	@SuppressWarnings("unchecked")
	public static List<EObject> getFeatureValuesIfManyTyped(EObject eObject, EStructuralFeature feature) {
		if (feature.isMany()) {
			Object featureValue = eObject.eGet(feature);
			if (featureValue instanceof List) {
				return (List<EObject>) featureValue;
			} else {
				throw new RuntimeException("The eFeature '" + feature + "' is many-valued but has a value '" + featureValue + "' that is not a List!");
			}
		} else {
			return null;
		}
	}
	
	public static Object getFeatureValueIfNotManyTyped(EObject eObject, EStructuralFeature feature) {
		if (!feature.isMany()) {
			Object featureValue = eObject.eGet(feature);
			if (!(featureValue instanceof List)) {
				return featureValue;
			} else {
				throw new RuntimeException("The eFeature '" + feature + "' is not many-valued but has a value '" + featureValue + "' that is a List!");
			}
		} else {
			return null;
		}
	}
	

	public static EClass getEClassByRemovingAPackageSuffix(EClass eClass, String packageNameSuffixToBeRemoved) {
		EClassifier classifierVariant = getEClassifierByRemovingAPackageSuffix(eClass, packageNameSuffixToBeRemoved);
		return ensureIsEClass(classifierVariant);
	}

	private static EClass ensureIsEClass(EClassifier eClassifier) {
		if (eClassifier instanceof EClass) {
			return (EClass) eClassifier;
		} else {
			throw new RuntimeException("The classifier variant '" + eClassifier + "' is not an EClass although its original is!");
		}
	}

	public static EClassifier getEClassifierByRemovingAPackageSuffix(EClassifier eClassifier, String packageNameSuffixToBeRemoved) {
		String originalPackageNsURI = eClassifier.getEPackage().getNsURI();
		String variantPackageNsURI = JavaAdapter.removePackageSuffixFromPackageName(originalPackageNsURI, packageNameSuffixToBeRemoved);						
		return getEClassifierInPackageVariant(eClassifier, variantPackageNsURI);
	}
	
	public static EClass getEClassByReplacingAPackageNsURISuffix(EClass eClass, String packageNameSuffixToBeRemoved, String packageNameSuffixReplacement) {
		EClassifier classifierVariant = getEClassifierByReplacingAPackageNsURISuffix(eClass, packageNameSuffixToBeRemoved, packageNameSuffixReplacement);
		return ensureIsEClass(classifierVariant);
	}
	
	public static EClassifier getEClassifierByReplacingAPackageNsURISuffix(EClassifier eClassifier, String packageNameSuffixToBeRemoved, String packageNameSuffixReplacement) {
		String originalPackageNsURI = eClassifier.getEPackage().getNsURI();
		String variantPackageNsURI = JavaAdapter.replacePackageSuffixInPackageName(originalPackageNsURI, packageNameSuffixToBeRemoved, packageNameSuffixReplacement);						
		return getEClassifierInPackageVariant(eClassifier, variantPackageNsURI);
	}

	private static EClassifier getEClassifierInPackageVariant(EClassifier eClassifier,
			String variantPackageNsURI) {
		EPackage packageVariant = EPackage.Registry.INSTANCE.getEPackage(variantPackageNsURI);
		String className = eClassifier.getName();
		return packageVariant.getEClassifier(className);
	}
	
	public static boolean equals(Object object1, Object object2) {
		if (object1 instanceof EObject && object2 instanceof EObject) {
			return EcoreUtil.equals((EObject) object1, (EObject) object2);
		} else {
			if (object1 != null) {
				return object1.equals(object2);
			} else { // object1 == null
				return object2 == null;
			}
		}
	}
	
	public static boolean isStringAttribute(EStructuralFeature eStructuralFeature) {
		if (eStructuralFeature instanceof EAttribute) {
			return isStringAttribute((EAttribute) eStructuralFeature);
		}
		return false;
	}
	
	public static boolean isStringAttribute(EAttribute eAttribute) {
		return eAttribute.getEType().getInstanceClassName().equals("java.lang.String");
	}
	
	public static Collection<Setting> getReferencesTo(EObject referencedEObject) {
		ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter.getCrossReferenceAdapter(referencedEObject);
		if (crossReferenceAdapter == null) {
			crossReferenceAdapter = new ECrossReferenceAdapter();
			referencedEObject.eResource().getResourceSet().eAdapters().add(crossReferenceAdapter);
		}
		return crossReferenceAdapter.getInverseReferences(referencedEObject);
	}

	public static EClassifier getEClassifierForName(String className) {
		return EcorePackage.eINSTANCE.getEClassifier(className);
	}
	
	public static Object eGetForFeatureName(EObject eObject, String featureName) {
		EStructuralFeature feature = eObject.eClass().getEStructuralFeature(featureName);
		return eObject.eGet(feature);
	}
}
