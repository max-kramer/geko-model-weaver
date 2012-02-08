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
package lu.uni.geko.joinpointdetection;

import java.util.List;
import java.util.concurrent.Callable;

import lu.uni.geko.common.JoinPoint;
import lu.uni.geko.util.bridges.EclipseBridge;

import org.eclipse.emf.common.util.URI;

/**
 * A utility class to access the functionality provided by extensions of the @ link JoinpointDetector} extension point.
 *
 * @see JoinpointDetectorExt
 *
 * @author Max E. Kramer
 */
public final class MainJoinpointDetector {
   /** Utility classes should not have a public or default constructor. */
   private MainJoinpointDetector() {
   }

   /**
    * Detects the joinpoints for the pointcut and base model at the given URIs and returns them. The execution is performed by the
    * registered mandatory and unique extension of the JoinpointDetector extension point. Throws a
    * {@link java.lang.RuntimeException RuntimeException} if no extension or more than one extensions are registered.
    *
    * @param pointcutMURI
    *           the URI of the pointcut model
    * @param baseMURI
    *           the URI of the base model
    * @return a list containing all detected join points
    */
   public static List<JoinPoint> detectJoinpoints(final URI pointcutMURI, final URI baseMURI) {
      final JoinpointDetectorExt joinpointDetector = EclipseBridge.getUniqueRegisteredExtension(JoinpointDetectorExt.ID,
            "class", JoinpointDetectorExt.class);

      Callable<List<JoinPoint>> callable = new Callable<List<JoinPoint>>() {
         @Override
         public List<JoinPoint> call() {
            return joinpointDetector.detectJoinpoints(pointcutMURI, baseMURI);
         }
      };
      return EclipseBridge.callInProtectedMode(callable);
   }
}
