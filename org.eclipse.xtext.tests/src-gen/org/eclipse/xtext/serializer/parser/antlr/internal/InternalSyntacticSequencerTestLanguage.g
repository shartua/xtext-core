/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalSyntacticSequencerTestLanguage;

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
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.serializer.services.SyntacticSequencerTestLanguageGrammarAccess;

}

@parser::members {

 	private SyntacticSequencerTestLanguageGrammarAccess grammarAccess;

    public InternalSyntacticSequencerTestLanguageParser(TokenStream input, SyntacticSequencerTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Model";
   	}

   	@Override
   	protected SyntacticSequencerTestLanguageGrammarAccess getGrammarAccess() {
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
					newCompositeNode(grammarAccess.getModelAccess().getX1MandatoryKeywordsParserRuleCall_0_0());
				}
				lv_x1_0_0=ruleMandatoryKeywords
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x1",
						lv_x1_0_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.MandatoryKeywords");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX2Exp0ParserRuleCall_1_0());
				}
				lv_x2_1_0=ruleExp0
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x2",
						lv_x2_1_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Exp0");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX3Exp1ParserRuleCall_2_0());
				}
				lv_x3_2_0=ruleExp1
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x3",
						lv_x3_2_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Exp1");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX4Exp2ParserRuleCall_3_0());
				}
				lv_x4_3_0=ruleExp2
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x4",
						lv_x4_3_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Exp2");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX5SingleCrossReferenceParserRuleCall_4_0());
				}
				lv_x5_4_0=ruleSingleCrossReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x5",
						lv_x5_4_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.SingleCrossReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX6BooleanAlternativeParserRuleCall_5_0());
				}
				lv_x6_5_0=ruleBooleanAlternative
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x6",
						lv_x6_5_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BooleanAlternative");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX7UnassignedDatatypeParserRuleCall_6_0());
				}
				lv_x7_6_0=ruleUnassignedDatatype
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x7",
						lv_x7_6_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.UnassignedDatatype");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX8OptionalSingleTransitionParserRuleCall_7_0());
				}
				lv_x8_7_0=ruleOptionalSingleTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x8",
						lv_x8_7_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.OptionalSingleTransition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX9OptionalManyTransitionParserRuleCall_8_0());
				}
				lv_x9_8_0=ruleOptionalManyTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x9",
						lv_x9_8_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.OptionalManyTransition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX10MandatoryManyTransitionParserRuleCall_9_0());
				}
				lv_x10_9_0=ruleMandatoryManyTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x10",
						lv_x10_9_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.MandatoryManyTransition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX11AlternativeTransitionParserRuleCall_10_0());
				}
				lv_x11_10_0=ruleAlternativeTransition
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x11",
						lv_x11_10_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.AlternativeTransition");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX12BooleanValuesParserRuleCall_11_0());
				}
				lv_x12_11_0=ruleBooleanValues
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x12",
						lv_x12_11_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BooleanValues");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX13LongAlternativeParserRuleCall_12_0());
				}
				lv_x13_12_0=ruleLongAlternative
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x13",
						lv_x13_12_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.LongAlternative");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX14ActionOnlyParserRuleCall_13_0());
				}
				lv_x14_13_0=ruleActionOnly
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x14",
						lv_x14_13_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.ActionOnly");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX15FragmentCallerParserRuleCall_14_0());
				}
				lv_x15_14_0=ruleFragmentCaller
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x15",
						lv_x15_14_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.FragmentCaller");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getModelAccess().getX16Bug398890ParserRuleCall_15_0());
				}
				lv_x16_15_0=ruleBug398890
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelRule());
					}
					set(
						$current,
						"x16",
						lv_x16_15_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Bug398890");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMandatoryKeywords
entryRuleMandatoryKeywords returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMandatoryKeywordsRule()); }
	iv_ruleMandatoryKeywords=ruleMandatoryKeywords
	{ $current=$iv_ruleMandatoryKeywords.current; }
	EOF;

