/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.linking.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Bug287988TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cActionsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cAttributesAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cAttributesBaseAttributeParserRuleCall_0_1_0 = (RuleCall)cAttributesAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cSimpleKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cAttributesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cAttributesSimpleAttributeParserRuleCall_1_1_0 = (RuleCall)cAttributesAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cRulecallKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cAttributesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cAttributesRuleCallAttributeParserRuleCall_2_1_0 = (RuleCall)cAttributesAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cRulecall2Keyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cAttributesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cAttributesRuleCallAttribute2ParserRuleCall_3_1_0 = (RuleCall)cAttributesAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cRulecall3Keyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cAttributesAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cAttributesRuleCallAttribute3ParserRuleCall_4_1_0 = (RuleCall)cAttributesAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cInlinedActionsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cAttributesAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cAttributesActionAttributeParserRuleCall_5_1_0 = (RuleCall)cAttributesAssignment_5_1.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//Model:
		//    ('actions' attributes+=BaseAttribute*)
		//  | ('simple' attributes+=SimpleAttribute*)
		//  | ('rulecall' attributes+=RuleCallAttribute*)
		//  | ('rulecall2' attributes+=RuleCallAttribute2*)
		//  | ('rulecall3' attributes+=RuleCallAttribute3*)
		//  | ('inlinedActions' attributes+=ActionAttribute*);
		@Override public ParserRule getRule() { return rule; }
		
		//  ('actions' attributes+=BaseAttribute*)
		//| ('simple' attributes+=SimpleAttribute*)
		//| ('rulecall' attributes+=RuleCallAttribute*)
		//| ('rulecall2' attributes+=RuleCallAttribute2*)
		//| ('rulecall3' attributes+=RuleCallAttribute3*)
		//| ('inlinedActions' attributes+=ActionAttribute*)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//('actions' attributes+=BaseAttribute*)
		public Group getGroup_0() { return cGroup_0; }
		
		//'actions'
		public Keyword getActionsKeyword_0_0() { return cActionsKeyword_0_0; }
		
		//attributes+=BaseAttribute*
		public Assignment getAttributesAssignment_0_1() { return cAttributesAssignment_0_1; }
		
		//BaseAttribute
		public RuleCall getAttributesBaseAttributeParserRuleCall_0_1_0() { return cAttributesBaseAttributeParserRuleCall_0_1_0; }
		
		//('simple' attributes+=SimpleAttribute*)
		public Group getGroup_1() { return cGroup_1; }
		
		//'simple'
		public Keyword getSimpleKeyword_1_0() { return cSimpleKeyword_1_0; }
		
		//attributes+=SimpleAttribute*
		public Assignment getAttributesAssignment_1_1() { return cAttributesAssignment_1_1; }
		
		//SimpleAttribute
		public RuleCall getAttributesSimpleAttributeParserRuleCall_1_1_0() { return cAttributesSimpleAttributeParserRuleCall_1_1_0; }
		
		//('rulecall' attributes+=RuleCallAttribute*)
		public Group getGroup_2() { return cGroup_2; }
		
		//'rulecall'
		public Keyword getRulecallKeyword_2_0() { return cRulecallKeyword_2_0; }
		
		//attributes+=RuleCallAttribute*
		public Assignment getAttributesAssignment_2_1() { return cAttributesAssignment_2_1; }
		
		//RuleCallAttribute
		public RuleCall getAttributesRuleCallAttributeParserRuleCall_2_1_0() { return cAttributesRuleCallAttributeParserRuleCall_2_1_0; }
		
		//('rulecall2' attributes+=RuleCallAttribute2*)
		public Group getGroup_3() { return cGroup_3; }
		
		//'rulecall2'
		public Keyword getRulecall2Keyword_3_0() { return cRulecall2Keyword_3_0; }
		
		//attributes+=RuleCallAttribute2*
		public Assignment getAttributesAssignment_3_1() { return cAttributesAssignment_3_1; }
		
		//RuleCallAttribute2
		public RuleCall getAttributesRuleCallAttribute2ParserRuleCall_3_1_0() { return cAttributesRuleCallAttribute2ParserRuleCall_3_1_0; }
		
		//('rulecall3' attributes+=RuleCallAttribute3*)
		public Group getGroup_4() { return cGroup_4; }
		
		//'rulecall3'
		public Keyword getRulecall3Keyword_4_0() { return cRulecall3Keyword_4_0; }
		
		//attributes+=RuleCallAttribute3*
		public Assignment getAttributesAssignment_4_1() { return cAttributesAssignment_4_1; }
		
		//RuleCallAttribute3
		public RuleCall getAttributesRuleCallAttribute3ParserRuleCall_4_1_0() { return cAttributesRuleCallAttribute3ParserRuleCall_4_1_0; }
		
		//('inlinedActions' attributes+=ActionAttribute*)
		public Group getGroup_5() { return cGroup_5; }
		
		//'inlinedActions'
		public Keyword getInlinedActionsKeyword_5_0() { return cInlinedActionsKeyword_5_0; }
		
		//attributes+=ActionAttribute*
		public Assignment getAttributesAssignment_5_1() { return cAttributesAssignment_5_1; }
		
		//ActionAttribute
		public RuleCall getAttributesActionAttributeParserRuleCall_5_1_0() { return cAttributesActionAttributeParserRuleCall_5_1_0; }
	}
	public class BaseAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.BaseAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cAttributeParserRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cMasterParserRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cRefKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cTypeRefAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final CrossReference cTypeRefBaseAttributeCrossReference_1_0_1_0 = (CrossReference)cTypeRefAssignment_1_0_1.eContents().get(0);
		private final RuleCall cTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1 = (RuleCall)cTypeRefBaseAttributeCrossReference_1_0_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//BaseAttribute:
		//  (Attribute|Master) ("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//(Attribute|Master) ("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";"
		public Group getGroup() { return cGroup; }
		
		//(Attribute|Master)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//Attribute
		public RuleCall getAttributeParserRuleCall_0_0() { return cAttributeParserRuleCall_0_0; }
		
		//Master
		public RuleCall getMasterParserRuleCall_0_1() { return cMasterParserRuleCall_0_1; }
		
		//("ref" typeRef=[BaseAttribute]|type=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"ref" typeRef=[BaseAttribute]
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"ref"
		public Keyword getRefKeyword_1_0_0() { return cRefKeyword_1_0_0; }
		
		//typeRef=[BaseAttribute]
		public Assignment getTypeRefAssignment_1_0_1() { return cTypeRefAssignment_1_0_1; }
		
		//[BaseAttribute]
		public CrossReference getTypeRefBaseAttributeCrossReference_1_0_1_0() { return cTypeRefBaseAttributeCrossReference_1_0_1_0; }
		
		//ID
		public RuleCall getTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1() { return cTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1; }
		
		//type=ID
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_1_0() { return cTypeIDTerminalRuleCall_1_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cAttributeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cAttributeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Attribute:
		//  {Attribute} "attribute";
		@Override public ParserRule getRule() { return rule; }
		
		//{Attribute} "attribute"
		public Group getGroup() { return cGroup; }
		
		//{Attribute}
		public Action getAttributeAction_0() { return cAttributeAction_0; }
		
		//"attribute"
		public Keyword getAttributeKeyword_1() { return cAttributeKeyword_1; }
	}
	public class MasterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.Master");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMasterAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMasterKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Master:
		//  {Master} "master";
		@Override public ParserRule getRule() { return rule; }
		
		//{Master} "master"
		public Group getGroup() { return cGroup; }
		
		//{Master}
		public Action getMasterAction_0() { return cMasterAction_0; }
		
		//"master"
		public Keyword getMasterKeyword_1() { return cMasterKeyword_1; }
	}
	public class ActionAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.ActionAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Action cAttributeAction_0_0_0 = (Action)cGroup_0_0.eContents().get(0);
		private final Keyword cAttributeKeyword_0_0_1 = (Keyword)cGroup_0_0.eContents().get(1);
		private final Group cGroup_0_1 = (Group)cAlternatives_0.eContents().get(1);
		private final Action cMasterAction_0_1_0 = (Action)cGroup_0_1.eContents().get(0);
		private final Keyword cMasterKeyword_0_1_1 = (Keyword)cGroup_0_1.eContents().get(1);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cRefKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cTypeRefAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final CrossReference cTypeRefBaseAttributeCrossReference_1_0_1_0 = (CrossReference)cTypeRefAssignment_1_0_1.eContents().get(0);
		private final RuleCall cTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1 = (RuleCall)cTypeRefBaseAttributeCrossReference_1_0_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ActionAttribute returns BaseAttribute:
		//  ({Attribute} "attribute"|{Master} "master") ("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//({Attribute} "attribute"|{Master} "master") ("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";"
		public Group getGroup() { return cGroup; }
		
		//({Attribute} "attribute"|{Master} "master")
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//{Attribute} "attribute"
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//{Attribute}
		public Action getAttributeAction_0_0_0() { return cAttributeAction_0_0_0; }
		
		//"attribute"
		public Keyword getAttributeKeyword_0_0_1() { return cAttributeKeyword_0_0_1; }
		
		//{Master} "master"
		public Group getGroup_0_1() { return cGroup_0_1; }
		
		//{Master}
		public Action getMasterAction_0_1_0() { return cMasterAction_0_1_0; }
		
		//"master"
		public Keyword getMasterKeyword_0_1_1() { return cMasterKeyword_0_1_1; }
		
		//("ref" typeRef=[BaseAttribute]|type=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"ref" typeRef=[BaseAttribute]
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"ref"
		public Keyword getRefKeyword_1_0_0() { return cRefKeyword_1_0_0; }
		
		//typeRef=[BaseAttribute]
		public Assignment getTypeRefAssignment_1_0_1() { return cTypeRefAssignment_1_0_1; }
		
		//[BaseAttribute]
		public CrossReference getTypeRefBaseAttributeCrossReference_1_0_1_0() { return cTypeRefBaseAttributeCrossReference_1_0_1_0; }
		
		//ID
		public RuleCall getTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1() { return cTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1; }
		
		//type=ID
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_1_0() { return cTypeIDTerminalRuleCall_1_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class SimpleAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.SimpleAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cAlternatives_0.eContents().get(0);
		private final Keyword cRefKeyword_0_0_0 = (Keyword)cGroup_0_0.eContents().get(0);
		private final Assignment cTypeRefAssignment_0_0_1 = (Assignment)cGroup_0_0.eContents().get(1);
		private final CrossReference cTypeRefBaseAttributeCrossReference_0_0_1_0 = (CrossReference)cTypeRefAssignment_0_0_1.eContents().get(0);
		private final RuleCall cTypeRefBaseAttributeIDTerminalRuleCall_0_0_1_0_1 = (RuleCall)cTypeRefBaseAttributeCrossReference_0_0_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_0_1_0 = (RuleCall)cTypeAssignment_0_1.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//SimpleAttribute returns Attribute:
		//  ("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";"
		public Group getGroup() { return cGroup; }
		
		//("ref" typeRef=[BaseAttribute]|type=ID)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//"ref" typeRef=[BaseAttribute]
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//"ref"
		public Keyword getRefKeyword_0_0_0() { return cRefKeyword_0_0_0; }
		
		//typeRef=[BaseAttribute]
		public Assignment getTypeRefAssignment_0_0_1() { return cTypeRefAssignment_0_0_1; }
		
		//[BaseAttribute]
		public CrossReference getTypeRefBaseAttributeCrossReference_0_0_1_0() { return cTypeRefBaseAttributeCrossReference_0_0_1_0; }
		
		//ID
		public RuleCall getTypeRefBaseAttributeIDTerminalRuleCall_0_0_1_0_1() { return cTypeRefBaseAttributeIDTerminalRuleCall_0_0_1_0_1; }
		
		//type=ID
		public Assignment getTypeAssignment_0_1() { return cTypeAssignment_0_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_0_1_0() { return cTypeIDTerminalRuleCall_0_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class RuleCallAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.RuleCallAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCallMeParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//RuleCallAttribute returns Attribute:
		//  CallMe name=ID ";";
		@Override public ParserRule getRule() { return rule; }
		
		//CallMe name=ID ";"
		public Group getGroup() { return cGroup; }
		
		//CallMe
		public RuleCall getCallMeParserRuleCall_0() { return cCallMeParserRuleCall_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class CallMeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.CallMe");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cRefKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cTypeRefAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final CrossReference cTypeRefBaseAttributeCrossReference_0_1_0 = (CrossReference)cTypeRefAssignment_0_1.eContents().get(0);
		private final RuleCall cTypeRefBaseAttributeIDTerminalRuleCall_0_1_0_1 = (RuleCall)cTypeRefBaseAttributeCrossReference_0_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_1_0 = (RuleCall)cTypeAssignment_1.eContents().get(0);
		
		//CallMe returns Attribute:
		//  ("ref" typeRef=[BaseAttribute]|type=ID);
		@Override public ParserRule getRule() { return rule; }
		
		//("ref" typeRef=[BaseAttribute]|type=ID)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"ref" typeRef=[BaseAttribute]
		public Group getGroup_0() { return cGroup_0; }
		
		//"ref"
		public Keyword getRefKeyword_0_0() { return cRefKeyword_0_0; }
		
		//typeRef=[BaseAttribute]
		public Assignment getTypeRefAssignment_0_1() { return cTypeRefAssignment_0_1; }
		
		//[BaseAttribute]
		public CrossReference getTypeRefBaseAttributeCrossReference_0_1_0() { return cTypeRefBaseAttributeCrossReference_0_1_0; }
		
		//ID
		public RuleCall getTypeRefBaseAttributeIDTerminalRuleCall_0_1_0_1() { return cTypeRefBaseAttributeIDTerminalRuleCall_0_1_0_1; }
		
		//type=ID
		public Assignment getTypeAssignment_1() { return cTypeAssignment_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_0() { return cTypeIDTerminalRuleCall_1_0; }
	}
	public class RuleCallAttribute2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.RuleCallAttribute2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCallMe2ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cRefKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cTypeRefAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final CrossReference cTypeRefBaseAttributeCrossReference_1_0_1_0 = (CrossReference)cTypeRefAssignment_1_0_1.eContents().get(0);
		private final RuleCall cTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1 = (RuleCall)cTypeRefBaseAttributeCrossReference_1_0_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//RuleCallAttribute2 returns Attribute:
		//  CallMe2 ("ref" typeRef=[BaseAttribute]|type=ID) ";";
		@Override public ParserRule getRule() { return rule; }
		
		//CallMe2 ("ref" typeRef=[BaseAttribute]|type=ID) ";"
		public Group getGroup() { return cGroup; }
		
		//CallMe2
		public RuleCall getCallMe2ParserRuleCall_0() { return cCallMe2ParserRuleCall_0; }
		
		//("ref" typeRef=[BaseAttribute]|type=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"ref" typeRef=[BaseAttribute]
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"ref"
		public Keyword getRefKeyword_1_0_0() { return cRefKeyword_1_0_0; }
		
		//typeRef=[BaseAttribute]
		public Assignment getTypeRefAssignment_1_0_1() { return cTypeRefAssignment_1_0_1; }
		
		//[BaseAttribute]
		public CrossReference getTypeRefBaseAttributeCrossReference_1_0_1_0() { return cTypeRefBaseAttributeCrossReference_1_0_1_0; }
		
		//ID
		public RuleCall getTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1() { return cTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1; }
		
		//type=ID
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_1_0() { return cTypeIDTerminalRuleCall_1_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class CallMe2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.CallMe2");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//CallMe2 returns Attribute:
		//  name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class RuleCallAttribute3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.RuleCallAttribute3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCallMe3ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cRefKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cTypeRefAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final CrossReference cTypeRefBaseAttributeCrossReference_1_0_1_0 = (CrossReference)cTypeRefAssignment_1_0_1.eContents().get(0);
		private final RuleCall cTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1 = (RuleCall)cTypeRefBaseAttributeCrossReference_1_0_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cTypeIDTerminalRuleCall_1_1_0 = (RuleCall)cTypeAssignment_1_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		
		//RuleCallAttribute3 returns Attribute:
		//  CallMe3 ("ref" typeRef=[BaseAttribute]|type=ID) ";";
		@Override public ParserRule getRule() { return rule; }
		
		//CallMe3 ("ref" typeRef=[BaseAttribute]|type=ID) ";"
		public Group getGroup() { return cGroup; }
		
		//CallMe3
		public RuleCall getCallMe3ParserRuleCall_0() { return cCallMe3ParserRuleCall_0; }
		
		//("ref" typeRef=[BaseAttribute]|type=ID)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//"ref" typeRef=[BaseAttribute]
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//"ref"
		public Keyword getRefKeyword_1_0_0() { return cRefKeyword_1_0_0; }
		
		//typeRef=[BaseAttribute]
		public Assignment getTypeRefAssignment_1_0_1() { return cTypeRefAssignment_1_0_1; }
		
		//[BaseAttribute]
		public CrossReference getTypeRefBaseAttributeCrossReference_1_0_1_0() { return cTypeRefBaseAttributeCrossReference_1_0_1_0; }
		
		//ID
		public RuleCall getTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1() { return cTypeRefBaseAttributeIDTerminalRuleCall_1_0_1_0_1; }
		
		//type=ID
		public Assignment getTypeAssignment_1_1() { return cTypeAssignment_1_1; }
		
		//ID
		public RuleCall getTypeIDTerminalRuleCall_1_1_0() { return cTypeIDTerminalRuleCall_1_1_0; }
		
		//";"
		public Keyword getSemicolonKeyword_2() { return cSemicolonKeyword_2; }
	}
	public class CallMe3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.CallMe3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCallKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cCallMe4ParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//CallMe3 returns Attribute:
		//  "call" "me" CallMe4;
		@Override public ParserRule getRule() { return rule; }
		
		//"call" "me" CallMe4
		public Group getGroup() { return cGroup; }
		
		//"call"
		public Keyword getCallKeyword_0() { return cCallKeyword_0; }
		
		//"me"
		public Keyword getMeKeyword_1() { return cMeKeyword_1; }
		
		//CallMe4
		public RuleCall getCallMe4ParserRuleCall_2() { return cCallMe4ParserRuleCall_2; }
	}
	public class CallMe4Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.linking.Bug287988TestLanguage.CallMe4");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//CallMe4 returns Attribute:
		//  name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final BaseAttributeElements pBaseAttribute;
	private final AttributeElements pAttribute;
	private final MasterElements pMaster;
	private final ActionAttributeElements pActionAttribute;
	private final SimpleAttributeElements pSimpleAttribute;
	private final RuleCallAttributeElements pRuleCallAttribute;
	private final CallMeElements pCallMe;
	private final RuleCallAttribute2Elements pRuleCallAttribute2;
	private final CallMe2Elements pCallMe2;
	private final RuleCallAttribute3Elements pRuleCallAttribute3;
	private final CallMe3Elements pCallMe3;
	private final CallMe4Elements pCallMe4;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug287988TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pBaseAttribute = new BaseAttributeElements();
		this.pAttribute = new AttributeElements();
		this.pMaster = new MasterElements();
		this.pActionAttribute = new ActionAttributeElements();
		this.pSimpleAttribute = new SimpleAttributeElements();
		this.pRuleCallAttribute = new RuleCallAttributeElements();
		this.pCallMe = new CallMeElements();
		this.pRuleCallAttribute2 = new RuleCallAttribute2Elements();
		this.pCallMe2 = new CallMe2Elements();
		this.pRuleCallAttribute3 = new RuleCallAttribute3Elements();
		this.pCallMe3 = new CallMe3Elements();
		this.pCallMe4 = new CallMe4Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.linking.Bug287988TestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	///* SuppressWarnings[noInstantiation] */
	//Model:
	//    ('actions' attributes+=BaseAttribute*)
	//  | ('simple' attributes+=SimpleAttribute*)
	//  | ('rulecall' attributes+=RuleCallAttribute*)
	//  | ('rulecall2' attributes+=RuleCallAttribute2*)
	//  | ('rulecall3' attributes+=RuleCallAttribute3*)
	//  | ('inlinedActions' attributes+=ActionAttribute*);
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//BaseAttribute:
	//  (Attribute|Master) ("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";";
	public BaseAttributeElements getBaseAttributeAccess() {
		return pBaseAttribute;
	}
	
	public ParserRule getBaseAttributeRule() {
		return getBaseAttributeAccess().getRule();
	}
	
	//Attribute:
	//  {Attribute} "attribute";
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//Master:
	//  {Master} "master";
	public MasterElements getMasterAccess() {
		return pMaster;
	}
	
	public ParserRule getMasterRule() {
		return getMasterAccess().getRule();
	}
	
	//ActionAttribute returns BaseAttribute:
	//  ({Attribute} "attribute"|{Master} "master") ("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";";
	public ActionAttributeElements getActionAttributeAccess() {
		return pActionAttribute;
	}
	
	public ParserRule getActionAttributeRule() {
		return getActionAttributeAccess().getRule();
	}
	
	//SimpleAttribute returns Attribute:
	//  ("ref" typeRef=[BaseAttribute]|type=ID) name=ID ";";
	public SimpleAttributeElements getSimpleAttributeAccess() {
		return pSimpleAttribute;
	}
	
	public ParserRule getSimpleAttributeRule() {
		return getSimpleAttributeAccess().getRule();
	}
	
	//RuleCallAttribute returns Attribute:
	//  CallMe name=ID ";";
	public RuleCallAttributeElements getRuleCallAttributeAccess() {
		return pRuleCallAttribute;
	}
	
	public ParserRule getRuleCallAttributeRule() {
		return getRuleCallAttributeAccess().getRule();
	}
	
	//CallMe returns Attribute:
	//  ("ref" typeRef=[BaseAttribute]|type=ID);
	public CallMeElements getCallMeAccess() {
		return pCallMe;
	}
	
	public ParserRule getCallMeRule() {
		return getCallMeAccess().getRule();
	}
	
	//RuleCallAttribute2 returns Attribute:
	//  CallMe2 ("ref" typeRef=[BaseAttribute]|type=ID) ";";
	public RuleCallAttribute2Elements getRuleCallAttribute2Access() {
		return pRuleCallAttribute2;
	}
	
	public ParserRule getRuleCallAttribute2Rule() {
		return getRuleCallAttribute2Access().getRule();
	}
	
	//CallMe2 returns Attribute:
	//  name=ID;
	public CallMe2Elements getCallMe2Access() {
		return pCallMe2;
	}
	
	public ParserRule getCallMe2Rule() {
		return getCallMe2Access().getRule();
	}
	
	//RuleCallAttribute3 returns Attribute:
	//  CallMe3 ("ref" typeRef=[BaseAttribute]|type=ID) ";";
	public RuleCallAttribute3Elements getRuleCallAttribute3Access() {
		return pRuleCallAttribute3;
	}
	
	public ParserRule getRuleCallAttribute3Rule() {
		return getRuleCallAttribute3Access().getRule();
	}
	
	//CallMe3 returns Attribute:
	//  "call" "me" CallMe4;
	public CallMe3Elements getCallMe3Access() {
		return pCallMe3;
	}
	
	public ParserRule getCallMe3Rule() {
		return getCallMe3Access().getRule();
	}
	
	//CallMe4 returns Attribute:
	//  name=ID;
	public CallMe4Elements getCallMe4Access() {
		return pCallMe4;
	}
	
	public ParserRule getCallMe4Rule() {
		return getCallMe4Access().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
