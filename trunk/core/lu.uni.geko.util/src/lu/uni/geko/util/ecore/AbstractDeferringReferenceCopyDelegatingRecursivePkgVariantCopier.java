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

import org.eclipse.emf.ecore.EObject;

/**
 * An abstract class to be extended by clients to copy EObjects. Clients have to provide:<br/>
 * 1) a method that tries to avoid copying by returning a replacement if existing<br/>
 * 2) a method to register copies that were already made (in order to use the register for 1)<br/>
 * The implementation is based on {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier} with various modifications to change the
 * default copying behaviour.
 *
 * @see  lu.uni.geko.util.ecore.AbstractReferenceCopyDelegatingRecursivePkgVariantCopier
 *
 * @author Max E. Kramer
 */
public abstract class AbstractDeferringReferenceCopyDelegatingRecursivePkgVariantCopier extends
      AbstractReferenceCopyDelegatingRecursivePkgVariantCopier {
   private static final long serialVersionUID = -7077381667743808845L;

   /**
    * Tries to retrieve an existing copy for this advice element or a base element that will be merged with this advice element.
    * If no existing copy or base element can be used this method returns <code>null</code>.
    */
   public abstract EObject getIfNoNewCopyNeeded(EObject adviceEObject);

   /**
    * Registers the given copy of the give advice element so that it will only be copied again if needed.
    */
   public abstract void registerCopy(EObject adviceEObject, EObject copy);

   @Override
   /**
    * Returns the base object that is mapped to the given advice object (if existing)
    * and the copy of the advice object (if existing) via <code>super.get(..)</code> otherwise.<br/>
    * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
    */
   public EObject get(Object adviceObject) {
      return getIfNoNewCopyNeededAndCopyRegisterAndReferenceOtherwise(adviceObject);
   }

   @Override
   /**
    * Checks whether the advice object is mapped to a base object
    * and returns this mapped base object (if existing) or a new copy otherwise.<br/>
    * ATTENTION: References have to be copied with an additional call to <code>copyReferences()</code>.
    */
   public EObject copy(EObject adviceEObject) {
      return getIfNoNewCopyNeededAndCopyRegisterAndReferenceOtherwise(adviceEObject);
   }

   private EObject getIfNoNewCopyNeededAndCopyRegisterAndReferenceOtherwise(Object adviceObject) {
      if (adviceObject instanceof EObject) {
         EObject existingCopy = getIfNoNewCopyNeeded((EObject) adviceObject);
         if (existingCopy != null) {
            return existingCopy;
         }
      }
      if (adviceObject instanceof EObject) {
         EObject adviceEObject = (EObject) adviceObject;
         EObject newCopy = copyWithoutCheckingWhetherAlreadyCopied(adviceEObject);
         registerCopy(adviceEObject, newCopy);
         copyReferences(adviceEObject, newCopy);
         return newCopy;
      } else {
         throw new RuntimeException("Advice2BaseCopier can only copy EObjects but '" + adviceObject + "' is no EObject!");
      }
   }
}
