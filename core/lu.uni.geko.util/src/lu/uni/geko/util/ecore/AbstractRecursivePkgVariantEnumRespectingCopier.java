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
 * An abstract class to be extended by clients to create variants of EObjects. Clients have to provide a method that returns the
 * suffix that is to be removed from a metamodel package name to obtain the package name of the variant. <br/>
 * The implementation is based on {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier EcoreUtil.Copier} with various modifications
 * to change the default copying behaviour. The modification in this class ensures that during the copying of an eObject the
 * contained eObjects are only recursively copied if they have not been copied before (otherwise the existing copy is used).
 *
 * @see lu.uni.geko.util.ecore.AbstractPkgVariantEnumRespectingCopier AbstractPkgVariantEnumRespectingCopier
 *
 * @author Max E. Kramer
 */
public abstract class AbstractRecursivePkgVariantEnumRespectingCopier extends AbstractPkgVariantEnumRespectingCopier {
   /** The recommended unique identifier for serialising. */
   private static final long serialVersionUID = 0L;

   /**
    * Delegates {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier#copy(EObject) EcoreUtil.Copier.copy(EObject)} to
    * {@link AbstractRecursivePkgVariantEnumRespectingCopier#getIfCopiedAndCopyOtherwise getIfCopiedAndCopyOtherwise}.<br/>
    * <br/>
    * <b>Attention</b>: References have to be copied with an additional call to
    * {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier#copyReferences() copyReferences()}!
    *
    * @param eObject
    *           an eObject
    * @return an existing or new variant of the given eObject
    */
   @Override
   public EObject copy(final EObject eObject) {
      return getIfCopiedAndCopyOtherwise(eObject);
   }

   /**
    * Checks whether a variant of the given eObject has already been created and returns this existing variant if existing or a
    * new variant otherwise.<br/>
    * <br/>
    * <b>Attention</b>: References have to be copied with an additional call to
    * {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier#copyReferences() copyReferences()}!
    *
    * @param eObject
    *           an eObject
    * @return an existing or new variant of the given eObject
    */
   private EObject getIfCopiedAndCopyOtherwise(final EObject eObject) {
      EObject eObjectCopy = get(eObject);
      if (eObjectCopy == null) {
         eObjectCopy = copyWithoutCheckingWhetherAlreadyCopied(eObject);
      }
      return eObjectCopy;
   }

   /**
    * Creates a new variant of the eObject without checking whether a variant was already created for this eObject by simply
    * delegating to {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier#copy(EObject) EcoreUtil.Copier.copy(EObject)}.<br/>
    * <br/>
    * <b>Attention</b>: References have to be copied with an additional call to
    * {@link org.eclipse.emf.ecore.util.EcoreUtil.Copier#copyReferences() copyReferences()}!
    *
    * @param eObject
    *           an eObject
    * @return a new variant of the given eObject
    */
   public final EObject copyWithoutCheckingWhetherAlreadyCopied(final EObject eObject) {
      return super.copy(eObject);
   }
}
