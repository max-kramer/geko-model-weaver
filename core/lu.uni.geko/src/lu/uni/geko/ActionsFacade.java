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
package lu.uni.geko;

import java.util.List;
import java.util.Map;

import lu.uni.geko.joinpointdetection.MainJoinpointDetector;
import lu.uni.geko.mmtransformer.MMTransformer;
import lu.uni.geko.mmtransformer.PluginStarter;
import lu.uni.geko.util.datastructures.N2NMap;
import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.weaver.AsymmetricWeaver;
import lu.uni.geko.weaver.pc2avmap.Pc2AvMapResolver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * A utility class following the facade design pattern to grant access to all commands.<br/>
 * Individual plug-ins should not access the functionality of other plug-ins directly if the functionality is also accessible for
 * the user. In such cases an new method should be added to this facade and this method should be called from the user interface
 * command as well as from the depending plug-ins.
 *
 * @author Max E. Kramer
 */
public final class ActionsFacade {
   /** Utility classes should not have a public or default constructor. */
   private ActionsFacade() {
   }

   /**
    * Generates a pointcut and an advice metamodel from the metamodel at the given URI and registers editor for these new
    * metamodels and the existing metamodel.
    *
    * @param mmURI
    *           the URI of the base metamodel
    * @return (pointcutMMURI, adviceMMURI)
    */
   public static Pair<URI, URI> generateBasePcAndAvEditors(final URI mmURI) {
      return (new MMTransformer(mmURI)).transform();
   }

   /**
    * Generates an advice metamodel from the metamodel at the given URI and generates model code for it.
    *
    * @param mmURI
    *           the URI of the base metamodel
    * @return the URI of the generated advice metamodel
    */
   public static URI generateAvMMAndModelCode(final URI mmURI) {
      return (new MMTransformer(mmURI)).generateAvMMAndModelCode();
   }

   /**
    * Generates a pointcut metamodel from the metamodel at the given URI and generates model code for it.
    *
    * @param mmURI
    *           the URI of the base metamodel
    * @return the URI of the generated pointcut metamodel
    */
   public static URI generatePcMMAndModelCode(final URI mmURI) {
      return (new MMTransformer(mmURI)).generatePcMMAndModelCode();
   }

   /**
    * Detects the joinpoints for the pointcut and base model at the given URIs and returns them in form of a list of mappings from
    * pointcut elements to base elements.
    *
    * @param pcMURI
    *           the URI of the pointcut model
    * @param baseMURI
    *           the URI of the base model
    * @return pointcut2BaseMaps: a list of mappings from pointcut EObjects to base EObjects
    */
   public static List<Map<EObject, EObject>> detectJoinpoints(final URI pcMURI, final URI baseMURI) {
      return MainJoinpointDetector.detectJoinpoints(pcMURI, baseMURI);
   }

   /**
    * Weaves the base, pointcut and advice models at the given URIs to a new woven model by inferring the mapping from pointcut to
    * advice.
    *
    * @param baseMURI
    *           the URI of the base model
    * @param pcMURI
    *           the URI of the pointcut model
    * @param avMURI
    *           the URI of the advice model
    * @param inPlace
    *           whether the weaving should be done in-place or using a new copy of the model
    * @param persist
    *           whether the result of the weaving should be saved or not
    * @return the URI of the woven model
    */
   public static URI weaveInferringPc2AvMapping(final URI baseMURI, final URI pcMURI, final URI avMURI, final boolean inPlace,
         final boolean persist) {
      N2NMap<EObject, EObject> pointcut2AdviceMapping = (new Pc2AvMapResolver(pcMURI, avMURI)).transform();
      if (pointcut2AdviceMapping == null) {
         return null;
      } else {
         return weaveAsymmetrically(baseMURI, pcMURI, avMURI, pointcut2AdviceMapping, inPlace, persist);
      }
   }

   /**
    * Weaves the base, pointcut and advice models at the given URIs to a new woven model using the mapping from pointcut to advice
    * at the given URI. Infers a completion of this mapping if needed.
    *
    * @param baseMURI
    *           the URI of the base model
    * @param pcMURI
    *           the URI of the pointcut model
    * @param avMURI
    *           the URI of the advice model
    * @param pc2AvMappingMURI
    *           the URI of the mapping from pointcut to advice elements
    * @param inPlace
    *           whether the weaving should be done in-place or using a new copy of the model
    * @param persist
    *           whether the result of the weaving should be saved or not
    * @return the URI of the woven model
    */
   public static URI weaveWithPc2AvMappingModel(final URI baseMURI, final URI pcMURI, final URI avMURI,
         final URI pc2AvMappingMURI, final boolean inPlace, final boolean persist) {
      N2NMap<EObject, EObject> pc2AvMapping = (new Pc2AvMapResolver(pcMURI, avMURI, pc2AvMappingMURI)).transform();
      if (pc2AvMapping == null) {
         return null;
      } else {
         return weaveAsymmetrically(baseMURI, pcMURI, avMURI, pc2AvMapping, inPlace, persist);
      }
   }

   /**
    * Weaves the base, pointcut and advice models at the given URIs to a new woven model using the given mapping from pointcut to
    * advice elements.
    *
    * @param baseMURI
    *           the URI of the base model
    * @param pcMURI
    *           the URI of the pointcut model
    * @param avMURI
    *           the URI of the advice model
    * @param pc2AvMapping
    *           the mapping from pointcut to advice elements
    * @param inPlace
    *           whether the weaving should be done in-place or using a new copy of the model
    * @param persist
    *           whether the result of the weaving should be saved or not
    * @return the URI of the woven model
    */
   private static URI weaveAsymmetrically(final URI baseMURI, final URI pcMURI, final URI avMURI,
         final N2NMap<EObject, EObject> pc2AvMapping, final boolean inPlace, final boolean persist) {
      AsymmetricWeaver asymmetricWeaver = new AsymmetricWeaver(baseMURI, avMURI, pc2AvMapping, inPlace);
      URI wovenMURI = inPlace ? baseMURI : asymmetricWeaver.copyBaseToWovenMURI();
      List<Map<EObject, EObject>> pc2BaseMaps = detectJoinpoints(pcMURI, wovenMURI);
      asymmetricWeaver.setPointcut2BaseMaps(pc2BaseMaps);
      asymmetricWeaver.transform(persist);
      return wovenMURI;
   }

   /**
    * Installs and starts the model, edit, and editor plug-ins that were created for the metamodel at the given URI.
    *
    * @param mmURI
    *           the URI of the metamodel for which the model, edit, and editor plug-ins were already created
    */
   public static void installAndStartGeneratedEditorPlugin(final URI mmURI) {
      PluginStarter.installAndStartGeneratedEditorPlugin(mmURI);
   }
}
