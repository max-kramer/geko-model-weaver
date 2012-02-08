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
 * A representation of the scope for which an advice element should be instantiated independent of other instantiations of the
 * same advice element.
 *
 * @author Max E. Kramer
 */
public interface AdviceInstantiationScope {
   /**
    * Returns the type of this advice instantiation scope.
    *
    * @return the type
    */
   ScopeType getType();
}
