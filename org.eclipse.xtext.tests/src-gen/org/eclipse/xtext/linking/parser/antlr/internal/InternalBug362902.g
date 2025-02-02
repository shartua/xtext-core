/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug362902;

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
import org.eclipse.xtext.linking.services.Bug362902GrammarAccess;

}

@parser::members {

 	private Bug362902GrammarAccess grammarAccess;

    public InternalBug362902Parser(TokenStream input, Bug362902GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected Bug362902GrammarAccess getGrammarAccess() {
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
					newCompositeNode(grammarAccess.getModelAccess().getGreetingsGreetingParserRuleCall_0_0());
				}
				lv_greetings_0_0=ruleGreeting
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					add(
						$current,
						"greetings",
						lv_greetings_0_0,
						"org.eclipse.xtext.linking.Bug362902.Greeting");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_1='favourite'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getFavouriteKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getModelAccess().getFavouriteGreetingCrossReference_2_0());
				}
				ruleMyId
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleGreeting
entryRuleGreeting returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGreetingRule()); }
	iv_ruleGreeting=ruleGreeting
	{ $current=$iv_ruleGreeting.current; }
	EOF;

// Rule Greeting
ruleGreeting returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='Hello'
		{
			newLeafNode(otherlv_0, grammarAccess.getGreetingAccess().getHelloKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGreetingAccess().getNameMyIdParserRuleCall_1_0());
				}
				lv_name_1_0=ruleMyId
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGreetingRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.linking.Bug362902.MyId");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='!'
		{
			newLeafNode(otherlv_2, grammarAccess.getGreetingAccess().getExclamationMarkKeyword_2());
		}
	)
;

// Entry rule entryRuleMyId
entryRuleMyId returns [String current=null]:
	{ newCompositeNode(grammarAccess.getMyIdRule()); }
	iv_ruleMyId=ruleMyId
	{ $current=$iv_ruleMyId.current.getText(); }
	EOF;

// Rule MyId
ruleMyId returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_ID_0=RULE_ID
	{
		$current.merge(this_ID_0);
	}
	{
		newLeafNode(this_ID_0, grammarAccess.getMyIdAccess().getIDTerminalRuleCall());
	}
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
