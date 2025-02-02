/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.metamodelreferencing.tests.services;

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
public class EcoreReferenceTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExtendsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExtendsExtendsNsURIEObjectParserRuleCall_0_0 = (RuleCall)cExtendsAssignment_0.eContents().get(0);
		private final Assignment cExtendsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cExtendsExtendsPluginEObjectParserRuleCall_1_0 = (RuleCall)cExtendsAssignment_1.eContents().get(0);
		private final Assignment cExtendsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExtendsExtendsResourceEObjectParserRuleCall_2_0 = (RuleCall)cExtendsAssignment_2.eContents().get(0);
		
		//Model:
		//    extends+=ExtendsNsURIEObject
		//    extends+=ExtendsPluginEObject
		//    extends+=ExtendsResourceEObject
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//extends+=ExtendsNsURIEObject
		//extends+=ExtendsPluginEObject
		//extends+=ExtendsResourceEObject
		public Group getGroup() { return cGroup; }
		
		//extends+=ExtendsNsURIEObject
		public Assignment getExtendsAssignment_0() { return cExtendsAssignment_0; }
		
		//ExtendsNsURIEObject
		public RuleCall getExtendsExtendsNsURIEObjectParserRuleCall_0_0() { return cExtendsExtendsNsURIEObjectParserRuleCall_0_0; }
		
		//extends+=ExtendsPluginEObject
		public Assignment getExtendsAssignment_1() { return cExtendsAssignment_1; }
		
		//ExtendsPluginEObject
		public RuleCall getExtendsExtendsPluginEObjectParserRuleCall_1_0() { return cExtendsExtendsPluginEObjectParserRuleCall_1_0; }
		
		//extends+=ExtendsResourceEObject
		public Assignment getExtendsAssignment_2() { return cExtendsAssignment_2; }
		
		//ExtendsResourceEObject
		public RuleCall getExtendsExtendsResourceEObjectParserRuleCall_2_0() { return cExtendsExtendsResourceEObjectParserRuleCall_2_0; }
	}
	public class ExtendsNsURIEObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsNsURIEObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExtendsNsURIEObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cEObjectKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final CrossReference cEObjectReference1EObjectCrossReference_2_0_1_0 = (CrossReference)cEObjectReference1Assignment_2_0_1.eContents().get(0);
		private final RuleCall cEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1 = (RuleCall)cEObjectReference1EObjectCrossReference_2_0_1_0.eContents().get(1);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cExtendsNsURIEObjectKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0 = (CrossReference)cEObjectReference1Assignment_2_1_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cAlternatives_2.eContents().get(2);
		private final Keyword cExtendsPluginEObjectKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0 = (CrossReference)cEObjectReference1Assignment_2_2_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0.eContents().get(1);
		private final Group cGroup_2_3 = (Group)cAlternatives_2.eContents().get(3);
		private final Keyword cExtendsResourceEObjectKeyword_2_3_0 = (Keyword)cGroup_2_3.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_3_1 = (Assignment)cGroup_2_3.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0 = (CrossReference)cEObjectReference1Assignment_2_3_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1 = (RuleCall)cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsPluginEObjectKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cEAttributeReferenceAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cEAttributeReferenceMyEAttributeCrossReference_3_1_0 = (CrossReference)cEAttributeReferenceAssignment_3_1.eContents().get(0);
		private final RuleCall cEAttributeReferenceMyEAttributeIDTerminalRuleCall_3_1_0_1 = (RuleCall)cEAttributeReferenceMyEAttributeCrossReference_3_1_0.eContents().get(1);
		private final Assignment cEObjectReference2Assignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cEObjectReference2ExtendsNsURIEObjectCrossReference_3_2_0 = (CrossReference)cEObjectReference2Assignment_3_2.eContents().get(0);
		private final RuleCall cEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_2_0_1 = (RuleCall)cEObjectReference2ExtendsNsURIEObjectCrossReference_3_2_0.eContents().get(1);
		private final Assignment cEObjectReference3Assignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final CrossReference cEObjectReference3ExtendsPluginEObjectCrossReference_3_3_0 = (CrossReference)cEObjectReference3Assignment_3_3.eContents().get(0);
		private final RuleCall cEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_3_0_1 = (RuleCall)cEObjectReference3ExtendsPluginEObjectCrossReference_3_3_0.eContents().get(1);
		private final Assignment cEObjectReference4Assignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final CrossReference cEObjectReference4ExtendsResourceEObjectCrossReference_3_4_0 = (CrossReference)cEObjectReference4Assignment_3_4.eContents().get(0);
		private final RuleCall cEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_4_0_1 = (RuleCall)cEObjectReference4ExtendsResourceEObjectCrossReference_3_4_0.eContents().get(1);
		private final Assignment cEObjectContainmentAssignment_3_5 = (Assignment)cGroup_3.eContents().get(5);
		private final RuleCall cEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_5_0 = (RuleCall)cEObjectContainmentAssignment_3_5.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_6 = (Assignment)cGroup_3.eContents().get(6);
		private final RuleCall cEObjectContainmentExtendsPluginEObjectParserRuleCall_3_6_0 = (RuleCall)cEObjectContainmentAssignment_3_6.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_7 = (Assignment)cGroup_3.eContents().get(7);
		private final RuleCall cEObjectContainmentExtendsResourceEObjectParserRuleCall_3_7_0 = (RuleCall)cEObjectContainmentAssignment_3_7.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_8 = (Assignment)cGroup_3.eContents().get(8);
		private final RuleCall cEObjectContainmentEObjectParserRuleCall_3_8_0 = (RuleCall)cEObjectContainmentAssignment_3_8.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_9 = (Assignment)cGroup_3.eContents().get(9);
		private final RuleCall cEObjectContainmentEAttributeParserRuleCall_3_9_0 = (RuleCall)cEObjectContainmentAssignment_3_9.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_10 = (Assignment)cGroup_3.eContents().get(10);
		private final RuleCall cEObjectContainmentMyEAttributeParserRuleCall_3_10_0 = (RuleCall)cEObjectContainmentAssignment_3_10.eContents().get(0);
		
		//ExtendsNsURIEObject:
		//    'ExtendsNsURIEObject' name=ValidID
		//    (
		//      'EObject' eObjectReference1=[EObject]
		//    | 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//    | 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//    | 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//    )
		//    (
		//        'ExtendsPluginEObject'
		//        eAttributeReference=[MyEAttribute]
		//        eObjectReference2=[ExtendsNsURIEObject]
		//        eObjectReference3=[ExtendsPluginEObject]
		//        eObjectReference4=[ExtendsResourceEObject]
		//        eObjectContainment+=ExtendsNsURIEObject?
		//        eObjectContainment+=ExtendsPluginEObject?
		//        eObjectContainment+=ExtendsResourceEObject?
		//        eObjectContainment+=EObject
		//        eObjectContainment+=EAttribute
		//        eObjectContainment+=MyEAttribute
		//    )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'ExtendsNsURIEObject' name=ValidID
		//(
		//  'EObject' eObjectReference1=[EObject]
		//| 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//| 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//| 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//)
		//(
		//    'ExtendsPluginEObject'
		//    eAttributeReference=[MyEAttribute]
		//    eObjectReference2=[ExtendsNsURIEObject]
		//    eObjectReference3=[ExtendsPluginEObject]
		//    eObjectReference4=[ExtendsResourceEObject]
		//    eObjectContainment+=ExtendsNsURIEObject?
		//    eObjectContainment+=ExtendsPluginEObject?
		//    eObjectContainment+=ExtendsResourceEObject?
		//    eObjectContainment+=EObject
		//    eObjectContainment+=EAttribute
		//    eObjectContainment+=MyEAttribute
		//)?
		public Group getGroup() { return cGroup; }
		
		//'ExtendsNsURIEObject'
		public Keyword getExtendsNsURIEObjectKeyword_0() { return cExtendsNsURIEObjectKeyword_0; }
		
		//name=ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }
		
		//(
		//  'EObject' eObjectReference1=[EObject]
		//| 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//| 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//| 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//'EObject' eObjectReference1=[EObject]
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'EObject'
		public Keyword getEObjectKeyword_2_0_0() { return cEObjectKeyword_2_0_0; }
		
		//eObjectReference1=[EObject]
		public Assignment getEObjectReference1Assignment_2_0_1() { return cEObjectReference1Assignment_2_0_1; }
		
		//[EObject]
		public CrossReference getEObjectReference1EObjectCrossReference_2_0_1_0() { return cEObjectReference1EObjectCrossReference_2_0_1_0; }
		
		//ID
		public RuleCall getEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1() { return cEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1; }
		
		//'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'ExtendsNsURIEObject'
		public Keyword getExtendsNsURIEObjectKeyword_2_1_0() { return cExtendsNsURIEObjectKeyword_2_1_0; }
		
		//eObjectReference1=[ExtendsNsURIEObject]
		public Assignment getEObjectReference1Assignment_2_1_1() { return cEObjectReference1Assignment_2_1_1; }
		
		//[ExtendsNsURIEObject]
		public CrossReference getEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0() { return cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1() { return cEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1; }
		
		//'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//'ExtendsPluginEObject'
		public Keyword getExtendsPluginEObjectKeyword_2_2_0() { return cExtendsPluginEObjectKeyword_2_2_0; }
		
		//eObjectReference1=[ExtendsPluginEObject]
		public Assignment getEObjectReference1Assignment_2_2_1() { return cEObjectReference1Assignment_2_2_1; }
		
		//[ExtendsPluginEObject]
		public CrossReference getEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0() { return cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1() { return cEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1; }
		
		//'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//'ExtendsResourceEObject'
		public Keyword getExtendsResourceEObjectKeyword_2_3_0() { return cExtendsResourceEObjectKeyword_2_3_0; }
		
		//eObjectReference1=[ExtendsResourceEObject]
		public Assignment getEObjectReference1Assignment_2_3_1() { return cEObjectReference1Assignment_2_3_1; }
		
		//[ExtendsResourceEObject]
		public CrossReference getEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0() { return cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1() { return cEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1; }
		
		//(
		//    'ExtendsPluginEObject'
		//    eAttributeReference=[MyEAttribute]
		//    eObjectReference2=[ExtendsNsURIEObject]
		//    eObjectReference3=[ExtendsPluginEObject]
		//    eObjectReference4=[ExtendsResourceEObject]
		//    eObjectContainment+=ExtendsNsURIEObject?
		//    eObjectContainment+=ExtendsPluginEObject?
		//    eObjectContainment+=ExtendsResourceEObject?
		//    eObjectContainment+=EObject
		//    eObjectContainment+=EAttribute
		//    eObjectContainment+=MyEAttribute
		//)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'ExtendsPluginEObject'
		public Keyword getExtendsPluginEObjectKeyword_3_0() { return cExtendsPluginEObjectKeyword_3_0; }
		
		//eAttributeReference=[MyEAttribute]
		public Assignment getEAttributeReferenceAssignment_3_1() { return cEAttributeReferenceAssignment_3_1; }
		
		//[MyEAttribute]
		public CrossReference getEAttributeReferenceMyEAttributeCrossReference_3_1_0() { return cEAttributeReferenceMyEAttributeCrossReference_3_1_0; }
		
		//ID
		public RuleCall getEAttributeReferenceMyEAttributeIDTerminalRuleCall_3_1_0_1() { return cEAttributeReferenceMyEAttributeIDTerminalRuleCall_3_1_0_1; }
		
		//eObjectReference2=[ExtendsNsURIEObject]
		public Assignment getEObjectReference2Assignment_3_2() { return cEObjectReference2Assignment_3_2; }
		
		//[ExtendsNsURIEObject]
		public CrossReference getEObjectReference2ExtendsNsURIEObjectCrossReference_3_2_0() { return cEObjectReference2ExtendsNsURIEObjectCrossReference_3_2_0; }
		
		//ID
		public RuleCall getEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_2_0_1() { return cEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_2_0_1; }
		
		//eObjectReference3=[ExtendsPluginEObject]
		public Assignment getEObjectReference3Assignment_3_3() { return cEObjectReference3Assignment_3_3; }
		
		//[ExtendsPluginEObject]
		public CrossReference getEObjectReference3ExtendsPluginEObjectCrossReference_3_3_0() { return cEObjectReference3ExtendsPluginEObjectCrossReference_3_3_0; }
		
		//ID
		public RuleCall getEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_3_0_1() { return cEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_3_0_1; }
		
		//eObjectReference4=[ExtendsResourceEObject]
		public Assignment getEObjectReference4Assignment_3_4() { return cEObjectReference4Assignment_3_4; }
		
		//[ExtendsResourceEObject]
		public CrossReference getEObjectReference4ExtendsResourceEObjectCrossReference_3_4_0() { return cEObjectReference4ExtendsResourceEObjectCrossReference_3_4_0; }
		
		//ID
		public RuleCall getEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_4_0_1() { return cEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_4_0_1; }
		
		//eObjectContainment+=ExtendsNsURIEObject?
		public Assignment getEObjectContainmentAssignment_3_5() { return cEObjectContainmentAssignment_3_5; }
		
		//ExtendsNsURIEObject
		public RuleCall getEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_5_0() { return cEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_5_0; }
		
		//eObjectContainment+=ExtendsPluginEObject?
		public Assignment getEObjectContainmentAssignment_3_6() { return cEObjectContainmentAssignment_3_6; }
		
		//ExtendsPluginEObject
		public RuleCall getEObjectContainmentExtendsPluginEObjectParserRuleCall_3_6_0() { return cEObjectContainmentExtendsPluginEObjectParserRuleCall_3_6_0; }
		
		//eObjectContainment+=ExtendsResourceEObject?
		public Assignment getEObjectContainmentAssignment_3_7() { return cEObjectContainmentAssignment_3_7; }
		
		//ExtendsResourceEObject
		public RuleCall getEObjectContainmentExtendsResourceEObjectParserRuleCall_3_7_0() { return cEObjectContainmentExtendsResourceEObjectParserRuleCall_3_7_0; }
		
		//eObjectContainment+=EObject
		public Assignment getEObjectContainmentAssignment_3_8() { return cEObjectContainmentAssignment_3_8; }
		
		//EObject
		public RuleCall getEObjectContainmentEObjectParserRuleCall_3_8_0() { return cEObjectContainmentEObjectParserRuleCall_3_8_0; }
		
		//eObjectContainment+=EAttribute
		public Assignment getEObjectContainmentAssignment_3_9() { return cEObjectContainmentAssignment_3_9; }
		
		//EAttribute
		public RuleCall getEObjectContainmentEAttributeParserRuleCall_3_9_0() { return cEObjectContainmentEAttributeParserRuleCall_3_9_0; }
		
		//eObjectContainment+=MyEAttribute
		public Assignment getEObjectContainmentAssignment_3_10() { return cEObjectContainmentAssignment_3_10; }
		
		//MyEAttribute
		public RuleCall getEObjectContainmentMyEAttributeParserRuleCall_3_10_0() { return cEObjectContainmentMyEAttributeParserRuleCall_3_10_0; }
	}
	public class MyEAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.MyEAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMyEAttributeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cMyEAttributeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//MyEAttribute:
		//    {MyEAttribute} 'MyEAttribute'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MyEAttribute} 'MyEAttribute'
		public Group getGroup() { return cGroup; }
		
		//{MyEAttribute}
		public Action getMyEAttributeAction_0() { return cMyEAttributeAction_0; }
		
		//'MyEAttribute'
		public Keyword getMyEAttributeKeyword_1() { return cMyEAttributeKeyword_1; }
	}
	public class EAttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.EAttribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEAttributeAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEAttributeKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//EAttribute:
		//    {EAttribute} 'EAttribute'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{EAttribute} 'EAttribute'
		public Group getGroup() { return cGroup; }
		
		//{EAttribute}
		public Action getEAttributeAction_0() { return cEAttributeAction_0; }
		
		//'EAttribute'
		public Keyword getEAttributeKeyword_1() { return cEAttributeKeyword_1; }
	}
	public class ExtendsPluginEObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsPluginEObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExtendsPluginEObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cEObjectKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final CrossReference cEObjectReference1EObjectCrossReference_2_0_1_0 = (CrossReference)cEObjectReference1Assignment_2_0_1.eContents().get(0);
		private final RuleCall cEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1 = (RuleCall)cEObjectReference1EObjectCrossReference_2_0_1_0.eContents().get(1);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cExtendsNsURIEObjectKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0 = (CrossReference)cEObjectReference1Assignment_2_1_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cAlternatives_2.eContents().get(2);
		private final Keyword cExtendsPluginEObjectKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0 = (CrossReference)cEObjectReference1Assignment_2_2_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0.eContents().get(1);
		private final Group cGroup_2_3 = (Group)cAlternatives_2.eContents().get(3);
		private final Keyword cExtendsResourceEObjectKeyword_2_3_0 = (Keyword)cGroup_2_3.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_3_1 = (Assignment)cGroup_2_3.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0 = (CrossReference)cEObjectReference1Assignment_2_3_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1 = (RuleCall)cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsPluginEObjectKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cEObjectReference2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0 = (CrossReference)cEObjectReference2Assignment_3_1.eContents().get(0);
		private final RuleCall cEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_1_0_1 = (RuleCall)cEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0.eContents().get(1);
		private final Assignment cEObjectReference3Assignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0 = (CrossReference)cEObjectReference3Assignment_3_2.eContents().get(0);
		private final RuleCall cEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_2_0_1 = (RuleCall)cEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0.eContents().get(1);
		private final Assignment cEObjectReference4Assignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final CrossReference cEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0 = (CrossReference)cEObjectReference4Assignment_3_3.eContents().get(0);
		private final RuleCall cEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_3_0_1 = (RuleCall)cEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0.eContents().get(1);
		private final Assignment cEObjectContainmentAssignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final RuleCall cEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_4_0 = (RuleCall)cEObjectContainmentAssignment_3_4.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_5 = (Assignment)cGroup_3.eContents().get(5);
		private final RuleCall cEObjectContainmentExtendsPluginEObjectParserRuleCall_3_5_0 = (RuleCall)cEObjectContainmentAssignment_3_5.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_6 = (Assignment)cGroup_3.eContents().get(6);
		private final RuleCall cEObjectContainmentExtendsResourceEObjectParserRuleCall_3_6_0 = (RuleCall)cEObjectContainmentAssignment_3_6.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_7 = (Assignment)cGroup_3.eContents().get(7);
		private final RuleCall cEObjectContainmentEObjectParserRuleCall_3_7_0 = (RuleCall)cEObjectContainmentAssignment_3_7.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_8 = (Assignment)cGroup_3.eContents().get(8);
		private final RuleCall cEObjectContainmentEAttributeParserRuleCall_3_8_0 = (RuleCall)cEObjectContainmentAssignment_3_8.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_9 = (Assignment)cGroup_3.eContents().get(9);
		private final RuleCall cEObjectContainmentMyEAttributeParserRuleCall_3_9_0 = (RuleCall)cEObjectContainmentAssignment_3_9.eContents().get(0);
		
		//ExtendsPluginEObject:
		//    'ExtendsPluginEObject' name=ValidID
		//    (
		//      'EObject' eObjectReference1=[EObject]
		//    | 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//    | 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//    | 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//    )
		//    (
		//        'ExtendsPluginEObject'
		//        eObjectReference2=[ExtendsNsURIEObject]
		//        eObjectReference3=[ExtendsPluginEObject]
		//        eObjectReference4=[ExtendsResourceEObject]
		//        eObjectContainment+=ExtendsNsURIEObject?
		//        eObjectContainment+=ExtendsPluginEObject?
		//        eObjectContainment+=ExtendsResourceEObject?
		//        eObjectContainment+=EObject
		//        eObjectContainment+=EAttribute
		//        eObjectContainment+=MyEAttribute
		//    )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'ExtendsPluginEObject' name=ValidID
		//(
		//  'EObject' eObjectReference1=[EObject]
		//| 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//| 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//| 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//)
		//(
		//    'ExtendsPluginEObject'
		//    eObjectReference2=[ExtendsNsURIEObject]
		//    eObjectReference3=[ExtendsPluginEObject]
		//    eObjectReference4=[ExtendsResourceEObject]
		//    eObjectContainment+=ExtendsNsURIEObject?
		//    eObjectContainment+=ExtendsPluginEObject?
		//    eObjectContainment+=ExtendsResourceEObject?
		//    eObjectContainment+=EObject
		//    eObjectContainment+=EAttribute
		//    eObjectContainment+=MyEAttribute
		//)?
		public Group getGroup() { return cGroup; }
		
		//'ExtendsPluginEObject'
		public Keyword getExtendsPluginEObjectKeyword_0() { return cExtendsPluginEObjectKeyword_0; }
		
		//name=ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }
		
		//(
		//  'EObject' eObjectReference1=[EObject]
		//| 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//| 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//| 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//'EObject' eObjectReference1=[EObject]
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'EObject'
		public Keyword getEObjectKeyword_2_0_0() { return cEObjectKeyword_2_0_0; }
		
		//eObjectReference1=[EObject]
		public Assignment getEObjectReference1Assignment_2_0_1() { return cEObjectReference1Assignment_2_0_1; }
		
		//[EObject]
		public CrossReference getEObjectReference1EObjectCrossReference_2_0_1_0() { return cEObjectReference1EObjectCrossReference_2_0_1_0; }
		
		//ID
		public RuleCall getEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1() { return cEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1; }
		
		//'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'ExtendsNsURIEObject'
		public Keyword getExtendsNsURIEObjectKeyword_2_1_0() { return cExtendsNsURIEObjectKeyword_2_1_0; }
		
		//eObjectReference1=[ExtendsNsURIEObject]
		public Assignment getEObjectReference1Assignment_2_1_1() { return cEObjectReference1Assignment_2_1_1; }
		
		//[ExtendsNsURIEObject]
		public CrossReference getEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0() { return cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1() { return cEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1; }
		
		//'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//'ExtendsPluginEObject'
		public Keyword getExtendsPluginEObjectKeyword_2_2_0() { return cExtendsPluginEObjectKeyword_2_2_0; }
		
		//eObjectReference1=[ExtendsPluginEObject]
		public Assignment getEObjectReference1Assignment_2_2_1() { return cEObjectReference1Assignment_2_2_1; }
		
		//[ExtendsPluginEObject]
		public CrossReference getEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0() { return cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1() { return cEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1; }
		
		//'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//'ExtendsResourceEObject'
		public Keyword getExtendsResourceEObjectKeyword_2_3_0() { return cExtendsResourceEObjectKeyword_2_3_0; }
		
		//eObjectReference1=[ExtendsResourceEObject]
		public Assignment getEObjectReference1Assignment_2_3_1() { return cEObjectReference1Assignment_2_3_1; }
		
		//[ExtendsResourceEObject]
		public CrossReference getEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0() { return cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1() { return cEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1; }
		
		//(
		//    'ExtendsPluginEObject'
		//    eObjectReference2=[ExtendsNsURIEObject]
		//    eObjectReference3=[ExtendsPluginEObject]
		//    eObjectReference4=[ExtendsResourceEObject]
		//    eObjectContainment+=ExtendsNsURIEObject?
		//    eObjectContainment+=ExtendsPluginEObject?
		//    eObjectContainment+=ExtendsResourceEObject?
		//    eObjectContainment+=EObject
		//    eObjectContainment+=EAttribute
		//    eObjectContainment+=MyEAttribute
		//)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'ExtendsPluginEObject'
		public Keyword getExtendsPluginEObjectKeyword_3_0() { return cExtendsPluginEObjectKeyword_3_0; }
		
		//eObjectReference2=[ExtendsNsURIEObject]
		public Assignment getEObjectReference2Assignment_3_1() { return cEObjectReference2Assignment_3_1; }
		
		//[ExtendsNsURIEObject]
		public CrossReference getEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0() { return cEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0; }
		
		//ID
		public RuleCall getEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_1_0_1() { return cEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_1_0_1; }
		
		//eObjectReference3=[ExtendsPluginEObject]
		public Assignment getEObjectReference3Assignment_3_2() { return cEObjectReference3Assignment_3_2; }
		
		//[ExtendsPluginEObject]
		public CrossReference getEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0() { return cEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0; }
		
		//ID
		public RuleCall getEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_2_0_1() { return cEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_2_0_1; }
		
		//eObjectReference4=[ExtendsResourceEObject]
		public Assignment getEObjectReference4Assignment_3_3() { return cEObjectReference4Assignment_3_3; }
		
		//[ExtendsResourceEObject]
		public CrossReference getEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0() { return cEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0; }
		
		//ID
		public RuleCall getEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_3_0_1() { return cEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_3_0_1; }
		
		//eObjectContainment+=ExtendsNsURIEObject?
		public Assignment getEObjectContainmentAssignment_3_4() { return cEObjectContainmentAssignment_3_4; }
		
		//ExtendsNsURIEObject
		public RuleCall getEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_4_0() { return cEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_4_0; }
		
		//eObjectContainment+=ExtendsPluginEObject?
		public Assignment getEObjectContainmentAssignment_3_5() { return cEObjectContainmentAssignment_3_5; }
		
		//ExtendsPluginEObject
		public RuleCall getEObjectContainmentExtendsPluginEObjectParserRuleCall_3_5_0() { return cEObjectContainmentExtendsPluginEObjectParserRuleCall_3_5_0; }
		
		//eObjectContainment+=ExtendsResourceEObject?
		public Assignment getEObjectContainmentAssignment_3_6() { return cEObjectContainmentAssignment_3_6; }
		
		//ExtendsResourceEObject
		public RuleCall getEObjectContainmentExtendsResourceEObjectParserRuleCall_3_6_0() { return cEObjectContainmentExtendsResourceEObjectParserRuleCall_3_6_0; }
		
		//eObjectContainment+=EObject
		public Assignment getEObjectContainmentAssignment_3_7() { return cEObjectContainmentAssignment_3_7; }
		
		//EObject
		public RuleCall getEObjectContainmentEObjectParserRuleCall_3_7_0() { return cEObjectContainmentEObjectParserRuleCall_3_7_0; }
		
		//eObjectContainment+=EAttribute
		public Assignment getEObjectContainmentAssignment_3_8() { return cEObjectContainmentAssignment_3_8; }
		
		//EAttribute
		public RuleCall getEObjectContainmentEAttributeParserRuleCall_3_8_0() { return cEObjectContainmentEAttributeParserRuleCall_3_8_0; }
		
		//eObjectContainment+=MyEAttribute
		public Assignment getEObjectContainmentAssignment_3_9() { return cEObjectContainmentAssignment_3_9; }
		
		//MyEAttribute
		public RuleCall getEObjectContainmentMyEAttributeParserRuleCall_3_9_0() { return cEObjectContainmentMyEAttributeParserRuleCall_3_9_0; }
	}
	public class Unused_01Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.Unused_01");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMyNamedElement_01Action_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Unused_01 returns ExtendsNsURIEObject:
		//    {MyNamedElement_01} name = ValidID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MyNamedElement_01} name = ValidID
		public Group getGroup() { return cGroup; }
		
		//{MyNamedElement_01}
		public Action getMyNamedElement_01Action_0() { return cMyNamedElement_01Action_0; }
		
		//name = ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }
	}
	public class Unused_02Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.Unused_02");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMyNamedElement_02Action_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Unused_02 returns ExtendsResourceEObject:
		//    {MyNamedElement_02} name = ValidID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MyNamedElement_02} name = ValidID
		public Group getGroup() { return cGroup; }
		
		//{MyNamedElement_02}
		public Action getMyNamedElement_02Action_0() { return cMyNamedElement_02Action_0; }
		
		//name = ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }
	}
	public class Unused_03Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.Unused_03");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cMyNamedElement_03Action_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Unused_03 returns ExtendsPluginEObject:
		//    {MyNamedElement_03} name = ValidID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{MyNamedElement_03} name = ValidID
		public Group getGroup() { return cGroup; }
		
		//{MyNamedElement_03}
		public Action getMyNamedElement_03Action_0() { return cMyNamedElement_03Action_0; }
		
		//name = ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }
	}
	public class ExtendsResourceEObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ExtendsResourceEObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExtendsResourceEObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameValidIDParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Group cGroup_2_0 = (Group)cAlternatives_2.eContents().get(0);
		private final Keyword cEObjectKeyword_2_0_0 = (Keyword)cGroup_2_0.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_0_1 = (Assignment)cGroup_2_0.eContents().get(1);
		private final CrossReference cEObjectReference1EObjectCrossReference_2_0_1_0 = (CrossReference)cEObjectReference1Assignment_2_0_1.eContents().get(0);
		private final RuleCall cEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1 = (RuleCall)cEObjectReference1EObjectCrossReference_2_0_1_0.eContents().get(1);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final Keyword cExtendsNsURIEObjectKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0 = (CrossReference)cEObjectReference1Assignment_2_1_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1 = (RuleCall)cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cAlternatives_2.eContents().get(2);
		private final Keyword cExtendsPluginEObjectKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0 = (CrossReference)cEObjectReference1Assignment_2_2_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1 = (RuleCall)cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0.eContents().get(1);
		private final Group cGroup_2_3 = (Group)cAlternatives_2.eContents().get(3);
		private final Keyword cExtendsResourceEObjectKeyword_2_3_0 = (Keyword)cGroup_2_3.eContents().get(0);
		private final Assignment cEObjectReference1Assignment_2_3_1 = (Assignment)cGroup_2_3.eContents().get(1);
		private final CrossReference cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0 = (CrossReference)cEObjectReference1Assignment_2_3_1.eContents().get(0);
		private final RuleCall cEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1 = (RuleCall)cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cExtendsResourceEObjectKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cEObjectReference2Assignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0 = (CrossReference)cEObjectReference2Assignment_3_1.eContents().get(0);
		private final RuleCall cEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_1_0_1 = (RuleCall)cEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0.eContents().get(1);
		private final Assignment cEObjectReference3Assignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0 = (CrossReference)cEObjectReference3Assignment_3_2.eContents().get(0);
		private final RuleCall cEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_2_0_1 = (RuleCall)cEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0.eContents().get(1);
		private final Assignment cEObjectReference4Assignment_3_3 = (Assignment)cGroup_3.eContents().get(3);
		private final CrossReference cEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0 = (CrossReference)cEObjectReference4Assignment_3_3.eContents().get(0);
		private final RuleCall cEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_3_0_1 = (RuleCall)cEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0.eContents().get(1);
		private final Assignment cEObjectContainmentAssignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final RuleCall cEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_4_0 = (RuleCall)cEObjectContainmentAssignment_3_4.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_5 = (Assignment)cGroup_3.eContents().get(5);
		private final RuleCall cEObjectContainmentExtendsPluginEObjectParserRuleCall_3_5_0 = (RuleCall)cEObjectContainmentAssignment_3_5.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_6 = (Assignment)cGroup_3.eContents().get(6);
		private final RuleCall cEObjectContainmentExtendsResourceEObjectParserRuleCall_3_6_0 = (RuleCall)cEObjectContainmentAssignment_3_6.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_7 = (Assignment)cGroup_3.eContents().get(7);
		private final RuleCall cEObjectContainmentEObjectParserRuleCall_3_7_0 = (RuleCall)cEObjectContainmentAssignment_3_7.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_8 = (Assignment)cGroup_3.eContents().get(8);
		private final RuleCall cEObjectContainmentEAttributeParserRuleCall_3_8_0 = (RuleCall)cEObjectContainmentAssignment_3_8.eContents().get(0);
		private final Assignment cEObjectContainmentAssignment_3_9 = (Assignment)cGroup_3.eContents().get(9);
		private final RuleCall cEObjectContainmentMyEAttributeParserRuleCall_3_9_0 = (RuleCall)cEObjectContainmentAssignment_3_9.eContents().get(0);
		
		//ExtendsResourceEObject:
		//    'ExtendsResourceEObject' name=ValidID
		//    (
		//      'EObject' eObjectReference1=[EObject]
		//    | 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//    | 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//    | 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//    )
		//    (
		//        'ExtendsResourceEObject'
		//        eObjectReference2=[ExtendsNsURIEObject]
		//        eObjectReference3=[ExtendsPluginEObject]
		//        eObjectReference4=[ExtendsResourceEObject]
		//        eObjectContainment+=ExtendsNsURIEObject
		//        eObjectContainment+=ExtendsPluginEObject
		//        eObjectContainment+=ExtendsResourceEObject
		//        eObjectContainment+=EObject
		//        eObjectContainment+=EAttribute
		//        eObjectContainment+=MyEAttribute
		//    )?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'ExtendsResourceEObject' name=ValidID
		//(
		//  'EObject' eObjectReference1=[EObject]
		//| 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//| 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//| 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//)
		//(
		//    'ExtendsResourceEObject'
		//    eObjectReference2=[ExtendsNsURIEObject]
		//    eObjectReference3=[ExtendsPluginEObject]
		//    eObjectReference4=[ExtendsResourceEObject]
		//    eObjectContainment+=ExtendsNsURIEObject
		//    eObjectContainment+=ExtendsPluginEObject
		//    eObjectContainment+=ExtendsResourceEObject
		//    eObjectContainment+=EObject
		//    eObjectContainment+=EAttribute
		//    eObjectContainment+=MyEAttribute
		//)?
		public Group getGroup() { return cGroup; }
		
		//'ExtendsResourceEObject'
		public Keyword getExtendsResourceEObjectKeyword_0() { return cExtendsResourceEObjectKeyword_0; }
		
		//name=ValidID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ValidID
		public RuleCall getNameValidIDParserRuleCall_1_0() { return cNameValidIDParserRuleCall_1_0; }
		
		//(
		//  'EObject' eObjectReference1=[EObject]
		//| 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		//| 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		//| 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		//)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//'EObject' eObjectReference1=[EObject]
		public Group getGroup_2_0() { return cGroup_2_0; }
		
		//'EObject'
		public Keyword getEObjectKeyword_2_0_0() { return cEObjectKeyword_2_0_0; }
		
		//eObjectReference1=[EObject]
		public Assignment getEObjectReference1Assignment_2_0_1() { return cEObjectReference1Assignment_2_0_1; }
		
		//[EObject]
		public CrossReference getEObjectReference1EObjectCrossReference_2_0_1_0() { return cEObjectReference1EObjectCrossReference_2_0_1_0; }
		
		//ID
		public RuleCall getEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1() { return cEObjectReference1EObjectIDTerminalRuleCall_2_0_1_0_1; }
		
		//'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//'ExtendsNsURIEObject'
		public Keyword getExtendsNsURIEObjectKeyword_2_1_0() { return cExtendsNsURIEObjectKeyword_2_1_0; }
		
		//eObjectReference1=[ExtendsNsURIEObject]
		public Assignment getEObjectReference1Assignment_2_1_1() { return cEObjectReference1Assignment_2_1_1; }
		
		//[ExtendsNsURIEObject]
		public CrossReference getEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0() { return cEObjectReference1ExtendsNsURIEObjectCrossReference_2_1_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1() { return cEObjectReference1ExtendsNsURIEObjectIDTerminalRuleCall_2_1_1_0_1; }
		
		//'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//'ExtendsPluginEObject'
		public Keyword getExtendsPluginEObjectKeyword_2_2_0() { return cExtendsPluginEObjectKeyword_2_2_0; }
		
		//eObjectReference1=[ExtendsPluginEObject]
		public Assignment getEObjectReference1Assignment_2_2_1() { return cEObjectReference1Assignment_2_2_1; }
		
		//[ExtendsPluginEObject]
		public CrossReference getEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0() { return cEObjectReference1ExtendsPluginEObjectCrossReference_2_2_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1() { return cEObjectReference1ExtendsPluginEObjectIDTerminalRuleCall_2_2_1_0_1; }
		
		//'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
		public Group getGroup_2_3() { return cGroup_2_3; }
		
		//'ExtendsResourceEObject'
		public Keyword getExtendsResourceEObjectKeyword_2_3_0() { return cExtendsResourceEObjectKeyword_2_3_0; }
		
		//eObjectReference1=[ExtendsResourceEObject]
		public Assignment getEObjectReference1Assignment_2_3_1() { return cEObjectReference1Assignment_2_3_1; }
		
		//[ExtendsResourceEObject]
		public CrossReference getEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0() { return cEObjectReference1ExtendsResourceEObjectCrossReference_2_3_1_0; }
		
		//ID
		public RuleCall getEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1() { return cEObjectReference1ExtendsResourceEObjectIDTerminalRuleCall_2_3_1_0_1; }
		
		//(
		//    'ExtendsResourceEObject'
		//    eObjectReference2=[ExtendsNsURIEObject]
		//    eObjectReference3=[ExtendsPluginEObject]
		//    eObjectReference4=[ExtendsResourceEObject]
		//    eObjectContainment+=ExtendsNsURIEObject
		//    eObjectContainment+=ExtendsPluginEObject
		//    eObjectContainment+=ExtendsResourceEObject
		//    eObjectContainment+=EObject
		//    eObjectContainment+=EAttribute
		//    eObjectContainment+=MyEAttribute
		//)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'ExtendsResourceEObject'
		public Keyword getExtendsResourceEObjectKeyword_3_0() { return cExtendsResourceEObjectKeyword_3_0; }
		
		//eObjectReference2=[ExtendsNsURIEObject]
		public Assignment getEObjectReference2Assignment_3_1() { return cEObjectReference2Assignment_3_1; }
		
		//[ExtendsNsURIEObject]
		public CrossReference getEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0() { return cEObjectReference2ExtendsNsURIEObjectCrossReference_3_1_0; }
		
		//ID
		public RuleCall getEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_1_0_1() { return cEObjectReference2ExtendsNsURIEObjectIDTerminalRuleCall_3_1_0_1; }
		
		//eObjectReference3=[ExtendsPluginEObject]
		public Assignment getEObjectReference3Assignment_3_2() { return cEObjectReference3Assignment_3_2; }
		
		//[ExtendsPluginEObject]
		public CrossReference getEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0() { return cEObjectReference3ExtendsPluginEObjectCrossReference_3_2_0; }
		
		//ID
		public RuleCall getEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_2_0_1() { return cEObjectReference3ExtendsPluginEObjectIDTerminalRuleCall_3_2_0_1; }
		
		//eObjectReference4=[ExtendsResourceEObject]
		public Assignment getEObjectReference4Assignment_3_3() { return cEObjectReference4Assignment_3_3; }
		
		//[ExtendsResourceEObject]
		public CrossReference getEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0() { return cEObjectReference4ExtendsResourceEObjectCrossReference_3_3_0; }
		
		//ID
		public RuleCall getEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_3_0_1() { return cEObjectReference4ExtendsResourceEObjectIDTerminalRuleCall_3_3_0_1; }
		
		//eObjectContainment+=ExtendsNsURIEObject
		public Assignment getEObjectContainmentAssignment_3_4() { return cEObjectContainmentAssignment_3_4; }
		
		//ExtendsNsURIEObject
		public RuleCall getEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_4_0() { return cEObjectContainmentExtendsNsURIEObjectParserRuleCall_3_4_0; }
		
		//eObjectContainment+=ExtendsPluginEObject
		public Assignment getEObjectContainmentAssignment_3_5() { return cEObjectContainmentAssignment_3_5; }
		
		//ExtendsPluginEObject
		public RuleCall getEObjectContainmentExtendsPluginEObjectParserRuleCall_3_5_0() { return cEObjectContainmentExtendsPluginEObjectParserRuleCall_3_5_0; }
		
		//eObjectContainment+=ExtendsResourceEObject
		public Assignment getEObjectContainmentAssignment_3_6() { return cEObjectContainmentAssignment_3_6; }
		
		//ExtendsResourceEObject
		public RuleCall getEObjectContainmentExtendsResourceEObjectParserRuleCall_3_6_0() { return cEObjectContainmentExtendsResourceEObjectParserRuleCall_3_6_0; }
		
		//eObjectContainment+=EObject
		public Assignment getEObjectContainmentAssignment_3_7() { return cEObjectContainmentAssignment_3_7; }
		
		//EObject
		public RuleCall getEObjectContainmentEObjectParserRuleCall_3_7_0() { return cEObjectContainmentEObjectParserRuleCall_3_7_0; }
		
		//eObjectContainment+=EAttribute
		public Assignment getEObjectContainmentAssignment_3_8() { return cEObjectContainmentAssignment_3_8; }
		
		//EAttribute
		public RuleCall getEObjectContainmentEAttributeParserRuleCall_3_8_0() { return cEObjectContainmentEAttributeParserRuleCall_3_8_0; }
		
		//eObjectContainment+=MyEAttribute
		public Assignment getEObjectContainmentAssignment_3_9() { return cEObjectContainmentAssignment_3_9; }
		
		//MyEAttribute
		public RuleCall getEObjectContainmentMyEAttributeParserRuleCall_3_9_0() { return cEObjectContainmentMyEAttributeParserRuleCall_3_9_0; }
	}
	public class EObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.EObject");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEObjectAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cObjectKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//EObject:
		//    {EObject} 'object'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{EObject} 'object'
		public Group getGroup() { return cGroup; }
		
		//{EObject}
		public Action getEObjectAction_0() { return cEObjectAction_0; }
		
		//'object'
		public Keyword getObjectKeyword_1() { return cObjectKeyword_1; }
	}
	public class ValidIDElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage.ValidID");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ValidID returns EString:
		//    ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final ExtendsNsURIEObjectElements pExtendsNsURIEObject;
	private final MyEAttributeElements pMyEAttribute;
	private final EAttributeElements pEAttribute;
	private final ExtendsPluginEObjectElements pExtendsPluginEObject;
	private final Unused_01Elements pUnused_01;
	private final Unused_02Elements pUnused_02;
	private final Unused_03Elements pUnused_03;
	private final ExtendsResourceEObjectElements pExtendsResourceEObject;
	private final EObjectElements pEObject;
	private final ValidIDElements pValidID;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EcoreReferenceTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pExtendsNsURIEObject = new ExtendsNsURIEObjectElements();
		this.pMyEAttribute = new MyEAttributeElements();
		this.pEAttribute = new EAttributeElements();
		this.pExtendsPluginEObject = new ExtendsPluginEObjectElements();
		this.pUnused_01 = new Unused_01Elements();
		this.pUnused_02 = new Unused_02Elements();
		this.pUnused_03 = new Unused_03Elements();
		this.pExtendsResourceEObject = new ExtendsResourceEObjectElements();
		this.pEObject = new EObjectElements();
		this.pValidID = new ValidIDElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.metamodelreferencing.tests.EcoreReferenceTestLanguage".equals(grammar.getName())) {
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

	
	//Model:
	//    extends+=ExtendsNsURIEObject
	//    extends+=ExtendsPluginEObject
	//    extends+=ExtendsResourceEObject
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ExtendsNsURIEObject:
	//    'ExtendsNsURIEObject' name=ValidID
	//    (
	//      'EObject' eObjectReference1=[EObject]
	//    | 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
	//    | 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
	//    | 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
	//    )
	//    (
	//        'ExtendsPluginEObject'
	//        eAttributeReference=[MyEAttribute]
	//        eObjectReference2=[ExtendsNsURIEObject]
	//        eObjectReference3=[ExtendsPluginEObject]
	//        eObjectReference4=[ExtendsResourceEObject]
	//        eObjectContainment+=ExtendsNsURIEObject?
	//        eObjectContainment+=ExtendsPluginEObject?
	//        eObjectContainment+=ExtendsResourceEObject?
	//        eObjectContainment+=EObject
	//        eObjectContainment+=EAttribute
	//        eObjectContainment+=MyEAttribute
	//    )?
	//;
	public ExtendsNsURIEObjectElements getExtendsNsURIEObjectAccess() {
		return pExtendsNsURIEObject;
	}
	
	public ParserRule getExtendsNsURIEObjectRule() {
		return getExtendsNsURIEObjectAccess().getRule();
	}
	
	//MyEAttribute:
	//    {MyEAttribute} 'MyEAttribute'
	//;
	public MyEAttributeElements getMyEAttributeAccess() {
		return pMyEAttribute;
	}
	
	public ParserRule getMyEAttributeRule() {
		return getMyEAttributeAccess().getRule();
	}
	
	//EAttribute:
	//    {EAttribute} 'EAttribute'
	//;
	public EAttributeElements getEAttributeAccess() {
		return pEAttribute;
	}
	
	public ParserRule getEAttributeRule() {
		return getEAttributeAccess().getRule();
	}
	
	//ExtendsPluginEObject:
	//    'ExtendsPluginEObject' name=ValidID
	//    (
	//      'EObject' eObjectReference1=[EObject]
	//    | 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
	//    | 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
	//    | 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
	//    )
	//    (
	//        'ExtendsPluginEObject'
	//        eObjectReference2=[ExtendsNsURIEObject]
	//        eObjectReference3=[ExtendsPluginEObject]
	//        eObjectReference4=[ExtendsResourceEObject]
	//        eObjectContainment+=ExtendsNsURIEObject?
	//        eObjectContainment+=ExtendsPluginEObject?
	//        eObjectContainment+=ExtendsResourceEObject?
	//        eObjectContainment+=EObject
	//        eObjectContainment+=EAttribute
	//        eObjectContainment+=MyEAttribute
	//    )?
	//;
	public ExtendsPluginEObjectElements getExtendsPluginEObjectAccess() {
		return pExtendsPluginEObject;
	}
	
	public ParserRule getExtendsPluginEObjectRule() {
		return getExtendsPluginEObjectAccess().getRule();
	}
	
	//Unused_01 returns ExtendsNsURIEObject:
	//    {MyNamedElement_01} name = ValidID
	//;
	public Unused_01Elements getUnused_01Access() {
		return pUnused_01;
	}
	
	public ParserRule getUnused_01Rule() {
		return getUnused_01Access().getRule();
	}
	
	//Unused_02 returns ExtendsResourceEObject:
	//    {MyNamedElement_02} name = ValidID
	//;
	public Unused_02Elements getUnused_02Access() {
		return pUnused_02;
	}
	
	public ParserRule getUnused_02Rule() {
		return getUnused_02Access().getRule();
	}
	
	//Unused_03 returns ExtendsPluginEObject:
	//    {MyNamedElement_03} name = ValidID
	//;
	public Unused_03Elements getUnused_03Access() {
		return pUnused_03;
	}
	
	public ParserRule getUnused_03Rule() {
		return getUnused_03Access().getRule();
	}
	
	//ExtendsResourceEObject:
	//    'ExtendsResourceEObject' name=ValidID
	//    (
	//      'EObject' eObjectReference1=[EObject]
	//    | 'ExtendsNsURIEObject' eObjectReference1=[ExtendsNsURIEObject]
	//    | 'ExtendsPluginEObject' eObjectReference1=[ExtendsPluginEObject]
	//    | 'ExtendsResourceEObject' eObjectReference1=[ExtendsResourceEObject]
	//    )
	//    (
	//        'ExtendsResourceEObject'
	//        eObjectReference2=[ExtendsNsURIEObject]
	//        eObjectReference3=[ExtendsPluginEObject]
	//        eObjectReference4=[ExtendsResourceEObject]
	//        eObjectContainment+=ExtendsNsURIEObject
	//        eObjectContainment+=ExtendsPluginEObject
	//        eObjectContainment+=ExtendsResourceEObject
	//        eObjectContainment+=EObject
	//        eObjectContainment+=EAttribute
	//        eObjectContainment+=MyEAttribute
	//    )?
	//;
	public ExtendsResourceEObjectElements getExtendsResourceEObjectAccess() {
		return pExtendsResourceEObject;
	}
	
	public ParserRule getExtendsResourceEObjectRule() {
		return getExtendsResourceEObjectAccess().getRule();
	}
	
	//EObject:
	//    {EObject} 'object'
	//;
	public EObjectElements getEObjectAccess() {
		return pEObject;
	}
	
	public ParserRule getEObjectRule() {
		return getEObjectAccess().getRule();
	}
	
	//ValidID returns EString:
	//    ID
	//;
	public ValidIDElements getValidIDAccess() {
		return pValidID;
	}
	
	public ParserRule getValidIDRule() {
		return getValidIDAccess().getRule();
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
