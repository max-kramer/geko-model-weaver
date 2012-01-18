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
package lu.uni.geko.pointcutrules;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.adapters.EMFAdapter;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/** Note that this visitor differs from the common design pattern.
 * We do not need to make every visited EObject implement a visit method as all state of EObjects is available via getters.
 */
public class PointcutRulesVisitor {
	private final StringBuffer rules;
	private int variableCount;
	private final Map<EObject, Integer> pcEObject2IDMap;
	private Map<Integer, EObject> pcID2PcEObjectMap;
	
	public PointcutRulesVisitor() {
		this.rules = new StringBuffer();
		this.variableCount = 0;
		this.pcEObject2IDMap = new HashMap<EObject,Integer>();
	}
	
	public void visitPointcut(EObject pointcut) {
		addHeader();
		List<EObject> firstLayerElements = pointcut.eContents();
		// first pass to declare all elements with their attributes as rules
		declareFirstLayerElements(firstLayerElements);
		rules.append("\n");
		// second pass to resolve all references and to express them as rules
		resolveReferencesOfFirstLayerElements(firstLayerElements);
		addMiddle();
		printAndAddParametersForVariables();
		addFooter();
	}
	
	public String getPointcutRules() {
		return rules.toString();
	}
	
	public Map<Integer, EObject> getPcID2PcEObjectMap() {
		// RATIONALE MK somebody could call this method multiple times so we should not recompute the inversion every time
		// on the other hand this is more elegant than keeping the two maps synchronous at all times
		if (this.pcID2PcEObjectMap == null) {
			this.pcID2PcEObjectMap = new HashMap<Integer, EObject>();
			for (Entry<EObject, Integer> pcEObject2IDEntry : pcEObject2IDMap.entrySet()) {
				EObject pcEObject = pcEObject2IDEntry.getKey();
				Integer pcID = pcEObject2IDEntry.getValue();
				this.pcID2PcEObjectMap.put(pcID, pcEObject);
			}
		}
		return this.pcID2PcEObjectMap;
	}

	private void addHeader() {
		rules.append("import java.lang.String;\n" +
					 "import java.util.ArrayList;\n" +
					 "import java.util.HashMap;\n" +
					 "import org.eclipse.emf.ecore.EObject;\n\n" +
					 "global java.lang.String output;\n" +
					 "global java.util.List list;\n" +
					 "global java.util.List pclist;\n\n" +
					 "rule \"Aspect\"\n" +
					 "when\n\n");
	}

	private void declareFirstLayerElements(List<EObject> firstLayerElements) {
		for (EObject eObject : firstLayerElements) {
			String varDecl = getVarDecl(eObject);
			rules.append(varDecl + ": " + getCanonicalBaseClassName(eObject) + "(");
			boolean firstAttribute = true;
			for (EAttribute attribute : eObject.eClass().getEAllAttributes()) {
				Object attributeValue = eObject.eGet(attribute);
				// RATIONALE MK Attention this also ignores pointcuts that specified on purpose that an attribute is "" or "[]"!
				if (attributeValue != null && !attributeValue.equals("") && !(attributeValue instanceof List && ((List<?>) attributeValue).isEmpty())) {
					if (firstAttribute) {
						firstAttribute = false;
					} else {
						rules.append(",");
					}
					rules.append(attribute.getName() + " == \"" + attributeValue + "\"");
				}
			}
			rules.append(")\n");
			declareFirstLayerElements(eObject.eContents());
		}
	}
	
	private void resolveReferencesOfFirstLayerElements(Collection<EObject> firstLayerElements) {
		Set<EObject> allContainedObjects = new HashSet<EObject>();
		for (EObject eObject : firstLayerElements) {
			String varName = getVarName(eObject);
			String varDecl = getVarDecl(eObject);
			rules.append(varName + ": " + getCanonicalBaseClassName(eObject) + "(" +
						 "this == " + varDecl);
			for (EStructuralFeature feature : eObject.eClass().getEAllStructuralFeatures()) {
				if (feature instanceof EReference) {
					EReference reference = (EReference) feature;
					Object referenceValue = eObject.eGet(reference);
					if (referenceValue instanceof List) {
						resolveReferencesToEObjects(reference, (List<?>) referenceValue);
					} else {
						resolveReferenceToEObject(reference, referenceValue);
					}
				}
			}
			rules.append(")\n");
			allContainedObjects.addAll(EMFAdapter.getAllContentsSet(eObject));
		}
		// RATIONALE MK avoid infinite recursion
		if (!allContainedObjects.isEmpty()) {
			resolveReferencesOfFirstLayerElements(allContainedObjects);
		}
	}

	private void resolveReferenceToEObject(EReference reference,
			Object referencedObject) {
		resolveReferenceToEObject(reference, referencedObject, "==");
	}

	private void resolveReferenceToEObject(EReference reference, Object referencedObject, String operator) {
		if (referencedObject instanceof EObject) {
			String referencedObjectVarDecl = getVarDecl((EObject) referencedObject);
			if (referencedObjectVarDecl != null) {
				rules.append(", " + reference.getName() + " " + operator + " " + referencedObjectVarDecl);
			}
		}
	}
	
	private void resolveReferencesToEObjects(EReference reference,
			List<?> referencedObjects) {
		for (Object referencedObject : referencedObjects) {
			resolveReferenceToEObject(reference, referencedObject, "contains");
		}
	}

	private void addMiddle() {
		rules.append("\nthen\n" +
					 "java.util.List param = new ArrayList<HashMap<String,EObject>>();\n" +
					 "java.util.List ids = new ArrayList<String>();\n\n");
	}

	private void printAndAddParametersForVariables() {
		for (Entry<EObject,Integer> entry : pcEObject2IDMap.entrySet()) {
			String varName = getVarName(entry.getKey());
			int ID = entry.getValue();
			rules.append(
//						 "System.out.println(" + varName + ");\n" + 
//						 "System.out.println(\"" + ID + "\");\n" + 
						 "param.add(" + varName + ");\n"+
						 "ids.add(\"" + ID + "\");\n\n");
		}
	}

	private String getVarName(EObject eObject) {
		Integer ID = pcEObject2IDMap.get(eObject);
		if (ID == null) {
			ID = this.variableCount++;
			pcEObject2IDMap.put(eObject, ID);
		}
		return "$s" + ID;
	}
	
	private String getVarDecl(EObject eObject) {
		return getVarName(eObject) + "Decl";
	}
	
	private void addFooter() {
		rules.append("list.add(param);\n" +
					 "pclist.add(ids);\n" +
					 "end");
	}
	
	private String getCanonicalBaseClassName(EObject eObject) {
		return EMFAdapter.getCanonicalClassNameWithTrimmedPackageName(eObject, GeKoConstants.POINTCUT_MM_PACKAGE_NAME_APPENDAGE);
	}
}
