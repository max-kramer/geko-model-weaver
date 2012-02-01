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
 * A mapping from possibly multiple keys to possibly multiple values. A {@code Map<Set<K>, Set<V>>} can be regarded as equivalent
 * to a {@code N2NMap<K, V>} but does not offer convenient methods, caching and synchronisation.<br/>
 * <br/>
 * Whereas instances of {@code Map<K, V>} should be named key2ValueMap, instances of {@code Mapping<K,V>} should be named
 * key2ValuesN2NMap (with an s after Value to emphasise that we map on possibly multiple elements). Note that we differentiate
 * between the words mapping, Map, N2NMap in order to distinguish between the concept of a mapping and the implementation of its
 * 1to1 and NtoN variant.
 *
 * @param <K>
 *           the key type (the domain of the mapping)
 * @param <V>
 *           the value type (the image of the mapping)
 * @author Max E. Kramer
 */
public interface N2NMap<K, V> {

   /**
    * Returns a set containing all values to which the given key is mapped.
    *
    * @param key
    *           a k
    * @return all values mapped to the key
    */
   Set<V> getAllValuesForKey(K key);

   /**
    * Returns a set containing all the mapped keys.
    *
    * @return a set containing all keys that are mapped to at least one value
    * @see java.util.Map#keySet()
    */
   Set<K> keySet();

   /**
    * Maps the given key to the given value by adding the value to the set of mapped values (if not contained yet).
    *
    * @param key
    *           a key
    * @param value
    *           a value
    */
   void put(K key, V value);

   /**
    * Maps the given keys to the given values by adding the values to the sets of mapped values (if not contained yet).
    *
    * @param keySet
    *           a set of keys
    * @param valueSet
    *           a set of values
    */
   void put(Set<K> keySet, Set<V> valueSet);

   /**
    * Removes the mapping from the given key to the given value.
    *
    * @param key
    *           a key
    * @param value
    *           a value
    * @return {@code true} if the key was mapped to the value and {@code false} otherwise.
    */
   boolean remove(K key, V value);

   /**
    * Returns {@code true} if the given key is mapped to at least one value.
    *
    * @param key
    *           a key
    * @return whether the given key is mapped or not
    * @see java.util.Map#containsKey(Object)
    */
   boolean containsKey(K key);

   /**
    * Returns {@code true} if at least one key is mapped to the given value.
    *
    * @param value
    *           a value
    * @return whether a key is mapped to the given value
    * @see java.util.Map#containsValue(Object)
    */
   boolean containsValue(V value);

   /**
    * Returns a set containing all the mappings as conventional instances of {@code Entry<Set<K>, Set<V>>}.
    *
    * @see java.util.Map#entrySet()
    * @return a set containing all mapping entries
    */
   Set<Entry<Set<K>, Set<V>>> entrySet();
}
