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

/**
 * A helper for comparing equivalent variants of features using a {@link org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper
 * EcoreUtil.EqualityHelper}.
 *
 * @author Max E. Kramer
 */
public class FeatureEquivalenceHelper {
   /** The wrapped equality helper. */
   private final EqualityHelper equalityHelper;

   /**
    * Constructs a new FeatureEquivalenceHelper wrapping the given equality helper.
    *
    * @param equalityHelper
    *           a equality helper
    */
   public FeatureEquivalenceHelper(final EqualityHelper equalityHelper) {
      this.equalityHelper = equalityHelper;
   }

   /**
    * Returns whether the given first type is the same as the second type or a super-type of it.
    *
    * @param possiblySuperType
    *           the possibly super-type
    * @param possiblyExtendingType
    *           the possibly extending type
    * @return whether the given first type is the same as the second type or a super-type of it
    */
   public boolean isSameOrSuperType(final EClassifier possiblySuperType, final EClassifier possiblyExtendingType) {
      boolean sameType = equalityHelper.equals(possiblySuperType, possiblyExtendingType);
      if (sameType) {
         return true;
      } else {
         if (possiblySuperType instanceof EClass && possiblyExtendingType instanceof EClass) {
            EList<EClass> eAllSuperTypes = ((EClass) possiblySuperType).getEAllSuperTypes();
            EClassifier eObjectClassifier = EcoreBridge.getEObjectClassifier();
            return eAllSuperTypes.contains(possiblyExtendingType) || possiblyExtendingType.equals(eObjectClassifier);
         } else {
            return false;
         }
      }
   }

   /**
    * Returns a collection containing pairs of all features of the given targetEObject together with the equivalent feature of the
    * given sourceEObject (in this order).
    *
    * @param targetEObject
    *           a target eObject
    * @param sourceEObject
    *           a source eObject
    * @return a collection containing the equivalent feature pairs for the given objects
    */
   public Collection<Pair<EStructuralFeature, EStructuralFeature>> getEquivalentFeatures(final EObject targetEObject,
         final EObject sourceEObject) {
      boolean equalClasses = targetEObject.eClass().equals(sourceEObject.eClass());
      if (equalClasses) {
         return getCorrespondingFeaturesForEqualClasses(sourceEObject);
      } else {
         boolean equivalentClasses = equalityHelper.equals(targetEObject.eClass(), sourceEObject.eClass());
         if (equivalentClasses) {
            return getEquivalentFeaturesForEquivalentClasses(targetEObject, sourceEObject);
         }
         return getCorrespondingFeaturesForCommonSupertype(targetEObject, sourceEObject);
      }
   }

   /**
    * Returns a collection containing pairs of all features of the given targetEObject together with the equivalent feature of the
    * given sourceEObject (in this order).
    *
    * @param targetEObject
    *           a target eObject
    * @param sourceEObject
    *           a source eObject
    * @return a collection containing the equivalent feature pairs for the given objects
    */
   private Collection<Pair<EStructuralFeature, EStructuralFeature>> getEquivalentFeaturesForEquivalentClasses(
         final EObject targetEObject, final EObject sourceEObject) {
      Collection<Pair<EStructuralFeature, EStructuralFeature>> equivalentFeatures =
            new ArrayList<Pair<EStructuralFeature, EStructuralFeature>>();
      List<EStructuralFeature> sourceFeatures = sourceEObject.eClass().getEAllStructuralFeatures();
      for (EStructuralFeature sourceFeature : sourceFeatures) {
         EStructuralFeature targetFeature = getTargetEquivalentFeature(sourceEObject, targetEObject, sourceFeature);
         equivalentFeatures.add(new Pair<EStructuralFeature, EStructuralFeature>(targetFeature, sourceFeature));
      }
      return equivalentFeatures;
   }

   /**
    * Returns a collection containing pairs of all features of the given targetEObject together with the equivalent feature of the
    * given sourceEObject (in this order).
    *
    * @param targetEObject
    *           a target eObject
    * @param sourceEObject
    *           a source eObject
    * @param sourceFeature
    *           a feature of the given source eObject
    * @return the equivalent target feature
    */
   public EStructuralFeature getTargetEquivalentFeature(final EObject targetEObject, final EObject sourceEObject,
         final EStructuralFeature sourceFeature) {
      String featureName = sourceFeature.getName();
      EStructuralFeature baseFeature = sourceEObject.eClass().getEStructuralFeature(featureName);
      boolean equalFeatures = equalityHelper.equals(baseFeature, sourceFeature);
      if (equalFeatures) {
         return baseFeature;
      } else { // MAYDO MK support objects with ambiguous structural feature names (does ECore allow more than one feature for a
               // given name?)
         throw new RuntimeException("The base feature '" + baseFeature + "' and the advice feature '" + sourceFeature + "'"
               + "of the base object '" + sourceEObject + "' and the advice object '" + targetEObject + "'"
               + "have the same name but are not structurally equal!");
      }
   }

   /**
    * Returns a collection containing all features of the given source eObject as pair (always a pair containing the same element
    * twice).
    *
    * @param sourceEObject
    *           a source eObject
    *
    * @return a collection containing all features of the given object
    */
   private Collection<Pair<EStructuralFeature, EStructuralFeature>> getCorrespondingFeaturesForEqualClasses(
         final EObject sourceEObject) {
      Collection<Pair<EStructuralFeature, EStructuralFeature>> correspondingFeatures =
            new ArrayList<Pair<EStructuralFeature, EStructuralFeature>>();
      List<EStructuralFeature> sourceFeatures = sourceEObject.eClass().getEAllStructuralFeatures();
      for (EStructuralFeature sourceFeature : sourceFeatures) {
         correspondingFeatures.add(new Pair<EStructuralFeature, EStructuralFeature>(sourceFeature, sourceFeature));
      }
      return correspondingFeatures;
   }

   /**
    * Returns a collection containing pairs of all features of the given targetEObject together with the equivalent feature of the
    * given sourceEObject (in this order) based on the least unambiguous common compatible type.
    *
    * @param targetEObject
    *           a target eObject
    * @param sourceEObject
    *           a source eObject
    * @return a collection containing the equivalent feature pairs for the given objects
    */
   private Collection<Pair<EStructuralFeature, EStructuralFeature>> getCorrespondingFeaturesForCommonSupertype(
         final EObject targetEObject, final EObject sourceEObject) {
      // TODO MK support merge of objects that are not instances of the same class using
      // http://heikobehrens.net/2008/12/08/multiple-inheritance-and-the-least-unambiguous-common-compatible-type/
      // take care: sourceEObject can either be a base or an advice object
      return Collections.emptySet();
   }
}
