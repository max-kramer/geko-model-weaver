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

import java.util.Set;

import org.eclipse.emf.ecore.EObject;

/**
 * A convenience representation (or proxy) of a join point being nothing else than a mapping from all pointcut elements to the
 * matching base elements.
 *
 * @author Max E. Kramer
 */
public interface JoinPoint {

   /**
    * Returns the base elements that corresponds to the given pointcut element in this join point.
    *
    * @param pcElement
    *           a pointcut element
    * @return the corresponding base element
    */
   EObject getBaseElement(EObject pcElement);

   /**
    * Returns a set containing all pointcut elements of this join point.
    *
    * @return all pointcut elements
    */
   Set<EObject> getAllPcElements();
}
