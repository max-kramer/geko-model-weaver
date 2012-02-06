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
import lu.uni.geko.util.bridges.EcoreResourceBridge;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import qut.part21.Model;
import tefkat.engine.trace.TracePackage;
import IFC2X3.IFC2X3Package;
import IFC2X3.util.IFC2X3ResourceFactoryImpl;
import express2ecore.Express2ecorePackage;

/**
 * /** A utility class hiding details of the EMF / IFC bridge implementation.
 *
 * @author Max E. Kramer
 */
public final class IfcConnector {
   /** Utility classes should not have a public or default constructor. */
   private IfcConnector() {
   }

   {
      registerMetamodelPackages();
      registerExtensionFactories();
   }

   /**
    * Registers the metamodels packages used by the bridge.
    */
   private static void registerMetamodelPackages() {
      // register metamodel packages
      EPackage.Registry.INSTANCE.put(Express2ecorePackage.eNS_URI, Express2ecorePackage.eINSTANCE);
      EPackage.Registry.INSTANCE.put(IFC2X3Package.eNS_URI, IFC2X3Package.eINSTANCE);
      EPackage.Registry.INSTANCE.put(TracePackage.eNS_URI, TracePackage.eINSTANCE);
      // TODO MK remove this when all these packages have been declared correctly in the plug-ins that generate them
   }

   /**
    * Registers the extension factories for file extensions to be handled by the bridge.
    */
   private static void registerExtensionFactories() {
      // register resource factories
      Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ifc", new IFC2X3ResourceFactoryImpl());
   }

   /**
    * Returns the part 21 model of the IFC building model at the given URI.
    *
    * @param uri
    *           a URI of an IFC building model
    * @return the corresponding part 21 model
    */
   public static Model getPart21ModelAtURI(final URI uri) {
      Resource resource = DefaultSimpleResourceLoader.getInstance().loadResourceAtURI(uri);
      Model part21Model = getPart21ModelForResource(resource);
      printModelStatistics(part21Model);
      return part21Model;
   }

   /**
    * Returns the part 21 model of the IFC building model contained in the given resource.
    *
    * @param resource
    *           a resource containing an IFC building model
    * @return the corresponding part 21 model
    */
   private static Model getPart21ModelForResource(final Resource resource) {
      return EcoreResourceBridge.getUniqueContentRootIfCorrectlyTyped(resource, "ifc part21 model", Model.class);
   }

   /**
    * Prints some aggregated values for the given part 21 model.
    *
    * @param model
    *           a part 21 IFC building model
    */
   private static void printModelStatistics(final Model model) {
      System.out.println("#BuildingElements=" + model.getNumBuildingElements());
      System.out.println("#Buildings=" + model.getNumBuildings());
      System.out.println("#BuildingStories=" + model.getNumBuildingStories());
      System.out.println("#IfcObjects=" + model.getNumIfcObjects());
      System.out.println("#Products=" + model.getNumProducts());
      System.out.println("#Sites=" + model.getNumSites());
      System.out.println("#Spaces=" + model.getNumSpaces());
   }

   /**
    * Saves the given part 21 model as the only content of the (potentially new) resource at the given URI.<br/>
    * <br/>
    * <b>Attention</b>: If a resource already exists at the given URI it will be overwritten!
    *
    * @param model
    *           a part 21 IFC building model
    * @param uri
    *           the URI to be used for storing the given model
    * @throws IOException
    *            if an error occurred during saving
    */
   public static void savePart21ModelAtURI(final Model model, final URI uri) throws IOException {
      Resource resource = DefaultSimpleResourceLoader.getInstance().loadResourceAtURI(uri);
      EcoreResourceBridge.saveEObjectAsOnlyContent(model, resource);
   }
}
