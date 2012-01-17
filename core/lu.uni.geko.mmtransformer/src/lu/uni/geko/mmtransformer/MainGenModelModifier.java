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
package lu.uni.geko.mmtransformer;

import java.util.List;

import lu.uni.geko.util.adapters.EclipseAdapter;
import lu.uni.geko.util.datastructures.Pair;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;

public class MainGenModelModifier {

	public static void modifyGenModelForMMURI(final GenModel genModel, final URI mmURI) {
		List<Pair<GenModelModifierExt, Integer>> genModelModifiers = EclipseAdapter.getRegisteredExecutablesWithPriority(GenModelModifierExt.ID, "class", GenModelModifierExt.class);
		
		EclipseAdapter.sortExectuablesDescByPriority(GenModelModifierExt.ID, genModelModifiers);
		
		for (final Pair<GenModelModifierExt, Integer> genModelModifier : genModelModifiers) {
			Runnable runnable = new Runnable() {
				@Override
				public void run() {
					genModelModifier.first.modifyGenModelForMMURI(genModel, mmURI);
				}
			};
			EclipseAdapter.runInProtectedMode(runnable);
		}
	}
}
