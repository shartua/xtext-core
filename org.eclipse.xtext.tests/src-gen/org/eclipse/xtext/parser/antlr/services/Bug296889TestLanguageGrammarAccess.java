/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.parser.antlr.services;

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
public class Bug296889TestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cModelKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cExpressionsAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cExpressionsExpressionParserRuleCall_0_1_0 = (RuleCall)cExpressionsAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cDataTypeKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cValuesAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValuesDataTypeExpressionParserRuleCall_1_1_0 = (RuleCall)cValuesAssignment_1_1.eContents().get(0);
		
		///* SuppressWarnings[noInstantiation] */
		//Model: "Model" expressions += Expression* | "DataType" values += DataTypeExpression* ;
		@Override public ParserRule getRule() { return rule; }
		
		//"Model" expressions += Expression* | "DataType" values += DataTypeExpression*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"Model" expressions += Expression*
		public Group getGroup_0() { return cGroup_0; }
		
		//"Model"
		public Keyword getModelKeyword_0_0() { return cModelKeyword_0_0; }
		
		//expressions += Expression*
		public Assignment getExpressionsAssignment_0_1() { return cExpressionsAssignment_0_1; }
		
		//Expression
		public RuleCall getExpressionsExpressionParserRuleCall_0_1_0() { return cExpressionsExpressionParserRuleCall_0_1_0; }
		
		//"DataType" values += DataTypeExpression*
		public Group getGroup_1() { return cGroup_1; }
		
		//"DataType"
		public Keyword getDataTypeKeyword_1_0() { return cDataTypeKeyword_1_0; }
		
		//values += DataTypeExpression*
		public Assignment getValuesAssignment_1_1() { return cValuesAssignment_1_1; }
		
		//DataTypeExpression
		public RuleCall getValuesDataTypeExpressionParserRuleCall_1_1_0() { return cValuesDataTypeExpressionParserRuleCall_1_1_0; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.Expression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPostopParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cPreopParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Expression: Postop | Preop ;
		@Override public ParserRule getRule() { return rule; }
		
		//Postop | Preop
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Postop
		public RuleCall getPostopParserRuleCall_0() { return cPostopParserRuleCall_0; }
		
		//Preop
		public RuleCall getPreopParserRuleCall_1() { return cPreopParserRuleCall_1; }
	}
	public class PreopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.Preop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPreopAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cFunctionNameHyphenMinusHyphenMinusKeyword_1_0 = (Keyword)cFunctionNameAssignment_1.eContents().get(0);
		private final Assignment cExprAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExprVariableParserRuleCall_2_0 = (RuleCall)cExprAssignment_2.eContents().get(0);
		
		//Preop returns Expression: {Preop} functionName="--" expr=Variable;
		@Override public ParserRule getRule() { return rule; }
		
		//{Preop} functionName="--" expr=Variable
		public Group getGroup() { return cGroup; }
		
		//{Preop}
		public Action getPreopAction_0() { return cPreopAction_0; }
		
		//functionName="--"
		public Assignment getFunctionNameAssignment_1() { return cFunctionNameAssignment_1; }
		
		//"--"
		public Keyword getFunctionNameHyphenMinusHyphenMinusKeyword_1_0() { return cFunctionNameHyphenMinusHyphenMinusKeyword_1_0; }
		
		//expr=Variable
		public Assignment getExprAssignment_2() { return cExprAssignment_2; }
		
		//Variable
		public RuleCall getExprVariableParserRuleCall_2_0() { return cExprVariableParserRuleCall_2_0; }
	}
	public class PostopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.Postop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cPostopExprAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFunctionNameAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Keyword cFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0 = (Keyword)cFunctionNameAssignment_1_1.eContents().get(0);
		
		//Postop returns Expression: Variable ({Postop.expr=current} functionName = "--")? ;
		@Override public ParserRule getRule() { return rule; }
		
		//Variable ({Postop.expr=current} functionName = "--")?
		public Group getGroup() { return cGroup; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_0() { return cVariableParserRuleCall_0; }
		
		//({Postop.expr=current} functionName = "--")?
		public Group getGroup_1() { return cGroup_1; }
		
		//{Postop.expr=current}
		public Action getPostopExprAction_1_0() { return cPostopExprAction_1_0; }
		
		//functionName = "--"
		public Assignment getFunctionNameAssignment_1_1() { return cFunctionNameAssignment_1_1; }
		
		//"--"
		public Keyword getFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0() { return cFunctionNameHyphenMinusHyphenMinusKeyword_1_1_0; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cVariableAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Variable returns Expression: {Variable} name = ID ;
		@Override public ParserRule getRule() { return rule; }
		
		//{Variable} name = ID
		public Group getGroup() { return cGroup; }
		
		//{Variable}
		public Action getVariableAction_0() { return cVariableAction_0; }
		
		//name = ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class DataTypeExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.DataTypeExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDataTypePostopParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDataTypePreopParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DataTypeExpression: DataTypePostop | DataTypePreop ;
		@Override public ParserRule getRule() { return rule; }
		
		//DataTypePostop | DataTypePreop
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DataTypePostop
		public RuleCall getDataTypePostopParserRuleCall_0() { return cDataTypePostopParserRuleCall_0; }
		
		//DataTypePreop
		public RuleCall getDataTypePreopParserRuleCall_1() { return cDataTypePreopParserRuleCall_1; }
	}
	public class DataTypePreopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.DataTypePreop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cDataTypeVariableParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//DataTypePreop: "--" DataTypeVariable;
		@Override public ParserRule getRule() { return rule; }
		
		//"--" DataTypeVariable
		public Group getGroup() { return cGroup; }
		
		//"--"
		public Keyword getHyphenMinusHyphenMinusKeyword_0() { return cHyphenMinusHyphenMinusKeyword_0; }
		
		//DataTypeVariable
		public RuleCall getDataTypeVariableParserRuleCall_1() { return cDataTypeVariableParserRuleCall_1; }
	}
	public class DataTypePostopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.DataTypePostop");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDataTypeVariableParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cHyphenMinusHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//DataTypePostop: DataTypeVariable ("--")? ;
		@Override public ParserRule getRule() { return rule; }
		
		//DataTypeVariable ("--")?
		public Group getGroup() { return cGroup; }
		
		//DataTypeVariable
		public RuleCall getDataTypeVariableParserRuleCall_0() { return cDataTypeVariableParserRuleCall_0; }
		
		//("--")?
		public Keyword getHyphenMinusHyphenMinusKeyword_1() { return cHyphenMinusHyphenMinusKeyword_1; }
	}
	public class DataTypeVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parser.antlr.Bug296889TestLanguage.DataTypeVariable");
		private final RuleCall cIDTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//DataTypeVariable: ID ;
		@Override public ParserRule getRule() { return rule; }
		
		//ID
		public RuleCall getIDTerminalRuleCall() { return cIDTerminalRuleCall; }
	}
	
	
	private final ModelElements pModel;
	private final ExpressionElements pExpression;
	private final PreopElements pPreop;
	private final PostopElements pPostop;
	private final VariableElements pVariable;
	private final DataTypeExpressionElements pDataTypeExpression;
	private final DataTypePreopElements pDataTypePreop;
	private final DataTypePostopElements pDataTypePostop;
	private final DataTypeVariableElements pDataTypeVariable;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Bug296889TestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pExpression = new ExpressionElements();
		this.pPreop = new PreopElements();
		this.pPostop = new PostopElements();
		this.pVariable = new VariableElements();
		this.pDataTypeExpression = new DataTypeExpressionElements();
		this.pDataTypePreop = new DataTypePreopElements();
		this.pDataTypePostop = new DataTypePostopElements();
		this.pDataTypeVariable = new DataTypeVariableElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parser.antlr.Bug296889TestLanguage".equals(grammar.getName())) {
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

	
	///* SuppressWarnings[noInstantiation] */
	//Model: "Model" expressions += Expression* | "DataType" values += DataTypeExpression* ;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Expression: Postop | Preop ;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//Preop returns Expression: {Preop} functionName="--" expr=Variable;
	public PreopElements getPreopAccess() {
		return pPreop;
	}
	
	public ParserRule getPreopRule() {
		return getPreopAccess().getRule();
	}
	
	//Postop returns Expression: Variable ({Postop.expr=current} functionName = "--")? ;
	public PostopElements getPostopAccess() {
		return pPostop;
	}
	
	public ParserRule getPostopRule() {
		return getPostopAccess().getRule();
	}
	
	//Variable returns Expression: {Variable} name = ID ;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//DataTypeExpression: DataTypePostop | DataTypePreop ;
	public DataTypeExpressionElements getDataTypeExpressionAccess() {
		return pDataTypeExpression;
	}
	
	public ParserRule getDataTypeExpressionRule() {
		return getDataTypeExpressionAccess().getRule();
	}
	
	//DataTypePreop: "--" DataTypeVariable;
	public DataTypePreopElements getDataTypePreopAccess() {
		return pDataTypePreop;
	}
	
	public ParserRule getDataTypePreopRule() {
		return getDataTypePreopAccess().getRule();
	}
	
	//DataTypePostop: DataTypeVariable ("--")? ;
	public DataTypePostopElements getDataTypePostopAccess() {
		return pDataTypePostop;
	}
	
	public ParserRule getDataTypePostopRule() {
		return getDataTypePostopAccess().getRule();
	}
	
	//DataTypeVariable: ID ;
	public DataTypeVariableElements getDataTypeVariableAccess() {
		return pDataTypeVariable;
	}
	
	public ParserRule getDataTypeVariableRule() {
		return getDataTypeVariableAccess().getRule();
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
