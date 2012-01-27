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

import java.util.ArrayList;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseConfiguration;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderError;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.Resource;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatelessKnowledgeSession;
import org.eclipse.emf.ecore.EObject;

/**
 * A utility class encapsulating access to the API of the drools plug-ins.
 *
 * @author Max E. Kramer
 */
public final class DroolsAdapter {
   /** Utility classes should not have a public or default constructor. */
   private DroolsAdapter() {
   }

   /**
    * Detects join points conforming to the pointcut (given as drools rules) within the base model (given as iterable) and
    * stores the results in the lists of lists for matched EObjects and their IDs.
    *
    * @param pcRules the pointcut in form of a string representation of drools rules
    * @param baseMIteratable an iterable access to the base model
    * @param baseEObjectsPerMatchLists a list containing a list of matched base elements for each matched join point
    * @param pcIDsPerMatchLists a list containing lists that contain the IDs of the matched base elements for each matched join point
    */
   public static void detectJoinpoints(final String pcRules, final Iterable<EObject> baseMIteratable,
         final ArrayList<ArrayList<EObject>> baseEObjectsPerMatchLists, final ArrayList<ArrayList<String>> pcIDsPerMatchLists) {
      // prepare knowledge session by parsing the pointcut rules
      Resource pcRulesResource = ResourceFactory.newByteArrayResource(pcRules.getBytes());
      StatelessKnowledgeSession knowledgeSession = prepareKnowledgeSession(pcRulesResource);
      // register the result lists
      knowledgeSession.setGlobal("list", baseEObjectsPerMatchLists);
      knowledgeSession.setGlobal("pclist", pcIDsPerMatchLists);
      // execute the joinpoint detection knowledge session
      knowledgeSession.execute(baseMIteratable);
   }

   /**
    * Prepares a stateless knowledge session for the given drools rules resource.
    * @param droolsRulesResource a resource for drools rules
    * @return the created knowledge session
    */
   private static StatelessKnowledgeSession prepareKnowledgeSession(final Resource droolsRulesResource) {
      // FIXME MK find out why putting the generated model code classes on the classpath (commented code) is not enough for
      // Drools to avoid to declare a dependency to the model code plugin (and remove the commented code afterwards)

      // Collection<URL> classpathURLs = GeKoVariables.INSTANCE.getClasspathURLs();
      // URL[] urls = classpathURLs.toArray(new URL[classpathURLs.size()]);
      // ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
      // URLClassLoader urlClassLoader = new URLClassLoader(urls, contextClassLoader);
      // KnowledgeBuilderConfiguration kBuilderConfiguration = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration(null,
      // urlClassLoader);
      // KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(kBuilderConfiguration);
      KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
      knowledgeBuilder.add(droolsRulesResource, ResourceType.DRL);
      if (knowledgeBuilder.hasErrors()) {
         for (KnowledgeBuilderError knowledgeBuilderError : knowledgeBuilder.getErrors()) {
            SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName()).printErrorln(
                  knowledgeBuilderError.getErrorLines().toString());
            SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName()).printErrorln(
                  knowledgeBuilderError.getMessage());
         }
         System.err.println();
         SimpleMessageConsoleManager.getConsole(GeKoConstants.getConsoleName()).confirm(
               "The joinpoint detection was errorneous:\n" + knowledgeBuilder.getErrors().toString()
                     + "The most likely reason is that you did not perform the following manual step:\n"
                     + "Open the MANIFEST.MF of the plug-in lu.uni.geko.joinpointdetection.drools ,\n"
                     + "add your generated model code plug-in to the required bundles\n"
                     + "and add its packages to the imported packages!");
      }
      // KnowledgeBaseConfiguration kBaseConfiguration = KnowledgeBaseFactory.newKnowledgeBaseConfiguration(null, urlClassLoader);
      KnowledgeBaseConfiguration kBaseConfiguration = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
      KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase(kBaseConfiguration);
      knowledgeBase.getKnowledgePackages().clear();
      knowledgeBase.addKnowledgePackages(knowledgeBuilder.getKnowledgePackages());
      StatelessKnowledgeSession knowledgeSession = knowledgeBase.newStatelessKnowledgeSession();
      return knowledgeSession;
   }
}
