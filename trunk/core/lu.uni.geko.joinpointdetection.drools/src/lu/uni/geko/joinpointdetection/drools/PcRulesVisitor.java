/*******************************************************************************
 * Copyright (c) 2012 University of Luxembourg and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Max E. Kramer - initial API and implementation
 *     Flavie Roussy - enumeration attributes taken into account
 ******************************************************************************/
package lu.uni.geko.joinpointdetection.drools;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.common.MainFeatureIgnorer;
import lu.uni.geko.util.bridges.EcoreBridge;
import lu.uni.geko.util.bridges.EcorePkgVariantsBridge;
import lu.uni.geko.util.bridges.JavaPkgNameBridge;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A visitor that generates Drools rules for a pointcut model. Note that this visitor differs from the common design pattern. We
 * do not need to make every visited EObject implement a visit method as all state of EObjects is available via getters.
 *
 * @author Max E. Kramer
 */
public class PcRulesVisitor {
   /** The drools rules. */
   private final StringBuffer rules;
   /** The overall number of drools variables created so far. */
   private int variableCount;
   /** The current mapping from pointcut elements to IDs. */
   private final Map<EObject, Integer> pcEObject2IDMap;

   /**
    * Constructs a new PcRulesVisitor initialising all fields.
    */
   public PcRulesVisitor() {
      this.rules = new StringBuffer();
      this.variableCount = 0;
      this.pcEObject2IDMap = new HashMap<EObject, Integer>();
   }

   /**
    * Visits the root element of a pointcut model in two separate phases.<br/>
    * 1) visits all pointcut contents recursively to declare the corresponding variables together with their attributes<br/>
    * 2) resolves all references within the content of the pointcut
    *
    * @param pointcut
    *           the root element of a pointcut model
    */
   public void visitPointcut(final EObject pointcut) {
      addHeader();
      List<EObject> firstLayerElements = pointcut.eContents();
      // first pass to declare all elements with their attributes as rules
      declareFirstLayerElements(firstLayerElements);
      rules.append("\n");
      // second pass to resolve all references and to express them as rules
      resolveReferencesOfFirstLayerElements(firstLayerElements);
      addMiddle();
      addParametersForVariables();
      addFooter();
   }

   /**
    * @return the generated drools pointcut rules
    */
   public String getPointcutRules() {
      return rules.toString();
   }

   /**
    * @return the mapping from IDs to pointcut elements
    */
   public Map<Integer, EObject> getPcID2PcEObjectMap() {
      // RATIONALE MK somebody could call this method multiple times so we should not recompute the inversion every time
      // on the other hand this is more elegant than keeping the two maps synchronous at all times
      Map<Integer, EObject> pcID2PcEObjectMap = new HashMap<Integer, EObject>();
      for (Entry<EObject, Integer> pcEObject2IDEntry : pcEObject2IDMap.entrySet()) {
         EObject pcEObject = pcEObject2IDEntry.getKey();
         Integer pcID = pcEObject2IDEntry.getValue();
         pcID2PcEObjectMap.put(pcID, pcEObject);
      }
      return pcID2PcEObjectMap;
   }

   /**
    * Adds the header statements declaring imports and variables to the drools rules.
    */
   private void addHeader() {
      rules.append("import java.lang.String;\n" + "import java.util.ArrayList;\n" + "import java.util.HashMap;\n"
            + "import org.eclipse.emf.ecore.EObject;\n\n" + "global java.lang.String output;\n" + "global java.util.List list;\n"
            + "global java.util.List pclist;\n\n" + "rule \"Aspect\"\n" + "when\n\n");
   }

