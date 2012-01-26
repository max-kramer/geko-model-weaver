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

package lu.uni.geko.weaver.pc2avmap;

import java.util.Collection;

import lu.uni.geko.util.datastructures.Pair;

import org.eclipse.emf.ecore.EObject;

/**
 * @author Max E. Kramer
 */
public interface UIDCalculatorExt {
   /** extension point ID **/
   String ID = "lu.uni.geko.weaver.pc2avmap.uidcalculatorext";

   Pair<String, Object> calculatePcElementUID(EObject pcElement, String currentUID);

   Collection<EObject> getPotentiallyCorrespondingAvElements(Collection<EObject> avElements, EObject pcElement);

   boolean isCorresponding(EObject avElement, EObject pcElement, String pcElementUID, Object uIDHelper);
}
