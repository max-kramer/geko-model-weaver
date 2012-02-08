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

import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.AdviceEffectuation;
import lu.uni.geko.weaver.add.SimpleAdderExt;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import qut.part21.Model;

/**
 * An extension for the extension point {@link SimpleAdderExt} that returns the right containment reference of the part 21 model
 * for model elements to be added.
 *
 * @author Max E. Kramer
 */
public class IfcSimpleAdder implements SimpleAdderExt {

   @Override
   public Pair<EReference, EObject> getContainmentReferenceAndContainer(final EObject uniqueWovenRoot,
         final EObject adviceEObjectToBeAdded, final Advice advice, final AdviceEffectuation avEffectuation,
         final FeatureEquivalenceHelper featureEquivalenceHelper) {
      if (uniqueWovenRoot instanceof Model) {
         EStructuralFeature containmentFeature = uniqueWovenRoot.eClass().getEStructuralFeature("contents");
         if (containmentFeature instanceof EReference) {
            return new Pair<EReference, EObject>((EReference) containmentFeature, uniqueWovenRoot);
         } else {
            throw new RuntimeException("The 'contents' feature of the unique root element '" + uniqueWovenRoot
                  + "' of a woven IFC model has to be a EReference!");
         }
      } else {
         throw new RuntimeException("The unique root element '" + uniqueWovenRoot
               + "' of a woven IFC model has to be a Part21 Model!");
      }
   }
}
