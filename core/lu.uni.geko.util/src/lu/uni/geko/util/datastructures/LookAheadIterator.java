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

import java.util.Iterator;

/**
 * @author Max E. Kramer
 */
public abstract class LookAheadIterator<T> implements Iterator<T> {
   private T lookAhead;
   private final Iterator<T> wrappedIterator;

   public LookAheadIterator(Iterator<T> wrappedIterator) {
      this.lookAhead = null;
      this.wrappedIterator = wrappedIterator;
   }

   public abstract boolean fulfillsLookAheadCondition();

   @Override
   public boolean hasNext() {
      if (this.lookAhead == null) {
         if (this.wrappedIterator.hasNext()) {
            lookAhead();
         } else {
            return false;
         }
      }
      return fulfillsLookAheadCondition();
   }

   private void lookAhead() {
      this.lookAhead = this.wrappedIterator.next();
      while (fulfillsLookAheadCondition() && this.wrappedIterator.hasNext()) {
         this.lookAhead = this.wrappedIterator.next();
      }
   }

   @Override
   public T next() {
      if (fulfillsLookAheadCondition()) {
         if (this.wrappedIterator.hasNext()) {
            lookAhead();
         } else {
            throw new RuntimeException("Called next() on iterator although hasNext() is false!");
         }
      }
      T next = this.lookAhead;
      this.lookAhead = null;
      return next;
   }

   @Override
   public void remove() {
      throw new RuntimeException("The iterator '" + this + "' does not support remove operation!");
   }
}
