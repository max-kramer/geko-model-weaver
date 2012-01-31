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

import java.util.Set;

/**
 * A bidirectional mapping from possibly multiple keys to possibly multiple values.
 *
 * @param <K>
 *           key type
 * @param <V>
 *           value type
 * @author Max E. Kramer
 */
public interface BiN2NMap<K, V> extends N2NMap<K, V> {
   /**
    * Returns a set containing all keys that are mapped to the given value.
    *
    * @param value
    *           a value
    * @return all keys mapped to the value
    */
   Set<K> getAllKeysForValue(V value);
}
