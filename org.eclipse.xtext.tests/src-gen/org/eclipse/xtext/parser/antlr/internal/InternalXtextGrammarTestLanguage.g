/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalXtextGrammarTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.services.XtextGrammarTestLanguageGrammarAccess;

}

@parser::members {

 	private XtextGrammarTestLanguageGrammarAccess grammarAccess;

    public InternalXtextGrammarTestLanguageParser(TokenStream input, XtextGrammarTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Grammar";
   	}

   	@Override
   	protected XtextGrammarTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleGrammar
entryRuleGrammar returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGrammarRule()); }
	iv_ruleGrammar=ruleGrammar
	{ $current=$iv_ruleGrammar.current; }
	EOF;

// Rule Grammar
ruleGrammar returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='grammar'
		{
			newLeafNode(otherlv_0, grammarAccess.getGrammarAccess().getGrammarKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGrammarAccess().getNameGrammarIDParserRuleCall_1_0());
				}
				lv_name_1_0=ruleGrammarID
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGrammarRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.GrammarID");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='with'
			{
				newLeafNode(otherlv_2, grammarAccess.getGrammarAccess().getWithKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGrammarRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_1_0());
					}
					ruleGrammarID
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getGrammarAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getGrammarRule());
							}
						}
						{
							newCompositeNode(grammarAccess.getGrammarAccess().getUsedGrammarsGrammarCrossReference_2_2_1_0());
						}
						ruleGrammarID
						{
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getGrammarRule());
				}
				newCompositeNode(grammarAccess.getGrammarAccess().getHiddenClauseParserRuleCall_3());
			}
			this_HiddenClause_6=ruleHiddenClause[$current]
			{
				$current = $this_HiddenClause_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getGrammarAccess().getMetamodelDeclarationsAbstractMetamodelDeclarationParserRuleCall_4_0());
				}
				lv_metamodelDeclarations_7_0=ruleAbstractMetamodelDeclaration
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGrammarRule());
					}
					add(
						$current,
						"metamodelDeclarations",
						lv_metamodelDeclarations_7_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.AbstractMetamodelDeclaration");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getGrammarAccess().getRulesAbstractRuleParserRuleCall_5_0());
				}
				lv_rules_8_0=ruleAbstractRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGrammarRule());
					}
					add(
						$current,
						"rules",
						lv_rules_8_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.AbstractRule");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;


// Rule HiddenClause
ruleHiddenClause[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_definesHiddenTokens_0_0='hidden'
				{
					newLeafNode(lv_definesHiddenTokens_0_0, grammarAccess.getHiddenClauseAccess().getDefinesHiddenTokensHiddenKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getHiddenClauseRule());
					}
					setWithLastConsumed($current, "definesHiddenTokens", lv_definesHiddenTokens_0_0 != null, "hidden");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getHiddenClauseAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getHiddenClauseRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getHiddenClauseAccess().getHiddenTokensAbstractRuleCrossReference_2_0_0());
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getHiddenClauseAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getHiddenClauseRule());
							}
						}
						otherlv_4=RULE_ID
						{
							newLeafNode(otherlv_4, grammarAccess.getHiddenClauseAccess().getHiddenTokensAbstractRuleCrossReference_2_1_1_0());
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getHiddenClauseAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleGrammarID
entryRuleGrammarID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getGrammarIDRule()); }
	iv_ruleGrammarID=ruleGrammarID
	{ $current=$iv_ruleGrammarID.current.getText(); }
	EOF;

// Rule GrammarID
ruleGrammarID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getGrammarIDAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getGrammarIDAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleAbstractRule
entryRuleAbstractRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractRuleRule()); }
	iv_ruleAbstractRule=ruleAbstractRule
	{ $current=$iv_ruleAbstractRule.current; }
	EOF;

// Rule AbstractRule
ruleAbstractRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractRuleAccess().getParserRuleParserRuleCall_0());
		}
		this_ParserRule_0=ruleParserRule
		{
			$current = $this_ParserRule_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractRuleAccess().getTerminalRuleParserRuleCall_1());
		}
		this_TerminalRule_1=ruleTerminalRule
		{
			$current = $this_TerminalRule_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractRuleAccess().getEnumRuleParserRuleCall_2());
		}
		this_EnumRule_2=ruleEnumRule
		{
			$current = $this_EnumRule_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAbstractMetamodelDeclaration
entryRuleAbstractMetamodelDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationRule()); }
	iv_ruleAbstractMetamodelDeclaration=ruleAbstractMetamodelDeclaration
	{ $current=$iv_ruleAbstractMetamodelDeclaration.current; }
	EOF;

// Rule AbstractMetamodelDeclaration
ruleAbstractMetamodelDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getGeneratedMetamodelParserRuleCall_0());
		}
		this_GeneratedMetamodel_0=ruleGeneratedMetamodel
		{
			$current = $this_GeneratedMetamodel_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractMetamodelDeclarationAccess().getReferencedMetamodelParserRuleCall_1());
		}
		this_ReferencedMetamodel_1=ruleReferencedMetamodel
		{
			$current = $this_ReferencedMetamodel_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleGeneratedMetamodel
entryRuleGeneratedMetamodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGeneratedMetamodelRule()); }
	iv_ruleGeneratedMetamodel=ruleGeneratedMetamodel
	{ $current=$iv_ruleGeneratedMetamodel.current; }
	EOF;

