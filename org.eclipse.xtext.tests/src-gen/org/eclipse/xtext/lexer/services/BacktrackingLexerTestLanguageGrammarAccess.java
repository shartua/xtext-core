/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.lexer.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class BacktrackingLexerTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEnumsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEnumsEnumNameEnumRuleCall_0_0 = (RuleCall)cEnumsAssignment_0.eContents().get(0);
		private final Assignment cYcsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cYcsYcTerminalRuleCall_1_0 = (RuleCall)cYcsAssignment_1.eContents().get(0);
		private final Assignment cAbsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAbsAbParserRuleCall_2_0 = (RuleCall)cAbsAssignment_2.eContents().get(0);
		private final Assignment cXbsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cXbsXbParserRuleCall_3_0 = (RuleCall)cXbsAssignment_3.eContents().get(0);
		private final Assignment cYsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cYsCharYTerminalRuleCall_4_0 = (RuleCall)cYsAssignment_4.eContents().get(0);
		private final Assignment cAsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAsCharATerminalRuleCall_5_0 = (RuleCall)cAsAssignment_5.eContents().get(0);
		
		//Model :
		//    (enums+=EnumName)*
		//    (ycs+=Yc)*
		//    (abs+=Ab)*
		//    (xbs+=Xb)*
		//    (ys+=CharY)*
		//    (^as+=CharA)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(enums+=EnumName)*
		//(ycs+=Yc)*
		//(abs+=Ab)*
		//(xbs+=Xb)*
		//(ys+=CharY)*
		//(^as+=CharA)*
		public Group getGroup() { return cGroup; }
		
		//(enums+=EnumName)*
		public Assignment getEnumsAssignment_0() { return cEnumsAssignment_0; }
		
		//EnumName
		public RuleCall getEnumsEnumNameEnumRuleCall_0_0() { return cEnumsEnumNameEnumRuleCall_0_0; }
		
		//(ycs+=Yc)*
		public Assignment getYcsAssignment_1() { return cYcsAssignment_1; }
		
		//Yc
		public RuleCall getYcsYcTerminalRuleCall_1_0() { return cYcsYcTerminalRuleCall_1_0; }
		
		//(abs+=Ab)*
		public Assignment getAbsAssignment_2() { return cAbsAssignment_2; }
		
		//Ab
		public RuleCall getAbsAbParserRuleCall_2_0() { return cAbsAbParserRuleCall_2_0; }
		
		//(xbs+=Xb)*
		public Assignment getXbsAssignment_3() { return cXbsAssignment_3; }
		
		//Xb
		public RuleCall getXbsXbParserRuleCall_3_0() { return cXbsXbParserRuleCall_3_0; }
		
		//(ys+=CharY)*
		public Assignment getYsAssignment_4() { return cYsAssignment_4; }
		
		//CharY
		public RuleCall getYsCharYTerminalRuleCall_4_0() { return cYsCharYTerminalRuleCall_4_0; }
		
		//(^as+=CharA)*
		public Assignment getAsAssignment_5() { return cAsAssignment_5; }
		
		//CharA
		public RuleCall getAsCharATerminalRuleCall_5_0() { return cAsCharATerminalRuleCall_5_0; }
	}
	public class AbElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Ab");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cXAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cXCharATerminalRuleCall_0_0 = (RuleCall)cXAssignment_0.eContents().get(0);
		private final Assignment cYAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cYCharbTerminalRuleCall_1_0 = (RuleCall)cYAssignment_1.eContents().get(0);
		
		//Ab: x=CharA y=Charb;
		@Override public ParserRule getRule() { return rule; }
		
		//x=CharA y=Charb
		public Group getGroup() { return cGroup; }
		
		//x=CharA
		public Assignment getXAssignment_0() { return cXAssignment_0; }
		
		//CharA
		public RuleCall getXCharATerminalRuleCall_0_0() { return cXCharATerminalRuleCall_0_0; }
		
		//y=Charb
		public Assignment getYAssignment_1() { return cYAssignment_1; }
		
		//Charb
		public RuleCall getYCharbTerminalRuleCall_1_0() { return cYCharbTerminalRuleCall_1_0; }
	}
	public class XbElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Xb");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cXAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cXCharXTerminalRuleCall_0_0 = (RuleCall)cXAssignment_0.eContents().get(0);
		private final Assignment cYAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cYCharbTerminalRuleCall_1_0 = (RuleCall)cYAssignment_1.eContents().get(0);
		
		//Xb: x=CharX y=Charb;
		@Override public ParserRule getRule() { return rule; }
		
		//x=CharX y=Charb
		public Group getGroup() { return cGroup; }
		
		//x=CharX
		public Assignment getXAssignment_0() { return cXAssignment_0; }
		
		//CharX
		public RuleCall getXCharXTerminalRuleCall_0_0() { return cXCharXTerminalRuleCall_0_0; }
		
		//y=Charb
		public Assignment getYAssignment_1() { return cYAssignment_1; }
		
		//Charb
		public RuleCall getYCharbTerminalRuleCall_1_0() { return cYCharbTerminalRuleCall_1_0; }
	}
	
	public class EnumNameElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.EnumName");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cAbcEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cAbcAbcKeyword_0_0 = (Keyword)cAbcEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cEfgEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cEfgEfgKeyword_1_0 = (Keyword)cEfgEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum EnumName: abc='Abc'|efg="Efg";
		public EnumRule getRule() { return rule; }
		
		//abc='Abc'|efg="Efg"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//abc='Abc'
		public EnumLiteralDeclaration getAbcEnumLiteralDeclaration_0() { return cAbcEnumLiteralDeclaration_0; }
		
		//'Abc'
		public Keyword getAbcAbcKeyword_0_0() { return cAbcAbcKeyword_0_0; }
		
		//efg="Efg"
		public EnumLiteralDeclaration getEfgEnumLiteralDeclaration_1() { return cEfgEnumLiteralDeclaration_1; }
		
		//"Efg"
		public Keyword getEfgEfgKeyword_1_0() { return cEfgEfgKeyword_1_0; }
	}
	
	private final ModelElements pModel;
	private final AbElements pAb;
	private final XbElements pXb;
	private final TerminalRule tCharA;
	private final TerminalRule tCharb;
	private final TerminalRule tCharX;
	private final TerminalRule tYc;
	private final TerminalRule tCharY;
	private final TerminalRule tCharC;
	private final EnumNameElements eEnumName;
	private final TerminalRule tWS;
	private final TerminalRule tSL_COMMENT;
	
	private final Grammar grammar;

	@Inject
	public BacktrackingLexerTestLanguageGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pModel = new ModelElements();
		this.pAb = new AbElements();
		this.pXb = new XbElements();
		this.tCharA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharA");
		this.tCharb = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Charb");
		this.tCharX = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharX");
		this.tYc = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Yc");
		this.tCharY = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharY");
		this.tCharC = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharC");
		this.eEnumName = new EnumNameElements();
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.WS");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.SL_COMMENT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage".equals(grammar.getName())) {
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
	

	
	//Model :
	//    (enums+=EnumName)*
	//    (ycs+=Yc)*
	//    (abs+=Ab)*
	//    (xbs+=Xb)*
	//    (ys+=CharY)*
	//    (^as+=CharA)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Ab: x=CharA y=Charb;
	public AbElements getAbAccess() {
		return pAb;
	}
	
	public ParserRule getAbRule() {
		return getAbAccess().getRule();
	}
	
	//Xb: x=CharX y=Charb;
	public XbElements getXbAccess() {
		return pXb;
	}
	
	public ParserRule getXbRule() {
		return getXbAccess().getRule();
	}
	
	//terminal CharA: 'A';
	public TerminalRule getCharARule() {
		return tCharA;
	}
	
	//terminal Charb: 'b';
	public TerminalRule getCharbRule() {
		return tCharb;
	}
	
	//terminal CharX: 'X';
	public TerminalRule getCharXRule() {
		return tCharX;
	}
	
	//terminal Yc: CharY CharC;
	public TerminalRule getYcRule() {
		return tYc;
	}
	
	//terminal CharY: 'Y';
	public TerminalRule getCharYRule() {
		return tCharY;
	}
	
	//terminal CharC: 'c';
	public TerminalRule getCharCRule() {
		return tCharC;
	}
	
	//enum EnumName: abc='Abc'|efg="Efg";
	public EnumNameElements getEnumNameAccess() {
		return eEnumName;
	}
	
	public EnumRule getEnumNameRule() {
		return getEnumNameAccess().getRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
}
