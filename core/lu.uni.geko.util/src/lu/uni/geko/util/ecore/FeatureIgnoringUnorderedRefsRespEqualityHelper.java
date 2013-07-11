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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * An abstract class to be extended by clients to compare variants of EObjects while ignoring
 * certain features. The implementation is based on
 * {@link UnorderedReferencesRespectingEqualityHelper} that ensures that values of unordered
 * references are considered equal if they contain the same elements in different order.
 *
 * @see UnorderedReferencesRespectingEqualityHelper
 *
 * @author Max E. Kramer
 */
public abstract class FeatureIgnoringUnorderedRefsRespEqualityHelper extends UnorderedReferencesRespectingEqualityHelper {
   /** The recommended unique identifier for serialising. */
   private static final long serialVersionUID = 0L;

   /**
    * Returns whether the given feature should be ignored for the given objects.
    *
    * @param eObject1
    *           an EObject
    * @param eObject2
    *           an EObject
    * @param feature
    *           a structural feature present in both given EObjects
    * @return {@code true} if the given feature should be ignored for the given objects
    */
   public abstract boolean ignoreFeature(EObject eObject1, EObject eObject2, EStructuralFeature feature);

   @Override
   protected final boolean haveEqualFeature(final EObject eObject1, final EObject eObject2, final EStructuralFeature feature) {
      if (ignoreFeature(eObject1, eObject2, feature)) {
         return true;
      } else {
         return super.haveEqualFeature(eObject1, eObject2, feature);
      }
   }
}
