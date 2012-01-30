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
package lu.uni.geko.joinpointdetection.drools;

import java.util.Map;

import lu.uni.geko.common.AbstractModelTransformer;
import lu.uni.geko.common.GeKoAdapter;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

/**
 * A pointcut rules generator for the Drools implementation of the joinpoint detection phase.
 *
 * @author Max E. Kramer
 */
public class PcRulesGenerator extends AbstractModelTransformer<Pair<String, Map<Integer, EObject>>> {

   /**
    * @see lu.uni.geko.common.AbstractModelTransformer
    * @param pointcutMURI the URI of the pointcut model
    */
   public PcRulesGenerator(final URI pointcutMURI) {
      super(pointcutMURI);
   }

   /**
    * Generates the pointcut rules for the model at the URI of this transformer and returns them together with a mapping from the
    * used IDs to the corresponding pointcut elements.
    *
    * @return (pointcut rules, usedIDs2CorrespondingEObjectsMap)
    */
   @Override
   public Pair<String, Map<Integer, EObject>> transform() {
      getConsole().println("Generating pointcut rules for '" + this.getMURI() + "' ...");
      EObject rootModelElement = GeKoAdapter.getPcRootElementIfCorrectlyTyped(this.getMURI());
      if (rootModelElement != null) {
         PcRulesVisitor pcRulesVisitor = new PcRulesVisitor();
         pcRulesVisitor.visitPointcut(rootModelElement);
         String pcRules = pcRulesVisitor.getPointcutRules();
         getConsole().println("\nPointcut rules:\n" + pcRules);
         Map<Integer, EObject> pcID2PcEObjectMap = pcRulesVisitor.getPcID2PcEObjectMap();
         getConsole().println("\nMapping from unique IDs to pointcut objects:\n" + pcID2PcEObjectMap);
         return new Pair<String, Map<Integer, EObject>>(pcRules, pcID2PcEObjectMap);
      } else {
         return null;
      }
   }
}
