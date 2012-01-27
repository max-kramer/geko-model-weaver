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
    * constants for user interface
    */
   /** The name of the console used for displaying information to the user. */
   private static final String CONSOLE_NAME = "GeKo";
   /** The title of the console used for displaying information to the user. */
   private static final String CONSOLE_TITLE = "GeKo - A Generic Model Weaver";

   /*
    * constants for file selection restrictions
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
    * constants for names of new files
    */
   /** The string that is appended to the file name of pointcut metamodels . */
   private static final String PC_MM_FILENAME_APPENDAGE = "_pointcut";
   /** The string that is appended to the file name of advice metamodels . */
   private static final String AV_MM_FILENAME_APPENDAGE = "_advice";
   /** The string that is appended to the file name of woven base models . */
   private static final String WOVEN_M_FILENAME_APPENDAGE = "_woven";

   /*
    * constants for naming elements of generated metamodels
    */
   /** The string that is appended to the package name of a original metamodel to form the package name of a pointcut metamodel. */
   private static final String PC_MM_PKG_NAME_APPENDAGE = "_pc";
   /**
    * The string that is appended to the namespace prefix of a package of an original metamodel to form the namespace prefix of a
    * pointcut metamodel.
    */
   private static final String PC_MM_PKG_NSPREFIX_APPENDAGE = getPcMMPkgNameAppendage();
   /**
    * The string that is appended to the namespace URI of a package of an original metamodel to form the namespace URI of a
    * pointcut metamodel.
    */
   private static final String PC_MM_PKG_NSURI_APPENDAGE = getPcMMFilenameAppendage();
   /** The name of the the pointcut root element class that is introduced into pointcut metamodels. */
   private static final String PC_MM_ROOT_ELEMENT_NAME = "Pointcut";
   /** The string that is appended to the package name of a original metamodel to form the package name of an advice metamodel. */
   private static final String AV_MM_PKG_NAME_APPENDAGE = "_av";
   /**
    * The string that is appended to the namespace prefix of a package of an original metamodel to form the namespace prefix of an
    * advice metamodel.
    */
   private static final String AV_MM_PKG_NSPREFIX_APPENDAGE = getAvMMPkgNameAppendage();
   /**
    * The string that is appended to the namespace URI of a package of an original metamodel to form the namespace URI of an
    * advice metamodel.
    */
   private static final String AV_MM_PKG_NSURI_APPENDAGE = getAvMMFilenameAppendage();
   /** The name of the the advice root element class that is introduced into advice metamodels. */
   private static final String AV_MM_ROOT_ELEMENT_NAME = "Advice";
   /**
    * The string that is appended to the name of plug-in that contains a metamodel to form the name of the plug-in containing the
    * generated model code.
    */
   private static final String MODEL_CODE_PLUGIN_APPENDAGE = ".model";

   /*
    * constants for advice instantiation scope
    */
   /**
    * The name of the advice instantiation scope type that is used as default if no instantiation scope was specified by the user.
    */
   private static final String DEFAULT_AV_INSTANTIATION_SCOPE_TYPE = "PerJoinPointScope";
   /**
    * The name of the class that is introduced into the advice metamodel to let the user define global advice instantiation scope.
    */
   private static final String AV_MM_GLOBAL_SCOPE_CLASS_NAME = "GlobalScope";
   /**
    * The name of the class that is introduced into the advice metamodel to let the user define per join point advice
    * instantiation scope.
    */
   private static final String AV_MM_PER_JOIN_POINT_SCOPE_CLASS_NAME = "PerJoinPointScope";
   /**
    * The name of the reference that is used in the classes that are introduced into the advice metamodel to let the user define
    * advice instantiation scope.
    */
   private static final String AV_MM_SCOPE_REFERENCE_NAME = "scopedObject";

   /*
    * constants for unique identifier calculation
    */
   /**
    * The name of the feature that is used for the simple version of the calculation of unique identifiers during the resolution
    * of a mapping from pointcut to advice elements.
    */
   private static final String UID_FEATURE_NAME = "name";

   /*
    * constants for testing
    */
   /**
    * The string that is appended to the file name of archetype models that are used for comparison with the woven models during
    * testing.
    */
   private static final String ARCHETYPE_M_FILENAME_APPENDAGE = "_archetype";

   /*
    * constants for plug-in installation
    */
   /**
    * The ID of the metamodel transformer plug-in of GeKo that is used to obtain a context for installing and starting new
    * plug-ins.
    */
   private static final String MMTRANSFORMER_PLUGIN_ID = "lu.uni.geko.mmtransformer";

   /** Utility classes should not have a public or default constructor. */
   private GeKoConstants() {
   }

   /**
    * @return the name of the console used for displaying information to the user.
    */
   public static String getConsoleName() {
      return CONSOLE_NAME;
   }

   /**
    * @return the title of the console used for displaying information to the user.
    */
   public static String getConsoleTitle() {
      return CONSOLE_TITLE;
   }

   /**
    * @return the file extension for metamodels.<br>
    *         <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the
    *         value of this constant!
    */
   public static String getMMFileExt() {
      return MM_FILE_EXT;
   }

   /**
    * @return the file extension suffix for pointcut models.<br>
    *         <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the
    *         value of this constant!
    */
   public static String getPcFileExtSuffix() {
      return PC_FILE_EXT_SUFFIX;
   }

   /**
    * @return the file extension suffix for advice models.<br>
    *         <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the
    *         value of this constant!
    */
   public static String getAvFileExtSuffix() {
      return AV_FILE_EXT_SUFFIX;
   }

   /**
    * @return the file extension for generator models.<br>
    *         <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the
    *         value of this constant!
    */
   public static String getGenmodelFileExt() {
      return GENMODEL_FILE_EXT;
   }

   /**
    * @return the file extension for pointcut to advice mapping models.<br>
    *         <b>Attention</b>: in the plugin.xml the availability of the corresponding action is restricted independently of the
    *         value of this constant!
    */
   public static String getPc2AvMappingFileExt() {
      return PC2AVMAPPING_FILE_EXT;
   }

   /**
    * @return the string that is appended to the file name of pointcut metamodels.
    */
   public static String getPcMMFilenameAppendage() {
      return PC_MM_FILENAME_APPENDAGE;
   }

   /**
    * @return the string that is appended to the file name of advice metamodels.
    */
   public static String getAvMMFilenameAppendage() {
      return AV_MM_FILENAME_APPENDAGE;
   }

   /**
    * @return the string that is appended to the file name of woven base models.
    */
   public static String getWovenMFilenameAppendage() {
      return WOVEN_M_FILENAME_APPENDAGE;
   }

   /**
    * @return the string that is appended to the package name of a original metamodel to form the package name of a pointcut
    *         metamodel.
    */
   public static String getPcMMPkgNameAppendage() {
      return PC_MM_PKG_NAME_APPENDAGE;
   }

   /**
    * @return the string that is appended to the namespace prefix of a package of an original metamodel to form the namespace
    *         prefix of a pointcut metamodel.
    */
   public static String getPcMMPkgNsPrefixAppendage() {
      return PC_MM_PKG_NSPREFIX_APPENDAGE;
   }

   /**
    * @return the string that is appended to the namespace URI of a package of an original metamodel to form the namespace URI of
    *         a pointcut metamodel.
    */
   public static String getPcMMPkgNsURIAppendage() {
      return PC_MM_PKG_NSURI_APPENDAGE;
   }

   /** @return the name of the the pointcut root element class that is introduced into pointcut metamodels. */
   public static String getPcMMRootElementName() {
      return PC_MM_ROOT_ELEMENT_NAME;
   }

   /**
    * @return the string that is appended to the package name of a original metamodel to form the package name of an advice
    *         metamodel.
    */
   public static String getAvMMPkgNameAppendage() {
      return AV_MM_PKG_NAME_APPENDAGE;
   }

   /**
    * @return the string that is appended to the namespace prefix of a package of an original metamodel to form the namespace
    *         prefix of an advice metamodel.
    */
   public static String getAvMMPkgNsPrefixAppendage() {
      return AV_MM_PKG_NSPREFIX_APPENDAGE;
   }

   /**
    * @return the string that is appended to the namespace URI of a package of an original metamodel to form the namespace URI of
    *         an advice metamodel.
    */
   public static String getAvMMPkgNsURIAppendage() {
      return AV_MM_PKG_NSURI_APPENDAGE;
   }

   /** @return the name of the the advice root element class that is introduced into advice metamodels. */
   public static String getAvMMRootElementName() {
      return AV_MM_ROOT_ELEMENT_NAME;
   }

   /**
    * @return the string that is appended to the name of plug-in that contains a metamodel to form the name of the plug-in
    *         containing the generated model code.
    */
   public static String getModelCodePluginAppendage() {
      return MODEL_CODE_PLUGIN_APPENDAGE;
   }

   /**
    * @return the name of the advice instantiation scope type that is used as default if no instantiation scope was specified by
    *         the user.
    */
   public static String getDefaultAvInstantiationScopeType() {
      return DEFAULT_AV_INSTANTIATION_SCOPE_TYPE;
   }

   /**
    * @return the name of the class that is introduced into the advice metamodel to let the user define global advice
    *         instantiation scope.
    */
   public static String getAvMMGlobalScopeClassName() {
      return AV_MM_GLOBAL_SCOPE_CLASS_NAME;
   }

   /**
    * @return the name of the class that is introduced into the advice metamodel to let the user define per join point advice
    *         instantiation scope.
    */
   public static String getAvMMPerJoinPointScopeClassName() {
      return AV_MM_PER_JOIN_POINT_SCOPE_CLASS_NAME;
   }

   /**
    * @return the name of the reference that is used in the classes that are introduced into the advice metamodel to let the user
    *         define advice instantiation scope.
    */
   public static String getAvMMScopeReferenceName() {
      return AV_MM_SCOPE_REFERENCE_NAME;
   }

   /**
    * @return the name of the feature that is used for the simple version of the calculation of unique identifiers during the
    *         resolution of a mapping from pointcut to advice elements.
    */
   public static String getUidFeatureName() {
      return UID_FEATURE_NAME;
   }

   /**
    * @return the string that is appended to the file name of archetype models that are used for comparison with the woven models
    *         during testing.
    */
   public static String getArchetypeMFilenameAppendage() {
      return ARCHETYPE_M_FILENAME_APPENDAGE;
   }

   /**
    * @return the ID of the metamodel transformer plug-in of GeKo that is used to obtain a context for installing and starting new
    *         plug-ins.
    */
   public static String getMmtransformerPluginId() {
      return MMTRANSFORMER_PLUGIN_ID;
   }
}
