/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ActionTestLanguage3GrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ProductionRulesElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ActionTestLanguage3.ProductionRules");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cProductionRule1ParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cProductionRule2ParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//ProductionRules:
		//    ProductionRule1 | ProductionRule2
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ProductionRule1 | ProductionRule2
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ProductionRule1
		public RuleCall getProductionRule1ParserRuleCall_0() { return cProductionRule1ParserRuleCall_0; }
		
		//ProductionRule2
		public RuleCall getProductionRule2ParserRuleCall_1() { return cProductionRule2ParserRuleCall_1; }
	}
	public class ProductionRule1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ActionTestLanguage3.ProductionRule1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cP1Action_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cIdAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cIdIDTerminalRuleCall_1_0 = (RuleCall)cIdAssignment_1.eContents().get(0);
		private final Action cP2PAction_2 = (Action)cGroup.eContents().get(2);
		private final Assignment cStringAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cStringSTRINGTerminalRuleCall_3_0 = (RuleCall)cStringAssignment_3.eContents().get(0);
		private final Action cP3PAction_4 = (Action)cGroup.eContents().get(4);
		private final Assignment cIAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cIINTTerminalRuleCall_5_0 = (RuleCall)cIAssignment_5.eContents().get(0);
		
		//ProductionRule1:
		//  {P1} id=ID? {P2.p=current} string=STRING? {P3.p=current} i=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//{P1} id=ID? {P2.p=current} string=STRING? {P3.p=current} i=INT
		public Group getGroup() { return cGroup; }
		
		//{P1}
		public Action getP1Action_0() { return cP1Action_0; }
		
		//id=ID?
		public Assignment getIdAssignment_1() { return cIdAssignment_1; }
		
		//ID
		public RuleCall getIdIDTerminalRuleCall_1_0() { return cIdIDTerminalRuleCall_1_0; }
		
		//{P2.p=current}
		public Action getP2PAction_2() { return cP2PAction_2; }
		
		//string=STRING?
		public Assignment getStringAssignment_3() { return cStringAssignment_3; }
		
		//STRING
		public RuleCall getStringSTRINGTerminalRuleCall_3_0() { return cStringSTRINGTerminalRuleCall_3_0; }
		
		//{P3.p=current}
		public Action getP3PAction_4() { return cP3PAction_4; }
		
		//i=INT
		public Assignment getIAssignment_5() { return cIAssignment_5; }
		
		//INT
		public RuleCall getIINTTerminalRuleCall_5_0() { return cIINTTerminalRuleCall_5_0; }
	}
	public class ProductionRule2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ActionTestLanguage3.ProductionRule2");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Action cEntryAction_1 = (Action)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//ProductionRule2:
		//    STRING /* unassigned */ {Entry} name=ID
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING /* unassigned */ {Entry} name=ID
		public Group getGroup() { return cGroup; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		///* unassigned */ {Entry}
		public Action getEntryAction_1() { return cEntryAction_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}
	
	
	private final ProductionRulesElements pProductionRules;
	private final ProductionRule1Elements pProductionRule1;
	private final ProductionRule2Elements pProductionRule2;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ActionTestLanguage3GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pProductionRules = new ProductionRulesElements();
		this.pProductionRule1 = new ProductionRule1Elements();
		this.pProductionRule2 = new ProductionRule2Elements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.ActionTestLanguage3".equals(grammar.getName())) {
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

	
	//ProductionRules:
	//    ProductionRule1 | ProductionRule2
	//;
	public ProductionRulesElements getProductionRulesAccess() {
		return pProductionRules;
	}
	
	public ParserRule getProductionRulesRule() {
		return getProductionRulesAccess().getRule();
	}
	
	//ProductionRule1:
	//  {P1} id=ID? {P2.p=current} string=STRING? {P3.p=current} i=INT;
	public ProductionRule1Elements getProductionRule1Access() {
		return pProductionRule1;
	}
	
	public ParserRule getProductionRule1Rule() {
		return getProductionRule1Access().getRule();
	}
	
	//ProductionRule2:
	//    STRING /* unassigned */ {Entry} name=ID
	//;
	public ProductionRule2Elements getProductionRule2Access() {
		return pProductionRule2;
	}
	
	public ParserRule getProductionRule2Rule() {
		return getProductionRule2Access().getRule();
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
