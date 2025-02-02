/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.keywords.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class KeywordsTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.keywords.KeywordsTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFirstAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cFirstFooBarKeyword_0_0 = (Keyword)cFirstAssignment_0.eContents().get(0);
		private final Assignment cSecondAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final Keyword cSecondFooKeyword_1_0 = (Keyword)cSecondAssignment_1.eContents().get(0);
		private final Assignment cThirdAssignment_2 = (Assignment)cAlternatives.eContents().get(2);
		private final Keyword cThirdBarKeyword_2_0 = (Keyword)cThirdAssignment_2.eContents().get(0);
		private final Assignment cForthAssignment_3 = (Assignment)cAlternatives.eContents().get(3);
		private final Keyword cForthBackslashKeyword_3_0 = (Keyword)cForthAssignment_3.eContents().get(0);
		private final Assignment cFifthAssignment_4 = (Assignment)cAlternatives.eContents().get(4);
		private final Keyword cFifthAKeyword_4_0 = (Keyword)cFifthAssignment_4.eContents().get(0);
		private final Assignment cSixthAssignment_5 = (Assignment)cAlternatives.eContents().get(5);
		private final Keyword cSixthBKeyword_5_0 = (Keyword)cSixthAssignment_5.eContents().get(0);
		private final Assignment cSeventhAssignment_6 = (Assignment)cAlternatives.eContents().get(6);
		private final Keyword cSeventhCKeyword_6_0 = (Keyword)cSeventhAssignment_6.eContents().get(0);
		private final Assignment cEighthAssignment_7 = (Assignment)cAlternatives.eContents().get(7);
		private final Keyword cEighthDKeyword_7_0 = (Keyword)cEighthAssignment_7.eContents().get(0);
		
		//Model:
		//  first?="foo\\bar" | second?="foo\\" | third?="\\bar" | forth?="\\" |
		//  fifth?="\"a\"" | sixth?='\'b\'' | seventh?="'c'" | eighth?='"d"';
		@Override public ParserRule getRule() { return rule; }
		
		//first?="foo\\bar" | second?="foo\\" | third?="\\bar" | forth?="\\" |
		//fifth?="\"a\"" | sixth?='\'b\'' | seventh?="'c'" | eighth?='"d"'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//first?="foo\\bar"
		public Assignment getFirstAssignment_0() { return cFirstAssignment_0; }
		
		//"foo\\bar"
		public Keyword getFirstFooBarKeyword_0_0() { return cFirstFooBarKeyword_0_0; }
		
		//second?="foo\\"
		public Assignment getSecondAssignment_1() { return cSecondAssignment_1; }
		
		//"foo\\"
		public Keyword getSecondFooKeyword_1_0() { return cSecondFooKeyword_1_0; }
		
		//third?="\\bar"
		public Assignment getThirdAssignment_2() { return cThirdAssignment_2; }
		
		//"\\bar"
		public Keyword getThirdBarKeyword_2_0() { return cThirdBarKeyword_2_0; }
		
		//forth?="\\"
		public Assignment getForthAssignment_3() { return cForthAssignment_3; }
		
		//"\\"
		public Keyword getForthBackslashKeyword_3_0() { return cForthBackslashKeyword_3_0; }
		
		//fifth?="\"a\""
		public Assignment getFifthAssignment_4() { return cFifthAssignment_4; }
		
		//"\"a\""
		public Keyword getFifthAKeyword_4_0() { return cFifthAKeyword_4_0; }
		
		//sixth?='\'b\''
		public Assignment getSixthAssignment_5() { return cSixthAssignment_5; }
		
		//'\'b\''
		public Keyword getSixthBKeyword_5_0() { return cSixthBKeyword_5_0; }
		
		//seventh?="'c'"
		public Assignment getSeventhAssignment_6() { return cSeventhAssignment_6; }
		
		//"'c'"
		public Keyword getSeventhCKeyword_6_0() { return cSeventhCKeyword_6_0; }
		
		//eighth?='"d"'
		public Assignment getEighthAssignment_7() { return cEighthAssignment_7; }
		
		//'"d"'
		public Keyword getEighthDKeyword_7_0() { return cEighthDKeyword_7_0; }
	}
	
	
	private final ModelElements pModel;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public KeywordsTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.keywords.KeywordsTestLanguage".equals(grammar.getName())) {
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
	//  first?="foo\\bar" | second?="foo\\" | third?="\\bar" | forth?="\\" |
	//  fifth?="\"a\"" | sixth?='\'b\'' | seventh?="'c'" | eighth?='"d"';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
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
