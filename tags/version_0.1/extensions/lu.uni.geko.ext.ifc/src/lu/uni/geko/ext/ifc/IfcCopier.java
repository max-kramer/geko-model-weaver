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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.bridges.JavaBridge;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;
import lu.uni.geko.weaver.AdviceEffectuation;
import lu.uni.geko.weaver.copy.Copier;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import qut.part21.Model;
import IFC2X3.IfcOwnerHistory;
import IFC2X3.IfcRoot;

/**
 * An implementation of the interface {@link Copier} that is used by the extension point
 * {@link lu.uni.geko.weaver.copy.CopierFactoryExt lu.uni.geko.weaver.copy.copierfactoryext} handling the generation of
 * identifiers and setting of the owner history for IFC building models.
 *
 * @author Max E. Kramer
 */
public class IfcCopier implements Copier {
   /** The set containing all identifiers that are currently used in the model for which this copier is used. */
   private final Set<String> idSet;
   /** The owner history of the model for which this copier is used. */
   private final IfcOwnerHistory ownerHistory;

   /**
    * Creates a new IfcCopier for the given root element of an IFC building model and initialises the set of generated identifiers
    * and the owner history.
    *
    * @param rootElement
    *           a root element of an IFC building model
    */
   public IfcCopier(final EObject rootElement) {
      this.idSet = populateIDSet(rootElement);
      this.ownerHistory = getOwnerHistory(rootElement);
   }

   /**
    * Populates a set containing all identifiers that are used by iterating over all contents of the given root element of an IFC
    * building model.
    *
    * @param rootElement
    *           a root element of an IFC building model
    * @return a set containing all identifiers that are used
    */
   private Set<String> populateIDSet(final EObject rootElement) {
      Set<String> newIDSet = new HashSet<String>();
      Iterator<EObject> rootContentsIterator = rootElement.eAllContents();
      while (rootContentsIterator.hasNext()) {
         EObject content = rootContentsIterator.next();
         if (content instanceof IfcRoot) {
            IfcRoot ifcContent = (IfcRoot) content;
            String globalId = ifcContent.getGlobalId();
            newIDSet.add(globalId);
         }
      }
      return newIDSet;
   }

   /**
    * Returnes the owner history of the given root element of an IFC building model.
    *
    * @param rootElement
    *           a root element of an IFC building model
    * @return the owner history
    */
   private IfcOwnerHistory getOwnerHistory(final EObject rootElement) {
      if (rootElement instanceof Model) {
         Model rootModel = (Model) rootElement;
         EObject rootModelRootElement = rootModel.getRoot();
         if (rootModelRootElement instanceof IfcRoot) {
            IfcRoot rootModelIfcRoot = (IfcRoot) rootModelRootElement;
            return rootModelIfcRoot.getOwnerHistory();
         } else {
            SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
            console.printWarningln("The root object of the part21 model is not an IfcRoot.\n"
                  + "Therefore all newly added IFC objects will have no owner history!");
         }
      } else {
         SimpleMessageConsole console = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());
         console.printWarningln("The root element of the IFC resource is not a part21 model.\n"
               + "Therefore all newly added IFC objects will have no owner history!");
      }
      return null;
   }

   @Override
   public EObject copyAvElement(final EObject sourceAvElement, final EObject currentBaseVariant,
         final AdviceEffectuation avEffectuation) {
      if (currentBaseVariant instanceof IfcRoot) {
         IfcRoot copy = (IfcRoot) currentBaseVariant;
         createAndSetGlobalId(copy);
         setOwnerHistory(copy);
         setDefaultValues(sourceAvElement, copy);
      }
      return currentBaseVariant;
   }

   /**
    * Creates a new identifier for the given copied IFC model element and sets the corresponding feature.
    *
    * @param copy
    *           an IFC model element
    */
   private void createAndSetGlobalId(final IfcRoot copy) {
      String globalId = createNewGlobalId();
      idSet.add(globalId);
      copy.setGlobalId(globalId);
   }

   /**
    * Creates a new random global identifier that is different from those that are already used by this copier.
    *
    * @return a new random global identifier
    */
   private String createNewGlobalId() {
      String globalId;
      do {
         globalId = JavaBridge.getRandomAlphaNumericalString(IfcConstants.getIfcIDLength(),
               IfcConstants.getIfcIDAdditionalCharacters());
      } while (idSet.contains(globalId));
      return globalId;
   }

   /**
    * Sets the owner history of the given copied IFC model element to the one used by this copier.
    *
    * @param copy
    *           an IFC model element
    */
   private void setOwnerHistory(final IfcRoot copy) {
      if (ownerHistory != null) {
         copy.setOwnerHistory(ownerHistory);
      }
   }

   /**
    * Sets the values for features of the given copied IFC model element to default values if they are neither set in the source
    * advice element nor in the copy.
    *
    * @param sourceAvElement
    *           an advice element to used as copy source
    * @param copy
    *           a copy of the given advice element
    */
   private void setDefaultValues(final EObject sourceAvElement, final IfcRoot copy) {
      EList<EStructuralFeature> avFeatures = sourceAvElement.eClass().getEAllStructuralFeatures();
      for (EStructuralFeature avFeature : avFeatures) {
         Object avFeatureValue = avFeature.eGet(avFeature);
         if (avFeatureValue == null || avFeatureValue instanceof Boolean) {
            if (EcoreBridge.isBooleanAttribute(avFeature)) {
               EStructuralFeature copyFeature = EcoreBridge.getFeatureForName(copy, avFeature.getName());
               Object copyFeatureValue = copy.eGet(copyFeature);
               if (copyFeatureValue == null) {
                  Boolean defaultValue = avFeatureValue instanceof Boolean ? (Boolean) avFeatureValue : false;
                  copy.eSet(copyFeature, defaultValue);
               }
            }
         }
      }
   }
}
