/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalContextFinderTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.serializer.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.serializer.parser.antlr.internal;

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
import org.eclipse.xtext.serializer.services.ContextFinderTestLanguageGrammarAccess;

}

@parser::members {

 	private ContextFinderTestLanguageGrammarAccess grammarAccess;

    public InternalContextFinderTestLanguageParser(TokenStream input, ContextFinderTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected ContextFinderTestLanguageGrammarAccess getGrammarAccess() {
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
			otherlv_0='#0'
			{
				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getNumberSignDigitZeroKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getModelModel2ParserRuleCall_0_1_0());
					}
					lv_model_1_0=ruleModel2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						set(
							$current,
							"model",
							lv_model_1_0,
							"org.eclipse.xtext.serializer.ContextFinderTestLanguage.Model2");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			otherlv_2='#1'
			{
				newLeafNode(otherlv_2, grammarAccess.getModelAccess().getNumberSignDigitOneKeyword_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getAttributeExclusionAttributeExclusionTest1ParserRuleCall_1_1_0_0());
						}
						lv_attributeExclusion_3_1=ruleAttributeExclusionTest1
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"attributeExclusion",
								lv_attributeExclusion_3_1,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.AttributeExclusionTest1");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getAttributeExclusionAttributeExclusionTest2ParserRuleCall_1_1_0_1());
						}
						lv_attributeExclusion_3_2=ruleAttributeExclusionTest2
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"attributeExclusion",
								lv_attributeExclusion_3_2,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.AttributeExclusionTest2");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_4='#2'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getNumberSignDigitTwoKeyword_2_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getNestedTypeNestedTypeTest1ParserRuleCall_2_1_0_0());
						}
						lv_nestedType_5_1=ruleNestedTypeTest1
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"nestedType",
								lv_nestedType_5_1,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeTest1");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getNestedTypeNestedTypeTest2ParserRuleCall_2_1_0_1());
						}
						lv_nestedType_5_2=ruleNestedTypeTest2
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"nestedType",
								lv_nestedType_5_2,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeTest2");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_6='#3'
			{
				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getNumberSignDigitThreeKeyword_3_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getNestedTypeRecursiveTest2NestedTypeRecursiveTest1ParserRuleCall_3_1_0_0());
						}
						lv_nestedTypeRecursiveTest2_7_1=ruleNestedTypeRecursiveTest1
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"nestedTypeRecursiveTest2",
								lv_nestedTypeRecursiveTest2_7_1,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeRecursiveTest1");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getNestedTypeRecursiveTest2NestedTypeRecursiveTest2ParserRuleCall_3_1_0_1());
						}
						lv_nestedTypeRecursiveTest2_7_2=ruleNestedTypeRecursiveTest2
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"nestedTypeRecursiveTest2",
								lv_nestedTypeRecursiveTest2_7_2,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeRecursiveTest2");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_8='#4'
			{
				newLeafNode(otherlv_8, grammarAccess.getModelAccess().getNumberSignDigitFourKeyword_4_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getParentRefParentRefTest1ParserRuleCall_4_1_0_0());
						}
						lv_parentRef_9_1=ruleParentRefTest1
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"parentRef",
								lv_parentRef_9_1,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTest1");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getParentRefParentRefTest2ParserRuleCall_4_1_0_1());
						}
						lv_parentRef_9_2=ruleParentRefTest2
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"parentRef",
								lv_parentRef_9_2,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTest2");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_10='#5'
			{
				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getNumberSignDigitFiveKeyword_5_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getQuantityExclusionQuantityExclusionTest1ParserRuleCall_5_1_0_0());
						}
						lv_quantityExclusion_11_1=ruleQuantityExclusionTest1
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"quantityExclusion",
								lv_quantityExclusion_11_1,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.QuantityExclusionTest1");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getQuantityExclusionQuantityExclusionTest2ParserRuleCall_5_1_0_1());
						}
						lv_quantityExclusion_11_2=ruleQuantityExclusionTest2
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"quantityExclusion",
								lv_quantityExclusion_11_2,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.QuantityExclusionTest2");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_12='#6'
			{
				newLeafNode(otherlv_12, grammarAccess.getModelAccess().getNumberSignDigitSixKeyword_6_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getValueExclusionValueExclusionTest1ParserRuleCall_6_1_0_0());
						}
						lv_valueExclusion_13_1=ruleValueExclusionTest1
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"valueExclusion",
								lv_valueExclusion_13_1,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTest1");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getValueExclusionValueExclusionTest2ParserRuleCall_6_1_0_1());
						}
						lv_valueExclusion_13_2=ruleValueExclusionTest2
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"valueExclusion",
								lv_valueExclusion_13_2,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTest2");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_14='#7'
			{
				newLeafNode(otherlv_14, grammarAccess.getModelAccess().getNumberSignDigitSevenKeyword_7_0());
			}
			(
				(
					lv_name_15_0=RULE_STRING
					{
						newLeafNode(lv_name_15_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_7_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_15_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getNodeExclusionNodeExclusion1ParserRuleCall_7_2_0_0());
						}
						lv_nodeExclusion_16_1=ruleNodeExclusion1
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"nodeExclusion",
								lv_nodeExclusion_16_1,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion1");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getNodeExclusionNodeExclusion2ParserRuleCall_7_2_0_1());
						}
						lv_nodeExclusion_16_2=ruleNodeExclusion2
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"nodeExclusion",
								lv_nodeExclusion_16_2,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion2");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
		    |
		(
			otherlv_17='#8'
			{
				newLeafNode(otherlv_17, grammarAccess.getModelAccess().getNumberSignDigitEightKeyword_8_0());
			}
			(
				(
					lv_name_18_0=RULE_STRING
					{
						newLeafNode(lv_name_18_0, grammarAccess.getModelAccess().getNameSTRINGTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getModelRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_18_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getNodeExclusionListNodeExclusion1ListParserRuleCall_8_2_0_0());
						}
						lv_nodeExclusionList_19_1=ruleNodeExclusion1List
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"nodeExclusionList",
								lv_nodeExclusionList_19_1,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion1List");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getModelAccess().getNodeExclusionListNodeExclusion2ListParserRuleCall_8_2_0_1());
						}
						lv_nodeExclusionList_19_2=ruleNodeExclusion2List
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"nodeExclusionList",
								lv_nodeExclusionList_19_2,
								"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NodeExclusion2List");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleModel2
entryRuleModel2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModel2Rule()); }
	iv_ruleModel2=ruleModel2
	{ $current=$iv_ruleModel2.current; }
	EOF;

