/*******************************************************************************
 * Copyright (c) 2006, 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.business.queries.queries.pa;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.common.queries.AbstractQuery;
import org.polarsys.capella.common.queries.ExtendingQuery;
import org.polarsys.capella.common.queries.queryContext.IQueryContext;
import org.polarsys.capella.core.business.queries.queries.cs.AbstractComponentHelpers;
import org.polarsys.capella.core.data.capellacore.CapellaElement;

@ExtendingQuery (extendingQuery = GetAvailable_PhysicalComponent_UsedInterfaces.class)
public class GetAvailable_PhysicalComponent_UsedInterfaces__Lib extends AbstractQuery {

  @Override
  public List<Object> execute(Object input, IQueryContext context) {
    CapellaElement capellaElement = (CapellaElement) input;
    List<EObject> availableElements = AbstractComponentHelpers.getAvailableElements_Component_UsedInterface(capellaElement);
    return (List) availableElements;
  }

}
