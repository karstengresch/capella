/*******************************************************************************
 * Copyright (c) 2006, 2015 THALES GLOBAL SERVICES.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Thales - initial API and implementation
 *******************************************************************************/
package org.polarsys.capella.test.diagram.common.ju.headless;

/**
 * Cache to store result operation of overridden external java action
 */
public class HeadlessResultOpProvider {

	/** Singleton access*/
	public static HeadlessResultOpProvider INSTANCE = new HeadlessResultOpProvider();
	
	/** the current class used to short-cut external java action */
	private IHeadlessResult currentOp = null;
	
	/** control */
	boolean used;
	
	/**
	 * Default constructor
	 */
	private HeadlessResultOpProvider() {
		//Do nothing
	}
	
	/** accessor */
	public IHeadlessResult getCurrentOp() {
		if (used) {
			currentOp = null;
		}
		used = true;

		return currentOp;
	}
	
	/** write accessor */
	public void setCurrentOp(IHeadlessResult op_p) {
		currentOp = op_p;
		used = false;
	}
}
