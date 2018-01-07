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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PERCENTAGE", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'@author'", "'@version'", "'@creation'", "'mandatory'", "'optional'", "'alternatives'", "'image'", "'toptext'", "'bottomtext'", "'videoseq'", "'duration'", "'probability'", "'description'", "'filter'", "'text'", "'content'", "'position'", "'color'", "'size'", "'TOP'", "'BOTTOM'", "'CENTER'", "'b&w'", "'negate'", "'flip'", "'h'", "'horizontal'", "'v'", "'vertical'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=7;
    public static final int T__26=26;
    public static final int RULE_PERCENTAGE=9;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__37=37;
    public static final int RULE_RIGHT_BRACKET=5;
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
    public static final int RULE_WS=13;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__44=44;
    public static final int RULE_FLOAT=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalVideoGen.g:71:1: ruleVideoGeneratorModel returns [EObject current=null] : ( () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_medias_4_0= ruleMedia ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleVideoGeneratorModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token this_LEFT_BRACKET_3=null;
        Token this_RIGHT_BRACKET_5=null;
        EObject lv_information_1_0 = null;

        EObject lv_medias_4_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:77:2: ( ( () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_medias_4_0= ruleMedia ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:78:2: ( () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_medias_4_0= ruleMedia ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:78:2: ( () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_medias_4_0= ruleMedia ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:79:3: () ( (lv_information_1_0= ruleVideoGenInformation ) )? otherlv_2= 'VideoGen' this_LEFT_BRACKET_3= RULE_LEFT_BRACKET ( (lv_medias_4_0= ruleMedia ) )+ this_RIGHT_BRACKET_5= RULE_RIGHT_BRACKET
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
            		
            // InternalVideoGen.g:113:3: ( (lv_medias_4_0= ruleMedia ) )+
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
            	    // InternalVideoGen.g:114:4: (lv_medias_4_0= ruleMedia )
            	    {
            	    // InternalVideoGen.g:114:4: (lv_medias_4_0= ruleMedia )
            	    // InternalVideoGen.g:115:5: lv_medias_4_0= ruleMedia
            	    {

            	    					newCompositeNode(grammarAccess.getVideoGeneratorModelAccess().getMediasMediaParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_medias_4_0=ruleMedia();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getVideoGeneratorModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"medias",
            	    						lv_medias_4_0,
            	    						"org.xtext.example.mydsl.VideoGen.Media");
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


    // $ANTLR start "entryRuleMedia"
    // InternalVideoGen.g:238:1: entryRuleMedia returns [EObject current=null] : iv_ruleMedia= ruleMedia EOF ;
    public final EObject entryRuleMedia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedia = null;


        try {
            // InternalVideoGen.g:238:46: (iv_ruleMedia= ruleMedia EOF )
            // InternalVideoGen.g:239:2: iv_ruleMedia= ruleMedia EOF
            {
             newCompositeNode(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMedia=ruleMedia();

            state._fsp--;

             current =iv_ruleMedia; 
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
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // InternalVideoGen.g:245:1: ruleMedia returns [EObject current=null] : (this_Image_0= ruleImage | this_VideoSeq_1= ruleVideoSeq ) ;
    public final EObject ruleMedia() throws RecognitionException {
        EObject current = null;

        EObject this_Image_0 = null;

        EObject this_VideoSeq_1 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:251:2: ( (this_Image_0= ruleImage | this_VideoSeq_1= ruleVideoSeq ) )
            // InternalVideoGen.g:252:2: (this_Image_0= ruleImage | this_VideoSeq_1= ruleVideoSeq )
            {
            // InternalVideoGen.g:252:2: (this_Image_0= ruleImage | this_VideoSeq_1= ruleVideoSeq )
            int alt5=2;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==22) ) {
                    alt5=1;
                }
                else if ( (LA5_1==25) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==22) ) {
                    alt5=1;
                }
                else if ( (LA5_2==25) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==RULE_ID) ) {
                    int LA5_6 = input.LA(3);

                    if ( (LA5_6==RULE_LEFT_BRACKET) ) {
                        int LA5_7 = input.LA(4);

                        if ( (LA5_7==25) ) {
                            alt5=2;
                        }
                        else if ( (LA5_7==22) ) {
                            alt5=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA5_3==RULE_LEFT_BRACKET) ) {
                    int LA5_7 = input.LA(3);

                    if ( (LA5_7==25) ) {
                        alt5=2;
                    }
                    else if ( (LA5_7==22) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalVideoGen.g:253:3: this_Image_0= ruleImage
                    {

                    			newCompositeNode(grammarAccess.getMediaAccess().getImageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Image_0=ruleImage();

                    state._fsp--;


                    			current = this_Image_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:262:3: this_VideoSeq_1= ruleVideoSeq
                    {

                    			newCompositeNode(grammarAccess.getMediaAccess().getVideoSeqParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VideoSeq_1=ruleVideoSeq();

                    state._fsp--;


                    			current = this_VideoSeq_1;
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
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleImage"
    // InternalVideoGen.g:274:1: entryRuleImage returns [EObject current=null] : iv_ruleImage= ruleImage EOF ;
    public final EObject entryRuleImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImage = null;


        try {
            // InternalVideoGen.g:274:46: (iv_ruleImage= ruleImage EOF )
            // InternalVideoGen.g:275:2: iv_ruleImage= ruleImage EOF
            {
             newCompositeNode(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImage=ruleImage();

            state._fsp--;

             current =iv_ruleImage; 
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
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalVideoGen.g:281:1: ruleImage returns [EObject current=null] : (this_MandatoryImage_0= ruleMandatoryImage | this_OptionalImage_1= ruleOptionalImage | this_AlternativeImage_2= ruleAlternativeImage ) ;
    public final EObject ruleImage() throws RecognitionException {
        EObject current = null;

        EObject this_MandatoryImage_0 = null;

        EObject this_OptionalImage_1 = null;

        EObject this_AlternativeImage_2 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:287:2: ( (this_MandatoryImage_0= ruleMandatoryImage | this_OptionalImage_1= ruleOptionalImage | this_AlternativeImage_2= ruleAlternativeImage ) )
            // InternalVideoGen.g:288:2: (this_MandatoryImage_0= ruleMandatoryImage | this_OptionalImage_1= ruleOptionalImage | this_AlternativeImage_2= ruleAlternativeImage )
            {
            // InternalVideoGen.g:288:2: (this_MandatoryImage_0= ruleMandatoryImage | this_OptionalImage_1= ruleOptionalImage | this_AlternativeImage_2= ruleAlternativeImage )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVideoGen.g:289:3: this_MandatoryImage_0= ruleMandatoryImage
                    {

                    			newCompositeNode(grammarAccess.getImageAccess().getMandatoryImageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MandatoryImage_0=ruleMandatoryImage();

                    state._fsp--;


                    			current = this_MandatoryImage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:298:3: this_OptionalImage_1= ruleOptionalImage
                    {

                    			newCompositeNode(grammarAccess.getImageAccess().getOptionalImageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OptionalImage_1=ruleOptionalImage();

                    state._fsp--;


                    			current = this_OptionalImage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:307:3: this_AlternativeImage_2= ruleAlternativeImage
                    {

                    			newCompositeNode(grammarAccess.getImageAccess().getAlternativeImageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_AlternativeImage_2=ruleAlternativeImage();

                    state._fsp--;


                    			current = this_AlternativeImage_2;
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
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleMandatoryImage"
    // InternalVideoGen.g:319:1: entryRuleMandatoryImage returns [EObject current=null] : iv_ruleMandatoryImage= ruleMandatoryImage EOF ;
    public final EObject entryRuleMandatoryImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryImage = null;


        try {
            // InternalVideoGen.g:319:55: (iv_ruleMandatoryImage= ruleMandatoryImage EOF )
            // InternalVideoGen.g:320:2: iv_ruleMandatoryImage= ruleMandatoryImage EOF
            {
             newCompositeNode(grammarAccess.getMandatoryImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMandatoryImage=ruleMandatoryImage();

            state._fsp--;

             current =iv_ruleMandatoryImage; 
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
    // $ANTLR end "entryRuleMandatoryImage"


    // $ANTLR start "ruleMandatoryImage"
    // InternalVideoGen.g:326:1: ruleMandatoryImage returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleImageDescription ) ) ) ;
    public final EObject ruleMandatoryImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:332:2: ( (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleImageDescription ) ) ) )
            // InternalVideoGen.g:333:2: (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleImageDescription ) ) )
            {
            // InternalVideoGen.g:333:2: (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleImageDescription ) ) )
            // InternalVideoGen.g:334:3: otherlv_0= 'mandatory' ( (lv_description_1_0= ruleImageDescription ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getMandatoryImageAccess().getMandatoryKeyword_0());
            		
            // InternalVideoGen.g:338:3: ( (lv_description_1_0= ruleImageDescription ) )
            // InternalVideoGen.g:339:4: (lv_description_1_0= ruleImageDescription )
            {
            // InternalVideoGen.g:339:4: (lv_description_1_0= ruleImageDescription )
            // InternalVideoGen.g:340:5: lv_description_1_0= ruleImageDescription
            {

            					newCompositeNode(grammarAccess.getMandatoryImageAccess().getDescriptionImageDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_1_0=ruleImageDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMandatoryImageRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.xtext.example.mydsl.VideoGen.ImageDescription");
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
    // $ANTLR end "ruleMandatoryImage"


    // $ANTLR start "entryRuleOptionalImage"
    // InternalVideoGen.g:361:1: entryRuleOptionalImage returns [EObject current=null] : iv_ruleOptionalImage= ruleOptionalImage EOF ;
    public final EObject entryRuleOptionalImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalImage = null;


        try {
            // InternalVideoGen.g:361:54: (iv_ruleOptionalImage= ruleOptionalImage EOF )
            // InternalVideoGen.g:362:2: iv_ruleOptionalImage= ruleOptionalImage EOF
            {
             newCompositeNode(grammarAccess.getOptionalImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOptionalImage=ruleOptionalImage();

            state._fsp--;

             current =iv_ruleOptionalImage; 
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
    // $ANTLR end "entryRuleOptionalImage"


    // $ANTLR start "ruleOptionalImage"
    // InternalVideoGen.g:368:1: ruleOptionalImage returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_description_1_0= ruleImageDescription ) ) ) ;
    public final EObject ruleOptionalImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:374:2: ( (otherlv_0= 'optional' ( (lv_description_1_0= ruleImageDescription ) ) ) )
            // InternalVideoGen.g:375:2: (otherlv_0= 'optional' ( (lv_description_1_0= ruleImageDescription ) ) )
            {
            // InternalVideoGen.g:375:2: (otherlv_0= 'optional' ( (lv_description_1_0= ruleImageDescription ) ) )
            // InternalVideoGen.g:376:3: otherlv_0= 'optional' ( (lv_description_1_0= ruleImageDescription ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionalImageAccess().getOptionalKeyword_0());
            		
            // InternalVideoGen.g:380:3: ( (lv_description_1_0= ruleImageDescription ) )
            // InternalVideoGen.g:381:4: (lv_description_1_0= ruleImageDescription )
            {
            // InternalVideoGen.g:381:4: (lv_description_1_0= ruleImageDescription )
            // InternalVideoGen.g:382:5: lv_description_1_0= ruleImageDescription
            {

            					newCompositeNode(grammarAccess.getOptionalImageAccess().getDescriptionImageDescriptionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_description_1_0=ruleImageDescription();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOptionalImageRule());
            					}
            					set(
            						current,
            						"description",
            						lv_description_1_0,
            						"org.xtext.example.mydsl.VideoGen.ImageDescription");
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
    // $ANTLR end "ruleOptionalImage"


    // $ANTLR start "entryRuleAlternativeImage"
    // InternalVideoGen.g:403:1: entryRuleAlternativeImage returns [EObject current=null] : iv_ruleAlternativeImage= ruleAlternativeImage EOF ;
    public final EObject entryRuleAlternativeImage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeImage = null;


        try {
            // InternalVideoGen.g:403:57: (iv_ruleAlternativeImage= ruleAlternativeImage EOF )
            // InternalVideoGen.g:404:2: iv_ruleAlternativeImage= ruleAlternativeImage EOF
            {
             newCompositeNode(grammarAccess.getAlternativeImageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlternativeImage=ruleAlternativeImage();

            state._fsp--;

             current =iv_ruleAlternativeImage; 
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
    // $ANTLR end "entryRuleAlternativeImage"


    // $ANTLR start "ruleAlternativeImage"
    // InternalVideoGen.g:410:1: ruleAlternativeImage returns [EObject current=null] : (otherlv_0= 'alternatives' ( (lv_imageid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_images_3_0= ruleImageDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleAlternativeImage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_imageid_1_0=null;
        Token this_LEFT_BRACKET_2=null;
        Token this_RIGHT_BRACKET_4=null;
        EObject lv_images_3_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:416:2: ( (otherlv_0= 'alternatives' ( (lv_imageid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_images_3_0= ruleImageDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:417:2: (otherlv_0= 'alternatives' ( (lv_imageid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_images_3_0= ruleImageDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:417:2: (otherlv_0= 'alternatives' ( (lv_imageid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_images_3_0= ruleImageDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:418:3: otherlv_0= 'alternatives' ( (lv_imageid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_images_3_0= ruleImageDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativeImageAccess().getAlternativesKeyword_0());
            		
            // InternalVideoGen.g:422:3: ( (lv_imageid_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoGen.g:423:4: (lv_imageid_1_0= RULE_ID )
                    {
                    // InternalVideoGen.g:423:4: (lv_imageid_1_0= RULE_ID )
                    // InternalVideoGen.g:424:5: lv_imageid_1_0= RULE_ID
                    {
                    lv_imageid_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

                    					newLeafNode(lv_imageid_1_0, grammarAccess.getAlternativeImageAccess().getImageidIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getAlternativeImageRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"imageid",
                    						lv_imageid_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_10); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getAlternativeImageAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            // InternalVideoGen.g:444:3: ( (lv_images_3_0= ruleImageDescription ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVideoGen.g:445:4: (lv_images_3_0= ruleImageDescription )
            	    {
            	    // InternalVideoGen.g:445:4: (lv_images_3_0= ruleImageDescription )
            	    // InternalVideoGen.g:446:5: lv_images_3_0= ruleImageDescription
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativeImageAccess().getImagesImageDescriptionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_images_3_0=ruleImageDescription();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAlternativeImageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"images",
            	    						lv_images_3_0,
            	    						"org.xtext.example.mydsl.VideoGen.ImageDescription");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            this_RIGHT_BRACKET_4=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

            			newLeafNode(this_RIGHT_BRACKET_4, grammarAccess.getAlternativeImageAccess().getRIGHT_BRACKETTerminalRuleCall_4());
            		

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
    // $ANTLR end "ruleAlternativeImage"


    // $ANTLR start "entryRuleImageDescription"
    // InternalVideoGen.g:471:1: entryRuleImageDescription returns [EObject current=null] : iv_ruleImageDescription= ruleImageDescription EOF ;
    public final EObject entryRuleImageDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageDescription = null;


        try {
            // InternalVideoGen.g:471:57: (iv_ruleImageDescription= ruleImageDescription EOF )
            // InternalVideoGen.g:472:2: iv_ruleImageDescription= ruleImageDescription EOF
            {
             newCompositeNode(grammarAccess.getImageDescriptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImageDescription=ruleImageDescription();

            state._fsp--;

             current =iv_ruleImageDescription; 
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
    // $ANTLR end "entryRuleImageDescription"


    // $ANTLR start "ruleImageDescription"
    // InternalVideoGen.g:478:1: ruleImageDescription returns [EObject current=null] : (otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )? ) ;
    public final EObject ruleImageDescription() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_imageid_1_0=null;
        Token lv_location_2_0=null;
        Token this_LEFT_BRACKET_3=null;
        Token otherlv_4=null;
        Token lv_top_5_0=null;
        Token otherlv_6=null;
        Token lv_bottom_7_0=null;
        Token this_RIGHT_BRACKET_8=null;


        	enterRule();

        try {
            // InternalVideoGen.g:484:2: ( (otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )? ) )
            // InternalVideoGen.g:485:2: (otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )? )
            {
            // InternalVideoGen.g:485:2: (otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )? )
            // InternalVideoGen.g:486:3: otherlv_0= 'image' ( (lv_imageid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getImageDescriptionAccess().getImageKeyword_0());
            		
            // InternalVideoGen.g:490:3: ( (lv_imageid_1_0= RULE_ID ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoGen.g:491:4: (lv_imageid_1_0= RULE_ID )
                    {
                    // InternalVideoGen.g:491:4: (lv_imageid_1_0= RULE_ID )
                    // InternalVideoGen.g:492:5: lv_imageid_1_0= RULE_ID
                    {
                    lv_imageid_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    					newLeafNode(lv_imageid_1_0, grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getImageDescriptionRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"imageid",
                    						lv_imageid_1_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalVideoGen.g:508:3: ( (lv_location_2_0= RULE_STRING ) )
            // InternalVideoGen.g:509:4: (lv_location_2_0= RULE_STRING )
            {
            // InternalVideoGen.g:509:4: (lv_location_2_0= RULE_STRING )
            // InternalVideoGen.g:510:5: lv_location_2_0= RULE_STRING
            {
            lv_location_2_0=(Token)match(input,RULE_STRING,FOLLOW_14); 

            					newLeafNode(lv_location_2_0, grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImageDescriptionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalVideoGen.g:526:3: (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_LEFT_BRACKET) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoGen.g:527:4: this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) ) (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) ) this_RIGHT_BRACKET_8= RULE_RIGHT_BRACKET
                    {
                    this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_15); 

                    				newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0());
                    			
                    // InternalVideoGen.g:531:4: (otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) ) )
                    // InternalVideoGen.g:532:5: otherlv_4= 'toptext' ( (lv_top_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_7); 

                    					newLeafNode(otherlv_4, grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0());
                    				
                    // InternalVideoGen.g:536:5: ( (lv_top_5_0= RULE_STRING ) )
                    // InternalVideoGen.g:537:6: (lv_top_5_0= RULE_STRING )
                    {
                    // InternalVideoGen.g:537:6: (lv_top_5_0= RULE_STRING )
                    // InternalVideoGen.g:538:7: lv_top_5_0= RULE_STRING
                    {
                    lv_top_5_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    							newLeafNode(lv_top_5_0, grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImageDescriptionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"top",
                    								lv_top_5_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }

                    // InternalVideoGen.g:555:4: (otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) ) )
                    // InternalVideoGen.g:556:5: otherlv_6= 'bottomtext' ( (lv_bottom_7_0= RULE_STRING ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_7); 

                    					newLeafNode(otherlv_6, grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0());
                    				
                    // InternalVideoGen.g:560:5: ( (lv_bottom_7_0= RULE_STRING ) )
                    // InternalVideoGen.g:561:6: (lv_bottom_7_0= RULE_STRING )
                    {
                    // InternalVideoGen.g:561:6: (lv_bottom_7_0= RULE_STRING )
                    // InternalVideoGen.g:562:7: lv_bottom_7_0= RULE_STRING
                    {
                    lv_bottom_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

                    							newLeafNode(lv_bottom_7_0, grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getImageDescriptionRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"bottom",
                    								lv_bottom_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }


                    }

                    this_RIGHT_BRACKET_8=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

                    				newLeafNode(this_RIGHT_BRACKET_8, grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3());
                    			

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
    // $ANTLR end "ruleImageDescription"


    // $ANTLR start "entryRuleVideoSeq"
    // InternalVideoGen.g:588:1: entryRuleVideoSeq returns [EObject current=null] : iv_ruleVideoSeq= ruleVideoSeq EOF ;
    public final EObject entryRuleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoSeq = null;


        try {
            // InternalVideoGen.g:588:49: (iv_ruleVideoSeq= ruleVideoSeq EOF )
            // InternalVideoGen.g:589:2: iv_ruleVideoSeq= ruleVideoSeq EOF
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
    // InternalVideoGen.g:595:1: ruleVideoSeq returns [EObject current=null] : (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq ) ;
    public final EObject ruleVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject this_MandatoryVideoSeq_0 = null;

        EObject this_OptionalVideoSeq_1 = null;

        EObject this_AlternativeVideoSeq_2 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:601:2: ( (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq ) )
            // InternalVideoGen.g:602:2: (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq )
            {
            // InternalVideoGen.g:602:2: (this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq | this_OptionalVideoSeq_1= ruleOptionalVideoSeq | this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt11=1;
                }
                break;
            case 20:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalVideoGen.g:603:3: this_MandatoryVideoSeq_0= ruleMandatoryVideoSeq
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
                    // InternalVideoGen.g:612:3: this_OptionalVideoSeq_1= ruleOptionalVideoSeq
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
                    // InternalVideoGen.g:621:3: this_AlternativeVideoSeq_2= ruleAlternativeVideoSeq
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
    // InternalVideoGen.g:633:1: entryRuleMandatoryVideoSeq returns [EObject current=null] : iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF ;
    public final EObject entryRuleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatoryVideoSeq = null;


        try {
            // InternalVideoGen.g:633:58: (iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF )
            // InternalVideoGen.g:634:2: iv_ruleMandatoryVideoSeq= ruleMandatoryVideoSeq EOF
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
    // InternalVideoGen.g:640:1: ruleMandatoryVideoSeq returns [EObject current=null] : (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) ) ) ;
    public final EObject ruleMandatoryVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:646:2: ( (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) ) ) )
            // InternalVideoGen.g:647:2: (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) ) )
            {
            // InternalVideoGen.g:647:2: (otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) ) )
            // InternalVideoGen.g:648:3: otherlv_0= 'mandatory' ( (lv_description_1_0= ruleVideoDescription ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0());
            		
            // InternalVideoGen.g:652:3: ( (lv_description_1_0= ruleVideoDescription ) )
            // InternalVideoGen.g:653:4: (lv_description_1_0= ruleVideoDescription )
            {
            // InternalVideoGen.g:653:4: (lv_description_1_0= ruleVideoDescription )
            // InternalVideoGen.g:654:5: lv_description_1_0= ruleVideoDescription
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
    // InternalVideoGen.g:675:1: entryRuleOptionalVideoSeq returns [EObject current=null] : iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF ;
    public final EObject entryRuleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptionalVideoSeq = null;


        try {
            // InternalVideoGen.g:675:57: (iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF )
            // InternalVideoGen.g:676:2: iv_ruleOptionalVideoSeq= ruleOptionalVideoSeq EOF
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
    // InternalVideoGen.g:682:1: ruleOptionalVideoSeq returns [EObject current=null] : (otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) ) ) ;
    public final EObject ruleOptionalVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_description_1_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:688:2: ( (otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) ) ) )
            // InternalVideoGen.g:689:2: (otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) ) )
            {
            // InternalVideoGen.g:689:2: (otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) ) )
            // InternalVideoGen.g:690:3: otherlv_0= 'optional' ( (lv_description_1_0= ruleVideoDescription ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0());
            		
            // InternalVideoGen.g:694:3: ( (lv_description_1_0= ruleVideoDescription ) )
            // InternalVideoGen.g:695:4: (lv_description_1_0= ruleVideoDescription )
            {
            // InternalVideoGen.g:695:4: (lv_description_1_0= ruleVideoDescription )
            // InternalVideoGen.g:696:5: lv_description_1_0= ruleVideoDescription
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
    // InternalVideoGen.g:717:1: entryRuleAlternativeVideoSeq returns [EObject current=null] : iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF ;
    public final EObject entryRuleAlternativeVideoSeq() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternativeVideoSeq = null;


        try {
            // InternalVideoGen.g:717:60: (iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF )
            // InternalVideoGen.g:718:2: iv_ruleAlternativeVideoSeq= ruleAlternativeVideoSeq EOF
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
    // InternalVideoGen.g:724:1: ruleAlternativeVideoSeq returns [EObject current=null] : (otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleAlternativeVideoSeq() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_videoid_1_0=null;
        Token this_LEFT_BRACKET_2=null;
        Token this_RIGHT_BRACKET_4=null;
        EObject lv_videodescs_3_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:730:2: ( (otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:731:2: (otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:731:2: (otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:732:3: otherlv_0= 'alternatives' ( (lv_videoid_1_0= RULE_ID ) )? this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_videodescs_3_0= ruleVideoDescription ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getAlternativeVideoSeqAccess().getAlternativesKeyword_0());
            		
            // InternalVideoGen.g:736:3: ( (lv_videoid_1_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalVideoGen.g:737:4: (lv_videoid_1_0= RULE_ID )
                    {
                    // InternalVideoGen.g:737:4: (lv_videoid_1_0= RULE_ID )
                    // InternalVideoGen.g:738:5: lv_videoid_1_0= RULE_ID
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

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_18); 

            			newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2());
            		
            // InternalVideoGen.g:758:3: ( (lv_videodescs_3_0= ruleVideoDescription ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==25) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalVideoGen.g:759:4: (lv_videodescs_3_0= ruleVideoDescription )
            	    {
            	    // InternalVideoGen.g:759:4: (lv_videodescs_3_0= ruleVideoDescription )
            	    // InternalVideoGen.g:760:5: lv_videodescs_3_0= ruleVideoDescription
            	    {

            	    					newCompositeNode(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsVideoDescriptionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_19);
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
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
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
    // InternalVideoGen.g:785:1: entryRuleVideoDescription returns [EObject current=null] : iv_ruleVideoDescription= ruleVideoDescription EOF ;
    public final EObject entryRuleVideoDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoDescription = null;


        try {
            // InternalVideoGen.g:785:57: (iv_ruleVideoDescription= ruleVideoDescription EOF )
            // InternalVideoGen.g:786:2: iv_ruleVideoDescription= ruleVideoDescription EOF
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
    // InternalVideoGen.g:792:1: ruleVideoDescription returns [EObject current=null] : (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )? ) ;
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
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_RIGHT_BRACKET_14=null;
        EObject lv_filter_11_0 = null;

        EObject lv_text_13_0 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:798:2: ( (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )? ) )
            // InternalVideoGen.g:799:2: (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )? )
            {
            // InternalVideoGen.g:799:2: (otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )? )
            // InternalVideoGen.g:800:3: otherlv_0= 'videoseq' ( (lv_videoid_1_0= RULE_ID ) )? ( (lv_location_2_0= RULE_STRING ) ) (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0());
            		
            // InternalVideoGen.g:804:3: ( (lv_videoid_1_0= RULE_ID ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVideoGen.g:805:4: (lv_videoid_1_0= RULE_ID )
                    {
                    // InternalVideoGen.g:805:4: (lv_videoid_1_0= RULE_ID )
                    // InternalVideoGen.g:806:5: lv_videoid_1_0= RULE_ID
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

            // InternalVideoGen.g:822:3: ( (lv_location_2_0= RULE_STRING ) )
            // InternalVideoGen.g:823:4: (lv_location_2_0= RULE_STRING )
            {
            // InternalVideoGen.g:823:4: (lv_location_2_0= RULE_STRING )
            // InternalVideoGen.g:824:5: lv_location_2_0= RULE_STRING
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

            // InternalVideoGen.g:840:3: (this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_LEFT_BRACKET) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoGen.g:841:4: this_LEFT_BRACKET_3= RULE_LEFT_BRACKET (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )? (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) ) )? (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )? (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )? (otherlv_12= 'text' ( (lv_text_13_0= ruleText ) ) )? this_RIGHT_BRACKET_14= RULE_RIGHT_BRACKET
                    {
                    this_LEFT_BRACKET_3=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_20); 

                    				newLeafNode(this_LEFT_BRACKET_3, grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0());
                    			
                    // InternalVideoGen.g:845:4: (otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) ) )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==26) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalVideoGen.g:846:5: otherlv_4= 'duration' ( (lv_duration_5_0= RULE_INT ) )
                            {
                            otherlv_4=(Token)match(input,26,FOLLOW_21); 

                            					newLeafNode(otherlv_4, grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0());
                            				
                            // InternalVideoGen.g:850:5: ( (lv_duration_5_0= RULE_INT ) )
                            // InternalVideoGen.g:851:6: (lv_duration_5_0= RULE_INT )
                            {
                            // InternalVideoGen.g:851:6: (lv_duration_5_0= RULE_INT )
                            // InternalVideoGen.g:852:7: lv_duration_5_0= RULE_INT
                            {
                            lv_duration_5_0=(Token)match(input,RULE_INT,FOLLOW_22); 

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

                    // InternalVideoGen.g:869:4: (otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) ) )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==27) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalVideoGen.g:870:5: otherlv_6= 'probability' ( (lv_probability_7_0= RULE_PERCENTAGE ) )
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_23); 

                            					newLeafNode(otherlv_6, grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0());
                            				
                            // InternalVideoGen.g:874:5: ( (lv_probability_7_0= RULE_PERCENTAGE ) )
                            // InternalVideoGen.g:875:6: (lv_probability_7_0= RULE_PERCENTAGE )
                            {
                            // InternalVideoGen.g:875:6: (lv_probability_7_0= RULE_PERCENTAGE )
                            // InternalVideoGen.g:876:7: lv_probability_7_0= RULE_PERCENTAGE
                            {
                            lv_probability_7_0=(Token)match(input,RULE_PERCENTAGE,FOLLOW_24); 

                            							newLeafNode(lv_probability_7_0, grammarAccess.getVideoDescriptionAccess().getProbabilityPERCENTAGETerminalRuleCall_3_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"probability",
                            								lv_probability_7_0,
                            								"org.xtext.example.mydsl.VideoGen.PERCENTAGE");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalVideoGen.g:893:4: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==28) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalVideoGen.g:894:5: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) )
                            {
                            otherlv_8=(Token)match(input,28,FOLLOW_7); 

                            					newLeafNode(otherlv_8, grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0());
                            				
                            // InternalVideoGen.g:898:5: ( (lv_description_9_0= RULE_STRING ) )
                            // InternalVideoGen.g:899:6: (lv_description_9_0= RULE_STRING )
                            {
                            // InternalVideoGen.g:899:6: (lv_description_9_0= RULE_STRING )
                            // InternalVideoGen.g:900:7: lv_description_9_0= RULE_STRING
                            {
                            lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                            							newLeafNode(lv_description_9_0, grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getVideoDescriptionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"description",
                            								lv_description_9_0,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalVideoGen.g:917:4: (otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==29) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalVideoGen.g:918:5: otherlv_10= 'filter' ( (lv_filter_11_0= ruleFilter ) )
                            {
                            otherlv_10=(Token)match(input,29,FOLLOW_26); 

                            					newLeafNode(otherlv_10, grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0());
                            				
                            // InternalVideoGen.g:922:5: ( (lv_filter_11_0= ruleFilter ) )
                            // InternalVideoGen.g:923:6: (lv_filter_11_0= ruleFilter )
                            {
                            // InternalVideoGen.g:923:6: (lv_filter_11_0= ruleFilter )
                            // InternalVideoGen.g:924:7: lv_filter_11_0= ruleFilter
                            {

                            							newCompositeNode(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0());
                            						
                            pushFollow(FOLLOW_27);
                            lv_filter_11_0=ruleFilter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVideoDescriptionRule());
                            							}
                            							set(
                            								current,
                            								"filter",
                            								lv_filter_11_0,
                            								"org.xtext.example.mydsl.VideoGen.Filter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    // InternalVideoGen.g:942:4: (otherlv_12= 'text' ( (lv_text_13_0= ruleText ) ) )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==30) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalVideoGen.g:943:5: otherlv_12= 'text' ( (lv_text_13_0= ruleText ) )
                            {
                            otherlv_12=(Token)match(input,30,FOLLOW_4); 

                            					newLeafNode(otherlv_12, grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0());
                            				
                            // InternalVideoGen.g:947:5: ( (lv_text_13_0= ruleText ) )
                            // InternalVideoGen.g:948:6: (lv_text_13_0= ruleText )
                            {
                            // InternalVideoGen.g:948:6: (lv_text_13_0= ruleText )
                            // InternalVideoGen.g:949:7: lv_text_13_0= ruleText
                            {

                            							newCompositeNode(grammarAccess.getVideoDescriptionAccess().getTextTextParserRuleCall_3_5_1_0());
                            						
                            pushFollow(FOLLOW_17);
                            lv_text_13_0=ruleText();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getVideoDescriptionRule());
                            							}
                            							set(
                            								current,
                            								"text",
                            								lv_text_13_0,
                            								"org.xtext.example.mydsl.VideoGen.Text");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    this_RIGHT_BRACKET_14=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 

                    				newLeafNode(this_RIGHT_BRACKET_14, grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6());
                    			

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
    // InternalVideoGen.g:976:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalVideoGen.g:976:45: (iv_ruleText= ruleText EOF )
            // InternalVideoGen.g:977:2: iv_ruleText= ruleText EOF
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
    // InternalVideoGen.g:983:1: ruleText returns [EObject current=null] : (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET ) ;
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
            // InternalVideoGen.g:989:2: ( (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:990:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:990:2: (this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:991:3: this_LEFT_BRACKET_0= RULE_LEFT_BRACKET otherlv_1= 'content' ( (lv_content_2_0= RULE_STRING ) ) otherlv_3= 'position' ( (lv_position_4_0= rulePosition ) ) (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )? (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )? this_RIGHT_BRACKET_9= RULE_RIGHT_BRACKET
            {
            this_LEFT_BRACKET_0=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_28); 

            			newLeafNode(this_LEFT_BRACKET_0, grammarAccess.getTextAccess().getLEFT_BRACKETTerminalRuleCall_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTextAccess().getContentKeyword_1());
            		
            // InternalVideoGen.g:999:3: ( (lv_content_2_0= RULE_STRING ) )
            // InternalVideoGen.g:1000:4: (lv_content_2_0= RULE_STRING )
            {
            // InternalVideoGen.g:1000:4: (lv_content_2_0= RULE_STRING )
            // InternalVideoGen.g:1001:5: lv_content_2_0= RULE_STRING
            {
            lv_content_2_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

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

            otherlv_3=(Token)match(input,32,FOLLOW_30); 

            			newLeafNode(otherlv_3, grammarAccess.getTextAccess().getPositionKeyword_3());
            		
            // InternalVideoGen.g:1021:3: ( (lv_position_4_0= rulePosition ) )
            // InternalVideoGen.g:1022:4: (lv_position_4_0= rulePosition )
            {
            // InternalVideoGen.g:1022:4: (lv_position_4_0= rulePosition )
            // InternalVideoGen.g:1023:5: lv_position_4_0= rulePosition
            {

            					newCompositeNode(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalVideoGen.g:1040:3: (otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVideoGen.g:1041:4: otherlv_5= 'color' ( (lv_color_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,33,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getTextAccess().getColorKeyword_5_0());
                    			
                    // InternalVideoGen.g:1045:4: ( (lv_color_6_0= RULE_STRING ) )
                    // InternalVideoGen.g:1046:5: (lv_color_6_0= RULE_STRING )
                    {
                    // InternalVideoGen.g:1046:5: (lv_color_6_0= RULE_STRING )
                    // InternalVideoGen.g:1047:6: lv_color_6_0= RULE_STRING
                    {
                    lv_color_6_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

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

            // InternalVideoGen.g:1064:3: (otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==34) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoGen.g:1065:4: otherlv_7= 'size' ( (lv_size_8_0= RULE_INT ) )
                    {
                    otherlv_7=(Token)match(input,34,FOLLOW_21); 

                    				newLeafNode(otherlv_7, grammarAccess.getTextAccess().getSizeKeyword_6_0());
                    			
                    // InternalVideoGen.g:1069:4: ( (lv_size_8_0= RULE_INT ) )
                    // InternalVideoGen.g:1070:5: (lv_size_8_0= RULE_INT )
                    {
                    // InternalVideoGen.g:1070:5: (lv_size_8_0= RULE_INT )
                    // InternalVideoGen.g:1071:6: lv_size_8_0= RULE_INT
                    {
                    lv_size_8_0=(Token)match(input,RULE_INT,FOLLOW_17); 

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
    // InternalVideoGen.g:1096:1: entryRulePosition returns [String current=null] : iv_rulePosition= rulePosition EOF ;
    public final String entryRulePosition() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePosition = null;


        try {
            // InternalVideoGen.g:1096:48: (iv_rulePosition= rulePosition EOF )
            // InternalVideoGen.g:1097:2: iv_rulePosition= rulePosition EOF
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
    // InternalVideoGen.g:1103:1: rulePosition returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' ) ;
    public final AntlrDatatypeRuleToken rulePosition() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalVideoGen.g:1109:2: ( (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' ) )
            // InternalVideoGen.g:1110:2: (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' )
            {
            // InternalVideoGen.g:1110:2: (kw= 'TOP' | kw= 'BOTTOM' | kw= 'CENTER' )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case 37:
                {
                alt23=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalVideoGen.g:1111:3: kw= 'TOP'
                    {
                    kw=(Token)match(input,35,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getTOPKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:1117:3: kw= 'BOTTOM'
                    {
                    kw=(Token)match(input,36,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPositionAccess().getBOTTOMKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:1123:3: kw= 'CENTER'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

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
    // InternalVideoGen.g:1132:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalVideoGen.g:1132:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalVideoGen.g:1133:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalVideoGen.g:1139:1: ruleFilter returns [EObject current=null] : (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter ) ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_FlipFilter_0 = null;

        EObject this_NegateFilter_1 = null;

        EObject this_BlackWhiteFilter_2 = null;



        	enterRule();

        try {
            // InternalVideoGen.g:1145:2: ( (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter ) )
            // InternalVideoGen.g:1146:2: (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter )
            {
            // InternalVideoGen.g:1146:2: (this_FlipFilter_0= ruleFlipFilter | this_NegateFilter_1= ruleNegateFilter | this_BlackWhiteFilter_2= ruleBlackWhiteFilter )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt24=1;
                }
                break;
            case 39:
                {
                alt24=2;
                }
                break;
            case 38:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalVideoGen.g:1147:3: this_FlipFilter_0= ruleFlipFilter
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
                    // InternalVideoGen.g:1156:3: this_NegateFilter_1= ruleNegateFilter
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
                    // InternalVideoGen.g:1165:3: this_BlackWhiteFilter_2= ruleBlackWhiteFilter
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
    // InternalVideoGen.g:1177:1: entryRuleBlackWhiteFilter returns [EObject current=null] : iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF ;
    public final EObject entryRuleBlackWhiteFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlackWhiteFilter = null;


        try {
            // InternalVideoGen.g:1177:57: (iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF )
            // InternalVideoGen.g:1178:2: iv_ruleBlackWhiteFilter= ruleBlackWhiteFilter EOF
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
    // InternalVideoGen.g:1184:1: ruleBlackWhiteFilter returns [EObject current=null] : ( () otherlv_1= 'b&w' ) ;
    public final EObject ruleBlackWhiteFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVideoGen.g:1190:2: ( ( () otherlv_1= 'b&w' ) )
            // InternalVideoGen.g:1191:2: ( () otherlv_1= 'b&w' )
            {
            // InternalVideoGen.g:1191:2: ( () otherlv_1= 'b&w' )
            // InternalVideoGen.g:1192:3: () otherlv_1= 'b&w'
            {
            // InternalVideoGen.g:1192:3: ()
            // InternalVideoGen.g:1193:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_2); 

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
    // InternalVideoGen.g:1207:1: entryRuleNegateFilter returns [EObject current=null] : iv_ruleNegateFilter= ruleNegateFilter EOF ;
    public final EObject entryRuleNegateFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegateFilter = null;


        try {
            // InternalVideoGen.g:1207:53: (iv_ruleNegateFilter= ruleNegateFilter EOF )
            // InternalVideoGen.g:1208:2: iv_ruleNegateFilter= ruleNegateFilter EOF
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
    // InternalVideoGen.g:1214:1: ruleNegateFilter returns [EObject current=null] : ( () otherlv_1= 'negate' ) ;
    public final EObject ruleNegateFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalVideoGen.g:1220:2: ( ( () otherlv_1= 'negate' ) )
            // InternalVideoGen.g:1221:2: ( () otherlv_1= 'negate' )
            {
            // InternalVideoGen.g:1221:2: ( () otherlv_1= 'negate' )
            // InternalVideoGen.g:1222:3: () otherlv_1= 'negate'
            {
            // InternalVideoGen.g:1222:3: ()
            // InternalVideoGen.g:1223:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNegateFilterAccess().getNegateFilterAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,39,FOLLOW_2); 

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
    // InternalVideoGen.g:1237:1: entryRuleFlipFilter returns [EObject current=null] : iv_ruleFlipFilter= ruleFlipFilter EOF ;
    public final EObject entryRuleFlipFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlipFilter = null;


        try {
            // InternalVideoGen.g:1237:51: (iv_ruleFlipFilter= ruleFlipFilter EOF )
            // InternalVideoGen.g:1238:2: iv_ruleFlipFilter= ruleFlipFilter EOF
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
    // InternalVideoGen.g:1244:1: ruleFlipFilter returns [EObject current=null] : (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) ) ;
    public final EObject ruleFlipFilter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_orientation_1_1=null;
        Token lv_orientation_1_2=null;
        Token lv_orientation_1_3=null;
        Token lv_orientation_1_4=null;


        	enterRule();

        try {
            // InternalVideoGen.g:1250:2: ( (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) ) )
            // InternalVideoGen.g:1251:2: (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) )
            {
            // InternalVideoGen.g:1251:2: (otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) ) )
            // InternalVideoGen.g:1252:3: otherlv_0= 'flip' ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getFlipFilterAccess().getFlipKeyword_0());
            		
            // InternalVideoGen.g:1256:3: ( ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) ) )
            // InternalVideoGen.g:1257:4: ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) )
            {
            // InternalVideoGen.g:1257:4: ( (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' ) )
            // InternalVideoGen.g:1258:5: (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' )
            {
            // InternalVideoGen.g:1258:5: (lv_orientation_1_1= 'h' | lv_orientation_1_2= 'horizontal' | lv_orientation_1_3= 'v' | lv_orientation_1_4= 'vertical' )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt25=1;
                }
                break;
            case 42:
                {
                alt25=2;
                }
                break;
            case 43:
                {
                alt25=3;
                }
                break;
            case 44:
                {
                alt25=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalVideoGen.g:1259:6: lv_orientation_1_1= 'h'
                    {
                    lv_orientation_1_1=(Token)match(input,41,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_1, grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_1, null);
                    					

                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:1270:6: lv_orientation_1_2= 'horizontal'
                    {
                    lv_orientation_1_2=(Token)match(input,42,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_2, grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_2, null);
                    					

                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:1281:6: lv_orientation_1_3= 'v'
                    {
                    lv_orientation_1_3=(Token)match(input,43,FOLLOW_2); 

                    						newLeafNode(lv_orientation_1_3, grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFlipFilterRule());
                    						}
                    						setWithLastConsumed(current, "orientation", lv_orientation_1_3, null);
                    					

                    }
                    break;
                case 4 :
                    // InternalVideoGen.g:1292:6: lv_orientation_1_4= 'vertical'
                    {
                    lv_orientation_1_4=(Token)match(input,44,FOLLOW_2); 

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
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000007C000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000078000020L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000070000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000060000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000600000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00001E0000000000L});

}