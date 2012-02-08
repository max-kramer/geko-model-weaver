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

package lu.uni.geko.mapping;

import java.util.Collection;

import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.ecore.EObject;

/**
 * The interface to be implemented by clients that extend the extension point lu.uni.geko.mapping.uidcalculatorext. The extension
 * point allows for customisation of the calculation of unique identifiers during the resolution of a mapping from pointcut
 * elements to advice elements.<br/>
 * <br/>
 * <b>Attention:</b> All registered extensions for this extension point are called in order of decreasing priority (i.e. starting
 * with the extension having the highest integer value priority) until the first registered extension returns a unique identifier
 * different than {@code null} for a pointcut element. As soon as this point is reached only the responsible extension that
 * calculated this unique identifier different than {@code null} is used to find a matching pointcut element.
 *
 * @author Max E. Kramer
 */
public interface UIDCalculatorExt {
   /** The extension point ID. **/
   String ID = "lu.uni.geko.mapping.uidcalculatorext";

   /**
    * Calculates the unique identifier for the given pointcut element using the current unique identifier that was calculated
    * so far. Returns this identifier together with a helper that may contain information that was created during the calculation.
    *
    * @param pcElement
    *           a pointcut element
    * @param currentUID
    *           the current unique identifier of the given pointcut element
    * @return a pair containing the unique identifier and a helper containing information created during the calculation
    */
   Pair<String, Object> calculatePcElementUID(EObject pcElement, String currentUID);

   /**
    * Returns a collections containing all candidate advice elements that may correspond to the given pointcut element using the
    * given collection of advice elements.
    *
    * @param avElements
    *           a collection of advice elements
    * @param pcElement
    *           a pointcut element
    * @return a collection of candidates taken from the given advice elements
    */
   Collection<EObject> getPotentiallyCorrespondingAvElements(Collection<EObject> avElements, EObject pcElement);

   /**
    * Returns whether the given advice element corresponds to the pointcut element with the given unique identifier using the
    * information of the given helper.
    *
    * @param avElement
    *           an advice element
    * @param pcElementUID
    *           the unique identifier of a pointcut element
    * @param uIDHelper
    *           a helper that may contain information that was created during the calculation of the unique identifier.
    * @return whether the advice element corresponds the unique identifier
    */
   boolean isCorresponding(EObject avElement, String pcElementUID, Object uIDHelper);
}
