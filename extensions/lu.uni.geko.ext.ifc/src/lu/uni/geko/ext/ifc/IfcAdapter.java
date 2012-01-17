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

import java.io.IOException;

import lu.uni.geko.resources.DefaultSimpleResourceLoader;
import lu.uni.geko.util.adapters.EMFResourceAdapter;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import qut.part21.Model;
import tefkat.engine.trace.TracePackage;
import IFC2X3.IFC2X3Package;
import IFC2X3.util.IFC2X3ResourceFactoryImpl;
import express2ecore.Express2ecorePackage;

public class IfcAdapter {
	{ 
	registerMetamodelPackages();
	registerExtensionFactories();
	}
	
	private static void registerMetamodelPackages() {
		// register metamodel packages
		EPackage.Registry.INSTANCE.put(Express2ecorePackage.eNS_URI,
				Express2ecorePackage.eINSTANCE);
		EPackage.Registry.INSTANCE.put(IFC2X3Package.eNS_URI,
				IFC2X3Package.eINSTANCE);
		EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI,
				TracePackage.eINSTANCE);
		// TODO MK remove this when all these packages have been declared correctly in the plug-ins that generate them
	}
	
	private static void registerExtensionFactories() {
		// register resource factories
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
				"ifc", new IFC2X3ResourceFactoryImpl());
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
//				"xmi", new XMIResourceFactoryImpl());
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(
//				"xml", new XMIResourceFactoryImpl());
	}

//	public static IfcProject getIfcProjectAtURI(URI uri) {
//		Model part21Model = getPart21ModelAtURI(uri);
//		IfcProject ifcProject = getIfcProjectForPart21Model(part21Model);
//		return ifcProject;
//	}
	
	public static Model getPart21ModelAtURI(URI uri) {
		Resource resource = DefaultSimpleResourceLoader.getSingleton().loadResourceAtURI(uri);
		Model part21Model = getPart21ModelForResource(resource);
		printModelStatistics(part21Model);
		return part21Model;
	}
	
	private static Model getPart21ModelForResource(Resource resource) {
		return EMFResourceAdapter.getResourceContentRootIfCorrectlyTyped(resource, "ifc part21 model", Model.class);
//		EList<EObject> contents = resource.getContents();
//		if (contents == null || contents.isEmpty()) {
//			throw new RuntimeException("The resource '" + resource + "' for the given path has no content!");
//		}
//		EObject modelEObject = contents.get(0);
//		if (modelEObject == null) {
//			throw new RuntimeException("First content object of the resource '" + resource + "' for the given path is null!");
//		}
//		if (!(modelEObject instanceof Model)) {
//			throw new RuntimeException("First content object of the resource '" + resource + "' for the given path is not a Part 21 Model!");
//		}
//		Model model = (Model) modelEObject;
//		return model;
	}
	
//	private static IfcProject getIfcProjectForPart21Model(Model part21Model) {
//		EObject rootModelElement = part21Model.getRoot();
//		if (rootModelElement == null) {
//			throw new RuntimeException("Root model element of the first content object of the resource for the given path is null!");
//		}
//		if (!(rootModelElement instanceof IfcProject)) {
//			throw new RuntimeException("Root model element of the first content object of the resource for the given path is not an IfcProject!");
//		}
//		return (IfcProject) rootModelElement;
//	}
	
	private static void printModelStatistics(Model model) {
			System.out.println("#BuildingElements="+model.getNumBuildingElements());
			System.out.println("#Buildings="+model.getNumBuildings());
			System.out.println("#BuildingStories="+model.getNumBuildingStories());
			System.out.println("#IfcObjects="+model.getNumIfcObjects());
			System.out.println("#Products="+model.getNumProducts());
			System.out.println("#Sites="+model.getNumSites());
			System.out.println("#Spaces="+model.getNumSpaces());
	}
	
//	/** Creates a new resource at the given absoluteFilePath, adds the ifcProject to it and saves it.
//	Take care: If a resource already exists at the given absoluteFilePath it will be overwritten! 
//	 * @throws IOException */
//	public static void saveIfcProjectAtURI(IfcProject ifcProject, URI uri) throws IOException {
//		registerMetamodelPackages();
//		registerExtensionFactories();
//		Resource resource = DefaultSimpleResourceLoader.getSingleton().loadResourceAtURI(uri);
//		resource.getContents().add(ifcProject);
//		resource.save(Collections.EMPTY_MAP);
//	}
	
	/** Creates a new resource at the given URI, adds the Part21 Model to it and saves it.
	Take care: If a resource already exists at the given absoluteFilePath it will be overwritten! 
	 * @throws IOException */
	public static void savePart21ModelAtURI(Model model, URI uri) throws IOException {
		Resource resource = DefaultSimpleResourceLoader.getSingleton().loadResourceAtURI(uri);
		EMFResourceAdapter.saveEObjectAsOnlyContent(model, resource);
	}
}
