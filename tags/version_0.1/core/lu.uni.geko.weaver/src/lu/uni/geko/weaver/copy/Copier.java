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
package lu.uni.geko.weaver.copy;

import lu.uni.geko.weaver.AdviceEffectuation;

import org.eclipse.emf.ecore.EObject;

/**
 * The interface to be implemented by clients that are to be returned by extend the extension point {@link CopierFactoryExt
 * lu.uni.geko.weaver.copy.copierfactoryext}. The extension point allows for customisation of the copying process that creates new
 * base elements corresponding to existing advice elements. Implementations of this interface perform the copying itself whereas
 * the extension point {@link CopierFactoryExt} only has to be implemented in order to return the right implementation instance of
 * this interface.<br/>
 * <br/>
 * <b>Attention</b>: All registered extensions for this extension point are called in order of decreasing priority (i.e. starting
 * with the extension having the highest integer value priority) while passing on the initial result to the next extension.
 *
 * @author Max E. Kramer
 */
public interface Copier {
   /**
    * Returns an existing or new base variant copy of the given advice element for the given advice effectuation using the given
    * current base variant of the advice element.
    *
    * @param sourceAvElement
    *           the advice element to be used as source of the copying
    * @param currentBaseVariant
    *           the currently obtained base variant copy of the given advice element
    * @param avEffectuation
    *           an advice effectuation
    * @return a (possibly new) base variant copy of the given advice element
    */
   EObject copyAvElement(EObject sourceAvElement, EObject currentBaseVariant, final AdviceEffectuation avEffectuation);
}
