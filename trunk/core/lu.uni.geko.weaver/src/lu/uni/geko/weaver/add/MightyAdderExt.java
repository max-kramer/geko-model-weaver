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

public interface MightyAdderExt {
   /** extension point ID **/
   String ID = "lu.uni.geko.weaver.mightyadderext";

   /**
    * ATTENTION SIDE-EFFECT: The advice elements that have been added during the execution of this method have to be removed from
    * the set of adviceEObjectsToBeAdded! FIXME MK write Java-Doc for all extension points
    *
    * @param adviceEObjectsToBeAdded
    * @param wovenMURI
    * @param advice2BaseCopier
    * @param featureCorresponder
    */
   void addAdviceEObjectsToWovenModel(Advice advice, AdviceEffectuation adviceEffectuation,
         FeatureEquivalenceHelper featureEquivalenceHelper, URI wovenMURI);
}
