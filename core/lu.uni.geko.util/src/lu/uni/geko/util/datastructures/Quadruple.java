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

/**
 * A 4-tuple.
 *
 * @param <A>
 *           the type of the first element
 * @param <B>
 *           the type of the second element
 * @param <C>
 *           the type of the third element
 * @param <D>
 *           the type of the fourth element
 * @author Max E. Kramer
 */
public class Quadruple<A, B, C, D> extends Triple<A, B, C> {
   /** The fourth element. */
   private final D fourth;

   /**
    * Constructs a new Quadruple using the given first, second, third and fourth element.
    *
    * @param first
    *           the first element
    * @param second
    *           the second element
    * @param third
    *           the third element
    * @param fourth
    *           the fourth element
    */
   public Quadruple(final A first, final B second, final C third, final D fourth) {
      super(first, second, third);
      this.fourth = fourth;
   }

   @Override
   public String toString() {
      return "Quadruple [first=" + getFirst() + ", second=" + getSecond() + ", third=" + getThird() + ", fourth=" + getFourth()
            + "]";
   }

   /**
    * @return the fourth element.
    */
   public final D getFourth() {
      return fourth;
   }
}
