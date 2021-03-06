/*******************************************************************************
 * Copyright (c) 2019 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.semantic.queries.basic.queries;

import java.util.ArrayList;
import java.util.List;

import org.polarsys.capella.core.data.helpers.capellacore.services.GeneralizableElementExt;
import org.polarsys.capella.core.data.capellacore.GeneralizableElement;
import org.polarsys.capella.core.data.cs.Component;
import org.polarsys.capella.common.helpers.query.IQuery;

/**
 * This query  return all recursive super Generalizable Components
 *
 */
public class GeneralizableElementAllSuperGC implements IQuery {


  /** 
   * @see org.polarsys.capella.common.helpers.query.IQuery#compute(java.lang.Object)
   */
  @Override
  public List<Object> compute(Object object) {
    List<Object> result = new ArrayList<Object>();
    if (object instanceof Component) {
      Component gElement = (Component) object;
      // add all super GeneralizableElement Components
      List<GeneralizableElement> allSuperGenCompnts = GeneralizableElementExt.getAllSuperGeneralizableElements(gElement);
      if (!allSuperGenCompnts.isEmpty()) {
        result.addAll(allSuperGenCompnts);
      }
    }
    return result;
  }
}
