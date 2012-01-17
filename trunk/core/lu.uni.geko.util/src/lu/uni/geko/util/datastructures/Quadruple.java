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

public class Quadruple<A,B,C,D> extends Triple<A, B, C> {
	public D fourth;
	
	public Quadruple(A first, B second, C third, D fourth) {
		super(first, second, third);
		this.fourth = fourth;
	}

	@Override
	public String toString() {
		return "Quadruple [first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + "]";
	}
}
