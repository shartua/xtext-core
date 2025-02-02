/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalFormatterTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parsetree.formatter.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parsetree.formatter.parser.antlr.internal;

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
import org.eclipse.xtext.parsetree.formatter.services.FormatterTestLanguageGrammarAccess;

}

@parser::members {

 	private FormatterTestLanguageGrammarAccess grammarAccess;

    public InternalFormatterTestLanguageParser(TokenStream input, FormatterTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Root";
   	}

   	@Override
   	protected FormatterTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleRoot
entryRuleRoot returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRootRule()); }
	iv_ruleRoot=ruleRoot
	{ $current=$iv_ruleRoot.current; }
	EOF;

// Rule Root
ruleRoot returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='test'
		{
			newLeafNode(otherlv_0, grammarAccess.getRootAccess().getTestKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getRootAccess().getTestLinewrapParserRuleCall_1_0());
			}
			this_TestLinewrap_1=ruleTestLinewrap
			{
				$current = $this_TestLinewrap_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getRootAccess().getTestIndentationParserRuleCall_1_1());
			}
			this_TestIndentation_2=ruleTestIndentation
			{
				$current = $this_TestIndentation_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getRootAccess().getTestLinewrapMinMaxParserRuleCall_1_2());
			}
			this_TestLinewrapMinMax_3=ruleTestLinewrapMinMax
			{
				$current = $this_TestLinewrapMinMax_3.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getRootAccess().getWrappingDataTypeTestParserRuleCall_1_3());
			}
			this_WrappingDataTypeTest_4=ruleWrappingDataTypeTest
			{
				$current = $this_WrappingDataTypeTest_4.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleLine
entryRuleLine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLineRule()); }
	iv_ruleLine=ruleLine
	{ $current=$iv_ruleLine.current; }
	EOF;

// Rule Line
ruleLine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getLineAccess().getDeclParserRuleCall_0_0());
			}
			this_Decl_0=ruleDecl
			{
				$current = $this_Decl_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getLineAccess().getAssignParserRuleCall_0_1());
			}
			this_Assign_1=ruleAssign
			{
				$current = $this_Assign_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getLineAccess().getMethParserRuleCall_0_2());
			}
			this_Meth_2=ruleMeth
			{
				$current = $this_Meth_2.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getLineAccess().getFqnObjParserRuleCall_0_3());
			}
			this_FqnObj_3=ruleFqnObj
			{
				$current = $this_FqnObj_3.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getLineAccess().getFqnRefParserRuleCall_0_4());
			}
			this_FqnRef_4=ruleFqnRef
			{
				$current = $this_FqnRef_4.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getLineAccess().getEnumerationParserRuleCall_0_5());
			}
			this_Enumeration_5=ruleEnumeration
			{
				$current = $this_Enumeration_5.current;
				afterParserOrEnumRuleCall();
			}
			    |
			(
				{
					newCompositeNode(grammarAccess.getLineAccess().getSuppressedHiddenParserRuleCall_0_6_0());
				}
				this_SuppressedHidden_6=ruleSuppressedHidden
				{
					$current = $this_SuppressedHidden_6.current;
					afterParserOrEnumRuleCall();
				}
				otherlv_7='post'
				{
					newLeafNode(otherlv_7, grammarAccess.getLineAccess().getPostKeyword_0_6_1());
				}
			)
			    |
			{
				newCompositeNode(grammarAccess.getLineAccess().getSpaceParserRuleCall_0_7());
			}
			this_Space_8=ruleSpace
			{
				$current = $this_Space_8.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getLineAccess().getDatatypesParserRuleCall_0_8());
			}
			this_Datatypes_9=ruleDatatypes
			{
				$current = $this_Datatypes_9.current;
				afterParserOrEnumRuleCall();
			}
		)
		otherlv_10=';'
		{
			newLeafNode(otherlv_10, grammarAccess.getLineAccess().getSemicolonKeyword_1());
		}
	)
;

// Entry rule entryRuleDecl
entryRuleDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeclRule()); }
	iv_ruleDecl=ruleDecl
	{ $current=$iv_ruleDecl.current; }
	EOF;

// Rule Decl
ruleDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_type_0_0=RULE_ID
				{
					newLeafNode(lv_type_0_0, grammarAccess.getDeclAccess().getTypeIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeclRule());
					}
					addWithLastConsumed(
						$current,
						"type",
						lv_type_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDeclAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDeclRule());
					}
					addWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleAssign
