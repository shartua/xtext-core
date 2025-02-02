/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.valueconverter.services;

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
public class Bug250313GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.valueconverter.Bug250313.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cDigitOneKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final Alternatives cValueAlternatives_0_1_0 = (Alternatives)cValueAssignment_0_1.eContents().get(0);
		private final Keyword cValueMykeyword1Keyword_0_1_0_0 = (Keyword)cValueAlternatives_0_1_0.eContents().get(0);
		private final RuleCall cValueSTRINGTerminalRuleCall_0_1_0_1 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(1);
		private final RuleCall cValueNestedDatatypeParserRuleCall_0_1_0_2 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(2);
		private final RuleCall cValueDatatypeParserRuleCall_0_1_0_3 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(3);
		private final RuleCall cValueIDTerminalRuleCall_0_1_0_4 = (RuleCall)cValueAlternatives_0_1_0.eContents().get(4);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDigitOnePlusSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cMultiValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cMultiValueAlternatives_1_1_0 = (Alternatives)cMultiValueAssignment_1_1.eContents().get(0);
		private final Keyword cMultiValueMykeyword1Keyword_1_1_0_0 = (Keyword)cMultiValueAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cMultiValueSTRINGTerminalRuleCall_1_1_0_1 = (RuleCall)cMultiValueAlternatives_1_1_0.eContents().get(1);
		private final RuleCall cMultiValueNestedDatatypeParserRuleCall_1_1_0_2 = (RuleCall)cMultiValueAlternatives_1_1_0.eContents().get(2);
		private final RuleCall cMultiValueDatatypeParserRuleCall_1_1_0_3 = (RuleCall)cMultiValueAlternatives_1_1_0.eContents().get(3);
		private final RuleCall cMultiValueIDTerminalRuleCall_1_1_0_4 = (RuleCall)cMultiValueAlternatives_1_1_0.eContents().get(4);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cDigitTwoKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cDigitTwoPlusSignKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cMultiValueAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cMultiValueSTRINGTerminalRuleCall_3_1_0 = (RuleCall)cMultiValueAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cDigitThreeKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cValueAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cValueDatatypeParserRuleCall_4_1_0 = (RuleCall)cValueAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Keyword cDigitThreePlusSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cMultiValueAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cMultiValueDatatypeParserRuleCall_5_1_0 = (RuleCall)cMultiValueAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Keyword cDigitFourKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cValueAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cValueNestedDatatypeParserRuleCall_6_1_0 = (RuleCall)cValueAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Keyword cDigitFourPlusSignKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cMultiValueAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cMultiValueNestedDatatypeParserRuleCall_7_1_0 = (RuleCall)cMultiValueAssignment_7_1.eContents().get(0);
		private final Group cGroup_8 = (Group)cAlternatives.eContents().get(8);
		private final Keyword cContentKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cChildrenAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cChildrenChildParserRuleCall_8_1_0 = (RuleCall)cChildrenAssignment_8_1.eContents().get(0);
		
		//Model:    ('1'? value = ('mykeyword1' | STRING | NestedDatatype | Datatype | ID ) )
		//        | ('1+' multiValue += ('mykeyword1' | STRING | NestedDatatype | Datatype | ID ) )
		//        | ('2' value = STRING)
		//        | ('2+' multiValue += STRING)
		//        | ('3' value = Datatype)
		//        | ('3+' multiValue += Datatype)
		//        | ('4' value = NestedDatatype)
		//        | ('4+' multiValue += NestedDatatype)
		//        |
		//          ('content' children = Child);
		@Override public ParserRule getRule() { return rule; }
		
		//('1'? value = ('mykeyword1' | STRING | NestedDatatype | Datatype | ID ) )
		//    | ('1+' multiValue += ('mykeyword1' | STRING | NestedDatatype | Datatype | ID ) )
		//    | ('2' value = STRING)
		//    | ('2+' multiValue += STRING)
		//    | ('3' value = Datatype)
		//    | ('3+' multiValue += Datatype)
		//    | ('4' value = NestedDatatype)
		//    | ('4+' multiValue += NestedDatatype)
		//    |
		//      ('content' children = Child)
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//('1'? value = ('mykeyword1' | STRING | NestedDatatype | Datatype | ID ) )
		public Group getGroup_0() { return cGroup_0; }
		
		//'1'?
		public Keyword getDigitOneKeyword_0_0() { return cDigitOneKeyword_0_0; }
		
		//value = ('mykeyword1' | STRING | NestedDatatype | Datatype | ID )
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//('mykeyword1' | STRING | NestedDatatype | Datatype | ID )
		public Alternatives getValueAlternatives_0_1_0() { return cValueAlternatives_0_1_0; }
		
		//'mykeyword1'
		public Keyword getValueMykeyword1Keyword_0_1_0_0() { return cValueMykeyword1Keyword_0_1_0_0; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0_1_0_1() { return cValueSTRINGTerminalRuleCall_0_1_0_1; }
		
		//NestedDatatype
		public RuleCall getValueNestedDatatypeParserRuleCall_0_1_0_2() { return cValueNestedDatatypeParserRuleCall_0_1_0_2; }
		
		//Datatype
		public RuleCall getValueDatatypeParserRuleCall_0_1_0_3() { return cValueDatatypeParserRuleCall_0_1_0_3; }
		
		//ID
		public RuleCall getValueIDTerminalRuleCall_0_1_0_4() { return cValueIDTerminalRuleCall_0_1_0_4; }
		
		//('1+' multiValue += ('mykeyword1' | STRING | NestedDatatype | Datatype | ID ) )
		public Group getGroup_1() { return cGroup_1; }
		
		//'1+'
		public Keyword getDigitOnePlusSignKeyword_1_0() { return cDigitOnePlusSignKeyword_1_0; }
		
		//multiValue += ('mykeyword1' | STRING | NestedDatatype | Datatype | ID )
		public Assignment getMultiValueAssignment_1_1() { return cMultiValueAssignment_1_1; }
		
		//('mykeyword1' | STRING | NestedDatatype | Datatype | ID )
		public Alternatives getMultiValueAlternatives_1_1_0() { return cMultiValueAlternatives_1_1_0; }
		
		//'mykeyword1'
		public Keyword getMultiValueMykeyword1Keyword_1_1_0_0() { return cMultiValueMykeyword1Keyword_1_1_0_0; }
		
		//STRING
		public RuleCall getMultiValueSTRINGTerminalRuleCall_1_1_0_1() { return cMultiValueSTRINGTerminalRuleCall_1_1_0_1; }
		
		//NestedDatatype
		public RuleCall getMultiValueNestedDatatypeParserRuleCall_1_1_0_2() { return cMultiValueNestedDatatypeParserRuleCall_1_1_0_2; }
		
		//Datatype
		public RuleCall getMultiValueDatatypeParserRuleCall_1_1_0_3() { return cMultiValueDatatypeParserRuleCall_1_1_0_3; }
		
		//ID
		public RuleCall getMultiValueIDTerminalRuleCall_1_1_0_4() { return cMultiValueIDTerminalRuleCall_1_1_0_4; }
		
		//('2' value = STRING)
		public Group getGroup_2() { return cGroup_2; }
		
		//'2'
		public Keyword getDigitTwoKeyword_2_0() { return cDigitTwoKeyword_2_0; }
		
		//value = STRING
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_2_1_0() { return cValueSTRINGTerminalRuleCall_2_1_0; }
		
		//('2+' multiValue += STRING)
		public Group getGroup_3() { return cGroup_3; }
		
		//'2+'
		public Keyword getDigitTwoPlusSignKeyword_3_0() { return cDigitTwoPlusSignKeyword_3_0; }
		
		//multiValue += STRING
		public Assignment getMultiValueAssignment_3_1() { return cMultiValueAssignment_3_1; }
		
		//STRING
		public RuleCall getMultiValueSTRINGTerminalRuleCall_3_1_0() { return cMultiValueSTRINGTerminalRuleCall_3_1_0; }
		
		//('3' value = Datatype)
		public Group getGroup_4() { return cGroup_4; }
		
		//'3'
		public Keyword getDigitThreeKeyword_4_0() { return cDigitThreeKeyword_4_0; }
		
		//value = Datatype
		public Assignment getValueAssignment_4_1() { return cValueAssignment_4_1; }
		
		//Datatype
		public RuleCall getValueDatatypeParserRuleCall_4_1_0() { return cValueDatatypeParserRuleCall_4_1_0; }
		
		//('3+' multiValue += Datatype)
		public Group getGroup_5() { return cGroup_5; }
		
		//'3+'
		public Keyword getDigitThreePlusSignKeyword_5_0() { return cDigitThreePlusSignKeyword_5_0; }
		
		//multiValue += Datatype
		public Assignment getMultiValueAssignment_5_1() { return cMultiValueAssignment_5_1; }
		
		//Datatype
		public RuleCall getMultiValueDatatypeParserRuleCall_5_1_0() { return cMultiValueDatatypeParserRuleCall_5_1_0; }
		
		//('4' value = NestedDatatype)
		public Group getGroup_6() { return cGroup_6; }
		
		//'4'
		public Keyword getDigitFourKeyword_6_0() { return cDigitFourKeyword_6_0; }
		
		//value = NestedDatatype
		public Assignment getValueAssignment_6_1() { return cValueAssignment_6_1; }
		
		//NestedDatatype
		public RuleCall getValueNestedDatatypeParserRuleCall_6_1_0() { return cValueNestedDatatypeParserRuleCall_6_1_0; }
		
		//('4+' multiValue += NestedDatatype)
		public Group getGroup_7() { return cGroup_7; }
		
		//'4+'
		public Keyword getDigitFourPlusSignKeyword_7_0() { return cDigitFourPlusSignKeyword_7_0; }
		
		//multiValue += NestedDatatype
		public Assignment getMultiValueAssignment_7_1() { return cMultiValueAssignment_7_1; }
		
		//NestedDatatype
		public RuleCall getMultiValueNestedDatatypeParserRuleCall_7_1_0() { return cMultiValueNestedDatatypeParserRuleCall_7_1_0; }
		
		//('content' children = Child)
		public Group getGroup_8() { return cGroup_8; }
		
		//'content'
		public Keyword getContentKeyword_8_0() { return cContentKeyword_8_0; }
		
		//children = Child
		public Assignment getChildrenAssignment_8_1() { return cChildrenAssignment_8_1; }
		
		//Child
		public RuleCall getChildrenChildParserRuleCall_8_1_0() { return cChildrenChildParserRuleCall_8_1_0; }
	}
	public class DatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.valueconverter.Bug250313.Datatype");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//Datatype: ID '-' ID;
		@Override public ParserRule getRule() { return rule; }
		
		//ID '-' ID
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1() { return cHyphenMinusKeyword_1; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_2() { return cIDTerminalRuleCall_2; }
	}
	public class NestedDatatypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.valueconverter.Bug250313.NestedDatatype");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cPlusSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final RuleCall cDatatypeParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NestedDatatype: ID '+' Datatype?;
		@Override public ParserRule getRule() { return rule; }
		
		//ID '+' Datatype?
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1() { return cPlusSignKeyword_1; }
		
		//Datatype?
		public RuleCall getDatatypeParserRuleCall_2() { return cDatatypeParserRuleCall_2; }
	}
	public class ChildElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.valueconverter.Bug250313.Child");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cChild1ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cChild2ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Child: Child1 | Child2;
		@Override public ParserRule getRule() { return rule; }
		
		//Child1 | Child2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Child1
		public RuleCall getChild1ParserRuleCall_0() { return cChild1ParserRuleCall_0; }
		
		//Child2
		public RuleCall getChild2ParserRuleCall_1() { return cChild2ParserRuleCall_1; }
	}
	public class Child1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.valueconverter.Bug250313.Child1");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Child1: name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class Child2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.valueconverter.Bug250313.Child2");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Child2: name=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//name=STRING
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_0() { return cNameSTRINGTerminalRuleCall_0; }
	}
	
	
	private final ModelElements pModel;
	private final DatatypeElements pDatatype;
	private final NestedDatatypeElements pNestedDatatype;
	private final ChildElements pChild;
	private final Child1Elements pChild1;
	private final Child2Elements pChild2;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug250313GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pDatatype = new DatatypeElements();
		this.pNestedDatatype = new NestedDatatypeElements();
		this.pChild = new ChildElements();
		this.pChild1 = new Child1Elements();
		this.pChild2 = new Child2Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.valueconverter.Bug250313".equals(grammar.getName())) {
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

	
	//Model:    ('1'? value = ('mykeyword1' | STRING | NestedDatatype | Datatype | ID ) )
	//        | ('1+' multiValue += ('mykeyword1' | STRING | NestedDatatype | Datatype | ID ) )
	//        | ('2' value = STRING)
	//        | ('2+' multiValue += STRING)
	//        | ('3' value = Datatype)
	//        | ('3+' multiValue += Datatype)
	//        | ('4' value = NestedDatatype)
	//        | ('4+' multiValue += NestedDatatype)
	//        |
	//          ('content' children = Child);
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Datatype: ID '-' ID;
	public DatatypeElements getDatatypeAccess() {
		return pDatatype;
	}
	
	public ParserRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}
	
	//NestedDatatype: ID '+' Datatype?;
	public NestedDatatypeElements getNestedDatatypeAccess() {
		return pNestedDatatype;
	}
	
	public ParserRule getNestedDatatypeRule() {
		return getNestedDatatypeAccess().getRule();
	}
	
	//Child: Child1 | Child2;
	public ChildElements getChildAccess() {
		return pChild;
	}
	
	public ParserRule getChildRule() {
		return getChildAccess().getRule();
	}
	
	//Child1: name=ID;
	public Child1Elements getChild1Access() {
		return pChild1;
	}
	
	public ParserRule getChild1Rule() {
		return getChild1Access().getRule();
	}
	
	//Child2: name=STRING;
	public Child2Elements getChild2Access() {
		return pChild2;
	}
	
	public ParserRule getChild2Rule() {
		return getChild2Access().getRule();
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
