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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * A bidirectional mapping from possibly multiple keys to possibly multiple values implemented using {@link java.util.HashMap
 * HashMaps}.<br/>
 * <br/>
 * <b>Attention:</b> The implementation is backed up by the returned sets. Changing these returned sets will change the mapping
 * and may result in inconsistent behaviour!
 *
 * @param <K>
 *           key type
 * @param <V>
 *           value type
 * @author Max E. Kramer
 */
public class BiHashN2NMap<K, V> extends HashN2NMap<K, V> implements BiN2NMap<K, V> {
   // RATIONALE MK cache all keys for a value in order not to iterate over all entries every time getAllKeysForValue(V) is called
   /** The cache for fast access to all keys mapping to a value. */
   private final Map<V, Set<K>> singleValue2KeysCache;

   /**
    * Constructs a new BiHashN2NMap with the default initial capacity (16).
    */
   public BiHashN2NMap() {
      super();
      this.singleValue2KeysCache = new HashMap<V, Set<K>>();
   }

   /**
    * Constructs a new BiHashN2NMap with the given initial capacity.
    *
    * @param initialCapacity
    *           the initial capacity
    */
   public BiHashN2NMap(final int initialCapacity) {
      super(initialCapacity);
      this.singleValue2KeysCache = new HashMap<V, Set<K>>();
   }

   @Override
   public Set<K> getAllKeysForValue(final V value) {
      return this.singleValue2KeysCache.get(value);
   }

   @Override
   public void put(final Set<K> keySet, final Set<V> valueSet) {
      super.put(keySet, valueSet);
      for (V value : valueSet) {
         Set<K> allValueKeys = getAllKeysForValue(value);
         if (allValueKeys == null) {
            allValueKeys = new HashSet<K>();
            this.singleValue2KeysCache.put(value, allValueKeys);
         }
         allValueKeys.addAll(keySet);
      }
   }

   @Override
   public boolean remove(final K key, final V value) {
      super.remove(key, value);
      Set<K> allValueKeys = getAllKeysForValue(value);
      if (allValueKeys == null) {
         return false;
      } else {
         return allValueKeys.remove(key);
      }
   };
}