// Rule MandatoryKeywords
ruleMandatoryKeywords returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#1'
		{
			newLeafNode(otherlv_0, grammarAccess.getMandatoryKeywordsAccess().getNumberSignDigitOneKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getMandatoryKeywordsAccess().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMandatoryKeywordsRule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='kw1'
		{
			newLeafNode(otherlv_2, grammarAccess.getMandatoryKeywordsAccess().getKw1Keyword_2());
		}
		(
			(
				lv_val2_3_0=RULE_ID
				{
					newLeafNode(lv_val2_3_0, grammarAccess.getMandatoryKeywordsAccess().getVal2IDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMandatoryKeywordsRule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_4='kw2'
		{
			newLeafNode(otherlv_4, grammarAccess.getMandatoryKeywordsAccess().getKw2Keyword_4());
		}
		otherlv_5='kw3'
		{
			newLeafNode(otherlv_5, grammarAccess.getMandatoryKeywordsAccess().getKw3Keyword_5());
		}
		(
			(
				lv_val3_6_0=RULE_ID
				{
					newLeafNode(lv_val3_6_0, grammarAccess.getMandatoryKeywordsAccess().getVal3IDTerminalRuleCall_6_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMandatoryKeywordsRule());
					}
					setWithLastConsumed(
						$current,
						"val3",
						lv_val3_6_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_7='kw4'
		{
			newLeafNode(otherlv_7, grammarAccess.getMandatoryKeywordsAccess().getKw4Keyword_7());
		}
	)
;

// Entry rule entryRuleExp0
entryRuleExp0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExp0Rule()); }
	iv_ruleExp0=ruleExp0
	{ $current=$iv_ruleExp0.current; }
	EOF;

// Rule Exp0
ruleExp0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#2'
		{
			newLeafNode(otherlv_0, grammarAccess.getExp0Access().getNumberSignDigitTwoKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getExp0Access().getAddition0ParserRuleCall_1());
		}
		this_Addition0_1=ruleAddition0
		{
			$current = $this_Addition0_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAddition0
entryRuleAddition0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddition0Rule()); }
	iv_ruleAddition0=ruleAddition0
	{ $current=$iv_ruleAddition0.current; }
	EOF;

// Rule Addition0
ruleAddition0 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAddition0Access().getPrim0ParserRuleCall_0());
		}
		this_Prim0_0=rulePrim0
		{
			$current = $this_Prim0_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAddition0Access().getAdd0LeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='+'
			{
				newLeafNode(otherlv_2, grammarAccess.getAddition0Access().getPlusSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAddition0Access().getRightPrim0ParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrim0
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAddition0Rule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Prim0");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrim0
entryRulePrim0 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrim0Rule()); }
	iv_rulePrim0=rulePrim0
	{ $current=$iv_rulePrim0.current; }
	EOF;

// Rule Prim0
rulePrim0 returns [EObject current=null]
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
					grammarAccess.getPrim0Access().getVal0Action_0(),
					$current);
			}
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPrim0Access().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrim0Rule());
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

// Entry rule entryRuleExp1
entryRuleExp1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExp1Rule()); }
	iv_ruleExp1=ruleExp1
	{ $current=$iv_ruleExp1.current; }
	EOF;

// Rule Exp1
ruleExp1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#3'
		{
			newLeafNode(otherlv_0, grammarAccess.getExp1Access().getNumberSignDigitThreeKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getExp1Access().getAddition1ParserRuleCall_1());
		}
		this_Addition1_1=ruleAddition1
		{
			$current = $this_Addition1_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAddition1
entryRuleAddition1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddition1Rule()); }
	iv_ruleAddition1=ruleAddition1
	{ $current=$iv_ruleAddition1.current; }
	EOF;

