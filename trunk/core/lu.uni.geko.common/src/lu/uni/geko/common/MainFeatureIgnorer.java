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

import java.util.List;
import java.util.concurrent.Callable;

import lu.uni.geko.util.bridges.EclipseBridge;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A utility class to access the functionality provided by extensions of the {@link FeatureIgnorerExt} extension point.
 *
 * @see FeatureIgnorerExt
 *
 * @author Max E. Kramer
 */
public final class MainFeatureIgnorer {
   /** Utility classes should not have a public or default constructor. */
   private MainFeatureIgnorer() {
   }

   /**
    * Returns whether the given feature of the given pointcut element with the given value should be ignored during join point
    * detection.<br/>
    * <br/>
    * <b>Attention</b>: All registered extensions for this extension point are called in order of decreasing priority (i.e.
    * starting with the extension having the highest integer value priority). As soon as an extension returned that the given
    * feature should be ignored no further extensions (i.e. the extensions with lower priority) will be taken into consideration
    * for this feature during join point detection.
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
   public static boolean ignoreDuringJoinPointDetection(final EStructuralFeature feature, final Object featureValue,
         final EObject pcElement) {
      List<FeatureIgnorerExt> featureIgnorers = GeKoBridge.getRegisteredExtensionsInDescPriority(FeatureIgnorerExt.ID,
            FeatureIgnorerExt.class);
      boolean ignoreFeature = false;
      for (final FeatureIgnorerExt featureIgnorer : featureIgnorers) {
         Callable<Boolean> callable = new Callable<Boolean>() {
            @Override
            public Boolean call() {
               return featureIgnorer.ignoreDuringJoinPointDetection(feature, featureValue, pcElement);
            }
         };
         ignoreFeature = EclipseBridge.callInProtectedMode(callable);
         if (ignoreFeature) {
            break;
         }
      }
      return ignoreFeature;
   }
}
