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
package lu.uni.geko.weaver.copy;

import java.util.List;
import java.util.concurrent.Callable;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.util.bridges.EclipseBridge;
import lu.uni.geko.weaver.Advice;
import lu.uni.geko.weaver.AdviceEffectuation;

import org.eclipse.emf.ecore.EObject;

/**
 * A utility class to access the functionality provided by extensions of the {@link CopierFactoryExt} extension point.
 *
 * @see CopierFactoryExt
 * @see Copier
 *
 * @author Max E. Kramer
 */
public final class MainCopier {
   /** Utility classes should not have a public or default constructor. */
   private MainCopier() {
   }

   /**
    * Returns an existing or new base variant copy of the given advice element for the given root element of a woven model, advice
    * and advice effectuation.<br/>
    * <br/>
    * <b>Attention</b>: All registered extensions are called in order of decreasing priority (i.e. starting with the extension
    * having the highest integer value priority) while passing on the initial result to the next extension.
    *
    * @param sourceAvElement
    *           the advice element to be used as source of the copying
    * @param wovenRoot
    *           the unique root element of a woven model
    * @param advice
    *           an advice
    * @param avEffectuation
    *           an advice effectuation
    * @return a base variant copy of the given advice element
    */
   public static EObject copyAvElement(final EObject sourceAvElement, final EObject wovenRoot, final Advice advice,
         final AdviceEffectuation avEffectuation) {
      List<CopierFactoryExt> copierFactories = GeKoBridge.getRegisteredExtensionsInDescPriority(CopierFactoryExt.ID,
            CopierFactoryExt.class);

      EObject currentCopyBaseEObject = null;
      for (final CopierFactoryExt copierFactory : copierFactories) {
         final EObject finalCurrentCopyBaseEObject = currentCopyBaseEObject;
         Callable<EObject> callable = new Callable<EObject>() {
            @Override
            public EObject call() {
               Copier copier = copierFactory.getCopier(wovenRoot, advice);
               return copier.copyAvElement(sourceAvElement, finalCurrentCopyBaseEObject, avEffectuation);
            }
         };
         currentCopyBaseEObject = EclipseBridge.callInProtectedMode(callable);
      }
      return currentCopyBaseEObject;
   }
}
