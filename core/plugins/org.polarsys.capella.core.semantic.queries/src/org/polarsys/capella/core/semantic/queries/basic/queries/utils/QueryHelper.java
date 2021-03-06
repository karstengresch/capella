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

package org.polarsys.capella.core.semantic.queries.basic.queries.utils;

import org.polarsys.capella.core.data.fa.FunctionalChain;
import org.polarsys.capella.core.data.fa.FunctionalChainReference;

public class QueryHelper {
  
  private QueryHelper() {
  }
  
  public static FunctionalChain getFunctionalChain(Object functionalChainOrFunctionalChainReference) {
    if (functionalChainOrFunctionalChainReference instanceof FunctionalChain) {
      return (FunctionalChain) functionalChainOrFunctionalChainReference;
    }
    if (functionalChainOrFunctionalChainReference instanceof FunctionalChainReference) {
      return ((FunctionalChainReference) functionalChainOrFunctionalChainReference).getReferencedFunctionalChain();
    }
    return null;
  }
}
