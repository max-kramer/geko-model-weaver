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
package lu.uni.geko.mmtransformer;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;

/**
 * The interface to be implemented by clients that extend the extension point lu.uni.geko.mmtransformer.genmodelmodifierext.
 * The extension point allows for customisation of generator models used to generate code and editors for pointcut and advice
 * metamodels.<br/>
 * <br/>
 * <b>Attention:</b> All registered extensions for this extension point are called in order of decreasing priority (i.e. starting
 * with the highest integer value) while passing on the initial result to the next extension.
 *
 * @author Max E. Kramer
 */
public interface GenModelModifierExt {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.mmtransformer.genmodelmodifierext";

   /**
    * Modifies the generator model generated from the metamodel for a base, pointcut or advice metamodel.
    *
    * @param genModel the generator model to be modified in-place
    * @param mmURI the URI of the metamodel for which the generator was created
    */
   void modifyGenModelForMMURI(GenModel genModel, URI mmURI);
}
