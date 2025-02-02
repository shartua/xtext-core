/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.eclipse.xtext.testlanguages.fileAware.services;

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
public class FileAwareTestLanguageGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class PackageDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.fileAware.FileAwareTestLanguage.PackageDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cPackageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cContentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cContentsElementParserRuleCall_3_0 = (RuleCall)cContentsAssignment_3.eContents().get(0);
		
		//PackageDeclaration:
		//    'package' name=QualifiedName
		//    imports+=Import*
		//    contents+=Element*;
		@Override public ParserRule getRule() { return rule; }
		
		//'package' name=QualifiedName
		//imports+=Import*
		//contents+=Element*
		public Group getGroup() { return cGroup; }
		
		//'package'
		public Keyword getPackageKeyword_0() { return cPackageKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_2_0() { return cImportsImportParserRuleCall_2_0; }
		
		//contents+=Element*
		public Assignment getContentsAssignment_3() { return cContentsAssignment_3; }
		
		//Element
		public RuleCall getContentsElementParserRuleCall_3_0() { return cContentsElementParserRuleCall_3_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.fileAware.FileAwareTestLanguage.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cElementAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cElementElementCrossReference_1_0 = (CrossReference)cElementAssignment_1.eContents().get(0);
		private final RuleCall cElementElementQualifiedNameParserRuleCall_1_0_1 = (RuleCall)cElementElementCrossReference_1_0.eContents().get(1);
		
		//Import:
		//    'import' element=[Element|QualifiedName];
		@Override public ParserRule getRule() { return rule; }
		
		//'import' element=[Element|QualifiedName]
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//element=[Element|QualifiedName]
		public Assignment getElementAssignment_1() { return cElementAssignment_1; }
		
		//[Element|QualifiedName]
		public CrossReference getElementElementCrossReference_1_0() { return cElementElementCrossReference_1_0; }
		
		//QualifiedName
		public RuleCall getElementElementQualifiedNameParserRuleCall_1_0_1() { return cElementElementQualifiedNameParserRuleCall_1_0_1; }
	}
	public class ElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.fileAware.FileAwareTestLanguage.Element");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cElementKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cContentsAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cContentsElementParserRuleCall_3_0_0 = (RuleCall)cContentsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cRefKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cRefAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final CrossReference cRefElementCrossReference_3_1_1_0 = (CrossReference)cRefAssignment_3_1_1.eContents().get(0);
		private final RuleCall cRefElementQualifiedNameParserRuleCall_3_1_1_0_1 = (RuleCall)cRefElementCrossReference_3_1_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Element:
		//    'element' name=ID '{'
		//        (contents+=Element | 'ref' ref+=[Element|QualifiedName])*
		//    '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'element' name=ID '{'
		//    (contents+=Element | 'ref' ref+=[Element|QualifiedName])*
		//'}'
		public Group getGroup() { return cGroup; }
		
		//'element'
		public Keyword getElementKeyword_0() { return cElementKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(contents+=Element | 'ref' ref+=[Element|QualifiedName])*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//contents+=Element
		public Assignment getContentsAssignment_3_0() { return cContentsAssignment_3_0; }
		
		//Element
		public RuleCall getContentsElementParserRuleCall_3_0_0() { return cContentsElementParserRuleCall_3_0_0; }
		
		//'ref' ref+=[Element|QualifiedName]
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'ref'
		public Keyword getRefKeyword_3_1_0() { return cRefKeyword_3_1_0; }
		
		//ref+=[Element|QualifiedName]
		public Assignment getRefAssignment_3_1_1() { return cRefAssignment_3_1_1; }
		
		//[Element|QualifiedName]
		public CrossReference getRefElementCrossReference_3_1_1_0() { return cRefElementCrossReference_3_1_1_0; }
		
		//QualifiedName
		public RuleCall getRefElementQualifiedNameParserRuleCall_3_1_1_0_1() { return cRefElementQualifiedNameParserRuleCall_3_1_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.testlanguages.fileAware.FileAwareTestLanguage.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//    ID ('.' ID)*;
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
	
	
	private final PackageDeclarationElements pPackageDeclaration;
	private final ImportElements pImport;
	private final ElementElements pElement;
	private final QualifiedNameElements pQualifiedName;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FileAwareTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPackageDeclaration = new PackageDeclarationElements();
		this.pImport = new ImportElements();
		this.pElement = new ElementElements();
		this.pQualifiedName = new QualifiedNameElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.testlanguages.fileAware.FileAwareTestLanguage".equals(grammar.getName())) {
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

	
	//PackageDeclaration:
	//    'package' name=QualifiedName
	//    imports+=Import*
	//    contents+=Element*;
	public PackageDeclarationElements getPackageDeclarationAccess() {
		return pPackageDeclaration;
	}
	
	public ParserRule getPackageDeclarationRule() {
		return getPackageDeclarationAccess().getRule();
	}
	
	//Import:
	//    'import' element=[Element|QualifiedName];
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//Element:
	//    'element' name=ID '{'
	//        (contents+=Element | 'ref' ref+=[Element|QualifiedName])*
	//    '}';
	public ElementElements getElementAccess() {
		return pElement;
	}
	
	public ParserRule getElementRule() {
		return getElementAccess().getRule();
	}
	
	//QualifiedName:
	//    ID ('.' ID)*;
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