// Rule GeneratedMetamodel
ruleGeneratedMetamodel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='generate'
		{
			newLeafNode(otherlv_0, grammarAccess.getGeneratedMetamodelAccess().getGenerateKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGeneratedMetamodelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
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
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
					}
				}
				otherlv_2=RULE_STRING
				{
					newLeafNode(otherlv_2, grammarAccess.getGeneratedMetamodelAccess().getEPackageEPackageCrossReference_2_0());
				}
			)
		)
		(
			otherlv_3='as'
			{
				newLeafNode(otherlv_3, grammarAccess.getGeneratedMetamodelAccess().getAsKeyword_3_0());
			}
			(
				(
					lv_alias_4_0=RULE_ID
					{
						newLeafNode(lv_alias_4_0, grammarAccess.getGeneratedMetamodelAccess().getAliasIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getGeneratedMetamodelRule());
						}
						setWithLastConsumed(
							$current,
							"alias",
							lv_alias_4_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleReferencedMetamodel
entryRuleReferencedMetamodel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReferencedMetamodelRule()); }
	iv_ruleReferencedMetamodel=ruleReferencedMetamodel
	{ $current=$iv_ruleReferencedMetamodel.current; }
	EOF;

// Rule ReferencedMetamodel
ruleReferencedMetamodel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getReferencedMetamodelAccess().getImportKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReferencedMetamodelRule());
					}
				}
				otherlv_1=RULE_STRING
				{
					newLeafNode(otherlv_1, grammarAccess.getReferencedMetamodelAccess().getEPackageEPackageCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2='as'
			{
				newLeafNode(otherlv_2, grammarAccess.getReferencedMetamodelAccess().getAsKeyword_2_0());
			}
			(
				(
					lv_alias_3_0=RULE_ID
					{
						newLeafNode(lv_alias_3_0, grammarAccess.getReferencedMetamodelAccess().getAliasIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReferencedMetamodelRule());
						}
						setWithLastConsumed(
							$current,
							"alias",
							lv_alias_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleParserRule
entryRuleParserRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParserRuleRule()); }
	iv_ruleParserRule=ruleParserRule
	{ $current=$iv_ruleParserRule.current; }
	EOF;

// Rule ParserRule
ruleParserRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					(
						lv_fragment_0_0='fragment'
						{
							newLeafNode(lv_fragment_0_0, grammarAccess.getParserRuleAccess().getFragmentFragmentKeyword_0_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParserRuleRule());
							}
							setWithLastConsumed($current, "fragment", lv_fragment_0_0 != null, "fragment");
						}
					)
				)
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParserRuleRule());
					}
					newCompositeNode(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_0_0_1());
				}
				this_RuleNameAndParams_1=ruleRuleNameAndParams[$current]
				{
					$current = $this_RuleNameAndParams_1.current;
					afterParserOrEnumRuleCall();
				}
				(
					(
						(
							lv_wildcard_2_0='*'
							{
								newLeafNode(lv_wildcard_2_0, grammarAccess.getParserRuleAccess().getWildcardAsteriskKeyword_0_0_2_0_0());
							}
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getParserRuleRule());
								}
								setWithLastConsumed($current, "wildcard", lv_wildcard_2_0 != null, "*");
							}
						)
					)
					    |
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getParserRuleRule());
							}
							newCompositeNode(grammarAccess.getParserRuleAccess().getReturnsClauseParserRuleCall_0_0_2_1());
						}
						this_ReturnsClause_3=ruleReturnsClause[$current]
						{
							$current = $this_ReturnsClause_3.current;
							afterParserOrEnumRuleCall();
						}
					)?
				)
			)
			    |
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParserRuleRule());
					}
					newCompositeNode(grammarAccess.getParserRuleAccess().getRuleNameAndParamsParserRuleCall_0_1_0());
				}
				this_RuleNameAndParams_4=ruleRuleNameAndParams[$current]
				{
					$current = $this_RuleNameAndParams_4.current;
					afterParserOrEnumRuleCall();
				}
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getParserRuleRule());
						}
						newCompositeNode(grammarAccess.getParserRuleAccess().getReturnsClauseParserRuleCall_0_1_1());
					}
					this_ReturnsClause_5=ruleReturnsClause[$current]
					{
						$current = $this_ReturnsClause_5.current;
						afterParserOrEnumRuleCall();
					}
				)?
			)
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getParserRuleRule());
				}
				newCompositeNode(grammarAccess.getParserRuleAccess().getHiddenClauseParserRuleCall_1());
			}
			this_HiddenClause_6=ruleHiddenClause[$current]
			{
				$current = $this_HiddenClause_6.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_7=':'
		{
			newLeafNode(otherlv_7, grammarAccess.getParserRuleAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParserRuleAccess().getAlternativesAlternativesParserRuleCall_3_0());
				}
				lv_alternatives_8_0=ruleAlternatives
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParserRuleRule());
					}
					set(
						$current,
						"alternatives",
						lv_alternatives_8_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.Alternatives");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_9=';'
		{
			newLeafNode(otherlv_9, grammarAccess.getParserRuleAccess().getSemicolonKeyword_4());
		}
	)
;


// Rule RuleNameAndParams
ruleRuleNameAndParams[EObject in_current]  returns [EObject current=in_current]
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
					newLeafNode(lv_name_0_0, grammarAccess.getRuleNameAndParamsAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleNameAndParamsRule());
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
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getRuleNameAndParamsAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_0_0());
						}
						lv_parameters_2_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleNameAndParamsRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_2_0,
								"org.eclipse.xtext.XtextGrammarTestLanguage.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_3=','
					{
						newLeafNode(otherlv_3, grammarAccess.getRuleNameAndParamsAccess().getCommaKeyword_1_1_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getRuleNameAndParamsAccess().getParametersParameterParserRuleCall_1_1_1_1_0());
							}
							lv_parameters_4_0=ruleParameter
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getRuleNameAndParamsRule());
								}
								add(
									$current,
									"parameters",
									lv_parameters_4_0,
									"org.eclipse.xtext.XtextGrammarTestLanguage.Parameter");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)?
			otherlv_5=']'
			{
				newLeafNode(otherlv_5, grammarAccess.getRuleNameAndParamsAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
	)
;


// Rule ReturnsClause
ruleReturnsClause[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='returns'
		{
			newLeafNode(otherlv_0, grammarAccess.getReturnsClauseAccess().getReturnsKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReturnsClauseAccess().getTypeTypeRefParserRuleCall_1_0());
				}
				lv_type_1_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReturnsClauseRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.TypeRef");
					afterParserOrEnumRuleCall();
				}
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
			lv_name_0_0=RULE_ID
			{
				newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0());
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
;

// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRefRule()); }
	iv_ruleTypeRef=ruleTypeRef
	{ $current=$iv_ruleTypeRef.current; }
	EOF;

// Rule TypeRef
ruleTypeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRefRule());
						}
					}
					otherlv_0=RULE_ID
					{
						newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getMetamodelAbstractMetamodelDeclarationCrossReference_0_0_0());
					}
				)
			)
			otherlv_1='::'
			{
				newLeafNode(otherlv_1, grammarAccess.getTypeRefAccess().getColonColonKeyword_0_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeRefRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getTypeRefAccess().getClassifierEClassifierCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleAlternatives
entryRuleAlternatives returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAlternativesRule()); }
	iv_ruleAlternatives=ruleAlternatives
	{ $current=$iv_ruleAlternatives.current; }
	EOF;

// Rule Alternatives
ruleAlternatives returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAlternativesAccess().getConditionalBranchParserRuleCall_0());
		}
		this_ConditionalBranch_0=ruleConditionalBranch
		{
			$current = $this_ConditionalBranch_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getAlternativesAccess().getAlternativesElementsAction_1_0(),
						$current);
				}
			)
			(
				otherlv_2='|'
				{
					newLeafNode(otherlv_2, grammarAccess.getAlternativesAccess().getVerticalLineKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAlternativesAccess().getElementsConditionalBranchParserRuleCall_1_1_1_0());
						}
						lv_elements_3_0=ruleConditionalBranch
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAlternativesRule());
							}
							add(
								$current,
								"elements",
								lv_elements_3_0,
								"org.eclipse.xtext.XtextGrammarTestLanguage.ConditionalBranch");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
		)?
	)
