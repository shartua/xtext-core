/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalBug288432TestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.assignments.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.assignments.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.assignments.services.Bug288432TestLanguageGrammarAccess;

}

@parser::members {

 	private Bug288432TestLanguageGrammarAccess grammarAccess;

    public InternalBug288432TestLanguageParser(TokenStream input, Bug288432TestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Body";
   	}

   	@Override
   	protected Bug288432TestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleBody
entryRuleBody returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBodyRule()); }
	iv_ruleBody=ruleBody
	{ $current=$iv_ruleBody.current; }
	EOF;

// Rule Body
ruleBody returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getBodyAccess().getLeftParenthesisKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getBodyAccess().getParameterParameterParserRuleCall_0_1_0());
					}
					lv_parameter_1_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBodyRule());
						}
						add(
							$current,
							"parameter",
							lv_parameter_1_0,
							"org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_2=','
				{
					newLeafNode(otherlv_2, grammarAccess.getBodyAccess().getCommaKeyword_0_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getBodyAccess().getParameterParameterParserRuleCall_0_2_1_0());
						}
						lv_parameter_3_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getBodyRule());
							}
							add(
								$current,
								"parameter",
								lv_parameter_3_0,
								"org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getBodyAccess().getRightParenthesisKeyword_0_3());
			}
		)?
		otherlv_5='body'
		{
			newLeafNode(otherlv_5, grammarAccess.getBodyAccess().getBodyKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getBodyAccess().getContentContentParserRuleCall_2_0_0());
					}
					lv_content_6_1=ruleContent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBodyRule());
						}
						set(
							$current,
							"content",
							lv_content_6_1,
							"org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.Content");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getBodyAccess().getContentParameterRefParserRuleCall_2_0_1());
					}
					lv_content_6_2=ruleParameterRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getBodyRule());
						}
						set(
							$current,
							"content",
							lv_content_6_2,
							"org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.ParameterRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBodyAccess().getFooFooParserRuleCall_3_0());
				}
				lv_foo_7_0=ruleFoo
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBodyRule());
					}
					add(
						$current,
						"foo",
						lv_foo_7_0,
						"org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.Foo");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		otherlv_8='end body'
		{
			newLeafNode(otherlv_8, grammarAccess.getBodyAccess().getEndBodyKeyword_4());
		}
	)
;

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
			lv_fooValue_0_0=RULE_STRING
			{
				newLeafNode(lv_fooValue_0_0, grammarAccess.getFooAccess().getFooValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFooRule());
				}
				setWithLastConsumed(
					$current,
					"fooValue",
					lv_fooValue_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleContent
entryRuleContent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getContentRule()); }
	iv_ruleContent=ruleContent
	{ $current=$iv_ruleContent.current; }
	EOF;

// Rule Content
ruleContent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='content'
		{
			newLeafNode(otherlv_0, grammarAccess.getContentAccess().getContentKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getContentAccess().getMyElementParserRuleCall_1());
		}
		this_MyElement_1=ruleMyElement
		{
			$current = $this_MyElement_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2='end content'
		{
			newLeafNode(otherlv_2, grammarAccess.getContentAccess().getEndContentKeyword_2());
		}
	)
;

// Entry rule entryRuleMyElement
entryRuleMyElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMyElementRule()); }
	iv_ruleMyElement=ruleMyElement
	{ $current=$iv_ruleMyElement.current; }
	EOF;

// Rule MyElement
ruleMyElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='element'
		{
			newLeafNode(otherlv_0, grammarAccess.getMyElementAccess().getElementKeyword_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMyElementAccess().getBarMyIntParserRuleCall_1_0_0());
					}
					lv_bar_1_1=ruleMyInt
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMyElementRule());
						}
						set(
							$current,
							"bar",
							lv_bar_1_1,
							"org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.MyInt");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getMyElementAccess().getBarParameterRefParserRuleCall_1_0_1());
					}
					lv_bar_1_2=ruleParameterRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMyElementRule());
						}
						set(
							$current,
							"bar",
							lv_bar_1_2,
							"org.eclipse.xtext.parser.assignments.Bug288432TestLanguage.ParameterRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
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
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getValueParameterObjectCrossReference_1_0());
				}
			)
		)?
	)
;

// Entry rule entryRuleParameterRef
entryRuleParameterRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRefRule()); }
	iv_ruleParameterRef=ruleParameterRef
	{ $current=$iv_ruleParameterRef.current; }
	EOF;

// Rule ParameterRef
ruleParameterRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getParameterRefRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getParameterRefAccess().getParameterParameterCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleMyInt
entryRuleMyInt returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMyIntRule()); }
	iv_ruleMyInt=ruleMyInt
	{ $current=$iv_ruleMyInt.current; }
	EOF;

// Rule MyInt
ruleMyInt returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_int_0_0=RULE_INT
			{
				newLeafNode(lv_int_0_0, grammarAccess.getMyIntAccess().getIntINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getMyIntRule());
				}
				setWithLastConsumed(
					$current,
					"int",
					lv_int_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
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
