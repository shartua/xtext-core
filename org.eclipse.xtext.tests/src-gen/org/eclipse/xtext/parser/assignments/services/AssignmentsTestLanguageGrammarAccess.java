/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.assignments.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class AssignmentsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cSimpleKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Alternatives cAlternatives_0_1 = (Alternatives)cGroup_0.eContents().get(1);
		private final Assignment cSingleAssignment_0_1_0 = (Assignment)cAlternatives_0_1.eContents().get(0);
		private final RuleCall cSingleSingleValueParserRuleCall_0_1_0_0 = (RuleCall)cSingleAssignment_0_1_0.eContents().get(0);
		private final Assignment cMultiAssignment_0_1_1 = (Assignment)cAlternatives_0_1.eContents().get(1);
		private final RuleCall cMultiMultiValueParserRuleCall_0_1_1_0 = (RuleCall)cMultiAssignment_0_1_1.eContents().get(0);
		private final Assignment cSingleAssignment_0_1_2 = (Assignment)cAlternatives_0_1.eContents().get(2);
		private final RuleCall cSingleSingleDatatypeParserRuleCall_0_1_2_0 = (RuleCall)cSingleAssignment_0_1_2.eContents().get(0);
		private final Assignment cMultiAssignment_0_1_3 = (Assignment)cAlternatives_0_1.eContents().get(3);
		private final RuleCall cMultiMultiDatatypeParserRuleCall_0_1_3_0 = (RuleCall)cMultiAssignment_0_1_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cComplexKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cObjectAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cObjectAlternatives_1_1_0 = (Alternatives)cObjectAssignment_1_1.eContents().get(0);
		private final RuleCall cObjectSingleValueParserRuleCall_1_1_0_0 = (RuleCall)cObjectAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cObjectMultiValueParserRuleCall_1_1_0_1 = (RuleCall)cObjectAlternatives_1_1_0.eContents().get(1);
		private final RuleCall cObjectSingleDatatypeParserRuleCall_1_1_0_2 = (RuleCall)cObjectAlternatives_1_1_0.eContents().get(2);
		private final RuleCall cObjectMultiDatatypeParserRuleCall_1_1_0_3 = (RuleCall)cObjectAlternatives_1_1_0.eContents().get(3);
		
		//Model:
		//      'simple' (
		//      single = SingleValue
		//  | multi = MultiValue
		//  | single = SingleDatatype
		//  | multi = MultiDatatype )
		//  | 'complex' object=(
		//      SingleValue | MultiValue | SingleDatatype | MultiDatatype
		//  );
		@Override public ParserRule getRule() { return rule; }
		
		//    'simple' (
		//    single = SingleValue
		//| multi = MultiValue
		//| single = SingleDatatype
		//| multi = MultiDatatype )
		//| 'complex' object=(
		//    SingleValue | MultiValue | SingleDatatype | MultiDatatype
		//)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//    'simple' (
		//    single = SingleValue
		//| multi = MultiValue
		//| single = SingleDatatype
		//| multi = MultiDatatype )
		public Group getGroup_0() { return cGroup_0; }
		
		//'simple'
		public Keyword getSimpleKeyword_0_0() { return cSimpleKeyword_0_0; }
		
		//(
		//     single = SingleValue
		// | multi = MultiValue
		// | single = SingleDatatype
		// | multi = MultiDatatype )
		public Alternatives getAlternatives_0_1() { return cAlternatives_0_1; }
		
		//single = SingleValue
		public Assignment getSingleAssignment_0_1_0() { return cSingleAssignment_0_1_0; }
		
		//SingleValue
		public RuleCall getSingleSingleValueParserRuleCall_0_1_0_0() { return cSingleSingleValueParserRuleCall_0_1_0_0; }
		
		//multi = MultiValue
		public Assignment getMultiAssignment_0_1_1() { return cMultiAssignment_0_1_1; }
		
		//MultiValue
		public RuleCall getMultiMultiValueParserRuleCall_0_1_1_0() { return cMultiMultiValueParserRuleCall_0_1_1_0; }
		
		//single = SingleDatatype
		public Assignment getSingleAssignment_0_1_2() { return cSingleAssignment_0_1_2; }
		
		//SingleDatatype
		public RuleCall getSingleSingleDatatypeParserRuleCall_0_1_2_0() { return cSingleSingleDatatypeParserRuleCall_0_1_2_0; }
		
		//multi = MultiDatatype
		public Assignment getMultiAssignment_0_1_3() { return cMultiAssignment_0_1_3; }
		
		//MultiDatatype
		public RuleCall getMultiMultiDatatypeParserRuleCall_0_1_3_0() { return cMultiMultiDatatypeParserRuleCall_0_1_3_0; }
		
		//'complex' object=(
		//     SingleValue | MultiValue | SingleDatatype | MultiDatatype
		// )
		public Group getGroup_1() { return cGroup_1; }
		
		//'complex'
		public Keyword getComplexKeyword_1_0() { return cComplexKeyword_1_0; }
		
		//object=(
		//     SingleValue | MultiValue | SingleDatatype | MultiDatatype
		// )
		public Assignment getObjectAssignment_1_1() { return cObjectAssignment_1_1; }
		
		//(
		//      SingleValue | MultiValue | SingleDatatype | MultiDatatype
		//  )
		public Alternatives getObjectAlternatives_1_1_0() { return cObjectAlternatives_1_1_0; }
		
		//SingleValue
		public RuleCall getObjectSingleValueParserRuleCall_1_1_0_0() { return cObjectSingleValueParserRuleCall_1_1_0_0; }
		
		//MultiValue
		public RuleCall getObjectMultiValueParserRuleCall_1_1_0_1() { return cObjectMultiValueParserRuleCall_1_1_0_1; }
		
		//SingleDatatype
		public RuleCall getObjectSingleDatatypeParserRuleCall_1_1_0_2() { return cObjectSingleDatatypeParserRuleCall_1_1_0_2; }
		
		//MultiDatatype
		public RuleCall getObjectMultiDatatypeParserRuleCall_1_1_0_3() { return cObjectMultiDatatypeParserRuleCall_1_1_0_3; }
	}
	public class SingleValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.SingleValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cIdKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cAlternativeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cValueAlternatives_1_1_0 = (Alternatives)cValueAssignment_1_1.eContents().get(0);
		private final RuleCall cValueIDTerminalRuleCall_1_1_0_0 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0_1 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cStringKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//SingleValue:
		//      "id" value=ID
		//  | "alternative" value=(ID|STRING)
		//  |    "string" value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//    "id" value=ID
		//| "alternative" value=(ID|STRING)
		//|    "string" value=STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"id" value=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//"id"
		public Keyword getIdKeyword_0_0() { return cIdKeyword_0_0; }
		
		//value=ID
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_0_1_0() { return cValueIDTerminalRuleCall_0_1_0; }
		
		//"alternative" value=(ID|STRING)
		public Group getGroup_1() { return cGroup_1; }
		
		//"alternative"
		public Keyword getAlternativeKeyword_1_0() { return cAlternativeKeyword_1_0; }
		
		//value=(ID|STRING)
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//(ID|STRING)
		public Alternatives getValueAlternatives_1_1_0() { return cValueAlternatives_1_1_0; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_1_1_0_0() { return cValueIDTerminalRuleCall_1_1_0_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0_1() { return cValueSTRINGTerminalRuleCall_1_1_0_1; }
		
		//"string" value=STRING
		public Group getGroup_2() { return cGroup_2; }
		
		//"string"
		public Keyword getStringKeyword_2_0() { return cStringKeyword_2_0; }
		
		//value=STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
	}
	public class MultiValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.MultiValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cIdsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueIDTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cAlternativesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cValueAlternatives_1_1_0 = (Alternatives)cValueAssignment_1_1.eContents().get(0);
		private final RuleCall cValueIDTerminalRuleCall_1_1_0_0 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0_1 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cStringsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//MultiValue:
		//      "ids" value+=ID
		//  | "alternatives" value+=(ID|STRING)
		//  |    "strings" value+=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//    "ids" value+=ID
		//| "alternatives" value+=(ID|STRING)
		//|    "strings" value+=STRING
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"ids" value+=ID
		public Group getGroup_0() { return cGroup_0; }
		
		//"ids"
		public Keyword getIdsKeyword_0_0() { return cIdsKeyword_0_0; }
		
		//value+=ID
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_0_1_0() { return cValueIDTerminalRuleCall_0_1_0; }
		
		//"alternatives" value+=(ID|STRING)
		public Group getGroup_1() { return cGroup_1; }
		
		//"alternatives"
		public Keyword getAlternativesKeyword_1_0() { return cAlternativesKeyword_1_0; }
		
		//value+=(ID|STRING)
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//(ID|STRING)
		public Alternatives getValueAlternatives_1_1_0() { return cValueAlternatives_1_1_0; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_1_1_0_0() { return cValueIDTerminalRuleCall_1_1_0_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0_1() { return cValueSTRINGTerminalRuleCall_1_1_0_1; }
		
		//"strings" value+=STRING
		public Group getGroup_2() { return cGroup_2; }
		
		//"strings"
		public Keyword getStringsKeyword_2_0() { return cStringsKeyword_2_0; }
		
		//value+=STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
	}
	public class SingleDatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.SingleDatatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDatatypeidKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueIdDatatypeParserRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDatatypealternativeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cValueAlternatives_1_1_0 = (Alternatives)cValueAssignment_1_1.eContents().get(0);
		private final RuleCall cValueIdDatatypeParserRuleCall_1_1_0_0 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cValueStringDatatypeParserRuleCall_1_1_0_1 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cDatatypestringKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueStringDatatypeParserRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//SingleDatatype returns SingleValue:
		//      "datatypeid" value=IdDatatype
		//  | "datatypealternative" value=(IdDatatype|StringDatatype)
		//  |    "datatypestring" value=StringDatatype;
		@Override public ParserRule getRule() { return rule; }
		
		//    "datatypeid" value=IdDatatype
		//| "datatypealternative" value=(IdDatatype|StringDatatype)
		//|    "datatypestring" value=StringDatatype
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"datatypeid" value=IdDatatype
		public Group getGroup_0() { return cGroup_0; }
		
		//"datatypeid"
		public Keyword getDatatypeidKeyword_0_0() { return cDatatypeidKeyword_0_0; }
		
		//value=IdDatatype
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//IdDatatype
		public RuleCall getValueIdDatatypeParserRuleCall_0_1_0() { return cValueIdDatatypeParserRuleCall_0_1_0; }
		
		//"datatypealternative" value=(IdDatatype|StringDatatype)
		public Group getGroup_1() { return cGroup_1; }
		
		//"datatypealternative"
		public Keyword getDatatypealternativeKeyword_1_0() { return cDatatypealternativeKeyword_1_0; }
		
		//value=(IdDatatype|StringDatatype)
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//(IdDatatype|StringDatatype)
		public Alternatives getValueAlternatives_1_1_0() { return cValueAlternatives_1_1_0; }
		
		//IdDatatype
		public RuleCall getValueIdDatatypeParserRuleCall_1_1_0_0() { return cValueIdDatatypeParserRuleCall_1_1_0_0; }
		
		//StringDatatype
		public RuleCall getValueStringDatatypeParserRuleCall_1_1_0_1() { return cValueStringDatatypeParserRuleCall_1_1_0_1; }
		
		//"datatypestring" value=StringDatatype
		public Group getGroup_2() { return cGroup_2; }
		
		//"datatypestring"
		public Keyword getDatatypestringKeyword_2_0() { return cDatatypestringKeyword_2_0; }
		
		//value=StringDatatype
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//StringDatatype
		public RuleCall getValueStringDatatypeParserRuleCall_2_1_0() { return cValueStringDatatypeParserRuleCall_2_1_0; }
	}
	public class MultiDatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.MultiDatatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDatatypeidsKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueIdDatatypeParserRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDatatypealternativesKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cValueAlternatives_1_1_0 = (Alternatives)cValueAssignment_1_1.eContents().get(0);
		private final RuleCall cValueIdDatatypeParserRuleCall_1_1_0_0 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cValueStringDatatypeParserRuleCall_1_1_0_1 = (RuleCall)cValueAlternatives_1_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cDatatypestringsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueStringDatatypeParserRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//MultiDatatype returns MultiValue:
		//      "datatypeids" value+=IdDatatype
		//  | "datatypealternatives" value+=(IdDatatype|StringDatatype)
		//  |    "datatypestrings" value+=StringDatatype;
		@Override public ParserRule getRule() { return rule; }
		
		//    "datatypeids" value+=IdDatatype
		//| "datatypealternatives" value+=(IdDatatype|StringDatatype)
		//|    "datatypestrings" value+=StringDatatype
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"datatypeids" value+=IdDatatype
		public Group getGroup_0() { return cGroup_0; }
		
		//"datatypeids"
		public Keyword getDatatypeidsKeyword_0_0() { return cDatatypeidsKeyword_0_0; }
		
		//value+=IdDatatype
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//IdDatatype
		public RuleCall getValueIdDatatypeParserRuleCall_0_1_0() { return cValueIdDatatypeParserRuleCall_0_1_0; }
		
		//"datatypealternatives" value+=(IdDatatype|StringDatatype)
		public Group getGroup_1() { return cGroup_1; }
		
		//"datatypealternatives"
		public Keyword getDatatypealternativesKeyword_1_0() { return cDatatypealternativesKeyword_1_0; }
		
		//value+=(IdDatatype|StringDatatype)
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//(IdDatatype|StringDatatype)
		public Alternatives getValueAlternatives_1_1_0() { return cValueAlternatives_1_1_0; }
		
		//IdDatatype
		public RuleCall getValueIdDatatypeParserRuleCall_1_1_0_0() { return cValueIdDatatypeParserRuleCall_1_1_0_0; }
		
		//StringDatatype
		public RuleCall getValueStringDatatypeParserRuleCall_1_1_0_1() { return cValueStringDatatypeParserRuleCall_1_1_0_1; }
		
		//"datatypestrings" value+=StringDatatype
		public Group getGroup_2() { return cGroup_2; }
		
		//"datatypestrings"
		public Keyword getDatatypestringsKeyword_2_0() { return cDatatypestringsKeyword_2_0; }
		
		//value+=StringDatatype
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//StringDatatype
		public RuleCall getValueStringDatatypeParserRuleCall_2_1_0() { return cValueStringDatatypeParserRuleCall_2_1_0; }
	}
	public class IdDatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.IdDatatype");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//IdDatatype: ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	public class StringDatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage.StringDatatype");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//StringDatatype: STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final SingleValueElements pSingleValue;
	private final MultiValueElements pMultiValue;
	private final SingleDatatypeElements pSingleDatatype;
	private final MultiDatatypeElements pMultiDatatype;
	private final IdDatatypeElements pIdDatatype;
	private final StringDatatypeElements pStringDatatype;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public AssignmentsTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSingleValue = new SingleValueElements();
		this.pMultiValue = new MultiValueElements();
		this.pSingleDatatype = new SingleDatatypeElements();
		this.pMultiDatatype = new MultiDatatypeElements();
		this.pIdDatatype = new IdDatatypeElements();
		this.pStringDatatype = new StringDatatypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.assignments.AssignmentsTestLanguage".equals(grammar.getName())) {
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
	//      'simple' (
	//      single = SingleValue
	//  | multi = MultiValue
	//  | single = SingleDatatype
	//  | multi = MultiDatatype )
	//  | 'complex' object=(
	//      SingleValue | MultiValue | SingleDatatype | MultiDatatype
	//  );
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//SingleValue:
	//      "id" value=ID
	//  | "alternative" value=(ID|STRING)
	//  |    "string" value=STRING;
	public SingleValueElements getSingleValueAccess() {
		return pSingleValue;
	}
	
	public ParserRule getSingleValueRule() {
		return getSingleValueAccess().getRule();
	}
	
	//MultiValue:
	//      "ids" value+=ID
	//  | "alternatives" value+=(ID|STRING)
	//  |    "strings" value+=STRING;
	public MultiValueElements getMultiValueAccess() {
		return pMultiValue;
	}
	
	public ParserRule getMultiValueRule() {
		return getMultiValueAccess().getRule();
	}
	
	//SingleDatatype returns SingleValue:
	//      "datatypeid" value=IdDatatype
	//  | "datatypealternative" value=(IdDatatype|StringDatatype)
	//  |    "datatypestring" value=StringDatatype;
	public SingleDatatypeElements getSingleDatatypeAccess() {
		return pSingleDatatype;
	}
	
	public ParserRule getSingleDatatypeRule() {
		return getSingleDatatypeAccess().getRule();
	}
	
	//MultiDatatype returns MultiValue:
	//      "datatypeids" value+=IdDatatype
	//  | "datatypealternatives" value+=(IdDatatype|StringDatatype)
	//  |    "datatypestrings" value+=StringDatatype;
	public MultiDatatypeElements getMultiDatatypeAccess() {
		return pMultiDatatype;
	}
	
	public ParserRule getMultiDatatypeRule() {
		return getMultiDatatypeAccess().getRule();
	}
	
	//IdDatatype: ID;
	public IdDatatypeElements getIdDatatypeAccess() {
		return pIdDatatype;
	}
	
	public ParserRule getIdDatatypeRule() {
		return getIdDatatypeAccess().getRule();
	}
	
	//StringDatatype: STRING;
	public StringDatatypeElements getStringDatatypeAccess() {
		return pStringDatatype;
	}
	
	public ParserRule getStringDatatypeRule() {
		return getStringDatatypeAccess().getRule();
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