;

// Entry rule entryRuleConditionalBranch
entryRuleConditionalBranch returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionalBranchRule()); }
	iv_ruleConditionalBranch=ruleConditionalBranch
	{ $current=$iv_ruleConditionalBranch.current; }
	EOF;

// Rule ConditionalBranch
ruleConditionalBranch returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getConditionalBranchAccess().getUnorderedGroupParserRuleCall_0());
		}
		this_UnorderedGroup_0=ruleUnorderedGroup
		{
			$current = $this_UnorderedGroup_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getConditionalBranchAccess().getConditionalBranchAction_1_0(),
						$current);
				}
			)
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getConditionalBranchAccess().getLeftSquareBracketKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalBranchAccess().getFilteredInverseLiteralValueParserRuleCall_1_2_0());
					}
					lv_filtered_3_0=ruleInverseLiteralValue
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalBranchRule());
						}
						set(
							$current,
							"filtered",
							lv_filtered_3_0,
							"org.eclipse.xtext.XtextGrammarTestLanguage.InverseLiteralValue");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getConditionalBranchRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getConditionalBranchAccess().getParameterParameterCrossReference_1_3_0());
					}
				)
			)
			otherlv_5=']'
			{
				newLeafNode(otherlv_5, grammarAccess.getConditionalBranchAccess().getRightSquareBracketKeyword_1_4());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalBranchAccess().getGuardedElementUnorderedGroupParserRuleCall_1_5_0());
					}
					lv_guardedElement_6_0=ruleUnorderedGroup
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalBranchRule());
						}
						set(
							$current,
							"guardedElement",
							lv_guardedElement_6_0,
							"org.eclipse.xtext.XtextGrammarTestLanguage.UnorderedGroup");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleUnorderedGroup
entryRuleUnorderedGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUnorderedGroupRule()); }
	iv_ruleUnorderedGroup=ruleUnorderedGroup
	{ $current=$iv_ruleUnorderedGroup.current; }
	EOF;

// Rule UnorderedGroup
ruleUnorderedGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getUnorderedGroupAccess().getGroupParserRuleCall_0());
		}
		this_Group_0=ruleGroup
		{
			$current = $this_Group_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getUnorderedGroupAccess().getUnorderedGroupElementsAction_1_0(),
						$current);
				}
			)
			(
				otherlv_2='&'
				{
					newLeafNode(otherlv_2, grammarAccess.getUnorderedGroupAccess().getAmpersandKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getUnorderedGroupAccess().getElementsGroupParserRuleCall_1_1_1_0());
						}
						lv_elements_3_0=ruleGroup
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getUnorderedGroupRule());
							}
							add(
								$current,
								"elements",
								lv_elements_3_0,
								"org.eclipse.xtext.XtextGrammarTestLanguage.Group");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
		)?
	)
;

// Entry rule entryRuleGroup
entryRuleGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroupRule()); }
	iv_ruleGroup=ruleGroup
	{ $current=$iv_ruleGroup.current; }
	EOF;

// Rule Group
ruleGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getGroupAccess().getAbstractTokenParserRuleCall_0());
		}
		this_AbstractToken_0=ruleAbstractToken
		{
			$current = $this_AbstractToken_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getGroupAccess().getGroupElementsAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getGroupAccess().getElementsAbstractTokenParserRuleCall_1_1_0());
					}
					lv_elements_2_0=ruleAbstractToken
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGroupRule());
						}
						add(
							$current,
							"elements",
							lv_elements_2_0,
							"org.eclipse.xtext.XtextGrammarTestLanguage.AbstractToken");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
	)
;

// Entry rule entryRuleAbstractToken
entryRuleAbstractToken returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractTokenRule()); }
	iv_ruleAbstractToken=ruleAbstractToken
	{ $current=$iv_ruleAbstractToken.current; }
	EOF;

// Rule AbstractToken
ruleAbstractToken returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractTokenAccess().getAbstractTokenWithCardinalityParserRuleCall_0());
		}
		this_AbstractTokenWithCardinality_0=ruleAbstractTokenWithCardinality
		{
			$current = $this_AbstractTokenWithCardinality_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTokenAccess().getActionParserRuleCall_1());
		}
		this_Action_1=ruleAction
		{
			$current = $this_Action_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAbstractTokenWithCardinality
entryRuleAbstractTokenWithCardinality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityRule()); }
	iv_ruleAbstractTokenWithCardinality=ruleAbstractTokenWithCardinality
	{ $current=$iv_ruleAbstractTokenWithCardinality.current; }
	EOF;

// Rule AbstractTokenWithCardinality
ruleAbstractTokenWithCardinality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAssignmentParserRuleCall_0_0());
			}
			this_Assignment_0=ruleAssignment
			{
				$current = $this_Assignment_0.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getAbstractTerminalParserRuleCall_0_1());
			}
			this_AbstractTerminal_1=ruleAbstractTerminal
			{
				$current = $this_AbstractTerminal_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getAbstractTokenWithCardinalityRule());
				}
				newCompositeNode(grammarAccess.getAbstractTokenWithCardinalityAccess().getCardinalitiesParserRuleCall_1());
			}
			this_Cardinalities_2=ruleCardinalities[$current]
			{
				$current = $this_Cardinalities_2.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;


// Rule Cardinalities
ruleCardinalities[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_cardinality_0_1='?'
				{
					newLeafNode(lv_cardinality_0_1, grammarAccess.getCardinalitiesAccess().getCardinalityQuestionMarkKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardinalitiesRule());
					}
					setWithLastConsumed($current, "cardinality", lv_cardinality_0_1, null);
				}
				    |
				lv_cardinality_0_2='*'
				{
					newLeafNode(lv_cardinality_0_2, grammarAccess.getCardinalitiesAccess().getCardinalityAsteriskKeyword_0_1());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardinalitiesRule());
					}
					setWithLastConsumed($current, "cardinality", lv_cardinality_0_2, null);
				}
				    |
				lv_cardinality_0_3='+'
				{
					newLeafNode(lv_cardinality_0_3, grammarAccess.getCardinalitiesAccess().getCardinalityPlusSignKeyword_0_2());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCardinalitiesRule());
					}
					setWithLastConsumed($current, "cardinality", lv_cardinality_0_3, null);
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getActionAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionAccess().getTypeTypeRefParserRuleCall_1_0());
				}
				lv_type_1_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='.'
			{
				newLeafNode(otherlv_2, grammarAccess.getActionAccess().getFullStopKeyword_2_0());
			}
			(
				(
					lv_feature_3_0=RULE_ID
					{
						newLeafNode(lv_feature_3_0, grammarAccess.getActionAccess().getFeatureIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getActionRule());
						}
						setWithLastConsumed(
							$current,
							"feature",
							lv_feature_3_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
			(
				(
					(
						lv_operator_4_1='='
						{
							newLeafNode(lv_operator_4_1, grammarAccess.getActionAccess().getOperatorEqualsSignKeyword_2_2_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_4_1, null);
						}
						    |
						lv_operator_4_2='+='
						{
							newLeafNode(lv_operator_4_2, grammarAccess.getActionAccess().getOperatorPlusSignEqualsSignKeyword_2_2_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getActionRule());
							}
							setWithLastConsumed($current, "operator", lv_operator_4_2, null);
						}
					)
				)
			)
			otherlv_5='current'
			{
				newLeafNode(otherlv_5, grammarAccess.getActionAccess().getCurrentKeyword_2_3());
			}
		)?
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getActionAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleAbstractTerminal
entryRuleAbstractTerminal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractTerminalRule()); }
	iv_ruleAbstractTerminal=ruleAbstractTerminal
	{ $current=$iv_ruleAbstractTerminal.current; }
	EOF;