// Rule Model2
ruleModel2 returns [EObject current=null]
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
					grammarAccess.getModel2Access().getModelAction_0(),
					$current);
			}
		)
		otherlv_1='model'
		{
			newLeafNode(otherlv_1, grammarAccess.getModel2Access().getModelKeyword_1());
		}
	)
;

// Entry rule entryRuleAttributeExclusionTest1
entryRuleAttributeExclusionTest1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeExclusionTest1Rule()); }
	iv_ruleAttributeExclusionTest1=ruleAttributeExclusionTest1
	{ $current=$iv_ruleAttributeExclusionTest1.current; }
	EOF;

// Rule AttributeExclusionTest1
ruleAttributeExclusionTest1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw1'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeExclusionTest1Access().getKw1Keyword_0());
		}
		(
			(
				lv_attr1_1_0=RULE_ID
				{
					newLeafNode(lv_attr1_1_0, grammarAccess.getAttributeExclusionTest1Access().getAttr1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeExclusionTest1Rule());
					}
					setWithLastConsumed(
						$current,
						"attr1",
						lv_attr1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleAttributeExclusionTest2
entryRuleAttributeExclusionTest2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeExclusionTest2Rule()); }
	iv_ruleAttributeExclusionTest2=ruleAttributeExclusionTest2
	{ $current=$iv_ruleAttributeExclusionTest2.current; }
	EOF;

// Rule AttributeExclusionTest2
ruleAttributeExclusionTest2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw2'
		{
			newLeafNode(otherlv_0, grammarAccess.getAttributeExclusionTest2Access().getKw2Keyword_0());
		}
		(
			(
				lv_attr2_1_0=RULE_ID
				{
					newLeafNode(lv_attr2_1_0, grammarAccess.getAttributeExclusionTest2Access().getAttr2IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeExclusionTest2Rule());
					}
					setWithLastConsumed(
						$current,
						"attr2",
						lv_attr2_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleNestedTypeTest1
entryRuleNestedTypeTest1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedTypeTest1Rule()); }
	iv_ruleNestedTypeTest1=ruleNestedTypeTest1
	{ $current=$iv_ruleNestedTypeTest1.current; }
	EOF;

// Rule NestedTypeTest1
ruleNestedTypeTest1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getNestedTypeTest1Access().getNestedNestedTypeChild1ParserRuleCall_0());
			}
			lv_nested_0_0=ruleNestedTypeChild1
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getNestedTypeTest1Rule());
				}
				set(
					$current,
					"nested",
					lv_nested_0_0,
					"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeChild1");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNestedTypeTest2
