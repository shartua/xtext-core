/**
 * Copyright (c) 2017, 2020 TypeFox GmbH (http://www.typefox.io) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.xtext.ide.server.hover;

import org.eclipse.lsp4j.Hover;
import org.eclipse.lsp4j.HoverParams;
import org.eclipse.lsp4j.MarkupContent;
import org.eclipse.lsp4j.TextDocumentPositionParams;
import org.eclipse.xtext.ide.server.Document;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import com.google.inject.ImplementedBy;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
@ImplementedBy(HoverService.class)
public interface IHoverService {
	static final Hover EMPTY_HOVER = new Hover(new MarkupContent("markdown", ""), null);

	/**
	 * callback for 'textDocument/hover' requests.
	 * 
	 * @deprecated please override/call {@link #hover(Document, XtextResource, HoverParams, CancelIndicator)} instead.
	 * This method is scheduled to be removed with 2.22.
	 */
	@Deprecated//(since="2.21",forRemoval=true)
	default Hover hover(Document document, XtextResource resource, TextDocumentPositionParams params,
			CancelIndicator cancelIndicator) {
		if (params instanceof HoverParams) {
			return hover(document, resource, (HoverParams) params, cancelIndicator);
		}
		throw new IllegalArgumentException("params is not a HoverParams");
	}
	
	/**
	 * callback for 'textDocument/hover' requests.
	 * @since 2.21
	 */
	Hover hover(Document document, XtextResource resource, HoverParams params,
			CancelIndicator cancelIndicator);
}
