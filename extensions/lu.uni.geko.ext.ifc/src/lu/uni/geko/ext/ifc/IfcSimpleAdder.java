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

import lu.uni.geko.weaver.FeatureCorresponder;
import lu.uni.geko.weaver.SimpleAdderExt;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import qut.part21.Model;

public class IfcSimpleAdder implements SimpleAdderExt {

	@Override
	public EReference getContainmentReferenceForAdviceEObject(EObject uniqueWovenRoot, EObject adviceEObjectToBeAdded, FeatureCorresponder featureCorresponder) {
		if (uniqueWovenRoot instanceof Model) {
			EStructuralFeature containmentFeature = uniqueWovenRoot.eClass().getEStructuralFeature("contents");
			if (containmentFeature instanceof EReference) {
				return (EReference) containmentFeature;
			} else {
				throw new RuntimeException("The 'contents' feature of the unique root element '" + uniqueWovenRoot + "' of a woven IFC model has to be a EReference!");
			}
		} else {
			throw new RuntimeException("The unique root element '" + uniqueWovenRoot + "' of a woven IFC model has to be a Part21 Model!");
		}
	}
}