// Rule Addition1
ruleAddition1 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAddition1Access().getPrim1ParserRuleCall_0());
		}
		this_Prim1_0=rulePrim1
		{
			$current = $this_Prim1_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAddition1Access().getAdd1LeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='+'
			{
				newLeafNode(otherlv_2, grammarAccess.getAddition1Access().getPlusSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAddition1Access().getRightPrim1ParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrim1
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAddition1Rule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Prim1");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrim1
entryRulePrim1 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrim1Rule()); }
	iv_rulePrim1=rulePrim1
	{ $current=$iv_rulePrim1.current; }
	EOF;

// Rule Prim1
rulePrim1 returns [EObject current=null]
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
					$current = forceCreateModelElement(
						grammarAccess.getPrim1Access().getVal1Action_0_0(),
						$current);
				}
			)
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getPrim1Access().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrim1Rule());
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
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getPrim1Access().getLeftParenthesisKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getPrim1Access().getAddition1ParserRuleCall_1_1());
			}
			this_Addition1_3=ruleAddition1
			{
				$current = $this_Addition1_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrim1Access().getRightParenthesisKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleExp2
entryRuleExp2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExp2Rule()); }
	iv_ruleExp2=ruleExp2
	{ $current=$iv_ruleExp2.current; }
	EOF;

// Rule Exp2
ruleExp2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#4'
		{
			newLeafNode(otherlv_0, grammarAccess.getExp2Access().getNumberSignDigitFourKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getExp2Access().getAddition2ParserRuleCall_1());
		}
		this_Addition2_1=ruleAddition2
		{
			$current = $this_Addition2_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAddition2
entryRuleAddition2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAddition2Rule()); }
	iv_ruleAddition2=ruleAddition2
	{ $current=$iv_ruleAddition2.current; }
	EOF;

// Rule Addition2
ruleAddition2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAddition2Access().getMultiplication2ParserRuleCall_0());
		}
		this_Multiplication2_0=ruleMultiplication2
		{
			$current = $this_Multiplication2_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAddition2Access().getAdd2LeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='+'
			{
				newLeafNode(otherlv_2, grammarAccess.getAddition2Access().getPlusSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAddition2Access().getRightMultiplication2ParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiplication2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAddition2Rule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Multiplication2");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplication2
entryRuleMultiplication2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplication2Rule()); }
	iv_ruleMultiplication2=ruleMultiplication2
	{ $current=$iv_ruleMultiplication2.current; }
	EOF;

// Rule Multiplication2
ruleMultiplication2 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplication2Access().getPrim2ParserRuleCall_0());
		}
		this_Prim2_0=rulePrim2
		{
			$current = $this_Prim2_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getMultiplication2Access().getMult2LeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='*'
			{
				newLeafNode(otherlv_2, grammarAccess.getMultiplication2Access().getAsteriskKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiplication2Access().getRightPrim2ParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrim2
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiplication2Rule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.Prim2");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrim2
entryRulePrim2 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrim2Rule()); }
	iv_rulePrim2=rulePrim2
	{ $current=$iv_rulePrim2.current; }
	EOF;

// Rule Prim2
rulePrim2 returns [EObject current=null]
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
					$current = forceCreateModelElement(
						grammarAccess.getPrim2Access().getVal2Action_0_0(),
						$current);
				}
			)
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getPrim2Access().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrim2Rule());
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
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getPrim2Access().getLeftParenthesisKeyword_1_0());
			}
			{
				newCompositeNode(grammarAccess.getPrim2Access().getAddition2ParserRuleCall_1_1());
			}
			this_Addition2_3=ruleAddition2
			{
				$current = $this_Addition2_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrim2Access().getRightParenthesisKeyword_1_2());
			}
		)
	)
;

// Entry rule entryRuleDatatypeID
entryRuleDatatypeID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDatatypeIDRule()); }
	iv_ruleDatatypeID=ruleDatatypeID
	{ $current=$iv_ruleDatatypeID.current.getText(); }
	EOF;

// Rule DatatypeID
ruleDatatypeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
		newLeafNode(this_ID_0, grammarAccess.getDatatypeIDAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleSingleCrossReference
entryRuleSingleCrossReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleCrossReferenceRule()); }
	iv_ruleSingleCrossReference=ruleSingleCrossReference
	{ $current=$iv_ruleSingleCrossReference.current; }
	EOF;

