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

import lu.uni.geko.common.AbstractModelTransformer;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.adapters.EMFAdapter;
import lu.uni.geko.util.adapters.EMFFactoryAdapter;
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

/**
 * A metamodel transformer that makes base metamodels suitable for weaving (if necessary) and derives an advice and pointcut
 * metamodel from it.
 *
 * @author Max E. Kramer
 */
public class MMTransformer extends AbstractModelTransformer<Pair<URI, URI>> {
   /**
    * @see lu.uni.geko.common.AbstractModelTransformer
    * @param mmURI
    *           the URI of the metamodel
    */
   public MMTransformer(final URI mmURI) {
      super(mmURI);
   }

   @Override
   /**
    * Makes the metamodel of the transformer suitable for weaving (if necessary), derives an advice and pointcut
    * metamodel from it and generates and registers plug-ins with model, edit and editor code for all three metamodels.
    *
    * @return (pointcutMMUri, adviceMMUri)
    */
   public Pair<URI, URI> transform() {
      EPackage mmPackage = getMMPackage();
      adjustMMIfNecessary(mmPackage);
      generateAndStartPlugins(this.getMUri(), "", false);
      URI pcMMUri = generatePcMMAndPlugins(mmPackage, false);
      URI avMMUri = generateAvMMAndPlugins(mmPackage, false);
      return new Pair<URI, URI>(pcMMUri, avMMUri);
   }

   /**
    * @return the root package of the metamodel located at the URI of this transformer
    */
   private EPackage getMMPackage() {
      EPackage rootMMObject = MainResourceLoader.getResourceContentRootIfCorrectlyTyped(this.getMUri(), "metamodel",
            EPackage.class);
      return rootMMObject;
   }

   /**
    * Adjusts the given metamodel package to be suited for weaving (if needed) and saves the modifications in-place.
    *
    * @param mmPackage
    *           a root package of a metamodel
    */
   private void adjustMMIfNecessary(final EPackage mmPackage) {
      for (EObject mmContent : EMFAdapter.getAllContents(mmPackage)) {
         if (mmContent instanceof EClass) {
            EClass metaclass = (EClass) mmContent;
            for (EStructuralFeature feature : metaclass.getEStructuralFeatures()) {
               String name = feature.getName();
               String firstChar = name.substring(0, 1);
               String firstCharLowerCase = firstChar.toLowerCase();
               if (!firstChar.equals(firstCharLowerCase)) {
                  String newName = firstCharLowerCase + name.substring(1);
                  feature.setName(newName);
                  getConsole().printWarningln(
                        "The structural feature '" + name + "' of the metaclass '" + metaclass.getName() + "' "
                              + "did not obey the Java Beans standard so its first character was converted to lowercase!");
               }
            }
         }
      }
      MainResourceLoader.saveResource(this.getMUri());
   }

   /**
    * Generates a pointcut metamodel from the metamodel at the URI of this transformer and generates model code for it.
    *
    * @return the URI of the generated pointcut metamodel
    */
   public URI generatePcMMAndModelCode() {
      EPackage mmPackage = getMMPackage();
      return generatePcMMAndPlugins(mmPackage, true);
   }

   /**
    * Generates an advice metamodel from the metamodel at the URI of this transformer and generates model code for it.
    *
    * @return the URI of the generated advice metamodel
    */
   public URI generateAvMMAndModelCode() {
      EPackage mmPackage = getMMPackage();
      return generateAvMMAndPlugins(mmPackage, true);
   }

   /**
    * Generates a pointcut metamodel from the given root package of a metamodel and generates and registers a plug-in with model
    * code. Plug-ins with edit and editor code are only generated and registered if <code>onlyModelCode</code> is
    * <code>false</code>.
    *
    * @param mmPackage
    *           the root package of a metamodel
    * @param onlyModelCode
    *           whether to generate only model or also edit and editor code
    * @return the URI of the generated pointcut metamodel
    */
   private URI generatePcMMAndPlugins(final EPackage mmPackage, final boolean onlyModelCode) {
      getConsole().println("Generating a pointcut metamodel from '" + this.getMUri() + "' ...");
      EPackage pcMMPackage = createPointcutMMPackage(mmPackage);
      URI pcMMUri = EMFAdapter.newUriWithStringAppendedToFilename(this.getMUri(), GeKoConstants.getPcMMFilenameAppendage());
      MainResourceLoader.saveEObjectAsOnlyContent(pcMMPackage, pcMMUri);
      generateAndStartPlugins(pcMMUri, GeKoConstants.getPcMMPkgNameAppendage(), onlyModelCode);
      getConsole().println("Finished generating a pointcut metamodel from '" + this.getMUri() + "'.");
      return pcMMUri;
   }

