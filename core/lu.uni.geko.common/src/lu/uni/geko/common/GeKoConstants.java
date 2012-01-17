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


public class GeKoConstants {
	// constants for user interface
	public static final String CONSOLE_NAME = "GeKo";
	public static final String CONSOLE_TITLE =  "GeKo - A Generic Model Weaver";
	
	// constants for file selection restrictions
	/* Attention in the plugin.xml the availability of the corresponding action is restricted independently of the value of this constant! */
	public static final String MM_FILE_EXT = "ecore";
	/* Attention in the plugin.xml the availability of the corresponding action is restricted independently of the value of this constant! */
	public static final String POINTCUT_FILE_EXT_SUFFIX = "_pc";
	/* Attention in the plugin.xml the availability of the corresponding action is restricted independently of the value of this constant! */
	public static final String ADVICE_FILE_EXT_SUFFIX = "_av";
	/* Attention in the plugin.xml the availability of the corresponding action is restricted independently of the value of this constant! */
	public static final String GENMODEL_FILE_EXT = "genmodel";
	public static final String PC2AVMAPPING_FILE_EXT = "pc2avmapping";
	
	// constants for names of new files
	public static final String POINTCUT_MM_FILENAME_APPENDAGE = "_pointcut";
	public static final String ADVICE_MM_FILENAME_APPENDAGE = "_advice";
	public static final String WOVEN_M_FILENAME_APPENDAGE = "_woven";
	
	// constants for naming elements of generated metamodels
	public static final String GEKO_MM_PACKAGE_NAME = "GeKo";
	public static final String POINTCUT_MM_PACKAGE_NAME_APPENDAGE = "_pc";
	public static final String POINTCUT_MM_PACKAGE_NSPREFIX_APPENDAGE = POINTCUT_MM_PACKAGE_NAME_APPENDAGE;
	public static final String POINTCUT_MM_PACKAGE_NSURI_APPENDAGE = POINTCUT_MM_FILENAME_APPENDAGE;
	public static final String POINTCUT_MM_ROOT_ELEMENT_NAME = "Pointcut";
	public static final String ADVICE_MM_PACKAGE_NAME_APPENDAGE = "_av";
	public static final String ADVICE_MM_PACKAGE_NSPREFIX_APPENDAGE = ADVICE_MM_PACKAGE_NAME_APPENDAGE;
	public static final String ADVICE_MM_PACKAGE_NSURI_APPENDAGE = ADVICE_MM_FILENAME_APPENDAGE;
	public static final String ADVICE_MM_ROOT_ELEMENT_NAME = "Advice";
	
	public static final String MODEL_CODE_PLUGIN_APPENDAGE = ".model";
	
	// MAYDO MK write a mechanism that lets the user define the feature that serves as unique identifier during the guessing of a pointcut to advice mapping
	public static final String UID_FEATURE_NAME = "name";
	public static final String DEFAULT_ADVICE_INSTANTIATION_SCOPE_TYPE = "PerJoinPointScope";
	
	public static final String ARCHETYPE_M_FILENAME_APPENDAGE = "_archetype";
	
	public static final String MMTRANSFORMER_PLUGIN_ID = "lu.uni.geko.mmtransformer";
	
	// constants for naming scope related elements of generated advice metamodel
	public static final String SCOPE_MM_GLOBAL_CLASS_NAME = "GlobalScope";
	public static final String SCOPE_MM_REFERENCE_NAME = "scopedObject";
	public static final String SCOPE_MM_PER_JOIN_POINT_CLASS_NAME = "PerJoinPointScope";
}
