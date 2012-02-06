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
package lu.uni.geko.ext.ifc;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import lu.uni.geko.resources.DefaultSimpleResourceLoader;
import lu.uni.geko.resources.RefinedResourceLoaderExt;
import lu.uni.geko.util.bridges.EcoreResourceBridge;
import lu.uni.geko.util.bridges.JavaBridge;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import qut.part21.Model;
import IFC2X3.IfcRoot;

/**
 * An extension of the extension point {@link RefinedResourceLoaderExt} that is responsible for loading IFC building models.
 *
 * @author Max E. Kramer
 */
public class IfcResourceLoader implements RefinedResourceLoaderExt {
   @Override
   public void initialize() {
      // empty
   }

   @Override
   public Collection<String> supportedFileExtensions() {
      return Collections.singleton("ifc");
   }

   @Override
   public Iterator<EObject> getAllContentsIterator(final URI uri) {
      Model model = IfcConnector.getPart21ModelAtURI(uri);
      final TreeIterator<EObject> contentIterator = model.eAllContents();
      return new Iterator<EObject>() {
         private EObject lookAhead = null;

         @Override
         public boolean hasNext() {
            if (this.lookAhead == null) {
               if (contentIterator.hasNext()) {
                  lookAhead();
               } else {
                  return false;
               }
            }
            return this.lookAhead instanceof IfcRoot;
         }

         private void lookAhead() {
            this.lookAhead = contentIterator.next();
            while (!(this.lookAhead instanceof IfcRoot) && contentIterator.hasNext()) {
               this.lookAhead = contentIterator.next();
            }
         }

         @Override
         public EObject next() {
            if (!(this.lookAhead instanceof IfcRoot)) {
               if (contentIterator.hasNext()) {
                  lookAhead();
               } else {
                  throw new RuntimeException("Called next() on iterator although hasNext() is false!");
               }
            }
            EObject next = this.lookAhead;
            this.lookAhead = null;
            return next;
         }

         @Override
         public void remove() {
            throw new RuntimeException("Ifc iterator does not support remove operation!");
         }
      };
   }

   @Override
   public EObject getUniqueContentRoot(final URI uri, final String modelName) {
      return IfcConnector.getPart21ModelAtURI(uri);
   }

   @Override
   public <T extends EObject> T getUniqueContentRootIfCorrectlyTyped(final URI uri, final String modelName,
         final Class<T> rootElementClass) {
      EObject rootElement = IfcConnector.getPart21ModelAtURI(uri);
      return JavaBridge.dynamicCast(rootElement, rootElementClass, "root element '" + rootElement + "' of the " + modelName
            + " at '" + uri + "'");
   }

   @Override
   public void saveEObjectAsOnlyContent(final EObject eObject, final URI uri) {
      if (eObject instanceof Model) {
         try {
            IfcConnector.savePart21ModelAtURI((Model) eObject, uri);
            System.out.println("finished saving " + eObject + " at " + uri);
         } catch (IOException e) {
            // soften
            throw new RuntimeException(e);
         }
      } else {
         throw new RuntimeException("Only Part21 Models can be saved using the IfcResourceLoader but it was tried to save '"
               + eObject + "'!");
      }
   }

   @Override
   public void saveResource(final URI uri) {
      try {
         Resource resource = DefaultSimpleResourceLoader.getInstance().loadResourceAtURI(uri);
         EcoreResourceBridge.saveResource(resource);
      } catch (IOException e) {
         // soften
         throw new RuntimeException(e);
      }
   }

   @Override
   public boolean isExistingResource(final URI uri) {
      return DefaultSimpleResourceLoader.getInstance().isExistingResource(uri);
   }
}
