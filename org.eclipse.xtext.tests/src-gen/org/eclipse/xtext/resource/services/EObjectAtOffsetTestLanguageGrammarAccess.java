/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.resource.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
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
public class EObjectAtOffsetTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.Model");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cFoosAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cFoosFooParserRuleCall_0_0 = (RuleCall)cFoosAssignment_0.eContents().get(0);
		private final Assignment cBarsAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cBarsAbstractBarParserRuleCall_1_0 = (RuleCall)cBarsAssignment_1.eContents().get(0);
		
		//Model:
		//    (foos+=Foo | bars+=AbstractBar)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(foos+=Foo | bars+=AbstractBar)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//foos+=Foo
		public Assignment getFoosAssignment_0() { return cFoosAssignment_0; }
		
		//Foo
		public RuleCall getFoosFooParserRuleCall_0_0() { return cFoosFooParserRuleCall_0_0; }
		
		//bars+=AbstractBar
		public Assignment getBarsAssignment_1() { return cBarsAssignment_1; }
		
		//AbstractBar
		public RuleCall getBarsAbstractBarParserRuleCall_1_0() { return cBarsAbstractBarParserRuleCall_1_0; }
	}
	public class AbstractBarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.AbstractBar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cZonkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cBarParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Action cFooBarBarAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Keyword cFoobarKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cFooAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final CrossReference cFooFooCrossReference_3_2_0 = (CrossReference)cFooAssignment_3_2.eContents().get(0);
		private final RuleCall cFooFooQualifiedNameWithOtherDelimParserRuleCall_3_2_0_1 = (RuleCall)cFooFooCrossReference_3_2_0.eContents().get(1);
		private final Assignment cFooAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cFooFooCrossReference_4_0 = (CrossReference)cFooAssignment_4.eContents().get(0);
		private final RuleCall cFooFooQualifiedNameWithOtherDelimParserRuleCall_4_0_1 = (RuleCall)cFooFooCrossReference_4_0.eContents().get(1);
		
		//AbstractBar:
		//    'zonk'? INT? Bar ({FooBar.bar=current} 'foobar' foo+=[Foo|QualifiedNameWithOtherDelim])? foo+=[Foo|QualifiedNameWithOtherDelim]?;
		@Override public ParserRule getRule() { return rule; }
		
		//'zonk'? INT? Bar ({FooBar.bar=current} 'foobar' foo+=[Foo|QualifiedNameWithOtherDelim])? foo+=[Foo|QualifiedNameWithOtherDelim]?
		public Group getGroup() { return cGroup; }
		
		//'zonk'?
		public Keyword getZonkKeyword_0() { return cZonkKeyword_0; }
		
		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
		
		//Bar
		public RuleCall getBarParserRuleCall_2() { return cBarParserRuleCall_2; }
		
		//({FooBar.bar=current} 'foobar' foo+=[Foo|QualifiedNameWithOtherDelim])?
		public Group getGroup_3() { return cGroup_3; }
		
		//{FooBar.bar=current}
		public Action getFooBarBarAction_3_0() { return cFooBarBarAction_3_0; }
		
		//'foobar'
		public Keyword getFoobarKeyword_3_1() { return cFoobarKeyword_3_1; }
		
		//foo+=[Foo|QualifiedNameWithOtherDelim]
		public Assignment getFooAssignment_3_2() { return cFooAssignment_3_2; }
		
		//[Foo|QualifiedNameWithOtherDelim]
		public CrossReference getFooFooCrossReference_3_2_0() { return cFooFooCrossReference_3_2_0; }
		
		//QualifiedNameWithOtherDelim
		public RuleCall getFooFooQualifiedNameWithOtherDelimParserRuleCall_3_2_0_1() { return cFooFooQualifiedNameWithOtherDelimParserRuleCall_3_2_0_1; }
		
		//foo+=[Foo|QualifiedNameWithOtherDelim]?
		public Assignment getFooAssignment_4() { return cFooAssignment_4; }
		
		//[Foo|QualifiedNameWithOtherDelim]
		public CrossReference getFooFooCrossReference_4_0() { return cFooFooCrossReference_4_0; }
		
		//QualifiedNameWithOtherDelim
		public RuleCall getFooFooQualifiedNameWithOtherDelimParserRuleCall_4_0_1() { return cFooFooQualifiedNameWithOtherDelimParserRuleCall_4_0_1; }
	}
	public class BarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.Bar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cFooAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cFooFooCrossReference_2_0 = (CrossReference)cFooAssignment_2.eContents().get(0);
		private final RuleCall cFooFooQualifiedNameWithOtherDelimParserRuleCall_2_0_1 = (RuleCall)cFooFooCrossReference_2_0.eContents().get(1);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cFooAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cFooFooCrossReference_3_1_0 = (CrossReference)cFooAssignment_3_1.eContents().get(0);
		private final RuleCall cFooFooQualifiedNameWithOtherDelimParserRuleCall_3_1_0_1 = (RuleCall)cFooFooCrossReference_3_1_0.eContents().get(1);
		
		//Bar:
		//    'bar' name=ID foo+=[Foo|QualifiedNameWithOtherDelim] (',' foo+=[Foo|QualifiedNameWithOtherDelim])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'bar' name=ID foo+=[Foo|QualifiedNameWithOtherDelim] (',' foo+=[Foo|QualifiedNameWithOtherDelim])*
		public Group getGroup() { return cGroup; }
		
		//'bar'
		public Keyword getBarKeyword_0() { return cBarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//foo+=[Foo|QualifiedNameWithOtherDelim]
		public Assignment getFooAssignment_2() { return cFooAssignment_2; }
		
		//[Foo|QualifiedNameWithOtherDelim]
		public CrossReference getFooFooCrossReference_2_0() { return cFooFooCrossReference_2_0; }
		
		//QualifiedNameWithOtherDelim
		public RuleCall getFooFooQualifiedNameWithOtherDelimParserRuleCall_2_0_1() { return cFooFooQualifiedNameWithOtherDelimParserRuleCall_2_0_1; }
		
		//(',' foo+=[Foo|QualifiedNameWithOtherDelim])*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//foo+=[Foo|QualifiedNameWithOtherDelim]
		public Assignment getFooAssignment_3_1() { return cFooAssignment_3_1; }
		
		//[Foo|QualifiedNameWithOtherDelim]
		public CrossReference getFooFooCrossReference_3_1_0() { return cFooFooCrossReference_3_1_0; }
		
		//QualifiedNameWithOtherDelim
		public RuleCall getFooFooQualifiedNameWithOtherDelimParserRuleCall_3_1_0_1() { return cFooFooQualifiedNameWithOtherDelimParserRuleCall_3_1_0_1; }
	}
	public class FooElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.Foo");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFooKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameWithOtherDelimParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Foo:
		//    'foo' name=QualifiedNameWithOtherDelim;
		@Override public ParserRule getRule() { return rule; }
		
		//'foo' name=QualifiedNameWithOtherDelim
		public Group getGroup() { return cGroup; }
		
		//'foo'
		public Keyword getFooKeyword_0() { return cFooKeyword_0; }
		
		//name=QualifiedNameWithOtherDelim
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedNameWithOtherDelim
		public RuleCall getNameQualifiedNameWithOtherDelimParserRuleCall_1_0() { return cNameQualifiedNameWithOtherDelimParserRuleCall_1_0; }
	}
	public class QualifiedNameWithOtherDelimElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.QualifiedNameWithOtherDelim");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cQualifiedNameParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedNameWithOtherDelim :
		//    QualifiedName ('=' QualifiedName)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName ('=' QualifiedName)*
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//('=' QualifiedName)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_1_1() { return cQualifiedNameParserRuleCall_1_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName :
		//    ID ('.' ID)*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	
	
	private final ModelElements pModel;
	private final AbstractBarElements pAbstractBar;
	private final BarElements pBar;
	private final FooElements pFoo;
	private final QualifiedNameWithOtherDelimElements pQualifiedNameWithOtherDelim;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EObjectAtOffsetTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pAbstractBar = new AbstractBarElements();
		this.pBar = new BarElements();
		this.pFoo = new FooElements();
		this.pQualifiedNameWithOtherDelim = new QualifiedNameWithOtherDelimElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.resource.EObjectAtOffsetTestLanguage".equals(grammar.getName())) {
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

	
	//Model:
	//    (foos+=Foo | bars+=AbstractBar)*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//AbstractBar:
	//    'zonk'? INT? Bar ({FooBar.bar=current} 'foobar' foo+=[Foo|QualifiedNameWithOtherDelim])? foo+=[Foo|QualifiedNameWithOtherDelim]?;
	public AbstractBarElements getAbstractBarAccess() {
		return pAbstractBar;
	}
	
	public ParserRule getAbstractBarRule() {
		return getAbstractBarAccess().getRule();
	}
	
	//Bar:
	//    'bar' name=ID foo+=[Foo|QualifiedNameWithOtherDelim] (',' foo+=[Foo|QualifiedNameWithOtherDelim])*;
	public BarElements getBarAccess() {
		return pBar;
	}
	
	public ParserRule getBarRule() {
		return getBarAccess().getRule();
	}
	
	//Foo:
	//    'foo' name=QualifiedNameWithOtherDelim;
	public FooElements getFooAccess() {
		return pFoo;
	}
	
	public ParserRule getFooRule() {
		return getFooAccess().getRule();
	}
	
	//QualifiedNameWithOtherDelim :
	//    QualifiedName ('=' QualifiedName)*
	//;
	public QualifiedNameWithOtherDelimElements getQualifiedNameWithOtherDelimAccess() {
		return pQualifiedNameWithOtherDelim;
	}
	
	public ParserRule getQualifiedNameWithOtherDelimRule() {
		return getQualifiedNameWithOtherDelimAccess().getRule();
	}
	
	//QualifiedName :
	//    ID ('.' ID)*
	//;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
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