entryRuleAssign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignRule()); }
	iv_ruleAssign=ruleAssign
	{ $current=$iv_ruleAssign.current; }
	EOF;

// Rule Assign
ruleAssign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_var_0_0=RULE_ID
				{
					newLeafNode(lv_var_0_0, grammarAccess.getAssignAccess().getVarIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignRule());
					}
					setWithLastConsumed(
						$current,
						"var",
						lv_var_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					lv_op_1_1='='
					{
						newLeafNode(lv_op_1_1, grammarAccess.getAssignAccess().getOpEqualsSignKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignRule());
						}
						setWithLastConsumed($current, "op", lv_op_1_1, null);
					}
					    |
					lv_op_1_2='+='
					{
						newLeafNode(lv_op_1_2, grammarAccess.getAssignAccess().getOpPlusSignEqualsSignKeyword_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignRule());
						}
						setWithLastConsumed($current, "op", lv_op_1_2, null);
					}
				)
			)
		)
		otherlv_2='['
		{
			newLeafNode(otherlv_2, grammarAccess.getAssignAccess().getLeftSquareBracketKeyword_2());
		}
		(
			(
				(
					lv_val_3_0=RULE_INT
					{
						newLeafNode(lv_val_3_0, grammarAccess.getAssignAccess().getValINTTerminalRuleCall_3_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignRule());
						}
						addWithLastConsumed(
							$current,
							"val",
							lv_val_3_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getAssignAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						lv_val_5_0=RULE_INT
						{
							newLeafNode(lv_val_5_0, grammarAccess.getAssignAccess().getValINTTerminalRuleCall_3_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getAssignRule());
							}
							addWithLastConsumed(
								$current,
								"val",
								lv_val_5_0,
								"org.eclipse.xtext.common.Terminals.INT");
						}
					)
				)
			)*
		)?
		otherlv_6=']'
		{
			newLeafNode(otherlv_6, grammarAccess.getAssignAccess().getRightSquareBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleMeth
entryRuleMeth returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMethRule()); }
	iv_ruleMeth=ruleMeth
	{ $current=$iv_ruleMeth.current; }
	EOF;

// Rule Meth
ruleMeth returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='void'
		{
			newLeafNode(otherlv_0, grammarAccess.getMethAccess().getVoidKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMethAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMethRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMethAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMethAccess().getParamParamParserRuleCall_3_0_0());
					}
					lv_param_3_0=ruleParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMethRule());
						}
						add(
							$current,
							"param",
							lv_param_3_0,
							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Param");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMethAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMethAccess().getParamParamParserRuleCall_3_1_1_0());
						}
						lv_param_5_0=ruleParam
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMethRule());
							}
							add(
								$current,
								"param",
								lv_param_5_0,
								"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Param");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMethAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleParam
entryRuleParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParamRule()); }
	iv_ruleParam=ruleParam
	{ $current=$iv_ruleParam.current; }
	EOF;

// Rule Param
ruleParam returns [EObject current=null]
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
					newLeafNode(lv_name_0_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParamRule());
					}
					addWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getParamAccess().getColonKeyword_1());
		}
		(
			(
				lv_type_2_0=RULE_ID
				{
					newLeafNode(lv_type_2_0, grammarAccess.getParamAccess().getTypeIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParamRule());
					}
					addWithLastConsumed(
						$current,
						"type",
						lv_type_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleSpace
entryRuleSpace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSpaceRule()); }
	iv_ruleSpace=ruleSpace
	{ $current=$iv_ruleSpace.current; }
	EOF;

// Rule Space
ruleSpace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='space'
		{
			newLeafNode(otherlv_0, grammarAccess.getSpaceAccess().getSpaceKeyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getSpaceAccess().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSpaceRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleTestLinewrap
entryRuleTestLinewrap returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestLinewrapRule()); }
	iv_ruleTestLinewrap=ruleTestLinewrap
	{ $current=$iv_ruleTestLinewrap.current; }
	EOF;

// Rule TestLinewrap
ruleTestLinewrap returns [EObject current=null]
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
					grammarAccess.getTestLinewrapAccess().getTestLinewrapAction_0(),
					$current);
			}
		)
		otherlv_1='linewrap'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestLinewrapAccess().getLinewrapKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestLinewrapAccess().getItemsLineParserRuleCall_2_0());
				}
				lv_items_2_0=ruleLine
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestLinewrapRule());
					}
					add(
						$current,
						"items",
						lv_items_2_0,
						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Line");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTestLinewrapMinMax
entryRuleTestLinewrapMinMax returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestLinewrapMinMaxRule()); }
	iv_ruleTestLinewrapMinMax=ruleTestLinewrapMinMax
	{ $current=$iv_ruleTestLinewrapMinMax.current; }
	EOF;