	/**
	 * Visits all first layer pointcut contents to declare the corresponding variables together with their attributes and calls
	 * itself recursively on the contents of these elements.
	 *
	 * @param firstLayerElements
	 *           the direct children elements of the root pointcut element
	 */
	private void declareFirstLayerElements(final List<EObject> firstLayerElements) {
		for (EObject pcElement : firstLayerElements) {
			String varDecl = getVarDecl(pcElement);
			rules.append(varDecl + ": " + getCanonicalBaseClassName(pcElement) + "(");
			boolean firstAttribute = true;
			for (EAttribute attribute : pcElement.eClass().getEAllAttributes()) {
				Object attributeValue;
				//if the attribute is an enumeration
				if ((attribute.getEType() instanceof EEnum)) {
					attributeValue = pcElement.eGet(attribute);
					// RATIONALE MK Attention this also ignores pointcuts that specified on purpose that an attribute is "" or "[]"!
					if (attributeValue != null && !attributeValue.equals("")
							&& !(attributeValue instanceof List && ((List<?>) attributeValue).isEmpty())) {
						boolean ignoreAttribute = MainFeatureIgnorer.ignoreDuringJoinPointDetection(attribute, attributeValue, pcElement);
						if (!ignoreAttribute) {
							if (firstAttribute) {
								firstAttribute = false;
							} else {
								rules.append(",");
							}
							//we need the full-qualified name of the enumeration, without the package name suffix
							String enumValue = attributeValue.getClass().toString();
							int enumValueConcat = enumValue.indexOf(" ");
							enumValue = enumValue.substring(enumValueConcat, enumValue.length());
							enumValue = JavaPkgNameBridge.removePkgSuffixFromCanonicalClassName(enumValue, GeKoConstants.getPcMMPkgNameAppendage());
							rules.append(attribute.getName() + " == " + enumValue + "." + attributeValue );
						}
					}
				}
				//else it is a classic attribute
				else {
				attributeValue = pcElement.eGet(attribute);
               // RATIONALE MK Attention this also ignores pointcuts that specified on purpose that
               // an attribute is "" or "[]"!
               if (attributeValue != null && !attributeValue.equals("")
                     && !(attributeValue instanceof List && ((List<?>) attributeValue).isEmpty())) {
                  boolean ignoreAttribute = MainFeatureIgnorer.ignoreDuringJoinPointDetection(attribute, attributeValue,
                        pcElement);
                  if (!ignoreAttribute) {
                     if (firstAttribute) {
                        firstAttribute = false;
                     } else {
                        rules.append(",");
                     }
                     String attributeName = attribute.getName();
                     // RATIONALE MK: Drools requires field names in rules to start with a lowercase
                     // character
                     // even though it manages to use the right uppercase implementation
                     char firstChar = attributeName.charAt(0);
                     if (Character.isUpperCase(firstChar)) {
                        char lowerFirstChar = Character.toLowerCase(firstChar);
                        String remainingAttributeName = attributeName.substring(1, attributeName.length());
                        attributeName = lowerFirstChar + remainingAttributeName;
                     }
                     rules.append(attributeName + " == \"" + attributeValue + "\"");
						}
					}
				}
			}
			rules.append(")\n");
			declareFirstLayerElements(pcElement.eContents());
		}
	}

   /**
    * Resolves all references within the first layer pointcut contents and calls itself recursively on the contents of these
    * elements.
    *
    * @param firstLayerElements
    *           the direct children elements of the root pointcut element
    */
   private void resolveReferencesOfFirstLayerElements(final Collection<EObject> firstLayerElements) {
      Set<EObject> allContainedObjects = new HashSet<EObject>();
      for (EObject eObject : firstLayerElements) {
         String varName = getVarName(eObject);
         String varDecl = getVarDecl(eObject);
         rules.append(varName + ": " + getCanonicalBaseClassName(eObject) + "(" + "this == " + varDecl);
         for (EStructuralFeature feature : eObject.eClass().getEAllStructuralFeatures()) {
            if (feature instanceof EReference) {
               resolveReference(eObject, (EReference) feature);
            }
         }
         rules.append(")\n");
         allContainedObjects.addAll(EcoreBridge.getAllContentsSet(eObject));
      }
      // as getAllContentSet returns all descendants of an object and not just the childs
   		// we remove from allContainedObjects all objects we already defined
   		for (EObject eObject : firstLayerElements) {
   			allContainedObjects.remove(eObject);
   		}
      // RATIONALE MK avoid infinite recursion
      if (!allContainedObjects.isEmpty()) {
         resolveReferencesOfFirstLayerElements(allContainedObjects);
      }
   }

