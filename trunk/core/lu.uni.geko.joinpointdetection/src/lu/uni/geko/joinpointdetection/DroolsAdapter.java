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
package lu.uni.geko.joinpointdetection;

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

public class DroolsAdapter {
	
	public static void detectJoinpoints(
			String pointcutRules, 
			Iterable<EObject> baseContentIteratable,
			ArrayList<ArrayList<EObject>> baseEObjectsPerMatchLists,
			ArrayList<ArrayList<String>> pcIDsPerMatchLists) {
		// prepare knowledge session by parsing the pointcut rules
		Resource pointcutRulesResource = ResourceFactory.newByteArrayResource(pointcutRules.getBytes());
		StatelessKnowledgeSession knowledgeSession = prepareKnowledgeSession(pointcutRulesResource);
		// register the result lists
		knowledgeSession.setGlobal("list", baseEObjectsPerMatchLists);
		knowledgeSession.setGlobal("pclist", pcIDsPerMatchLists);
		// execute the joinpoint detection knowledge session
		knowledgeSession.execute(baseContentIteratable);
	}
	
	private static StatelessKnowledgeSession prepareKnowledgeSession(
			Resource pointcutRulesResource) {
//		Collection<URL> classpathURLs = GeKoVariables.INSTANCE.getClasspathURLs();
//		URL[] urls = classpathURLs.toArray(new URL[classpathURLs.size()]);
//		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
//		URLClassLoader urlClassLoader = new URLClassLoader(urls, contextClassLoader);
//		KnowledgeBuilderConfiguration kBuilderConfiguration = KnowledgeBuilderFactory.newKnowledgeBuilderConfiguration(null, urlClassLoader);
//		KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder(kBuilderConfiguration);
		KnowledgeBuilder knowledgeBuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		knowledgeBuilder.add(pointcutRulesResource, ResourceType.DRL);
		if ( knowledgeBuilder.hasErrors() ) {
			for (KnowledgeBuilderError knowledgeBuilderError : knowledgeBuilder.getErrors()) {
				SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME).printErrorln(knowledgeBuilderError.getErrorLines().toString());
				SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME).printErrorln(knowledgeBuilderError.getMessage());
			}
			// FIXME MK find out why putting the generated model code classes on the classpath (commented code) is not enough for Drools to avoid to declare a dependency to the model code plugin
			System.err.println();
			SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME).confirm("The joinpoint detection was errorneous:\n" +
					knowledgeBuilder.getErrors().toString() +
					"The most likely reason is that you did not perform the following manual step:\n" +
					"Open the MANIFEST.MF of GeKo's joinpointdetection plug-in,\n" +
					"add your generated model code plug-in to the required bundles\n" +
					"and add its packages to the imported packages!");
		}
//		KnowledgeBaseConfiguration kBaseConfiguration = KnowledgeBaseFactory.newKnowledgeBaseConfiguration(null, urlClassLoader);
		KnowledgeBaseConfiguration kBaseConfiguration = KnowledgeBaseFactory.newKnowledgeBaseConfiguration();
		KnowledgeBase knowledgeBase = KnowledgeBaseFactory.newKnowledgeBase(kBaseConfiguration);
		knowledgeBase.getKnowledgePackages().clear();
		knowledgeBase.addKnowledgePackages(knowledgeBuilder.getKnowledgePackages());
		StatelessKnowledgeSession knowledgeSession = knowledgeBase.newStatelessKnowledgeSession();
		return knowledgeSession;
	}
}