// Rule SingleCrossReference
ruleSingleCrossReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#5'
		{
			newLeafNode(otherlv_0, grammarAccess.getSingleCrossReferenceAccess().getNumberSignDigitFiveKeyword_0());
		}
		(
			(
				(
					lv_name_1_1=RULE_TERMINAL_ID
					{
						newLeafNode(lv_name_1_1, grammarAccess.getSingleCrossReferenceAccess().getNameTERMINAL_IDTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_1,
							"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.TERMINAL_ID");
					}
					    |
					lv_name_1_2=RULE_ID
					{
						newLeafNode(lv_name_1_2, grammarAccess.getSingleCrossReferenceAccess().getNameIDTerminalRuleCall_1_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_2,
							"org.eclipse.xtext.common.Terminals.ID");
					}
					    |
					lv_name_1_3='kw5'
					{
						newLeafNode(lv_name_1_3, grammarAccess.getSingleCrossReferenceAccess().getNameKw5Keyword_1_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
						setWithLastConsumed($current, "name", lv_name_1_3, null);
					}
				)
			)
		)
		(
			otherlv_2='kw1'
			{
				newLeafNode(otherlv_2, grammarAccess.getSingleCrossReferenceAccess().getKw1Keyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
					}
					otherlv_3=RULE_TERMINAL_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getSingleCrossReferenceAccess().getRef1SingleCrossReferenceCrossReference_2_1_0());
					}
				)
			)
		)?
		(
			otherlv_4='kw2'
			{
				newLeafNode(otherlv_4, grammarAccess.getSingleCrossReferenceAccess().getKw2Keyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getSingleCrossReferenceAccess().getRef2SingleCrossReferenceCrossReference_3_1_0());
					}
					ruleDatatypeID
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='kw3'
			{
				newLeafNode(otherlv_6, grammarAccess.getSingleCrossReferenceAccess().getKw3Keyword_4_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getSingleCrossReferenceAccess().getRef3SingleCrossReferenceCrossReference_4_1_0());
					}
				)
			)
		)?
		(
			otherlv_8='kw4'
			{
				newLeafNode(otherlv_8, grammarAccess.getSingleCrossReferenceAccess().getKw4Keyword_5_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getSingleCrossReferenceAccess().getRef4SingleCrossReferenceCrossReference_5_1_0());
					}
				)
			)
		)?
		(
			otherlv_10='kw5'
			{
				newLeafNode(otherlv_10, grammarAccess.getSingleCrossReferenceAccess().getKw5Keyword_6_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getSingleCrossReferenceRule());
						}
					}
					otherlv_11='kw5'
					{
						newLeafNode(otherlv_11, grammarAccess.getSingleCrossReferenceAccess().getRef5SingleCrossReferenceCrossReference_6_1_0());
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleBooleanAlternative
entryRuleBooleanAlternative returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanAlternativeRule()); }
	iv_ruleBooleanAlternative=ruleBooleanAlternative
	{ $current=$iv_ruleBooleanAlternative.current; }
	EOF;

// Rule BooleanAlternative
ruleBooleanAlternative returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#6'
		{
			newLeafNode(otherlv_0, grammarAccess.getBooleanAlternativeAccess().getNumberSignDigitSixKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getBooleanAlternativeAccess().getBoolBooleanAlternativeLiteralParserRuleCall_1_0());
				}
				lv_bool_1_0=ruleBooleanAlternativeLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBooleanAlternativeRule());
					}
					set(
						$current,
						"bool",
						lv_bool_1_0,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BooleanAlternativeLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleBooleanAlternativeLiteral
entryRuleBooleanAlternativeLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanAlternativeLiteralRule()); }
	iv_ruleBooleanAlternativeLiteral=ruleBooleanAlternativeLiteral
	{ $current=$iv_ruleBooleanAlternativeLiteral.current; }
	EOF;