   /**
    * Resolves the given reference of the given pointcut element.
    *
    * @param eObject
    *           a pointcut element
    * @param reference
    *           a reference of the pointcut element
    */
   private void resolveReference(final EObject eObject, final EReference reference) {

      Object referenceValue = eObject.eGet(reference);
      if (referenceValue instanceof List) {
         resolveReferencesToObjects(reference, (List<?>) referenceValue);
      } else {
         resolveReferenceToObject(reference, referenceValue);
      }
   }

   /**
    * Resolves the given reference to the given referenced pointcut element using the drools operator "==".
    *
    * @param reference
    *           a reference of the pointcut element
    * @param referencedObject
    *           the referenced element of the pointcut
    */
   private void resolveReferenceToObject(final EReference reference, final Object referencedObject) {
      resolveReferenceToObject(reference, referencedObject, "==");
   }

   /**
    * Resolves the given reference to the given referenced pointcut element using the given operator.
    *
    * @param reference
    *           a reference of the pointcut element
    * @param referencedObject
    *           the referenced element of the pointcut
    * @param operator
    *           the reference operator to be used
    */
   private void resolveReferenceToObject(final EReference reference, final Object referencedObject, final String operator) {
      if (referencedObject instanceof EObject) {
         String referencedObjectVarDecl = getVarDecl((EObject) referencedObject);
         if (referencedObjectVarDecl != null) {
            rules.append(", " + reference.getName() + " " + operator + " " + referencedObjectVarDecl);
         }
      } else if (referencedObject != null) {
         throw new RuntimeException("The EReference '" + reference + "' references '" + referencedObject
               + "' which is neither a List nor an EObject nor null!");
      }
   }

   /**
    * Resolves the given reference to the given referenced pointcut elements.
    *
    * @param reference
    *           a reference of the pointcut element
    * @param referencedObjects
    *           the referenced elements of the pointcut
    */
   private void resolveReferencesToObjects(final EReference reference, final List<?> referencedObjects) {
      for (Object referencedObject : referencedObjects) {
         resolveReferenceToObject(reference, referencedObject, "contains");
      }
   }

   /**
    * Adds the statements to start the "then" part and the statements to declare the variables for the matched elements and IDs to
    * the drools rules.
    */
   private void addMiddle() {
      rules.append("\nthen\n" + "java.util.List param = new ArrayList<HashMap<String,EObject>>();\n"
            + "java.util.List ids = new ArrayList<String>();\n\n");
   }

   /**
    * Adds the statements that add the declared variables to the matched elements and IDs lists to the drools rules.
    */
   private void addParametersForVariables() {
      for (Entry<EObject, Integer> entry : pcEObject2IDMap.entrySet()) {
         String varName = getVarName(entry.getKey());
         int id = entry.getValue();
         rules.append(
         // "System.out.println(" + varName + ");\n" +
         // "System.out.println(\"" + ID + "\");\n" +
         "param.add(" + varName + ");\n" + "ids.add(\"" + id + "\");\n\n");
      }
   }

   /**
    * @param eObject
    *           a pointcut element
    * @return the variable name used for the given pointcut element
    */
   private String getVarName(final EObject eObject) {
      Integer id = pcEObject2IDMap.get(eObject);
      if (id == null) {
         id = this.variableCount++;
         pcEObject2IDMap.put(eObject, id);
      }
      return "$s" + id;
   }

   /**
    * @param eObject
    *           a pointcut element
    * @return the variable declaration for the given pointcut element
    */
   private String getVarDecl(final EObject eObject) {
      return getVarName(eObject) + "Decl";
   }

   /**
    * Adds the finishing statements to the drools rules.
    */
   private void addFooter() {
      rules.append("list.add(param);\n" + "pclist.add(ids);\n" + "end");
   }

   /**
    * @param eObject
    *           a pointcut element
    * @return the canonical name of the base version of the class of the given pointcut element
    */
   private String getCanonicalBaseClassName(final EObject eObject) {
      return EcorePkgVariantsBridge.getPkgNameTrimmedCanonicalClassName(eObject, GeKoConstants.getPcMMPkgNameAppendage());
   }
}
