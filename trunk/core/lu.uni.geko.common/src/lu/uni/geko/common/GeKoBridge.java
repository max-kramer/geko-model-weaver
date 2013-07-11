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

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.bridges.EclipseBridge;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A utility class containing methods that are used by multiple GeKo plug-ins and that are GeKo specific (so they do not belong to
 * an adapter class of {@link lu.uni.geko.util.bridges}).<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently only providing one
 * implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 */
public final class GeKoBridge {
   /** The GeKo message console used for output to the user. */
   private static final SimpleMessageConsole CONSOLE = SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName());

   /** Utility classes should not have a public or default constructor. */
   private GeKoBridge() {
   }

   /**
    * Returns the root element of the pointcut model at the given URI if it has the right type (i.e. the pointcut root element
    * class introduced during the metamodel generation).
    *
    * @param pcMURI
    *           the URI of a pointcut model
    * @return the root element of the pointcut model if it has the right type and <code>null</code> otherwise
    */
   public static EObject getPcRootElementIfCorrectlyTyped(final URI pcMURI) {
      EObject rootObject = MainResourceLoader.getUniqueContentRoot(pcMURI, "pointcut model");
      if (rootObject != null) {
         if (rootObject.eClass().getName().equals(GeKoConstants.getPcMMRootElementName())) {
            // MAYDO MK when additional properties are introduced into the pointcut metamodel it should be checked whether all
            // these properties are present
            return rootObject;
         } else {
            CONSOLE.printErrorln("The root element of the pointcut model '" + pcMURI + "' is not '"
                  + GeKoConstants.getPcMMRootElementName() + "!");
         }
      }
      return null;
   }

   /**
    * Returns all pointcut elements that are contained in the pointcut resource except for elements that are pointcut-specific
    * (i.e. elements that have a type that was introduced into the pointcut version of the metamodel).
    *
    * @param pcMURI
    *           the URI of a pointcut model
    * @return all elements of the model at the given URI except for those that are pointcut-specific
    */
   public static Set<EObject> getUnspecificPcElements(final URI pcMURI) {
      return getUnspecificPcOrAvElements(pcMURI, true);
   }

   /**
    * Returns all advice elements that are contained in the advice resource except for elements that are advice-specific (i.e.
    * elements that have a type that was introduced into the advice version of the metamodel).
    *
    * @param avMURI
    *           the URI of an advice model
    * @return all elements of the model at the given URI except for those that are advice-specific
    */
   public static Set<EObject> getUnspecificAvElements(final URI avMURI) {
      return getUnspecificPcOrAvElements(avMURI, false);
   }

   /**
    * Returns all elements that are contained in the resource except for elements that are weaving-specific (i.e. elements that
    * have a type that was introduced into the pointcut or advice version of the metamodel).
    *
    * @param mURI
    *           the URI of a model
    * @param isPointcut
    *           whether a pointcut model is inspected (i.e. <code>false</code> means advice)
    * @return all elements of the model at the given URI except for those that are weaving-specific
    */
   private static Set<EObject> getUnspecificPcOrAvElements(final URI mURI, final boolean isPointcut) {
      Set<EObject> resourceContentsSet = new HashSet<EObject>();
      Iterator<EObject> allResourceContentsIterator = MainResourceLoader.getAllContentsIterator(mURI);
      if (!allResourceContentsIterator.hasNext()) {
         String message = " model at '" + mURI
               + "' has no content!" + "Make sure that you registered the model code for the used metamodel.";
         if (isPointcut) {
            throw new RuntimeException("The pointcut" + message);
         } else {
            CONSOLE.printWarningln("The advice " + message);
         }
      }
      while (allResourceContentsIterator.hasNext()) {
         EObject nextContent = allResourceContentsIterator.next();
         if (isPointcut) {
            if (!skipPcSpecificElement(nextContent)) {
               resourceContentsSet.add(nextContent);
            }
         } else {
            if (!skipAvSpecificElement(nextContent)) {
               resourceContentsSet.add(nextContent);
            }
         }
      }
      return resourceContentsSet;
   }

   /**
    * Returns {@code true} when the given element is a pointcut-specific element and should therefore be skipped during weaving.
    *
    * @param eObject
    *           an element of a pointcut model
    * @return whether the given element is a pointcut-specific element or not
    */
   private static boolean skipPcSpecificElement(final EObject eObject) {
      String eObjectClassName = eObject.eClass().getInstanceClass().getSimpleName();
      return eObjectClassName.equals(GeKoConstants.getPcMMRootElementName())
    		  || eObjectClassName.equals(GeKoConstants.getPcMMRootElementName() + GeKoConstants.getPcMMRootElementName());
      // MAYDO MK as soon as further elements and / or properties are introduced into the pointcut mm this skipping of these
      // pointcut elements for the weaving has to be updated
   }

   /**
    * Returns {@code true} when the given element is a advice-specific element and should therefore be skipped during weaving.
    *
    * @param eObject
    *           an element of an advice model
    * @return whether the given element is a advice-specific element or not
    */
   public static boolean skipAvSpecificElement(final EObject eObject) {
      String eObjectClassName = eObject.eClass().getInstanceClass().getSimpleName();
      return eObjectClassName.equals(GeKoConstants.getAvMMRootElementName())
            || eObjectClassName.equals(GeKoConstants.getAvMMGlobalScopeClassName())
            || eObjectClassName.equals(GeKoConstants.getAvMMPerJoinPointScopeClassName())
            || eObjectClassName.equals(GeKoConstants.getAvMMRootElementName() + GeKoConstants.getAvMMRootElementName())
            || eObjectClassName.equals(GeKoConstants.getAvMMGlobalScopeClassName() + GeKoConstants.getAvMMGlobalScopeClassName())
            || eObjectClassName.equals(GeKoConstants.getAvMMPerJoinPointScopeClassName() + GeKoConstants.getAvMMPerJoinPointScopeClassName());
      // MAYDO MK as soon as further elements and / or properties are introduced into the advice mm this skipping of these
      // advice elements for the weaving has to be updated
   }

   /**
    * Returns {@code true} when the given EObject is an instance of a class of an advice metamodel that was generated using GeKo.
    *
    * @param eObject
    *           the eObject to check
    * @return whether the given EObject is an advice element
    */
   public static boolean isAdviceEObject(final EObject eObject) {
      return eObject.eClass().getEPackage().getNsURI().endsWith(GeKoConstants.getAvMMPkgNsURIAppendage());
   }

   /**
    * Returns a list of attributes of the given advice EClass that correspond to the given attributes of a pointcut EClass.
    *
    * @param avEClass
    *           the EClass of an advice element from which the attributes should be taken
    * @param pcAttributes
    *           the list of attributes of a pointcut EClass
    * @return the corresponding pointcut attributes
    */
   public static List<EAttribute> getAvAttributesForPcAttributes(final EClass avEClass, final List<EAttribute> pcAttributes) {
      List<EAttribute> adviceAttributes = new ArrayList<EAttribute>(pcAttributes.size());
      for (EAttribute pointcutAttribute : pcAttributes) {
         EStructuralFeature adviceFeature = avEClass.getEStructuralFeature(pointcutAttribute.getName());
         if (adviceFeature instanceof EAttribute) {
            adviceAttributes.add((EAttribute) adviceFeature);
         } else {
            throw new RuntimeException("The advice feature '" + adviceFeature + "' corresponding to the pointcut attribute '"
                  + pointcutAttribute + "' has to be an EAttribute!");
         }
      }
      return adviceAttributes;
   }

   /**
    * Returns a list that contains all registered extensions for the default GeKo class property of the given extension point ID
    * if the property is an instance of the given class for all registered extensions and if the default GeKo priority property
    * exists. The list is ordered by decreasing priority (i.e. starting with the extension having the highest integer value
    * priority).
    *
    * @param <T>
    *           the type of the extension point property
    * @param extensionPointID
    *           the ID of the extension point to be inspected
    * @param extensionClass
    *           the class of the extension point property
    * @return a list containing the registered extensions ordered by decreasing priority
    */
   public static <T> List<T> getRegisteredExtensionsInDescPriority(final String extensionPointID, final Class<T> extensionClass) {
      return EclipseBridge.getRegisteredExtensionsInDescPriority(extensionPointID, GeKoConstants.getExtClassPropertyName(),
            GeKoConstants.getExtPriorityPropertyName(), extensionClass);
   }

   /**
    * Returns a list that contains all registered extensions for the default GeKo class property of the given extension point ID
    * together with their priority property if the property is an instance of the given class for all registered extensions and if
    * the default GeKo priority property exists. The list is not sorted in any particular order.
    *
    * @param <T>
    *           the type of the extension point property
    * @param extensionPointID
    *           the ID of the extension point to be inspected
    * @param extensionClass
    *           the class of the extension point property
    * @return a list containing the registered extensions together with their priority
    */
   public static <T> List<Pair<T, Integer>> getRegisteredExtensionsWithPriority(final String extensionPointID,
         final Class<T> extensionClass) {
      return EclipseBridge.getRegisteredExtensionsWithPriority(extensionPointID, GeKoConstants.getExtClassPropertyName(),
            GeKoConstants.getExtPriorityPropertyName(), extensionClass);
   }
}
