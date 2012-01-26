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
package lu.uni.geko.common;

/**
 * A utility class containing all the constants needed by individual GeKo plug-ins.
 *
 * @author Max E. Kramer
 */
public final class GeKoConstants {
   /*
    *  constants for user interface
    */
   /** The name of the console used for displaying information to the user. */
   private static final String CONSOLE_NAME = "GeKo";
   /** The title of the console used for displaying information to the user. */
   private static final String CONSOLE_TITLE = "GeKo - A Generic Model Weaver";

   /*
    *  constants for file selection restrictions
    */
   /**
    * The file extension for metamodels.<br>
    * <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the value of
    * this constant!
    */
   private static final String MM_FILE_EXT = "ecore";
   /**
    * The file extension suffix for pointcut models.<br>
    * <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the value of
    * this constant!
    */
   private static final String PC_FILE_EXT_SUFFIX = "_pc";
   /**
    * The file extension suffix for advice models.<br>
    * <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the value of
    * this constant!
    */
   private static final String AV_FILE_EXT_SUFFIX = "_av";
   /**
    * The file extension for generator models.<br>
    * <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the value of
    * this constant!
    */
   private static final String GENMODEL_FILE_EXT = "genmodel";
   /**
    * The file extension for pointcut to advice mapping models.<br>
    * <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the value of
    * this constant!
    */
   private static final String PC2AVMAPPING_FILE_EXT = "pc2avmapping";

   /*
    *  constants for names of new files
    */
   /** The string that is appended to the file name of pointcut metamodels . */
   private static final String PC_MM_FILENAME_APPENDAGE = "_pointcut";
   /** The string that is appended to the file name of advice metamodels . */
   private static final String AV_MM_FILENAME_APPENDAGE = "_advice";
   /** The string that is appended to the file name of woven base models . */
   private static final String WOVEN_M_FILENAME_APPENDAGE = "_woven";

   /*
    *  constants for naming elements of generated metamodels
    */
   /** The string that is appended to the package name of a original metamodel to form the package name of a pointcut metamodel. */
   private static final String PC_MM_PACKAGE_NAME_APPENDAGE = "_pc";
   /** The string that is appended to the namespace prefix of a original metamodel to form the namespace prefix of a pointcut metamodel. */
   private static final String PC_MM_PACKAGE_NSPREFIX_APPENDAGE = getPcMMPackageNameAppendage();
   /** The string that is appended to the namespace URI of a original metamodel to form the namespace URI of a pointcut metamodel. */
   private static final String PC_MM_PACKAGE_NSURI_APPENDAGE = getPcMMFilenameAppendage();
   /** The name of the the pointcut root element class that is introduced into pointcut metamodels. */
   private static final String PC_MM_ROOT_ELEMENT_NAME = "Pointcut";
   /** The string that is appended to the package name of a original metamodel to form the package name of an advice metamodel. */
   private static final String AV_MM_PACKAGE_NAME_APPENDAGE = "_av";
   /** The string that is appended to the namespace prefix of a original metamodel to form the namespace prefix of an advice metamodel. */
   private static final String AV_MM_PACKAGE_NSPREFIX_APPENDAGE = getAvMMPackageNameAppendage();
   /** The string that is appended to the namespace URI of a original metamodel to form the namespace URI of an advice metamodel. */
   private static final String AV_MM_PACKAGE_NSURI_APPENDAGE = getAvMMFilenameAppendage();
   /** The name of the the advice root element class that is introduced into advice metamodels. */
   private static final String AV_MM_ROOT_ELEMENT_NAME = "Advice";
   /** The string that is appended to the name of plug-in that contains a metamodel to form the name of the plug-in containing the generated model code. */
   private static final String MODEL_CODE_PLUGIN_APPENDAGE = ".model";

   // constants for advice instantiation scope
   private static final String DEFAULT_AV_INSTANTIATION_SCOPE_TYPE = "PerJoinPointScope";
   private static final String AV_MM_GLOBAL_SCOPE_CLASS_NAME = "GlobalScope";
   private static final String AV_MM_PER_JOIN_POINT_SCOPE_CLASS_NAME = "PerJoinPointScope";
   private static final String AV_MM_SCOPE_REFERENCE_NAME = "scopedObject";

   // constants for unique identifier calculation
   public static final String UID_FEATURE_NAME = "name";

   // constants for testing
   public static final String ARCHETYPE_M_FILENAME_APPENDAGE = "_archetype";

   // constants for plug-in installation
   public static final String MMTRANSFORMER_PLUGIN_ID = "lu.uni.geko.mmtransformer";

   /** Utility classes should not have a public or default constructor. */
   private GeKoConstants() {
   }

   public static String getConsoleName() {
      return CONSOLE_NAME;
   }

   public static String getConsoleTitle() {
      return CONSOLE_TITLE;
   }

   public static String getMMFileExt() {
      return MM_FILE_EXT;
   }

   public static String getPcFileExtSuffix() {
      return PC_FILE_EXT_SUFFIX;
   }

   public static String getAvFileExtSuffix() {
      return AV_FILE_EXT_SUFFIX;
   }

   public static String getGenmodelFileExt() {
      return GENMODEL_FILE_EXT;
   }

   public static String getPc2AvMappingFileExt() {
      return PC2AVMAPPING_FILE_EXT;
   }

   public static String getPcMMFilenameAppendage() {
      return PC_MM_FILENAME_APPENDAGE;
   }

   public static String getAvMMFilenameAppendage() {
      return AV_MM_FILENAME_APPENDAGE;
   }

   public static String getWovenMFilenameAppendage() {
      return WOVEN_M_FILENAME_APPENDAGE;
   }

   public static String getPcMMPackageNameAppendage() {
      return PC_MM_PACKAGE_NAME_APPENDAGE;
   }

   public static String getPcMMPackageNsprefixAppendage() {
      return PC_MM_PACKAGE_NSPREFIX_APPENDAGE;
   }

   public static String getPcMMPackageNsuriAppendage() {
      return PC_MM_PACKAGE_NSURI_APPENDAGE;
   }

   public static String getPcMMRootElementName() {
      return PC_MM_ROOT_ELEMENT_NAME;
   }

   public static String getAvMMPackageNameAppendage() {
      return AV_MM_PACKAGE_NAME_APPENDAGE;
   }

   public static String getAvMMPackageNsprefixAppendage() {
      return AV_MM_PACKAGE_NSPREFIX_APPENDAGE;
   }

   public static String getAvMMPackageNsuriAppendage() {
      return AV_MM_PACKAGE_NSURI_APPENDAGE;
   }

   public static String getAvMMRootElementName() {
      return AV_MM_ROOT_ELEMENT_NAME;
   }

   public static String getModelCodePluginAppendage() {
      return MODEL_CODE_PLUGIN_APPENDAGE;
   }

   public static String getDefaultAvInstantiationScopeType() {
      return DEFAULT_AV_INSTANTIATION_SCOPE_TYPE;
   }

   public static String getAvMMGlobalScopeClassName() {
      return AV_MM_GLOBAL_SCOPE_CLASS_NAME;
   }

   public static String getAvMMPerJoinPointScopeClassName() {
      return AV_MM_PER_JOIN_POINT_SCOPE_CLASS_NAME;
   }

   public static String getAvMMScopeReferenceName() {
      return AV_MM_SCOPE_REFERENCE_NAME;
   }
}
