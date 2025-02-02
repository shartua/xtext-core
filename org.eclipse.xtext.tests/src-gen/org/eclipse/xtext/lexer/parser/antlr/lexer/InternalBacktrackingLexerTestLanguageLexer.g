/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
lexer grammar InternalBacktrackingLexerTestLanguageLexer;

options {
	backtrack=true;
	memoize=true;
}
tokens {
	Abc;
	Efg;
	RULE_CHARA;
	RULE_CHARB;
	RULE_CHARX;
	RULE_YC;
	RULE_CHARY;
	RULE_CHARC;
	RULE_WS;
	RULE_SL_COMMENT;
}

@header {
package org.eclipse.xtext.lexer.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}
SYNTHETIC_ALL_KEYWORDS :
	(FRAGMENT_Abc)=> FRAGMENT_Abc {$type = Abc; } |
	(FRAGMENT_Efg)=> FRAGMENT_Efg {$type = Efg; } |
	(FRAGMENT_RULE_CHARA)=> FRAGMENT_RULE_CHARA {$type = RULE_CHARA; } |
	(FRAGMENT_RULE_CHARB)=> FRAGMENT_RULE_CHARB {$type = RULE_CHARB; } |
	(FRAGMENT_RULE_CHARX)=> FRAGMENT_RULE_CHARX {$type = RULE_CHARX; } |
	(FRAGMENT_RULE_YC)=> FRAGMENT_RULE_YC {$type = RULE_YC; } |
	(FRAGMENT_RULE_CHARY)=> FRAGMENT_RULE_CHARY {$type = RULE_CHARY; } |
	(FRAGMENT_RULE_WS)=> FRAGMENT_RULE_WS {$type = RULE_WS; } |
	(FRAGMENT_RULE_SL_COMMENT)=> FRAGMENT_RULE_SL_COMMENT {$type = RULE_SL_COMMENT; }
;

fragment FRAGMENT_Abc : 'Abc';

fragment FRAGMENT_Efg : 'Efg';


// Rules duplicated to allow inter-rule references

fragment RULE_CHARA : FRAGMENT_RULE_CHARA;
fragment FRAGMENT_RULE_CHARA : 'A';

fragment RULE_CHARB : FRAGMENT_RULE_CHARB;
fragment FRAGMENT_RULE_CHARB : 'b';

fragment RULE_CHARX : FRAGMENT_RULE_CHARX;
fragment FRAGMENT_RULE_CHARX : 'X';

fragment RULE_YC : FRAGMENT_RULE_YC;
fragment FRAGMENT_RULE_YC : RULE_CHARY RULE_CHARC;

fragment RULE_CHARY : FRAGMENT_RULE_CHARY;
fragment FRAGMENT_RULE_CHARY : 'Y';

fragment RULE_CHARC : 'c';

fragment RULE_WS : FRAGMENT_RULE_WS;
fragment FRAGMENT_RULE_WS : (' '|'\t'|'\r'|'\n')+;

fragment RULE_SL_COMMENT : FRAGMENT_RULE_SL_COMMENT;
fragment FRAGMENT_RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;
