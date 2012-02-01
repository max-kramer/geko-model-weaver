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
package lu.uni.geko.common;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

/**
 * A singleton class managing all variables that are used by individual GeKo plug-ins and that can change during runtime.
 *
 * @author Max E. Kramer
 */
@Deprecated
public final class GeKoVariables {
   /** The singleton instance variable for this class. */
   private static final GeKoVariables INSTANCE = new GeKoVariables();
   /** The collection of URLs that should be added to the classpath. */
   private final Collection<URL> classpathURLs = new ArrayList<URL>();

   /** Singleton classes should not have a public or default constructor. */
   private GeKoVariables() {
   }

   /**
    * @return the singleton instance of this class
    */
   public static GeKoVariables getInstance() {
      return INSTANCE;
   }

   /**
    * Adds the given classpath URLs to the overall collection of URLs that should be added to the classpath.
    *
    * @param newClasspathURLs a collection of classpath URLs
    */
   public void addClasspathURLs(final Collection<URL> newClasspathURLs) {
      this.classpathURLs.addAll(newClasspathURLs);
   }

   /**
    * @return the collection of URLs that should be added to the classpath
    */
   public Collection<URL> getClasspathURLs() {
      return classpathURLs;
   }
}
