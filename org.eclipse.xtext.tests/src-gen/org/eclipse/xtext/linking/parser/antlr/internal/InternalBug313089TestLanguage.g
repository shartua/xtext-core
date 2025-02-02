/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug313089TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.linking.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.linking.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.linking.services.Bug313089TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug313089TestLanguageGrammarAccess grammarAccess;

    public InternalBug313089TestLanguageParser(TokenStream input, Bug313089TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Foo";
   	}

   	@Override
   	protected Bug313089TestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFoo
entryRuleFoo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFooRule()); }
	iv_ruleFoo=ruleFoo
	{ $current=$iv_ruleFoo.current; }
	EOF;

// Rule Foo
ruleFoo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getFooAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFooRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFooAccess().getBarBarParserRuleCall_1_0_0());
					}
					lv_bar_1_0=ruleBar
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFooRule());
						}
						set(
							$current,
							"bar",
							lv_bar_1_0,
							"org.eclipse.xtext.linking.Bug313089TestLanguage.Bar");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFooAccess().getBazBazParserRuleCall_1_1_0());
					}
					lv_baz_2_0=ruleBaz
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFooRule());
						}
						set(
							$current,
							"baz",
							lv_baz_2_0,
							"org.eclipse.xtext.linking.Bug313089TestLanguage.Baz");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFooRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getFooAccess().getRefFooCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleBar
entryRuleBar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBarRule()); }
	iv_ruleBar=ruleBar
	{ $current=$iv_ruleBar.current; }
	EOF;

// Rule Bar
ruleBar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBarAccess().getBarAction_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBarAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBarRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleBaz
entryRuleBaz returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBazRule()); }
	iv_ruleBaz=ruleBaz
	{ $current=$iv_ruleBaz.current; }
	EOF;

// Rule Baz
ruleBaz returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='baz'
		{
			newLeafNode(otherlv_0, grammarAccess.getBazAccess().getBazKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBazAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBazRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getBazAccess().getBazChildAction_2_0(),
						$current);
				}
			)
			otherlv_3='baz'
			{
				newLeafNode(otherlv_3, grammarAccess.getBazAccess().getBazKeyword_2_1());
			}
			(
				(
					lv_name_4_0=RULE_ID
					{
						newLeafNode(lv_name_4_0, grammarAccess.getBazAccess().getNameIDTerminalRuleCall_2_2_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBazRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)*
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
