/*
* generated by Xtext
*/
package org.eclipse.xtext.common.parser.packrat;

import java.io.Reader;

import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.packrat.AbstractPackratParser;
import org.eclipse.xtext.parser.packrat.AbstractParserConfiguration.IInternalParserConfiguration;
import org.eclipse.xtext.parser.packrat.IParseResultFactory;

import com.google.inject.Inject;

public class TerminalsPackratParser extends AbstractPackratParser {
	
	@Inject
	public TerminalsPackratParser(IParseResultFactory parseResultFactory, TerminalsGrammarAccess grammarAccess) {
		super(parseResultFactory, grammarAccess);
	}
	
	@Override
	protected org.eclipse.xtext.common.parser.packrat.TerminalsParserConfiguration createParserConfiguration(IInternalParserConfiguration configuration) {
		return new org.eclipse.xtext.common.parser.packrat.TerminalsParserConfiguration(configuration, getGrammarAccess());
	}
	
	@Override
	protected TerminalsGrammarAccess getGrammarAccess() {
		return (TerminalsGrammarAccess)super.getGrammarAccess();
	}

	@Override
	public IParseResult parse(ParserRule rule, Reader reader) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public IParseResult parse(RuleCall ruleCall, Reader reader, int initialLookAhead) {
		throw new UnsupportedOperationException();
	}

}