// Rule BooleanAlternativeLiteral
ruleBooleanAlternativeLiteral returns [EObject current=null]
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
					grammarAccess.getBooleanAlternativeLiteralAccess().getBooleanAlternativeLiteralAction_0(),
					$current);
			}
		)
		(
			otherlv_1='kw1'
			{
				newLeafNode(otherlv_1, grammarAccess.getBooleanAlternativeLiteralAccess().getKw1Keyword_1_0());
			}
			    |
			(
				(
					lv_isTrue_2_0='kw2'
					{
						newLeafNode(lv_isTrue_2_0, grammarAccess.getBooleanAlternativeLiteralAccess().getIsTrueKw2Keyword_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getBooleanAlternativeLiteralRule());
						}
						setWithLastConsumed($current, "isTrue", lv_isTrue_2_0 != null, "kw2");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleUnassignedDatatype
entryRuleUnassignedDatatype returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnassignedDatatypeRule()); }
	iv_ruleUnassignedDatatype=ruleUnassignedDatatype
	{ $current=$iv_ruleUnassignedDatatype.current; }
	EOF;

// Rule UnassignedDatatype
ruleUnassignedDatatype returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#7'
		{
			newLeafNode(otherlv_0, grammarAccess.getUnassignedDatatypeAccess().getNumberSignDigitSevenKeyword_0());
		}
		(
			(
				lv_val_1_0=RULE_ID
				{
					newLeafNode(lv_val_1_0, grammarAccess.getUnassignedDatatypeAccess().getValIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getUnassignedDatatypeRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		{
			newCompositeNode(grammarAccess.getUnassignedDatatypeAccess().getKW1ParserRuleCall_2());
		}
		ruleKW1
		{
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleKW1
entryRuleKW1 returns [String current=null]:
	{ newCompositeNode(grammarAccess.getKW1Rule()); }
	iv_ruleKW1=ruleKW1
	{ $current=$iv_ruleKW1.current.getText(); }
	EOF;

// Rule KW1
ruleKW1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='kw1'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getKW1Access().getKw1Keyword_0());
		}
		    |
		(
			kw='matched'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getKW1Access().getMatchedKeyword_1_0());
			}
			(
				this_INT_2=RULE_INT
				{
					$current.merge(this_INT_2);
				}
				{
					newLeafNode(this_INT_2, grammarAccess.getKW1Access().getINTTerminalRuleCall_1_1());
				}
			)?
		)
	)
;

// Entry rule entryRuleOptionalSingleTransition
entryRuleOptionalSingleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionalSingleTransitionRule()); }
	iv_ruleOptionalSingleTransition=ruleOptionalSingleTransition
	{ $current=$iv_ruleOptionalSingleTransition.current; }
	EOF;

