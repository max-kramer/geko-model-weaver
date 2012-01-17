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
package lu.uni.geko.mmtransformer;

import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.common.modeltransform.AbstractTransformer;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.adapters.EMFFactoryAdapter;
import lu.uni.geko.util.adapters.EMFResourceAdapter;
import lu.uni.geko.util.adapters.EclipseAdapter;
import lu.uni.geko.util.adapters.JavaAdapter;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.common.util.BasicMonitor;
import org.eclipse.emf.common.util.Monitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.importer.ecore.EcoreImporter;

public class MMTransformer extends AbstractTransformer<Pair<URI, URI>> {
	public MMTransformer(URI mmURI) {
		super(mmURI);
	}

	@Override
	public Pair<URI, URI> generate() {
		EPackage mmPackage = getMMPackage();
		repairMMIfNecessary(mmPackage);
		generateAndStartPlugins(this.uri, "", false);
		URI pointcutMMUri = generatePointcutMM(mmPackage, false);
		URI adviceMMUri = generateAdviceMM(mmPackage, false);
		return new Pair<URI, URI>(pointcutMMUri, adviceMMUri);
	}

	private EPackage getMMPackage() {
		EPackage rootMMObject = MainResourceLoader.getResourceContentRootIfCorrectlyTyped(this.uri, "metamodel", EPackage.class);
		return (EPackage) rootMMObject;
	}
	
	private void repairMMIfNecessary(EPackage mmPackage) {
		Set<EObject> mmContents = EMFResourceAdapter.getAllContentsSet(mmPackage);
		for (EObject mmContent : mmContents) {
			if (mmContent instanceof EClass) {
				EClass metaclass = (EClass) mmContent;
				for (EStructuralFeature feature : metaclass.getEStructuralFeatures()) {
					String name = feature.getName();
					String firstChar = name.substring(0, 1);
					String firstCharLowerCase = firstChar.toLowerCase();
					if (!firstChar.equals(firstCharLowerCase)) {
						String newName = firstCharLowerCase + name.substring(1);
						feature.setName(newName);
						console.printWarningln("The structural feature '" + name + "' of the metaclass '" + metaclass.getName() + "' "
											+ "did not obey the Java Beans standard so its first character was converted to lowercase!");
					}
				}
			}
		}
		MainResourceLoader.saveResource(this.uri);
	}
	
	public URI generatePointcutMM() {
		EPackage mmPackage = getMMPackage();
		return generatePointcutMM(mmPackage, true);
	}
	
	public URI generateAdviceMM() {
		EPackage mmPackage = getMMPackage();
		return generateAdviceMM(mmPackage, false);
	}
	
	private URI generatePointcutMM(EPackage mmPackage, boolean onlyModelCode) {
		console. println("Generating a pointcut metamodel from '" + this.uri + "' ...");
		EPackage pointcutMMPackage = createPointcutMMPackage(mmPackage);
		URI pointcutMMUri = EMFAdapter.newUriWithStringAppendedToFilename(this.uri, GeKoConstants.POINTCUT_MM_FILENAME_APPENDAGE);
		MainResourceLoader.saveEObjectAsOnlyContent(pointcutMMPackage, pointcutMMUri);
		generateAndStartPlugins(pointcutMMUri, GeKoConstants.POINTCUT_MM_PACKAGE_NAME_APPENDAGE, onlyModelCode);
		console.println("Finished generating a pointcut metamodel from '" + this.uri + "'.");
		return pointcutMMUri;
	}
	
	private URI generateAdviceMM(EPackage mmPackage, boolean onlyModelCode) {
		console. println("Generating an advice metamodel from '" + this.uri + "' ...");
		EPackage adviceMMPackage = createAdviceMMPackage(mmPackage);
		URI adviceMMUri = EMFAdapter.newUriWithStringAppendedToFilename(this.uri, GeKoConstants.ADVICE_MM_FILENAME_APPENDAGE);
		MainResourceLoader.saveEObjectAsOnlyContent(adviceMMPackage, adviceMMUri);
		generateAndStartPlugins(adviceMMUri, GeKoConstants.ADVICE_MM_PACKAGE_NAME_APPENDAGE, onlyModelCode);
		console.println("Finished generating an advice metamodel from '" + this.uri + "'.");
		return adviceMMUri;
	}
		
	private void generateAndStartPlugins(URI pointcutMMUri, String directoryAndIDMarker, boolean onlyModelCode) {
		GenModel genModel = generateCodeAndGetGenModel(pointcutMMUri, directoryAndIDMarker, onlyModelCode);
		PluginStarter.installAndStartGeneratedPlugins(genModel, onlyModelCode);
	}

