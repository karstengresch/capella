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
package org.polarsys.capella.core.semantic.queries.basic.queries;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.polarsys.capella.core.data.interaction.AbstractCapability;
import org.polarsys.capella.common.helpers.query.IQuery;

/**
 * Return Extended Capabilities of current Abstract Capability
 *
 */
public class Capability_extendedCapabilities implements IQuery {

	/**
	 * 
	 */
	public Capability_extendedCapabilities() {
    // do nothing
	}

	/** 
	 *  
	 * current.extendedCapabilities
	 * 
	 * @see org.polarsys.capella.common.helpers.query.IQuery#compute(java.lang.Object)
	 */
	public List<Object> compute(Object object) {
		List<Object> result = new ArrayList<Object>();
		if (object instanceof AbstractCapability) {
		  AbstractCapability c = (AbstractCapability) object;
			EList<AbstractCapability> capabilities = c.getExtendedAbstractCapabilities();
			if (!capabilities.isEmpty()) {
			  result.addAll(capabilities);  
      }
      
		}
		return result;
	}
}
