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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * An extension point that gives clients the possibility to define features (i.e. attributes or references) that should be ignored
 * when encountered in a pointcut and / or advice element.<br/>
 * <br/>
 * <b>Attention</b>: All registered extensions for this extension point are called in order of decreasing priority (i.e. starting
 * with the extension having the highest integer value priority). As soon as an extension returned that a certain feature should
 * be ignored in pointcut or advice elements no further extensions (i.e. the extensions with lower priority) will be taken into
 * consideration for this feature and this type of use. This means that ignoring features for pointcut and advice elements can be
 * separated completely from each other (if needed).
 *
 * @author Max E. Kramer
 */
public interface FeatureIgnorerExt {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.common.featureignorerext";

   /**
    * Returns whether the given feature with of the given pointcut element with the given value should be ignored during join
    * point detection.
    *
    * @param feature
    *           a structural feature of a metaclass
    * @param featureValue
    *           the value for the given feature and pointcut element
    * @param pcElement
    *           a pointcut element that is an instance of a metaclass that provides the given feature
    * @return {@code true} if the values for the given feature should have no effect on join point detection and {@code false}
    *         otherwise
    */
   boolean ignoreDuringJoinPointDetection(EStructuralFeature feature, Object featureValue, EObject pcElement);
}
