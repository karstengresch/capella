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
package org.polarsys.capella.test.diagram.tools.ju.xab;

import org.eclipse.sirius.business.api.session.Session;
import org.polarsys.capella.core.model.helpers.BlockArchitectureExt;
import org.polarsys.capella.test.framework.context.SessionContext;

public class ShowHideActorsMultipart extends ShowHideActors {

  @Override
  public void test() throws Exception {
    Session session = getSession(getRequiredTestModel());
    SessionContext context = new SessionContext(session);
    
    context.setReusableComponents(PROJECT_APPROACH_ID);
    
    testOnXAB(context, OA__OAB_DIAGRAM, BlockArchitectureExt.Type.OA, OA__OAB_ENTITY1);
    testOnXAB(context, SA__SAB_DIAGRAM, BlockArchitectureExt.Type.SA, SA__SAB_A1);
    testOnXAB(context, LA__LAB_DIAGRAM, BlockArchitectureExt.Type.LA, LA__LAB_A1);
    testOnXAB(context, PA__PAB_DIAGRAM, BlockArchitectureExt.Type.PA, PA__PAB_PHYSICAL_ACTOR1);
    
    context.setSingletonComponents(PROJECT_APPROACH_ID);
  }
}
