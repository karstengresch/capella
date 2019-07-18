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
package org.polarsys.capella.viatra.core.data.fa.surrogate;

import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedPatternGroup;
import org.polarsys.capella.viatra.core.data.fa.surrogate.FunctionalExchangeRealization__realizedFunctionalExchange;
import org.polarsys.capella.viatra.core.data.fa.surrogate.FunctionalExchangeRealization__realizingFunctionalExchange;

/**
 * A pattern group formed of all public patterns defined in FunctionalExchangeRealization.vql.
 * 
 * <p>Use the static instance as any {@link interface org.eclipse.viatra.query.runtime.api.IQueryGroup}, to conveniently prepare
 * a VIATRA Query engine for matching all patterns originally defined in file FunctionalExchangeRealization.vql,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package org.polarsys.capella.viatra.core.data.fa.surrogate, the group contains the definition of the following patterns: <ul>
 * <li>FunctionalExchangeRealization__realizedFunctionalExchange</li>
 * <li>FunctionalExchangeRealization__realizingFunctionalExchange</li>
 * </ul>
 * 
 * @see IQueryGroup
 * 
 */
@SuppressWarnings("all")
public final class FunctionalExchangeRealization extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws ViatraQueryRuntimeException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static FunctionalExchangeRealization instance() {
    if (INSTANCE == null) {
        INSTANCE = new FunctionalExchangeRealization();
    }
    return INSTANCE;
  }
  
  private static FunctionalExchangeRealization INSTANCE;
  
  private FunctionalExchangeRealization() {
    querySpecifications.add(FunctionalExchangeRealization__realizedFunctionalExchange.instance());
    querySpecifications.add(FunctionalExchangeRealization__realizingFunctionalExchange.instance());
  }
  
  public FunctionalExchangeRealization__realizedFunctionalExchange getFunctionalExchangeRealization__realizedFunctionalExchange() {
    return FunctionalExchangeRealization__realizedFunctionalExchange.instance();
  }
  
  public FunctionalExchangeRealization__realizedFunctionalExchange.Matcher getFunctionalExchangeRealization__realizedFunctionalExchange(final ViatraQueryEngine engine) {
    return FunctionalExchangeRealization__realizedFunctionalExchange.Matcher.on(engine);
  }
  
  public FunctionalExchangeRealization__realizingFunctionalExchange getFunctionalExchangeRealization__realizingFunctionalExchange() {
    return FunctionalExchangeRealization__realizingFunctionalExchange.instance();
  }
  
  public FunctionalExchangeRealization__realizingFunctionalExchange.Matcher getFunctionalExchangeRealization__realizingFunctionalExchange(final ViatraQueryEngine engine) {
    return FunctionalExchangeRealization__realizingFunctionalExchange.Matcher.on(engine);
  }
}