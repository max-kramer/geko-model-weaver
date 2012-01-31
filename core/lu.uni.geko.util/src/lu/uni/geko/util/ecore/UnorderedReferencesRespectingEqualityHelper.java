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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper;

/**
 * An implementation of {@link org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper} ensuring that unordered references are considered equal even if they contain the same elements in different order.
 * @author Max E. Kramer
 */
public class UnorderedReferencesRespectingEqualityHelper extends EqualityHelper {
   private static final long serialVersionUID = 9124541003082741985L;
   private final Map<EObject, Set<EObject>> eObject2EqualEObjectsMap = new HashMap<EObject, Set<EObject>>();

   // RATIONALE MK as EcoreUtil.EqualityHelper only uses methods from the inherited HashMap of EqualityHelper in the method
   // equals(EObject, EObject) it is sufficient to override this method and put(EObject,EObject) to fix EqualityHelper.
   // FIXME MK find out why the developers of EcoreUtil.EqualityHelper assumed (as stated in the JavaDoc comment for this class)
   // that an EObject is equal to AT MOST ONE EObject (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=369653)
   // FIXME MK find out why in EcoreUtil.EqualityHelper an entry is never removed in cases where they return false (see
   // https://bugs.eclipse.org/bugs/show_bug.cgi?id=369651)
   // FIXME MK Find out why two EObjects e1, e2 that are identical except for the fact that they contain the values for an
   // unordered many reference in another order are considered unequal (see https://bugs.eclipse.org/bugs/show_bug.cgi?id=369661)
   // FIXME MK replace workarounds with clean solutions once the 3 questions / bugs in this EcoreUtil have been answered / fixed
   @Override
   public boolean equals(EObject eObject1, EObject eObject2) {
      // UNCHANGED CODE from EcoreUtil.EqualityHelper except for four marked modification

      // If the first object is null, the second object must be null.
      //
      if (eObject1 == null) {
         return eObject2 == null;
      }

      // We know the first object isn't null, so if the second one is, it can't be equal.
      //
      if (eObject2 == null) {
         return false;
      }

      // Both eObject1 and eObject2 are not null.
      // If eObject1 has been compared already...
      //
      // ### BEGIN MK EQUALITYHELPER MODIFICATION 1 / 5 ###
      // Object eObject1MappedValue = get(eObject1);
      // if (eObject1MappedValue != null)
      // {
      // // Then eObject2 must be that previous match.
      // //
      // return eObject1MappedValue == eObject2;
      // }
      //
      // // If eObject2 has been compared already...
      // //
      // Object eObject2MappedValue = get(eObject2);
      // if (eObject2MappedValue != null)
      // {
      // // Then eObject1 must be that match.
      // //
      // return eObject2MappedValue == eObject1;
      // }
      Set<EObject> equalEObjects = eObject2EqualEObjectsMap.get(eObject1);
      if (equalEObjects == null) {
         equalEObjects = eObject2EqualEObjectsMap.get(eObject2);
         if (equalEObjects != null) {
            if (equalEObjects.contains(eObject1)) {
               return true;
            }
         }
      } else {
         if (equalEObjects.contains(eObject2)) {
            return true;
         }
      }
      // ### END MK EQUALITYHELPER MODIFICATION 1 / 5 ###
      // Neither eObject1 nor eObject2 have been compared yet.

      // If eObject1 and eObject2 are the same instance...
      //
      if (eObject1 == eObject2) {
         // Match them and return true.
         //
         // ### BEGIN MK EQUALITYHELPER MODIFICATION 2 / 5 ###
         // put(eObject1, eObject2);
         // put(eObject2, eObject1);
         putCorrectlyAndSymmetrically(eObject1, eObject2);
         putCorrectlyAndSymmetrically(eObject2, eObject1);
         // ### END MK EQUALITYHELPER MODIFICATION 2 / 5 ###
         return true;
      }

      // If eObject1 is a proxy...
      //
      if (eObject1.eIsProxy()) {
         // Then the other object must be a proxy with the same URI.
         //
         if (((InternalEObject) eObject1).eProxyURI().equals(((InternalEObject) eObject2).eProxyURI())) {
            // ### BEGIN MK EQUALITYHELPER MODIFICATION 3 / 5 ###
            // put(eObject1, eObject2);
            // put(eObject2, eObject1);
            putCorrectlyAndSymmetrically(eObject1, eObject2);
            putCorrectlyAndSymmetrically(eObject2, eObject1);
            // ### END MK EQUALITYHELPER MODIFICATION 3 / 5 ###
            return true;
         } else {
            return false;
         }
      }
      // If eObject1 isn't a proxy but eObject2 is, they can't be equal.
      //
      else if (eObject2.eIsProxy()) {
         return false;
      }

      // If they don't have the same class, they can't be equal.
      //
      EClass eClass = eObject1.eClass();
      if (eClass != eObject2.eClass()) {
         return false;
      }

      // Assume from now on that they match.
      //
      // ### BEGIN MK EQUALITYHELPER MODIFICATION 4 / 5 ###
      // put(eObject1, eObject2);
      // put(eObject2, eObject1);
      putCorrectlyAndSymmetrically(eObject1, eObject2);
      putCorrectlyAndSymmetrically(eObject2, eObject1);
      // ### END MK EQUALITYHELPER MODIFICATION 4 / 5 ###

      // Check all the values.
      //
      for (int i = 0, size = eClass.getFeatureCount(); i < size; ++i) {
         // Ignore derived features.
         //
         EStructuralFeature feature = eClass.getEStructuralFeature(i);
         if (!feature.isDerived()) {
            if (!haveEqualFeature(eObject1, eObject2, feature)) {
               // ### BEGIN MK EQUALITYHELPER MODIFICATION 5 / 5 ###
               removeCorrectlyAndSymmetrically(eObject1, eObject2);
               // ### END MK EQUALITYHELPER MODIFICATION 5 / 5 ###
               return false;
            }
         }
      }

      // There's no reason they aren't equal, so they are.
      //
      return true;
   }

