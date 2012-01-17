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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public class DefaultAdder implements SimpleAdderExt {	
	@Override
	public EReference getContainmentReferenceForAdviceEObject(EObject uniqueWovenRoot, EObject adviceEObjectToBeAdded, FeatureCorresponder featureCorresponder)  {
		List<EReference> rootContainmentReferences = uniqueWovenRoot.eClass().getEAllContainments();
		// String errorMessage = "There is still an advice element '" + adviceEObjectToBeAdded + "' that is not contained in any element of the woven model but the unique root element of the woven model";
		if (rootContainmentReferences == null) {
			// throw new RuntimeException(errorMessage + " has no containment references that could serve as container for this element!");
			return null;
		} else {
			EReference unambiguousMatch = null;
			boolean ambiguous = false;
			for (EReference rootContainmentReference : rootContainmentReferences) {
				EClassifier referenceType = rootContainmentReference.getEType();
				EClass adviceClass = adviceEObjectToBeAdded.eClass();
				boolean sameOrSuperType = featureCorresponder.isSameOrSuperType(referenceType, adviceClass);
				if (sameOrSuperType) {
					if (unambiguousMatch == null) {
						unambiguousMatch = rootContainmentReference;
					} else {
						ambiguous = true;
						return null;
						// throw new RuntimeException(errorMessage + " has no unambiguous containment reference that could serve as container for this element!\n"
						//						  + "Two exemplary possible references are '" + unambiguousMatch + "' and '" + rootContainmentReference + "'");
					}
				}
			}
			if (!ambiguous && unambiguousMatch != null) {
				return unambiguousMatch;
			} else {
				return null;
				//throw new RuntimeException(errorMessage + " has no containment reference that has the right type to serve as container for this element!");
			}
		}
	}
}
