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

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

/**
 * A utility class hiding details of the Java platform API for recurring tasks that are not project-specific.<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently only providing one
 * implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 */
public final class JavaBridge {
   /** Utility classes should not have a public or default constructor. */
   private JavaBridge() {
   }

   /**
    * Casts the given object to the given type and returns it. Throws a {@link java.lang.RuntimeException RuntimeException}
    * mentioning the given object description if the object cannot be cast.
    *
    * @param <T>
    *           a
    * @param object
    *           a
    * @param type
    *           a
    * @param objectDescr
    *           a
    * @return a
    */
   public static <T> T dynamicCast(final Object object, final Class<T> type, final String objectDescr) {
      if (type == null || !type.isInstance(object)) {
         throw new RuntimeException("The " + objectDescr + " '" + object + "' is not of the required type '" + type + "'!");
      } else {
         return type.cast(object);
      }
   }

   /**
    * Returns the first element obtained by iterating over the given collection if existing and {@code null} otherwise.
    *
    * @param <T>
    *           the type of the collection
    * @param collection
    *           a collection
    * @return the first element if existing and {@code null} otherwise.
    */
   public static <T> T one(final Collection<T> collection) {
      for (T t : collection) {
         return t;
      }
      return null;
   }

   /**
    * Removes the first element obtained by iterating over the given collection from the collection and returns it (if existing,
    * otherwise returns {@code null}).
    *
    * @param <T>
    *           the type of the collection
    * @param collection
    *           a collection
    * @return the removed first element if existing and {@code null} otherwise.
    */
   public static <T> T pop(final Collection<T> collection) {
      T one = one(collection);
      if (collection != null) {
         collection.remove(one);
         return one;
      }
      return null;
   }

   /**
    * Inserts {@code toInsertBefore} into {@code insertionTarget} directly before the unique occurrence of {@code toSearch} and
    * returns the result.
    *
    * @param insertionTarget
    *           the target string for the insertion
    * @param toSearch
    *           the string succeeding the location of insertion
    * @param toInsertBefore
    *           the string to be inserted
    * @return the resulting string
    */
   public static String insertBeforeUniqueSubstring(final String insertionTarget, final String toSearch,
         final String toInsertBefore) {
      return replaceUniqueSubstring(insertionTarget, toSearch, toInsertBefore + toSearch);
   }

   /**
    * Replaces the unique occurrence of {@code toReplace} with {@code replacement} in the string {@code replacementTarget} and
    * returns the result.
    *
    * @param replacementTarget
    *           the target string for the replacement
    * @param toReplace
    *           the substring to be replaced
    * @param replacement
    *           the replacement for the substring
    * @return the resulting string
    */
   public static String replaceUniqueSubstring(final String replacementTarget, final String toReplace, final String replacement) {
      int indexOfFirstOccurence = replacementTarget.indexOf(toReplace);
      int indexOfLastOccurence = replacementTarget.lastIndexOf(toReplace);
      if (indexOfFirstOccurence == -1 || indexOfFirstOccurence != indexOfLastOccurence) {
         throw new RuntimeException("The substring '" + toReplace + "' has to occur exactly once within the string '"
               + replacementTarget + "' in order to replace it with '" + replacement + "'!");
      }
      return replacementTarget.replaceFirst(toReplace, replacement);
   }

   /**
    * Parses the given string as a signed decimal integer using {@link java.lang.Integer#parseInt(String)
    * Integer.parseInt(String)} but also parses "MAX_VALUE" and "MIN_VALUE".
    *
    * @param s
    *           the string to parse
    * @return the resulting int
    */
   public static int parseInt(final String s) {
      if ("MAX_VALUE".equals(s)) {
         return Integer.MAX_VALUE;
      } else if ("MIN_VALUE".equals(s)) {
         return Integer.MIN_VALUE;
      } else {
         return Integer.parseInt(s);
      }
   }

