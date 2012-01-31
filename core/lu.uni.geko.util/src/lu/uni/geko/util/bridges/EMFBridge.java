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
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.importer.ecore.EcoreImporter;

/**
 * A utility class hiding details of the Eclipse Modeling Framework API for recurring tasks that are not project-specific. Methods
 * for Ecore metamodels, Ecore metamodel creation, Ecore metamodel variants and Ecore resources should not be put in this utility
 * but in the corresponding separate utilities!<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently only providing one
 * implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 *
 * @see EcoreBridge
 * @see EcoreFactoryBridge
 * @see EcorePkgVariantsBridge
 * @see EcoreResourceBridge
 */
public final class EMFBridge {
   /** Utility classes should not have a public or default constructor. */
   private EMFBridge() {
   }

   /**
    * Creates and returns an EMF platform resource URI for the given Eclipse resource.
    *
    * @param iResource
    *           an Eclipse resource
    * @return a platform resource URI for the resource
    */
   public static URI getEMFUriForIResource(final IResource iResource) {
      return URI.createPlatformResourceURI(iResource.getFullPath().toString(), true);
   }

   /**
    * Creates and returns a new Eclipse path for the given EMF URI.
    *
    * @param uri
    *           an EMF URI
    * @return a new Eclipse path for the given URI
    */
   public static IPath getIPathForEMFUri(final URI uri) {
      return new Path(uri.toPlatformString(true));
   }

   /**
    * Returns an Eclipse file for the given EMF URI.
    *
    * @param uri
    *           an EMF URI
    * @return an Eclipse file for the given URI
    */
   public static IFile getIFileForEMFUri(final URI uri) {
      IPath path = getIPathForEMFUri(uri);
      return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
   }

   /**
    * Creates a new URI from the given URI by appending the given string to the file name of the URI (i.e. before the dot "." and
    * the file extension)
    *
    * @param uri
    *           an URI
    * @param toAppend
    *           the string to be appended to the file name of the URI
    * @return the new URI
    */
   public static URI newURIWithStringAppendedToFilename(final URI uri, final String toAppend) {
      String fileExt = uri.fileExtension();
      if (fileExt != null) {
         URI uriWithoutFileExt = uri.trimFileExtension();
         String resultFileName = uriWithoutFileExt.lastSegment() + toAppend;
         return uriWithoutFileExt.trimSegments(1).appendSegment(resultFileName).appendFileExtension(fileExt);
      } else {
         throw new RuntimeException("The uri '" + uri + "' has no file extension so '" + toAppend
               + "' cannot be appended before the file extension!");
      }

   }

   /**
    * Creates and prepares a generator model for the metamodel at the given URI using an EcoreImporter and returns both.
    *
    * @param mmURI
    *           the URI of a metamodel
    * @param monitor
    *           the monitor to be used for logging output during code generation
    * @return a generator model for the metamodel and the EcoreImporter that created it
    * @throws Exception
    *            if the package for the metamodel cannot be computed
    */
   public static Pair<GenModel, EcoreImporter> getGenModelAndEcoreImporer(final URI mmURI, final Monitor monitor)
         throws Exception {
      EcoreImporter ecoreImporter = new EcoreImporter();

      URI genModelContainerURI = mmURI.trimFileExtension().trimSegments(1);
      IPath genModelContainerPath = EMFBridge.getIPathForEMFUri(genModelContainerURI);
      ecoreImporter.setGenModelContainerPath(genModelContainerPath);

      String genModelFileName = mmURI.trimFileExtension().lastSegment() + ".genmodel";
      ecoreImporter.setGenModelFileName(genModelFileName);

      IFile modelFile = EMFBridge.getIFileForEMFUri(mmURI);
      ecoreImporter.setModelFile(modelFile);

      ecoreImporter.computeEPackages(monitor);

      ecoreImporter.adjustEPackages(monitor);

      ecoreImporter.prepareGenModelAndEPackages(monitor);

      GenModel genModel = ecoreImporter.getGenModel();

      genModel.setGenerateSchema(false);

      return new Pair<GenModel, EcoreImporter>(genModel, ecoreImporter);
   }
}