// Rule TestLinewrapMinMax
ruleTestLinewrapMinMax returns [EObject current=null]
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
					grammarAccess.getTestLinewrapMinMaxAccess().getTestLinewrapMinMaxAction_0(),
					$current);
			}
		)
		otherlv_1='wrapminmax'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestLinewrapMinMaxAccess().getWrapminmaxKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTestLinewrapMinMaxAccess().getItemsLineParserRuleCall_2_0());
				}
				lv_items_2_0=ruleLine
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTestLinewrapMinMaxRule());
					}
					add(
						$current,
						"items",
						lv_items_2_0,
						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Line");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTestIndentation
entryRuleTestIndentation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTestIndentationRule()); }
	iv_ruleTestIndentation=ruleTestIndentation
	{ $current=$iv_ruleTestIndentation.current; }
	EOF;

// Rule TestIndentation
ruleTestIndentation returns [EObject current=null]
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
					grammarAccess.getTestIndentationAccess().getTestIndentationAction_0(),
					$current);
			}
		)
		otherlv_1='indentation'
		{
			newLeafNode(otherlv_1, grammarAccess.getTestIndentationAccess().getIndentationKeyword_1());
		}
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getTestIndentationAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTestIndentationAccess().getItemsLineParserRuleCall_3_0_0());
					}
					lv_items_3_1=ruleLine
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestIndentationRule());
						}
						add(
							$current,
							"items",
							lv_items_3_1,
							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Line");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTestIndentationAccess().getItemsTestIndentationParserRuleCall_3_0_1());
					}
					lv_items_3_2=ruleTestIndentation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTestIndentationRule());
						}
						add(
							$current,
							"items",
							lv_items_3_2,
							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.TestIndentation");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getTestIndentationAccess().getRightCurlyBracketKeyword_4());
		}
		(
			(
				lv_semi_5_0=';'
				{
					newLeafNode(lv_semi_5_0, grammarAccess.getTestIndentationAccess().getSemiSemicolonKeyword_5_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTestIndentationRule());
					}
					setWithLastConsumed($current, "semi", lv_semi_5_0 != null, ";");
				}
			)
		)?
	)
;

// Entry rule entryRuleFqnObj
entryRuleFqnObj returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFqnObjRule()); }
	iv_ruleFqnObj=ruleFqnObj
	{ $current=$iv_ruleFqnObj.current; }
	EOF;

// Rule FqnObj
ruleFqnObj returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fqn'
		{
			newLeafNode(otherlv_0, grammarAccess.getFqnObjAccess().getFqnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFqnObjAccess().getNameFQNParserRuleCall_1_0());
				}
				lv_name_1_0=ruleFQN
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFqnObjRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.FQN");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFQN
entryRuleFQN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getFQNRule()); }
	iv_ruleFQN=ruleFQN
	{ $current=$iv_ruleFQN.current.getText(); }
	EOF;

// Rule FQN
ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleFqnRef
entryRuleFqnRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFqnRefRule()); }
	iv_ruleFqnRef=ruleFqnRef
	{ $current=$iv_ruleFqnRef.current; }
	EOF;

// Rule FqnRef
ruleFqnRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fqnref'
		{
			newLeafNode(otherlv_0, grammarAccess.getFqnRefAccess().getFqnrefKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFqnRefRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getFqnRefAccess().getRefFqnObjCrossReference_1_0());
				}
				ruleFQN
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEnumeration
entryRuleEnumeration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationRule()); }
	iv_ruleEnumeration=ruleEnumeration
	{ $current=$iv_ruleEnumeration.current; }
	EOF;

