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
package lu.uni.geko.weaver.scope;

/**
 * The type of advice instantiation scope specifying how it can be determined whether an advice element has to be re-instantiated.
 *
 * @author Max E. Kramer
 */
public enum ScopeType {
   /** Global advice instantiation scope resulting in a single instance per woven advice. */
   GlobalScope,
   /** Per join point advice instantiation scope resulting in an instance per join point. */
   PerJoinPointScope,
   /**
    * Dynamic advice instantiation scope giving the user the possibility to decide which instance should be used. CURRENTLY NOT
    * USED.
    */
   DynamicScope,
   /**
    * Custom advice instantiation scope resulting in an instance for every match of a set of advice elements. CURRENTLY NOT USED.
    */
   CustomScope
}
