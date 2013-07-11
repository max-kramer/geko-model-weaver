/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 *     Flavie Roussy - case the base package contains a class named advice or pointcut
 ******************************************************************************/
package lu.uni.geko.util.bridges;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;

/**
 * A utility class hiding details of the Ecore metamodel creation part of the Eclipse Modeling 
 * Framework API for recurring tasks that are not project-specific.<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently 
 * only providing one implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 */
public final class EcoreFactoryBridge {
	/** Utility classes should not have a public or default constructor. */
	private EcoreFactoryBridge() {
	}

	/**
	 * Adds a new metaclass with the given name to the given package.
	 *
	 * @param className
	 *           the name of the new metaclass
	 * @param ePackage
	 *           the package that should contain the new metaclass
	 * @param classNameToDuplicate
	 * 			list of the class names to duplicate
	 * @return the newly created metaclass
	 *
	 * @see org.eclipse.emf.ecore.EClass EClass
	 */
	public static EClass addNewClassToPkg(final String className, final EPackage ePackage, final List<String> classNameToDuplicate) {
		EList<EClassifier> classifiers = ePackage.getEClassifiers();
		EClassifier myClassifier = ePackage.getEClassifier(className);
		if ( myClassifier == null) {
			EClass newClass = EcoreFactory.eINSTANCE.createEClass();
			newClass.setName(className);
			classifiers.add(newClass);
			return newClass;
		} else if (classNameToDuplicate.size() != 0){
			for(String i : classNameToDuplicate) {
				if (className == i) { //if the base package contains a class with the same name 
									  //(Pointcut or Advice classes)
					//we rename the class we add in classNameclassName
					EClass newClass = EcoreFactory.eINSTANCE.createEClass();
					newClass.setName(className);
					classifiers.add(newClass);
					String newClassName = className + className;
					myClassifier.setName(newClassName);
					return newClass;
				}
			}

			throw new RuntimeException("The " + ePackage.getName() + " package is not allowed to already have a classifier named '"
					+ className + "'!");
		}
		throw new RuntimeException("The " + ePackage.getName() + " package is not allowed to already have a classifier named '"
				+ className + "'!");
	}

	/**
	 * Adds a new reference with the given name to the given metaclass using the given classifier type, bounds and containment
	 * flag.
	 *
	 * @param rootClass
	 *           the metaclass that should contain the new reference
	 * @param name
	 *           the name of the new reference
	 * @param type
	 *           the type of the new reference
	 * @param lowerBound
	 *           the lower bound for the new reference
	 * @param upperBound
	 *           the upper bound for the new reference ({@code -1} represents unbounded, {@code -2} represents unspecified)
	 * @param containment
	 *           whether the new reference should be a containment reference
	 *
	 * @see org.eclipse.emf.ecore.EReference EReference
	 */
	public static void addNewReferenceToEClass(final EClass rootClass, final String name, final EClassifier type,
			final int lowerBound, final int upperBound, final boolean containment) {
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
