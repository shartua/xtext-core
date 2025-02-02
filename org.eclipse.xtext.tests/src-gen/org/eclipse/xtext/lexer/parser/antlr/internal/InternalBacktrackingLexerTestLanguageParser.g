/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
parser grammar InternalBacktrackingLexerTestLanguageParser;

options {
	tokenVocab=InternalBacktrackingLexerTestLanguageLexer;
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
	memoize=true;
}

@header {
package org.eclipse.xtext.lexer.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.lexer.services.BacktrackingLexerTestLanguageGrammarAccess;

}

@members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private BacktrackingLexerTestLanguageGrammarAccess grammarAccess;

    public InternalBacktrackingLexerTestLanguageParser(TokenStream input, BacktrackingLexerTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected BacktrackingLexerTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getEnumsEnumNameEnumRuleCall_0_0());
				}
				lv_enums_0_0=ruleEnumName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"enums",
						lv_enums_0_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.EnumName");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_ycs_1_0=RULE_YC
				{
					newLeafNode(lv_ycs_1_0, grammarAccess.getModelAccess().getYcsYcTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					addWithLastConsumed(
						$current,
						"ycs",
						lv_ycs_1_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Yc");
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getAbsAbParserRuleCall_2_0());
				}
				lv_abs_2_0=ruleAb
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"abs",
						lv_abs_2_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Ab");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getXbsXbParserRuleCall_3_0());
				}
				lv_xbs_3_0=ruleXb
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"xbs",
						lv_xbs_3_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Xb");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				lv_ys_4_0=RULE_CHARY
				{
					newLeafNode(lv_ys_4_0, grammarAccess.getModelAccess().getYsCharYTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					addWithLastConsumed(
						$current,
						"ys",
						lv_ys_4_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharY");
				}
			)
		)*
		(
			(
				lv_as_5_0=RULE_CHARA
				{
					newLeafNode(lv_as_5_0, grammarAccess.getModelAccess().getAsCharATerminalRuleCall_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					addWithLastConsumed(
						$current,
						"as",
						lv_as_5_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharA");
				}
			)
		)*
	)
;

// Entry rule entryRuleAb
entryRuleAb returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbRule()); }
	iv_ruleAb=ruleAb
	{ $current=$iv_ruleAb.current; }
	EOF;

// Rule Ab
ruleAb returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_x_0_0=RULE_CHARA
				{
					newLeafNode(lv_x_0_0, grammarAccess.getAbAccess().getXCharATerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_0_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharA");
				}
			)
		)
		(
			(
				lv_y_1_0=RULE_CHARB
				{
					newLeafNode(lv_y_1_0, grammarAccess.getAbAccess().getYCharbTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_1_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Charb");
				}
			)
		)
	)
;

// Entry rule entryRuleXb
entryRuleXb returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXbRule()); }
	iv_ruleXb=ruleXb
	{ $current=$iv_ruleXb.current; }
	EOF;

// Rule Xb
ruleXb returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_x_0_0=RULE_CHARX
				{
					newLeafNode(lv_x_0_0, grammarAccess.getXbAccess().getXCharXTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXbRule());
					}
					setWithLastConsumed(
						$current,
						"x",
						lv_x_0_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.CharX");
				}
			)
		)
		(
			(
				lv_y_1_0=RULE_CHARB
				{
					newLeafNode(lv_y_1_0, grammarAccess.getXbAccess().getYCharbTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getXbRule());
					}
					setWithLastConsumed(
						$current,
						"y",
						lv_y_1_0,
						"org.eclipse.xtext.lexer.BacktrackingLexerTestLanguage.Charb");
				}
			)
		)
	)
;

// Rule EnumName
ruleEnumName returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0=Abc
			{
				$current = grammarAccess.getEnumNameAccess().getAbcEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEnumNameAccess().getAbcEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1=Efg
			{
				$current = grammarAccess.getEnumNameAccess().getEfgEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEnumNameAccess().getEfgEnumLiteralDeclaration_1());
			}
		)
	)
;
