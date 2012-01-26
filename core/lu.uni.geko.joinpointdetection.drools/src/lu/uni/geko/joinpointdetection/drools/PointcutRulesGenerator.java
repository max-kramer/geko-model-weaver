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

import lu.uni.geko.common.GeKoAdapter;
import lu.uni.geko.common.modeltransform.AbstractTransformer;
import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class PointcutRulesGenerator extends AbstractTransformer<Pair<String,Map<Integer,EObject>>> {

	public PointcutRulesGenerator(URI pointcutMURI) {
		super(pointcutMURI);
	}

	/** Generates the pointcut rules for the model at the URI of this generator and returns
     * them together with a mapping from the used IDs to the corresponding
     * pointcut elements.
     *
     * @return (pointcut rules, usedIDs2CorrespondingEObjectsMap)
     */
	@Override
	public Pair<String, Map<Integer, EObject>> generate() {
		console. println("Generating pointcut rules for '" + this.uri + "' ...");
		EObject rootModelElement = GeKoAdapter.getPcRootElementIfCorrectlyTyped(this.uri);
		if (rootModelElement != null) {
			PointcutRulesVisitor pointcutRulesVisitor = new PointcutRulesVisitor();
			pointcutRulesVisitor.visitPointcut(rootModelElement);
			String pointcutRules = pointcutRulesVisitor.getPointcutRules();
			console.println("\nPointcut rules:\n" + pointcutRules);
			Map<Integer, EObject> pcID2PcEObjectMap = pointcutRulesVisitor.getPcID2PcEObjectMap();
			console.println("\nMapping from unique IDs to pointcut objects:\n" + pcID2PcEObjectMap);
			return new Pair<String, Map<Integer, EObject>>(pointcutRules, pcID2PcEObjectMap);
		} else {
			return null;
		}
	}
}
