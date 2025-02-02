/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
grammar InternalNestedRefsTestLanguage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.eclipse.xtext.testlanguages.nestedRefs.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.eclipse.xtext.testlanguages.nestedRefs.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.testlanguages.nestedRefs.services.NestedRefsTestLanguageGrammarAccess;

}

@parser::members {

 	private NestedRefsTestLanguageGrammarAccess grammarAccess;

    public InternalNestedRefsTestLanguageParser(TokenStream input, NestedRefsTestLanguageGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Doc";
   	}

   	@Override
   	protected NestedRefsTestLanguageGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDoc
entryRuleDoc returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDocRule()); }
	iv_ruleDoc=ruleDoc
	{ $current=$iv_ruleDoc.current; }
	EOF;

// Rule Doc
ruleDoc returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDocAccess().getDeclarationsSelfReferingDeclParserRuleCall_0());
			}
			lv_declarations_0_0=ruleSelfReferingDecl
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDocRule());
				}
				add(
					$current,
					"declarations",
					lv_declarations_0_0,
					"org.eclipse.xtext.testlanguages.nestedRefs.NestedRefsTestLanguage.SelfReferingDecl");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleSelfReferingDecl
entryRuleSelfReferingDecl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelfReferingDeclRule()); }
	iv_ruleSelfReferingDecl=ruleSelfReferingDecl
	{ $current=$iv_ruleSelfReferingDecl.current; }
	EOF;

// Rule SelfReferingDecl
ruleSelfReferingDecl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='decl'
		{
			newLeafNode(otherlv_0, grammarAccess.getSelfReferingDeclAccess().getDeclKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSelfReferingDeclAccess().getNameQualifiedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifiedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSelfReferingDeclRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.testlanguages.nestedRefs.NestedRefsTestLanguage.QualifiedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2='end'
		{
			newLeafNode(otherlv_2, grammarAccess.getSelfReferingDeclAccess().getEndKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSelfReferingDeclRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getSelfReferingDeclAccess().getSelfRefSelfReferingDeclCrossReference_3_0());
				}
				ruleQualifiedName
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getSelfReferingDeclAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleQualifiedName
entryRuleQualifiedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifiedNameRule()); }
	iv_ruleQualifiedName=ruleQualifiedName
	{ $current=$iv_ruleQualifiedName.current.getText(); }
	EOF;

// Rule QualifiedName
ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
			}
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
