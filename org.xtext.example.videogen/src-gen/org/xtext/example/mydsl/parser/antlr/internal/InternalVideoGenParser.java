package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PERCENTAGE", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'@author'", "'@version'", "'@creation'", "'mandatory'", "'optional'", "'alternatives'", "'videoseq'", "'duration'", "'probability'", "'size'", "'description'", "'filter'", "'text'", "'content'", "'position'", "'color'", "'TOP'", "'BOTTOM'", "'CENTER'", "'b&w'", "'negate'", "'flip'", "'h'", "'horizontal'", "'v'", "'vertical'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=5;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=7;
    public static final int RULE_WS=13;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__26=26;
    public static final int RULE_PERCENTAGE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int RULE_FLOAT=10;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVideoGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoGenParser.tokenNames; }
    public String getGrammarFileName() { return "InternalVideoGen.g"; }



     	private VideoGenGrammarAccess grammarAccess;

        public InternalVideoGenParser(TokenStream input, VideoGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "VideoGeneratorModel";
       	}

       	@Override
       	protected VideoGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleVideoGeneratorModel"
    // InternalVideoGen.g:64:1: entryRuleVideoGeneratorModel returns [EObject current=null] : iv_ruleVideoGeneratorModel= ruleVideoGeneratorModel EOF ;
    public final EObject entryRuleVideoGeneratorModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGeneratorModel = null;


        try {
            // InternalVideoGen.g:64:60: (iv_ruleVideoGeneratorModel= ruleVideoGeneratorModel EOF )
            // InternalVideoGen.g:65:2: iv_ruleVideoGeneratorModel= ruleVideoGeneratorModel EOF
            {
             newCompositeNode(grammarAccess.getVideoGeneratorModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoGeneratorModel=ruleVideoGeneratorModel();

            state._fsp--;

             current =iv_ruleVideoGeneratorModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoGeneratorModel"


    // $ANTLR start "ruleVideoGeneratorModel"
    // InternalVideoGen.g:71:1: ruleVideoGeneratorModel returns [EObject current=null] : ( () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_videoseqs_4_0= ruleVideoSeq ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleVideoGeneratorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_LEFT_BRACKET_3=null;
        Token this_RIGHT_BRACKET_5=null;
        EObject lv_information_1_0 = null;

        EObject lv_videoseqs_4_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:77:2: ( ( () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_videoseqs_4_0= ruleVideoSeq ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:78:2: ( () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_videoseqs_4_0= ruleVideoSeq ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:78:2: ( () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_videoseqs_4_0= ruleVideoSeq ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:79:3: () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_videoseqs_4_0= ruleVideoSeq ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET
            {
            // InternalVideoGen.g:79:3: ()
            // InternalVideoGen.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoGeneratorModelAccess().getVideoGeneratorModelAction_0(),
            					current);
            			

            }

            // InternalVideoGen.g:86:3: ( (lv_information_1_0= ruleVideoGenInformation ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalVideoGen.g:87:4: (lv_information_1_0= ruleVideoGenInformation )
                    {
                    // InternalVideoGen.g:87:4: (lv_information_1_0= ruleVideoGenInformation )
                    // InternalVideoGen.g:88:5: lv_information_1_0= ruleVideoGenInformation
                    {

                    					newCompositeNode(grammarAccess.getVideoGeneratorModelAccess().getInformationVideoGenInformationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_3);
                    lv_information_1_0=ruleVideoGenInformation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getVideoGeneratorModelRule());
                    					}
                    					set(
                    						current,
                    						"information",
                    						lv_information_1_0,
                    						"org.xtext.example.mydsl.VideoGen.VideoGenInformation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVideoGeneratorModelAccess().getVideoGenKeyword_2());
            		
            this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_5); 

            			newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getVideoGeneratorModelAccess().getLEFT_BRACKETTerminalRuleCall_3());
            		
            // InternalVideoGen.g:113:3: ( (lv_videoseqs_4_0= ruleVideoSeq ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalVideoGen.g:114:4: (lv_videoseqs_4_0= ruleVideoSeq )
            	    {
            	    // InternalVideoGen.g:114:4: (lv_videoseqs_4_0= ruleVideoSeq )
            	    // InternalVideoGen.g:115:5: lv_videoseqs_4_0= ruleVideoSeq
            	    {

            	    					newCompositeNode(grammarAccess.getVideoGeneratorModelAccess().getVideoseqsVideoSeqParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_videoseqs_4_0=ruleVideoSeq();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVideoGeneratorModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"videoseqs",
            	    						lv_videoseqs_4_0,
            	    						"org.xtext.example.mydsl.VideoGen.VideoSeq");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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

            this_RIGHT_BRACKET_5=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_5, grammarAccess.getVideoGeneratorModelAccess().getRIGHT_BRACKETTerminalRuleCall_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoGeneratorModel"


    // $ANTLR start "entryRuleVideoGenInformation"
    // InternalVideoGen.g:140:1: entryRuleVideoGenInformation returns [EObject current=null] : iv_ruleVideoGenInformation= ruleVideoGenInformation EOF ;
    public final EObject entryRuleVideoGenInformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGenInformation = null;


        try {
            // InternalVideoGen.g:140:60: (iv_ruleVideoGenInformation= ruleVideoGenInformation EOF )
            // InternalVideoGen.g:141:2: iv_ruleVideoGenInformation= ruleVideoGenInformation EOF
            {
             newCompositeNode(grammarAccess.getVideoGenInformationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoGenInformation=ruleVideoGenInformation();

            state._fsp--;

             current =iv_ruleVideoGenInformation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoGenInformation"


    // $ANTLR start "ruleVideoGenInformation"
    // InternalVideoGen.g:147:1: ruleVideoGenInformation returns [EObject current=null] : ( () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleVideoGenInformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_authorName_2_0=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_5=null;
        Token lv_creationDate_6_0=null;


        	enterRule();

        try {
            // InternalVideoGen.g:153:2: ( ( () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? ) )
            // InternalVideoGen.g:154:2: ( () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? )
            {
            // InternalVideoGen.g:154:2: ( () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )? )
            // InternalVideoGen.g:155:3: () (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) ) (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )? (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )?
            {
            // InternalVideoGen.g:155:3: ()
            // InternalVideoGen.g:156:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoGenInformationAccess().getVideoGenInformationAction_0(),
            					current);
            			

            }

            // InternalVideoGen.g:162:3: (otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) ) )
            // InternalVideoGen.g:163:4: otherlv_1= '@author' ( (lv_authorName_2_0= RULE_STRING ) )
            {
            otherlv_1=(Token)match(input,16,FOLLOW_7); 

            				newLeafNode(otherlv_1, grammarAccess.getVideoGenInformationAccess().getAuthorKeyword_1_0());
            			
            // InternalVideoGen.g:167:4: ( (lv_authorName_2_0= RULE_STRING ) )
            // InternalVideoGen.g:168:5: (lv_authorName_2_0= RULE_STRING )
            {
            // InternalVideoGen.g:168:5: (lv_authorName_2_0= RULE_STRING )
            // InternalVideoGen.g:169:6: lv_authorName_2_0= RULE_STRING
            {
            lv_authorName_2_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            						newLeafNode(lv_authorName_2_0, grammarAccess.getVideoGenInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getVideoGenInformationRule());
            						}
            						setWithLastConsumed(
            							current,
            							"authorName",
            							lv_authorName_2_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalVideoGen.g:186:3: (otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalVideoGen.g:187:4: otherlv_3= '@version' ( (lv_version_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getVideoGenInformationAccess().getVersionKeyword_2_0());
                    			
                    // InternalVideoGen.g:191:4: ( (lv_version_4_0= RULE_STRING ) )
                    // InternalVideoGen.g:192:5: (lv_version_4_0= RULE_STRING )
                    {
                    // InternalVideoGen.g:192:5: (lv_version_4_0= RULE_STRING )
                    // InternalVideoGen.g:193:6: lv_version_4_0= RULE_STRING
                    {
                    lv_version_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_version_4_0, grammarAccess.getVideoGenInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVideoGenInformationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"version",
                    							lv_version_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoGen.g:210:3: (otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalVideoGen.g:211:4: otherlv_5= '@creation' ( (lv_creationDate_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getVideoGenInformationAccess().getCreationKeyword_3_0());
                    			
                    // InternalVideoGen.g:215:4: ( (lv_creationDate_6_0= RULE_STRING ) )
                    // InternalVideoGen.g:216:5: (lv_creationDate_6_0= RULE_STRING )
                    {
                    // InternalVideoGen.g:216:5: (lv_creationDate_6_0= RULE_STRING )
                    // InternalVideoGen.g:217:6: lv_creationDate_6_0= RULE_STRING
                    {
                    lv_creationDate_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_creationDate_6_0, grammarAccess.getVideoGenInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVideoGenInformationRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"creationDate",
                    							lv_creationDate_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoGenInformation"


    // $ANTLR start "entryRuleVideoSeq"
    // InternalVideoGen.g:238:1: entryRuleVideoSeq returns [EObject current=null] : iv_ruleVideoSeq= ruleVideoSeq EOF ;
    public final EObject entryRuleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoSeq = null;


        try {
            // InternalVideoGen.g:238:49: (iv_ruleVideoSeq= ruleVideoSeq EOF )
            // InternalVideoGen.g:239:2: iv_ruleVideoSeq= ruleVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoSeq=ruleVideoSeq();

            state._fsp--;

             current =iv_ruleVideoSeq; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // InternalVideoGen.g:245:1: ruleVideoSeq returns [EObject current=null] : (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq ) ;
    public final EObject ruleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject this_MandatoryVideoSeq_0 = null;

        EObject this_OptionalVideoSeq_1 = null;

        EObject this_AlternativeVideoSeq_2 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:251:2: ( (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq ) )
            // InternalVideoGen.g:252:2: (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq )
            {
            // InternalVideoGen.g:252:2: (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 21:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVideoGen.g:253:3: this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq
                    {

                    			newCompositeNode(grammarAccess.getVideoSeqAccess().getMandatoryVideoSeqParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MandatoryVideoSeq_0=ruleMandatoryVideoSeq();

                    state._fsp--;


                    			current = this_MandatoryVideoSeq_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:262:3: this_OptionalVideoSeq_1= ruleOptionalVideoSeq
                    {

                    			newCompositeNode(grammarAccess.getVideoSeqAccess().getOptionalVideoSeqParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionalVideoSeq_1=ruleOptionalVideoSeq();

                    state._fsp--;


                    			current = this_OptionalVideoSeq_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:271:3: this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq
                    {

                    			newCompositeNode(grammarAccess.getVideoSeqAccess().getAlternativeVideoSeqParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlternativeVideoSeq_2=ruleAlternativeVideoSeq();

                    state._fsp--;


                    			current = this_AlternativeVideoSeq_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "entryRuleMandatoryVideoSeq"
    // InternalVideoGen.g:283:1: entryRuleMandatoryVideoSeq returns [EObject current=null] : iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF ;
    public final EObject entryRuleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryVideoSeq = null;


        try {
            // InternalVideoGen.g:283:58: (iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF )
            // InternalVideoGen.g:284:2: iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getMandatoryVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMandatoryVideoSeq=ruleMandatoryVideoSeq();

            state._fsp--;

             current =iv_ruleMandatoryVideoSeq; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatoryVideoSeq"


    // $ANTLR start "ruleMandatoryVideoSeq"
    // InternalVideoGen.g:290:1: ruleMandatoryVideoSeq returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) ) ) ;
    public final EObject ruleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:296:2: ( (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) ) ) )
            // InternalVideoGen.g:297:2: (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) ) )
            {
            // InternalVideoGen.g:297:2: (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) ) )
            // InternalVideoGen.g:298:3: otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0());
            		
            // InternalVideoGen.g:302:3: ( (lv_description_1_0= ruleVideoDescription ) )
            // InternalVideoGen.g:303:4: (lv_description_1_0= ruleVideoDescription )
            {
            // InternalVideoGen.g:303:4: (lv_description_1_0= ruleVideoDescription )
            // InternalVideoGen.g:304:5: lv_description_1_0= ruleVideoDescription
            {

            					newCompositeNode(grammarAccess.getMandatoryVideoSeqAccess().getDescriptionVideoDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_1_0=ruleVideoDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMandatoryVideoSeqRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.xtext.example.mydsl.VideoGen.VideoDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatoryVideoSeq"


    // $ANTLR start "entryRuleOptionalVideoSeq"
    // InternalVideoGen.g:325:1: entryRuleOptionalVideoSeq returns [EObject current=null] : iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF ;
    public final EObject entryRuleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalVideoSeq = null;


        try {
            // InternalVideoGen.g:325:57: (iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF )
            // InternalVideoGen.g:326:2: iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getOptionalVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionalVideoSeq=ruleOptionalVideoSeq();

            state._fsp--;

             current =iv_ruleOptionalVideoSeq; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptionalVideoSeq"


    // $ANTLR start "ruleOptionalVideoSeq"
    // InternalVideoGen.g:332:1: ruleOptionalVideoSeq returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) ) ) ;
    public final EObject ruleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:338:2: ( (otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) ) ) )
            // InternalVideoGen.g:339:2: (otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) ) )
            {
            // InternalVideoGen.g:339:2: (otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) ) )
            // InternalVideoGen.g:340:3: otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0());
            		
            // InternalVideoGen.g:344:3: ( (lv_description_1_0= ruleVideoDescription ) )
            // InternalVideoGen.g:345:4: (lv_description_1_0= ruleVideoDescription )
            {
            // InternalVideoGen.g:345:4: (lv_description_1_0= ruleVideoDescription )
            // InternalVideoGen.g:346:5: lv_description_1_0= ruleVideoDescription
            {

            					newCompositeNode(grammarAccess.getOptionalVideoSeqAccess().getDescriptionVideoDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_1_0=ruleVideoDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionalVideoSeqRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.xtext.example.mydsl.VideoGen.VideoDescription");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptionalVideoSeq"


    // $ANTLR start "entryRuleAlternativeVideoSeq"
    // InternalVideoGen.g:367:1: entryRuleAlternativeVideoSeq returns [EObject current=null] : iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF ;
    public final EObject entryRuleAlternativeVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeVideoSeq = null;


        try {
            // InternalVideoGen.g:367:60: (iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF )
            // InternalVideoGen.g:368:2: iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF
            {
             newCompositeNode(grammarAccess.getAlternativeVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternativeVideoSeq=ruleAlternativeVideoSeq();

            state._fsp--;

             current =iv_ruleAlternativeVideoSeq; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternativeVideoSeq"


    // $ANTLR start "ruleAlternativeVideoSeq"
    // InternalVideoGen.g:374:1: ruleAlternativeVideoSeq returns [EObject current=null] : (otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleAlternativeVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_videoid_1_0=null;
        Token this_LEFT_BRACKET_2=null;
        Token this_RIGHT_BRACKET_4=null;
        EObject lv_videodescs_3_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:380:2: ( (otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:381:2: (otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:381:2: (otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:382:3: otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativeVideoSeqAccess().getAlternativesKeyword_0());
            		
            // InternalVideoGen.g:386:3: ( (lv_videoid_1_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalVideoGen.g:387:4: (lv_videoid_1_0= RULE_ID )
                    {
                    // InternalVideoGen.g:387:4: (lv_videoid_1_0= RULE_ID )
                    // InternalVideoGen.g:388:5: lv_videoid_1_0= RULE_ID
                    {
                    lv_videoid_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_videoid_1_0, grammarAccess.getAlternativeVideoSeqAccess().getVideoidIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternativeVideoSeqRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"videoid",
                    						lv_videoid_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_10); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            // InternalVideoGen.g:408:3: ( (lv_videodescs_3_0= ruleVideoDescription ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==22) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalVideoGen.g:409:4: (lv_videodescs_3_0= ruleVideoDescription )
            	    {
            	    // InternalVideoGen.g:409:4: (lv_videodescs_3_0= ruleVideoDescription )
            	    // InternalVideoGen.g:410:5: lv_videodescs_3_0= ruleVideoDescription
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsVideoDescriptionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_videodescs_3_0=ruleVideoDescription();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativeVideoSeqRule());
            	    					}
            	    					add(
            	    						current,
            	    						"videodescs",
            	    						lv_videodescs_3_0,
            	    						"org.xtext.example.mydsl.VideoGen.VideoDescription");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            this_RIGHT_BRACKET_4=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_4, grammarAccess.getAlternativeVideoSeqAccess().getRIGHT_BRACKETTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternativeVideoSeq"


    // $ANTLR start "entryRuleVideoDescription"
    // InternalVideoGen.g:435:1: entryRuleVideoDescription returns [EObject current=null] : iv_ruleVideoDescription= ruleVideoDescription EOF ;
    public final EObject entryRuleVideoDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoDescription = null;


        try {
            // InternalVideoGen.g:435:57: (iv_ruleVideoDescription= ruleVideoDescription EOF )
            // InternalVideoGen.g:436:2: iv_ruleVideoDescription= ruleVideoDescription EOF
            {
             newCompositeNode(grammarAccess.getVideoDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideoDescription=ruleVideoDescription();

            state._fsp--;

             current =iv_ruleVideoDescription; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoDescription"


    // $ANTLR start "ruleVideoDescription"
    // InternalVideoGen.g:442:1: ruleVideoDescription returns [EObject current=null] : (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) ) )? (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) ) )? (otherlv_14= 'text' ( (lv_text_15_0= ruleText ) ) )? this_RIGHT_BRACKET_16= RULE_RIGHT_BRACKET )? ) ;
    public final EObject ruleVideoDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_videoid_1_0=null;
        Token lv_location_2_0=null;
        Token this_LEFT_BRACKET_3=null;
        Token otherlv_4=null;
        Token lv_duration_5_0=null;
        Token otherlv_6=null;
        Token lv_probability_7_0=null;
        Token otherlv_8=null;
        Token lv_size_9_0=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_RIGHT_BRACKET_16=null;
        EObject lv_filter_13_0 = null;

        EObject lv_text_15_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:448:2: ( (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) ) )? (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) ) )? (otherlv_14= 'text' ( (lv_text_15_0= ruleText ) ) )? this_RIGHT_BRACKET_16= RULE_RIGHT_BRACKET )? ) )
            // InternalVideoGen.g:449:2: (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) ) )? (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) ) )? (otherlv_14= 'text' ( (lv_text_15_0= ruleText ) ) )? this_RIGHT_BRACKET_16= RULE_RIGHT_BRACKET )? )
            {
            // InternalVideoGen.g:449:2: (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) ) )? (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) ) )? (otherlv_14= 'text' ( (lv_text_15_0= ruleText ) ) )? this_RIGHT_BRACKET_16= RULE_RIGHT_BRACKET )? )
            // InternalVideoGen.g:450:3: otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) ) )? (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) ) )? (otherlv_14= 'text' ( (lv_text_15_0= ruleText ) ) )? this_RIGHT_BRACKET_16= RULE_RIGHT_BRACKET )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0());
            		
            // InternalVideoGen.g:454:3: ( (lv_videoid_1_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalVideoGen.g:455:4: (lv_videoid_1_0= RULE_ID )
                    {
                    // InternalVideoGen.g:455:4: (lv_videoid_1_0= RULE_ID )
                    // InternalVideoGen.g:456:5: lv_videoid_1_0= RULE_ID
                    {
                    lv_videoid_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_videoid_1_0, grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getVideoDescriptionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"videoid",
                    						lv_videoid_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalVideoGen.g:472:3: ( (lv_location_2_0= RULE_STRING ) )
            // InternalVideoGen.g:473:4: (lv_location_2_0= RULE_STRING )
            {
            // InternalVideoGen.g:473:4: (lv_location_2_0= RULE_STRING )
            // InternalVideoGen.g:474:5: lv_location_2_0= RULE_STRING
            {
            lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_location_2_0, grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVideoDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVideoGen.g:490:3: (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) ) )? (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) ) )? (otherlv_14= 'text' ( (lv_text_15_0= ruleText ) ) )? this_RIGHT_BRACKET_16= RULE_RIGHT_BRACKET )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_LEFT_BRACKET) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVideoGen.g:491:4: this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )? (otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) ) )? (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )? (otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) ) )? (otherlv_14= 'text' ( (lv_text_15_0= ruleText ) ) )? this_RIGHT_BRACKET_16= RULE_RIGHT_BRACKET
                    {
                    this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_15); 

                    				newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0());
                    			
                    // InternalVideoGen.g:495:4: (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==23) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalVideoGen.g:496:5: otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_16); 

                            					newLeafNode(otherlv_4, grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0());
                            				
                            // InternalVideoGen.g:500:5: ( (lv_duration_5_0= RULE_INT ) )
                            // InternalVideoGen.g:501:6: (lv_duration_5_0= RULE_INT )
                            {
                            // InternalVideoGen.g:501:6: (lv_duration_5_0= RULE_INT )
                            // InternalVideoGen.g:502:7: lv_duration_5_0= RULE_INT
                            {
                            lv_duration_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                            							newLeafNode(lv_duration_5_0, grammarAccess.getVideoDescriptionAccess().getDurationINTTerminalRuleCall_3_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"duration",
                            								lv_duration_5_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalVideoGen.g:519:4: (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) ) )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalVideoGen.g:520:5: otherlv_6= 'probability' ( (lv_probability_7_0= RULE_INT ) )
                            {
                            otherlv_6=(Token)match(input,24,FOLLOW_16); 

                            					newLeafNode(otherlv_6, grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0());
                            				
                            // InternalVideoGen.g:524:5: ( (lv_probability_7_0= RULE_INT ) )
                            // InternalVideoGen.g:525:6: (lv_probability_7_0= RULE_INT )
                            {
                            // InternalVideoGen.g:525:6: (lv_probability_7_0= RULE_INT )
                            // InternalVideoGen.g:526:7: lv_probability_7_0= RULE_INT
                            {
                            lv_probability_7_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                            							newLeafNode(lv_probability_7_0, grammarAccess.getVideoDescriptionAccess().getProbabilityINTTerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"probability",
                            								lv_probability_7_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalVideoGen.g:543:4: (otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==25) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalVideoGen.g:544:5: otherlv_8= 'size' ( (lv_size_9_0= RULE_INT ) )
                            {
                            otherlv_8=(Token)match(input,25,FOLLOW_16); 

                            					newLeafNode(otherlv_8, grammarAccess.getVideoDescriptionAccess().getSizeKeyword_3_3_0());
                            				
                            // InternalVideoGen.g:548:5: ( (lv_size_9_0= RULE_INT ) )
                            // InternalVideoGen.g:549:6: (lv_size_9_0= RULE_INT )
                            {
                            // InternalVideoGen.g:549:6: (lv_size_9_0= RULE_INT )
                            // InternalVideoGen.g:550:7: lv_size_9_0= RULE_INT
                            {
                            lv_size_9_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                            							newLeafNode(lv_size_9_0, grammarAccess.getVideoDescriptionAccess().getSizeINTTerminalRuleCall_3_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"size",
                            								lv_size_9_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalVideoGen.g:567:4: (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==26) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalVideoGen.g:568:5: otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) )
                            {
                            otherlv_10=(Token)match(input,26,FOLLOW_7); 

                            					newLeafNode(otherlv_10, grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_4_0());
                            				
                            // InternalVideoGen.g:572:5: ( (lv_description_11_0= RULE_STRING ) )
                            // InternalVideoGen.g:573:6: (lv_description_11_0= RULE_STRING )
                            {
                            // InternalVideoGen.g:573:6: (lv_description_11_0= RULE_STRING )
                            // InternalVideoGen.g:574:7: lv_description_11_0= RULE_STRING
                            {
                            lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

                            							newLeafNode(lv_description_11_0, grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"description",
                            								lv_description_11_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalVideoGen.g:591:4: (otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) ) )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalVideoGen.g:592:5: otherlv_12= 'filter' ( (lv_filter_13_0= ruleFilter ) )
                            {
                            otherlv_12=(Token)match(input,27,FOLLOW_21); 

                            					newLeafNode(otherlv_12, grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_5_0());
                            				
                            // InternalVideoGen.g:596:5: ( (lv_filter_13_0= ruleFilter ) )
                            // InternalVideoGen.g:597:6: (lv_filter_13_0= ruleFilter )
                            {
                            // InternalVideoGen.g:597:6: (lv_filter_13_0= ruleFilter )
                            // InternalVideoGen.g:598:7: lv_filter_13_0= ruleFilter
                            {

                            							newCompositeNode(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_5_1_0());
                            						
                            pushFollow(FOLLOW_22);
                            lv_filter_13_0=ruleFilter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVideoDescriptionRule());
                            							}
                            							set(
                            								current,
                            								"filter",
                            								lv_filter_13_0,
                            								"org.xtext.example.mydsl.VideoGen.Filter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalVideoGen.g:616:4: (otherlv_14= 'text' ( (lv_text_15_0= ruleText ) ) )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==28) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalVideoGen.g:617:5: otherlv_14= 'text' ( (lv_text_15_0= ruleText ) )
                            {
                            otherlv_14=(Token)match(input,28,FOLLOW_4); 

                            					newLeafNode(otherlv_14, grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_6_0());
                            				
                            // InternalVideoGen.g:621:5: ( (lv_text_15_0= ruleText ) )
                            // InternalVideoGen.g:622:6: (lv_text_15_0= ruleText )
                            {
                            // InternalVideoGen.g:622:6: (lv_text_15_0= ruleText )
                            // InternalVideoGen.g:623:7: lv_text_15_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getVideoDescriptionAccess().getTextTextParserRuleCall_3_6_1_0());
                            						
                            pushFollow(FOLLOW_23);
                            lv_text_15_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVideoDescriptionRule());
                            							}
                            							set(
                            								current,
                            								"text",
                            								lv_text_15_0,
                            								"org.xtext.example.mydsl.VideoGen.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_RIGHT_BRACKET_16=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

                    				newLeafNode(this_RIGHT_BRACKET_16, grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_7());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoDescription"


    // $ANTLR start "entryRuleText"
    // InternalVideoGen.g:650:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalVideoGen.g:650:45: (iv_ruleText= ruleText EOF )
            // InternalVideoGen.g:651:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalVideoGen.g:657:1: ruleText returns [EObject current=null] : (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        Token this_LEFT_BRACKET_0=null;
        Token otherlv_1=null;
        Token lv_content_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_color_6_0=null;
        Token otherlv_7=null;
        Token lv_size_8_0=null;
        Token this_RIGHT_BRACKET_9=null;
        AntlrDatatypeRuleToken lv_position_4_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:663:2: ( (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:664:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:664:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:665:3: this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET
            {
            this_LEFT_BRACKET_0=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_24); 

            			newLeafNode(this_LEFT_BRACKET_0, grammarAccess.getTextAccess().getLEFT_BRACKETTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getContentKeyword_1());
            		
            // InternalVideoGen.g:673:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalVideoGen.g:674:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalVideoGen.g:674:4: (lv_content_2_0= RULE_STRING )
            // InternalVideoGen.g:675:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

            					newLeafNode(lv_content_2_0, grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTextRule());
            					}
            					setWithLastConsumed(
            						current,
            						"content",
            						lv_content_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getTextAccess().getPositionKeyword_3());
            		
            // InternalVideoGen.g:695:3: ( (lv_position_4_0= rulePosition ) )
            // InternalVideoGen.g:696:4: (lv_position_4_0= rulePosition )
            {
            // InternalVideoGen.g:696:4: (lv_position_4_0= rulePosition )
            // InternalVideoGen.g:697:5: lv_position_4_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_27);
            lv_position_4_0=rulePosition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTextRule());
            					}
            					set(
            						current,
            						"position",
            						lv_position_4_0,
            						"org.xtext.example.mydsl.VideoGen.Position");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalVideoGen.g:714:3: (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalVideoGen.g:715:4: otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextAccess().getColorKeyword_5_0());
                    			
                    // InternalVideoGen.g:719:4: ( (lv_color_6_0= RULE_STRING ) )
                    // InternalVideoGen.g:720:5: (lv_color_6_0= RULE_STRING )
                    {
                    // InternalVideoGen.g:720:5: (lv_color_6_0= RULE_STRING )
                    // InternalVideoGen.g:721:6: lv_color_6_0= RULE_STRING
                    {
                    lv_color_6_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

                    						newLeafNode(lv_color_6_0, grammarAccess.getTextAccess().getColorSTRINGTerminalRuleCall_5_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"color",
                    							lv_color_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalVideoGen.g:738:3: (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoGen.g:739:4: otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextAccess().getSizeKeyword_6_0());
                    			
                    // InternalVideoGen.g:743:4: ( (lv_size_8_0= RULE_INT ) )
                    // InternalVideoGen.g:744:5: (lv_size_8_0= RULE_INT )
                    {
                    // InternalVideoGen.g:744:5: (lv_size_8_0= RULE_INT )
                    // InternalVideoGen.g:745:6: lv_size_8_0= RULE_INT
                    {
                    lv_size_8_0=(Token)match(input,RULE_INT,FOLLOW_23); 

                    						newLeafNode(lv_size_8_0, grammarAccess.getTextAccess().getSizeINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTextRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"size",
                    							lv_size_8_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            this_RIGHT_BRACKET_9=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_9, grammarAccess.getTextAccess().getRIGHT_BRACKETTerminalRuleCall_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRulePosition"
    // InternalVideoGen.g:770:1: entryRulePosition returns [String current=null] : iv_rulePosition= rulePosition EOF ;
    public final String entryRulePosition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePosition = null;


        try {
            // InternalVideoGen.g:770:48: (iv_rulePosition= rulePosition EOF )
            // InternalVideoGen.g:771:2: iv_rulePosition= rulePosition EOF
            {
             newCompositeNode(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePosition=rulePosition();

            state._fsp--;

             current =iv_rulePosition.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalVideoGen.g:777:1: rulePosition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' ) ;
    public final AntlrDatatypeRuleToken rulePosition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVideoGen.g:783:2: ( (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' ) )
            // InternalVideoGen.g:784:2: (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' )
            {
            // InternalVideoGen.g:784:2: (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt18=1;
                }
                break;
            case 33:
                {
                alt18=2;
                }
                break;
            case 34:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalVideoGen.g:785:3: kw= 'TOP'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getTOPKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:791:3: kw= 'BOTTOM'
                    {
                    kw=(Token)match(input,33,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getBOTTOMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:797:3: kw= 'CENTER'
                    {
                    kw=(Token)match(input,34,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getCENTERKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleFilter"
    // InternalVideoGen.g:806:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalVideoGen.g:806:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalVideoGen.g:807:2: iv_ruleFilter= ruleFilter EOF
            {
             newCompositeNode(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;

             current =iv_ruleFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalVideoGen.g:813:1: ruleFilter returns [EObject current=null] : (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_FlipFilter_0 = null;

        EObject this_NegateFilter_1 = null;

        EObject this_BlackWhiteFilter_2 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:819:2: ( (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter ) )
            // InternalVideoGen.g:820:2: (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter )
            {
            // InternalVideoGen.g:820:2: (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt19=1;
                }
                break;
            case 36:
                {
                alt19=2;
                }
                break;
            case 35:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalVideoGen.g:821:3: this_FlipFilter_0= ruleFlipFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_FlipFilter_0=ruleFlipFilter();

                    state._fsp--;


                    			current = this_FlipFilter_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:830:3: this_NegateFilter_1= ruleNegateFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NegateFilter_1=ruleNegateFilter();

                    state._fsp--;


                    			current = this_NegateFilter_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:839:3: this_BlackWhiteFilter_2= ruleBlackWhiteFilter
                    {

                    			newCompositeNode(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BlackWhiteFilter_2=ruleBlackWhiteFilter();

                    state._fsp--;


                    			current = this_BlackWhiteFilter_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleBlackWhiteFilter"
    // InternalVideoGen.g:851:1: entryRuleBlackWhiteFilter returns [EObject current=null] : iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF ;
    public final EObject entryRuleBlackWhiteFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlackWhiteFilter = null;


        try {
            // InternalVideoGen.g:851:57: (iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF )
            // InternalVideoGen.g:852:2: iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF
            {
             newCompositeNode(grammarAccess.getBlackWhiteFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlackWhiteFilter=ruleBlackWhiteFilter();

            state._fsp--;

             current =iv_ruleBlackWhiteFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlackWhiteFilter"


    // $ANTLR start "ruleBlackWhiteFilter"
    // InternalVideoGen.g:858:1: ruleBlackWhiteFilter returns [EObject current=null] : ( () otherlv_1= 'b&w' ) ;
    public final EObject ruleBlackWhiteFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVideoGen.g:864:2: ( ( () otherlv_1= 'b&w' ) )
            // InternalVideoGen.g:865:2: ( () otherlv_1= 'b&w' )
            {
            // InternalVideoGen.g:865:2: ( () otherlv_1= 'b&w' )
            // InternalVideoGen.g:866:3: () otherlv_1= 'b&w'
            {
            // InternalVideoGen.g:866:3: ()
            // InternalVideoGen.g:867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlackWhiteFilter"


    // $ANTLR start "entryRuleNegateFilter"
    // InternalVideoGen.g:881:1: entryRuleNegateFilter returns [EObject current=null] : iv_ruleNegateFilter= ruleNegateFilter EOF ;
    public final EObject entryRuleNegateFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegateFilter = null;


        try {
            // InternalVideoGen.g:881:53: (iv_ruleNegateFilter= ruleNegateFilter EOF )
            // InternalVideoGen.g:882:2: iv_ruleNegateFilter= ruleNegateFilter EOF
            {
             newCompositeNode(grammarAccess.getNegateFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegateFilter=ruleNegateFilter();

            state._fsp--;

             current =iv_ruleNegateFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegateFilter"


    // $ANTLR start "ruleNegateFilter"
    // InternalVideoGen.g:888:1: ruleNegateFilter returns [EObject current=null] : ( () otherlv_1= 'negate' ) ;
    public final EObject ruleNegateFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVideoGen.g:894:2: ( ( () otherlv_1= 'negate' ) )
            // InternalVideoGen.g:895:2: ( () otherlv_1= 'negate' )
            {
            // InternalVideoGen.g:895:2: ( () otherlv_1= 'negate' )
            // InternalVideoGen.g:896:3: () otherlv_1= 'negate'
            {
            // InternalVideoGen.g:896:3: ()
            // InternalVideoGen.g:897:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNegateFilterAccess().getNegateFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNegateFilterAccess().getNegateKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegateFilter"


    // $ANTLR start "entryRuleFlipFilter"
    // InternalVideoGen.g:911:1: entryRuleFlipFilter returns [EObject current=null] : iv_ruleFlipFilter= ruleFlipFilter EOF ;
    public final EObject entryRuleFlipFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlipFilter = null;


        try {
            // InternalVideoGen.g:911:51: (iv_ruleFlipFilter= ruleFlipFilter EOF )
            // InternalVideoGen.g:912:2: iv_ruleFlipFilter= ruleFlipFilter EOF
            {
             newCompositeNode(grammarAccess.getFlipFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFlipFilter=ruleFlipFilter();

            state._fsp--;

             current =iv_ruleFlipFilter; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFlipFilter"


    // $ANTLR start "ruleFlipFilter"
    // InternalVideoGen.g:918:1: ruleFlipFilter returns [EObject current=null] : (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) ) ;
    public final EObject ruleFlipFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_orientation_1_1=null;
        Token lv_orientation_1_2=null;
        Token lv_orientation_1_3=null;
        Token lv_orientation_1_4=null;


        	enterRule();

        try {
            // InternalVideoGen.g:924:2: ( (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) ) )
            // InternalVideoGen.g:925:2: (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) )
            {
            // InternalVideoGen.g:925:2: (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) )
            // InternalVideoGen.g:926:3: otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getFlipFilterAccess().getFlipKeyword_0());
            		
            // InternalVideoGen.g:930:3: ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) )
            // InternalVideoGen.g:931:4: ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) )
            {
            // InternalVideoGen.g:931:4: ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) )
            // InternalVideoGen.g:932:5: (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' )
            {
            // InternalVideoGen.g:932:5: (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt20=1;
                }
                break;
            case 39:
                {
                alt20=2;
                }
                break;
            case 40:
                {
                alt20=3;
                }
                break;
            case 41:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalVideoGen.g:933:6: lv_orientation_1_1= 'h'
                    {
                    lv_orientation_1_1=(Token)match(input,38,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_1, grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:944:6: lv_orientation_1_2= 'horizontal'
                    {
                    lv_orientation_1_2=(Token)match(input,39,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_2, grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:955:6: lv_orientation_1_3= 'v'
                    {
                    lv_orientation_1_3=(Token)match(input,40,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_3, grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalVideoGen.g:966:6: lv_orientation_1_4= 'vertical'
                    {
                    lv_orientation_1_4=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_4, grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_4, null);
                    					

                    }
                    break;

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFlipFilter"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000380020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000001F800020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000001F000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000001E000020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000001C000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000018000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000700000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000082000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000003C000000000L});

}