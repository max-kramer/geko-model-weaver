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
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class JavaBridge {
	public static <T> T dynamicCast(Object object, Class<T> type, String objectDescr) {
		if (type.isInstance(object)) {
			return type.cast(object);
		} else {
			throw new RuntimeException("The " + objectDescr + " '" + object + "' is not of the required type '" + type + "'!");
		}
	}

	/**
	 * Returns the first element of the collection if existing and null otherwise.
	 */
	public static <T> T one(Collection<T> collection) {
		for (T t : collection) {
			return t;
		}
		return null;
	}

	/**
	 * Returns the first element of the collection and removes it from the collection if existing and null otherwise.
	 */
	public static <T> T pop(Collection<T> collection) {
		T one = one(collection);
		collection.remove(one);
		return one;
	}

	public static <T> HashSet<T> toHashSet(Collection<T> collection) {
		HashSet<T> set = new HashSet<T>();
		set.addAll(collection);
		return set;
	}

	public static String insertBeforeUniqueSubstring(String insertionTarget, String toSearch, String toInsertBefore) {
		return replaceUniqueSubstring(insertionTarget, toSearch, toInsertBefore + toSearch);
	}

	public static String replaceUniqueSubstring(String replacementTarget, String toSearch, String toReplace) {
		int indexOfFirstOccurence = replacementTarget.indexOf(toSearch);
		int indexOfLastOccurence = replacementTarget.lastIndexOf(toSearch);
		if (indexOfFirstOccurence == -1 || indexOfFirstOccurence != indexOfLastOccurence) {
			throw new RuntimeException("The substring '" + toSearch + "' has to occur exactly once within the string '" + replacementTarget + "' in order to replace it with '" + toReplace + "'!");
		}
		return replacementTarget.replaceFirst(toSearch, toReplace);
	}

	public static void addClasspathURLsToCurrentThreadClassLoader(Collection<URL> classpathURLs) throws MalformedURLException {
		URL[] urls = classpathURLs.toArray(new URL[classpathURLs.size()]);
		ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
		URLClassLoader urlClassLoader = new URLClassLoader(urls, contextClassLoader);
		Thread.currentThread().setContextClassLoader(urlClassLoader);
	}

	public static Collection<URL> getAllDirURLsWithinPath(String absoluteFilePath) throws MalformedURLException {
		Collection<File> files = getAllDirsWithinPath(absoluteFilePath);
		return filesToURLs(files);
	}

	public static Collection<File> getAllDirsWithinPath(String absolutePath) {
		Collection<File> containedDirs = new ArrayList<File>();
		File dir = new File(absolutePath);
		getAllDirsWithinPathRecursively(dir, containedDirs);
		return containedDirs;
	}

	private static void getAllDirsWithinPathRecursively(File dir, Collection<File> containedDirs) {
		if (dir.isDirectory()) {
			containedDirs.add(dir);
			for (File childFile : dir.listFiles()) {
				getAllDirsWithinPathRecursively(childFile, containedDirs);
			}
		}
	}

	public static Collection<URL> filesToURLs(Collection<File> files) throws MalformedURLException {
		Collection<URL> urls = new ArrayList<URL>();
		for (File file : files) {
			urls.add(file.toURI().toURL());
		}
		return urls;
	}

	public static int parseInt(String s) {
		if ("MAX_VALUE".equals(s)) {
			return Integer.MAX_VALUE;
		} else if ("MIN_VALUE".equals(s)) {
			return Integer.MIN_VALUE;
		} else {
			return Integer.parseInt(s);
		}
	}

	public static String getRandomAlphaNumericalString(int length, String additionalCharacters) {
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789" + additionalCharacters;
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);
		for( int i = 0; i < length; i++ ) {
			int nextInt = random.nextInt(characters.length());
			char nextChar = characters.charAt(nextInt);
			sb.append(nextChar);
		}
		return sb.toString();
	}

	public static String trim(String baseString, String suffixToTrim) {
		if (baseString.endsWith(suffixToTrim)) {
			return baseString.substring(0, baseString.length() - suffixToTrim.length());
		} else {
			throw new RuntimeException("The string '" + baseString + "' has to end with the suffix '" + suffixToTrim + "' in order to be trimmed!");
		}
 	}

	public static <T> Iterable<T> toIterable(final Iterator<T> iterator) {
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return iterator;
			}
		};
	}
}
