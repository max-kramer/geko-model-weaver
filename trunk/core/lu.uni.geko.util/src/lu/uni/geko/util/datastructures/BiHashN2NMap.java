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

public class BiHashN2NMap<K, V> extends HashN2NMap<K, V> implements BiN2NMap<K, V> {
	// RATIONALE MK cache all keys for a value in order not to iterate over all entries every time getAllKeysForValue(V) is called
	private final Map<V, Set<K>> singleValue2KeysCache;

	public BiHashN2NMap() {
		super();
		this.singleValue2KeysCache = new HashMap<V, Set<K>>();
	}
	
	public BiHashN2NMap(int initialCapacity) {
		super(initialCapacity);
		this.singleValue2KeysCache = new HashMap<V, Set<K>>();
	}

	@Override
	public Set<K> getAllKeysForValue(V value) {
		return this.singleValue2KeysCache.get(value);
	}
	
	@Override
	public Pair<Set<K>, Set<V>> put(Set<K> keySet, Set<V> valueSet) {
		 Pair<Set<K>, Set<V>> entry = super.put(keySet, valueSet);
		for (V value : valueSet) {
			Set<K> allValueKeys = this.singleValue2KeysCache.get(value);
			if (allValueKeys == null) {
				allValueKeys = new HashSet<K>();
				this.singleValue2KeysCache.put(value, allValueKeys);
			}
			allValueKeys.addAll(keySet);
		}	
		return entry;
	}
}
