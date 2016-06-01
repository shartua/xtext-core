/*
 * Copyright (c) 2016 TypeFox GmbH (http://www.typefox.io) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.ide.tests.testlanguage.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.ide.tests.testlanguage.services.TestLanguageGrammarAccess;
import org.eclipse.xtext.ide.tests.testlanguage.testLanguage.Model;
import org.eclipse.xtext.ide.tests.testlanguage.testLanguage.PrimitiveType;
import org.eclipse.xtext.ide.tests.testlanguage.testLanguage.Property;
import org.eclipse.xtext.ide.tests.testlanguage.testLanguage.TestLanguagePackage;
import org.eclipse.xtext.ide.tests.testlanguage.testLanguage.TypeDeclaration;
import org.eclipse.xtext.ide.tests.testlanguage.testLanguage.TypeReference;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class TestLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private TestLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == TestLanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TestLanguagePackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case TestLanguagePackage.PRIMITIVE_TYPE:
				if (rule == grammarAccess.getPrimitiveTypeRule()) {
					sequence_PrimitiveType(context, (PrimitiveType) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeRule()) {
					sequence_PrimitiveType_Type(context, (PrimitiveType) semanticObject); 
					return; 
				}
				else break;
			case TestLanguagePackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case TestLanguagePackage.TYPE_DECLARATION:
				sequence_TypeDeclaration(context, (TypeDeclaration) semanticObject); 
				return; 
			case TestLanguagePackage.TYPE_REFERENCE:
				if (rule == grammarAccess.getTypeReferenceRule()) {
					sequence_TypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getTypeRule()) {
					sequence_Type_TypeReference(context, (TypeReference) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     types+=TypeDeclaration+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PrimitiveType returns PrimitiveType
	 *
	 * Constraint:
	 *     (name='string' | name='int' | name='boolean')
	 */
	protected void sequence_PrimitiveType(ISerializationContext context, PrimitiveType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns PrimitiveType
	 *
	 * Constraint:
	 *     ((name='string' | name='int' | name='boolean') arrayDiemensions+='['*)
	 */
	protected void sequence_PrimitiveType_Type(ISerializationContext context, PrimitiveType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (type=Type name=ID)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestLanguagePackage.Literals.PROPERTY__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestLanguagePackage.Literals.PROPERTY__TYPE));
			if (transientValues.isValueTransient(semanticObject, TestLanguagePackage.Literals.PROPERTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestLanguagePackage.Literals.PROPERTY__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyAccess().getTypeTypeParserRuleCall_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeDeclaration returns TypeDeclaration
	 *
	 * Constraint:
	 *     (name=ID properties+=Property*)
	 */
	protected void sequence_TypeDeclaration(ISerializationContext context, TypeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeReference returns TypeReference
	 *
	 * Constraint:
	 *     typeRef=[TypeDeclaration|ID]
	 */
	protected void sequence_TypeReference(ISerializationContext context, TypeReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, TestLanguagePackage.Literals.TYPE_REFERENCE__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TestLanguagePackage.Literals.TYPE_REFERENCE__TYPE_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeReferenceAccess().getTypeRefTypeDeclarationIDTerminalRuleCall_0_1(), semanticObject.getTypeRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns TypeReference
	 *
	 * Constraint:
	 *     (typeRef=[TypeDeclaration|ID] arrayDiemensions+='['*)
	 */
	protected void sequence_Type_TypeReference(ISerializationContext context, TypeReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
