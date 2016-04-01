/*
 * generated by Xtext
 */
package de.uni_hildesheim.sse.vil.templatelang.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.uni_hildesheim.sse.vil.templatelang.services.TemplateLangGrammarAccess;

public class TemplateLangParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private TemplateLangGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.uni_hildesheim.sse.vil.templatelang.parser.antlr.internal.InternalTemplateLangParser createParser(XtextTokenStream stream) {
		return new de.uni_hildesheim.sse.vil.templatelang.parser.antlr.internal.InternalTemplateLangParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "LanguageUnit";
	}
	
	public TemplateLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TemplateLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