	private EPackage createPointcutMMPackage(EPackage mmPackage) {
		String mmName = mmPackage.getName() + GeKoConstants.POINTCUT_MM_PACKAGE_NAME_APPENDAGE;
		String mmNsPrefix = mmPackage.getNsPrefix() + GeKoConstants.POINTCUT_MM_PACKAGE_NSPREFIX_APPENDAGE;
		String mmNsURI = mmPackage.getNsURI() + GeKoConstants.POINTCUT_MM_PACKAGE_NSURI_APPENDAGE;
		String rootElementName = GeKoConstants.POINTCUT_MM_ROOT_ELEMENT_NAME;
		return createMMPackage(mmPackage, mmName, mmNsPrefix, mmNsURI, rootElementName);
	}
	
	private EPackage createAdviceMMPackage(EPackage mmPackage) {
		String mmName = mmPackage.getName() + GeKoConstants.ADVICE_MM_PACKAGE_NAME_APPENDAGE;
		String mmNsPrefix = mmPackage.getNsPrefix() + GeKoConstants.ADVICE_MM_PACKAGE_NSPREFIX_APPENDAGE;
		String mmNsURI = mmPackage.getNsURI() + GeKoConstants.ADVICE_MM_PACKAGE_NSURI_APPENDAGE;
		String rootElementName = GeKoConstants.ADVICE_MM_ROOT_ELEMENT_NAME;
		EPackage adviceMMPackage = createMMPackage(mmPackage, mmName, mmNsPrefix, mmNsURI, rootElementName);
		addScopeElementsToAdviceMM(adviceMMPackage);
		return adviceMMPackage;
	}

	private EPackage createMMPackage(EPackage originalPackage, String newName, String newNsPrefix, String newNsURI, String rootElementName) {
		EPackage newMMPackage = EcoreUtil.copy(originalPackage);
		newMMPackage.setName(newName);
		newMMPackage.setNsPrefix(newNsPrefix);
		newMMPackage.setNsURI(newNsURI);
		EClass rootClass = EMFFactoryAdapter.addNewClassToPackage(rootElementName, newMMPackage, "metamodel '" + this.uri + "'");
		EClassifier referenceType = EMFAdapter.getEClassifierForName("EObject");
		EMFFactoryAdapter.addNewReferenceToEClass(rootClass, "children", referenceType, 1, -1, true);
		Set<EObject> mmContents = EMFResourceAdapter.getAllContentsSet(newMMPackage);
		for (EObject mmContent : mmContents) {
			if (mmContent instanceof EClass) {
				EClass metaclass = (EClass) mmContent;
				metaclass.setAbstract(false);
			} else if (mmContent instanceof EReference) {
				EReference reference = (EReference) mmContent;
				reference.setLowerBound(0);
			}
			// MAYDO MK soften some additional constraints for the pointcut and advice metamodel if necessary
		}
		return newMMPackage;
	}

	private void addScopeElementsToAdviceMM(EPackage adviceMMPackage) {
		addScopeClassToAdviceMM(adviceMMPackage, GeKoConstants.SCOPE_MM_GLOBAL_CLASS_NAME);
		addScopeClassToAdviceMM(adviceMMPackage, GeKoConstants.SCOPE_MM_PER_JOIN_POINT_CLASS_NAME);
		// FIXME MK SCOPE add classes for dynamic and custom scope to advice mm
	}

	public void addScopeClassToAdviceMM(EPackage adviceMMPackage, String scopeClassName) {
		EClass scopeClass = EMFFactoryAdapter.addNewClassToPackage(scopeClassName, adviceMMPackage, "advice metamodel");
		EClassifier referenceType = EMFAdapter.getEClassifierForName("EObject");
		EMFFactoryAdapter.addNewReferenceToEClass(scopeClass, GeKoConstants.SCOPE_MM_REFERENCE_NAME, referenceType, 1, 1, false);
	}
	
	private GenModel generateCodeAndGetGenModel(URI mmURI, String directoryAndIDMarker, boolean onlyModelCode) {
		Monitor monitor = new BasicMonitor.Printing(System.out);
		GenModel genModel = generateGenModelForMetamodel(mmURI, directoryAndIDMarker, monitor);
		generateModelEditAndEditorCode(genModel, monitor, onlyModelCode);
		return genModel;
	}
	
