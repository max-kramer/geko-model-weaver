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

/**
 * A utility class containing all the constants of the IFC extension.
 *
 * @author Max E. Kramer
 */
public final class IfcConstants {
   /** Utility classes should not have a public or default constructor. */
   private IfcConstants() {
   }

   /** The namespace URI of the IFC metamodel. */
   private static final String IFC_NS_URI = "http://IFC2X3.ecore";
   /** The namespace URI prefix of the IFC metamodel. */
   private static final String IFC_NS_URI_PREFIX = "http://IFC2X3";
   /** The name of the class to be extended by every metaclass implementation of the IFC metamodel. */
   private static final String ROOT_EXTENDS_CLASS = "org.eclipse.emf.internal.cdo.CDOObjectImpl";
   /** The name of the interface to be implemented by every metaclass implementation of the IFC metamodel. */
   private static final String ROOT_EXTENDS_INTERFACE = "org.eclipse.emf.cdo.CDOObject";
   /** The identifier of the importer to be used for the code for the IFC metamodel. */
   private static final String IMPORTER_ID = "org.eclipse.emf.importer.cdo";
   /** The model plug-in variable to be used for the code for the IFC metamodel. */
   private static final String MODEL_PLUGIN_VARIABLE = "CDO=org.eclipse.emf.cdo";
   /** The length of identifiers for IFC elements. */
   private static final int IFC_ID_LENGTH = 22;
   /** The characters to be used in addition to alpha-numeric characters for the generation of identifiers for IFC elements. */
   private static final String IFC_ID_ADDITIONAL_CHARACTERS = "_$";

   /**
    * @return the namespace URI of the IFC metamodel
    */
   public static String getIfcNsURI() {
      return IFC_NS_URI;
   }

   /**
    * @return the namespace URI prefix of the IFC metamodel
    */
   public static String getIfcNsURIPrefix() {
      return IFC_NS_URI_PREFIX;
   }

   /**
    * @return the name of the class to be extended by every metaclass implementation of the IFC metamodel
    */
   public static String getRootExtendsClass() {
      return ROOT_EXTENDS_CLASS;
   }

   /**
    * @return the name of the interface to be implemented by every metaclass implementation of the IFC metamodel
    */
   public static String getRootExtendsInterface() {
      return ROOT_EXTENDS_INTERFACE;
   }

   /**
    * @return the identifier of the importer to be used for the code for the IFC metamodel
    */
   public static String getImporterId() {
      return IMPORTER_ID;
   }

   /**
    * @return the model plug-in variable to be used for the code for the IFC metamodel
    */
   public static String getModelPluginVariable() {
      return MODEL_PLUGIN_VARIABLE;
   }

   /**
    * @return the length of identifiers for IFC elements
    */
   public static int getIfcIDLength() {
      return IFC_ID_LENGTH;
   }

   /**
    * @return the characters to be used in addition to alpha-numeric characters for the generation of identifiers for IFC elements
    */
   public static String getIfcIDAdditionalCharacters() {
      return IFC_ID_ADDITIONAL_CHARACTERS;
   }
}
