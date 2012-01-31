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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A utility class hiding details of the Ecore metamodel part of the Eclipse Modeling Framework API for recurring tasks that are
 * not project-specific.<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently only providing one
 * implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 */
public final class EcoreBridge {
   /** Utility classes should not have a public or default constructor. */
   private EcoreBridge() {
   }

   /**
    * Returns a list containing the values for the given feature and eObject if the feature is many-typed and {@code null}
    * otherwise.
    *
    * @param eObject
    *           an EObject having the given feature
    * @param feature
    *           a feature of the given eObject
    * @return a list containing the values for the given feature and eObject
    */
   @SuppressWarnings("unchecked")
   public static List<EObject> getFeatureValuesIfManyTyped(final EObject eObject, final EStructuralFeature feature) {
      if (feature.isMany()) {
         Object featureValue = eObject.eGet(feature);
         if (featureValue instanceof List) {
            return (List<EObject>) featureValue;
         } else {
            throw new RuntimeException("The eFeature '" + feature + "' is many-valued but has a value '" + featureValue
                  + "' that is not a List!");
         }
      } else {
         return null;
      }
   }

   /**
    * Returns the value for the given feature and eObject if the feature is not many-typed and {@code null} otherwise.
    *
    * @param eObject
    *           an EObject having the given feature
    * @param feature
    *           a feature of the given eObject
    * @return the values for the given feature and eObject
    */
   public static Object getFeatureValueIfNotManyTyped(final EObject eObject, final EStructuralFeature feature) {
      if (!feature.isMany()) {
         Object featureValue = eObject.eGet(feature);
         if (!(featureValue instanceof List)) {
            return featureValue;
         } else {
            throw new RuntimeException("The eFeature '" + feature + "' is not many-valued but has a value '" + featureValue
                  + "' that is a List!");
         }
      } else {
         return null;
      }
   }

   /**
    * Returns whether the given objects are "equal" using {@link org.eclipse.emf.ecore.util.EcoreUtil#equals(EObject, EObject)
    * EcoreUtil.equals(EObject, EObject)} for EObjects and {@link java.lang.Object#equals(Object) Object.equals(Object)}
    * otherwise.
    *
    * @param object1
    *           an object
    * @param object2
    *           an object
    * @return {@code true} if the objects are equal and {@code false} otherwise
    */
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

   /**
    * Returns whether the given feature is an attribute of type String.
    *
    * @param feature
    *           a feature
    * @return {@code true} if feature is a String attribute and {@code false} otherwise
    */
   public static boolean isStringAttribute(final EStructuralFeature feature) {
      if (feature instanceof EAttribute) {
         return isStringAttribute((EAttribute) feature);
      }
      return false;
   }

   /**
    * Returns whether the given attribute is of type String.
    *
    * @param attribute
    *           an attribute
    * @return {@code true} if attribute is of type String and {@code false} otherwise
    */
   public static boolean isStringAttribute(final EAttribute attribute) {
      return attribute.getEType().getInstanceClassName().equals("java.lang.String");
   }

   /**
    * Returns a collection containing all reference settings for references to the given EObject.
    *
    * @param referencedEObject
    *           the referenced EObject
    * @return a collection containing all settings for references to the given EObject
    */
   public static Collection<Setting> getReferencesTo(final EObject referencedEObject) {
      ECrossReferenceAdapter crossReferenceAdapter = ECrossReferenceAdapter.getCrossReferenceAdapter(referencedEObject);
      if (crossReferenceAdapter == null) {
         crossReferenceAdapter = new ECrossReferenceAdapter();
         referencedEObject.eResource().getResourceSet().eAdapters().add(crossReferenceAdapter);
      }
      return crossReferenceAdapter.getInverseReferences(referencedEObject);
   }

   /**
    * @return the classifier for the EObject metametaclass
    */
   public static EClassifier getEObjectClassifier() {
      return EcorePackage.eINSTANCE.getEClassifier("EObject");
   }

   /**
    * Returns the value for the feature with the given name and the given eObject.
    *
    * @param eObject
    *           an EObject having a feature with the given name
    * @param featureName
    *           the name of a feature of the given eObject
    * @return the value for the feature and eObject
    */
   public static Object getValueForFeatureName(final EObject eObject, final String featureName) {
      EStructuralFeature feature = eObject.eClass().getEStructuralFeature(featureName);
      return eObject.eGet(feature);
   }

   /**
    * Returns a set containing all direct and indirect contents of the given EObjects.
    *
    * @param eObjects
    *           container EObjects
    * @return a set containing all direct and indirect contents of the given EObjects
    *
    * @see org.eclipse.emf.ecore.EObject#eAllContents() EObject.eAllContents()
    */
   public static Set<EObject> getAllContentsSet(final Set<EObject> eObjects) {
      Set<EObject> allContentsSet = new HashSet<EObject>(eObjects);
      for (EObject eObject : eObjects) {
         Set<EObject> currentAllContentsSet = getAllContentsSet(eObject);
         allContentsSet.addAll(currentAllContentsSet);
      }
      return allContentsSet;
   }

   /**
    * Returns a set containing all direct and indirect contents of the given EObject.
    *
    * @param eObject
    *           container EObject
    * @return a set containing all direct and indirect contents of the given EObject
    *
    * @see org.eclipse.emf.ecore.EObject#eAllContents() EObject.eAllContents()
    */
   public static Set<EObject> getAllContentsSet(final EObject eObject) {
      Iterator<EObject> allContentsIterator = eObject.eAllContents();
      return getAllContentsSet(allContentsIterator);
   }

   /**
    * Returns a set containing all direct and indirect contents that can be resolved using the given iterator.
    *
    * @param allContentsIterator
    *           an iterator iterating over contained EObjects
    * @return a set containing all direct and indirect contents resolved through the iterator
    *
    * @see org.eclipse.emf.ecore.EObject#eAllContents() EObject.eAllContents()
    */
   protected static Set<EObject> getAllContentsSet(final Iterator<EObject> allContentsIterator) {
      Set<EObject> allContentsSet = new HashSet<EObject>();
      while (allContentsIterator.hasNext()) {
         EObject nextContent = allContentsIterator.next();
         allContentsSet.add(nextContent);
      }
      return allContentsSet;
   }

   /**
    * Returns an iterable for iterating over all direct and indirect contents of the given EObject.
    *
    * @param eObject
    *           container EObject
    * @return a direct and indirect content iterating iterable
    *
    * @see org.eclipse.emf.ecore.EObject#eAllContents() EObject.eAllContents()
    */
   public static Iterable<EObject> getAllContents(final EObject eObject) {
      return JavaBridge.toIterable(eObject.eAllContents());
   }

   /**
    * Returns whether the given eObject is contained indirectly in the given collection. Returns {@code false} if the eObject is
    * contained in the collection but no member of the collection is a real ancestor of the eObject (i.e. different from the
    * eObject).
    *
    * @param eObject
    *           an eObject
    * @param possibleContainers
    *           a collection of possible containers
    * @return {@code true} when the given EObjects is contained in a member of the collection but not itself member of the
    *         collection
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
