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
package lu.uni.geko.common;

import lu.uni.geko.util.ecore.AbstractPkgVariantUnorderedReferencesRespectingEqualityHelper;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A class for determining whether advice elements are equivalent to base elements. Its implementations uses
 * {@link org.eclipse.emf.ecore.util.EcoreUtil.EqualityHelper EcoreUtil.EqualityHelper} with two modifications to remove suffixes
 * from package variants and to respect unordered references.
 *
 * @see lu.uni.geko.util.ecore.AbstractPkgVariantUnorderedReferencesRespectingEqualityHelper
 *      AbstractPackageVariantUnorderedReferencesRespectingEqualityHelper
 *
 * @author Max E. Kramer
 */
public class Av2BaseEqualityHelper extends AbstractPkgVariantUnorderedReferencesRespectingEqualityHelper {
   /** Generated unique version ID for serialising. */
   private static final long serialVersionUID = 3881034521888762017L;

   @Override
   protected final boolean haveEqualFeature(final EObject baseEObject, final EObject adviceEObject, final EStructuralFeature feature) {
      String featureName = feature.getName();
      if (featureName.equals("lowerBound")) {
         // as we set all lower bounds to zero in the advice mm we have to interpret every lower bound of the base mm as equal
         return true;
      } else if (featureName.equals("abstract")) {
         // as we set the abstract feature of all metaclasses of the advice mm to false we have to interpret every setting of a
         // base metaclass as the same
         return true;
         // TODO MK check for more than the feature name when comparing the lowerBound and abstract feature (in order not to
         // determine something as equal that has another than the meant features bearing the same name)
      }
      return super.haveEqualFeature(baseEObject, adviceEObject, feature);
   }

   @Override
   public final String getMMPkgNameAppendage() {
      return GeKoConstants.getAvMMPkgNameAppendage();
   }

   @Override
   public final String getMMPkgNsURIAppendage() {
      return GeKoConstants.getAvMMPkgNsURIAppendage();
   }

   @Override
   public final String getMMPkgNsPrefixAppendage() {
      return GeKoConstants.getAvMMPkgNsPrefixAppendage();
   }
}
