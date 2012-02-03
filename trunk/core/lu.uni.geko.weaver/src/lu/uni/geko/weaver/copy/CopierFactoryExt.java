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

import lu.uni.geko.weaver.Advice;

import org.eclipse.emf.ecore.EObject;

/**
 * The interface to be implemented by clients that extend the extension point lu.uni.geko.weaver.copy.copierfactoryext. The
 * extension point allows for customisation of the copying process that creates new base elements corresponding to existing advice
 * elements. This interface has to be implemented in order to return the right implementation instance of {@link Copier} which is
 * responsible for performing the copying itself.<br/>
 * <br/>
 * <b>Attention</b>: All registered extensions for this extension point are called in order of decreasing priority (i.e. starting
 * with the extension having the highest integer value priority) while passing on the initial result to the next extension.
 *
 * @author Max E. Kramer
 */
public interface CopierFactoryExt {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.weaver.copy.copierfactoryext";

   /**
    * Returns the copier that is responsible for creating new base elements corresponding to existing advice elements for the
    * given root element of a woven model and the given advice.
    *
    * @param wovenRoot
    *           the unique root element of a woven model
    * @param advice
    *           an advice
    * @return the copier responsible for creating base variants of advice elements for the given woven model root and advice
    */
   Copier getCopier(EObject wovenRoot, Advice advice);
}
