package de.uni_hildesheim.sse.vil.templatelang.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTemplateLangLexer extends Lexer {
    public static final int T__68=68;
    public static final int RULE_ID=7;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int RULE_VERSION=6;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__15=15;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__18=18;
    public static final int T__54=54;
    public static final int T__17=17;
    public static final int RULE_NUMBER=4;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__59=59;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_EXPONENT=8;
    public static final int RULE_WS=11;

    // delegates
    // delegators

    public InternalTemplateLangLexer() {;} 
    public InternalTemplateLangLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalTemplateLangLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:11:7: ( 'template' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:11:9: 'template'
            {
            match("template"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:12:7: ( '(' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:12:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:13:7: ( ')' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:13:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:14:7: ( 'extends' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:14:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:15:7: ( '{' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:15:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:16:7: ( '}' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:17:7: ( '@indent' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:17:9: '@indent'
            {
            match("@indent"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:18:7: ( ',' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:18:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:19:7: ( '=' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:19:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:20:7: ( 'def' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:20:9: 'def'
            {
            match("def"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:21:7: ( ';' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:21:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:22:7: ( 'if' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:22:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:23:7: ( 'else' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:23:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:24:7: ( 'print' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:24:9: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:25:7: ( '|' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:25:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:26:7: ( 'switch' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:26:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:27:7: ( 'default' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:27:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:28:7: ( ':' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:28:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:29:7: ( 'for' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:29:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:30:7: ( 'multiSelect' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:30:9: 'multiSelect'
            {
            match("multiSelect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:31:7: ( 'case' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:31:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:32:7: ( ':=' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:32:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:33:7: ( 'generic-multiSelect' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:33:9: 'generic-multiSelect'
            {
            match("generic-multiSelect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:34:7: ( 'extension' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:34:9: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:35:7: ( '.' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:35:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:36:7: ( 'const' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:36:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:37:7: ( '@advice' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:37:9: '@advice'
            {
            match("@advice"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:38:7: ( 'with' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:38:9: 'with'
            {
            match("with"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:39:7: ( 'version' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:39:9: 'version'
            {
            match("version"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:40:7: ( '==' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:40:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:41:7: ( '>' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:41:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:42:7: ( '<' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:42:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:43:7: ( '>=' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:43:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:44:7: ( '<=' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:44:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:45:7: ( 'import' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:45:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:46:7: ( 'and' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:46:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:47:7: ( 'or' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:47:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:48:7: ( 'xor' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:48:9: 'xor'
            {
            match("xor"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:49:7: ( '<>' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:49:9: '<>'
            {
            match("<>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:50:7: ( '!=' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:50:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:51:7: ( '+' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:51:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:52:7: ( '-' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:52:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:53:7: ( '*' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:53:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:54:7: ( '/' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:54:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:55:7: ( 'not' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:55:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:56:7: ( '!' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:56:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:57:7: ( 'super' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:57:9: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:58:7: ( 'new' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:58:9: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:59:7: ( '[' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:59:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:60:7: ( ']' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:60:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:61:7: ( '::' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:61:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:62:7: ( 'true' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:62:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:63:7: ( 'false' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:63:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:64:7: ( 'setOf' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:64:9: 'setOf'
            {
            match("setOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:65:7: ( 'sequenceOf' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:65:9: 'sequenceOf'
            {
            match("sequenceOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:66:7: ( 'mapOf' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:66:9: 'mapOf'
            {
            match("mapOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "RULE_VERSION"
    public final void mRULE_VERSION() throws RecognitionException {
        try {
            int _type = RULE_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4646:14: ( 'v' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )* )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4646:16: 'v' ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )*
            {
            match('v'); 
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4646:20: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4646:21: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4646:32: ( '.' ( '0' .. '9' )+ )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='.') ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4646:33: '.' ( '0' .. '9' )+
            	    {
            	    match('.'); 
            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4646:37: ( '0' .. '9' )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4646:38: '0' .. '9'
            	    	    {
            	    	    matchRange('0','9'); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VERSION"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4648:9: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4648:11: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4648:35: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_NUMBER"
    public final void mRULE_NUMBER() throws RecognitionException {
        try {
            int _type = RULE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:13: ( ( '-' )? ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXPONENT )? )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? | ( '0' .. '9' )+ RULE_EXPONENT ) )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:15: ( '-' )? ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXPONENT )? )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? | ( '0' .. '9' )+ RULE_EXPONENT )
            {
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:15: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='-') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:15: '-'
                    {
                    match('-'); 

                    }
                    break;

            }

            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:20: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXPONENT )? )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? | ( '0' .. '9' )+ RULE_EXPONENT )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:21: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXPONENT )? )?
                    {
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:21: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);

                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:33: ( '.' ( '0' .. '9' )* ( RULE_EXPONENT )? )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='.') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:34: '.' ( '0' .. '9' )* ( RULE_EXPONENT )?
                            {
                            match('.'); 
                            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:38: ( '0' .. '9' )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:39: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);

                            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:50: ( RULE_EXPONENT )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0=='E'||LA8_0=='e') ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:50: RULE_EXPONENT
                                    {
                                    mRULE_EXPONENT(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:67: '.' ( '0' .. '9' )+ ( RULE_EXPONENT )?
                    {
                    match('.'); 
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:71: ( '0' .. '9' )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:72: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:83: ( RULE_EXPONENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='E'||LA11_0=='e') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:83: RULE_EXPONENT
                            {
                            mRULE_EXPONENT(); 

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:98: ( '0' .. '9' )+ RULE_EXPONENT
                    {
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:98: ( '0' .. '9' )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4650:99: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    mRULE_EXPONENT(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NUMBER"

    // $ANTLR start "RULE_EXPONENT"
    public final void mRULE_EXPONENT() throws RecognitionException {
        try {
            int _type = RULE_EXPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4652:15: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4652:17: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4652:27: ( '+' | '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='+'||LA14_0=='-') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4652:38: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4652:39: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXPONENT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4654:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4656:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4656:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4656:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4656:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4658:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4658:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4658:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4658:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4658:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4658:41: ( '\\r' )? '\\n'
                    {
                    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4658:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4658:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4660:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4660:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4660:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4662:16: ( . )
            // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:4662:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_VERSION | RULE_ID | RULE_NUMBER | RULE_EXPONENT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=65;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:220: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:226: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:232: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:238: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:244: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:250: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:256: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:262: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:268: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:274: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:280: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:286: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:292: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:298: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:304: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:310: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:316: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:322: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:328: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:334: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:340: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:346: RULE_VERSION
                {
                mRULE_VERSION(); 

                }
                break;
            case 58 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:359: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 59 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:367: RULE_NUMBER
                {
                mRULE_NUMBER(); 

                }
                break;
            case 60 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:379: RULE_EXPONENT
                {
                mRULE_EXPONENT(); 

                }
                break;
            case 61 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:393: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:405: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 63 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:421: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 64 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:437: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 65 :
                // ../de.uni_hildesheim.sse.vil.templatelang/src-gen/de/uni_hildesheim/sse/vil/templatelang/parser/antlr/internal/InternalTemplateLang.g:1:445: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA13_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA13_eofS =
        "\5\uffff";
    static final String DFA13_minS =
        "\1\56\1\60\3\uffff";
    static final String DFA13_maxS =
        "\1\71\1\145\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA13_specialS =
        "\5\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\1\uffff\12\1",
            "\12\1\13\uffff\1\4\37\uffff\1\4",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "4650:20: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )* ( RULE_EXPONENT )? )? | '.' ( '0' .. '9' )+ ( RULE_EXPONENT )? | ( '0' .. '9' )+ RULE_EXPONENT )";
        }
    }
    static final String DFA24_eotS =
        "\1\uffff\1\56\2\uffff\1\56\2\uffff\1\53\1\uffff\1\73\1\56\1\uffff"+
        "\2\56\1\uffff\1\56\1\107\4\56\1\120\2\56\1\125\1\130\3\56\1\135"+
        "\1\uffff\1\137\1\uffff\1\143\1\56\2\uffff\1\56\2\uffff\2\53\2\uffff"+
        "\2\56\3\uffff\2\56\1\uffff\1\56\7\uffff\1\56\1\uffff\1\157\2\56"+
        "\1\uffff\3\56\3\uffff\7\56\2\uffff\2\56\1\177\5\uffff\1\56\1\u0081"+
        "\1\56\10\uffff\2\56\4\uffff\4\56\1\u008a\1\uffff\6\56\1\u0091\10"+
        "\56\1\uffff\1\u009a\1\uffff\1\u009b\1\u009c\1\u009d\1\56\1\u009f"+
        "\1\56\1\u00a1\1\56\1\uffff\6\56\1\uffff\3\56\1\u00ac\2\56\1\u00af"+
        "\1\56\4\uffff\1\56\1\uffff\1\56\1\uffff\2\56\1\u00b6\1\56\1\u00b8"+
        "\1\u00b9\1\56\1\u00bb\1\56\1\u00bd\1\uffff\1\u00be\1\56\1\uffff"+
        "\5\56\1\u00c5\1\uffff\1\u00c6\2\uffff\1\56\1\uffff\1\56\2\uffff"+
        "\3\56\1\u00cc\1\56\1\u00ce\2\uffff\3\56\1\u00d2\1\u00d3\1\uffff"+
        "\1\56\1\uffff\2\56\3\uffff\1\u00d7\2\56\1\uffff\1\u00da\1\56\1\uffff"+
        "\1\u00dc\1\uffff";
    static final String DFA24_eofS =
        "\u00dd\uffff";
    static final String DFA24_minS =
        "\1\0\1\145\2\uffff\1\53\2\uffff\1\141\1\uffff\1\75\1\145\1\uffff"+
        "\1\146\1\162\1\uffff\1\145\1\72\3\141\1\145\1\60\1\151\1\60\2\75"+
        "\1\156\1\162\1\157\1\75\1\uffff\1\56\1\uffff\1\52\1\145\2\uffff"+
        "\1\53\2\uffff\2\0\2\uffff\1\155\1\165\3\uffff\1\164\1\163\1\uffff"+
        "\1\60\7\uffff\1\146\1\uffff\1\60\1\160\1\151\1\uffff\1\151\1\160"+
        "\1\161\3\uffff\1\162\2\154\1\160\1\163\2\156\2\uffff\1\164\1\162"+
        "\1\60\5\uffff\1\144\1\60\1\162\10\uffff\1\164\1\167\4\uffff\1\160"+
        "\3\145\1\60\1\uffff\1\157\1\156\1\164\1\145\1\117\1\165\1\60\1\163"+
        "\1\164\1\117\1\145\1\163\1\145\1\150\1\163\1\uffff\1\60\1\uffff"+
        "\3\60\1\154\1\60\1\156\1\60\1\165\1\uffff\1\162\1\164\1\143\1\162"+
        "\1\146\1\145\1\uffff\1\145\1\151\1\146\1\60\1\164\1\162\1\60\1\151"+
        "\4\uffff\1\141\1\uffff\1\144\1\uffff\1\154\1\164\1\60\1\150\2\60"+
        "\1\156\1\60\1\123\1\60\1\uffff\1\60\1\151\1\uffff\1\157\1\164\1"+
        "\163\1\151\1\164\1\60\1\uffff\1\60\2\uffff\1\143\1\uffff\1\145\2"+
        "\uffff\1\143\1\156\1\145\1\60\1\157\1\60\2\uffff\1\145\1\154\1\55"+
        "\2\60\1\uffff\1\156\1\uffff\1\117\1\145\3\uffff\1\60\1\146\1\143"+
        "\1\uffff\1\60\1\164\1\uffff\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\162\2\uffff\1\170\2\uffff\1\151\1\uffff\1\75\1\145\1"+
        "\uffff\1\155\1\162\1\uffff\1\167\1\75\1\157\1\165\1\157\1\145\1"+
        "\71\1\151\1\145\1\75\1\76\1\156\1\162\1\157\1\75\1\uffff\1\71\1"+
        "\uffff\1\57\1\157\2\uffff\1\71\2\uffff\2\uffff\2\uffff\1\155\1\165"+
        "\3\uffff\1\164\1\163\1\uffff\1\71\7\uffff\1\146\1\uffff\1\172\1"+
        "\160\1\151\1\uffff\1\151\1\160\1\164\3\uffff\1\162\2\154\1\160\1"+
        "\163\2\156\2\uffff\1\164\1\162\1\172\5\uffff\1\144\1\172\1\162\10"+
        "\uffff\1\164\1\167\4\uffff\1\160\3\145\1\172\1\uffff\1\157\1\156"+
        "\1\164\1\145\1\117\1\165\1\172\1\163\1\164\1\117\1\145\1\163\1\145"+
        "\1\150\1\163\1\uffff\1\172\1\uffff\3\172\1\154\1\172\1\156\1\172"+
        "\1\165\1\uffff\1\162\1\164\1\143\1\162\1\146\1\145\1\uffff\1\145"+
        "\1\151\1\146\1\172\1\164\1\162\1\172\1\151\4\uffff\1\141\1\uffff"+
        "\1\163\1\uffff\1\154\1\164\1\172\1\150\2\172\1\156\1\172\1\123\1"+
        "\172\1\uffff\1\172\1\151\1\uffff\1\157\1\164\1\163\1\151\1\164\1"+
        "\172\1\uffff\1\172\2\uffff\1\143\1\uffff\1\145\2\uffff\1\143\1\156"+
        "\1\145\1\172\1\157\1\172\2\uffff\1\145\1\154\1\55\2\172\1\uffff"+
        "\1\156\1\uffff\1\117\1\145\3\uffff\1\172\1\146\1\143\1\uffff\1\172"+
        "\1\164\1\uffff\1\172\1\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\uffff\1\10\2\uffff\1\13\2\uffff"+
        "\1\17\17\uffff\1\51\1\uffff\1\53\2\uffff\1\61\1\62\1\uffff\1\73"+
        "\1\72\2\uffff\1\100\1\101\2\uffff\1\72\1\2\1\3\2\uffff\1\74\1\uffff"+
        "\1\5\1\6\1\7\1\33\1\10\1\36\1\11\1\uffff\1\13\3\uffff\1\17\3\uffff"+
        "\1\26\1\63\1\22\7\uffff\1\73\1\31\3\uffff\1\41\1\37\1\42\1\47\1"+
        "\40\3\uffff\1\50\1\56\1\51\1\52\1\53\1\76\1\77\1\54\2\uffff\1\61"+
        "\1\62\1\75\1\100\5\uffff\1\14\17\uffff\1\71\1\uffff\1\45\10\uffff"+
        "\1\12\6\uffff\1\23\10\uffff\1\44\1\46\1\55\1\60\1\uffff\1\64\1\uffff"+
        "\1\15\12\uffff\1\25\2\uffff\1\34\6\uffff\1\16\1\uffff\1\57\1\66"+
        "\1\uffff\1\65\1\uffff\1\70\1\32\6\uffff\1\43\1\20\5\uffff\1\4\1"+
        "\uffff\1\21\2\uffff\1\27\1\35\1\1\3\uffff\1\30\2\uffff\1\67\1\uffff"+
        "\1\24";
    static final String DFA24_specialS =
        "\1\1\47\uffff\1\0\1\2\u00b3\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\53\2\52\2\53\1\52\22\53\1\52\1\35\1\50\4\53\1\51\1\2\1"+
            "\3\1\40\1\36\1\10\1\37\1\25\1\41\12\46\1\20\1\13\1\31\1\11\1"+
            "\30\1\53\1\7\4\47\1\45\25\47\1\43\1\53\1\44\1\53\1\47\1\53\1"+
            "\32\1\47\1\23\1\12\1\4\1\21\1\24\1\47\1\14\3\47\1\22\1\42\1"+
            "\33\1\15\2\47\1\17\1\1\1\47\1\27\1\26\1\34\2\47\1\5\1\16\1\6"+
            "\uff82\53",
            "\1\54\14\uffff\1\55",
            "",
            "",
            "\1\63\1\uffff\1\63\2\uffff\12\64\62\uffff\1\62\13\uffff\1"+
            "\61",
            "",
            "",
            "\1\70\7\uffff\1\67",
            "",
            "\1\72",
            "\1\74",
            "",
            "\1\76\6\uffff\1\77",
            "\1\100",
            "",
            "\1\104\17\uffff\1\103\1\uffff\1\102",
            "\1\106\2\uffff\1\105",
            "\1\111\15\uffff\1\110",
            "\1\113\23\uffff\1\112",
            "\1\114\15\uffff\1\115",
            "\1\116",
            "\12\117",
            "\1\121",
            "\12\123\53\uffff\1\122",
            "\1\124",
            "\1\126\1\127",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\1\117\1\uffff\12\117",
            "",
            "\1\141\4\uffff\1\142",
            "\1\145\11\uffff\1\144",
            "",
            "",
            "\1\63\1\uffff\1\63\2\uffff\12\64",
            "",
            "",
            "\0\150",
            "\0\150",
            "",
            "",
            "\1\152",
            "\1\153",
            "",
            "",
            "",
            "\1\154",
            "\1\155",
            "",
            "\12\64",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\156",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\160",
            "\1\161",
            "",
            "\1\162",
            "\1\163",
            "\1\165\2\uffff\1\164",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "",
            "",
            "\1\175",
            "\1\176",
            "\12\123\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "",
            "",
            "",
            "\1\u0080",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0082",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "",
            "",
            "",
            "",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\1\u0089\31\56",
            "",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a2",
            "",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ad",
            "\1\u00ae",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b0",
            "",
            "",
            "",
            "",
            "\1\u00b1",
            "",
            "\1\u00b2\16\uffff\1\u00b3",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b7",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ba",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00bc",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00c7",
            "",
            "\1\u00c8",
            "",
            "",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00cd",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00d8",
            "\1\u00d9",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00db",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_VERSION | RULE_ID | RULE_NUMBER | RULE_EXPONENT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_40 = input.LA(1);

                        s = -1;
                        if ( ((LA24_40>='\u0000' && LA24_40<='\uFFFF')) ) {s = 104;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='t') ) {s = 1;}

                        else if ( (LA24_0=='(') ) {s = 2;}

                        else if ( (LA24_0==')') ) {s = 3;}

                        else if ( (LA24_0=='e') ) {s = 4;}

                        else if ( (LA24_0=='{') ) {s = 5;}

                        else if ( (LA24_0=='}') ) {s = 6;}

                        else if ( (LA24_0=='@') ) {s = 7;}

                        else if ( (LA24_0==',') ) {s = 8;}

                        else if ( (LA24_0=='=') ) {s = 9;}

                        else if ( (LA24_0=='d') ) {s = 10;}

                        else if ( (LA24_0==';') ) {s = 11;}

                        else if ( (LA24_0=='i') ) {s = 12;}

                        else if ( (LA24_0=='p') ) {s = 13;}

                        else if ( (LA24_0=='|') ) {s = 14;}

                        else if ( (LA24_0=='s') ) {s = 15;}

                        else if ( (LA24_0==':') ) {s = 16;}

                        else if ( (LA24_0=='f') ) {s = 17;}

                        else if ( (LA24_0=='m') ) {s = 18;}

                        else if ( (LA24_0=='c') ) {s = 19;}

                        else if ( (LA24_0=='g') ) {s = 20;}

                        else if ( (LA24_0=='.') ) {s = 21;}

                        else if ( (LA24_0=='w') ) {s = 22;}

                        else if ( (LA24_0=='v') ) {s = 23;}

                        else if ( (LA24_0=='>') ) {s = 24;}

                        else if ( (LA24_0=='<') ) {s = 25;}

                        else if ( (LA24_0=='a') ) {s = 26;}

                        else if ( (LA24_0=='o') ) {s = 27;}

                        else if ( (LA24_0=='x') ) {s = 28;}

                        else if ( (LA24_0=='!') ) {s = 29;}

                        else if ( (LA24_0=='+') ) {s = 30;}

                        else if ( (LA24_0=='-') ) {s = 31;}

                        else if ( (LA24_0=='*') ) {s = 32;}

                        else if ( (LA24_0=='/') ) {s = 33;}

                        else if ( (LA24_0=='n') ) {s = 34;}

                        else if ( (LA24_0=='[') ) {s = 35;}

                        else if ( (LA24_0==']') ) {s = 36;}

                        else if ( (LA24_0=='E') ) {s = 37;}

                        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {s = 38;}

                        else if ( ((LA24_0>='A' && LA24_0<='D')||(LA24_0>='F' && LA24_0<='Z')||LA24_0=='_'||LA24_0=='b'||LA24_0=='h'||(LA24_0>='j' && LA24_0<='l')||(LA24_0>='q' && LA24_0<='r')||LA24_0=='u'||(LA24_0>='y' && LA24_0<='z')) ) {s = 39;}

                        else if ( (LA24_0=='\"') ) {s = 40;}

                        else if ( (LA24_0=='\'') ) {s = 41;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 42;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||(LA24_0>='#' && LA24_0<='&')||LA24_0=='?'||LA24_0=='\\'||LA24_0=='^'||LA24_0=='`'||(LA24_0>='~' && LA24_0<='\uFFFF')) ) {s = 43;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_41 = input.LA(1);

                        s = -1;
                        if ( ((LA24_41>='\u0000' && LA24_41<='\uFFFF')) ) {s = 104;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}