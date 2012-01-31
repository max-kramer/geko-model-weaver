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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EcoreBridge {
	public static URI getEMFUriForIResource(final IResource iResource) {
		return URI.createPlatformResourceURI(iResource.getFullPath().toString(), true);
	}

	public static IPath getIPathForEMFUri(final URI uri) {
		return new Path(uri.toPlatformString(true));
	}

	public static IFile getIFileForEMFUri(final URI uri) {
		IPath path = getIPathForEMFUri(uri);
		return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
	}

	public static URI newURIWithStringAppendedToFilename(final URI uri, final String toAppend) {
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

	public static String getCanonicalClassNameForEObject(final EObject eObject) {
		return getCanonicalClassNameForEClassifier(eObject.eClass());
	}

	public static String getCanonicalClassNameForEClassifier(final EClassifier eClassifier) {
		return eClassifier.getInstanceClass().getCanonicalName();
	}

	/**
	 * Returns a List containing the values for the given feature and eObject if the feature is many-typed and null otherwise.
	 */
	@SuppressWarnings("unchecked")
	public static List<EObject> getFeatureValuesIfManyTyped(final EObject eObject, final EStructuralFeature feature) {
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

	public static Object getFeatureValueIfNotManyTyped(final EObject eObject, final EStructuralFeature feature) {
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

  public static boolean equals(final Object object1, final Object object2) {
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

	public static boolean isStringAttribute(final EStructuralFeature eStructuralFeature) {
		if (eStructuralFeature instanceof EAttribute) {
			return isStringAttribute((EAttribute) eStructuralFeature);
		}
		return false;
	}

	public static boolean isStringAttribute(final EAttribute eAttribute) {
		return eAttribute.getEType().getInstanceClassName().equals("java.lang.String");
	}

	public static Collection<Setting> getReferencesTo(final EObject referencedEObject) {
		ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter.getCrossReferenceAdapter(referencedEObject);
		if (crossReferenceAdapter == null) {
			crossReferenceAdapter = new ECrossReferenceAdapter();
			referencedEObject.eResource().getResourceSet().eAdapters().add(crossReferenceAdapter);
		}
		return crossReferenceAdapter.getInverseReferences(referencedEObject);
	}

	public static EClassifier getEClassifierForName(final String className) {
		return EcorePackage.eINSTANCE.getEClassifier(className);
	}

	public static Object eGetForFeatureName(final EObject eObject, final String featureName) {
		EStructuralFeature feature = eObject.eClass().getEStructuralFeature(featureName);
		return eObject.eGet(feature);
	}

	public static Set<EObject> getAllContentsSet(final Set<EObject> eObjects) {
		Set<EObject> allContentsSet = new HashSet<EObject>(eObjects);
		for (EObject eObject : eObjects) {
			Set<EObject> currentAllContentsSet = getAllContentsSet(eObject);
			allContentsSet.addAll(currentAllContentsSet);
		}
		return allContentsSet;
	}

	public static Iterable<EObject> getAllContents(final EObject eObject) {
		return JavaBridge.toIterable(eObject.eAllContents());
	}

	public static Set<EObject> getAllContentsSet(final EObject eObject) {
		Iterator<EObject> allContentsIterator = eObject.eAllContents();
		return getAllContentsSet(allContentsIterator);
	}

	public static Set<EObject> getAllContentsSet(final Iterator<EObject> allContentsIterator) {
		Set<EObject> allContentsSet = new HashSet<EObject>();
		while (allContentsIterator.hasNext()) {
			EObject nextContent = allContentsIterator.next();
			allContentsSet.add(nextContent);
		}
		return allContentsSet;
	}

   /**
    * Returns whether the first eObject is contained indirectly in the second collection of eObjects. Returns <code>false</code>
    * if the first eObject is contained in the second collection but no member of the collection is a real ancestor of the first
    * eObject.
    *
    * @param eObject
    * @param possibleContainers
    * @return
    */
   public static boolean isReallyIndirectlyContained(final EObject eObject, final Collection<EObject> possibleContainers) {
      Collection<EObject> cleanedPossibleContainers;
      if (possibleContainers.contains(eObject)) {
         cleanedPossibleContainers = new ArrayList<EObject>(possibleContainers);
         cleanedPossibleContainers.remove(eObject);
      } else {
         cleanedPossibleContainers = possibleContainers;
      }
      return EcoreUtil.isAncestor(cleanedPossibleContainers, eObject);
   }
}
