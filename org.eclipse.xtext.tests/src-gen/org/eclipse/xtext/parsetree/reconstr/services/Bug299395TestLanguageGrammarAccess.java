/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parsetree.reconstr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
public class Bug299395TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.Bug299395TestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cStringsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cStringsSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cStringsAssignment_1_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Assignment cKeysAssignment_2_1_0 = (Assignment)cGroup_2_1.eContents().get(0);
		private final RuleCall cKeysSTRINGTerminalRuleCall_2_1_0_0 = (RuleCall)cKeysAssignment_2_1_0.eContents().get(0);
		private final Assignment cValuesAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cValuesSTRINGTerminalRuleCall_2_1_1_0 = (RuleCall)cValuesAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cSubModelKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cSubModelAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cSubModelSubModelParserRuleCall_3_1_0 = (RuleCall)cSubModelAssignment_3_1.eContents().get(0);
		
		//Model: {Model}
		//    (
		//          '{'
		//        strings += STRING ?
		//           '}'
		//    )*
		//    (
		//        '['
		//        (    keys += STRING
		//            values += STRING
		//        )*
		//        ']'
		//    )*
		//    ('subModel' subModel=SubModel)?
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Model}
		//   (
		//         '{'
		//       strings += STRING ?
		//          '}'
		//   )*
		//   (
		//       '['
		//       (    keys += STRING
		//           values += STRING
		//       )*
		//       ']'
		//   )*
		//   ('subModel' subModel=SubModel)?
		public Group getGroup() { return cGroup; }
		
		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }
		
		//(
		//      '{'
		//    strings += STRING ?
		//       '}'
		//)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1_0() { return cLeftCurlyBracketKeyword_1_0; }
		
		//strings += STRING ?
		public Assignment getStringsAssignment_1_1() { return cStringsAssignment_1_1; }
		
		//STRING
		public RuleCall getStringsSTRINGTerminalRuleCall_1_1_0() { return cStringsSTRINGTerminalRuleCall_1_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_1_2() { return cRightCurlyBracketKeyword_1_2; }
		
		//(
		//    '['
		//    (    keys += STRING
		//        values += STRING
		//    )*
		//    ']'
		//)*
		public Group getGroup_2() { return cGroup_2; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//(    keys += STRING
		//    values += STRING
		//)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//keys += STRING
		public Assignment getKeysAssignment_2_1_0() { return cKeysAssignment_2_1_0; }
		
		//STRING
		public RuleCall getKeysSTRINGTerminalRuleCall_2_1_0_0() { return cKeysSTRINGTerminalRuleCall_2_1_0_0; }
		
		//values += STRING
		public Assignment getValuesAssignment_2_1_1() { return cValuesAssignment_2_1_1; }
		
		//STRING
		public RuleCall getValuesSTRINGTerminalRuleCall_2_1_1_0() { return cValuesSTRINGTerminalRuleCall_2_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }
		
		//('subModel' subModel=SubModel)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'subModel'
		public Keyword getSubModelKeyword_3_0() { return cSubModelKeyword_3_0; }
		
		//subModel=SubModel
		public Assignment getSubModelAssignment_3_1() { return cSubModelAssignment_3_1; }
		
		//SubModel
		public RuleCall getSubModelSubModelParserRuleCall_3_1_0() { return cSubModelSubModelParserRuleCall_3_1_0; }
	}
	public class SubModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.Bug299395TestLanguage.SubModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cSubModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cDigitOneKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cDigitTwoKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cStringsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cStringsSTRINGTerminalRuleCall_1_2_0 = (RuleCall)cStringsAssignment_1_2.eContents().get(0);
		
		//SubModel: {SubModel}
		//        (
		//             '1'
		//             '2'
		//             strings += STRING?
		//        )*
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//{SubModel}
		//       (
		//            '1'
		//            '2'
		//            strings += STRING?
		//       )*
		public Group getGroup() { return cGroup; }
		
		//{SubModel}
		public Action getSubModelAction_0() { return cSubModelAction_0; }
		
		//(
		//     '1'
		//     '2'
		//     strings += STRING?
		//)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'1'
		public Keyword getDigitOneKeyword_1_0() { return cDigitOneKeyword_1_0; }
		
		//'2'
		public Keyword getDigitTwoKeyword_1_1() { return cDigitTwoKeyword_1_1; }
		
		//strings += STRING?
		public Assignment getStringsAssignment_1_2() { return cStringsAssignment_1_2; }
		
		//STRING
		public RuleCall getStringsSTRINGTerminalRuleCall_1_2_0() { return cStringsSTRINGTerminalRuleCall_1_2_0; }
	}
	
	
	private final ModelElements pModel;
	private final SubModelElements pSubModel;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug299395TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pSubModel = new SubModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.reconstr.Bug299395TestLanguage".equals(grammar.getName())) {
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

	
	//Model: {Model}
	//    (
	//          '{'
	//        strings += STRING ?
	//           '}'
	//    )*
	//    (
	//        '['
	//        (    keys += STRING
	//            values += STRING
	//        )*
	//        ']'
	//    )*
	//    ('subModel' subModel=SubModel)?
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//SubModel: {SubModel}
	//        (
	//             '1'
	//             '2'
	//             strings += STRING?
	//        )*
	//    ;
	public SubModelElements getSubModelAccess() {
		return pSubModel;
	}
	
	public ParserRule getSubModelRule() {
		return getSubModelAccess().getRule();
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
