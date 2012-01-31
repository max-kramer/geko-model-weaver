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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;

public class FeatureCorresponder {
	private final EqualityHelper equalityHelper;

	public FeatureCorresponder(EqualityHelper equalityHelper) {
		this.equalityHelper = equalityHelper;
	}

	public boolean isSameOrSuperType(EClassifier possiblySuperType, EClassifier possiblyExtendingType) {
		boolean sameType = equalityHelper.equals(possiblySuperType, possiblyExtendingType);
		if (sameType) {
			return true;
		} else {
			if (possiblySuperType instanceof EClass && possiblyExtendingType instanceof EClass) {
				EList<EClass> eAllSuperTypes = ((EClass) possiblySuperType).getEAllSuperTypes();
				EClassifier eObjectClassifier = EcoreBridge.getEClassifierForName("EObject");
				return eAllSuperTypes.contains(possiblyExtendingType) || possiblyExtendingType.equals(eObjectClassifier);
			} else {
				return false;
			}
		}
	}

	public Collection<Pair<EStructuralFeature, EStructuralFeature>> getCorrespondingFeatures(EObject targetEObject, EObject sourceEObject) {
		boolean equalClasses = targetEObject.eClass().equals(sourceEObject.eClass());
		if (equalClasses) {
			return getCorrespondingFeaturesForEqualClasses(targetEObject, sourceEObject);
		} else {
			boolean equivalentClasses = equalityHelper.equals(targetEObject.eClass(), sourceEObject.eClass());
			if (equivalentClasses) {
				return getCorrespondingFeaturesForEquivalentClasses(targetEObject, sourceEObject);
			}
			return getCorrespondingFeaturesForCommonSupertype(targetEObject, sourceEObject);
		}
	}

	private Collection<Pair<EStructuralFeature, EStructuralFeature>> getCorrespondingFeaturesForEquivalentClasses(
			EObject targetEObject, EObject sourceEObject) {
		Collection<Pair<EStructuralFeature, EStructuralFeature>> correspondingFeatures = new ArrayList<Pair<EStructuralFeature, EStructuralFeature>>();
		List<EStructuralFeature> sourceFeatures = sourceEObject.eClass().getEAllStructuralFeatures();
		for (EStructuralFeature sourceFeature : sourceFeatures) {
         EStructuralFeature targetFeature = getCorrespondingBaseFeature(targetEObject, sourceEObject, sourceFeature);
         correspondingFeatures.add(new Pair<EStructuralFeature, EStructuralFeature>(targetFeature, sourceFeature));
		}
		return correspondingFeatures;
	}

   public EStructuralFeature getCorrespondingBaseFeature(EObject baseEObject, EObject adviceEObject,
         EStructuralFeature sourceFeature) {
      String featureName = sourceFeature.getName();
      EStructuralFeature baseFeature = baseEObject.eClass().getEStructuralFeature(featureName);
      boolean equalFeatures =  equalityHelper.equals(baseFeature, sourceFeature);
      if (equalFeatures) {
         return baseFeature;
      }
      else { // MAYDO MK support objects with ambiguous structural feature names (does ECore allow more than one feature for a given name?)
      	throw new RuntimeException("The base feature '" + baseFeature + "' and the advice feature '" + sourceFeature + "'" +
      			   "of the base object '" + baseEObject + "' and the advice object '" + adviceEObject + "'" +
      			   "have the same name but are not structurally equal!");
      }
   }

	private Collection<Pair<EStructuralFeature, EStructuralFeature>> getCorrespondingFeaturesForEqualClasses(
			EObject targetEObject, EObject sourceEObject) {
		Collection<Pair<EStructuralFeature, EStructuralFeature>> correspondingFeatures = new ArrayList<Pair<EStructuralFeature, EStructuralFeature>>();
		List<EStructuralFeature> sourceFeatures = sourceEObject.eClass().getEAllStructuralFeatures();
		for (EStructuralFeature sourceFeature : sourceFeatures) {
			correspondingFeatures.add(new Pair<EStructuralFeature, EStructuralFeature>(sourceFeature, sourceFeature));
		}
		return correspondingFeatures;
	}

	private Collection<Pair<EStructuralFeature, EStructuralFeature>>  getCorrespondingFeaturesForCommonSupertype(
			EObject targetEObject, EObject sourceEObject) {
		// TODO MK support merge of objects that are not instances of the same class using http://heikobehrens.net/2008/12/08/multiple-inheritance-and-the-least-unambiguous-common-compatible-type/
		// take care: sourceEObject can either be a base or an advice object
		return Collections.emptySet();
	}
}
