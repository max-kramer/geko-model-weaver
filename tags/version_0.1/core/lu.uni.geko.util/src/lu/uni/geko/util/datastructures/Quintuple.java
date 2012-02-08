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
 * A 5-tuple.
 *
 * @param <A>
 *           the type of the first element
 * @param <B>
 *           the type of the second element
 * @param <C>
 *           the type of the third element
 * @param <D>
 *           the type of the fourth element
 * @param <E>
 *           the type of the fifth element
 * @author Max E. Kramer
 */
public class Quintuple<A, B, C, D, E> extends Quadruple<A, B, C, D> {
   /** The fifth element. */
   private final E fifth;

   /**
    * Constructs a new Quintuple using the given first, second, third, fourth and fifth element.
    *
    * @param first
    *           the first element
    * @param second
    *           the second element
    * @param third
    *           the third element
    * @param fourth
    *           the fourth element
    * @param fifth
    *           the fifth element
    */
   public Quintuple(final A first, final B second, final C third, final D fourth, final E fifth) {
      super(first, second, third, fourth);
      this.fifth = fifth;
   }

   @Override
   public String toString() {
      return "Quintuple [first=" + getFirst() + ", second=" + getSecond() + ", third=" + getThird() + ", fourth=" + getFourth()
            + ", fifth=" + getFifth() + "]";
   }

   /**
    * @return the fifth element.
    */
   public E getFifth() {
      return fifth;
   }
}
