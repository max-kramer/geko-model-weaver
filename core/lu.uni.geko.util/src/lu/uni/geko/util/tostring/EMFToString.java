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
package lu.uni.geko.util.tostring;

import java.util.List;

import lu.uni.geko.util.bridges.EcoreBridge;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A utility class for providing custom string representations of models conforming to Ecore metamodels similar to the default
 * {@link java.lang.Object#toString() Object.toString()}.<br/>
 * <br/>
 * (Note that this class itself does not use the fact that it allows instances of it to be created but overrides behaviour of
 * {@link ToString}. If Java would allow static methods to be overridden (nobody knows how) we could implement this the way a
 * utility class should be implemented.)
 *
 * @author Max E. Kramer
 */
public final class EMFToString extends ToString {
   /** The singleton instance variable for this class. */
   private static final EMFToString INSTANCE = new EMFToString();

   /** Singleton classes should not have a public or default constructor. */
   private EMFToString() {
   }

   /**
    * @return the singleton instance of this class
    */
   public static EMFToString getInstance() {
      return INSTANCE;
   }

   @Override
   protected String toString(final Object object, final int indentLevel) {
      if (object instanceof EObject) {
         return toString((EObject) object, indentLevel);
      }
      return super.toString(object, indentLevel);
   }

   /**
    * @param eObject
    *           an eObject
    * @param indentLevel
    *           the level of indentation
    * @return a custom string representation of the given eObject using the given level of indentation
    */
   protected String toString(final EObject eObject, final int indentLevel) {
      StringBuilder s = new StringBuilder();
      String eObjectID = getEObjectID(eObject);
      s.append(eObjectID + "<");
      EList<EStructuralFeature> eAllStructuralFeatures = eObject.eClass().getEAllStructuralFeatures();
      int featureCount = eAllStructuralFeatures.size();
      if (featureCount > 0) {
         s.append("\n");
         String indentation = getIndentation(indentLevel + 1);
         boolean previousEntryNotSkipped = appendFeatureNameAndValueIfNotNull(s, indentation, eObject, eAllStructuralFeatures, 0);
         for (int i = 1; i < featureCount; i++) {
            String prefix = "";
            if (previousEntryNotSkipped) {
               prefix = ",\n";
            }
            previousEntryNotSkipped = appendFeatureNameAndValueIfNotNull(s, prefix + indentation, eObject,
                  eAllStructuralFeatures, i);
         }
         s.append("\n");
      }
      s.append(">" + eObjectID);
      return s.toString();
   }

   /**
    * Appends the name of the feature with the given feature index together with its value for the given eObject to the given
    * StringBuilder using the given prefix if the feature value is not {@code null}.
    *
    * @param s
    *           the StringBuilder to append to
    * @param prefix
    *           the prefix to be appended before the feature name and value
    * @param eObject
    *           the eObject for which the feature value should be appended
    * @param features
    *           a list containing features of the given eObject
    * @param featureIndex
    *           the index of the feature to be appended in the given list
    *
    * @return whether something was append or not
    */
   private boolean appendFeatureNameAndValueIfNotNull(final StringBuilder s, final String prefix, final EObject eObject,
         final EList<EStructuralFeature> features, final int featureIndex) {
      String featureNameAndValue = getFeatureNameAndValueAtIndex(eObject, features, featureIndex);
      if (featureNameAndValue != null) {
         s.append(prefix + featureNameAndValue);
         return true;
      } else {
         return false;
      }
   }

   /**
    * Returns a ID for the given eObject consisting of the class name and the hash code.
    *
    * @param eObject
    *           an eObject
    * @return the ID
    */
   private String getEObjectID(final EObject eObject) {
      return eObject.eClass().getName() + "#" + eObject.hashCode();
   }

   /**
    * Returns the name of the feature with the given feature index together with its value for the given eObject if the feature
    * value is not {@code null}. Returns {@code null} otherwise.
    *
    * @param eObject
    *           the eObject for which the feature value should be returned
    * @param features
    *           a list containing features of the given eObject
    * @param featureIndex
    *           the index of the feature to be returned in the given list
    * @return the feature name and value separated by "="
    */
   private String getFeatureNameAndValueAtIndex(final EObject eObject, final EList<EStructuralFeature> features,
         final int featureIndex) {
      StringBuilder s = new StringBuilder();
      EStructuralFeature feature = features.get(featureIndex);
      s.append(feature.getName() + "=");
      Object featureValue = EcoreBridge.getFeatureValueIfNotManyTyped(eObject, feature);
      if (feature instanceof EReference) {
         s.append("EReference->");
         if (feature.isMany()) {
            List<EObject> featureValues = EcoreBridge.getFeatureValuesIfManyTyped(eObject, feature);
            s.append("{");
            int referenceCount = featureValues.size();
            if (referenceCount > 0) {
               EObject referenceValue = featureValues.get(0);
               s.append(getEObjectID(referenceValue));
               for (int i = 1; i < referenceCount; i++) {
                  referenceValue = featureValues.get(i);
                  s.append(", " + getEObjectID(referenceValue));
               }
            } else {
               // do not print attributes that refer nothing
               return null;
            }
            s.append("}");
         } else {
            if (featureValue instanceof EObject) {
               s.append(getEObjectID((EObject) featureValue));
            } else if (featureValue == null) {
               // do not print attributes that refer nothing
               return null;
            } else {
               throw new RuntimeException("The feature '" + feature + "' is a reference but its value for '" + eObject + "' is '"
                     + featureValue + "' which is not an EObject!");
            }
         }
      } else {
         String featureValueString = toString(featureValue, 0);
         if (featureValueString.equals("null")) {
            return null;
         } else {
            s.append(featureValueString);
         }
      }
      return s.toString();
   }
}
