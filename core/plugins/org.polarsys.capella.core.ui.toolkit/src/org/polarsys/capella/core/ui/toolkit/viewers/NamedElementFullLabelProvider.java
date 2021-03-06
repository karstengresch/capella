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
package org.polarsys.capella.core.ui.toolkit.viewers;

import org.polarsys.capella.common.data.modellingcore.AbstractNamedElement;
import org.polarsys.capella.common.ui.providers.MDEAdapterFactoryLabelProvider;

public class NamedElementFullLabelProvider extends MDEAdapterFactoryLabelProvider {

  @Override
  public String getText(Object element) {
    if (element instanceof AbstractNamedElement) {
      String path = ((AbstractNamedElement) element).getFullLabel();
      if (path.startsWith("/")) { //$NON-NLS-1$
        path = path.substring(1);
      }
      return path.replaceAll("/", "::"); //$NON-NLS-1$ //$NON-NLS-2$
    }
    return super.getText(element);
  }
}
