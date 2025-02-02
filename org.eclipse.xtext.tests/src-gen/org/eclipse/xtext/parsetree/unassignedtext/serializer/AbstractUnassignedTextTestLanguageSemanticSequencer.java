/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.unassignedtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.parsetree.unassignedtext.services.UnassignedTextTestLanguageGrammarAccess;
import org.eclipse.xtext.parsetree.unassignedtext.unassignedtext.CaseInsensitiveKeywordRule;
import org.eclipse.xtext.parsetree.unassignedtext.unassignedtext.CommonTerminalsRule;
import org.eclipse.xtext.parsetree.unassignedtext.unassignedtext.DatatypeRule;
import org.eclipse.xtext.parsetree.unassignedtext.unassignedtext.GroupRule;
import org.eclipse.xtext.parsetree.unassignedtext.unassignedtext.MultiRule;
import org.eclipse.xtext.parsetree.unassignedtext.unassignedtext.PluralRule;
import org.eclipse.xtext.parsetree.unassignedtext.unassignedtext.UnassignedtextPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractUnassignedTextTestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private UnassignedTextTestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == UnassignedtextPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case UnassignedtextPackage.CASE_INSENSITIVE_KEYWORD_RULE:
				sequence_CaseInsensitiveKeywordRule(context, (CaseInsensitiveKeywordRule) semanticObject); 
				return; 
			case UnassignedtextPackage.COMMON_TERMINALS_RULE:
				sequence_CommonTerminalsRule(context, (CommonTerminalsRule) semanticObject); 
				return; 
			case UnassignedtextPackage.DATATYPE_RULE:
				sequence_DatatypeRule(context, (DatatypeRule) semanticObject); 
				return; 
			case UnassignedtextPackage.GROUP_RULE:
				sequence_GroupRule(context, (GroupRule) semanticObject); 
				return; 
			case UnassignedtextPackage.MULTI_RULE:
				sequence_MultiRule(context, (MultiRule) semanticObject); 
				return; 
			case UnassignedtextPackage.PLURAL_RULE:
				sequence_PluralRule(context, (PluralRule) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns CaseInsensitiveKeywordRule
	 *     CaseInsensitiveKeywordRule returns CaseInsensitiveKeywordRule
	 *
	 * Constraint:
	 *     val=INT
	 * </pre>
	 */
	protected void sequence_CaseInsensitiveKeywordRule(ISerializationContext context, CaseInsensitiveKeywordRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UnassignedtextPackage.Literals.CASE_INSENSITIVE_KEYWORD_RULE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UnassignedtextPackage.Literals.CASE_INSENSITIVE_KEYWORD_RULE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCaseInsensitiveKeywordRuleAccess().getValINTTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns CommonTerminalsRule
	 *     CommonTerminalsRule returns CommonTerminalsRule
	 *
	 * Constraint:
	 *     val=ID
	 * </pre>
	 */
	protected void sequence_CommonTerminalsRule(ISerializationContext context, CommonTerminalsRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UnassignedtextPackage.Literals.COMMON_TERMINALS_RULE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UnassignedtextPackage.Literals.COMMON_TERMINALS_RULE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCommonTerminalsRuleAccess().getValIDTerminalRuleCall_4_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns DatatypeRule
	 *     DatatypeRule returns DatatypeRule
	 *
	 * Constraint:
	 *     val=INT
	 * </pre>
	 */
	protected void sequence_DatatypeRule(ISerializationContext context, DatatypeRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UnassignedtextPackage.Literals.DATATYPE_RULE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UnassignedtextPackage.Literals.DATATYPE_RULE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDatatypeRuleAccess().getValINTTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns GroupRule
	 *     GroupRule returns GroupRule
	 *
	 * Constraint:
	 *     {GroupRule}
	 * </pre>
	 */
	protected void sequence_GroupRule(ISerializationContext context, GroupRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns MultiRule
	 *     MultiRule returns MultiRule
	 *
	 * Constraint:
	 *     val=INT
	 * </pre>
	 */
	protected void sequence_MultiRule(ISerializationContext context, MultiRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UnassignedtextPackage.Literals.MULTI_RULE__VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UnassignedtextPackage.Literals.MULTI_RULE__VAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiRuleAccess().getValINTTerminalRuleCall_1_0(), semanticObject.getVal());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns PluralRule
	 *     PluralRule returns PluralRule
	 *
	 * Constraint:
	 *     count=INT
	 * </pre>
	 */
	protected void sequence_PluralRule(ISerializationContext context, PluralRule semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, UnassignedtextPackage.Literals.PLURAL_RULE__COUNT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, UnassignedtextPackage.Literals.PLURAL_RULE__COUNT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPluralRuleAccess().getCountINTTerminalRuleCall_1_0(), semanticObject.getCount());
		feeder.finish();
	}
	
	
}
