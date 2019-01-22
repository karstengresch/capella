/**
 * 
 *   Copyright (c) 2006, 2019 THALES DMS FRANCE.
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.0
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 *  
 *   Contributors:
 *      Thales - initial API and implementation
 *  
 */
package org.polarsys.capella.viatra.core.data.epbs.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.viatra.query.runtime.exception.ViatraQueryException;
import org.polarsys.capella.viatra.core.data.epbs.surrogate.ConfigurationItem__allocatedPhysicalArtifactsMatcher;
import org.polarsys.capella.viatra.core.data.epbs.surrogate.util.ConfigurationItem__allocatedPhysicalArtifactsQuerySpecification;

/**
 * A pattern group formed of all public patterns defined in ConfigurationItem.vql.
 * 
 * <p>Use the static instance as any {@link org.eclipse.viatra.query.runtime.api.IPatternGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file ConfigurationItem.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.epbs.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>ConfigurationItem__allocatedPhysicalArtifacts</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class ConfigurationItem extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static ConfigurationItem instance() throws ViatraQueryException {
    if (INSTANCE == null) {
        INSTANCE = new ConfigurationItem();
    }
    return INSTANCE;
  }
  
  private static ConfigurationItem INSTANCE;
  
  private ConfigurationItem() throws ViatraQueryException {
    querySpecifications.add(ConfigurationItem__allocatedPhysicalArtifactsQuerySpecification.instance());
  }
  
  public ConfigurationItem__allocatedPhysicalArtifactsQuerySpecification getConfigurationItem__allocatedPhysicalArtifacts() throws ViatraQueryException {
    return ConfigurationItem__allocatedPhysicalArtifactsQuerySpecification.instance();
  }
  
  public ConfigurationItem__allocatedPhysicalArtifactsMatcher getConfigurationItem__allocatedPhysicalArtifacts(final ViatraQueryEngine engine) throws ViatraQueryException {
    return ConfigurationItem__allocatedPhysicalArtifactsMatcher.on(engine);
  }
}