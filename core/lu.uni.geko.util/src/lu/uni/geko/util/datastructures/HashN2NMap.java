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
 * A mapping from possibly multiple keys to possibly multiple values implemented using {@link java.util.HashMap}s.
 * ATTENTION: The implementation is backed up by the returned sets. Changing these returned sets will change the mapping and may result in inconsistent behaviour!
 * @author Max E. Kramer
 * @param <K> key type
 * @param <V> value type
 */
public class HashN2NMap<K,V> implements N2NMap<K,V> {
	// RATIONALE MK do not disclose all functionality of the used map
	private final Map<Set<K>, Set<V>> map;
	// RATIONALE MK cache all values for a key in order not to iterate over all entries every time getAllValuesForKey(K) is called
	private final Map<K, Set<V>> singleKey2ValuesCache;
	
	public HashN2NMap() {
		this.map = new HashMap<Set<K>, Set<V>>();
		this.singleKey2ValuesCache = new HashMap<K, Set<V>>();
	}
	
	public HashN2NMap(int initialCapacity) {
		this.map = new HashMap<Set<K>, Set<V>>(initialCapacity);
		this.singleKey2ValuesCache = new HashMap<K, Set<V>>();
	}

	@Override
	public Set<V> getAllValuesForKey(K key) {
		return singleKey2ValuesCache.get(key);
	}

	@Override
	public Set<K> keySet() {
		return this.singleKey2ValuesCache.keySet();
	}
	@Override
	public void put(K key, V value) {
		Set<K> keySet = Collections.singleton(key);
		Set<V> valueSet = Collections.singleton(value);
		put(keySet, valueSet);
	}

	@Override
	public void put(Set<K> keySet, Set<V> valueSet) {
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
	public boolean remove(K key, V value) {
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
	public boolean containsKey(K key) {
		return this.singleKey2ValuesCache.containsKey(key);
	}

	@Override
	public boolean containsValue(V value) {
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