entryRuleNestedTypeTest2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedTypeTest2Rule()); }
	iv_ruleNestedTypeTest2=ruleNestedTypeTest2
	{ $current=$iv_ruleNestedTypeTest2.current; }
	EOF;

// Rule NestedTypeTest2
ruleNestedTypeTest2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getNestedTypeTest2Access().getNestedNestedTypeChild2ParserRuleCall_0());
			}
			lv_nested_0_0=ruleNestedTypeChild2
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getNestedTypeTest2Rule());
				}
				set(
					$current,
					"nested",
					lv_nested_0_0,
					"org.eclipse.xtext.serializer.ContextFinderTestLanguage.NestedTypeChild2");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNestedTypeChild1
entryRuleNestedTypeChild1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedTypeChild1Rule()); }
	iv_ruleNestedTypeChild1=ruleNestedTypeChild1
	{ $current=$iv_ruleNestedTypeChild1.current; }
	EOF;

// Rule NestedTypeChild1
ruleNestedTypeChild1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw1'
		{
			newLeafNode(otherlv_0, grammarAccess.getNestedTypeChild1Access().getKw1Keyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getNestedTypeChild1Access().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNestedTypeChild1Rule());
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

// Entry rule entryRuleNestedTypeChild2
entryRuleNestedTypeChild2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedTypeChild2Rule()); }
	iv_ruleNestedTypeChild2=ruleNestedTypeChild2
	{ $current=$iv_ruleNestedTypeChild2.current; }
	EOF;

// Rule NestedTypeChild2
ruleNestedTypeChild2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw2'
		{
			newLeafNode(otherlv_0, grammarAccess.getNestedTypeChild2Access().getKw2Keyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getNestedTypeChild2Access().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getNestedTypeChild2Rule());
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

// Entry rule entryRuleNestedTypeRecursiveTest1
entryRuleNestedTypeRecursiveTest1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedTypeRecursiveTest1Rule()); }
	iv_ruleNestedTypeRecursiveTest1=ruleNestedTypeRecursiveTest1
	{ $current=$iv_ruleNestedTypeRecursiveTest1.current; }
	EOF;

// Rule NestedTypeRecursiveTest1
ruleNestedTypeRecursiveTest1 returns [EObject current=null]
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
					grammarAccess.getNestedTypeRecursiveTest1Access().getNestedTypeRecursiveTest1Action_0(),
					$current);
			}
		)
		otherlv_1='kw1'
		{
			newLeafNode(otherlv_1, grammarAccess.getNestedTypeRecursiveTest1Access().getKw1Keyword_1());
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getNestedTypeRecursiveTest1Access().getNestedTypeRecursiveTestLeftAction_2_0(),
						$current);
				}
			)
			otherlv_3='.'
			{
				newLeafNode(otherlv_3, grammarAccess.getNestedTypeRecursiveTest1Access().getFullStopKeyword_2_1());
			}
		)+
	)
;

// Entry rule entryRuleNestedTypeRecursiveTest2
entryRuleNestedTypeRecursiveTest2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedTypeRecursiveTest2Rule()); }
	iv_ruleNestedTypeRecursiveTest2=ruleNestedTypeRecursiveTest2
	{ $current=$iv_ruleNestedTypeRecursiveTest2.current; }
	EOF;

// Rule NestedTypeRecursiveTest2
ruleNestedTypeRecursiveTest2 returns [EObject current=null]
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
					grammarAccess.getNestedTypeRecursiveTest2Access().getNestedTypeRecursiveTest2Action_0(),
					$current);
			}
		)
		otherlv_1='kw2'
		{
			newLeafNode(otherlv_1, grammarAccess.getNestedTypeRecursiveTest2Access().getKw2Keyword_1());
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getNestedTypeRecursiveTest2Access().getNestedTypeRecursiveTestLeftAction_2_0(),
						$current);
				}
			)
			otherlv_3='.'
			{
				newLeafNode(otherlv_3, grammarAccess.getNestedTypeRecursiveTest2Access().getFullStopKeyword_2_1());
			}
		)+
	)
;

// Entry rule entryRuleParentRefTest1
entryRuleParentRefTest1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentRefTest1Rule()); }
	iv_ruleParentRefTest1=ruleParentRefTest1
	{ $current=$iv_ruleParentRefTest1.current; }
	EOF;