   private void putCorrectlyAndSymmetrically(EObject eObject1, EObject eObject2) {
      putCorrectly(eObject1, eObject2);
      putCorrectly(eObject2, eObject1);
   }

   private void putCorrectly(EObject key, EObject value) {
      Set<EObject> equalEObjects = eObject2EqualEObjectsMap.get(key);
      if (equalEObjects == null) {
         equalEObjects = new HashSet<EObject>();
         eObject2EqualEObjectsMap.put(key, equalEObjects);
      }
      equalEObjects.add(value);
   }

   private void removeCorrectlyAndSymmetrically(EObject eObject1, EObject eObject2) {
      removeCorrectly(eObject1, eObject2);
      removeCorrectly(eObject2, eObject1);
   }

   private void removeCorrectly(EObject key, EObject value) {
      Set<EObject> equalEObjects = eObject2EqualEObjectsMap.get(key);
      if (equalEObjects == null) {
         throw new RuntimeException("Cannot remove equality mapping from '" + key + "' to '" + value + "' as it does not exist!");
      } else {
         equalEObjects.remove(value);
      }
   }

   @SuppressWarnings("unchecked")
   @Override
   protected boolean haveEqualReference(EObject eObject1, EObject eObject2, EReference reference) {
      if (!reference.isMany() || reference.isOrdered()) {
         return super.haveEqualReference(eObject1, eObject2, reference);
      } else {
         Object value1 = eObject1.eGet(reference);
         Object value2 = eObject2.eGet(reference);
         // now we know that the reference is an unordered list
         return equalsIgnoreOrder((List<EObject>) value1, (List<EObject>) value2);
      }
   }

   public boolean equalsIgnoreOrder(List<EObject> list1, List<EObject> list2) {
      int size1 = list1.size();
      if (size1 != list2.size()) {
         return false;
      } else if (size1 == 0) {
         return true;
      } else if (size1 == 1) {
         return equals(list1.get(0), list2.get(0));
      }
      // RATIONALE MK we cannot avoid comparing "every" element of list1 with "every" element of list2
      // but we can remove equal elements to speed up the comparison
      // as long as comparison is more expensive than the creation of two list copies this pays off
      List<EObject> list1Copy = new LinkedList<EObject>(list1);
      List<EObject> list2Copy = new LinkedList<EObject>(list2);
      Iterator<EObject> list1Iterator = list1Copy.iterator();
      while (list1Iterator.hasNext() && !list2Copy.isEmpty()) {
         EObject list1Element = list1Iterator.next();
         boolean matched = false;
         Iterator<EObject> list2Iterator = list2Copy.iterator();
         while (list2Iterator.hasNext() && !matched) {
            EObject list2Element = list2Iterator.next();
            matched = equals(list1Element, list2Element);
         }
         if (matched) {
            list1Iterator.remove();
            list2Iterator.remove();
         } else {
            return false;
         }
      }
      return true;
   }
}
