package de.uni_hildesheim.sse.vil.templatelang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uni_hildesheim.sse.vil.templatelang.services.TemplateLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTemplateLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NUMBER", "RULE_STRING", "RULE_VERSION", "RULE_ID", "RULE_EXPONENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'template'", "'('", "')'", "'extends'", "'{'", "'}'", "'@indent'", "','", "'='", "'@format'", "'protected'", "'def'", "';'", "'if'", "'else'", "'print'", "'|'", "'switch'", "'default'", "':'", "'for'", "'multiSelect'", "'case'", "':='", "'generic-multiSelect'", "'extension'", "'.'", "'const'", "'typedef'", "'@advice'", "'with'", "'version'", "'import'", "'and'", "'or'", "'xor'", "'=='", "'<>'", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'not'", "'!'", "'super'", "'new'", "'->'", "'['", "']'", "'::'", "'true'", "'false'", "'null'", "'setOf'", "'sequenceOf'", "'mapOf'", "'callOf'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_VERSION=6;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=4;
    public static final int RULE_EXPONENT=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalTemplateLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTemplateLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTemplateLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTemplateLang.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private TemplateLangGrammarAccess grammarAccess;
     	
        public InternalTemplateLangParser(TokenStream input, TemplateLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LanguageUnit";	
       	}
       	
       	@Override
       	protected TemplateLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLanguageUnit"
    // InternalTemplateLang.g:73:1: entryRuleLanguageUnit returns [EObject current=null] : iv_ruleLanguageUnit= ruleLanguageUnit EOF ;
    public final EObject entryRuleLanguageUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageUnit = null;


        try {
            // InternalTemplateLang.g:74:2: (iv_ruleLanguageUnit= ruleLanguageUnit EOF )
            // InternalTemplateLang.g:75:2: iv_ruleLanguageUnit= ruleLanguageUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageUnitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLanguageUnit=ruleLanguageUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageUnit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageUnit"


    // $ANTLR start "ruleLanguageUnit"
    // InternalTemplateLang.g:82:1: ruleLanguageUnit returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_javaExts_1_0= ruleExtension ) )* ( (lv_advices_2_0= ruleAdvice ) )* ( (lv_indent_3_0= ruleIndentationHint ) )? ( (lv_formatting_4_0= ruleFormattingHint ) )? otherlv_5= 'template' ( (lv_name_6_0= ruleIdentifier ) ) otherlv_7= '(' ( (lv_param_8_0= ruleParameterList ) )? otherlv_9= ')' (otherlv_10= 'extends' ( (lv_ext_11_0= ruleIdentifier ) ) )? otherlv_12= '{' ( (lv_version_13_0= ruleVersionStmt ) )? ( (lv_typeDefs_14_0= ruleTypeDef ) )* ( (lv_vars_15_0= ruleVariableDeclaration ) )* ( (lv_defs_16_0= ruleVilDef ) )* otherlv_17= '}' ) ;
    public final EObject ruleLanguageUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_17=null;
        EObject lv_imports_0_0 = null;

        EObject lv_javaExts_1_0 = null;

        EObject lv_advices_2_0 = null;

        EObject lv_indent_3_0 = null;

        EObject lv_formatting_4_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_param_8_0 = null;

        AntlrDatatypeRuleToken lv_ext_11_0 = null;

        EObject lv_version_13_0 = null;

        EObject lv_typeDefs_14_0 = null;

        EObject lv_vars_15_0 = null;

        EObject lv_defs_16_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:85:28: ( ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_javaExts_1_0= ruleExtension ) )* ( (lv_advices_2_0= ruleAdvice ) )* ( (lv_indent_3_0= ruleIndentationHint ) )? ( (lv_formatting_4_0= ruleFormattingHint ) )? otherlv_5= 'template' ( (lv_name_6_0= ruleIdentifier ) ) otherlv_7= '(' ( (lv_param_8_0= ruleParameterList ) )? otherlv_9= ')' (otherlv_10= 'extends' ( (lv_ext_11_0= ruleIdentifier ) ) )? otherlv_12= '{' ( (lv_version_13_0= ruleVersionStmt ) )? ( (lv_typeDefs_14_0= ruleTypeDef ) )* ( (lv_vars_15_0= ruleVariableDeclaration ) )* ( (lv_defs_16_0= ruleVilDef ) )* otherlv_17= '}' ) )
            // InternalTemplateLang.g:86:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_javaExts_1_0= ruleExtension ) )* ( (lv_advices_2_0= ruleAdvice ) )* ( (lv_indent_3_0= ruleIndentationHint ) )? ( (lv_formatting_4_0= ruleFormattingHint ) )? otherlv_5= 'template' ( (lv_name_6_0= ruleIdentifier ) ) otherlv_7= '(' ( (lv_param_8_0= ruleParameterList ) )? otherlv_9= ')' (otherlv_10= 'extends' ( (lv_ext_11_0= ruleIdentifier ) ) )? otherlv_12= '{' ( (lv_version_13_0= ruleVersionStmt ) )? ( (lv_typeDefs_14_0= ruleTypeDef ) )* ( (lv_vars_15_0= ruleVariableDeclaration ) )* ( (lv_defs_16_0= ruleVilDef ) )* otherlv_17= '}' )
            {
            // InternalTemplateLang.g:86:1: ( ( (lv_imports_0_0= ruleImport ) )* ( (lv_javaExts_1_0= ruleExtension ) )* ( (lv_advices_2_0= ruleAdvice ) )* ( (lv_indent_3_0= ruleIndentationHint ) )? ( (lv_formatting_4_0= ruleFormattingHint ) )? otherlv_5= 'template' ( (lv_name_6_0= ruleIdentifier ) ) otherlv_7= '(' ( (lv_param_8_0= ruleParameterList ) )? otherlv_9= ')' (otherlv_10= 'extends' ( (lv_ext_11_0= ruleIdentifier ) ) )? otherlv_12= '{' ( (lv_version_13_0= ruleVersionStmt ) )? ( (lv_typeDefs_14_0= ruleTypeDef ) )* ( (lv_vars_15_0= ruleVariableDeclaration ) )* ( (lv_defs_16_0= ruleVilDef ) )* otherlv_17= '}' )
            // InternalTemplateLang.g:86:2: ( (lv_imports_0_0= ruleImport ) )* ( (lv_javaExts_1_0= ruleExtension ) )* ( (lv_advices_2_0= ruleAdvice ) )* ( (lv_indent_3_0= ruleIndentationHint ) )? ( (lv_formatting_4_0= ruleFormattingHint ) )? otherlv_5= 'template' ( (lv_name_6_0= ruleIdentifier ) ) otherlv_7= '(' ( (lv_param_8_0= ruleParameterList ) )? otherlv_9= ')' (otherlv_10= 'extends' ( (lv_ext_11_0= ruleIdentifier ) ) )? otherlv_12= '{' ( (lv_version_13_0= ruleVersionStmt ) )? ( (lv_typeDefs_14_0= ruleTypeDef ) )* ( (lv_vars_15_0= ruleVariableDeclaration ) )* ( (lv_defs_16_0= ruleVilDef ) )* otherlv_17= '}'
            {
            // InternalTemplateLang.g:86:2: ( (lv_imports_0_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==45) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalTemplateLang.g:87:1: (lv_imports_0_0= ruleImport )
            	    {
            	    // InternalTemplateLang.g:87:1: (lv_imports_0_0= ruleImport )
            	    // InternalTemplateLang.g:88:3: lv_imports_0_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getImportsImportParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_0_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Import");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalTemplateLang.g:104:3: ( (lv_javaExts_1_0= ruleExtension ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==38) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalTemplateLang.g:105:1: (lv_javaExts_1_0= ruleExtension )
            	    {
            	    // InternalTemplateLang.g:105:1: (lv_javaExts_1_0= ruleExtension )
            	    // InternalTemplateLang.g:106:3: lv_javaExts_1_0= ruleExtension
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getJavaExtsExtensionParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_javaExts_1_0=ruleExtension();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"javaExts",
            	              		lv_javaExts_1_0, 
            	              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Extension");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalTemplateLang.g:122:3: ( (lv_advices_2_0= ruleAdvice ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==42) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalTemplateLang.g:123:1: (lv_advices_2_0= ruleAdvice )
            	    {
            	    // InternalTemplateLang.g:123:1: (lv_advices_2_0= ruleAdvice )
            	    // InternalTemplateLang.g:124:3: lv_advices_2_0= ruleAdvice
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getAdvicesAdviceParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_advices_2_0=ruleAdvice();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"advices",
            	              		lv_advices_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Advice");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalTemplateLang.g:140:3: ( (lv_indent_3_0= ruleIndentationHint ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalTemplateLang.g:141:1: (lv_indent_3_0= ruleIndentationHint )
                    {
                    // InternalTemplateLang.g:141:1: (lv_indent_3_0= ruleIndentationHint )
                    // InternalTemplateLang.g:142:3: lv_indent_3_0= ruleIndentationHint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getIndentIndentationHintParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_6);
                    lv_indent_3_0=ruleIndentationHint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"indent",
                              		lv_indent_3_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.IndentationHint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:158:3: ( (lv_formatting_4_0= ruleFormattingHint ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalTemplateLang.g:159:1: (lv_formatting_4_0= ruleFormattingHint )
                    {
                    // InternalTemplateLang.g:159:1: (lv_formatting_4_0= ruleFormattingHint )
                    // InternalTemplateLang.g:160:3: lv_formatting_4_0= ruleFormattingHint
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getFormattingFormattingHintParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_7);
                    lv_formatting_4_0=ruleFormattingHint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"formatting",
                              		lv_formatting_4_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.FormattingHint");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLanguageUnitAccess().getTemplateKeyword_5());
                  
            }
            // InternalTemplateLang.g:180:1: ( (lv_name_6_0= ruleIdentifier ) )
            // InternalTemplateLang.g:181:1: (lv_name_6_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:181:1: (lv_name_6_0= ruleIdentifier )
            // InternalTemplateLang.g:182:3: lv_name_6_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getNameIdentifierParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_6_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getLanguageUnitAccess().getLeftParenthesisKeyword_7());
                  
            }
            // InternalTemplateLang.g:202:1: ( (lv_param_8_0= ruleParameterList ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_VERSION && LA6_0<=RULE_EXPONENT)||LA6_0==44||(LA6_0>=71 && LA6_0<=74)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTemplateLang.g:203:1: (lv_param_8_0= ruleParameterList )
                    {
                    // InternalTemplateLang.g:203:1: (lv_param_8_0= ruleParameterList )
                    // InternalTemplateLang.g:204:3: lv_param_8_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getParamParameterListParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_param_8_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_8_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ParameterList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getLanguageUnitAccess().getRightParenthesisKeyword_9());
                  
            }
            // InternalTemplateLang.g:224:1: (otherlv_10= 'extends' ( (lv_ext_11_0= ruleIdentifier ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTemplateLang.g:224:3: otherlv_10= 'extends' ( (lv_ext_11_0= ruleIdentifier ) )
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getLanguageUnitAccess().getExtendsKeyword_10_0());
                          
                    }
                    // InternalTemplateLang.g:228:1: ( (lv_ext_11_0= ruleIdentifier ) )
                    // InternalTemplateLang.g:229:1: (lv_ext_11_0= ruleIdentifier )
                    {
                    // InternalTemplateLang.g:229:1: (lv_ext_11_0= ruleIdentifier )
                    // InternalTemplateLang.g:230:3: lv_ext_11_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getExtIdentifierParserRuleCall_10_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
                    lv_ext_11_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"ext",
                              		lv_ext_11_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getLanguageUnitAccess().getLeftCurlyBracketKeyword_11());
                  
            }
            // InternalTemplateLang.g:250:1: ( (lv_version_13_0= ruleVersionStmt ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==44) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_VERSION) ) {
                    int LA8_3 = input.LA(3);

                    if ( (LA8_3==25) ) {
                        int LA8_4 = input.LA(4);

                        if ( (synpred8_InternalTemplateLang()) ) {
                            alt8=1;
                        }
                    }
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalTemplateLang.g:251:1: (lv_version_13_0= ruleVersionStmt )
                    {
                    // InternalTemplateLang.g:251:1: (lv_version_13_0= ruleVersionStmt )
                    // InternalTemplateLang.g:252:3: lv_version_13_0= ruleVersionStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getVersionVersionStmtParserRuleCall_12_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_14);
                    lv_version_13_0=ruleVersionStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"version",
                              		lv_version_13_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VersionStmt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:268:3: ( (lv_typeDefs_14_0= ruleTypeDef ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==41) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTemplateLang.g:269:1: (lv_typeDefs_14_0= ruleTypeDef )
            	    {
            	    // InternalTemplateLang.g:269:1: (lv_typeDefs_14_0= ruleTypeDef )
            	    // InternalTemplateLang.g:270:3: lv_typeDefs_14_0= ruleTypeDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getTypeDefsTypeDefParserRuleCall_13_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_14);
            	    lv_typeDefs_14_0=ruleTypeDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"typeDefs",
            	              		lv_typeDefs_14_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.TypeDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // InternalTemplateLang.g:286:3: ( (lv_vars_15_0= ruleVariableDeclaration ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_VERSION && LA10_0<=RULE_EXPONENT)||LA10_0==40||LA10_0==44||(LA10_0>=71 && LA10_0<=74)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTemplateLang.g:287:1: (lv_vars_15_0= ruleVariableDeclaration )
            	    {
            	    // InternalTemplateLang.g:287:1: (lv_vars_15_0= ruleVariableDeclaration )
            	    // InternalTemplateLang.g:288:3: lv_vars_15_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getVarsVariableDeclarationParserRuleCall_14_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_15);
            	    lv_vars_15_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"vars",
            	              		lv_vars_15_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalTemplateLang.g:304:3: ( (lv_defs_16_0= ruleVilDef ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=23 && LA11_0<=24)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTemplateLang.g:305:1: (lv_defs_16_0= ruleVilDef )
            	    {
            	    // InternalTemplateLang.g:305:1: (lv_defs_16_0= ruleVilDef )
            	    // InternalTemplateLang.g:306:3: lv_defs_16_0= ruleVilDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getDefsVilDefParserRuleCall_15_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_defs_16_0=ruleVilDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"defs",
            	              		lv_defs_16_0, 
            	              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.VilDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_17=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getLanguageUnitAccess().getRightCurlyBracketKeyword_16());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageUnit"


    // $ANTLR start "entryRuleIndentationHint"
    // InternalTemplateLang.g:334:1: entryRuleIndentationHint returns [EObject current=null] : iv_ruleIndentationHint= ruleIndentationHint EOF ;
    public final EObject entryRuleIndentationHint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndentationHint = null;


        try {
            // InternalTemplateLang.g:335:2: (iv_ruleIndentationHint= ruleIndentationHint EOF )
            // InternalTemplateLang.g:336:2: iv_ruleIndentationHint= ruleIndentationHint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndentationHintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndentationHint=ruleIndentationHint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndentationHint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndentationHint"


    // $ANTLR start "ruleIndentationHint"
    // InternalTemplateLang.g:343:1: ruleIndentationHint returns [EObject current=null] : (otherlv_0= '@indent' otherlv_1= '(' ( (lv_parts_2_0= ruleIndentationHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleIndentationHintPart ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleIndentationHint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parts_2_0 = null;

        EObject lv_parts_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:346:28: ( (otherlv_0= '@indent' otherlv_1= '(' ( (lv_parts_2_0= ruleIndentationHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleIndentationHintPart ) ) )* otherlv_5= ')' ) )
            // InternalTemplateLang.g:347:1: (otherlv_0= '@indent' otherlv_1= '(' ( (lv_parts_2_0= ruleIndentationHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleIndentationHintPart ) ) )* otherlv_5= ')' )
            {
            // InternalTemplateLang.g:347:1: (otherlv_0= '@indent' otherlv_1= '(' ( (lv_parts_2_0= ruleIndentationHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleIndentationHintPart ) ) )* otherlv_5= ')' )
            // InternalTemplateLang.g:347:3: otherlv_0= '@indent' otherlv_1= '(' ( (lv_parts_2_0= ruleIndentationHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleIndentationHintPart ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIndentationHintAccess().getIndentKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIndentationHintAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalTemplateLang.g:355:1: ( (lv_parts_2_0= ruleIndentationHintPart ) )
            // InternalTemplateLang.g:356:1: (lv_parts_2_0= ruleIndentationHintPart )
            {
            // InternalTemplateLang.g:356:1: (lv_parts_2_0= ruleIndentationHintPart )
            // InternalTemplateLang.g:357:3: lv_parts_2_0= ruleIndentationHintPart
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIndentationHintAccess().getPartsIndentationHintPartParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_parts_2_0=ruleIndentationHintPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIndentationHintRule());
              	        }
                     		add(
                     			current, 
                     			"parts",
                      		lv_parts_2_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.IndentationHintPart");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:373:2: (otherlv_3= ',' ( (lv_parts_4_0= ruleIndentationHintPart ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalTemplateLang.g:373:4: otherlv_3= ',' ( (lv_parts_4_0= ruleIndentationHintPart ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getIndentationHintAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalTemplateLang.g:377:1: ( (lv_parts_4_0= ruleIndentationHintPart ) )
            	    // InternalTemplateLang.g:378:1: (lv_parts_4_0= ruleIndentationHintPart )
            	    {
            	    // InternalTemplateLang.g:378:1: (lv_parts_4_0= ruleIndentationHintPart )
            	    // InternalTemplateLang.g:379:3: lv_parts_4_0= ruleIndentationHintPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getIndentationHintAccess().getPartsIndentationHintPartParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_parts_4_0=ruleIndentationHintPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getIndentationHintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parts",
            	              		lv_parts_4_0, 
            	              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.IndentationHintPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIndentationHintAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndentationHint"


    // $ANTLR start "entryRuleIndentationHintPart"
    // InternalTemplateLang.g:407:1: entryRuleIndentationHintPart returns [EObject current=null] : iv_ruleIndentationHintPart= ruleIndentationHintPart EOF ;
    public final EObject entryRuleIndentationHintPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndentationHintPart = null;


        try {
            // InternalTemplateLang.g:408:2: (iv_ruleIndentationHintPart= ruleIndentationHintPart EOF )
            // InternalTemplateLang.g:409:2: iv_ruleIndentationHintPart= ruleIndentationHintPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIndentationHintPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIndentationHintPart=ruleIndentationHintPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIndentationHintPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIndentationHintPart"


    // $ANTLR start "ruleIndentationHintPart"
    // InternalTemplateLang.g:416:1: ruleIndentationHintPart returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_NUMBER ) ) ) ;
    public final EObject ruleIndentationHintPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:419:28: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_NUMBER ) ) ) )
            // InternalTemplateLang.g:420:1: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_NUMBER ) ) )
            {
            // InternalTemplateLang.g:420:1: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_NUMBER ) ) )
            // InternalTemplateLang.g:420:2: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_NUMBER ) )
            {
            // InternalTemplateLang.g:420:2: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalTemplateLang.g:421:1: (lv_name_0_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:421:1: (lv_name_0_0= ruleIdentifier )
            // InternalTemplateLang.g:422:3: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIndentationHintPartAccess().getNameIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_18);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIndentationHintPartRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIndentationHintPartAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalTemplateLang.g:442:1: ( (lv_value_2_0= RULE_NUMBER ) )
            // InternalTemplateLang.g:443:1: (lv_value_2_0= RULE_NUMBER )
            {
            // InternalTemplateLang.g:443:1: (lv_value_2_0= RULE_NUMBER )
            // InternalTemplateLang.g:444:3: lv_value_2_0= RULE_NUMBER
            {
            lv_value_2_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getIndentationHintPartAccess().getValueNUMBERTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getIndentationHintPartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.NUMBER");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIndentationHintPart"


    // $ANTLR start "entryRuleFormattingHint"
    // InternalTemplateLang.g:468:1: entryRuleFormattingHint returns [EObject current=null] : iv_ruleFormattingHint= ruleFormattingHint EOF ;
    public final EObject entryRuleFormattingHint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormattingHint = null;


        try {
            // InternalTemplateLang.g:469:2: (iv_ruleFormattingHint= ruleFormattingHint EOF )
            // InternalTemplateLang.g:470:2: iv_ruleFormattingHint= ruleFormattingHint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormattingHintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormattingHint=ruleFormattingHint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormattingHint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormattingHint"


    // $ANTLR start "ruleFormattingHint"
    // InternalTemplateLang.g:477:1: ruleFormattingHint returns [EObject current=null] : (otherlv_0= '@format' otherlv_1= '(' ( (lv_parts_2_0= ruleFormattingHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleFormattingHintPart ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleFormattingHint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parts_2_0 = null;

        EObject lv_parts_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:480:28: ( (otherlv_0= '@format' otherlv_1= '(' ( (lv_parts_2_0= ruleFormattingHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleFormattingHintPart ) ) )* otherlv_5= ')' ) )
            // InternalTemplateLang.g:481:1: (otherlv_0= '@format' otherlv_1= '(' ( (lv_parts_2_0= ruleFormattingHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleFormattingHintPart ) ) )* otherlv_5= ')' )
            {
            // InternalTemplateLang.g:481:1: (otherlv_0= '@format' otherlv_1= '(' ( (lv_parts_2_0= ruleFormattingHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleFormattingHintPart ) ) )* otherlv_5= ')' )
            // InternalTemplateLang.g:481:3: otherlv_0= '@format' otherlv_1= '(' ( (lv_parts_2_0= ruleFormattingHintPart ) ) (otherlv_3= ',' ( (lv_parts_4_0= ruleFormattingHintPart ) ) )* otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getFormattingHintAccess().getFormatKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFormattingHintAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalTemplateLang.g:489:1: ( (lv_parts_2_0= ruleFormattingHintPart ) )
            // InternalTemplateLang.g:490:1: (lv_parts_2_0= ruleFormattingHintPart )
            {
            // InternalTemplateLang.g:490:1: (lv_parts_2_0= ruleFormattingHintPart )
            // InternalTemplateLang.g:491:3: lv_parts_2_0= ruleFormattingHintPart
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormattingHintAccess().getPartsFormattingHintPartParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_parts_2_0=ruleFormattingHintPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormattingHintRule());
              	        }
                     		add(
                     			current, 
                     			"parts",
                      		lv_parts_2_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.FormattingHintPart");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:507:2: (otherlv_3= ',' ( (lv_parts_4_0= ruleFormattingHintPart ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTemplateLang.g:507:4: otherlv_3= ',' ( (lv_parts_4_0= ruleFormattingHintPart ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getFormattingHintAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalTemplateLang.g:511:1: ( (lv_parts_4_0= ruleFormattingHintPart ) )
            	    // InternalTemplateLang.g:512:1: (lv_parts_4_0= ruleFormattingHintPart )
            	    {
            	    // InternalTemplateLang.g:512:1: (lv_parts_4_0= ruleFormattingHintPart )
            	    // InternalTemplateLang.g:513:3: lv_parts_4_0= ruleFormattingHintPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormattingHintAccess().getPartsFormattingHintPartParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_parts_4_0=ruleFormattingHintPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFormattingHintRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parts",
            	              		lv_parts_4_0, 
            	              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.FormattingHintPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFormattingHintAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormattingHint"


    // $ANTLR start "entryRuleFormattingHintPart"
    // InternalTemplateLang.g:541:1: entryRuleFormattingHintPart returns [EObject current=null] : iv_ruleFormattingHintPart= ruleFormattingHintPart EOF ;
    public final EObject entryRuleFormattingHintPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormattingHintPart = null;


        try {
            // InternalTemplateLang.g:542:2: (iv_ruleFormattingHintPart= ruleFormattingHintPart EOF )
            // InternalTemplateLang.g:543:2: iv_ruleFormattingHintPart= ruleFormattingHintPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormattingHintPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFormattingHintPart=ruleFormattingHintPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormattingHintPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormattingHintPart"


    // $ANTLR start "ruleFormattingHintPart"
    // InternalTemplateLang.g:550:1: ruleFormattingHintPart returns [EObject current=null] : ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleFormattingHintPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:553:28: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // InternalTemplateLang.g:554:1: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // InternalTemplateLang.g:554:1: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // InternalTemplateLang.g:554:2: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // InternalTemplateLang.g:554:2: ( (lv_name_0_0= ruleIdentifier ) )
            // InternalTemplateLang.g:555:1: (lv_name_0_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:555:1: (lv_name_0_0= ruleIdentifier )
            // InternalTemplateLang.g:556:3: lv_name_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormattingHintPartAccess().getNameIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_18);
            lv_name_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormattingHintPartRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFormattingHintPartAccess().getEqualsSignKeyword_1());
                  
            }
            // InternalTemplateLang.g:576:1: ( (lv_value_2_0= RULE_STRING ) )
            // InternalTemplateLang.g:577:1: (lv_value_2_0= RULE_STRING )
            {
            // InternalTemplateLang.g:577:1: (lv_value_2_0= RULE_STRING )
            // InternalTemplateLang.g:578:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getFormattingHintPartAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormattingHintPartRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.STRING");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormattingHintPart"


    // $ANTLR start "entryRuleVilDef"
    // InternalTemplateLang.g:602:1: entryRuleVilDef returns [EObject current=null] : iv_ruleVilDef= ruleVilDef EOF ;
    public final EObject entryRuleVilDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVilDef = null;


        try {
            // InternalTemplateLang.g:603:2: (iv_ruleVilDef= ruleVilDef EOF )
            // InternalTemplateLang.g:604:2: iv_ruleVilDef= ruleVilDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVilDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVilDef=ruleVilDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVilDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVilDef"


    // $ANTLR start "ruleVilDef"
    // InternalTemplateLang.g:611:1: ruleVilDef returns [EObject current=null] : ( ( (lv_protected_0_0= 'protected' ) )? otherlv_1= 'def' ( (lv_type_2_0= ruleType ) )? ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_param_5_0= ruleParameterList ) )? otherlv_6= ')' ( (lv_stmts_7_0= ruleStmtBlock ) ) (otherlv_8= ';' )? ) ;
    public final EObject ruleVilDef() throws RecognitionException {
        EObject current = null;

        Token lv_protected_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_param_5_0 = null;

        EObject lv_stmts_7_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:614:28: ( ( ( (lv_protected_0_0= 'protected' ) )? otherlv_1= 'def' ( (lv_type_2_0= ruleType ) )? ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_param_5_0= ruleParameterList ) )? otherlv_6= ')' ( (lv_stmts_7_0= ruleStmtBlock ) ) (otherlv_8= ';' )? ) )
            // InternalTemplateLang.g:615:1: ( ( (lv_protected_0_0= 'protected' ) )? otherlv_1= 'def' ( (lv_type_2_0= ruleType ) )? ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_param_5_0= ruleParameterList ) )? otherlv_6= ')' ( (lv_stmts_7_0= ruleStmtBlock ) ) (otherlv_8= ';' )? )
            {
            // InternalTemplateLang.g:615:1: ( ( (lv_protected_0_0= 'protected' ) )? otherlv_1= 'def' ( (lv_type_2_0= ruleType ) )? ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_param_5_0= ruleParameterList ) )? otherlv_6= ')' ( (lv_stmts_7_0= ruleStmtBlock ) ) (otherlv_8= ';' )? )
            // InternalTemplateLang.g:615:2: ( (lv_protected_0_0= 'protected' ) )? otherlv_1= 'def' ( (lv_type_2_0= ruleType ) )? ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_param_5_0= ruleParameterList ) )? otherlv_6= ')' ( (lv_stmts_7_0= ruleStmtBlock ) ) (otherlv_8= ';' )?
            {
            // InternalTemplateLang.g:615:2: ( (lv_protected_0_0= 'protected' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTemplateLang.g:616:1: (lv_protected_0_0= 'protected' )
                    {
                    // InternalTemplateLang.g:616:1: (lv_protected_0_0= 'protected' )
                    // InternalTemplateLang.g:617:3: lv_protected_0_0= 'protected'
                    {
                    lv_protected_0_0=(Token)match(input,23,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_protected_0_0, grammarAccess.getVilDefAccess().getProtectedProtectedKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVilDefRule());
                      	        }
                             		setWithLastConsumed(current, "protected", lv_protected_0_0, "protected");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,24,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVilDefAccess().getDefKeyword_1());
                  
            }
            // InternalTemplateLang.g:634:1: ( (lv_type_2_0= ruleType ) )?
            int alt15=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>=RULE_VERSION && LA15_1<=RULE_EXPONENT)||LA15_1==44||LA15_1==67) ) {
                        alt15=1;
                    }
                    }
                    break;
                case RULE_VERSION:
                    {
                    int LA15_2 = input.LA(2);

                    if ( ((LA15_2>=RULE_VERSION && LA15_2<=RULE_EXPONENT)||LA15_2==44||LA15_2==67) ) {
                        alt15=1;
                    }
                    }
                    break;
                case RULE_EXPONENT:
                    {
                    int LA15_3 = input.LA(2);

                    if ( ((LA15_3>=RULE_VERSION && LA15_3<=RULE_EXPONENT)||LA15_3==44||LA15_3==67) ) {
                        alt15=1;
                    }
                    }
                    break;
                case 44:
                    {
                    int LA15_4 = input.LA(2);

                    if ( ((LA15_4>=RULE_VERSION && LA15_4<=RULE_EXPONENT)||LA15_4==44||LA15_4==67) ) {
                        alt15=1;
                    }
                    }
                    break;
                case 71:
                case 72:
                case 73:
                case 74:
                    {
                    alt15=1;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // InternalTemplateLang.g:635:1: (lv_type_2_0= ruleType )
                    {
                    // InternalTemplateLang.g:635:1: (lv_type_2_0= ruleType )
                    // InternalTemplateLang.g:636:3: lv_type_2_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVilDefAccess().getTypeTypeParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
                    lv_type_2_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVilDefRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:652:3: ( (lv_id_3_0= ruleIdentifier ) )
            // InternalTemplateLang.g:653:1: (lv_id_3_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:653:1: (lv_id_3_0= ruleIdentifier )
            // InternalTemplateLang.g:654:3: lv_id_3_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVilDefAccess().getIdIdentifierParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
            lv_id_3_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVilDefRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_3_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVilDefAccess().getLeftParenthesisKeyword_4());
                  
            }
            // InternalTemplateLang.g:674:1: ( (lv_param_5_0= ruleParameterList ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_VERSION && LA16_0<=RULE_EXPONENT)||LA16_0==44||(LA16_0>=71 && LA16_0<=74)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTemplateLang.g:675:1: (lv_param_5_0= ruleParameterList )
                    {
                    // InternalTemplateLang.g:675:1: (lv_param_5_0= ruleParameterList )
                    // InternalTemplateLang.g:676:3: lv_param_5_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVilDefAccess().getParamParameterListParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_param_5_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVilDefRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_5_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ParameterList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getVilDefAccess().getRightParenthesisKeyword_6());
                  
            }
            // InternalTemplateLang.g:696:1: ( (lv_stmts_7_0= ruleStmtBlock ) )
            // InternalTemplateLang.g:697:1: (lv_stmts_7_0= ruleStmtBlock )
            {
            // InternalTemplateLang.g:697:1: (lv_stmts_7_0= ruleStmtBlock )
            // InternalTemplateLang.g:698:3: lv_stmts_7_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVilDefAccess().getStmtsStmtBlockParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_23);
            lv_stmts_7_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVilDefRule());
              	        }
                     		set(
                     			current, 
                     			"stmts",
                      		lv_stmts_7_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.StmtBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:714:2: (otherlv_8= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTemplateLang.g:714:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getVilDefAccess().getSemicolonKeyword_8());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVilDef"


    // $ANTLR start "entryRuleStmtBlock"
    // InternalTemplateLang.g:726:1: entryRuleStmtBlock returns [EObject current=null] : iv_ruleStmtBlock= ruleStmtBlock EOF ;
    public final EObject entryRuleStmtBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmtBlock = null;


        try {
            // InternalTemplateLang.g:727:2: (iv_ruleStmtBlock= ruleStmtBlock EOF )
            // InternalTemplateLang.g:728:2: iv_ruleStmtBlock= ruleStmtBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmtBlock=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmtBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmtBlock"


    // $ANTLR start "ruleStmtBlock"
    // InternalTemplateLang.g:735:1: ruleStmtBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}' ) ;
    public final EObject ruleStmtBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_stmts_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:738:28: ( ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}' ) )
            // InternalTemplateLang.g:739:1: ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}' )
            {
            // InternalTemplateLang.g:739:1: ( () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}' )
            // InternalTemplateLang.g:739:2: () otherlv_1= '{' ( (lv_stmts_2_0= ruleStmt ) )* otherlv_3= '}'
            {
            // InternalTemplateLang.g:739:2: ()
            // InternalTemplateLang.g:740:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getStmtBlockAccess().getStmtBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getStmtBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalTemplateLang.g:752:1: ( (lv_stmts_2_0= ruleStmt ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_NUMBER && LA18_0<=RULE_EXPONENT)||LA18_0==14||LA18_0==17||LA18_0==26||LA18_0==28||LA18_0==30||(LA18_0>=33 && LA18_0<=34)||LA18_0==40||LA18_0==44||LA18_0==57||(LA18_0>=60 && LA18_0<=63)||(LA18_0>=68 && LA18_0<=74)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalTemplateLang.g:753:1: (lv_stmts_2_0= ruleStmt )
            	    {
            	    // InternalTemplateLang.g:753:1: (lv_stmts_2_0= ruleStmt )
            	    // InternalTemplateLang.g:754:3: lv_stmts_2_0= ruleStmt
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStmtBlockAccess().getStmtsStmtParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_stmts_2_0=ruleStmt();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStmtBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"stmts",
            	              		lv_stmts_2_0, 
            	              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Stmt");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getStmtBlockAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmtBlock"


    // $ANTLR start "entryRuleStmt"
    // InternalTemplateLang.g:782:1: entryRuleStmt returns [EObject current=null] : iv_ruleStmt= ruleStmt EOF ;
    public final EObject entryRuleStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStmt = null;


        try {
            // InternalTemplateLang.g:783:2: (iv_ruleStmt= ruleStmt EOF )
            // InternalTemplateLang.g:784:2: iv_ruleStmt= ruleStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStmt=ruleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStmt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStmt"


    // $ANTLR start "ruleStmt"
    // InternalTemplateLang.g:791:1: ruleStmt returns [EObject current=null] : ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_alt_1_0= ruleAlternative ) ) | ( (lv_switch_2_0= ruleSwitch ) ) | ( (lv_block_3_0= ruleStmtBlock ) ) | ( (lv_multi_4_0= rulemultiselect ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exprStmt_6_0= ruleExpressionStatement ) ) | ( (lv_ctn_7_0= ruleContent ) ) ) ;
    public final EObject ruleStmt() throws RecognitionException {
        EObject current = null;

        EObject lv_var_0_0 = null;

        EObject lv_alt_1_0 = null;

        EObject lv_switch_2_0 = null;

        EObject lv_block_3_0 = null;

        EObject lv_multi_4_0 = null;

        EObject lv_loop_5_0 = null;

        EObject lv_exprStmt_6_0 = null;

        EObject lv_ctn_7_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:794:28: ( ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_alt_1_0= ruleAlternative ) ) | ( (lv_switch_2_0= ruleSwitch ) ) | ( (lv_block_3_0= ruleStmtBlock ) ) | ( (lv_multi_4_0= rulemultiselect ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exprStmt_6_0= ruleExpressionStatement ) ) | ( (lv_ctn_7_0= ruleContent ) ) ) )
            // InternalTemplateLang.g:795:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_alt_1_0= ruleAlternative ) ) | ( (lv_switch_2_0= ruleSwitch ) ) | ( (lv_block_3_0= ruleStmtBlock ) ) | ( (lv_multi_4_0= rulemultiselect ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exprStmt_6_0= ruleExpressionStatement ) ) | ( (lv_ctn_7_0= ruleContent ) ) )
            {
            // InternalTemplateLang.g:795:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_alt_1_0= ruleAlternative ) ) | ( (lv_switch_2_0= ruleSwitch ) ) | ( (lv_block_3_0= ruleStmtBlock ) ) | ( (lv_multi_4_0= rulemultiselect ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exprStmt_6_0= ruleExpressionStatement ) ) | ( (lv_ctn_7_0= ruleContent ) ) )
            int alt19=8;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // InternalTemplateLang.g:795:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    {
                    // InternalTemplateLang.g:795:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
                    // InternalTemplateLang.g:796:1: (lv_var_0_0= ruleVariableDeclaration )
                    {
                    // InternalTemplateLang.g:796:1: (lv_var_0_0= ruleVariableDeclaration )
                    // InternalTemplateLang.g:797:3: lv_var_0_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtAccess().getVarVariableDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_var_0_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:814:6: ( (lv_alt_1_0= ruleAlternative ) )
                    {
                    // InternalTemplateLang.g:814:6: ( (lv_alt_1_0= ruleAlternative ) )
                    // InternalTemplateLang.g:815:1: (lv_alt_1_0= ruleAlternative )
                    {
                    // InternalTemplateLang.g:815:1: (lv_alt_1_0= ruleAlternative )
                    // InternalTemplateLang.g:816:3: lv_alt_1_0= ruleAlternative
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtAccess().getAltAlternativeParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_alt_1_0=ruleAlternative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"alt",
                              		lv_alt_1_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Alternative");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:833:6: ( (lv_switch_2_0= ruleSwitch ) )
                    {
                    // InternalTemplateLang.g:833:6: ( (lv_switch_2_0= ruleSwitch ) )
                    // InternalTemplateLang.g:834:1: (lv_switch_2_0= ruleSwitch )
                    {
                    // InternalTemplateLang.g:834:1: (lv_switch_2_0= ruleSwitch )
                    // InternalTemplateLang.g:835:3: lv_switch_2_0= ruleSwitch
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtAccess().getSwitchSwitchParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_switch_2_0=ruleSwitch();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"switch",
                              		lv_switch_2_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Switch");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTemplateLang.g:852:6: ( (lv_block_3_0= ruleStmtBlock ) )
                    {
                    // InternalTemplateLang.g:852:6: ( (lv_block_3_0= ruleStmtBlock ) )
                    // InternalTemplateLang.g:853:1: (lv_block_3_0= ruleStmtBlock )
                    {
                    // InternalTemplateLang.g:853:1: (lv_block_3_0= ruleStmtBlock )
                    // InternalTemplateLang.g:854:3: lv_block_3_0= ruleStmtBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtAccess().getBlockStmtBlockParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_3_0=ruleStmtBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"block",
                              		lv_block_3_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.StmtBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTemplateLang.g:871:6: ( (lv_multi_4_0= rulemultiselect ) )
                    {
                    // InternalTemplateLang.g:871:6: ( (lv_multi_4_0= rulemultiselect ) )
                    // InternalTemplateLang.g:872:1: (lv_multi_4_0= rulemultiselect )
                    {
                    // InternalTemplateLang.g:872:1: (lv_multi_4_0= rulemultiselect )
                    // InternalTemplateLang.g:873:3: lv_multi_4_0= rulemultiselect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtAccess().getMultiMultiselectParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_multi_4_0=rulemultiselect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"multi",
                              		lv_multi_4_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.multiselect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalTemplateLang.g:890:6: ( (lv_loop_5_0= ruleLoop ) )
                    {
                    // InternalTemplateLang.g:890:6: ( (lv_loop_5_0= ruleLoop ) )
                    // InternalTemplateLang.g:891:1: (lv_loop_5_0= ruleLoop )
                    {
                    // InternalTemplateLang.g:891:1: (lv_loop_5_0= ruleLoop )
                    // InternalTemplateLang.g:892:3: lv_loop_5_0= ruleLoop
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtAccess().getLoopLoopParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_loop_5_0=ruleLoop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"loop",
                              		lv_loop_5_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Loop");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalTemplateLang.g:909:6: ( (lv_exprStmt_6_0= ruleExpressionStatement ) )
                    {
                    // InternalTemplateLang.g:909:6: ( (lv_exprStmt_6_0= ruleExpressionStatement ) )
                    // InternalTemplateLang.g:910:1: (lv_exprStmt_6_0= ruleExpressionStatement )
                    {
                    // InternalTemplateLang.g:910:1: (lv_exprStmt_6_0= ruleExpressionStatement )
                    // InternalTemplateLang.g:911:3: lv_exprStmt_6_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtAccess().getExprStmtExpressionStatementParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprStmt_6_0=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"exprStmt",
                              		lv_exprStmt_6_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ExpressionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalTemplateLang.g:928:6: ( (lv_ctn_7_0= ruleContent ) )
                    {
                    // InternalTemplateLang.g:928:6: ( (lv_ctn_7_0= ruleContent ) )
                    // InternalTemplateLang.g:929:1: (lv_ctn_7_0= ruleContent )
                    {
                    // InternalTemplateLang.g:929:1: (lv_ctn_7_0= ruleContent )
                    // InternalTemplateLang.g:930:3: lv_ctn_7_0= ruleContent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStmtAccess().getCtnContentParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_ctn_7_0=ruleContent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStmtRule());
                      	        }
                             		set(
                             			current, 
                             			"ctn",
                              		lv_ctn_7_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Content");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStmt"


    // $ANTLR start "entryRuleAlternative"
    // InternalTemplateLang.g:954:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalTemplateLang.g:955:2: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalTemplateLang.g:956:2: iv_ruleAlternative= ruleAlternative EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternativeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternative; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalTemplateLang.g:963:1: ruleAlternative returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStmt ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) ) )? ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expr_2_0 = null;

        EObject lv_if_4_0 = null;

        EObject lv_else_6_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:966:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStmt ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) ) )? ) )
            // InternalTemplateLang.g:967:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStmt ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) ) )? )
            {
            // InternalTemplateLang.g:967:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStmt ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) ) )? )
            // InternalTemplateLang.g:967:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStmt ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlternativeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalTemplateLang.g:975:1: ( (lv_expr_2_0= ruleExpression ) )
            // InternalTemplateLang.g:976:1: (lv_expr_2_0= ruleExpression )
            {
            // InternalTemplateLang.g:976:1: (lv_expr_2_0= ruleExpression )
            // InternalTemplateLang.g:977:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlternativeAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlternativeAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalTemplateLang.g:997:1: ( (lv_if_4_0= ruleStmt ) )
            // InternalTemplateLang.g:998:1: (lv_if_4_0= ruleStmt )
            {
            // InternalTemplateLang.g:998:1: (lv_if_4_0= ruleStmt )
            // InternalTemplateLang.g:999:3: lv_if_4_0= ruleStmt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlternativeAccess().getIfStmtParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
            lv_if_4_0=ruleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
              	        }
                     		set(
                     			current, 
                     			"if",
                      		lv_if_4_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Stmt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1015:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                int LA20_1 = input.LA(2);

                if ( (synpred27_InternalTemplateLang()) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalTemplateLang.g:1015:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) )
                    {
                    // InternalTemplateLang.g:1015:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalTemplateLang.g:1015:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAlternativeAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // InternalTemplateLang.g:1020:2: ( (lv_else_6_0= ruleStmt ) )
                    // InternalTemplateLang.g:1021:1: (lv_else_6_0= ruleStmt )
                    {
                    // InternalTemplateLang.g:1021:1: (lv_else_6_0= ruleStmt )
                    // InternalTemplateLang.g:1022:3: lv_else_6_0= ruleStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAlternativeAccess().getElseStmtParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_6_0=ruleStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAlternativeRule());
                      	        }
                             		set(
                             			current, 
                             			"else",
                              		lv_else_6_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Stmt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleContent"
    // InternalTemplateLang.g:1046:1: entryRuleContent returns [EObject current=null] : iv_ruleContent= ruleContent EOF ;
    public final EObject entryRuleContent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContent = null;


        try {
            // InternalTemplateLang.g:1047:2: (iv_ruleContent= ruleContent EOF )
            // InternalTemplateLang.g:1048:2: iv_ruleContent= ruleContent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContent=ruleContent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContent"


    // $ANTLR start "ruleContent"
    // InternalTemplateLang.g:1055:1: ruleContent returns [EObject current=null] : ( ( (lv_print_0_0= 'print' ) )? ( (lv_ctn_1_0= RULE_STRING ) ) (otherlv_2= '|' ( (lv_indent_3_0= ruleExpression ) ) otherlv_4= ';' )? ) ;
    public final EObject ruleContent() throws RecognitionException {
        EObject current = null;

        Token lv_print_0_0=null;
        Token lv_ctn_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_indent_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1058:28: ( ( ( (lv_print_0_0= 'print' ) )? ( (lv_ctn_1_0= RULE_STRING ) ) (otherlv_2= '|' ( (lv_indent_3_0= ruleExpression ) ) otherlv_4= ';' )? ) )
            // InternalTemplateLang.g:1059:1: ( ( (lv_print_0_0= 'print' ) )? ( (lv_ctn_1_0= RULE_STRING ) ) (otherlv_2= '|' ( (lv_indent_3_0= ruleExpression ) ) otherlv_4= ';' )? )
            {
            // InternalTemplateLang.g:1059:1: ( ( (lv_print_0_0= 'print' ) )? ( (lv_ctn_1_0= RULE_STRING ) ) (otherlv_2= '|' ( (lv_indent_3_0= ruleExpression ) ) otherlv_4= ';' )? )
            // InternalTemplateLang.g:1059:2: ( (lv_print_0_0= 'print' ) )? ( (lv_ctn_1_0= RULE_STRING ) ) (otherlv_2= '|' ( (lv_indent_3_0= ruleExpression ) ) otherlv_4= ';' )?
            {
            // InternalTemplateLang.g:1059:2: ( (lv_print_0_0= 'print' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTemplateLang.g:1060:1: (lv_print_0_0= 'print' )
                    {
                    // InternalTemplateLang.g:1060:1: (lv_print_0_0= 'print' )
                    // InternalTemplateLang.g:1061:3: lv_print_0_0= 'print'
                    {
                    lv_print_0_0=(Token)match(input,28,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_print_0_0, grammarAccess.getContentAccess().getPrintPrintKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getContentRule());
                      	        }
                             		setWithLastConsumed(current, "print", lv_print_0_0, "print");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:1074:3: ( (lv_ctn_1_0= RULE_STRING ) )
            // InternalTemplateLang.g:1075:1: (lv_ctn_1_0= RULE_STRING )
            {
            // InternalTemplateLang.g:1075:1: (lv_ctn_1_0= RULE_STRING )
            // InternalTemplateLang.g:1076:3: lv_ctn_1_0= RULE_STRING
            {
            lv_ctn_1_0=(Token)match(input,RULE_STRING,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_ctn_1_0, grammarAccess.getContentAccess().getCtnSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getContentRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"ctn",
                      		lv_ctn_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.STRING");
              	    
            }

            }


            }

            // InternalTemplateLang.g:1092:2: (otherlv_2= '|' ( (lv_indent_3_0= ruleExpression ) ) otherlv_4= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTemplateLang.g:1092:4: otherlv_2= '|' ( (lv_indent_3_0= ruleExpression ) ) otherlv_4= ';'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getContentAccess().getVerticalLineKeyword_2_0());
                          
                    }
                    // InternalTemplateLang.g:1096:1: ( (lv_indent_3_0= ruleExpression ) )
                    // InternalTemplateLang.g:1097:1: (lv_indent_3_0= ruleExpression )
                    {
                    // InternalTemplateLang.g:1097:1: (lv_indent_3_0= ruleExpression )
                    // InternalTemplateLang.g:1098:3: lv_indent_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContentAccess().getIndentExpressionParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_indent_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContentRule());
                      	        }
                             		set(
                             			current, 
                             			"indent",
                              		lv_indent_3_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getContentAccess().getSemicolonKeyword_2_2());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContent"


    // $ANTLR start "entryRuleSwitch"
    // InternalTemplateLang.g:1126:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // InternalTemplateLang.g:1127:2: (iv_ruleSwitch= ruleSwitch EOF )
            // InternalTemplateLang.g:1128:2: iv_ruleSwitch= ruleSwitch EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitch; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // InternalTemplateLang.g:1135:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_parts_5_0= ruleSwitchPart ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) ) )* (otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) ) )? ) otherlv_12= '}' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_expr_2_0 = null;

        EObject lv_parts_5_0 = null;

        EObject lv_parts_7_0 = null;

        EObject lv_dflt_11_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1138:28: ( (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_parts_5_0= ruleSwitchPart ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) ) )* (otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) ) )? ) otherlv_12= '}' ) )
            // InternalTemplateLang.g:1139:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_parts_5_0= ruleSwitchPart ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) ) )* (otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) ) )? ) otherlv_12= '}' )
            {
            // InternalTemplateLang.g:1139:1: (otherlv_0= 'switch' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_parts_5_0= ruleSwitchPart ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) ) )* (otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) ) )? ) otherlv_12= '}' )
            // InternalTemplateLang.g:1139:3: otherlv_0= 'switch' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' otherlv_4= '{' ( ( (lv_parts_5_0= ruleSwitchPart ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) ) )* (otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) ) )? ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalTemplateLang.g:1147:1: ( (lv_expr_2_0= ruleExpression ) )
            // InternalTemplateLang.g:1148:1: (lv_expr_2_0= ruleExpression )
            {
            // InternalTemplateLang.g:1148:1: (lv_expr_2_0= ruleExpression )
            // InternalTemplateLang.g:1149:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,17,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // InternalTemplateLang.g:1173:1: ( ( (lv_parts_5_0= ruleSwitchPart ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) ) )* (otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) ) )? )
            // InternalTemplateLang.g:1173:2: ( (lv_parts_5_0= ruleSwitchPart ) ) (otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) ) )* (otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) ) )?
            {
            // InternalTemplateLang.g:1173:2: ( (lv_parts_5_0= ruleSwitchPart ) )
            // InternalTemplateLang.g:1174:1: (lv_parts_5_0= ruleSwitchPart )
            {
            // InternalTemplateLang.g:1174:1: (lv_parts_5_0= ruleSwitchPart )
            // InternalTemplateLang.g:1175:3: lv_parts_5_0= ruleSwitchPart
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchAccess().getPartsSwitchPartParserRuleCall_5_0_0()); 
              	    
            }
            pushFollow(FOLLOW_30);
            lv_parts_5_0=ruleSwitchPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchRule());
              	        }
                     		add(
                     			current, 
                     			"parts",
                      		lv_parts_5_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.SwitchPart");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1191:2: (otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==20) ) {
                    int LA23_1 = input.LA(2);

                    if ( ((LA23_1>=RULE_NUMBER && LA23_1<=RULE_EXPONENT)||LA23_1==14||LA23_1==17||LA23_1==44||LA23_1==57||(LA23_1>=60 && LA23_1<=63)||(LA23_1>=68 && LA23_1<=70)) ) {
                        alt23=1;
                    }


                }


                switch (alt23) {
            	case 1 :
            	    // InternalTemplateLang.g:1191:4: otherlv_6= ',' ( (lv_parts_7_0= ruleSwitchPart ) )
            	    {
            	    otherlv_6=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getSwitchAccess().getCommaKeyword_5_1_0());
            	          
            	    }
            	    // InternalTemplateLang.g:1195:1: ( (lv_parts_7_0= ruleSwitchPart ) )
            	    // InternalTemplateLang.g:1196:1: (lv_parts_7_0= ruleSwitchPart )
            	    {
            	    // InternalTemplateLang.g:1196:1: (lv_parts_7_0= ruleSwitchPart )
            	    // InternalTemplateLang.g:1197:3: lv_parts_7_0= ruleSwitchPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSwitchAccess().getPartsSwitchPartParserRuleCall_5_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_30);
            	    lv_parts_7_0=ruleSwitchPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"parts",
            	              		lv_parts_7_0, 
            	              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.SwitchPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            // InternalTemplateLang.g:1213:4: (otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==20) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTemplateLang.g:1213:6: otherlv_8= ',' otherlv_9= 'default' otherlv_10= ':' ( (lv_dflt_11_0= ruleExpression ) )
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getSwitchAccess().getCommaKeyword_5_2_0());
                          
                    }
                    otherlv_9=(Token)match(input,31,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getSwitchAccess().getDefaultKeyword_5_2_1());
                          
                    }
                    otherlv_10=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getSwitchAccess().getColonKeyword_5_2_2());
                          
                    }
                    // InternalTemplateLang.g:1225:1: ( (lv_dflt_11_0= ruleExpression ) )
                    // InternalTemplateLang.g:1226:1: (lv_dflt_11_0= ruleExpression )
                    {
                    // InternalTemplateLang.g:1226:1: (lv_dflt_11_0= ruleExpression )
                    // InternalTemplateLang.g:1227:3: lv_dflt_11_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSwitchAccess().getDfltExpressionParserRuleCall_5_2_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_33);
                    lv_dflt_11_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSwitchRule());
                      	        }
                             		set(
                             			current, 
                             			"dflt",
                              		lv_dflt_11_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSwitchAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleSwitchPart"
    // InternalTemplateLang.g:1255:1: entryRuleSwitchPart returns [EObject current=null] : iv_ruleSwitchPart= ruleSwitchPart EOF ;
    public final EObject entryRuleSwitchPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchPart = null;


        try {
            // InternalTemplateLang.g:1256:2: (iv_ruleSwitchPart= ruleSwitchPart EOF )
            // InternalTemplateLang.g:1257:2: iv_ruleSwitchPart= ruleSwitchPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSwitchPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSwitchPart=ruleSwitchPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSwitchPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchPart"


    // $ANTLR start "ruleSwitchPart"
    // InternalTemplateLang.g:1264:1: ruleSwitchPart returns [EObject current=null] : ( ( (lv_left_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_right_2_0= ruleExpression ) ) ) ;
    public final EObject ruleSwitchPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1267:28: ( ( ( (lv_left_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_right_2_0= ruleExpression ) ) ) )
            // InternalTemplateLang.g:1268:1: ( ( (lv_left_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_right_2_0= ruleExpression ) ) )
            {
            // InternalTemplateLang.g:1268:1: ( ( (lv_left_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_right_2_0= ruleExpression ) ) )
            // InternalTemplateLang.g:1268:2: ( (lv_left_0_0= ruleExpression ) ) otherlv_1= ':' ( (lv_right_2_0= ruleExpression ) )
            {
            // InternalTemplateLang.g:1268:2: ( (lv_left_0_0= ruleExpression ) )
            // InternalTemplateLang.g:1269:1: (lv_left_0_0= ruleExpression )
            {
            // InternalTemplateLang.g:1269:1: (lv_left_0_0= ruleExpression )
            // InternalTemplateLang.g:1270:3: lv_left_0_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchPartAccess().getLeftExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_32);
            lv_left_0_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchPartRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSwitchPartAccess().getColonKeyword_1());
                  
            }
            // InternalTemplateLang.g:1290:1: ( (lv_right_2_0= ruleExpression ) )
            // InternalTemplateLang.g:1291:1: (lv_right_2_0= ruleExpression )
            {
            // InternalTemplateLang.g:1291:1: (lv_right_2_0= ruleExpression )
            // InternalTemplateLang.g:1292:3: lv_right_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSwitchPartAccess().getRightExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_right_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSwitchPartRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSwitchPart"


    // $ANTLR start "entryRuleLoop"
    // InternalTemplateLang.g:1316:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalTemplateLang.g:1317:2: (iv_ruleLoop= ruleLoop EOF )
            // InternalTemplateLang.g:1318:2: iv_ruleLoop= ruleLoop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoop; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalTemplateLang.g:1325:1: ruleLoop returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= ':' ( (lv_expr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_separator_7_0= rulePrimaryExpression ) ) (otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) ) )? )? otherlv_10= ')' ( (lv_stmt_11_0= ruleStmt ) ) ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_expr_5_0 = null;

        EObject lv_separator_7_0 = null;

        EObject lv_finalSeparator_9_0 = null;

        EObject lv_stmt_11_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1328:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= ':' ( (lv_expr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_separator_7_0= rulePrimaryExpression ) ) (otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) ) )? )? otherlv_10= ')' ( (lv_stmt_11_0= ruleStmt ) ) ) )
            // InternalTemplateLang.g:1329:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= ':' ( (lv_expr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_separator_7_0= rulePrimaryExpression ) ) (otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) ) )? )? otherlv_10= ')' ( (lv_stmt_11_0= ruleStmt ) ) )
            {
            // InternalTemplateLang.g:1329:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= ':' ( (lv_expr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_separator_7_0= rulePrimaryExpression ) ) (otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) ) )? )? otherlv_10= ')' ( (lv_stmt_11_0= ruleStmt ) ) )
            // InternalTemplateLang.g:1329:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_type_2_0= ruleType ) ) ( (lv_id_3_0= ruleIdentifier ) ) otherlv_4= ':' ( (lv_expr_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_separator_7_0= rulePrimaryExpression ) ) (otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) ) )? )? otherlv_10= ')' ( (lv_stmt_11_0= ruleStmt ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoopAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalTemplateLang.g:1337:1: ( (lv_type_2_0= ruleType ) )
            // InternalTemplateLang.g:1338:1: (lv_type_2_0= ruleType )
            {
            // InternalTemplateLang.g:1338:1: (lv_type_2_0= ruleType )
            // InternalTemplateLang.g:1339:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1355:2: ( (lv_id_3_0= ruleIdentifier ) )
            // InternalTemplateLang.g:1356:1: (lv_id_3_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:1356:1: (lv_id_3_0= ruleIdentifier )
            // InternalTemplateLang.g:1357:3: lv_id_3_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopAccess().getIdIdentifierParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_32);
            lv_id_3_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_3_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,32,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLoopAccess().getColonKeyword_4());
                  
            }
            // InternalTemplateLang.g:1377:1: ( (lv_expr_5_0= ruleExpression ) )
            // InternalTemplateLang.g:1378:1: (lv_expr_5_0= ruleExpression )
            {
            // InternalTemplateLang.g:1378:1: (lv_expr_5_0= ruleExpression )
            // InternalTemplateLang.g:1379:3: lv_expr_5_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopAccess().getExprExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_expr_5_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_5_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1395:2: (otherlv_6= ',' ( (lv_separator_7_0= rulePrimaryExpression ) ) (otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) ) )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTemplateLang.g:1395:4: otherlv_6= ',' ( (lv_separator_7_0= rulePrimaryExpression ) ) (otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) ) )?
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getCommaKeyword_6_0());
                          
                    }
                    // InternalTemplateLang.g:1399:1: ( (lv_separator_7_0= rulePrimaryExpression ) )
                    // InternalTemplateLang.g:1400:1: (lv_separator_7_0= rulePrimaryExpression )
                    {
                    // InternalTemplateLang.g:1400:1: (lv_separator_7_0= rulePrimaryExpression )
                    // InternalTemplateLang.g:1401:3: lv_separator_7_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLoopAccess().getSeparatorPrimaryExpressionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_17);
                    lv_separator_7_0=rulePrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLoopRule());
                      	        }
                             		set(
                             			current, 
                             			"separator",
                              		lv_separator_7_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.PrimaryExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalTemplateLang.g:1417:2: (otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==20) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalTemplateLang.g:1417:4: otherlv_8= ',' ( (lv_finalSeparator_9_0= rulePrimaryExpression ) )
                            {
                            otherlv_8=(Token)match(input,20,FOLLOW_34); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getCommaKeyword_6_2_0());
                                  
                            }
                            // InternalTemplateLang.g:1421:1: ( (lv_finalSeparator_9_0= rulePrimaryExpression ) )
                            // InternalTemplateLang.g:1422:1: (lv_finalSeparator_9_0= rulePrimaryExpression )
                            {
                            // InternalTemplateLang.g:1422:1: (lv_finalSeparator_9_0= rulePrimaryExpression )
                            // InternalTemplateLang.g:1423:3: lv_finalSeparator_9_0= rulePrimaryExpression
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getLoopAccess().getFinalSeparatorPrimaryExpressionParserRuleCall_6_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_11);
                            lv_finalSeparator_9_0=rulePrimaryExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getLoopRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"finalSeparator",
                                      		lv_finalSeparator_9_0, 
                                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.PrimaryExpression");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getRightParenthesisKeyword_7());
                  
            }
            // InternalTemplateLang.g:1443:1: ( (lv_stmt_11_0= ruleStmt ) )
            // InternalTemplateLang.g:1444:1: (lv_stmt_11_0= ruleStmt )
            {
            // InternalTemplateLang.g:1444:1: (lv_stmt_11_0= ruleStmt )
            // InternalTemplateLang.g:1445:3: lv_stmt_11_0= ruleStmt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopAccess().getStmtStmtParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_stmt_11_0=ruleStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopRule());
              	        }
                     		set(
                     			current, 
                     			"stmt",
                      		lv_stmt_11_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.Stmt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRulemultiselect"
    // InternalTemplateLang.g:1469:1: entryRulemultiselect returns [EObject current=null] : iv_rulemultiselect= rulemultiselect EOF ;
    public final EObject entryRulemultiselect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiselect = null;


        try {
            // InternalTemplateLang.g:1470:2: (iv_rulemultiselect= rulemultiselect EOF )
            // InternalTemplateLang.g:1471:2: iv_rulemultiselect= rulemultiselect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiselectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemultiselect=rulemultiselect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiselect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiselect"


    // $ANTLR start "rulemultiselect"
    // InternalTemplateLang.g:1478:1: rulemultiselect returns [EObject current=null] : ( ( (lv_gen_0_0= rulegenericMultiselect ) ) | ( (lv_user_1_0= ruleuserMultiselect ) ) ) ;
    public final EObject rulemultiselect() throws RecognitionException {
        EObject current = null;

        EObject lv_gen_0_0 = null;

        EObject lv_user_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1481:28: ( ( ( (lv_gen_0_0= rulegenericMultiselect ) ) | ( (lv_user_1_0= ruleuserMultiselect ) ) ) )
            // InternalTemplateLang.g:1482:1: ( ( (lv_gen_0_0= rulegenericMultiselect ) ) | ( (lv_user_1_0= ruleuserMultiselect ) ) )
            {
            // InternalTemplateLang.g:1482:1: ( ( (lv_gen_0_0= rulegenericMultiselect ) ) | ( (lv_user_1_0= ruleuserMultiselect ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            else if ( ((LA27_0>=RULE_VERSION && LA27_0<=RULE_EXPONENT)||LA27_0==44) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalTemplateLang.g:1482:2: ( (lv_gen_0_0= rulegenericMultiselect ) )
                    {
                    // InternalTemplateLang.g:1482:2: ( (lv_gen_0_0= rulegenericMultiselect ) )
                    // InternalTemplateLang.g:1483:1: (lv_gen_0_0= rulegenericMultiselect )
                    {
                    // InternalTemplateLang.g:1483:1: (lv_gen_0_0= rulegenericMultiselect )
                    // InternalTemplateLang.g:1484:3: lv_gen_0_0= rulegenericMultiselect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiselectAccess().getGenGenericMultiselectParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_gen_0_0=rulegenericMultiselect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiselectRule());
                      	        }
                             		set(
                             			current, 
                             			"gen",
                              		lv_gen_0_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.genericMultiselect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:1501:6: ( (lv_user_1_0= ruleuserMultiselect ) )
                    {
                    // InternalTemplateLang.g:1501:6: ( (lv_user_1_0= ruleuserMultiselect ) )
                    // InternalTemplateLang.g:1502:1: (lv_user_1_0= ruleuserMultiselect )
                    {
                    // InternalTemplateLang.g:1502:1: (lv_user_1_0= ruleuserMultiselect )
                    // InternalTemplateLang.g:1503:3: lv_user_1_0= ruleuserMultiselect
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiselectAccess().getUserUserMultiselectParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_user_1_0=ruleuserMultiselect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiselectRule());
                      	        }
                             		set(
                             			current, 
                             			"user",
                              		lv_user_1_0, 
                              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.userMultiselect");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiselect"


    // $ANTLR start "entryRulegenericMultiselect"
    // InternalTemplateLang.g:1527:1: entryRulegenericMultiselect returns [EObject current=null] : iv_rulegenericMultiselect= rulegenericMultiselect EOF ;
    public final EObject entryRulegenericMultiselect() throws RecognitionException {
        EObject current = null;

        EObject iv_rulegenericMultiselect = null;


        try {
            // InternalTemplateLang.g:1528:2: (iv_rulegenericMultiselect= rulegenericMultiselect EOF )
            // InternalTemplateLang.g:1529:2: iv_rulegenericMultiselect= rulegenericMultiselect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGenericMultiselectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulegenericMultiselect=rulegenericMultiselect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulegenericMultiselect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulegenericMultiselect"


    // $ANTLR start "rulegenericMultiselect"
    // InternalTemplateLang.g:1536:1: rulegenericMultiselect returns [EObject current=null] : (otherlv_0= 'multiSelect' ( (lv_preamble_1_0= ruleStmtBlock ) ) ( (lv_selector_2_0= ruleStmtBlock ) ) ( (lv_part_3_0= rulemultiSelectPart ) )+ ( (lv_trailer_4_0= ruleStmtBlock ) ) ) ;
    public final EObject rulegenericMultiselect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_preamble_1_0 = null;

        EObject lv_selector_2_0 = null;

        EObject lv_part_3_0 = null;

        EObject lv_trailer_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1539:28: ( (otherlv_0= 'multiSelect' ( (lv_preamble_1_0= ruleStmtBlock ) ) ( (lv_selector_2_0= ruleStmtBlock ) ) ( (lv_part_3_0= rulemultiSelectPart ) )+ ( (lv_trailer_4_0= ruleStmtBlock ) ) ) )
            // InternalTemplateLang.g:1540:1: (otherlv_0= 'multiSelect' ( (lv_preamble_1_0= ruleStmtBlock ) ) ( (lv_selector_2_0= ruleStmtBlock ) ) ( (lv_part_3_0= rulemultiSelectPart ) )+ ( (lv_trailer_4_0= ruleStmtBlock ) ) )
            {
            // InternalTemplateLang.g:1540:1: (otherlv_0= 'multiSelect' ( (lv_preamble_1_0= ruleStmtBlock ) ) ( (lv_selector_2_0= ruleStmtBlock ) ) ( (lv_part_3_0= rulemultiSelectPart ) )+ ( (lv_trailer_4_0= ruleStmtBlock ) ) )
            // InternalTemplateLang.g:1540:3: otherlv_0= 'multiSelect' ( (lv_preamble_1_0= ruleStmtBlock ) ) ( (lv_selector_2_0= ruleStmtBlock ) ) ( (lv_part_3_0= rulemultiSelectPart ) )+ ( (lv_trailer_4_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGenericMultiselectAccess().getMultiSelectKeyword_0());
                  
            }
            // InternalTemplateLang.g:1544:1: ( (lv_preamble_1_0= ruleStmtBlock ) )
            // InternalTemplateLang.g:1545:1: (lv_preamble_1_0= ruleStmtBlock )
            {
            // InternalTemplateLang.g:1545:1: (lv_preamble_1_0= ruleStmtBlock )
            // InternalTemplateLang.g:1546:3: lv_preamble_1_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenericMultiselectAccess().getPreambleStmtBlockParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_preamble_1_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGenericMultiselectRule());
              	        }
                     		set(
                     			current, 
                     			"preamble",
                      		lv_preamble_1_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.StmtBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1562:2: ( (lv_selector_2_0= ruleStmtBlock ) )
            // InternalTemplateLang.g:1563:1: (lv_selector_2_0= ruleStmtBlock )
            {
            // InternalTemplateLang.g:1563:1: (lv_selector_2_0= ruleStmtBlock )
            // InternalTemplateLang.g:1564:3: lv_selector_2_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenericMultiselectAccess().getSelectorStmtBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_35);
            lv_selector_2_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGenericMultiselectRule());
              	        }
                     		set(
                     			current, 
                     			"selector",
                      		lv_selector_2_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.StmtBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1580:2: ( (lv_part_3_0= rulemultiSelectPart ) )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==35) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTemplateLang.g:1581:1: (lv_part_3_0= rulemultiSelectPart )
            	    {
            	    // InternalTemplateLang.g:1581:1: (lv_part_3_0= rulemultiSelectPart )
            	    // InternalTemplateLang.g:1582:3: lv_part_3_0= rulemultiSelectPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGenericMultiselectAccess().getPartMultiSelectPartParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_36);
            	    lv_part_3_0=rulemultiSelectPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGenericMultiselectRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"part",
            	              		lv_part_3_0, 
            	              		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.multiSelectPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

            // InternalTemplateLang.g:1598:3: ( (lv_trailer_4_0= ruleStmtBlock ) )
            // InternalTemplateLang.g:1599:1: (lv_trailer_4_0= ruleStmtBlock )
            {
            // InternalTemplateLang.g:1599:1: (lv_trailer_4_0= ruleStmtBlock )
            // InternalTemplateLang.g:1600:3: lv_trailer_4_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGenericMultiselectAccess().getTrailerStmtBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_trailer_4_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGenericMultiselectRule());
              	        }
                     		set(
                     			current, 
                     			"trailer",
                      		lv_trailer_4_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.StmtBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulegenericMultiselect"


    // $ANTLR start "entryRulemultiSelectPart"
    // InternalTemplateLang.g:1624:1: entryRulemultiSelectPart returns [EObject current=null] : iv_rulemultiSelectPart= rulemultiSelectPart EOF ;
    public final EObject entryRulemultiSelectPart() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemultiSelectPart = null;


        try {
            // InternalTemplateLang.g:1625:2: (iv_rulemultiSelectPart= rulemultiSelectPart EOF )
            // InternalTemplateLang.g:1626:2: iv_rulemultiSelectPart= rulemultiSelectPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiSelectPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulemultiSelectPart=rulemultiSelectPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulemultiSelectPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemultiSelectPart"


    // $ANTLR start "rulemultiSelectPart"
    // InternalTemplateLang.g:1633:1: rulemultiSelectPart returns [EObject current=null] : (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) ( (lv_code_2_0= ruleStmtBlock ) ) ( (lv_selector_3_0= ruleStmtBlock ) ) ) ;
    public final EObject rulemultiSelectPart() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_case_1_0 = null;

        EObject lv_code_2_0 = null;

        EObject lv_selector_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1636:28: ( (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) ( (lv_code_2_0= ruleStmtBlock ) ) ( (lv_selector_3_0= ruleStmtBlock ) ) ) )
            // InternalTemplateLang.g:1637:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) ( (lv_code_2_0= ruleStmtBlock ) ) ( (lv_selector_3_0= ruleStmtBlock ) ) )
            {
            // InternalTemplateLang.g:1637:1: (otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) ( (lv_code_2_0= ruleStmtBlock ) ) ( (lv_selector_3_0= ruleStmtBlock ) ) )
            // InternalTemplateLang.g:1637:3: otherlv_0= 'case' ( (lv_case_1_0= ruleExpression ) ) ( (lv_code_2_0= ruleStmtBlock ) ) ( (lv_selector_3_0= ruleStmtBlock ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMultiSelectPartAccess().getCaseKeyword_0());
                  
            }
            // InternalTemplateLang.g:1641:1: ( (lv_case_1_0= ruleExpression ) )
            // InternalTemplateLang.g:1642:1: (lv_case_1_0= ruleExpression )
            {
            // InternalTemplateLang.g:1642:1: (lv_case_1_0= ruleExpression )
            // InternalTemplateLang.g:1643:3: lv_case_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiSelectPartAccess().getCaseExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_case_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiSelectPartRule());
              	        }
                     		set(
                     			current, 
                     			"case",
                      		lv_case_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1659:2: ( (lv_code_2_0= ruleStmtBlock ) )
            // InternalTemplateLang.g:1660:1: (lv_code_2_0= ruleStmtBlock )
            {
            // InternalTemplateLang.g:1660:1: (lv_code_2_0= ruleStmtBlock )
            // InternalTemplateLang.g:1661:3: lv_code_2_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiSelectPartAccess().getCodeStmtBlockParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_code_2_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiSelectPartRule());
              	        }
                     		set(
                     			current, 
                     			"code",
                      		lv_code_2_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.StmtBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1677:2: ( (lv_selector_3_0= ruleStmtBlock ) )
            // InternalTemplateLang.g:1678:1: (lv_selector_3_0= ruleStmtBlock )
            {
            // InternalTemplateLang.g:1678:1: (lv_selector_3_0= ruleStmtBlock )
            // InternalTemplateLang.g:1679:3: lv_selector_3_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiSelectPartAccess().getSelectorStmtBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_selector_3_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiSelectPartRule());
              	        }
                     		set(
                     			current, 
                     			"selector",
                      		lv_selector_3_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.StmtBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemultiSelectPart"


    // $ANTLR start "entryRuleuserMultiselect"
    // InternalTemplateLang.g:1703:1: entryRuleuserMultiselect returns [EObject current=null] : iv_ruleuserMultiselect= ruleuserMultiselect EOF ;
    public final EObject entryRuleuserMultiselect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuserMultiselect = null;


        try {
            // InternalTemplateLang.g:1704:2: (iv_ruleuserMultiselect= ruleuserMultiselect EOF )
            // InternalTemplateLang.g:1705:2: iv_ruleuserMultiselect= ruleuserMultiselect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUserMultiselectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleuserMultiselect=ruleuserMultiselect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleuserMultiselect; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleuserMultiselect"


    // $ANTLR start "ruleuserMultiselect"
    // InternalTemplateLang.g:1712:1: ruleuserMultiselect returns [EObject current=null] : ( ( (lv_id_0_0= ruleIdentifier ) ) otherlv_1= ':=' otherlv_2= 'generic-multiSelect' ( (lv_stmt_3_0= ruleStmtBlock ) ) (otherlv_4= ';' )? ) ;
    public final EObject ruleuserMultiselect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_stmt_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1715:28: ( ( ( (lv_id_0_0= ruleIdentifier ) ) otherlv_1= ':=' otherlv_2= 'generic-multiSelect' ( (lv_stmt_3_0= ruleStmtBlock ) ) (otherlv_4= ';' )? ) )
            // InternalTemplateLang.g:1716:1: ( ( (lv_id_0_0= ruleIdentifier ) ) otherlv_1= ':=' otherlv_2= 'generic-multiSelect' ( (lv_stmt_3_0= ruleStmtBlock ) ) (otherlv_4= ';' )? )
            {
            // InternalTemplateLang.g:1716:1: ( ( (lv_id_0_0= ruleIdentifier ) ) otherlv_1= ':=' otherlv_2= 'generic-multiSelect' ( (lv_stmt_3_0= ruleStmtBlock ) ) (otherlv_4= ';' )? )
            // InternalTemplateLang.g:1716:2: ( (lv_id_0_0= ruleIdentifier ) ) otherlv_1= ':=' otherlv_2= 'generic-multiSelect' ( (lv_stmt_3_0= ruleStmtBlock ) ) (otherlv_4= ';' )?
            {
            // InternalTemplateLang.g:1716:2: ( (lv_id_0_0= ruleIdentifier ) )
            // InternalTemplateLang.g:1717:1: (lv_id_0_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:1717:1: (lv_id_0_0= ruleIdentifier )
            // InternalTemplateLang.g:1718:3: lv_id_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUserMultiselectAccess().getIdIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_37);
            lv_id_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUserMultiselectRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,36,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getUserMultiselectAccess().getColonEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getUserMultiselectAccess().getGenericMultiSelectKeyword_2());
                  
            }
            // InternalTemplateLang.g:1742:1: ( (lv_stmt_3_0= ruleStmtBlock ) )
            // InternalTemplateLang.g:1743:1: (lv_stmt_3_0= ruleStmtBlock )
            {
            // InternalTemplateLang.g:1743:1: (lv_stmt_3_0= ruleStmtBlock )
            // InternalTemplateLang.g:1744:3: lv_stmt_3_0= ruleStmtBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUserMultiselectAccess().getStmtStmtBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_23);
            lv_stmt_3_0=ruleStmtBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUserMultiselectRule());
              	        }
                     		set(
                     			current, 
                     			"stmt",
                      		lv_stmt_3_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.StmtBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1760:2: (otherlv_4= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==25) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTemplateLang.g:1760:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getUserMultiselectAccess().getSemicolonKeyword_4());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuserMultiselect"


    // $ANTLR start "entryRuleExtension"
    // InternalTemplateLang.g:1772:1: entryRuleExtension returns [EObject current=null] : iv_ruleExtension= ruleExtension EOF ;
    public final EObject entryRuleExtension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtension = null;


        try {
            // InternalTemplateLang.g:1773:2: (iv_ruleExtension= ruleExtension EOF )
            // InternalTemplateLang.g:1774:2: iv_ruleExtension= ruleExtension EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExtensionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExtension=ruleExtension();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExtension; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExtension"


    // $ANTLR start "ruleExtension"
    // InternalTemplateLang.g:1781:1: ruleExtension returns [EObject current=null] : (otherlv_0= 'extension' ( (lv_name_1_0= ruleJavaQualifiedName ) ) otherlv_2= ';' ) ;
    public final EObject ruleExtension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1784:28: ( (otherlv_0= 'extension' ( (lv_name_1_0= ruleJavaQualifiedName ) ) otherlv_2= ';' ) )
            // InternalTemplateLang.g:1785:1: (otherlv_0= 'extension' ( (lv_name_1_0= ruleJavaQualifiedName ) ) otherlv_2= ';' )
            {
            // InternalTemplateLang.g:1785:1: (otherlv_0= 'extension' ( (lv_name_1_0= ruleJavaQualifiedName ) ) otherlv_2= ';' )
            // InternalTemplateLang.g:1785:3: otherlv_0= 'extension' ( (lv_name_1_0= ruleJavaQualifiedName ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExtensionAccess().getExtensionKeyword_0());
                  
            }
            // InternalTemplateLang.g:1789:1: ( (lv_name_1_0= ruleJavaQualifiedName ) )
            // InternalTemplateLang.g:1790:1: (lv_name_1_0= ruleJavaQualifiedName )
            {
            // InternalTemplateLang.g:1790:1: (lv_name_1_0= ruleJavaQualifiedName )
            // InternalTemplateLang.g:1791:3: lv_name_1_0= ruleJavaQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExtensionAccess().getNameJavaQualifiedNameParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_29);
            lv_name_1_0=ruleJavaQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExtensionRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.uni_hildesheim.sse.vil.templatelang.TemplateLang.JavaQualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExtensionAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExtension"


    // $ANTLR start "entryRuleJavaQualifiedName"
    // InternalTemplateLang.g:1819:1: entryRuleJavaQualifiedName returns [EObject current=null] : iv_ruleJavaQualifiedName= ruleJavaQualifiedName EOF ;
    public final EObject entryRuleJavaQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJavaQualifiedName = null;


        try {
            // InternalTemplateLang.g:1820:2: (iv_ruleJavaQualifiedName= ruleJavaQualifiedName EOF )
            // InternalTemplateLang.g:1821:2: iv_ruleJavaQualifiedName= ruleJavaQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJavaQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJavaQualifiedName=ruleJavaQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJavaQualifiedName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJavaQualifiedName"


    // $ANTLR start "ruleJavaQualifiedName"
    // InternalTemplateLang.g:1828:1: ruleJavaQualifiedName returns [EObject current=null] : ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) ;
    public final EObject ruleJavaQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_qname_1_0=null;
        AntlrDatatypeRuleToken lv_qname_0_0 = null;

        AntlrDatatypeRuleToken lv_qname_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1831:28: ( ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) )
            // InternalTemplateLang.g:1832:1: ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            {
            // InternalTemplateLang.g:1832:1: ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            // InternalTemplateLang.g:1832:2: ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            {
            // InternalTemplateLang.g:1832:2: ( (lv_qname_0_0= ruleIdentifier ) )
            // InternalTemplateLang.g:1833:1: (lv_qname_0_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:1833:1: (lv_qname_0_0= ruleIdentifier )
            // InternalTemplateLang.g:1834:3: lv_qname_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJavaQualifiedNameAccess().getQnameIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
            lv_qname_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJavaQualifiedNameRule());
              	        }
                     		add(
                     			current, 
                     			"qname",
                      		lv_qname_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1850:2: ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==39) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalTemplateLang.g:1850:3: ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) )
            	    {
            	    // InternalTemplateLang.g:1850:3: ( (lv_qname_1_0= '.' ) )
            	    // InternalTemplateLang.g:1851:1: (lv_qname_1_0= '.' )
            	    {
            	    // InternalTemplateLang.g:1851:1: (lv_qname_1_0= '.' )
            	    // InternalTemplateLang.g:1852:3: lv_qname_1_0= '.'
            	    {
            	    lv_qname_1_0=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_qname_1_0, grammarAccess.getJavaQualifiedNameAccess().getQnameFullStopKeyword_1_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getJavaQualifiedNameRule());
            	      	        }
            	             		addWithLastConsumed(current, "qname", lv_qname_1_0, ".");
            	      	    
            	    }

            	    }


            	    }

            	    // InternalTemplateLang.g:1865:2: ( (lv_qname_2_0= ruleIdentifier ) )
            	    // InternalTemplateLang.g:1866:1: (lv_qname_2_0= ruleIdentifier )
            	    {
            	    // InternalTemplateLang.g:1866:1: (lv_qname_2_0= ruleIdentifier )
            	    // InternalTemplateLang.g:1867:3: lv_qname_2_0= ruleIdentifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getJavaQualifiedNameAccess().getQnameIdentifierParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_qname_2_0=ruleIdentifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getJavaQualifiedNameRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"qname",
            	              		lv_qname_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJavaQualifiedName"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalTemplateLang.g:1891:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalTemplateLang.g:1892:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalTemplateLang.g:1893:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalTemplateLang.g:1900:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token lv_const_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_expression_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:1903:28: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';' ) )
            // InternalTemplateLang.g:1904:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            {
            // InternalTemplateLang.g:1904:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            // InternalTemplateLang.g:1904:2: ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';'
            {
            // InternalTemplateLang.g:1904:2: ( (lv_const_0_0= 'const' ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTemplateLang.g:1905:1: (lv_const_0_0= 'const' )
                    {
                    // InternalTemplateLang.g:1905:1: (lv_const_0_0= 'const' )
                    // InternalTemplateLang.g:1906:3: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,40,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_const_0_0, grammarAccess.getVariableDeclarationAccess().getConstConstKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		setWithLastConsumed(current, "const", lv_const_0_0, "const");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:1919:3: ( (lv_type_1_0= ruleType ) )
            // InternalTemplateLang.g:1920:1: (lv_type_1_0= ruleType )
            {
            // InternalTemplateLang.g:1920:1: (lv_type_1_0= ruleType )
            // InternalTemplateLang.g:1921:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1937:2: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalTemplateLang.g:1938:1: (lv_name_2_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:1938:1: (lv_name_2_0= ruleIdentifier )
            // InternalTemplateLang.g:1939:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_40);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:1955:2: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==21) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalTemplateLang.g:1955:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalTemplateLang.g:1959:1: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalTemplateLang.g:1960:1: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalTemplateLang.g:1960:1: (lv_expression_4_0= ruleExpression )
                    // InternalTemplateLang.g:1961:3: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_expression_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_4_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getVariableDeclarationAccess().getSemicolonKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleTypeDef"
    // InternalTemplateLang.g:1989:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalTemplateLang.g:1990:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalTemplateLang.g:1991:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeDef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalTemplateLang.g:1998:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2001:28: ( (otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) )
            // InternalTemplateLang.g:2002:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            {
            // InternalTemplateLang.g:2002:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            // InternalTemplateLang.g:2002:3: otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
                  
            }
            // InternalTemplateLang.g:2006:1: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalTemplateLang.g:2007:1: (lv_name_1_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:2007:1: (lv_name_1_0= ruleIdentifier )
            // InternalTemplateLang.g:2008:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_22);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2024:2: ( (lv_type_2_0= ruleType ) )
            // InternalTemplateLang.g:2025:1: (lv_type_2_0= ruleType )
            {
            // InternalTemplateLang.g:2025:1: (lv_type_2_0= ruleType )
            // InternalTemplateLang.g:2026:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_29);
            lv_type_2_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeDefRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTypeDefAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleAdvice"
    // InternalTemplateLang.g:2054:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // InternalTemplateLang.g:2055:2: (iv_ruleAdvice= ruleAdvice EOF )
            // InternalTemplateLang.g:2056:2: iv_ruleAdvice= ruleAdvice EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdviceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdvice=ruleAdvice();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdvice; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // InternalTemplateLang.g:2063:1: ruleAdvice returns [EObject current=null] : (otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )? ) ;
    public final EObject ruleAdvice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;

        EObject lv_versionSpec_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2066:28: ( (otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )? ) )
            // InternalTemplateLang.g:2067:1: (otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )? )
            {
            // InternalTemplateLang.g:2067:1: (otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )? )
            // InternalTemplateLang.g:2067:3: otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )?
            {
            otherlv_0=(Token)match(input,42,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAdviceAccess().getAdviceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,14,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalTemplateLang.g:2075:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalTemplateLang.g:2076:1: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalTemplateLang.g:2076:1: (lv_name_2_0= ruleQualifiedName )
            // InternalTemplateLang.g:2077:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdviceAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdviceRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_41); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAdviceAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalTemplateLang.g:2097:1: ( (lv_versionSpec_4_0= ruleVersionSpec ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==43) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalTemplateLang.g:2098:1: (lv_versionSpec_4_0= ruleVersionSpec )
                    {
                    // InternalTemplateLang.g:2098:1: (lv_versionSpec_4_0= ruleVersionSpec )
                    // InternalTemplateLang.g:2099:3: lv_versionSpec_4_0= ruleVersionSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAdviceAccess().getVersionSpecVersionSpecParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_versionSpec_4_0=ruleVersionSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAdviceRule());
                      	        }
                             		set(
                             			current, 
                             			"versionSpec",
                              		lv_versionSpec_4_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VersionSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdvice"


    // $ANTLR start "entryRuleVersionSpec"
    // InternalTemplateLang.g:2123:1: entryRuleVersionSpec returns [EObject current=null] : iv_ruleVersionSpec= ruleVersionSpec EOF ;
    public final EObject entryRuleVersionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionSpec = null;


        try {
            // InternalTemplateLang.g:2124:2: (iv_ruleVersionSpec= ruleVersionSpec EOF )
            // InternalTemplateLang.g:2125:2: iv_ruleVersionSpec= ruleVersionSpec EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionSpecRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVersionSpec=ruleVersionSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionSpec; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionSpec"


    // $ANTLR start "ruleVersionSpec"
    // InternalTemplateLang.g:2132:1: ruleVersionSpec returns [EObject current=null] : (otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) ) ) ;
    public final EObject ruleVersionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_restriction_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2135:28: ( (otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) ) ) )
            // InternalTemplateLang.g:2136:1: (otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) ) )
            {
            // InternalTemplateLang.g:2136:1: (otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) ) )
            // InternalTemplateLang.g:2136:3: otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,43,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVersionSpecAccess().getWithKeyword_0());
                  
            }
            // InternalTemplateLang.g:2140:1: ( (lv_restriction_1_0= ruleExpression ) )
            // InternalTemplateLang.g:2141:1: (lv_restriction_1_0= ruleExpression )
            {
            // InternalTemplateLang.g:2141:1: (lv_restriction_1_0= ruleExpression )
            // InternalTemplateLang.g:2142:3: lv_restriction_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVersionSpecAccess().getRestrictionExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_restriction_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVersionSpecRule());
              	        }
                     		set(
                     			current, 
                     			"restriction",
                      		lv_restriction_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionSpec"


    // $ANTLR start "entryRuleParameterList"
    // InternalTemplateLang.g:2166:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalTemplateLang.g:2167:2: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalTemplateLang.g:2168:2: iv_ruleParameterList= ruleParameterList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalTemplateLang.g:2175:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_param_0_0 = null;

        EObject lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2178:28: ( ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )* ) )
            // InternalTemplateLang.g:2179:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )* )
            {
            // InternalTemplateLang.g:2179:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )* )
            // InternalTemplateLang.g:2179:2: ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )*
            {
            // InternalTemplateLang.g:2179:2: ( (lv_param_0_0= ruleParameter ) )
            // InternalTemplateLang.g:2180:1: (lv_param_0_0= ruleParameter )
            {
            // InternalTemplateLang.g:2180:1: (lv_param_0_0= ruleParameter )
            // InternalTemplateLang.g:2181:3: lv_param_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_42);
            lv_param_0_0=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterListRule());
              	        }
                     		add(
                     			current, 
                     			"param",
                      		lv_param_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Parameter");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2197:2: (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==20) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalTemplateLang.g:2197:4: otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalTemplateLang.g:2201:1: ( (lv_param_2_0= ruleParameter ) )
            	    // InternalTemplateLang.g:2202:1: (lv_param_2_0= ruleParameter )
            	    {
            	    // InternalTemplateLang.g:2202:1: (lv_param_2_0= ruleParameter )
            	    // InternalTemplateLang.g:2203:3: lv_param_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_param_2_0=ruleParameter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getParameterListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"param",
            	              		lv_param_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Parameter");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // InternalTemplateLang.g:2227:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalTemplateLang.g:2228:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalTemplateLang.g:2229:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalTemplateLang.g:2236:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2239:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalTemplateLang.g:2240:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalTemplateLang.g:2240:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalTemplateLang.g:2240:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) )
            {
            // InternalTemplateLang.g:2240:2: ( (lv_type_0_0= ruleType ) )
            // InternalTemplateLang.g:2241:1: (lv_type_0_0= ruleType )
            {
            // InternalTemplateLang.g:2241:1: (lv_type_0_0= ruleType )
            // InternalTemplateLang.g:2242:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_type_0_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2258:2: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalTemplateLang.g:2259:1: (lv_name_1_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:2259:1: (lv_name_1_0= ruleIdentifier )
            // InternalTemplateLang.g:2260:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParameterRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleVersionStmt"
    // InternalTemplateLang.g:2284:1: entryRuleVersionStmt returns [EObject current=null] : iv_ruleVersionStmt= ruleVersionStmt EOF ;
    public final EObject entryRuleVersionStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionStmt = null;


        try {
            // InternalTemplateLang.g:2285:2: (iv_ruleVersionStmt= ruleVersionStmt EOF )
            // InternalTemplateLang.g:2286:2: iv_ruleVersionStmt= ruleVersionStmt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVersionStmtRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleVersionStmt=ruleVersionStmt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVersionStmt; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVersionStmt"


    // $ANTLR start "ruleVersionStmt"
    // InternalTemplateLang.g:2293:1: ruleVersionStmt returns [EObject current=null] : (otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';' ) ;
    public final EObject ruleVersionStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_version_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2296:28: ( (otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';' ) )
            // InternalTemplateLang.g:2297:1: (otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';' )
            {
            // InternalTemplateLang.g:2297:1: (otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';' )
            // InternalTemplateLang.g:2297:3: otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVersionStmtAccess().getVersionKeyword_0());
                  
            }
            // InternalTemplateLang.g:2301:1: ( (lv_version_1_0= RULE_VERSION ) )
            // InternalTemplateLang.g:2302:1: (lv_version_1_0= RULE_VERSION )
            {
            // InternalTemplateLang.g:2302:1: (lv_version_1_0= RULE_VERSION )
            // InternalTemplateLang.g:2303:3: lv_version_1_0= RULE_VERSION
            {
            lv_version_1_0=(Token)match(input,RULE_VERSION,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_version_1_0, grammarAccess.getVersionStmtAccess().getVersionVERSIONTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVersionStmtRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"version",
                      		lv_version_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VERSION");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getVersionStmtAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVersionStmt"


    // $ANTLR start "entryRuleImport"
    // InternalTemplateLang.g:2331:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalTemplateLang.g:2332:2: (iv_ruleImport= ruleImport EOF )
            // InternalTemplateLang.g:2333:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTemplateLang.g:2340:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_versionSpec_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2343:28: ( (otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';' ) )
            // InternalTemplateLang.g:2344:1: (otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';' )
            {
            // InternalTemplateLang.g:2344:1: (otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';' )
            // InternalTemplateLang.g:2344:3: otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // InternalTemplateLang.g:2348:1: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalTemplateLang.g:2349:1: (lv_name_1_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:2349:1: (lv_name_1_0= ruleIdentifier )
            // InternalTemplateLang.g:2350:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_44);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2366:2: ( (lv_versionSpec_2_0= ruleVersionSpec ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalTemplateLang.g:2367:1: (lv_versionSpec_2_0= ruleVersionSpec )
                    {
                    // InternalTemplateLang.g:2367:1: (lv_versionSpec_2_0= ruleVersionSpec )
                    // InternalTemplateLang.g:2368:3: lv_versionSpec_2_0= ruleVersionSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getVersionSpecVersionSpecParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_29);
                    lv_versionSpec_2_0=ruleVersionSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImportRule());
                      	        }
                             		set(
                             			current, 
                             			"versionSpec",
                              		lv_versionSpec_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VersionSpec");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getImportAccess().getSemicolonKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleExpressionStatement"
    // InternalTemplateLang.g:2396:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalTemplateLang.g:2397:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalTemplateLang.g:2398:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionStatement=ruleExpressionStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionStatement"


    // $ANTLR start "ruleExpressionStatement"
    // InternalTemplateLang.g:2405:1: ruleExpressionStatement returns [EObject current=null] : ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_var_0_0 = null;

        AntlrDatatypeRuleToken lv_field_2_0 = null;

        EObject lv_expr_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2408:28: ( ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' ) )
            // InternalTemplateLang.g:2409:1: ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' )
            {
            // InternalTemplateLang.g:2409:1: ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' )
            // InternalTemplateLang.g:2409:2: ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';'
            {
            // InternalTemplateLang.g:2409:2: ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )?
            int alt37=2;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalTemplateLang.g:2409:3: ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '='
                    {
                    // InternalTemplateLang.g:2409:3: ( (lv_var_0_0= ruleIdentifier ) )
                    // InternalTemplateLang.g:2410:1: (lv_var_0_0= ruleIdentifier )
                    {
                    // InternalTemplateLang.g:2410:1: (lv_var_0_0= ruleIdentifier )
                    // InternalTemplateLang.g:2411:3: lv_var_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getVarIdentifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_45);
                    lv_var_0_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"var",
                              		lv_var_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalTemplateLang.g:2427:2: (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==39) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalTemplateLang.g:2427:4: otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) )
                            {
                            otherlv_1=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getFullStopKeyword_0_1_0());
                                  
                            }
                            // InternalTemplateLang.g:2431:1: ( (lv_field_2_0= ruleIdentifier ) )
                            // InternalTemplateLang.g:2432:1: (lv_field_2_0= ruleIdentifier )
                            {
                            // InternalTemplateLang.g:2432:1: (lv_field_2_0= ruleIdentifier )
                            // InternalTemplateLang.g:2433:3: lv_field_2_0= ruleIdentifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getFieldIdentifierParserRuleCall_0_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_18);
                            lv_field_2_0=ruleIdentifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"field",
                                      		lv_field_2_0, 
                                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExpressionStatementAccess().getEqualsSignKeyword_0_2());
                          
                    }

                    }
                    break;

            }

            // InternalTemplateLang.g:2453:3: ( (lv_expr_4_0= ruleExpression ) )
            // InternalTemplateLang.g:2454:1: (lv_expr_4_0= ruleExpression )
            {
            // InternalTemplateLang.g:2454:1: (lv_expr_4_0= ruleExpression )
            // InternalTemplateLang.g:2455:3: lv_expr_4_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getExprExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_29);
            lv_expr_4_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_4_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRuleExpression"
    // InternalTemplateLang.g:2483:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalTemplateLang.g:2484:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalTemplateLang.g:2485:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalTemplateLang.g:2492:1: ruleExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleLogicalExpression ) ) | ( (lv_init_1_0= ruleContainerInitializer ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_init_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2495:28: ( ( ( (lv_expr_0_0= ruleLogicalExpression ) ) | ( (lv_init_1_0= ruleContainerInitializer ) ) ) )
            // InternalTemplateLang.g:2496:1: ( ( (lv_expr_0_0= ruleLogicalExpression ) ) | ( (lv_init_1_0= ruleContainerInitializer ) ) )
            {
            // InternalTemplateLang.g:2496:1: ( ( (lv_expr_0_0= ruleLogicalExpression ) ) | ( (lv_init_1_0= ruleContainerInitializer ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_NUMBER && LA38_0<=RULE_EXPONENT)||LA38_0==14||LA38_0==44||LA38_0==57||(LA38_0>=60 && LA38_0<=63)||(LA38_0>=68 && LA38_0<=70)) ) {
                alt38=1;
            }
            else if ( (LA38_0==17) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalTemplateLang.g:2496:2: ( (lv_expr_0_0= ruleLogicalExpression ) )
                    {
                    // InternalTemplateLang.g:2496:2: ( (lv_expr_0_0= ruleLogicalExpression ) )
                    // InternalTemplateLang.g:2497:1: (lv_expr_0_0= ruleLogicalExpression )
                    {
                    // InternalTemplateLang.g:2497:1: (lv_expr_0_0= ruleLogicalExpression )
                    // InternalTemplateLang.g:2498:3: lv_expr_0_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getExprLogicalExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_expr_0_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"expr",
                              		lv_expr_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.LogicalExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:2515:6: ( (lv_init_1_0= ruleContainerInitializer ) )
                    {
                    // InternalTemplateLang.g:2515:6: ( (lv_init_1_0= ruleContainerInitializer ) )
                    // InternalTemplateLang.g:2516:1: (lv_init_1_0= ruleContainerInitializer )
                    {
                    // InternalTemplateLang.g:2516:1: (lv_init_1_0= ruleContainerInitializer )
                    // InternalTemplateLang.g:2517:3: lv_init_1_0= ruleContainerInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionAccess().getInitContainerInitializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_init_1_0=ruleContainerInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"init",
                              		lv_init_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ContainerInitializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLogicalExpression"
    // InternalTemplateLang.g:2541:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalTemplateLang.g:2542:2: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalTemplateLang.g:2543:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalExpression=ruleLogicalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalExpression"


    // $ANTLR start "ruleLogicalExpression"
    // InternalTemplateLang.g:2550:1: ruleLogicalExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )* ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2553:28: ( ( ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )* ) )
            // InternalTemplateLang.g:2554:1: ( ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )* )
            {
            // InternalTemplateLang.g:2554:1: ( ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )* )
            // InternalTemplateLang.g:2554:2: ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )*
            {
            // InternalTemplateLang.g:2554:2: ( (lv_left_0_0= ruleEqualityExpression ) )
            // InternalTemplateLang.g:2555:1: (lv_left_0_0= ruleEqualityExpression )
            {
            // InternalTemplateLang.g:2555:1: (lv_left_0_0= ruleEqualityExpression )
            // InternalTemplateLang.g:2556:3: lv_left_0_0= ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLeftEqualityExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_46);
            lv_left_0_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.EqualityExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2572:2: ( (lv_right_1_0= ruleLogicalExpressionPart ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=46 && LA39_0<=48)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalTemplateLang.g:2573:1: (lv_right_1_0= ruleLogicalExpressionPart )
            	    {
            	    // InternalTemplateLang.g:2573:1: (lv_right_1_0= ruleLogicalExpressionPart )
            	    // InternalTemplateLang.g:2574:3: lv_right_1_0= ruleLogicalExpressionPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightLogicalExpressionPartParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_right_1_0=ruleLogicalExpressionPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLogicalExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"right",
            	              		lv_right_1_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.LogicalExpressionPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalExpression"


    // $ANTLR start "entryRuleLogicalExpressionPart"
    // InternalTemplateLang.g:2598:1: entryRuleLogicalExpressionPart returns [EObject current=null] : iv_ruleLogicalExpressionPart= ruleLogicalExpressionPart EOF ;
    public final EObject entryRuleLogicalExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpressionPart = null;


        try {
            // InternalTemplateLang.g:2599:2: (iv_ruleLogicalExpressionPart= ruleLogicalExpressionPart EOF )
            // InternalTemplateLang.g:2600:2: iv_ruleLogicalExpressionPart= ruleLogicalExpressionPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalExpressionPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalExpressionPart=ruleLogicalExpressionPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalExpressionPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalExpressionPart"


    // $ANTLR start "ruleLogicalExpressionPart"
    // InternalTemplateLang.g:2607:1: ruleLogicalExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) ) ) ;
    public final EObject ruleLogicalExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2610:28: ( ( ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) ) ) )
            // InternalTemplateLang.g:2611:1: ( ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) ) )
            {
            // InternalTemplateLang.g:2611:1: ( ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) ) )
            // InternalTemplateLang.g:2611:2: ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) )
            {
            // InternalTemplateLang.g:2611:2: ( (lv_op_0_0= ruleLogicalOperator ) )
            // InternalTemplateLang.g:2612:1: (lv_op_0_0= ruleLogicalOperator )
            {
            // InternalTemplateLang.g:2612:1: (lv_op_0_0= ruleLogicalOperator )
            // InternalTemplateLang.g:2613:3: lv_op_0_0= ruleLogicalOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalExpressionPartAccess().getOpLogicalOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
            lv_op_0_0=ruleLogicalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogicalExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.LogicalOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2629:2: ( (lv_ex_1_0= ruleEqualityExpression ) )
            // InternalTemplateLang.g:2630:1: (lv_ex_1_0= ruleEqualityExpression )
            {
            // InternalTemplateLang.g:2630:1: (lv_ex_1_0= ruleEqualityExpression )
            // InternalTemplateLang.g:2631:3: lv_ex_1_0= ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalExpressionPartAccess().getExEqualityExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_ex_1_0=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLogicalExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.EqualityExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalExpressionPart"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalTemplateLang.g:2655:1: entryRuleLogicalOperator returns [String current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final String entryRuleLogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOperator = null;


        try {
            // InternalTemplateLang.g:2656:2: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalTemplateLang.g:2657:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLogicalOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOperator=ruleLogicalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLogicalOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalTemplateLang.g:2664:1: ruleLogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2667:28: ( (kw= 'and' | kw= 'or' | kw= 'xor' ) )
            // InternalTemplateLang.g:2668:1: (kw= 'and' | kw= 'or' | kw= 'xor' )
            {
            // InternalTemplateLang.g:2668:1: (kw= 'and' | kw= 'or' | kw= 'xor' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt40=1;
                }
                break;
            case 47:
                {
                alt40=2;
                }
                break;
            case 48:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalTemplateLang.g:2669:2: kw= 'and'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getAndKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:2676:2: kw= 'or'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getOrKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:2683:2: kw= 'xor'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getXorKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "entryRuleEqualityExpression"
    // InternalTemplateLang.g:2696:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalTemplateLang.g:2697:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalTemplateLang.g:2698:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpression=ruleEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpression"


    // $ANTLR start "ruleEqualityExpression"
    // InternalTemplateLang.g:2705:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2708:28: ( ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )? ) )
            // InternalTemplateLang.g:2709:1: ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )? )
            {
            // InternalTemplateLang.g:2709:1: ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )? )
            // InternalTemplateLang.g:2709:2: ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )?
            {
            // InternalTemplateLang.g:2709:2: ( (lv_left_0_0= ruleRelationalExpression ) )
            // InternalTemplateLang.g:2710:1: (lv_left_0_0= ruleRelationalExpression )
            {
            // InternalTemplateLang.g:2710:1: (lv_left_0_0= ruleRelationalExpression )
            // InternalTemplateLang.g:2711:3: lv_left_0_0= ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getLeftRelationalExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_47);
            lv_left_0_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.RelationalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2727:2: ( (lv_right_1_0= ruleEqualityExpressionPart ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=49 && LA41_0<=51)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalTemplateLang.g:2728:1: (lv_right_1_0= ruleEqualityExpressionPart )
                    {
                    // InternalTemplateLang.g:2728:1: (lv_right_1_0= ruleEqualityExpressionPart )
                    // InternalTemplateLang.g:2729:3: lv_right_1_0= ruleEqualityExpressionPart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightEqualityExpressionPartParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_1_0=ruleEqualityExpressionPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEqualityExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.EqualityExpressionPart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpression"


    // $ANTLR start "entryRuleEqualityExpressionPart"
    // InternalTemplateLang.g:2753:1: entryRuleEqualityExpressionPart returns [EObject current=null] : iv_ruleEqualityExpressionPart= ruleEqualityExpressionPart EOF ;
    public final EObject entryRuleEqualityExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpressionPart = null;


        try {
            // InternalTemplateLang.g:2754:2: (iv_ruleEqualityExpressionPart= ruleEqualityExpressionPart EOF )
            // InternalTemplateLang.g:2755:2: iv_ruleEqualityExpressionPart= ruleEqualityExpressionPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityExpressionPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityExpressionPart=ruleEqualityExpressionPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityExpressionPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityExpressionPart"


    // $ANTLR start "ruleEqualityExpressionPart"
    // InternalTemplateLang.g:2762:1: ruleEqualityExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) ) ) ;
    public final EObject ruleEqualityExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2765:28: ( ( ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) ) ) )
            // InternalTemplateLang.g:2766:1: ( ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) ) )
            {
            // InternalTemplateLang.g:2766:1: ( ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) ) )
            // InternalTemplateLang.g:2766:2: ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) )
            {
            // InternalTemplateLang.g:2766:2: ( (lv_op_0_0= ruleEqualityOperator ) )
            // InternalTemplateLang.g:2767:1: (lv_op_0_0= ruleEqualityOperator )
            {
            // InternalTemplateLang.g:2767:1: (lv_op_0_0= ruleEqualityOperator )
            // InternalTemplateLang.g:2768:3: lv_op_0_0= ruleEqualityOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqualityExpressionPartAccess().getOpEqualityOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
            lv_op_0_0=ruleEqualityOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEqualityExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.EqualityOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2784:2: ( (lv_ex_1_0= ruleRelationalExpression ) )
            // InternalTemplateLang.g:2785:1: (lv_ex_1_0= ruleRelationalExpression )
            {
            // InternalTemplateLang.g:2785:1: (lv_ex_1_0= ruleRelationalExpression )
            // InternalTemplateLang.g:2786:3: lv_ex_1_0= ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqualityExpressionPartAccess().getExRelationalExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_ex_1_0=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEqualityExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.RelationalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityExpressionPart"


    // $ANTLR start "entryRuleEqualityOperator"
    // InternalTemplateLang.g:2810:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalTemplateLang.g:2811:2: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalTemplateLang.g:2812:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEqualityOperator=ruleEqualityOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualityOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEqualityOperator"


    // $ANTLR start "ruleEqualityOperator"
    // InternalTemplateLang.g:2819:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '<>' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2822:28: ( (kw= '==' | kw= '<>' | kw= '!=' ) )
            // InternalTemplateLang.g:2823:1: (kw= '==' | kw= '<>' | kw= '!=' )
            {
            // InternalTemplateLang.g:2823:1: (kw= '==' | kw= '<>' | kw= '!=' )
            int alt42=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt42=1;
                }
                break;
            case 50:
                {
                alt42=2;
                }
                break;
            case 51:
                {
                alt42=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // InternalTemplateLang.g:2824:2: kw= '=='
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:2831:2: kw= '<>'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:2838:2: kw= '!='
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getExclamationMarkEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEqualityOperator"


    // $ANTLR start "entryRuleRelationalExpression"
    // InternalTemplateLang.g:2851:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalTemplateLang.g:2852:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalTemplateLang.g:2853:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // InternalTemplateLang.g:2860:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2863:28: ( ( ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )? ) )
            // InternalTemplateLang.g:2864:1: ( ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )? )
            {
            // InternalTemplateLang.g:2864:1: ( ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )? )
            // InternalTemplateLang.g:2864:2: ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )?
            {
            // InternalTemplateLang.g:2864:2: ( (lv_left_0_0= ruleAdditiveExpression ) )
            // InternalTemplateLang.g:2865:1: (lv_left_0_0= ruleAdditiveExpression )
            {
            // InternalTemplateLang.g:2865:1: (lv_left_0_0= ruleAdditiveExpression )
            // InternalTemplateLang.g:2866:3: lv_left_0_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getLeftAdditiveExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_48);
            lv_left_0_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.AdditiveExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2882:2: ( (lv_right_1_0= ruleRelationalExpressionPart ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=52 && LA43_0<=55)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalTemplateLang.g:2883:1: (lv_right_1_0= ruleRelationalExpressionPart )
                    {
                    // InternalTemplateLang.g:2883:1: (lv_right_1_0= ruleRelationalExpressionPart )
                    // InternalTemplateLang.g:2884:3: lv_right_1_0= ruleRelationalExpressionPart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightRelationalExpressionPartParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_1_0=ruleRelationalExpressionPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.RelationalExpressionPart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleRelationalExpressionPart"
    // InternalTemplateLang.g:2908:1: entryRuleRelationalExpressionPart returns [EObject current=null] : iv_ruleRelationalExpressionPart= ruleRelationalExpressionPart EOF ;
    public final EObject entryRuleRelationalExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpressionPart = null;


        try {
            // InternalTemplateLang.g:2909:2: (iv_ruleRelationalExpressionPart= ruleRelationalExpressionPart EOF )
            // InternalTemplateLang.g:2910:2: iv_ruleRelationalExpressionPart= ruleRelationalExpressionPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalExpressionPart=ruleRelationalExpressionPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpressionPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalExpressionPart"


    // $ANTLR start "ruleRelationalExpressionPart"
    // InternalTemplateLang.g:2917:1: ruleRelationalExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) ) ) ;
    public final EObject ruleRelationalExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2920:28: ( ( ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) ) ) )
            // InternalTemplateLang.g:2921:1: ( ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) ) )
            {
            // InternalTemplateLang.g:2921:1: ( ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) ) )
            // InternalTemplateLang.g:2921:2: ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) )
            {
            // InternalTemplateLang.g:2921:2: ( (lv_op_0_0= ruleRelationalOperator ) )
            // InternalTemplateLang.g:2922:1: (lv_op_0_0= ruleRelationalOperator )
            {
            // InternalTemplateLang.g:2922:1: (lv_op_0_0= ruleRelationalOperator )
            // InternalTemplateLang.g:2923:3: lv_op_0_0= ruleRelationalOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationalExpressionPartAccess().getOpRelationalOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
            lv_op_0_0=ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationalExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.RelationalOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:2939:2: ( (lv_ex_1_0= ruleAdditiveExpression ) )
            // InternalTemplateLang.g:2940:1: (lv_ex_1_0= ruleAdditiveExpression )
            {
            // InternalTemplateLang.g:2940:1: (lv_ex_1_0= ruleAdditiveExpression )
            // InternalTemplateLang.g:2941:3: lv_ex_1_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationalExpressionPartAccess().getExAdditiveExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_ex_1_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationalExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.AdditiveExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalExpressionPart"


    // $ANTLR start "entryRuleRelationalOperator"
    // InternalTemplateLang.g:2965:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalTemplateLang.g:2966:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalTemplateLang.g:2967:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRelationalOperator=ruleRelationalOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationalOperator"


    // $ANTLR start "ruleRelationalOperator"
    // InternalTemplateLang.g:2974:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:2977:28: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // InternalTemplateLang.g:2978:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // InternalTemplateLang.g:2978:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt44=4;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt44=1;
                }
                break;
            case 53:
                {
                alt44=2;
                }
                break;
            case 54:
                {
                alt44=3;
                }
                break;
            case 55:
                {
                alt44=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // InternalTemplateLang.g:2979:2: kw= '>'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:2986:2: kw= '<'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:2993:2: kw= '>='
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalTemplateLang.g:3000:2: kw= '<='
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignEqualsSignKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationalOperator"


    // $ANTLR start "entryRuleAdditiveExpression"
    // InternalTemplateLang.g:3013:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalTemplateLang.g:3014:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalTemplateLang.g:3015:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // InternalTemplateLang.g:3022:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3025:28: ( ( ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )* ) )
            // InternalTemplateLang.g:3026:1: ( ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )* )
            {
            // InternalTemplateLang.g:3026:1: ( ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )* )
            // InternalTemplateLang.g:3026:2: ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )*
            {
            // InternalTemplateLang.g:3026:2: ( (lv_left_0_0= ruleMultiplicativeExpression ) )
            // InternalTemplateLang.g:3027:1: (lv_left_0_0= ruleMultiplicativeExpression )
            {
            // InternalTemplateLang.g:3027:1: (lv_left_0_0= ruleMultiplicativeExpression )
            // InternalTemplateLang.g:3028:3: lv_left_0_0= ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftMultiplicativeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_49);
            lv_left_0_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.MultiplicativeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:3044:2: ( (lv_right_1_0= ruleAdditiveExpressionPart ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=56 && LA45_0<=57)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalTemplateLang.g:3045:1: (lv_right_1_0= ruleAdditiveExpressionPart )
            	    {
            	    // InternalTemplateLang.g:3045:1: (lv_right_1_0= ruleAdditiveExpressionPart )
            	    // InternalTemplateLang.g:3046:3: lv_right_1_0= ruleAdditiveExpressionPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightAdditiveExpressionPartParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_right_1_0=ruleAdditiveExpressionPart();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"right",
            	              		lv_right_1_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.AdditiveExpressionPart");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveExpressionPart"
    // InternalTemplateLang.g:3070:1: entryRuleAdditiveExpressionPart returns [EObject current=null] : iv_ruleAdditiveExpressionPart= ruleAdditiveExpressionPart EOF ;
    public final EObject entryRuleAdditiveExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpressionPart = null;


        try {
            // InternalTemplateLang.g:3071:2: (iv_ruleAdditiveExpressionPart= ruleAdditiveExpressionPart EOF )
            // InternalTemplateLang.g:3072:2: iv_ruleAdditiveExpressionPart= ruleAdditiveExpressionPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveExpressionPart=ruleAdditiveExpressionPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpressionPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveExpressionPart"


    // $ANTLR start "ruleAdditiveExpressionPart"
    // InternalTemplateLang.g:3079:1: ruleAdditiveExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) ) ) ;
    public final EObject ruleAdditiveExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3082:28: ( ( ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) ) ) )
            // InternalTemplateLang.g:3083:1: ( ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) ) )
            {
            // InternalTemplateLang.g:3083:1: ( ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) ) )
            // InternalTemplateLang.g:3083:2: ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) )
            {
            // InternalTemplateLang.g:3083:2: ( (lv_op_0_0= ruleAdditiveOperator ) )
            // InternalTemplateLang.g:3084:1: (lv_op_0_0= ruleAdditiveOperator )
            {
            // InternalTemplateLang.g:3084:1: (lv_op_0_0= ruleAdditiveOperator )
            // InternalTemplateLang.g:3085:3: lv_op_0_0= ruleAdditiveOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionPartAccess().getOpAdditiveOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
            lv_op_0_0=ruleAdditiveOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.AdditiveOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:3101:2: ( (lv_ex_1_0= ruleMultiplicativeExpression ) )
            // InternalTemplateLang.g:3102:1: (lv_ex_1_0= ruleMultiplicativeExpression )
            {
            // InternalTemplateLang.g:3102:1: (lv_ex_1_0= ruleMultiplicativeExpression )
            // InternalTemplateLang.g:3103:3: lv_ex_1_0= ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionPartAccess().getExMultiplicativeExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_ex_1_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.MultiplicativeExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveExpressionPart"


    // $ANTLR start "entryRuleAdditiveOperator"
    // InternalTemplateLang.g:3127:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalTemplateLang.g:3128:2: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalTemplateLang.g:3129:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdditiveOperator=ruleAdditiveOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdditiveOperator"


    // $ANTLR start "ruleAdditiveOperator"
    // InternalTemplateLang.g:3136:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3139:28: ( (kw= '+' | kw= '-' ) )
            // InternalTemplateLang.g:3140:1: (kw= '+' | kw= '-' )
            {
            // InternalTemplateLang.g:3140:1: (kw= '+' | kw= '-' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==56) ) {
                alt46=1;
            }
            else if ( (LA46_0==57) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalTemplateLang.g:3141:2: kw= '+'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:3148:2: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getHyphenMinusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdditiveOperator"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // InternalTemplateLang.g:3161:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalTemplateLang.g:3162:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalTemplateLang.g:3163:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // InternalTemplateLang.g:3170:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )? ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3173:28: ( ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )? ) )
            // InternalTemplateLang.g:3174:1: ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )? )
            {
            // InternalTemplateLang.g:3174:1: ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )? )
            // InternalTemplateLang.g:3174:2: ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )?
            {
            // InternalTemplateLang.g:3174:2: ( (lv_left_0_0= ruleUnaryExpression ) )
            // InternalTemplateLang.g:3175:1: (lv_left_0_0= ruleUnaryExpression )
            {
            // InternalTemplateLang.g:3175:1: (lv_left_0_0= ruleUnaryExpression )
            // InternalTemplateLang.g:3176:3: lv_left_0_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getLeftUnaryExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_50);
            lv_left_0_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.UnaryExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:3192:2: ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=58 && LA47_0<=59)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalTemplateLang.g:3193:1: (lv_right_1_0= ruleMultiplicativeExpressionPart )
                    {
                    // InternalTemplateLang.g:3193:1: (lv_right_1_0= ruleMultiplicativeExpressionPart )
                    // InternalTemplateLang.g:3194:3: lv_right_1_0= ruleMultiplicativeExpressionPart
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMultiplicativeExpressionPartParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_1_0=ruleMultiplicativeExpressionPart();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.MultiplicativeExpressionPart");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleMultiplicativeExpressionPart"
    // InternalTemplateLang.g:3218:1: entryRuleMultiplicativeExpressionPart returns [EObject current=null] : iv_ruleMultiplicativeExpressionPart= ruleMultiplicativeExpressionPart EOF ;
    public final EObject entryRuleMultiplicativeExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpressionPart = null;


        try {
            // InternalTemplateLang.g:3219:2: (iv_ruleMultiplicativeExpressionPart= ruleMultiplicativeExpressionPart EOF )
            // InternalTemplateLang.g:3220:2: iv_ruleMultiplicativeExpressionPart= ruleMultiplicativeExpressionPart EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionPartRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeExpressionPart=ruleMultiplicativeExpressionPart();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpressionPart; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeExpressionPart"


    // $ANTLR start "ruleMultiplicativeExpressionPart"
    // InternalTemplateLang.g:3227:1: ruleMultiplicativeExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleMultiplicativeExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3230:28: ( ( ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) ) ) )
            // InternalTemplateLang.g:3231:1: ( ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) ) )
            {
            // InternalTemplateLang.g:3231:1: ( ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) ) )
            // InternalTemplateLang.g:3231:2: ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) )
            {
            // InternalTemplateLang.g:3231:2: ( (lv_op_0_0= ruleMultiplicativeOperator ) )
            // InternalTemplateLang.g:3232:1: (lv_op_0_0= ruleMultiplicativeOperator )
            {
            // InternalTemplateLang.g:3232:1: (lv_op_0_0= ruleMultiplicativeOperator )
            // InternalTemplateLang.g:3233:3: lv_op_0_0= ruleMultiplicativeOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionPartAccess().getOpMultiplicativeOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
            lv_op_0_0=ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"op",
                      		lv_op_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.MultiplicativeOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:3249:2: ( (lv_expr_1_0= ruleUnaryExpression ) )
            // InternalTemplateLang.g:3250:1: (lv_expr_1_0= ruleUnaryExpression )
            {
            // InternalTemplateLang.g:3250:1: (lv_expr_1_0= ruleUnaryExpression )
            // InternalTemplateLang.g:3251:3: lv_expr_1_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionPartAccess().getExprUnaryExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expr_1_0=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionPartRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.UnaryExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeExpressionPart"


    // $ANTLR start "entryRuleMultiplicativeOperator"
    // InternalTemplateLang.g:3275:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalTemplateLang.g:3276:2: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalTemplateLang.g:3277:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMultiplicativeOperator=ruleMultiplicativeOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplicativeOperator"


    // $ANTLR start "ruleMultiplicativeOperator"
    // InternalTemplateLang.g:3284:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3287:28: ( (kw= '*' | kw= '/' ) )
            // InternalTemplateLang.g:3288:1: (kw= '*' | kw= '/' )
            {
            // InternalTemplateLang.g:3288:1: (kw= '*' | kw= '/' )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            else if ( (LA48_0==59) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalTemplateLang.g:3289:2: kw= '*'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:3296:2: kw= '/'
                    {
                    kw=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getSolidusKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplicativeOperator"


    // $ANTLR start "entryRuleUnaryExpression"
    // InternalTemplateLang.g:3309:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalTemplateLang.g:3310:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalTemplateLang.g:3311:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryExpression=ruleUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryExpression"


    // $ANTLR start "ruleUnaryExpression"
    // InternalTemplateLang.g:3318:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3321:28: ( ( ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) ) ) )
            // InternalTemplateLang.g:3322:1: ( ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) ) )
            {
            // InternalTemplateLang.g:3322:1: ( ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) ) )
            // InternalTemplateLang.g:3322:2: ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) )
            {
            // InternalTemplateLang.g:3322:2: ( (lv_op_0_0= ruleUnaryOperator ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==57||(LA49_0>=60 && LA49_0<=61)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalTemplateLang.g:3323:1: (lv_op_0_0= ruleUnaryOperator )
                    {
                    // InternalTemplateLang.g:3323:1: (lv_op_0_0= ruleUnaryOperator )
                    // InternalTemplateLang.g:3324:3: lv_op_0_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_34);
                    lv_op_0_0=ruleUnaryOperator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"op",
                              		lv_op_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.UnaryOperator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:3340:3: ( (lv_expr_1_0= rulePostfixExpression ) )
            // InternalTemplateLang.g:3341:1: (lv_expr_1_0= rulePostfixExpression )
            {
            // InternalTemplateLang.g:3341:1: (lv_expr_1_0= rulePostfixExpression )
            // InternalTemplateLang.g:3342:3: lv_expr_1_0= rulePostfixExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getExprPostfixExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expr_1_0=rulePostfixExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnaryExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.PostfixExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryExpression"


    // $ANTLR start "entryRuleUnaryOperator"
    // InternalTemplateLang.g:3366:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalTemplateLang.g:3367:2: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalTemplateLang.g:3368:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnaryOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnaryOperator=ruleUnaryOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnaryOperator.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnaryOperator"


    // $ANTLR start "ruleUnaryOperator"
    // InternalTemplateLang.g:3375:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '!' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3378:28: ( (kw= 'not' | kw= '!' | kw= '-' ) )
            // InternalTemplateLang.g:3379:1: (kw= 'not' | kw= '!' | kw= '-' )
            {
            // InternalTemplateLang.g:3379:1: (kw= 'not' | kw= '!' | kw= '-' )
            int alt50=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt50=1;
                }
                break;
            case 61:
                {
                alt50=2;
                }
                break;
            case 57:
                {
                alt50=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalTemplateLang.g:3380:2: kw= 'not'
                    {
                    kw=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getNotKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:3387:2: kw= '!'
                    {
                    kw=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:3394:2: kw= '-'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getHyphenMinusKeyword_2()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "entryRulePostfixExpression"
    // InternalTemplateLang.g:3407:1: entryRulePostfixExpression returns [EObject current=null] : iv_rulePostfixExpression= rulePostfixExpression EOF ;
    public final EObject entryRulePostfixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixExpression = null;


        try {
            // InternalTemplateLang.g:3408:2: (iv_rulePostfixExpression= rulePostfixExpression EOF )
            // InternalTemplateLang.g:3409:2: iv_rulePostfixExpression= rulePostfixExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPostfixExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePostfixExpression=rulePostfixExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePostfixExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePostfixExpression"


    // $ANTLR start "rulePostfixExpression"
    // InternalTemplateLang.g:3416:1: rulePostfixExpression returns [EObject current=null] : ( (lv_left_0_0= rulePrimaryExpression ) ) ;
    public final EObject rulePostfixExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3419:28: ( ( (lv_left_0_0= rulePrimaryExpression ) ) )
            // InternalTemplateLang.g:3420:1: ( (lv_left_0_0= rulePrimaryExpression ) )
            {
            // InternalTemplateLang.g:3420:1: ( (lv_left_0_0= rulePrimaryExpression ) )
            // InternalTemplateLang.g:3421:1: (lv_left_0_0= rulePrimaryExpression )
            {
            // InternalTemplateLang.g:3421:1: (lv_left_0_0= rulePrimaryExpression )
            // InternalTemplateLang.g:3422:3: lv_left_0_0= rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPostfixExpressionAccess().getLeftPrimaryExpressionParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_left_0_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPostfixExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.PrimaryExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePostfixExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalTemplateLang.g:3446:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalTemplateLang.g:3447:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalTemplateLang.g:3448:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalTemplateLang.g:3455:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_newEx_3_0= ruleConstructorExecution ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_otherEx_0_0 = null;

        EObject lv_unqEx_1_0 = null;

        EObject lv_superEx_2_0 = null;

        EObject lv_newEx_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3458:28: ( ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_newEx_3_0= ruleConstructorExecution ) ) ) )
            // InternalTemplateLang.g:3459:1: ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_newEx_3_0= ruleConstructorExecution ) ) )
            {
            // InternalTemplateLang.g:3459:1: ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_newEx_3_0= ruleConstructorExecution ) ) )
            int alt51=4;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // InternalTemplateLang.g:3459:2: ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) )
                    {
                    // InternalTemplateLang.g:3459:2: ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) )
                    // InternalTemplateLang.g:3460:1: (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution )
                    {
                    // InternalTemplateLang.g:3460:1: (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution )
                    // InternalTemplateLang.g:3461:3: lv_otherEx_0_0= ruleExpressionOrQualifiedExecution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOtherExExpressionOrQualifiedExecutionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_otherEx_0_0=ruleExpressionOrQualifiedExecution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"otherEx",
                              		lv_otherEx_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ExpressionOrQualifiedExecution");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:3478:6: ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) )
                    {
                    // InternalTemplateLang.g:3478:6: ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) )
                    // InternalTemplateLang.g:3479:1: (lv_unqEx_1_0= ruleUnqualifiedExecution )
                    {
                    // InternalTemplateLang.g:3479:1: (lv_unqEx_1_0= ruleUnqualifiedExecution )
                    // InternalTemplateLang.g:3480:3: lv_unqEx_1_0= ruleUnqualifiedExecution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getUnqExUnqualifiedExecutionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_unqEx_1_0=ruleUnqualifiedExecution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"unqEx",
                              		lv_unqEx_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.UnqualifiedExecution");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:3497:6: ( (lv_superEx_2_0= ruleSuperExecution ) )
                    {
                    // InternalTemplateLang.g:3497:6: ( (lv_superEx_2_0= ruleSuperExecution ) )
                    // InternalTemplateLang.g:3498:1: (lv_superEx_2_0= ruleSuperExecution )
                    {
                    // InternalTemplateLang.g:3498:1: (lv_superEx_2_0= ruleSuperExecution )
                    // InternalTemplateLang.g:3499:3: lv_superEx_2_0= ruleSuperExecution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSuperExSuperExecutionParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_superEx_2_0=ruleSuperExecution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"superEx",
                              		lv_superEx_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.SuperExecution");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTemplateLang.g:3516:6: ( (lv_newEx_3_0= ruleConstructorExecution ) )
                    {
                    // InternalTemplateLang.g:3516:6: ( (lv_newEx_3_0= ruleConstructorExecution ) )
                    // InternalTemplateLang.g:3517:1: (lv_newEx_3_0= ruleConstructorExecution )
                    {
                    // InternalTemplateLang.g:3517:1: (lv_newEx_3_0= ruleConstructorExecution )
                    // InternalTemplateLang.g:3518:3: lv_newEx_3_0= ruleConstructorExecution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNewExConstructorExecutionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_newEx_3_0=ruleConstructorExecution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"newEx",
                              		lv_newEx_3_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ConstructorExecution");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleExpressionOrQualifiedExecution"
    // InternalTemplateLang.g:3542:1: entryRuleExpressionOrQualifiedExecution returns [EObject current=null] : iv_ruleExpressionOrQualifiedExecution= ruleExpressionOrQualifiedExecution EOF ;
    public final EObject entryRuleExpressionOrQualifiedExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOrQualifiedExecution = null;


        try {
            // InternalTemplateLang.g:3543:2: (iv_ruleExpressionOrQualifiedExecution= ruleExpressionOrQualifiedExecution EOF )
            // InternalTemplateLang.g:3544:2: iv_ruleExpressionOrQualifiedExecution= ruleExpressionOrQualifiedExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionOrQualifiedExecutionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpressionOrQualifiedExecution=ruleExpressionOrQualifiedExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionOrQualifiedExecution; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionOrQualifiedExecution"


    // $ANTLR start "ruleExpressionOrQualifiedExecution"
    // InternalTemplateLang.g:3551:1: ruleExpressionOrQualifiedExecution returns [EObject current=null] : ( ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )* ) ;
    public final EObject ruleExpressionOrQualifiedExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_val_0_0 = null;

        EObject lv_parenthesis_2_0 = null;

        EObject lv_calls_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3554:28: ( ( ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )* ) )
            // InternalTemplateLang.g:3555:1: ( ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )* )
            {
            // InternalTemplateLang.g:3555:1: ( ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )* )
            // InternalTemplateLang.g:3555:2: ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )*
            {
            // InternalTemplateLang.g:3555:2: ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_NUMBER && LA52_0<=RULE_EXPONENT)||LA52_0==44||(LA52_0>=68 && LA52_0<=70)) ) {
                alt52=1;
            }
            else if ( (LA52_0==14) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalTemplateLang.g:3555:3: ( (lv_val_0_0= ruleConstant ) )
                    {
                    // InternalTemplateLang.g:3555:3: ( (lv_val_0_0= ruleConstant ) )
                    // InternalTemplateLang.g:3556:1: (lv_val_0_0= ruleConstant )
                    {
                    // InternalTemplateLang.g:3556:1: (lv_val_0_0= ruleConstant )
                    // InternalTemplateLang.g:3557:3: lv_val_0_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionOrQualifiedExecutionAccess().getValConstantParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_51);
                    lv_val_0_0=ruleConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionOrQualifiedExecutionRule());
                      	        }
                             		set(
                             			current, 
                             			"val",
                              		lv_val_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Constant");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:3574:6: (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalTemplateLang.g:3574:6: (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalTemplateLang.g:3574:8: otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpressionOrQualifiedExecutionAccess().getLeftParenthesisKeyword_0_1_0());
                          
                    }
                    // InternalTemplateLang.g:3578:1: ( (lv_parenthesis_2_0= ruleExpression ) )
                    // InternalTemplateLang.g:3579:1: (lv_parenthesis_2_0= ruleExpression )
                    {
                    // InternalTemplateLang.g:3579:1: (lv_parenthesis_2_0= ruleExpression )
                    // InternalTemplateLang.g:3580:3: lv_parenthesis_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionOrQualifiedExecutionAccess().getParenthesisExpressionParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_parenthesis_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionOrQualifiedExecutionRule());
                      	        }
                             		set(
                             			current, 
                             			"parenthesis",
                              		lv_parenthesis_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExpressionOrQualifiedExecutionAccess().getRightParenthesisKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:3600:3: ( (lv_calls_4_0= ruleSubCall ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==39||(LA53_0>=64 && LA53_0<=65)) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalTemplateLang.g:3601:1: (lv_calls_4_0= ruleSubCall )
            	    {
            	    // InternalTemplateLang.g:3601:1: (lv_calls_4_0= ruleSubCall )
            	    // InternalTemplateLang.g:3602:3: lv_calls_4_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOrQualifiedExecutionAccess().getCallsSubCallParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_calls_4_0=ruleSubCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getExpressionOrQualifiedExecutionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"calls",
            	              		lv_calls_4_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.SubCall");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionOrQualifiedExecution"


    // $ANTLR start "entryRuleUnqualifiedExecution"
    // InternalTemplateLang.g:3626:1: entryRuleUnqualifiedExecution returns [EObject current=null] : iv_ruleUnqualifiedExecution= ruleUnqualifiedExecution EOF ;
    public final EObject entryRuleUnqualifiedExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualifiedExecution = null;


        try {
            // InternalTemplateLang.g:3627:2: (iv_ruleUnqualifiedExecution= ruleUnqualifiedExecution EOF )
            // InternalTemplateLang.g:3628:2: iv_ruleUnqualifiedExecution= ruleUnqualifiedExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnqualifiedExecutionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUnqualifiedExecution=ruleUnqualifiedExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnqualifiedExecution; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnqualifiedExecution"


    // $ANTLR start "ruleUnqualifiedExecution"
    // InternalTemplateLang.g:3635:1: ruleUnqualifiedExecution returns [EObject current=null] : ( ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )* ) ;
    public final EObject ruleUnqualifiedExecution() throws RecognitionException {
        EObject current = null;

        EObject lv_call_0_0 = null;

        EObject lv_calls_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3638:28: ( ( ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )* ) )
            // InternalTemplateLang.g:3639:1: ( ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )* )
            {
            // InternalTemplateLang.g:3639:1: ( ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )* )
            // InternalTemplateLang.g:3639:2: ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )*
            {
            // InternalTemplateLang.g:3639:2: ( (lv_call_0_0= ruleCall ) )
            // InternalTemplateLang.g:3640:1: (lv_call_0_0= ruleCall )
            {
            // InternalTemplateLang.g:3640:1: (lv_call_0_0= ruleCall )
            // InternalTemplateLang.g:3641:3: lv_call_0_0= ruleCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnqualifiedExecutionAccess().getCallCallParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_51);
            lv_call_0_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getUnqualifiedExecutionRule());
              	        }
                     		set(
                     			current, 
                     			"call",
                      		lv_call_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Call");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:3657:2: ( (lv_calls_1_0= ruleSubCall ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==39||(LA54_0>=64 && LA54_0<=65)) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalTemplateLang.g:3658:1: (lv_calls_1_0= ruleSubCall )
            	    {
            	    // InternalTemplateLang.g:3658:1: (lv_calls_1_0= ruleSubCall )
            	    // InternalTemplateLang.g:3659:3: lv_calls_1_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnqualifiedExecutionAccess().getCallsSubCallParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_calls_1_0=ruleSubCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getUnqualifiedExecutionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"calls",
            	              		lv_calls_1_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.SubCall");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnqualifiedExecution"


    // $ANTLR start "entryRuleSuperExecution"
    // InternalTemplateLang.g:3683:1: entryRuleSuperExecution returns [EObject current=null] : iv_ruleSuperExecution= ruleSuperExecution EOF ;
    public final EObject entryRuleSuperExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperExecution = null;


        try {
            // InternalTemplateLang.g:3684:2: (iv_ruleSuperExecution= ruleSuperExecution EOF )
            // InternalTemplateLang.g:3685:2: iv_ruleSuperExecution= ruleSuperExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSuperExecutionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSuperExecution=ruleSuperExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSuperExecution; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperExecution"


    // $ANTLR start "ruleSuperExecution"
    // InternalTemplateLang.g:3692:1: ruleSuperExecution returns [EObject current=null] : (otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )* ) ;
    public final EObject ruleSuperExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_call_2_0 = null;

        EObject lv_calls_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3695:28: ( (otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )* ) )
            // InternalTemplateLang.g:3696:1: (otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )* )
            {
            // InternalTemplateLang.g:3696:1: (otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )* )
            // InternalTemplateLang.g:3696:3: otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )*
            {
            otherlv_0=(Token)match(input,62,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSuperExecutionAccess().getSuperKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuperExecutionAccess().getFullStopKeyword_1());
                  
            }
            // InternalTemplateLang.g:3704:1: ( (lv_call_2_0= ruleCall ) )
            // InternalTemplateLang.g:3705:1: (lv_call_2_0= ruleCall )
            {
            // InternalTemplateLang.g:3705:1: (lv_call_2_0= ruleCall )
            // InternalTemplateLang.g:3706:3: lv_call_2_0= ruleCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSuperExecutionAccess().getCallCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_51);
            lv_call_2_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSuperExecutionRule());
              	        }
                     		set(
                     			current, 
                     			"call",
                      		lv_call_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Call");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:3722:2: ( (lv_calls_3_0= ruleSubCall ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==39||(LA55_0>=64 && LA55_0<=65)) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalTemplateLang.g:3723:1: (lv_calls_3_0= ruleSubCall )
            	    {
            	    // InternalTemplateLang.g:3723:1: (lv_calls_3_0= ruleSubCall )
            	    // InternalTemplateLang.g:3724:3: lv_calls_3_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSuperExecutionAccess().getCallsSubCallParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_calls_3_0=ruleSubCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSuperExecutionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"calls",
            	              		lv_calls_3_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.SubCall");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperExecution"


    // $ANTLR start "entryRuleConstructorExecution"
    // InternalTemplateLang.g:3748:1: entryRuleConstructorExecution returns [EObject current=null] : iv_ruleConstructorExecution= ruleConstructorExecution EOF ;
    public final EObject entryRuleConstructorExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorExecution = null;


        try {
            // InternalTemplateLang.g:3749:2: (iv_ruleConstructorExecution= ruleConstructorExecution EOF )
            // InternalTemplateLang.g:3750:2: iv_ruleConstructorExecution= ruleConstructorExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstructorExecutionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstructorExecution=ruleConstructorExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstructorExecution; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstructorExecution"


    // $ANTLR start "ruleConstructorExecution"
    // InternalTemplateLang.g:3757:1: ruleConstructorExecution returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )* ) ;
    public final EObject ruleConstructorExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_type_1_0 = null;

        EObject lv_param_3_0 = null;

        EObject lv_calls_5_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3760:28: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )* ) )
            // InternalTemplateLang.g:3761:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )* )
            {
            // InternalTemplateLang.g:3761:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )* )
            // InternalTemplateLang.g:3761:3: otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )*
            {
            otherlv_0=(Token)match(input,63,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstructorExecutionAccess().getNewKeyword_0());
                  
            }
            // InternalTemplateLang.g:3765:1: ( (lv_type_1_0= ruleType ) )
            // InternalTemplateLang.g:3766:1: (lv_type_1_0= ruleType )
            {
            // InternalTemplateLang.g:3766:1: (lv_type_1_0= ruleType )
            // InternalTemplateLang.g:3767:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorExecutionAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
            lv_type_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getConstructorExecutionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstructorExecutionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalTemplateLang.g:3787:1: ( (lv_param_3_0= ruleArgumentList ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( ((LA56_0>=RULE_NUMBER && LA56_0<=RULE_EXPONENT)||LA56_0==14||LA56_0==17||LA56_0==44||LA56_0==57||(LA56_0>=60 && LA56_0<=63)||(LA56_0>=68 && LA56_0<=70)) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalTemplateLang.g:3788:1: (lv_param_3_0= ruleArgumentList )
                    {
                    // InternalTemplateLang.g:3788:1: (lv_param_3_0= ruleArgumentList )
                    // InternalTemplateLang.g:3789:3: lv_param_3_0= ruleArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructorExecutionAccess().getParamArgumentListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_param_3_0=ruleArgumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstructorExecutionRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_3_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ArgumentList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructorExecutionAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalTemplateLang.g:3809:1: ( (lv_calls_5_0= ruleSubCall ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==39||(LA57_0>=64 && LA57_0<=65)) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalTemplateLang.g:3810:1: (lv_calls_5_0= ruleSubCall )
            	    {
            	    // InternalTemplateLang.g:3810:1: (lv_calls_5_0= ruleSubCall )
            	    // InternalTemplateLang.g:3811:3: lv_calls_5_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructorExecutionAccess().getCallsSubCallParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_calls_5_0=ruleSubCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConstructorExecutionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"calls",
            	              		lv_calls_5_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.SubCall");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstructorExecution"


    // $ANTLR start "entryRuleSubCall"
    // InternalTemplateLang.g:3835:1: entryRuleSubCall returns [EObject current=null] : iv_ruleSubCall= ruleSubCall EOF ;
    public final EObject entryRuleSubCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCall = null;


        try {
            // InternalTemplateLang.g:3836:2: (iv_ruleSubCall= ruleSubCall EOF )
            // InternalTemplateLang.g:3837:2: iv_ruleSubCall= ruleSubCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSubCall=ruleSubCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubCall"


    // $ANTLR start "ruleSubCall"
    // InternalTemplateLang.g:3844:1: ruleSubCall returns [EObject current=null] : ( ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) ) | (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ;
    public final EObject ruleSubCall() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_call_1_0 = null;

        EObject lv_arrayEx_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3847:28: ( ( ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) ) | (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' ) ) )
            // InternalTemplateLang.g:3848:1: ( ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) ) | (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            {
            // InternalTemplateLang.g:3848:1: ( ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) ) | (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==39||LA59_0==64) ) {
                alt59=1;
            }
            else if ( (LA59_0==65) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalTemplateLang.g:3848:2: ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) )
                    {
                    // InternalTemplateLang.g:3848:2: ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) )
                    // InternalTemplateLang.g:3848:3: ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) )
                    {
                    // InternalTemplateLang.g:3848:3: ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) )
                    // InternalTemplateLang.g:3849:1: ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) )
                    {
                    // InternalTemplateLang.g:3849:1: ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) )
                    // InternalTemplateLang.g:3850:1: (lv_type_0_1= '.' | lv_type_0_2= '->' )
                    {
                    // InternalTemplateLang.g:3850:1: (lv_type_0_1= '.' | lv_type_0_2= '->' )
                    int alt58=2;
                    int LA58_0 = input.LA(1);

                    if ( (LA58_0==39) ) {
                        alt58=1;
                    }
                    else if ( (LA58_0==64) ) {
                        alt58=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 58, 0, input);

                        throw nvae;
                    }
                    switch (alt58) {
                        case 1 :
                            // InternalTemplateLang.g:3851:3: lv_type_0_1= '.'
                            {
                            lv_type_0_1=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_0_1, grammarAccess.getSubCallAccess().getTypeFullStopKeyword_0_0_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSubCallRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_0_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalTemplateLang.g:3863:8: lv_type_0_2= '->'
                            {
                            lv_type_0_2=(Token)match(input,64,FOLLOW_8); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_type_0_2, grammarAccess.getSubCallAccess().getTypeHyphenMinusGreaterThanSignKeyword_0_0_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getSubCallRule());
                              	        }
                                     		setWithLastConsumed(current, "type", lv_type_0_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    // InternalTemplateLang.g:3878:2: ( (lv_call_1_0= ruleCall ) )
                    // InternalTemplateLang.g:3879:1: (lv_call_1_0= ruleCall )
                    {
                    // InternalTemplateLang.g:3879:1: (lv_call_1_0= ruleCall )
                    // InternalTemplateLang.g:3880:3: lv_call_1_0= ruleCall
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubCallAccess().getCallCallParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_call_1_0=ruleCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubCallRule());
                      	        }
                             		set(
                             			current, 
                             			"call",
                              		lv_call_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Call");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:3897:6: (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' )
                    {
                    // InternalTemplateLang.g:3897:6: (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' )
                    // InternalTemplateLang.g:3897:8: otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // InternalTemplateLang.g:3901:1: ( (lv_arrayEx_3_0= ruleExpression ) )
                    // InternalTemplateLang.g:3902:1: (lv_arrayEx_3_0= ruleExpression )
                    {
                    // InternalTemplateLang.g:3902:1: (lv_arrayEx_3_0= ruleExpression )
                    // InternalTemplateLang.g:3903:3: lv_arrayEx_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubCallAccess().getArrayExExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_54);
                    lv_arrayEx_3_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSubCallRule());
                      	        }
                             		set(
                             			current, 
                             			"arrayEx",
                              		lv_arrayEx_3_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getSubCallAccess().getRightSquareBracketKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubCall"


    // $ANTLR start "entryRuleDeclarator"
    // InternalTemplateLang.g:3931:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // InternalTemplateLang.g:3932:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // InternalTemplateLang.g:3933:2: iv_ruleDeclarator= ruleDeclarator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclaratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclarator=ruleDeclarator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarator"


    // $ANTLR start "ruleDeclarator"
    // InternalTemplateLang.g:3940:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|' ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decl_0_0 = null;

        EObject lv_decl_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:3943:28: ( ( ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|' ) )
            // InternalTemplateLang.g:3944:1: ( ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|' )
            {
            // InternalTemplateLang.g:3944:1: ( ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|' )
            // InternalTemplateLang.g:3944:2: ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|'
            {
            // InternalTemplateLang.g:3944:2: ( (lv_decl_0_0= ruleDeclaration ) )
            // InternalTemplateLang.g:3945:1: (lv_decl_0_0= ruleDeclaration )
            {
            // InternalTemplateLang.g:3945:1: (lv_decl_0_0= ruleDeclaration )
            // InternalTemplateLang.g:3946:3: lv_decl_0_0= ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDeclDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_55);
            lv_decl_0_0=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
              	        }
                     		add(
                     			current, 
                     			"decl",
                      		lv_decl_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Declaration");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:3962:2: (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==25) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalTemplateLang.g:3962:4: otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDeclaratorAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    // InternalTemplateLang.g:3966:1: ( (lv_decl_2_0= ruleDeclaration ) )
            	    // InternalTemplateLang.g:3967:1: (lv_decl_2_0= ruleDeclaration )
            	    {
            	    // InternalTemplateLang.g:3967:1: (lv_decl_2_0= ruleDeclaration )
            	    // InternalTemplateLang.g:3968:3: lv_decl_2_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDeclDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_decl_2_0=ruleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclaratorRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"decl",
            	              		lv_decl_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Declaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);

            otherlv_3=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDeclaratorAccess().getVerticalLineKeyword_2());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarator"


    // $ANTLR start "entryRuleDeclaration"
    // InternalTemplateLang.g:3996:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalTemplateLang.g:3997:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalTemplateLang.g:3998:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalTemplateLang.g:4005:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )* ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_units_1_0 = null;

        EObject lv_units_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4008:28: ( ( ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )* ) )
            // InternalTemplateLang.g:4009:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )* )
            {
            // InternalTemplateLang.g:4009:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )* )
            // InternalTemplateLang.g:4009:2: ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )*
            {
            // InternalTemplateLang.g:4009:2: ( (lv_type_0_0= ruleType ) )?
            int alt61=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA61_1 = input.LA(2);

                    if ( ((LA61_1>=RULE_VERSION && LA61_1<=RULE_EXPONENT)||LA61_1==44||LA61_1==67) ) {
                        alt61=1;
                    }
                    }
                    break;
                case RULE_VERSION:
                    {
                    int LA61_2 = input.LA(2);

                    if ( ((LA61_2>=RULE_VERSION && LA61_2<=RULE_EXPONENT)||LA61_2==44||LA61_2==67) ) {
                        alt61=1;
                    }
                    }
                    break;
                case RULE_EXPONENT:
                    {
                    int LA61_3 = input.LA(2);

                    if ( ((LA61_3>=RULE_VERSION && LA61_3<=RULE_EXPONENT)||LA61_3==44||LA61_3==67) ) {
                        alt61=1;
                    }
                    }
                    break;
                case 44:
                    {
                    int LA61_4 = input.LA(2);

                    if ( ((LA61_4>=RULE_VERSION && LA61_4<=RULE_EXPONENT)||LA61_4==44||LA61_4==67) ) {
                        alt61=1;
                    }
                    }
                    break;
                case 71:
                case 72:
                case 73:
                case 74:
                    {
                    alt61=1;
                    }
                    break;
            }

            switch (alt61) {
                case 1 :
                    // InternalTemplateLang.g:4010:1: (lv_type_0_0= ruleType )
                    {
                    // InternalTemplateLang.g:4010:1: (lv_type_0_0= ruleType )
                    // InternalTemplateLang.g:4011:3: lv_type_0_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
                    lv_type_0_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"type",
                              		lv_type_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:4027:3: ( (lv_units_1_0= ruleDeclarationUnit ) )
            // InternalTemplateLang.g:4028:1: (lv_units_1_0= ruleDeclarationUnit )
            {
            // InternalTemplateLang.g:4028:1: (lv_units_1_0= ruleDeclarationUnit )
            // InternalTemplateLang.g:4029:3: lv_units_1_0= ruleDeclarationUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getUnitsDeclarationUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_42);
            lv_units_1_0=ruleDeclarationUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
              	        }
                     		add(
                     			current, 
                     			"units",
                      		lv_units_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.DeclarationUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:4045:2: (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==20) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalTemplateLang.g:4045:4: otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalTemplateLang.g:4049:1: ( (lv_units_3_0= ruleDeclarationUnit ) )
            	    // InternalTemplateLang.g:4050:1: (lv_units_3_0= ruleDeclarationUnit )
            	    {
            	    // InternalTemplateLang.g:4050:1: (lv_units_3_0= ruleDeclarationUnit )
            	    // InternalTemplateLang.g:4051:3: lv_units_3_0= ruleDeclarationUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getUnitsDeclarationUnitParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_units_3_0=ruleDeclarationUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDeclarationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"units",
            	              		lv_units_3_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.DeclarationUnit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleDeclarationUnit"
    // InternalTemplateLang.g:4075:1: entryRuleDeclarationUnit returns [EObject current=null] : iv_ruleDeclarationUnit= ruleDeclarationUnit EOF ;
    public final EObject entryRuleDeclarationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationUnit = null;


        try {
            // InternalTemplateLang.g:4076:2: (iv_ruleDeclarationUnit= ruleDeclarationUnit EOF )
            // InternalTemplateLang.g:4077:2: iv_ruleDeclarationUnit= ruleDeclarationUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDeclarationUnitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDeclarationUnit=ruleDeclarationUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDeclarationUnit; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclarationUnit"


    // $ANTLR start "ruleDeclarationUnit"
    // InternalTemplateLang.g:4084:1: ruleDeclarationUnit returns [EObject current=null] : ( ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDeclarationUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_deflt_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4087:28: ( ( ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )? ) )
            // InternalTemplateLang.g:4088:1: ( ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )? )
            {
            // InternalTemplateLang.g:4088:1: ( ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )? )
            // InternalTemplateLang.g:4088:2: ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )?
            {
            // InternalTemplateLang.g:4088:2: ( (lv_id_0_0= ruleIdentifier ) )
            // InternalTemplateLang.g:4089:1: (lv_id_0_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:4089:1: (lv_id_0_0= ruleIdentifier )
            // InternalTemplateLang.g:4090:3: lv_id_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationUnitAccess().getIdIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_56);
            lv_id_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDeclarationUnitRule());
              	        }
                     		set(
                     			current, 
                     			"id",
                      		lv_id_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:4106:2: (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==21) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalTemplateLang.g:4106:4: otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDeclarationUnitAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // InternalTemplateLang.g:4110:1: ( (lv_deflt_2_0= ruleExpression ) )
                    // InternalTemplateLang.g:4111:1: (lv_deflt_2_0= ruleExpression )
                    {
                    // InternalTemplateLang.g:4111:1: (lv_deflt_2_0= ruleExpression )
                    // InternalTemplateLang.g:4112:3: lv_deflt_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationUnitAccess().getDefltExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_deflt_2_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDeclarationUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"deflt",
                              		lv_deflt_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclarationUnit"


    // $ANTLR start "entryRuleCall"
    // InternalTemplateLang.g:4136:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalTemplateLang.g:4137:2: (iv_ruleCall= ruleCall EOF )
            // InternalTemplateLang.g:4138:2: iv_ruleCall= ruleCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalTemplateLang.g:4145:1: ruleCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_name_0_0 = null;

        EObject lv_decl_2_0 = null;

        EObject lv_param_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4148:28: ( ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ) )
            // InternalTemplateLang.g:4149:1: ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' )
            {
            // InternalTemplateLang.g:4149:1: ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' )
            // InternalTemplateLang.g:4149:2: ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')'
            {
            // InternalTemplateLang.g:4149:2: ( (lv_name_0_0= ruleQualifiedPrefix ) )
            // InternalTemplateLang.g:4150:1: (lv_name_0_0= ruleQualifiedPrefix )
            {
            // InternalTemplateLang.g:4150:1: (lv_name_0_0= ruleQualifiedPrefix )
            // InternalTemplateLang.g:4151:3: lv_name_0_0= ruleQualifiedPrefix
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCallAccess().getNameQualifiedPrefixParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleQualifiedPrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCallRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.QualifiedPrefix");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalTemplateLang.g:4171:1: ( (lv_decl_2_0= ruleDeclarator ) )?
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalTemplateLang.g:4172:1: (lv_decl_2_0= ruleDeclarator )
                    {
                    // InternalTemplateLang.g:4172:1: (lv_decl_2_0= ruleDeclarator )
                    // InternalTemplateLang.g:4173:3: lv_decl_2_0= ruleDeclarator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getDeclDeclaratorParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_53);
                    lv_decl_2_0=ruleDeclarator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCallRule());
                      	        }
                             		set(
                             			current, 
                             			"decl",
                              		lv_decl_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Declarator");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalTemplateLang.g:4189:3: ( (lv_param_3_0= ruleArgumentList ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( ((LA65_0>=RULE_NUMBER && LA65_0<=RULE_EXPONENT)||LA65_0==14||LA65_0==17||LA65_0==44||LA65_0==57||(LA65_0>=60 && LA65_0<=63)||(LA65_0>=68 && LA65_0<=70)) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalTemplateLang.g:4190:1: (lv_param_3_0= ruleArgumentList )
                    {
                    // InternalTemplateLang.g:4190:1: (lv_param_3_0= ruleArgumentList )
                    // InternalTemplateLang.g:4191:3: lv_param_3_0= ruleArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getParamArgumentListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_param_3_0=ruleArgumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCallRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_3_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ArgumentList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCallAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleArgumentList"
    // InternalTemplateLang.g:4219:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalTemplateLang.g:4220:2: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalTemplateLang.g:4221:2: iv_ruleArgumentList= ruleArgumentList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentListRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArgumentList=ruleArgumentList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentList; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArgumentList"


    // $ANTLR start "ruleArgumentList"
    // InternalTemplateLang.g:4228:1: ruleArgumentList returns [EObject current=null] : ( ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )* ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_param_0_0 = null;

        EObject lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4231:28: ( ( ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )* ) )
            // InternalTemplateLang.g:4232:1: ( ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )* )
            {
            // InternalTemplateLang.g:4232:1: ( ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )* )
            // InternalTemplateLang.g:4232:2: ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )*
            {
            // InternalTemplateLang.g:4232:2: ( (lv_param_0_0= ruleNamedArgument ) )
            // InternalTemplateLang.g:4233:1: (lv_param_0_0= ruleNamedArgument )
            {
            // InternalTemplateLang.g:4233:1: (lv_param_0_0= ruleNamedArgument )
            // InternalTemplateLang.g:4234:3: lv_param_0_0= ruleNamedArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentListAccess().getParamNamedArgumentParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_42);
            lv_param_0_0=ruleNamedArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getArgumentListRule());
              	        }
                     		add(
                     			current, 
                     			"param",
                      		lv_param_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.NamedArgument");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:4250:2: (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==20) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalTemplateLang.g:4250:4: otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) )
            	    {
            	    otherlv_1=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalTemplateLang.g:4254:1: ( (lv_param_2_0= ruleNamedArgument ) )
            	    // InternalTemplateLang.g:4255:1: (lv_param_2_0= ruleNamedArgument )
            	    {
            	    // InternalTemplateLang.g:4255:1: (lv_param_2_0= ruleNamedArgument )
            	    // InternalTemplateLang.g:4256:3: lv_param_2_0= ruleNamedArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgumentListAccess().getParamNamedArgumentParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_param_2_0=ruleNamedArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getArgumentListRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"param",
            	              		lv_param_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.NamedArgument");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArgumentList"


    // $ANTLR start "entryRuleNamedArgument"
    // InternalTemplateLang.g:4280:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalTemplateLang.g:4281:2: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalTemplateLang.g:4282:2: iv_ruleNamedArgument= ruleNamedArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNamedArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNamedArgument=ruleNamedArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNamedArgument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedArgument"


    // $ANTLR start "ruleNamedArgument"
    // InternalTemplateLang.g:4289:1: ruleNamedArgument returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ex_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4292:28: ( ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) ) ) )
            // InternalTemplateLang.g:4293:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) ) )
            {
            // InternalTemplateLang.g:4293:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) ) )
            // InternalTemplateLang.g:4293:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) )
            {
            // InternalTemplateLang.g:4293:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )?
            int alt67=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA67_1 = input.LA(2);

                    if ( (LA67_1==21) ) {
                        alt67=1;
                    }
                    }
                    break;
                case RULE_VERSION:
                    {
                    int LA67_2 = input.LA(2);

                    if ( (LA67_2==21) ) {
                        alt67=1;
                    }
                    }
                    break;
                case RULE_EXPONENT:
                    {
                    int LA67_3 = input.LA(2);

                    if ( (LA67_3==21) ) {
                        alt67=1;
                    }
                    }
                    break;
                case 44:
                    {
                    int LA67_4 = input.LA(2);

                    if ( (LA67_4==21) ) {
                        alt67=1;
                    }
                    }
                    break;
            }

            switch (alt67) {
                case 1 :
                    // InternalTemplateLang.g:4293:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '='
                    {
                    // InternalTemplateLang.g:4293:3: ( (lv_name_0_0= ruleIdentifier ) )
                    // InternalTemplateLang.g:4294:1: (lv_name_0_0= ruleIdentifier )
                    {
                    // InternalTemplateLang.g:4294:1: (lv_name_0_0= ruleIdentifier )
                    // InternalTemplateLang.g:4295:3: lv_name_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNamedArgumentAccess().getNameIdentifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
                    lv_name_0_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNamedArgumentRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,21,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // InternalTemplateLang.g:4315:3: ( (lv_ex_2_0= ruleExpression ) )
            // InternalTemplateLang.g:4316:1: (lv_ex_2_0= ruleExpression )
            {
            // InternalTemplateLang.g:4316:1: (lv_ex_2_0= ruleExpression )
            // InternalTemplateLang.g:4317:3: lv_ex_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNamedArgumentAccess().getExExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_ex_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNamedArgumentRule());
              	        }
                     		set(
                     			current, 
                     			"ex",
                      		lv_ex_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedArgument"


    // $ANTLR start "entryRuleQualifiedPrefix"
    // InternalTemplateLang.g:4341:1: entryRuleQualifiedPrefix returns [EObject current=null] : iv_ruleQualifiedPrefix= ruleQualifiedPrefix EOF ;
    public final EObject entryRuleQualifiedPrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPrefix = null;


        try {
            // InternalTemplateLang.g:4342:2: (iv_ruleQualifiedPrefix= ruleQualifiedPrefix EOF )
            // InternalTemplateLang.g:4343:2: iv_ruleQualifiedPrefix= ruleQualifiedPrefix EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedPrefixRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedPrefix=ruleQualifiedPrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedPrefix; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedPrefix"


    // $ANTLR start "ruleQualifiedPrefix"
    // InternalTemplateLang.g:4350:1: ruleQualifiedPrefix returns [EObject current=null] : ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) ;
    public final EObject ruleQualifiedPrefix() throws RecognitionException {
        EObject current = null;

        Token lv_qname_1_0=null;
        AntlrDatatypeRuleToken lv_qname_0_0 = null;

        AntlrDatatypeRuleToken lv_qname_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4353:28: ( ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) )
            // InternalTemplateLang.g:4354:1: ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            {
            // InternalTemplateLang.g:4354:1: ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            // InternalTemplateLang.g:4354:2: ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            {
            // InternalTemplateLang.g:4354:2: ( (lv_qname_0_0= ruleIdentifier ) )
            // InternalTemplateLang.g:4355:1: (lv_qname_0_0= ruleIdentifier )
            {
            // InternalTemplateLang.g:4355:1: (lv_qname_0_0= ruleIdentifier )
            // InternalTemplateLang.g:4356:3: lv_qname_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualifiedPrefixAccess().getQnameIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_58);
            lv_qname_0_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQualifiedPrefixRule());
              	        }
                     		add(
                     			current, 
                     			"qname",
                      		lv_qname_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:4372:2: ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==67) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalTemplateLang.g:4372:3: ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) )
            	    {
            	    // InternalTemplateLang.g:4372:3: ( (lv_qname_1_0= '::' ) )
            	    // InternalTemplateLang.g:4373:1: (lv_qname_1_0= '::' )
            	    {
            	    // InternalTemplateLang.g:4373:1: (lv_qname_1_0= '::' )
            	    // InternalTemplateLang.g:4374:3: lv_qname_1_0= '::'
            	    {
            	    lv_qname_1_0=(Token)match(input,67,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_qname_1_0, grammarAccess.getQualifiedPrefixAccess().getQnameColonColonKeyword_1_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQualifiedPrefixRule());
            	      	        }
            	             		addWithLastConsumed(current, "qname", lv_qname_1_0, "::");
            	      	    
            	    }

            	    }


            	    }

            	    // InternalTemplateLang.g:4387:2: ( (lv_qname_2_0= ruleIdentifier ) )
            	    // InternalTemplateLang.g:4388:1: (lv_qname_2_0= ruleIdentifier )
            	    {
            	    // InternalTemplateLang.g:4388:1: (lv_qname_2_0= ruleIdentifier )
            	    // InternalTemplateLang.g:4389:3: lv_qname_2_0= ruleIdentifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedPrefixAccess().getQnameIdentifierParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_qname_2_0=ruleIdentifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQualifiedPrefixRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"qname",
            	              		lv_qname_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedPrefix"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalTemplateLang.g:4413:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalTemplateLang.g:4414:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalTemplateLang.g:4415:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalTemplateLang.g:4422:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_qname_1_0=null;
        EObject lv_prefix_0_0 = null;

        AntlrDatatypeRuleToken lv_qname_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4425:28: ( ( ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) )
            // InternalTemplateLang.g:4426:1: ( ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            {
            // InternalTemplateLang.g:4426:1: ( ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            // InternalTemplateLang.g:4426:2: ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            {
            // InternalTemplateLang.g:4426:2: ( (lv_prefix_0_0= ruleQualifiedPrefix ) )
            // InternalTemplateLang.g:4427:1: (lv_prefix_0_0= ruleQualifiedPrefix )
            {
            // InternalTemplateLang.g:4427:1: (lv_prefix_0_0= ruleQualifiedPrefix )
            // InternalTemplateLang.g:4428:3: lv_prefix_0_0= ruleQualifiedPrefix
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualifiedNameAccess().getPrefixQualifiedPrefixParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
            lv_prefix_0_0=ruleQualifiedPrefix();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
              	        }
                     		set(
                     			current, 
                     			"prefix",
                      		lv_prefix_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.QualifiedPrefix");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:4444:2: ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==39) ) {
                    switch ( input.LA(2) ) {
                    case RULE_ID:
                        {
                        int LA69_3 = input.LA(3);

                        if ( (LA69_3==EOF||LA69_3==13||LA69_3==15||(LA69_3>=17 && LA69_3<=20)||LA69_3==22||LA69_3==25||LA69_3==29||LA69_3==32||LA69_3==39||LA69_3==42||(LA69_3>=46 && LA69_3<=59)||(LA69_3>=64 && LA69_3<=66)) ) {
                            alt69=1;
                        }


                        }
                        break;
                    case RULE_VERSION:
                        {
                        int LA69_4 = input.LA(3);

                        if ( (LA69_4==EOF||LA69_4==13||LA69_4==15||(LA69_4>=17 && LA69_4<=20)||LA69_4==22||LA69_4==25||LA69_4==29||LA69_4==32||LA69_4==39||LA69_4==42||(LA69_4>=46 && LA69_4<=59)||(LA69_4>=64 && LA69_4<=66)) ) {
                            alt69=1;
                        }


                        }
                        break;
                    case RULE_EXPONENT:
                        {
                        int LA69_5 = input.LA(3);

                        if ( (LA69_5==EOF||LA69_5==13||LA69_5==15||(LA69_5>=17 && LA69_5<=20)||LA69_5==22||LA69_5==25||LA69_5==29||LA69_5==32||LA69_5==39||LA69_5==42||(LA69_5>=46 && LA69_5<=59)||(LA69_5>=64 && LA69_5<=66)) ) {
                            alt69=1;
                        }


                        }
                        break;
                    case 44:
                        {
                        int LA69_6 = input.LA(3);

                        if ( (LA69_6==EOF||LA69_6==13||LA69_6==15||(LA69_6>=17 && LA69_6<=20)||LA69_6==22||LA69_6==25||LA69_6==29||LA69_6==32||LA69_6==39||LA69_6==42||(LA69_6>=46 && LA69_6<=59)||(LA69_6>=64 && LA69_6<=66)) ) {
                            alt69=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt69) {
            	case 1 :
            	    // InternalTemplateLang.g:4444:3: ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) )
            	    {
            	    // InternalTemplateLang.g:4444:3: ( (lv_qname_1_0= '.' ) )
            	    // InternalTemplateLang.g:4445:1: (lv_qname_1_0= '.' )
            	    {
            	    // InternalTemplateLang.g:4445:1: (lv_qname_1_0= '.' )
            	    // InternalTemplateLang.g:4446:3: lv_qname_1_0= '.'
            	    {
            	    lv_qname_1_0=(Token)match(input,39,FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_qname_1_0, grammarAccess.getQualifiedNameAccess().getQnameFullStopKeyword_1_0_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getQualifiedNameRule());
            	      	        }
            	             		addWithLastConsumed(current, "qname", lv_qname_1_0, ".");
            	      	    
            	    }

            	    }


            	    }

            	    // InternalTemplateLang.g:4459:2: ( (lv_qname_2_0= ruleIdentifier ) )
            	    // InternalTemplateLang.g:4460:1: (lv_qname_2_0= ruleIdentifier )
            	    {
            	    // InternalTemplateLang.g:4460:1: (lv_qname_2_0= ruleIdentifier )
            	    // InternalTemplateLang.g:4461:3: lv_qname_2_0= ruleIdentifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedNameAccess().getQnameIdentifierParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_qname_2_0=ruleIdentifier();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"qname",
            	              		lv_qname_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleConstant"
    // InternalTemplateLang.g:4485:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalTemplateLang.g:4486:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalTemplateLang.g:4487:2: iv_ruleConstant= ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalTemplateLang.g:4494:1: ruleConstant returns [EObject current=null] : ( ( (lv_nValue_0_0= ruleNumValue ) ) | ( (lv_sValue_1_0= RULE_STRING ) ) | ( (lv_qValue_2_0= ruleQualifiedName ) ) | ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) ) | ( (lv_null_4_0= 'null' ) ) | ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_sValue_1_0=null;
        Token lv_bValue_3_1=null;
        Token lv_bValue_3_2=null;
        Token lv_null_4_0=null;
        Token lv_version_5_0=null;
        EObject lv_nValue_0_0 = null;

        EObject lv_qValue_2_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4497:28: ( ( ( (lv_nValue_0_0= ruleNumValue ) ) | ( (lv_sValue_1_0= RULE_STRING ) ) | ( (lv_qValue_2_0= ruleQualifiedName ) ) | ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) ) | ( (lv_null_4_0= 'null' ) ) | ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) ) ) )
            // InternalTemplateLang.g:4498:1: ( ( (lv_nValue_0_0= ruleNumValue ) ) | ( (lv_sValue_1_0= RULE_STRING ) ) | ( (lv_qValue_2_0= ruleQualifiedName ) ) | ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) ) | ( (lv_null_4_0= 'null' ) ) | ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) ) )
            {
            // InternalTemplateLang.g:4498:1: ( ( (lv_nValue_0_0= ruleNumValue ) ) | ( (lv_sValue_1_0= RULE_STRING ) ) | ( (lv_qValue_2_0= ruleQualifiedName ) ) | ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) ) | ( (lv_null_4_0= 'null' ) ) | ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) ) )
            int alt71=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt71=1;
                }
                break;
            case RULE_STRING:
                {
                alt71=2;
                }
                break;
            case RULE_ID:
            case RULE_EXPONENT:
            case 44:
                {
                alt71=3;
                }
                break;
            case RULE_VERSION:
                {
                int LA71_4 = input.LA(2);

                if ( (synpred86_InternalTemplateLang()) ) {
                    alt71=3;
                }
                else if ( (synpred90_InternalTemplateLang()) ) {
                    alt71=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 4, input);

                    throw nvae;
                }
                }
                break;
            case 68:
            case 69:
                {
                alt71=4;
                }
                break;
            case 70:
                {
                alt71=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalTemplateLang.g:4498:2: ( (lv_nValue_0_0= ruleNumValue ) )
                    {
                    // InternalTemplateLang.g:4498:2: ( (lv_nValue_0_0= ruleNumValue ) )
                    // InternalTemplateLang.g:4499:1: (lv_nValue_0_0= ruleNumValue )
                    {
                    // InternalTemplateLang.g:4499:1: (lv_nValue_0_0= ruleNumValue )
                    // InternalTemplateLang.g:4500:3: lv_nValue_0_0= ruleNumValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getNValueNumValueParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_nValue_0_0=ruleNumValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"nValue",
                              		lv_nValue_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.NumValue");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:4517:6: ( (lv_sValue_1_0= RULE_STRING ) )
                    {
                    // InternalTemplateLang.g:4517:6: ( (lv_sValue_1_0= RULE_STRING ) )
                    // InternalTemplateLang.g:4518:1: (lv_sValue_1_0= RULE_STRING )
                    {
                    // InternalTemplateLang.g:4518:1: (lv_sValue_1_0= RULE_STRING )
                    // InternalTemplateLang.g:4519:3: lv_sValue_1_0= RULE_STRING
                    {
                    lv_sValue_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_sValue_1_0, grammarAccess.getConstantAccess().getSValueSTRINGTerminalRuleCall_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"sValue",
                              		lv_sValue_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:4536:6: ( (lv_qValue_2_0= ruleQualifiedName ) )
                    {
                    // InternalTemplateLang.g:4536:6: ( (lv_qValue_2_0= ruleQualifiedName ) )
                    // InternalTemplateLang.g:4537:1: (lv_qValue_2_0= ruleQualifiedName )
                    {
                    // InternalTemplateLang.g:4537:1: (lv_qValue_2_0= ruleQualifiedName )
                    // InternalTemplateLang.g:4538:3: lv_qValue_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstantAccess().getQValueQualifiedNameParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_qValue_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConstantRule());
                      	        }
                             		set(
                             			current, 
                             			"qValue",
                              		lv_qValue_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.QualifiedName");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTemplateLang.g:4555:6: ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) )
                    {
                    // InternalTemplateLang.g:4555:6: ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) )
                    // InternalTemplateLang.g:4556:1: ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) )
                    {
                    // InternalTemplateLang.g:4556:1: ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) )
                    // InternalTemplateLang.g:4557:1: (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' )
                    {
                    // InternalTemplateLang.g:4557:1: (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' )
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==68) ) {
                        alt70=1;
                    }
                    else if ( (LA70_0==69) ) {
                        alt70=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 70, 0, input);

                        throw nvae;
                    }
                    switch (alt70) {
                        case 1 :
                            // InternalTemplateLang.g:4558:3: lv_bValue_3_1= 'true'
                            {
                            lv_bValue_3_1=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_bValue_3_1, grammarAccess.getConstantAccess().getBValueTrueKeyword_3_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getConstantRule());
                              	        }
                                     		setWithLastConsumed(current, "bValue", lv_bValue_3_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // InternalTemplateLang.g:4570:8: lv_bValue_3_2= 'false'
                            {
                            lv_bValue_3_2=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_bValue_3_2, grammarAccess.getConstantAccess().getBValueFalseKeyword_3_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getConstantRule());
                              	        }
                                     		setWithLastConsumed(current, "bValue", lv_bValue_3_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTemplateLang.g:4586:6: ( (lv_null_4_0= 'null' ) )
                    {
                    // InternalTemplateLang.g:4586:6: ( (lv_null_4_0= 'null' ) )
                    // InternalTemplateLang.g:4587:1: (lv_null_4_0= 'null' )
                    {
                    // InternalTemplateLang.g:4587:1: (lv_null_4_0= 'null' )
                    // InternalTemplateLang.g:4588:3: lv_null_4_0= 'null'
                    {
                    lv_null_4_0=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_null_4_0, grammarAccess.getConstantAccess().getNullNullKeyword_4_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(current, "null", lv_null_4_0, "null");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalTemplateLang.g:4602:6: ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) )
                    {
                    // InternalTemplateLang.g:4602:6: ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) )
                    // InternalTemplateLang.g:4602:7: ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION )
                    {
                    // InternalTemplateLang.g:4608:1: (lv_version_5_0= RULE_VERSION )
                    // InternalTemplateLang.g:4609:3: lv_version_5_0= RULE_VERSION
                    {
                    lv_version_5_0=(Token)match(input,RULE_VERSION,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_version_5_0, grammarAccess.getConstantAccess().getVersionVERSIONTerminalRuleCall_5_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getConstantRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"version",
                              		lv_version_5_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VERSION");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNumValue"
    // InternalTemplateLang.g:4633:1: entryRuleNumValue returns [EObject current=null] : iv_ruleNumValue= ruleNumValue EOF ;
    public final EObject entryRuleNumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumValue = null;


        try {
            // InternalTemplateLang.g:4634:2: (iv_ruleNumValue= ruleNumValue EOF )
            // InternalTemplateLang.g:4635:2: iv_ruleNumValue= ruleNumValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumValue=ruleNumValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumValue"


    // $ANTLR start "ruleNumValue"
    // InternalTemplateLang.g:4642:1: ruleNumValue returns [EObject current=null] : ( (lv_val_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleNumValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4645:28: ( ( (lv_val_0_0= RULE_NUMBER ) ) )
            // InternalTemplateLang.g:4646:1: ( (lv_val_0_0= RULE_NUMBER ) )
            {
            // InternalTemplateLang.g:4646:1: ( (lv_val_0_0= RULE_NUMBER ) )
            // InternalTemplateLang.g:4647:1: (lv_val_0_0= RULE_NUMBER )
            {
            // InternalTemplateLang.g:4647:1: (lv_val_0_0= RULE_NUMBER )
            // InternalTemplateLang.g:4648:3: lv_val_0_0= RULE_NUMBER
            {
            lv_val_0_0=(Token)match(input,RULE_NUMBER,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_val_0_0, grammarAccess.getNumValueAccess().getValNUMBERTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"val",
                      		lv_val_0_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.NUMBER");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumValue"


    // $ANTLR start "entryRuleIdentifier"
    // InternalTemplateLang.g:4672:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalTemplateLang.g:4673:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalTemplateLang.g:4674:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalTemplateLang.g:4681:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_VERSION_1= RULE_VERSION | this_EXPONENT_2= RULE_EXPONENT | kw= 'version' ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_VERSION_1=null;
        Token this_EXPONENT_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4684:28: ( (this_ID_0= RULE_ID | this_VERSION_1= RULE_VERSION | this_EXPONENT_2= RULE_EXPONENT | kw= 'version' ) )
            // InternalTemplateLang.g:4685:1: (this_ID_0= RULE_ID | this_VERSION_1= RULE_VERSION | this_EXPONENT_2= RULE_EXPONENT | kw= 'version' )
            {
            // InternalTemplateLang.g:4685:1: (this_ID_0= RULE_ID | this_VERSION_1= RULE_VERSION | this_EXPONENT_2= RULE_EXPONENT | kw= 'version' )
            int alt72=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt72=1;
                }
                break;
            case RULE_VERSION:
                {
                alt72=2;
                }
                break;
            case RULE_EXPONENT:
                {
                alt72=3;
                }
                break;
            case 44:
                {
                alt72=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalTemplateLang.g:4685:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getIdentifierAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:4693:10: this_VERSION_1= RULE_VERSION
                    {
                    this_VERSION_1=(Token)match(input,RULE_VERSION,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_VERSION_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_VERSION_1, grammarAccess.getIdentifierAccess().getVERSIONTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:4701:10: this_EXPONENT_2= RULE_EXPONENT
                    {
                    this_EXPONENT_2=(Token)match(input,RULE_EXPONENT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EXPONENT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EXPONENT_2, grammarAccess.getIdentifierAccess().getEXPONENTTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalTemplateLang.g:4710:2: kw= 'version'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getIdentifierAccess().getVersionKeyword_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleType"
    // InternalTemplateLang.g:4723:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalTemplateLang.g:4724:2: (iv_ruleType= ruleType EOF )
            // InternalTemplateLang.g:4725:2: iv_ruleType= ruleType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalTemplateLang.g:4732:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) | ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) ) | ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) ) | ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) ) | ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Token lv_set_1_0=null;
        Token lv_seq_3_0=null;
        Token lv_map_5_0=null;
        Token lv_call_7_0=null;
        EObject lv_name_0_0 = null;

        EObject lv_param_2_0 = null;

        EObject lv_param_4_0 = null;

        EObject lv_param_6_0 = null;

        EObject lv_return_8_0 = null;

        EObject lv_param_9_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4735:28: ( ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) | ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) ) | ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) ) | ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) ) | ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) ) ) )
            // InternalTemplateLang.g:4736:1: ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) | ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) ) | ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) ) | ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) ) | ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) ) )
            {
            // InternalTemplateLang.g:4736:1: ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) | ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) ) | ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) ) | ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) ) | ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) ) )
            int alt74=5;
            switch ( input.LA(1) ) {
            case RULE_VERSION:
            case RULE_ID:
            case RULE_EXPONENT:
            case 44:
                {
                alt74=1;
                }
                break;
            case 71:
                {
                alt74=2;
                }
                break;
            case 72:
                {
                alt74=3;
                }
                break;
            case 73:
                {
                alt74=4;
                }
                break;
            case 74:
                {
                alt74=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalTemplateLang.g:4736:2: ( (lv_name_0_0= ruleQualifiedPrefix ) )
                    {
                    // InternalTemplateLang.g:4736:2: ( (lv_name_0_0= ruleQualifiedPrefix ) )
                    // InternalTemplateLang.g:4737:1: (lv_name_0_0= ruleQualifiedPrefix )
                    {
                    // InternalTemplateLang.g:4737:1: (lv_name_0_0= ruleQualifiedPrefix )
                    // InternalTemplateLang.g:4738:3: lv_name_0_0= ruleQualifiedPrefix
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getNameQualifiedPrefixParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_name_0_0=ruleQualifiedPrefix();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.QualifiedPrefix");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:4755:6: ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) )
                    {
                    // InternalTemplateLang.g:4755:6: ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) )
                    // InternalTemplateLang.g:4755:7: ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) )
                    {
                    // InternalTemplateLang.g:4755:7: ( (lv_set_1_0= 'setOf' ) )
                    // InternalTemplateLang.g:4756:1: (lv_set_1_0= 'setOf' )
                    {
                    // InternalTemplateLang.g:4756:1: (lv_set_1_0= 'setOf' )
                    // InternalTemplateLang.g:4757:3: lv_set_1_0= 'setOf'
                    {
                    lv_set_1_0=(Token)match(input,71,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_set_1_0, grammarAccess.getTypeAccess().getSetSetOfKeyword_1_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(current, "set", lv_set_1_0, "setOf");
                      	    
                    }

                    }


                    }

                    // InternalTemplateLang.g:4770:2: ( (lv_param_2_0= ruleTypeParameters ) )
                    // InternalTemplateLang.g:4771:1: (lv_param_2_0= ruleTypeParameters )
                    {
                    // InternalTemplateLang.g:4771:1: (lv_param_2_0= ruleTypeParameters )
                    // InternalTemplateLang.g:4772:3: lv_param_2_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getParamTypeParametersParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_param_2_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.TypeParameters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalTemplateLang.g:4789:6: ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) )
                    {
                    // InternalTemplateLang.g:4789:6: ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) )
                    // InternalTemplateLang.g:4789:7: ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) )
                    {
                    // InternalTemplateLang.g:4789:7: ( (lv_seq_3_0= 'sequenceOf' ) )
                    // InternalTemplateLang.g:4790:1: (lv_seq_3_0= 'sequenceOf' )
                    {
                    // InternalTemplateLang.g:4790:1: (lv_seq_3_0= 'sequenceOf' )
                    // InternalTemplateLang.g:4791:3: lv_seq_3_0= 'sequenceOf'
                    {
                    lv_seq_3_0=(Token)match(input,72,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_seq_3_0, grammarAccess.getTypeAccess().getSeqSequenceOfKeyword_2_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(current, "seq", lv_seq_3_0, "sequenceOf");
                      	    
                    }

                    }


                    }

                    // InternalTemplateLang.g:4804:2: ( (lv_param_4_0= ruleTypeParameters ) )
                    // InternalTemplateLang.g:4805:1: (lv_param_4_0= ruleTypeParameters )
                    {
                    // InternalTemplateLang.g:4805:1: (lv_param_4_0= ruleTypeParameters )
                    // InternalTemplateLang.g:4806:3: lv_param_4_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getParamTypeParametersParserRuleCall_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_param_4_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_4_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.TypeParameters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalTemplateLang.g:4823:6: ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) )
                    {
                    // InternalTemplateLang.g:4823:6: ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) )
                    // InternalTemplateLang.g:4823:7: ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) )
                    {
                    // InternalTemplateLang.g:4823:7: ( (lv_map_5_0= 'mapOf' ) )
                    // InternalTemplateLang.g:4824:1: (lv_map_5_0= 'mapOf' )
                    {
                    // InternalTemplateLang.g:4824:1: (lv_map_5_0= 'mapOf' )
                    // InternalTemplateLang.g:4825:3: lv_map_5_0= 'mapOf'
                    {
                    lv_map_5_0=(Token)match(input,73,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_map_5_0, grammarAccess.getTypeAccess().getMapMapOfKeyword_3_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(current, "map", lv_map_5_0, "mapOf");
                      	    
                    }

                    }


                    }

                    // InternalTemplateLang.g:4838:2: ( (lv_param_6_0= ruleTypeParameters ) )
                    // InternalTemplateLang.g:4839:1: (lv_param_6_0= ruleTypeParameters )
                    {
                    // InternalTemplateLang.g:4839:1: (lv_param_6_0= ruleTypeParameters )
                    // InternalTemplateLang.g:4840:3: lv_param_6_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getParamTypeParametersParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_param_6_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_6_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.TypeParameters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalTemplateLang.g:4857:6: ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) )
                    {
                    // InternalTemplateLang.g:4857:6: ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) )
                    // InternalTemplateLang.g:4857:7: ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) )
                    {
                    // InternalTemplateLang.g:4857:7: ( (lv_call_7_0= 'callOf' ) )
                    // InternalTemplateLang.g:4858:1: (lv_call_7_0= 'callOf' )
                    {
                    // InternalTemplateLang.g:4858:1: (lv_call_7_0= 'callOf' )
                    // InternalTemplateLang.g:4859:3: lv_call_7_0= 'callOf'
                    {
                    lv_call_7_0=(Token)match(input,74,FOLLOW_59); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_call_7_0, grammarAccess.getTypeAccess().getCallCallOfKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTypeRule());
                      	        }
                             		setWithLastConsumed(current, "call", lv_call_7_0, "callOf");
                      	    
                    }

                    }


                    }

                    // InternalTemplateLang.g:4872:2: ( (lv_return_8_0= ruleType ) )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( ((LA73_0>=RULE_VERSION && LA73_0<=RULE_EXPONENT)||LA73_0==44||(LA73_0>=71 && LA73_0<=74)) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // InternalTemplateLang.g:4873:1: (lv_return_8_0= ruleType )
                            {
                            // InternalTemplateLang.g:4873:1: (lv_return_8_0= ruleType )
                            // InternalTemplateLang.g:4874:3: lv_return_8_0= ruleType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTypeAccess().getReturnTypeParserRuleCall_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_9);
                            lv_return_8_0=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getTypeRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"return",
                                      		lv_return_8_0, 
                                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalTemplateLang.g:4890:3: ( (lv_param_9_0= ruleTypeParameters ) )
                    // InternalTemplateLang.g:4891:1: (lv_param_9_0= ruleTypeParameters )
                    {
                    // InternalTemplateLang.g:4891:1: (lv_param_9_0= ruleTypeParameters )
                    // InternalTemplateLang.g:4892:3: lv_param_9_0= ruleTypeParameters
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTypeAccess().getParamTypeParametersParserRuleCall_4_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_param_9_0=ruleTypeParameters();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTypeRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_9_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.TypeParameters");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeParameters"
    // InternalTemplateLang.g:4916:1: entryRuleTypeParameters returns [EObject current=null] : iv_ruleTypeParameters= ruleTypeParameters EOF ;
    public final EObject entryRuleTypeParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameters = null;


        try {
            // InternalTemplateLang.g:4917:2: (iv_ruleTypeParameters= ruleTypeParameters EOF )
            // InternalTemplateLang.g:4918:2: iv_ruleTypeParameters= ruleTypeParameters EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeParametersRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTypeParameters=ruleTypeParameters();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeParameters; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeParameters"


    // $ANTLR start "ruleTypeParameters"
    // InternalTemplateLang.g:4925:1: ruleTypeParameters returns [EObject current=null] : (otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTypeParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_param_1_0 = null;

        EObject lv_param_3_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4928:28: ( (otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')' ) )
            // InternalTemplateLang.g:4929:1: (otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')' )
            {
            // InternalTemplateLang.g:4929:1: (otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')' )
            // InternalTemplateLang.g:4929:3: otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeParametersAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalTemplateLang.g:4933:1: ( (lv_param_1_0= ruleType ) )
            // InternalTemplateLang.g:4934:1: (lv_param_1_0= ruleType )
            {
            // InternalTemplateLang.g:4934:1: (lv_param_1_0= ruleType )
            // InternalTemplateLang.g:4935:3: lv_param_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeParametersAccess().getParamTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_param_1_0=ruleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTypeParametersRule());
              	        }
                     		add(
                     			current, 
                     			"param",
                      		lv_param_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalTemplateLang.g:4951:2: (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==20) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalTemplateLang.g:4951:4: otherlv_2= ',' ( (lv_param_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_22); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeParametersAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalTemplateLang.g:4955:1: ( (lv_param_3_0= ruleType ) )
            	    // InternalTemplateLang.g:4956:1: (lv_param_3_0= ruleType )
            	    {
            	    // InternalTemplateLang.g:4956:1: (lv_param_3_0= ruleType )
            	    // InternalTemplateLang.g:4957:3: lv_param_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeParametersAccess().getParamTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_17);
            	    lv_param_3_0=ruleType();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTypeParametersRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"param",
            	              		lv_param_3_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Type");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTypeParametersAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeParameters"


    // $ANTLR start "entryRuleContainerInitializer"
    // InternalTemplateLang.g:4985:1: entryRuleContainerInitializer returns [EObject current=null] : iv_ruleContainerInitializer= ruleContainerInitializer EOF ;
    public final EObject entryRuleContainerInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerInitializer = null;


        try {
            // InternalTemplateLang.g:4986:2: (iv_ruleContainerInitializer= ruleContainerInitializer EOF )
            // InternalTemplateLang.g:4987:2: iv_ruleContainerInitializer= ruleContainerInitializer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerInitializerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerInitializer=ruleContainerInitializer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerInitializer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerInitializer"


    // $ANTLR start "ruleContainerInitializer"
    // InternalTemplateLang.g:4994:1: ruleContainerInitializer returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleContainerInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:4997:28: ( ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalTemplateLang.g:4998:1: ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalTemplateLang.g:4998:1: ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}' )
            // InternalTemplateLang.g:4998:2: () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalTemplateLang.g:4998:2: ()
            // InternalTemplateLang.g:4999:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getContainerInitializerAccess().getContainerInitializerAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContainerInitializerAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalTemplateLang.g:5011:1: ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=RULE_NUMBER && LA77_0<=RULE_EXPONENT)||LA77_0==14||LA77_0==17||LA77_0==44||LA77_0==57||(LA77_0>=60 && LA77_0<=63)||(LA77_0>=68 && LA77_0<=70)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalTemplateLang.g:5011:2: ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )*
                    {
                    // InternalTemplateLang.g:5011:2: ( (lv_exprs_2_0= ruleContainerInitializerExpression ) )
                    // InternalTemplateLang.g:5012:1: (lv_exprs_2_0= ruleContainerInitializerExpression )
                    {
                    // InternalTemplateLang.g:5012:1: (lv_exprs_2_0= ruleContainerInitializerExpression )
                    // InternalTemplateLang.g:5013:3: lv_exprs_2_0= ruleContainerInitializerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerInitializerAccess().getExprsContainerInitializerExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_30);
                    lv_exprs_2_0=ruleContainerInitializerExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerInitializerRule());
                      	        }
                             		add(
                             			current, 
                             			"exprs",
                              		lv_exprs_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ContainerInitializerExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalTemplateLang.g:5029:2: (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==20) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // InternalTemplateLang.g:5029:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getContainerInitializerAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalTemplateLang.g:5033:1: ( (lv_exprs_4_0= ruleContainerInitializerExpression ) )
                    	    // InternalTemplateLang.g:5034:1: (lv_exprs_4_0= ruleContainerInitializerExpression )
                    	    {
                    	    // InternalTemplateLang.g:5034:1: (lv_exprs_4_0= ruleContainerInitializerExpression )
                    	    // InternalTemplateLang.g:5035:3: lv_exprs_4_0= ruleContainerInitializerExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainerInitializerAccess().getExprsContainerInitializerExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_30);
                    	    lv_exprs_4_0=ruleContainerInitializerExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getContainerInitializerRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"exprs",
                    	              		lv_exprs_4_0, 
                    	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ContainerInitializerExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getContainerInitializerAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerInitializer"


    // $ANTLR start "entryRuleContainerInitializerExpression"
    // InternalTemplateLang.g:5063:1: entryRuleContainerInitializerExpression returns [EObject current=null] : iv_ruleContainerInitializerExpression= ruleContainerInitializerExpression EOF ;
    public final EObject entryRuleContainerInitializerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerInitializerExpression = null;


        try {
            // InternalTemplateLang.g:5064:2: (iv_ruleContainerInitializerExpression= ruleContainerInitializerExpression EOF )
            // InternalTemplateLang.g:5065:2: iv_ruleContainerInitializerExpression= ruleContainerInitializerExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContainerInitializerExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContainerInitializerExpression=ruleContainerInitializerExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContainerInitializerExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainerInitializerExpression"


    // $ANTLR start "ruleContainerInitializerExpression"
    // InternalTemplateLang.g:5072:1: ruleContainerInitializerExpression returns [EObject current=null] : ( ( (lv_logical_0_0= ruleLogicalExpression ) ) | ( (lv_container_1_0= ruleContainerInitializer ) ) ) ;
    public final EObject ruleContainerInitializerExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_logical_0_0 = null;

        EObject lv_container_1_0 = null;


         enterRule(); 
            
        try {
            // InternalTemplateLang.g:5075:28: ( ( ( (lv_logical_0_0= ruleLogicalExpression ) ) | ( (lv_container_1_0= ruleContainerInitializer ) ) ) )
            // InternalTemplateLang.g:5076:1: ( ( (lv_logical_0_0= ruleLogicalExpression ) ) | ( (lv_container_1_0= ruleContainerInitializer ) ) )
            {
            // InternalTemplateLang.g:5076:1: ( ( (lv_logical_0_0= ruleLogicalExpression ) ) | ( (lv_container_1_0= ruleContainerInitializer ) ) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=RULE_NUMBER && LA78_0<=RULE_EXPONENT)||LA78_0==14||LA78_0==44||LA78_0==57||(LA78_0>=60 && LA78_0<=63)||(LA78_0>=68 && LA78_0<=70)) ) {
                alt78=1;
            }
            else if ( (LA78_0==17) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalTemplateLang.g:5076:2: ( (lv_logical_0_0= ruleLogicalExpression ) )
                    {
                    // InternalTemplateLang.g:5076:2: ( (lv_logical_0_0= ruleLogicalExpression ) )
                    // InternalTemplateLang.g:5077:1: (lv_logical_0_0= ruleLogicalExpression )
                    {
                    // InternalTemplateLang.g:5077:1: (lv_logical_0_0= ruleLogicalExpression )
                    // InternalTemplateLang.g:5078:3: lv_logical_0_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerInitializerExpressionAccess().getLogicalLogicalExpressionParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_logical_0_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerInitializerExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"logical",
                              		lv_logical_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.LogicalExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTemplateLang.g:5095:6: ( (lv_container_1_0= ruleContainerInitializer ) )
                    {
                    // InternalTemplateLang.g:5095:6: ( (lv_container_1_0= ruleContainerInitializer ) )
                    // InternalTemplateLang.g:5096:1: (lv_container_1_0= ruleContainerInitializer )
                    {
                    // InternalTemplateLang.g:5096:1: (lv_container_1_0= ruleContainerInitializer )
                    // InternalTemplateLang.g:5097:3: lv_container_1_0= ruleContainerInitializer
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerInitializerExpressionAccess().getContainerContainerInitializerParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_container_1_0=ruleContainerInitializer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getContainerInitializerExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"container",
                              		lv_container_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ContainerInitializer");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainerInitializerExpression"

    // $ANTLR start synpred8_InternalTemplateLang
    public final void synpred8_InternalTemplateLang_fragment() throws RecognitionException {   
        EObject lv_version_13_0 = null;


        // InternalTemplateLang.g:251:1: ( (lv_version_13_0= ruleVersionStmt ) )
        // InternalTemplateLang.g:251:1: (lv_version_13_0= ruleVersionStmt )
        {
        // InternalTemplateLang.g:251:1: (lv_version_13_0= ruleVersionStmt )
        // InternalTemplateLang.g:252:3: lv_version_13_0= ruleVersionStmt
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getVersionVersionStmtParserRuleCall_12_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_version_13_0=ruleVersionStmt();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalTemplateLang

    // $ANTLR start synpred19_InternalTemplateLang
    public final void synpred19_InternalTemplateLang_fragment() throws RecognitionException {   
        EObject lv_var_0_0 = null;


        // InternalTemplateLang.g:795:2: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) )
        // InternalTemplateLang.g:795:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
        {
        // InternalTemplateLang.g:795:2: ( (lv_var_0_0= ruleVariableDeclaration ) )
        // InternalTemplateLang.g:796:1: (lv_var_0_0= ruleVariableDeclaration )
        {
        // InternalTemplateLang.g:796:1: (lv_var_0_0= ruleVariableDeclaration )
        // InternalTemplateLang.g:797:3: lv_var_0_0= ruleVariableDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStmtAccess().getVarVariableDeclarationParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_var_0_0=ruleVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred19_InternalTemplateLang

    // $ANTLR start synpred22_InternalTemplateLang
    public final void synpred22_InternalTemplateLang_fragment() throws RecognitionException {   
        EObject lv_block_3_0 = null;


        // InternalTemplateLang.g:852:6: ( ( (lv_block_3_0= ruleStmtBlock ) ) )
        // InternalTemplateLang.g:852:6: ( (lv_block_3_0= ruleStmtBlock ) )
        {
        // InternalTemplateLang.g:852:6: ( (lv_block_3_0= ruleStmtBlock ) )
        // InternalTemplateLang.g:853:1: (lv_block_3_0= ruleStmtBlock )
        {
        // InternalTemplateLang.g:853:1: (lv_block_3_0= ruleStmtBlock )
        // InternalTemplateLang.g:854:3: lv_block_3_0= ruleStmtBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStmtAccess().getBlockStmtBlockParserRuleCall_3_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_block_3_0=ruleStmtBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred22_InternalTemplateLang

    // $ANTLR start synpred23_InternalTemplateLang
    public final void synpred23_InternalTemplateLang_fragment() throws RecognitionException {   
        EObject lv_multi_4_0 = null;


        // InternalTemplateLang.g:871:6: ( ( (lv_multi_4_0= rulemultiselect ) ) )
        // InternalTemplateLang.g:871:6: ( (lv_multi_4_0= rulemultiselect ) )
        {
        // InternalTemplateLang.g:871:6: ( (lv_multi_4_0= rulemultiselect ) )
        // InternalTemplateLang.g:872:1: (lv_multi_4_0= rulemultiselect )
        {
        // InternalTemplateLang.g:872:1: (lv_multi_4_0= rulemultiselect )
        // InternalTemplateLang.g:873:3: lv_multi_4_0= rulemultiselect
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStmtAccess().getMultiMultiselectParserRuleCall_4_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_multi_4_0=rulemultiselect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred23_InternalTemplateLang

    // $ANTLR start synpred25_InternalTemplateLang
    public final void synpred25_InternalTemplateLang_fragment() throws RecognitionException {   
        EObject lv_exprStmt_6_0 = null;


        // InternalTemplateLang.g:909:6: ( ( (lv_exprStmt_6_0= ruleExpressionStatement ) ) )
        // InternalTemplateLang.g:909:6: ( (lv_exprStmt_6_0= ruleExpressionStatement ) )
        {
        // InternalTemplateLang.g:909:6: ( (lv_exprStmt_6_0= ruleExpressionStatement ) )
        // InternalTemplateLang.g:910:1: (lv_exprStmt_6_0= ruleExpressionStatement )
        {
        // InternalTemplateLang.g:910:1: (lv_exprStmt_6_0= ruleExpressionStatement )
        // InternalTemplateLang.g:911:3: lv_exprStmt_6_0= ruleExpressionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStmtAccess().getExprStmtExpressionStatementParserRuleCall_6_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_exprStmt_6_0=ruleExpressionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred25_InternalTemplateLang

    // $ANTLR start synpred27_InternalTemplateLang
    public final void synpred27_InternalTemplateLang_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_else_6_0 = null;


        // InternalTemplateLang.g:1015:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) ) )
        // InternalTemplateLang.g:1015:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStmt ) )
        {
        // InternalTemplateLang.g:1015:3: ( ( 'else' )=>otherlv_5= 'else' )
        // InternalTemplateLang.g:1015:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,27,FOLLOW_26); if (state.failed) return ;

        }

        // InternalTemplateLang.g:1020:2: ( (lv_else_6_0= ruleStmt ) )
        // InternalTemplateLang.g:1021:1: (lv_else_6_0= ruleStmt )
        {
        // InternalTemplateLang.g:1021:1: (lv_else_6_0= ruleStmt )
        // InternalTemplateLang.g:1022:3: lv_else_6_0= ruleStmt
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAlternativeAccess().getElseStmtParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_else_6_0=ruleStmt();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred27_InternalTemplateLang

    // $ANTLR start synpred78_InternalTemplateLang
    public final void synpred78_InternalTemplateLang_fragment() throws RecognitionException {   
        EObject lv_decl_2_0 = null;


        // InternalTemplateLang.g:4172:1: ( (lv_decl_2_0= ruleDeclarator ) )
        // InternalTemplateLang.g:4172:1: (lv_decl_2_0= ruleDeclarator )
        {
        // InternalTemplateLang.g:4172:1: (lv_decl_2_0= ruleDeclarator )
        // InternalTemplateLang.g:4173:3: lv_decl_2_0= ruleDeclarator
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getCallAccess().getDeclDeclaratorParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_decl_2_0=ruleDeclarator();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred78_InternalTemplateLang

    // $ANTLR start synpred86_InternalTemplateLang
    public final void synpred86_InternalTemplateLang_fragment() throws RecognitionException {   
        EObject lv_qValue_2_0 = null;


        // InternalTemplateLang.g:4536:6: ( ( (lv_qValue_2_0= ruleQualifiedName ) ) )
        // InternalTemplateLang.g:4536:6: ( (lv_qValue_2_0= ruleQualifiedName ) )
        {
        // InternalTemplateLang.g:4536:6: ( (lv_qValue_2_0= ruleQualifiedName ) )
        // InternalTemplateLang.g:4537:1: (lv_qValue_2_0= ruleQualifiedName )
        {
        // InternalTemplateLang.g:4537:1: (lv_qValue_2_0= ruleQualifiedName )
        // InternalTemplateLang.g:4538:3: lv_qValue_2_0= ruleQualifiedName
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getConstantAccess().getQValueQualifiedNameParserRuleCall_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_qValue_2_0=ruleQualifiedName();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred86_InternalTemplateLang

    // $ANTLR start synpred90_InternalTemplateLang
    public final void synpred90_InternalTemplateLang_fragment() throws RecognitionException {   
        // InternalTemplateLang.g:4602:7: ( ( RULE_VERSION ) )
        // InternalTemplateLang.g:4603:1: ( RULE_VERSION )
        {
        // InternalTemplateLang.g:4603:1: ( RULE_VERSION )
        // InternalTemplateLang.g:4604:1: RULE_VERSION
        {
        match(input,RULE_VERSION,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred90_InternalTemplateLang

    // Delegated rules

    public final boolean synpred23_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred78_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred78_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred90_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred90_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred86_InternalTemplateLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalTemplateLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA51 dfa51 = new DFA51(this);
    protected DFA64 dfa64 = new DFA64(this);
    static final String dfa_1s = "\34\uffff";
    static final String dfa_2s = "\1\4\1\uffff\4\0\6\uffff\1\0\6\uffff\1\0\10\uffff";
    static final String dfa_3s = "\1\112\1\uffff\4\0\6\uffff\1\0\6\uffff\1\0\10\uffff";
    static final String dfa_4s = "\1\uffff\1\1\10\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\12\uffff\1\10\1\4";
    static final String dfa_5s = "\2\uffff\1\0\1\1\1\2\1\3\6\uffff\1\4\6\uffff\1\5\10\uffff}>";
    static final String[] dfa_6s = {
            "\1\17\1\23\1\3\1\2\1\4\5\uffff\1\17\2\uffff\1\14\10\uffff\1\12\1\uffff\1\32\1\uffff\1\13\2\uffff\1\16\1\15\5\uffff\1\1\3\uffff\1\5\14\uffff\1\17\2\uffff\4\17\4\uffff\3\17\4\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "795:1: ( ( (lv_var_0_0= ruleVariableDeclaration ) ) | ( (lv_alt_1_0= ruleAlternative ) ) | ( (lv_switch_2_0= ruleSwitch ) ) | ( (lv_block_3_0= ruleStmtBlock ) ) | ( (lv_multi_4_0= rulemultiselect ) ) | ( (lv_loop_5_0= ruleLoop ) ) | ( (lv_exprStmt_6_0= ruleExpressionStatement ) ) | ( (lv_ctn_7_0= ruleContent ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_2 = input.LA(1);

                         
                        int index19_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalTemplateLang()) ) {s = 1;}

                        else if ( (synpred23_InternalTemplateLang()) ) {s = 13;}

                        else if ( (synpred25_InternalTemplateLang()) ) {s = 15;}

                         
                        input.seek(index19_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_3 = input.LA(1);

                         
                        int index19_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalTemplateLang()) ) {s = 1;}

                        else if ( (synpred23_InternalTemplateLang()) ) {s = 13;}

                        else if ( (synpred25_InternalTemplateLang()) ) {s = 15;}

                         
                        input.seek(index19_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_4 = input.LA(1);

                         
                        int index19_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalTemplateLang()) ) {s = 1;}

                        else if ( (synpred23_InternalTemplateLang()) ) {s = 13;}

                        else if ( (synpred25_InternalTemplateLang()) ) {s = 15;}

                         
                        input.seek(index19_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA19_5 = input.LA(1);

                         
                        int index19_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalTemplateLang()) ) {s = 1;}

                        else if ( (synpred23_InternalTemplateLang()) ) {s = 13;}

                        else if ( (synpred25_InternalTemplateLang()) ) {s = 15;}

                         
                        input.seek(index19_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA19_12 = input.LA(1);

                         
                        int index19_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalTemplateLang()) ) {s = 27;}

                        else if ( (synpred25_InternalTemplateLang()) ) {s = 15;}

                         
                        input.seek(index19_12);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA19_19 = input.LA(1);

                         
                        int index19_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred25_InternalTemplateLang()) ) {s = 15;}

                        else if ( (true) ) {s = 26;}

                         
                        input.seek(index19_19);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\14\uffff";
    static final String dfa_8s = "\1\4\4\16\1\uffff\1\6\1\uffff\4\16";
    static final String dfa_9s = "\1\106\4\103\1\uffff\1\54\1\uffff\4\103";
    static final String dfa_10s = "\5\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_11s = "\14\uffff}>";
    static final String[] dfa_12s = {
            "\2\5\1\2\1\1\1\3\5\uffff\1\5\2\uffff\1\5\32\uffff\1\4\14\uffff\1\5\2\uffff\4\5\4\uffff\3\5",
            "\1\5\6\uffff\1\7\3\uffff\1\5\15\uffff\1\6\6\uffff\16\5\4\uffff\2\5\1\uffff\1\5",
            "\1\5\6\uffff\1\7\3\uffff\1\5\15\uffff\1\6\6\uffff\16\5\4\uffff\2\5\1\uffff\1\5",
            "\1\5\6\uffff\1\7\3\uffff\1\5\15\uffff\1\6\6\uffff\16\5\4\uffff\2\5\1\uffff\1\5",
            "\1\5\6\uffff\1\7\3\uffff\1\5\15\uffff\1\6\6\uffff\16\5\4\uffff\2\5\1\uffff\1\5",
            "",
            "\1\11\1\10\1\12\43\uffff\1\13",
            "",
            "\1\5\6\uffff\1\7\3\uffff\1\5\15\uffff\1\5\6\uffff\16\5\4\uffff\2\5\1\uffff\1\5",
            "\1\5\6\uffff\1\7\3\uffff\1\5\15\uffff\1\5\6\uffff\16\5\4\uffff\2\5\1\uffff\1\5",
            "\1\5\6\uffff\1\7\3\uffff\1\5\15\uffff\1\5\6\uffff\16\5\4\uffff\2\5\1\uffff\1\5",
            "\1\5\6\uffff\1\7\3\uffff\1\5\15\uffff\1\5\6\uffff\16\5\4\uffff\2\5\1\uffff\1\5"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "2409:2: ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )?";
        }
    }
    static final String dfa_13s = "\16\uffff";
    static final String dfa_14s = "\2\uffff\4\1\4\uffff\4\1";
    static final String dfa_15s = "\1\4\1\uffff\4\15\2\uffff\1\6\1\uffff\4\15";
    static final String dfa_16s = "\1\106\1\uffff\4\103\2\uffff\1\54\1\uffff\4\103";
    static final String dfa_17s = "\1\uffff\1\1\4\uffff\1\3\1\4\1\uffff\1\2\4\uffff";
    static final String dfa_18s = "\16\uffff}>";
    static final String[] dfa_19s = {
            "\2\1\1\3\1\2\1\4\5\uffff\1\1\35\uffff\1\5\21\uffff\1\6\1\7\4\uffff\3\1",
            "",
            "\1\1\1\11\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\1\3\uffff\16\1\4\uffff\3\1\1\10",
            "\1\1\1\11\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\1\3\uffff\16\1\4\uffff\3\1\1\10",
            "\1\1\1\11\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\1\3\uffff\16\1\4\uffff\3\1\1\10",
            "\1\1\1\11\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\1\3\uffff\16\1\4\uffff\3\1\1\10",
            "",
            "",
            "\1\13\1\12\1\14\43\uffff\1\15",
            "",
            "\1\1\1\11\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\1\3\uffff\16\1\4\uffff\3\1\1\10",
            "\1\1\1\11\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\1\3\uffff\16\1\4\uffff\3\1\1\10",
            "\1\1\1\11\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\1\3\uffff\16\1\4\uffff\3\1\1\10",
            "\1\1\1\11\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\2\uffff\1\1\6\uffff\1\1\2\uffff\1\1\3\uffff\16\1\4\uffff\3\1\1\10"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "3459:1: ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_newEx_3_0= ruleConstructorExecution ) ) )";
        }
    }
    static final String dfa_20s = "\26\uffff";
    static final String dfa_21s = "\1\4\4\0\21\uffff";
    static final String dfa_22s = "\1\112\4\0\21\uffff";
    static final String dfa_23s = "\5\uffff\1\1\3\uffff\1\2\14\uffff";
    static final String dfa_24s = "\1\uffff\1\0\1\1\1\2\1\3\21\uffff}>";
    static final String[] dfa_25s = {
            "\2\11\1\2\1\1\1\3\5\uffff\2\11\1\uffff\1\11\32\uffff\1\4\14\uffff\1\11\2\uffff\4\11\4\uffff\3\11\4\5",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "4171:1: ( (lv_decl_2_0= ruleDeclarator ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_1 = input.LA(1);

                         
                        int index64_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalTemplateLang()) ) {s = 5;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index64_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA64_2 = input.LA(1);

                         
                        int index64_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalTemplateLang()) ) {s = 5;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index64_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA64_3 = input.LA(1);

                         
                        int index64_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalTemplateLang()) ) {s = 5;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index64_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA64_4 = input.LA(1);

                         
                        int index64_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred78_InternalTemplateLang()) ) {s = 5;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index64_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000244000482000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000044000482000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000040000482000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00001000000001C0L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00001000000081C0L,0x0000000000000780L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00001300018401C0L,0x0000000000000780L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00001100018401C0L,0x0000000000000780L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001840000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00001000000001C0L,0x0000000000000780L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0xF2001106540641F0L,0x00000000000007F0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xF2001000000241F0L,0x0000000000000070L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xF2001106540241F0L,0x00000000000007F0L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xF2001000000041F0L,0x0000000000000070L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000080002000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000008000200000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x000E000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0300000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0C00000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000008000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xF20010000002C1F0L,0x0000000000000070L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0xF20010000002C1F0L,0x00000000000007F0L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00001000000041C0L,0x0000000000000780L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0xF2001000000641F0L,0x0000000000000070L});

}