// Rule ParentRefTest1
ruleParentRefTest1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw1'
		{
			newLeafNode(otherlv_0, grammarAccess.getParentRefTest1Access().getKw1Keyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentRefTest1Access().getChild1ParentRefTestChild1ParserRuleCall_1_0());
				}
				lv_child1_1_0=ruleParentRefTestChild1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentRefTest1Rule());
					}
					set(
						$current,
						"child1",
						lv_child1_1_0,
						"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild1");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParentRefTest2
entryRuleParentRefTest2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentRefTest2Rule()); }
	iv_ruleParentRefTest2=ruleParentRefTest2
	{ $current=$iv_ruleParentRefTest2.current; }
	EOF;

// Rule ParentRefTest2
ruleParentRefTest2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw2'
		{
			newLeafNode(otherlv_0, grammarAccess.getParentRefTest2Access().getKw2Keyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentRefTest2Access().getChild2ParentRefTestChild2ParserRuleCall_1_0());
				}
				lv_child2_1_0=ruleParentRefTestChild2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentRefTest2Rule());
					}
					set(
						$current,
						"child2",
						lv_child2_1_0,
						"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild2");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParentRefTestChild1
entryRuleParentRefTestChild1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentRefTestChild1Rule()); }
	iv_ruleParentRefTestChild1=ruleParentRefTestChild1
	{ $current=$iv_ruleParentRefTestChild1.current; }
	EOF;

// Rule ParentRefTestChild1
ruleParentRefTestChild1 returns [EObject current=null]
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
					grammarAccess.getParentRefTestChild1Access().getParentRefTestChildAction_0(),
					$current);
			}
		)
		otherlv_1='foo'
		{
			newLeafNode(otherlv_1, grammarAccess.getParentRefTestChild1Access().getFooKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentRefTestChild1Access().getChildParentRefTestChild1ParserRuleCall_2_0());
				}
				lv_child_2_0=ruleParentRefTestChild1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentRefTestChild1Rule());
					}
					set(
						$current,
						"child",
						lv_child_2_0,
						"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild1");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleParentRefTestChild2
entryRuleParentRefTestChild2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentRefTestChild2Rule()); }
	iv_ruleParentRefTestChild2=ruleParentRefTestChild2
	{ $current=$iv_ruleParentRefTestChild2.current; }
	EOF;

// Rule ParentRefTestChild2
ruleParentRefTestChild2 returns [EObject current=null]
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
					grammarAccess.getParentRefTestChild2Access().getParentRefTestChildAction_0(),
					$current);
			}
		)
		otherlv_1='foo'
		{
			newLeafNode(otherlv_1, grammarAccess.getParentRefTestChild2Access().getFooKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentRefTestChild2Access().getChildParentRefTestChild2ParserRuleCall_2_0());
				}
				lv_child_2_0=ruleParentRefTestChild2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentRefTestChild2Rule());
					}
					set(
						$current,
						"child",
						lv_child_2_0,
						"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ParentRefTestChild2");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleQuantityExclusionTest1
entryRuleQuantityExclusionTest1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuantityExclusionTest1Rule()); }
	iv_ruleQuantityExclusionTest1=ruleQuantityExclusionTest1
	{ $current=$iv_ruleQuantityExclusionTest1.current; }
	EOF;

// Rule QuantityExclusionTest1
ruleQuantityExclusionTest1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw1'
		{
			newLeafNode(otherlv_0, grammarAccess.getQuantityExclusionTest1Access().getKw1Keyword_0());
		}
		(
			(
				lv_attr1_1_0=RULE_ID
				{
					newLeafNode(lv_attr1_1_0, grammarAccess.getQuantityExclusionTest1Access().getAttr1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuantityExclusionTest1Rule());
					}
					setWithLastConsumed(
						$current,
						"attr1",
						lv_attr1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				lv_attr2_2_0=RULE_ID
				{
					newLeafNode(lv_attr2_2_0, grammarAccess.getQuantityExclusionTest1Access().getAttr2IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuantityExclusionTest1Rule());
					}
					setWithLastConsumed(
						$current,
						"attr2",
						lv_attr2_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
	)
;

// Entry rule entryRuleQuantityExclusionTest2
entryRuleQuantityExclusionTest2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getQuantityExclusionTest2Rule()); }
	iv_ruleQuantityExclusionTest2=ruleQuantityExclusionTest2
	{ $current=$iv_ruleQuantityExclusionTest2.current; }
	EOF;

// Rule QuantityExclusionTest2
ruleQuantityExclusionTest2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='kw2'
		{
			newLeafNode(otherlv_0, grammarAccess.getQuantityExclusionTest2Access().getKw2Keyword_0());
		}
		(
			(
				lv_attr1_1_0=RULE_ID
				{
					newLeafNode(lv_attr1_1_0, grammarAccess.getQuantityExclusionTest2Access().getAttr1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuantityExclusionTest2Rule());
					}
					setWithLastConsumed(
						$current,
						"attr1",
						lv_attr1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)?
		(
			(
				lv_attr2_2_0=RULE_ID
				{
					newLeafNode(lv_attr2_2_0, grammarAccess.getQuantityExclusionTest2Access().getAttr2IDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getQuantityExclusionTest2Rule());
					}
					setWithLastConsumed(
						$current,
						"attr2",
						lv_attr2_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleValueExclusionTest1
entryRuleValueExclusionTest1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueExclusionTest1Rule()); }
	iv_ruleValueExclusionTest1=ruleValueExclusionTest1
	{ $current=$iv_ruleValueExclusionTest1.current; }
	EOF;

// Rule ValueExclusionTest1
ruleValueExclusionTest1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getValueExclusionTest1Access().getValValueExclusionTestEn1EnumRuleCall_0());
			}
			lv_val_0_0=ruleValueExclusionTestEn1
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getValueExclusionTest1Rule());
				}
				set(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTestEn1");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleValueExclusionTest2
entryRuleValueExclusionTest2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueExclusionTest2Rule()); }
	iv_ruleValueExclusionTest2=ruleValueExclusionTest2
	{ $current=$iv_ruleValueExclusionTest2.current; }
	EOF;

