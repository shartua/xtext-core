/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ReferenceGrammarTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class SpielplatzElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguage.Spielplatz");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpielplatzKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cGroesseAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cGroesseINTTerminalRuleCall_1_0 = (RuleCall)cGroesseAssignment_1.eContents().get(0);
		private final Assignment cBeschreibungAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cBeschreibungSTRINGTerminalRuleCall_2_0 = (RuleCall)cBeschreibungAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cKinderAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cKinderKindParserRuleCall_4_0_0 = (RuleCall)cKinderAssignment_4_0.eContents().get(0);
		private final Assignment cErzieherAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cErzieherErwachsenerParserRuleCall_4_1_0 = (RuleCall)cErzieherAssignment_4_1.eContents().get(0);
		private final Assignment cSpielzeugeAssignment_4_2 = (Assignment)cAlternatives_4.eContents().get(2);
		private final RuleCall cSpielzeugeSpielzeugParserRuleCall_4_2_0 = (RuleCall)cSpielzeugeAssignment_4_2.eContents().get(0);
		private final Assignment cFamilieAssignment_4_3 = (Assignment)cAlternatives_4.eContents().get(3);
		private final RuleCall cFamilieFamilieParserRuleCall_4_3_0 = (RuleCall)cFamilieAssignment_4_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Spielplatz :
		//     ( "spielplatz" groesse = INT ( beschreibung = STRING ) ? "{" ( kinder += Kind | erzieher += Erwachsener | spielzeuge += Spielzeug | familie += Familie ) * "}" ) ? ;
		@Override public ParserRule getRule() { return rule; }
		
		//( "spielplatz" groesse = INT ( beschreibung = STRING ) ? "{" ( kinder += Kind | erzieher += Erwachsener | spielzeuge += Spielzeug | familie += Familie ) * "}" ) ?
		public Group getGroup() { return cGroup; }
		
		//"spielplatz"
		public Keyword getSpielplatzKeyword_0() { return cSpielplatzKeyword_0; }
		
		//groesse = INT
		public Assignment getGroesseAssignment_1() { return cGroesseAssignment_1; }
		
		//INT
		public RuleCall getGroesseINTTerminalRuleCall_1_0() { return cGroesseINTTerminalRuleCall_1_0; }
		
		//( beschreibung = STRING ) ?
		public Assignment getBeschreibungAssignment_2() { return cBeschreibungAssignment_2; }
		
		//STRING
		public RuleCall getBeschreibungSTRINGTerminalRuleCall_2_0() { return cBeschreibungSTRINGTerminalRuleCall_2_0; }
		
		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//( kinder += Kind | erzieher += Erwachsener | spielzeuge += Spielzeug | familie += Familie ) *
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//kinder += Kind
		public Assignment getKinderAssignment_4_0() { return cKinderAssignment_4_0; }
		
		//Kind
		public RuleCall getKinderKindParserRuleCall_4_0_0() { return cKinderKindParserRuleCall_4_0_0; }
		
		//erzieher += Erwachsener
		public Assignment getErzieherAssignment_4_1() { return cErzieherAssignment_4_1; }
		
		//Erwachsener
		public RuleCall getErzieherErwachsenerParserRuleCall_4_1_0() { return cErzieherErwachsenerParserRuleCall_4_1_0; }
		
		//spielzeuge += Spielzeug
		public Assignment getSpielzeugeAssignment_4_2() { return cSpielzeugeAssignment_4_2; }
		
		//Spielzeug
		public RuleCall getSpielzeugeSpielzeugParserRuleCall_4_2_0() { return cSpielzeugeSpielzeugParserRuleCall_4_2_0; }
		
		//familie += Familie
		public Assignment getFamilieAssignment_4_3() { return cFamilieAssignment_4_3; }
		
		//Familie
		public RuleCall getFamilieFamilieParserRuleCall_4_3_0() { return cFamilieFamilieParserRuleCall_4_3_0; }
		
		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class PersonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguage.Person");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cKindParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cErwachsenerParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Person :
		//     Kind | Erwachsener ;
		@Override public ParserRule getRule() { return rule; }
		
		//Kind | Erwachsener
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Kind
		public RuleCall getKindParserRuleCall_0() { return cKindParserRuleCall_0; }
		
		//Erwachsener
		public RuleCall getErwachsenerParserRuleCall_1() { return cErwachsenerParserRuleCall_1; }
	}
	public class KindElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguage.Kind");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cKindKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cAgeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAgeINTTerminalRuleCall_3_0 = (RuleCall)cAgeAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Kind :
		//     "kind" "(" name = ID age = INT ")" ;
		@Override public ParserRule getRule() { return rule; }
		
		//"kind" "(" name = ID age = INT ")"
		public Group getGroup() { return cGroup; }
		
		//"kind"
		public Keyword getKindKeyword_0() { return cKindKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name = ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//age = INT
		public Assignment getAgeAssignment_3() { return cAgeAssignment_3; }
		
		//INT
		public RuleCall getAgeINTTerminalRuleCall_3_0() { return cAgeINTTerminalRuleCall_3_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class ErwachsenerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguage.Erwachsener");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cErwachsenerKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cAgeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAgeINTTerminalRuleCall_3_0 = (RuleCall)cAgeAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Erwachsener :
		//     "erwachsener" "(" name = ID age = INT ")" ;
		@Override public ParserRule getRule() { return rule; }
		
		//"erwachsener" "(" name = ID age = INT ")"
		public Group getGroup() { return cGroup; }
		
		//"erwachsener"
		public Keyword getErwachsenerKeyword_0() { return cErwachsenerKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name = ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//age = INT
		public Assignment getAgeAssignment_3() { return cAgeAssignment_3; }
		
		//INT
		public RuleCall getAgeINTTerminalRuleCall_3_0() { return cAgeINTTerminalRuleCall_3_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class SpielzeugElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguage.Spielzeug");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSpielzeugKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cFarbeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFarbeFarbeParserRuleCall_3_0 = (RuleCall)cFarbeAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Spielzeug :
		//     "spielzeug" "(" name = ID farbe = Farbe ")" ;
		@Override public ParserRule getRule() { return rule; }
		
		//"spielzeug" "(" name = ID farbe = Farbe ")"
		public Group getGroup() { return cGroup; }
		
		//"spielzeug"
		public Keyword getSpielzeugKeyword_0() { return cSpielzeugKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name = ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//farbe = Farbe
		public Assignment getFarbeAssignment_3() { return cFarbeAssignment_3; }
		
		//Farbe
		public RuleCall getFarbeFarbeParserRuleCall_3_0() { return cFarbeFarbeParserRuleCall_3_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class FarbeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguage.Farbe");
		private final Assignment cWertAssignment = (Assignment)rule.eContents().get(1);
		private final Alternatives cWertAlternatives_0 = (Alternatives)cWertAssignment.eContents().get(0);
		private final Keyword cWertROTKeyword_0_0 = (Keyword)cWertAlternatives_0.eContents().get(0);
		private final Keyword cWertBLAUKeyword_0_1 = (Keyword)cWertAlternatives_0.eContents().get(1);
		private final Keyword cWertGELBKeyword_0_2 = (Keyword)cWertAlternatives_0.eContents().get(2);
		private final Keyword cWertGR�NKeyword_0_3 = (Keyword)cWertAlternatives_0.eContents().get(3);
		
		//Farbe :
		//     wert=("ROT" | "BLAU" | "GELB" | "GR�N") ;
		@Override public ParserRule getRule() { return rule; }
		
		//wert=("ROT" | "BLAU" | "GELB" | "GR�N")
		public Assignment getWertAssignment() { return cWertAssignment; }
		
		//("ROT" | "BLAU" | "GELB" | "GR�N")
		public Alternatives getWertAlternatives_0() { return cWertAlternatives_0; }
		
		//"ROT"
		public Keyword getWertROTKeyword_0_0() { return cWertROTKeyword_0_0; }
		
		//"BLAU"
		public Keyword getWertBLAUKeyword_0_1() { return cWertBLAUKeyword_0_1; }
		
		//"GELB"
		public Keyword getWertGELBKeyword_0_2() { return cWertGELBKeyword_0_2; }
		
		//"GR�N"
		public Keyword getWertGR�NKeyword_0_3() { return cWertGR�NKeyword_0_3; }
	}
	public class FamilieElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguage.Familie");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFamilieKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cNameAlternatives_2_0 = (Alternatives)cNameAssignment_2.eContents().get(0);
		private final Keyword cNameKeywordKeyword_2_0_0 = (Keyword)cNameAlternatives_2_0.eContents().get(0);
		private final RuleCall cNameSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cNameAlternatives_2_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_2_0_2 = (RuleCall)cNameAlternatives_2_0.eContents().get(2);
		private final Assignment cMutterAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cMutterErwachsenerCrossReference_3_0 = (CrossReference)cMutterAssignment_3.eContents().get(0);
		private final RuleCall cMutterErwachsenerIDTerminalRuleCall_3_0_1 = (RuleCall)cMutterErwachsenerCrossReference_3_0.eContents().get(1);
		private final Assignment cVaterAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cVaterErwachsenerCrossReference_4_0 = (CrossReference)cVaterAssignment_4.eContents().get(0);
		private final RuleCall cVaterErwachsenerIDTerminalRuleCall_4_0_1 = (RuleCall)cVaterErwachsenerCrossReference_4_0.eContents().get(1);
		private final Assignment cKinderAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cKinderKindCrossReference_5_0 = (CrossReference)cKinderAssignment_5.eContents().get(0);
		private final RuleCall cKinderKindIDTerminalRuleCall_5_0_1 = (RuleCall)cKinderKindCrossReference_5_0.eContents().get(1);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cKinderAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final CrossReference cKinderKindCrossReference_6_1_0 = (CrossReference)cKinderAssignment_6_1.eContents().get(0);
		private final RuleCall cKinderKindIDTerminalRuleCall_6_1_0_1 = (RuleCall)cKinderKindCrossReference_6_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Familie :
		//     "familie" "(" name=("keyword" | STRING | ID)  mutter=[Erwachsener] vater=[Erwachsener] kinder+=[Kind] ("," kinder+=[Kind])* ")" ;
		@Override public ParserRule getRule() { return rule; }
		
		//"familie" "(" name=("keyword" | STRING | ID)  mutter=[Erwachsener] vater=[Erwachsener] kinder+=[Kind] ("," kinder+=[Kind])* ")"
		public Group getGroup() { return cGroup; }
		
		//"familie"
		public Keyword getFamilieKeyword_0() { return cFamilieKeyword_0; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//name=("keyword" | STRING | ID)
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//("keyword" | STRING | ID)
		public Alternatives getNameAlternatives_2_0() { return cNameAlternatives_2_0; }
		
		//"keyword"
		public Keyword getNameKeywordKeyword_2_0_0() { return cNameKeywordKeyword_2_0_0; }
		
		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_2_0_1() { return cNameSTRINGTerminalRuleCall_2_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0_2() { return cNameIDTerminalRuleCall_2_0_2; }
		
		//mutter=[Erwachsener]
		public Assignment getMutterAssignment_3() { return cMutterAssignment_3; }
		
		//[Erwachsener]
		public CrossReference getMutterErwachsenerCrossReference_3_0() { return cMutterErwachsenerCrossReference_3_0; }
		
		//ID
		public RuleCall getMutterErwachsenerIDTerminalRuleCall_3_0_1() { return cMutterErwachsenerIDTerminalRuleCall_3_0_1; }
		
		//vater=[Erwachsener]
		public Assignment getVaterAssignment_4() { return cVaterAssignment_4; }
		
		//[Erwachsener]
		public CrossReference getVaterErwachsenerCrossReference_4_0() { return cVaterErwachsenerCrossReference_4_0; }
		
		//ID
		public RuleCall getVaterErwachsenerIDTerminalRuleCall_4_0_1() { return cVaterErwachsenerIDTerminalRuleCall_4_0_1; }
		
		//kinder+=[Kind]
		public Assignment getKinderAssignment_5() { return cKinderAssignment_5; }
		
		//[Kind]
		public CrossReference getKinderKindCrossReference_5_0() { return cKinderKindCrossReference_5_0; }
		
		//ID
		public RuleCall getKinderKindIDTerminalRuleCall_5_0_1() { return cKinderKindIDTerminalRuleCall_5_0_1; }
		
		//("," kinder+=[Kind])*
		public Group getGroup_6() { return cGroup_6; }
		
		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//kinder+=[Kind]
		public Assignment getKinderAssignment_6_1() { return cKinderAssignment_6_1; }
		
		//[Kind]
		public CrossReference getKinderKindCrossReference_6_1_0() { return cKinderKindCrossReference_6_1_0; }
		
		//ID
		public RuleCall getKinderKindIDTerminalRuleCall_6_1_0_1() { return cKinderKindIDTerminalRuleCall_6_1_0_1; }
		
		//")"
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	
	
	private final SpielplatzElements pSpielplatz;
	private final PersonElements pPerson;
	private final KindElements pKind;
	private final ErwachsenerElements pErwachsener;
	private final SpielzeugElements pSpielzeug;
	private final FarbeElements pFarbe;
	private final FamilieElements pFamilie;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ReferenceGrammarTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pSpielplatz = new SpielplatzElements();
		this.pPerson = new PersonElements();
		this.pKind = new KindElements();
		this.pErwachsener = new ErwachsenerElements();
		this.pSpielzeug = new SpielzeugElements();
		this.pFarbe = new FarbeElements();
		this.pFamilie = new FamilieElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.ReferenceGrammarTestLanguage".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Spielplatz :
	//     ( "spielplatz" groesse = INT ( beschreibung = STRING ) ? "{" ( kinder += Kind | erzieher += Erwachsener | spielzeuge += Spielzeug | familie += Familie ) * "}" ) ? ;
	public SpielplatzElements getSpielplatzAccess() {
		return pSpielplatz;
	}
	
	public ParserRule getSpielplatzRule() {
		return getSpielplatzAccess().getRule();
	}
	
	//Person :
	//     Kind | Erwachsener ;
	public PersonElements getPersonAccess() {
		return pPerson;
	}
	
	public ParserRule getPersonRule() {
		return getPersonAccess().getRule();
	}
	
	//Kind :
	//     "kind" "(" name = ID age = INT ")" ;
	public KindElements getKindAccess() {
		return pKind;
	}
	
	public ParserRule getKindRule() {
		return getKindAccess().getRule();
	}
	
	//Erwachsener :
	//     "erwachsener" "(" name = ID age = INT ")" ;
	public ErwachsenerElements getErwachsenerAccess() {
		return pErwachsener;
	}
	
	public ParserRule getErwachsenerRule() {
		return getErwachsenerAccess().getRule();
	}
	
	//Spielzeug :
	//     "spielzeug" "(" name = ID farbe = Farbe ")" ;
	public SpielzeugElements getSpielzeugAccess() {
		return pSpielzeug;
	}
	
	public ParserRule getSpielzeugRule() {
		return getSpielzeugAccess().getRule();
	}
	
	//Farbe :
	//     wert=("ROT" | "BLAU" | "GELB" | "GR�N") ;
	public FarbeElements getFarbeAccess() {
		return pFarbe;
	}
	
	public ParserRule getFarbeRule() {
		return getFarbeAccess().getRule();
	}
	
	//Familie :
	//     "familie" "(" name=("keyword" | STRING | ID)  mutter=[Erwachsener] vater=[Erwachsener] kinder+=[Kind] ("," kinder+=[Kind])* ")" ;
	public FamilieElements getFamilieAccess() {
		return pFamilie;
	}
	
	public ParserRule getFamilieRule() {
		return getFamilieAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
