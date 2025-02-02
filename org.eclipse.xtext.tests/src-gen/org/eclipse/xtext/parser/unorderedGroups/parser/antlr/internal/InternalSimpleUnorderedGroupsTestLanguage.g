/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalSimpleUnorderedGroupsTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.unorderedGroups.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.unorderedGroups.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.unorderedGroups.services.SimpleUnorderedGroupsTestLanguageGrammarAccess;

}

@parser::members {

 	private SimpleUnorderedGroupsTestLanguageGrammarAccess grammarAccess;

    public InternalSimpleUnorderedGroupsTestLanguageParser(TokenStream input, SimpleUnorderedGroupsTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "DelegateModel";
   	}

   	@Override
   	protected SimpleUnorderedGroupsTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDelegateModel
entryRuleDelegateModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDelegateModelRule()); }
	iv_ruleDelegateModel=ruleDelegateModel
	{ $current=$iv_ruleDelegateModel.current; }
	EOF;

// Rule DelegateModel
ruleDelegateModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getDelegateModelAccess().getModelParserRuleCall());
	}
	this_Model_0=ruleModel
	{
		$current = $this_Model_0.current;
		afterParserOrEnumRuleCall();
	}
;

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
			{
				$current = forceCreateModelElement(
					grammarAccess.getModelAccess().getModelAction_0(),
					$current);
			}
		)
		(
			(
				otherlv_1='1'
				{
					newLeafNode(otherlv_1, grammarAccess.getModelAccess().getDigitOneKeyword_1_0_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1(), 0);
							}
										({true}?=>((
											lv_first_3_0='a'
											{
												newLeafNode(lv_first_3_0, grammarAccess.getModelAccess().getFirstAKeyword_1_0_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "first", lv_first_3_0 != null, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1(), 1);
							}
										({true}?=>((
											lv_second_4_0='b'
											{
												newLeafNode(lv_second_4_0, grammarAccess.getModelAccess().getSecondBKeyword_1_0_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "second", lv_second_4_0 != null, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_0_1());
						}
				)
			)
			    |
			(
				otherlv_5='2'
				{
					newLeafNode(otherlv_5, grammarAccess.getModelAccess().getDigitTwoKeyword_1_1_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1(), 0);
							}
										({true}?=>((
											lv_first_7_0='a'
											{
												newLeafNode(lv_first_7_0, grammarAccess.getModelAccess().getFirstAKeyword_1_1_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "first", lv_first_7_0 != null, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1(), 1);
							}
										({true}?=>((
											lv_second_8_0='b'
											{
												newLeafNode(lv_second_8_0, grammarAccess.getModelAccess().getSecondBKeyword_1_1_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "second", lv_second_8_0 != null, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1(), 2)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1(), 2);
							}
										({true}?=>((
											lv_third_9_0='c'
											{
												newLeafNode(lv_third_9_0, grammarAccess.getModelAccess().getThirdCKeyword_1_1_1_2_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "third", lv_third_9_0 != null, "c");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1(), 3)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1(), 3);
							}
										({true}?=>((
											lv_forth_10_0='d'
											{
												newLeafNode(lv_forth_10_0, grammarAccess.getModelAccess().getForthDKeyword_1_1_1_3_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "forth", lv_forth_10_0 != null, "d");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_1_1());
						}
				)
			)
			    |
			(
				otherlv_11='3'
				{
					newLeafNode(otherlv_11, grammarAccess.getModelAccess().getDigitThreeKeyword_1_2_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_2_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_2_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_2_1(), 0);
							}
										({true}?=>((
											lv_first_13_0='a'
											{
												newLeafNode(lv_first_13_0, grammarAccess.getModelAccess().getFirstAKeyword_1_2_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "first", lv_first_13_0 != null, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_2_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_2_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_2_1(), 1);
							}
										({true}?=>((
											lv_second_14_0='b'
											{
												newLeafNode(lv_second_14_0, grammarAccess.getModelAccess().getSecondBKeyword_1_2_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "second", lv_second_14_0 != null, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_2_1());
							}
						)
					)
							)*
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_2_1());
						}
				)
			)
			    |
			(
				otherlv_15='4'
				{
					newLeafNode(otherlv_15, grammarAccess.getModelAccess().getDigitFourKeyword_1_3_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1(), 0);
							}
										({true}?=>((
											lv_first_17_0='a'
											{
												newLeafNode(lv_first_17_0, grammarAccess.getModelAccess().getFirstAKeyword_1_3_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "first", lv_first_17_0 != null, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1(), 1);
							}
										({true}?=>((
											lv_second_18_0='b'
											{
												newLeafNode(lv_second_18_0, grammarAccess.getModelAccess().getSecondBKeyword_1_3_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "second", lv_second_18_0 != null, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_3_1());
						}
				)
			)
			    |
			(
				otherlv_19='5'
				{
					newLeafNode(otherlv_19, grammarAccess.getModelAccess().getDigitFiveKeyword_1_4_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1(), 0);
							}
										({true}?=>((
											lv_first_21_0='a'
											{
												newLeafNode(lv_first_21_0, grammarAccess.getModelAccess().getFirstAKeyword_1_4_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "first", lv_first_21_0 != null, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1(), 1);
							}
										({true}?=>((
											lv_second_22_0='b'
											{
												newLeafNode(lv_second_22_0, grammarAccess.getModelAccess().getSecondBKeyword_1_4_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "second", lv_second_22_0 != null, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_4_1());
						}
				)
			)
			    |
			(
				otherlv_23='6'
				{
					newLeafNode(otherlv_23, grammarAccess.getModelAccess().getDigitSixKeyword_1_5_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1(), 0);
							}
										({true}?=>((
											lv_firstAsList_25_0='a'
											{
												newLeafNode(lv_firstAsList_25_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_5_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_25_0, "a");
											}
										)
										))+
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1(), 1);
							}
										({true}?=>((
											lv_secondAsList_26_0='b'
											{
												newLeafNode(lv_secondAsList_26_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_5_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "secondAsList", lv_secondAsList_26_0, "b");
											}
										)
										))+
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_5_1());
						}
				)
			)
			    |
			(
				otherlv_27='7'
				{
					newLeafNode(otherlv_27, grammarAccess.getModelAccess().getDigitSevenKeyword_1_6_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1(), 0);
							}
										({true}?=>((
											lv_firstAsList_29_0='a'
											{
												newLeafNode(lv_firstAsList_29_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_6_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_29_0, "a");
											}
										)
										))+
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1(), 1);
							}
										({true}?=>((
											lv_secondAsList_30_0='b'
											{
												newLeafNode(lv_secondAsList_30_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_6_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "secondAsList", lv_secondAsList_30_0, "b");
											}
										)
										))+
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_6_1());
						}
				)
			)
			    |
			(
				otherlv_31='8'
				{
					newLeafNode(otherlv_31, grammarAccess.getModelAccess().getDigitEightKeyword_1_7_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1(), 0);
							}
										({true}?=>(otherlv_33='a'
										{
											newLeafNode(otherlv_33, grammarAccess.getModelAccess().getAKeyword_1_7_1_0_0());
										}
										otherlv_34='b'
										{
											newLeafNode(otherlv_34, grammarAccess.getModelAccess().getBKeyword_1_7_1_0_1());
										}
										(
											(
												lv_first_35_0='c'
												{
													newLeafNode(lv_first_35_0, grammarAccess.getModelAccess().getFirstCKeyword_1_7_1_0_2_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getModelRule());
													}
													setWithLastConsumed($current, "first", lv_first_35_0 != null, "c");
												}
											)
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1(), 1);
							}
										({true}?=>(otherlv_36='a'
										{
											newLeafNode(otherlv_36, grammarAccess.getModelAccess().getAKeyword_1_7_1_1_0());
										}
										otherlv_37='b'
										{
											newLeafNode(otherlv_37, grammarAccess.getModelAccess().getBKeyword_1_7_1_1_1());
										}
										(
											(
												lv_second_38_0='d'
												{
													newLeafNode(lv_second_38_0, grammarAccess.getModelAccess().getSecondDKeyword_1_7_1_1_2_0());
												}
												{
													if ($current==null) {
														$current = createModelElement(grammarAccess.getModelRule());
													}
													setWithLastConsumed($current, "second", lv_second_38_0 != null, "d");
												}
											)
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_7_1());
						}
				)
			)
			    |
			(
				otherlv_39='9'
				{
					newLeafNode(otherlv_39, grammarAccess.getModelAccess().getDigitNineKeyword_1_8_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1(), 0);
							}
										({true}?=>((
											lv_firstAsList_41_0='a'
											{
												newLeafNode(lv_firstAsList_41_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_8_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_41_0, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1(), 1);
							}
										({true}?=>((
											lv_secondAsList_42_0='b'
											{
												newLeafNode(lv_secondAsList_42_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_8_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "secondAsList", lv_secondAsList_42_0, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_8_1());
						}
				)+
			)
			    |
			(
				otherlv_43='10'
				{
					newLeafNode(otherlv_43, grammarAccess.getModelAccess().getDigitOneDigitZeroKeyword_1_9_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1(), 0);
							}
										({true}?=>((
											lv_firstAsList_45_0='a'
											{
												newLeafNode(lv_firstAsList_45_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_9_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_45_0, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1(), 1);
							}
										({true}?=>((
											lv_secondAsList_46_0='b'
											{
												newLeafNode(lv_secondAsList_46_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_9_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "secondAsList", lv_secondAsList_46_0, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_9_1());
						}
				)*
			)
			    |
			(
				otherlv_47='11'
				{
					newLeafNode(otherlv_47, grammarAccess.getModelAccess().getDigitOneDigitOneKeyword_1_10_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1(), 0);
							}
										({true}?=>((
											lv_first_49_0='a'
											{
												newLeafNode(lv_first_49_0, grammarAccess.getModelAccess().getFirstAKeyword_1_10_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "first", lv_first_49_0 != null, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1(), 1);
							}
										({true}?=>((
											lv_second_50_0='b'
											{
												newLeafNode(lv_second_50_0, grammarAccess.getModelAccess().getSecondBKeyword_1_10_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												setWithLastConsumed($current, "second", lv_second_50_0 != null, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_10_1());
						}
				)?
			)
			    |
			(
				otherlv_51='12'
				{
					newLeafNode(otherlv_51, grammarAccess.getModelAccess().getDigitOneDigitTwoKeyword_1_11_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1(), 0);
							}
										({true}?=>((
											lv_firstAsList_53_0='a'
											{
												newLeafNode(lv_firstAsList_53_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_11_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_53_0, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1(), 1);
							}
										({true}?=>((
											lv_secondAsList_54_0='b'
											{
												newLeafNode(lv_secondAsList_54_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_11_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "secondAsList", lv_secondAsList_54_0, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_11_1());
						}
				)
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2(), 0);
							}
										({true}?=>((
											lv_firstAsList_56_0='a'
											{
												newLeafNode(lv_firstAsList_56_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_11_2_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_56_0, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2(), 1);
							}
										({true}?=>((
											lv_secondAsList_57_0='b'
											{
												newLeafNode(lv_secondAsList_57_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_11_2_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "secondAsList", lv_secondAsList_57_0, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_11_2());
						}
				)
			)
			    |
			(
				otherlv_58='13'
				{
					newLeafNode(otherlv_58, grammarAccess.getModelAccess().getDigitOneDigitThreeKeyword_1_12_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1(), 0);
							}
										({true}?=>((
											lv_firstAsList_60_0='a'
											{
												newLeafNode(lv_firstAsList_60_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_12_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_60_0, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1(), 1);
							}
										({true}?=>((
											lv_secondAsList_61_0='b'
											{
												newLeafNode(lv_secondAsList_61_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_12_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getModelRule());
												}
												addWithLastConsumed($current, "secondAsList", lv_secondAsList_61_0, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_12_1());
						}
				)?
				(
					(
						lv_firstAsList_62_0='a'
						{
							newLeafNode(lv_firstAsList_62_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_12_2_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							addWithLastConsumed($current, "firstAsList", lv_firstAsList_62_0, "a");
						}
					)
				)
				(
					(
						lv_secondAsList_63_0='b'
						{
							newLeafNode(lv_secondAsList_63_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_12_3_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getModelRule());
							}
							addWithLastConsumed($current, "secondAsList", lv_secondAsList_63_0, "b");
						}
					)
				)
			)
			    |
			(
				otherlv_64='14'
				{
					newLeafNode(otherlv_64, grammarAccess.getModelAccess().getDigitOneDigitFourKeyword_1_13_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1(), 0);
							}
										({true}?=>((
											{ 
											  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0());
											}
											(
												(
										(
											{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0(), 0)}?=>(
												{
													getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0(), 0);
												}
															({true}?=>((
																lv_firstAsList_67_0='a'
																{
																	newLeafNode(lv_firstAsList_67_0, grammarAccess.getModelAccess().getFirstAsListAKeyword_1_13_1_0_0_0());
																}
																{
																	if ($current==null) {
																		$current = createModelElement(grammarAccess.getModelRule());
																	}
																	addWithLastConsumed($current, "firstAsList", lv_firstAsList_67_0, "a");
																}
															)
															))
												{ 
													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0());
												}
											)
										)|
										(
											{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0(), 1)}?=>(
												{
													getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0(), 1);
												}
															({true}?=>((
																lv_secondAsList_68_0='b'
																{
																	newLeafNode(lv_secondAsList_68_0, grammarAccess.getModelAccess().getSecondAsListBKeyword_1_13_1_0_1_0());
																}
																{
																	if ($current==null) {
																		$current = createModelElement(grammarAccess.getModelRule());
																	}
																	addWithLastConsumed($current, "secondAsList", lv_secondAsList_68_0, "b");
																}
															)
															))
												{ 
													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0());
												}
											)
										)
												)+
												{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0())}?
											)
										)
											{ 
											  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_0());
											}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1(), 1);
							}
										({true}?=>((
											{ 
											  getUnorderedGroupHelper().enter(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1());
											}
											(
												(
										(
											{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1(), 0)}?=>(
												{
													getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1(), 0);
												}
															({true}?=>((
																lv_thirdAsList_70_0='c'
																{
																	newLeafNode(lv_thirdAsList_70_0, grammarAccess.getModelAccess().getThirdAsListCKeyword_1_13_1_1_0_0());
																}
																{
																	if ($current==null) {
																		$current = createModelElement(grammarAccess.getModelRule());
																	}
																	addWithLastConsumed($current, "thirdAsList", lv_thirdAsList_70_0, "c");
																}
															)
															))
												{ 
													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1());
												}
											)
										)|
										(
											{getUnorderedGroupHelper().canSelect(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1(), 1)}?=>(
												{
													getUnorderedGroupHelper().select(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1(), 1);
												}
															({true}?=>((
																lv_forthAsList_71_0='d'
																{
																	newLeafNode(lv_forthAsList_71_0, grammarAccess.getModelAccess().getForthAsListDKeyword_1_13_1_1_1_0());
																}
																{
																	if ($current==null) {
																		$current = createModelElement(grammarAccess.getModelRule());
																	}
																	addWithLastConsumed($current, "forthAsList", lv_forthAsList_71_0, "d");
																}
															)
															))
												{ 
													getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1());
												}
											)
										)
												)+
												{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1())}?
											)
										)
											{ 
											  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1_1());
											}
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getModelAccess().getUnorderedGroup_1_13_1());
						}
				)+
			)
			    |
			(
				otherlv_72='datatypes'
				{
					newLeafNode(otherlv_72, grammarAccess.getModelAccess().getDatatypesKeyword_1_14_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getValueUnorderedDatatypeParserRuleCall_1_14_1_0());
						}
						lv_value_73_0=ruleUnorderedDatatype
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"value",
								lv_value_73_0,
								"org.eclipse.xtext.parser.unorderedGroups.UnorderedGroupsTestLanguage.UnorderedDatatype");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_74='serialization'
				{
					newLeafNode(otherlv_74, grammarAccess.getModelAccess().getSerializationKeyword_1_15_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getSerializedUnorderedSerializationParserRuleCall_1_15_1_0());
						}
						lv_serialized_75_0=ruleUnorderedSerialization
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							set(
								$current,
								"serialized",
								lv_serialized_75_0,
								"org.eclipse.xtext.parser.unorderedGroups.UnorderedGroupsTestLanguage.UnorderedSerialization");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_76='bug302585'
				{
					newLeafNode(otherlv_76, grammarAccess.getModelAccess().getBug302585Keyword_1_16_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getModelAccess().getNestedModelNestedModelParserRuleCall_1_16_1_0());
						}
						lv_nestedModel_77_0=ruleNestedModel
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getModelRule());
							}
							add(
								$current,
								"nestedModel",
								lv_nestedModel_77_0,
								"org.eclipse.xtext.parser.unorderedGroups.UnorderedGroupsTestLanguage.NestedModel");
							afterParserOrEnumRuleCall();
						}
					)
				)*
			)
		)
	)
;

// Entry rule entryRuleNestedModel
entryRuleNestedModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedModelRule()); }
	iv_ruleNestedModel=ruleNestedModel
	{ $current=$iv_ruleNestedModel.current; }
	EOF;

// Rule NestedModel
ruleNestedModel returns [EObject current=null]
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
					grammarAccess.getNestedModelAccess().getNestedModelAction_0(),
					$current);
			}
		)
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getNestedModelAccess().getUnorderedGroup_1());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNestedModelAccess().getUnorderedGroup_1(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNestedModelAccess().getUnorderedGroup_1(), 0);
					}
								({true}?=>((
									lv_first_2_0='a'
									{
										newLeafNode(lv_first_2_0, grammarAccess.getNestedModelAccess().getFirstAKeyword_1_0_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getNestedModelRule());
										}
										setWithLastConsumed($current, "first", lv_first_2_0 != null, "a");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNestedModelAccess().getUnorderedGroup_1());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getNestedModelAccess().getUnorderedGroup_1(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getNestedModelAccess().getUnorderedGroup_1(), 1);
					}
								({true}?=>((
									lv_second_3_0='b'
									{
										newLeafNode(lv_second_3_0, grammarAccess.getNestedModelAccess().getSecondBKeyword_1_1_0());
									}
									{
										if ($current==null) {
											$current = createModelElement(grammarAccess.getNestedModelRule());
										}
										setWithLastConsumed($current, "second", lv_second_3_0 != null, "b");
									}
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNestedModelAccess().getUnorderedGroup_1());
					}
				)
			)
					)+
					{getUnorderedGroupHelper().canLeave(grammarAccess.getNestedModelAccess().getUnorderedGroup_1())}?
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getNestedModelAccess().getUnorderedGroup_1());
				}
		)?
		otherlv_4='nested'
		{
			newLeafNode(otherlv_4, grammarAccess.getNestedModelAccess().getNestedKeyword_2());
		}
	)
;

// Entry rule entryRuleUnorderedDatatype
entryRuleUnorderedDatatype returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedDatatypeRule()); }
	iv_ruleUnorderedDatatype=ruleUnorderedDatatype
	{ $current=$iv_ruleUnorderedDatatype.current.getText(); }
	EOF;

// Rule UnorderedDatatype
ruleUnorderedDatatype returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			kw='1'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitOneKeyword_0_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_0_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_0_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_0_1());
					}
			)
		)
		    |
		(
			kw='2'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitTwoKeyword_1_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_1_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_1_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1(), 2);
						}
									({true}?=>(kw='c'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getCKeyword_1_1_2());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1(), 3)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1(), 3);
						}
									({true}?=>(kw='d'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDKeyword_1_1_3());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_1_1());
					}
			)
		)
		    |
		(
			kw='3'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitThreeKeyword_2_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_2_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_2_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_2_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_2_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_2_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_2_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_2_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_2_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_2_1());
						}
					)
				)
						)*
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_2_1());
					}
			)
		)
		    |
		(
			kw='4'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitFourKeyword_3_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_3_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_3_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_3_1());
					}
			)
		)
		    |
		(
			kw='5'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitFiveKeyword_4_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_4_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_4_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_4_1());
					}
			)
		)
		    |
		(
			kw='6'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitSixKeyword_5_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_5_1_0());
									}
									))+
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_5_1_1());
									}
									))+
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_5_1());
					}
			)
		)
		    |
		(
			kw='7'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitSevenKeyword_6_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_6_1_0());
									}
									))+
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_6_1_1());
									}
									))+
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_6_1());
					}
			)
		)
		    |
		(
			kw='8'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitEightKeyword_7_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_7_1_0_0());
									}
									kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_7_1_0_1());
									}
									kw='c'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getCKeyword_7_1_0_2());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1(), 1);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_7_1_1_0());
									}
									kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_7_1_1_1());
									}
									kw='d'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDKeyword_7_1_1_2());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_7_1());
					}
			)
		)
		    |
		(
			kw='9'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitNineKeyword_8_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_8_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_8_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_8_1());
					}
			)+
		)
		    |
		(
			kw='10'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitOneDigitZeroKeyword_9_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_9_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_9_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_9_1());
					}
			)*
		)
		    |
		(
			kw='11'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitOneDigitOneKeyword_10_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_10_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_10_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_10_1());
					}
			)?
		)
		    |
		(
			kw='12'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitOneDigitTwoKeyword_11_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_11_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_11_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_1());
					}
			)
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_11_2_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_11_2_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_11_2());
					}
			)
		)
		    |
		(
			kw='13'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitOneDigitThreeKeyword_12_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1(), 0);
						}
									({true}?=>(kw='a'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_12_1_0());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1(), 1);
						}
									({true}?=>(kw='b'
									{
										$current.merge(kw);
										newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_12_1_1());
									}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_12_1());
					}
			)?
			kw='a'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_12_2());
			}
			kw='b'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_12_3());
			}
		)
		    |
		(
			kw='14'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDigitOneDigitFourKeyword_13_0());
			}
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1(), 0);
						}
									({true}?=>((
										{ 
										  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0());
										}
										(
											(
									(
										{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0(), 0)}?=>(
											{
												getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0(), 0);
											}
														({true}?=>(kw='a'
														{
															$current.merge(kw);
															newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getAKeyword_13_1_0_0());
														}
														))
											{ 
												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0());
											}
										)
									)|
									(
										{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0(), 1)}?=>(
											{
												getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0(), 1);
											}
														({true}?=>(kw='b'
														{
															$current.merge(kw);
															newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getBKeyword_13_1_0_1());
														}
														))
											{ 
												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0());
											}
										)
									)
											)+
											{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0())}?
										)
									)
										{ 
										  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_0());
										}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1(), 1);
						}
									({true}?=>((
										{ 
										  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1());
										}
										(
											(
									(
										{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1(), 0)}?=>(
											{
												getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1(), 0);
											}
														({true}?=>(kw='c'
														{
															$current.merge(kw);
															newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getCKeyword_13_1_1_0());
														}
														))
											{ 
												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1());
											}
										)
									)|
									(
										{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1(), 1)}?=>(
											{
												getUnorderedGroupHelper().select(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1(), 1);
											}
														({true}?=>(kw='d'
														{
															$current.merge(kw);
															newLeafNode(kw, grammarAccess.getUnorderedDatatypeAccess().getDKeyword_13_1_1_1());
														}
														))
											{ 
												getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1());
											}
										)
									)
											)+
											{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1())}?
										)
									)
										{ 
										  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1_1());
										}
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedDatatypeAccess().getUnorderedGroup_13_1());
					}
			)+
		)
	)
