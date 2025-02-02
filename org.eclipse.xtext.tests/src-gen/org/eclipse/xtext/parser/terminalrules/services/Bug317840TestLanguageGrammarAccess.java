/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.terminalrules.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class Bug317840TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.Model");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//Model:
		//    elements+=Element*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Element*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_0() { return cElementsElementParserRuleCall_0; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.Element");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFirstAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cFirstNamedParserRuleCall_1_0 = (RuleCall)cFirstAssignment_1.eContents().get(0);
		private final Assignment cSecondAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSecondNamedParserRuleCall_2_0 = (RuleCall)cSecondAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cThirdAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cThirdNamedParserRuleCall_3_0_0 = (RuleCall)cThirdAssignment_3_0.eContents().get(0);
		private final Assignment cForthAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cForthNamedParserRuleCall_3_1_0 = (RuleCall)cForthAssignment_3_1.eContents().get(0);
		
		//Element:
		//    "element" first=Named second=Named? (third+=Named forth+=Named)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//"element" first=Named second=Named? (third+=Named forth+=Named)*
		public Group getGroup() { return cGroup; }
		
		//"element"
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }
		
		//first=Named
		public Assignment getFirstAssignment_1() { return cFirstAssignment_1; }
		
		//Named
		public RuleCall getFirstNamedParserRuleCall_1_0() { return cFirstNamedParserRuleCall_1_0; }
		
		//second=Named?
		public Assignment getSecondAssignment_2() { return cSecondAssignment_2; }
		
		//Named
		public RuleCall getSecondNamedParserRuleCall_2_0() { return cSecondNamedParserRuleCall_2_0; }
		
		//(third+=Named forth+=Named)*
		public Group getGroup_3() { return cGroup_3; }
		
		//third+=Named
		public Assignment getThirdAssignment_3_0() { return cThirdAssignment_3_0; }
		
		//Named
		public RuleCall getThirdNamedParserRuleCall_3_0_0() { return cThirdNamedParserRuleCall_3_0_0; }
		
		//forth+=Named
		public Assignment getForthAssignment_3_1() { return cForthAssignment_3_1; }
		
		//Named
		public RuleCall getForthNamedParserRuleCall_3_1_0() { return cForthNamedParserRuleCall_3_1_0; }
	}
	public class NamedElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.Named");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameNAMEParserRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//Named:
		//    name = NAME
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//name = NAME
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//NAME
		public RuleCall getNameNAMEParserRuleCall_0() { return cNameNAMEParserRuleCall_0; }
	}
	public class NAMEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage.NAME");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//NAME hidden():
		//    ID ('.' ID)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final ModelElements pModel;
	private final ElementElements pElement;
	private final NamedElements pNamed;
	private final NAMEElements pNAME;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug317840TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pElement = new ElementElements();
		this.pNamed = new NamedElements();
		this.pNAME = new NAMEElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.terminalrules.Bug317840TestLanguage".equals(grammar.getName())) {
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
	//    elements+=Element*
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element:
	//    "element" first=Named second=Named? (third+=Named forth+=Named)*
	//;
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//Named:
	//    name = NAME
	//;
	public NamedElements getNamedAccess() {
		return pNamed;
	}
	
	public ParserRule getNamedRule() {
		return getNamedAccess().getRule();
	}
	
	//NAME hidden():
	//    ID ('.' ID)*
	//;
	public NAMEElements getNAMEAccess() {
		return pNAME;
	}
	
	public ParserRule getNAMERule() {
		return getNAMEAccess().getRule();
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
