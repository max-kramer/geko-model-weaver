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
package lu.uni.geko.ext.ifc;

import lu.uni.geko.common.FeatureIgnorerExt;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * An extension for the {@link FeatureIgnorerExt FeatureIgnorerExt} extension point that makes sure that some default feature
 * values are not taken into account during join point detection.
 *
 * @author Max E. Kramer
 */
public class IfcFeatureIgnorer implements FeatureIgnorerExt {

   @Override
   public boolean ignoreDuringJoinPointDetection(final EStructuralFeature feature, final Object featureValue, final EObject pcElement) {
      if ("compositionType".equals(feature.getName()) && featureValue != null && "COMPLEX".equals(featureValue.toString())) {
         return true;
      }
      return false;
   }
}
