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
package lu.uni.geko.weaver.add;

import lu.uni.geko.util.datastructures.Pair;
import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.AdviceEffectuation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * The interface to be implemented by clients that extend the extension point lu.uni.geko.weaver.add.simpleadderext. The extension
 * point allows for for simple customisation of the addition of new elements during the weaving. In contrast to the extension
 * point {@link MightyAdderExt} it facilitates extension as it gives only control over parts of the process of adding new
 * elements.<br/>
 * <br/>
 * <b>Attention</b>: All registered extensions for this extension point are called in order of decreasing priority (i.e. starting
 * with the extension having the highest integer value priority). Addition attempts for an element are performed until an
 * extension is found that succeeded. This means that if an extension succeeded in adding a new element, no attempt to add it with
 * an an extension with lower priority is performed. Likewise for an element that could not be added using a certain extension, a
 * new attempt for addition is performed using the next extension with lower priority
 *
 * @author Max E. Kramer
 */
public interface SimpleAdderExt {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.weaver.add.simpleadderext";

   /**
    * Returns a containment reference and a container that are to be used to add the given advice element to the model for which
    * the unique root element is given. The given advice, advice effectuation and feature equivalence helper can be used to
    * determine the containment reference and container.
    *
    * @param wovenRoot
    *           the unique root element of a woven model
    * @param avElementToAdd
    *           the advice element to be added
    * @param advice
    *           an advice
    * @param avEffectuation
    *           an advice effectuation
    * @param featureEquivalenceHelper
    *           a feature equivalence helper
    * @return the containment reference and container to be used to add the given advice element
    */
   Pair<EReference, EObject> getContainmentReferenceAndContainer(EObject wovenRoot, EObject avElementToAdd, Advice advice,
         AdviceEffectuation avEffectuation, FeatureEquivalenceHelper featureEquivalenceHelper);
}
