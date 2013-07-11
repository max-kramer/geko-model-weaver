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
 * A utility class hiding details of package modification tasks of the Java platform API that are not project-specific.<br/>
 * <br/>
 * (Note that it is disputable whether this class conforms to the bridge pattern as we are currently only providing one
 * implementation and the "abstractions" can be regarded as low-level.)
 *
 * @author Max E. Kramer
 */
public final class JavaPkgNameBridge {
   /** Utility classes should not have a public or default constructor. */
   private JavaPkgNameBridge() {
   }

   /**
    * Removes the given package name suffix from the canonical class name of the given class and returns the result.
    *
    * @param className
    *           a canonical class name
    * @param pkgNameSuffixToRemove
    *           the package name suffix to be removed
    * @return the trimmed canonical class name
    */
   public static String removePkgSuffixFromCanonicalClassName(final String className, final String pkgNameSuffixToRemove) {
      String[] splitClassName = className.split("\\.");

		String pkgName;
		String trimmedPkgName = "";
		for (int j=0 ; j < splitClassName.length -1 ; j++)
		{
			pkgName = splitClassName[j];
			trimmedPkgName += removeSuffixFromPkgName(pkgName, pkgNameSuffixToRemove) + ".";
		}

		return trimmedPkgName + splitClassName[splitClassName.length - 1];
   }

   /**
    * Removes the given package name suffix from the given package name and returns the result.
    *
    * @param pkgName
    *           a package name
    * @param pkgNameSuffixToRemove
    *           the package name suffix to be removed
    * @return the trimmed package name
    */
   public static String removeSuffixFromPkgName(final String pkgName, final String pkgNameSuffixToRemove) {
      String[] splitAndTrimmedClassName = splitAndRemoveSuffixFromPkgName(pkgName, pkgNameSuffixToRemove);
      String trimmedClassName = splitAndTrimmedClassName[0];
      for (int i = 1; i < splitAndTrimmedClassName.length; i++) {
         trimmedClassName += "." + splitAndTrimmedClassName[i];
      }
      return trimmedClassName;
   }

   /**
    * Replaces the given {@code pkgNameSuffixToReplace} in the given package name with the given {@code pkgNameSuffixReplacement}
    * and returns the result.
    *
    * @param pkgName
    *           a package name
    * @param pkgNameSuffixToReplace
    *           the package name suffix to be replaced
    * @param pkgNameSuffixReplacement
    *           the package name suffix that should replace the old one
    * @return the modified package name
    */
   public static String replaceSuffixInPkgName(final String pkgName, final String pkgNameSuffixToReplace,
         final String pkgNameSuffixReplacement) {
      String[] splitAndTrimmedClassName = splitAndRemoveSuffixFromPkgName(pkgName, pkgNameSuffixToReplace);
      int pkgNameIndex = splitAndTrimmedClassName.length - 1;
      splitAndTrimmedClassName[pkgNameIndex] += pkgNameSuffixReplacement;
      String trimmedClassName = splitAndTrimmedClassName[0];
      for (int i = 1; i < splitAndTrimmedClassName.length; i++) {
         trimmedClassName += "." + splitAndTrimmedClassName[i];
      }
      return trimmedClassName;
   }

   /**
    * Splits the given package name at every occurrence of a dot ".", removes the given package name suffix from the last segment
    * and returns the modified splitting array.
    *
    * @param pkgName
    *           a package name
    * @param pkgNameSuffixToRemove
    *           the package name suffix to be removed
    * @return the array resulting from splitting and replacing
    */
   private static String[] splitAndRemoveSuffixFromPkgName(final String pkgName, final String pkgNameSuffixToRemove) {
      String[] splitPkgName = pkgName.split("\\.");
      if (splitPkgName.length > 0) {
         int canonicalPkgNameIndex = splitPkgName.length - 1;
         String canonicalPkgName = splitPkgName[canonicalPkgNameIndex];
         if (canonicalPkgName.endsWith(pkgNameSuffixToRemove)) {
            String trimmedPkgName = canonicalPkgName.substring(0, canonicalPkgName.length() - pkgNameSuffixToRemove.length());
            splitPkgName[canonicalPkgNameIndex] = trimmedPkgName;
            return splitPkgName;
         } else {
            throw new RuntimeException("Cannot remove the package name suffix '" + pkgNameSuffixToRemove
                 + "' from the package name '" + canonicalPkgName + "' as the package name does not end with this suffix!");
         }
      } else {
         throw new RuntimeException("Cannot remove the pkg name suffix '" + pkgNameSuffixToRemove + "' from the package name '"
               + pkgName + "' as it does not have a package!");
      }
   }
}