	private GenModel generateGenModelForMetamodel(URI mmURI, String directoryAndIDMarker, Monitor monitor) {
		try {
			console. println("Generating a code generator for the metamodel '" + mmURI + "' ...");
			EcoreImporter ecoreImporter = new EcoreImporter();

			URI genModelContainerURI = mmURI.trimFileExtension().trimSegments(1);
			IPath genModelContainerPath = EMFAdapter.getIPathForEMFUri(genModelContainerURI);		
			ecoreImporter.setGenModelContainerPath(genModelContainerPath);
			
			String genModelFileName = mmURI.trimFileExtension().lastSegment() + ".genmodel";
			ecoreImporter.setGenModelFileName(genModelFileName);
			
			IFile modelFile = EMFAdapter.getIFileForEMFUri(mmURI);
			ecoreImporter.setModelFile(modelFile);
			
			ecoreImporter.computeEPackages(monitor);
			
			ecoreImporter.adjustEPackages(monitor);

			ecoreImporter.prepareGenModelAndEPackages(monitor);
			
			GenModel genModel = ecoreImporter.getGenModel();
			
			String modelDirectoryAndIDAppendage = GeKoConstants.MODEL_CODE_PLUGIN_APPENDAGE;
			
			if (directoryAndIDMarker == null) {
				directoryAndIDMarker = "";
			}
			
			// RATIONALE MK in order to have all generated code in newly generated plug-ins we append modelDirectoryAndIDAppendage to the name of model code directory and model code plug-in id metamodel
			// EMF however automatically adds this appendage to the directories and plug-in ids for the edit and editor code so we have to remove it from these
			String modelDirectory = genModel.getModelDirectory();
			String newModelDirectory = JavaAdapter.insertBeforeUniqueSubstring(modelDirectory, "/src", directoryAndIDMarker + modelDirectoryAndIDAppendage);
			genModel.setModelDirectory(newModelDirectory);
			
			String modelPluginID = genModel.getModelPluginID();
			String newModelPluginID = modelPluginID + directoryAndIDMarker + modelDirectoryAndIDAppendage;
			genModel.setModelPluginID(newModelPluginID);
			
			String editDirectory = genModel.getEditDirectory();
			String newEditDirectory = JavaAdapter.replaceUniqueSubstring(editDirectory, directoryAndIDMarker + modelDirectoryAndIDAppendage + ".edit/src", directoryAndIDMarker + ".edit/src");
			genModel.setEditDirectory(newEditDirectory);
			
			String editPluginID = genModel.getEditPluginID();
			String newEditPluginID = JavaAdapter.replaceUniqueSubstring(editPluginID, directoryAndIDMarker + modelDirectoryAndIDAppendage + ".edit", directoryAndIDMarker + ".edit");
			genModel.setEditPluginID(newEditPluginID);
			
			String editorDirectory = genModel.getEditorDirectory();
			String newEditorDirectory = JavaAdapter.replaceUniqueSubstring(editorDirectory, directoryAndIDMarker + modelDirectoryAndIDAppendage + ".editor/src", directoryAndIDMarker + ".editor/src");
			genModel.setEditorDirectory(newEditorDirectory);
			
			String editorPluginID = genModel.getEditorPluginID();
			String newEditorPluginID = JavaAdapter.replaceUniqueSubstring(editorPluginID, directoryAndIDMarker + modelDirectoryAndIDAppendage + ".editor", directoryAndIDMarker + ".editor");
			genModel.setEditorPluginID(newEditorPluginID);
			
			genModel.setGenerateSchema(false);
			
			MainGenModelModifier.modifyGenModelForMMURI(genModel, mmURI);

			ecoreImporter.saveGenModelAndEPackages(monitor);
			
			ecoreImporter.dispose();
			console. println("Finished generating a code generator for the metamodel '" + mmURI + "' ...");
			return genModel;
		} catch (Exception e) {
			// soften
			throw new RuntimeException(e);
		}
	}

	private void generateModelEditAndEditorCode(GenModel genModel, Monitor monitor, boolean onlyModelCode) {
		try {
			genModel.reconcile();
	        genModel.setCanGenerate(true);
	        genModel.setValidateModel(true);
			
			Generator generator = new Generator();
			generator.setInput(genModel);
			boolean autoBuildWasOn = EclipseAdapter.turnOffAutoBuildIfOn();
			if (autoBuildWasOn) {
				console. println("Temporarily disabling auto-build.");
			}
			console. println("Generating model code for the metamodel '" + genModel.getModelName() + "' ...");
			generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, "model project", monitor);
			console. println("Finished generating model code for the metamodel '" + genModel.getModelName() + "' ...");
			if (!onlyModelCode) {
				console. println("Generating edit code for the metamodel '" + genModel.getModelName() + "' ...");
				generator.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE, "model project", monitor);
				console. println("Finished generating edit code for the metamodel '" + genModel.getModelName() + "' ...");
				
				console. println("Generating editor code for the metamodel '" + genModel.getModelName() + "' ...");
				generator.generate(genModel, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE, "model project", monitor);
				console. println("Finished generating editor code for the metamodel '" + genModel.getModelName() + "' ...");
			}
			if (autoBuildWasOn) {
				EclipseAdapter.turnOnAutoBuild();
				console.println("Reenabling auto-build.");
			}
		} catch (CoreException e) {
			// soften
			throw new RuntimeException(e);
		}
	}
}