// Rule AbstractTerminal
ruleAbstractTerminal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getKeywordParserRuleCall_0());
		}
		this_Keyword_0=ruleKeyword
		{
			$current = $this_Keyword_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getRuleCallParserRuleCall_1());
		}
		this_RuleCall_1=ruleRuleCall
		{
			$current = $this_RuleCall_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getParenthesizedElementParserRuleCall_2());
		}
		this_ParenthesizedElement_2=ruleParenthesizedElement
		{
			$current = $this_ParenthesizedElement_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedKeywordParserRuleCall_3());
		}
		this_PredicatedKeyword_3=rulePredicatedKeyword
		{
			$current = $this_PredicatedKeyword_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedRuleCallParserRuleCall_4());
		}
		this_PredicatedRuleCall_4=rulePredicatedRuleCall
		{
			$current = $this_PredicatedRuleCall_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractTerminalAccess().getPredicatedGroupParserRuleCall_5());
		}
		this_PredicatedGroup_5=rulePredicatedGroup
		{
			$current = $this_PredicatedGroup_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleKeyword
entryRuleKeyword returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getKeywordRule()); }
	iv_ruleKeyword=ruleKeyword
	{ $current=$iv_ruleKeyword.current; }
	EOF;

// Rule Keyword
ruleKeyword returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_value_0_0=RULE_STRING
			{
				newLeafNode(lv_value_0_0, grammarAccess.getKeywordAccess().getValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getKeywordRule());
				}
				setWithLastConsumed(
					$current,
					"value",
					lv_value_0_0,
					"org.eclipse.xtext.common.Terminals.STRING");
			}
		)
	)
;

// Entry rule entryRuleRuleCall
entryRuleRuleCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleCallRule()); }
	iv_ruleRuleCall=ruleRuleCall
	{ $current=$iv_ruleRuleCall.current; }
	EOF;

// Rule RuleCall
ruleRuleCall returns [EObject current=null]
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
					grammarAccess.getRuleCallAccess().getRuleCallAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRuleCallRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getRuleCallAccess().getRuleAbstractRuleCrossReference_1_0());
				}
				ruleRuleID
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getRuleCallAccess().getLeftSquareBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_1_0());
					}
					lv_arguments_3_0=ruleNamedArgument
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleCallRule());
						}
						add(
							$current,
							"arguments",
							lv_arguments_3_0,
							"org.eclipse.xtext.XtextGrammarTestLanguage.NamedArgument");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getRuleCallAccess().getCommaKeyword_2_2_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleCallAccess().getArgumentsNamedArgumentParserRuleCall_2_2_1_0());
						}
						lv_arguments_5_0=ruleNamedArgument
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleCallRule());
							}
							add(
								$current,
								"arguments",
								lv_arguments_5_0,
								"org.eclipse.xtext.XtextGrammarTestLanguage.NamedArgument");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			otherlv_6=']'
			{
				newLeafNode(otherlv_6, grammarAccess.getRuleCallAccess().getRightSquareBracketKeyword_2_3());
			}
		)?
	)
;

// Entry rule entryRuleLiteralValue
entryRuleLiteralValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLiteralValueRule()); }
	iv_ruleLiteralValue=ruleLiteralValue
	{ $current=$iv_ruleLiteralValue.current.getText(); }
	EOF;

// Rule LiteralValue
ruleLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='!'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getExclamationMarkKeyword_0());
		}
		    |
		kw='+'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getLiteralValueAccess().getPlusSignKeyword_1());
		}
	)
;

// Entry rule entryRuleInverseLiteralValue
entryRuleInverseLiteralValue returns [String current=null]:
	{ newCompositeNode(grammarAccess.getInverseLiteralValueRule()); }
	iv_ruleInverseLiteralValue=ruleInverseLiteralValue
	{ $current=$iv_ruleInverseLiteralValue.current.getText(); }
	EOF;

// Rule InverseLiteralValue
ruleInverseLiteralValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getInverseLiteralValueAccess().getLiteralValueParserRuleCall());
	}
	this_LiteralValue_0=ruleLiteralValue
	{
		$current.merge(this_LiteralValue_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleNamedArgument
entryRuleNamedArgument returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamedArgumentRule()); }
	iv_ruleNamedArgument=ruleNamedArgument
	{ $current=$iv_ruleNamedArgument.current; }
	EOF;

