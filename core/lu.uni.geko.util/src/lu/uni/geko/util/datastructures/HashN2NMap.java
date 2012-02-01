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

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * A mapping from possibly multiple keys to possibly multiple values implemented using {@link java.util.HashMap HashMaps}.<br/>
 * <br/>
 * <b>Attention:</b> The implementation is backed by the returned sets. Changing these returned sets will change the mapping
 * and may result in inconsistent behaviour!
 *
 * @param <K>
 *           the key type (the domain of the mapping)
 * @param <V>
 *           the value type (the image of the mapping)
 * @author Max E. Kramer
 */
public class HashN2NMap<K, V> implements N2NMap<K, V> {
   // RATIONALE MK do not disclose all functionality of the used map
   /** The internal mapping from keys to values. */
   private final Map<Set<K>, Set<V>> map;
   // RATIONALE MK cache all values for a key in order not to iterate over all entries every time getAllValuesForKey(K) is called
   /** The cache for fast access to all values mapped to from a key. */
   private final Map<K, Set<V>> singleKey2ValuesCache;

   /**
    * Constructs a new HashN2NMap with the default initial capacity (16).
    */
   public HashN2NMap() {
      this.map = new HashMap<Set<K>, Set<V>>();
      this.singleKey2ValuesCache = new HashMap<K, Set<V>>();
   }

   /**
    * Constructs a new HashN2NMap with the given initial capacity.
    *
    * @param initialCapacity
    *           the initial capacity
    */
   public HashN2NMap(final int initialCapacity) {
      this.map = new HashMap<Set<K>, Set<V>>(initialCapacity);
      this.singleKey2ValuesCache = new HashMap<K, Set<V>>();
   }

   @Override
   public Set<V> getAllValuesForKey(final K key) {
      return singleKey2ValuesCache.get(key);
   }

   @Override
   public Set<K> keySet() {
      return this.singleKey2ValuesCache.keySet();
   }

   @Override
   public void put(final K key, final V value) {
      Set<K> keySet = Collections.singleton(key);
      Set<V> valueSet = Collections.singleton(value);
      put(keySet, valueSet);
   }

   @Override
   public void put(final Set<K> keySet, final Set<V> valueSet) {
      this.map.put(keySet, valueSet);
      for (K key : keySet) {
         Set<V> allKeyValues = getAllValuesForKey(key);
         if (allKeyValues == null) {
            allKeyValues = new HashSet<V>();
            this.singleKey2ValuesCache.put(key, allKeyValues);
         }
         allKeyValues.addAll(valueSet);
      }
   }

   @Override
   public boolean remove(final K key, final V value) {
      Set<V> allKeyValues = getAllValuesForKey(key);
      if (allKeyValues == null) {
         return false;
      } else {
         return allKeyValues.remove(value);
      }
   }

   @Override
   public String toString() {
      return this.map.toString();
   }

   @Override
   public boolean containsKey(final K key) {
      return this.singleKey2ValuesCache.containsKey(key);
   }

   @Override
   public boolean containsValue(final V value) {
      // MAYDO MK speed this up by caching it
      for (Set<V> valueSet : this.map.values()) {
         if (valueSet.contains(value)) {
            return true;
         }
      }
      return false;
   }

   @Override
   public Set<Entry<Set<K>, Set<V>>> entrySet() {
      return this.map.entrySet();
   }
}
