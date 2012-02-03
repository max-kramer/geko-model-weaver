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

import lu.uni.geko.util.ecore.FeatureEquivalenceHelper;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.AdviceEffectuation;

import org.eclipse.emf.common.util.URI;

/**
 * The interface to be implemented by clients that extend the extension point lu.uni.geko.weaver.add.mightyadderext. The extension
 * point allows for complete customisation of the addition of new elements during the weaving. In contrast to the extension point
 * {@link SimpleAdderExt} it gives full control over the process of adding new elements.<br/>
 * <br/>
 * <b>Attention</b>: All registered extensions for this extension point are called in order of decreasing priority (i.e. starting
 * with the extension having the highest integer value priority). Addition attempts for an element are performed until an
 * extension is found that succeeded. This means that if an extension succeeded in adding a new element, no attempt to add it with
 * an an extension with lower priority is performed. Likewise for an element that could not be added using a certain extension, a
 * new attempt for addition is performed using the next extension with lower priority.
 *
 * @author Max E. Kramer
 */
public interface MightyAdderExt {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.weaver.add.mightyadderext";

   /**
    * Tries to add the advice elements that have to be added during the given advice effectuation using the information from the
    * given advice, the given feature equivalence helper and the given URI of the woven model.<br/>
    * <br/>
    * <b>Attention</b>: The extension has to make sure that, as <b>side-effect</b>, the advice elements that have successfully
    * been added are removed from the set of remaining advice elements to be added.
    *
    * @param advice
    *           an advice
    * @param avEffectuation
    *           an advice effectuation
    * @param featureEquivalenceHelper
    *           a feature equivalence helper
    * @param wovenMURI
    *           the URI of the woven model
    */
   void addAvElementsToWovenModel(Advice advice, AdviceEffectuation avEffectuation,
         FeatureEquivalenceHelper featureEquivalenceHelper, URI wovenMURI);
}