// Rule ValueExclusionTest2
ruleValueExclusionTest2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getValueExclusionTest2Access().getValValueExclusionTestEn2EnumRuleCall_0());
			}
			lv_val_0_0=ruleValueExclusionTestEn2
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getValueExclusionTest2Rule());
				}
				set(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.serializer.ContextFinderTestLanguage.ValueExclusionTestEn2");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleNodeExclusion1
entryRuleNodeExclusion1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeExclusion1Rule()); }
	iv_ruleNodeExclusion1=ruleNodeExclusion1
	{ $current=$iv_ruleNodeExclusion1.current; }
	EOF;

// Rule NodeExclusion1
ruleNodeExclusion1 returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getNodeExclusion1Rule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getNodeExclusion1Access().getRefModelCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleNodeExclusion2
entryRuleNodeExclusion2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeExclusion2Rule()); }
	iv_ruleNodeExclusion2=ruleNodeExclusion2
	{ $current=$iv_ruleNodeExclusion2.current; }
	EOF;

// Rule NodeExclusion2
ruleNodeExclusion2 returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getNodeExclusion2Rule());
				}
			}
			otherlv_0=RULE_STRING
			{
				newLeafNode(otherlv_0, grammarAccess.getNodeExclusion2Access().getRefModelCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleNodeExclusion1List
entryRuleNodeExclusion1List returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeExclusion1ListRule()); }
	iv_ruleNodeExclusion1List=ruleNodeExclusion1List
	{ $current=$iv_ruleNodeExclusion1List.current; }
	EOF;

// Rule NodeExclusion1List
ruleNodeExclusion1List returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getNodeExclusion1ListRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getNodeExclusion1ListAccess().getRefModelCrossReference_0());
			}
		)
	)+
;

// Entry rule entryRuleNodeExclusion2List
entryRuleNodeExclusion2List returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNodeExclusion2ListRule()); }
	iv_ruleNodeExclusion2List=ruleNodeExclusion2List
	{ $current=$iv_ruleNodeExclusion2List.current; }
	EOF;

// Rule NodeExclusion2List
ruleNodeExclusion2List returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getNodeExclusion2ListRule());
				}
			}
			otherlv_0=RULE_STRING
			{
				newLeafNode(otherlv_0, grammarAccess.getNodeExclusion2ListAccess().getRefModelCrossReference_0());
			}
		)
	)+
;

// Rule ValueExclusionTestEn1
ruleValueExclusionTestEn1 returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='lit1'
		{
			$current = grammarAccess.getValueExclusionTestEn1Access().getLit1EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getValueExclusionTestEn1Access().getLit1EnumLiteralDeclaration());
		}
	)
;

// Rule ValueExclusionTestEn2
ruleValueExclusionTestEn2 returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		enumLiteral_0='lit2'
		{
			$current = grammarAccess.getValueExclusionTestEn2Access().getLit2EnumLiteralDeclaration().getEnumLiteral().getInstance();
			newLeafNode(enumLiteral_0, grammarAccess.getValueExclusionTestEn2Access().getLit2EnumLiteralDeclaration());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
