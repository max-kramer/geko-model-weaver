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

import lu.uni.geko.mmtransformer.GenModelModifierExt;
import lu.uni.geko.resources.MainResourceLoader;

import org.eclipse.emf.codegen.ecore.genmodel.GenDelegationKind;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.codegen.ecore.genmodel.GenResourceKind;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;

public class IfcGenModelModifier implements GenModelModifierExt {

	@SuppressWarnings("deprecation")
	@Override
	public void modifyGenModelForMMURI(GenModel genModel, URI mmURI) {
		EPackage mmRootPackage = MainResourceLoader.getResourceContentRootIfCorrectlyTyped(mmURI, "metamodel", EPackage.class);
		String nsURI = mmRootPackage.getNsURI();
		if (nsURI.startsWith(IfcConstants.IFC_NS_URI_PREFIX)) {
	    	genModel.setRootExtendsClass(IfcConstants.ROOT_EXTENDS_CLASS);
	    	genModel.setRootExtendsInterface(IfcConstants.ROOT_EXTENDS_INTERFACE);
	    	genModel.setReflectiveDelegation(true);
	    	genModel.setFeatureDelegation(GenDelegationKind.REFLECTIVE_LITERAL);
	    	genModel.setImporterID(IfcConstants.IMPORTER_ID);
	    	// only the unmodified model elements have a special resource implementation
	    	// the pointcut and advice model elements use a standard ecore resource implementation
	    	if (nsURI.equals(IfcConstants.IFC_NS_URI)) {
		    	for (GenPackage genPackage : genModel.getGenPackages()) {
		    		genPackage.setResource(GenResourceKind.BASIC_LITERAL);
		    	}
	    	}
	    	genModel.getModelPluginVariables().add(IfcConstants.MODEL_PLUGIN_VARIABLE);
		}
	}
}
