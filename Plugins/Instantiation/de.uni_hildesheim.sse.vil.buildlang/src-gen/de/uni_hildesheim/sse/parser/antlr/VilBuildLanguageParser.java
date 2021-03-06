/*
 * generated by Xtext
 */
package de.uni_hildesheim.sse.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import de.uni_hildesheim.sse.services.VilBuildLanguageGrammarAccess;

public class VilBuildLanguageParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private VilBuildLanguageGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected de.uni_hildesheim.sse.parser.antlr.internal.InternalVilBuildLanguageParser createParser(XtextTokenStream stream) {
		return new de.uni_hildesheim.sse.parser.antlr.internal.InternalVilBuildLanguageParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "ImplementationUnit";
	}
	
	public VilBuildLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(VilBuildLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
