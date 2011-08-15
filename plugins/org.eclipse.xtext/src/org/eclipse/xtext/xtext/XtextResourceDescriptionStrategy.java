/*******************************************************************************
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.xtext;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractMetamodelDeclaration;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;

/**
 * @author Jan Koehnlein - Initial contribution and API
 */
public class XtextResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	/*
	 * Since Xtext registers the XtextQualifiedNameConverter which uses '::' as a delimiter,
	 * we have to inject the default implementation here.
	 */
	@Inject
	private IQualifiedNameConverter.DefaultImpl defaultQualifiedNameConverter;
	
	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof Grammar) {
			String grammarName = ((Grammar) eObject).getName();
			QualifiedName qualifiedName = defaultQualifiedNameConverter.toQualifiedName(grammarName);
			acceptor.accept(EObjectDescription.create(qualifiedName, eObject));
		} else if (eObject instanceof AbstractMetamodelDeclaration
				|| eObject instanceof AbstractRule)
			return super.createEObjectDescriptions(eObject, acceptor);
		return eObject instanceof Grammar;
	}
}