// Rule NamedArgument
ruleNamedArgument returns [EObject current=null]
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
					grammarAccess.getNamedArgumentAccess().getNamedArgumentAction_0(),
					$current);
			}
		)
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getNamedArgumentAccess().getLiteralValueLiteralValueParserRuleCall_1_0_0_0());
						}
						lv_literalValue_1_0=ruleLiteralValue
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getNamedArgumentRule());
							}
							set(
								$current,
								"literalValue",
								lv_literalValue_1_0,
								"org.eclipse.xtext.XtextGrammarTestLanguage.LiteralValue");
							afterParserOrEnumRuleCall();
						}
					)
				)?
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNamedArgumentRule());
							}
						}
						otherlv_2=RULE_ID
						{
							newLeafNode(otherlv_2, grammarAccess.getNamedArgumentAccess().getParameterParameterCrossReference_1_0_1_0());
						}
					)
				)
			)
			    |
			(
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNamedArgumentRule());
							}
						}
						otherlv_3=RULE_ID
						{
							newLeafNode(otherlv_3, grammarAccess.getNamedArgumentAccess().getParameterParameterCrossReference_1_1_0_0());
						}
					)
				)
				otherlv_4='='
				{
					newLeafNode(otherlv_4, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_1_1_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getNamedArgumentRule());
							}
						}
						otherlv_5=RULE_ID
						{
							newLeafNode(otherlv_5, grammarAccess.getNamedArgumentAccess().getValueParameterCrossReference_1_1_2_0());
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleTerminalRuleCall
entryRuleTerminalRuleCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalRuleCallRule()); }
	iv_ruleTerminalRuleCall=ruleTerminalRuleCall
	{ $current=$iv_ruleTerminalRuleCall.current; }
	EOF;

// Rule TerminalRuleCall
ruleTerminalRuleCall returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getTerminalRuleCallRule());
				}
			}
			{
				newCompositeNode(grammarAccess.getTerminalRuleCallAccess().getRuleAbstractRuleCrossReference_0());
			}
			ruleRuleID
			{
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleRuleID
entryRuleRuleID returns [String current=null]:
	{ newCompositeNode(grammarAccess.getRuleIDRule()); }
	iv_ruleRuleID=ruleRuleID
	{ $current=$iv_ruleRuleID.current.getText(); }
	EOF;

// Rule RuleID
ruleRuleID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getRuleIDAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='::'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getRuleIDAccess().getColonColonKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getRuleIDAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRulePredicatedKeyword
entryRulePredicatedKeyword returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicatedKeywordRule()); }
	iv_rulePredicatedKeyword=rulePredicatedKeyword
	{ $current=$iv_rulePredicatedKeyword.current; }
	EOF;

// Rule PredicatedKeyword
rulePredicatedKeyword returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getPredicatedKeywordRule());
			}
			newCompositeNode(grammarAccess.getPredicatedKeywordAccess().getPredicateParserRuleCall_0());
		}
		this_Predicate_0=rulePredicate[$current]
		{
			$current = $this_Predicate_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getPredicatedKeywordAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPredicatedKeywordRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePredicatedRuleCall
entryRulePredicatedRuleCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicatedRuleCallRule()); }
	iv_rulePredicatedRuleCall=rulePredicatedRuleCall
	{ $current=$iv_rulePredicatedRuleCall.current; }
	EOF;

// Rule PredicatedRuleCall
rulePredicatedRuleCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
			}
			newCompositeNode(grammarAccess.getPredicatedRuleCallAccess().getPredicateParserRuleCall_0());
		}
		this_Predicate_0=rulePredicate[$current]
		{
			$current = $this_Predicate_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPredicatedRuleCallRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getPredicatedRuleCallAccess().getRuleAbstractRuleCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	iv_ruleAssignment=ruleAssignment
	{ $current=$iv_ruleAssignment.current; }
	EOF;

// Rule Assignment
ruleAssignment returns [EObject current=null]
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
					$current = createModelElement(grammarAccess.getAssignmentRule());
				}
				newCompositeNode(grammarAccess.getAssignmentAccess().getPredicateParserRuleCall_0());
			}
			this_Predicate_0=rulePredicate[$current]
			{
				$current = $this_Predicate_0.current;
				afterParserOrEnumRuleCall();
			}
		)?
		(
			(
				lv_feature_1_0=RULE_ID
				{
					newLeafNode(lv_feature_1_0, grammarAccess.getAssignmentAccess().getFeatureIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAssignmentRule());
					}
					setWithLastConsumed(
						$current,
						"feature",
						lv_feature_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			(
				(
					lv_operator_2_1='+='
					{
						newLeafNode(lv_operator_2_1, grammarAccess.getAssignmentAccess().getOperatorPlusSignEqualsSignKeyword_2_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignmentRule());
						}
						setWithLastConsumed($current, "operator", lv_operator_2_1, null);
					}
					    |
					lv_operator_2_2='='
					{
						newLeafNode(lv_operator_2_2, grammarAccess.getAssignmentAccess().getOperatorEqualsSignKeyword_2_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignmentRule());
						}
						setWithLastConsumed($current, "operator", lv_operator_2_2, null);
					}
					    |
					lv_operator_2_3='?='
					{
						newLeafNode(lv_operator_2_3, grammarAccess.getAssignmentAccess().getOperatorQuestionMarkEqualsSignKeyword_2_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getAssignmentRule());
						}
						setWithLastConsumed($current, "operator", lv_operator_2_3, null);
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAssignmentAccess().getTerminalAssignableTerminalParserRuleCall_3_0());
				}
				lv_terminal_3_0=ruleAssignableTerminal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAssignmentRule());
					}
					set(
						$current,
						"terminal",
						lv_terminal_3_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.AssignableTerminal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;


// Rule Predicate
rulePredicate[EObject in_current]  returns [EObject current=in_current]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_predicated_0_0='=>'
				{
					newLeafNode(lv_predicated_0_0, grammarAccess.getPredicateAccess().getPredicatedEqualsSignGreaterThanSignKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPredicateRule());
					}
					setWithLastConsumed($current, "predicated", lv_predicated_0_0 != null, "=>");
				}
			)
		)
		    |
		(
			(
				lv_firstSetPredicated_1_0='->'
				{
					newLeafNode(lv_firstSetPredicated_1_0, grammarAccess.getPredicateAccess().getFirstSetPredicatedHyphenMinusGreaterThanSignKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPredicateRule());
					}
					setWithLastConsumed($current, "firstSetPredicated", lv_firstSetPredicated_1_0 != null, "->");
				}
			)
		)
	)
;

// Entry rule entryRuleAssignableTerminal
entryRuleAssignableTerminal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignableTerminalRule()); }
	iv_ruleAssignableTerminal=ruleAssignableTerminal
	{ $current=$iv_ruleAssignableTerminal.current; }
	EOF;

// Rule AssignableTerminal
ruleAssignableTerminal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getKeywordParserRuleCall_0());
		}
		this_Keyword_0=ruleKeyword
		{
			$current = $this_Keyword_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getRuleCallParserRuleCall_1());
		}
		this_RuleCall_1=ruleRuleCall
		{
			$current = $this_RuleCall_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getParenthesizedAssignableElementParserRuleCall_2());
		}
		this_ParenthesizedAssignableElement_2=ruleParenthesizedAssignableElement
		{
			$current = $this_ParenthesizedAssignableElement_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAssignableTerminalAccess().getCrossReferenceParserRuleCall_3());
		}
		this_CrossReference_3=ruleCrossReference
		{
			$current = $this_CrossReference_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleParenthesizedAssignableElement
entryRuleParenthesizedAssignableElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesizedAssignableElementRule()); }
	iv_ruleParenthesizedAssignableElement=ruleParenthesizedAssignableElement
	{ $current=$iv_ruleParenthesizedAssignableElement.current; }
	EOF;

