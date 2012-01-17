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

public class Quintuple<A,B,C,D,E> extends Quadruple<A,B,C,D> {
	public E fifth;
	
	public Quintuple(A first, B second, C third, D fourth, E fifth) {
		super(first, second, third, fourth);
		this.fifth = fifth;
	}

	@Override
	public String toString() {
		return "Quintuple [first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + ", fifth=" + fifth + "]";
	}
}