// Rule OptionalSingleTransition
ruleOptionalSingleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#8'
		{
			newLeafNode(otherlv_0, grammarAccess.getOptionalSingleTransitionAccess().getNumberSignDigitEightKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getOptionalSingleTransitionAccess().getKW1ParserRuleCall_1());
			}
			ruleKW1
			{
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				lv_val_2_0=RULE_ID
				{
					newLeafNode(lv_val_2_0, grammarAccess.getOptionalSingleTransitionAccess().getValIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptionalSingleTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleOptionalManyTransition
entryRuleOptionalManyTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOptionalManyTransitionRule()); }
	iv_ruleOptionalManyTransition=ruleOptionalManyTransition
	{ $current=$iv_ruleOptionalManyTransition.current; }
	EOF;

// Rule OptionalManyTransition
ruleOptionalManyTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#9'
		{
			newLeafNode(otherlv_0, grammarAccess.getOptionalManyTransitionAccess().getNumberSignDigitNineKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getOptionalManyTransitionAccess().getKW1ParserRuleCall_1());
			}
			ruleKW1
			{
				afterParserOrEnumRuleCall();
			}
		)*
		(
			(
				lv_val_2_0=RULE_ID
				{
					newLeafNode(lv_val_2_0, grammarAccess.getOptionalManyTransitionAccess().getValIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getOptionalManyTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleMandatoryManyTransition
entryRuleMandatoryManyTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMandatoryManyTransitionRule()); }
	iv_ruleMandatoryManyTransition=ruleMandatoryManyTransition
	{ $current=$iv_ruleMandatoryManyTransition.current; }
	EOF;

// Rule MandatoryManyTransition
ruleMandatoryManyTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#10'
		{
			newLeafNode(otherlv_0, grammarAccess.getMandatoryManyTransitionAccess().getNumberSignDigitOneDigitZeroKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getMandatoryManyTransitionAccess().getKW1ParserRuleCall_1());
			}
			ruleKW1
			{
				afterParserOrEnumRuleCall();
			}
		)+
		(
			(
				lv_val_2_0=RULE_ID
				{
					newLeafNode(lv_val_2_0, grammarAccess.getMandatoryManyTransitionAccess().getValIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMandatoryManyTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleAlternativeTransition
entryRuleAlternativeTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlternativeTransitionRule()); }
	iv_ruleAlternativeTransition=ruleAlternativeTransition
	{ $current=$iv_ruleAlternativeTransition.current; }
	EOF;

// Rule AlternativeTransition
ruleAlternativeTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#11'
		{
			newLeafNode(otherlv_0, grammarAccess.getAlternativeTransitionAccess().getNumberSignDigitOneDigitOneKeyword_0());
		}
		(
			{
				newCompositeNode(grammarAccess.getAlternativeTransitionAccess().getKW1ParserRuleCall_1_0());
			}
			ruleKW1
			{
				afterParserOrEnumRuleCall();
			}
			    |
			otherlv_2='kw2'
			{
				newLeafNode(otherlv_2, grammarAccess.getAlternativeTransitionAccess().getKw2Keyword_1_1());
			}
		)
		(
			(
				lv_val_3_0=RULE_ID
				{
					newLeafNode(lv_val_3_0, grammarAccess.getAlternativeTransitionAccess().getValIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAlternativeTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleBooleanDatatypeID
entryRuleBooleanDatatypeID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBooleanDatatypeIDRule()); }
	iv_ruleBooleanDatatypeID=ruleBooleanDatatypeID
	{ $current=$iv_ruleBooleanDatatypeID.current.getText(); }
	EOF;

// Rule BooleanDatatypeID
ruleBooleanDatatypeID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
		newLeafNode(this_ID_0, grammarAccess.getBooleanDatatypeIDAccess().getIDTerminalRuleCall());
	}
;

// Entry rule entryRuleBooleanValues
entryRuleBooleanValues returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanValuesRule()); }
	iv_ruleBooleanValues=ruleBooleanValues
	{ $current=$iv_ruleBooleanValues.current; }
	EOF;

// Rule BooleanValues
ruleBooleanValues returns [EObject current=null]
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
					grammarAccess.getBooleanValuesAccess().getBooleanValuesAction_0(),
					$current);
			}
		)
		otherlv_1='#12'
		{
			newLeafNode(otherlv_1, grammarAccess.getBooleanValuesAccess().getNumberSignDigitOneDigitTwoKeyword_1());
		}
		(
			(
				lv_val1_2_0='kw1'
				{
					newLeafNode(lv_val1_2_0, grammarAccess.getBooleanValuesAccess().getVal1Kw1Keyword_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBooleanValuesRule());
					}
					setWithLastConsumed($current, "val1", lv_val1_2_0 != null, "kw1");
				}
			)
		)?
		(
			(
				lv_val2_3_0=RULE_BOOLEAN_TERMINAL_ID
				{
					newLeafNode(lv_val2_3_0, grammarAccess.getBooleanValuesAccess().getVal2BOOLEAN_TERMINAL_IDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBooleanValuesRule());
					}
					setWithLastConsumed(
						$current,
						"val2",
						lv_val2_3_0 != null,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BOOLEAN_TERMINAL_ID");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getBooleanValuesAccess().getVal3BooleanDatatypeIDParserRuleCall_4_0());
				}
				lv_val3_4_0=ruleBooleanDatatypeID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBooleanValuesRule());
					}
					set(
						$current,
						"val3",
						lv_val3_4_0 != null,
						"org.eclipse.xtext.serializer.SyntacticSequencerTestLanguage.BooleanDatatypeID");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleLongAlternative
entryRuleLongAlternative returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLongAlternativeRule()); }
	iv_ruleLongAlternative=ruleLongAlternative
	{ $current=$iv_ruleLongAlternative.current; }
	EOF;

