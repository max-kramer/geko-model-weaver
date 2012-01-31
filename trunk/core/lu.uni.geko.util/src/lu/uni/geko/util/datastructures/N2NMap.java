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
package lu.uni.geko.util.datastructures;

import java.util.Map.Entry;
import java.util.Set;

/**
 * TODO MK rewrite the JavaDoc for N2NMap and mention that we do not support removing or changing mapping entries
 *
 * NOTE THAT get(Set<K>) IS NOT SUPPORTED!
 *
 *
 * A mapping from possibly multiple keys to possibly multiple values. A {@code Map<Set<V>, Set<V>>} can be regarded as equivalent
 * but does not offer convenient functionality, caching and synchronization.
 *
 * Whereas instances of {@code Map<K, V>} should be named key2ValueMap, instances of {@code Mapping<K,V>} should be named
 * key2ValuesN2NMap (with an s after Value to emphasise that we map on possibly multiple elements). Note that we differentiate
 * between the words mapping, Map, N2NMap in order to distinguish between the concept of a mapping and the implementation of its
 * 1to1 and NtoN variant.\
 *
 * @param <K>
 *           the key type (the domain of the mapping)
 * @param <V>
 *           the value type (the image of the mapping)
 */
public interface N2NMap<K, V> {

   /**
	 *
	 */
   Set<V> getAllValuesForKey(K key);

   /**
    * @see java.util.Map#keySet()
    */
   Set<K> keySet();

   /**
    * Adds the value to the set of values that are the target of the key (if not contained yet).
    *
    * @param key
    * @param valuerget
    *           values for the key (containing the given value)
    */
   void put(K key, V value);

   /**
    * Adds the values to the set of values that are the target of the keys (if not contained yet).
    *
    * @param keys
    * @param values
    */
   void put(Set<K> keySet, Set<V> valueSet);

   /**
    * Removes the mapping from the given key to the given value from the mapping.
    *
    * @param key
    * @param value
    * @return <code>true</code> if the key was mapped to the value and <code>false</code> otherwise.
    */
   boolean remove(K key, V value);

   /**
    * @see java.util.Map#containsKey(Object)
    * @param key
    * @return
    */
   boolean containsKey(K key);

   /**
    * @see java.util.Map#containsValue(Object)
    */
   boolean containsValue(V value);

   /**
    * @see java.util.Map#entrySet()
    * @return
    */
   Set<Entry<Set<K>, Set<V>>> entrySet();
}
