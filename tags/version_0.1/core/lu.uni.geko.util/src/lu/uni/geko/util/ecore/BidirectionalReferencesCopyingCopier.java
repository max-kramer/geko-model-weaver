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
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;

/**
 * A class to be used or extended by clients to copy EObjects while also copying bidirectional references. The implementation is
 * based on {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier EcoreUtil.Copier}.
 *
 * @see org.eclipse.emf.ecore.util.EcoreUtil.Copier EcoreUtil.Copier
 *
 * @author Max E. Kramer
 */
public class BidirectionalReferencesCopyingCopier extends Copier {
   /** The recommended unique identifier for serialising. */
   private static final long serialVersionUID = 0L;

   /**
    * Creates a new BidirectionalReferencesCopyingCopier setting the {@code resolveProxies} and {@code useOriginalReferences}
    * flags to {@code true}.
    */
   public BidirectionalReferencesCopyingCopier() {
      super(true, true);
   }

   /**
    * Called to handle the copying of a cross reference; this adds values or sets a single value as appropriate for the
    * multiplicity while <b>NOT</b> omitting any bidirectional reference that isn't in the copy map.
    *
    * @param eReference
    *           the reference to copy.
    * @param eObject
    *           the object from which to copy.
    * @param copyEObject
    *           the object to copy to.
    */
   @Override
   protected void copyReference(final EReference eReference, final EObject eObject, final EObject copyEObject) {
      if (eObject.eIsSet(eReference)) {
         if (!eReference.isMany()) {
            Object referencedEObject = eObject.eGet(eReference, resolveProxies);
            if (referencedEObject != null) {
               Object copyReferencedEObject = get(referencedEObject);
               if (copyReferencedEObject == null) {
                  if (useOriginalReferences) { // && eReference.getEOpposite() == null)
                     copyEObject.eSet(getTarget(eReference), referencedEObject);
                  }
               }
            }
         }
      }
      super.copyReference(eReference, eObject, copyEObject);
   }
}
