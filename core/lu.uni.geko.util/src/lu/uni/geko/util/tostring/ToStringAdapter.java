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

public class ToStringAdapter {
	private static final String INDENTATION = "  ";
	
	protected String getIndentation(int indentLevel) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < indentLevel; i++) {
			s.append(INDENTATION);
		}
		return s.toString();
	}
	
	public String toString(Object object) {
		// per default we do not indent
		return toString(object, 0);
	}
	
	protected String toString(Object object, int indentLevel) {
		// RATIONALE MK as Java does not support dynamic dispatch we simulate it
		// MAYDO MK replace dynamic dispatch simulation with a nicer solution if possible
		if (object instanceof Map<?,?>) {
			return toString((Map<?,?>) object, indentLevel);
		}
		if (object instanceof Iterable<?>) {
			return toString((Iterable<?>) object, indentLevel);
		}
		if (object instanceof Iterator<?>) {
			return toString((Iterator<?>) object, indentLevel);
		}
		if (object instanceof Entry<?,?>) {
			return toString((Entry<?,?>) object, indentLevel);
		}
		// per default we use the existing toString method
		return getIndentation(indentLevel) + (object == null ? "null" : object.toString());
	}
	
//	protected String toString(Object[] array, int indentLevel) {
//		StringBuilder s = new StringBuilder();
//		s.append("[\n");
//		indentLevel++;
//		String indentation = getIndentation(indentLevel);
//		if (array.length > 1) {
//			s.append(indentation + toString(array[0], indentLevel));
//		}
//		for (int i = 1; i < array.length; i++) {
//			s.append(",\n" + indentation + toString(array[i], indentLevel));
//		}
//		s.append("]");
//		return s.toString();
//	}
	
	protected String toString(Map<?,?> map, int indentLevel) {
		return toString(map.entrySet(), indentLevel);
	}
	
	protected String toString(Iterable<?> iterable, int indentLevel) {
		Iterator<?> iterator = iterable.iterator();
		return toString(iterator, indentLevel);
	}
	
	protected String toString(Iterator<?> iterator, int indentLevel) {
		StringBuilder s = new StringBuilder();
		s.append("[");
		indentLevel++;
		if (iterator.hasNext()) {
			s.append(toString(iterator.next(), indentLevel));
			while (iterator.hasNext()) {
				s.append(",\n" + toString(iterator.next(), indentLevel));
			}
		}
		s.append("]");
		return s.toString();
	}
	
	protected String toString(Entry<?,?> mapEntry, int indentLevel) {
		return toString(mapEntry.getKey(), indentLevel) + "\n->\n" + toString(mapEntry.getValue(), 0);
	}
}