// Rule Enumeration
ruleEnumeration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='enum'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getValEnum1EnumRuleCall_1_0());
				}
				lv_val_1_0=ruleEnum1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					add(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Enum1");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumerationAccess().getValEnum1EnumRuleCall_2_1_0());
					}
					lv_val_3_0=ruleEnum1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumerationRule());
						}
						add(
							$current,
							"val",
							lv_val_3_0,
							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Enum1");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSuppressedHidden
entryRuleSuppressedHidden returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getSuppressedHiddenRule()); }
	iv_ruleSuppressedHidden=ruleSuppressedHidden
	{ $current=$iv_ruleSuppressedHidden.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule SuppressedHidden
ruleSuppressedHidden returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getSuppressedHiddenAccess().getSuppressedHiddenAction_0(),
					$current);
			}
		)
		otherlv_1='`'
		{
			newLeafNode(otherlv_1, grammarAccess.getSuppressedHiddenAccess().getGraveAccentKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSuppressedHiddenAccess().getValsSuppressedHiddenSubParserRuleCall_2_0_0());
					}
					lv_vals_2_0=ruleSuppressedHiddenSub
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSuppressedHiddenRule());
						}
						add(
							$current,
							"vals",
							lv_vals_2_0,
							"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.SuppressedHiddenSub");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3='%'
				{
					newLeafNode(otherlv_3, grammarAccess.getSuppressedHiddenAccess().getPercentSignKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSuppressedHiddenAccess().getValsSuppressedHiddenSubParserRuleCall_2_1_1_0());
						}
						lv_vals_4_0=ruleSuppressedHiddenSub
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSuppressedHiddenRule());
							}
							add(
								$current,
								"vals",
								lv_vals_4_0,
								"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.SuppressedHiddenSub");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5='`'
		{
			newLeafNode(otherlv_5, grammarAccess.getSuppressedHiddenAccess().getGraveAccentKeyword_3());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleSuppressedHiddenSub
entryRuleSuppressedHiddenSub returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSuppressedHiddenSubRule()); }
	iv_ruleSuppressedHiddenSub=ruleSuppressedHiddenSub
	{ $current=$iv_ruleSuppressedHiddenSub.current; }
	EOF;

// Rule SuppressedHiddenSub
ruleSuppressedHiddenSub returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getSuppressedHiddenSubAccess().getSuppressedHiddenSubSubParserRuleCall_0());
		}
		this_SuppressedHiddenSubSub_0=ruleSuppressedHiddenSubSub
		{
			$current = $this_SuppressedHiddenSubSub_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getSuppressedHiddenSubAccess().getSuppressedHiddenSubIDParserRuleCall_1());
		}
		this_SuppressedHiddenSubID_1=ruleSuppressedHiddenSubID
		{
			$current = $this_SuppressedHiddenSubID_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSuppressedHiddenSubSub
entryRuleSuppressedHiddenSubSub returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}:
	{ newCompositeNode(grammarAccess.getSuppressedHiddenSubSubRule()); }
	iv_ruleSuppressedHiddenSubSub=ruleSuppressedHiddenSubSub
	{ $current=$iv_ruleSuppressedHiddenSubSub.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule SuppressedHiddenSubSub
ruleSuppressedHiddenSubSub returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS");
}
@after {
	leaveRule();
}:
	(
		otherlv_0='<'
		{
			newLeafNode(otherlv_0, grammarAccess.getSuppressedHiddenSubSubAccess().getLessThanSignKeyword_0());
		}
		(
			(
				lv_idval_1_0=RULE_ID
				{
					newLeafNode(lv_idval_1_0, grammarAccess.getSuppressedHiddenSubSubAccess().getIdvalIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSuppressedHiddenSubSubRule());
					}
					setWithLastConsumed(
						$current,
						"idval",
						lv_idval_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='>'
		{
			newLeafNode(otherlv_2, grammarAccess.getSuppressedHiddenSubSubAccess().getGreaterThanSignKeyword_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleSuppressedHiddenSubID
entryRuleSuppressedHiddenSubID returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSuppressedHiddenSubIDRule()); }
	iv_ruleSuppressedHiddenSubID=ruleSuppressedHiddenSubID
	{ $current=$iv_ruleSuppressedHiddenSubID.current; }
	EOF;

// Rule SuppressedHiddenSubID
ruleSuppressedHiddenSubID returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_idval_0_0=RULE_ID
			{
				newLeafNode(lv_idval_0_0, grammarAccess.getSuppressedHiddenSubIDAccess().getIdvalIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getSuppressedHiddenSubIDRule());
				}
				setWithLastConsumed(
					$current,
					"idval",
					lv_idval_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleDatatype1
entryRuleDatatype1 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatype1Rule()); }
	iv_ruleDatatype1=ruleDatatype1
	{ $current=$iv_ruleDatatype1.current.getText(); }
	EOF;

// Rule Datatype1
ruleDatatype1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getDatatype1Access().getFQNParserRuleCall());
	}
	this_FQN_0=ruleFQN
	{
		$current.merge(this_FQN_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleDatatype2
entryRuleDatatype2 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatype2Rule()); }
	iv_ruleDatatype2=ruleDatatype2
	{ $current=$iv_ruleDatatype2.current.getText(); }
	EOF;

// Rule Datatype2
ruleDatatype2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getDatatype2Access().getFQNParserRuleCall());
	}
	this_FQN_0=ruleFQN
	{
		$current.merge(this_FQN_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleDatatype3
entryRuleDatatype3 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatype3Rule()); }
	iv_ruleDatatype3=ruleDatatype3
	{ $current=$iv_ruleDatatype3.current.getText(); }
	EOF;