;

// Entry rule entryRuleUnorderedSerialization
entryRuleUnorderedSerialization returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedSerializationRule()); }
	iv_ruleUnorderedSerialization=ruleUnorderedSerialization
	{ $current=$iv_ruleUnorderedSerialization.current; }
	EOF;

// Rule UnorderedSerialization
ruleUnorderedSerialization returns [EObject current=null]
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
					grammarAccess.getUnorderedSerializationAccess().getUnorderedSerializationAction_0(),
					$current);
			}
		)
		(
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0(), 0);
						}
									({true}?=>(otherlv_2='1'
									{
										newLeafNode(otherlv_2, grammarAccess.getUnorderedSerializationAccess().getDigitOneKeyword_1_0_0_0());
									}
									(
										(
											lv_first_3_0='a'
											{
												newLeafNode(lv_first_3_0, grammarAccess.getUnorderedSerializationAccess().getFirstAKeyword_1_0_0_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getUnorderedSerializationRule());
												}
												setWithLastConsumed($current, "first", lv_first_3_0 != null, "a");
											}
										)
									)?
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0(), 1);
						}
									({true}?=>((
										lv_second_4_0='b'
										{
											newLeafNode(lv_second_4_0, grammarAccess.getUnorderedSerializationAccess().getSecondBKeyword_1_0_1_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnorderedSerializationRule());
											}
											setWithLastConsumed($current, "second", lv_second_4_0 != null, "b");
										}
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0(), 2);
						}
									({true}?=>((
										lv_third_5_0='c'
										{
											newLeafNode(lv_third_5_0, grammarAccess.getUnorderedSerializationAccess().getThirdCKeyword_1_0_2_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnorderedSerializationRule());
											}
											setWithLastConsumed($current, "third", lv_third_5_0 != null, "c");
										}
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0(), 3)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0(), 3);
						}
									({true}?=>((
										lv_forth_6_0='d'
										{
											newLeafNode(lv_forth_6_0, grammarAccess.getUnorderedSerializationAccess().getForthDKeyword_1_0_3_0());
										}
										{
											if ($current==null) {
												$current = createModelElement(grammarAccess.getUnorderedSerializationRule());
											}
											setWithLastConsumed($current, "forth", lv_forth_6_0 != null, "d");
										}
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0());
						}
					)
				)
						)+
						{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0())}?
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_0());
					}
			)
			    |
			(
				otherlv_7='2'
				{
					newLeafNode(otherlv_7, grammarAccess.getUnorderedSerializationAccess().getDigitTwoKeyword_1_1_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1(), 0);
							}
										({true}?=>((
											lv_firstAsList_9_0='a'
											{
												newLeafNode(lv_firstAsList_9_0, grammarAccess.getUnorderedSerializationAccess().getFirstAsListAKeyword_1_1_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getUnorderedSerializationRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_9_0, "a");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1(), 1);
							}
										({true}?=>((
											lv_secondAsList_10_0='b'
											{
												newLeafNode(lv_secondAsList_10_0, grammarAccess.getUnorderedSerializationAccess().getSecondAsListBKeyword_1_1_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getUnorderedSerializationRule());
												}
												addWithLastConsumed($current, "secondAsList", lv_secondAsList_10_0, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_1_1());
						}
				)*
			)
			    |
			(
				otherlv_11='3'
				{
					newLeafNode(otherlv_11, grammarAccess.getUnorderedSerializationAccess().getDigitThreeKeyword_1_2_0());
				}
				(
					(
						{ 
						  getUnorderedGroupHelper().enter(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1());
						}
						(
							(
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1(), 0)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1(), 0);
							}
										({true}?=>((
											lv_firstAsList_13_0='a'
											{
												newLeafNode(lv_firstAsList_13_0, grammarAccess.getUnorderedSerializationAccess().getFirstAsListAKeyword_1_2_1_0_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getUnorderedSerializationRule());
												}
												addWithLastConsumed($current, "firstAsList", lv_firstAsList_13_0, "a");
											}
										)
										))+
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1());
							}
						)
					)|
					(
						{getUnorderedGroupHelper().canSelect(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1(), 1)}?=>(
							{
								getUnorderedGroupHelper().select(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1(), 1);
							}
										({true}?=>((
											lv_second_14_0='b'
											{
												newLeafNode(lv_second_14_0, grammarAccess.getUnorderedSerializationAccess().getSecondBKeyword_1_2_1_1_0());
											}
											{
												if ($current==null) {
													$current = createModelElement(grammarAccess.getUnorderedSerializationRule());
												}
												setWithLastConsumed($current, "second", lv_second_14_0 != null, "b");
											}
										)
										))
							{ 
								getUnorderedGroupHelper().returnFromSelection(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1());
							}
						)
					)
							)+
							{getUnorderedGroupHelper().canLeave(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1())}?
						)
					)
						{ 
						  getUnorderedGroupHelper().leave(grammarAccess.getUnorderedSerializationAccess().getUnorderedGroup_1_2_1());
						}
				)*
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