   /**
    * Generates an advice metamodel from the given root package of a metamodel and generates and registers a plug-in with model
    * code. Plug-ins with edit and editor code are only generated and registered if <code>onlyModelCode</code> is
    * <code>false</code>.
    *
    * @param mmPackage
    *           the root package of a metamodel
    * @param onlyModelCode
    *           whether to generate only model or also edit and editor code
    * @return the URI of the generated advice metamodel
    */
   private URI generateAvMMAndPlugins(final EPackage mmPackage, final boolean onlyModelCode) {
      getConsole().println("Generating an advice metamodel from '" + this.getMUri() + "' ...");
      EPackage avMMPackage = createAdviceMMPackage(mmPackage);
      URI avMMUri = EMFAdapter.newUriWithStringAppendedToFilename(this.getMUri(), GeKoConstants.getAvMMFilenameAppendage());
      MainResourceLoader.saveEObjectAsOnlyContent(avMMPackage, avMMUri);
      String pluginsDirAndIDAppendage = GeKoConstants.getAvMMPkgNameAppendage();
      generateAndStartPlugins(avMMUri, pluginsDirAndIDAppendage, onlyModelCode);
      getConsole().println("Finished generating an advice metamodel from '" + this.getMUri() + "'.");
      return avMMUri;
   }

   /**
    * Generates and registers a plug-in with model code for the metamodel at the given URI. Plug-ins with edit and editor code are
    * only generated and registered if <code>onlyModelCode</code> is <code>false</code>.
    *
    * @param mmUri
    *           the URI of a metamodel
    * @param pluginsDirAndIDAppendage
    *           the string to be appended to the original plug-in directory and ID
    * @param onlyModelCode
    *           whether to generate only model or also edit and editor code
    */
   private void generateAndStartPlugins(final URI mmUri, final String pluginsDirAndIDAppendage, final boolean onlyModelCode) {
      GenModel genModel = generateCodeAndGetGenModel(mmUri, pluginsDirAndIDAppendage, onlyModelCode);
      PluginStarter.installAndStartGeneratedPlugins(genModel, onlyModelCode);
   }

   private EPackage createPointcutMMPackage(EPackage mmPackage) {
      String mmName = mmPackage.getName() + GeKoConstants.getPcMMPkgNameAppendage();
      String mmNsPrefix = mmPackage.getNsPrefix() + GeKoConstants.getPcMMPkgNsPrefixAppendage();
      String mmNsURI = mmPackage.getNsURI() + GeKoConstants.getPcMMPkgNsURIAppendage();
      String rootElementName = GeKoConstants.getPcMMRootElementName();
      return createMMPackage(mmPackage, mmName, mmNsPrefix, mmNsURI, rootElementName);
   }

   private EPackage createAdviceMMPackage(EPackage mmPackage) {
      String mmName = mmPackage.getName() + GeKoConstants.getAvMMPkgNameAppendage();
      String mmNsPrefix = mmPackage.getNsPrefix() + GeKoConstants.getAvMMPkgNsPrefixAppendage();
      String mmNsURI = mmPackage.getNsURI() + GeKoConstants.getAvMMPkgNsURIAppendage();
      String rootElementName = GeKoConstants.getAvMMRootElementName();
      EPackage adviceMMPackage = createMMPackage(mmPackage, mmName, mmNsPrefix, mmNsURI, rootElementName);
      addScopeElementsToAdviceMM(adviceMMPackage);
      return adviceMMPackage;
   }

