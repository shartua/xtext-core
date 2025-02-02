/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.datatyperules.services;

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
public class DatatypeRulesTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class CompositeModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.CompositeModel");
		private final Assignment cModelAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cModelModelParserRuleCall_0 = (RuleCall)cModelAssignment.eContents().get(0);
		
		//CompositeModel:
		//  (model+=Model)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(model+=Model)+
		public Assignment getModelAssignment() { return cModelAssignment; }
		
		//Model
		public RuleCall getModelModelParserRuleCall_0() { return cModelModelParserRuleCall_0; }
	}
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIdAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIdNestedModelIdParserRuleCall_0_0 = (RuleCall)cIdAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cColonKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueFractionParserRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cNumberSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVectorAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cVectorVectorParserRuleCall_2_1_0 = (RuleCall)cVectorAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cPlusSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cDotsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cDotsDotsParserRuleCall_3_1_0 = (RuleCall)cDotsAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cAsteriskKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cDoubleAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cDoubleDoubleParserRuleCall_4_1_0 = (RuleCall)cDoubleAssignment_4_1.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Model:
		//  id=NestedModelId (':' value=Fraction)? ('#' vector=Vector)? ('+' dots=Dots)? ('*' double=Double)? ';';
		@Override public ParserRule getRule() { return rule; }
		
		//id=NestedModelId (':' value=Fraction)? ('#' vector=Vector)? ('+' dots=Dots)? ('*' double=Double)? ';'
		public Group getGroup() { return cGroup; }
		
		//id=NestedModelId
		public Assignment getIdAssignment_0() { return cIdAssignment_0; }
		
		//NestedModelId
		public RuleCall getIdNestedModelIdParserRuleCall_0_0() { return cIdNestedModelIdParserRuleCall_0_0; }
		
		//(':' value=Fraction)?
		public Group getGroup_1() { return cGroup_1; }
		
		//':'
		public Keyword getColonKeyword_1_0() { return cColonKeyword_1_0; }
		
		//value=Fraction
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//Fraction
		public RuleCall getValueFractionParserRuleCall_1_1_0() { return cValueFractionParserRuleCall_1_1_0; }
		
		//('#' vector=Vector)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'#'
		public Keyword getNumberSignKeyword_2_0() { return cNumberSignKeyword_2_0; }
		
		//vector=Vector
		public Assignment getVectorAssignment_2_1() { return cVectorAssignment_2_1; }
		
		//Vector
		public RuleCall getVectorVectorParserRuleCall_2_1_0() { return cVectorVectorParserRuleCall_2_1_0; }
		
		//('+' dots=Dots)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'+'
		public Keyword getPlusSignKeyword_3_0() { return cPlusSignKeyword_3_0; }
		
		//dots=Dots
		public Assignment getDotsAssignment_3_1() { return cDotsAssignment_3_1; }
		
		//Dots
		public RuleCall getDotsDotsParserRuleCall_3_1_0() { return cDotsDotsParserRuleCall_3_1_0; }
		
		//('*' double=Double)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'*'
		public Keyword getAsteriskKeyword_4_0() { return cAsteriskKeyword_4_0; }
		
		//double=Double
		public Assignment getDoubleAssignment_4_1() { return cDoubleAssignment_4_1; }
		
		//Double
		public RuleCall getDoubleDoubleParserRuleCall_4_1_0() { return cDoubleDoubleParserRuleCall_4_1_0; }
		
		//';'
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}
	public class ModelIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.ModelId");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//ModelId returns ecore::EString:
		//  ID '.' ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID '.' ID
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
	}
	public class NestedModelIdElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.NestedModelId");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cModelIdParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cModelIdParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NestedModelId :
		//  ModelId '.' ModelId;
		@Override public ParserRule getRule() { return rule; }
		
		//ModelId '.' ModelId
		public Group getGroup() { return cGroup; }
		
		//ModelId
		public RuleCall getModelIdParserRuleCall_0() { return cModelIdParserRuleCall_0; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//ModelId
		public RuleCall getModelIdParserRuleCall_2() { return cModelIdParserRuleCall_2; }
	}
	public class FractionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Fraction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cSolidusKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//Fraction returns ecore::EBigDecimal:
		//  INT ('/' INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//INT ('/' INT)?
		public Group getGroup() { return cGroup; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//('/' INT)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'/'
		public Keyword getSolidusKeyword_1_0() { return cSolidusKeyword_1_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1_1() { return cINTTerminalRuleCall_1_1; }
	}
	public class VectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Vector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Vector :
		//  '(' INT INT ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'(' INT INT ')'
		public Group getGroup() { return cGroup; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0() { return cLeftParenthesisKeyword_0; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_2() { return cINTTerminalRuleCall_2; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class DotsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Dots");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cFullStopKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cFullStopKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cFullStopFullStopKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Dots returns ecore::EString:
		//  ( '.' '.' ) | '..';
		@Override public ParserRule getRule() { return rule; }
		
		//( '.' '.' ) | '..'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//( '.' '.' )
		public Group getGroup_0() { return cGroup_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_0() { return cFullStopKeyword_0_0; }
		
		//'.'
		public Keyword getFullStopKeyword_0_1() { return cFullStopKeyword_0_1; }
		
		//'..'
		public Keyword getFullStopFullStopKeyword_1() { return cFullStopFullStopKeyword_1; }
	}
	public class DoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage.Double");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//Double returns ecore::EDouble:
		//    '-'? INT? '.' INT ('E' '-'? INT)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'-'? INT? '.' INT ('E' '-'? INT)?
		public Group getGroup() { return cGroup; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }
		
		//('E' '-'? INT)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'E'
		public Keyword getEKeyword_4_0() { return cEKeyword_4_0; }
		
		//'-'?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	
	
	private final CompositeModelElements pCompositeModel;
	private final ModelElements pModel;
	private final ModelIdElements pModelId;
	private final NestedModelIdElements pNestedModelId;
	private final FractionElements pFraction;
	private final VectorElements pVector;
	private final DotsElements pDots;
	private final DoubleElements pDouble;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public DatatypeRulesTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pCompositeModel = new CompositeModelElements();
		this.pModel = new ModelElements();
		this.pModelId = new ModelIdElements();
		this.pNestedModelId = new NestedModelIdElements();
		this.pFraction = new FractionElements();
		this.pVector = new VectorElements();
		this.pDots = new DotsElements();
		this.pDouble = new DoubleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.datatyperules.DatatypeRulesTestLanguage".equals(grammar.getName())) {
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

	
	//CompositeModel:
	//  (model+=Model)+;
	public CompositeModelElements getCompositeModelAccess() {
		return pCompositeModel;
	}
	
	public ParserRule getCompositeModelRule() {
		return getCompositeModelAccess().getRule();
	}
	
	//Model:
	//  id=NestedModelId (':' value=Fraction)? ('#' vector=Vector)? ('+' dots=Dots)? ('*' double=Double)? ';';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ModelId returns ecore::EString:
	//  ID '.' ID;
	public ModelIdElements getModelIdAccess() {
		return pModelId;
	}
	
	public ParserRule getModelIdRule() {
		return getModelIdAccess().getRule();
	}
	
	//NestedModelId :
	//  ModelId '.' ModelId;
	public NestedModelIdElements getNestedModelIdAccess() {
		return pNestedModelId;
	}
	
	public ParserRule getNestedModelIdRule() {
		return getNestedModelIdAccess().getRule();
	}
	
	//Fraction returns ecore::EBigDecimal:
	//  INT ('/' INT)?;
	public FractionElements getFractionAccess() {
		return pFraction;
	}
	
	public ParserRule getFractionRule() {
		return getFractionAccess().getRule();
	}
	
	//Vector :
	//  '(' INT INT ')';
	public VectorElements getVectorAccess() {
		return pVector;
	}
	
	public ParserRule getVectorRule() {
		return getVectorAccess().getRule();
	}
	
	//Dots returns ecore::EString:
	//  ( '.' '.' ) | '..';
	public DotsElements getDotsAccess() {
		return pDots;
	}
	
	public ParserRule getDotsRule() {
		return getDotsAccess().getRule();
	}
	
	//Double returns ecore::EDouble:
	//    '-'? INT? '.' INT ('E' '-'? INT)?;
	public DoubleElements getDoubleAccess() {
		return pDouble;
	}
	
	public ParserRule getDoubleRule() {
		return getDoubleAccess().getRule();
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