// Rule ParenthesizedAssignableElement
ruleParenthesizedAssignableElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesizedAssignableElementAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParenthesizedAssignableElementAccess().getAssignableAlternativesParserRuleCall_1());
		}
		this_AssignableAlternatives_1=ruleAssignableAlternatives
		{
			$current = $this_AssignableAlternatives_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesizedAssignableElementAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleAssignableAlternatives
entryRuleAssignableAlternatives returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignableAlternativesRule()); }
	iv_ruleAssignableAlternatives=ruleAssignableAlternatives
	{ $current=$iv_ruleAssignableAlternatives.current; }
	EOF;

// Rule AssignableAlternatives
ruleAssignableAlternatives returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getAssignableTerminalParserRuleCall_0());
		}
		this_AssignableTerminal_0=ruleAssignableTerminal
		{
			$current = $this_AssignableTerminal_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getAssignableAlternativesAccess().getAlternativesElementsAction_1_0(),
						$current);
				}
			)
			(
				otherlv_2='|'
				{
					newLeafNode(otherlv_2, grammarAccess.getAssignableAlternativesAccess().getVerticalLineKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAssignableAlternativesAccess().getElementsAssignableTerminalParserRuleCall_1_1_1_0());
						}
						lv_elements_3_0=ruleAssignableTerminal
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAssignableAlternativesRule());
							}
							add(
								$current,
								"elements",
								lv_elements_3_0,
								"org.eclipse.xtext.XtextGrammarTestLanguage.AssignableTerminal");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
		)?
	)
;

// Entry rule entryRuleCrossReference
entryRuleCrossReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCrossReferenceRule()); }
	iv_ruleCrossReference=ruleCrossReference
	{ $current=$iv_ruleCrossReference.current; }
	EOF;

// Rule CrossReference
ruleCrossReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='['
		{
			newLeafNode(otherlv_0, grammarAccess.getCrossReferenceAccess().getLeftSquareBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCrossReferenceAccess().getTypeTypeRefParserRuleCall_1_0());
				}
				lv_type_1_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='|'
			{
				newLeafNode(otherlv_2, grammarAccess.getCrossReferenceAccess().getVerticalLineKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCrossReferenceAccess().getTerminalCrossReferenceableTerminalParserRuleCall_2_1_0());
					}
					lv_terminal_3_0=ruleCrossReferenceableTerminal
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCrossReferenceRule());
						}
						set(
							$current,
							"terminal",
							lv_terminal_3_0,
							"org.eclipse.xtext.XtextGrammarTestLanguage.CrossReferenceableTerminal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_4=']'
		{
			newLeafNode(otherlv_4, grammarAccess.getCrossReferenceAccess().getRightSquareBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleCrossReferenceableTerminal
entryRuleCrossReferenceableTerminal returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCrossReferenceableTerminalRule()); }
	iv_ruleCrossReferenceableTerminal=ruleCrossReferenceableTerminal
	{ $current=$iv_ruleCrossReferenceableTerminal.current; }
	EOF;

// Rule CrossReferenceableTerminal
ruleCrossReferenceableTerminal returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getKeywordParserRuleCall_0());
		}
		this_Keyword_0=ruleKeyword
		{
			$current = $this_Keyword_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getCrossReferenceableTerminalAccess().getRuleCallParserRuleCall_1());
		}
		this_RuleCall_1=ruleRuleCall
		{
			$current = $this_RuleCall_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleParenthesizedElement
entryRuleParenthesizedElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesizedElementRule()); }
	iv_ruleParenthesizedElement=ruleParenthesizedElement
	{ $current=$iv_ruleParenthesizedElement.current; }
	EOF;

// Rule ParenthesizedElement
ruleParenthesizedElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesizedElementAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParenthesizedElementAccess().getAlternativesParserRuleCall_1());
		}
		this_Alternatives_1=ruleAlternatives
		{
			$current = $this_Alternatives_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesizedElementAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRulePredicatedGroup
entryRulePredicatedGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPredicatedGroupRule()); }
	iv_rulePredicatedGroup=rulePredicatedGroup
	{ $current=$iv_rulePredicatedGroup.current; }
	EOF;

// Rule PredicatedGroup
rulePredicatedGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			if ($current==null) {
				$current = createModelElement(grammarAccess.getPredicatedGroupRule());
			}
			newCompositeNode(grammarAccess.getPredicatedGroupAccess().getPredicateParserRuleCall_0());
		}
		this_Predicate_0=rulePredicate[$current]
		{
			$current = $this_Predicate_0.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getPredicatedGroupAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPredicatedGroupAccess().getElementsAlternativesParserRuleCall_2_0());
				}
				lv_elements_2_0=ruleAlternatives
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPredicatedGroupRule());
					}
					add(
						$current,
						"elements",
						lv_elements_2_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.Alternatives");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getPredicatedGroupAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleTerminalRule
entryRuleTerminalRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalRuleRule()); }
	iv_ruleTerminalRule=ruleTerminalRule
	{ $current=$iv_ruleTerminalRule.current; }
	EOF;

