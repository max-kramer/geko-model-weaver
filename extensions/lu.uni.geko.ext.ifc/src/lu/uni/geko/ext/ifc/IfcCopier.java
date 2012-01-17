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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.adapters.JavaAdapter;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;
import lu.uni.geko.weaver.Copier;

import org.eclipse.emf.ecore.EObject;

import qut.part21.Model;
import IFC2X3.IfcOwnerHistory;
import IFC2X3.IfcRoot;

public class IfcCopier implements Copier {
	private final Set<String> idSet;
	private final IfcOwnerHistory ownerHistory;

	public IfcCopier(EObject rootEObject) {
		this.idSet = populateIDSet(rootEObject);
		this.ownerHistory = getOwnerHistory(rootEObject);
	}

	private Set<String> populateIDSet(EObject rootEObject) {
		Set<String> idSet = new HashSet<String>();
		Iterator<EObject> rootContentsIterator = rootEObject.eAllContents();
		while (rootContentsIterator.hasNext()) {
			EObject content = rootContentsIterator.next();
			if (content instanceof IfcRoot) {
				IfcRoot ifcContent = (IfcRoot) content;
				String globalId = ifcContent.getGlobalId();
				idSet.add(globalId);
			}
		}
		return idSet;
	}

	private IfcOwnerHistory getOwnerHistory(EObject rootEObject) {
		if (rootEObject instanceof Model) {
			Model rootModel = (Model) rootEObject;
			EObject rootModelRootEObject = rootModel.getRoot();
			if (rootModelRootEObject instanceof IfcRoot) {
				IfcRoot rootModelIfcRoot = (IfcRoot) rootModelRootEObject;
				return rootModelIfcRoot.getOwnerHistory();
			} else {
				SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME);
				console.printWarningln("The root object of the part21 model is not an IfcRoot.\n"
										+ "Therefore all newly added IFC objects will have no owner history!");
			}
		} else {
			SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME);
			console.printWarningln("The root element of the IFC resource is not a part21 model.\n"
									+ "Therefore all newly added IFC objects will have no owner history!");
		}
		return null;
	}

	@Override
	public EObject copyAdviceEObject(EObject sourceAdviceEObject, EObject currentCopyBaseEObject) {
		if (currentCopyBaseEObject instanceof IfcRoot) {
			IfcRoot copy = (IfcRoot) currentCopyBaseEObject;
			createAndSetGlobalId(copy);
			setOwnerHistory(copy);
		}
		return currentCopyBaseEObject;
	}

	private void setOwnerHistory(IfcRoot copy) {
		if (ownerHistory != null) {
			copy.setOwnerHistory(ownerHistory);
		}
	}

	private void createAndSetGlobalId(IfcRoot copy) {
		String globalId = createNewGloballId();
		idSet.add(globalId);
		copy.setGlobalId(globalId);
	}

	private String createNewGloballId() {
		String globalId;
		do {
			globalId = guessNewGlobalId();
		} while (idSet.contains(globalId));
		return globalId;
	}

	private String guessNewGlobalId() {
		return JavaAdapter.getRandomAlphaNumericalString(IfcConstants.IFC_ROOT_ID_LENGTH, IfcConstants.IFC_ROOT_ID_ADDITIONAL_CHARACTERS);
	}
}