// Rule Datatype3
ruleDatatype3 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getDatatype3Access().getFQNParserRuleCall());
	}
	this_FQN_0=ruleFQN
	{
		$current.merge(this_FQN_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleDatatypes
entryRuleDatatypes returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDatatypesRule()); }
	iv_ruleDatatypes=ruleDatatypes
	{ $current=$iv_ruleDatatypes.current; }
	EOF;

// Rule Datatypes
ruleDatatypes returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatypes'
		{
			newLeafNode(otherlv_0, grammarAccess.getDatatypesAccess().getDatatypesKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDatatypesAccess().getVal1Datatype1ParserRuleCall_1_0());
				}
				lv_val1_1_0=ruleDatatype1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDatatypesRule());
					}
					set(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='kw1'
		{
			newLeafNode(otherlv_2, grammarAccess.getDatatypesAccess().getKw1Keyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDatatypesAccess().getVal2Datatype2ParserRuleCall_3_0());
				}
				lv_val2_3_0=ruleDatatype2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDatatypesRule());
					}
					set(
						$current,
						"val2",
						lv_val2_3_0,
						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDatatypesAccess().getVal3Datatype3ParserRuleCall_4_0());
				}
				lv_val3_4_0=ruleDatatype3
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDatatypesRule());
					}
					set(
						$current,
						"val3",
						lv_val3_4_0,
						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.Datatype3");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5='kw3'
		{
			newLeafNode(otherlv_5, grammarAccess.getDatatypesAccess().getKw3Keyword_5());
		}
	)
;

// Entry rule entryRuleWrappingDataTypeTest
entryRuleWrappingDataTypeTest returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWrappingDataTypeTestRule()); }
	iv_ruleWrappingDataTypeTest=ruleWrappingDataTypeTest
	{ $current=$iv_ruleWrappingDataTypeTest.current; }
	EOF;

// Rule WrappingDataTypeTest
ruleWrappingDataTypeTest returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='wrappingdt'
		{
			newLeafNode(otherlv_0, grammarAccess.getWrappingDataTypeTestAccess().getWrappingdtKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getWrappingDataTypeTestAccess().getDatatypeWrappingDataTypeParserRuleCall_1_0());
				}
				lv_datatype_1_0=ruleWrappingDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getWrappingDataTypeTestRule());
					}
					set(
						$current,
						"datatype",
						lv_datatype_1_0,
						"org.eclipse.xtext.parsetree.formatter.FormatterTestLanguage.WrappingDataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='kw1'
		{
			newLeafNode(otherlv_2, grammarAccess.getWrappingDataTypeTestAccess().getKw1Keyword_2());
		}
	)
;

// Entry rule entryRuleWrappingDataType
entryRuleWrappingDataType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getWrappingDataTypeRule()); }
	iv_ruleWrappingDataType=ruleWrappingDataType
	{ $current=$iv_ruleWrappingDataType.current.getText(); }
	EOF;

// Rule WrappingDataType
ruleWrappingDataType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getWrappingDataTypeAccess().getIDTerminalRuleCall());
		}
	)+
;

// Rule Enum1
ruleEnum1 returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='lit1'
			{
				$current = grammarAccess.getEnum1Access().getLit1EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getEnum1Access().getLit1EnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='lit2'
			{
				$current = grammarAccess.getEnum1Access().getLit2EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getEnum1Access().getLit2EnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='lit3'
			{
				$current = grammarAccess.getEnum1Access().getLit3EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getEnum1Access().getLit3EnumLiteralDeclaration_2());
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