   /**
    * Creates and returns a random alpha-numerical string of the given length using the given additional characters (optional).
    *
    * @param length
    *           the desired length of the string
    * @param additionalCharacters
    *           characters to be used in addition to alpha-numeric characters ([a-z,A-Z,0-9])
    * @return a random alpha-numerical string
    */
   public static String getRandomAlphaNumericalString(final int length, final String additionalCharacters) {
      String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789" + additionalCharacters;
      Random random = new Random();
      StringBuilder sb = new StringBuilder(length);
      for (int i = 0; i < length; i++) {
         int nextInt = random.nextInt(characters.length());
         char nextChar = characters.charAt(nextInt);
         sb.append(nextChar);
      }
      return sb.toString();
   }

   /**
    * Removes the given suffix from the given base string and returns the result. Throws a {@link java.lang.RuntimeException
    * RuntimeException} if the base string does not end with the given suffix.
    *
    * @param baseString
    *           a string to be trimmed
    * @param suffixToTrim
    *           the suffix to be removed
    * @return the base string without the suffix
    */
   public static String trim(final String baseString, final String suffixToTrim) {
      if (baseString.endsWith(suffixToTrim)) {
         return baseString.substring(0, baseString.length() - suffixToTrim.length());
      } else {
         throw new RuntimeException("The string '" + baseString + "' has to end with the suffix '" + suffixToTrim
               + "' in order to be trimmed!");
      }
   }

   /**
    * Creates and returns an iterable using the given iterator.
    *
    * @param <T>
    *           the collection element type
    * @param iterator
    *           an iterator
    * @return an iterable returning the iterator
    */
   public static <T> Iterable<T> toIterable(final Iterator<T> iterator) {
      return new Iterable<T>() {
         @Override
         public Iterator<T> iterator() {
            return iterator;
         }
      };
   }

   /**
    * Currently unused method that adds the given classpath URLs to the classloader of the current thread.
    *
    * @param classpathURLs
    *           the classpath URL to be added
    */
   @Deprecated
   // TODO MK remove deprecated annotation from addClasspathURLsToCurrentThreadClassLoader once it is used again
   public static void addClasspathURLsToCurrentThreadClassLoader(final Collection<URL> classpathURLs) {
      URL[] urls = classpathURLs.toArray(new URL[classpathURLs.size()]);
      ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
      URLClassLoader urlClassLoader = new URLClassLoader(urls, contextClassLoader);
      Thread.currentThread().setContextClassLoader(urlClassLoader);
   }

   /**
    * Return the URLs of all directories contained in the directory of the given absolute file path.
    *
    * @param absolutePath
    *           an absolute path
    * @return a collection containing the URLs of all contained directories
    * @throws MalformedURLException
    *            if an error occurred during the creation of a URL
    */
   public static Collection<URL> getAllDirURLsWithinPath(final String absolutePath) throws MalformedURLException {
      Collection<File> files = getAllDirsWithinPath(absolutePath);
      return filesToURLs(files);
   }

   /**
    * Return all directories contained in the directory of the given absolute file path.
    *
    * @param absolutePath
    *           an absolute path
    * @return a collection containing all contained directories
    */
   public static Collection<File> getAllDirsWithinPath(final String absolutePath) {
      Collection<File> containedDirs = new ArrayList<File>();
      File dir = new File(absolutePath);
      getAllDirsWithinPathRecursively(dir, containedDirs);
      return containedDirs;
   }

   /**
    * Recursively adds all directories contained in the given directory to the given collection of contained directories.
    *
    * @param dir
    *           a directory
    * @param containedDirs
    *           collection containing all contained directories found so far
    */
   private static void getAllDirsWithinPathRecursively(final File dir, final Collection<File> containedDirs) {
      if (dir.isDirectory()) {
         containedDirs.add(dir);
         for (File childFile : dir.listFiles()) {
            getAllDirsWithinPathRecursively(childFile, containedDirs);
         }
      }
   }

   /**
    * Creates a collection containing the URLs for the given files and returns it.
    *
    * @param files
    *           a collection of files
    * @return a collection containing the URLs for the given files
    * @throws MalformedURLException
    *            if an error occurred during the creation of a URL
    */
   public static Collection<URL> filesToURLs(final Collection<File> files) throws MalformedURLException {
      Collection<URL> urls = new ArrayList<URL>();
      for (File file : files) {
         urls.add(file.toURI().toURL());
      }
      return urls;
   }
}
