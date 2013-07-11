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
import lu.uni.geko.util.bridges.EMFBridge;
import lu.uni.geko.util.bridges.EclipseBridge;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.bridges.EcoreFactoryBridge;
import lu.uni.geko.util.bridges.JavaBridge;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.core.runtime.CoreException;
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
    * @see lu.uni.geko.common.AbstractModelTransformer AbstractModelTransformer
    * @param mmURI
    *           the URI of the metamodel
    */
   public MMTransformer(final URI mmURI) {
      super(mmURI);
   }


   /**
    * Derives an advice and pointcut metamodel from the metamodel of the transformer
    * and generates and installs plug-ins with model, edit and editor code for all three metamodels.
    *
    * @return (pointcutMMURI, adviceMMURI)
    */
   @Override
   public final Pair<URI, URI> transform() {
      EPackage mmPackage = getMMPackage();
      generateAndStartPlugins(this.getMURI(), "", false);
      URI pcMMURI = generatePcMMAndPlugins(mmPackage, false);
      URI avMMURI = generateAvMMAndPlugins(mmPackage, false);
      return new Pair<URI, URI>(pcMMURI, avMMURI);
   }

   /**
    * @return the root package of the metamodel located at the URI of this transformer
    */
   private EPackage getMMPackage() {
      EPackage rootMMObject = MainResourceLoader.getUniqueContentRootIfCorrectlyTyped(this.getMURI(), "metamodel",
            EPackage.class);
      return rootMMObject;
   }

   /**
    * Generates a pointcut metamodel from the metamodel at the URI of this transformer and generates model code for it.
    *
    * @return the URI of the generated pointcut metamodel
    */
   public final URI generatePcMMAndModelCode() {
      EPackage mmPackage = getMMPackage();
      return generatePcMMAndPlugins(mmPackage, true);
   }

   /**
    * Generates an advice metamodel from the metamodel at the URI of this transformer and generates model code for it.
    *
    * @return the URI of the generated advice metamodel
    */
   public final URI generateAvMMAndModelCode() {
      EPackage mmPackage = getMMPackage();
      return generateAvMMAndPlugins(mmPackage, true);
   }

   /**
    * Generates a pointcut metamodel from the given root package of a metamodel and generates and installs a plug-in with model
    * code. Plug-ins with edit and editor code are only generated and installed if <code>onlyModelCode</code> is
    * <code>false</code>.
    *
    * @param mmPackage
    *           the root package of a metamodel
    * @param onlyModelCode
    *           whether to generate only model or also edit and editor code
    * @return the URI of the generated pointcut metamodel
    */
   private URI generatePcMMAndPlugins(final EPackage mmPackage, final boolean onlyModelCode) {
      getConsole().println("Generating a pointcut metamodel from '" + this.getMURI() + "' ...");
      EPackage pcMMPackage = createPointcutMMPackage(mmPackage);
      URI pcMMURI = EMFBridge.newURIWithStringAppendedToFilename(this.getMURI(), GeKoConstants.getPcMMFilenameAppendage());
      MainResourceLoader.saveEObjectAsOnlyContent(pcMMPackage, pcMMURI);
      generateAndStartPlugins(pcMMURI, GeKoConstants.getPcMMPkgNameAppendage(), onlyModelCode);
      getConsole().println("Finished generating a pointcut metamodel from '" + this.getMURI() + "'.");
      return pcMMURI;
   }

   /**
    * Generates an advice metamodel from the given root package of a metamodel and generates and installs a plug-in with model
    * code. Plug-ins with edit and editor code are only generated and installed if <code>onlyModelCode</code> is
    * <code>false</code>.
    *
    * @param mmPackage
    *           the root package of a metamodel
    * @param onlyModelCode
    *           whether to generate only model or also edit and editor code
    * @return the URI of the generated advice metamodel
    */
   private URI generateAvMMAndPlugins(final EPackage mmPackage, final boolean onlyModelCode) {
      getConsole().println("Generating an advice metamodel from '" + this.getMURI() + "' ...");
      EPackage avMMPackage = createAdviceMMPackage(mmPackage);
      URI avMMURI = EMFBridge.newURIWithStringAppendedToFilename(this.getMURI(), GeKoConstants.getAvMMFilenameAppendage());
      MainResourceLoader.saveEObjectAsOnlyContent(avMMPackage, avMMURI);
      String pluginsDirAndIDAppendage = GeKoConstants.getAvMMPkgNameAppendage();
      generateAndStartPlugins(avMMURI, pluginsDirAndIDAppendage, onlyModelCode);
      getConsole().println("Finished generating an advice metamodel from '" + this.getMURI() + "'.");
      return avMMURI;
   }

   /**
    * Generates and installs a plug-in with model code for the metamodel at the given URI. Plug-ins with edit and editor code are
    * only generated and installed if <code>onlyModelCode</code> is <code>false</code>.
    *
    * @param mmURI
    *           the URI of a metamodel
    * @param pluginsDirAndIDAppendage
    *           the string to be appended to the original plug-in directory and ID
    * @param onlyModelCode
    *           whether to generate only model or also edit and editor code
    */
   private void generateAndStartPlugins(final URI mmURI, final String pluginsDirAndIDAppendage, final boolean onlyModelCode) {
      GenModel genModel = generateCodeAndGetGenModel(mmURI, pluginsDirAndIDAppendage, onlyModelCode);
      PluginStarter.installAndStartGeneratedPlugins(genModel, onlyModelCode);
   }

   /**
    * Creates a root package of a new pointcut metamodel that is derived from the given root package of a metamodel.
    *
    * @param mmPackage
    *           the root package of a metamodel
    * @return the root package of the derived pointcut metamodel
    */
   private EPackage createPointcutMMPackage(final EPackage mmPackage) {
      String mmName = mmPackage.getName() + GeKoConstants.getPcMMPkgNameAppendage();
      String mmNsPrefix = mmPackage.getNsPrefix() + GeKoConstants.getPcMMPkgNsPrefixAppendage();
      String mmNsURI = mmPackage.getNsURI() + GeKoConstants.getPcMMPkgNsURIAppendage();
      String rootElementName = GeKoConstants.getPcMMRootElementName();
      return createMMPackage(mmPackage, mmName, mmNsPrefix, mmNsURI, rootElementName);
   }

   /**
    * Creates a root package of a new advice metamodel that is derived from the given root package of a metamodel.
    *
    * @param mmPackage
    *           the root package of a metamodel
    * @return the root package of the derived advice metamodel
    */
   private EPackage createAdviceMMPackage(final EPackage mmPackage) {
      String mmName = mmPackage.getName() + GeKoConstants.getAvMMPkgNameAppendage();
      String mmNsPrefix = mmPackage.getNsPrefix() + GeKoConstants.getAvMMPkgNsPrefixAppendage();
      String mmNsURI = mmPackage.getNsURI() + GeKoConstants.getAvMMPkgNsURIAppendage();
      String rootElementName = GeKoConstants.getAvMMRootElementName();
      EPackage adviceMMPackage = createMMPackage(mmPackage, mmName, mmNsPrefix, mmNsURI, rootElementName);
      addScopeClassesToAdviceMM(adviceMMPackage);
      return adviceMMPackage;
   }

   /**
    * Creates a root package of a new metamodel that is derived from the given root package of a metamodel. The name, the
    * namespace prefix and the namespace URI of the new package are set according to the parameters and a new container metaclass
    * bearing the given name is introduced.
    *
    * @param originalPackage
    *           the root package of a metamodel
    * @param newName
    *           the name for the root package of the new metamodel
    * @param newNsPrefix
    *           the namespace prefix for the root package of the new metamodel
    * @param newNsURI
    *           the namespace URI for the root package of the new metamodel
    * @param containerName
    *           the name for the container metaclass that is introduced into the new metamodel
    * @return the root package of the derived metamodel
    */
   private EPackage createMMPackage(final EPackage originalPackage, final String newName, final String newNsPrefix,
         final String newNsURI, final String containerName) {
      EPackage newMMPackage = EcoreUtil.copy(originalPackage);
      newMMPackage.setName(newName);
      newMMPackage.setNsPrefix(newNsPrefix);
      newMMPackage.setNsURI(newNsURI);
      EClass rootClass = EcoreFactoryBridge.addNewClassToPkg(containerName, newMMPackage);
      EClassifier referenceType = EcoreBridge.getEObjectClassifier();
      EcoreFactoryBridge.addNewReferenceToEClass(rootClass, "children", referenceType, 1, -1, true);
      for (EObject mmContent : EcoreBridge.getAllContents(newMMPackage)) {
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

   /**
    * Adds metaclasses for defining advice instantiation scope to the given root package of an advice metamodel.
    *
    * @param adviceMMPackage
    *           the root package of an advice metamodel
    */
   private void addScopeClassesToAdviceMM(final EPackage adviceMMPackage) {
      addScopeClassToAdviceMM(adviceMMPackage, GeKoConstants.getAvMMGlobalScopeClassName());
      addScopeClassToAdviceMM(adviceMMPackage, GeKoConstants.getAvMMPerJoinPointScopeClassName());
      // MAYDO MK SCOPE add classes for dynamic and custom scope to advice mm
   }

   /**
    * Adds a advice instantiation scope metaclass with the given name to the given root package of an advice metamodel.
    *
    * @param adviceMMPackage
    *           the root package of an advice metamodel
    * @param scopeClassName
    *           the name of the scope metaclass
    */
   public final void addScopeClassToAdviceMM(final EPackage adviceMMPackage, final String scopeClassName) {
      EClass scopeClass = EcoreFactoryBridge.addNewClassToPkg(scopeClassName, adviceMMPackage);
      EClassifier referenceType = EcoreBridge.getEObjectClassifier();
      EcoreFactoryBridge.addNewReferenceToEClass(scopeClass, GeKoConstants.getAvMMScopeReferenceName(), referenceType, 1, 1,
            false);
   }

   /**
    * Generates a plug-in with model code for the metamodel at the given URI and returns the used generator model. Plug-ins with
    * edit and editor code are only generated if <code>onlyModelCode</code> is <code>false</code>.
    *
    * @param mmURI
    *           the URI of a metamodel
    * @param pluginsDirAndIDAppendage
    *           the string to be appended to the default plug-in directory and ID
    * @param onlyModelCode
    *           whether to generate only model or also edit and editor code
    * @return the generator model used for code generation
    */
   private GenModel generateCodeAndGetGenModel(final URI mmURI, final String pluginsDirAndIDAppendage,
         final boolean onlyModelCode) {
      Monitor monitor = new BasicMonitor.Printing(System.out);
      GenModel genModel = generateAndModifyGenModel(mmURI, pluginsDirAndIDAppendage, monitor);
      generateModelEditAndEditorCode(genModel, monitor, onlyModelCode);
      return genModel;
   }

   /**
    * Generates and modifies a generator model for generating code for the metamodel at the given URI and returns it. First, the
    * parameter pluginsDirAndIDAppendage is appended to the default IDs and directories of the plug-ins that can be generated
    * using this generator model. Second, the generator models is modified by executing all installed extensions for the
    * corresponding extension point.
    *
    * @param mmURI
    *           the URI of a metamodel
    * @param pluginsDirAndIDAppendage
    *           the string to be appended to the default plug-in directory and ID
    * @param monitor
    *           the monitor to be used for logging output during code generation
    * @return the generator model used for code generation
    */
   private GenModel generateAndModifyGenModel(final URI mmURI, final String pluginsDirAndIDAppendage, final Monitor monitor) {
      try {
         getConsole().println("Generating a code generator for the metamodel '" + mmURI + "' ...");

         Pair<GenModel, EcoreImporter> genModelAndImporter = EMFBridge.getGenModelAndEcoreImporer(mmURI, monitor);
         GenModel genModel = genModelAndImporter.getFirst();
         EcoreImporter ecoreImporter = genModelAndImporter.getSecond();

         changePluginIDsAndDirs(pluginsDirAndIDAppendage, genModel);

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

   /**
    * Appends the given parameter pluginsDirAndIDAppendage to the default IDs and directories of the plug-ins that can be
    * generated using the given generator model.
    *
    * @param pluginsDirAndIDAppendage
    *           the string to be appended to the default plug-in directory and ID
    * @param genModel
    *           a generator model used for code generation
    */
   private void changePluginIDsAndDirs(final String pluginsDirAndIDAppendage, final GenModel genModel) {
      String modelCodePluginDirAndIDAppendage = GeKoConstants.getModelCodePluginDirAndIDAppendage();

      // RATIONALE MK in order to have all generated code in newly generated plug-ins we append modelDirectoryAndIDAppendage to
      // the name of model code directory and model code plug-in id metamodel
      // EMF however automatically adds this appendage to the directories and plug-in ids for the edit and editor code so we
      // have to remove it from these
      String modelDirectory = genModel.getModelDirectory();
      String newModelDirectory = JavaBridge.insertBeforeUniqueSubstring(modelDirectory, "/src", pluginsDirAndIDAppendage
            + modelCodePluginDirAndIDAppendage);
      genModel.setModelDirectory(newModelDirectory);

      String modelPluginID = genModel.getModelPluginID();
      String newModelPluginID = modelPluginID + pluginsDirAndIDAppendage + modelCodePluginDirAndIDAppendage;
      genModel.setModelPluginID(newModelPluginID);

      String editDirectory = genModel.getEditDirectory();
      String newEditDirectory = calculateNewPluginIDOrDir(".edit/src", editDirectory, pluginsDirAndIDAppendage,
            modelCodePluginDirAndIDAppendage);
      genModel.setEditDirectory(newEditDirectory);

      String editPluginID = genModel.getEditPluginID();
      String newEditPluginID = calculateNewPluginIDOrDir(".edit", editPluginID, pluginsDirAndIDAppendage,
            modelCodePluginDirAndIDAppendage);
      genModel.setEditPluginID(newEditPluginID);

      String editorDirectory = genModel.getEditorDirectory();
      String newEditorDirectory = calculateNewPluginIDOrDir(".editor/src", editorDirectory, pluginsDirAndIDAppendage,
            modelCodePluginDirAndIDAppendage);
      genModel.setEditorDirectory(newEditorDirectory);

      String editorPluginID = genModel.getEditorPluginID();
      String newEditorPluginID = calculateNewPluginIDOrDir(".editor", editorPluginID, pluginsDirAndIDAppendage,
            modelCodePluginDirAndIDAppendage);
      genModel.setEditorPluginID(newEditorPluginID);
   }

   /**
    * Calculates a new plug-in IDs or directory of a plug-ins by inserting a new appendage between the original ID or directory
    * and the default appendage. Removes the given modelCodePluginDirAndIDAppendage that was wrongly added by EMF to all plug-in
    * IDs and directories (and not only to the ID and directory of the model plug-in).
    *
    * @param keptAppendage
    *           the default appendage to be kept
    * @param pluginIDOrDir
    *           the default plug-in ID or directory
    * @param pluginsDirAndIDAppendage
    *           the string to be appended to the default plug-in directory and ID
    * @param modelCodePluginDirAndIDAppendage
    *           the appendage from the model code plug-in to be removed
    * @return the new plug-in ID or directory
    */
   private String calculateNewPluginIDOrDir(final String keptAppendage, final String pluginIDOrDir,
         final String pluginsDirAndIDAppendage, final String modelCodePluginDirAndIDAppendage) {
      return JavaBridge.replaceUniqueSubstring(pluginIDOrDir, pluginsDirAndIDAppendage + modelCodePluginDirAndIDAppendage
            + keptAppendage, pluginsDirAndIDAppendage + keptAppendage);
   }

   /**
    * Generates model edit and editor code using the given generator model and monitor. Edit and editor code are only generated if
    * <code>onlyModelCode</code> is <code>false</code>.
    *
    * @param genModel
    *           the generator model
    * @param monitor
    *           the monitor to be used for logging output
    * @param onlyModelCode
    *           whether to generate only model or also edit and editor code
    */
   private void generateModelEditAndEditorCode(final GenModel genModel, final Monitor monitor, final boolean onlyModelCode) {
      try {
         genModel.reconcile();
         genModel.setCanGenerate(true);
         genModel.setValidateModel(true);

         Generator generator = new Generator();
         generator.setInput(genModel);
         boolean autoBuildWasOn = EclipseBridge.turnOffAutoBuildIfOn();
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
            EclipseBridge.turnOnAutoBuild();
            getConsole().println("Reenabling auto-build.");
         }
      } catch (CoreException e) {
         // soften
         throw new RuntimeException(e);
      }
   }
}
