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
package lu.uni.geko.weaver;

import java.util.List;

import lu.uni.geko.common.AbstractModelTransformer;
import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.common.JoinPoint;
import lu.uni.geko.resources.MainResourceLoader;
import lu.uni.geko.util.bridges.EMFBridge;
import lu.uni.geko.util.datastructures.N2NMap;
import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.weaver.add.MainAdder;
import lu.uni.geko.weaver.merge.Merger;
import lu.uni.geko.weaver.remove.Remover;
import lu.uni.geko.weaver.scope.AdviceAndScopeResolver;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A facade for initiating the weaving process for a base, pointcut and advice model using a mapping from pointcut to advice
 * elements. This class initiates all steps required for weaving and handles the involved parameters but it has to be used
 * according to the protocol mentioned in its {@link #Weaver(URI, URI, N2NMap, boolean) constructor}.
 *
 * @author Max E. Kramer
 */
public class Weaver extends AbstractModelTransformer<URI> {
   /** The URI of the advice model. */
   private final URI adviceMURI;
   /** The URI of the woven base model. */
   private final URI wovenMURI;
   /** The mapping from pointcut to advice elements. */
   private final N2NMap<EObject, EObject> pc2AvN2NMap;
   /** The join points detected for this weaving task. */
   private List<JoinPoint> joinPoints;

   /**
    * Constructs a new Weaver using the given base model URI, the given advice model URI and the given mapping from pointcut to
    * advice elements.<br/>
    * <br/>
    * <b>Attention</b>: In order to work as expected an Weaver has to be used according to the following protocol:<br/>
    *
    * <pre>
    *  Weaver weaver = new Weaver(baseMURI, ...);
    *  URI wovenMURI = weaver.copyBaseToWovenMURI();
    *  // perform the join point detection using the new result resource that contains a copy of the base
    *  ...
    *  List<JoinPoint> joinPoints = detectJoinpoints(pcMURI, wovenMURI, ...);
    *  // this ensures that the result of the join point detection refers to the copied base elements
    *  // and not to the original elements of the base
    *  weaver.setJoinPoints(joinPoints);
    *  weaver.transform();
    * </pre>
    *
    * @param baseMURI
    *           the URI of the base model
    * @param adviceMURI
    *           the URI of the advice model
    * @param pc2AvN2NMap
    *           the mapping from pointcut to advice elements
    */
   public Weaver(final URI baseMURI, final URI adviceMURI, final N2NMap<EObject, EObject> pc2AvN2NMap) {
      super(baseMURI);
      this.wovenMURI = EMFBridge.newURIWithStringAppendedToFilename(baseMURI, GeKoConstants.getWovenMFilenameAppendage());
      this.adviceMURI = adviceMURI;
      this.pc2AvN2NMap = pc2AvN2NMap;
   }

   /**
    * Copies the base model of this weaver to the woven model URI of this weaver.
    *
    * @return the URI of the woven model that contains a copy of the base model
    */
   public URI copyBaseToWovenMURI() {
      EObject baseRootElement = MainResourceLoader.getUniqueContentRoot(this.getMURI(), "base model");
      EObject wovenRootElement = EcoreUtil.copy(baseRootElement);
      MainResourceLoader.saveEObjectAsOnlyContent(wovenRootElement, this.wovenMURI);
      return wovenMURI;
   }

   /**
    * Registers the detected join points needed for weaving.
    *
    * @param joinPoints
    *           a list of join points
    */
   public void setJoinPoints(final List<JoinPoint> joinPoints) {
      this.joinPoints = joinPoints;
   }

   @Override
   public URI transform() {
      for (JoinPoint joinPoint : this.joinPoints) {
         Advice advice = AdviceAndScopeResolver.resolveAvAndInstantiationScopes(this.adviceMURI);
         AdviceEffectuation adviceEffectuation = AdviceEffectuationCalculator.calculateAdviceEffectuation(joinPoint, advice,
               this.pc2AvN2NMap);
         getConsole().println("\nInspecting join point: " + joinPoint + "\n");
         getConsole().println("Advice:\n" + advice + "\n");
         getConsole().println("AdviceEffectuation:\n" + adviceEffectuation + "\n");
         Merger merger = new Merger(advice, adviceEffectuation, this.wovenMURI);
         FeatureEquivalenceHelper featureEquivalenceHelper = merger.performMergesAndReturnFeatureEquivalenceHelper();
         MainAdder.performAdditions(advice, adviceEffectuation, featureEquivalenceHelper, this.wovenMURI);
         Remover.performRemovals(adviceEffectuation);
      }
      getConsole().println("\nFinished weaving at all " + joinPoints.size() + " join points.\n");
      getConsole().print("Saving woven model ...");
      MainResourceLoader.save(wovenMURI);
      getConsole().println(" done");
      return this.wovenMURI;
   }
}
