package de.uni_hildesheim.sse.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.uni_hildesheim.sse.services.VilBuildLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalVilBuildLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_VERSION", "RULE_NUMBER", "RULE_ID", "RULE_EXPONENT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'requireVTL'", "';'", "'vilScript'", "'('", "')'", "'{'", "'}'", "'extends'", "'load'", "'properties'", "'='", "':'", "','", "'protected'", "'.'", "'instantiate'", "'map'", "'for'", "'while'", "'if'", "'else'", "'join'", "'with'", "'exclude'", "'execute'", "'const'", "'typedef'", "'@advice'", "'version'", "'import'", "'and'", "'or'", "'xor'", "'=='", "'<>'", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'not'", "'!'", "'super'", "'new'", "'->'", "'['", "']'", "'|'", "'::'", "'true'", "'false'", "'null'", "'setOf'", "'sequenceOf'", "'mapOf'", "'callOf'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_VERSION=5;
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
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=6;
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


        public InternalVilBuildLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVilBuildLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVilBuildLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVilBuildLanguage.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private VilBuildLanguageGrammarAccess grammarAccess;
     	
        public InternalVilBuildLanguageParser(TokenStream input, VilBuildLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "ImplementationUnit";	
       	}
       	
       	@Override
       	protected VilBuildLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleImplementationUnit"
    // InternalVilBuildLanguage.g:73:1: entryRuleImplementationUnit returns [EObject current=null] : iv_ruleImplementationUnit= ruleImplementationUnit EOF ;
    public final EObject entryRuleImplementationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplementationUnit = null;


        try {
            // InternalVilBuildLanguage.g:74:2: (iv_ruleImplementationUnit= ruleImplementationUnit EOF )
            // InternalVilBuildLanguage.g:75:2: iv_ruleImplementationUnit= ruleImplementationUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplementationUnitRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImplementationUnit=ruleImplementationUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplementationUnit; 
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
    // $ANTLR end "entryRuleImplementationUnit"


    // $ANTLR start "ruleImplementationUnit"
    // InternalVilBuildLanguage.g:82:1: ruleImplementationUnit returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_requires_2_0= ruleRequire ) )* ( (lv_scripts_3_0= ruleLanguageUnit ) )* ) ;
    public final EObject ruleImplementationUnit() throws RecognitionException {
        EObject current = null;

        EObject lv_imports_1_0 = null;

        EObject lv_requires_2_0 = null;

        EObject lv_scripts_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:85:28: ( ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_requires_2_0= ruleRequire ) )* ( (lv_scripts_3_0= ruleLanguageUnit ) )* ) )
            // InternalVilBuildLanguage.g:86:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_requires_2_0= ruleRequire ) )* ( (lv_scripts_3_0= ruleLanguageUnit ) )* )
            {
            // InternalVilBuildLanguage.g:86:1: ( () ( (lv_imports_1_0= ruleImport ) )* ( (lv_requires_2_0= ruleRequire ) )* ( (lv_scripts_3_0= ruleLanguageUnit ) )* )
            // InternalVilBuildLanguage.g:86:2: () ( (lv_imports_1_0= ruleImport ) )* ( (lv_requires_2_0= ruleRequire ) )* ( (lv_scripts_3_0= ruleLanguageUnit ) )*
            {
            // InternalVilBuildLanguage.g:86:2: ()
            // InternalVilBuildLanguage.g:87:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplementationUnitAccess().getImplementationUnitAction_0(),
                          current);
                  
            }

            }

            // InternalVilBuildLanguage.g:95:2: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==42) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:96:1: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalVilBuildLanguage.g:96:1: (lv_imports_1_0= ruleImport )
            	    // InternalVilBuildLanguage.g:97:3: lv_imports_1_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplementationUnitAccess().getImportsImportParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getImplementationUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_1_0, 
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

            // InternalVilBuildLanguage.g:113:3: ( (lv_requires_2_0= ruleRequire ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:114:1: (lv_requires_2_0= ruleRequire )
            	    {
            	    // InternalVilBuildLanguage.g:114:1: (lv_requires_2_0= ruleRequire )
            	    // InternalVilBuildLanguage.g:115:3: lv_requires_2_0= ruleRequire
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplementationUnitAccess().getRequiresRequireParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_requires_2_0=ruleRequire();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getImplementationUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"requires",
            	              		lv_requires_2_0, 
            	              		"de.uni_hildesheim.sse.VilBuildLanguage.Require");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalVilBuildLanguage.g:131:3: ( (lv_scripts_3_0= ruleLanguageUnit ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15||LA3_0==40) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:132:1: (lv_scripts_3_0= ruleLanguageUnit )
            	    {
            	    // InternalVilBuildLanguage.g:132:1: (lv_scripts_3_0= ruleLanguageUnit )
            	    // InternalVilBuildLanguage.g:133:3: lv_scripts_3_0= ruleLanguageUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplementationUnitAccess().getScriptsLanguageUnitParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_scripts_3_0=ruleLanguageUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getImplementationUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"scripts",
            	              		lv_scripts_3_0, 
            	              		"de.uni_hildesheim.sse.VilBuildLanguage.LanguageUnit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleImplementationUnit"


    // $ANTLR start "entryRuleRequire"
    // InternalVilBuildLanguage.g:157:1: entryRuleRequire returns [EObject current=null] : iv_ruleRequire= ruleRequire EOF ;
    public final EObject entryRuleRequire() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequire = null;


        try {
            // InternalVilBuildLanguage.g:158:2: (iv_ruleRequire= ruleRequire EOF )
            // InternalVilBuildLanguage.g:159:2: iv_ruleRequire= ruleRequire EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequireRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRequire=ruleRequire();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequire; 
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
    // $ANTLR end "entryRuleRequire"


    // $ANTLR start "ruleRequire"
    // InternalVilBuildLanguage.g:166:1: ruleRequire returns [EObject current=null] : (otherlv_0= 'requireVTL' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) ) otherlv_3= ';' ) ;
    public final EObject ruleRequire() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_versionSpec_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:169:28: ( (otherlv_0= 'requireVTL' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) ) otherlv_3= ';' ) )
            // InternalVilBuildLanguage.g:170:1: (otherlv_0= 'requireVTL' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) ) otherlv_3= ';' )
            {
            // InternalVilBuildLanguage.g:170:1: (otherlv_0= 'requireVTL' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) ) otherlv_3= ';' )
            // InternalVilBuildLanguage.g:170:3: otherlv_0= 'requireVTL' ( (lv_name_1_0= RULE_STRING ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequireAccess().getRequireVTLKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:174:1: ( (lv_name_1_0= RULE_STRING ) )
            // InternalVilBuildLanguage.g:175:1: (lv_name_1_0= RULE_STRING )
            {
            // InternalVilBuildLanguage.g:175:1: (lv_name_1_0= RULE_STRING )
            // InternalVilBuildLanguage.g:176:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRequireAccess().getNameSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequireRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.STRING");
              	    
            }

            }


            }

            // InternalVilBuildLanguage.g:192:2: ( (lv_versionSpec_2_0= ruleVersionSpec ) )
            // InternalVilBuildLanguage.g:193:1: (lv_versionSpec_2_0= ruleVersionSpec )
            {
            // InternalVilBuildLanguage.g:193:1: (lv_versionSpec_2_0= ruleVersionSpec )
            // InternalVilBuildLanguage.g:194:3: lv_versionSpec_2_0= ruleVersionSpec
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRequireAccess().getVersionSpecVersionSpecParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
            lv_versionSpec_2_0=ruleVersionSpec();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRequireRule());
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRequireAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleRequire"


    // $ANTLR start "entryRuleLanguageUnit"
    // InternalVilBuildLanguage.g:222:1: entryRuleLanguageUnit returns [EObject current=null] : iv_ruleLanguageUnit= ruleLanguageUnit EOF ;
    public final EObject entryRuleLanguageUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageUnit = null;


        try {
            // InternalVilBuildLanguage.g:223:2: (iv_ruleLanguageUnit= ruleLanguageUnit EOF )
            // InternalVilBuildLanguage.g:224:2: iv_ruleLanguageUnit= ruleLanguageUnit EOF
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
    // InternalVilBuildLanguage.g:231:1: ruleLanguageUnit returns [EObject current=null] : ( ( (lv_advices_0_0= ruleAdvice ) )* otherlv_1= 'vilScript' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '(' ( (lv_param_4_0= ruleParameterList ) )? otherlv_5= ')' ( (lv_parent_6_0= ruleScriptParentDecl ) )? otherlv_7= '{' ( (lv_version_8_0= ruleVersionStmt ) )? ( (lv_loadProperties_9_0= ruleLoadProperties ) )* ( (lv_contents_10_0= ruleScriptContents ) ) otherlv_11= '}' (otherlv_12= ';' )? ) ;
    public final EObject ruleLanguageUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_advices_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_param_4_0 = null;

        EObject lv_parent_6_0 = null;

        EObject lv_version_8_0 = null;

        EObject lv_loadProperties_9_0 = null;

        EObject lv_contents_10_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:234:28: ( ( ( (lv_advices_0_0= ruleAdvice ) )* otherlv_1= 'vilScript' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '(' ( (lv_param_4_0= ruleParameterList ) )? otherlv_5= ')' ( (lv_parent_6_0= ruleScriptParentDecl ) )? otherlv_7= '{' ( (lv_version_8_0= ruleVersionStmt ) )? ( (lv_loadProperties_9_0= ruleLoadProperties ) )* ( (lv_contents_10_0= ruleScriptContents ) ) otherlv_11= '}' (otherlv_12= ';' )? ) )
            // InternalVilBuildLanguage.g:235:1: ( ( (lv_advices_0_0= ruleAdvice ) )* otherlv_1= 'vilScript' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '(' ( (lv_param_4_0= ruleParameterList ) )? otherlv_5= ')' ( (lv_parent_6_0= ruleScriptParentDecl ) )? otherlv_7= '{' ( (lv_version_8_0= ruleVersionStmt ) )? ( (lv_loadProperties_9_0= ruleLoadProperties ) )* ( (lv_contents_10_0= ruleScriptContents ) ) otherlv_11= '}' (otherlv_12= ';' )? )
            {
            // InternalVilBuildLanguage.g:235:1: ( ( (lv_advices_0_0= ruleAdvice ) )* otherlv_1= 'vilScript' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '(' ( (lv_param_4_0= ruleParameterList ) )? otherlv_5= ')' ( (lv_parent_6_0= ruleScriptParentDecl ) )? otherlv_7= '{' ( (lv_version_8_0= ruleVersionStmt ) )? ( (lv_loadProperties_9_0= ruleLoadProperties ) )* ( (lv_contents_10_0= ruleScriptContents ) ) otherlv_11= '}' (otherlv_12= ';' )? )
            // InternalVilBuildLanguage.g:235:2: ( (lv_advices_0_0= ruleAdvice ) )* otherlv_1= 'vilScript' ( (lv_name_2_0= ruleIdentifier ) ) otherlv_3= '(' ( (lv_param_4_0= ruleParameterList ) )? otherlv_5= ')' ( (lv_parent_6_0= ruleScriptParentDecl ) )? otherlv_7= '{' ( (lv_version_8_0= ruleVersionStmt ) )? ( (lv_loadProperties_9_0= ruleLoadProperties ) )* ( (lv_contents_10_0= ruleScriptContents ) ) otherlv_11= '}' (otherlv_12= ';' )?
            {
            // InternalVilBuildLanguage.g:235:2: ( (lv_advices_0_0= ruleAdvice ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==40) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:236:1: (lv_advices_0_0= ruleAdvice )
            	    {
            	    // InternalVilBuildLanguage.g:236:1: (lv_advices_0_0= ruleAdvice )
            	    // InternalVilBuildLanguage.g:237:3: lv_advices_0_0= ruleAdvice
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getAdvicesAdviceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_9);
            	    lv_advices_0_0=ruleAdvice();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"advices",
            	              		lv_advices_0_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Advice");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_1=(Token)match(input,15,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLanguageUnitAccess().getVilScriptKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:257:1: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:258:1: (lv_name_2_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:258:1: (lv_name_2_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:259:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
            lv_name_2_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
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

            otherlv_3=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLanguageUnitAccess().getLeftParenthesisKeyword_3());
                  
            }
            // InternalVilBuildLanguage.g:279:1: ( (lv_param_4_0= ruleParameterList ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_VERSION||(LA5_0>=RULE_ID && LA5_0<=RULE_EXPONENT)||LA5_0==41||(LA5_0>=69 && LA5_0<=72)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalVilBuildLanguage.g:280:1: (lv_param_4_0= ruleParameterList )
                    {
                    // InternalVilBuildLanguage.g:280:1: (lv_param_4_0= ruleParameterList )
                    // InternalVilBuildLanguage.g:281:3: lv_param_4_0= ruleParameterList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getParamParameterListParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
                    lv_param_4_0=ruleParameterList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_4_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ParameterList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getLanguageUnitAccess().getRightParenthesisKeyword_5());
                  
            }
            // InternalVilBuildLanguage.g:301:1: ( (lv_parent_6_0= ruleScriptParentDecl ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVilBuildLanguage.g:302:1: (lv_parent_6_0= ruleScriptParentDecl )
                    {
                    // InternalVilBuildLanguage.g:302:1: (lv_parent_6_0= ruleScriptParentDecl )
                    // InternalVilBuildLanguage.g:303:3: lv_parent_6_0= ruleScriptParentDecl
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getParentScriptParentDeclParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_15);
                    lv_parent_6_0=ruleScriptParentDecl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"parent",
                              		lv_parent_6_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.ScriptParentDecl");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getLanguageUnitAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // InternalVilBuildLanguage.g:323:1: ( (lv_version_8_0= ruleVersionStmt ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==41) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_VERSION) ) {
                    int LA7_3 = input.LA(3);

                    if ( (LA7_3==14) ) {
                        int LA7_4 = input.LA(4);

                        if ( (synpred7_InternalVilBuildLanguage()) ) {
                            alt7=1;
                        }
                    }
                }
            }
            switch (alt7) {
                case 1 :
                    // InternalVilBuildLanguage.g:324:1: (lv_version_8_0= ruleVersionStmt )
                    {
                    // InternalVilBuildLanguage.g:324:1: (lv_version_8_0= ruleVersionStmt )
                    // InternalVilBuildLanguage.g:325:3: lv_version_8_0= ruleVersionStmt
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getVersionVersionStmtParserRuleCall_8_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_16);
                    lv_version_8_0=ruleVersionStmt();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
                      	        }
                             		set(
                             			current, 
                             			"version",
                              		lv_version_8_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VersionStmt");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalVilBuildLanguage.g:341:3: ( (lv_loadProperties_9_0= ruleLoadProperties ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:342:1: (lv_loadProperties_9_0= ruleLoadProperties )
            	    {
            	    // InternalVilBuildLanguage.g:342:1: (lv_loadProperties_9_0= ruleLoadProperties )
            	    // InternalVilBuildLanguage.g:343:3: lv_loadProperties_9_0= ruleLoadProperties
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getLoadPropertiesLoadPropertiesParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_16);
            	    lv_loadProperties_9_0=ruleLoadProperties();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"loadProperties",
            	              		lv_loadProperties_9_0, 
            	              		"de.uni_hildesheim.sse.VilBuildLanguage.LoadProperties");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalVilBuildLanguage.g:359:3: ( (lv_contents_10_0= ruleScriptContents ) )
            // InternalVilBuildLanguage.g:360:1: (lv_contents_10_0= ruleScriptContents )
            {
            // InternalVilBuildLanguage.g:360:1: (lv_contents_10_0= ruleScriptContents )
            // InternalVilBuildLanguage.g:361:3: lv_contents_10_0= ruleScriptContents
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getContentsScriptContentsParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_17);
            lv_contents_10_0=ruleScriptContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLanguageUnitRule());
              	        }
                     		set(
                     			current, 
                     			"contents",
                      		lv_contents_10_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.ScriptContents");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getLanguageUnitAccess().getRightCurlyBracketKeyword_11());
                  
            }
            // InternalVilBuildLanguage.g:381:1: (otherlv_12= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVilBuildLanguage.g:381:3: otherlv_12= ';'
                    {
                    otherlv_12=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getLanguageUnitAccess().getSemicolonKeyword_12());
                          
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
    // $ANTLR end "ruleLanguageUnit"


    // $ANTLR start "entryRuleScriptParentDecl"
    // InternalVilBuildLanguage.g:393:1: entryRuleScriptParentDecl returns [EObject current=null] : iv_ruleScriptParentDecl= ruleScriptParentDecl EOF ;
    public final EObject entryRuleScriptParentDecl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptParentDecl = null;


        try {
            // InternalVilBuildLanguage.g:394:2: (iv_ruleScriptParentDecl= ruleScriptParentDecl EOF )
            // InternalVilBuildLanguage.g:395:2: iv_ruleScriptParentDecl= ruleScriptParentDecl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptParentDeclRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScriptParentDecl=ruleScriptParentDecl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScriptParentDecl; 
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
    // $ANTLR end "entryRuleScriptParentDecl"


    // $ANTLR start "ruleScriptParentDecl"
    // InternalVilBuildLanguage.g:402:1: ruleScriptParentDecl returns [EObject current=null] : (otherlv_0= 'extends' ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleScriptParentDecl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:405:28: ( (otherlv_0= 'extends' ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalVilBuildLanguage.g:406:1: (otherlv_0= 'extends' ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalVilBuildLanguage.g:406:1: (otherlv_0= 'extends' ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalVilBuildLanguage.g:406:3: otherlv_0= 'extends' ( (lv_name_1_0= ruleIdentifier ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getScriptParentDeclAccess().getExtendsKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:410:1: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:411:1: (lv_name_1_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:411:1: (lv_name_1_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:412:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getScriptParentDeclAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_name_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getScriptParentDeclRule());
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
    // $ANTLR end "ruleScriptParentDecl"


    // $ANTLR start "entryRuleLoadProperties"
    // InternalVilBuildLanguage.g:436:1: entryRuleLoadProperties returns [EObject current=null] : iv_ruleLoadProperties= ruleLoadProperties EOF ;
    public final EObject entryRuleLoadProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadProperties = null;


        try {
            // InternalVilBuildLanguage.g:437:2: (iv_ruleLoadProperties= ruleLoadProperties EOF )
            // InternalVilBuildLanguage.g:438:2: iv_ruleLoadProperties= ruleLoadProperties EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoadPropertiesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoadProperties=ruleLoadProperties();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoadProperties; 
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
    // $ANTLR end "entryRuleLoadProperties"


    // $ANTLR start "ruleLoadProperties"
    // InternalVilBuildLanguage.g:445:1: ruleLoadProperties returns [EObject current=null] : (otherlv_0= 'load' otherlv_1= 'properties' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ';' ) ;
    public final EObject ruleLoadProperties() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:448:28: ( (otherlv_0= 'load' otherlv_1= 'properties' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ';' ) )
            // InternalVilBuildLanguage.g:449:1: (otherlv_0= 'load' otherlv_1= 'properties' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ';' )
            {
            // InternalVilBuildLanguage.g:449:1: (otherlv_0= 'load' otherlv_1= 'properties' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ';' )
            // InternalVilBuildLanguage.g:449:3: otherlv_0= 'load' otherlv_1= 'properties' ( (lv_path_2_0= RULE_STRING ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLoadPropertiesAccess().getLoadKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLoadPropertiesAccess().getPropertiesKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:457:1: ( (lv_path_2_0= RULE_STRING ) )
            // InternalVilBuildLanguage.g:458:1: (lv_path_2_0= RULE_STRING )
            {
            // InternalVilBuildLanguage.g:458:1: (lv_path_2_0= RULE_STRING )
            // InternalVilBuildLanguage.g:459:3: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_path_2_0, grammarAccess.getLoadPropertiesAccess().getPathSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLoadPropertiesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"path",
                      		lv_path_2_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getLoadPropertiesAccess().getSemicolonKeyword_3());
                  
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
    // $ANTLR end "ruleLoadProperties"


    // $ANTLR start "entryRuleScriptContents"
    // InternalVilBuildLanguage.g:487:1: entryRuleScriptContents returns [EObject current=null] : iv_ruleScriptContents= ruleScriptContents EOF ;
    public final EObject entryRuleScriptContents() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScriptContents = null;


        try {
            // InternalVilBuildLanguage.g:488:2: (iv_ruleScriptContents= ruleScriptContents EOF )
            // InternalVilBuildLanguage.g:489:2: iv_ruleScriptContents= ruleScriptContents EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptContentsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScriptContents=ruleScriptContents();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScriptContents; 
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
    // $ANTLR end "entryRuleScriptContents"


    // $ANTLR start "ruleScriptContents"
    // InternalVilBuildLanguage.g:496:1: ruleScriptContents returns [EObject current=null] : ( () ( ( (lv_elements_1_0= ruleVariableDeclaration ) ) | ( (lv_elements_2_0= ruleTypeDef ) ) | ( (lv_elements_3_0= ruleRuleDeclaration ) ) )* ) ;
    public final EObject ruleScriptContents() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_1_0 = null;

        EObject lv_elements_2_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:499:28: ( ( () ( ( (lv_elements_1_0= ruleVariableDeclaration ) ) | ( (lv_elements_2_0= ruleTypeDef ) ) | ( (lv_elements_3_0= ruleRuleDeclaration ) ) )* ) )
            // InternalVilBuildLanguage.g:500:1: ( () ( ( (lv_elements_1_0= ruleVariableDeclaration ) ) | ( (lv_elements_2_0= ruleTypeDef ) ) | ( (lv_elements_3_0= ruleRuleDeclaration ) ) )* )
            {
            // InternalVilBuildLanguage.g:500:1: ( () ( ( (lv_elements_1_0= ruleVariableDeclaration ) ) | ( (lv_elements_2_0= ruleTypeDef ) ) | ( (lv_elements_3_0= ruleRuleDeclaration ) ) )* )
            // InternalVilBuildLanguage.g:500:2: () ( ( (lv_elements_1_0= ruleVariableDeclaration ) ) | ( (lv_elements_2_0= ruleTypeDef ) ) | ( (lv_elements_3_0= ruleRuleDeclaration ) ) )*
            {
            // InternalVilBuildLanguage.g:500:2: ()
            // InternalVilBuildLanguage.g:501:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getScriptContentsAccess().getScriptContentsAction_0(),
                          current);
                  
            }

            }

            // InternalVilBuildLanguage.g:509:2: ( ( (lv_elements_1_0= ruleVariableDeclaration ) ) | ( (lv_elements_2_0= ruleTypeDef ) ) | ( (lv_elements_3_0= ruleRuleDeclaration ) ) )*
            loop10:
            do {
                int alt10=4;
                alt10 = dfa10.predict(input);
                switch (alt10) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:509:3: ( (lv_elements_1_0= ruleVariableDeclaration ) )
            	    {
            	    // InternalVilBuildLanguage.g:509:3: ( (lv_elements_1_0= ruleVariableDeclaration ) )
            	    // InternalVilBuildLanguage.g:510:1: (lv_elements_1_0= ruleVariableDeclaration )
            	    {
            	    // InternalVilBuildLanguage.g:510:1: (lv_elements_1_0= ruleVariableDeclaration )
            	    // InternalVilBuildLanguage.g:511:3: lv_elements_1_0= ruleVariableDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptContentsAccess().getElementsVariableDeclarationParserRuleCall_1_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_elements_1_0=ruleVariableDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptContentsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_1_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VariableDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalVilBuildLanguage.g:528:6: ( (lv_elements_2_0= ruleTypeDef ) )
            	    {
            	    // InternalVilBuildLanguage.g:528:6: ( (lv_elements_2_0= ruleTypeDef ) )
            	    // InternalVilBuildLanguage.g:529:1: (lv_elements_2_0= ruleTypeDef )
            	    {
            	    // InternalVilBuildLanguage.g:529:1: (lv_elements_2_0= ruleTypeDef )
            	    // InternalVilBuildLanguage.g:530:3: lv_elements_2_0= ruleTypeDef
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptContentsAccess().getElementsTypeDefParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_elements_2_0=ruleTypeDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptContentsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.TypeDef");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalVilBuildLanguage.g:547:6: ( (lv_elements_3_0= ruleRuleDeclaration ) )
            	    {
            	    // InternalVilBuildLanguage.g:547:6: ( (lv_elements_3_0= ruleRuleDeclaration ) )
            	    // InternalVilBuildLanguage.g:548:1: (lv_elements_3_0= ruleRuleDeclaration )
            	    {
            	    // InternalVilBuildLanguage.g:548:1: (lv_elements_3_0= ruleRuleDeclaration )
            	    // InternalVilBuildLanguage.g:549:3: lv_elements_3_0= ruleRuleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getScriptContentsAccess().getElementsRuleDeclarationParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_20);
            	    lv_elements_3_0=ruleRuleDeclaration();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getScriptContentsRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_3_0, 
            	              		"de.uni_hildesheim.sse.VilBuildLanguage.RuleDeclaration");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end "ruleScriptContents"


    // $ANTLR start "entryRuleRuleDeclaration"
    // InternalVilBuildLanguage.g:573:1: entryRuleRuleDeclaration returns [EObject current=null] : iv_ruleRuleDeclaration= ruleRuleDeclaration EOF ;
    public final EObject entryRuleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleDeclaration = null;


        try {
            // InternalVilBuildLanguage.g:574:2: (iv_ruleRuleDeclaration= ruleRuleDeclaration EOF )
            // InternalVilBuildLanguage.g:575:2: iv_ruleRuleDeclaration= ruleRuleDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleDeclaration=ruleRuleDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleDeclaration; 
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
    // $ANTLR end "entryRuleRuleDeclaration"


    // $ANTLR start "ruleRuleDeclaration"
    // InternalVilBuildLanguage.g:582:1: ruleRuleDeclaration returns [EObject current=null] : ( () ( ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_conditions_8_0= ruleRuleConditions ) )? ( (lv_block_9_0= ruleRuleElementBlock ) ) (otherlv_10= ';' )? ) ;
    public final EObject ruleRuleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_type_1_0 = null;

        EObject lv_modifier_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_paramList_5_0 = null;

        EObject lv_conditions_8_0 = null;

        EObject lv_block_9_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:585:28: ( ( () ( ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_conditions_8_0= ruleRuleConditions ) )? ( (lv_block_9_0= ruleRuleElementBlock ) ) (otherlv_10= ';' )? ) )
            // InternalVilBuildLanguage.g:586:1: ( () ( ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_conditions_8_0= ruleRuleConditions ) )? ( (lv_block_9_0= ruleRuleElementBlock ) ) (otherlv_10= ';' )? )
            {
            // InternalVilBuildLanguage.g:586:1: ( () ( ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_conditions_8_0= ruleRuleConditions ) )? ( (lv_block_9_0= ruleRuleElementBlock ) ) (otherlv_10= ';' )? )
            // InternalVilBuildLanguage.g:586:2: () ( ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '=' )? ( (lv_conditions_8_0= ruleRuleConditions ) )? ( (lv_block_9_0= ruleRuleElementBlock ) ) (otherlv_10= ';' )?
            {
            // InternalVilBuildLanguage.g:586:2: ()
            // InternalVilBuildLanguage.g:587:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRuleDeclarationAccess().getRuleDeclarationAction_0(),
                          current);
                  
            }

            }

            // InternalVilBuildLanguage.g:595:2: ( ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '=' )?
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalVilBuildLanguage.g:595:3: ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '='
                    {
                    // InternalVilBuildLanguage.g:595:3: ( (lv_type_1_0= ruleType ) )?
                    int alt11=2;
                    switch ( input.LA(1) ) {
                        case RULE_ID:
                            {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1==RULE_VERSION||(LA11_1>=RULE_ID && LA11_1<=RULE_EXPONENT)||LA11_1==26||LA11_1==41||LA11_1==65) ) {
                                alt11=1;
                            }
                            }
                            break;
                        case RULE_VERSION:
                            {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==RULE_VERSION||(LA11_2>=RULE_ID && LA11_2<=RULE_EXPONENT)||LA11_2==26||LA11_2==41||LA11_2==65) ) {
                                alt11=1;
                            }
                            }
                            break;
                        case RULE_EXPONENT:
                            {
                            int LA11_3 = input.LA(2);

                            if ( (LA11_3==RULE_VERSION||(LA11_3>=RULE_ID && LA11_3<=RULE_EXPONENT)||LA11_3==26||LA11_3==41||LA11_3==65) ) {
                                alt11=1;
                            }
                            }
                            break;
                        case 41:
                            {
                            int LA11_4 = input.LA(2);

                            if ( (LA11_4==RULE_VERSION||(LA11_4>=RULE_ID && LA11_4<=RULE_EXPONENT)||LA11_4==26||LA11_4==41||LA11_4==65) ) {
                                alt11=1;
                            }
                            }
                            break;
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                            {
                            alt11=1;
                            }
                            break;
                    }

                    switch (alt11) {
                        case 1 :
                            // InternalVilBuildLanguage.g:596:1: (lv_type_1_0= ruleType )
                            {
                            // InternalVilBuildLanguage.g:596:1: (lv_type_1_0= ruleType )
                            // InternalVilBuildLanguage.g:597:3: lv_type_1_0= ruleType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getTypeTypeParserRuleCall_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_21);
                            lv_type_1_0=ruleType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
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
                            break;

                    }

                    // InternalVilBuildLanguage.g:613:3: ( (lv_modifier_2_0= ruleRuleModifier ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==26) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalVilBuildLanguage.g:614:1: (lv_modifier_2_0= ruleRuleModifier )
                            {
                            // InternalVilBuildLanguage.g:614:1: (lv_modifier_2_0= ruleRuleModifier )
                            // InternalVilBuildLanguage.g:615:3: lv_modifier_2_0= ruleRuleModifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getModifierRuleModifierParserRuleCall_1_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_10);
                            lv_modifier_2_0=ruleRuleModifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"modifier",
                                      		lv_modifier_2_0, 
                                      		"de.uni_hildesheim.sse.VilBuildLanguage.RuleModifier");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    // InternalVilBuildLanguage.g:631:3: ( (lv_name_3_0= ruleIdentifier ) )
                    // InternalVilBuildLanguage.g:632:1: (lv_name_3_0= ruleIdentifier )
                    {
                    // InternalVilBuildLanguage.g:632:1: (lv_name_3_0= ruleIdentifier )
                    // InternalVilBuildLanguage.g:633:3: lv_name_3_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getNameIdentifierParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_name_3_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"name",
                              		lv_name_3_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,16,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getRuleDeclarationAccess().getLeftParenthesisKeyword_1_3());
                          
                    }
                    // InternalVilBuildLanguage.g:653:1: ( (lv_paramList_5_0= ruleParameterList ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_VERSION||(LA13_0>=RULE_ID && LA13_0<=RULE_EXPONENT)||LA13_0==41||(LA13_0>=69 && LA13_0<=72)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalVilBuildLanguage.g:654:1: (lv_paramList_5_0= ruleParameterList )
                            {
                            // InternalVilBuildLanguage.g:654:1: (lv_paramList_5_0= ruleParameterList )
                            // InternalVilBuildLanguage.g:655:3: lv_paramList_5_0= ruleParameterList
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getParamListParameterListParserRuleCall_1_4_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_13);
                            lv_paramList_5_0=ruleParameterList();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"paramList",
                                      		lv_paramList_5_0, 
                                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ParameterList");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,17,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getRuleDeclarationAccess().getRightParenthesisKeyword_1_5());
                          
                    }
                    otherlv_7=(Token)match(input,23,FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getRuleDeclarationAccess().getEqualsSignKeyword_1_6());
                          
                    }

                    }
                    break;

            }

            // InternalVilBuildLanguage.g:679:3: ( (lv_conditions_8_0= ruleRuleConditions ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_EXPONENT)||LA15_0==16||LA15_0==24||(LA15_0>=28 && LA15_0<=29)||LA15_0==34||LA15_0==37||LA15_0==41||LA15_0==54||(LA15_0>=57 && LA15_0<=60)||(LA15_0>=66 && LA15_0<=68)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVilBuildLanguage.g:680:1: (lv_conditions_8_0= ruleRuleConditions )
                    {
                    // InternalVilBuildLanguage.g:680:1: (lv_conditions_8_0= ruleRuleConditions )
                    // InternalVilBuildLanguage.g:681:3: lv_conditions_8_0= ruleRuleConditions
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getConditionsRuleConditionsParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_23);
                    lv_conditions_8_0=ruleRuleConditions();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
                      	        }
                             		set(
                             			current, 
                             			"conditions",
                              		lv_conditions_8_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.RuleConditions");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalVilBuildLanguage.g:697:3: ( (lv_block_9_0= ruleRuleElementBlock ) )
            // InternalVilBuildLanguage.g:698:1: (lv_block_9_0= ruleRuleElementBlock )
            {
            // InternalVilBuildLanguage.g:698:1: (lv_block_9_0= ruleRuleElementBlock )
            // InternalVilBuildLanguage.g:699:3: lv_block_9_0= ruleRuleElementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getBlockRuleElementBlockParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_18);
            lv_block_9_0=ruleRuleElementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRuleDeclarationRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_9_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.RuleElementBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalVilBuildLanguage.g:715:2: (otherlv_10= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==14) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVilBuildLanguage.g:715:4: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getRuleDeclarationAccess().getSemicolonKeyword_4());
                          
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
    // $ANTLR end "ruleRuleDeclaration"


    // $ANTLR start "entryRuleRuleConditions"
    // InternalVilBuildLanguage.g:727:1: entryRuleRuleConditions returns [EObject current=null] : iv_ruleRuleConditions= ruleRuleConditions EOF ;
    public final EObject entryRuleRuleConditions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleConditions = null;


        try {
            // InternalVilBuildLanguage.g:728:2: (iv_ruleRuleConditions= ruleRuleConditions EOF )
            // InternalVilBuildLanguage.g:729:2: iv_ruleRuleConditions= ruleRuleConditions EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleConditionsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleConditions=ruleRuleConditions();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleConditions; 
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
    // $ANTLR end "entryRuleRuleConditions"


    // $ANTLR start "ruleRuleConditions"
    // InternalVilBuildLanguage.g:736:1: ruleRuleConditions returns [EObject current=null] : ( () ( (lv_postcondition_1_0= ruleLogicalExpression ) )? otherlv_2= ':' ( ( (lv_preconditions_3_0= ruleLogicalExpression ) ) (otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) ) )* )? ) ;
    public final EObject ruleRuleConditions() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_postcondition_1_0 = null;

        EObject lv_preconditions_3_0 = null;

        EObject lv_preconditions_5_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:739:28: ( ( () ( (lv_postcondition_1_0= ruleLogicalExpression ) )? otherlv_2= ':' ( ( (lv_preconditions_3_0= ruleLogicalExpression ) ) (otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) ) )* )? ) )
            // InternalVilBuildLanguage.g:740:1: ( () ( (lv_postcondition_1_0= ruleLogicalExpression ) )? otherlv_2= ':' ( ( (lv_preconditions_3_0= ruleLogicalExpression ) ) (otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) ) )* )? )
            {
            // InternalVilBuildLanguage.g:740:1: ( () ( (lv_postcondition_1_0= ruleLogicalExpression ) )? otherlv_2= ':' ( ( (lv_preconditions_3_0= ruleLogicalExpression ) ) (otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) ) )* )? )
            // InternalVilBuildLanguage.g:740:2: () ( (lv_postcondition_1_0= ruleLogicalExpression ) )? otherlv_2= ':' ( ( (lv_preconditions_3_0= ruleLogicalExpression ) ) (otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) ) )* )?
            {
            // InternalVilBuildLanguage.g:740:2: ()
            // InternalVilBuildLanguage.g:741:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRuleConditionsAccess().getRuleConditionsAction_0(),
                          current);
                  
            }

            }

            // InternalVilBuildLanguage.g:749:2: ( (lv_postcondition_1_0= ruleLogicalExpression ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_EXPONENT)||LA17_0==16||(LA17_0>=28 && LA17_0<=29)||LA17_0==34||LA17_0==37||LA17_0==41||LA17_0==54||(LA17_0>=57 && LA17_0<=60)||(LA17_0>=66 && LA17_0<=68)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVilBuildLanguage.g:750:1: (lv_postcondition_1_0= ruleLogicalExpression )
                    {
                    // InternalVilBuildLanguage.g:750:1: (lv_postcondition_1_0= ruleLogicalExpression )
                    // InternalVilBuildLanguage.g:751:3: lv_postcondition_1_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleConditionsAccess().getPostconditionLogicalExpressionParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_24);
                    lv_postcondition_1_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleConditionsRule());
                      	        }
                             		add(
                             			current, 
                             			"postcondition",
                              		lv_postcondition_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.LogicalExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,24,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRuleConditionsAccess().getColonKeyword_2());
                  
            }
            // InternalVilBuildLanguage.g:771:1: ( ( (lv_preconditions_3_0= ruleLogicalExpression ) ) (otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_EXPONENT)||LA19_0==16||(LA19_0>=28 && LA19_0<=29)||LA19_0==34||LA19_0==37||LA19_0==41||LA19_0==54||(LA19_0>=57 && LA19_0<=60)||(LA19_0>=66 && LA19_0<=68)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVilBuildLanguage.g:771:2: ( (lv_preconditions_3_0= ruleLogicalExpression ) ) (otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) ) )*
                    {
                    // InternalVilBuildLanguage.g:771:2: ( (lv_preconditions_3_0= ruleLogicalExpression ) )
                    // InternalVilBuildLanguage.g:772:1: (lv_preconditions_3_0= ruleLogicalExpression )
                    {
                    // InternalVilBuildLanguage.g:772:1: (lv_preconditions_3_0= ruleLogicalExpression )
                    // InternalVilBuildLanguage.g:773:3: lv_preconditions_3_0= ruleLogicalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleConditionsAccess().getPreconditionsLogicalExpressionParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_26);
                    lv_preconditions_3_0=ruleLogicalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleConditionsRule());
                      	        }
                             		add(
                             			current, 
                             			"preconditions",
                              		lv_preconditions_3_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.LogicalExpression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalVilBuildLanguage.g:789:2: (otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==25) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalVilBuildLanguage.g:789:4: otherlv_4= ',' ( (lv_preconditions_5_0= ruleLogicalExpression ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getRuleConditionsAccess().getCommaKeyword_3_1_0());
                    	          
                    	    }
                    	    // InternalVilBuildLanguage.g:793:1: ( (lv_preconditions_5_0= ruleLogicalExpression ) )
                    	    // InternalVilBuildLanguage.g:794:1: (lv_preconditions_5_0= ruleLogicalExpression )
                    	    {
                    	    // InternalVilBuildLanguage.g:794:1: (lv_preconditions_5_0= ruleLogicalExpression )
                    	    // InternalVilBuildLanguage.g:795:3: lv_preconditions_5_0= ruleLogicalExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRuleConditionsAccess().getPreconditionsLogicalExpressionParserRuleCall_3_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_26);
                    	    lv_preconditions_5_0=ruleLogicalExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getRuleConditionsRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"preconditions",
                    	              		lv_preconditions_5_0, 
                    	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.LogicalExpression");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


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
    // $ANTLR end "ruleRuleConditions"


    // $ANTLR start "entryRuleRuleElementBlock"
    // InternalVilBuildLanguage.g:819:1: entryRuleRuleElementBlock returns [EObject current=null] : iv_ruleRuleElementBlock= ruleRuleElementBlock EOF ;
    public final EObject entryRuleRuleElementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleElementBlock = null;


        try {
            // InternalVilBuildLanguage.g:820:2: (iv_ruleRuleElementBlock= ruleRuleElementBlock EOF )
            // InternalVilBuildLanguage.g:821:2: iv_ruleRuleElementBlock= ruleRuleElementBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleElementBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleElementBlock=ruleRuleElementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleElementBlock; 
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
    // $ANTLR end "entryRuleRuleElementBlock"


    // $ANTLR start "ruleRuleElementBlock"
    // InternalVilBuildLanguage.g:828:1: ruleRuleElementBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_elements_2_0= ruleRuleElement ) )* otherlv_3= '}' ) ;
    public final EObject ruleRuleElementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:831:28: ( ( () otherlv_1= '{' ( (lv_elements_2_0= ruleRuleElement ) )* otherlv_3= '}' ) )
            // InternalVilBuildLanguage.g:832:1: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleRuleElement ) )* otherlv_3= '}' )
            {
            // InternalVilBuildLanguage.g:832:1: ( () otherlv_1= '{' ( (lv_elements_2_0= ruleRuleElement ) )* otherlv_3= '}' )
            // InternalVilBuildLanguage.g:832:2: () otherlv_1= '{' ( (lv_elements_2_0= ruleRuleElement ) )* otherlv_3= '}'
            {
            // InternalVilBuildLanguage.g:832:2: ()
            // InternalVilBuildLanguage.g:833:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getRuleElementBlockAccess().getRuleElementBlockAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRuleElementBlockAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:845:1: ( (lv_elements_2_0= ruleRuleElement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_EXPONENT)||LA20_0==16||LA20_0==18||(LA20_0>=28 && LA20_0<=32)||LA20_0==34||(LA20_0>=37 && LA20_0<=38)||LA20_0==41||LA20_0==54||(LA20_0>=57 && LA20_0<=60)||(LA20_0>=66 && LA20_0<=72)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:846:1: (lv_elements_2_0= ruleRuleElement )
            	    {
            	    // InternalVilBuildLanguage.g:846:1: (lv_elements_2_0= ruleRuleElement )
            	    // InternalVilBuildLanguage.g:847:3: lv_elements_2_0= ruleRuleElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRuleElementBlockAccess().getElementsRuleElementParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_elements_2_0=ruleRuleElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRuleElementBlockRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elements",
            	              		lv_elements_2_0, 
            	              		"de.uni_hildesheim.sse.VilBuildLanguage.RuleElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getRuleElementBlockAccess().getRightCurlyBracketKeyword_3());
                  
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
    // $ANTLR end "ruleRuleElementBlock"


    // $ANTLR start "entryRuleRuleElement"
    // InternalVilBuildLanguage.g:875:1: entryRuleRuleElement returns [EObject current=null] : iv_ruleRuleElement= ruleRuleElement EOF ;
    public final EObject entryRuleRuleElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleElement = null;


        try {
            // InternalVilBuildLanguage.g:876:2: (iv_ruleRuleElement= ruleRuleElement EOF )
            // InternalVilBuildLanguage.g:877:2: iv_ruleRuleElement= ruleRuleElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleElementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleElement=ruleRuleElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleElement; 
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
    // $ANTLR end "entryRuleRuleElement"


    // $ANTLR start "ruleRuleElement"
    // InternalVilBuildLanguage.g:884:1: ruleRuleElement returns [EObject current=null] : ( ( (lv_varDecl_0_0= ruleVariableDeclaration ) ) | ( (lv_exprStmt_1_0= ruleExpressionStatement ) ) | ( ( (lv_while_2_0= ruleWhile ) ) (otherlv_3= ';' )? ) | ( ( (lv_for_4_0= ruleFor ) ) (otherlv_5= ';' )? ) ) ;
    public final EObject ruleRuleElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_varDecl_0_0 = null;

        EObject lv_exprStmt_1_0 = null;

        EObject lv_while_2_0 = null;

        EObject lv_for_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:887:28: ( ( ( (lv_varDecl_0_0= ruleVariableDeclaration ) ) | ( (lv_exprStmt_1_0= ruleExpressionStatement ) ) | ( ( (lv_while_2_0= ruleWhile ) ) (otherlv_3= ';' )? ) | ( ( (lv_for_4_0= ruleFor ) ) (otherlv_5= ';' )? ) ) )
            // InternalVilBuildLanguage.g:888:1: ( ( (lv_varDecl_0_0= ruleVariableDeclaration ) ) | ( (lv_exprStmt_1_0= ruleExpressionStatement ) ) | ( ( (lv_while_2_0= ruleWhile ) ) (otherlv_3= ';' )? ) | ( ( (lv_for_4_0= ruleFor ) ) (otherlv_5= ';' )? ) )
            {
            // InternalVilBuildLanguage.g:888:1: ( ( (lv_varDecl_0_0= ruleVariableDeclaration ) ) | ( (lv_exprStmt_1_0= ruleExpressionStatement ) ) | ( ( (lv_while_2_0= ruleWhile ) ) (otherlv_3= ';' )? ) | ( ( (lv_for_4_0= ruleFor ) ) (otherlv_5= ';' )? ) )
            int alt23=4;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalVilBuildLanguage.g:888:2: ( (lv_varDecl_0_0= ruleVariableDeclaration ) )
                    {
                    // InternalVilBuildLanguage.g:888:2: ( (lv_varDecl_0_0= ruleVariableDeclaration ) )
                    // InternalVilBuildLanguage.g:889:1: (lv_varDecl_0_0= ruleVariableDeclaration )
                    {
                    // InternalVilBuildLanguage.g:889:1: (lv_varDecl_0_0= ruleVariableDeclaration )
                    // InternalVilBuildLanguage.g:890:3: lv_varDecl_0_0= ruleVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleElementAccess().getVarDeclVariableDeclarationParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_varDecl_0_0=ruleVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleElementRule());
                      	        }
                             		set(
                             			current, 
                             			"varDecl",
                              		lv_varDecl_0_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.VariableDeclaration");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:907:6: ( (lv_exprStmt_1_0= ruleExpressionStatement ) )
                    {
                    // InternalVilBuildLanguage.g:907:6: ( (lv_exprStmt_1_0= ruleExpressionStatement ) )
                    // InternalVilBuildLanguage.g:908:1: (lv_exprStmt_1_0= ruleExpressionStatement )
                    {
                    // InternalVilBuildLanguage.g:908:1: (lv_exprStmt_1_0= ruleExpressionStatement )
                    // InternalVilBuildLanguage.g:909:3: lv_exprStmt_1_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleElementAccess().getExprStmtExpressionStatementParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_exprStmt_1_0=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleElementRule());
                      	        }
                             		set(
                             			current, 
                             			"exprStmt",
                              		lv_exprStmt_1_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.ExpressionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalVilBuildLanguage.g:926:6: ( ( (lv_while_2_0= ruleWhile ) ) (otherlv_3= ';' )? )
                    {
                    // InternalVilBuildLanguage.g:926:6: ( ( (lv_while_2_0= ruleWhile ) ) (otherlv_3= ';' )? )
                    // InternalVilBuildLanguage.g:926:7: ( (lv_while_2_0= ruleWhile ) ) (otherlv_3= ';' )?
                    {
                    // InternalVilBuildLanguage.g:926:7: ( (lv_while_2_0= ruleWhile ) )
                    // InternalVilBuildLanguage.g:927:1: (lv_while_2_0= ruleWhile )
                    {
                    // InternalVilBuildLanguage.g:927:1: (lv_while_2_0= ruleWhile )
                    // InternalVilBuildLanguage.g:928:3: lv_while_2_0= ruleWhile
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleElementAccess().getWhileWhileParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
                    lv_while_2_0=ruleWhile();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleElementRule());
                      	        }
                             		set(
                             			current, 
                             			"while",
                              		lv_while_2_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.While");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalVilBuildLanguage.g:944:2: (otherlv_3= ';' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==14) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalVilBuildLanguage.g:944:4: otherlv_3= ';'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getRuleElementAccess().getSemicolonKeyword_2_1());
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalVilBuildLanguage.g:949:6: ( ( (lv_for_4_0= ruleFor ) ) (otherlv_5= ';' )? )
                    {
                    // InternalVilBuildLanguage.g:949:6: ( ( (lv_for_4_0= ruleFor ) ) (otherlv_5= ';' )? )
                    // InternalVilBuildLanguage.g:949:7: ( (lv_for_4_0= ruleFor ) ) (otherlv_5= ';' )?
                    {
                    // InternalVilBuildLanguage.g:949:7: ( (lv_for_4_0= ruleFor ) )
                    // InternalVilBuildLanguage.g:950:1: (lv_for_4_0= ruleFor )
                    {
                    // InternalVilBuildLanguage.g:950:1: (lv_for_4_0= ruleFor )
                    // InternalVilBuildLanguage.g:951:3: lv_for_4_0= ruleFor
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRuleElementAccess().getForForParserRuleCall_3_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
                    lv_for_4_0=ruleFor();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getRuleElementRule());
                      	        }
                             		set(
                             			current, 
                             			"for",
                              		lv_for_4_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.For");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalVilBuildLanguage.g:967:2: (otherlv_5= ';' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==14) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalVilBuildLanguage.g:967:4: otherlv_5= ';'
                            {
                            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_5, grammarAccess.getRuleElementAccess().getSemicolonKeyword_3_1());
                                  
                            }

                            }
                            break;

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
    // $ANTLR end "ruleRuleElement"


    // $ANTLR start "entryRuleRuleModifier"
    // InternalVilBuildLanguage.g:979:1: entryRuleRuleModifier returns [EObject current=null] : iv_ruleRuleModifier= ruleRuleModifier EOF ;
    public final EObject entryRuleRuleModifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRuleModifier = null;


        try {
            // InternalVilBuildLanguage.g:980:2: (iv_ruleRuleModifier= ruleRuleModifier EOF )
            // InternalVilBuildLanguage.g:981:2: iv_ruleRuleModifier= ruleRuleModifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRuleModifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRuleModifier=ruleRuleModifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRuleModifier; 
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
    // $ANTLR end "entryRuleRuleModifier"


    // $ANTLR start "ruleRuleModifier"
    // InternalVilBuildLanguage.g:988:1: ruleRuleModifier returns [EObject current=null] : ( (lv_protected_0_0= 'protected' ) ) ;
    public final EObject ruleRuleModifier() throws RecognitionException {
        EObject current = null;

        Token lv_protected_0_0=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:991:28: ( ( (lv_protected_0_0= 'protected' ) ) )
            // InternalVilBuildLanguage.g:992:1: ( (lv_protected_0_0= 'protected' ) )
            {
            // InternalVilBuildLanguage.g:992:1: ( (lv_protected_0_0= 'protected' ) )
            // InternalVilBuildLanguage.g:993:1: (lv_protected_0_0= 'protected' )
            {
            // InternalVilBuildLanguage.g:993:1: (lv_protected_0_0= 'protected' )
            // InternalVilBuildLanguage.g:994:3: lv_protected_0_0= 'protected'
            {
            lv_protected_0_0=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_protected_0_0, grammarAccess.getRuleModifierAccess().getProtectedProtectedKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRuleModifierRule());
              	        }
                     		setWithLastConsumed(current, "protected", lv_protected_0_0, "protected");
              	    
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
    // $ANTLR end "ruleRuleModifier"


    // $ANTLR start "entryRuleExpressionStatement"
    // InternalVilBuildLanguage.g:1015:1: entryRuleExpressionStatement returns [EObject current=null] : iv_ruleExpressionStatement= ruleExpressionStatement EOF ;
    public final EObject entryRuleExpressionStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionStatement = null;


        try {
            // InternalVilBuildLanguage.g:1016:2: (iv_ruleExpressionStatement= ruleExpressionStatement EOF )
            // InternalVilBuildLanguage.g:1017:2: iv_ruleExpressionStatement= ruleExpressionStatement EOF
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
    // InternalVilBuildLanguage.g:1024:1: ruleExpressionStatement returns [EObject current=null] : ( ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( ( (lv_alt_6_0= ruleAlternative ) ) (otherlv_7= ';' )? ) ) ;
    public final EObject ruleExpressionStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_var_0_0 = null;

        AntlrDatatypeRuleToken lv_field_2_0 = null;

        EObject lv_expr_4_0 = null;

        EObject lv_alt_6_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1027:28: ( ( ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( ( (lv_alt_6_0= ruleAlternative ) ) (otherlv_7= ';' )? ) ) )
            // InternalVilBuildLanguage.g:1028:1: ( ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( ( (lv_alt_6_0= ruleAlternative ) ) (otherlv_7= ';' )? ) )
            {
            // InternalVilBuildLanguage.g:1028:1: ( ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' ) | ( ( (lv_alt_6_0= ruleAlternative ) ) (otherlv_7= ';' )? ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_EXPONENT)||LA27_0==16||LA27_0==18||(LA27_0>=28 && LA27_0<=29)||LA27_0==34||LA27_0==37||LA27_0==41||LA27_0==54||(LA27_0>=57 && LA27_0<=60)||(LA27_0>=66 && LA27_0<=68)) ) {
                alt27=1;
            }
            else if ( (LA27_0==32) ) {
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
                    // InternalVilBuildLanguage.g:1028:2: ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' )
                    {
                    // InternalVilBuildLanguage.g:1028:2: ( ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';' )
                    // InternalVilBuildLanguage.g:1028:3: ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )? ( (lv_expr_4_0= ruleExpression ) ) otherlv_5= ';'
                    {
                    // InternalVilBuildLanguage.g:1028:3: ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )?
                    int alt25=2;
                    alt25 = dfa25.predict(input);
                    switch (alt25) {
                        case 1 :
                            // InternalVilBuildLanguage.g:1028:4: ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '='
                            {
                            // InternalVilBuildLanguage.g:1028:4: ( (lv_var_0_0= ruleIdentifier ) )
                            // InternalVilBuildLanguage.g:1029:1: (lv_var_0_0= ruleIdentifier )
                            {
                            // InternalVilBuildLanguage.g:1029:1: (lv_var_0_0= ruleIdentifier )
                            // InternalVilBuildLanguage.g:1030:3: lv_var_0_0= ruleIdentifier
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getVarIdentifierParserRuleCall_0_0_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_29);
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

                            // InternalVilBuildLanguage.g:1046:2: (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==27) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // InternalVilBuildLanguage.g:1046:4: otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) )
                                    {
                                    otherlv_1=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
                                    if ( state.backtracking==0 ) {

                                          	newLeafNode(otherlv_1, grammarAccess.getExpressionStatementAccess().getFullStopKeyword_0_0_1_0());
                                          
                                    }
                                    // InternalVilBuildLanguage.g:1050:1: ( (lv_field_2_0= ruleIdentifier ) )
                                    // InternalVilBuildLanguage.g:1051:1: (lv_field_2_0= ruleIdentifier )
                                    {
                                    // InternalVilBuildLanguage.g:1051:1: (lv_field_2_0= ruleIdentifier )
                                    // InternalVilBuildLanguage.g:1052:3: lv_field_2_0= ruleIdentifier
                                    {
                                    if ( state.backtracking==0 ) {
                                       
                                      	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getFieldIdentifierParserRuleCall_0_0_1_1_0()); 
                                      	    
                                    }
                                    pushFollow(FOLLOW_22);
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

                            otherlv_3=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_3, grammarAccess.getExpressionStatementAccess().getEqualsSignKeyword_0_0_2());
                                  
                            }

                            }
                            break;

                    }

                    // InternalVilBuildLanguage.g:1072:3: ( (lv_expr_4_0= ruleExpression ) )
                    // InternalVilBuildLanguage.g:1073:1: (lv_expr_4_0= ruleExpression )
                    {
                    // InternalVilBuildLanguage.g:1073:1: (lv_expr_4_0= ruleExpression )
                    // InternalVilBuildLanguage.g:1074:3: lv_expr_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getExprExpressionParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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

                    otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:1095:6: ( ( (lv_alt_6_0= ruleAlternative ) ) (otherlv_7= ';' )? )
                    {
                    // InternalVilBuildLanguage.g:1095:6: ( ( (lv_alt_6_0= ruleAlternative ) ) (otherlv_7= ';' )? )
                    // InternalVilBuildLanguage.g:1095:7: ( (lv_alt_6_0= ruleAlternative ) ) (otherlv_7= ';' )?
                    {
                    // InternalVilBuildLanguage.g:1095:7: ( (lv_alt_6_0= ruleAlternative ) )
                    // InternalVilBuildLanguage.g:1096:1: (lv_alt_6_0= ruleAlternative )
                    {
                    // InternalVilBuildLanguage.g:1096:1: (lv_alt_6_0= ruleAlternative )
                    // InternalVilBuildLanguage.g:1097:3: lv_alt_6_0= ruleAlternative
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionStatementAccess().getAltAlternativeParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_18);
                    lv_alt_6_0=ruleAlternative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getExpressionStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"alt",
                              		lv_alt_6_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.Alternative");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // InternalVilBuildLanguage.g:1113:2: (otherlv_7= ';' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==14) ) {
                        int LA26_1 = input.LA(2);

                        if ( (synpred31_InternalVilBuildLanguage()) ) {
                            alt26=1;
                        }
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalVilBuildLanguage.g:1113:4: otherlv_7= ';'
                            {
                            otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_7, grammarAccess.getExpressionStatementAccess().getSemicolonKeyword_1_1());
                                  
                            }

                            }
                            break;

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
    // $ANTLR end "ruleExpressionStatement"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalVilBuildLanguage.g:1125:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalVilBuildLanguage.g:1126:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalVilBuildLanguage.g:1127:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
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
    // InternalVilBuildLanguage.g:1134:1: rulePrimaryExpression returns [EObject current=null] : ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_sysEx_3_0= ruleSystemExecution ) ) | ( (lv_map_4_0= ruleMap ) ) | ( (lv_join_5_0= ruleJoin ) ) | ( (lv_instantiate_6_0= ruleInstantiate ) ) | ( (lv_newEx_7_0= ruleConstructorExecution ) ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_otherEx_0_0 = null;

        EObject lv_unqEx_1_0 = null;

        EObject lv_superEx_2_0 = null;

        EObject lv_sysEx_3_0 = null;

        EObject lv_map_4_0 = null;

        EObject lv_join_5_0 = null;

        EObject lv_instantiate_6_0 = null;

        EObject lv_newEx_7_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1137:28: ( ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_sysEx_3_0= ruleSystemExecution ) ) | ( (lv_map_4_0= ruleMap ) ) | ( (lv_join_5_0= ruleJoin ) ) | ( (lv_instantiate_6_0= ruleInstantiate ) ) | ( (lv_newEx_7_0= ruleConstructorExecution ) ) ) )
            // InternalVilBuildLanguage.g:1138:1: ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_sysEx_3_0= ruleSystemExecution ) ) | ( (lv_map_4_0= ruleMap ) ) | ( (lv_join_5_0= ruleJoin ) ) | ( (lv_instantiate_6_0= ruleInstantiate ) ) | ( (lv_newEx_7_0= ruleConstructorExecution ) ) )
            {
            // InternalVilBuildLanguage.g:1138:1: ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_sysEx_3_0= ruleSystemExecution ) ) | ( (lv_map_4_0= ruleMap ) ) | ( (lv_join_5_0= ruleJoin ) ) | ( (lv_instantiate_6_0= ruleInstantiate ) ) | ( (lv_newEx_7_0= ruleConstructorExecution ) ) )
            int alt28=8;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalVilBuildLanguage.g:1138:2: ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) )
                    {
                    // InternalVilBuildLanguage.g:1138:2: ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) )
                    // InternalVilBuildLanguage.g:1139:1: (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution )
                    {
                    // InternalVilBuildLanguage.g:1139:1: (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution )
                    // InternalVilBuildLanguage.g:1140:3: lv_otherEx_0_0= ruleExpressionOrQualifiedExecution
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
                    // InternalVilBuildLanguage.g:1157:6: ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) )
                    {
                    // InternalVilBuildLanguage.g:1157:6: ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) )
                    // InternalVilBuildLanguage.g:1158:1: (lv_unqEx_1_0= ruleUnqualifiedExecution )
                    {
                    // InternalVilBuildLanguage.g:1158:1: (lv_unqEx_1_0= ruleUnqualifiedExecution )
                    // InternalVilBuildLanguage.g:1159:3: lv_unqEx_1_0= ruleUnqualifiedExecution
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
                    // InternalVilBuildLanguage.g:1176:6: ( (lv_superEx_2_0= ruleSuperExecution ) )
                    {
                    // InternalVilBuildLanguage.g:1176:6: ( (lv_superEx_2_0= ruleSuperExecution ) )
                    // InternalVilBuildLanguage.g:1177:1: (lv_superEx_2_0= ruleSuperExecution )
                    {
                    // InternalVilBuildLanguage.g:1177:1: (lv_superEx_2_0= ruleSuperExecution )
                    // InternalVilBuildLanguage.g:1178:3: lv_superEx_2_0= ruleSuperExecution
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
                    // InternalVilBuildLanguage.g:1195:6: ( (lv_sysEx_3_0= ruleSystemExecution ) )
                    {
                    // InternalVilBuildLanguage.g:1195:6: ( (lv_sysEx_3_0= ruleSystemExecution ) )
                    // InternalVilBuildLanguage.g:1196:1: (lv_sysEx_3_0= ruleSystemExecution )
                    {
                    // InternalVilBuildLanguage.g:1196:1: (lv_sysEx_3_0= ruleSystemExecution )
                    // InternalVilBuildLanguage.g:1197:3: lv_sysEx_3_0= ruleSystemExecution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getSysExSystemExecutionParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_sysEx_3_0=ruleSystemExecution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"sysEx",
                              		lv_sysEx_3_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.SystemExecution");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalVilBuildLanguage.g:1214:6: ( (lv_map_4_0= ruleMap ) )
                    {
                    // InternalVilBuildLanguage.g:1214:6: ( (lv_map_4_0= ruleMap ) )
                    // InternalVilBuildLanguage.g:1215:1: (lv_map_4_0= ruleMap )
                    {
                    // InternalVilBuildLanguage.g:1215:1: (lv_map_4_0= ruleMap )
                    // InternalVilBuildLanguage.g:1216:3: lv_map_4_0= ruleMap
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getMapMapParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_map_4_0=ruleMap();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"map",
                              		lv_map_4_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.Map");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalVilBuildLanguage.g:1233:6: ( (lv_join_5_0= ruleJoin ) )
                    {
                    // InternalVilBuildLanguage.g:1233:6: ( (lv_join_5_0= ruleJoin ) )
                    // InternalVilBuildLanguage.g:1234:1: (lv_join_5_0= ruleJoin )
                    {
                    // InternalVilBuildLanguage.g:1234:1: (lv_join_5_0= ruleJoin )
                    // InternalVilBuildLanguage.g:1235:3: lv_join_5_0= ruleJoin
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getJoinJoinParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_join_5_0=ruleJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"join",
                              		lv_join_5_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.Join");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalVilBuildLanguage.g:1252:6: ( (lv_instantiate_6_0= ruleInstantiate ) )
                    {
                    // InternalVilBuildLanguage.g:1252:6: ( (lv_instantiate_6_0= ruleInstantiate ) )
                    // InternalVilBuildLanguage.g:1253:1: (lv_instantiate_6_0= ruleInstantiate )
                    {
                    // InternalVilBuildLanguage.g:1253:1: (lv_instantiate_6_0= ruleInstantiate )
                    // InternalVilBuildLanguage.g:1254:3: lv_instantiate_6_0= ruleInstantiate
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getInstantiateInstantiateParserRuleCall_6_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_instantiate_6_0=ruleInstantiate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"instantiate",
                              		lv_instantiate_6_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.Instantiate");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalVilBuildLanguage.g:1271:6: ( (lv_newEx_7_0= ruleConstructorExecution ) )
                    {
                    // InternalVilBuildLanguage.g:1271:6: ( (lv_newEx_7_0= ruleConstructorExecution ) )
                    // InternalVilBuildLanguage.g:1272:1: (lv_newEx_7_0= ruleConstructorExecution )
                    {
                    // InternalVilBuildLanguage.g:1272:1: (lv_newEx_7_0= ruleConstructorExecution )
                    // InternalVilBuildLanguage.g:1273:3: lv_newEx_7_0= ruleConstructorExecution
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNewExConstructorExecutionParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_newEx_7_0=ruleConstructorExecution();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"newEx",
                              		lv_newEx_7_0, 
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


    // $ANTLR start "entryRuleInstantiate"
    // InternalVilBuildLanguage.g:1297:1: entryRuleInstantiate returns [EObject current=null] : iv_ruleInstantiate= ruleInstantiate EOF ;
    public final EObject entryRuleInstantiate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstantiate = null;


        try {
            // InternalVilBuildLanguage.g:1298:2: (iv_ruleInstantiate= ruleInstantiate EOF )
            // InternalVilBuildLanguage.g:1299:2: iv_ruleInstantiate= ruleInstantiate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstantiateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleInstantiate=ruleInstantiate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstantiate; 
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
    // $ANTLR end "entryRuleInstantiate"


    // $ANTLR start "ruleInstantiate"
    // InternalVilBuildLanguage.g:1306:1: ruleInstantiate returns [EObject current=null] : (otherlv_0= 'instantiate' ( ( (lv_project_1_0= ruleIdentifier ) ) | ( (lv_ruleName_2_0= RULE_STRING ) ) ) otherlv_3= '(' ( (lv_param_4_0= ruleArgumentList ) )? otherlv_5= ')' ( (lv_versionSpec_6_0= ruleVersionSpec ) )? ) ;
    public final EObject ruleInstantiate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ruleName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_project_1_0 = null;

        EObject lv_param_4_0 = null;

        EObject lv_versionSpec_6_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1309:28: ( (otherlv_0= 'instantiate' ( ( (lv_project_1_0= ruleIdentifier ) ) | ( (lv_ruleName_2_0= RULE_STRING ) ) ) otherlv_3= '(' ( (lv_param_4_0= ruleArgumentList ) )? otherlv_5= ')' ( (lv_versionSpec_6_0= ruleVersionSpec ) )? ) )
            // InternalVilBuildLanguage.g:1310:1: (otherlv_0= 'instantiate' ( ( (lv_project_1_0= ruleIdentifier ) ) | ( (lv_ruleName_2_0= RULE_STRING ) ) ) otherlv_3= '(' ( (lv_param_4_0= ruleArgumentList ) )? otherlv_5= ')' ( (lv_versionSpec_6_0= ruleVersionSpec ) )? )
            {
            // InternalVilBuildLanguage.g:1310:1: (otherlv_0= 'instantiate' ( ( (lv_project_1_0= ruleIdentifier ) ) | ( (lv_ruleName_2_0= RULE_STRING ) ) ) otherlv_3= '(' ( (lv_param_4_0= ruleArgumentList ) )? otherlv_5= ')' ( (lv_versionSpec_6_0= ruleVersionSpec ) )? )
            // InternalVilBuildLanguage.g:1310:3: otherlv_0= 'instantiate' ( ( (lv_project_1_0= ruleIdentifier ) ) | ( (lv_ruleName_2_0= RULE_STRING ) ) ) otherlv_3= '(' ( (lv_param_4_0= ruleArgumentList ) )? otherlv_5= ')' ( (lv_versionSpec_6_0= ruleVersionSpec ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getInstantiateAccess().getInstantiateKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:1314:1: ( ( (lv_project_1_0= ruleIdentifier ) ) | ( (lv_ruleName_2_0= RULE_STRING ) ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_VERSION||(LA29_0>=RULE_ID && LA29_0<=RULE_EXPONENT)||LA29_0==41) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_STRING) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalVilBuildLanguage.g:1314:2: ( (lv_project_1_0= ruleIdentifier ) )
                    {
                    // InternalVilBuildLanguage.g:1314:2: ( (lv_project_1_0= ruleIdentifier ) )
                    // InternalVilBuildLanguage.g:1315:1: (lv_project_1_0= ruleIdentifier )
                    {
                    // InternalVilBuildLanguage.g:1315:1: (lv_project_1_0= ruleIdentifier )
                    // InternalVilBuildLanguage.g:1316:3: lv_project_1_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstantiateAccess().getProjectIdentifierParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_11);
                    lv_project_1_0=ruleIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstantiateRule());
                      	        }
                             		set(
                             			current, 
                             			"project",
                              		lv_project_1_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:1333:6: ( (lv_ruleName_2_0= RULE_STRING ) )
                    {
                    // InternalVilBuildLanguage.g:1333:6: ( (lv_ruleName_2_0= RULE_STRING ) )
                    // InternalVilBuildLanguage.g:1334:1: (lv_ruleName_2_0= RULE_STRING )
                    {
                    // InternalVilBuildLanguage.g:1334:1: (lv_ruleName_2_0= RULE_STRING )
                    // InternalVilBuildLanguage.g:1335:3: lv_ruleName_2_0= RULE_STRING
                    {
                    lv_ruleName_2_0=(Token)match(input,RULE_STRING,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_ruleName_2_0, grammarAccess.getInstantiateAccess().getRuleNameSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getInstantiateRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"ruleName",
                              		lv_ruleName_2_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,16,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getInstantiateAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalVilBuildLanguage.g:1355:1: ( (lv_param_4_0= ruleArgumentList ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_EXPONENT)||LA30_0==16||LA30_0==18||(LA30_0>=28 && LA30_0<=29)||LA30_0==34||LA30_0==37||LA30_0==41||LA30_0==54||(LA30_0>=57 && LA30_0<=60)||(LA30_0>=66 && LA30_0<=68)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalVilBuildLanguage.g:1356:1: (lv_param_4_0= ruleArgumentList )
                    {
                    // InternalVilBuildLanguage.g:1356:1: (lv_param_4_0= ruleArgumentList )
                    // InternalVilBuildLanguage.g:1357:3: lv_param_4_0= ruleArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstantiateAccess().getParamArgumentListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
                    lv_param_4_0=ruleArgumentList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstantiateRule());
                      	        }
                             		set(
                             			current, 
                             			"param",
                              		lv_param_4_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.ArgumentList");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getInstantiateAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalVilBuildLanguage.g:1377:1: ( (lv_versionSpec_6_0= ruleVersionSpec ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalVilBuildLanguage.g:1378:1: (lv_versionSpec_6_0= ruleVersionSpec )
                    {
                    // InternalVilBuildLanguage.g:1378:1: (lv_versionSpec_6_0= ruleVersionSpec )
                    // InternalVilBuildLanguage.g:1379:3: lv_versionSpec_6_0= ruleVersionSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getInstantiateAccess().getVersionSpecVersionSpecParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_versionSpec_6_0=ruleVersionSpec();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getInstantiateRule());
                      	        }
                             		set(
                             			current, 
                             			"versionSpec",
                              		lv_versionSpec_6_0, 
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
    // $ANTLR end "ruleInstantiate"


    // $ANTLR start "entryRuleLoopVariable"
    // InternalVilBuildLanguage.g:1403:1: entryRuleLoopVariable returns [EObject current=null] : iv_ruleLoopVariable= ruleLoopVariable EOF ;
    public final EObject entryRuleLoopVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoopVariable = null;


        try {
            // InternalVilBuildLanguage.g:1404:2: (iv_ruleLoopVariable= ruleLoopVariable EOF )
            // InternalVilBuildLanguage.g:1405:2: iv_ruleLoopVariable= ruleLoopVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLoopVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLoopVariable=ruleLoopVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLoopVariable; 
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
    // $ANTLR end "entryRuleLoopVariable"


    // $ANTLR start "ruleLoopVariable"
    // InternalVilBuildLanguage.g:1412:1: ruleLoopVariable returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) )? ( (lv_var_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleLoopVariable() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_var_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1415:28: ( ( ( (lv_type_0_0= ruleType ) )? ( (lv_var_1_0= ruleIdentifier ) ) ) )
            // InternalVilBuildLanguage.g:1416:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_var_1_0= ruleIdentifier ) ) )
            {
            // InternalVilBuildLanguage.g:1416:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_var_1_0= ruleIdentifier ) ) )
            // InternalVilBuildLanguage.g:1416:2: ( (lv_type_0_0= ruleType ) )? ( (lv_var_1_0= ruleIdentifier ) )
            {
            // InternalVilBuildLanguage.g:1416:2: ( (lv_type_0_0= ruleType ) )?
            int alt32=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA32_1 = input.LA(2);

                    if ( (LA32_1==RULE_VERSION||(LA32_1>=RULE_ID && LA32_1<=RULE_EXPONENT)||LA32_1==41||LA32_1==65) ) {
                        alt32=1;
                    }
                    }
                    break;
                case RULE_VERSION:
                    {
                    int LA32_2 = input.LA(2);

                    if ( (LA32_2==RULE_VERSION||(LA32_2>=RULE_ID && LA32_2<=RULE_EXPONENT)||LA32_2==41||LA32_2==65) ) {
                        alt32=1;
                    }
                    }
                    break;
                case RULE_EXPONENT:
                    {
                    int LA32_3 = input.LA(2);

                    if ( (LA32_3==RULE_VERSION||(LA32_3>=RULE_ID && LA32_3<=RULE_EXPONENT)||LA32_3==41||LA32_3==65) ) {
                        alt32=1;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA32_4 = input.LA(2);

                    if ( (LA32_4==RULE_VERSION||(LA32_4>=RULE_ID && LA32_4<=RULE_EXPONENT)||LA32_4==41||LA32_4==65) ) {
                        alt32=1;
                    }
                    }
                    break;
                case 69:
                case 70:
                case 71:
                case 72:
                    {
                    alt32=1;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // InternalVilBuildLanguage.g:1417:1: (lv_type_0_0= ruleType )
                    {
                    // InternalVilBuildLanguage.g:1417:1: (lv_type_0_0= ruleType )
                    // InternalVilBuildLanguage.g:1418:3: lv_type_0_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLoopVariableAccess().getTypeTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_10);
                    lv_type_0_0=ruleType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getLoopVariableRule());
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

            // InternalVilBuildLanguage.g:1434:3: ( (lv_var_1_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:1435:1: (lv_var_1_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:1435:1: (lv_var_1_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:1436:3: lv_var_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLoopVariableAccess().getVarIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_var_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getLoopVariableRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_1_0, 
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
    // $ANTLR end "ruleLoopVariable"


    // $ANTLR start "entryRuleMap"
    // InternalVilBuildLanguage.g:1460:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalVilBuildLanguage.g:1461:2: (iv_ruleMap= ruleMap EOF )
            // InternalVilBuildLanguage.g:1462:2: iv_ruleMap= ruleMap EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMapRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMap; 
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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalVilBuildLanguage.g:1469:1: ruleMap returns [EObject current=null] : (otherlv_0= 'map' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) ) ) ;
    public final EObject ruleMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_separator_5_1=null;
        Token lv_separator_5_2=null;
        Token otherlv_7=null;
        EObject lv_var_2_0 = null;

        EObject lv_var_4_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_block_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1472:28: ( (otherlv_0= 'map' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) ) ) )
            // InternalVilBuildLanguage.g:1473:1: (otherlv_0= 'map' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) ) )
            {
            // InternalVilBuildLanguage.g:1473:1: (otherlv_0= 'map' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) ) )
            // InternalVilBuildLanguage.g:1473:3: otherlv_0= 'map' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getMapAccess().getMapKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMapAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:1481:1: ( (lv_var_2_0= ruleLoopVariable ) )
            // InternalVilBuildLanguage.g:1482:1: (lv_var_2_0= ruleLoopVariable )
            {
            // InternalVilBuildLanguage.g:1482:1: (lv_var_2_0= ruleLoopVariable )
            // InternalVilBuildLanguage.g:1483:3: lv_var_2_0= ruleLoopVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapAccess().getVarLoopVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_35);
            lv_var_2_0=ruleLoopVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapRule());
              	        }
                     		add(
                     			current, 
                     			"var",
                      		lv_var_2_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.LoopVariable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalVilBuildLanguage.g:1499:2: (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==25) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:1499:4: otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMapAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalVilBuildLanguage.g:1503:1: ( (lv_var_4_0= ruleLoopVariable ) )
            	    // InternalVilBuildLanguage.g:1504:1: (lv_var_4_0= ruleLoopVariable )
            	    {
            	    // InternalVilBuildLanguage.g:1504:1: (lv_var_4_0= ruleLoopVariable )
            	    // InternalVilBuildLanguage.g:1505:3: lv_var_4_0= ruleLoopVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMapAccess().getVarLoopVariableParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_var_4_0=ruleLoopVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMapRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"var",
            	              		lv_var_4_0, 
            	              		"de.uni_hildesheim.sse.VilBuildLanguage.LoopVariable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // InternalVilBuildLanguage.g:1521:4: ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) )
            // InternalVilBuildLanguage.g:1522:1: ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) )
            {
            // InternalVilBuildLanguage.g:1522:1: ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) )
            // InternalVilBuildLanguage.g:1523:1: (lv_separator_5_1= '=' | lv_separator_5_2= ':' )
            {
            // InternalVilBuildLanguage.g:1523:1: (lv_separator_5_1= '=' | lv_separator_5_2= ':' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==23) ) {
                alt34=1;
            }
            else if ( (LA34_0==24) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalVilBuildLanguage.g:1524:3: lv_separator_5_1= '='
                    {
                    lv_separator_5_1=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_separator_5_1, grammarAccess.getMapAccess().getSeparatorEqualsSignKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMapRule());
                      	        }
                             		setWithLastConsumed(current, "separator", lv_separator_5_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:1536:8: lv_separator_5_2= ':'
                    {
                    lv_separator_5_2=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_separator_5_2, grammarAccess.getMapAccess().getSeparatorColonKeyword_4_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getMapRule());
                      	        }
                             		setWithLastConsumed(current, "separator", lv_separator_5_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalVilBuildLanguage.g:1551:2: ( (lv_expr_6_0= ruleExpression ) )
            // InternalVilBuildLanguage.g:1552:1: (lv_expr_6_0= ruleExpression )
            {
            // InternalVilBuildLanguage.g:1552:1: (lv_expr_6_0= ruleExpression )
            // InternalVilBuildLanguage.g:1553:3: lv_expr_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapAccess().getExprExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_expr_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_6_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMapAccess().getRightParenthesisKeyword_6());
                  
            }
            // InternalVilBuildLanguage.g:1573:1: ( (lv_block_8_0= ruleRuleElementBlock ) )
            // InternalVilBuildLanguage.g:1574:1: (lv_block_8_0= ruleRuleElementBlock )
            {
            // InternalVilBuildLanguage.g:1574:1: (lv_block_8_0= ruleRuleElementBlock )
            // InternalVilBuildLanguage.g:1575:3: lv_block_8_0= ruleRuleElementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMapAccess().getBlockRuleElementBlockParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_block_8_0=ruleRuleElementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMapRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_8_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.RuleElementBlock");
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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleFor"
    // InternalVilBuildLanguage.g:1599:1: entryRuleFor returns [EObject current=null] : iv_ruleFor= ruleFor EOF ;
    public final EObject entryRuleFor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFor = null;


        try {
            // InternalVilBuildLanguage.g:1600:2: (iv_ruleFor= ruleFor EOF )
            // InternalVilBuildLanguage.g:1601:2: iv_ruleFor= ruleFor EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getForRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFor=ruleFor();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFor; 
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
    // $ANTLR end "entryRuleFor"


    // $ANTLR start "ruleFor"
    // InternalVilBuildLanguage.g:1608:1: ruleFor returns [EObject current=null] : (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) ) ) ;
    public final EObject ruleFor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_separator_5_1=null;
        Token lv_separator_5_2=null;
        Token otherlv_7=null;
        EObject lv_var_2_0 = null;

        EObject lv_var_4_0 = null;

        EObject lv_expr_6_0 = null;

        EObject lv_block_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1611:28: ( (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) ) ) )
            // InternalVilBuildLanguage.g:1612:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) ) )
            {
            // InternalVilBuildLanguage.g:1612:1: (otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) ) )
            // InternalVilBuildLanguage.g:1612:3: otherlv_0= 'for' otherlv_1= '(' ( (lv_var_2_0= ruleLoopVariable ) ) (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )* ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) ) ( (lv_expr_6_0= ruleExpression ) ) otherlv_7= ')' ( (lv_block_8_0= ruleRuleElementBlock ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getForAccess().getForKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getForAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:1620:1: ( (lv_var_2_0= ruleLoopVariable ) )
            // InternalVilBuildLanguage.g:1621:1: (lv_var_2_0= ruleLoopVariable )
            {
            // InternalVilBuildLanguage.g:1621:1: (lv_var_2_0= ruleLoopVariable )
            // InternalVilBuildLanguage.g:1622:3: lv_var_2_0= ruleLoopVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getVarLoopVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_35);
            lv_var_2_0=ruleLoopVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		add(
                     			current, 
                     			"var",
                      		lv_var_2_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.LoopVariable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalVilBuildLanguage.g:1638:2: (otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==25) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:1638:4: otherlv_3= ',' ( (lv_var_4_0= ruleLoopVariable ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getForAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // InternalVilBuildLanguage.g:1642:1: ( (lv_var_4_0= ruleLoopVariable ) )
            	    // InternalVilBuildLanguage.g:1643:1: (lv_var_4_0= ruleLoopVariable )
            	    {
            	    // InternalVilBuildLanguage.g:1643:1: (lv_var_4_0= ruleLoopVariable )
            	    // InternalVilBuildLanguage.g:1644:3: lv_var_4_0= ruleLoopVariable
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getForAccess().getVarLoopVariableParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_35);
            	    lv_var_4_0=ruleLoopVariable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getForRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"var",
            	              		lv_var_4_0, 
            	              		"de.uni_hildesheim.sse.VilBuildLanguage.LoopVariable");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            // InternalVilBuildLanguage.g:1660:4: ( ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) ) )
            // InternalVilBuildLanguage.g:1661:1: ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) )
            {
            // InternalVilBuildLanguage.g:1661:1: ( (lv_separator_5_1= '=' | lv_separator_5_2= ':' ) )
            // InternalVilBuildLanguage.g:1662:1: (lv_separator_5_1= '=' | lv_separator_5_2= ':' )
            {
            // InternalVilBuildLanguage.g:1662:1: (lv_separator_5_1= '=' | lv_separator_5_2= ':' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==23) ) {
                alt36=1;
            }
            else if ( (LA36_0==24) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalVilBuildLanguage.g:1663:3: lv_separator_5_1= '='
                    {
                    lv_separator_5_1=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_separator_5_1, grammarAccess.getForAccess().getSeparatorEqualsSignKeyword_4_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getForRule());
                      	        }
                             		setWithLastConsumed(current, "separator", lv_separator_5_1, null);
                      	    
                    }

                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:1675:8: lv_separator_5_2= ':'
                    {
                    lv_separator_5_2=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_separator_5_2, grammarAccess.getForAccess().getSeparatorColonKeyword_4_0_1());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getForRule());
                      	        }
                             		setWithLastConsumed(current, "separator", lv_separator_5_2, null);
                      	    
                    }

                    }
                    break;

            }


            }


            }

            // InternalVilBuildLanguage.g:1690:2: ( (lv_expr_6_0= ruleExpression ) )
            // InternalVilBuildLanguage.g:1691:1: (lv_expr_6_0= ruleExpression )
            {
            // InternalVilBuildLanguage.g:1691:1: (lv_expr_6_0= ruleExpression )
            // InternalVilBuildLanguage.g:1692:3: lv_expr_6_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getExprExpressionParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_expr_6_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_6_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getForAccess().getRightParenthesisKeyword_6());
                  
            }
            // InternalVilBuildLanguage.g:1712:1: ( (lv_block_8_0= ruleRuleElementBlock ) )
            // InternalVilBuildLanguage.g:1713:1: (lv_block_8_0= ruleRuleElementBlock )
            {
            // InternalVilBuildLanguage.g:1713:1: (lv_block_8_0= ruleRuleElementBlock )
            // InternalVilBuildLanguage.g:1714:3: lv_block_8_0= ruleRuleElementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getForAccess().getBlockRuleElementBlockParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_block_8_0=ruleRuleElementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getForRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_8_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.RuleElementBlock");
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
    // $ANTLR end "ruleFor"


    // $ANTLR start "entryRuleWhile"
    // InternalVilBuildLanguage.g:1738:1: entryRuleWhile returns [EObject current=null] : iv_ruleWhile= ruleWhile EOF ;
    public final EObject entryRuleWhile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhile = null;


        try {
            // InternalVilBuildLanguage.g:1739:2: (iv_ruleWhile= ruleWhile EOF )
            // InternalVilBuildLanguage.g:1740:2: iv_ruleWhile= ruleWhile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWhileRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleWhile=ruleWhile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWhile; 
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
    // $ANTLR end "entryRuleWhile"


    // $ANTLR start "ruleWhile"
    // InternalVilBuildLanguage.g:1747:1: ruleWhile returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleRuleElementBlock ) ) ) ;
    public final EObject ruleWhile() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expr_2_0 = null;

        EObject lv_block_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1750:28: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleRuleElementBlock ) ) ) )
            // InternalVilBuildLanguage.g:1751:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleRuleElementBlock ) ) )
            {
            // InternalVilBuildLanguage.g:1751:1: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleRuleElementBlock ) ) )
            // InternalVilBuildLanguage.g:1751:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_block_4_0= ruleRuleElementBlock ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getWhileAccess().getWhileKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWhileAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:1759:1: ( (lv_expr_2_0= ruleExpression ) )
            // InternalVilBuildLanguage.g:1760:1: (lv_expr_2_0= ruleExpression )
            {
            // InternalVilBuildLanguage.g:1760:1: (lv_expr_2_0= ruleExpression )
            // InternalVilBuildLanguage.g:1761:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_expr_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
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

            otherlv_3=(Token)match(input,17,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getWhileAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalVilBuildLanguage.g:1781:1: ( (lv_block_4_0= ruleRuleElementBlock ) )
            // InternalVilBuildLanguage.g:1782:1: (lv_block_4_0= ruleRuleElementBlock )
            {
            // InternalVilBuildLanguage.g:1782:1: (lv_block_4_0= ruleRuleElementBlock )
            // InternalVilBuildLanguage.g:1783:3: lv_block_4_0= ruleRuleElementBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWhileAccess().getBlockRuleElementBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_block_4_0=ruleRuleElementBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getWhileRule());
              	        }
                     		set(
                     			current, 
                     			"block",
                      		lv_block_4_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.RuleElementBlock");
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
    // $ANTLR end "ruleWhile"


    // $ANTLR start "entryRuleAlternative"
    // InternalVilBuildLanguage.g:1807:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalVilBuildLanguage.g:1808:2: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalVilBuildLanguage.g:1809:2: iv_ruleAlternative= ruleAlternative EOF
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
    // InternalVilBuildLanguage.g:1816:1: ruleAlternative returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) ) )? ) ;
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
            // InternalVilBuildLanguage.g:1819:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) ) )? ) )
            // InternalVilBuildLanguage.g:1820:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) ) )? )
            {
            // InternalVilBuildLanguage.g:1820:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) ) )? )
            // InternalVilBuildLanguage.g:1820:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expr_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_if_4_0= ruleStatementOrBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) ) )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAlternativeAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:1828:1: ( (lv_expr_2_0= ruleExpression ) )
            // InternalVilBuildLanguage.g:1829:1: (lv_expr_2_0= ruleExpression )
            {
            // InternalVilBuildLanguage.g:1829:1: (lv_expr_2_0= ruleExpression )
            // InternalVilBuildLanguage.g:1830:3: lv_expr_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlternativeAccess().getExprExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,17,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAlternativeAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalVilBuildLanguage.g:1850:1: ( (lv_if_4_0= ruleStatementOrBlock ) )
            // InternalVilBuildLanguage.g:1851:1: (lv_if_4_0= ruleStatementOrBlock )
            {
            // InternalVilBuildLanguage.g:1851:1: (lv_if_4_0= ruleStatementOrBlock )
            // InternalVilBuildLanguage.g:1852:3: lv_if_4_0= ruleStatementOrBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAlternativeAccess().getIfStatementOrBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_37);
            lv_if_4_0=ruleStatementOrBlock();

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
                      		"de.uni_hildesheim.sse.VilBuildLanguage.StatementOrBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // InternalVilBuildLanguage.g:1868:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==33) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred48_InternalVilBuildLanguage()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalVilBuildLanguage.g:1868:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) )
                    {
                    // InternalVilBuildLanguage.g:1868:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalVilBuildLanguage.g:1868:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAlternativeAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // InternalVilBuildLanguage.g:1873:2: ( (lv_else_6_0= ruleStatementOrBlock ) )
                    // InternalVilBuildLanguage.g:1874:1: (lv_else_6_0= ruleStatementOrBlock )
                    {
                    // InternalVilBuildLanguage.g:1874:1: (lv_else_6_0= ruleStatementOrBlock )
                    // InternalVilBuildLanguage.g:1875:3: lv_else_6_0= ruleStatementOrBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAlternativeAccess().getElseStatementOrBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_else_6_0=ruleStatementOrBlock();

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
                              		"de.uni_hildesheim.sse.VilBuildLanguage.StatementOrBlock");
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


    // $ANTLR start "entryRuleStatementOrBlock"
    // InternalVilBuildLanguage.g:1899:1: entryRuleStatementOrBlock returns [EObject current=null] : iv_ruleStatementOrBlock= ruleStatementOrBlock EOF ;
    public final EObject entryRuleStatementOrBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatementOrBlock = null;


        try {
            // InternalVilBuildLanguage.g:1900:2: (iv_ruleStatementOrBlock= ruleStatementOrBlock EOF )
            // InternalVilBuildLanguage.g:1901:2: iv_ruleStatementOrBlock= ruleStatementOrBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStatementOrBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStatementOrBlock=ruleStatementOrBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStatementOrBlock; 
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
    // $ANTLR end "entryRuleStatementOrBlock"


    // $ANTLR start "ruleStatementOrBlock"
    // InternalVilBuildLanguage.g:1908:1: ruleStatementOrBlock returns [EObject current=null] : ( ( (lv_exStmt_0_0= ruleExpressionStatement ) ) | ( (lv_block_1_0= ruleRuleElementBlock ) ) ) ;
    public final EObject ruleStatementOrBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_exStmt_0_0 = null;

        EObject lv_block_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1911:28: ( ( ( (lv_exStmt_0_0= ruleExpressionStatement ) ) | ( (lv_block_1_0= ruleRuleElementBlock ) ) ) )
            // InternalVilBuildLanguage.g:1912:1: ( ( (lv_exStmt_0_0= ruleExpressionStatement ) ) | ( (lv_block_1_0= ruleRuleElementBlock ) ) )
            {
            // InternalVilBuildLanguage.g:1912:1: ( ( (lv_exStmt_0_0= ruleExpressionStatement ) ) | ( (lv_block_1_0= ruleRuleElementBlock ) ) )
            int alt38=2;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalVilBuildLanguage.g:1912:2: ( (lv_exStmt_0_0= ruleExpressionStatement ) )
                    {
                    // InternalVilBuildLanguage.g:1912:2: ( (lv_exStmt_0_0= ruleExpressionStatement ) )
                    // InternalVilBuildLanguage.g:1913:1: (lv_exStmt_0_0= ruleExpressionStatement )
                    {
                    // InternalVilBuildLanguage.g:1913:1: (lv_exStmt_0_0= ruleExpressionStatement )
                    // InternalVilBuildLanguage.g:1914:3: lv_exStmt_0_0= ruleExpressionStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementOrBlockAccess().getExStmtExpressionStatementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_exStmt_0_0=ruleExpressionStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementOrBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"exStmt",
                              		lv_exStmt_0_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.ExpressionStatement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:1931:6: ( (lv_block_1_0= ruleRuleElementBlock ) )
                    {
                    // InternalVilBuildLanguage.g:1931:6: ( (lv_block_1_0= ruleRuleElementBlock ) )
                    // InternalVilBuildLanguage.g:1932:1: (lv_block_1_0= ruleRuleElementBlock )
                    {
                    // InternalVilBuildLanguage.g:1932:1: (lv_block_1_0= ruleRuleElementBlock )
                    // InternalVilBuildLanguage.g:1933:3: lv_block_1_0= ruleRuleElementBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getStatementOrBlockAccess().getBlockRuleElementBlockParserRuleCall_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_2);
                    lv_block_1_0=ruleRuleElementBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getStatementOrBlockRule());
                      	        }
                             		set(
                             			current, 
                             			"block",
                              		lv_block_1_0, 
                              		"de.uni_hildesheim.sse.VilBuildLanguage.RuleElementBlock");
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
    // $ANTLR end "ruleStatementOrBlock"


    // $ANTLR start "entryRuleJoin"
    // InternalVilBuildLanguage.g:1957:1: entryRuleJoin returns [EObject current=null] : iv_ruleJoin= ruleJoin EOF ;
    public final EObject entryRuleJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoin = null;


        try {
            // InternalVilBuildLanguage.g:1958:2: (iv_ruleJoin= ruleJoin EOF )
            // InternalVilBuildLanguage.g:1959:2: iv_ruleJoin= ruleJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoin=ruleJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoin; 
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
    // $ANTLR end "entryRuleJoin"


    // $ANTLR start "ruleJoin"
    // InternalVilBuildLanguage.g:1966:1: ruleJoin returns [EObject current=null] : (otherlv_0= 'join' otherlv_1= '(' ( (lv_var1_2_0= ruleJoinVariable ) ) otherlv_3= ',' ( (lv_var2_4_0= ruleJoinVariable ) ) otherlv_5= ')' (otherlv_6= 'with' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )? ) ;
    public final EObject ruleJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_var1_2_0 = null;

        EObject lv_var2_4_0 = null;

        EObject lv_condition_8_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:1969:28: ( (otherlv_0= 'join' otherlv_1= '(' ( (lv_var1_2_0= ruleJoinVariable ) ) otherlv_3= ',' ( (lv_var2_4_0= ruleJoinVariable ) ) otherlv_5= ')' (otherlv_6= 'with' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )? ) )
            // InternalVilBuildLanguage.g:1970:1: (otherlv_0= 'join' otherlv_1= '(' ( (lv_var1_2_0= ruleJoinVariable ) ) otherlv_3= ',' ( (lv_var2_4_0= ruleJoinVariable ) ) otherlv_5= ')' (otherlv_6= 'with' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )? )
            {
            // InternalVilBuildLanguage.g:1970:1: (otherlv_0= 'join' otherlv_1= '(' ( (lv_var1_2_0= ruleJoinVariable ) ) otherlv_3= ',' ( (lv_var2_4_0= ruleJoinVariable ) ) otherlv_5= ')' (otherlv_6= 'with' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )? )
            // InternalVilBuildLanguage.g:1970:3: otherlv_0= 'join' otherlv_1= '(' ( (lv_var1_2_0= ruleJoinVariable ) ) otherlv_3= ',' ( (lv_var2_4_0= ruleJoinVariable ) ) otherlv_5= ')' (otherlv_6= 'with' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,34,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getJoinAccess().getJoinKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getJoinAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:1978:1: ( (lv_var1_2_0= ruleJoinVariable ) )
            // InternalVilBuildLanguage.g:1979:1: (lv_var1_2_0= ruleJoinVariable )
            {
            // InternalVilBuildLanguage.g:1979:1: (lv_var1_2_0= ruleJoinVariable )
            // InternalVilBuildLanguage.g:1980:3: lv_var1_2_0= ruleJoinVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getVar1JoinVariableParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_39);
            lv_var1_2_0=ruleJoinVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinRule());
              	        }
                     		set(
                     			current, 
                     			"var1",
                      		lv_var1_2_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.JoinVariable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_38); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getJoinAccess().getCommaKeyword_3());
                  
            }
            // InternalVilBuildLanguage.g:2000:1: ( (lv_var2_4_0= ruleJoinVariable ) )
            // InternalVilBuildLanguage.g:2001:1: (lv_var2_4_0= ruleJoinVariable )
            {
            // InternalVilBuildLanguage.g:2001:1: (lv_var2_4_0= ruleJoinVariable )
            // InternalVilBuildLanguage.g:2002:3: lv_var2_4_0= ruleJoinVariable
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinAccess().getVar2JoinVariableParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
            lv_var2_4_0=ruleJoinVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinRule());
              	        }
                     		set(
                     			current, 
                     			"var2",
                      		lv_var2_4_0, 
                      		"de.uni_hildesheim.sse.VilBuildLanguage.JoinVariable");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getJoinAccess().getRightParenthesisKeyword_5());
                  
            }
            // InternalVilBuildLanguage.g:2022:1: (otherlv_6= 'with' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==35) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalVilBuildLanguage.g:2022:3: otherlv_6= 'with' otherlv_7= '(' ( (lv_condition_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,35,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getJoinAccess().getWithKeyword_6_0());
                          
                    }
                    otherlv_7=(Token)match(input,16,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getJoinAccess().getLeftParenthesisKeyword_6_1());
                          
                    }
                    // InternalVilBuildLanguage.g:2030:1: ( (lv_condition_8_0= ruleExpression ) )
                    // InternalVilBuildLanguage.g:2031:1: (lv_condition_8_0= ruleExpression )
                    {
                    // InternalVilBuildLanguage.g:2031:1: (lv_condition_8_0= ruleExpression )
                    // InternalVilBuildLanguage.g:2032:3: lv_condition_8_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getJoinAccess().getConditionExpressionParserRuleCall_6_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
                    lv_condition_8_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getJoinRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_8_0, 
                              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Expression");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getJoinAccess().getRightParenthesisKeyword_6_3());
                          
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
    // $ANTLR end "ruleJoin"


    // $ANTLR start "entryRuleJoinVariable"
    // InternalVilBuildLanguage.g:2060:1: entryRuleJoinVariable returns [EObject current=null] : iv_ruleJoinVariable= ruleJoinVariable EOF ;
    public final EObject entryRuleJoinVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinVariable = null;


        try {
            // InternalVilBuildLanguage.g:2061:2: (iv_ruleJoinVariable= ruleJoinVariable EOF )
            // InternalVilBuildLanguage.g:2062:2: iv_ruleJoinVariable= ruleJoinVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getJoinVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleJoinVariable=ruleJoinVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleJoinVariable; 
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
    // $ANTLR end "entryRuleJoinVariable"


    // $ANTLR start "ruleJoinVariable"
    // InternalVilBuildLanguage.g:2069:1: ruleJoinVariable returns [EObject current=null] : ( ( (lv_excl_0_0= 'exclude' ) )? ( (lv_var_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_expr_3_0= ruleExpression ) ) ) ;
    public final EObject ruleJoinVariable() throws RecognitionException {
        EObject current = null;

        Token lv_excl_0_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_var_1_0 = null;

        EObject lv_expr_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2072:28: ( ( ( (lv_excl_0_0= 'exclude' ) )? ( (lv_var_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_expr_3_0= ruleExpression ) ) ) )
            // InternalVilBuildLanguage.g:2073:1: ( ( (lv_excl_0_0= 'exclude' ) )? ( (lv_var_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_expr_3_0= ruleExpression ) ) )
            {
            // InternalVilBuildLanguage.g:2073:1: ( ( (lv_excl_0_0= 'exclude' ) )? ( (lv_var_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_expr_3_0= ruleExpression ) ) )
            // InternalVilBuildLanguage.g:2073:2: ( (lv_excl_0_0= 'exclude' ) )? ( (lv_var_1_0= ruleIdentifier ) ) otherlv_2= ':' ( (lv_expr_3_0= ruleExpression ) )
            {
            // InternalVilBuildLanguage.g:2073:2: ( (lv_excl_0_0= 'exclude' ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==36) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalVilBuildLanguage.g:2074:1: (lv_excl_0_0= 'exclude' )
                    {
                    // InternalVilBuildLanguage.g:2074:1: (lv_excl_0_0= 'exclude' )
                    // InternalVilBuildLanguage.g:2075:3: lv_excl_0_0= 'exclude'
                    {
                    lv_excl_0_0=(Token)match(input,36,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_excl_0_0, grammarAccess.getJoinVariableAccess().getExclExcludeKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getJoinVariableRule());
                      	        }
                             		setWithLastConsumed(current, "excl", lv_excl_0_0, "exclude");
                      	    
                    }

                    }


                    }
                    break;

            }

            // InternalVilBuildLanguage.g:2088:3: ( (lv_var_1_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:2089:1: (lv_var_1_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:2089:1: (lv_var_1_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:2090:3: lv_var_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinVariableAccess().getVarIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_24);
            lv_var_1_0=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinVariableRule());
              	        }
                     		set(
                     			current, 
                     			"var",
                      		lv_var_1_0, 
                      		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.Identifier");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,24,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getJoinVariableAccess().getColonKeyword_2());
                  
            }
            // InternalVilBuildLanguage.g:2110:1: ( (lv_expr_3_0= ruleExpression ) )
            // InternalVilBuildLanguage.g:2111:1: (lv_expr_3_0= ruleExpression )
            {
            // InternalVilBuildLanguage.g:2111:1: (lv_expr_3_0= ruleExpression )
            // InternalVilBuildLanguage.g:2112:3: lv_expr_3_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getJoinVariableAccess().getExprExpressionParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_2);
            lv_expr_3_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getJoinVariableRule());
              	        }
                     		set(
                     			current, 
                     			"expr",
                      		lv_expr_3_0, 
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
    // $ANTLR end "ruleJoinVariable"


    // $ANTLR start "entryRuleSystemExecution"
    // InternalVilBuildLanguage.g:2136:1: entryRuleSystemExecution returns [EObject current=null] : iv_ruleSystemExecution= ruleSystemExecution EOF ;
    public final EObject entryRuleSystemExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSystemExecution = null;


        try {
            // InternalVilBuildLanguage.g:2137:2: (iv_ruleSystemExecution= ruleSystemExecution EOF )
            // InternalVilBuildLanguage.g:2138:2: iv_ruleSystemExecution= ruleSystemExecution EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSystemExecutionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSystemExecution=ruleSystemExecution();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSystemExecution; 
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
    // $ANTLR end "entryRuleSystemExecution"


    // $ANTLR start "ruleSystemExecution"
    // InternalVilBuildLanguage.g:2145:1: ruleSystemExecution returns [EObject current=null] : (otherlv_0= 'execute' ( (lv_call_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleSubCall ) )* ) ;
    public final EObject ruleSystemExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_call_1_0 = null;

        EObject lv_calls_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2148:28: ( (otherlv_0= 'execute' ( (lv_call_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleSubCall ) )* ) )
            // InternalVilBuildLanguage.g:2149:1: (otherlv_0= 'execute' ( (lv_call_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleSubCall ) )* )
            {
            // InternalVilBuildLanguage.g:2149:1: (otherlv_0= 'execute' ( (lv_call_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleSubCall ) )* )
            // InternalVilBuildLanguage.g:2149:3: otherlv_0= 'execute' ( (lv_call_1_0= ruleCall ) ) ( (lv_calls_2_0= ruleSubCall ) )*
            {
            otherlv_0=(Token)match(input,37,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSystemExecutionAccess().getExecuteKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:2153:1: ( (lv_call_1_0= ruleCall ) )
            // InternalVilBuildLanguage.g:2154:1: (lv_call_1_0= ruleCall )
            {
            // InternalVilBuildLanguage.g:2154:1: (lv_call_1_0= ruleCall )
            // InternalVilBuildLanguage.g:2155:3: lv_call_1_0= ruleCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSystemExecutionAccess().getCallCallParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_40);
            lv_call_1_0=ruleCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSystemExecutionRule());
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

            // InternalVilBuildLanguage.g:2171:2: ( (lv_calls_2_0= ruleSubCall ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27||(LA41_0>=61 && LA41_0<=62)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:2172:1: (lv_calls_2_0= ruleSubCall )
            	    {
            	    // InternalVilBuildLanguage.g:2172:1: (lv_calls_2_0= ruleSubCall )
            	    // InternalVilBuildLanguage.g:2173:3: lv_calls_2_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSystemExecutionAccess().getCallsSubCallParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_calls_2_0=ruleSubCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSystemExecutionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"calls",
            	              		lv_calls_2_0, 
            	              		"de.uni_hildesheim.sse.vil.expressions.ExpressionDsl.SubCall");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // $ANTLR end "ruleSystemExecution"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalVilBuildLanguage.g:2197:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalVilBuildLanguage.g:2198:2: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalVilBuildLanguage.g:2199:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
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
    // InternalVilBuildLanguage.g:2206:1: ruleVariableDeclaration returns [EObject current=null] : ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';' ) ;
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
            // InternalVilBuildLanguage.g:2209:28: ( ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';' ) )
            // InternalVilBuildLanguage.g:2210:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            {
            // InternalVilBuildLanguage.g:2210:1: ( ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';' )
            // InternalVilBuildLanguage.g:2210:2: ( (lv_const_0_0= 'const' ) )? ( (lv_type_1_0= ruleType ) ) ( (lv_name_2_0= ruleIdentifier ) ) (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )? otherlv_5= ';'
            {
            // InternalVilBuildLanguage.g:2210:2: ( (lv_const_0_0= 'const' ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==38) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalVilBuildLanguage.g:2211:1: (lv_const_0_0= 'const' )
                    {
                    // InternalVilBuildLanguage.g:2211:1: (lv_const_0_0= 'const' )
                    // InternalVilBuildLanguage.g:2212:3: lv_const_0_0= 'const'
                    {
                    lv_const_0_0=(Token)match(input,38,FOLLOW_34); if (state.failed) return current;
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

            // InternalVilBuildLanguage.g:2225:3: ( (lv_type_1_0= ruleType ) )
            // InternalVilBuildLanguage.g:2226:1: (lv_type_1_0= ruleType )
            {
            // InternalVilBuildLanguage.g:2226:1: (lv_type_1_0= ruleType )
            // InternalVilBuildLanguage.g:2227:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_10);
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

            // InternalVilBuildLanguage.g:2243:2: ( (lv_name_2_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:2244:1: (lv_name_2_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:2244:1: (lv_name_2_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:2245:3: lv_name_2_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getNameIdentifierParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_41);
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

            // InternalVilBuildLanguage.g:2261:2: (otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==23) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalVilBuildLanguage.g:2261:4: otherlv_3= '=' ( (lv_expression_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_3_0());
                          
                    }
                    // InternalVilBuildLanguage.g:2265:1: ( (lv_expression_4_0= ruleExpression ) )
                    // InternalVilBuildLanguage.g:2266:1: (lv_expression_4_0= ruleExpression )
                    {
                    // InternalVilBuildLanguage.g:2266:1: (lv_expression_4_0= ruleExpression )
                    // InternalVilBuildLanguage.g:2267:3: lv_expression_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getExpressionExpressionParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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

            otherlv_5=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:2295:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalVilBuildLanguage.g:2296:2: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalVilBuildLanguage.g:2297:2: iv_ruleTypeDef= ruleTypeDef EOF
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
    // InternalVilBuildLanguage.g:2304:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2307:28: ( (otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) )
            // InternalVilBuildLanguage.g:2308:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            {
            // InternalVilBuildLanguage.g:2308:1: (otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            // InternalVilBuildLanguage.g:2308:3: otherlv_0= 'typedef' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypedefKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:2312:1: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:2313:1: (lv_name_1_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:2313:1: (lv_name_1_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:2314:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_34);
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

            // InternalVilBuildLanguage.g:2330:2: ( (lv_type_2_0= ruleType ) )
            // InternalVilBuildLanguage.g:2331:1: (lv_type_2_0= ruleType )
            {
            // InternalVilBuildLanguage.g:2331:1: (lv_type_2_0= ruleType )
            // InternalVilBuildLanguage.g:2332:3: lv_type_2_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeDefAccess().getTypeTypeParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_8);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:2360:1: entryRuleAdvice returns [EObject current=null] : iv_ruleAdvice= ruleAdvice EOF ;
    public final EObject entryRuleAdvice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvice = null;


        try {
            // InternalVilBuildLanguage.g:2361:2: (iv_ruleAdvice= ruleAdvice EOF )
            // InternalVilBuildLanguage.g:2362:2: iv_ruleAdvice= ruleAdvice EOF
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
    // InternalVilBuildLanguage.g:2369:1: ruleAdvice returns [EObject current=null] : (otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )? ) ;
    public final EObject ruleAdvice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_name_2_0 = null;

        EObject lv_versionSpec_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2372:28: ( (otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )? ) )
            // InternalVilBuildLanguage.g:2373:1: (otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )? )
            {
            // InternalVilBuildLanguage.g:2373:1: (otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )? )
            // InternalVilBuildLanguage.g:2373:3: otherlv_0= '@advice' otherlv_1= '(' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ')' ( (lv_versionSpec_4_0= ruleVersionSpec ) )?
            {
            otherlv_0=(Token)match(input,40,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAdviceAccess().getAdviceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:2381:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // InternalVilBuildLanguage.g:2382:1: (lv_name_2_0= ruleQualifiedName )
            {
            // InternalVilBuildLanguage.g:2382:1: (lv_name_2_0= ruleQualifiedName )
            // InternalVilBuildLanguage.g:2383:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdviceAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_13);
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

            otherlv_3=(Token)match(input,17,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAdviceAccess().getRightParenthesisKeyword_3());
                  
            }
            // InternalVilBuildLanguage.g:2403:1: ( (lv_versionSpec_4_0= ruleVersionSpec ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==35) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalVilBuildLanguage.g:2404:1: (lv_versionSpec_4_0= ruleVersionSpec )
                    {
                    // InternalVilBuildLanguage.g:2404:1: (lv_versionSpec_4_0= ruleVersionSpec )
                    // InternalVilBuildLanguage.g:2405:3: lv_versionSpec_4_0= ruleVersionSpec
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
    // InternalVilBuildLanguage.g:2429:1: entryRuleVersionSpec returns [EObject current=null] : iv_ruleVersionSpec= ruleVersionSpec EOF ;
    public final EObject entryRuleVersionSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionSpec = null;


        try {
            // InternalVilBuildLanguage.g:2430:2: (iv_ruleVersionSpec= ruleVersionSpec EOF )
            // InternalVilBuildLanguage.g:2431:2: iv_ruleVersionSpec= ruleVersionSpec EOF
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
    // InternalVilBuildLanguage.g:2438:1: ruleVersionSpec returns [EObject current=null] : (otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) ) ) ;
    public final EObject ruleVersionSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_restriction_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2441:28: ( (otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) ) ) )
            // InternalVilBuildLanguage.g:2442:1: (otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) ) )
            {
            // InternalVilBuildLanguage.g:2442:1: (otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) ) )
            // InternalVilBuildLanguage.g:2442:3: otherlv_0= 'with' ( (lv_restriction_1_0= ruleExpression ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVersionSpecAccess().getWithKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:2446:1: ( (lv_restriction_1_0= ruleExpression ) )
            // InternalVilBuildLanguage.g:2447:1: (lv_restriction_1_0= ruleExpression )
            {
            // InternalVilBuildLanguage.g:2447:1: (lv_restriction_1_0= ruleExpression )
            // InternalVilBuildLanguage.g:2448:3: lv_restriction_1_0= ruleExpression
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
    // InternalVilBuildLanguage.g:2472:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalVilBuildLanguage.g:2473:2: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalVilBuildLanguage.g:2474:2: iv_ruleParameterList= ruleParameterList EOF
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
    // InternalVilBuildLanguage.g:2481:1: ruleParameterList returns [EObject current=null] : ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )* ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_param_0_0 = null;

        EObject lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2484:28: ( ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )* ) )
            // InternalVilBuildLanguage.g:2485:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )* )
            {
            // InternalVilBuildLanguage.g:2485:1: ( ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )* )
            // InternalVilBuildLanguage.g:2485:2: ( (lv_param_0_0= ruleParameter ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )*
            {
            // InternalVilBuildLanguage.g:2485:2: ( (lv_param_0_0= ruleParameter ) )
            // InternalVilBuildLanguage.g:2486:1: (lv_param_0_0= ruleParameter )
            {
            // InternalVilBuildLanguage.g:2486:1: (lv_param_0_0= ruleParameter )
            // InternalVilBuildLanguage.g:2487:3: lv_param_0_0= ruleParameter
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
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

            // InternalVilBuildLanguage.g:2503:2: (otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==25) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:2503:4: otherlv_1= ',' ( (lv_param_2_0= ruleParameter ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalVilBuildLanguage.g:2507:1: ( (lv_param_2_0= ruleParameter ) )
            	    // InternalVilBuildLanguage.g:2508:1: (lv_param_2_0= ruleParameter )
            	    {
            	    // InternalVilBuildLanguage.g:2508:1: (lv_param_2_0= ruleParameter )
            	    // InternalVilBuildLanguage.g:2509:3: lv_param_2_0= ruleParameter
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getParameterListAccess().getParamParameterParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameter"
    // InternalVilBuildLanguage.g:2533:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalVilBuildLanguage.g:2534:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalVilBuildLanguage.g:2535:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalVilBuildLanguage.g:2542:1: ruleParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        EObject lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2545:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) ) ) )
            // InternalVilBuildLanguage.g:2546:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) ) )
            {
            // InternalVilBuildLanguage.g:2546:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) ) )
            // InternalVilBuildLanguage.g:2546:2: ( (lv_type_0_0= ruleType ) ) ( (lv_name_1_0= ruleIdentifier ) )
            {
            // InternalVilBuildLanguage.g:2546:2: ( (lv_type_0_0= ruleType ) )
            // InternalVilBuildLanguage.g:2547:1: (lv_type_0_0= ruleType )
            {
            // InternalVilBuildLanguage.g:2547:1: (lv_type_0_0= ruleType )
            // InternalVilBuildLanguage.g:2548:3: lv_type_0_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_10);
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

            // InternalVilBuildLanguage.g:2564:2: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:2565:1: (lv_name_1_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:2565:1: (lv_name_1_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:2566:3: lv_name_1_0= ruleIdentifier
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
    // InternalVilBuildLanguage.g:2590:1: entryRuleVersionStmt returns [EObject current=null] : iv_ruleVersionStmt= ruleVersionStmt EOF ;
    public final EObject entryRuleVersionStmt() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersionStmt = null;


        try {
            // InternalVilBuildLanguage.g:2591:2: (iv_ruleVersionStmt= ruleVersionStmt EOF )
            // InternalVilBuildLanguage.g:2592:2: iv_ruleVersionStmt= ruleVersionStmt EOF
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
    // InternalVilBuildLanguage.g:2599:1: ruleVersionStmt returns [EObject current=null] : (otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';' ) ;
    public final EObject ruleVersionStmt() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_version_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2602:28: ( (otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';' ) )
            // InternalVilBuildLanguage.g:2603:1: (otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';' )
            {
            // InternalVilBuildLanguage.g:2603:1: (otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';' )
            // InternalVilBuildLanguage.g:2603:3: otherlv_0= 'version' ( (lv_version_1_0= RULE_VERSION ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_42); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVersionStmtAccess().getVersionKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:2607:1: ( (lv_version_1_0= RULE_VERSION ) )
            // InternalVilBuildLanguage.g:2608:1: (lv_version_1_0= RULE_VERSION )
            {
            // InternalVilBuildLanguage.g:2608:1: (lv_version_1_0= RULE_VERSION )
            // InternalVilBuildLanguage.g:2609:3: lv_version_1_0= RULE_VERSION
            {
            lv_version_1_0=(Token)match(input,RULE_VERSION,FOLLOW_8); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:2637:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalVilBuildLanguage.g:2638:2: (iv_ruleImport= ruleImport EOF )
            // InternalVilBuildLanguage.g:2639:2: iv_ruleImport= ruleImport EOF
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
    // InternalVilBuildLanguage.g:2646:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';' ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_versionSpec_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2649:28: ( (otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';' ) )
            // InternalVilBuildLanguage.g:2650:1: (otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';' )
            {
            // InternalVilBuildLanguage.g:2650:1: (otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';' )
            // InternalVilBuildLanguage.g:2650:3: otherlv_0= 'import' ( (lv_name_1_0= ruleIdentifier ) ) ( (lv_versionSpec_2_0= ruleVersionSpec ) )? otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:2654:1: ( (lv_name_1_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:2655:1: (lv_name_1_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:2655:1: (lv_name_1_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:2656:3: lv_name_1_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportAccess().getNameIdentifierParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_43);
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

            // InternalVilBuildLanguage.g:2672:2: ( (lv_versionSpec_2_0= ruleVersionSpec ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==35) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalVilBuildLanguage.g:2673:1: (lv_versionSpec_2_0= ruleVersionSpec )
                    {
                    // InternalVilBuildLanguage.g:2673:1: (lv_versionSpec_2_0= ruleVersionSpec )
                    // InternalVilBuildLanguage.g:2674:3: lv_versionSpec_2_0= ruleVersionSpec
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImportAccess().getVersionSpecVersionSpecParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_8);
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

            otherlv_3=(Token)match(input,14,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleExpression"
    // InternalVilBuildLanguage.g:2702:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalVilBuildLanguage.g:2703:2: (iv_ruleExpression= ruleExpression EOF )
            // InternalVilBuildLanguage.g:2704:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalVilBuildLanguage.g:2711:1: ruleExpression returns [EObject current=null] : ( ( (lv_expr_0_0= ruleLogicalExpression ) ) | ( (lv_init_1_0= ruleContainerInitializer ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expr_0_0 = null;

        EObject lv_init_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2714:28: ( ( ( (lv_expr_0_0= ruleLogicalExpression ) ) | ( (lv_init_1_0= ruleContainerInitializer ) ) ) )
            // InternalVilBuildLanguage.g:2715:1: ( ( (lv_expr_0_0= ruleLogicalExpression ) ) | ( (lv_init_1_0= ruleContainerInitializer ) ) )
            {
            // InternalVilBuildLanguage.g:2715:1: ( ( (lv_expr_0_0= ruleLogicalExpression ) ) | ( (lv_init_1_0= ruleContainerInitializer ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_STRING && LA47_0<=RULE_EXPONENT)||LA47_0==16||(LA47_0>=28 && LA47_0<=29)||LA47_0==34||LA47_0==37||LA47_0==41||LA47_0==54||(LA47_0>=57 && LA47_0<=60)||(LA47_0>=66 && LA47_0<=68)) ) {
                alt47=1;
            }
            else if ( (LA47_0==18) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalVilBuildLanguage.g:2715:2: ( (lv_expr_0_0= ruleLogicalExpression ) )
                    {
                    // InternalVilBuildLanguage.g:2715:2: ( (lv_expr_0_0= ruleLogicalExpression ) )
                    // InternalVilBuildLanguage.g:2716:1: (lv_expr_0_0= ruleLogicalExpression )
                    {
                    // InternalVilBuildLanguage.g:2716:1: (lv_expr_0_0= ruleLogicalExpression )
                    // InternalVilBuildLanguage.g:2717:3: lv_expr_0_0= ruleLogicalExpression
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
                    // InternalVilBuildLanguage.g:2734:6: ( (lv_init_1_0= ruleContainerInitializer ) )
                    {
                    // InternalVilBuildLanguage.g:2734:6: ( (lv_init_1_0= ruleContainerInitializer ) )
                    // InternalVilBuildLanguage.g:2735:1: (lv_init_1_0= ruleContainerInitializer )
                    {
                    // InternalVilBuildLanguage.g:2735:1: (lv_init_1_0= ruleContainerInitializer )
                    // InternalVilBuildLanguage.g:2736:3: lv_init_1_0= ruleContainerInitializer
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
    // InternalVilBuildLanguage.g:2760:1: entryRuleLogicalExpression returns [EObject current=null] : iv_ruleLogicalExpression= ruleLogicalExpression EOF ;
    public final EObject entryRuleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpression = null;


        try {
            // InternalVilBuildLanguage.g:2761:2: (iv_ruleLogicalExpression= ruleLogicalExpression EOF )
            // InternalVilBuildLanguage.g:2762:2: iv_ruleLogicalExpression= ruleLogicalExpression EOF
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
    // InternalVilBuildLanguage.g:2769:1: ruleLogicalExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )* ) ;
    public final EObject ruleLogicalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2772:28: ( ( ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )* ) )
            // InternalVilBuildLanguage.g:2773:1: ( ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )* )
            {
            // InternalVilBuildLanguage.g:2773:1: ( ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )* )
            // InternalVilBuildLanguage.g:2773:2: ( (lv_left_0_0= ruleEqualityExpression ) ) ( (lv_right_1_0= ruleLogicalExpressionPart ) )*
            {
            // InternalVilBuildLanguage.g:2773:2: ( (lv_left_0_0= ruleEqualityExpression ) )
            // InternalVilBuildLanguage.g:2774:1: (lv_left_0_0= ruleEqualityExpression )
            {
            // InternalVilBuildLanguage.g:2774:1: (lv_left_0_0= ruleEqualityExpression )
            // InternalVilBuildLanguage.g:2775:3: lv_left_0_0= ruleEqualityExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getLeftEqualityExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_44);
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

            // InternalVilBuildLanguage.g:2791:2: ( (lv_right_1_0= ruleLogicalExpressionPart ) )*
            loop48:
            do {
                int alt48=2;
                switch ( input.LA(1) ) {
                case 43:
                    {
                    int LA48_2 = input.LA(2);

                    if ( (synpred59_InternalVilBuildLanguage()) ) {
                        alt48=1;
                    }


                    }
                    break;
                case 44:
                    {
                    int LA48_3 = input.LA(2);

                    if ( (synpred59_InternalVilBuildLanguage()) ) {
                        alt48=1;
                    }


                    }
                    break;
                case 45:
                    {
                    int LA48_4 = input.LA(2);

                    if ( (synpred59_InternalVilBuildLanguage()) ) {
                        alt48=1;
                    }


                    }
                    break;

                }

                switch (alt48) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:2792:1: (lv_right_1_0= ruleLogicalExpressionPart )
            	    {
            	    // InternalVilBuildLanguage.g:2792:1: (lv_right_1_0= ruleLogicalExpressionPart )
            	    // InternalVilBuildLanguage.g:2793:3: lv_right_1_0= ruleLogicalExpressionPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightLogicalExpressionPartParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_44);
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
            	    break loop48;
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
    // InternalVilBuildLanguage.g:2817:1: entryRuleLogicalExpressionPart returns [EObject current=null] : iv_ruleLogicalExpressionPart= ruleLogicalExpressionPart EOF ;
    public final EObject entryRuleLogicalExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalExpressionPart = null;


        try {
            // InternalVilBuildLanguage.g:2818:2: (iv_ruleLogicalExpressionPart= ruleLogicalExpressionPart EOF )
            // InternalVilBuildLanguage.g:2819:2: iv_ruleLogicalExpressionPart= ruleLogicalExpressionPart EOF
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
    // InternalVilBuildLanguage.g:2826:1: ruleLogicalExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) ) ) ;
    public final EObject ruleLogicalExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2829:28: ( ( ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) ) ) )
            // InternalVilBuildLanguage.g:2830:1: ( ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) ) )
            {
            // InternalVilBuildLanguage.g:2830:1: ( ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) ) )
            // InternalVilBuildLanguage.g:2830:2: ( (lv_op_0_0= ruleLogicalOperator ) ) ( (lv_ex_1_0= ruleEqualityExpression ) )
            {
            // InternalVilBuildLanguage.g:2830:2: ( (lv_op_0_0= ruleLogicalOperator ) )
            // InternalVilBuildLanguage.g:2831:1: (lv_op_0_0= ruleLogicalOperator )
            {
            // InternalVilBuildLanguage.g:2831:1: (lv_op_0_0= ruleLogicalOperator )
            // InternalVilBuildLanguage.g:2832:3: lv_op_0_0= ruleLogicalOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLogicalExpressionPartAccess().getOpLogicalOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
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

            // InternalVilBuildLanguage.g:2848:2: ( (lv_ex_1_0= ruleEqualityExpression ) )
            // InternalVilBuildLanguage.g:2849:1: (lv_ex_1_0= ruleEqualityExpression )
            {
            // InternalVilBuildLanguage.g:2849:1: (lv_ex_1_0= ruleEqualityExpression )
            // InternalVilBuildLanguage.g:2850:3: lv_ex_1_0= ruleEqualityExpression
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
    // InternalVilBuildLanguage.g:2874:1: entryRuleLogicalOperator returns [String current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final String entryRuleLogicalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOperator = null;


        try {
            // InternalVilBuildLanguage.g:2875:2: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalVilBuildLanguage.g:2876:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
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
    // InternalVilBuildLanguage.g:2883:1: ruleLogicalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'and' | kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2886:28: ( (kw= 'and' | kw= 'or' | kw= 'xor' ) )
            // InternalVilBuildLanguage.g:2887:1: (kw= 'and' | kw= 'or' | kw= 'xor' )
            {
            // InternalVilBuildLanguage.g:2887:1: (kw= 'and' | kw= 'or' | kw= 'xor' )
            int alt49=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt49=1;
                }
                break;
            case 44:
                {
                alt49=2;
                }
                break;
            case 45:
                {
                alt49=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // InternalVilBuildLanguage.g:2888:2: kw= 'and'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getAndKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:2895:2: kw= 'or'
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getLogicalOperatorAccess().getOrKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalVilBuildLanguage.g:2902:2: kw= 'xor'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:2915:1: entryRuleEqualityExpression returns [EObject current=null] : iv_ruleEqualityExpression= ruleEqualityExpression EOF ;
    public final EObject entryRuleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpression = null;


        try {
            // InternalVilBuildLanguage.g:2916:2: (iv_ruleEqualityExpression= ruleEqualityExpression EOF )
            // InternalVilBuildLanguage.g:2917:2: iv_ruleEqualityExpression= ruleEqualityExpression EOF
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
    // InternalVilBuildLanguage.g:2924:1: ruleEqualityExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )? ) ;
    public final EObject ruleEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2927:28: ( ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )? ) )
            // InternalVilBuildLanguage.g:2928:1: ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )? )
            {
            // InternalVilBuildLanguage.g:2928:1: ( ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )? )
            // InternalVilBuildLanguage.g:2928:2: ( (lv_left_0_0= ruleRelationalExpression ) ) ( (lv_right_1_0= ruleEqualityExpressionPart ) )?
            {
            // InternalVilBuildLanguage.g:2928:2: ( (lv_left_0_0= ruleRelationalExpression ) )
            // InternalVilBuildLanguage.g:2929:1: (lv_left_0_0= ruleRelationalExpression )
            {
            // InternalVilBuildLanguage.g:2929:1: (lv_left_0_0= ruleRelationalExpression )
            // InternalVilBuildLanguage.g:2930:3: lv_left_0_0= ruleRelationalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getLeftRelationalExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_45);
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

            // InternalVilBuildLanguage.g:2946:2: ( (lv_right_1_0= ruleEqualityExpressionPart ) )?
            int alt50=2;
            switch ( input.LA(1) ) {
                case 46:
                    {
                    int LA50_1 = input.LA(2);

                    if ( (synpred62_InternalVilBuildLanguage()) ) {
                        alt50=1;
                    }
                    }
                    break;
                case 47:
                    {
                    int LA50_2 = input.LA(2);

                    if ( (synpred62_InternalVilBuildLanguage()) ) {
                        alt50=1;
                    }
                    }
                    break;
                case 48:
                    {
                    int LA50_3 = input.LA(2);

                    if ( (synpred62_InternalVilBuildLanguage()) ) {
                        alt50=1;
                    }
                    }
                    break;
            }

            switch (alt50) {
                case 1 :
                    // InternalVilBuildLanguage.g:2947:1: (lv_right_1_0= ruleEqualityExpressionPart )
                    {
                    // InternalVilBuildLanguage.g:2947:1: (lv_right_1_0= ruleEqualityExpressionPart )
                    // InternalVilBuildLanguage.g:2948:3: lv_right_1_0= ruleEqualityExpressionPart
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
    // InternalVilBuildLanguage.g:2972:1: entryRuleEqualityExpressionPart returns [EObject current=null] : iv_ruleEqualityExpressionPart= ruleEqualityExpressionPart EOF ;
    public final EObject entryRuleEqualityExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualityExpressionPart = null;


        try {
            // InternalVilBuildLanguage.g:2973:2: (iv_ruleEqualityExpressionPart= ruleEqualityExpressionPart EOF )
            // InternalVilBuildLanguage.g:2974:2: iv_ruleEqualityExpressionPart= ruleEqualityExpressionPart EOF
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
    // InternalVilBuildLanguage.g:2981:1: ruleEqualityExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) ) ) ;
    public final EObject ruleEqualityExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:2984:28: ( ( ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) ) ) )
            // InternalVilBuildLanguage.g:2985:1: ( ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) ) )
            {
            // InternalVilBuildLanguage.g:2985:1: ( ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) ) )
            // InternalVilBuildLanguage.g:2985:2: ( (lv_op_0_0= ruleEqualityOperator ) ) ( (lv_ex_1_0= ruleRelationalExpression ) )
            {
            // InternalVilBuildLanguage.g:2985:2: ( (lv_op_0_0= ruleEqualityOperator ) )
            // InternalVilBuildLanguage.g:2986:1: (lv_op_0_0= ruleEqualityOperator )
            {
            // InternalVilBuildLanguage.g:2986:1: (lv_op_0_0= ruleEqualityOperator )
            // InternalVilBuildLanguage.g:2987:3: lv_op_0_0= ruleEqualityOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEqualityExpressionPartAccess().getOpEqualityOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
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

            // InternalVilBuildLanguage.g:3003:2: ( (lv_ex_1_0= ruleRelationalExpression ) )
            // InternalVilBuildLanguage.g:3004:1: (lv_ex_1_0= ruleRelationalExpression )
            {
            // InternalVilBuildLanguage.g:3004:1: (lv_ex_1_0= ruleRelationalExpression )
            // InternalVilBuildLanguage.g:3005:3: lv_ex_1_0= ruleRelationalExpression
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
    // InternalVilBuildLanguage.g:3029:1: entryRuleEqualityOperator returns [String current=null] : iv_ruleEqualityOperator= ruleEqualityOperator EOF ;
    public final String entryRuleEqualityOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEqualityOperator = null;


        try {
            // InternalVilBuildLanguage.g:3030:2: (iv_ruleEqualityOperator= ruleEqualityOperator EOF )
            // InternalVilBuildLanguage.g:3031:2: iv_ruleEqualityOperator= ruleEqualityOperator EOF
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
    // InternalVilBuildLanguage.g:3038:1: ruleEqualityOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '<>' | kw= '!=' ) ;
    public final AntlrDatatypeRuleToken ruleEqualityOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3041:28: ( (kw= '==' | kw= '<>' | kw= '!=' ) )
            // InternalVilBuildLanguage.g:3042:1: (kw= '==' | kw= '<>' | kw= '!=' )
            {
            // InternalVilBuildLanguage.g:3042:1: (kw= '==' | kw= '<>' | kw= '!=' )
            int alt51=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt51=1;
                }
                break;
            case 47:
                {
                alt51=2;
                }
                break;
            case 48:
                {
                alt51=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // InternalVilBuildLanguage.g:3043:2: kw= '=='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getEqualsSignEqualsSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:3050:2: kw= '<>'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEqualityOperatorAccess().getLessThanSignGreaterThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalVilBuildLanguage.g:3057:2: kw= '!='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:3070:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // InternalVilBuildLanguage.g:3071:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // InternalVilBuildLanguage.g:3072:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
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
    // InternalVilBuildLanguage.g:3079:1: ruleRelationalExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )? ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3082:28: ( ( ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )? ) )
            // InternalVilBuildLanguage.g:3083:1: ( ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )? )
            {
            // InternalVilBuildLanguage.g:3083:1: ( ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )? )
            // InternalVilBuildLanguage.g:3083:2: ( (lv_left_0_0= ruleAdditiveExpression ) ) ( (lv_right_1_0= ruleRelationalExpressionPart ) )?
            {
            // InternalVilBuildLanguage.g:3083:2: ( (lv_left_0_0= ruleAdditiveExpression ) )
            // InternalVilBuildLanguage.g:3084:1: (lv_left_0_0= ruleAdditiveExpression )
            {
            // InternalVilBuildLanguage.g:3084:1: (lv_left_0_0= ruleAdditiveExpression )
            // InternalVilBuildLanguage.g:3085:3: lv_left_0_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getLeftAdditiveExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_46);
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

            // InternalVilBuildLanguage.g:3101:2: ( (lv_right_1_0= ruleRelationalExpressionPart ) )?
            int alt52=2;
            switch ( input.LA(1) ) {
                case 49:
                    {
                    int LA52_1 = input.LA(2);

                    if ( (synpred65_InternalVilBuildLanguage()) ) {
                        alt52=1;
                    }
                    }
                    break;
                case 50:
                    {
                    int LA52_2 = input.LA(2);

                    if ( (synpred65_InternalVilBuildLanguage()) ) {
                        alt52=1;
                    }
                    }
                    break;
                case 51:
                    {
                    int LA52_3 = input.LA(2);

                    if ( (synpred65_InternalVilBuildLanguage()) ) {
                        alt52=1;
                    }
                    }
                    break;
                case 52:
                    {
                    int LA52_4 = input.LA(2);

                    if ( (synpred65_InternalVilBuildLanguage()) ) {
                        alt52=1;
                    }
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // InternalVilBuildLanguage.g:3102:1: (lv_right_1_0= ruleRelationalExpressionPart )
                    {
                    // InternalVilBuildLanguage.g:3102:1: (lv_right_1_0= ruleRelationalExpressionPart )
                    // InternalVilBuildLanguage.g:3103:3: lv_right_1_0= ruleRelationalExpressionPart
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
    // InternalVilBuildLanguage.g:3127:1: entryRuleRelationalExpressionPart returns [EObject current=null] : iv_ruleRelationalExpressionPart= ruleRelationalExpressionPart EOF ;
    public final EObject entryRuleRelationalExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpressionPart = null;


        try {
            // InternalVilBuildLanguage.g:3128:2: (iv_ruleRelationalExpressionPart= ruleRelationalExpressionPart EOF )
            // InternalVilBuildLanguage.g:3129:2: iv_ruleRelationalExpressionPart= ruleRelationalExpressionPart EOF
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
    // InternalVilBuildLanguage.g:3136:1: ruleRelationalExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) ) ) ;
    public final EObject ruleRelationalExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3139:28: ( ( ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) ) ) )
            // InternalVilBuildLanguage.g:3140:1: ( ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) ) )
            {
            // InternalVilBuildLanguage.g:3140:1: ( ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) ) )
            // InternalVilBuildLanguage.g:3140:2: ( (lv_op_0_0= ruleRelationalOperator ) ) ( (lv_ex_1_0= ruleAdditiveExpression ) )
            {
            // InternalVilBuildLanguage.g:3140:2: ( (lv_op_0_0= ruleRelationalOperator ) )
            // InternalVilBuildLanguage.g:3141:1: (lv_op_0_0= ruleRelationalOperator )
            {
            // InternalVilBuildLanguage.g:3141:1: (lv_op_0_0= ruleRelationalOperator )
            // InternalVilBuildLanguage.g:3142:3: lv_op_0_0= ruleRelationalOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationalExpressionPartAccess().getOpRelationalOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
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

            // InternalVilBuildLanguage.g:3158:2: ( (lv_ex_1_0= ruleAdditiveExpression ) )
            // InternalVilBuildLanguage.g:3159:1: (lv_ex_1_0= ruleAdditiveExpression )
            {
            // InternalVilBuildLanguage.g:3159:1: (lv_ex_1_0= ruleAdditiveExpression )
            // InternalVilBuildLanguage.g:3160:3: lv_ex_1_0= ruleAdditiveExpression
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
    // InternalVilBuildLanguage.g:3184:1: entryRuleRelationalOperator returns [String current=null] : iv_ruleRelationalOperator= ruleRelationalOperator EOF ;
    public final String entryRuleRelationalOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRelationalOperator = null;


        try {
            // InternalVilBuildLanguage.g:3185:2: (iv_ruleRelationalOperator= ruleRelationalOperator EOF )
            // InternalVilBuildLanguage.g:3186:2: iv_ruleRelationalOperator= ruleRelationalOperator EOF
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
    // InternalVilBuildLanguage.g:3193:1: ruleRelationalOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) ;
    public final AntlrDatatypeRuleToken ruleRelationalOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3196:28: ( (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) )
            // InternalVilBuildLanguage.g:3197:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            {
            // InternalVilBuildLanguage.g:3197:1: (kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt53=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt53=1;
                }
                break;
            case 50:
                {
                alt53=2;
                }
                break;
            case 51:
                {
                alt53=3;
                }
                break;
            case 52:
                {
                alt53=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalVilBuildLanguage.g:3198:2: kw= '>'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:3205:2: kw= '<'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getLessThanSignKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalVilBuildLanguage.g:3212:2: kw= '>='
                    {
                    kw=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getRelationalOperatorAccess().getGreaterThanSignEqualsSignKeyword_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // InternalVilBuildLanguage.g:3219:2: kw= '<='
                    {
                    kw=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:3232:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // InternalVilBuildLanguage.g:3233:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // InternalVilBuildLanguage.g:3234:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
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
    // InternalVilBuildLanguage.g:3241:1: ruleAdditiveExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3244:28: ( ( ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )* ) )
            // InternalVilBuildLanguage.g:3245:1: ( ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )* )
            {
            // InternalVilBuildLanguage.g:3245:1: ( ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )* )
            // InternalVilBuildLanguage.g:3245:2: ( (lv_left_0_0= ruleMultiplicativeExpression ) ) ( (lv_right_1_0= ruleAdditiveExpressionPart ) )*
            {
            // InternalVilBuildLanguage.g:3245:2: ( (lv_left_0_0= ruleMultiplicativeExpression ) )
            // InternalVilBuildLanguage.g:3246:1: (lv_left_0_0= ruleMultiplicativeExpression )
            {
            // InternalVilBuildLanguage.g:3246:1: (lv_left_0_0= ruleMultiplicativeExpression )
            // InternalVilBuildLanguage.g:3247:3: lv_left_0_0= ruleMultiplicativeExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getLeftMultiplicativeExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_47);
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

            // InternalVilBuildLanguage.g:3263:2: ( (lv_right_1_0= ruleAdditiveExpressionPart ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==53) ) {
                    int LA54_2 = input.LA(2);

                    if ( (synpred69_InternalVilBuildLanguage()) ) {
                        alt54=1;
                    }


                }
                else if ( (LA54_0==54) ) {
                    int LA54_3 = input.LA(2);

                    if ( (synpred69_InternalVilBuildLanguage()) ) {
                        alt54=1;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:3264:1: (lv_right_1_0= ruleAdditiveExpressionPart )
            	    {
            	    // InternalVilBuildLanguage.g:3264:1: (lv_right_1_0= ruleAdditiveExpressionPart )
            	    // InternalVilBuildLanguage.g:3265:3: lv_right_1_0= ruleAdditiveExpressionPart
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightAdditiveExpressionPartParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_47);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleAdditiveExpressionPart"
    // InternalVilBuildLanguage.g:3289:1: entryRuleAdditiveExpressionPart returns [EObject current=null] : iv_ruleAdditiveExpressionPart= ruleAdditiveExpressionPart EOF ;
    public final EObject entryRuleAdditiveExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpressionPart = null;


        try {
            // InternalVilBuildLanguage.g:3290:2: (iv_ruleAdditiveExpressionPart= ruleAdditiveExpressionPart EOF )
            // InternalVilBuildLanguage.g:3291:2: iv_ruleAdditiveExpressionPart= ruleAdditiveExpressionPart EOF
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
    // InternalVilBuildLanguage.g:3298:1: ruleAdditiveExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) ) ) ;
    public final EObject ruleAdditiveExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_ex_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3301:28: ( ( ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) ) ) )
            // InternalVilBuildLanguage.g:3302:1: ( ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) ) )
            {
            // InternalVilBuildLanguage.g:3302:1: ( ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) ) )
            // InternalVilBuildLanguage.g:3302:2: ( (lv_op_0_0= ruleAdditiveOperator ) ) ( (lv_ex_1_0= ruleMultiplicativeExpression ) )
            {
            // InternalVilBuildLanguage.g:3302:2: ( (lv_op_0_0= ruleAdditiveOperator ) )
            // InternalVilBuildLanguage.g:3303:1: (lv_op_0_0= ruleAdditiveOperator )
            {
            // InternalVilBuildLanguage.g:3303:1: (lv_op_0_0= ruleAdditiveOperator )
            // InternalVilBuildLanguage.g:3304:3: lv_op_0_0= ruleAdditiveOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAdditiveExpressionPartAccess().getOpAdditiveOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
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

            // InternalVilBuildLanguage.g:3320:2: ( (lv_ex_1_0= ruleMultiplicativeExpression ) )
            // InternalVilBuildLanguage.g:3321:1: (lv_ex_1_0= ruleMultiplicativeExpression )
            {
            // InternalVilBuildLanguage.g:3321:1: (lv_ex_1_0= ruleMultiplicativeExpression )
            // InternalVilBuildLanguage.g:3322:3: lv_ex_1_0= ruleMultiplicativeExpression
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
    // InternalVilBuildLanguage.g:3346:1: entryRuleAdditiveOperator returns [String current=null] : iv_ruleAdditiveOperator= ruleAdditiveOperator EOF ;
    public final String entryRuleAdditiveOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAdditiveOperator = null;


        try {
            // InternalVilBuildLanguage.g:3347:2: (iv_ruleAdditiveOperator= ruleAdditiveOperator EOF )
            // InternalVilBuildLanguage.g:3348:2: iv_ruleAdditiveOperator= ruleAdditiveOperator EOF
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
    // InternalVilBuildLanguage.g:3355:1: ruleAdditiveOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleAdditiveOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3358:28: ( (kw= '+' | kw= '-' ) )
            // InternalVilBuildLanguage.g:3359:1: (kw= '+' | kw= '-' )
            {
            // InternalVilBuildLanguage.g:3359:1: (kw= '+' | kw= '-' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            else if ( (LA55_0==54) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalVilBuildLanguage.g:3360:2: kw= '+'
                    {
                    kw=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getAdditiveOperatorAccess().getPlusSignKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:3367:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:3380:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // InternalVilBuildLanguage.g:3381:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // InternalVilBuildLanguage.g:3382:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
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
    // InternalVilBuildLanguage.g:3389:1: ruleMultiplicativeExpression returns [EObject current=null] : ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )? ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;

        EObject lv_right_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3392:28: ( ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )? ) )
            // InternalVilBuildLanguage.g:3393:1: ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )? )
            {
            // InternalVilBuildLanguage.g:3393:1: ( ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )? )
            // InternalVilBuildLanguage.g:3393:2: ( (lv_left_0_0= ruleUnaryExpression ) ) ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )?
            {
            // InternalVilBuildLanguage.g:3393:2: ( (lv_left_0_0= ruleUnaryExpression ) )
            // InternalVilBuildLanguage.g:3394:1: (lv_left_0_0= ruleUnaryExpression )
            {
            // InternalVilBuildLanguage.g:3394:1: (lv_left_0_0= ruleUnaryExpression )
            // InternalVilBuildLanguage.g:3395:3: lv_left_0_0= ruleUnaryExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getLeftUnaryExpressionParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_48);
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

            // InternalVilBuildLanguage.g:3411:2: ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==55) ) {
                int LA56_1 = input.LA(2);

                if ( (synpred71_InternalVilBuildLanguage()) ) {
                    alt56=1;
                }
            }
            else if ( (LA56_0==56) ) {
                int LA56_2 = input.LA(2);

                if ( (synpred71_InternalVilBuildLanguage()) ) {
                    alt56=1;
                }
            }
            switch (alt56) {
                case 1 :
                    // InternalVilBuildLanguage.g:3412:1: (lv_right_1_0= ruleMultiplicativeExpressionPart )
                    {
                    // InternalVilBuildLanguage.g:3412:1: (lv_right_1_0= ruleMultiplicativeExpressionPart )
                    // InternalVilBuildLanguage.g:3413:3: lv_right_1_0= ruleMultiplicativeExpressionPart
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
    // InternalVilBuildLanguage.g:3437:1: entryRuleMultiplicativeExpressionPart returns [EObject current=null] : iv_ruleMultiplicativeExpressionPart= ruleMultiplicativeExpressionPart EOF ;
    public final EObject entryRuleMultiplicativeExpressionPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpressionPart = null;


        try {
            // InternalVilBuildLanguage.g:3438:2: (iv_ruleMultiplicativeExpressionPart= ruleMultiplicativeExpressionPart EOF )
            // InternalVilBuildLanguage.g:3439:2: iv_ruleMultiplicativeExpressionPart= ruleMultiplicativeExpressionPart EOF
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
    // InternalVilBuildLanguage.g:3446:1: ruleMultiplicativeExpressionPart returns [EObject current=null] : ( ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) ) ) ;
    public final EObject ruleMultiplicativeExpressionPart() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3449:28: ( ( ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) ) ) )
            // InternalVilBuildLanguage.g:3450:1: ( ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) ) )
            {
            // InternalVilBuildLanguage.g:3450:1: ( ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) ) )
            // InternalVilBuildLanguage.g:3450:2: ( (lv_op_0_0= ruleMultiplicativeOperator ) ) ( (lv_expr_1_0= ruleUnaryExpression ) )
            {
            // InternalVilBuildLanguage.g:3450:2: ( (lv_op_0_0= ruleMultiplicativeOperator ) )
            // InternalVilBuildLanguage.g:3451:1: (lv_op_0_0= ruleMultiplicativeOperator )
            {
            // InternalVilBuildLanguage.g:3451:1: (lv_op_0_0= ruleMultiplicativeOperator )
            // InternalVilBuildLanguage.g:3452:3: lv_op_0_0= ruleMultiplicativeOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionPartAccess().getOpMultiplicativeOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_27);
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

            // InternalVilBuildLanguage.g:3468:2: ( (lv_expr_1_0= ruleUnaryExpression ) )
            // InternalVilBuildLanguage.g:3469:1: (lv_expr_1_0= ruleUnaryExpression )
            {
            // InternalVilBuildLanguage.g:3469:1: (lv_expr_1_0= ruleUnaryExpression )
            // InternalVilBuildLanguage.g:3470:3: lv_expr_1_0= ruleUnaryExpression
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
    // InternalVilBuildLanguage.g:3494:1: entryRuleMultiplicativeOperator returns [String current=null] : iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF ;
    public final String entryRuleMultiplicativeOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMultiplicativeOperator = null;


        try {
            // InternalVilBuildLanguage.g:3495:2: (iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF )
            // InternalVilBuildLanguage.g:3496:2: iv_ruleMultiplicativeOperator= ruleMultiplicativeOperator EOF
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
    // InternalVilBuildLanguage.g:3503:1: ruleMultiplicativeOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleMultiplicativeOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3506:28: ( (kw= '*' | kw= '/' ) )
            // InternalVilBuildLanguage.g:3507:1: (kw= '*' | kw= '/' )
            {
            // InternalVilBuildLanguage.g:3507:1: (kw= '*' | kw= '/' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==55) ) {
                alt57=1;
            }
            else if ( (LA57_0==56) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalVilBuildLanguage.g:3508:2: kw= '*'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getMultiplicativeOperatorAccess().getAsteriskKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:3515:2: kw= '/'
                    {
                    kw=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:3528:1: entryRuleUnaryExpression returns [EObject current=null] : iv_ruleUnaryExpression= ruleUnaryExpression EOF ;
    public final EObject entryRuleUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnaryExpression = null;


        try {
            // InternalVilBuildLanguage.g:3529:2: (iv_ruleUnaryExpression= ruleUnaryExpression EOF )
            // InternalVilBuildLanguage.g:3530:2: iv_ruleUnaryExpression= ruleUnaryExpression EOF
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
    // InternalVilBuildLanguage.g:3537:1: ruleUnaryExpression returns [EObject current=null] : ( ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) ) ) ;
    public final EObject ruleUnaryExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_expr_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3540:28: ( ( ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) ) ) )
            // InternalVilBuildLanguage.g:3541:1: ( ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) ) )
            {
            // InternalVilBuildLanguage.g:3541:1: ( ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) ) )
            // InternalVilBuildLanguage.g:3541:2: ( (lv_op_0_0= ruleUnaryOperator ) )? ( (lv_expr_1_0= rulePostfixExpression ) )
            {
            // InternalVilBuildLanguage.g:3541:2: ( (lv_op_0_0= ruleUnaryOperator ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==54||(LA58_0>=57 && LA58_0<=58)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalVilBuildLanguage.g:3542:1: (lv_op_0_0= ruleUnaryOperator )
                    {
                    // InternalVilBuildLanguage.g:3542:1: (lv_op_0_0= ruleUnaryOperator )
                    // InternalVilBuildLanguage.g:3543:3: lv_op_0_0= ruleUnaryOperator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getUnaryExpressionAccess().getOpUnaryOperatorParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_27);
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

            // InternalVilBuildLanguage.g:3559:3: ( (lv_expr_1_0= rulePostfixExpression ) )
            // InternalVilBuildLanguage.g:3560:1: (lv_expr_1_0= rulePostfixExpression )
            {
            // InternalVilBuildLanguage.g:3560:1: (lv_expr_1_0= rulePostfixExpression )
            // InternalVilBuildLanguage.g:3561:3: lv_expr_1_0= rulePostfixExpression
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
    // InternalVilBuildLanguage.g:3585:1: entryRuleUnaryOperator returns [String current=null] : iv_ruleUnaryOperator= ruleUnaryOperator EOF ;
    public final String entryRuleUnaryOperator() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnaryOperator = null;


        try {
            // InternalVilBuildLanguage.g:3586:2: (iv_ruleUnaryOperator= ruleUnaryOperator EOF )
            // InternalVilBuildLanguage.g:3587:2: iv_ruleUnaryOperator= ruleUnaryOperator EOF
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
    // InternalVilBuildLanguage.g:3594:1: ruleUnaryOperator returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'not' | kw= '!' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleUnaryOperator() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3597:28: ( (kw= 'not' | kw= '!' | kw= '-' ) )
            // InternalVilBuildLanguage.g:3598:1: (kw= 'not' | kw= '!' | kw= '-' )
            {
            // InternalVilBuildLanguage.g:3598:1: (kw= 'not' | kw= '!' | kw= '-' )
            int alt59=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt59=1;
                }
                break;
            case 58:
                {
                alt59=2;
                }
                break;
            case 54:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalVilBuildLanguage.g:3599:2: kw= 'not'
                    {
                    kw=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getNotKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // InternalVilBuildLanguage.g:3606:2: kw= '!'
                    {
                    kw=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getUnaryOperatorAccess().getExclamationMarkKeyword_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // InternalVilBuildLanguage.g:3613:2: kw= '-'
                    {
                    kw=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:3626:1: entryRulePostfixExpression returns [EObject current=null] : iv_rulePostfixExpression= rulePostfixExpression EOF ;
    public final EObject entryRulePostfixExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePostfixExpression = null;


        try {
            // InternalVilBuildLanguage.g:3627:2: (iv_rulePostfixExpression= rulePostfixExpression EOF )
            // InternalVilBuildLanguage.g:3628:2: iv_rulePostfixExpression= rulePostfixExpression EOF
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
    // InternalVilBuildLanguage.g:3635:1: rulePostfixExpression returns [EObject current=null] : ( (lv_left_0_0= rulePrimaryExpression ) ) ;
    public final EObject rulePostfixExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_left_0_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3638:28: ( ( (lv_left_0_0= rulePrimaryExpression ) ) )
            // InternalVilBuildLanguage.g:3639:1: ( (lv_left_0_0= rulePrimaryExpression ) )
            {
            // InternalVilBuildLanguage.g:3639:1: ( (lv_left_0_0= rulePrimaryExpression ) )
            // InternalVilBuildLanguage.g:3640:1: (lv_left_0_0= rulePrimaryExpression )
            {
            // InternalVilBuildLanguage.g:3640:1: (lv_left_0_0= rulePrimaryExpression )
            // InternalVilBuildLanguage.g:3641:3: lv_left_0_0= rulePrimaryExpression
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
                      		"de.uni_hildesheim.sse.VilBuildLanguage.PrimaryExpression");
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


    // $ANTLR start "entryRuleExpressionOrQualifiedExecution"
    // InternalVilBuildLanguage.g:3665:1: entryRuleExpressionOrQualifiedExecution returns [EObject current=null] : iv_ruleExpressionOrQualifiedExecution= ruleExpressionOrQualifiedExecution EOF ;
    public final EObject entryRuleExpressionOrQualifiedExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionOrQualifiedExecution = null;


        try {
            // InternalVilBuildLanguage.g:3666:2: (iv_ruleExpressionOrQualifiedExecution= ruleExpressionOrQualifiedExecution EOF )
            // InternalVilBuildLanguage.g:3667:2: iv_ruleExpressionOrQualifiedExecution= ruleExpressionOrQualifiedExecution EOF
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
    // InternalVilBuildLanguage.g:3674:1: ruleExpressionOrQualifiedExecution returns [EObject current=null] : ( ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )* ) ;
    public final EObject ruleExpressionOrQualifiedExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_val_0_0 = null;

        EObject lv_parenthesis_2_0 = null;

        EObject lv_calls_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3677:28: ( ( ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )* ) )
            // InternalVilBuildLanguage.g:3678:1: ( ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )* )
            {
            // InternalVilBuildLanguage.g:3678:1: ( ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )* )
            // InternalVilBuildLanguage.g:3678:2: ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) ) ( (lv_calls_4_0= ruleSubCall ) )*
            {
            // InternalVilBuildLanguage.g:3678:2: ( ( (lv_val_0_0= ruleConstant ) ) | (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=RULE_STRING && LA60_0<=RULE_EXPONENT)||LA60_0==41||(LA60_0>=66 && LA60_0<=68)) ) {
                alt60=1;
            }
            else if ( (LA60_0==16) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalVilBuildLanguage.g:3678:3: ( (lv_val_0_0= ruleConstant ) )
                    {
                    // InternalVilBuildLanguage.g:3678:3: ( (lv_val_0_0= ruleConstant ) )
                    // InternalVilBuildLanguage.g:3679:1: (lv_val_0_0= ruleConstant )
                    {
                    // InternalVilBuildLanguage.g:3679:1: (lv_val_0_0= ruleConstant )
                    // InternalVilBuildLanguage.g:3680:3: lv_val_0_0= ruleConstant
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionOrQualifiedExecutionAccess().getValConstantParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_40);
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
                    // InternalVilBuildLanguage.g:3697:6: (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalVilBuildLanguage.g:3697:6: (otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalVilBuildLanguage.g:3697:8: otherlv_1= '(' ( (lv_parenthesis_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getExpressionOrQualifiedExecutionAccess().getLeftParenthesisKeyword_0_1_0());
                          
                    }
                    // InternalVilBuildLanguage.g:3701:1: ( (lv_parenthesis_2_0= ruleExpression ) )
                    // InternalVilBuildLanguage.g:3702:1: (lv_parenthesis_2_0= ruleExpression )
                    {
                    // InternalVilBuildLanguage.g:3702:1: (lv_parenthesis_2_0= ruleExpression )
                    // InternalVilBuildLanguage.g:3703:3: lv_parenthesis_2_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getExpressionOrQualifiedExecutionAccess().getParenthesisExpressionParserRuleCall_0_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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

                    otherlv_3=(Token)match(input,17,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getExpressionOrQualifiedExecutionAccess().getRightParenthesisKeyword_0_1_2());
                          
                    }

                    }


                    }
                    break;

            }

            // InternalVilBuildLanguage.g:3723:3: ( (lv_calls_4_0= ruleSubCall ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==27||(LA61_0>=61 && LA61_0<=62)) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:3724:1: (lv_calls_4_0= ruleSubCall )
            	    {
            	    // InternalVilBuildLanguage.g:3724:1: (lv_calls_4_0= ruleSubCall )
            	    // InternalVilBuildLanguage.g:3725:3: lv_calls_4_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getExpressionOrQualifiedExecutionAccess().getCallsSubCallParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop61;
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
    // InternalVilBuildLanguage.g:3749:1: entryRuleUnqualifiedExecution returns [EObject current=null] : iv_ruleUnqualifiedExecution= ruleUnqualifiedExecution EOF ;
    public final EObject entryRuleUnqualifiedExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnqualifiedExecution = null;


        try {
            // InternalVilBuildLanguage.g:3750:2: (iv_ruleUnqualifiedExecution= ruleUnqualifiedExecution EOF )
            // InternalVilBuildLanguage.g:3751:2: iv_ruleUnqualifiedExecution= ruleUnqualifiedExecution EOF
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
    // InternalVilBuildLanguage.g:3758:1: ruleUnqualifiedExecution returns [EObject current=null] : ( ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )* ) ;
    public final EObject ruleUnqualifiedExecution() throws RecognitionException {
        EObject current = null;

        EObject lv_call_0_0 = null;

        EObject lv_calls_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3761:28: ( ( ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )* ) )
            // InternalVilBuildLanguage.g:3762:1: ( ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )* )
            {
            // InternalVilBuildLanguage.g:3762:1: ( ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )* )
            // InternalVilBuildLanguage.g:3762:2: ( (lv_call_0_0= ruleCall ) ) ( (lv_calls_1_0= ruleSubCall ) )*
            {
            // InternalVilBuildLanguage.g:3762:2: ( (lv_call_0_0= ruleCall ) )
            // InternalVilBuildLanguage.g:3763:1: (lv_call_0_0= ruleCall )
            {
            // InternalVilBuildLanguage.g:3763:1: (lv_call_0_0= ruleCall )
            // InternalVilBuildLanguage.g:3764:3: lv_call_0_0= ruleCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getUnqualifiedExecutionAccess().getCallCallParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_40);
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

            // InternalVilBuildLanguage.g:3780:2: ( (lv_calls_1_0= ruleSubCall ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==27||(LA62_0>=61 && LA62_0<=62)) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:3781:1: (lv_calls_1_0= ruleSubCall )
            	    {
            	    // InternalVilBuildLanguage.g:3781:1: (lv_calls_1_0= ruleSubCall )
            	    // InternalVilBuildLanguage.g:3782:3: lv_calls_1_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getUnqualifiedExecutionAccess().getCallsSubCallParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_40);
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
    // $ANTLR end "ruleUnqualifiedExecution"


    // $ANTLR start "entryRuleSuperExecution"
    // InternalVilBuildLanguage.g:3806:1: entryRuleSuperExecution returns [EObject current=null] : iv_ruleSuperExecution= ruleSuperExecution EOF ;
    public final EObject entryRuleSuperExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperExecution = null;


        try {
            // InternalVilBuildLanguage.g:3807:2: (iv_ruleSuperExecution= ruleSuperExecution EOF )
            // InternalVilBuildLanguage.g:3808:2: iv_ruleSuperExecution= ruleSuperExecution EOF
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
    // InternalVilBuildLanguage.g:3815:1: ruleSuperExecution returns [EObject current=null] : (otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )* ) ;
    public final EObject ruleSuperExecution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_call_2_0 = null;

        EObject lv_calls_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:3818:28: ( (otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )* ) )
            // InternalVilBuildLanguage.g:3819:1: (otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )* )
            {
            // InternalVilBuildLanguage.g:3819:1: (otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )* )
            // InternalVilBuildLanguage.g:3819:3: otherlv_0= 'super' otherlv_1= '.' ( (lv_call_2_0= ruleCall ) ) ( (lv_calls_3_0= ruleSubCall ) )*
            {
            otherlv_0=(Token)match(input,59,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSuperExecutionAccess().getSuperKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSuperExecutionAccess().getFullStopKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:3827:1: ( (lv_call_2_0= ruleCall ) )
            // InternalVilBuildLanguage.g:3828:1: (lv_call_2_0= ruleCall )
            {
            // InternalVilBuildLanguage.g:3828:1: (lv_call_2_0= ruleCall )
            // InternalVilBuildLanguage.g:3829:3: lv_call_2_0= ruleCall
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSuperExecutionAccess().getCallCallParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_40);
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

            // InternalVilBuildLanguage.g:3845:2: ( (lv_calls_3_0= ruleSubCall ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==27||(LA63_0>=61 && LA63_0<=62)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:3846:1: (lv_calls_3_0= ruleSubCall )
            	    {
            	    // InternalVilBuildLanguage.g:3846:1: (lv_calls_3_0= ruleSubCall )
            	    // InternalVilBuildLanguage.g:3847:3: lv_calls_3_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSuperExecutionAccess().getCallsSubCallParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop63;
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
    // InternalVilBuildLanguage.g:3871:1: entryRuleConstructorExecution returns [EObject current=null] : iv_ruleConstructorExecution= ruleConstructorExecution EOF ;
    public final EObject entryRuleConstructorExecution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstructorExecution = null;


        try {
            // InternalVilBuildLanguage.g:3872:2: (iv_ruleConstructorExecution= ruleConstructorExecution EOF )
            // InternalVilBuildLanguage.g:3873:2: iv_ruleConstructorExecution= ruleConstructorExecution EOF
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
    // InternalVilBuildLanguage.g:3880:1: ruleConstructorExecution returns [EObject current=null] : (otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )* ) ;
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
            // InternalVilBuildLanguage.g:3883:28: ( (otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )* ) )
            // InternalVilBuildLanguage.g:3884:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )* )
            {
            // InternalVilBuildLanguage.g:3884:1: (otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )* )
            // InternalVilBuildLanguage.g:3884:3: otherlv_0= 'new' ( (lv_type_1_0= ruleType ) ) otherlv_2= '(' ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ( (lv_calls_5_0= ruleSubCall ) )*
            {
            otherlv_0=(Token)match(input,60,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getConstructorExecutionAccess().getNewKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:3888:1: ( (lv_type_1_0= ruleType ) )
            // InternalVilBuildLanguage.g:3889:1: (lv_type_1_0= ruleType )
            {
            // InternalVilBuildLanguage.g:3889:1: (lv_type_1_0= ruleType )
            // InternalVilBuildLanguage.g:3890:3: lv_type_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getConstructorExecutionAccess().getTypeTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,16,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getConstructorExecutionAccess().getLeftParenthesisKeyword_2());
                  
            }
            // InternalVilBuildLanguage.g:3910:1: ( (lv_param_3_0= ruleArgumentList ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( ((LA64_0>=RULE_STRING && LA64_0<=RULE_EXPONENT)||LA64_0==16||LA64_0==18||(LA64_0>=28 && LA64_0<=29)||LA64_0==34||LA64_0==37||LA64_0==41||LA64_0==54||(LA64_0>=57 && LA64_0<=60)||(LA64_0>=66 && LA64_0<=68)) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalVilBuildLanguage.g:3911:1: (lv_param_3_0= ruleArgumentList )
                    {
                    // InternalVilBuildLanguage.g:3911:1: (lv_param_3_0= ruleArgumentList )
                    // InternalVilBuildLanguage.g:3912:3: lv_param_3_0= ruleArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConstructorExecutionAccess().getParamArgumentListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,17,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getConstructorExecutionAccess().getRightParenthesisKeyword_4());
                  
            }
            // InternalVilBuildLanguage.g:3932:1: ( (lv_calls_5_0= ruleSubCall ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==27||(LA65_0>=61 && LA65_0<=62)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:3933:1: (lv_calls_5_0= ruleSubCall )
            	    {
            	    // InternalVilBuildLanguage.g:3933:1: (lv_calls_5_0= ruleSubCall )
            	    // InternalVilBuildLanguage.g:3934:3: lv_calls_5_0= ruleSubCall
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConstructorExecutionAccess().getCallsSubCallParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_40);
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
            	    break loop65;
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
    // InternalVilBuildLanguage.g:3958:1: entryRuleSubCall returns [EObject current=null] : iv_ruleSubCall= ruleSubCall EOF ;
    public final EObject entryRuleSubCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubCall = null;


        try {
            // InternalVilBuildLanguage.g:3959:2: (iv_ruleSubCall= ruleSubCall EOF )
            // InternalVilBuildLanguage.g:3960:2: iv_ruleSubCall= ruleSubCall EOF
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
    // InternalVilBuildLanguage.g:3967:1: ruleSubCall returns [EObject current=null] : ( ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) ) | (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' ) ) ;
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
            // InternalVilBuildLanguage.g:3970:28: ( ( ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) ) | (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' ) ) )
            // InternalVilBuildLanguage.g:3971:1: ( ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) ) | (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            {
            // InternalVilBuildLanguage.g:3971:1: ( ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) ) | (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==27||LA67_0==61) ) {
                alt67=1;
            }
            else if ( (LA67_0==62) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalVilBuildLanguage.g:3971:2: ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) )
                    {
                    // InternalVilBuildLanguage.g:3971:2: ( ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) ) )
                    // InternalVilBuildLanguage.g:3971:3: ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) ) ( (lv_call_1_0= ruleCall ) )
                    {
                    // InternalVilBuildLanguage.g:3971:3: ( ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) ) )
                    // InternalVilBuildLanguage.g:3972:1: ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) )
                    {
                    // InternalVilBuildLanguage.g:3972:1: ( (lv_type_0_1= '.' | lv_type_0_2= '->' ) )
                    // InternalVilBuildLanguage.g:3973:1: (lv_type_0_1= '.' | lv_type_0_2= '->' )
                    {
                    // InternalVilBuildLanguage.g:3973:1: (lv_type_0_1= '.' | lv_type_0_2= '->' )
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==27) ) {
                        alt66=1;
                    }
                    else if ( (LA66_0==61) ) {
                        alt66=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 66, 0, input);

                        throw nvae;
                    }
                    switch (alt66) {
                        case 1 :
                            // InternalVilBuildLanguage.g:3974:3: lv_type_0_1= '.'
                            {
                            lv_type_0_1=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
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
                            // InternalVilBuildLanguage.g:3986:8: lv_type_0_2= '->'
                            {
                            lv_type_0_2=(Token)match(input,61,FOLLOW_10); if (state.failed) return current;
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

                    // InternalVilBuildLanguage.g:4001:2: ( (lv_call_1_0= ruleCall ) )
                    // InternalVilBuildLanguage.g:4002:1: (lv_call_1_0= ruleCall )
                    {
                    // InternalVilBuildLanguage.g:4002:1: (lv_call_1_0= ruleCall )
                    // InternalVilBuildLanguage.g:4003:3: lv_call_1_0= ruleCall
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
                    // InternalVilBuildLanguage.g:4020:6: (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' )
                    {
                    // InternalVilBuildLanguage.g:4020:6: (otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']' )
                    // InternalVilBuildLanguage.g:4020:8: otherlv_2= '[' ( (lv_arrayEx_3_0= ruleExpression ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,62,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getSubCallAccess().getLeftSquareBracketKeyword_1_0());
                          
                    }
                    // InternalVilBuildLanguage.g:4024:1: ( (lv_arrayEx_3_0= ruleExpression ) )
                    // InternalVilBuildLanguage.g:4025:1: (lv_arrayEx_3_0= ruleExpression )
                    {
                    // InternalVilBuildLanguage.g:4025:1: (lv_arrayEx_3_0= ruleExpression )
                    // InternalVilBuildLanguage.g:4026:3: lv_arrayEx_3_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSubCallAccess().getArrayExExpressionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_50);
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

                    otherlv_4=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:4054:1: entryRuleDeclarator returns [EObject current=null] : iv_ruleDeclarator= ruleDeclarator EOF ;
    public final EObject entryRuleDeclarator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarator = null;


        try {
            // InternalVilBuildLanguage.g:4055:2: (iv_ruleDeclarator= ruleDeclarator EOF )
            // InternalVilBuildLanguage.g:4056:2: iv_ruleDeclarator= ruleDeclarator EOF
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
    // InternalVilBuildLanguage.g:4063:1: ruleDeclarator returns [EObject current=null] : ( ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|' ) ;
    public final EObject ruleDeclarator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_decl_0_0 = null;

        EObject lv_decl_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4066:28: ( ( ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|' ) )
            // InternalVilBuildLanguage.g:4067:1: ( ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|' )
            {
            // InternalVilBuildLanguage.g:4067:1: ( ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|' )
            // InternalVilBuildLanguage.g:4067:2: ( (lv_decl_0_0= ruleDeclaration ) ) (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )* otherlv_3= '|'
            {
            // InternalVilBuildLanguage.g:4067:2: ( (lv_decl_0_0= ruleDeclaration ) )
            // InternalVilBuildLanguage.g:4068:1: (lv_decl_0_0= ruleDeclaration )
            {
            // InternalVilBuildLanguage.g:4068:1: (lv_decl_0_0= ruleDeclaration )
            // InternalVilBuildLanguage.g:4069:3: lv_decl_0_0= ruleDeclaration
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDeclDeclarationParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_51);
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

            // InternalVilBuildLanguage.g:4085:2: (otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==14) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:4085:4: otherlv_1= ';' ( (lv_decl_2_0= ruleDeclaration ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getDeclaratorAccess().getSemicolonKeyword_1_0());
            	          
            	    }
            	    // InternalVilBuildLanguage.g:4089:1: ( (lv_decl_2_0= ruleDeclaration ) )
            	    // InternalVilBuildLanguage.g:4090:1: (lv_decl_2_0= ruleDeclaration )
            	    {
            	    // InternalVilBuildLanguage.g:4090:1: (lv_decl_2_0= ruleDeclaration )
            	    // InternalVilBuildLanguage.g:4091:3: lv_decl_2_0= ruleDeclaration
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclaratorAccess().getDeclDeclarationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_51);
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
            	    break loop68;
                }
            } while (true);

            otherlv_3=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:4119:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalVilBuildLanguage.g:4120:2: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalVilBuildLanguage.g:4121:2: iv_ruleDeclaration= ruleDeclaration EOF
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
    // InternalVilBuildLanguage.g:4128:1: ruleDeclaration returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )* ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_type_0_0 = null;

        EObject lv_units_1_0 = null;

        EObject lv_units_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4131:28: ( ( ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )* ) )
            // InternalVilBuildLanguage.g:4132:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )* )
            {
            // InternalVilBuildLanguage.g:4132:1: ( ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )* )
            // InternalVilBuildLanguage.g:4132:2: ( (lv_type_0_0= ruleType ) )? ( (lv_units_1_0= ruleDeclarationUnit ) ) (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )*
            {
            // InternalVilBuildLanguage.g:4132:2: ( (lv_type_0_0= ruleType ) )?
            int alt69=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA69_1 = input.LA(2);

                    if ( (LA69_1==RULE_VERSION||(LA69_1>=RULE_ID && LA69_1<=RULE_EXPONENT)||LA69_1==41||LA69_1==65) ) {
                        alt69=1;
                    }
                    }
                    break;
                case RULE_VERSION:
                    {
                    int LA69_2 = input.LA(2);

                    if ( (LA69_2==RULE_VERSION||(LA69_2>=RULE_ID && LA69_2<=RULE_EXPONENT)||LA69_2==41||LA69_2==65) ) {
                        alt69=1;
                    }
                    }
                    break;
                case RULE_EXPONENT:
                    {
                    int LA69_3 = input.LA(2);

                    if ( (LA69_3==RULE_VERSION||(LA69_3>=RULE_ID && LA69_3<=RULE_EXPONENT)||LA69_3==41||LA69_3==65) ) {
                        alt69=1;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA69_4 = input.LA(2);

                    if ( (LA69_4==RULE_VERSION||(LA69_4>=RULE_ID && LA69_4<=RULE_EXPONENT)||LA69_4==41||LA69_4==65) ) {
                        alt69=1;
                    }
                    }
                    break;
                case 69:
                case 70:
                case 71:
                case 72:
                    {
                    alt69=1;
                    }
                    break;
            }

            switch (alt69) {
                case 1 :
                    // InternalVilBuildLanguage.g:4133:1: (lv_type_0_0= ruleType )
                    {
                    // InternalVilBuildLanguage.g:4133:1: (lv_type_0_0= ruleType )
                    // InternalVilBuildLanguage.g:4134:3: lv_type_0_0= ruleType
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDeclarationAccess().getTypeTypeParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_34);
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

            // InternalVilBuildLanguage.g:4150:3: ( (lv_units_1_0= ruleDeclarationUnit ) )
            // InternalVilBuildLanguage.g:4151:1: (lv_units_1_0= ruleDeclarationUnit )
            {
            // InternalVilBuildLanguage.g:4151:1: (lv_units_1_0= ruleDeclarationUnit )
            // InternalVilBuildLanguage.g:4152:3: lv_units_1_0= ruleDeclarationUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationAccess().getUnitsDeclarationUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
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

            // InternalVilBuildLanguage.g:4168:2: (otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) ) )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==25) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:4168:4: otherlv_2= ',' ( (lv_units_3_0= ruleDeclarationUnit ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getDeclarationAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalVilBuildLanguage.g:4172:1: ( (lv_units_3_0= ruleDeclarationUnit ) )
            	    // InternalVilBuildLanguage.g:4173:1: (lv_units_3_0= ruleDeclarationUnit )
            	    {
            	    // InternalVilBuildLanguage.g:4173:1: (lv_units_3_0= ruleDeclarationUnit )
            	    // InternalVilBuildLanguage.g:4174:3: lv_units_3_0= ruleDeclarationUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDeclarationAccess().getUnitsDeclarationUnitParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop70;
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
    // InternalVilBuildLanguage.g:4198:1: entryRuleDeclarationUnit returns [EObject current=null] : iv_ruleDeclarationUnit= ruleDeclarationUnit EOF ;
    public final EObject entryRuleDeclarationUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclarationUnit = null;


        try {
            // InternalVilBuildLanguage.g:4199:2: (iv_ruleDeclarationUnit= ruleDeclarationUnit EOF )
            // InternalVilBuildLanguage.g:4200:2: iv_ruleDeclarationUnit= ruleDeclarationUnit EOF
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
    // InternalVilBuildLanguage.g:4207:1: ruleDeclarationUnit returns [EObject current=null] : ( ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )? ) ;
    public final EObject ruleDeclarationUnit() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;

        EObject lv_deflt_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4210:28: ( ( ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )? ) )
            // InternalVilBuildLanguage.g:4211:1: ( ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )? )
            {
            // InternalVilBuildLanguage.g:4211:1: ( ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )? )
            // InternalVilBuildLanguage.g:4211:2: ( (lv_id_0_0= ruleIdentifier ) ) (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )?
            {
            // InternalVilBuildLanguage.g:4211:2: ( (lv_id_0_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:4212:1: (lv_id_0_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:4212:1: (lv_id_0_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:4213:3: lv_id_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDeclarationUnitAccess().getIdIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_52);
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

            // InternalVilBuildLanguage.g:4229:2: (otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==23) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalVilBuildLanguage.g:4229:4: otherlv_1= '=' ( (lv_deflt_2_0= ruleExpression ) )
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getDeclarationUnitAccess().getEqualsSignKeyword_1_0());
                          
                    }
                    // InternalVilBuildLanguage.g:4233:1: ( (lv_deflt_2_0= ruleExpression ) )
                    // InternalVilBuildLanguage.g:4234:1: (lv_deflt_2_0= ruleExpression )
                    {
                    // InternalVilBuildLanguage.g:4234:1: (lv_deflt_2_0= ruleExpression )
                    // InternalVilBuildLanguage.g:4235:3: lv_deflt_2_0= ruleExpression
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
    // InternalVilBuildLanguage.g:4259:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalVilBuildLanguage.g:4260:2: (iv_ruleCall= ruleCall EOF )
            // InternalVilBuildLanguage.g:4261:2: iv_ruleCall= ruleCall EOF
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
    // InternalVilBuildLanguage.g:4268:1: ruleCall returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_name_0_0 = null;

        EObject lv_decl_2_0 = null;

        EObject lv_param_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4271:28: ( ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' ) )
            // InternalVilBuildLanguage.g:4272:1: ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' )
            {
            // InternalVilBuildLanguage.g:4272:1: ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')' )
            // InternalVilBuildLanguage.g:4272:2: ( (lv_name_0_0= ruleQualifiedPrefix ) ) otherlv_1= '(' ( (lv_decl_2_0= ruleDeclarator ) )? ( (lv_param_3_0= ruleArgumentList ) )? otherlv_4= ')'
            {
            // InternalVilBuildLanguage.g:4272:2: ( (lv_name_0_0= ruleQualifiedPrefix ) )
            // InternalVilBuildLanguage.g:4273:1: (lv_name_0_0= ruleQualifiedPrefix )
            {
            // InternalVilBuildLanguage.g:4273:1: (lv_name_0_0= ruleQualifiedPrefix )
            // InternalVilBuildLanguage.g:4274:3: lv_name_0_0= ruleQualifiedPrefix
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCallAccess().getNameQualifiedPrefixParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_11);
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

            otherlv_1=(Token)match(input,16,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getLeftParenthesisKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:4294:1: ( (lv_decl_2_0= ruleDeclarator ) )?
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // InternalVilBuildLanguage.g:4295:1: (lv_decl_2_0= ruleDeclarator )
                    {
                    // InternalVilBuildLanguage.g:4295:1: (lv_decl_2_0= ruleDeclarator )
                    // InternalVilBuildLanguage.g:4296:3: lv_decl_2_0= ruleDeclarator
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getDeclDeclaratorParserRuleCall_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_32);
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

            // InternalVilBuildLanguage.g:4312:3: ( (lv_param_3_0= ruleArgumentList ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( ((LA73_0>=RULE_STRING && LA73_0<=RULE_EXPONENT)||LA73_0==16||LA73_0==18||(LA73_0>=28 && LA73_0<=29)||LA73_0==34||LA73_0==37||LA73_0==41||LA73_0==54||(LA73_0>=57 && LA73_0<=60)||(LA73_0>=66 && LA73_0<=68)) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalVilBuildLanguage.g:4313:1: (lv_param_3_0= ruleArgumentList )
                    {
                    // InternalVilBuildLanguage.g:4313:1: (lv_param_3_0= ruleArgumentList )
                    // InternalVilBuildLanguage.g:4314:3: lv_param_3_0= ruleArgumentList
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCallAccess().getParamArgumentListParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_13);
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

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:4342:1: entryRuleArgumentList returns [EObject current=null] : iv_ruleArgumentList= ruleArgumentList EOF ;
    public final EObject entryRuleArgumentList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentList = null;


        try {
            // InternalVilBuildLanguage.g:4343:2: (iv_ruleArgumentList= ruleArgumentList EOF )
            // InternalVilBuildLanguage.g:4344:2: iv_ruleArgumentList= ruleArgumentList EOF
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
    // InternalVilBuildLanguage.g:4351:1: ruleArgumentList returns [EObject current=null] : ( ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )* ) ;
    public final EObject ruleArgumentList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_param_0_0 = null;

        EObject lv_param_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4354:28: ( ( ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )* ) )
            // InternalVilBuildLanguage.g:4355:1: ( ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )* )
            {
            // InternalVilBuildLanguage.g:4355:1: ( ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )* )
            // InternalVilBuildLanguage.g:4355:2: ( (lv_param_0_0= ruleNamedArgument ) ) (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )*
            {
            // InternalVilBuildLanguage.g:4355:2: ( (lv_param_0_0= ruleNamedArgument ) )
            // InternalVilBuildLanguage.g:4356:1: (lv_param_0_0= ruleNamedArgument )
            {
            // InternalVilBuildLanguage.g:4356:1: (lv_param_0_0= ruleNamedArgument )
            // InternalVilBuildLanguage.g:4357:3: lv_param_0_0= ruleNamedArgument
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentListAccess().getParamNamedArgumentParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_26);
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

            // InternalVilBuildLanguage.g:4373:2: (otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==25) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:4373:4: otherlv_1= ',' ( (lv_param_2_0= ruleNamedArgument ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getArgumentListAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // InternalVilBuildLanguage.g:4377:1: ( (lv_param_2_0= ruleNamedArgument ) )
            	    // InternalVilBuildLanguage.g:4378:1: (lv_param_2_0= ruleNamedArgument )
            	    {
            	    // InternalVilBuildLanguage.g:4378:1: (lv_param_2_0= ruleNamedArgument )
            	    // InternalVilBuildLanguage.g:4379:3: lv_param_2_0= ruleNamedArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getArgumentListAccess().getParamNamedArgumentParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_26);
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
            	    break loop74;
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
    // InternalVilBuildLanguage.g:4403:1: entryRuleNamedArgument returns [EObject current=null] : iv_ruleNamedArgument= ruleNamedArgument EOF ;
    public final EObject entryRuleNamedArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedArgument = null;


        try {
            // InternalVilBuildLanguage.g:4404:2: (iv_ruleNamedArgument= ruleNamedArgument EOF )
            // InternalVilBuildLanguage.g:4405:2: iv_ruleNamedArgument= ruleNamedArgument EOF
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
    // InternalVilBuildLanguage.g:4412:1: ruleNamedArgument returns [EObject current=null] : ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) ) ) ;
    public final EObject ruleNamedArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_ex_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4415:28: ( ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) ) ) )
            // InternalVilBuildLanguage.g:4416:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) ) )
            {
            // InternalVilBuildLanguage.g:4416:1: ( ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) ) )
            // InternalVilBuildLanguage.g:4416:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )? ( (lv_ex_2_0= ruleExpression ) )
            {
            // InternalVilBuildLanguage.g:4416:2: ( ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '=' )?
            int alt75=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA75_1 = input.LA(2);

                    if ( (LA75_1==23) ) {
                        alt75=1;
                    }
                    }
                    break;
                case RULE_VERSION:
                    {
                    int LA75_2 = input.LA(2);

                    if ( (LA75_2==23) ) {
                        alt75=1;
                    }
                    }
                    break;
                case RULE_EXPONENT:
                    {
                    int LA75_3 = input.LA(2);

                    if ( (LA75_3==23) ) {
                        alt75=1;
                    }
                    }
                    break;
                case 41:
                    {
                    int LA75_4 = input.LA(2);

                    if ( (LA75_4==23) ) {
                        alt75=1;
                    }
                    }
                    break;
            }

            switch (alt75) {
                case 1 :
                    // InternalVilBuildLanguage.g:4416:3: ( (lv_name_0_0= ruleIdentifier ) ) otherlv_1= '='
                    {
                    // InternalVilBuildLanguage.g:4416:3: ( (lv_name_0_0= ruleIdentifier ) )
                    // InternalVilBuildLanguage.g:4417:1: (lv_name_0_0= ruleIdentifier )
                    {
                    // InternalVilBuildLanguage.g:4417:1: (lv_name_0_0= ruleIdentifier )
                    // InternalVilBuildLanguage.g:4418:3: lv_name_0_0= ruleIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNamedArgumentAccess().getNameIdentifierParserRuleCall_0_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_22);
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

                    otherlv_1=(Token)match(input,23,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNamedArgumentAccess().getEqualsSignKeyword_0_1());
                          
                    }

                    }
                    break;

            }

            // InternalVilBuildLanguage.g:4438:3: ( (lv_ex_2_0= ruleExpression ) )
            // InternalVilBuildLanguage.g:4439:1: (lv_ex_2_0= ruleExpression )
            {
            // InternalVilBuildLanguage.g:4439:1: (lv_ex_2_0= ruleExpression )
            // InternalVilBuildLanguage.g:4440:3: lv_ex_2_0= ruleExpression
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
    // InternalVilBuildLanguage.g:4464:1: entryRuleQualifiedPrefix returns [EObject current=null] : iv_ruleQualifiedPrefix= ruleQualifiedPrefix EOF ;
    public final EObject entryRuleQualifiedPrefix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPrefix = null;


        try {
            // InternalVilBuildLanguage.g:4465:2: (iv_ruleQualifiedPrefix= ruleQualifiedPrefix EOF )
            // InternalVilBuildLanguage.g:4466:2: iv_ruleQualifiedPrefix= ruleQualifiedPrefix EOF
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
    // InternalVilBuildLanguage.g:4473:1: ruleQualifiedPrefix returns [EObject current=null] : ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) ;
    public final EObject ruleQualifiedPrefix() throws RecognitionException {
        EObject current = null;

        Token lv_qname_1_0=null;
        AntlrDatatypeRuleToken lv_qname_0_0 = null;

        AntlrDatatypeRuleToken lv_qname_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4476:28: ( ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) )
            // InternalVilBuildLanguage.g:4477:1: ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            {
            // InternalVilBuildLanguage.g:4477:1: ( ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            // InternalVilBuildLanguage.g:4477:2: ( (lv_qname_0_0= ruleIdentifier ) ) ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            {
            // InternalVilBuildLanguage.g:4477:2: ( (lv_qname_0_0= ruleIdentifier ) )
            // InternalVilBuildLanguage.g:4478:1: (lv_qname_0_0= ruleIdentifier )
            {
            // InternalVilBuildLanguage.g:4478:1: (lv_qname_0_0= ruleIdentifier )
            // InternalVilBuildLanguage.g:4479:3: lv_qname_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualifiedPrefixAccess().getQnameIdentifierParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_54);
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

            // InternalVilBuildLanguage.g:4495:2: ( ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==65) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:4495:3: ( (lv_qname_1_0= '::' ) ) ( (lv_qname_2_0= ruleIdentifier ) )
            	    {
            	    // InternalVilBuildLanguage.g:4495:3: ( (lv_qname_1_0= '::' ) )
            	    // InternalVilBuildLanguage.g:4496:1: (lv_qname_1_0= '::' )
            	    {
            	    // InternalVilBuildLanguage.g:4496:1: (lv_qname_1_0= '::' )
            	    // InternalVilBuildLanguage.g:4497:3: lv_qname_1_0= '::'
            	    {
            	    lv_qname_1_0=(Token)match(input,65,FOLLOW_10); if (state.failed) return current;
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

            	    // InternalVilBuildLanguage.g:4510:2: ( (lv_qname_2_0= ruleIdentifier ) )
            	    // InternalVilBuildLanguage.g:4511:1: (lv_qname_2_0= ruleIdentifier )
            	    {
            	    // InternalVilBuildLanguage.g:4511:1: (lv_qname_2_0= ruleIdentifier )
            	    // InternalVilBuildLanguage.g:4512:3: lv_qname_2_0= ruleIdentifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedPrefixAccess().getQnameIdentifierParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_54);
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
            	    break loop76;
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
    // InternalVilBuildLanguage.g:4536:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // InternalVilBuildLanguage.g:4537:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalVilBuildLanguage.g:4538:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalVilBuildLanguage.g:4545:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token lv_qname_1_0=null;
        EObject lv_prefix_0_0 = null;

        AntlrDatatypeRuleToken lv_qname_2_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4548:28: ( ( ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* ) )
            // InternalVilBuildLanguage.g:4549:1: ( ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            {
            // InternalVilBuildLanguage.g:4549:1: ( ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )* )
            // InternalVilBuildLanguage.g:4549:2: ( (lv_prefix_0_0= ruleQualifiedPrefix ) ) ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            {
            // InternalVilBuildLanguage.g:4549:2: ( (lv_prefix_0_0= ruleQualifiedPrefix ) )
            // InternalVilBuildLanguage.g:4550:1: (lv_prefix_0_0= ruleQualifiedPrefix )
            {
            // InternalVilBuildLanguage.g:4550:1: (lv_prefix_0_0= ruleQualifiedPrefix )
            // InternalVilBuildLanguage.g:4551:3: lv_prefix_0_0= ruleQualifiedPrefix
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQualifiedNameAccess().getPrefixQualifiedPrefixParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_55);
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

            // InternalVilBuildLanguage.g:4567:2: ( ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) ) )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==27) ) {
                    switch ( input.LA(2) ) {
                    case RULE_ID:
                        {
                        int LA77_3 = input.LA(3);

                        if ( (LA77_3==EOF||(LA77_3>=14 && LA77_3<=15)||(LA77_3>=17 && LA77_3<=19)||(LA77_3>=24 && LA77_3<=25)||LA77_3==27||LA77_3==40||(LA77_3>=43 && LA77_3<=56)||(LA77_3>=61 && LA77_3<=64)) ) {
                            alt77=1;
                        }


                        }
                        break;
                    case RULE_VERSION:
                        {
                        int LA77_4 = input.LA(3);

                        if ( (LA77_4==EOF||(LA77_4>=14 && LA77_4<=15)||(LA77_4>=17 && LA77_4<=19)||(LA77_4>=24 && LA77_4<=25)||LA77_4==27||LA77_4==40||(LA77_4>=43 && LA77_4<=56)||(LA77_4>=61 && LA77_4<=64)) ) {
                            alt77=1;
                        }


                        }
                        break;
                    case RULE_EXPONENT:
                        {
                        int LA77_5 = input.LA(3);

                        if ( (LA77_5==EOF||(LA77_5>=14 && LA77_5<=15)||(LA77_5>=17 && LA77_5<=19)||(LA77_5>=24 && LA77_5<=25)||LA77_5==27||LA77_5==40||(LA77_5>=43 && LA77_5<=56)||(LA77_5>=61 && LA77_5<=64)) ) {
                            alt77=1;
                        }


                        }
                        break;
                    case 41:
                        {
                        int LA77_6 = input.LA(3);

                        if ( (LA77_6==EOF||(LA77_6>=14 && LA77_6<=15)||(LA77_6>=17 && LA77_6<=19)||(LA77_6>=24 && LA77_6<=25)||LA77_6==27||LA77_6==40||(LA77_6>=43 && LA77_6<=56)||(LA77_6>=61 && LA77_6<=64)) ) {
                            alt77=1;
                        }


                        }
                        break;

                    }

                }


                switch (alt77) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:4567:3: ( (lv_qname_1_0= '.' ) ) ( (lv_qname_2_0= ruleIdentifier ) )
            	    {
            	    // InternalVilBuildLanguage.g:4567:3: ( (lv_qname_1_0= '.' ) )
            	    // InternalVilBuildLanguage.g:4568:1: (lv_qname_1_0= '.' )
            	    {
            	    // InternalVilBuildLanguage.g:4568:1: (lv_qname_1_0= '.' )
            	    // InternalVilBuildLanguage.g:4569:3: lv_qname_1_0= '.'
            	    {
            	    lv_qname_1_0=(Token)match(input,27,FOLLOW_10); if (state.failed) return current;
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

            	    // InternalVilBuildLanguage.g:4582:2: ( (lv_qname_2_0= ruleIdentifier ) )
            	    // InternalVilBuildLanguage.g:4583:1: (lv_qname_2_0= ruleIdentifier )
            	    {
            	    // InternalVilBuildLanguage.g:4583:1: (lv_qname_2_0= ruleIdentifier )
            	    // InternalVilBuildLanguage.g:4584:3: lv_qname_2_0= ruleIdentifier
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQualifiedNameAccess().getQnameIdentifierParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_55);
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
            	    break loop77;
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
    // InternalVilBuildLanguage.g:4608:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // InternalVilBuildLanguage.g:4609:2: (iv_ruleConstant= ruleConstant EOF )
            // InternalVilBuildLanguage.g:4610:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalVilBuildLanguage.g:4617:1: ruleConstant returns [EObject current=null] : ( ( (lv_nValue_0_0= ruleNumValue ) ) | ( (lv_sValue_1_0= RULE_STRING ) ) | ( (lv_qValue_2_0= ruleQualifiedName ) ) | ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) ) | ( (lv_null_4_0= 'null' ) ) | ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) ) ) ;
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
            // InternalVilBuildLanguage.g:4620:28: ( ( ( (lv_nValue_0_0= ruleNumValue ) ) | ( (lv_sValue_1_0= RULE_STRING ) ) | ( (lv_qValue_2_0= ruleQualifiedName ) ) | ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) ) | ( (lv_null_4_0= 'null' ) ) | ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) ) ) )
            // InternalVilBuildLanguage.g:4621:1: ( ( (lv_nValue_0_0= ruleNumValue ) ) | ( (lv_sValue_1_0= RULE_STRING ) ) | ( (lv_qValue_2_0= ruleQualifiedName ) ) | ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) ) | ( (lv_null_4_0= 'null' ) ) | ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) ) )
            {
            // InternalVilBuildLanguage.g:4621:1: ( ( (lv_nValue_0_0= ruleNumValue ) ) | ( (lv_sValue_1_0= RULE_STRING ) ) | ( (lv_qValue_2_0= ruleQualifiedName ) ) | ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) ) | ( (lv_null_4_0= 'null' ) ) | ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) ) )
            int alt79=6;
            switch ( input.LA(1) ) {
            case RULE_NUMBER:
                {
                alt79=1;
                }
                break;
            case RULE_STRING:
                {
                alt79=2;
                }
                break;
            case RULE_ID:
            case RULE_EXPONENT:
            case 41:
                {
                alt79=3;
                }
                break;
            case RULE_VERSION:
                {
                int LA79_4 = input.LA(2);

                if ( (synpred96_InternalVilBuildLanguage()) ) {
                    alt79=3;
                }
                else if ( (synpred100_InternalVilBuildLanguage()) ) {
                    alt79=6;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 4, input);

                    throw nvae;
                }
                }
                break;
            case 66:
            case 67:
                {
                alt79=4;
                }
                break;
            case 68:
                {
                alt79=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // InternalVilBuildLanguage.g:4621:2: ( (lv_nValue_0_0= ruleNumValue ) )
                    {
                    // InternalVilBuildLanguage.g:4621:2: ( (lv_nValue_0_0= ruleNumValue ) )
                    // InternalVilBuildLanguage.g:4622:1: (lv_nValue_0_0= ruleNumValue )
                    {
                    // InternalVilBuildLanguage.g:4622:1: (lv_nValue_0_0= ruleNumValue )
                    // InternalVilBuildLanguage.g:4623:3: lv_nValue_0_0= ruleNumValue
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
                    // InternalVilBuildLanguage.g:4640:6: ( (lv_sValue_1_0= RULE_STRING ) )
                    {
                    // InternalVilBuildLanguage.g:4640:6: ( (lv_sValue_1_0= RULE_STRING ) )
                    // InternalVilBuildLanguage.g:4641:1: (lv_sValue_1_0= RULE_STRING )
                    {
                    // InternalVilBuildLanguage.g:4641:1: (lv_sValue_1_0= RULE_STRING )
                    // InternalVilBuildLanguage.g:4642:3: lv_sValue_1_0= RULE_STRING
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
                    // InternalVilBuildLanguage.g:4659:6: ( (lv_qValue_2_0= ruleQualifiedName ) )
                    {
                    // InternalVilBuildLanguage.g:4659:6: ( (lv_qValue_2_0= ruleQualifiedName ) )
                    // InternalVilBuildLanguage.g:4660:1: (lv_qValue_2_0= ruleQualifiedName )
                    {
                    // InternalVilBuildLanguage.g:4660:1: (lv_qValue_2_0= ruleQualifiedName )
                    // InternalVilBuildLanguage.g:4661:3: lv_qValue_2_0= ruleQualifiedName
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
                    // InternalVilBuildLanguage.g:4678:6: ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) )
                    {
                    // InternalVilBuildLanguage.g:4678:6: ( ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) ) )
                    // InternalVilBuildLanguage.g:4679:1: ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) )
                    {
                    // InternalVilBuildLanguage.g:4679:1: ( (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' ) )
                    // InternalVilBuildLanguage.g:4680:1: (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' )
                    {
                    // InternalVilBuildLanguage.g:4680:1: (lv_bValue_3_1= 'true' | lv_bValue_3_2= 'false' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==66) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==67) ) {
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
                            // InternalVilBuildLanguage.g:4681:3: lv_bValue_3_1= 'true'
                            {
                            lv_bValue_3_1=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
                            // InternalVilBuildLanguage.g:4693:8: lv_bValue_3_2= 'false'
                            {
                            lv_bValue_3_2=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVilBuildLanguage.g:4709:6: ( (lv_null_4_0= 'null' ) )
                    {
                    // InternalVilBuildLanguage.g:4709:6: ( (lv_null_4_0= 'null' ) )
                    // InternalVilBuildLanguage.g:4710:1: (lv_null_4_0= 'null' )
                    {
                    // InternalVilBuildLanguage.g:4710:1: (lv_null_4_0= 'null' )
                    // InternalVilBuildLanguage.g:4711:3: lv_null_4_0= 'null'
                    {
                    lv_null_4_0=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
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
                    // InternalVilBuildLanguage.g:4725:6: ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) )
                    {
                    // InternalVilBuildLanguage.g:4725:6: ( ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION ) )
                    // InternalVilBuildLanguage.g:4725:7: ( ( RULE_VERSION ) )=> (lv_version_5_0= RULE_VERSION )
                    {
                    // InternalVilBuildLanguage.g:4731:1: (lv_version_5_0= RULE_VERSION )
                    // InternalVilBuildLanguage.g:4732:3: lv_version_5_0= RULE_VERSION
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
    // InternalVilBuildLanguage.g:4756:1: entryRuleNumValue returns [EObject current=null] : iv_ruleNumValue= ruleNumValue EOF ;
    public final EObject entryRuleNumValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumValue = null;


        try {
            // InternalVilBuildLanguage.g:4757:2: (iv_ruleNumValue= ruleNumValue EOF )
            // InternalVilBuildLanguage.g:4758:2: iv_ruleNumValue= ruleNumValue EOF
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
    // InternalVilBuildLanguage.g:4765:1: ruleNumValue returns [EObject current=null] : ( (lv_val_0_0= RULE_NUMBER ) ) ;
    public final EObject ruleNumValue() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4768:28: ( ( (lv_val_0_0= RULE_NUMBER ) ) )
            // InternalVilBuildLanguage.g:4769:1: ( (lv_val_0_0= RULE_NUMBER ) )
            {
            // InternalVilBuildLanguage.g:4769:1: ( (lv_val_0_0= RULE_NUMBER ) )
            // InternalVilBuildLanguage.g:4770:1: (lv_val_0_0= RULE_NUMBER )
            {
            // InternalVilBuildLanguage.g:4770:1: (lv_val_0_0= RULE_NUMBER )
            // InternalVilBuildLanguage.g:4771:3: lv_val_0_0= RULE_NUMBER
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
    // InternalVilBuildLanguage.g:4795:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;


        try {
            // InternalVilBuildLanguage.g:4796:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalVilBuildLanguage.g:4797:2: iv_ruleIdentifier= ruleIdentifier EOF
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
    // InternalVilBuildLanguage.g:4804:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | this_VERSION_1= RULE_VERSION | this_EXPONENT_2= RULE_EXPONENT | kw= 'version' ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_VERSION_1=null;
        Token this_EXPONENT_2=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:4807:28: ( (this_ID_0= RULE_ID | this_VERSION_1= RULE_VERSION | this_EXPONENT_2= RULE_EXPONENT | kw= 'version' ) )
            // InternalVilBuildLanguage.g:4808:1: (this_ID_0= RULE_ID | this_VERSION_1= RULE_VERSION | this_EXPONENT_2= RULE_EXPONENT | kw= 'version' )
            {
            // InternalVilBuildLanguage.g:4808:1: (this_ID_0= RULE_ID | this_VERSION_1= RULE_VERSION | this_EXPONENT_2= RULE_EXPONENT | kw= 'version' )
            int alt80=4;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt80=1;
                }
                break;
            case RULE_VERSION:
                {
                alt80=2;
                }
                break;
            case RULE_EXPONENT:
                {
                alt80=3;
                }
                break;
            case 41:
                {
                alt80=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalVilBuildLanguage.g:4808:6: this_ID_0= RULE_ID
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
                    // InternalVilBuildLanguage.g:4816:10: this_VERSION_1= RULE_VERSION
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
                    // InternalVilBuildLanguage.g:4824:10: this_EXPONENT_2= RULE_EXPONENT
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
                    // InternalVilBuildLanguage.g:4833:2: kw= 'version'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:4846:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalVilBuildLanguage.g:4847:2: (iv_ruleType= ruleType EOF )
            // InternalVilBuildLanguage.g:4848:2: iv_ruleType= ruleType EOF
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
    // InternalVilBuildLanguage.g:4855:1: ruleType returns [EObject current=null] : ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) | ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) ) | ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) ) | ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) ) | ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) ) ) ;
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
            // InternalVilBuildLanguage.g:4858:28: ( ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) | ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) ) | ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) ) | ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) ) | ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) ) ) )
            // InternalVilBuildLanguage.g:4859:1: ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) | ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) ) | ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) ) | ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) ) | ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) ) )
            {
            // InternalVilBuildLanguage.g:4859:1: ( ( (lv_name_0_0= ruleQualifiedPrefix ) ) | ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) ) | ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) ) | ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) ) | ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) ) )
            int alt82=5;
            switch ( input.LA(1) ) {
            case RULE_VERSION:
            case RULE_ID:
            case RULE_EXPONENT:
            case 41:
                {
                alt82=1;
                }
                break;
            case 69:
                {
                alt82=2;
                }
                break;
            case 70:
                {
                alt82=3;
                }
                break;
            case 71:
                {
                alt82=4;
                }
                break;
            case 72:
                {
                alt82=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalVilBuildLanguage.g:4859:2: ( (lv_name_0_0= ruleQualifiedPrefix ) )
                    {
                    // InternalVilBuildLanguage.g:4859:2: ( (lv_name_0_0= ruleQualifiedPrefix ) )
                    // InternalVilBuildLanguage.g:4860:1: (lv_name_0_0= ruleQualifiedPrefix )
                    {
                    // InternalVilBuildLanguage.g:4860:1: (lv_name_0_0= ruleQualifiedPrefix )
                    // InternalVilBuildLanguage.g:4861:3: lv_name_0_0= ruleQualifiedPrefix
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
                    // InternalVilBuildLanguage.g:4878:6: ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) )
                    {
                    // InternalVilBuildLanguage.g:4878:6: ( ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) ) )
                    // InternalVilBuildLanguage.g:4878:7: ( (lv_set_1_0= 'setOf' ) ) ( (lv_param_2_0= ruleTypeParameters ) )
                    {
                    // InternalVilBuildLanguage.g:4878:7: ( (lv_set_1_0= 'setOf' ) )
                    // InternalVilBuildLanguage.g:4879:1: (lv_set_1_0= 'setOf' )
                    {
                    // InternalVilBuildLanguage.g:4879:1: (lv_set_1_0= 'setOf' )
                    // InternalVilBuildLanguage.g:4880:3: lv_set_1_0= 'setOf'
                    {
                    lv_set_1_0=(Token)match(input,69,FOLLOW_11); if (state.failed) return current;
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

                    // InternalVilBuildLanguage.g:4893:2: ( (lv_param_2_0= ruleTypeParameters ) )
                    // InternalVilBuildLanguage.g:4894:1: (lv_param_2_0= ruleTypeParameters )
                    {
                    // InternalVilBuildLanguage.g:4894:1: (lv_param_2_0= ruleTypeParameters )
                    // InternalVilBuildLanguage.g:4895:3: lv_param_2_0= ruleTypeParameters
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
                    // InternalVilBuildLanguage.g:4912:6: ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) )
                    {
                    // InternalVilBuildLanguage.g:4912:6: ( ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) ) )
                    // InternalVilBuildLanguage.g:4912:7: ( (lv_seq_3_0= 'sequenceOf' ) ) ( (lv_param_4_0= ruleTypeParameters ) )
                    {
                    // InternalVilBuildLanguage.g:4912:7: ( (lv_seq_3_0= 'sequenceOf' ) )
                    // InternalVilBuildLanguage.g:4913:1: (lv_seq_3_0= 'sequenceOf' )
                    {
                    // InternalVilBuildLanguage.g:4913:1: (lv_seq_3_0= 'sequenceOf' )
                    // InternalVilBuildLanguage.g:4914:3: lv_seq_3_0= 'sequenceOf'
                    {
                    lv_seq_3_0=(Token)match(input,70,FOLLOW_11); if (state.failed) return current;
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

                    // InternalVilBuildLanguage.g:4927:2: ( (lv_param_4_0= ruleTypeParameters ) )
                    // InternalVilBuildLanguage.g:4928:1: (lv_param_4_0= ruleTypeParameters )
                    {
                    // InternalVilBuildLanguage.g:4928:1: (lv_param_4_0= ruleTypeParameters )
                    // InternalVilBuildLanguage.g:4929:3: lv_param_4_0= ruleTypeParameters
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
                    // InternalVilBuildLanguage.g:4946:6: ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) )
                    {
                    // InternalVilBuildLanguage.g:4946:6: ( ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) ) )
                    // InternalVilBuildLanguage.g:4946:7: ( (lv_map_5_0= 'mapOf' ) ) ( (lv_param_6_0= ruleTypeParameters ) )
                    {
                    // InternalVilBuildLanguage.g:4946:7: ( (lv_map_5_0= 'mapOf' ) )
                    // InternalVilBuildLanguage.g:4947:1: (lv_map_5_0= 'mapOf' )
                    {
                    // InternalVilBuildLanguage.g:4947:1: (lv_map_5_0= 'mapOf' )
                    // InternalVilBuildLanguage.g:4948:3: lv_map_5_0= 'mapOf'
                    {
                    lv_map_5_0=(Token)match(input,71,FOLLOW_11); if (state.failed) return current;
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

                    // InternalVilBuildLanguage.g:4961:2: ( (lv_param_6_0= ruleTypeParameters ) )
                    // InternalVilBuildLanguage.g:4962:1: (lv_param_6_0= ruleTypeParameters )
                    {
                    // InternalVilBuildLanguage.g:4962:1: (lv_param_6_0= ruleTypeParameters )
                    // InternalVilBuildLanguage.g:4963:3: lv_param_6_0= ruleTypeParameters
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
                    // InternalVilBuildLanguage.g:4980:6: ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) )
                    {
                    // InternalVilBuildLanguage.g:4980:6: ( ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) ) )
                    // InternalVilBuildLanguage.g:4980:7: ( (lv_call_7_0= 'callOf' ) ) ( (lv_return_8_0= ruleType ) )? ( (lv_param_9_0= ruleTypeParameters ) )
                    {
                    // InternalVilBuildLanguage.g:4980:7: ( (lv_call_7_0= 'callOf' ) )
                    // InternalVilBuildLanguage.g:4981:1: (lv_call_7_0= 'callOf' )
                    {
                    // InternalVilBuildLanguage.g:4981:1: (lv_call_7_0= 'callOf' )
                    // InternalVilBuildLanguage.g:4982:3: lv_call_7_0= 'callOf'
                    {
                    lv_call_7_0=(Token)match(input,72,FOLLOW_56); if (state.failed) return current;
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

                    // InternalVilBuildLanguage.g:4995:2: ( (lv_return_8_0= ruleType ) )?
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_VERSION||(LA81_0>=RULE_ID && LA81_0<=RULE_EXPONENT)||LA81_0==41||(LA81_0>=69 && LA81_0<=72)) ) {
                        alt81=1;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalVilBuildLanguage.g:4996:1: (lv_return_8_0= ruleType )
                            {
                            // InternalVilBuildLanguage.g:4996:1: (lv_return_8_0= ruleType )
                            // InternalVilBuildLanguage.g:4997:3: lv_return_8_0= ruleType
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getTypeAccess().getReturnTypeParserRuleCall_4_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_11);
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

                    // InternalVilBuildLanguage.g:5013:3: ( (lv_param_9_0= ruleTypeParameters ) )
                    // InternalVilBuildLanguage.g:5014:1: (lv_param_9_0= ruleTypeParameters )
                    {
                    // InternalVilBuildLanguage.g:5014:1: (lv_param_9_0= ruleTypeParameters )
                    // InternalVilBuildLanguage.g:5015:3: lv_param_9_0= ruleTypeParameters
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
    // InternalVilBuildLanguage.g:5039:1: entryRuleTypeParameters returns [EObject current=null] : iv_ruleTypeParameters= ruleTypeParameters EOF ;
    public final EObject entryRuleTypeParameters() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeParameters = null;


        try {
            // InternalVilBuildLanguage.g:5040:2: (iv_ruleTypeParameters= ruleTypeParameters EOF )
            // InternalVilBuildLanguage.g:5041:2: iv_ruleTypeParameters= ruleTypeParameters EOF
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
    // InternalVilBuildLanguage.g:5048:1: ruleTypeParameters returns [EObject current=null] : (otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')' ) ;
    public final EObject ruleTypeParameters() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_param_1_0 = null;

        EObject lv_param_3_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:5051:28: ( (otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')' ) )
            // InternalVilBuildLanguage.g:5052:1: (otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')' )
            {
            // InternalVilBuildLanguage.g:5052:1: (otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')' )
            // InternalVilBuildLanguage.g:5052:3: otherlv_0= '(' ( (lv_param_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTypeParametersAccess().getLeftParenthesisKeyword_0());
                  
            }
            // InternalVilBuildLanguage.g:5056:1: ( (lv_param_1_0= ruleType ) )
            // InternalVilBuildLanguage.g:5057:1: (lv_param_1_0= ruleType )
            {
            // InternalVilBuildLanguage.g:5057:1: (lv_param_1_0= ruleType )
            // InternalVilBuildLanguage.g:5058:3: lv_param_1_0= ruleType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTypeParametersAccess().getParamTypeParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_57);
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

            // InternalVilBuildLanguage.g:5074:2: (otherlv_2= ',' ( (lv_param_3_0= ruleType ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==25) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalVilBuildLanguage.g:5074:4: otherlv_2= ',' ( (lv_param_3_0= ruleType ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_34); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTypeParametersAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // InternalVilBuildLanguage.g:5078:1: ( (lv_param_3_0= ruleType ) )
            	    // InternalVilBuildLanguage.g:5079:1: (lv_param_3_0= ruleType )
            	    {
            	    // InternalVilBuildLanguage.g:5079:1: (lv_param_3_0= ruleType )
            	    // InternalVilBuildLanguage.g:5080:3: lv_param_3_0= ruleType
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTypeParametersAccess().getParamTypeParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_57);
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
            	    break loop83;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:5108:1: entryRuleContainerInitializer returns [EObject current=null] : iv_ruleContainerInitializer= ruleContainerInitializer EOF ;
    public final EObject entryRuleContainerInitializer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerInitializer = null;


        try {
            // InternalVilBuildLanguage.g:5109:2: (iv_ruleContainerInitializer= ruleContainerInitializer EOF )
            // InternalVilBuildLanguage.g:5110:2: iv_ruleContainerInitializer= ruleContainerInitializer EOF
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
    // InternalVilBuildLanguage.g:5117:1: ruleContainerInitializer returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleContainerInitializer() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_exprs_2_0 = null;

        EObject lv_exprs_4_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:5120:28: ( ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}' ) )
            // InternalVilBuildLanguage.g:5121:1: ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}' )
            {
            // InternalVilBuildLanguage.g:5121:1: ( () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}' )
            // InternalVilBuildLanguage.g:5121:2: () otherlv_1= '{' ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )? otherlv_5= '}'
            {
            // InternalVilBuildLanguage.g:5121:2: ()
            // InternalVilBuildLanguage.g:5122:2: 
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

            otherlv_1=(Token)match(input,18,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getContainerInitializerAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // InternalVilBuildLanguage.g:5134:1: ( ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )* )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( ((LA85_0>=RULE_STRING && LA85_0<=RULE_EXPONENT)||LA85_0==16||LA85_0==18||(LA85_0>=28 && LA85_0<=29)||LA85_0==34||LA85_0==37||LA85_0==41||LA85_0==54||(LA85_0>=57 && LA85_0<=60)||(LA85_0>=66 && LA85_0<=68)) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalVilBuildLanguage.g:5134:2: ( (lv_exprs_2_0= ruleContainerInitializerExpression ) ) (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )*
                    {
                    // InternalVilBuildLanguage.g:5134:2: ( (lv_exprs_2_0= ruleContainerInitializerExpression ) )
                    // InternalVilBuildLanguage.g:5135:1: (lv_exprs_2_0= ruleContainerInitializerExpression )
                    {
                    // InternalVilBuildLanguage.g:5135:1: (lv_exprs_2_0= ruleContainerInitializerExpression )
                    // InternalVilBuildLanguage.g:5136:3: lv_exprs_2_0= ruleContainerInitializerExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getContainerInitializerAccess().getExprsContainerInitializerExpressionParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_59);
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

                    // InternalVilBuildLanguage.g:5152:2: (otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) ) )*
                    loop84:
                    do {
                        int alt84=2;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==25) ) {
                            alt84=1;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalVilBuildLanguage.g:5152:4: otherlv_3= ',' ( (lv_exprs_4_0= ruleContainerInitializerExpression ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_30); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getContainerInitializerAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // InternalVilBuildLanguage.g:5156:1: ( (lv_exprs_4_0= ruleContainerInitializerExpression ) )
                    	    // InternalVilBuildLanguage.g:5157:1: (lv_exprs_4_0= ruleContainerInitializerExpression )
                    	    {
                    	    // InternalVilBuildLanguage.g:5157:1: (lv_exprs_4_0= ruleContainerInitializerExpression )
                    	    // InternalVilBuildLanguage.g:5158:3: lv_exprs_4_0= ruleContainerInitializerExpression
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getContainerInitializerAccess().getExprsContainerInitializerExpressionParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_59);
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
                    	    break loop84;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalVilBuildLanguage.g:5186:1: entryRuleContainerInitializerExpression returns [EObject current=null] : iv_ruleContainerInitializerExpression= ruleContainerInitializerExpression EOF ;
    public final EObject entryRuleContainerInitializerExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainerInitializerExpression = null;


        try {
            // InternalVilBuildLanguage.g:5187:2: (iv_ruleContainerInitializerExpression= ruleContainerInitializerExpression EOF )
            // InternalVilBuildLanguage.g:5188:2: iv_ruleContainerInitializerExpression= ruleContainerInitializerExpression EOF
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
    // InternalVilBuildLanguage.g:5195:1: ruleContainerInitializerExpression returns [EObject current=null] : ( ( (lv_logical_0_0= ruleLogicalExpression ) ) | ( (lv_container_1_0= ruleContainerInitializer ) ) ) ;
    public final EObject ruleContainerInitializerExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_logical_0_0 = null;

        EObject lv_container_1_0 = null;


         enterRule(); 
            
        try {
            // InternalVilBuildLanguage.g:5198:28: ( ( ( (lv_logical_0_0= ruleLogicalExpression ) ) | ( (lv_container_1_0= ruleContainerInitializer ) ) ) )
            // InternalVilBuildLanguage.g:5199:1: ( ( (lv_logical_0_0= ruleLogicalExpression ) ) | ( (lv_container_1_0= ruleContainerInitializer ) ) )
            {
            // InternalVilBuildLanguage.g:5199:1: ( ( (lv_logical_0_0= ruleLogicalExpression ) ) | ( (lv_container_1_0= ruleContainerInitializer ) ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( ((LA86_0>=RULE_STRING && LA86_0<=RULE_EXPONENT)||LA86_0==16||(LA86_0>=28 && LA86_0<=29)||LA86_0==34||LA86_0==37||LA86_0==41||LA86_0==54||(LA86_0>=57 && LA86_0<=60)||(LA86_0>=66 && LA86_0<=68)) ) {
                alt86=1;
            }
            else if ( (LA86_0==18) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalVilBuildLanguage.g:5199:2: ( (lv_logical_0_0= ruleLogicalExpression ) )
                    {
                    // InternalVilBuildLanguage.g:5199:2: ( (lv_logical_0_0= ruleLogicalExpression ) )
                    // InternalVilBuildLanguage.g:5200:1: (lv_logical_0_0= ruleLogicalExpression )
                    {
                    // InternalVilBuildLanguage.g:5200:1: (lv_logical_0_0= ruleLogicalExpression )
                    // InternalVilBuildLanguage.g:5201:3: lv_logical_0_0= ruleLogicalExpression
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
                    // InternalVilBuildLanguage.g:5218:6: ( (lv_container_1_0= ruleContainerInitializer ) )
                    {
                    // InternalVilBuildLanguage.g:5218:6: ( (lv_container_1_0= ruleContainerInitializer ) )
                    // InternalVilBuildLanguage.g:5219:1: (lv_container_1_0= ruleContainerInitializer )
                    {
                    // InternalVilBuildLanguage.g:5219:1: (lv_container_1_0= ruleContainerInitializer )
                    // InternalVilBuildLanguage.g:5220:3: lv_container_1_0= ruleContainerInitializer
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

    // $ANTLR start synpred7_InternalVilBuildLanguage
    public final void synpred7_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_version_8_0 = null;


        // InternalVilBuildLanguage.g:324:1: ( (lv_version_8_0= ruleVersionStmt ) )
        // InternalVilBuildLanguage.g:324:1: (lv_version_8_0= ruleVersionStmt )
        {
        // InternalVilBuildLanguage.g:324:1: (lv_version_8_0= ruleVersionStmt )
        // InternalVilBuildLanguage.g:325:3: lv_version_8_0= ruleVersionStmt
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLanguageUnitAccess().getVersionVersionStmtParserRuleCall_8_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_version_8_0=ruleVersionStmt();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred7_InternalVilBuildLanguage

    // $ANTLR start synpred10_InternalVilBuildLanguage
    public final void synpred10_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_elements_1_0 = null;


        // InternalVilBuildLanguage.g:509:3: ( ( (lv_elements_1_0= ruleVariableDeclaration ) ) )
        // InternalVilBuildLanguage.g:509:3: ( (lv_elements_1_0= ruleVariableDeclaration ) )
        {
        // InternalVilBuildLanguage.g:509:3: ( (lv_elements_1_0= ruleVariableDeclaration ) )
        // InternalVilBuildLanguage.g:510:1: (lv_elements_1_0= ruleVariableDeclaration )
        {
        // InternalVilBuildLanguage.g:510:1: (lv_elements_1_0= ruleVariableDeclaration )
        // InternalVilBuildLanguage.g:511:3: lv_elements_1_0= ruleVariableDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getScriptContentsAccess().getElementsVariableDeclarationParserRuleCall_1_0_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_elements_1_0=ruleVariableDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred10_InternalVilBuildLanguage

    // $ANTLR start synpred12_InternalVilBuildLanguage
    public final void synpred12_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_elements_3_0 = null;


        // InternalVilBuildLanguage.g:547:6: ( ( (lv_elements_3_0= ruleRuleDeclaration ) ) )
        // InternalVilBuildLanguage.g:547:6: ( (lv_elements_3_0= ruleRuleDeclaration ) )
        {
        // InternalVilBuildLanguage.g:547:6: ( (lv_elements_3_0= ruleRuleDeclaration ) )
        // InternalVilBuildLanguage.g:548:1: (lv_elements_3_0= ruleRuleDeclaration )
        {
        // InternalVilBuildLanguage.g:548:1: (lv_elements_3_0= ruleRuleDeclaration )
        // InternalVilBuildLanguage.g:549:3: lv_elements_3_0= ruleRuleDeclaration
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getScriptContentsAccess().getElementsRuleDeclarationParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_elements_3_0=ruleRuleDeclaration();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred12_InternalVilBuildLanguage

    // $ANTLR start synpred16_InternalVilBuildLanguage
    public final void synpred16_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_type_1_0 = null;

        EObject lv_modifier_2_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_paramList_5_0 = null;


        // InternalVilBuildLanguage.g:595:3: ( ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '=' )
        // InternalVilBuildLanguage.g:595:3: ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '='
        {
        // InternalVilBuildLanguage.g:595:3: ( (lv_type_1_0= ruleType ) )?
        int alt87=2;
        switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==RULE_VERSION||(LA87_1>=RULE_ID && LA87_1<=RULE_EXPONENT)||LA87_1==26||LA87_1==41||LA87_1==65) ) {
                    alt87=1;
                }
                }
                break;
            case RULE_VERSION:
                {
                int LA87_2 = input.LA(2);

                if ( (LA87_2==RULE_VERSION||(LA87_2>=RULE_ID && LA87_2<=RULE_EXPONENT)||LA87_2==26||LA87_2==41||LA87_2==65) ) {
                    alt87=1;
                }
                }
                break;
            case RULE_EXPONENT:
                {
                int LA87_3 = input.LA(2);

                if ( (LA87_3==RULE_VERSION||(LA87_3>=RULE_ID && LA87_3<=RULE_EXPONENT)||LA87_3==26||LA87_3==41||LA87_3==65) ) {
                    alt87=1;
                }
                }
                break;
            case 41:
                {
                int LA87_4 = input.LA(2);

                if ( (LA87_4==RULE_VERSION||(LA87_4>=RULE_ID && LA87_4<=RULE_EXPONENT)||LA87_4==26||LA87_4==41||LA87_4==65) ) {
                    alt87=1;
                }
                }
                break;
            case 69:
            case 70:
            case 71:
            case 72:
                {
                alt87=1;
                }
                break;
        }

        switch (alt87) {
            case 1 :
                // InternalVilBuildLanguage.g:596:1: (lv_type_1_0= ruleType )
                {
                // InternalVilBuildLanguage.g:596:1: (lv_type_1_0= ruleType )
                // InternalVilBuildLanguage.g:597:3: lv_type_1_0= ruleType
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getTypeTypeParserRuleCall_1_0_0()); 
                  	    
                }
                pushFollow(FOLLOW_21);
                lv_type_1_0=ruleType();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // InternalVilBuildLanguage.g:613:3: ( (lv_modifier_2_0= ruleRuleModifier ) )?
        int alt88=2;
        int LA88_0 = input.LA(1);

        if ( (LA88_0==26) ) {
            alt88=1;
        }
        switch (alt88) {
            case 1 :
                // InternalVilBuildLanguage.g:614:1: (lv_modifier_2_0= ruleRuleModifier )
                {
                // InternalVilBuildLanguage.g:614:1: (lv_modifier_2_0= ruleRuleModifier )
                // InternalVilBuildLanguage.g:615:3: lv_modifier_2_0= ruleRuleModifier
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getModifierRuleModifierParserRuleCall_1_1_0()); 
                  	    
                }
                pushFollow(FOLLOW_10);
                lv_modifier_2_0=ruleRuleModifier();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // InternalVilBuildLanguage.g:631:3: ( (lv_name_3_0= ruleIdentifier ) )
        // InternalVilBuildLanguage.g:632:1: (lv_name_3_0= ruleIdentifier )
        {
        // InternalVilBuildLanguage.g:632:1: (lv_name_3_0= ruleIdentifier )
        // InternalVilBuildLanguage.g:633:3: lv_name_3_0= ruleIdentifier
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getNameIdentifierParserRuleCall_1_2_0()); 
          	    
        }
        pushFollow(FOLLOW_11);
        lv_name_3_0=ruleIdentifier();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_4=(Token)match(input,16,FOLLOW_12); if (state.failed) return ;
        // InternalVilBuildLanguage.g:653:1: ( (lv_paramList_5_0= ruleParameterList ) )?
        int alt89=2;
        int LA89_0 = input.LA(1);

        if ( (LA89_0==RULE_VERSION||(LA89_0>=RULE_ID && LA89_0<=RULE_EXPONENT)||LA89_0==41||(LA89_0>=69 && LA89_0<=72)) ) {
            alt89=1;
        }
        switch (alt89) {
            case 1 :
                // InternalVilBuildLanguage.g:654:1: (lv_paramList_5_0= ruleParameterList )
                {
                // InternalVilBuildLanguage.g:654:1: (lv_paramList_5_0= ruleParameterList )
                // InternalVilBuildLanguage.g:655:3: lv_paramList_5_0= ruleParameterList
                {
                if ( state.backtracking==0 ) {
                   
                  	        newCompositeNode(grammarAccess.getRuleDeclarationAccess().getParamListParameterListParserRuleCall_1_4_0()); 
                  	    
                }
                pushFollow(FOLLOW_13);
                lv_paramList_5_0=ruleParameterList();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        otherlv_6=(Token)match(input,17,FOLLOW_22); if (state.failed) return ;
        otherlv_7=(Token)match(input,23,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalVilBuildLanguage

    // $ANTLR start synpred31_InternalVilBuildLanguage
    public final void synpred31_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        Token otherlv_7=null;

        // InternalVilBuildLanguage.g:1113:4: (otherlv_7= ';' )
        // InternalVilBuildLanguage.g:1113:4: otherlv_7= ';'
        {
        otherlv_7=(Token)match(input,14,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred31_InternalVilBuildLanguage

    // $ANTLR start synpred48_InternalVilBuildLanguage
    public final void synpred48_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        Token otherlv_5=null;
        EObject lv_else_6_0 = null;


        // InternalVilBuildLanguage.g:1868:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) ) )
        // InternalVilBuildLanguage.g:1868:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_else_6_0= ruleStatementOrBlock ) )
        {
        // InternalVilBuildLanguage.g:1868:3: ( ( 'else' )=>otherlv_5= 'else' )
        // InternalVilBuildLanguage.g:1868:4: ( 'else' )=>otherlv_5= 'else'
        {
        otherlv_5=(Token)match(input,33,FOLLOW_36); if (state.failed) return ;

        }

        // InternalVilBuildLanguage.g:1873:2: ( (lv_else_6_0= ruleStatementOrBlock ) )
        // InternalVilBuildLanguage.g:1874:1: (lv_else_6_0= ruleStatementOrBlock )
        {
        // InternalVilBuildLanguage.g:1874:1: (lv_else_6_0= ruleStatementOrBlock )
        // InternalVilBuildLanguage.g:1875:3: lv_else_6_0= ruleStatementOrBlock
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAlternativeAccess().getElseStatementOrBlockParserRuleCall_5_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_else_6_0=ruleStatementOrBlock();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred48_InternalVilBuildLanguage

    // $ANTLR start synpred49_InternalVilBuildLanguage
    public final void synpred49_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_exStmt_0_0 = null;


        // InternalVilBuildLanguage.g:1912:2: ( ( (lv_exStmt_0_0= ruleExpressionStatement ) ) )
        // InternalVilBuildLanguage.g:1912:2: ( (lv_exStmt_0_0= ruleExpressionStatement ) )
        {
        // InternalVilBuildLanguage.g:1912:2: ( (lv_exStmt_0_0= ruleExpressionStatement ) )
        // InternalVilBuildLanguage.g:1913:1: (lv_exStmt_0_0= ruleExpressionStatement )
        {
        // InternalVilBuildLanguage.g:1913:1: (lv_exStmt_0_0= ruleExpressionStatement )
        // InternalVilBuildLanguage.g:1914:3: lv_exStmt_0_0= ruleExpressionStatement
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getStatementOrBlockAccess().getExStmtExpressionStatementParserRuleCall_0_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_exStmt_0_0=ruleExpressionStatement();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred49_InternalVilBuildLanguage

    // $ANTLR start synpred59_InternalVilBuildLanguage
    public final void synpred59_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_right_1_0 = null;


        // InternalVilBuildLanguage.g:2792:1: ( (lv_right_1_0= ruleLogicalExpressionPart ) )
        // InternalVilBuildLanguage.g:2792:1: (lv_right_1_0= ruleLogicalExpressionPart )
        {
        // InternalVilBuildLanguage.g:2792:1: (lv_right_1_0= ruleLogicalExpressionPart )
        // InternalVilBuildLanguage.g:2793:3: lv_right_1_0= ruleLogicalExpressionPart
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getLogicalExpressionAccess().getRightLogicalExpressionPartParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_right_1_0=ruleLogicalExpressionPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred59_InternalVilBuildLanguage

    // $ANTLR start synpred62_InternalVilBuildLanguage
    public final void synpred62_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_right_1_0 = null;


        // InternalVilBuildLanguage.g:2947:1: ( (lv_right_1_0= ruleEqualityExpressionPart ) )
        // InternalVilBuildLanguage.g:2947:1: (lv_right_1_0= ruleEqualityExpressionPart )
        {
        // InternalVilBuildLanguage.g:2947:1: (lv_right_1_0= ruleEqualityExpressionPart )
        // InternalVilBuildLanguage.g:2948:3: lv_right_1_0= ruleEqualityExpressionPart
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getEqualityExpressionAccess().getRightEqualityExpressionPartParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_right_1_0=ruleEqualityExpressionPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred62_InternalVilBuildLanguage

    // $ANTLR start synpred65_InternalVilBuildLanguage
    public final void synpred65_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_right_1_0 = null;


        // InternalVilBuildLanguage.g:3102:1: ( (lv_right_1_0= ruleRelationalExpressionPart ) )
        // InternalVilBuildLanguage.g:3102:1: (lv_right_1_0= ruleRelationalExpressionPart )
        {
        // InternalVilBuildLanguage.g:3102:1: (lv_right_1_0= ruleRelationalExpressionPart )
        // InternalVilBuildLanguage.g:3103:3: lv_right_1_0= ruleRelationalExpressionPart
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightRelationalExpressionPartParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_right_1_0=ruleRelationalExpressionPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred65_InternalVilBuildLanguage

    // $ANTLR start synpred69_InternalVilBuildLanguage
    public final void synpred69_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_right_1_0 = null;


        // InternalVilBuildLanguage.g:3264:1: ( (lv_right_1_0= ruleAdditiveExpressionPart ) )
        // InternalVilBuildLanguage.g:3264:1: (lv_right_1_0= ruleAdditiveExpressionPart )
        {
        // InternalVilBuildLanguage.g:3264:1: (lv_right_1_0= ruleAdditiveExpressionPart )
        // InternalVilBuildLanguage.g:3265:3: lv_right_1_0= ruleAdditiveExpressionPart
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightAdditiveExpressionPartParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_right_1_0=ruleAdditiveExpressionPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred69_InternalVilBuildLanguage

    // $ANTLR start synpred71_InternalVilBuildLanguage
    public final void synpred71_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_right_1_0 = null;


        // InternalVilBuildLanguage.g:3412:1: ( (lv_right_1_0= ruleMultiplicativeExpressionPart ) )
        // InternalVilBuildLanguage.g:3412:1: (lv_right_1_0= ruleMultiplicativeExpressionPart )
        {
        // InternalVilBuildLanguage.g:3412:1: (lv_right_1_0= ruleMultiplicativeExpressionPart )
        // InternalVilBuildLanguage.g:3413:3: lv_right_1_0= ruleMultiplicativeExpressionPart
        {
        if ( state.backtracking==0 ) {
           
          	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightMultiplicativeExpressionPartParserRuleCall_1_0()); 
          	    
        }
        pushFollow(FOLLOW_2);
        lv_right_1_0=ruleMultiplicativeExpressionPart();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred71_InternalVilBuildLanguage

    // $ANTLR start synpred88_InternalVilBuildLanguage
    public final void synpred88_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_decl_2_0 = null;


        // InternalVilBuildLanguage.g:4295:1: ( (lv_decl_2_0= ruleDeclarator ) )
        // InternalVilBuildLanguage.g:4295:1: (lv_decl_2_0= ruleDeclarator )
        {
        // InternalVilBuildLanguage.g:4295:1: (lv_decl_2_0= ruleDeclarator )
        // InternalVilBuildLanguage.g:4296:3: lv_decl_2_0= ruleDeclarator
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
    // $ANTLR end synpred88_InternalVilBuildLanguage

    // $ANTLR start synpred96_InternalVilBuildLanguage
    public final void synpred96_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        EObject lv_qValue_2_0 = null;


        // InternalVilBuildLanguage.g:4659:6: ( ( (lv_qValue_2_0= ruleQualifiedName ) ) )
        // InternalVilBuildLanguage.g:4659:6: ( (lv_qValue_2_0= ruleQualifiedName ) )
        {
        // InternalVilBuildLanguage.g:4659:6: ( (lv_qValue_2_0= ruleQualifiedName ) )
        // InternalVilBuildLanguage.g:4660:1: (lv_qValue_2_0= ruleQualifiedName )
        {
        // InternalVilBuildLanguage.g:4660:1: (lv_qValue_2_0= ruleQualifiedName )
        // InternalVilBuildLanguage.g:4661:3: lv_qValue_2_0= ruleQualifiedName
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
    // $ANTLR end synpred96_InternalVilBuildLanguage

    // $ANTLR start synpred100_InternalVilBuildLanguage
    public final void synpred100_InternalVilBuildLanguage_fragment() throws RecognitionException {   
        // InternalVilBuildLanguage.g:4725:7: ( ( RULE_VERSION ) )
        // InternalVilBuildLanguage.g:4726:1: ( RULE_VERSION )
        {
        // InternalVilBuildLanguage.g:4726:1: ( RULE_VERSION )
        // InternalVilBuildLanguage.g:4727:1: RULE_VERSION
        {
        match(input,RULE_VERSION,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred100_InternalVilBuildLanguage

    // Delegated rules

    public final boolean synpred59_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred65_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred31_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred31_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred100_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred100_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred12_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalVilBuildLanguage() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalVilBuildLanguage_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA10 dfa10 = new DFA10(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String dfa_1s = "\37\uffff";
    static final String dfa_2s = "\1\1\36\uffff";
    static final String dfa_3s = "\1\4\3\uffff\10\0\23\uffff";
    static final String dfa_4s = "\1\110\3\uffff\10\0\23\uffff";
    static final String dfa_5s = "\1\uffff\1\4\1\uffff\1\1\10\uffff\1\2\1\3\21\uffff";
    static final String dfa_6s = "\4\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\23\uffff}>";
    static final String[] dfa_7s = {
            "\1\15\1\5\1\15\1\4\1\6\7\uffff\1\15\1\uffff\1\15\1\1\4\uffff\1\15\1\uffff\1\15\1\uffff\2\15\4\uffff\1\15\2\uffff\1\15\1\3\1\14\1\uffff\1\7\14\uffff\1\15\2\uffff\4\15\5\uffff\3\15\1\10\1\11\1\12\1\13",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 509:2: ( ( (lv_elements_1_0= ruleVariableDeclaration ) ) | ( (lv_elements_2_0= ruleTypeDef ) ) | ( (lv_elements_3_0= ruleRuleDeclaration ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA10_4 = input.LA(1);

                         
                        int index10_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalVilBuildLanguage()) ) {s = 3;}

                        else if ( (synpred12_InternalVilBuildLanguage()) ) {s = 13;}

                         
                        input.seek(index10_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA10_5 = input.LA(1);

                         
                        int index10_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalVilBuildLanguage()) ) {s = 3;}

                        else if ( (synpred12_InternalVilBuildLanguage()) ) {s = 13;}

                         
                        input.seek(index10_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA10_6 = input.LA(1);

                         
                        int index10_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalVilBuildLanguage()) ) {s = 3;}

                        else if ( (synpred12_InternalVilBuildLanguage()) ) {s = 13;}

                         
                        input.seek(index10_6);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA10_7 = input.LA(1);

                         
                        int index10_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalVilBuildLanguage()) ) {s = 3;}

                        else if ( (synpred12_InternalVilBuildLanguage()) ) {s = 13;}

                         
                        input.seek(index10_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA10_8 = input.LA(1);

                         
                        int index10_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalVilBuildLanguage()) ) {s = 3;}

                        else if ( (synpred12_InternalVilBuildLanguage()) ) {s = 13;}

                         
                        input.seek(index10_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA10_9 = input.LA(1);

                         
                        int index10_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalVilBuildLanguage()) ) {s = 3;}

                        else if ( (synpred12_InternalVilBuildLanguage()) ) {s = 13;}

                         
                        input.seek(index10_9);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA10_10 = input.LA(1);

                         
                        int index10_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalVilBuildLanguage()) ) {s = 3;}

                        else if ( (synpred12_InternalVilBuildLanguage()) ) {s = 13;}

                         
                        input.seek(index10_10);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA10_11 = input.LA(1);

                         
                        int index10_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred10_InternalVilBuildLanguage()) ) {s = 3;}

                        else if ( (synpred12_InternalVilBuildLanguage()) ) {s = 13;}

                         
                        input.seek(index10_11);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 10, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\33\uffff";
    static final String dfa_9s = "\1\4\4\0\26\uffff";
    static final String dfa_10s = "\1\110\4\0\26\uffff";
    static final String dfa_11s = "\5\uffff\1\1\4\uffff\1\2\20\uffff";
    static final String dfa_12s = "\1\uffff\1\0\1\1\1\2\1\3\26\uffff}>";
    static final String[] dfa_13s = {
            "\1\12\1\2\1\12\1\1\1\3\7\uffff\1\12\1\uffff\1\12\5\uffff\1\12\1\uffff\1\5\1\uffff\2\12\4\uffff\1\12\2\uffff\1\12\3\uffff\1\4\14\uffff\1\12\2\uffff\4\12\5\uffff\3\12\4\5",
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
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "595:2: ( ( (lv_type_1_0= ruleType ) )? ( (lv_modifier_2_0= ruleRuleModifier ) )? ( (lv_name_3_0= ruleIdentifier ) ) otherlv_4= '(' ( (lv_paramList_5_0= ruleParameterList ) )? otherlv_6= ')' otherlv_7= '=' )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalVilBuildLanguage()) ) {s = 5;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_2 = input.LA(1);

                         
                        int index14_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalVilBuildLanguage()) ) {s = 5;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_3 = input.LA(1);

                         
                        int index14_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalVilBuildLanguage()) ) {s = 5;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_4 = input.LA(1);

                         
                        int index14_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalVilBuildLanguage()) ) {s = 5;}

                        else if ( (true) ) {s = 10;}

                         
                        input.seek(index14_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\16\uffff";
    static final String dfa_15s = "\1\4\1\uffff\4\5\3\uffff\5\5";
    static final String dfa_16s = "\1\110\1\uffff\4\101\3\uffff\1\51\4\101";
    static final String dfa_17s = "\1\uffff\1\1\4\uffff\1\2\1\3\1\4\5\uffff";
    static final String dfa_18s = "\16\uffff}>";
    static final String[] dfa_19s = {
            "\1\6\1\3\1\6\1\2\1\4\7\uffff\1\6\1\uffff\1\6\11\uffff\2\6\1\10\1\7\1\6\1\uffff\1\6\2\uffff\1\6\1\1\2\uffff\1\5\14\uffff\1\6\2\uffff\4\6\5\uffff\3\6\4\1",
            "",
            "\1\1\1\uffff\2\1\5\uffff\1\6\1\uffff\1\6\6\uffff\1\6\3\uffff\1\6\15\uffff\1\1\1\uffff\16\6\4\uffff\2\6\2\uffff\1\11",
            "\1\1\1\uffff\2\1\5\uffff\1\6\1\uffff\1\6\6\uffff\1\6\3\uffff\1\6\15\uffff\1\1\1\uffff\16\6\4\uffff\2\6\2\uffff\1\11",
            "\1\1\1\uffff\2\1\5\uffff\1\6\1\uffff\1\6\6\uffff\1\6\3\uffff\1\6\15\uffff\1\1\1\uffff\16\6\4\uffff\2\6\2\uffff\1\11",
            "\1\1\1\uffff\2\1\5\uffff\1\6\1\uffff\1\6\6\uffff\1\6\3\uffff\1\6\15\uffff\1\1\1\uffff\16\6\4\uffff\2\6\2\uffff\1\11",
            "",
            "",
            "",
            "\1\13\1\uffff\1\12\1\14\40\uffff\1\15",
            "\1\1\1\uffff\2\1\5\uffff\1\6\1\uffff\1\6\12\uffff\1\6\15\uffff\1\1\1\uffff\16\6\4\uffff\2\6\2\uffff\1\11",
            "\1\1\1\uffff\2\1\5\uffff\1\6\1\uffff\1\6\12\uffff\1\6\15\uffff\1\1\1\uffff\16\6\4\uffff\2\6\2\uffff\1\11",
            "\1\1\1\uffff\2\1\5\uffff\1\6\1\uffff\1\6\12\uffff\1\6\15\uffff\1\1\1\uffff\16\6\4\uffff\2\6\2\uffff\1\11",
            "\1\1\1\uffff\2\1\5\uffff\1\6\1\uffff\1\6\12\uffff\1\6\15\uffff\1\1\1\uffff\16\6\4\uffff\2\6\2\uffff\1\11"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "888:1: ( ( (lv_varDecl_0_0= ruleVariableDeclaration ) ) | ( (lv_exprStmt_1_0= ruleExpressionStatement ) ) | ( ( (lv_while_2_0= ruleWhile ) ) (otherlv_3= ';' )? ) | ( ( (lv_for_4_0= ruleFor ) ) (otherlv_5= ';' )? ) )";
        }
    }
    static final String dfa_20s = "\14\uffff";
    static final String dfa_21s = "\1\4\4\16\1\uffff\1\5\1\uffff\4\16";
    static final String dfa_22s = "\1\104\4\101\1\uffff\1\51\1\uffff\4\101";
    static final String dfa_23s = "\5\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_24s = "\14\uffff}>";
    static final String[] dfa_25s = {
            "\1\5\1\2\1\5\1\1\1\3\7\uffff\1\5\1\uffff\1\5\11\uffff\2\5\4\uffff\1\5\2\uffff\1\5\3\uffff\1\4\14\uffff\1\5\2\uffff\4\5\5\uffff\3\5",
            "\1\5\1\uffff\1\5\6\uffff\1\7\3\uffff\1\6\17\uffff\16\5\4\uffff\2\5\2\uffff\1\5",
            "\1\5\1\uffff\1\5\6\uffff\1\7\3\uffff\1\6\17\uffff\16\5\4\uffff\2\5\2\uffff\1\5",
            "\1\5\1\uffff\1\5\6\uffff\1\7\3\uffff\1\6\17\uffff\16\5\4\uffff\2\5\2\uffff\1\5",
            "\1\5\1\uffff\1\5\6\uffff\1\7\3\uffff\1\6\17\uffff\16\5\4\uffff\2\5\2\uffff\1\5",
            "",
            "\1\11\1\uffff\1\10\1\12\40\uffff\1\13",
            "",
            "\1\5\1\uffff\1\5\6\uffff\1\7\3\uffff\1\5\17\uffff\16\5\4\uffff\2\5\2\uffff\1\5",
            "\1\5\1\uffff\1\5\6\uffff\1\7\3\uffff\1\5\17\uffff\16\5\4\uffff\2\5\2\uffff\1\5",
            "\1\5\1\uffff\1\5\6\uffff\1\7\3\uffff\1\5\17\uffff\16\5\4\uffff\2\5\2\uffff\1\5",
            "\1\5\1\uffff\1\5\6\uffff\1\7\3\uffff\1\5\17\uffff\16\5\4\uffff\2\5\2\uffff\1\5"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "1028:3: ( ( (lv_var_0_0= ruleIdentifier ) ) (otherlv_1= '.' ( (lv_field_2_0= ruleIdentifier ) ) )? otherlv_3= '=' )?";
        }
    }
    static final String dfa_26s = "\22\uffff";
    static final String dfa_27s = "\2\uffff\4\1\10\uffff\4\1";
    static final String dfa_28s = "\1\4\1\uffff\4\16\6\uffff\1\5\1\uffff\4\16";
    static final String dfa_29s = "\1\104\1\uffff\4\101\6\uffff\1\51\1\uffff\4\101";
    static final String dfa_30s = "\1\uffff\1\1\4\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\2\4\uffff";
    static final String dfa_31s = "\22\uffff}>";
    static final String[] dfa_32s = {
            "\1\1\1\3\1\1\1\2\1\4\7\uffff\1\1\13\uffff\1\12\1\10\4\uffff\1\11\2\uffff\1\7\3\uffff\1\5\21\uffff\1\6\1\13\5\uffff\3\1",
            "",
            "\2\1\1\15\3\1\4\uffff\2\1\1\uffff\1\1\14\uffff\1\1\2\uffff\16\1\4\uffff\4\1\1\14",
            "\2\1\1\15\3\1\4\uffff\2\1\1\uffff\1\1\14\uffff\1\1\2\uffff\16\1\4\uffff\4\1\1\14",
            "\2\1\1\15\3\1\4\uffff\2\1\1\uffff\1\1\14\uffff\1\1\2\uffff\16\1\4\uffff\4\1\1\14",
            "\2\1\1\15\3\1\4\uffff\2\1\1\uffff\1\1\14\uffff\1\1\2\uffff\16\1\4\uffff\4\1\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17\1\uffff\1\16\1\20\40\uffff\1\21",
            "",
            "\2\1\1\15\3\1\4\uffff\2\1\1\uffff\1\1\14\uffff\1\1\2\uffff\16\1\4\uffff\4\1\1\14",
            "\2\1\1\15\3\1\4\uffff\2\1\1\uffff\1\1\14\uffff\1\1\2\uffff\16\1\4\uffff\4\1\1\14",
            "\2\1\1\15\3\1\4\uffff\2\1\1\uffff\1\1\14\uffff\1\1\2\uffff\16\1\4\uffff\4\1\1\14",
            "\2\1\1\15\3\1\4\uffff\2\1\1\uffff\1\1\14\uffff\1\1\2\uffff\16\1\4\uffff\4\1\1\14"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "1138:1: ( ( (lv_otherEx_0_0= ruleExpressionOrQualifiedExecution ) ) | ( (lv_unqEx_1_0= ruleUnqualifiedExecution ) ) | ( (lv_superEx_2_0= ruleSuperExecution ) ) | ( (lv_sysEx_3_0= ruleSystemExecution ) ) | ( (lv_map_4_0= ruleMap ) ) | ( (lv_join_5_0= ruleJoin ) ) | ( (lv_instantiate_6_0= ruleInstantiate ) ) | ( (lv_newEx_7_0= ruleConstructorExecution ) ) )";
        }
    }
    static final String dfa_33s = "\27\uffff";
    static final String dfa_34s = "\1\4\23\uffff\1\0\2\uffff";
    static final String dfa_35s = "\1\104\23\uffff\1\0\2\uffff";
    static final String dfa_36s = "\1\uffff\1\1\24\uffff\1\2";
    static final String dfa_37s = "\24\uffff\1\0\2\uffff}>";
    static final String[] dfa_38s = {
            "\5\1\7\uffff\1\1\1\uffff\1\24\11\uffff\2\1\2\uffff\1\1\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\14\uffff\1\1\2\uffff\4\1\5\uffff\3\1",
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
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_33;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "1912:1: ( ( (lv_exStmt_0_0= ruleExpressionStatement ) ) | ( (lv_block_1_0= ruleRuleElementBlock ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_20 = input.LA(1);

                         
                        int index38_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalVilBuildLanguage()) ) {s = 1;}

                        else if ( (true) ) {s = 22;}

                         
                        input.seek(index38_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\32\uffff";
    static final String dfa_40s = "\1\4\4\0\25\uffff";
    static final String dfa_41s = "\1\110\4\0\25\uffff";
    static final String dfa_42s = "\5\uffff\1\1\3\uffff\1\2\20\uffff";
    static final String dfa_43s = "\1\uffff\1\0\1\1\1\2\1\3\25\uffff}>";
    static final String[] dfa_44s = {
            "\1\11\1\2\1\11\1\1\1\3\7\uffff\3\11\11\uffff\2\11\4\uffff\1\11\2\uffff\1\11\3\uffff\1\4\14\uffff\1\11\2\uffff\4\11\5\uffff\3\11\4\5",
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
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_39;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "4294:1: ( (lv_decl_2_0= ruleDeclarator ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_1 = input.LA(1);

                         
                        int index72_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalVilBuildLanguage()) ) {s = 5;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index72_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_2 = input.LA(1);

                         
                        int index72_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalVilBuildLanguage()) ) {s = 5;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index72_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_3 = input.LA(1);

                         
                        int index72_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalVilBuildLanguage()) ) {s = 5;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index72_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA72_4 = input.LA(1);

                         
                        int index72_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalVilBuildLanguage()) ) {s = 5;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index72_4);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000005000000A002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000001000000A002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000010000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000200000001A0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000200000201A0L,0x00000000000001E0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x1E4002E4352D01F0L,0x00000000000001FCL});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x1E4002E4350501F2L,0x00000000000001FCL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000200040001A0L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x1E4002E4350501F0L,0x00000000000001FCL});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x1E400224300101F2L,0x000000000000001CL});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x1E400224300101F0L,0x000000000000001CL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x1E400265F00D01F0L,0x00000000000001FCL});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x1E400224300501F0L,0x000000000000001CL});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000200000001B0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1E400224300701F0L,0x000000000000001CL});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x00000200000001A0L,0x00000000000001E0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1E4002E5350501F0L,0x00000000000001FCL});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000210000001A0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x6000000008000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000804000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000800004000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001C00000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000001L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1E400224300701F0L,0x00000000000001FCL});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00000200000101A0L,0x00000000000001E0L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x1E400224300D01F0L,0x000000000000001CL});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000002080000L});

}