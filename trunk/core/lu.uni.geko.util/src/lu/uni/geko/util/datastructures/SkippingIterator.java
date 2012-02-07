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
 * An abstract iterator that wraps an iterator in order to skip elements using look ahead.
 *
 * @param <T>
 *           the type of the elements to be iterated over
 * @author Max E. Kramer
 */
public abstract class SkippingIterator<T> implements Iterator<T> {
   /** Stores the next element that should not be skipped (if existing and {@code null} otherwise). */
   private T lookAhead;
   /** The iterator to be wrapped. */
   private final Iterator<T> wrappedIterator;

   /**
    * Constructs a new LookAheadSkippingIterator wrapping the given iterator.
    *
    * @param wrappedIterator
    *           an iterator to be wrapped for which elements should be skipped during iteration
    */
   public SkippingIterator(final Iterator<T> wrappedIterator) {
      this.lookAhead = null;
      this.wrappedIterator = wrappedIterator;
   }

   /**
    * Returns whether the given element has to be skipped during iteration or not.
    *
    * @param element
    *           an element of the iteration
    * @return {@code true} when the given element has to be skipped and otherwise {@code false}
    */
   protected abstract boolean skip(T element);

   @Override
   public boolean hasNext() {
      if (this.lookAhead == null) {
         if (this.wrappedIterator.hasNext()) {
            lookAhead();
         } else {
            return false;
         }
      }
      return !skip(this.lookAhead);
   }

   /**
    * Looks ahead in the iteration until an element is reached that has not to be skipped or until no more elements are left.
    */
   private void lookAhead() {
      this.lookAhead = this.wrappedIterator.next();
      while (skip(this.lookAhead) && this.wrappedIterator.hasNext()) {
         this.lookAhead = this.wrappedIterator.next();
      }
   }

   @Override
   public T next() {
      if (skip(this.lookAhead)) {
         if (this.wrappedIterator.hasNext()) {
            lookAhead();
         } else {
            throw new RuntimeException("Called next() on the iterator '" + this + "' although hasNext() is false!");
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
