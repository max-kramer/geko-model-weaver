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
package lu.uni.geko.weaver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

import lu.uni.geko.common.GeKoBridge;
import lu.uni.geko.util.bridges.EclipseBridge;
import lu.uni.geko.util.datastructures.BiN2NMap;
import lu.uni.geko.weaver.scope.AdviceInstantiationScope;

import org.eclipse.emf.ecore.EObject;

public class MainCopier {
   public static EObject copyAdviceEObject(final EObject sourceAdviceEObject, final EObject rootEObject,
         final BiN2NMap<EObject, EObject> base2AdviceMergeBiMap,
         final Map<EObject, AdviceInstantiationScope> adviceEObjects2ScopeMap) {
      List<CopierFactoryExt> copierFactories = GeKoBridge.getRegisteredExtensionsInDescPriority(CopierFactoryExt.ID,
            CopierFactoryExt.class);

      EObject currentCopyBaseEObject = null;
      for (final CopierFactoryExt copierFactory : copierFactories) {
         final EObject finalCurrentCopyBaseEObject = currentCopyBaseEObject;
         Callable<EObject> callable = new Callable<EObject>() {
            @Override
            public EObject call() {
               Copier copier = copierFactory.getCopier(rootEObject);
               return copier.copyAdviceEObject(sourceAdviceEObject, finalCurrentCopyBaseEObject, base2AdviceMergeBiMap,
                     adviceEObjects2ScopeMap);
            }
         };
         currentCopyBaseEObject = EclipseBridge.callInProtectedMode(callable);
      }
      return currentCopyBaseEObject;
   }
}
