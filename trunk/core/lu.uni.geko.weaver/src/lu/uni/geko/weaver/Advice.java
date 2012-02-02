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
package lu.uni.geko.weaver;

import java.util.Set;

import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.ecore.EObject;

/**
 * A convenience representation (or proxy) of an advice encapsulating advice content elements and their advice instantiation
 * scope.
 *
 * @see AdviceInstantiationScope
 *
 * @author Max E. Kramer
 */
public interface Advice {
   /**
    * Returns the advice instantiation scope for the given advice element.
    *
    * @param avElement
    *           an advice element
    * @return the advice instantiation scope
    */
   AdviceInstantiationScope getAvInstantiationScope(EObject avElement);

   /**
    * Returns a set containing all elements of the advice that represent base model elements. That is meta-elements that contain
    * weaving information are not contained.
    *
    * @return all elements of the advice that represent base model elements
    */
   Set<EObject> getAllAvElements();
}