// Rule TerminalRule
ruleTerminalRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='terminal'
		{
			newLeafNode(otherlv_0, grammarAccess.getTerminalRuleAccess().getTerminalKeyword_0());
		}
		(
			(
				(
					(
						lv_fragment_1_0='fragment'
						{
							newLeafNode(lv_fragment_1_0, grammarAccess.getTerminalRuleAccess().getFragmentFragmentKeyword_1_0_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTerminalRuleRule());
							}
							setWithLastConsumed($current, "fragment", lv_fragment_1_0 != null, "fragment");
						}
					)
				)
				(
					(
						lv_name_2_0=RULE_ID
						{
							newLeafNode(lv_name_2_0, grammarAccess.getTerminalRuleAccess().getNameIDTerminalRuleCall_1_0_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTerminalRuleRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)
			    |
			(
				(
					(
						lv_name_3_0=RULE_ID
						{
							newLeafNode(lv_name_3_0, grammarAccess.getTerminalRuleAccess().getNameIDTerminalRuleCall_1_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTerminalRuleRule());
							}
							setWithLastConsumed(
								$current,
								"name",
								lv_name_3_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalRuleRule());
						}
						newCompositeNode(grammarAccess.getTerminalRuleAccess().getReturnsClauseParserRuleCall_1_1_1());
					}
					this_ReturnsClause_4=ruleReturnsClause[$current]
					{
						$current = $this_ReturnsClause_4.current;
						afterParserOrEnumRuleCall();
					}
				)?
			)
		)
		otherlv_5=':'
		{
			newLeafNode(otherlv_5, grammarAccess.getTerminalRuleAccess().getColonKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTerminalRuleAccess().getAlternativesTerminalAlternativesParserRuleCall_3_0());
				}
				lv_alternatives_6_0=ruleTerminalAlternatives
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTerminalRuleRule());
					}
					set(
						$current,
						"alternatives",
						lv_alternatives_6_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.TerminalAlternatives");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=';'
		{
			newLeafNode(otherlv_7, grammarAccess.getTerminalRuleAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleTerminalAlternatives
entryRuleTerminalAlternatives returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalAlternativesRule()); }
	iv_ruleTerminalAlternatives=ruleTerminalAlternatives
	{ $current=$iv_ruleTerminalAlternatives.current; }
	EOF;

// Rule TerminalAlternatives
ruleTerminalAlternatives returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getTerminalGroupParserRuleCall_0());
		}
		this_TerminalGroup_0=ruleTerminalGroup
		{
			$current = $this_TerminalGroup_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getTerminalAlternativesAccess().getAlternativesElementsAction_1_0(),
						$current);
				}
			)
			(
				otherlv_2='|'
				{
					newLeafNode(otherlv_2, grammarAccess.getTerminalAlternativesAccess().getVerticalLineKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTerminalAlternativesAccess().getElementsTerminalGroupParserRuleCall_1_1_1_0());
						}
						lv_elements_3_0=ruleTerminalGroup
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTerminalAlternativesRule());
							}
							add(
								$current,
								"elements",
								lv_elements_3_0,
								"org.eclipse.xtext.XtextGrammarTestLanguage.TerminalGroup");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
		)?
	)
;

// Entry rule entryRuleTerminalGroup
entryRuleTerminalGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalGroupRule()); }
	iv_ruleTerminalGroup=ruleTerminalGroup
	{ $current=$iv_ruleTerminalGroup.current; }
	EOF;

// Rule TerminalGroup
ruleTerminalGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminalGroupAccess().getTerminalTokenParserRuleCall_0());
		}
		this_TerminalToken_0=ruleTerminalToken
		{
			$current = $this_TerminalToken_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getTerminalGroupAccess().getGroupElementsAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getTerminalGroupAccess().getElementsTerminalTokenParserRuleCall_1_1_0());
					}
					lv_elements_2_0=ruleTerminalToken
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTerminalGroupRule());
						}
						add(
							$current,
							"elements",
							lv_elements_2_0,
							"org.eclipse.xtext.XtextGrammarTestLanguage.TerminalToken");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
	)
;

// Entry rule entryRuleTerminalToken
entryRuleTerminalToken returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalTokenRule()); }
	iv_ruleTerminalToken=ruleTerminalToken
	{ $current=$iv_ruleTerminalToken.current; }
	EOF;

// Rule TerminalToken
ruleTerminalToken returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminalTokenAccess().getTerminalTokenElementParserRuleCall_0());
		}
		this_TerminalTokenElement_0=ruleTerminalTokenElement
		{
			$current = $this_TerminalTokenElement_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getTerminalTokenRule());
				}
				newCompositeNode(grammarAccess.getTerminalTokenAccess().getCardinalitiesParserRuleCall_1());
			}
			this_Cardinalities_1=ruleCardinalities[$current]
			{
				$current = $this_Cardinalities_1.current;
				afterParserOrEnumRuleCall();
			}
		)?
	)
;

// Entry rule entryRuleTerminalTokenElement
entryRuleTerminalTokenElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalTokenElementRule()); }
	iv_ruleTerminalTokenElement=ruleTerminalTokenElement
	{ $current=$iv_ruleTerminalTokenElement.current; }
	EOF;

// Rule TerminalTokenElement
ruleTerminalTokenElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getCharacterRangeParserRuleCall_0());
		}
		this_CharacterRange_0=ruleCharacterRange
		{
			$current = $this_CharacterRange_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getTerminalRuleCallParserRuleCall_1());
		}
		this_TerminalRuleCall_1=ruleTerminalRuleCall
		{
			$current = $this_TerminalRuleCall_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getParenthesizedTerminalElementParserRuleCall_2());
		}
		this_ParenthesizedTerminalElement_2=ruleParenthesizedTerminalElement
		{
			$current = $this_ParenthesizedTerminalElement_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getAbstractNegatedTokenParserRuleCall_3());
		}
		this_AbstractNegatedToken_3=ruleAbstractNegatedToken
		{
			$current = $this_AbstractNegatedToken_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getWildcardParserRuleCall_4());
		}
		this_Wildcard_4=ruleWildcard
		{
			$current = $this_Wildcard_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTerminalTokenElementAccess().getEOFParserRuleCall_5());
		}
		this_EOF_5=ruleEOF
		{
			$current = $this_EOF_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleParenthesizedTerminalElement
entryRuleParenthesizedTerminalElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParenthesizedTerminalElementRule()); }
	iv_ruleParenthesizedTerminalElement=ruleParenthesizedTerminalElement
	{ $current=$iv_ruleParenthesizedTerminalElement.current; }
	EOF;

// Rule ParenthesizedTerminalElement
ruleParenthesizedTerminalElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='('
		{
			newLeafNode(otherlv_0, grammarAccess.getParenthesizedTerminalElementAccess().getLeftParenthesisKeyword_0());
		}
		{
			newCompositeNode(grammarAccess.getParenthesizedTerminalElementAccess().getTerminalAlternativesParserRuleCall_1());
		}
		this_TerminalAlternatives_1=ruleTerminalAlternatives
		{
			$current = $this_TerminalAlternatives_1.current;
			afterParserOrEnumRuleCall();
		}
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getParenthesizedTerminalElementAccess().getRightParenthesisKeyword_2());
		}
	)
;

// Entry rule entryRuleAbstractNegatedToken
entryRuleAbstractNegatedToken returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractNegatedTokenRule()); }
	iv_ruleAbstractNegatedToken=ruleAbstractNegatedToken
	{ $current=$iv_ruleAbstractNegatedToken.current; }
	EOF;

// Rule AbstractNegatedToken
ruleAbstractNegatedToken returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getNegatedTokenParserRuleCall_0());
		}
		this_NegatedToken_0=ruleNegatedToken
		{
			$current = $this_NegatedToken_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractNegatedTokenAccess().getUntilTokenParserRuleCall_1());
		}
		this_UntilToken_1=ruleUntilToken
		{
			$current = $this_UntilToken_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNegatedToken
entryRuleNegatedToken returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNegatedTokenRule()); }
	iv_ruleNegatedToken=ruleNegatedToken
	{ $current=$iv_ruleNegatedToken.current; }
	EOF;

