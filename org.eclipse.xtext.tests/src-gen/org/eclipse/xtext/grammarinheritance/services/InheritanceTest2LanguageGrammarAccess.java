/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.grammarinheritance.services;

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
public class InheritanceTest2LanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.grammarinheritance.InheritanceTest2Language.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cElementsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cElementsElementParserRuleCall_3_0 = (RuleCall)cElementsAssignment_3.eContents().get(0);
		private final Assignment cIdsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cIdsFQNParserRuleCall_4_0 = (RuleCall)cIdsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//@Override
		//Model:
		//    "model" name=ID "{"
		//        elements+=Element*
		//        ids+=FQN
		//    "}"
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//"model" name=ID "{"
		//    elements+=Element*
		//    ids+=FQN
		//"}"
		public Group getGroup() { return cGroup; }
		
		//"model"
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//elements+=Element*
		public Assignment getElementsAssignment_3() { return cElementsAssignment_3; }
		
		//Element
		public RuleCall getElementsElementParserRuleCall_3_0() { return cElementsElementParserRuleCall_3_0; }
		
		//ids+=FQN
		public Assignment getIdsAssignment_4() { return cIdsAssignment_4; }
		
		//FQN
		public RuleCall getIdsFQNParserRuleCall_4_0() { return cIdsFQNParserRuleCall_4_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	
	private final ModelElements pModel;
	
	private final Grammar grammar;
	
	private final InheritanceTestLanguageGrammarAccess gaInheritanceTestLanguage;
	
	private final BaseInheritanceTestLanguageGrammarAccess gaBaseInheritanceTestLanguage;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public InheritanceTest2LanguageGrammarAccess(GrammarProvider grammarProvider,
			InheritanceTestLanguageGrammarAccess gaInheritanceTestLanguage,
			BaseInheritanceTestLanguageGrammarAccess gaBaseInheritanceTestLanguage,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaInheritanceTestLanguage = gaInheritanceTestLanguage;
		this.gaBaseInheritanceTestLanguage = gaBaseInheritanceTestLanguage;
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.grammarinheritance.InheritanceTest2Language".equals(grammar.getName())) {
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
	
	
	public InheritanceTestLanguageGrammarAccess getInheritanceTestLanguageGrammarAccess() {
		return gaInheritanceTestLanguage;
	}
	
	public BaseInheritanceTestLanguageGrammarAccess getBaseInheritanceTestLanguageGrammarAccess() {
		return gaBaseInheritanceTestLanguage;
	}
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//@Override
	//Model:
	//    "model" name=ID "{"
	//        elements+=Element*
	//        ids+=FQN
	//    "}"
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Element :
	//    "element" name=ID
	//;
	public InheritanceTestLanguageGrammarAccess.ElementElements getElementAccess() {
		return gaInheritanceTestLanguage.getElementAccess();
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//@Override
	//terminal ID: ('a'..'z')+;
	public TerminalRule getIDRule() {
		return gaInheritanceTestLanguage.getIDRule();
	}
	
	//FQN: ID ('.' ID)*;
	public BaseInheritanceTestLanguageGrammarAccess.FQNElements getFQNAccess() {
		return gaBaseInheritanceTestLanguage.getFQNAccess();
	}
	
	public ParserRule getFQNRule() {
		return getFQNAccess().getRule();
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
