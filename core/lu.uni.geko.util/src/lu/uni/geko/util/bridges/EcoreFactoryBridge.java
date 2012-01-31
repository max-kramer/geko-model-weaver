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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

public class EcoreFactoryBridge {
	
	public static EClass addNewClassToPackage(String className, EPackage ePackage, String packageName) {
		EList<EClassifier> classifiers = ePackage.getEClassifiers();
		if (ePackage.getEClassifier(className) == null) {
			EClass newClass = EcoreFactory.eINSTANCE.createEClass();
			newClass.setName(className);
			classifiers.add(newClass);
			return newClass;
		} else {
			throw new RuntimeException("The " + packageName + " package is not allowed to already have a classifier named '" + className + "'!");
		}
	}

	public static void addNewReferenceToEClass(EClass rootClass, String name, EClassifier type, int lowerBound, int upperBound, boolean containment) {
		EList<EStructuralFeature> rootFeatures = rootClass.getEStructuralFeatures();
		EReference rootChildrenEReference = EcoreFactory.eINSTANCE.createEReference();
		rootChildrenEReference.setName(name);
		rootChildrenEReference.setEType(type);
		rootChildrenEReference.setLowerBound(lowerBound);
		rootChildrenEReference.setUpperBound(upperBound);
		rootChildrenEReference.setContainment(containment);
		rootFeatures.add(rootChildrenEReference);
	}
}
