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
package lu.uni.geko.common.modeltransform;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.ui.SimpleMessageConsole;
import lu.uni.geko.util.ui.SimpleMessageConsoleManager;

import org.eclipse.emf.common.util.URI;
/**
 * Superclass for all model transformers / generators that need a console and a URI
 * @param <T> the return type of the transformation
 */
public abstract class AbstractTransformer<T> {
	protected final URI uri;
	protected final SimpleMessageConsole console;
	
	public AbstractTransformer(URI uri) {
		super();
		this.uri = uri;
		this.console = SimpleMessageConsoleManager.getConsole(GeKoConstants.CONSOLE_NAME);
	}
	
	public abstract T generate();
}
