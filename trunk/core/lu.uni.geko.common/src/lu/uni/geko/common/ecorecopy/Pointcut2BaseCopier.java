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
package lu.uni.geko.common.ecorecopy;

import lu.uni.geko.common.GeKoConstants;
import lu.uni.geko.util.ecorecopy.Abstract2BaseCopier;

public class Pointcut2BaseCopier extends Abstract2BaseCopier {
	private static final long serialVersionUID = 2524682329124229987L;

	@Override
	protected String getPackageNameSuffixToBeRemoved() {
		return GeKoConstants.getPcMMPackageNsuriAppendage();
	}
}
