/*******************************************************************************
 * Copyright (c) 2006, 2014 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/

package org.polarsys.capella.core.platform.sirius.ui.navigator;

import org.osgi.framework.BundleContext;

import org.polarsys.capella.common.ui.services.AbstractUIActivator;
import org.polarsys.capella.core.model.preferences.CapellaModelPreferencesPlugin;
import org.polarsys.capella.core.platform.sirius.ui.navigator.preferences.CapellaNavigatorPreferencesInitializer;

/**
 * The activator class controls the plug-in life cycle.
 */
public class CapellaNavigatorPlugin extends AbstractUIActivator {

  /*
   * 
   */
  public static final String PLUGIN_ID = "org.polarsys.capella.core.platform.sirius.ui.navigator"; //$NON-NLS-1$

  // The shared instance.
  private static CapellaNavigatorPlugin __plugin;

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
   */
  @Override
  public void start(BundleContext context_p) throws Exception {
    super.start(context_p);
    __plugin = this;
    // Make sure model preferences are initialized.
    CapellaModelPreferencesPlugin.getDefault();
    new CapellaNavigatorPreferencesInitializer();
  }

  /**
   * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
   */
  @Override
  public void stop(BundleContext context_p) throws Exception {
    __plugin = null;
    super.stop(context_p);
  }

  /**
   * Returns the shared instance
   * @return the shared instance
   */
  public static CapellaNavigatorPlugin getDefault() {
    return __plugin;
  }
}
