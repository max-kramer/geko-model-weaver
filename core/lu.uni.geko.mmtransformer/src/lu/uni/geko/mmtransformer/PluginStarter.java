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

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EclipseAdapter;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.BundleException;

/**
 * A utility class for installing and starting plug-ins that were created during code generation.
 *
 * @author Max E. Kramer
 */
public final class PluginStarter {
   /** Utility classes should not have a public or default constructor. */
   private PluginStarter() {
   }

   /**
    * Installs and starts plug-ins that were created using the given generator model. Plug-ins with edit and editor code are only
    * installed and started if <code>onlyModelCode</code> is <code>false</code>.
    *
    * @param genModel
    *           the generator model used for code generation
    * @param onlyModelCode
    *           whether to install and start only model or also edit and editor code plug-ins
    */
   public static void installAndStartGeneratedPlugins(final GenModel genModel, final boolean onlyModelCode) {
      URI genModelURI = genModel.eResource().getURI();
      if (genModelURI.isPlatformResource()) {
         int genModelSegmentCount = genModelURI.segmentCount();
         URI mmPluginURI = genModelURI.trimSegments(genModelSegmentCount - 2);
         URI absoluteMMPluginURI = CommonPlugin.resolve(mmPluginURI);
         // MAYDO MK make sure that there is no shorter (and perhaps more robust way) to get the absolute file path where the
         // generated plug-ins reside
         URI absoluteRootPluginURI = absoluteMMPluginURI.trimSegments(1);

         String modelPluginID = genModel.getModelPluginID();
         installAndStartGeneratedPlugin(absoluteRootPluginURI, modelPluginID);
         if (!onlyModelCode) {
            String editPluginID = genModel.getEditPluginID();
            installAndStartGeneratedPlugin(absoluteRootPluginURI, editPluginID);
            String editorPluginID = genModel.getEditorPluginID();
            installAndStartGeneratedPlugin(absoluteRootPluginURI, editorPluginID);
            // RATIONALE MK deactivated as the Drools joinpoint detection does not use the classpath correctly so putting the code there has no use at the moment
//          addModelCodeToClasspath(absoluteRootPluginURI, modelPluginID);
         }
      }
   }

   /**
    * Installs and starts the model, edit, and editor plug-ins that were created for the metamodel at the given URI.
    *
    * @param mmURI
    *           the URI of the metamodel for which the model, edit, and editor plug-ins were already created
    */
   public static void installAndStartGeneratedEditorPlugin(final URI mmURI) {
      GenModel genModel = MainResourceLoader.getResourceContentRootIfCorrectlyTyped(mmURI, "genmodel", GenModel.class);
      installAndStartGeneratedPlugins(genModel, false);
   }

   /**
    * Installs and starts the plug-in with the given ID that is located at the given absolute URI.
    *
    * @param absolutePluginURI the absolute URI of the plug-in without its ID
    * @param pluginID the ID of the plug-in
    */
   private static void installAndStartGeneratedPlugin(final URI absolutePluginURI, final String pluginID) {
      try {
         URI absoluteModelPluginURI = absolutePluginURI.appendSegment(pluginID);
         String modelPluginLocation = "reference:" + absoluteModelPluginURI.toString();
         EclipseAdapter.installAndStartNewPluginFromInstalledPlugin(GeKoConstants.getMmtransformerPluginId(), pluginID,
               modelPluginLocation);
      } catch (BundleException e) {
         System.err.println("Could not install and start the plug-in '" + pluginID + "'!\n"
               + "Make sure that you started GeKo with the program argument '-dev bin'!");
         e.printStackTrace();
      }
   }

//   private static void addModelCodeToClasspath(final URI absoluteRootPluginURI, final String modelPluginID) {
//      try {
//         URI absoluteModelCodeURI = absoluteRootPluginURI.appendSegment(modelPluginID).appendSegment("bin");
//         String absoluteModelCodePath = absoluteModelCodeURI.toFileString();
//         Collection<URL> classpathURLs = JavaAdapter.getAllDirURLsWithinPath(absoluteModelCodePath);
//          GeKoVariables.getInstance().addClasspathURLs(classpathURLs);
//      } catch (MalformedURLException e) {
//         // soften
//         throw new RuntimeException(e);
//      }
//   }
}
