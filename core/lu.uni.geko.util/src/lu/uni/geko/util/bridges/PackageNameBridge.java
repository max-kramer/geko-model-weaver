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

/**
 * @author Max E. Kramer
 */
public class PackageNameBridge {

   public static String removePackageSuffixFromCanonicalClassName(String className, String packageNameSuffixToBeRemoved) {
   	String[] splitClassName = className.split("\\.");
   	String packageName = splitClassName[0];
   	for (int i = 1; i < splitClassName.length - 1; i++) {
   		packageName += "." + splitClassName[i];
   	}
   	String trimmedPackageName = PackageNameBridge.removePackageSuffixFromPackageName(packageName, packageNameSuffixToBeRemoved);
   	return trimmedPackageName + "." + splitClassName[splitClassName.length - 1];
   }

   public static String removePackageSuffixFromPackageName(String packageName, String packageNameSuffixToBeRemoved) {
   	String[] splitAndTrimmedClassName = PackageNameBridge.splitAndRemovePackageSuffixFromPackageName(packageName, packageNameSuffixToBeRemoved);
   	String trimmedClassName = splitAndTrimmedClassName[0];
   	for (int i = 1; i < splitAndTrimmedClassName.length; i++) {
   		trimmedClassName += "." + splitAndTrimmedClassName[i];
   	}
   	return trimmedClassName;
   }

   public static String replacePackageSuffixInPackageName(String packageName, String packageNameSuffixToBeRemoved, String packageNameSuffixReplacement) {
   	String[] splitAndTrimmedClassName = PackageNameBridge.splitAndRemovePackageSuffixFromPackageName(packageName, packageNameSuffixToBeRemoved);
   	int packageNameIndex = splitAndTrimmedClassName.length - 1;
   	splitAndTrimmedClassName[packageNameIndex] += packageNameSuffixReplacement;
   	String trimmedClassName = splitAndTrimmedClassName[0];
   	for (int i = 1; i < splitAndTrimmedClassName.length; i++) {
   		trimmedClassName += "." + splitAndTrimmedClassName[i];
   	}
   	return trimmedClassName;
   }

   private static String[] splitAndRemovePackageSuffixFromPackageName(String packageName, String packageNameSuffixToBeRemoved) {
   	String[] splitPackageName = packageName.split("\\.");
   	if (splitPackageName.length > 0) {
   		int canonicalPackageNameIndex = splitPackageName.length - 1;
   		String canonicalPackageName = splitPackageName[canonicalPackageNameIndex];
   		if (canonicalPackageName.endsWith(packageNameSuffixToBeRemoved)) {
   			String trimmedPackageName = canonicalPackageName.substring(0, canonicalPackageName.length() - packageNameSuffixToBeRemoved.length());
   			splitPackageName[canonicalPackageNameIndex] = trimmedPackageName;
   			return splitPackageName;
   		} else {
   			throw new RuntimeException("Cannot remove the package name suffix '" + packageNameSuffixToBeRemoved + "' from the package name '" + canonicalPackageName + "' as the package name does not end with this suffix!");
   		}
   	} else {
   		throw new RuntimeException("Cannot remove the package name suffix '" + packageNameSuffixToBeRemoved + "' from the package name '" + packageName + "' as it does not have a package!");
   	}
   }

}
