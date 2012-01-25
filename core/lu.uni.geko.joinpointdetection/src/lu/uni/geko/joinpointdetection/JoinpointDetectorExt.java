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
package lu.uni.geko.joinpointdetection;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public interface JoinpointDetectorExt {
   /** extension point ID **/
   String ID = "lu.uni.geko.joinpointdetection.joinpointdetector";

   List<Map<EObject, EObject>> detectJoinpoints(final URI pointcutMURI, final URI baseMURI);
}
