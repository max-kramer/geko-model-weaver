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
package lu.uni.geko.util.bridges;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * A utility class hiding details of the resources part of the Eclipse Modeling Framework API related for recurring tasks that are
 * not project-specific.<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently only providing one
 * implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 */
public final class EcoreResourceBridge {
   /** Utility classes should not have a public or default constructor. */
   private EcoreResourceBridge() {
   }

   public static EObject getResourceContentRootIfUnique(final Resource resource) {
      List<EObject> resourceContents = resource.getContents();
      if (resourceContents.size() == 1) {
         return resourceContents.get(0);
      } else {
         return null;
      }
   }

   public static EObject getUniqueContentRoot(final Resource resource, final String modelName) {
      EObject uniqueResourceContentRootElement = getResourceContentRootIfUnique(resource);
      if (uniqueResourceContentRootElement != null) {
         return uniqueResourceContentRootElement;
      } else {
         throw new RuntimeException("The " + modelName + " '" + resource + "' has to contain exactly one root element!");
      }
   }

   public static <T extends EObject> T getUniqueContentRootIfCorrectlyTyped(final Resource resource, final String modelName,
         final Class<T> rootElementClass) {
      EObject rootElement = getUniqueContentRoot(resource, modelName);
      return JavaBridge.dynamicCast(rootElement, rootElementClass, "root element '" + rootElement + "' of the " + modelName
            + " '" + resource + "'");
   }

   public static Set<EObject> getAllContentsSet(final Resource resource) {
      return EcoreBridge.getAllContentsSet(resource.getAllContents());
   }

   public static void saveEObjectAsOnlyContent(final EObject eObject, final Resource resource) throws IOException {
      resource.getContents().clear();
      resource.getContents().add(eObject);
      saveResource(resource);
   }

   public static void saveResource(final Resource resource) throws IOException {
      resource.save(Collections.EMPTY_MAP);
      resource.setModified(true);
   }
}
