/*
* generated by Xtext
*/
package de.uni_hildesheim.sse.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class IvmlAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("de/uni_hildesheim/sse/parser/antlr/internal/InternalIvml.tokens");
	}
}
