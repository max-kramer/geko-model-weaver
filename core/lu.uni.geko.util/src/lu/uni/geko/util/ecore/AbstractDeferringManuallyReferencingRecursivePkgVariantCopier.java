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
 * An abstract class to be extended by clients to create variants of EObjects. Clients have to provide:<br/>
 * 1) a method that tries to avoid creating a new variant by returning a variant if existing<br/>
 * 2) a method to register variants that were already made (in order to use the registered variant for method 1))<br/>
 * The implementation is based on {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier EcoreUtil.Copier} with various modifications
 * to change the default copying behaviour. The modification in this class avoids the creation of new variants if an existing
 * variants can be reused.
 *
 * @see lu.uni.geko.util.ecore.AbstractManuallyReferencingRecursivePkgVariantCopier
 *      AbstractManuallyReferencingRecursivePkgVariantCopier
 *
 * @author Max E. Kramer
 */
public abstract class AbstractDeferringManuallyReferencingRecursivePkgVariantCopier extends
      AbstractManuallyReferencingRecursivePkgVariantCopier {
   /** The recommended unique identifier for serialising. */
   private static final long serialVersionUID = 0L;

   /**
    * Tries to retrieve an existing variant for the given eObject or a variant that will be merged with this eObject. If no
    * existing variant can be used this method returns {@code null}.
    *
    * @param eObject
    *           an eObject
    * @return an existing variant of the given eObject
    */
   public abstract EObject getExistingVariant(EObject eObject);

   /**
    * Registers the given variant of the given eObject so that new variants will only be created if needed.
    *
    * @param eObject
    *           an eObject
    * @param variant
    *           a variant of the eObject to be registered
    */
   public abstract void registerVariant(EObject eObject, EObject variant);

   /**
    * Delegates {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier#get(Object) EcoreUtil.Copier.get(Object)} to
    * {@link AbstractDeferringManuallyReferencingRecursivePkgVariantCopier#getExistingVariantOrCreateRegisterAndReferenceANew
    * getExistingVariantOrCreateRegisterAndReferenceANew}.
    *
    * @param object
    *           an eObject
    * @return an existing or new variant of the given object
    */
   @Override
   public final EObject get(final Object object) {
      return getExistingVariantOrCreateRegisterAndReferenceANew(object);
   }

   /**
    * Delegates {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier#copy(EObject) EcoreUtil.Copier.copy(EObject)} to
    * {@link AbstractDeferringManuallyReferencingRecursivePkgVariantCopier#getExistingVariantOrCreateRegisterAndReferenceANew
    * getExistingVariantOrCreateRegisterAndReferenceANew}.
    *
    * @param eObject
    *           an eObject
    * @return an existing or new variant of the given eObject
    */
   @Override
   public final EObject copy(final EObject eObject) {
      return getExistingVariantOrCreateRegisterAndReferenceANew(eObject);
   }

   /**
    * Returns the variant that is registered for the given eObject (if existing) or creates a new variant that is registered and
    * for which references are copied otherwise.
    *
    * @param object
    *           an eObject
    * @return an existing or new variant of the given eObject
    */
   private EObject getExistingVariantOrCreateRegisterAndReferenceANew(final Object object) {
      if (object instanceof EObject) {
         EObject existingVariant = getExistingVariant((EObject) object);
         if (existingVariant != null) {
            return existingVariant;
         }
      }
      if (object instanceof EObject) {
         EObject eObject = (EObject) object;
         EObject newVariant = copyWithoutCheckingWhetherAlreadyCopied(eObject);
         registerVariant(eObject, newVariant);
         copyReferences(eObject, newVariant);
         return newVariant;
      } else {
         throw new RuntimeException(this.getClass() + " can only copy EObjects but '" + object + "' is no EObject!");
      }
   }
}
