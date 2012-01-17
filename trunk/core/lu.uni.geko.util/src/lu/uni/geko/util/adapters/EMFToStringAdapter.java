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
package lu.uni.geko.util.adapters;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

public class EMFToStringAdapter extends ToStringAdapter {
	public static final EMFToStringAdapter INSTANCE = new EMFToStringAdapter();
	
	private EMFToStringAdapter() {
		// empty
	}
	
	@Override
	protected String toString(Object object, int indentLevel) {
		if (object instanceof EObject) {
			return toString((EObject) object, indentLevel);
		}
		return super.toString(object, indentLevel);
	}
	
	protected String toString(EObject eObject, int indentLevel) {
		StringBuilder s = new StringBuilder();
		String eObjectID = getEObjectID(eObject);
		s.append(eObjectID + "<");
		EList<EStructuralFeature> eAllStructuralFeatures = eObject.eClass().getEAllStructuralFeatures();
		int featureCount = eAllStructuralFeatures.size();
		if (featureCount > 0) {
			s.append("\n");
			indentLevel++;
			String indentation = getIndentation(indentLevel);
			boolean notFirstEntry = appendFeatureNameAndValueIfNotNull(eObject, s, eAllStructuralFeatures, indentation, 0);
			for (int i = 1; i < featureCount; i++) {
				String prefix = "";
				if (notFirstEntry) {
					prefix = ",\n";
				}
				notFirstEntry |= appendFeatureNameAndValueIfNotNull(eObject, s, eAllStructuralFeatures, prefix + indentation, i);
			}
			s.append("\n");
		}
		s.append(">" + eObjectID);
		return s.toString();
	}

	private boolean appendFeatureNameAndValueIfNotNull(EObject eObject, StringBuilder s, EList<EStructuralFeature> eAllStructuralFeatures, String prefix, int featureIndex) {
		String featureNameAndValue = getFeatureNameAndValueAtIndex(eObject, eAllStructuralFeatures, featureIndex);
		if (featureNameAndValue != null) {
			s.append(prefix + featureNameAndValue);
			return true;
		} else {
			return false;
		}
	}
	
	private String getEObjectID(EObject eObject) {
		return eObject.eClass().getName() + "#" + eObject.hashCode();
	}

	private String getFeatureNameAndValueAtIndex(EObject eObject, EList<EStructuralFeature> eAllStructuralFeatures, int featureIndex) {
		StringBuilder s = new StringBuilder();
		EStructuralFeature feature = eAllStructuralFeatures.get(featureIndex);
		s.append(feature.getName() + "=");
		Object featureValue = EMFAdapter.getFeatureValueIfNotManyTyped(eObject, feature);
		if (feature instanceof EReference) {
			s.append("EReference->");
			if (feature.isMany())  {
				List<EObject> featureValues = EMFAdapter.getFeatureValuesIfManyTyped(eObject, feature);
				s.append("{");
				int referenceCount = featureValues.size();
				if (referenceCount > 0) {
					EObject referenceValue = featureValues.get(0);
					s.append(getEObjectID(referenceValue));
					for (int i = 1; i < referenceCount; i++) {
						referenceValue = featureValues.get(i);
						s.append(", " + getEObjectID(referenceValue));
					}
				} else {
					// do not print attributes that refer nothing
					return null;
				}
				s.append("}");
			} else {
				if (featureValue instanceof EObject) {
					s.append(getEObjectID((EObject) featureValue));
				} else if (featureValue == null) {
					// do not print attributes that refer nothing
					return null;
				} else {
					throw new RuntimeException("The feature '" + feature + "' is a reference but its value for '" + eObject + "' is '" + featureValue + "' which is not an EObject!");
				}
			}
		} else {
			String featureValueString = toString(featureValue, 0);
			if (featureValueString.equals("null")) {
				return null;
			} else {
				s.append(featureValueString);
			}
		}
		return s.toString();
	}
}
