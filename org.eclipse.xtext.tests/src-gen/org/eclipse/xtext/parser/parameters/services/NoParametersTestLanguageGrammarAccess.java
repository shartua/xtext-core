/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.parameters.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
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
public class NoParametersTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ParserRuleParametersElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.ParserRuleParameters");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cParserRuleParametersAction_0 = (Action)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Keyword cNumberSignDigitOneKeyword_1_0_0 = (Keyword)cGroup_1_0.eContents().get(0);
		private final Assignment cScenarioAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final RuleCall cScenarioScenario1_TrueParserRuleCall_1_0_1_0 = (RuleCall)cScenarioAssignment_1_0_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Keyword cNumberSignDigitTwoKeyword_1_1_0 = (Keyword)cGroup_1_1.eContents().get(0);
		private final Assignment cScenarioAssignment_1_1_1 = (Assignment)cGroup_1_1.eContents().get(1);
		private final RuleCall cScenarioScenario1_FalseParserRuleCall_1_1_1_0 = (RuleCall)cScenarioAssignment_1_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Keyword cNumberSignDigitThreeKeyword_1_2_0 = (Keyword)cGroup_1_2.eContents().get(0);
		private final Assignment cScenarioAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cScenarioScenario2_TrueParserRuleCall_1_2_1_0 = (RuleCall)cScenarioAssignment_1_2_1.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Keyword cNumberSignDigitFourKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cScenarioAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cScenarioScenario2_FalseParserRuleCall_1_3_1_0 = (RuleCall)cScenarioAssignment_1_3_1.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cAlternatives_1.eContents().get(4);
		private final Group cGroup_1_4_0 = (Group)cGroup_1_4.eContents().get(0);
		private final Keyword cNumberSignDigitFiveKeyword_1_4_0_0 = (Keyword)cGroup_1_4_0.eContents().get(0);
		private final Assignment cScenarioAssignment_1_4_0_1 = (Assignment)cGroup_1_4_0.eContents().get(1);
		private final RuleCall cScenarioScenario2_TrueParserRuleCall_1_4_0_1_0 = (RuleCall)cScenarioAssignment_1_4_0_1.eContents().get(0);
		private final Group cGroup_1_5 = (Group)cAlternatives_1.eContents().get(5);
		private final Group cGroup_1_5_0 = (Group)cGroup_1_5.eContents().get(0);
		private final Keyword cNumberSignDigitSixKeyword_1_5_0_0 = (Keyword)cGroup_1_5_0.eContents().get(0);
		private final Assignment cScenarioAssignment_1_5_0_1 = (Assignment)cGroup_1_5_0.eContents().get(1);
		private final RuleCall cScenarioScenario2_FalseParserRuleCall_1_5_0_1_0 = (RuleCall)cScenarioAssignment_1_5_0_1.eContents().get(0);
		private final Group cGroup_1_6 = (Group)cAlternatives_1.eContents().get(6);
		private final Keyword cNumberSignDigitSevenKeyword_1_6_0 = (Keyword)cGroup_1_6.eContents().get(0);
		private final Assignment cScenarioAssignment_1_6_1 = (Assignment)cGroup_1_6.eContents().get(1);
		private final RuleCall cScenarioScenario3_TrueParserRuleCall_1_6_1_0 = (RuleCall)cScenarioAssignment_1_6_1.eContents().get(0);
		private final Group cGroup_1_7 = (Group)cAlternatives_1.eContents().get(7);
		private final Keyword cNumberSignDigitEightKeyword_1_7_0 = (Keyword)cGroup_1_7.eContents().get(0);
		private final Assignment cScenarioAssignment_1_7_1 = (Assignment)cGroup_1_7.eContents().get(1);
		private final RuleCall cScenarioScenario3_FalseParserRuleCall_1_7_1_0 = (RuleCall)cScenarioAssignment_1_7_1.eContents().get(0);
		private final Group cGroup_1_8 = (Group)cAlternatives_1.eContents().get(8);
		private final Keyword cNumberSignDigitNineKeyword_1_8_0 = (Keyword)cGroup_1_8.eContents().get(0);
		private final Alternatives cAlternatives_1_8_1 = (Alternatives)cGroup_1_8.eContents().get(1);
		private final Assignment cScenarioAssignment_1_8_1_0 = (Assignment)cAlternatives_1_8_1.eContents().get(0);
		private final RuleCall cScenarioScenario4_TrueParserRuleCall_1_8_1_0_0 = (RuleCall)cScenarioAssignment_1_8_1_0.eContents().get(0);
		private final Group cGroup_1_8_1_1 = (Group)cAlternatives_1_8_1.eContents().get(1);
		private final Assignment cScenarioAssignment_1_8_1_1_0 = (Assignment)cGroup_1_8_1_1.eContents().get(0);
		private final RuleCall cScenarioScenario2_TrueParserRuleCall_1_8_1_1_0_0 = (RuleCall)cScenarioAssignment_1_8_1_1_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1_8_1_1_1 = (Keyword)cGroup_1_8_1_1.eContents().get(1);
		private final Group cGroup_1_9 = (Group)cAlternatives_1.eContents().get(9);
		private final Keyword cNumberSignDigitOneDigitZeroKeyword_1_9_0 = (Keyword)cGroup_1_9.eContents().get(0);
		private final Alternatives cAlternatives_1_9_1 = (Alternatives)cGroup_1_9.eContents().get(1);
		private final Assignment cScenarioAssignment_1_9_1_0 = (Assignment)cAlternatives_1_9_1.eContents().get(0);
		private final RuleCall cScenarioScenario4_TrueParserRuleCall_1_9_1_0_0 = (RuleCall)cScenarioAssignment_1_9_1_0.eContents().get(0);
		private final Group cGroup_1_9_1_1 = (Group)cAlternatives_1_9_1.eContents().get(1);
		private final Assignment cScenarioAssignment_1_9_1_1_0 = (Assignment)cGroup_1_9_1_1.eContents().get(0);
		private final RuleCall cScenarioScenario2_FalseParserRuleCall_1_9_1_1_0_0 = (RuleCall)cScenarioAssignment_1_9_1_1_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1_9_1_1_1 = (Keyword)cGroup_1_9_1_1.eContents().get(1);
		private final Group cGroup_1_10 = (Group)cAlternatives_1.eContents().get(10);
		private final Keyword cNumberSignDigitOneDigitOneKeyword_1_10_0 = (Keyword)cGroup_1_10.eContents().get(0);
		private final Alternatives cAlternatives_1_10_1 = (Alternatives)cGroup_1_10.eContents().get(1);
		private final Assignment cScenarioAssignment_1_10_1_0 = (Assignment)cAlternatives_1_10_1.eContents().get(0);
		private final RuleCall cScenarioScenario4_FalseParserRuleCall_1_10_1_0_0 = (RuleCall)cScenarioAssignment_1_10_1_0.eContents().get(0);
		private final Group cGroup_1_10_1_1 = (Group)cAlternatives_1_10_1.eContents().get(1);
		private final Assignment cScenarioAssignment_1_10_1_1_0 = (Assignment)cGroup_1_10_1_1.eContents().get(0);
		private final RuleCall cScenarioScenario2_TrueParserRuleCall_1_10_1_1_0_0 = (RuleCall)cScenarioAssignment_1_10_1_1_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1_10_1_1_1 = (Keyword)cGroup_1_10_1_1.eContents().get(1);
		private final Group cGroup_1_11 = (Group)cAlternatives_1.eContents().get(11);
		private final Keyword cNumberSignDigitOneDigitTwoKeyword_1_11_0 = (Keyword)cGroup_1_11.eContents().get(0);
		private final Alternatives cAlternatives_1_11_1 = (Alternatives)cGroup_1_11.eContents().get(1);
		private final Assignment cScenarioAssignment_1_11_1_0 = (Assignment)cAlternatives_1_11_1.eContents().get(0);
		private final RuleCall cScenarioScenario4_FalseParserRuleCall_1_11_1_0_0 = (RuleCall)cScenarioAssignment_1_11_1_0.eContents().get(0);
		private final Group cGroup_1_11_1_1 = (Group)cAlternatives_1_11_1.eContents().get(1);
		private final Assignment cScenarioAssignment_1_11_1_1_0 = (Assignment)cGroup_1_11_1_1.eContents().get(0);
		private final RuleCall cScenarioScenario2_FalseParserRuleCall_1_11_1_1_0_0 = (RuleCall)cScenarioAssignment_1_11_1_1_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1_11_1_1_1 = (Keyword)cGroup_1_11_1_1.eContents().get(1);
		
		//@Override
		//ParserRuleParameters: {ParserRuleParameters}
		//  ( '#1' scenario=Scenario1_True
		//  |    '#2' scenario=Scenario1_False
		//  | '#3' scenario=Scenario2_True
		//  | '#4' scenario=Scenario2_False
		//  | =>('#5' scenario=Scenario2_True)
		//  | =>('#6' scenario=Scenario2_False)
		//  | '#7' scenario=Scenario3_True
		//  | '#8' scenario=Scenario3_False
		//  | '#9' (scenario=Scenario4_True | scenario=Scenario2_True 'keyword'?)
		//  | '#10' (scenario=Scenario4_True | scenario=Scenario2_False 'keyword'?)
		//  | '#11' (scenario=Scenario4_False | scenario=Scenario2_True 'keyword'?)
		//  | '#12' (scenario=Scenario4_False | scenario=Scenario2_False 'keyword'?)
		//  )
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{ParserRuleParameters}
		// ( '#1' scenario=Scenario1_True
		// |    '#2' scenario=Scenario1_False
		// | '#3' scenario=Scenario2_True
		// | '#4' scenario=Scenario2_False
		// | =>('#5' scenario=Scenario2_True)
		// | =>('#6' scenario=Scenario2_False)
		// | '#7' scenario=Scenario3_True
		// | '#8' scenario=Scenario3_False
		// | '#9' (scenario=Scenario4_True | scenario=Scenario2_True 'keyword'?)
		// | '#10' (scenario=Scenario4_True | scenario=Scenario2_False 'keyword'?)
		// | '#11' (scenario=Scenario4_False | scenario=Scenario2_True 'keyword'?)
		// | '#12' (scenario=Scenario4_False | scenario=Scenario2_False 'keyword'?)
		// )
		public Group getGroup() { return cGroup; }
		
		//{ParserRuleParameters}
		public Action getParserRuleParametersAction_0() { return cParserRuleParametersAction_0; }
		
		//( '#1' scenario=Scenario1_True
		//|    '#2' scenario=Scenario1_False
		//| '#3' scenario=Scenario2_True
		//| '#4' scenario=Scenario2_False
		//| =>('#5' scenario=Scenario2_True)
		//| =>('#6' scenario=Scenario2_False)
		//| '#7' scenario=Scenario3_True
		//| '#8' scenario=Scenario3_False
		//| '#9' (scenario=Scenario4_True | scenario=Scenario2_True 'keyword'?)
		//| '#10' (scenario=Scenario4_True | scenario=Scenario2_False 'keyword'?)
		//| '#11' (scenario=Scenario4_False | scenario=Scenario2_True 'keyword'?)
		//| '#12' (scenario=Scenario4_False | scenario=Scenario2_False 'keyword'?)
		//)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//'#1' scenario=Scenario1_True
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//'#1'
		public Keyword getNumberSignDigitOneKeyword_1_0_0() { return cNumberSignDigitOneKeyword_1_0_0; }
		
		//scenario=Scenario1_True
		public Assignment getScenarioAssignment_1_0_1() { return cScenarioAssignment_1_0_1; }
		
		//Scenario1_True
		public RuleCall getScenarioScenario1_TrueParserRuleCall_1_0_1_0() { return cScenarioScenario1_TrueParserRuleCall_1_0_1_0; }
		
		//'#2' scenario=Scenario1_False
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//'#2'
		public Keyword getNumberSignDigitTwoKeyword_1_1_0() { return cNumberSignDigitTwoKeyword_1_1_0; }
		
		//scenario=Scenario1_False
		public Assignment getScenarioAssignment_1_1_1() { return cScenarioAssignment_1_1_1; }
		
		//Scenario1_False
		public RuleCall getScenarioScenario1_FalseParserRuleCall_1_1_1_0() { return cScenarioScenario1_FalseParserRuleCall_1_1_1_0; }
		
		//'#3' scenario=Scenario2_True
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//'#3'
		public Keyword getNumberSignDigitThreeKeyword_1_2_0() { return cNumberSignDigitThreeKeyword_1_2_0; }
		
		//scenario=Scenario2_True
		public Assignment getScenarioAssignment_1_2_1() { return cScenarioAssignment_1_2_1; }
		
		//Scenario2_True
		public RuleCall getScenarioScenario2_TrueParserRuleCall_1_2_1_0() { return cScenarioScenario2_TrueParserRuleCall_1_2_1_0; }
		
		//'#4' scenario=Scenario2_False
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//'#4'
		public Keyword getNumberSignDigitFourKeyword_1_3_0() { return cNumberSignDigitFourKeyword_1_3_0; }
		
		//scenario=Scenario2_False
		public Assignment getScenarioAssignment_1_3_1() { return cScenarioAssignment_1_3_1; }
		
		//Scenario2_False
		public RuleCall getScenarioScenario2_FalseParserRuleCall_1_3_1_0() { return cScenarioScenario2_FalseParserRuleCall_1_3_1_0; }
		
		//=>('#5' scenario=Scenario2_True)
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//'#5' scenario=Scenario2_True
		public Group getGroup_1_4_0() { return cGroup_1_4_0; }
		
		//'#5'
		public Keyword getNumberSignDigitFiveKeyword_1_4_0_0() { return cNumberSignDigitFiveKeyword_1_4_0_0; }
		
		//scenario=Scenario2_True
		public Assignment getScenarioAssignment_1_4_0_1() { return cScenarioAssignment_1_4_0_1; }
		
		//Scenario2_True
		public RuleCall getScenarioScenario2_TrueParserRuleCall_1_4_0_1_0() { return cScenarioScenario2_TrueParserRuleCall_1_4_0_1_0; }
		
		//=>('#6' scenario=Scenario2_False)
		public Group getGroup_1_5() { return cGroup_1_5; }
		
		//'#6' scenario=Scenario2_False
		public Group getGroup_1_5_0() { return cGroup_1_5_0; }
		
		//'#6'
		public Keyword getNumberSignDigitSixKeyword_1_5_0_0() { return cNumberSignDigitSixKeyword_1_5_0_0; }
		
		//scenario=Scenario2_False
		public Assignment getScenarioAssignment_1_5_0_1() { return cScenarioAssignment_1_5_0_1; }
		
		//Scenario2_False
		public RuleCall getScenarioScenario2_FalseParserRuleCall_1_5_0_1_0() { return cScenarioScenario2_FalseParserRuleCall_1_5_0_1_0; }
		
		//'#7' scenario=Scenario3_True
		public Group getGroup_1_6() { return cGroup_1_6; }
		
		//'#7'
		public Keyword getNumberSignDigitSevenKeyword_1_6_0() { return cNumberSignDigitSevenKeyword_1_6_0; }
		
		//scenario=Scenario3_True
		public Assignment getScenarioAssignment_1_6_1() { return cScenarioAssignment_1_6_1; }
		
		//Scenario3_True
		public RuleCall getScenarioScenario3_TrueParserRuleCall_1_6_1_0() { return cScenarioScenario3_TrueParserRuleCall_1_6_1_0; }
		
		//'#8' scenario=Scenario3_False
		public Group getGroup_1_7() { return cGroup_1_7; }
		
		//'#8'
		public Keyword getNumberSignDigitEightKeyword_1_7_0() { return cNumberSignDigitEightKeyword_1_7_0; }
		
		//scenario=Scenario3_False
		public Assignment getScenarioAssignment_1_7_1() { return cScenarioAssignment_1_7_1; }
		
		//Scenario3_False
		public RuleCall getScenarioScenario3_FalseParserRuleCall_1_7_1_0() { return cScenarioScenario3_FalseParserRuleCall_1_7_1_0; }
		
		//'#9' (scenario=Scenario4_True | scenario=Scenario2_True 'keyword'?)
		public Group getGroup_1_8() { return cGroup_1_8; }
		
		//'#9'
		public Keyword getNumberSignDigitNineKeyword_1_8_0() { return cNumberSignDigitNineKeyword_1_8_0; }
		
		//(scenario=Scenario4_True | scenario=Scenario2_True 'keyword'?)
		public Alternatives getAlternatives_1_8_1() { return cAlternatives_1_8_1; }
		
		//scenario=Scenario4_True
		public Assignment getScenarioAssignment_1_8_1_0() { return cScenarioAssignment_1_8_1_0; }
		
		//Scenario4_True
		public RuleCall getScenarioScenario4_TrueParserRuleCall_1_8_1_0_0() { return cScenarioScenario4_TrueParserRuleCall_1_8_1_0_0; }
		
		//scenario=Scenario2_True 'keyword'?
		public Group getGroup_1_8_1_1() { return cGroup_1_8_1_1; }
		
		//scenario=Scenario2_True
		public Assignment getScenarioAssignment_1_8_1_1_0() { return cScenarioAssignment_1_8_1_1_0; }
		
		//Scenario2_True
		public RuleCall getScenarioScenario2_TrueParserRuleCall_1_8_1_1_0_0() { return cScenarioScenario2_TrueParserRuleCall_1_8_1_1_0_0; }
		
		//'keyword'?
		public Keyword getKeywordKeyword_1_8_1_1_1() { return cKeywordKeyword_1_8_1_1_1; }
		
		//'#10' (scenario=Scenario4_True | scenario=Scenario2_False 'keyword'?)
		public Group getGroup_1_9() { return cGroup_1_9; }
		
		//'#10'
		public Keyword getNumberSignDigitOneDigitZeroKeyword_1_9_0() { return cNumberSignDigitOneDigitZeroKeyword_1_9_0; }
		
		//(scenario=Scenario4_True | scenario=Scenario2_False 'keyword'?)
		public Alternatives getAlternatives_1_9_1() { return cAlternatives_1_9_1; }
		
		//scenario=Scenario4_True
		public Assignment getScenarioAssignment_1_9_1_0() { return cScenarioAssignment_1_9_1_0; }
		
		//Scenario4_True
		public RuleCall getScenarioScenario4_TrueParserRuleCall_1_9_1_0_0() { return cScenarioScenario4_TrueParserRuleCall_1_9_1_0_0; }
		
		//scenario=Scenario2_False 'keyword'?
		public Group getGroup_1_9_1_1() { return cGroup_1_9_1_1; }
		
		//scenario=Scenario2_False
		public Assignment getScenarioAssignment_1_9_1_1_0() { return cScenarioAssignment_1_9_1_1_0; }
		
		//Scenario2_False
		public RuleCall getScenarioScenario2_FalseParserRuleCall_1_9_1_1_0_0() { return cScenarioScenario2_FalseParserRuleCall_1_9_1_1_0_0; }
		
		//'keyword'?
		public Keyword getKeywordKeyword_1_9_1_1_1() { return cKeywordKeyword_1_9_1_1_1; }
		
		//'#11' (scenario=Scenario4_False | scenario=Scenario2_True 'keyword'?)
		public Group getGroup_1_10() { return cGroup_1_10; }
		
		//'#11'
		public Keyword getNumberSignDigitOneDigitOneKeyword_1_10_0() { return cNumberSignDigitOneDigitOneKeyword_1_10_0; }
		
		//(scenario=Scenario4_False | scenario=Scenario2_True 'keyword'?)
		public Alternatives getAlternatives_1_10_1() { return cAlternatives_1_10_1; }
		
		//scenario=Scenario4_False
		public Assignment getScenarioAssignment_1_10_1_0() { return cScenarioAssignment_1_10_1_0; }
		
		//Scenario4_False
		public RuleCall getScenarioScenario4_FalseParserRuleCall_1_10_1_0_0() { return cScenarioScenario4_FalseParserRuleCall_1_10_1_0_0; }
		
		//scenario=Scenario2_True 'keyword'?
		public Group getGroup_1_10_1_1() { return cGroup_1_10_1_1; }
		
		//scenario=Scenario2_True
		public Assignment getScenarioAssignment_1_10_1_1_0() { return cScenarioAssignment_1_10_1_1_0; }
		
		//Scenario2_True
		public RuleCall getScenarioScenario2_TrueParserRuleCall_1_10_1_1_0_0() { return cScenarioScenario2_TrueParserRuleCall_1_10_1_1_0_0; }
		
		//'keyword'?
		public Keyword getKeywordKeyword_1_10_1_1_1() { return cKeywordKeyword_1_10_1_1_1; }
		
		//'#12' (scenario=Scenario4_False | scenario=Scenario2_False 'keyword'?)
		public Group getGroup_1_11() { return cGroup_1_11; }
		
		//'#12'
		public Keyword getNumberSignDigitOneDigitTwoKeyword_1_11_0() { return cNumberSignDigitOneDigitTwoKeyword_1_11_0; }
		
		//(scenario=Scenario4_False | scenario=Scenario2_False 'keyword'?)
		public Alternatives getAlternatives_1_11_1() { return cAlternatives_1_11_1; }
		
		//scenario=Scenario4_False
		public Assignment getScenarioAssignment_1_11_1_0() { return cScenarioAssignment_1_11_1_0; }
		
		//Scenario4_False
		public RuleCall getScenarioScenario4_FalseParserRuleCall_1_11_1_0_0() { return cScenarioScenario4_FalseParserRuleCall_1_11_1_0_0; }
		
		//scenario=Scenario2_False 'keyword'?
		public Group getGroup_1_11_1_1() { return cGroup_1_11_1_1; }
		
		//scenario=Scenario2_False
		public Assignment getScenarioAssignment_1_11_1_1_0() { return cScenarioAssignment_1_11_1_1_0; }
		
		//Scenario2_False
		public RuleCall getScenarioScenario2_FalseParserRuleCall_1_11_1_1_0_0() { return cScenarioScenario2_FalseParserRuleCall_1_11_1_1_0_0; }
		
		//'keyword'?
		public Keyword getKeywordKeyword_1_11_1_1_1() { return cKeywordKeyword_1_11_1_1_1; }
	}
	public class Scenario1_TrueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario1_True");
		private final Assignment cFirstAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFirstIDTerminalRuleCall_0 = (RuleCall)cFirstAssignment.eContents().get(0);
		
		//Scenario1_True returns Scenario:
		//  first=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//first=ID
		public Assignment getFirstAssignment() { return cFirstAssignment; }
		
		//ID
		public RuleCall getFirstIDTerminalRuleCall_0() { return cFirstIDTerminalRuleCall_0; }
	}
	public class Scenario1_FalseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario1_False");
		private final Assignment cSecondAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cSecondIDTerminalRuleCall_0 = (RuleCall)cSecondAssignment.eContents().get(0);
		
		//Scenario1_False returns Scenario:
		//  second=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//second=ID
		public Assignment getSecondAssignment() { return cSecondAssignment; }
		
		//ID
		public RuleCall getSecondIDTerminalRuleCall_0() { return cSecondIDTerminalRuleCall_0; }
	}
	public class Scenario2_TrueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_True");
		private final Assignment cFirstAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFirstIdOrKeyword_TrueParserRuleCall_0 = (RuleCall)cFirstAssignment.eContents().get(0);
		
		//Scenario2_True returns Scenario:
		//  first=IdOrKeyword_True
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//first=IdOrKeyword_True
		public Assignment getFirstAssignment() { return cFirstAssignment; }
		
		//IdOrKeyword_True
		public RuleCall getFirstIdOrKeyword_TrueParserRuleCall_0() { return cFirstIdOrKeyword_TrueParserRuleCall_0; }
	}
	public class Scenario2_FalseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario2_False");
		private final Assignment cFirstAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cFirstIdOrKeyword_FalseParserRuleCall_0 = (RuleCall)cFirstAssignment.eContents().get(0);
		
		//Scenario2_False returns Scenario:
		//    first=IdOrKeyword_False
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//first=IdOrKeyword_False
		public Assignment getFirstAssignment() { return cFirstAssignment; }
		
		//IdOrKeyword_False
		public RuleCall getFirstIdOrKeyword_FalseParserRuleCall_0() { return cFirstIdOrKeyword_FalseParserRuleCall_0; }
	}
	public class Scenario3_TrueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario3_True");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFirstAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFirstIdOrKeyword_TrueParserRuleCall_0_0 = (RuleCall)cFirstAssignment_0.eContents().get(0);
		private final Assignment cSecondAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cSecondKeywordKeyword_1_0 = (Keyword)cSecondAssignment_1.eContents().get(0);
		
		//Scenario3_True returns Scenario:
		//    =>first=IdOrKeyword_True
		//    | second='keyword'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//=>first=IdOrKeyword_True
		//| second='keyword'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//=>first=IdOrKeyword_True
		public Assignment getFirstAssignment_0() { return cFirstAssignment_0; }
		
		//IdOrKeyword_True
		public RuleCall getFirstIdOrKeyword_TrueParserRuleCall_0_0() { return cFirstIdOrKeyword_TrueParserRuleCall_0_0; }
		
		//second='keyword'
		public Assignment getSecondAssignment_1() { return cSecondAssignment_1; }
		
		//'keyword'
		public Keyword getSecondKeywordKeyword_1_0() { return cSecondKeywordKeyword_1_0; }
	}
	public class Scenario3_FalseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario3_False");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFirstAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFirstIdOrKeyword_FalseParserRuleCall_0_0 = (RuleCall)cFirstAssignment_0.eContents().get(0);
		private final Assignment cSecondAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cSecondKeywordKeyword_1_0 = (Keyword)cSecondAssignment_1.eContents().get(0);
		
		//Scenario3_False returns Scenario:
		//    =>first=IdOrKeyword_False
		//    | second='keyword'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//=>first=IdOrKeyword_False
		//| second='keyword'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//=>first=IdOrKeyword_False
		public Assignment getFirstAssignment_0() { return cFirstAssignment_0; }
		
		//IdOrKeyword_False
		public RuleCall getFirstIdOrKeyword_FalseParserRuleCall_0_0() { return cFirstIdOrKeyword_FalseParserRuleCall_0_0; }
		
		//second='keyword'
		public Assignment getSecondAssignment_1() { return cSecondAssignment_1; }
		
		//'keyword'
		public Keyword getSecondKeywordKeyword_1_0() { return cSecondKeywordKeyword_1_0; }
	}
	public class Scenario4_TrueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario4_True");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSecondAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSecondIdOrKeyword_TrueParserRuleCall_0_0 = (RuleCall)cSecondAssignment_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Scenario4_True returns Scenario:
		//    =>second=IdOrKeyword_True 'keyword'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//=>second=IdOrKeyword_True 'keyword'
		public Group getGroup() { return cGroup; }
		
		//=>second=IdOrKeyword_True
		public Assignment getSecondAssignment_0() { return cSecondAssignment_0; }
		
		//IdOrKeyword_True
		public RuleCall getSecondIdOrKeyword_TrueParserRuleCall_0_0() { return cSecondIdOrKeyword_TrueParserRuleCall_0_0; }
		
		//'keyword'
		public Keyword getKeywordKeyword_1() { return cKeywordKeyword_1; }
	}
	public class Scenario4_FalseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.Scenario4_False");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSecondAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSecondIdOrKeyword_FalseParserRuleCall_0_0 = (RuleCall)cSecondAssignment_0.eContents().get(0);
		private final Keyword cKeywordKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Scenario4_False returns Scenario:
		//    =>second=IdOrKeyword_False 'keyword'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//=>second=IdOrKeyword_False 'keyword'
		public Group getGroup() { return cGroup; }
		
		//=>second=IdOrKeyword_False
		public Assignment getSecondAssignment_0() { return cSecondAssignment_0; }
		
		//IdOrKeyword_False
		public RuleCall getSecondIdOrKeyword_FalseParserRuleCall_0_0() { return cSecondIdOrKeyword_FalseParserRuleCall_0_0; }
		
		//'keyword'
		public Keyword getKeywordKeyword_1() { return cKeywordKeyword_1; }
	}
	public class IdOrKeyword_TrueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.IdOrKeyword_True");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cKeywordKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//IdOrKeyword_True:
		//      'keyword'
		//    | ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//  'keyword'
		//| ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'keyword'
		public Keyword getKeywordKeyword_0() { return cKeywordKeyword_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class IdOrKeyword_FalseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.parameters.NoParametersTestLanguage.IdOrKeyword_False");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//IdOrKeyword_False:
		//    ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final ParserRuleParametersElements pParserRuleParameters;
	private final Scenario1_TrueElements pScenario1_True;
	private final Scenario1_FalseElements pScenario1_False;
	private final Scenario2_TrueElements pScenario2_True;
	private final Scenario2_FalseElements pScenario2_False;
	private final Scenario3_TrueElements pScenario3_True;
	private final Scenario3_FalseElements pScenario3_False;
	private final Scenario4_TrueElements pScenario4_True;
	private final Scenario4_FalseElements pScenario4_False;
	private final IdOrKeyword_TrueElements pIdOrKeyword_True;
	private final IdOrKeyword_FalseElements pIdOrKeyword_False;
	
	private final Grammar grammar;
	
	private final ParametersTestLanguageGrammarAccess gaParametersTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public NoParametersTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			ParametersTestLanguageGrammarAccess gaParametersTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaParametersTestLanguage = gaParametersTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pParserRuleParameters = new ParserRuleParametersElements();
		this.pScenario1_True = new Scenario1_TrueElements();
		this.pScenario1_False = new Scenario1_FalseElements();
		this.pScenario2_True = new Scenario2_TrueElements();
		this.pScenario2_False = new Scenario2_FalseElements();
		this.pScenario3_True = new Scenario3_TrueElements();
		this.pScenario3_False = new Scenario3_FalseElements();
		this.pScenario4_True = new Scenario4_TrueElements();
		this.pScenario4_False = new Scenario4_FalseElements();
		this.pIdOrKeyword_True = new IdOrKeyword_TrueElements();
		this.pIdOrKeyword_False = new IdOrKeyword_FalseElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.parameters.NoParametersTestLanguage".equals(grammar.getName())) {
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
	
	
	public ParametersTestLanguageGrammarAccess getParametersTestLanguageGrammarAccess() {
		return gaParametersTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//@Override
	//ParserRuleParameters: {ParserRuleParameters}
	//  ( '#1' scenario=Scenario1_True
	//  |    '#2' scenario=Scenario1_False
	//  | '#3' scenario=Scenario2_True
	//  | '#4' scenario=Scenario2_False
	//  | =>('#5' scenario=Scenario2_True)
	//  | =>('#6' scenario=Scenario2_False)
	//  | '#7' scenario=Scenario3_True
	//  | '#8' scenario=Scenario3_False
	//  | '#9' (scenario=Scenario4_True | scenario=Scenario2_True 'keyword'?)
	//  | '#10' (scenario=Scenario4_True | scenario=Scenario2_False 'keyword'?)
	//  | '#11' (scenario=Scenario4_False | scenario=Scenario2_True 'keyword'?)
	//  | '#12' (scenario=Scenario4_False | scenario=Scenario2_False 'keyword'?)
	//  )
	//;
	public ParserRuleParametersElements getParserRuleParametersAccess() {
		return pParserRuleParameters;
	}
	
	public ParserRule getParserRuleParametersRule() {
		return getParserRuleParametersAccess().getRule();
	}
	
	//Scenario1_True returns Scenario:
	//  first=ID
	//;
	public Scenario1_TrueElements getScenario1_TrueAccess() {
		return pScenario1_True;
	}
	
	public ParserRule getScenario1_TrueRule() {
		return getScenario1_TrueAccess().getRule();
	}
	
	//Scenario1_False returns Scenario:
	//  second=ID
	//;
	public Scenario1_FalseElements getScenario1_FalseAccess() {
		return pScenario1_False;
	}
	
	public ParserRule getScenario1_FalseRule() {
		return getScenario1_FalseAccess().getRule();
	}
	
	//Scenario2_True returns Scenario:
	//  first=IdOrKeyword_True
	//;
	public Scenario2_TrueElements getScenario2_TrueAccess() {
		return pScenario2_True;
	}
	
	public ParserRule getScenario2_TrueRule() {
		return getScenario2_TrueAccess().getRule();
	}
	
	//Scenario2_False returns Scenario:
	//    first=IdOrKeyword_False
	//;
	public Scenario2_FalseElements getScenario2_FalseAccess() {
		return pScenario2_False;
	}
	
	public ParserRule getScenario2_FalseRule() {
		return getScenario2_FalseAccess().getRule();
	}
	
	//Scenario3_True returns Scenario:
	//    =>first=IdOrKeyword_True
	//    | second='keyword'
	//;
	public Scenario3_TrueElements getScenario3_TrueAccess() {
		return pScenario3_True;
	}
	
	public ParserRule getScenario3_TrueRule() {
		return getScenario3_TrueAccess().getRule();
	}
	
	//Scenario3_False returns Scenario:
	//    =>first=IdOrKeyword_False
	//    | second='keyword'
	//;
	public Scenario3_FalseElements getScenario3_FalseAccess() {
		return pScenario3_False;
	}
	
	public ParserRule getScenario3_FalseRule() {
		return getScenario3_FalseAccess().getRule();
	}
	
	//Scenario4_True returns Scenario:
	//    =>second=IdOrKeyword_True 'keyword'
	//;
	public Scenario4_TrueElements getScenario4_TrueAccess() {
		return pScenario4_True;
	}
	
	public ParserRule getScenario4_TrueRule() {
		return getScenario4_TrueAccess().getRule();
	}
	
	//Scenario4_False returns Scenario:
	//    =>second=IdOrKeyword_False 'keyword'
	//;
	public Scenario4_FalseElements getScenario4_FalseAccess() {
		return pScenario4_False;
	}
	
	public ParserRule getScenario4_FalseRule() {
		return getScenario4_FalseAccess().getRule();
	}
	
	//IdOrKeyword_True:
	//      'keyword'
	//    | ID
	//;
	public IdOrKeyword_TrueElements getIdOrKeyword_TrueAccess() {
		return pIdOrKeyword_True;
	}
	
	public ParserRule getIdOrKeyword_TrueRule() {
		return getIdOrKeyword_TrueAccess().getRule();
	}
	
	//IdOrKeyword_False:
	//    ID
	//;
	public IdOrKeyword_FalseElements getIdOrKeyword_FalseAccess() {
		return pIdOrKeyword_False;
	}
	
	public ParserRule getIdOrKeyword_FalseRule() {
		return getIdOrKeyword_FalseAccess().getRule();
	}
	
	//Scenario1<Param> returns Scenario:
	//    <Param> first=ID
	//  | <!Param> second=ID
	//;
	public ParametersTestLanguageGrammarAccess.Scenario1Elements getScenario1Access() {
		return gaParametersTestLanguage.getScenario1Access();
	}
	
	public ParserRule getScenario1Rule() {
		return getScenario1Access().getRule();
	}
	
	//Scenario2<AllowKeyword> returns Scenario:
	//    first=IdOrKeyword<AllowKeyword>
	//;
	public ParametersTestLanguageGrammarAccess.Scenario2Elements getScenario2Access() {
		return gaParametersTestLanguage.getScenario2Access();
	}
	
	public ParserRule getScenario2Rule() {
		return getScenario2Access().getRule();
	}
	
	//Scenario3<AllowKeyword> returns Scenario:
	//    =>first=IdOrKeyword<AllowKeyword>
	//    | second='keyword'
	//;
	public ParametersTestLanguageGrammarAccess.Scenario3Elements getScenario3Access() {
		return gaParametersTestLanguage.getScenario3Access();
	}
	
	public ParserRule getScenario3Rule() {
		return getScenario3Access().getRule();
	}
	
	//Scenario4<AllowKeyword> returns Scenario:
	//    =>second=IdOrKeyword<AllowKeyword> 'keyword'
	//;
	public ParametersTestLanguageGrammarAccess.Scenario4Elements getScenario4Access() {
		return gaParametersTestLanguage.getScenario4Access();
	}
	
	public ParserRule getScenario4Rule() {
		return getScenario4Access().getRule();
	}
	
	//IdOrKeyword<Keyword>:
	//    <Keyword> 'keyword'
	//    | ID
	//;
	public ParametersTestLanguageGrammarAccess.IdOrKeywordElements getIdOrKeywordAccess() {
		return gaParametersTestLanguage.getIdOrKeywordAccess();
	}
	
	public ParserRule getIdOrKeywordRule() {
		return getIdOrKeywordAccess().getRule();
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
