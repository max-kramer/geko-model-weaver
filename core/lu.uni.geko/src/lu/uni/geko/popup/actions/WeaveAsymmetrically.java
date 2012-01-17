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
package lu.uni.geko.popup.actions;

import java.util.ArrayList;
import java.util.List;

import lu.uni.geko.ActionsFacade;
import lu.uni.geko.common.GeKoConstants;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;

public class WeaveAsymmetrically extends AbstractFilesAction {
	// MAYDO MK if needed refactor the code redundancy of WeaveAsymmetrically and DetectJoinpoints
	private static final int BASE_FILE_TYPE = 0;
	private static final int PC_FILE_TYPE = 1;
	private static final int ADVICE_FILE_TYPE = 2;
	private static final int PC2AVMAPPING_FILE_TYPE = 3;

	@Override
	protected int getTypeCount() {
		return 4;
	}

	@Override
	protected int getTypeNoIfSelectable(IFile iFile) {
		String fileExt = iFile.getFileExtension();
		if (fileExt.endsWith(GeKoConstants.POINTCUT_FILE_EXT_SUFFIX)) {
			return PC_FILE_TYPE;
		} else if (fileExt.endsWith(GeKoConstants.ADVICE_FILE_EXT_SUFFIX)) {
			return ADVICE_FILE_TYPE;
		} else if (fileExt.equals(GeKoConstants.PC2AVMAPPING_FILE_EXT)) {
			return PC2AVMAPPING_FILE_TYPE;
		} else {
			// FIXME MK exclude files that are not base files for the selected pointcuts (e.g. based on the file extension or by looking at the mm referenced in the file)
			return BASE_FILE_TYPE;
		}
	}

	@Override
	protected List<Runnable> getRunnables(List<List<URI>> uris) {
		if (uris.size() == getTypeCount()) {
			List<URI> baseMURIs = uris.get(BASE_FILE_TYPE);
			List<URI> pcMURIs = uris.get(PC_FILE_TYPE);
			List<URI> adviceMURIs = uris.get(ADVICE_FILE_TYPE);
			final List<URI> pc2AvMappingMURIs = uris.get(PC2AVMAPPING_FILE_TYPE);
			List<Runnable> runnables = new ArrayList<Runnable>(baseMURIs.size());
			for (final URI baseMURI : baseMURIs) {
				if (pcMURIs.size() == 1 && adviceMURIs.size() == 1) {
					final URI pointcutMURI = pcMURIs.get(0);
					final URI adviceMURI = adviceMURIs.get(0);
					Runnable runnable = new Runnable() {	
						@Override
						public void run() {
							if (pc2AvMappingMURIs.size() == 1) {
								URI pc2AvMappingMURI = pc2AvMappingMURIs.get(0);
								ActionsFacade.weaveAsymmetricallyWithPc2AvMappingModel(baseMURI, pointcutMURI, adviceMURI, pc2AvMappingMURI, false, true);
							} else {
								ActionsFacade.weaveAsymmetricallyInferPc2AvMapping(baseMURI, pointcutMURI, adviceMURI, false, true);
							} // MAYDO MK support selecting more than one pointcut 2 advice mapping
						}
					};
					runnables.add(runnable);
				} // TODO MK support selecting more than one pointcut and advice for asymmetric weaving
			}
			return runnables;
		} else {
			throw new RuntimeException(this.getClass().getName() + " needs base, pointcut and advice files!");
		}
	}
}
