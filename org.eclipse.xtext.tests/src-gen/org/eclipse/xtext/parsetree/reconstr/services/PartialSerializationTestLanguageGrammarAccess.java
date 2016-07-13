/*
 * generated by Xtext
 */
package org.eclipse.xtext.parsetree.reconstr.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class PartialSerializationTestLanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.PartialSerializationTestLanguage.Model");
		private final RuleCall cNodeRootParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Model:
		//	NodeRoot;
		@Override public ParserRule getRule() { return rule; }
		
		//NodeRoot
		public RuleCall getNodeRootParserRuleCall() { return cNodeRootParserRuleCall; }
	}
	public class NodeRootElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.PartialSerializationTestLanguage.NodeRoot");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNumberSignDigitOneKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNodeAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNodeNodeParserRuleCall_1_0 = (RuleCall)cNodeAssignment_1.eContents().get(0);
		
		//NodeRoot:
		//	"#1" node=Node;
		@Override public ParserRule getRule() { return rule; }
		
		//"#1" node=Node
		public Group getGroup() { return cGroup; }
		
		//"#1"
		public Keyword getNumberSignDigitOneKeyword_0() { return cNumberSignDigitOneKeyword_0; }
		
		//node=Node
		public Assignment getNodeAssignment_1() { return cNodeAssignment_1; }
		
		//Node
		public RuleCall getNodeNodeParserRuleCall_1_0() { return cNodeNodeParserRuleCall_1_0; }
	}
	public class NodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.eclipse.xtext.parsetree.reconstr.PartialSerializationTestLanguage.Node");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNodeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cChildrenAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cChildrenNodeParserRuleCall_2_1_0 = (RuleCall)cChildrenAssignment_2_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		
		//Node:
		//	"node" name=ID ("(" children+=Node+ ")")?;
		@Override public ParserRule getRule() { return rule; }
		
		//"node" name=ID ("(" children+=Node+ ")")?
		public Group getGroup() { return cGroup; }
		
		//"node"
		public Keyword getNodeKeyword_0() { return cNodeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//("(" children+=Node+ ")")?
		public Group getGroup_2() { return cGroup_2; }
		
		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }
		
		//children+=Node+
		public Assignment getChildrenAssignment_2_1() { return cChildrenAssignment_2_1; }
		
		//Node
		public RuleCall getChildrenNodeParserRuleCall_2_1_0() { return cChildrenNodeParserRuleCall_2_1_0; }
		
		//")"
		public Keyword getRightParenthesisKeyword_2_2() { return cRightParenthesisKeyword_2_2; }
	}
	
	
	private final ModelElements pModel;
	private final NodeRootElements pNodeRoot;
	private final NodeElements pNode;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PartialSerializationTestLanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pNodeRoot = new NodeRootElements();
		this.pNode = new NodeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.eclipse.xtext.parsetree.reconstr.PartialSerializationTestLanguage".equals(grammar.getName())) {
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
	//	NodeRoot;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//NodeRoot:
	//	"#1" node=Node;
	public NodeRootElements getNodeRootAccess() {
		return pNodeRoot;
	}
	
	public ParserRule getNodeRootRule() {
		return getNodeRootAccess().getRule();
	}
	
	//Node:
	//	"node" name=ID ("(" children+=Node+ ")")?;
	public NodeElements getNodeAccess() {
		return pNode;
	}
	
	public ParserRule getNodeRule() {
		return getNodeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}