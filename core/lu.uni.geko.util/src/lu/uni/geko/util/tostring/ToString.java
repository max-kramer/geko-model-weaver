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
package lu.uni.geko.util.tostring;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A utility class for providing custom string representations similar to the default {@link java.lang.Object#toString()
 * Object.toString()}.<br/>
 * <br/>
 * (Note that although this class itself does not use the fact that it allows instances of it to be created we had to resort to
 * this solution in order to make it possible to override behaviour. If Java would allow static methods to be overridden (nobody
 * knows how) we could implement this the way a utility class should be implemented.)
 *
 * @author Max E. Kramer
 */
public class ToString {
   /** The string constant used for indentation. */
   private static final String INDENTATION = "  ";

   /**
    * @param indentLevel
    *           the level of indentation
    * @return the indentation string for the given level of indentation
    */
   protected final String getIndentation(final int indentLevel) {
      StringBuilder s = new StringBuilder();
      for (int i = 0; i < indentLevel; i++) {
         s.append(INDENTATION);
      }
      return s.toString();
   }

   /**
    * @param object
    *           an object
    * @return a custom string representation of the given object
    *
    * @see java.lang.Object#toString() Object.toString()
    */
   public final String toString(final Object object) {
      // per default we do not indent
      return toString(object, 0);
   }

   /**
    * @param object
    *           an object
    * @param indentLevel
    *           the level of indentation
    * @return a custom string representation of the given object using the given level of indentation
    */
   protected String toString(final Object object, final int indentLevel) {
      // RATIONALE MK as Java does not support dynamic dispatch we simulate it
      // MAYDO MK replace dynamic dispatch simulation with a nicer solution if possible
      if (object instanceof Map<?, ?>) {
         return toString((Map<?, ?>) object, indentLevel);
      }
      if (object instanceof Iterable<?>) {
         return toString((Iterable<?>) object, indentLevel);
      }
      if (object instanceof Iterator<?>) {
         return toString((Iterator<?>) object, indentLevel);
      }
      if (object instanceof Entry<?, ?>) {
         return toString((Entry<?, ?>) object, indentLevel);
      }
      // per default we use the existing toString method
      return getIndentation(indentLevel) + (object == null ? "null" : object.toString());
   }

   /**
    * @param map
    *           a map
    * @param indentLevel
    *           the level of indentation
    * @return a custom string representation of the given map using the given level of indentation
    */
   protected final String toString(final Map<?, ?> map, final int indentLevel) {
      return toString(map.entrySet(), indentLevel);
   }

   /**
    * @param iterable
    *           an iterable
    * @param indentLevel
    *           the level of indentation
    * @return a custom string representation of the objects reachable through the given iterable using the given level of
    *         indentation
    */
   protected final String toString(final Iterable<?> iterable, final int indentLevel) {
      Iterator<?> iterator = iterable.iterator();
      return toString(iterator, indentLevel);
   }

   /**
    * @param iterator
    *           an iterator
    * @param indentLevel
    *           the level of indentation
    * @return a custom string representation of the objects reachable through the given iterator using the given level of
    *         indentation
    */
   protected final String toString(final Iterator<?> iterator, final int indentLevel) {
      StringBuilder s = new StringBuilder();
      s.append("[");
      if (iterator.hasNext()) {
         s.append(toString(iterator.next(), indentLevel + 1));
         while (iterator.hasNext()) {
            s.append(",\n" + toString(iterator.next(), indentLevel + 1));
         }
      }
      s.append("]");
      return s.toString();
   }

   /**
    * @param mapEntry
    *           a mapping entry
    * @param indentLevel
    *           the level of indentation
    * @return a custom string representation of the given mapEntry using the given level of indentation
    */
   protected final String toString(final Entry<?, ?> mapEntry, final int indentLevel) {
      return toString(mapEntry.getKey(), indentLevel) + "\n->\n" + toString(mapEntry.getValue(), 0);
   }
}
