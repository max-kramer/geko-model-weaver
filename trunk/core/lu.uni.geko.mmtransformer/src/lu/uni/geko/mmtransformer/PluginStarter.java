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

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.common.GeKoVariables;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EclipseAdapter;
import lu.uni.geko.util.adapters.JavaAdapter;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.osgi.framework.BundleException;

public class PluginStarter {
	public static void installAndStartGeneratedPlugins(GenModel genModel, boolean onlyModelCode) {
		URI genModelURI = genModel.eResource().getURI();
		if (genModelURI.isPlatformResource()) {
			int genModelSegmentCount = genModelURI.segmentCount();
			URI mmPluginURI = genModelURI.trimSegments(genModelSegmentCount - 2);
			URI absoluteMMPluginURI = CommonPlugin.resolve(mmPluginURI);
			// TODO MK make sure that there is no shorter (and perhaps more robust way) to get the absolute file path where the generated plug-ins reside
			URI absoluteRootPluginURI = absoluteMMPluginURI.trimSegments(1);
			
			String modelPluginID = genModel.getModelPluginID();
			installAndStartGeneratedPlugin(absoluteRootPluginURI, modelPluginID);
			if (!onlyModelCode) {
				String editPluginID = genModel.getEditPluginID();
				installAndStartGeneratedPlugin(absoluteRootPluginURI, editPluginID);
				String editorPluginID = genModel.getEditorPluginID();
				installAndStartGeneratedPlugin(absoluteRootPluginURI, editorPluginID);
				addModelCodeToClasspath(absoluteRootPluginURI, modelPluginID);
			}
		}
	}

	public static void installAndStartGeneratedEditorPluginForUri(URI uri) {
		GenModel genModel = MainResourceLoader.getResourceContentRootIfCorrectlyTyped(uri, "genmodel", GenModel.class);
		installAndStartGeneratedPlugins(genModel, false);
	}

	private static void installAndStartGeneratedPlugin(URI absoluteRootPluginURI, String pluginID) {
		try {
			URI absoluteModelPluginURI = absoluteRootPluginURI.appendSegment(pluginID);
			String modelPluginLocation = "reference:" + absoluteModelPluginURI.toString();
			EclipseAdapter.installAndStartNewPluginFromInstalledPlugin(GeKoConstants.MMTRANSFORMER_PLUGIN_ID, pluginID, modelPluginLocation);
		} catch (BundleException e) {
			System.err.println("Could not install and start the plug-in '" + pluginID + "'!\n" +
								"Make sure that you started GeKo with the program argument '-dev bin'!");
			e.printStackTrace();
		}
	}

	private static void addModelCodeToClasspath(URI absoluteRootPluginURI,
			String modelPluginID) {
		try {
			URI absoluteModelCodeURI = absoluteRootPluginURI.appendSegment(modelPluginID).appendSegment("bin");
			String absoluteModelCodePath = absoluteModelCodeURI.toFileString();
			Collection<URL> classpathURLs = JavaAdapter.getAllDirURLsWithinPath(absoluteModelCodePath);
			GeKoVariables.INSTANCE.addClasspathURLs(classpathURLs);
		} catch (MalformedURLException e) {
			// soften
			throw new RuntimeException(e);
		}
	}
}