// Rule NegatedToken
ruleNegatedToken returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='!'
		{
			newLeafNode(otherlv_0, grammarAccess.getNegatedTokenAccess().getExclamationMarkKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNegatedTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0());
				}
				lv_terminal_1_0=ruleTerminalTokenElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNegatedTokenRule());
					}
					set(
						$current,
						"terminal",
						lv_terminal_1_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.TerminalTokenElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleUntilToken
entryRuleUntilToken returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getUntilTokenRule()); }
	iv_ruleUntilToken=ruleUntilToken
	{ $current=$iv_ruleUntilToken.current; }
	EOF;

// Rule UntilToken
ruleUntilToken returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='->'
		{
			newLeafNode(otherlv_0, grammarAccess.getUntilTokenAccess().getHyphenMinusGreaterThanSignKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getUntilTokenAccess().getTerminalTerminalTokenElementParserRuleCall_1_0());
				}
				lv_terminal_1_0=ruleTerminalTokenElement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getUntilTokenRule());
					}
					set(
						$current,
						"terminal",
						lv_terminal_1_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.TerminalTokenElement");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleWildcard
entryRuleWildcard returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getWildcardRule()); }
	iv_ruleWildcard=ruleWildcard
	{ $current=$iv_ruleWildcard.current; }
	EOF;

// Rule Wildcard
ruleWildcard returns [EObject current=null]
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
					grammarAccess.getWildcardAccess().getWildcardAction_0(),
					$current);
			}
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getWildcardAccess().getFullStopKeyword_1());
		}
	)
;

// Entry rule entryRuleEOF
entryRuleEOF returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEOFRule()); }
	iv_ruleEOF=ruleEOF
	{ $current=$iv_ruleEOF.current; }
	EOF;

// Rule EOF
ruleEOF returns [EObject current=null]
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
					grammarAccess.getEOFAccess().getEOFAction_0(),
					$current);
			}
		)
		otherlv_1='EOF'
		{
			newLeafNode(otherlv_1, grammarAccess.getEOFAccess().getEOFKeyword_1());
		}
	)
;

// Entry rule entryRuleCharacterRange
entryRuleCharacterRange returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharacterRangeRule()); }
	iv_ruleCharacterRange=ruleCharacterRange
	{ $current=$iv_ruleCharacterRange.current; }
	EOF;

// Rule CharacterRange
ruleCharacterRange returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCharacterRangeAccess().getKeywordParserRuleCall_0());
		}
		this_Keyword_0=ruleKeyword
		{
			$current = $this_Keyword_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getCharacterRangeAccess().getCharacterRangeLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='..'
			{
				newLeafNode(otherlv_2, grammarAccess.getCharacterRangeAccess().getFullStopFullStopKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getCharacterRangeAccess().getRightKeywordParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleKeyword
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCharacterRangeRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"org.eclipse.xtext.XtextGrammarTestLanguage.Keyword");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleEnumRule
entryRuleEnumRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumRuleRule()); }
	iv_ruleEnumRule=ruleEnumRule
	{ $current=$iv_ruleEnumRule.current; }
	EOF;

// Rule EnumRule
ruleEnumRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='enum'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumRuleAccess().getEnumKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnumRuleAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumRuleRule());
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
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getEnumRuleRule());
				}
				newCompositeNode(grammarAccess.getEnumRuleAccess().getReturnsClauseParserRuleCall_2());
			}
			this_ReturnsClause_2=ruleReturnsClause[$current]
			{
				$current = $this_ReturnsClause_2.current;
				afterParserOrEnumRuleCall();
			}
		)?
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getEnumRuleAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumRuleAccess().getAlternativesEnumLiteralsParserRuleCall_4_0());
				}
				lv_alternatives_4_0=ruleEnumLiterals
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumRuleRule());
					}
					set(
						$current,
						"alternatives",
						lv_alternatives_4_0,
						"org.eclipse.xtext.XtextGrammarTestLanguage.EnumLiterals");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=';'
		{
			newLeafNode(otherlv_5, grammarAccess.getEnumRuleAccess().getSemicolonKeyword_5());
		}
	)
;

// Entry rule entryRuleEnumLiterals
entryRuleEnumLiterals returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumLiteralsRule()); }
	iv_ruleEnumLiterals=ruleEnumLiterals
	{ $current=$iv_ruleEnumLiterals.current; }
	EOF;

// Rule EnumLiterals
ruleEnumLiterals returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEnumLiteralsAccess().getEnumLiteralDeclarationParserRuleCall_0());
		}
		this_EnumLiteralDeclaration_0=ruleEnumLiteralDeclaration
		{
			$current = $this_EnumLiteralDeclaration_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndAdd(
						grammarAccess.getEnumLiteralsAccess().getAlternativesElementsAction_1_0(),
						$current);
				}
			)
			(
				otherlv_2='|'
				{
					newLeafNode(otherlv_2, grammarAccess.getEnumLiteralsAccess().getVerticalLineKeyword_1_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEnumLiteralsAccess().getElementsEnumLiteralDeclarationParserRuleCall_1_1_1_0());
						}
						lv_elements_3_0=ruleEnumLiteralDeclaration
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEnumLiteralsRule());
							}
							add(
								$current,
								"elements",
								lv_elements_3_0,
								"org.eclipse.xtext.XtextGrammarTestLanguage.EnumLiteralDeclaration");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)+
		)?
	)
;

// Entry rule entryRuleEnumLiteralDeclaration
entryRuleEnumLiteralDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumLiteralDeclarationRule()); }
	iv_ruleEnumLiteralDeclaration=ruleEnumLiteralDeclaration
	{ $current=$iv_ruleEnumLiteralDeclaration.current; }
	EOF;

// Rule EnumLiteralDeclaration
ruleEnumLiteralDeclaration returns [EObject current=null]
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
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumLiteralDeclarationRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getEnumLiteralDeclarationAccess().getEnumLiteralEEnumLiteralCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getEnumLiteralDeclarationAccess().getEqualsSignKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumLiteralDeclarationAccess().getLiteralKeywordParserRuleCall_1_1_0());
					}
					lv_literal_2_0=ruleKeyword
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumLiteralDeclarationRule());
						}
						set(
							$current,
							"literal",
							lv_literal_2_0,
							"org.eclipse.xtext.XtextGrammarTestLanguage.Keyword");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
