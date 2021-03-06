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

package org.polarsys.capella.core.transition.system.rules.fa;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.core.data.fa.FaPackage;
import org.polarsys.capella.core.data.fa.SequenceLink;
import org.polarsys.capella.core.transition.common.constants.ITransitionConstants;
import org.polarsys.capella.core.transition.common.handlers.attachment.AttachmentHelper;
import org.polarsys.capella.core.transition.common.handlers.contextscope.ContextScopeHandlerHelper;
import org.polarsys.capella.core.transition.common.handlers.contextscope.IContextScopeHandler;
import org.polarsys.capella.core.transition.system.rules.AbstractCapellaElementRule;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IContext;
import org.polarsys.kitalpha.transposer.rules.handler.rules.api.IPremise;

public class SequenceLinkRule extends AbstractCapellaElementRule {
  
  public SequenceLinkRule() {
    super();
    registerUpdatedReference(FaPackage.Literals.SEQUENCE_LINK__CONDITION);
    registerUpdatedReference(FaPackage.Literals.SEQUENCE_LINK__SOURCE);
    registerUpdatedReference(FaPackage.Literals.SEQUENCE_LINK__TARGET);
    registerUpdatedReference(FaPackage.Literals.SEQUENCE_LINK__LINKS);
    registerUpdatedReference(FaPackage.Literals.REFERENCE_HIERARCHY_CONTEXT__SOURCE_REFERENCE_HIERARCHY);
    registerUpdatedReference(FaPackage.Literals.REFERENCE_HIERARCHY_CONTEXT__TARGET_REFERENCE_HIERARCHY);

  }
  
  @Override
  protected EClass getSourceType() {
    return FaPackage.Literals.SEQUENCE_LINK;
  }

  @Override
  protected void premicesRelated(EObject element, ArrayList<IPremise> needed) {
    super.premicesRelated(element, needed);
    needed.addAll(createDefaultPrecedencePremices(element, FaPackage.Literals.SEQUENCE_LINK__CONDITION));
    needed.addAll(createDefaultPrecedencePremices(element, FaPackage.Literals.SEQUENCE_LINK__SOURCE));
    needed.addAll(createDefaultPrecedencePremices(element, FaPackage.Literals.SEQUENCE_LINK__TARGET));
    needed.addAll(createDefaultPrecedencePremices(element, FaPackage.Literals.SEQUENCE_LINK__LINKS));
    needed.addAll(createDefaultPrecedencePremices(element, FaPackage.Literals.REFERENCE_HIERARCHY_CONTEXT__SOURCE_REFERENCE_HIERARCHY));
    needed.addAll(createDefaultPrecedencePremices(element, FaPackage.Literals.REFERENCE_HIERARCHY_CONTEXT__TARGET_REFERENCE_HIERARCHY));
  }
  
  @Override
  protected void attachRelated(EObject element, EObject result, IContext context) {
    super.attachRelated(element, result, context);
    AttachmentHelper.getInstance(context).attachTracedElements(element, result, FaPackage.Literals.SEQUENCE_LINK__CONDITION, context);
    AttachmentHelper.getInstance(context).attachTracedElements(element, result, FaPackage.Literals.SEQUENCE_LINK__SOURCE, context);
    AttachmentHelper.getInstance(context).attachTracedElements(element, result, FaPackage.Literals.SEQUENCE_LINK__TARGET, context);
    AttachmentHelper.getInstance(context).attachTracedElements(element, result, FaPackage.Literals.SEQUENCE_LINK__LINKS, context);
    AttachmentHelper.getInstance(context).attachTracedElements(element, result, FaPackage.Literals.REFERENCE_HIERARCHY_CONTEXT__SOURCE_REFERENCE_HIERARCHY, context);
    AttachmentHelper.getInstance(context).attachTracedElements(element, result, FaPackage.Literals.REFERENCE_HIERARCHY_CONTEXT__TARGET_REFERENCE_HIERARCHY, context);
  }
  
  @Override
  protected void retrieveGoDeep(EObject source, List<EObject> result, IContext context) {
    super.retrieveGoDeep(source, result, context);
    SequenceLink element = (SequenceLink) source;
    result.add(element.getCondition());
    IContextScopeHandler handler = ContextScopeHandlerHelper.getInstance(context);
    if (handler.contains(ITransitionConstants.SOURCE_SCOPE, source, context)) {
      handler.add(ITransitionConstants.SOURCE_SCOPE, element.getCondition(), context);
    }
  }
}
