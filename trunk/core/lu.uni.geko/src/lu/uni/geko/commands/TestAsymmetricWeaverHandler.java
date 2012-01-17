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
package lu.uni.geko.commands;

import java.util.ArrayList;
import java.util.List;

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.test.Tester;
import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.datastructures.Quintuple;

import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.URI;

public class TestAsymmetricWeaverHandler extends AbstractFolderHandler {

	@Override
	protected List<Runnable> getRunnables(List<IFolder> folders) {
		List<Runnable> runnables = new ArrayList<Runnable>(folders.size());
		for (final IFolder folder : folders) {
			runnables.add(new Runnable() {	
				@Override
				public void run() {
					Quintuple<URI, URI, URI, URI, URI> modelURIs = Tester.getModelURIsFromFolder(folder);
					URI baseMURI = modelURIs.first;
					URI pointcutMURI = modelURIs.second;
					URI adviceMURI = modelURIs.third;
					URI pc2AvMappingMURI = modelURIs.fourth;
					URI wovenArchetypeMURI = modelURIs.fifth;
					URI wovenMURI;
					if (pc2AvMappingMURI == null) {
						wovenMURI = ActionsFacade.weaveAsymmetricallyInferPc2AvMapping(baseMURI, pointcutMURI, adviceMURI, false, true);
					} else {
						wovenMURI = ActionsFacade.weaveAsymmetricallyWithPc2AvMappingModel(baseMURI, pointcutMURI, adviceMURI, pc2AvMappingMURI, false, true);
					}
					wovenMURI = EMFAdapter.newUriWithStringAppendedToFilename(baseMURI, GeKoConstants.WOVEN_M_FILENAME_APPENDAGE);
					Tester.assertWovenMRootEqualsWovenArchetypeMRoot(wovenMURI, wovenArchetypeMURI);
				}
			});
		}
		return runnables;
	}
}