// Rule LongAlternative
ruleLongAlternative returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#13'
		{
			newLeafNode(otherlv_0, grammarAccess.getLongAlternativeAccess().getNumberSignDigitOneDigitThreeKeyword_0());
		}
		(
			(
				lv_foo_1_0=RULE_ID
				{
					newLeafNode(lv_foo_1_0, grammarAccess.getLongAlternativeAccess().getFooIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLongAlternativeRule());
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
			(
				otherlv_2='kw1'
				{
					newLeafNode(otherlv_2, grammarAccess.getLongAlternativeAccess().getKw1Keyword_2_0_0());
				}
				(
					(
						lv_val1_3_0=RULE_ID
						{
							newLeafNode(lv_val1_3_0, grammarAccess.getLongAlternativeAccess().getVal1IDTerminalRuleCall_2_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLongAlternativeRule());
							}
							addWithLastConsumed(
								$current,
								"val1",
								lv_val1_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
			    |
			(
				otherlv_4='kw2'
				{
					newLeafNode(otherlv_4, grammarAccess.getLongAlternativeAccess().getKw2Keyword_2_1_0());
				}
				(
					(
						lv_val2_5_0=RULE_ID
						{
							newLeafNode(lv_val2_5_0, grammarAccess.getLongAlternativeAccess().getVal2IDTerminalRuleCall_2_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLongAlternativeRule());
							}
							addWithLastConsumed(
								$current,
								"val2",
								lv_val2_5_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
			    |
			(
				otherlv_6='kw3'
				{
					newLeafNode(otherlv_6, grammarAccess.getLongAlternativeAccess().getKw3Keyword_2_2_0());
				}
				(
					(
						lv_val3_7_0=RULE_ID
						{
							newLeafNode(lv_val3_7_0, grammarAccess.getLongAlternativeAccess().getVal3IDTerminalRuleCall_2_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLongAlternativeRule());
							}
							addWithLastConsumed(
								$current,
								"val3",
								lv_val3_7_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
			    |
			(
				otherlv_8='kw4'
				{
					newLeafNode(otherlv_8, grammarAccess.getLongAlternativeAccess().getKw4Keyword_2_3_0());
				}
				(
					(
						lv_val4_9_0=RULE_ID
						{
							newLeafNode(lv_val4_9_0, grammarAccess.getLongAlternativeAccess().getVal4IDTerminalRuleCall_2_3_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLongAlternativeRule());
							}
							addWithLastConsumed(
								$current,
								"val4",
								lv_val4_9_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
			    |
			(
				otherlv_10='kw5'
				{
					newLeafNode(otherlv_10, grammarAccess.getLongAlternativeAccess().getKw5Keyword_2_4_0());
				}
				(
					(
						lv_val5_11_0=RULE_ID
						{
							newLeafNode(lv_val5_11_0, grammarAccess.getLongAlternativeAccess().getVal5IDTerminalRuleCall_2_4_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLongAlternativeRule());
							}
							addWithLastConsumed(
								$current,
								"val5",
								lv_val5_11_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
			    |
			(
				otherlv_12='kw6'
				{
					newLeafNode(otherlv_12, grammarAccess.getLongAlternativeAccess().getKw6Keyword_2_5_0());
				}
				(
					(
						lv_val6_13_0=RULE_ID
						{
							newLeafNode(lv_val6_13_0, grammarAccess.getLongAlternativeAccess().getVal6IDTerminalRuleCall_2_5_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLongAlternativeRule());
							}
							addWithLastConsumed(
								$current,
								"val6",
								lv_val6_13_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
			    |
			(
				otherlv_14='kw7'
				{
					newLeafNode(otherlv_14, grammarAccess.getLongAlternativeAccess().getKw7Keyword_2_6_0());
				}
				(
					(
						lv_val7_15_0=RULE_ID
						{
							newLeafNode(lv_val7_15_0, grammarAccess.getLongAlternativeAccess().getVal7IDTerminalRuleCall_2_6_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLongAlternativeRule());
							}
							addWithLastConsumed(
								$current,
								"val7",
								lv_val7_15_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
			    |
			(
				otherlv_16='kw8'
				{
					newLeafNode(otherlv_16, grammarAccess.getLongAlternativeAccess().getKw8Keyword_2_7_0());
				}
				(
					(
						lv_val8_17_0=RULE_ID
						{
							newLeafNode(lv_val8_17_0, grammarAccess.getLongAlternativeAccess().getVal8IDTerminalRuleCall_2_7_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getLongAlternativeRule());
							}
							addWithLastConsumed(
								$current,
								"val8",
								lv_val8_17_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)?
			)
		)*
		otherlv_18='!'
		{
			newLeafNode(otherlv_18, grammarAccess.getLongAlternativeAccess().getExclamationMarkKeyword_3());
		}
	)
;

// Entry rule entryRuleActionOnly
entryRuleActionOnly returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionOnlyRule()); }
	iv_ruleActionOnly=ruleActionOnly
	{ $current=$iv_ruleActionOnly.current; }
	EOF;

// Rule ActionOnly
ruleActionOnly returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#14'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionOnlyAccess().getNumberSignDigitOneDigitFourKeyword_0());
		}
		(
			otherlv_1='kw1'
			{
				newLeafNode(otherlv_1, grammarAccess.getActionOnlyAccess().getKw1Keyword_1());
			}
		)?
		(
			(RULE_ID)=>
			this_ID_2=RULE_ID
			{
				newLeafNode(this_ID_2, grammarAccess.getActionOnlyAccess().getIDTerminalRuleCall_2());
			}
		)?
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActionOnlyAccess().getActionOnlyAction_3(),
					$current);
			}
		)
		(
			otherlv_4='kw2'
			{
				newLeafNode(otherlv_4, grammarAccess.getActionOnlyAccess().getKw2Keyword_4());
			}
		)?
		(
			this_ID_5=RULE_ID
			{
				newLeafNode(this_ID_5, grammarAccess.getActionOnlyAccess().getIDTerminalRuleCall_5());
			}
		)?
	)
;

// Entry rule entryRuleFragmentCaller
entryRuleFragmentCaller returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFragmentCallerRule()); }
	iv_ruleFragmentCaller=ruleFragmentCaller
	{ $current=$iv_ruleFragmentCaller.current; }
	EOF;

// Rule FragmentCaller
ruleFragmentCaller returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='#15'
		{
			newLeafNode(otherlv_0, grammarAccess.getFragmentCallerAccess().getNumberSignDigitOneDigitFiveKeyword_0());
		}
		(
			(
				lv_val1_1_0=RULE_ID
				{
					newLeafNode(lv_val1_1_0, grammarAccess.getFragmentCallerAccess().getVal1IDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFragmentCallerRule());
					}
					setWithLastConsumed(
						$current,
						"val1",
						lv_val1_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getFragmentCallerRule());
			}
			newCompositeNode(grammarAccess.getFragmentCallerAccess().getFragment1ParserRuleCall_2());
		}
		this_Fragment1_2=ruleFragment1[$current]
		{
			$current = $this_Fragment1_2.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_val_3_0=RULE_ID
				{
					newLeafNode(lv_val_3_0, grammarAccess.getFragmentCallerAccess().getValIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFragmentCallerRule());
					}
					setWithLastConsumed(
						$current,
						"val",
						lv_val_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;


// Rule Fragment1
ruleFragment1[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_fragVal_0_0=RULE_ID
			{
				newLeafNode(lv_fragVal_0_0, grammarAccess.getFragment1Access().getFragValIDTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getFragment1Rule());
				}
				setWithLastConsumed(
					$current,
					"fragVal",
					lv_fragVal_0_0,
					"org.eclipse.xtext.common.Terminals.ID");
			}
		)
	)
;

// Entry rule entryRuleBug398890
entryRuleBug398890 returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBug398890Rule()); }
	iv_ruleBug398890=ruleBug398890
	{ $current=$iv_ruleBug398890.current; }
	EOF;

// Rule Bug398890
ruleBug398890 returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_C_COMMENT_END_0=RULE_C_COMMENT_END
		{
			newLeafNode(this_C_COMMENT_END_0, grammarAccess.getBug398890Access().getC_COMMENT_ENDTerminalRuleCall_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getBug398890Access().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBug398890Rule());
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

RULE_TERMINAL_ID : '$1' RULE_ID;

RULE_BOOLEAN_TERMINAL_ID : '%1' RULE_ID;

RULE_C_COMMENT_END : '*/';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
