/*******************************************************************************
 * Copyright (c) 2006, 2016 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.transition.common.handlers.activity;

import org.eclipse.core.runtime.IStatus;

import org.polarsys.kitalpha.cadence.core.api.parameter.ActivityParameters;
import org.polarsys.capella.core.transition.common.handlers.IHandler;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;

/**
 * Allow to define pre and post operations while triggering activity
 *
 */
public interface IActivityExtender extends IHandler {

  IStatus preActivity(IContext context, String activityIdentifier, ActivityParameters activityParams);

  IStatus postActivity(IContext context, String activityIdentifier, ActivityParameters activityParams);

}
