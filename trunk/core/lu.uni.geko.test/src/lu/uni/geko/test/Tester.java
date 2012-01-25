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
package lu.uni.geko.test;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.common.ecorecopy.UnorderedReferencesRespectingEqualityHelper;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.adapters.EMFToStringAdapter;
import lu.uni.geko.util.adapters.JavaAdapter;
import lu.uni.geko.util.datastructures.Quintuple;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;


public class Tester {

	public static Quintuple<URI, URI, URI, URI, URI> getModelURIsFromFolder(IFolder folder) {
		try {
			URI baseMURI = null;
			URI pointcutMURI = null;
			URI adviceMURI = null;
			URI pc2AvMappingMURI = null;
			URI wovenArchetypeMURI = null;
			String baseFileExt = null;
			String trimmedPcFileExt = null;
			String trimmedAvFileExt = null;
			String wovenArchetypeFileExt = null;
			IResource[] folderMembers = folder.members();
			for (IResource folderMember : folderMembers) {
				if (folderMember.exists()) {
					if (folderMember instanceof IFile) {
						String fileExt = folderMember.getFileExtension();
						if (fileExt.equals(GeKoConstants.PC2AVMAPPING_FILE_EXT)) {
							pc2AvMappingMURI = getUriIfNotSetYet(pc2AvMappingMURI, folderMember, folder, "pointcut to advice mapping");
						} else if (fileExt.endsWith(GeKoConstants.POINTCUT_FILE_EXT_SUFFIX)) {
							pointcutMURI = getUriIfNotSetYet(pointcutMURI, folderMember, folder, "pointcut");
							trimmedPcFileExt = JavaAdapter.trim(fileExt, GeKoConstants.POINTCUT_FILE_EXT_SUFFIX);
						} else if (fileExt.endsWith(GeKoConstants.ADVICE_FILE_EXT_SUFFIX)) {
							adviceMURI = getUriIfNotSetYet(adviceMURI, folderMember, folder, "advice");
							trimmedAvFileExt = JavaAdapter.trim(fileExt, GeKoConstants.ADVICE_FILE_EXT_SUFFIX);
						} else {
							// now folderMember can only be the base or the woven archetype
							IPath memberPath = folderMember.getFullPath();
							String memberName = memberPath.removeFileExtension().lastSegment();
							if (memberName.endsWith(GeKoConstants.ARCHETYPE_M_FILENAME_APPENDAGE)) {
								wovenArchetypeMURI = getUriIfNotSetYet(wovenArchetypeMURI, folderMember, folder, "woven archetype");
								wovenArchetypeFileExt = fileExt;
							} else if (memberName.endsWith(GeKoConstants.WOVEN_M_FILENAME_APPENDAGE)) {
								// ignore old woven files
							} else {
								baseMURI = getUriIfNotSetYet(baseMURI, folderMember, folder, "base");
								baseFileExt = fileExt;
							}
						}
					}
				}
			}
			boolean allRequiredModelURIsSet = baseMURI != null && pointcutMURI != null && adviceMURI != null && wovenArchetypeMURI != null && baseFileExt != null;
			if (allRequiredModelURIsSet) {
   			boolean allFileExtCorrespond = baseFileExt.equals(trimmedPcFileExt) && baseFileExt.equals(trimmedAvFileExt) && baseFileExt.equals(wovenArchetypeFileExt);
   			if (allFileExtCorrespond) {
   				return new Quintuple<URI, URI, URI, URI, URI>(baseMURI, pointcutMURI, adviceMURI, pc2AvMappingMURI, wovenArchetypeMURI);
   			}
			}
			throw new RuntimeException("Test cannot be run as not all required model URIs are set or their file extensions do not correspond!");
		} catch (CoreException e) {
			// soften
			throw new RuntimeException(e);
		}
	}

	private static URI getUriIfNotSetYet(URI uri, IResource resource, IFolder folder, String modelName) {
		if (uri == null) {
			return EMFAdapter.getEMFUriForIResource(resource);
		} else {
			throw new RuntimeException("Found more than one " + modelName + " model in folder '" + folder + "'!");
		}
	}

	public static void assertWovenMRootEqualsWovenArchetypeMRoot(URI wovenMURI,
			URI wovenArchetypeMURI) {
		EObject wovenRootElement = MainResourceLoader.getUniqueResourceContentRoot(wovenMURI, "woven model");
		EObject wovenArchetypeRootElement = MainResourceLoader.getUniqueResourceContentRoot(wovenArchetypeMURI, "woven archetype model");
		UnorderedReferencesRespectingEqualityHelper equalityHelper = new UnorderedReferencesRespectingEqualityHelper();
		boolean equals = equalityHelper.equals(wovenRootElement, wovenArchetypeRootElement);
		if (equals) {
			String successMessage = "Sucessfully completed asymmetric weaver test in '" + wovenMURI.trimSegments(1).lastSegment() + "'.";
			SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME).println(successMessage);
			System.out.println(successMessage);
		} else {
			throw new RuntimeException("The woven model root element '" + EMFToStringAdapter.INSTANCE.toString(wovenRootElement)
									+ "' does not equal the woven archetype model root element '" + EMFToStringAdapter.INSTANCE.toString(wovenArchetypeRootElement) + "'!");
		}
	}
}
