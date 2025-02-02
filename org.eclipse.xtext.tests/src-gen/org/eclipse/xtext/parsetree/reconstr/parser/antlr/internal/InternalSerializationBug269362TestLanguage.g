/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalSerializationBug269362TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parsetree.reconstr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parsetree.reconstr.services.SerializationBug269362TestLanguageGrammarAccess;

}

@parser::members {

 	private SerializationBug269362TestLanguageGrammarAccess grammarAccess;

    public InternalSerializationBug269362TestLanguageParser(TokenStream input, SerializationBug269362TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SerializationBug269362TestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='foo'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFooKeyword_0_0());
			}
			(
				(
					lv_foo_1_0=RULE_ID
					{
						newLeafNode(lv_foo_1_0, grammarAccess.getModelAccess().getFooIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed(
							$current,
							"foo",
							lv_foo_1_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				otherlv_2='bar'
				{
					newLeafNode(otherlv_2, grammarAccess.getModelAccess().getBarKeyword_0_2_0());
				}
				(
					(
						lv_bar_3_0=RULE_ID
						{
							newLeafNode(lv_bar_3_0, grammarAccess.getModelAccess().getBarIDTerminalRuleCall_0_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							setWithLastConsumed(
								$current,
								"bar",
								lv_bar_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)?
		)
		    |
		(
			otherlv_4='bar'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getBarKeyword_1_0());
			}
			(
				(
					lv_bar_5_0=RULE_ID
					{
						newLeafNode(lv_bar_5_0, grammarAccess.getModelAccess().getBarIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed(
							$current,
							"bar",
							lv_bar_5_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
