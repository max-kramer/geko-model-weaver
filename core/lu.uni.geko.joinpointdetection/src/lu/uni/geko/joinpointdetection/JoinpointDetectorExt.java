/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 *     Flavie Roussy - weaving of two linked models
 ******************************************************************************/
package lu.uni.geko.joinpointdetection;

import java.util.List;

import lu.uni.geko.common.JoinPoint;

import org.eclipse.emf.common.util.URI;

/**
 * The interface to be implemented by clients that extend the extension point lu.uni.geko.joinpointdetection.joinpointdetectorext.
 * The extension point allows for different implementations of the join point detection phase during weaving.<br/>
 * <br/>
 * <b>Attention:</b> This extension point requires exactly one registered extension!
 *
 * @author Max E. Kramer
 */
public interface JoinpointDetectorExt {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.joinpointdetection.joinpointdetectorext";

   /**
    * Detects the joinpoints for the pointcut and base model at the given URIs and returns them.
    *
    * @param pointcutMURI
    *           the URI of the pointcut model
    * @param baseMURI
    *           the URI of the base model
    * @return a list containing all detected join points
    */
   List<JoinPoint> detectJoinpoints(final URI pointcutMURI, final URI baseMURI);
   
   /**
    * Detects the joinpoints for the pointcut and two base models at the given URIs and returns them.
    *
    * @param pointcutMURI
    *           the URI of the pointcut model
    * @param baseMURIs
    *           the URIs of the base models
    * @return a list containing all detected join points
    */
   List<JoinPoint> detectJoinpoints(final URI pointcutMURI, final List<URI> baseMURIs);
}
