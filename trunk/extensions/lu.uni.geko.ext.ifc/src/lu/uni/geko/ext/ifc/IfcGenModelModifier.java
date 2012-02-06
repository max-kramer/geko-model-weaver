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

/**
 * An extension for the extension point {@link GenModelModifierExt} that makes sure that the code for the IFC metamodel is
 * generated with the correct parameters.
 *
 * @author Max E. Kramer
 */
public class IfcGenModelModifier implements GenModelModifierExt {

   @SuppressWarnings("deprecation")
   @Override
   public void modifyGenModelForMMURI(final GenModel genModel, final URI mmURI) {
      EPackage mmRootPackage = MainResourceLoader.getUniqueContentRootIfCorrectlyTyped(mmURI, "metamodel", EPackage.class);
      String nsURI = mmRootPackage.getNsURI();
      if (nsURI.startsWith(IfcConstants.getIfcNsURIPrefix())) {
         genModel.setRootExtendsClass(IfcConstants.getRootExtendsClass());
         genModel.setRootExtendsInterface(IfcConstants.getRootExtendsInterface());
         genModel.setReflectiveDelegation(true);
         genModel.setFeatureDelegation(GenDelegationKind.REFLECTIVE_LITERAL);
         genModel.setImporterID(IfcConstants.getImporterId());
         // only the unmodified model elements have a special resource implementation
         // the pointcut and advice model elements use a standard ecore resource implementation
         if (nsURI.equals(IfcConstants.getIfcNsURI())) {
            for (GenPackage genPackage : genModel.getGenPackages()) {
               genPackage.setResource(GenResourceKind.BASIC_LITERAL);
            }
         }
         genModel.getModelPluginVariables().add(IfcConstants.getModelPluginVariable());
      }
   }
}
