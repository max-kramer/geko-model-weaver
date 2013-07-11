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
package lu.uni.geko.util.ecore;

import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * A class to be used or extended by clients to copy EObjects. The implementation is based on
 * {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier EcoreUtil.Copier} but modifies the copying of enums by obtaining enum
 * literals from the target feature and from the original feature.
 *
 * @see EnumRespectingCopier
 *
 * @author Max E. Kramer
 */
public class EnumRespectingCopier extends Copier {
   /** The recommended unique identifier for serialising. */
   private static final long serialVersionUID = 0L;

   /**
    * Re-implementation of {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier#copyAttribute(EAttribute, EObject, EObject)
    * EcoreUtil.Copier.copyAttribute(EAttribute, EObject, EObject)} that modifies the copying of enums by obtaining enum literals
    * from the target feature and from the original feature.
    *
    * @param eAttribute
    *           the attribute to copy
    * @param eObject
    *           the copy base
    * @param copyEObject
    *           the copy target
    */
   @Override
   protected final void copyAttribute(final EAttribute eAttribute, final EObject eObject, final EObject copyEObject) {
      // UNCHANGED CODE from EcoreUtil$Copier.copyAttribute(..) except for one marked modification
      if (eObject.eIsSet(eAttribute)) {
         if (FeatureMapUtil.isFeatureMap(eAttribute)) {
            FeatureMap featureMap = (FeatureMap) eObject.eGet(eAttribute);
            for (int i = 0, size = featureMap.size(); i < size; ++i) {
               EStructuralFeature feature = featureMap.getEStructuralFeature(i);
               if (feature instanceof EReference && ((EReference) feature).isContainment()) {
                  Object value = featureMap.getValue(i);
                  if (value != null) {
                     copy((EObject) value);
                  }
               }
            }
         } else if (eAttribute.isMany()) {
            List<?> source = (List<?>) eObject.eGet(eAttribute);
            @SuppressWarnings("unchecked")
            List<Object> target = (List<Object>) copyEObject.eGet(getTarget(eAttribute));
            if (source.isEmpty()) {
               target.clear();
            } else {
               target.addAll(source);
            }
         } else {
            /*
             *  BEGIN MK COPY ENUM LITERALS MODIFICATION ###
             */
            Object value = eObject.eGet(eAttribute);
            EStructuralFeature targetFeature = getTarget(eAttribute);
            EClassifier targetFeatureType = targetFeature.getEType();
            if (value instanceof Enumerator && targetFeatureType instanceof EEnum) {
               Enumerator enumValue = (Enumerator) value;
               EEnum enumType = (EEnum) targetFeatureType;
               String literalValue = enumValue.getLiteral();
               EEnumLiteral eEnumLiteral = enumType.getEEnumLiteralByLiteral(literalValue);
               if (eEnumLiteral != null) {
                  value = eEnumLiteral.getInstance();
               }
            }
            copyEObject.eSet(targetFeature, value);
            /*
             *  ### END MK COPY ENUM LITERALS MODIFICATION ###
             */
         }
      }
   }
}
