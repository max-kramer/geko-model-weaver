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
 * FIXME MK rewrite the JavaDoc for N2NMap and mention that we do not support removing or changing mapping entries
 * 
 * NOTE THAT get(Set<K>) IS NOT SUPPORTED!
 * 
 * A {@code Mapping<K,V>} is basically a short way to write {@code Map<K, Set<V>>} but as
 * we do not need all functionality of the Map interface we defined a new
 * interface that only provides the functionality that we needed so far.</br></br>
 * As soon as a full implementation is creation it would be possible to make this
 * interface extend the {@code Map<K, Set<V>>} interface.
 * 
 * Whereas we name instances of {@code Map<K, V>} key2ValueMap, instances of {@code Mapping<K,V>} are named key2ValuesMapping 
 * (with an s after Value to emphasize that we map on possibly multiple elements).
 * 
 * @param <K> the key type (the domain of the mapping) 
 * @param <V> the value type (the image of the mapping)
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
	 * @param key
	 * @param value
	 * @return the new set of target values for the key (containing the given value)
	 */
	Pair<Set<K>,Set<V>> put(K key, V value);
	
	/**
	 * Adds the values to the set of values that are the target of the keys (if not contained yet).
	 * @param keys
	 * @param values
	 * @return the new set of target values for the keys (containing the given values)
	 */
	Pair<Set<K>,Set<V>> put(Set<K> keySet, Set<V> valueSet);
	
	/**
	 * @see java.util.Map#containsKey(Object)
	 * @param key
	 * @return
	 */
	boolean containsKey(K key);

	/**
	 * @see  java.util.Map#containsValue(Object)
	 */
	boolean containsValue(V value);
	
	/**
	 * @see java.util.Map#entrySet()
	 * @return
	 */
	Set<Entry<Set<K>, Set<V>>> entrySet();
}
