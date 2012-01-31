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
package lu.uni.geko.util.bridges;

import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.importer.ecore.EcoreImporter;

/**
 * @author Max E. Kramer
 */
public class EMFBridge {

   public static Pair<GenModel, EcoreImporter> getGenModelAndEcoreImporer(final URI mmURI, final Monitor monitor)
         throws Exception {
      EcoreImporter ecoreImporter = new EcoreImporter();

      URI genModelContainerURI = mmURI.trimFileExtension().trimSegments(1);
      IPath genModelContainerPath = EcoreBridge.getIPathForEMFUri(genModelContainerURI);
      ecoreImporter.setGenModelContainerPath(genModelContainerPath);

      String genModelFileName = mmURI.trimFileExtension().lastSegment() + ".genmodel";
      ecoreImporter.setGenModelFileName(genModelFileName);

      IFile modelFile = EcoreBridge.getIFileForEMFUri(mmURI);
      ecoreImporter.setModelFile(modelFile);

      ecoreImporter.computeEPackages(monitor);

      ecoreImporter.adjustEPackages(monitor);

      ecoreImporter.prepareGenModelAndEPackages(monitor);

      GenModel genModel = ecoreImporter.getGenModel();

      genModel.setGenerateSchema(false);

      return new Pair<GenModel, EcoreImporter>(genModel, ecoreImporter);
   }

}