   private EPackage createMMPackage(EPackage originalPackage, String newName, String newNsPrefix, String newNsURI,
         String rootElementName) {
      EPackage newMMPackage = EcoreUtil.copy(originalPackage);
      newMMPackage.setName(newName);
      newMMPackage.setNsPrefix(newNsPrefix);
      newMMPackage.setNsURI(newNsURI);
      EClass rootClass = EMFFactoryAdapter.addNewClassToPackage(rootElementName, newMMPackage, "metamodel '" + this.getMUri()
            + "'");
      EClassifier referenceType = EMFAdapter.getEClassifierForName("EObject");
      EMFFactoryAdapter.addNewReferenceToEClass(rootClass, "children", referenceType, 1, -1, true);
      for (EObject mmContent : EMFAdapter.getAllContents(newMMPackage)) {
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
      addScopeClassToAdviceMM(adviceMMPackage, GeKoConstants.getAvMMGlobalScopeClassName());
      addScopeClassToAdviceMM(adviceMMPackage, GeKoConstants.getAvMMPerJoinPointScopeClassName());
      // MAYDO MK SCOPE add classes for dynamic and custom scope to advice mm
   }

   public void addScopeClassToAdviceMM(EPackage adviceMMPackage, String scopeClassName) {
      EClass scopeClass = EMFFactoryAdapter.addNewClassToPackage(scopeClassName, adviceMMPackage, "advice metamodel");
      EClassifier referenceType = EMFAdapter.getEClassifierForName("EObject");
      EMFFactoryAdapter
            .addNewReferenceToEClass(scopeClass, GeKoConstants.getAvMMScopeReferenceName(), referenceType, 1, 1, false);
   }

   private GenModel generateCodeAndGetGenModel(URI mmURI, String pluginsDirAndIDAppendage, boolean onlyModelCode) {
      Monitor monitor = new BasicMonitor.Printing(System.out);
      GenModel genModel = generateGenModelForMetamodel(mmURI, pluginsDirAndIDAppendage, monitor);
      generateModelEditAndEditorCode(genModel, monitor, onlyModelCode);
      return genModel;
   }

   private GenModel generateGenModelForMetamodel(URI mmURI, String pluginsDirAndIDAppendage, Monitor monitor) {
      try {
         getConsole().println("Generating a code generator for the metamodel '" + mmURI + "' ...");
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

         String modelCodePluginDirAndIDAppendage = GeKoConstants.getModelCodePluginDirAndIDAppendage();

         if (pluginsDirAndIDAppendage == null) {
            pluginsDirAndIDAppendage = "";
         }

         // RATIONALE MK in order to have all generated code in newly generated plug-ins we append modelDirectoryAndIDAppendage to
         // the name of model code directory and model code plug-in id metamodel
         // EMF however automatically adds this appendage to the directories and plug-in ids for the edit and editor code so we
         // have to remove it from these
         String modelDirectory = genModel.getModelDirectory();
         String newModelDirectory = JavaAdapter.insertBeforeUniqueSubstring(modelDirectory, "/src", pluginsDirAndIDAppendage
               + modelCodePluginDirAndIDAppendage);
         genModel.setModelDirectory(newModelDirectory);

         String modelPluginID = genModel.getModelPluginID();
         String newModelPluginID = modelPluginID + pluginsDirAndIDAppendage + modelCodePluginDirAndIDAppendage;
         genModel.setModelPluginID(newModelPluginID);

         String editDirectory = genModel.getEditDirectory();
         String newEditDirectory = JavaAdapter.replaceUniqueSubstring(editDirectory, pluginsDirAndIDAppendage
               + modelCodePluginDirAndIDAppendage + ".edit/src", pluginsDirAndIDAppendage + ".edit/src");
         genModel.setEditDirectory(newEditDirectory);

         String editPluginID = genModel.getEditPluginID();
         String newEditPluginID = JavaAdapter.replaceUniqueSubstring(editPluginID, pluginsDirAndIDAppendage
               + modelCodePluginDirAndIDAppendage + ".edit", pluginsDirAndIDAppendage + ".edit");
         genModel.setEditPluginID(newEditPluginID);

         String editorDirectory = genModel.getEditorDirectory();
         String newEditorDirectory = JavaAdapter.replaceUniqueSubstring(editorDirectory, pluginsDirAndIDAppendage
               + modelCodePluginDirAndIDAppendage + ".editor/src", pluginsDirAndIDAppendage + ".editor/src");
         genModel.setEditorDirectory(newEditorDirectory);

         String editorPluginID = genModel.getEditorPluginID();
         String newEditorPluginID = JavaAdapter.replaceUniqueSubstring(editorPluginID, pluginsDirAndIDAppendage
               + modelCodePluginDirAndIDAppendage + ".editor", pluginsDirAndIDAppendage + ".editor");
         genModel.setEditorPluginID(newEditorPluginID);

         genModel.setGenerateSchema(false);

         MainGenModelModifier.modifyGenModelForMMURI(genModel, mmURI);

         ecoreImporter.saveGenModelAndEPackages(monitor);

         ecoreImporter.dispose();
         getConsole().println("Finished generating a code generator for the metamodel '" + mmURI + "' ...");
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
            getConsole().println("Temporarily disabling auto-build.");
         }
         getConsole().println("Generating model code for the metamodel '" + genModel.getModelName() + "' ...");
         generator.generate(genModel, GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, "model project", monitor);
         getConsole().println("Finished generating model code for the metamodel '" + genModel.getModelName() + "' ...");
         if (!onlyModelCode) {
            getConsole().println("Generating edit code for the metamodel '" + genModel.getModelName() + "' ...");
            generator.generate(genModel, GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE, "model project", monitor);
            getConsole().println("Finished generating edit code for the metamodel '" + genModel.getModelName() + "' ...");

            getConsole().println("Generating editor code for the metamodel '" + genModel.getModelName() + "' ...");
            generator.generate(genModel, GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE, "model project", monitor);
            getConsole().println("Finished generating editor code for the metamodel '" + genModel.getModelName() + "' ...");
         }
         if (autoBuildWasOn) {
            EclipseAdapter.turnOnAutoBuild();
            getConsole().println("Reenabling auto-build.");
         }
      } catch (CoreException e) {
         // soften
         throw new RuntimeException(e);
      }
   }
}
