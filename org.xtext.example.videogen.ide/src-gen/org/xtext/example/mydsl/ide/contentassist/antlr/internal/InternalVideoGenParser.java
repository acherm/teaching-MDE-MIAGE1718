package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_PERCENTAGE", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TOP'", "'BOTTOM'", "'CENTER'", "'h'", "'horizontal'", "'v'", "'vertical'", "'VideoGen'", "'@author'", "'@version'", "'@creation'", "'mandatory'", "'optional'", "'alternatives'", "'image'", "'toptext'", "'bottomtext'", "'videoseq'", "'duration'", "'probability'", "'description'", "'filter'", "'text'", "'content'", "'position'", "'color'", "'size'", "'b&w'", "'negate'", "'flip'"
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

    	public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleVideoGeneratorModel"
    // InternalVideoGen.g:53:1: entryRuleVideoGeneratorModel : ruleVideoGeneratorModel EOF ;
    public final void entryRuleVideoGeneratorModel() throws RecognitionException {
        try {
            // InternalVideoGen.g:54:1: ( ruleVideoGeneratorModel EOF )
            // InternalVideoGen.g:55:1: ruleVideoGeneratorModel EOF
            {
             before(grammarAccess.getVideoGeneratorModelRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoGeneratorModel();

            state._fsp--;

             after(grammarAccess.getVideoGeneratorModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoGeneratorModel"


    // $ANTLR start "ruleVideoGeneratorModel"
    // InternalVideoGen.g:62:1: ruleVideoGeneratorModel : ( ( rule__VideoGeneratorModel__Group__0 ) ) ;
    public final void ruleVideoGeneratorModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:66:2: ( ( ( rule__VideoGeneratorModel__Group__0 ) ) )
            // InternalVideoGen.g:67:2: ( ( rule__VideoGeneratorModel__Group__0 ) )
            {
            // InternalVideoGen.g:67:2: ( ( rule__VideoGeneratorModel__Group__0 ) )
            // InternalVideoGen.g:68:3: ( rule__VideoGeneratorModel__Group__0 )
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getGroup()); 
            // InternalVideoGen.g:69:3: ( rule__VideoGeneratorModel__Group__0 )
            // InternalVideoGen.g:69:4: rule__VideoGeneratorModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGeneratorModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoGeneratorModel"


    // $ANTLR start "entryRuleVideoGenInformation"
    // InternalVideoGen.g:78:1: entryRuleVideoGenInformation : ruleVideoGenInformation EOF ;
    public final void entryRuleVideoGenInformation() throws RecognitionException {
        try {
            // InternalVideoGen.g:79:1: ( ruleVideoGenInformation EOF )
            // InternalVideoGen.g:80:1: ruleVideoGenInformation EOF
            {
             before(grammarAccess.getVideoGenInformationRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoGenInformation();

            state._fsp--;

             after(grammarAccess.getVideoGenInformationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoGenInformation"


    // $ANTLR start "ruleVideoGenInformation"
    // InternalVideoGen.g:87:1: ruleVideoGenInformation : ( ( rule__VideoGenInformation__Group__0 ) ) ;
    public final void ruleVideoGenInformation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:91:2: ( ( ( rule__VideoGenInformation__Group__0 ) ) )
            // InternalVideoGen.g:92:2: ( ( rule__VideoGenInformation__Group__0 ) )
            {
            // InternalVideoGen.g:92:2: ( ( rule__VideoGenInformation__Group__0 ) )
            // InternalVideoGen.g:93:3: ( rule__VideoGenInformation__Group__0 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getGroup()); 
            // InternalVideoGen.g:94:3: ( rule__VideoGenInformation__Group__0 )
            // InternalVideoGen.g:94:4: rule__VideoGenInformation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoGenInformation"


    // $ANTLR start "entryRuleMedia"
    // InternalVideoGen.g:103:1: entryRuleMedia : ruleMedia EOF ;
    public final void entryRuleMedia() throws RecognitionException {
        try {
            // InternalVideoGen.g:104:1: ( ruleMedia EOF )
            // InternalVideoGen.g:105:1: ruleMedia EOF
            {
             before(grammarAccess.getMediaRule()); 
            pushFollow(FOLLOW_1);
            ruleMedia();

            state._fsp--;

             after(grammarAccess.getMediaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMedia"


    // $ANTLR start "ruleMedia"
    // InternalVideoGen.g:112:1: ruleMedia : ( ( rule__Media__Alternatives ) ) ;
    public final void ruleMedia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:116:2: ( ( ( rule__Media__Alternatives ) ) )
            // InternalVideoGen.g:117:2: ( ( rule__Media__Alternatives ) )
            {
            // InternalVideoGen.g:117:2: ( ( rule__Media__Alternatives ) )
            // InternalVideoGen.g:118:3: ( rule__Media__Alternatives )
            {
             before(grammarAccess.getMediaAccess().getAlternatives()); 
            // InternalVideoGen.g:119:3: ( rule__Media__Alternatives )
            // InternalVideoGen.g:119:4: rule__Media__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Media__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMediaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMedia"


    // $ANTLR start "entryRuleImage"
    // InternalVideoGen.g:128:1: entryRuleImage : ruleImage EOF ;
    public final void entryRuleImage() throws RecognitionException {
        try {
            // InternalVideoGen.g:129:1: ( ruleImage EOF )
            // InternalVideoGen.g:130:1: ruleImage EOF
            {
             before(grammarAccess.getImageRule()); 
            pushFollow(FOLLOW_1);
            ruleImage();

            state._fsp--;

             after(grammarAccess.getImageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImage"


    // $ANTLR start "ruleImage"
    // InternalVideoGen.g:137:1: ruleImage : ( ( rule__Image__Alternatives ) ) ;
    public final void ruleImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:141:2: ( ( ( rule__Image__Alternatives ) ) )
            // InternalVideoGen.g:142:2: ( ( rule__Image__Alternatives ) )
            {
            // InternalVideoGen.g:142:2: ( ( rule__Image__Alternatives ) )
            // InternalVideoGen.g:143:3: ( rule__Image__Alternatives )
            {
             before(grammarAccess.getImageAccess().getAlternatives()); 
            // InternalVideoGen.g:144:3: ( rule__Image__Alternatives )
            // InternalVideoGen.g:144:4: rule__Image__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Image__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getImageAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImage"


    // $ANTLR start "entryRuleMandatoryImage"
    // InternalVideoGen.g:153:1: entryRuleMandatoryImage : ruleMandatoryImage EOF ;
    public final void entryRuleMandatoryImage() throws RecognitionException {
        try {
            // InternalVideoGen.g:154:1: ( ruleMandatoryImage EOF )
            // InternalVideoGen.g:155:1: ruleMandatoryImage EOF
            {
             before(grammarAccess.getMandatoryImageRule()); 
            pushFollow(FOLLOW_1);
            ruleMandatoryImage();

            state._fsp--;

             after(grammarAccess.getMandatoryImageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatoryImage"


    // $ANTLR start "ruleMandatoryImage"
    // InternalVideoGen.g:162:1: ruleMandatoryImage : ( ( rule__MandatoryImage__Group__0 ) ) ;
    public final void ruleMandatoryImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:166:2: ( ( ( rule__MandatoryImage__Group__0 ) ) )
            // InternalVideoGen.g:167:2: ( ( rule__MandatoryImage__Group__0 ) )
            {
            // InternalVideoGen.g:167:2: ( ( rule__MandatoryImage__Group__0 ) )
            // InternalVideoGen.g:168:3: ( rule__MandatoryImage__Group__0 )
            {
             before(grammarAccess.getMandatoryImageAccess().getGroup()); 
            // InternalVideoGen.g:169:3: ( rule__MandatoryImage__Group__0 )
            // InternalVideoGen.g:169:4: rule__MandatoryImage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryImage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryImage"


    // $ANTLR start "entryRuleOptionalImage"
    // InternalVideoGen.g:178:1: entryRuleOptionalImage : ruleOptionalImage EOF ;
    public final void entryRuleOptionalImage() throws RecognitionException {
        try {
            // InternalVideoGen.g:179:1: ( ruleOptionalImage EOF )
            // InternalVideoGen.g:180:1: ruleOptionalImage EOF
            {
             before(grammarAccess.getOptionalImageRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionalImage();

            state._fsp--;

             after(grammarAccess.getOptionalImageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalImage"


    // $ANTLR start "ruleOptionalImage"
    // InternalVideoGen.g:187:1: ruleOptionalImage : ( ( rule__OptionalImage__Group__0 ) ) ;
    public final void ruleOptionalImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:191:2: ( ( ( rule__OptionalImage__Group__0 ) ) )
            // InternalVideoGen.g:192:2: ( ( rule__OptionalImage__Group__0 ) )
            {
            // InternalVideoGen.g:192:2: ( ( rule__OptionalImage__Group__0 ) )
            // InternalVideoGen.g:193:3: ( rule__OptionalImage__Group__0 )
            {
             before(grammarAccess.getOptionalImageAccess().getGroup()); 
            // InternalVideoGen.g:194:3: ( rule__OptionalImage__Group__0 )
            // InternalVideoGen.g:194:4: rule__OptionalImage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OptionalImage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalImage"


    // $ANTLR start "entryRuleAlternativeImage"
    // InternalVideoGen.g:203:1: entryRuleAlternativeImage : ruleAlternativeImage EOF ;
    public final void entryRuleAlternativeImage() throws RecognitionException {
        try {
            // InternalVideoGen.g:204:1: ( ruleAlternativeImage EOF )
            // InternalVideoGen.g:205:1: ruleAlternativeImage EOF
            {
             before(grammarAccess.getAlternativeImageRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternativeImage();

            state._fsp--;

             after(grammarAccess.getAlternativeImageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternativeImage"


    // $ANTLR start "ruleAlternativeImage"
    // InternalVideoGen.g:212:1: ruleAlternativeImage : ( ( rule__AlternativeImage__Group__0 ) ) ;
    public final void ruleAlternativeImage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:216:2: ( ( ( rule__AlternativeImage__Group__0 ) ) )
            // InternalVideoGen.g:217:2: ( ( rule__AlternativeImage__Group__0 ) )
            {
            // InternalVideoGen.g:217:2: ( ( rule__AlternativeImage__Group__0 ) )
            // InternalVideoGen.g:218:3: ( rule__AlternativeImage__Group__0 )
            {
             before(grammarAccess.getAlternativeImageAccess().getGroup()); 
            // InternalVideoGen.g:219:3: ( rule__AlternativeImage__Group__0 )
            // InternalVideoGen.g:219:4: rule__AlternativeImage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeImage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeImageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternativeImage"


    // $ANTLR start "entryRuleImageDescription"
    // InternalVideoGen.g:228:1: entryRuleImageDescription : ruleImageDescription EOF ;
    public final void entryRuleImageDescription() throws RecognitionException {
        try {
            // InternalVideoGen.g:229:1: ( ruleImageDescription EOF )
            // InternalVideoGen.g:230:1: ruleImageDescription EOF
            {
             before(grammarAccess.getImageDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleImageDescription();

            state._fsp--;

             after(grammarAccess.getImageDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImageDescription"


    // $ANTLR start "ruleImageDescription"
    // InternalVideoGen.g:237:1: ruleImageDescription : ( ( rule__ImageDescription__Group__0 ) ) ;
    public final void ruleImageDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:241:2: ( ( ( rule__ImageDescription__Group__0 ) ) )
            // InternalVideoGen.g:242:2: ( ( rule__ImageDescription__Group__0 ) )
            {
            // InternalVideoGen.g:242:2: ( ( rule__ImageDescription__Group__0 ) )
            // InternalVideoGen.g:243:3: ( rule__ImageDescription__Group__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup()); 
            // InternalVideoGen.g:244:3: ( rule__ImageDescription__Group__0 )
            // InternalVideoGen.g:244:4: rule__ImageDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageDescription"


    // $ANTLR start "entryRuleVideoSeq"
    // InternalVideoGen.g:253:1: entryRuleVideoSeq : ruleVideoSeq EOF ;
    public final void entryRuleVideoSeq() throws RecognitionException {
        try {
            // InternalVideoGen.g:254:1: ( ruleVideoSeq EOF )
            // InternalVideoGen.g:255:1: ruleVideoSeq EOF
            {
             before(grammarAccess.getVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoSeq();

            state._fsp--;

             after(grammarAccess.getVideoSeqRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoSeq"


    // $ANTLR start "ruleVideoSeq"
    // InternalVideoGen.g:262:1: ruleVideoSeq : ( ( rule__VideoSeq__Alternatives ) ) ;
    public final void ruleVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:266:2: ( ( ( rule__VideoSeq__Alternatives ) ) )
            // InternalVideoGen.g:267:2: ( ( rule__VideoSeq__Alternatives ) )
            {
            // InternalVideoGen.g:267:2: ( ( rule__VideoSeq__Alternatives ) )
            // InternalVideoGen.g:268:3: ( rule__VideoSeq__Alternatives )
            {
             before(grammarAccess.getVideoSeqAccess().getAlternatives()); 
            // InternalVideoGen.g:269:3: ( rule__VideoSeq__Alternatives )
            // InternalVideoGen.g:269:4: rule__VideoSeq__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VideoSeq__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVideoSeqAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoSeq"


    // $ANTLR start "entryRuleMandatoryVideoSeq"
    // InternalVideoGen.g:278:1: entryRuleMandatoryVideoSeq : ruleMandatoryVideoSeq EOF ;
    public final void entryRuleMandatoryVideoSeq() throws RecognitionException {
        try {
            // InternalVideoGen.g:279:1: ( ruleMandatoryVideoSeq EOF )
            // InternalVideoGen.g:280:1: ruleMandatoryVideoSeq EOF
            {
             before(grammarAccess.getMandatoryVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            ruleMandatoryVideoSeq();

            state._fsp--;

             after(grammarAccess.getMandatoryVideoSeqRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMandatoryVideoSeq"


    // $ANTLR start "ruleMandatoryVideoSeq"
    // InternalVideoGen.g:287:1: ruleMandatoryVideoSeq : ( ( rule__MandatoryVideoSeq__Group__0 ) ) ;
    public final void ruleMandatoryVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:291:2: ( ( ( rule__MandatoryVideoSeq__Group__0 ) ) )
            // InternalVideoGen.g:292:2: ( ( rule__MandatoryVideoSeq__Group__0 ) )
            {
            // InternalVideoGen.g:292:2: ( ( rule__MandatoryVideoSeq__Group__0 ) )
            // InternalVideoGen.g:293:3: ( rule__MandatoryVideoSeq__Group__0 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getGroup()); 
            // InternalVideoGen.g:294:3: ( rule__MandatoryVideoSeq__Group__0 )
            // InternalVideoGen.g:294:4: rule__MandatoryVideoSeq__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryVideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatoryVideoSeq"


    // $ANTLR start "entryRuleOptionalVideoSeq"
    // InternalVideoGen.g:303:1: entryRuleOptionalVideoSeq : ruleOptionalVideoSeq EOF ;
    public final void entryRuleOptionalVideoSeq() throws RecognitionException {
        try {
            // InternalVideoGen.g:304:1: ( ruleOptionalVideoSeq EOF )
            // InternalVideoGen.g:305:1: ruleOptionalVideoSeq EOF
            {
             before(grammarAccess.getOptionalVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            ruleOptionalVideoSeq();

            state._fsp--;

             after(grammarAccess.getOptionalVideoSeqRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOptionalVideoSeq"


    // $ANTLR start "ruleOptionalVideoSeq"
    // InternalVideoGen.g:312:1: ruleOptionalVideoSeq : ( ( rule__OptionalVideoSeq__Group__0 ) ) ;
    public final void ruleOptionalVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:316:2: ( ( ( rule__OptionalVideoSeq__Group__0 ) ) )
            // InternalVideoGen.g:317:2: ( ( rule__OptionalVideoSeq__Group__0 ) )
            {
            // InternalVideoGen.g:317:2: ( ( rule__OptionalVideoSeq__Group__0 ) )
            // InternalVideoGen.g:318:3: ( rule__OptionalVideoSeq__Group__0 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getGroup()); 
            // InternalVideoGen.g:319:3: ( rule__OptionalVideoSeq__Group__0 )
            // InternalVideoGen.g:319:4: rule__OptionalVideoSeq__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OptionalVideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptionalVideoSeq"


    // $ANTLR start "entryRuleAlternativeVideoSeq"
    // InternalVideoGen.g:328:1: entryRuleAlternativeVideoSeq : ruleAlternativeVideoSeq EOF ;
    public final void entryRuleAlternativeVideoSeq() throws RecognitionException {
        try {
            // InternalVideoGen.g:329:1: ( ruleAlternativeVideoSeq EOF )
            // InternalVideoGen.g:330:1: ruleAlternativeVideoSeq EOF
            {
             before(grammarAccess.getAlternativeVideoSeqRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternativeVideoSeq();

            state._fsp--;

             after(grammarAccess.getAlternativeVideoSeqRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlternativeVideoSeq"


    // $ANTLR start "ruleAlternativeVideoSeq"
    // InternalVideoGen.g:337:1: ruleAlternativeVideoSeq : ( ( rule__AlternativeVideoSeq__Group__0 ) ) ;
    public final void ruleAlternativeVideoSeq() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:341:2: ( ( ( rule__AlternativeVideoSeq__Group__0 ) ) )
            // InternalVideoGen.g:342:2: ( ( rule__AlternativeVideoSeq__Group__0 ) )
            {
            // InternalVideoGen.g:342:2: ( ( rule__AlternativeVideoSeq__Group__0 ) )
            // InternalVideoGen.g:343:3: ( rule__AlternativeVideoSeq__Group__0 )
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getGroup()); 
            // InternalVideoGen.g:344:3: ( rule__AlternativeVideoSeq__Group__0 )
            // InternalVideoGen.g:344:4: rule__AlternativeVideoSeq__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeVideoSeq__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeVideoSeqAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternativeVideoSeq"


    // $ANTLR start "entryRuleVideoDescription"
    // InternalVideoGen.g:353:1: entryRuleVideoDescription : ruleVideoDescription EOF ;
    public final void entryRuleVideoDescription() throws RecognitionException {
        try {
            // InternalVideoGen.g:354:1: ( ruleVideoDescription EOF )
            // InternalVideoGen.g:355:1: ruleVideoDescription EOF
            {
             before(grammarAccess.getVideoDescriptionRule()); 
            pushFollow(FOLLOW_1);
            ruleVideoDescription();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideoDescription"


    // $ANTLR start "ruleVideoDescription"
    // InternalVideoGen.g:362:1: ruleVideoDescription : ( ( rule__VideoDescription__Group__0 ) ) ;
    public final void ruleVideoDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:366:2: ( ( ( rule__VideoDescription__Group__0 ) ) )
            // InternalVideoGen.g:367:2: ( ( rule__VideoDescription__Group__0 ) )
            {
            // InternalVideoGen.g:367:2: ( ( rule__VideoDescription__Group__0 ) )
            // InternalVideoGen.g:368:3: ( rule__VideoDescription__Group__0 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup()); 
            // InternalVideoGen.g:369:3: ( rule__VideoDescription__Group__0 )
            // InternalVideoGen.g:369:4: rule__VideoDescription__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoDescription"


    // $ANTLR start "entryRuleText"
    // InternalVideoGen.g:378:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalVideoGen.g:379:1: ( ruleText EOF )
            // InternalVideoGen.g:380:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalVideoGen.g:387:1: ruleText : ( ( rule__Text__Group__0 ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:391:2: ( ( ( rule__Text__Group__0 ) ) )
            // InternalVideoGen.g:392:2: ( ( rule__Text__Group__0 ) )
            {
            // InternalVideoGen.g:392:2: ( ( rule__Text__Group__0 ) )
            // InternalVideoGen.g:393:3: ( rule__Text__Group__0 )
            {
             before(grammarAccess.getTextAccess().getGroup()); 
            // InternalVideoGen.g:394:3: ( rule__Text__Group__0 )
            // InternalVideoGen.g:394:4: rule__Text__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRulePosition"
    // InternalVideoGen.g:403:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // InternalVideoGen.g:404:1: ( rulePosition EOF )
            // InternalVideoGen.g:405:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_1);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePosition"


    // $ANTLR start "rulePosition"
    // InternalVideoGen.g:412:1: rulePosition : ( ( rule__Position__Alternatives ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:416:2: ( ( ( rule__Position__Alternatives ) ) )
            // InternalVideoGen.g:417:2: ( ( rule__Position__Alternatives ) )
            {
            // InternalVideoGen.g:417:2: ( ( rule__Position__Alternatives ) )
            // InternalVideoGen.g:418:3: ( rule__Position__Alternatives )
            {
             before(grammarAccess.getPositionAccess().getAlternatives()); 
            // InternalVideoGen.g:419:3: ( rule__Position__Alternatives )
            // InternalVideoGen.g:419:4: rule__Position__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Position__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePosition"


    // $ANTLR start "entryRuleFilter"
    // InternalVideoGen.g:428:1: entryRuleFilter : ruleFilter EOF ;
    public final void entryRuleFilter() throws RecognitionException {
        try {
            // InternalVideoGen.g:429:1: ( ruleFilter EOF )
            // InternalVideoGen.g:430:1: ruleFilter EOF
            {
             before(grammarAccess.getFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalVideoGen.g:437:1: ruleFilter : ( ( rule__Filter__Alternatives ) ) ;
    public final void ruleFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:441:2: ( ( ( rule__Filter__Alternatives ) ) )
            // InternalVideoGen.g:442:2: ( ( rule__Filter__Alternatives ) )
            {
            // InternalVideoGen.g:442:2: ( ( rule__Filter__Alternatives ) )
            // InternalVideoGen.g:443:3: ( rule__Filter__Alternatives )
            {
             before(grammarAccess.getFilterAccess().getAlternatives()); 
            // InternalVideoGen.g:444:3: ( rule__Filter__Alternatives )
            // InternalVideoGen.g:444:4: rule__Filter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Filter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleBlackWhiteFilter"
    // InternalVideoGen.g:453:1: entryRuleBlackWhiteFilter : ruleBlackWhiteFilter EOF ;
    public final void entryRuleBlackWhiteFilter() throws RecognitionException {
        try {
            // InternalVideoGen.g:454:1: ( ruleBlackWhiteFilter EOF )
            // InternalVideoGen.g:455:1: ruleBlackWhiteFilter EOF
            {
             before(grammarAccess.getBlackWhiteFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleBlackWhiteFilter();

            state._fsp--;

             after(grammarAccess.getBlackWhiteFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlackWhiteFilter"


    // $ANTLR start "ruleBlackWhiteFilter"
    // InternalVideoGen.g:462:1: ruleBlackWhiteFilter : ( ( rule__BlackWhiteFilter__Group__0 ) ) ;
    public final void ruleBlackWhiteFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:466:2: ( ( ( rule__BlackWhiteFilter__Group__0 ) ) )
            // InternalVideoGen.g:467:2: ( ( rule__BlackWhiteFilter__Group__0 ) )
            {
            // InternalVideoGen.g:467:2: ( ( rule__BlackWhiteFilter__Group__0 ) )
            // InternalVideoGen.g:468:3: ( rule__BlackWhiteFilter__Group__0 )
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getGroup()); 
            // InternalVideoGen.g:469:3: ( rule__BlackWhiteFilter__Group__0 )
            // InternalVideoGen.g:469:4: rule__BlackWhiteFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlackWhiteFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlackWhiteFilter"


    // $ANTLR start "entryRuleNegateFilter"
    // InternalVideoGen.g:478:1: entryRuleNegateFilter : ruleNegateFilter EOF ;
    public final void entryRuleNegateFilter() throws RecognitionException {
        try {
            // InternalVideoGen.g:479:1: ( ruleNegateFilter EOF )
            // InternalVideoGen.g:480:1: ruleNegateFilter EOF
            {
             before(grammarAccess.getNegateFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleNegateFilter();

            state._fsp--;

             after(grammarAccess.getNegateFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegateFilter"


    // $ANTLR start "ruleNegateFilter"
    // InternalVideoGen.g:487:1: ruleNegateFilter : ( ( rule__NegateFilter__Group__0 ) ) ;
    public final void ruleNegateFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:491:2: ( ( ( rule__NegateFilter__Group__0 ) ) )
            // InternalVideoGen.g:492:2: ( ( rule__NegateFilter__Group__0 ) )
            {
            // InternalVideoGen.g:492:2: ( ( rule__NegateFilter__Group__0 ) )
            // InternalVideoGen.g:493:3: ( rule__NegateFilter__Group__0 )
            {
             before(grammarAccess.getNegateFilterAccess().getGroup()); 
            // InternalVideoGen.g:494:3: ( rule__NegateFilter__Group__0 )
            // InternalVideoGen.g:494:4: rule__NegateFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegateFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegateFilter"


    // $ANTLR start "entryRuleFlipFilter"
    // InternalVideoGen.g:503:1: entryRuleFlipFilter : ruleFlipFilter EOF ;
    public final void entryRuleFlipFilter() throws RecognitionException {
        try {
            // InternalVideoGen.g:504:1: ( ruleFlipFilter EOF )
            // InternalVideoGen.g:505:1: ruleFlipFilter EOF
            {
             before(grammarAccess.getFlipFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleFlipFilter();

            state._fsp--;

             after(grammarAccess.getFlipFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFlipFilter"


    // $ANTLR start "ruleFlipFilter"
    // InternalVideoGen.g:512:1: ruleFlipFilter : ( ( rule__FlipFilter__Group__0 ) ) ;
    public final void ruleFlipFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:516:2: ( ( ( rule__FlipFilter__Group__0 ) ) )
            // InternalVideoGen.g:517:2: ( ( rule__FlipFilter__Group__0 ) )
            {
            // InternalVideoGen.g:517:2: ( ( rule__FlipFilter__Group__0 ) )
            // InternalVideoGen.g:518:3: ( rule__FlipFilter__Group__0 )
            {
             before(grammarAccess.getFlipFilterAccess().getGroup()); 
            // InternalVideoGen.g:519:3: ( rule__FlipFilter__Group__0 )
            // InternalVideoGen.g:519:4: rule__FlipFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFlipFilter"


    // $ANTLR start "rule__Media__Alternatives"
    // InternalVideoGen.g:527:1: rule__Media__Alternatives : ( ( ruleImage ) | ( ruleVideoSeq ) );
    public final void rule__Media__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:531:1: ( ( ruleImage ) | ( ruleVideoSeq ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 26:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==29) ) {
                    alt1=1;
                }
                else if ( (LA1_1==32) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 27:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==29) ) {
                    alt1=1;
                }
                else if ( (LA1_2==32) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
                {
                int LA1_3 = input.LA(2);

                if ( (LA1_3==RULE_ID) ) {
                    int LA1_6 = input.LA(3);

                    if ( (LA1_6==RULE_LEFT_BRACKET) ) {
                        int LA1_7 = input.LA(4);

                        if ( (LA1_7==32) ) {
                            alt1=2;
                        }
                        else if ( (LA1_7==29) ) {
                            alt1=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 7, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 6, input);

                        throw nvae;
                    }
                }
                else if ( (LA1_3==RULE_LEFT_BRACKET) ) {
                    int LA1_7 = input.LA(3);

                    if ( (LA1_7==32) ) {
                        alt1=2;
                    }
                    else if ( (LA1_7==29) ) {
                        alt1=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 7, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalVideoGen.g:532:2: ( ruleImage )
                    {
                    // InternalVideoGen.g:532:2: ( ruleImage )
                    // InternalVideoGen.g:533:3: ruleImage
                    {
                     before(grammarAccess.getMediaAccess().getImageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleImage();

                    state._fsp--;

                     after(grammarAccess.getMediaAccess().getImageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:538:2: ( ruleVideoSeq )
                    {
                    // InternalVideoGen.g:538:2: ( ruleVideoSeq )
                    // InternalVideoGen.g:539:3: ruleVideoSeq
                    {
                     before(grammarAccess.getMediaAccess().getVideoSeqParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getMediaAccess().getVideoSeqParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Media__Alternatives"


    // $ANTLR start "rule__Image__Alternatives"
    // InternalVideoGen.g:548:1: rule__Image__Alternatives : ( ( ruleMandatoryImage ) | ( ruleOptionalImage ) | ( ruleAlternativeImage ) );
    public final void rule__Image__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:552:1: ( ( ruleMandatoryImage ) | ( ruleOptionalImage ) | ( ruleAlternativeImage ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 27:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalVideoGen.g:553:2: ( ruleMandatoryImage )
                    {
                    // InternalVideoGen.g:553:2: ( ruleMandatoryImage )
                    // InternalVideoGen.g:554:3: ruleMandatoryImage
                    {
                     before(grammarAccess.getImageAccess().getMandatoryImageParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMandatoryImage();

                    state._fsp--;

                     after(grammarAccess.getImageAccess().getMandatoryImageParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:559:2: ( ruleOptionalImage )
                    {
                    // InternalVideoGen.g:559:2: ( ruleOptionalImage )
                    // InternalVideoGen.g:560:3: ruleOptionalImage
                    {
                     before(grammarAccess.getImageAccess().getOptionalImageParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOptionalImage();

                    state._fsp--;

                     after(grammarAccess.getImageAccess().getOptionalImageParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:565:2: ( ruleAlternativeImage )
                    {
                    // InternalVideoGen.g:565:2: ( ruleAlternativeImage )
                    // InternalVideoGen.g:566:3: ruleAlternativeImage
                    {
                     before(grammarAccess.getImageAccess().getAlternativeImageParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternativeImage();

                    state._fsp--;

                     after(grammarAccess.getImageAccess().getAlternativeImageParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Image__Alternatives"


    // $ANTLR start "rule__VideoSeq__Alternatives"
    // InternalVideoGen.g:575:1: rule__VideoSeq__Alternatives : ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternativeVideoSeq ) );
    public final void rule__VideoSeq__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:579:1: ( ( ruleMandatoryVideoSeq ) | ( ruleOptionalVideoSeq ) | ( ruleAlternativeVideoSeq ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt3=1;
                }
                break;
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalVideoGen.g:580:2: ( ruleMandatoryVideoSeq )
                    {
                    // InternalVideoGen.g:580:2: ( ruleMandatoryVideoSeq )
                    // InternalVideoGen.g:581:3: ruleMandatoryVideoSeq
                    {
                     before(grammarAccess.getVideoSeqAccess().getMandatoryVideoSeqParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMandatoryVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVideoSeqAccess().getMandatoryVideoSeqParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:586:2: ( ruleOptionalVideoSeq )
                    {
                    // InternalVideoGen.g:586:2: ( ruleOptionalVideoSeq )
                    // InternalVideoGen.g:587:3: ruleOptionalVideoSeq
                    {
                     before(grammarAccess.getVideoSeqAccess().getOptionalVideoSeqParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOptionalVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVideoSeqAccess().getOptionalVideoSeqParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:592:2: ( ruleAlternativeVideoSeq )
                    {
                    // InternalVideoGen.g:592:2: ( ruleAlternativeVideoSeq )
                    // InternalVideoGen.g:593:3: ruleAlternativeVideoSeq
                    {
                     before(grammarAccess.getVideoSeqAccess().getAlternativeVideoSeqParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternativeVideoSeq();

                    state._fsp--;

                     after(grammarAccess.getVideoSeqAccess().getAlternativeVideoSeqParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoSeq__Alternatives"


    // $ANTLR start "rule__Position__Alternatives"
    // InternalVideoGen.g:602:1: rule__Position__Alternatives : ( ( 'TOP' ) | ( 'BOTTOM' ) | ( 'CENTER' ) );
    public final void rule__Position__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:606:1: ( ( 'TOP' ) | ( 'BOTTOM' ) | ( 'CENTER' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalVideoGen.g:607:2: ( 'TOP' )
                    {
                    // InternalVideoGen.g:607:2: ( 'TOP' )
                    // InternalVideoGen.g:608:3: 'TOP'
                    {
                     before(grammarAccess.getPositionAccess().getTOPKeyword_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getTOPKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:613:2: ( 'BOTTOM' )
                    {
                    // InternalVideoGen.g:613:2: ( 'BOTTOM' )
                    // InternalVideoGen.g:614:3: 'BOTTOM'
                    {
                     before(grammarAccess.getPositionAccess().getBOTTOMKeyword_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getBOTTOMKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:619:2: ( 'CENTER' )
                    {
                    // InternalVideoGen.g:619:2: ( 'CENTER' )
                    // InternalVideoGen.g:620:3: 'CENTER'
                    {
                     before(grammarAccess.getPositionAccess().getCENTERKeyword_2()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getPositionAccess().getCENTERKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Position__Alternatives"


    // $ANTLR start "rule__Filter__Alternatives"
    // InternalVideoGen.g:629:1: rule__Filter__Alternatives : ( ( ruleFlipFilter ) | ( ruleNegateFilter ) | ( ruleBlackWhiteFilter ) );
    public final void rule__Filter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:633:1: ( ( ruleFlipFilter ) | ( ruleNegateFilter ) | ( ruleBlackWhiteFilter ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case 42:
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
                    // InternalVideoGen.g:634:2: ( ruleFlipFilter )
                    {
                    // InternalVideoGen.g:634:2: ( ruleFlipFilter )
                    // InternalVideoGen.g:635:3: ruleFlipFilter
                    {
                     before(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFlipFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getFlipFilterParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:640:2: ( ruleNegateFilter )
                    {
                    // InternalVideoGen.g:640:2: ( ruleNegateFilter )
                    // InternalVideoGen.g:641:3: ruleNegateFilter
                    {
                     before(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNegateFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getNegateFilterParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:646:2: ( ruleBlackWhiteFilter )
                    {
                    // InternalVideoGen.g:646:2: ( ruleBlackWhiteFilter )
                    // InternalVideoGen.g:647:3: ruleBlackWhiteFilter
                    {
                     before(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBlackWhiteFilter();

                    state._fsp--;

                     after(grammarAccess.getFilterAccess().getBlackWhiteFilterParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Filter__Alternatives"


    // $ANTLR start "rule__FlipFilter__OrientationAlternatives_1_0"
    // InternalVideoGen.g:656:1: rule__FlipFilter__OrientationAlternatives_1_0 : ( ( 'h' ) | ( 'horizontal' ) | ( 'v' ) | ( 'vertical' ) );
    public final void rule__FlipFilter__OrientationAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:660:1: ( ( 'h' ) | ( 'horizontal' ) | ( 'v' ) | ( 'vertical' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalVideoGen.g:661:2: ( 'h' )
                    {
                    // InternalVideoGen.g:661:2: ( 'h' )
                    // InternalVideoGen.g:662:3: 'h'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationHKeyword_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalVideoGen.g:667:2: ( 'horizontal' )
                    {
                    // InternalVideoGen.g:667:2: ( 'horizontal' )
                    // InternalVideoGen.g:668:3: 'horizontal'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationHorizontalKeyword_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalVideoGen.g:673:2: ( 'v' )
                    {
                    // InternalVideoGen.g:673:2: ( 'v' )
                    // InternalVideoGen.g:674:3: 'v'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationVKeyword_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalVideoGen.g:679:2: ( 'vertical' )
                    {
                    // InternalVideoGen.g:679:2: ( 'vertical' )
                    // InternalVideoGen.g:680:3: 'vertical'
                    {
                     before(grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getFlipFilterAccess().getOrientationVerticalKeyword_1_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__OrientationAlternatives_1_0"


    // $ANTLR start "rule__VideoGeneratorModel__Group__0"
    // InternalVideoGen.g:689:1: rule__VideoGeneratorModel__Group__0 : rule__VideoGeneratorModel__Group__0__Impl rule__VideoGeneratorModel__Group__1 ;
    public final void rule__VideoGeneratorModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:693:1: ( rule__VideoGeneratorModel__Group__0__Impl rule__VideoGeneratorModel__Group__1 )
            // InternalVideoGen.g:694:2: rule__VideoGeneratorModel__Group__0__Impl rule__VideoGeneratorModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VideoGeneratorModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__0"


    // $ANTLR start "rule__VideoGeneratorModel__Group__0__Impl"
    // InternalVideoGen.g:701:1: rule__VideoGeneratorModel__Group__0__Impl : ( () ) ;
    public final void rule__VideoGeneratorModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:705:1: ( ( () ) )
            // InternalVideoGen.g:706:1: ( () )
            {
            // InternalVideoGen.g:706:1: ( () )
            // InternalVideoGen.g:707:2: ()
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getVideoGeneratorModelAction_0()); 
            // InternalVideoGen.g:708:2: ()
            // InternalVideoGen.g:708:3: 
            {
            }

             after(grammarAccess.getVideoGeneratorModelAccess().getVideoGeneratorModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__0__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__1"
    // InternalVideoGen.g:716:1: rule__VideoGeneratorModel__Group__1 : rule__VideoGeneratorModel__Group__1__Impl rule__VideoGeneratorModel__Group__2 ;
    public final void rule__VideoGeneratorModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:720:1: ( rule__VideoGeneratorModel__Group__1__Impl rule__VideoGeneratorModel__Group__2 )
            // InternalVideoGen.g:721:2: rule__VideoGeneratorModel__Group__1__Impl rule__VideoGeneratorModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__VideoGeneratorModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__1"


    // $ANTLR start "rule__VideoGeneratorModel__Group__1__Impl"
    // InternalVideoGen.g:728:1: rule__VideoGeneratorModel__Group__1__Impl : ( ( rule__VideoGeneratorModel__InformationAssignment_1 )? ) ;
    public final void rule__VideoGeneratorModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:732:1: ( ( ( rule__VideoGeneratorModel__InformationAssignment_1 )? ) )
            // InternalVideoGen.g:733:1: ( ( rule__VideoGeneratorModel__InformationAssignment_1 )? )
            {
            // InternalVideoGen.g:733:1: ( ( rule__VideoGeneratorModel__InformationAssignment_1 )? )
            // InternalVideoGen.g:734:2: ( rule__VideoGeneratorModel__InformationAssignment_1 )?
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getInformationAssignment_1()); 
            // InternalVideoGen.g:735:2: ( rule__VideoGeneratorModel__InformationAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalVideoGen.g:735:3: rule__VideoGeneratorModel__InformationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoGeneratorModel__InformationAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoGeneratorModelAccess().getInformationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__1__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__2"
    // InternalVideoGen.g:743:1: rule__VideoGeneratorModel__Group__2 : rule__VideoGeneratorModel__Group__2__Impl rule__VideoGeneratorModel__Group__3 ;
    public final void rule__VideoGeneratorModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:747:1: ( rule__VideoGeneratorModel__Group__2__Impl rule__VideoGeneratorModel__Group__3 )
            // InternalVideoGen.g:748:2: rule__VideoGeneratorModel__Group__2__Impl rule__VideoGeneratorModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__VideoGeneratorModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__2"


    // $ANTLR start "rule__VideoGeneratorModel__Group__2__Impl"
    // InternalVideoGen.g:755:1: rule__VideoGeneratorModel__Group__2__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGeneratorModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:759:1: ( ( 'VideoGen' ) )
            // InternalVideoGen.g:760:1: ( 'VideoGen' )
            {
            // InternalVideoGen.g:760:1: ( 'VideoGen' )
            // InternalVideoGen.g:761:2: 'VideoGen'
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getVideoGenKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getVideoGeneratorModelAccess().getVideoGenKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__2__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__3"
    // InternalVideoGen.g:770:1: rule__VideoGeneratorModel__Group__3 : rule__VideoGeneratorModel__Group__3__Impl rule__VideoGeneratorModel__Group__4 ;
    public final void rule__VideoGeneratorModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:774:1: ( rule__VideoGeneratorModel__Group__3__Impl rule__VideoGeneratorModel__Group__4 )
            // InternalVideoGen.g:775:2: rule__VideoGeneratorModel__Group__3__Impl rule__VideoGeneratorModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__VideoGeneratorModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__3"


    // $ANTLR start "rule__VideoGeneratorModel__Group__3__Impl"
    // InternalVideoGen.g:782:1: rule__VideoGeneratorModel__Group__3__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoGeneratorModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:786:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:787:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:787:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:788:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getLEFT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoGeneratorModelAccess().getLEFT_BRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__3__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__4"
    // InternalVideoGen.g:797:1: rule__VideoGeneratorModel__Group__4 : rule__VideoGeneratorModel__Group__4__Impl rule__VideoGeneratorModel__Group__5 ;
    public final void rule__VideoGeneratorModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:801:1: ( rule__VideoGeneratorModel__Group__4__Impl rule__VideoGeneratorModel__Group__5 )
            // InternalVideoGen.g:802:2: rule__VideoGeneratorModel__Group__4__Impl rule__VideoGeneratorModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__VideoGeneratorModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__4"


    // $ANTLR start "rule__VideoGeneratorModel__Group__4__Impl"
    // InternalVideoGen.g:809:1: rule__VideoGeneratorModel__Group__4__Impl : ( ( ( rule__VideoGeneratorModel__MediasAssignment_4 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_4 )* ) ) ;
    public final void rule__VideoGeneratorModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:813:1: ( ( ( ( rule__VideoGeneratorModel__MediasAssignment_4 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_4 )* ) ) )
            // InternalVideoGen.g:814:1: ( ( ( rule__VideoGeneratorModel__MediasAssignment_4 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_4 )* ) )
            {
            // InternalVideoGen.g:814:1: ( ( ( rule__VideoGeneratorModel__MediasAssignment_4 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_4 )* ) )
            // InternalVideoGen.g:815:2: ( ( rule__VideoGeneratorModel__MediasAssignment_4 ) ) ( ( rule__VideoGeneratorModel__MediasAssignment_4 )* )
            {
            // InternalVideoGen.g:815:2: ( ( rule__VideoGeneratorModel__MediasAssignment_4 ) )
            // InternalVideoGen.g:816:3: ( rule__VideoGeneratorModel__MediasAssignment_4 )
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getMediasAssignment_4()); 
            // InternalVideoGen.g:817:3: ( rule__VideoGeneratorModel__MediasAssignment_4 )
            // InternalVideoGen.g:817:4: rule__VideoGeneratorModel__MediasAssignment_4
            {
            pushFollow(FOLLOW_7);
            rule__VideoGeneratorModel__MediasAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVideoGeneratorModelAccess().getMediasAssignment_4()); 

            }

            // InternalVideoGen.g:820:2: ( ( rule__VideoGeneratorModel__MediasAssignment_4 )* )
            // InternalVideoGen.g:821:3: ( rule__VideoGeneratorModel__MediasAssignment_4 )*
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getMediasAssignment_4()); 
            // InternalVideoGen.g:822:3: ( rule__VideoGeneratorModel__MediasAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=26 && LA8_0<=28)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalVideoGen.g:822:4: rule__VideoGeneratorModel__MediasAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__VideoGeneratorModel__MediasAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getVideoGeneratorModelAccess().getMediasAssignment_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__4__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__Group__5"
    // InternalVideoGen.g:831:1: rule__VideoGeneratorModel__Group__5 : rule__VideoGeneratorModel__Group__5__Impl ;
    public final void rule__VideoGeneratorModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:835:1: ( rule__VideoGeneratorModel__Group__5__Impl )
            // InternalVideoGen.g:836:2: rule__VideoGeneratorModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGeneratorModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__5"


    // $ANTLR start "rule__VideoGeneratorModel__Group__5__Impl"
    // InternalVideoGen.g:842:1: rule__VideoGeneratorModel__Group__5__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGeneratorModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:846:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:847:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:847:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:848:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getRIGHT_BRACKETTerminalRuleCall_5()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoGeneratorModelAccess().getRIGHT_BRACKETTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__Group__5__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group__0"
    // InternalVideoGen.g:858:1: rule__VideoGenInformation__Group__0 : rule__VideoGenInformation__Group__0__Impl rule__VideoGenInformation__Group__1 ;
    public final void rule__VideoGenInformation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:862:1: ( rule__VideoGenInformation__Group__0__Impl rule__VideoGenInformation__Group__1 )
            // InternalVideoGen.g:863:2: rule__VideoGenInformation__Group__0__Impl rule__VideoGenInformation__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__VideoGenInformation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__0"


    // $ANTLR start "rule__VideoGenInformation__Group__0__Impl"
    // InternalVideoGen.g:870:1: rule__VideoGenInformation__Group__0__Impl : ( () ) ;
    public final void rule__VideoGenInformation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:874:1: ( ( () ) )
            // InternalVideoGen.g:875:1: ( () )
            {
            // InternalVideoGen.g:875:1: ( () )
            // InternalVideoGen.g:876:2: ()
            {
             before(grammarAccess.getVideoGenInformationAccess().getVideoGenInformationAction_0()); 
            // InternalVideoGen.g:877:2: ()
            // InternalVideoGen.g:877:3: 
            {
            }

             after(grammarAccess.getVideoGenInformationAccess().getVideoGenInformationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__0__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group__1"
    // InternalVideoGen.g:885:1: rule__VideoGenInformation__Group__1 : rule__VideoGenInformation__Group__1__Impl rule__VideoGenInformation__Group__2 ;
    public final void rule__VideoGenInformation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:889:1: ( rule__VideoGenInformation__Group__1__Impl rule__VideoGenInformation__Group__2 )
            // InternalVideoGen.g:890:2: rule__VideoGenInformation__Group__1__Impl rule__VideoGenInformation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__VideoGenInformation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__1"


    // $ANTLR start "rule__VideoGenInformation__Group__1__Impl"
    // InternalVideoGen.g:897:1: rule__VideoGenInformation__Group__1__Impl : ( ( rule__VideoGenInformation__Group_1__0 ) ) ;
    public final void rule__VideoGenInformation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:901:1: ( ( ( rule__VideoGenInformation__Group_1__0 ) ) )
            // InternalVideoGen.g:902:1: ( ( rule__VideoGenInformation__Group_1__0 ) )
            {
            // InternalVideoGen.g:902:1: ( ( rule__VideoGenInformation__Group_1__0 ) )
            // InternalVideoGen.g:903:2: ( rule__VideoGenInformation__Group_1__0 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getGroup_1()); 
            // InternalVideoGen.g:904:2: ( rule__VideoGenInformation__Group_1__0 )
            // InternalVideoGen.g:904:3: rule__VideoGenInformation__Group_1__0
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__1__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group__2"
    // InternalVideoGen.g:912:1: rule__VideoGenInformation__Group__2 : rule__VideoGenInformation__Group__2__Impl rule__VideoGenInformation__Group__3 ;
    public final void rule__VideoGenInformation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:916:1: ( rule__VideoGenInformation__Group__2__Impl rule__VideoGenInformation__Group__3 )
            // InternalVideoGen.g:917:2: rule__VideoGenInformation__Group__2__Impl rule__VideoGenInformation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__VideoGenInformation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__2"


    // $ANTLR start "rule__VideoGenInformation__Group__2__Impl"
    // InternalVideoGen.g:924:1: rule__VideoGenInformation__Group__2__Impl : ( ( rule__VideoGenInformation__Group_2__0 )? ) ;
    public final void rule__VideoGenInformation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:928:1: ( ( ( rule__VideoGenInformation__Group_2__0 )? ) )
            // InternalVideoGen.g:929:1: ( ( rule__VideoGenInformation__Group_2__0 )? )
            {
            // InternalVideoGen.g:929:1: ( ( rule__VideoGenInformation__Group_2__0 )? )
            // InternalVideoGen.g:930:2: ( rule__VideoGenInformation__Group_2__0 )?
            {
             before(grammarAccess.getVideoGenInformationAccess().getGroup_2()); 
            // InternalVideoGen.g:931:2: ( rule__VideoGenInformation__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalVideoGen.g:931:3: rule__VideoGenInformation__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoGenInformation__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoGenInformationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__2__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group__3"
    // InternalVideoGen.g:939:1: rule__VideoGenInformation__Group__3 : rule__VideoGenInformation__Group__3__Impl ;
    public final void rule__VideoGenInformation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:943:1: ( rule__VideoGenInformation__Group__3__Impl )
            // InternalVideoGen.g:944:2: rule__VideoGenInformation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__3"


    // $ANTLR start "rule__VideoGenInformation__Group__3__Impl"
    // InternalVideoGen.g:950:1: rule__VideoGenInformation__Group__3__Impl : ( ( rule__VideoGenInformation__Group_3__0 )? ) ;
    public final void rule__VideoGenInformation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:954:1: ( ( ( rule__VideoGenInformation__Group_3__0 )? ) )
            // InternalVideoGen.g:955:1: ( ( rule__VideoGenInformation__Group_3__0 )? )
            {
            // InternalVideoGen.g:955:1: ( ( rule__VideoGenInformation__Group_3__0 )? )
            // InternalVideoGen.g:956:2: ( rule__VideoGenInformation__Group_3__0 )?
            {
             before(grammarAccess.getVideoGenInformationAccess().getGroup_3()); 
            // InternalVideoGen.g:957:2: ( rule__VideoGenInformation__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalVideoGen.g:957:3: rule__VideoGenInformation__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoGenInformation__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoGenInformationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group__3__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_1__0"
    // InternalVideoGen.g:966:1: rule__VideoGenInformation__Group_1__0 : rule__VideoGenInformation__Group_1__0__Impl rule__VideoGenInformation__Group_1__1 ;
    public final void rule__VideoGenInformation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:970:1: ( rule__VideoGenInformation__Group_1__0__Impl rule__VideoGenInformation__Group_1__1 )
            // InternalVideoGen.g:971:2: rule__VideoGenInformation__Group_1__0__Impl rule__VideoGenInformation__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoGenInformation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_1__0"


    // $ANTLR start "rule__VideoGenInformation__Group_1__0__Impl"
    // InternalVideoGen.g:978:1: rule__VideoGenInformation__Group_1__0__Impl : ( '@author' ) ;
    public final void rule__VideoGenInformation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:982:1: ( ( '@author' ) )
            // InternalVideoGen.g:983:1: ( '@author' )
            {
            // InternalVideoGen.g:983:1: ( '@author' )
            // InternalVideoGen.g:984:2: '@author'
            {
             before(grammarAccess.getVideoGenInformationAccess().getAuthorKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getAuthorKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_1__0__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_1__1"
    // InternalVideoGen.g:993:1: rule__VideoGenInformation__Group_1__1 : rule__VideoGenInformation__Group_1__1__Impl ;
    public final void rule__VideoGenInformation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:997:1: ( rule__VideoGenInformation__Group_1__1__Impl )
            // InternalVideoGen.g:998:2: rule__VideoGenInformation__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_1__1"


    // $ANTLR start "rule__VideoGenInformation__Group_1__1__Impl"
    // InternalVideoGen.g:1004:1: rule__VideoGenInformation__Group_1__1__Impl : ( ( rule__VideoGenInformation__AuthorNameAssignment_1_1 ) ) ;
    public final void rule__VideoGenInformation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1008:1: ( ( ( rule__VideoGenInformation__AuthorNameAssignment_1_1 ) ) )
            // InternalVideoGen.g:1009:1: ( ( rule__VideoGenInformation__AuthorNameAssignment_1_1 ) )
            {
            // InternalVideoGen.g:1009:1: ( ( rule__VideoGenInformation__AuthorNameAssignment_1_1 ) )
            // InternalVideoGen.g:1010:2: ( rule__VideoGenInformation__AuthorNameAssignment_1_1 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getAuthorNameAssignment_1_1()); 
            // InternalVideoGen.g:1011:2: ( rule__VideoGenInformation__AuthorNameAssignment_1_1 )
            // InternalVideoGen.g:1011:3: rule__VideoGenInformation__AuthorNameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__AuthorNameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getAuthorNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_1__1__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_2__0"
    // InternalVideoGen.g:1020:1: rule__VideoGenInformation__Group_2__0 : rule__VideoGenInformation__Group_2__0__Impl rule__VideoGenInformation__Group_2__1 ;
    public final void rule__VideoGenInformation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1024:1: ( rule__VideoGenInformation__Group_2__0__Impl rule__VideoGenInformation__Group_2__1 )
            // InternalVideoGen.g:1025:2: rule__VideoGenInformation__Group_2__0__Impl rule__VideoGenInformation__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoGenInformation__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_2__0"


    // $ANTLR start "rule__VideoGenInformation__Group_2__0__Impl"
    // InternalVideoGen.g:1032:1: rule__VideoGenInformation__Group_2__0__Impl : ( '@version' ) ;
    public final void rule__VideoGenInformation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1036:1: ( ( '@version' ) )
            // InternalVideoGen.g:1037:1: ( '@version' )
            {
            // InternalVideoGen.g:1037:1: ( '@version' )
            // InternalVideoGen.g:1038:2: '@version'
            {
             before(grammarAccess.getVideoGenInformationAccess().getVersionKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getVersionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_2__0__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_2__1"
    // InternalVideoGen.g:1047:1: rule__VideoGenInformation__Group_2__1 : rule__VideoGenInformation__Group_2__1__Impl ;
    public final void rule__VideoGenInformation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1051:1: ( rule__VideoGenInformation__Group_2__1__Impl )
            // InternalVideoGen.g:1052:2: rule__VideoGenInformation__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_2__1"


    // $ANTLR start "rule__VideoGenInformation__Group_2__1__Impl"
    // InternalVideoGen.g:1058:1: rule__VideoGenInformation__Group_2__1__Impl : ( ( rule__VideoGenInformation__VersionAssignment_2_1 ) ) ;
    public final void rule__VideoGenInformation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1062:1: ( ( ( rule__VideoGenInformation__VersionAssignment_2_1 ) ) )
            // InternalVideoGen.g:1063:1: ( ( rule__VideoGenInformation__VersionAssignment_2_1 ) )
            {
            // InternalVideoGen.g:1063:1: ( ( rule__VideoGenInformation__VersionAssignment_2_1 ) )
            // InternalVideoGen.g:1064:2: ( rule__VideoGenInformation__VersionAssignment_2_1 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getVersionAssignment_2_1()); 
            // InternalVideoGen.g:1065:2: ( rule__VideoGenInformation__VersionAssignment_2_1 )
            // InternalVideoGen.g:1065:3: rule__VideoGenInformation__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__VersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getVersionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_2__1__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_3__0"
    // InternalVideoGen.g:1074:1: rule__VideoGenInformation__Group_3__0 : rule__VideoGenInformation__Group_3__0__Impl rule__VideoGenInformation__Group_3__1 ;
    public final void rule__VideoGenInformation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1078:1: ( rule__VideoGenInformation__Group_3__0__Impl rule__VideoGenInformation__Group_3__1 )
            // InternalVideoGen.g:1079:2: rule__VideoGenInformation__Group_3__0__Impl rule__VideoGenInformation__Group_3__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoGenInformation__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_3__0"


    // $ANTLR start "rule__VideoGenInformation__Group_3__0__Impl"
    // InternalVideoGen.g:1086:1: rule__VideoGenInformation__Group_3__0__Impl : ( '@creation' ) ;
    public final void rule__VideoGenInformation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1090:1: ( ( '@creation' ) )
            // InternalVideoGen.g:1091:1: ( '@creation' )
            {
            // InternalVideoGen.g:1091:1: ( '@creation' )
            // InternalVideoGen.g:1092:2: '@creation'
            {
             before(grammarAccess.getVideoGenInformationAccess().getCreationKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getCreationKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_3__0__Impl"


    // $ANTLR start "rule__VideoGenInformation__Group_3__1"
    // InternalVideoGen.g:1101:1: rule__VideoGenInformation__Group_3__1 : rule__VideoGenInformation__Group_3__1__Impl ;
    public final void rule__VideoGenInformation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1105:1: ( rule__VideoGenInformation__Group_3__1__Impl )
            // InternalVideoGen.g:1106:2: rule__VideoGenInformation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_3__1"


    // $ANTLR start "rule__VideoGenInformation__Group_3__1__Impl"
    // InternalVideoGen.g:1112:1: rule__VideoGenInformation__Group_3__1__Impl : ( ( rule__VideoGenInformation__CreationDateAssignment_3_1 ) ) ;
    public final void rule__VideoGenInformation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1116:1: ( ( ( rule__VideoGenInformation__CreationDateAssignment_3_1 ) ) )
            // InternalVideoGen.g:1117:1: ( ( rule__VideoGenInformation__CreationDateAssignment_3_1 ) )
            {
            // InternalVideoGen.g:1117:1: ( ( rule__VideoGenInformation__CreationDateAssignment_3_1 ) )
            // InternalVideoGen.g:1118:2: ( rule__VideoGenInformation__CreationDateAssignment_3_1 )
            {
             before(grammarAccess.getVideoGenInformationAccess().getCreationDateAssignment_3_1()); 
            // InternalVideoGen.g:1119:2: ( rule__VideoGenInformation__CreationDateAssignment_3_1 )
            // InternalVideoGen.g:1119:3: rule__VideoGenInformation__CreationDateAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoGenInformation__CreationDateAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenInformationAccess().getCreationDateAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__Group_3__1__Impl"


    // $ANTLR start "rule__MandatoryImage__Group__0"
    // InternalVideoGen.g:1128:1: rule__MandatoryImage__Group__0 : rule__MandatoryImage__Group__0__Impl rule__MandatoryImage__Group__1 ;
    public final void rule__MandatoryImage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1132:1: ( rule__MandatoryImage__Group__0__Impl rule__MandatoryImage__Group__1 )
            // InternalVideoGen.g:1133:2: rule__MandatoryImage__Group__0__Impl rule__MandatoryImage__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__MandatoryImage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MandatoryImage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryImage__Group__0"


    // $ANTLR start "rule__MandatoryImage__Group__0__Impl"
    // InternalVideoGen.g:1140:1: rule__MandatoryImage__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryImage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1144:1: ( ( 'mandatory' ) )
            // InternalVideoGen.g:1145:1: ( 'mandatory' )
            {
            // InternalVideoGen.g:1145:1: ( 'mandatory' )
            // InternalVideoGen.g:1146:2: 'mandatory'
            {
             before(grammarAccess.getMandatoryImageAccess().getMandatoryKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMandatoryImageAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryImage__Group__0__Impl"


    // $ANTLR start "rule__MandatoryImage__Group__1"
    // InternalVideoGen.g:1155:1: rule__MandatoryImage__Group__1 : rule__MandatoryImage__Group__1__Impl ;
    public final void rule__MandatoryImage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1159:1: ( rule__MandatoryImage__Group__1__Impl )
            // InternalVideoGen.g:1160:2: rule__MandatoryImage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryImage__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryImage__Group__1"


    // $ANTLR start "rule__MandatoryImage__Group__1__Impl"
    // InternalVideoGen.g:1166:1: rule__MandatoryImage__Group__1__Impl : ( ( rule__MandatoryImage__DescriptionAssignment_1 ) ) ;
    public final void rule__MandatoryImage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1170:1: ( ( ( rule__MandatoryImage__DescriptionAssignment_1 ) ) )
            // InternalVideoGen.g:1171:1: ( ( rule__MandatoryImage__DescriptionAssignment_1 ) )
            {
            // InternalVideoGen.g:1171:1: ( ( rule__MandatoryImage__DescriptionAssignment_1 ) )
            // InternalVideoGen.g:1172:2: ( rule__MandatoryImage__DescriptionAssignment_1 )
            {
             before(grammarAccess.getMandatoryImageAccess().getDescriptionAssignment_1()); 
            // InternalVideoGen.g:1173:2: ( rule__MandatoryImage__DescriptionAssignment_1 )
            // InternalVideoGen.g:1173:3: rule__MandatoryImage__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryImage__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryImageAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryImage__Group__1__Impl"


    // $ANTLR start "rule__OptionalImage__Group__0"
    // InternalVideoGen.g:1182:1: rule__OptionalImage__Group__0 : rule__OptionalImage__Group__0__Impl rule__OptionalImage__Group__1 ;
    public final void rule__OptionalImage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1186:1: ( rule__OptionalImage__Group__0__Impl rule__OptionalImage__Group__1 )
            // InternalVideoGen.g:1187:2: rule__OptionalImage__Group__0__Impl rule__OptionalImage__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__OptionalImage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalImage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalImage__Group__0"


    // $ANTLR start "rule__OptionalImage__Group__0__Impl"
    // InternalVideoGen.g:1194:1: rule__OptionalImage__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalImage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1198:1: ( ( 'optional' ) )
            // InternalVideoGen.g:1199:1: ( 'optional' )
            {
            // InternalVideoGen.g:1199:1: ( 'optional' )
            // InternalVideoGen.g:1200:2: 'optional'
            {
             before(grammarAccess.getOptionalImageAccess().getOptionalKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOptionalImageAccess().getOptionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalImage__Group__0__Impl"


    // $ANTLR start "rule__OptionalImage__Group__1"
    // InternalVideoGen.g:1209:1: rule__OptionalImage__Group__1 : rule__OptionalImage__Group__1__Impl ;
    public final void rule__OptionalImage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1213:1: ( rule__OptionalImage__Group__1__Impl )
            // InternalVideoGen.g:1214:2: rule__OptionalImage__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptionalImage__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalImage__Group__1"


    // $ANTLR start "rule__OptionalImage__Group__1__Impl"
    // InternalVideoGen.g:1220:1: rule__OptionalImage__Group__1__Impl : ( ( rule__OptionalImage__DescriptionAssignment_1 ) ) ;
    public final void rule__OptionalImage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1224:1: ( ( ( rule__OptionalImage__DescriptionAssignment_1 ) ) )
            // InternalVideoGen.g:1225:1: ( ( rule__OptionalImage__DescriptionAssignment_1 ) )
            {
            // InternalVideoGen.g:1225:1: ( ( rule__OptionalImage__DescriptionAssignment_1 ) )
            // InternalVideoGen.g:1226:2: ( rule__OptionalImage__DescriptionAssignment_1 )
            {
             before(grammarAccess.getOptionalImageAccess().getDescriptionAssignment_1()); 
            // InternalVideoGen.g:1227:2: ( rule__OptionalImage__DescriptionAssignment_1 )
            // InternalVideoGen.g:1227:3: rule__OptionalImage__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OptionalImage__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalImageAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalImage__Group__1__Impl"


    // $ANTLR start "rule__AlternativeImage__Group__0"
    // InternalVideoGen.g:1236:1: rule__AlternativeImage__Group__0 : rule__AlternativeImage__Group__0__Impl rule__AlternativeImage__Group__1 ;
    public final void rule__AlternativeImage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1240:1: ( rule__AlternativeImage__Group__0__Impl rule__AlternativeImage__Group__1 )
            // InternalVideoGen.g:1241:2: rule__AlternativeImage__Group__0__Impl rule__AlternativeImage__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AlternativeImage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeImage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__0"


    // $ANTLR start "rule__AlternativeImage__Group__0__Impl"
    // InternalVideoGen.g:1248:1: rule__AlternativeImage__Group__0__Impl : ( 'alternatives' ) ;
    public final void rule__AlternativeImage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1252:1: ( ( 'alternatives' ) )
            // InternalVideoGen.g:1253:1: ( 'alternatives' )
            {
            // InternalVideoGen.g:1253:1: ( 'alternatives' )
            // InternalVideoGen.g:1254:2: 'alternatives'
            {
             before(grammarAccess.getAlternativeImageAccess().getAlternativesKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAlternativeImageAccess().getAlternativesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__0__Impl"


    // $ANTLR start "rule__AlternativeImage__Group__1"
    // InternalVideoGen.g:1263:1: rule__AlternativeImage__Group__1 : rule__AlternativeImage__Group__1__Impl rule__AlternativeImage__Group__2 ;
    public final void rule__AlternativeImage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1267:1: ( rule__AlternativeImage__Group__1__Impl rule__AlternativeImage__Group__2 )
            // InternalVideoGen.g:1268:2: rule__AlternativeImage__Group__1__Impl rule__AlternativeImage__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AlternativeImage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeImage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__1"


    // $ANTLR start "rule__AlternativeImage__Group__1__Impl"
    // InternalVideoGen.g:1275:1: rule__AlternativeImage__Group__1__Impl : ( ( rule__AlternativeImage__ImageidAssignment_1 )? ) ;
    public final void rule__AlternativeImage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1279:1: ( ( ( rule__AlternativeImage__ImageidAssignment_1 )? ) )
            // InternalVideoGen.g:1280:1: ( ( rule__AlternativeImage__ImageidAssignment_1 )? )
            {
            // InternalVideoGen.g:1280:1: ( ( rule__AlternativeImage__ImageidAssignment_1 )? )
            // InternalVideoGen.g:1281:2: ( rule__AlternativeImage__ImageidAssignment_1 )?
            {
             before(grammarAccess.getAlternativeImageAccess().getImageidAssignment_1()); 
            // InternalVideoGen.g:1282:2: ( rule__AlternativeImage__ImageidAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalVideoGen.g:1282:3: rule__AlternativeImage__ImageidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AlternativeImage__ImageidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativeImageAccess().getImageidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__1__Impl"


    // $ANTLR start "rule__AlternativeImage__Group__2"
    // InternalVideoGen.g:1290:1: rule__AlternativeImage__Group__2 : rule__AlternativeImage__Group__2__Impl rule__AlternativeImage__Group__3 ;
    public final void rule__AlternativeImage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1294:1: ( rule__AlternativeImage__Group__2__Impl rule__AlternativeImage__Group__3 )
            // InternalVideoGen.g:1295:2: rule__AlternativeImage__Group__2__Impl rule__AlternativeImage__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__AlternativeImage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeImage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__2"


    // $ANTLR start "rule__AlternativeImage__Group__2__Impl"
    // InternalVideoGen.g:1302:1: rule__AlternativeImage__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__AlternativeImage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1306:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:1307:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:1307:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:1308:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAlternativeImageAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAlternativeImageAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__2__Impl"


    // $ANTLR start "rule__AlternativeImage__Group__3"
    // InternalVideoGen.g:1317:1: rule__AlternativeImage__Group__3 : rule__AlternativeImage__Group__3__Impl rule__AlternativeImage__Group__4 ;
    public final void rule__AlternativeImage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1321:1: ( rule__AlternativeImage__Group__3__Impl rule__AlternativeImage__Group__4 )
            // InternalVideoGen.g:1322:2: rule__AlternativeImage__Group__3__Impl rule__AlternativeImage__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AlternativeImage__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeImage__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__3"


    // $ANTLR start "rule__AlternativeImage__Group__3__Impl"
    // InternalVideoGen.g:1329:1: rule__AlternativeImage__Group__3__Impl : ( ( ( rule__AlternativeImage__ImagesAssignment_3 ) ) ( ( rule__AlternativeImage__ImagesAssignment_3 )* ) ) ;
    public final void rule__AlternativeImage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1333:1: ( ( ( ( rule__AlternativeImage__ImagesAssignment_3 ) ) ( ( rule__AlternativeImage__ImagesAssignment_3 )* ) ) )
            // InternalVideoGen.g:1334:1: ( ( ( rule__AlternativeImage__ImagesAssignment_3 ) ) ( ( rule__AlternativeImage__ImagesAssignment_3 )* ) )
            {
            // InternalVideoGen.g:1334:1: ( ( ( rule__AlternativeImage__ImagesAssignment_3 ) ) ( ( rule__AlternativeImage__ImagesAssignment_3 )* ) )
            // InternalVideoGen.g:1335:2: ( ( rule__AlternativeImage__ImagesAssignment_3 ) ) ( ( rule__AlternativeImage__ImagesAssignment_3 )* )
            {
            // InternalVideoGen.g:1335:2: ( ( rule__AlternativeImage__ImagesAssignment_3 ) )
            // InternalVideoGen.g:1336:3: ( rule__AlternativeImage__ImagesAssignment_3 )
            {
             before(grammarAccess.getAlternativeImageAccess().getImagesAssignment_3()); 
            // InternalVideoGen.g:1337:3: ( rule__AlternativeImage__ImagesAssignment_3 )
            // InternalVideoGen.g:1337:4: rule__AlternativeImage__ImagesAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__AlternativeImage__ImagesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeImageAccess().getImagesAssignment_3()); 

            }

            // InternalVideoGen.g:1340:2: ( ( rule__AlternativeImage__ImagesAssignment_3 )* )
            // InternalVideoGen.g:1341:3: ( rule__AlternativeImage__ImagesAssignment_3 )*
            {
             before(grammarAccess.getAlternativeImageAccess().getImagesAssignment_3()); 
            // InternalVideoGen.g:1342:3: ( rule__AlternativeImage__ImagesAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalVideoGen.g:1342:4: rule__AlternativeImage__ImagesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__AlternativeImage__ImagesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getAlternativeImageAccess().getImagesAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__3__Impl"


    // $ANTLR start "rule__AlternativeImage__Group__4"
    // InternalVideoGen.g:1351:1: rule__AlternativeImage__Group__4 : rule__AlternativeImage__Group__4__Impl ;
    public final void rule__AlternativeImage__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1355:1: ( rule__AlternativeImage__Group__4__Impl )
            // InternalVideoGen.g:1356:2: rule__AlternativeImage__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeImage__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__4"


    // $ANTLR start "rule__AlternativeImage__Group__4__Impl"
    // InternalVideoGen.g:1362:1: rule__AlternativeImage__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__AlternativeImage__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1366:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:1367:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:1367:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:1368:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAlternativeImageAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAlternativeImageAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__Group__4__Impl"


    // $ANTLR start "rule__ImageDescription__Group__0"
    // InternalVideoGen.g:1378:1: rule__ImageDescription__Group__0 : rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1 ;
    public final void rule__ImageDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1382:1: ( rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1 )
            // InternalVideoGen.g:1383:2: rule__ImageDescription__Group__0__Impl rule__ImageDescription__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ImageDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__0"


    // $ANTLR start "rule__ImageDescription__Group__0__Impl"
    // InternalVideoGen.g:1390:1: rule__ImageDescription__Group__0__Impl : ( 'image' ) ;
    public final void rule__ImageDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1394:1: ( ( 'image' ) )
            // InternalVideoGen.g:1395:1: ( 'image' )
            {
            // InternalVideoGen.g:1395:1: ( 'image' )
            // InternalVideoGen.g:1396:2: 'image'
            {
             before(grammarAccess.getImageDescriptionAccess().getImageKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getImageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group__1"
    // InternalVideoGen.g:1405:1: rule__ImageDescription__Group__1 : rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2 ;
    public final void rule__ImageDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1409:1: ( rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2 )
            // InternalVideoGen.g:1410:2: rule__ImageDescription__Group__1__Impl rule__ImageDescription__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ImageDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__1"


    // $ANTLR start "rule__ImageDescription__Group__1__Impl"
    // InternalVideoGen.g:1417:1: rule__ImageDescription__Group__1__Impl : ( ( rule__ImageDescription__ImageidAssignment_1 )? ) ;
    public final void rule__ImageDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1421:1: ( ( ( rule__ImageDescription__ImageidAssignment_1 )? ) )
            // InternalVideoGen.g:1422:1: ( ( rule__ImageDescription__ImageidAssignment_1 )? )
            {
            // InternalVideoGen.g:1422:1: ( ( rule__ImageDescription__ImageidAssignment_1 )? )
            // InternalVideoGen.g:1423:2: ( rule__ImageDescription__ImageidAssignment_1 )?
            {
             before(grammarAccess.getImageDescriptionAccess().getImageidAssignment_1()); 
            // InternalVideoGen.g:1424:2: ( rule__ImageDescription__ImageidAssignment_1 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalVideoGen.g:1424:3: rule__ImageDescription__ImageidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageDescription__ImageidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageDescriptionAccess().getImageidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group__2"
    // InternalVideoGen.g:1432:1: rule__ImageDescription__Group__2 : rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3 ;
    public final void rule__ImageDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1436:1: ( rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3 )
            // InternalVideoGen.g:1437:2: rule__ImageDescription__Group__2__Impl rule__ImageDescription__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ImageDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__2"


    // $ANTLR start "rule__ImageDescription__Group__2__Impl"
    // InternalVideoGen.g:1444:1: rule__ImageDescription__Group__2__Impl : ( ( rule__ImageDescription__LocationAssignment_2 ) ) ;
    public final void rule__ImageDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1448:1: ( ( ( rule__ImageDescription__LocationAssignment_2 ) ) )
            // InternalVideoGen.g:1449:1: ( ( rule__ImageDescription__LocationAssignment_2 ) )
            {
            // InternalVideoGen.g:1449:1: ( ( rule__ImageDescription__LocationAssignment_2 ) )
            // InternalVideoGen.g:1450:2: ( rule__ImageDescription__LocationAssignment_2 )
            {
             before(grammarAccess.getImageDescriptionAccess().getLocationAssignment_2()); 
            // InternalVideoGen.g:1451:2: ( rule__ImageDescription__LocationAssignment_2 )
            // InternalVideoGen.g:1451:3: rule__ImageDescription__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getLocationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__2__Impl"


    // $ANTLR start "rule__ImageDescription__Group__3"
    // InternalVideoGen.g:1459:1: rule__ImageDescription__Group__3 : rule__ImageDescription__Group__3__Impl ;
    public final void rule__ImageDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1463:1: ( rule__ImageDescription__Group__3__Impl )
            // InternalVideoGen.g:1464:2: rule__ImageDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__3"


    // $ANTLR start "rule__ImageDescription__Group__3__Impl"
    // InternalVideoGen.g:1470:1: rule__ImageDescription__Group__3__Impl : ( ( rule__ImageDescription__Group_3__0 )? ) ;
    public final void rule__ImageDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1474:1: ( ( ( rule__ImageDescription__Group_3__0 )? ) )
            // InternalVideoGen.g:1475:1: ( ( rule__ImageDescription__Group_3__0 )? )
            {
            // InternalVideoGen.g:1475:1: ( ( rule__ImageDescription__Group_3__0 )? )
            // InternalVideoGen.g:1476:2: ( rule__ImageDescription__Group_3__0 )?
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3()); 
            // InternalVideoGen.g:1477:2: ( rule__ImageDescription__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_LEFT_BRACKET) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalVideoGen.g:1477:3: rule__ImageDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ImageDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group__3__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__0"
    // InternalVideoGen.g:1486:1: rule__ImageDescription__Group_3__0 : rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1 ;
    public final void rule__ImageDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1490:1: ( rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1 )
            // InternalVideoGen.g:1491:2: rule__ImageDescription__Group_3__0__Impl rule__ImageDescription__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__ImageDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__0"


    // $ANTLR start "rule__ImageDescription__Group_3__0__Impl"
    // InternalVideoGen.g:1498:1: rule__ImageDescription__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__ImageDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1502:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:1503:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:1503:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:1504:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__1"
    // InternalVideoGen.g:1513:1: rule__ImageDescription__Group_3__1 : rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2 ;
    public final void rule__ImageDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1517:1: ( rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2 )
            // InternalVideoGen.g:1518:2: rule__ImageDescription__Group_3__1__Impl rule__ImageDescription__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ImageDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__1"


    // $ANTLR start "rule__ImageDescription__Group_3__1__Impl"
    // InternalVideoGen.g:1525:1: rule__ImageDescription__Group_3__1__Impl : ( ( rule__ImageDescription__Group_3_1__0 ) ) ;
    public final void rule__ImageDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1529:1: ( ( ( rule__ImageDescription__Group_3_1__0 ) ) )
            // InternalVideoGen.g:1530:1: ( ( rule__ImageDescription__Group_3_1__0 ) )
            {
            // InternalVideoGen.g:1530:1: ( ( rule__ImageDescription__Group_3_1__0 ) )
            // InternalVideoGen.g:1531:2: ( rule__ImageDescription__Group_3_1__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3_1()); 
            // InternalVideoGen.g:1532:2: ( rule__ImageDescription__Group_3_1__0 )
            // InternalVideoGen.g:1532:3: rule__ImageDescription__Group_3_1__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__2"
    // InternalVideoGen.g:1540:1: rule__ImageDescription__Group_3__2 : rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3 ;
    public final void rule__ImageDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1544:1: ( rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3 )
            // InternalVideoGen.g:1545:2: rule__ImageDescription__Group_3__2__Impl rule__ImageDescription__Group_3__3
            {
            pushFollow(FOLLOW_6);
            rule__ImageDescription__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__2"


    // $ANTLR start "rule__ImageDescription__Group_3__2__Impl"
    // InternalVideoGen.g:1552:1: rule__ImageDescription__Group_3__2__Impl : ( ( rule__ImageDescription__Group_3_2__0 ) ) ;
    public final void rule__ImageDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1556:1: ( ( ( rule__ImageDescription__Group_3_2__0 ) ) )
            // InternalVideoGen.g:1557:1: ( ( rule__ImageDescription__Group_3_2__0 ) )
            {
            // InternalVideoGen.g:1557:1: ( ( rule__ImageDescription__Group_3_2__0 ) )
            // InternalVideoGen.g:1558:2: ( rule__ImageDescription__Group_3_2__0 )
            {
             before(grammarAccess.getImageDescriptionAccess().getGroup_3_2()); 
            // InternalVideoGen.g:1559:2: ( rule__ImageDescription__Group_3_2__0 )
            // InternalVideoGen.g:1559:3: rule__ImageDescription__Group_3_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__0();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__2__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3__3"
    // InternalVideoGen.g:1567:1: rule__ImageDescription__Group_3__3 : rule__ImageDescription__Group_3__3__Impl ;
    public final void rule__ImageDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1571:1: ( rule__ImageDescription__Group_3__3__Impl )
            // InternalVideoGen.g:1572:2: rule__ImageDescription__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__3"


    // $ANTLR start "rule__ImageDescription__Group_3__3__Impl"
    // InternalVideoGen.g:1578:1: rule__ImageDescription__Group_3__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__ImageDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1582:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:1583:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:1583:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:1584:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3__3__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_1__0"
    // InternalVideoGen.g:1594:1: rule__ImageDescription__Group_3_1__0 : rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1 ;
    public final void rule__ImageDescription__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1598:1: ( rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1 )
            // InternalVideoGen.g:1599:2: rule__ImageDescription__Group_3_1__0__Impl rule__ImageDescription__Group_3_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ImageDescription__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_1__0"


    // $ANTLR start "rule__ImageDescription__Group_3_1__0__Impl"
    // InternalVideoGen.g:1606:1: rule__ImageDescription__Group_3_1__0__Impl : ( 'toptext' ) ;
    public final void rule__ImageDescription__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1610:1: ( ( 'toptext' ) )
            // InternalVideoGen.g:1611:1: ( 'toptext' )
            {
            // InternalVideoGen.g:1611:1: ( 'toptext' )
            // InternalVideoGen.g:1612:2: 'toptext'
            {
             before(grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getToptextKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_1__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_1__1"
    // InternalVideoGen.g:1621:1: rule__ImageDescription__Group_3_1__1 : rule__ImageDescription__Group_3_1__1__Impl ;
    public final void rule__ImageDescription__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1625:1: ( rule__ImageDescription__Group_3_1__1__Impl )
            // InternalVideoGen.g:1626:2: rule__ImageDescription__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_1__1"


    // $ANTLR start "rule__ImageDescription__Group_3_1__1__Impl"
    // InternalVideoGen.g:1632:1: rule__ImageDescription__Group_3_1__1__Impl : ( ( rule__ImageDescription__TopAssignment_3_1_1 ) ) ;
    public final void rule__ImageDescription__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1636:1: ( ( ( rule__ImageDescription__TopAssignment_3_1_1 ) ) )
            // InternalVideoGen.g:1637:1: ( ( rule__ImageDescription__TopAssignment_3_1_1 ) )
            {
            // InternalVideoGen.g:1637:1: ( ( rule__ImageDescription__TopAssignment_3_1_1 ) )
            // InternalVideoGen.g:1638:2: ( rule__ImageDescription__TopAssignment_3_1_1 )
            {
             before(grammarAccess.getImageDescriptionAccess().getTopAssignment_3_1_1()); 
            // InternalVideoGen.g:1639:2: ( rule__ImageDescription__TopAssignment_3_1_1 )
            // InternalVideoGen.g:1639:3: rule__ImageDescription__TopAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__TopAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getTopAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_1__1__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_2__0"
    // InternalVideoGen.g:1648:1: rule__ImageDescription__Group_3_2__0 : rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1 ;
    public final void rule__ImageDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1652:1: ( rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1 )
            // InternalVideoGen.g:1653:2: rule__ImageDescription__Group_3_2__0__Impl rule__ImageDescription__Group_3_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ImageDescription__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_2__0"


    // $ANTLR start "rule__ImageDescription__Group_3_2__0__Impl"
    // InternalVideoGen.g:1660:1: rule__ImageDescription__Group_3_2__0__Impl : ( 'bottomtext' ) ;
    public final void rule__ImageDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1664:1: ( ( 'bottomtext' ) )
            // InternalVideoGen.g:1665:1: ( 'bottomtext' )
            {
            // InternalVideoGen.g:1665:1: ( 'bottomtext' )
            // InternalVideoGen.g:1666:2: 'bottomtext'
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getBottomtextKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_2__0__Impl"


    // $ANTLR start "rule__ImageDescription__Group_3_2__1"
    // InternalVideoGen.g:1675:1: rule__ImageDescription__Group_3_2__1 : rule__ImageDescription__Group_3_2__1__Impl ;
    public final void rule__ImageDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1679:1: ( rule__ImageDescription__Group_3_2__1__Impl )
            // InternalVideoGen.g:1680:2: rule__ImageDescription__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_2__1"


    // $ANTLR start "rule__ImageDescription__Group_3_2__1__Impl"
    // InternalVideoGen.g:1686:1: rule__ImageDescription__Group_3_2__1__Impl : ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) ) ;
    public final void rule__ImageDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1690:1: ( ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) ) )
            // InternalVideoGen.g:1691:1: ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) )
            {
            // InternalVideoGen.g:1691:1: ( ( rule__ImageDescription__BottomAssignment_3_2_1 ) )
            // InternalVideoGen.g:1692:2: ( rule__ImageDescription__BottomAssignment_3_2_1 )
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomAssignment_3_2_1()); 
            // InternalVideoGen.g:1693:2: ( rule__ImageDescription__BottomAssignment_3_2_1 )
            // InternalVideoGen.g:1693:3: rule__ImageDescription__BottomAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ImageDescription__BottomAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getImageDescriptionAccess().getBottomAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__Group_3_2__1__Impl"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__0"
    // InternalVideoGen.g:1702:1: rule__MandatoryVideoSeq__Group__0 : rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 ;
    public final void rule__MandatoryVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1706:1: ( rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1 )
            // InternalVideoGen.g:1707:2: rule__MandatoryVideoSeq__Group__0__Impl rule__MandatoryVideoSeq__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__MandatoryVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MandatoryVideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__Group__0"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__0__Impl"
    // InternalVideoGen.g:1714:1: rule__MandatoryVideoSeq__Group__0__Impl : ( 'mandatory' ) ;
    public final void rule__MandatoryVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1718:1: ( ( 'mandatory' ) )
            // InternalVideoGen.g:1719:1: ( 'mandatory' )
            {
            // InternalVideoGen.g:1719:1: ( 'mandatory' )
            // InternalVideoGen.g:1720:2: 'mandatory'
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMandatoryVideoSeqAccess().getMandatoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__Group__0__Impl"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__1"
    // InternalVideoGen.g:1729:1: rule__MandatoryVideoSeq__Group__1 : rule__MandatoryVideoSeq__Group__1__Impl ;
    public final void rule__MandatoryVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1733:1: ( rule__MandatoryVideoSeq__Group__1__Impl )
            // InternalVideoGen.g:1734:2: rule__MandatoryVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryVideoSeq__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__Group__1"


    // $ANTLR start "rule__MandatoryVideoSeq__Group__1__Impl"
    // InternalVideoGen.g:1740:1: rule__MandatoryVideoSeq__Group__1__Impl : ( ( rule__MandatoryVideoSeq__DescriptionAssignment_1 ) ) ;
    public final void rule__MandatoryVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1744:1: ( ( ( rule__MandatoryVideoSeq__DescriptionAssignment_1 ) ) )
            // InternalVideoGen.g:1745:1: ( ( rule__MandatoryVideoSeq__DescriptionAssignment_1 ) )
            {
            // InternalVideoGen.g:1745:1: ( ( rule__MandatoryVideoSeq__DescriptionAssignment_1 ) )
            // InternalVideoGen.g:1746:2: ( rule__MandatoryVideoSeq__DescriptionAssignment_1 )
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getDescriptionAssignment_1()); 
            // InternalVideoGen.g:1747:2: ( rule__MandatoryVideoSeq__DescriptionAssignment_1 )
            // InternalVideoGen.g:1747:3: rule__MandatoryVideoSeq__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MandatoryVideoSeq__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryVideoSeqAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__Group__1__Impl"


    // $ANTLR start "rule__OptionalVideoSeq__Group__0"
    // InternalVideoGen.g:1756:1: rule__OptionalVideoSeq__Group__0 : rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 ;
    public final void rule__OptionalVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1760:1: ( rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1 )
            // InternalVideoGen.g:1761:2: rule__OptionalVideoSeq__Group__0__Impl rule__OptionalVideoSeq__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__OptionalVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OptionalVideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__Group__0"


    // $ANTLR start "rule__OptionalVideoSeq__Group__0__Impl"
    // InternalVideoGen.g:1768:1: rule__OptionalVideoSeq__Group__0__Impl : ( 'optional' ) ;
    public final void rule__OptionalVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1772:1: ( ( 'optional' ) )
            // InternalVideoGen.g:1773:1: ( 'optional' )
            {
            // InternalVideoGen.g:1773:1: ( 'optional' )
            // InternalVideoGen.g:1774:2: 'optional'
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOptionalVideoSeqAccess().getOptionalKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__Group__0__Impl"


    // $ANTLR start "rule__OptionalVideoSeq__Group__1"
    // InternalVideoGen.g:1783:1: rule__OptionalVideoSeq__Group__1 : rule__OptionalVideoSeq__Group__1__Impl ;
    public final void rule__OptionalVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1787:1: ( rule__OptionalVideoSeq__Group__1__Impl )
            // InternalVideoGen.g:1788:2: rule__OptionalVideoSeq__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OptionalVideoSeq__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__Group__1"


    // $ANTLR start "rule__OptionalVideoSeq__Group__1__Impl"
    // InternalVideoGen.g:1794:1: rule__OptionalVideoSeq__Group__1__Impl : ( ( rule__OptionalVideoSeq__DescriptionAssignment_1 ) ) ;
    public final void rule__OptionalVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1798:1: ( ( ( rule__OptionalVideoSeq__DescriptionAssignment_1 ) ) )
            // InternalVideoGen.g:1799:1: ( ( rule__OptionalVideoSeq__DescriptionAssignment_1 ) )
            {
            // InternalVideoGen.g:1799:1: ( ( rule__OptionalVideoSeq__DescriptionAssignment_1 ) )
            // InternalVideoGen.g:1800:2: ( rule__OptionalVideoSeq__DescriptionAssignment_1 )
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getDescriptionAssignment_1()); 
            // InternalVideoGen.g:1801:2: ( rule__OptionalVideoSeq__DescriptionAssignment_1 )
            // InternalVideoGen.g:1801:3: rule__OptionalVideoSeq__DescriptionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OptionalVideoSeq__DescriptionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalVideoSeqAccess().getDescriptionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__Group__1__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__0"
    // InternalVideoGen.g:1810:1: rule__AlternativeVideoSeq__Group__0 : rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 ;
    public final void rule__AlternativeVideoSeq__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1814:1: ( rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1 )
            // InternalVideoGen.g:1815:2: rule__AlternativeVideoSeq__Group__0__Impl rule__AlternativeVideoSeq__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AlternativeVideoSeq__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeVideoSeq__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__0"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__0__Impl"
    // InternalVideoGen.g:1822:1: rule__AlternativeVideoSeq__Group__0__Impl : ( 'alternatives' ) ;
    public final void rule__AlternativeVideoSeq__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1826:1: ( ( 'alternatives' ) )
            // InternalVideoGen.g:1827:1: ( 'alternatives' )
            {
            // InternalVideoGen.g:1827:1: ( 'alternatives' )
            // InternalVideoGen.g:1828:2: 'alternatives'
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getAlternativesKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAlternativeVideoSeqAccess().getAlternativesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__0__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__1"
    // InternalVideoGen.g:1837:1: rule__AlternativeVideoSeq__Group__1 : rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2 ;
    public final void rule__AlternativeVideoSeq__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1841:1: ( rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2 )
            // InternalVideoGen.g:1842:2: rule__AlternativeVideoSeq__Group__1__Impl rule__AlternativeVideoSeq__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__AlternativeVideoSeq__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeVideoSeq__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__1"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__1__Impl"
    // InternalVideoGen.g:1849:1: rule__AlternativeVideoSeq__Group__1__Impl : ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? ) ;
    public final void rule__AlternativeVideoSeq__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1853:1: ( ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? ) )
            // InternalVideoGen.g:1854:1: ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? )
            {
            // InternalVideoGen.g:1854:1: ( ( rule__AlternativeVideoSeq__VideoidAssignment_1 )? )
            // InternalVideoGen.g:1855:2: ( rule__AlternativeVideoSeq__VideoidAssignment_1 )?
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoidAssignment_1()); 
            // InternalVideoGen.g:1856:2: ( rule__AlternativeVideoSeq__VideoidAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalVideoGen.g:1856:3: rule__AlternativeVideoSeq__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AlternativeVideoSeq__VideoidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__1__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__2"
    // InternalVideoGen.g:1864:1: rule__AlternativeVideoSeq__Group__2 : rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3 ;
    public final void rule__AlternativeVideoSeq__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1868:1: ( rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3 )
            // InternalVideoGen.g:1869:2: rule__AlternativeVideoSeq__Group__2__Impl rule__AlternativeVideoSeq__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__AlternativeVideoSeq__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeVideoSeq__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__2"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__2__Impl"
    // InternalVideoGen.g:1876:1: rule__AlternativeVideoSeq__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__AlternativeVideoSeq__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1880:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:1881:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:1881:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:1882:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAlternativeVideoSeqAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__2__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__3"
    // InternalVideoGen.g:1891:1: rule__AlternativeVideoSeq__Group__3 : rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4 ;
    public final void rule__AlternativeVideoSeq__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1895:1: ( rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4 )
            // InternalVideoGen.g:1896:2: rule__AlternativeVideoSeq__Group__3__Impl rule__AlternativeVideoSeq__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AlternativeVideoSeq__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AlternativeVideoSeq__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__3"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__3__Impl"
    // InternalVideoGen.g:1903:1: rule__AlternativeVideoSeq__Group__3__Impl : ( ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )* ) ) ;
    public final void rule__AlternativeVideoSeq__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1907:1: ( ( ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )* ) ) )
            // InternalVideoGen.g:1908:1: ( ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )* ) )
            {
            // InternalVideoGen.g:1908:1: ( ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )* ) )
            // InternalVideoGen.g:1909:2: ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 ) ) ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )* )
            {
            // InternalVideoGen.g:1909:2: ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 ) )
            // InternalVideoGen.g:1910:3: ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsAssignment_3()); 
            // InternalVideoGen.g:1911:3: ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )
            // InternalVideoGen.g:1911:4: rule__AlternativeVideoSeq__VideodescsAssignment_3
            {
            pushFollow(FOLLOW_18);
            rule__AlternativeVideoSeq__VideodescsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsAssignment_3()); 

            }

            // InternalVideoGen.g:1914:2: ( ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )* )
            // InternalVideoGen.g:1915:3: ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )*
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsAssignment_3()); 
            // InternalVideoGen.g:1916:3: ( rule__AlternativeVideoSeq__VideodescsAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==32) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalVideoGen.g:1916:4: rule__AlternativeVideoSeq__VideodescsAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__AlternativeVideoSeq__VideodescsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__3__Impl"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__4"
    // InternalVideoGen.g:1925:1: rule__AlternativeVideoSeq__Group__4 : rule__AlternativeVideoSeq__Group__4__Impl ;
    public final void rule__AlternativeVideoSeq__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1929:1: ( rule__AlternativeVideoSeq__Group__4__Impl )
            // InternalVideoGen.g:1930:2: rule__AlternativeVideoSeq__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AlternativeVideoSeq__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__4"


    // $ANTLR start "rule__AlternativeVideoSeq__Group__4__Impl"
    // InternalVideoGen.g:1936:1: rule__AlternativeVideoSeq__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__AlternativeVideoSeq__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1940:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:1941:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:1941:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:1942:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getAlternativeVideoSeqAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__Group__4__Impl"


    // $ANTLR start "rule__VideoDescription__Group__0"
    // InternalVideoGen.g:1952:1: rule__VideoDescription__Group__0 : rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1 ;
    public final void rule__VideoDescription__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1956:1: ( rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1 )
            // InternalVideoGen.g:1957:2: rule__VideoDescription__Group__0__Impl rule__VideoDescription__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__VideoDescription__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__0"


    // $ANTLR start "rule__VideoDescription__Group__0__Impl"
    // InternalVideoGen.g:1964:1: rule__VideoDescription__Group__0__Impl : ( 'videoseq' ) ;
    public final void rule__VideoDescription__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1968:1: ( ( 'videoseq' ) )
            // InternalVideoGen.g:1969:1: ( 'videoseq' )
            {
            // InternalVideoGen.g:1969:1: ( 'videoseq' )
            // InternalVideoGen.g:1970:2: 'videoseq'
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getVideoseqKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group__1"
    // InternalVideoGen.g:1979:1: rule__VideoDescription__Group__1 : rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2 ;
    public final void rule__VideoDescription__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1983:1: ( rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2 )
            // InternalVideoGen.g:1984:2: rule__VideoDescription__Group__1__Impl rule__VideoDescription__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__VideoDescription__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__1"


    // $ANTLR start "rule__VideoDescription__Group__1__Impl"
    // InternalVideoGen.g:1991:1: rule__VideoDescription__Group__1__Impl : ( ( rule__VideoDescription__VideoidAssignment_1 )? ) ;
    public final void rule__VideoDescription__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:1995:1: ( ( ( rule__VideoDescription__VideoidAssignment_1 )? ) )
            // InternalVideoGen.g:1996:1: ( ( rule__VideoDescription__VideoidAssignment_1 )? )
            {
            // InternalVideoGen.g:1996:1: ( ( rule__VideoDescription__VideoidAssignment_1 )? )
            // InternalVideoGen.g:1997:2: ( rule__VideoDescription__VideoidAssignment_1 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoidAssignment_1()); 
            // InternalVideoGen.g:1998:2: ( rule__VideoDescription__VideoidAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalVideoGen.g:1998:3: rule__VideoDescription__VideoidAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__VideoidAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getVideoidAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group__2"
    // InternalVideoGen.g:2006:1: rule__VideoDescription__Group__2 : rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3 ;
    public final void rule__VideoDescription__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2010:1: ( rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3 )
            // InternalVideoGen.g:2011:2: rule__VideoDescription__Group__2__Impl rule__VideoDescription__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__VideoDescription__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__2"


    // $ANTLR start "rule__VideoDescription__Group__2__Impl"
    // InternalVideoGen.g:2018:1: rule__VideoDescription__Group__2__Impl : ( ( rule__VideoDescription__LocationAssignment_2 ) ) ;
    public final void rule__VideoDescription__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2022:1: ( ( ( rule__VideoDescription__LocationAssignment_2 ) ) )
            // InternalVideoGen.g:2023:1: ( ( rule__VideoDescription__LocationAssignment_2 ) )
            {
            // InternalVideoGen.g:2023:1: ( ( rule__VideoDescription__LocationAssignment_2 ) )
            // InternalVideoGen.g:2024:2: ( rule__VideoDescription__LocationAssignment_2 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getLocationAssignment_2()); 
            // InternalVideoGen.g:2025:2: ( rule__VideoDescription__LocationAssignment_2 )
            // InternalVideoGen.g:2025:3: rule__VideoDescription__LocationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__LocationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getLocationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__2__Impl"


    // $ANTLR start "rule__VideoDescription__Group__3"
    // InternalVideoGen.g:2033:1: rule__VideoDescription__Group__3 : rule__VideoDescription__Group__3__Impl ;
    public final void rule__VideoDescription__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2037:1: ( rule__VideoDescription__Group__3__Impl )
            // InternalVideoGen.g:2038:2: rule__VideoDescription__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__3"


    // $ANTLR start "rule__VideoDescription__Group__3__Impl"
    // InternalVideoGen.g:2044:1: rule__VideoDescription__Group__3__Impl : ( ( rule__VideoDescription__Group_3__0 )? ) ;
    public final void rule__VideoDescription__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2048:1: ( ( ( rule__VideoDescription__Group_3__0 )? ) )
            // InternalVideoGen.g:2049:1: ( ( rule__VideoDescription__Group_3__0 )? )
            {
            // InternalVideoGen.g:2049:1: ( ( rule__VideoDescription__Group_3__0 )? )
            // InternalVideoGen.g:2050:2: ( rule__VideoDescription__Group_3__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3()); 
            // InternalVideoGen.g:2051:2: ( rule__VideoDescription__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_LEFT_BRACKET) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalVideoGen.g:2051:3: rule__VideoDescription__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group__3__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__0"
    // InternalVideoGen.g:2060:1: rule__VideoDescription__Group_3__0 : rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1 ;
    public final void rule__VideoDescription__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2064:1: ( rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1 )
            // InternalVideoGen.g:2065:2: rule__VideoDescription__Group_3__0__Impl rule__VideoDescription__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__0"


    // $ANTLR start "rule__VideoDescription__Group_3__0__Impl"
    // InternalVideoGen.g:2072:1: rule__VideoDescription__Group_3__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoDescription__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2076:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:2077:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:2077:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:2078:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getLEFT_BRACKETTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__1"
    // InternalVideoGen.g:2087:1: rule__VideoDescription__Group_3__1 : rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2 ;
    public final void rule__VideoDescription__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2091:1: ( rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2 )
            // InternalVideoGen.g:2092:2: rule__VideoDescription__Group_3__1__Impl rule__VideoDescription__Group_3__2
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__1"


    // $ANTLR start "rule__VideoDescription__Group_3__1__Impl"
    // InternalVideoGen.g:2099:1: rule__VideoDescription__Group_3__1__Impl : ( ( rule__VideoDescription__Group_3_1__0 )? ) ;
    public final void rule__VideoDescription__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2103:1: ( ( ( rule__VideoDescription__Group_3_1__0 )? ) )
            // InternalVideoGen.g:2104:1: ( ( rule__VideoDescription__Group_3_1__0 )? )
            {
            // InternalVideoGen.g:2104:1: ( ( rule__VideoDescription__Group_3_1__0 )? )
            // InternalVideoGen.g:2105:2: ( rule__VideoDescription__Group_3_1__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_1()); 
            // InternalVideoGen.g:2106:2: ( rule__VideoDescription__Group_3_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalVideoGen.g:2106:3: rule__VideoDescription__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__2"
    // InternalVideoGen.g:2114:1: rule__VideoDescription__Group_3__2 : rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3 ;
    public final void rule__VideoDescription__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2118:1: ( rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3 )
            // InternalVideoGen.g:2119:2: rule__VideoDescription__Group_3__2__Impl rule__VideoDescription__Group_3__3
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__2"


    // $ANTLR start "rule__VideoDescription__Group_3__2__Impl"
    // InternalVideoGen.g:2126:1: rule__VideoDescription__Group_3__2__Impl : ( ( rule__VideoDescription__Group_3_2__0 )? ) ;
    public final void rule__VideoDescription__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2130:1: ( ( ( rule__VideoDescription__Group_3_2__0 )? ) )
            // InternalVideoGen.g:2131:1: ( ( rule__VideoDescription__Group_3_2__0 )? )
            {
            // InternalVideoGen.g:2131:1: ( ( rule__VideoDescription__Group_3_2__0 )? )
            // InternalVideoGen.g:2132:2: ( rule__VideoDescription__Group_3_2__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_2()); 
            // InternalVideoGen.g:2133:2: ( rule__VideoDescription__Group_3_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalVideoGen.g:2133:3: rule__VideoDescription__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__2__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__3"
    // InternalVideoGen.g:2141:1: rule__VideoDescription__Group_3__3 : rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4 ;
    public final void rule__VideoDescription__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2145:1: ( rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4 )
            // InternalVideoGen.g:2146:2: rule__VideoDescription__Group_3__3__Impl rule__VideoDescription__Group_3__4
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__3"


    // $ANTLR start "rule__VideoDescription__Group_3__3__Impl"
    // InternalVideoGen.g:2153:1: rule__VideoDescription__Group_3__3__Impl : ( ( rule__VideoDescription__Group_3_3__0 )? ) ;
    public final void rule__VideoDescription__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2157:1: ( ( ( rule__VideoDescription__Group_3_3__0 )? ) )
            // InternalVideoGen.g:2158:1: ( ( rule__VideoDescription__Group_3_3__0 )? )
            {
            // InternalVideoGen.g:2158:1: ( ( rule__VideoDescription__Group_3_3__0 )? )
            // InternalVideoGen.g:2159:2: ( rule__VideoDescription__Group_3_3__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_3()); 
            // InternalVideoGen.g:2160:2: ( rule__VideoDescription__Group_3_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalVideoGen.g:2160:3: rule__VideoDescription__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__3__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__4"
    // InternalVideoGen.g:2168:1: rule__VideoDescription__Group_3__4 : rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5 ;
    public final void rule__VideoDescription__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2172:1: ( rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5 )
            // InternalVideoGen.g:2173:2: rule__VideoDescription__Group_3__4__Impl rule__VideoDescription__Group_3__5
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__4"


    // $ANTLR start "rule__VideoDescription__Group_3__4__Impl"
    // InternalVideoGen.g:2180:1: rule__VideoDescription__Group_3__4__Impl : ( ( rule__VideoDescription__Group_3_4__0 )? ) ;
    public final void rule__VideoDescription__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2184:1: ( ( ( rule__VideoDescription__Group_3_4__0 )? ) )
            // InternalVideoGen.g:2185:1: ( ( rule__VideoDescription__Group_3_4__0 )? )
            {
            // InternalVideoGen.g:2185:1: ( ( rule__VideoDescription__Group_3_4__0 )? )
            // InternalVideoGen.g:2186:2: ( rule__VideoDescription__Group_3_4__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_4()); 
            // InternalVideoGen.g:2187:2: ( rule__VideoDescription__Group_3_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalVideoGen.g:2187:3: rule__VideoDescription__Group_3_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__4__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__5"
    // InternalVideoGen.g:2195:1: rule__VideoDescription__Group_3__5 : rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6 ;
    public final void rule__VideoDescription__Group_3__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2199:1: ( rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6 )
            // InternalVideoGen.g:2200:2: rule__VideoDescription__Group_3__5__Impl rule__VideoDescription__Group_3__6
            {
            pushFollow(FOLLOW_19);
            rule__VideoDescription__Group_3__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__5"


    // $ANTLR start "rule__VideoDescription__Group_3__5__Impl"
    // InternalVideoGen.g:2207:1: rule__VideoDescription__Group_3__5__Impl : ( ( rule__VideoDescription__Group_3_5__0 )? ) ;
    public final void rule__VideoDescription__Group_3__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2211:1: ( ( ( rule__VideoDescription__Group_3_5__0 )? ) )
            // InternalVideoGen.g:2212:1: ( ( rule__VideoDescription__Group_3_5__0 )? )
            {
            // InternalVideoGen.g:2212:1: ( ( rule__VideoDescription__Group_3_5__0 )? )
            // InternalVideoGen.g:2213:2: ( rule__VideoDescription__Group_3_5__0 )?
            {
             before(grammarAccess.getVideoDescriptionAccess().getGroup_3_5()); 
            // InternalVideoGen.g:2214:2: ( rule__VideoDescription__Group_3_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalVideoGen.g:2214:3: rule__VideoDescription__Group_3_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VideoDescription__Group_3_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVideoDescriptionAccess().getGroup_3_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__5__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3__6"
    // InternalVideoGen.g:2222:1: rule__VideoDescription__Group_3__6 : rule__VideoDescription__Group_3__6__Impl ;
    public final void rule__VideoDescription__Group_3__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2226:1: ( rule__VideoDescription__Group_3__6__Impl )
            // InternalVideoGen.g:2227:2: rule__VideoDescription__Group_3__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__6"


    // $ANTLR start "rule__VideoDescription__Group_3__6__Impl"
    // InternalVideoGen.g:2233:1: rule__VideoDescription__Group_3__6__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoDescription__Group_3__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2237:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:2238:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:2238:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:2239:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getRIGHT_BRACKETTerminalRuleCall_3_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3__6__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_1__0"
    // InternalVideoGen.g:2249:1: rule__VideoDescription__Group_3_1__0 : rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1 ;
    public final void rule__VideoDescription__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2253:1: ( rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1 )
            // InternalVideoGen.g:2254:2: rule__VideoDescription__Group_3_1__0__Impl rule__VideoDescription__Group_3_1__1
            {
            pushFollow(FOLLOW_20);
            rule__VideoDescription__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_1__0"


    // $ANTLR start "rule__VideoDescription__Group_3_1__0__Impl"
    // InternalVideoGen.g:2261:1: rule__VideoDescription__Group_3_1__0__Impl : ( 'duration' ) ;
    public final void rule__VideoDescription__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2265:1: ( ( 'duration' ) )
            // InternalVideoGen.g:2266:1: ( 'duration' )
            {
            // InternalVideoGen.g:2266:1: ( 'duration' )
            // InternalVideoGen.g:2267:2: 'duration'
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDurationKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_1__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_1__1"
    // InternalVideoGen.g:2276:1: rule__VideoDescription__Group_3_1__1 : rule__VideoDescription__Group_3_1__1__Impl ;
    public final void rule__VideoDescription__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2280:1: ( rule__VideoDescription__Group_3_1__1__Impl )
            // InternalVideoGen.g:2281:2: rule__VideoDescription__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_1__1"


    // $ANTLR start "rule__VideoDescription__Group_3_1__1__Impl"
    // InternalVideoGen.g:2287:1: rule__VideoDescription__Group_3_1__1__Impl : ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) ) ;
    public final void rule__VideoDescription__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2291:1: ( ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) ) )
            // InternalVideoGen.g:2292:1: ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) )
            {
            // InternalVideoGen.g:2292:1: ( ( rule__VideoDescription__DurationAssignment_3_1_1 ) )
            // InternalVideoGen.g:2293:2: ( rule__VideoDescription__DurationAssignment_3_1_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationAssignment_3_1_1()); 
            // InternalVideoGen.g:2294:2: ( rule__VideoDescription__DurationAssignment_3_1_1 )
            // InternalVideoGen.g:2294:3: rule__VideoDescription__DurationAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__DurationAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getDurationAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_1__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_2__0"
    // InternalVideoGen.g:2303:1: rule__VideoDescription__Group_3_2__0 : rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1 ;
    public final void rule__VideoDescription__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2307:1: ( rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1 )
            // InternalVideoGen.g:2308:2: rule__VideoDescription__Group_3_2__0__Impl rule__VideoDescription__Group_3_2__1
            {
            pushFollow(FOLLOW_21);
            rule__VideoDescription__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_2__0"


    // $ANTLR start "rule__VideoDescription__Group_3_2__0__Impl"
    // InternalVideoGen.g:2315:1: rule__VideoDescription__Group_3_2__0__Impl : ( 'probability' ) ;
    public final void rule__VideoDescription__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2319:1: ( ( 'probability' ) )
            // InternalVideoGen.g:2320:1: ( 'probability' )
            {
            // InternalVideoGen.g:2320:1: ( 'probability' )
            // InternalVideoGen.g:2321:2: 'probability'
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getProbabilityKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_2__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_2__1"
    // InternalVideoGen.g:2330:1: rule__VideoDescription__Group_3_2__1 : rule__VideoDescription__Group_3_2__1__Impl ;
    public final void rule__VideoDescription__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2334:1: ( rule__VideoDescription__Group_3_2__1__Impl )
            // InternalVideoGen.g:2335:2: rule__VideoDescription__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_2__1"


    // $ANTLR start "rule__VideoDescription__Group_3_2__1__Impl"
    // InternalVideoGen.g:2341:1: rule__VideoDescription__Group_3_2__1__Impl : ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) ) ;
    public final void rule__VideoDescription__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2345:1: ( ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) ) )
            // InternalVideoGen.g:2346:1: ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) )
            {
            // InternalVideoGen.g:2346:1: ( ( rule__VideoDescription__ProbabilityAssignment_3_2_1 ) )
            // InternalVideoGen.g:2347:2: ( rule__VideoDescription__ProbabilityAssignment_3_2_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityAssignment_3_2_1()); 
            // InternalVideoGen.g:2348:2: ( rule__VideoDescription__ProbabilityAssignment_3_2_1 )
            // InternalVideoGen.g:2348:3: rule__VideoDescription__ProbabilityAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__ProbabilityAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getProbabilityAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_2__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_3__0"
    // InternalVideoGen.g:2357:1: rule__VideoDescription__Group_3_3__0 : rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1 ;
    public final void rule__VideoDescription__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2361:1: ( rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1 )
            // InternalVideoGen.g:2362:2: rule__VideoDescription__Group_3_3__0__Impl rule__VideoDescription__Group_3_3__1
            {
            pushFollow(FOLLOW_10);
            rule__VideoDescription__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_3__0"


    // $ANTLR start "rule__VideoDescription__Group_3_3__0__Impl"
    // InternalVideoGen.g:2369:1: rule__VideoDescription__Group_3_3__0__Impl : ( 'description' ) ;
    public final void rule__VideoDescription__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2373:1: ( ( 'description' ) )
            // InternalVideoGen.g:2374:1: ( 'description' )
            {
            // InternalVideoGen.g:2374:1: ( 'description' )
            // InternalVideoGen.g:2375:2: 'description'
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDescriptionKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_3__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_3__1"
    // InternalVideoGen.g:2384:1: rule__VideoDescription__Group_3_3__1 : rule__VideoDescription__Group_3_3__1__Impl ;
    public final void rule__VideoDescription__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2388:1: ( rule__VideoDescription__Group_3_3__1__Impl )
            // InternalVideoGen.g:2389:2: rule__VideoDescription__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_3__1"


    // $ANTLR start "rule__VideoDescription__Group_3_3__1__Impl"
    // InternalVideoGen.g:2395:1: rule__VideoDescription__Group_3_3__1__Impl : ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) ) ;
    public final void rule__VideoDescription__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2399:1: ( ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) ) )
            // InternalVideoGen.g:2400:1: ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) )
            {
            // InternalVideoGen.g:2400:1: ( ( rule__VideoDescription__DescriptionAssignment_3_3_1 ) )
            // InternalVideoGen.g:2401:2: ( rule__VideoDescription__DescriptionAssignment_3_3_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionAssignment_3_3_1()); 
            // InternalVideoGen.g:2402:2: ( rule__VideoDescription__DescriptionAssignment_3_3_1 )
            // InternalVideoGen.g:2402:3: rule__VideoDescription__DescriptionAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__DescriptionAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getDescriptionAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_3__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_4__0"
    // InternalVideoGen.g:2411:1: rule__VideoDescription__Group_3_4__0 : rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1 ;
    public final void rule__VideoDescription__Group_3_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2415:1: ( rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1 )
            // InternalVideoGen.g:2416:2: rule__VideoDescription__Group_3_4__0__Impl rule__VideoDescription__Group_3_4__1
            {
            pushFollow(FOLLOW_22);
            rule__VideoDescription__Group_3_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_4__0"


    // $ANTLR start "rule__VideoDescription__Group_3_4__0__Impl"
    // InternalVideoGen.g:2423:1: rule__VideoDescription__Group_3_4__0__Impl : ( 'filter' ) ;
    public final void rule__VideoDescription__Group_3_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2427:1: ( ( 'filter' ) )
            // InternalVideoGen.g:2428:1: ( 'filter' )
            {
            // InternalVideoGen.g:2428:1: ( 'filter' )
            // InternalVideoGen.g:2429:2: 'filter'
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getFilterKeyword_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_4__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_4__1"
    // InternalVideoGen.g:2438:1: rule__VideoDescription__Group_3_4__1 : rule__VideoDescription__Group_3_4__1__Impl ;
    public final void rule__VideoDescription__Group_3_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2442:1: ( rule__VideoDescription__Group_3_4__1__Impl )
            // InternalVideoGen.g:2443:2: rule__VideoDescription__Group_3_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_4__1"


    // $ANTLR start "rule__VideoDescription__Group_3_4__1__Impl"
    // InternalVideoGen.g:2449:1: rule__VideoDescription__Group_3_4__1__Impl : ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) ) ;
    public final void rule__VideoDescription__Group_3_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2453:1: ( ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) ) )
            // InternalVideoGen.g:2454:1: ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) )
            {
            // InternalVideoGen.g:2454:1: ( ( rule__VideoDescription__FilterAssignment_3_4_1 ) )
            // InternalVideoGen.g:2455:2: ( rule__VideoDescription__FilterAssignment_3_4_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterAssignment_3_4_1()); 
            // InternalVideoGen.g:2456:2: ( rule__VideoDescription__FilterAssignment_3_4_1 )
            // InternalVideoGen.g:2456:3: rule__VideoDescription__FilterAssignment_3_4_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__FilterAssignment_3_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getFilterAssignment_3_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_4__1__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_5__0"
    // InternalVideoGen.g:2465:1: rule__VideoDescription__Group_3_5__0 : rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1 ;
    public final void rule__VideoDescription__Group_3_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2469:1: ( rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1 )
            // InternalVideoGen.g:2470:2: rule__VideoDescription__Group_3_5__0__Impl rule__VideoDescription__Group_3_5__1
            {
            pushFollow(FOLLOW_4);
            rule__VideoDescription__Group_3_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_5__0"


    // $ANTLR start "rule__VideoDescription__Group_3_5__0__Impl"
    // InternalVideoGen.g:2477:1: rule__VideoDescription__Group_3_5__0__Impl : ( 'text' ) ;
    public final void rule__VideoDescription__Group_3_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2481:1: ( ( 'text' ) )
            // InternalVideoGen.g:2482:1: ( 'text' )
            {
            // InternalVideoGen.g:2482:1: ( 'text' )
            // InternalVideoGen.g:2483:2: 'text'
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getTextKeyword_3_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_5__0__Impl"


    // $ANTLR start "rule__VideoDescription__Group_3_5__1"
    // InternalVideoGen.g:2492:1: rule__VideoDescription__Group_3_5__1 : rule__VideoDescription__Group_3_5__1__Impl ;
    public final void rule__VideoDescription__Group_3_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2496:1: ( rule__VideoDescription__Group_3_5__1__Impl )
            // InternalVideoGen.g:2497:2: rule__VideoDescription__Group_3_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__Group_3_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_5__1"


    // $ANTLR start "rule__VideoDescription__Group_3_5__1__Impl"
    // InternalVideoGen.g:2503:1: rule__VideoDescription__Group_3_5__1__Impl : ( ( rule__VideoDescription__TextAssignment_3_5_1 ) ) ;
    public final void rule__VideoDescription__Group_3_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2507:1: ( ( ( rule__VideoDescription__TextAssignment_3_5_1 ) ) )
            // InternalVideoGen.g:2508:1: ( ( rule__VideoDescription__TextAssignment_3_5_1 ) )
            {
            // InternalVideoGen.g:2508:1: ( ( rule__VideoDescription__TextAssignment_3_5_1 ) )
            // InternalVideoGen.g:2509:2: ( rule__VideoDescription__TextAssignment_3_5_1 )
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextAssignment_3_5_1()); 
            // InternalVideoGen.g:2510:2: ( rule__VideoDescription__TextAssignment_3_5_1 )
            // InternalVideoGen.g:2510:3: rule__VideoDescription__TextAssignment_3_5_1
            {
            pushFollow(FOLLOW_2);
            rule__VideoDescription__TextAssignment_3_5_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoDescriptionAccess().getTextAssignment_3_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__Group_3_5__1__Impl"


    // $ANTLR start "rule__Text__Group__0"
    // InternalVideoGen.g:2519:1: rule__Text__Group__0 : rule__Text__Group__0__Impl rule__Text__Group__1 ;
    public final void rule__Text__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2523:1: ( rule__Text__Group__0__Impl rule__Text__Group__1 )
            // InternalVideoGen.g:2524:2: rule__Text__Group__0__Impl rule__Text__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__Text__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0"


    // $ANTLR start "rule__Text__Group__0__Impl"
    // InternalVideoGen.g:2531:1: rule__Text__Group__0__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Text__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2535:1: ( ( RULE_LEFT_BRACKET ) )
            // InternalVideoGen.g:2536:1: ( RULE_LEFT_BRACKET )
            {
            // InternalVideoGen.g:2536:1: ( RULE_LEFT_BRACKET )
            // InternalVideoGen.g:2537:2: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getTextAccess().getLEFT_BRACKETTerminalRuleCall_0()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getLEFT_BRACKETTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__0__Impl"


    // $ANTLR start "rule__Text__Group__1"
    // InternalVideoGen.g:2546:1: rule__Text__Group__1 : rule__Text__Group__1__Impl rule__Text__Group__2 ;
    public final void rule__Text__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2550:1: ( rule__Text__Group__1__Impl rule__Text__Group__2 )
            // InternalVideoGen.g:2551:2: rule__Text__Group__1__Impl rule__Text__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Text__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1"


    // $ANTLR start "rule__Text__Group__1__Impl"
    // InternalVideoGen.g:2558:1: rule__Text__Group__1__Impl : ( 'content' ) ;
    public final void rule__Text__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2562:1: ( ( 'content' ) )
            // InternalVideoGen.g:2563:1: ( 'content' )
            {
            // InternalVideoGen.g:2563:1: ( 'content' )
            // InternalVideoGen.g:2564:2: 'content'
            {
             before(grammarAccess.getTextAccess().getContentKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getContentKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__1__Impl"


    // $ANTLR start "rule__Text__Group__2"
    // InternalVideoGen.g:2573:1: rule__Text__Group__2 : rule__Text__Group__2__Impl rule__Text__Group__3 ;
    public final void rule__Text__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2577:1: ( rule__Text__Group__2__Impl rule__Text__Group__3 )
            // InternalVideoGen.g:2578:2: rule__Text__Group__2__Impl rule__Text__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Text__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2"


    // $ANTLR start "rule__Text__Group__2__Impl"
    // InternalVideoGen.g:2585:1: rule__Text__Group__2__Impl : ( ( rule__Text__ContentAssignment_2 ) ) ;
    public final void rule__Text__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2589:1: ( ( ( rule__Text__ContentAssignment_2 ) ) )
            // InternalVideoGen.g:2590:1: ( ( rule__Text__ContentAssignment_2 ) )
            {
            // InternalVideoGen.g:2590:1: ( ( rule__Text__ContentAssignment_2 ) )
            // InternalVideoGen.g:2591:2: ( rule__Text__ContentAssignment_2 )
            {
             before(grammarAccess.getTextAccess().getContentAssignment_2()); 
            // InternalVideoGen.g:2592:2: ( rule__Text__ContentAssignment_2 )
            // InternalVideoGen.g:2592:3: rule__Text__ContentAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Text__ContentAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getContentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__2__Impl"


    // $ANTLR start "rule__Text__Group__3"
    // InternalVideoGen.g:2600:1: rule__Text__Group__3 : rule__Text__Group__3__Impl rule__Text__Group__4 ;
    public final void rule__Text__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2604:1: ( rule__Text__Group__3__Impl rule__Text__Group__4 )
            // InternalVideoGen.g:2605:2: rule__Text__Group__3__Impl rule__Text__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__Text__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3"


    // $ANTLR start "rule__Text__Group__3__Impl"
    // InternalVideoGen.g:2612:1: rule__Text__Group__3__Impl : ( 'position' ) ;
    public final void rule__Text__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2616:1: ( ( 'position' ) )
            // InternalVideoGen.g:2617:1: ( 'position' )
            {
            // InternalVideoGen.g:2617:1: ( 'position' )
            // InternalVideoGen.g:2618:2: 'position'
            {
             before(grammarAccess.getTextAccess().getPositionKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getPositionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__3__Impl"


    // $ANTLR start "rule__Text__Group__4"
    // InternalVideoGen.g:2627:1: rule__Text__Group__4 : rule__Text__Group__4__Impl rule__Text__Group__5 ;
    public final void rule__Text__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2631:1: ( rule__Text__Group__4__Impl rule__Text__Group__5 )
            // InternalVideoGen.g:2632:2: rule__Text__Group__4__Impl rule__Text__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__4"


    // $ANTLR start "rule__Text__Group__4__Impl"
    // InternalVideoGen.g:2639:1: rule__Text__Group__4__Impl : ( ( rule__Text__PositionAssignment_4 ) ) ;
    public final void rule__Text__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2643:1: ( ( ( rule__Text__PositionAssignment_4 ) ) )
            // InternalVideoGen.g:2644:1: ( ( rule__Text__PositionAssignment_4 ) )
            {
            // InternalVideoGen.g:2644:1: ( ( rule__Text__PositionAssignment_4 ) )
            // InternalVideoGen.g:2645:2: ( rule__Text__PositionAssignment_4 )
            {
             before(grammarAccess.getTextAccess().getPositionAssignment_4()); 
            // InternalVideoGen.g:2646:2: ( rule__Text__PositionAssignment_4 )
            // InternalVideoGen.g:2646:3: rule__Text__PositionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Text__PositionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getPositionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__4__Impl"


    // $ANTLR start "rule__Text__Group__5"
    // InternalVideoGen.g:2654:1: rule__Text__Group__5 : rule__Text__Group__5__Impl rule__Text__Group__6 ;
    public final void rule__Text__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2658:1: ( rule__Text__Group__5__Impl rule__Text__Group__6 )
            // InternalVideoGen.g:2659:2: rule__Text__Group__5__Impl rule__Text__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__5"


    // $ANTLR start "rule__Text__Group__5__Impl"
    // InternalVideoGen.g:2666:1: rule__Text__Group__5__Impl : ( ( rule__Text__Group_5__0 )? ) ;
    public final void rule__Text__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2670:1: ( ( ( rule__Text__Group_5__0 )? ) )
            // InternalVideoGen.g:2671:1: ( ( rule__Text__Group_5__0 )? )
            {
            // InternalVideoGen.g:2671:1: ( ( rule__Text__Group_5__0 )? )
            // InternalVideoGen.g:2672:2: ( rule__Text__Group_5__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_5()); 
            // InternalVideoGen.g:2673:2: ( rule__Text__Group_5__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalVideoGen.g:2673:3: rule__Text__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__5__Impl"


    // $ANTLR start "rule__Text__Group__6"
    // InternalVideoGen.g:2681:1: rule__Text__Group__6 : rule__Text__Group__6__Impl rule__Text__Group__7 ;
    public final void rule__Text__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2685:1: ( rule__Text__Group__6__Impl rule__Text__Group__7 )
            // InternalVideoGen.g:2686:2: rule__Text__Group__6__Impl rule__Text__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__Text__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__6"


    // $ANTLR start "rule__Text__Group__6__Impl"
    // InternalVideoGen.g:2693:1: rule__Text__Group__6__Impl : ( ( rule__Text__Group_6__0 )? ) ;
    public final void rule__Text__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2697:1: ( ( ( rule__Text__Group_6__0 )? ) )
            // InternalVideoGen.g:2698:1: ( ( rule__Text__Group_6__0 )? )
            {
            // InternalVideoGen.g:2698:1: ( ( rule__Text__Group_6__0 )? )
            // InternalVideoGen.g:2699:2: ( rule__Text__Group_6__0 )?
            {
             before(grammarAccess.getTextAccess().getGroup_6()); 
            // InternalVideoGen.g:2700:2: ( rule__Text__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalVideoGen.g:2700:3: rule__Text__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Text__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__6__Impl"


    // $ANTLR start "rule__Text__Group__7"
    // InternalVideoGen.g:2708:1: rule__Text__Group__7 : rule__Text__Group__7__Impl ;
    public final void rule__Text__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2712:1: ( rule__Text__Group__7__Impl )
            // InternalVideoGen.g:2713:2: rule__Text__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__7"


    // $ANTLR start "rule__Text__Group__7__Impl"
    // InternalVideoGen.g:2719:1: rule__Text__Group__7__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Text__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2723:1: ( ( RULE_RIGHT_BRACKET ) )
            // InternalVideoGen.g:2724:1: ( RULE_RIGHT_BRACKET )
            {
            // InternalVideoGen.g:2724:1: ( RULE_RIGHT_BRACKET )
            // InternalVideoGen.g:2725:2: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getTextAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getRIGHT_BRACKETTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group__7__Impl"


    // $ANTLR start "rule__Text__Group_5__0"
    // InternalVideoGen.g:2735:1: rule__Text__Group_5__0 : rule__Text__Group_5__0__Impl rule__Text__Group_5__1 ;
    public final void rule__Text__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2739:1: ( rule__Text__Group_5__0__Impl rule__Text__Group_5__1 )
            // InternalVideoGen.g:2740:2: rule__Text__Group_5__0__Impl rule__Text__Group_5__1
            {
            pushFollow(FOLLOW_10);
            rule__Text__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_5__0"


    // $ANTLR start "rule__Text__Group_5__0__Impl"
    // InternalVideoGen.g:2747:1: rule__Text__Group_5__0__Impl : ( 'color' ) ;
    public final void rule__Text__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2751:1: ( ( 'color' ) )
            // InternalVideoGen.g:2752:1: ( 'color' )
            {
            // InternalVideoGen.g:2752:1: ( 'color' )
            // InternalVideoGen.g:2753:2: 'color'
            {
             before(grammarAccess.getTextAccess().getColorKeyword_5_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getColorKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_5__0__Impl"


    // $ANTLR start "rule__Text__Group_5__1"
    // InternalVideoGen.g:2762:1: rule__Text__Group_5__1 : rule__Text__Group_5__1__Impl ;
    public final void rule__Text__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2766:1: ( rule__Text__Group_5__1__Impl )
            // InternalVideoGen.g:2767:2: rule__Text__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_5__1"


    // $ANTLR start "rule__Text__Group_5__1__Impl"
    // InternalVideoGen.g:2773:1: rule__Text__Group_5__1__Impl : ( ( rule__Text__ColorAssignment_5_1 ) ) ;
    public final void rule__Text__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2777:1: ( ( ( rule__Text__ColorAssignment_5_1 ) ) )
            // InternalVideoGen.g:2778:1: ( ( rule__Text__ColorAssignment_5_1 ) )
            {
            // InternalVideoGen.g:2778:1: ( ( rule__Text__ColorAssignment_5_1 ) )
            // InternalVideoGen.g:2779:2: ( rule__Text__ColorAssignment_5_1 )
            {
             before(grammarAccess.getTextAccess().getColorAssignment_5_1()); 
            // InternalVideoGen.g:2780:2: ( rule__Text__ColorAssignment_5_1 )
            // InternalVideoGen.g:2780:3: rule__Text__ColorAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__ColorAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getColorAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_5__1__Impl"


    // $ANTLR start "rule__Text__Group_6__0"
    // InternalVideoGen.g:2789:1: rule__Text__Group_6__0 : rule__Text__Group_6__0__Impl rule__Text__Group_6__1 ;
    public final void rule__Text__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2793:1: ( rule__Text__Group_6__0__Impl rule__Text__Group_6__1 )
            // InternalVideoGen.g:2794:2: rule__Text__Group_6__0__Impl rule__Text__Group_6__1
            {
            pushFollow(FOLLOW_20);
            rule__Text__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Text__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_6__0"


    // $ANTLR start "rule__Text__Group_6__0__Impl"
    // InternalVideoGen.g:2801:1: rule__Text__Group_6__0__Impl : ( 'size' ) ;
    public final void rule__Text__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2805:1: ( ( 'size' ) )
            // InternalVideoGen.g:2806:1: ( 'size' )
            {
            // InternalVideoGen.g:2806:1: ( 'size' )
            // InternalVideoGen.g:2807:2: 'size'
            {
             before(grammarAccess.getTextAccess().getSizeKeyword_6_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getSizeKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_6__0__Impl"


    // $ANTLR start "rule__Text__Group_6__1"
    // InternalVideoGen.g:2816:1: rule__Text__Group_6__1 : rule__Text__Group_6__1__Impl ;
    public final void rule__Text__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2820:1: ( rule__Text__Group_6__1__Impl )
            // InternalVideoGen.g:2821:2: rule__Text__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Text__Group_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_6__1"


    // $ANTLR start "rule__Text__Group_6__1__Impl"
    // InternalVideoGen.g:2827:1: rule__Text__Group_6__1__Impl : ( ( rule__Text__SizeAssignment_6_1 ) ) ;
    public final void rule__Text__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2831:1: ( ( ( rule__Text__SizeAssignment_6_1 ) ) )
            // InternalVideoGen.g:2832:1: ( ( rule__Text__SizeAssignment_6_1 ) )
            {
            // InternalVideoGen.g:2832:1: ( ( rule__Text__SizeAssignment_6_1 ) )
            // InternalVideoGen.g:2833:2: ( rule__Text__SizeAssignment_6_1 )
            {
             before(grammarAccess.getTextAccess().getSizeAssignment_6_1()); 
            // InternalVideoGen.g:2834:2: ( rule__Text__SizeAssignment_6_1 )
            // InternalVideoGen.g:2834:3: rule__Text__SizeAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Text__SizeAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getSizeAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__Group_6__1__Impl"


    // $ANTLR start "rule__BlackWhiteFilter__Group__0"
    // InternalVideoGen.g:2843:1: rule__BlackWhiteFilter__Group__0 : rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1 ;
    public final void rule__BlackWhiteFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2847:1: ( rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1 )
            // InternalVideoGen.g:2848:2: rule__BlackWhiteFilter__Group__0__Impl rule__BlackWhiteFilter__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__BlackWhiteFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__0"


    // $ANTLR start "rule__BlackWhiteFilter__Group__0__Impl"
    // InternalVideoGen.g:2855:1: rule__BlackWhiteFilter__Group__0__Impl : ( () ) ;
    public final void rule__BlackWhiteFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2859:1: ( ( () ) )
            // InternalVideoGen.g:2860:1: ( () )
            {
            // InternalVideoGen.g:2860:1: ( () )
            // InternalVideoGen.g:2861:2: ()
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0()); 
            // InternalVideoGen.g:2862:2: ()
            // InternalVideoGen.g:2862:3: 
            {
            }

             after(grammarAccess.getBlackWhiteFilterAccess().getBlackWhiteFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__0__Impl"


    // $ANTLR start "rule__BlackWhiteFilter__Group__1"
    // InternalVideoGen.g:2870:1: rule__BlackWhiteFilter__Group__1 : rule__BlackWhiteFilter__Group__1__Impl ;
    public final void rule__BlackWhiteFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2874:1: ( rule__BlackWhiteFilter__Group__1__Impl )
            // InternalVideoGen.g:2875:2: rule__BlackWhiteFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BlackWhiteFilter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__1"


    // $ANTLR start "rule__BlackWhiteFilter__Group__1__Impl"
    // InternalVideoGen.g:2881:1: rule__BlackWhiteFilter__Group__1__Impl : ( 'b&w' ) ;
    public final void rule__BlackWhiteFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2885:1: ( ( 'b&w' ) )
            // InternalVideoGen.g:2886:1: ( 'b&w' )
            {
            // InternalVideoGen.g:2886:1: ( 'b&w' )
            // InternalVideoGen.g:2887:2: 'b&w'
            {
             before(grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBlackWhiteFilterAccess().getBWKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BlackWhiteFilter__Group__1__Impl"


    // $ANTLR start "rule__NegateFilter__Group__0"
    // InternalVideoGen.g:2897:1: rule__NegateFilter__Group__0 : rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1 ;
    public final void rule__NegateFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2901:1: ( rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1 )
            // InternalVideoGen.g:2902:2: rule__NegateFilter__Group__0__Impl rule__NegateFilter__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__NegateFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__0"


    // $ANTLR start "rule__NegateFilter__Group__0__Impl"
    // InternalVideoGen.g:2909:1: rule__NegateFilter__Group__0__Impl : ( () ) ;
    public final void rule__NegateFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2913:1: ( ( () ) )
            // InternalVideoGen.g:2914:1: ( () )
            {
            // InternalVideoGen.g:2914:1: ( () )
            // InternalVideoGen.g:2915:2: ()
            {
             before(grammarAccess.getNegateFilterAccess().getNegateFilterAction_0()); 
            // InternalVideoGen.g:2916:2: ()
            // InternalVideoGen.g:2916:3: 
            {
            }

             after(grammarAccess.getNegateFilterAccess().getNegateFilterAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__0__Impl"


    // $ANTLR start "rule__NegateFilter__Group__1"
    // InternalVideoGen.g:2924:1: rule__NegateFilter__Group__1 : rule__NegateFilter__Group__1__Impl ;
    public final void rule__NegateFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2928:1: ( rule__NegateFilter__Group__1__Impl )
            // InternalVideoGen.g:2929:2: rule__NegateFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NegateFilter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__1"


    // $ANTLR start "rule__NegateFilter__Group__1__Impl"
    // InternalVideoGen.g:2935:1: rule__NegateFilter__Group__1__Impl : ( 'negate' ) ;
    public final void rule__NegateFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2939:1: ( ( 'negate' ) )
            // InternalVideoGen.g:2940:1: ( 'negate' )
            {
            // InternalVideoGen.g:2940:1: ( 'negate' )
            // InternalVideoGen.g:2941:2: 'negate'
            {
             before(grammarAccess.getNegateFilterAccess().getNegateKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getNegateFilterAccess().getNegateKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NegateFilter__Group__1__Impl"


    // $ANTLR start "rule__FlipFilter__Group__0"
    // InternalVideoGen.g:2951:1: rule__FlipFilter__Group__0 : rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1 ;
    public final void rule__FlipFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2955:1: ( rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1 )
            // InternalVideoGen.g:2956:2: rule__FlipFilter__Group__0__Impl rule__FlipFilter__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__FlipFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__Group__0"


    // $ANTLR start "rule__FlipFilter__Group__0__Impl"
    // InternalVideoGen.g:2963:1: rule__FlipFilter__Group__0__Impl : ( 'flip' ) ;
    public final void rule__FlipFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2967:1: ( ( 'flip' ) )
            // InternalVideoGen.g:2968:1: ( 'flip' )
            {
            // InternalVideoGen.g:2968:1: ( 'flip' )
            // InternalVideoGen.g:2969:2: 'flip'
            {
             before(grammarAccess.getFlipFilterAccess().getFlipKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getFlipFilterAccess().getFlipKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__Group__0__Impl"


    // $ANTLR start "rule__FlipFilter__Group__1"
    // InternalVideoGen.g:2978:1: rule__FlipFilter__Group__1 : rule__FlipFilter__Group__1__Impl ;
    public final void rule__FlipFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2982:1: ( rule__FlipFilter__Group__1__Impl )
            // InternalVideoGen.g:2983:2: rule__FlipFilter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__Group__1"


    // $ANTLR start "rule__FlipFilter__Group__1__Impl"
    // InternalVideoGen.g:2989:1: rule__FlipFilter__Group__1__Impl : ( ( rule__FlipFilter__OrientationAssignment_1 ) ) ;
    public final void rule__FlipFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:2993:1: ( ( ( rule__FlipFilter__OrientationAssignment_1 ) ) )
            // InternalVideoGen.g:2994:1: ( ( rule__FlipFilter__OrientationAssignment_1 ) )
            {
            // InternalVideoGen.g:2994:1: ( ( rule__FlipFilter__OrientationAssignment_1 ) )
            // InternalVideoGen.g:2995:2: ( rule__FlipFilter__OrientationAssignment_1 )
            {
             before(grammarAccess.getFlipFilterAccess().getOrientationAssignment_1()); 
            // InternalVideoGen.g:2996:2: ( rule__FlipFilter__OrientationAssignment_1 )
            // InternalVideoGen.g:2996:3: rule__FlipFilter__OrientationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__OrientationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getOrientationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__Group__1__Impl"


    // $ANTLR start "rule__VideoGeneratorModel__InformationAssignment_1"
    // InternalVideoGen.g:3005:1: rule__VideoGeneratorModel__InformationAssignment_1 : ( ruleVideoGenInformation ) ;
    public final void rule__VideoGeneratorModel__InformationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3009:1: ( ( ruleVideoGenInformation ) )
            // InternalVideoGen.g:3010:2: ( ruleVideoGenInformation )
            {
            // InternalVideoGen.g:3010:2: ( ruleVideoGenInformation )
            // InternalVideoGen.g:3011:3: ruleVideoGenInformation
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getInformationVideoGenInformationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoGenInformation();

            state._fsp--;

             after(grammarAccess.getVideoGeneratorModelAccess().getInformationVideoGenInformationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__InformationAssignment_1"


    // $ANTLR start "rule__VideoGeneratorModel__MediasAssignment_4"
    // InternalVideoGen.g:3020:1: rule__VideoGeneratorModel__MediasAssignment_4 : ( ruleMedia ) ;
    public final void rule__VideoGeneratorModel__MediasAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3024:1: ( ( ruleMedia ) )
            // InternalVideoGen.g:3025:2: ( ruleMedia )
            {
            // InternalVideoGen.g:3025:2: ( ruleMedia )
            // InternalVideoGen.g:3026:3: ruleMedia
            {
             before(grammarAccess.getVideoGeneratorModelAccess().getMediasMediaParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMedia();

            state._fsp--;

             after(grammarAccess.getVideoGeneratorModelAccess().getMediasMediaParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGeneratorModel__MediasAssignment_4"


    // $ANTLR start "rule__VideoGenInformation__AuthorNameAssignment_1_1"
    // InternalVideoGen.g:3035:1: rule__VideoGenInformation__AuthorNameAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__VideoGenInformation__AuthorNameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3039:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3040:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3040:2: ( RULE_STRING )
            // InternalVideoGen.g:3041:3: RULE_STRING
            {
             before(grammarAccess.getVideoGenInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getAuthorNameSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__AuthorNameAssignment_1_1"


    // $ANTLR start "rule__VideoGenInformation__VersionAssignment_2_1"
    // InternalVideoGen.g:3050:1: rule__VideoGenInformation__VersionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__VideoGenInformation__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3054:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3055:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3055:2: ( RULE_STRING )
            // InternalVideoGen.g:3056:3: RULE_STRING
            {
             before(grammarAccess.getVideoGenInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getVersionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__VersionAssignment_2_1"


    // $ANTLR start "rule__VideoGenInformation__CreationDateAssignment_3_1"
    // InternalVideoGen.g:3065:1: rule__VideoGenInformation__CreationDateAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__VideoGenInformation__CreationDateAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3069:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3070:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3070:2: ( RULE_STRING )
            // InternalVideoGen.g:3071:3: RULE_STRING
            {
             before(grammarAccess.getVideoGenInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoGenInformationAccess().getCreationDateSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGenInformation__CreationDateAssignment_3_1"


    // $ANTLR start "rule__MandatoryImage__DescriptionAssignment_1"
    // InternalVideoGen.g:3080:1: rule__MandatoryImage__DescriptionAssignment_1 : ( ruleImageDescription ) ;
    public final void rule__MandatoryImage__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3084:1: ( ( ruleImageDescription ) )
            // InternalVideoGen.g:3085:2: ( ruleImageDescription )
            {
            // InternalVideoGen.g:3085:2: ( ruleImageDescription )
            // InternalVideoGen.g:3086:3: ruleImageDescription
            {
             before(grammarAccess.getMandatoryImageAccess().getDescriptionImageDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImageDescription();

            state._fsp--;

             after(grammarAccess.getMandatoryImageAccess().getDescriptionImageDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryImage__DescriptionAssignment_1"


    // $ANTLR start "rule__OptionalImage__DescriptionAssignment_1"
    // InternalVideoGen.g:3095:1: rule__OptionalImage__DescriptionAssignment_1 : ( ruleImageDescription ) ;
    public final void rule__OptionalImage__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3099:1: ( ( ruleImageDescription ) )
            // InternalVideoGen.g:3100:2: ( ruleImageDescription )
            {
            // InternalVideoGen.g:3100:2: ( ruleImageDescription )
            // InternalVideoGen.g:3101:3: ruleImageDescription
            {
             before(grammarAccess.getOptionalImageAccess().getDescriptionImageDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleImageDescription();

            state._fsp--;

             after(grammarAccess.getOptionalImageAccess().getDescriptionImageDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalImage__DescriptionAssignment_1"


    // $ANTLR start "rule__AlternativeImage__ImageidAssignment_1"
    // InternalVideoGen.g:3110:1: rule__AlternativeImage__ImageidAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlternativeImage__ImageidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3114:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:3115:2: ( RULE_ID )
            {
            // InternalVideoGen.g:3115:2: ( RULE_ID )
            // InternalVideoGen.g:3116:3: RULE_ID
            {
             before(grammarAccess.getAlternativeImageAccess().getImageidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlternativeImageAccess().getImageidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__ImageidAssignment_1"


    // $ANTLR start "rule__AlternativeImage__ImagesAssignment_3"
    // InternalVideoGen.g:3125:1: rule__AlternativeImage__ImagesAssignment_3 : ( ruleImageDescription ) ;
    public final void rule__AlternativeImage__ImagesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3129:1: ( ( ruleImageDescription ) )
            // InternalVideoGen.g:3130:2: ( ruleImageDescription )
            {
            // InternalVideoGen.g:3130:2: ( ruleImageDescription )
            // InternalVideoGen.g:3131:3: ruleImageDescription
            {
             before(grammarAccess.getAlternativeImageAccess().getImagesImageDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImageDescription();

            state._fsp--;

             after(grammarAccess.getAlternativeImageAccess().getImagesImageDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeImage__ImagesAssignment_3"


    // $ANTLR start "rule__ImageDescription__ImageidAssignment_1"
    // InternalVideoGen.g:3140:1: rule__ImageDescription__ImageidAssignment_1 : ( RULE_ID ) ;
    public final void rule__ImageDescription__ImageidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3144:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:3145:2: ( RULE_ID )
            {
            // InternalVideoGen.g:3145:2: ( RULE_ID )
            // InternalVideoGen.g:3146:3: RULE_ID
            {
             before(grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getImageidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__ImageidAssignment_1"


    // $ANTLR start "rule__ImageDescription__LocationAssignment_2"
    // InternalVideoGen.g:3155:1: rule__ImageDescription__LocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3159:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3160:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3160:2: ( RULE_STRING )
            // InternalVideoGen.g:3161:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__LocationAssignment_2"


    // $ANTLR start "rule__ImageDescription__TopAssignment_3_1_1"
    // InternalVideoGen.g:3170:1: rule__ImageDescription__TopAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__TopAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3174:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3175:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3175:2: ( RULE_STRING )
            // InternalVideoGen.g:3176:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getTopSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__TopAssignment_3_1_1"


    // $ANTLR start "rule__ImageDescription__BottomAssignment_3_2_1"
    // InternalVideoGen.g:3185:1: rule__ImageDescription__BottomAssignment_3_2_1 : ( RULE_STRING ) ;
    public final void rule__ImageDescription__BottomAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3189:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3190:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3190:2: ( RULE_STRING )
            // InternalVideoGen.g:3191:3: RULE_STRING
            {
             before(grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImageDescriptionAccess().getBottomSTRINGTerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageDescription__BottomAssignment_3_2_1"


    // $ANTLR start "rule__MandatoryVideoSeq__DescriptionAssignment_1"
    // InternalVideoGen.g:3200:1: rule__MandatoryVideoSeq__DescriptionAssignment_1 : ( ruleVideoDescription ) ;
    public final void rule__MandatoryVideoSeq__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3204:1: ( ( ruleVideoDescription ) )
            // InternalVideoGen.g:3205:2: ( ruleVideoDescription )
            {
            // InternalVideoGen.g:3205:2: ( ruleVideoDescription )
            // InternalVideoGen.g:3206:3: ruleVideoDescription
            {
             before(grammarAccess.getMandatoryVideoSeqAccess().getDescriptionVideoDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoDescription();

            state._fsp--;

             after(grammarAccess.getMandatoryVideoSeqAccess().getDescriptionVideoDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MandatoryVideoSeq__DescriptionAssignment_1"


    // $ANTLR start "rule__OptionalVideoSeq__DescriptionAssignment_1"
    // InternalVideoGen.g:3215:1: rule__OptionalVideoSeq__DescriptionAssignment_1 : ( ruleVideoDescription ) ;
    public final void rule__OptionalVideoSeq__DescriptionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3219:1: ( ( ruleVideoDescription ) )
            // InternalVideoGen.g:3220:2: ( ruleVideoDescription )
            {
            // InternalVideoGen.g:3220:2: ( ruleVideoDescription )
            // InternalVideoGen.g:3221:3: ruleVideoDescription
            {
             before(grammarAccess.getOptionalVideoSeqAccess().getDescriptionVideoDescriptionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoDescription();

            state._fsp--;

             after(grammarAccess.getOptionalVideoSeqAccess().getDescriptionVideoDescriptionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OptionalVideoSeq__DescriptionAssignment_1"


    // $ANTLR start "rule__AlternativeVideoSeq__VideoidAssignment_1"
    // InternalVideoGen.g:3230:1: rule__AlternativeVideoSeq__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__AlternativeVideoSeq__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3234:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:3235:2: ( RULE_ID )
            {
            // InternalVideoGen.g:3235:2: ( RULE_ID )
            // InternalVideoGen.g:3236:3: RULE_ID
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlternativeVideoSeqAccess().getVideoidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__VideoidAssignment_1"


    // $ANTLR start "rule__AlternativeVideoSeq__VideodescsAssignment_3"
    // InternalVideoGen.g:3245:1: rule__AlternativeVideoSeq__VideodescsAssignment_3 : ( ruleVideoDescription ) ;
    public final void rule__AlternativeVideoSeq__VideodescsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3249:1: ( ( ruleVideoDescription ) )
            // InternalVideoGen.g:3250:2: ( ruleVideoDescription )
            {
            // InternalVideoGen.g:3250:2: ( ruleVideoDescription )
            // InternalVideoGen.g:3251:3: ruleVideoDescription
            {
             before(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsVideoDescriptionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVideoDescription();

            state._fsp--;

             after(grammarAccess.getAlternativeVideoSeqAccess().getVideodescsVideoDescriptionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AlternativeVideoSeq__VideodescsAssignment_3"


    // $ANTLR start "rule__VideoDescription__VideoidAssignment_1"
    // InternalVideoGen.g:3260:1: rule__VideoDescription__VideoidAssignment_1 : ( RULE_ID ) ;
    public final void rule__VideoDescription__VideoidAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3264:1: ( ( RULE_ID ) )
            // InternalVideoGen.g:3265:2: ( RULE_ID )
            {
            // InternalVideoGen.g:3265:2: ( RULE_ID )
            // InternalVideoGen.g:3266:3: RULE_ID
            {
             before(grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getVideoidIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__VideoidAssignment_1"


    // $ANTLR start "rule__VideoDescription__LocationAssignment_2"
    // InternalVideoGen.g:3275:1: rule__VideoDescription__LocationAssignment_2 : ( RULE_STRING ) ;
    public final void rule__VideoDescription__LocationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3279:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3280:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3280:2: ( RULE_STRING )
            // InternalVideoGen.g:3281:3: RULE_STRING
            {
             before(grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getLocationSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__LocationAssignment_2"


    // $ANTLR start "rule__VideoDescription__DurationAssignment_3_1_1"
    // InternalVideoGen.g:3290:1: rule__VideoDescription__DurationAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__VideoDescription__DurationAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3294:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:3295:2: ( RULE_INT )
            {
            // InternalVideoGen.g:3295:2: ( RULE_INT )
            // InternalVideoGen.g:3296:3: RULE_INT
            {
             before(grammarAccess.getVideoDescriptionAccess().getDurationINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDurationINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__DurationAssignment_3_1_1"


    // $ANTLR start "rule__VideoDescription__ProbabilityAssignment_3_2_1"
    // InternalVideoGen.g:3305:1: rule__VideoDescription__ProbabilityAssignment_3_2_1 : ( RULE_PERCENTAGE ) ;
    public final void rule__VideoDescription__ProbabilityAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3309:1: ( ( RULE_PERCENTAGE ) )
            // InternalVideoGen.g:3310:2: ( RULE_PERCENTAGE )
            {
            // InternalVideoGen.g:3310:2: ( RULE_PERCENTAGE )
            // InternalVideoGen.g:3311:3: RULE_PERCENTAGE
            {
             before(grammarAccess.getVideoDescriptionAccess().getProbabilityPERCENTAGETerminalRuleCall_3_2_1_0()); 
            match(input,RULE_PERCENTAGE,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getProbabilityPERCENTAGETerminalRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__ProbabilityAssignment_3_2_1"


    // $ANTLR start "rule__VideoDescription__DescriptionAssignment_3_3_1"
    // InternalVideoGen.g:3320:1: rule__VideoDescription__DescriptionAssignment_3_3_1 : ( RULE_STRING ) ;
    public final void rule__VideoDescription__DescriptionAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3324:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3325:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3325:2: ( RULE_STRING )
            // InternalVideoGen.g:3326:3: RULE_STRING
            {
             before(grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoDescriptionAccess().getDescriptionSTRINGTerminalRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__DescriptionAssignment_3_3_1"


    // $ANTLR start "rule__VideoDescription__FilterAssignment_3_4_1"
    // InternalVideoGen.g:3335:1: rule__VideoDescription__FilterAssignment_3_4_1 : ( ruleFilter ) ;
    public final void rule__VideoDescription__FilterAssignment_3_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3339:1: ( ( ruleFilter ) )
            // InternalVideoGen.g:3340:2: ( ruleFilter )
            {
            // InternalVideoGen.g:3340:2: ( ruleFilter )
            // InternalVideoGen.g:3341:3: ruleFilter
            {
             before(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilter();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionAccess().getFilterFilterParserRuleCall_3_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__FilterAssignment_3_4_1"


    // $ANTLR start "rule__VideoDescription__TextAssignment_3_5_1"
    // InternalVideoGen.g:3350:1: rule__VideoDescription__TextAssignment_3_5_1 : ( ruleText ) ;
    public final void rule__VideoDescription__TextAssignment_3_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3354:1: ( ( ruleText ) )
            // InternalVideoGen.g:3355:2: ( ruleText )
            {
            // InternalVideoGen.g:3355:2: ( ruleText )
            // InternalVideoGen.g:3356:3: ruleText
            {
             before(grammarAccess.getVideoDescriptionAccess().getTextTextParserRuleCall_3_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getVideoDescriptionAccess().getTextTextParserRuleCall_3_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoDescription__TextAssignment_3_5_1"


    // $ANTLR start "rule__Text__ContentAssignment_2"
    // InternalVideoGen.g:3365:1: rule__Text__ContentAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Text__ContentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3369:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3370:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3370:2: ( RULE_STRING )
            // InternalVideoGen.g:3371:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getContentSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ContentAssignment_2"


    // $ANTLR start "rule__Text__PositionAssignment_4"
    // InternalVideoGen.g:3380:1: rule__Text__PositionAssignment_4 : ( rulePosition ) ;
    public final void rule__Text__PositionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3384:1: ( ( rulePosition ) )
            // InternalVideoGen.g:3385:2: ( rulePosition )
            {
            // InternalVideoGen.g:3385:2: ( rulePosition )
            // InternalVideoGen.g:3386:3: rulePosition
            {
             before(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            rulePosition();

            state._fsp--;

             after(grammarAccess.getTextAccess().getPositionPositionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__PositionAssignment_4"


    // $ANTLR start "rule__Text__ColorAssignment_5_1"
    // InternalVideoGen.g:3395:1: rule__Text__ColorAssignment_5_1 : ( RULE_STRING ) ;
    public final void rule__Text__ColorAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3399:1: ( ( RULE_STRING ) )
            // InternalVideoGen.g:3400:2: ( RULE_STRING )
            {
            // InternalVideoGen.g:3400:2: ( RULE_STRING )
            // InternalVideoGen.g:3401:3: RULE_STRING
            {
             before(grammarAccess.getTextAccess().getColorSTRINGTerminalRuleCall_5_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getColorSTRINGTerminalRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__ColorAssignment_5_1"


    // $ANTLR start "rule__Text__SizeAssignment_6_1"
    // InternalVideoGen.g:3410:1: rule__Text__SizeAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Text__SizeAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3414:1: ( ( RULE_INT ) )
            // InternalVideoGen.g:3415:2: ( RULE_INT )
            {
            // InternalVideoGen.g:3415:2: ( RULE_INT )
            // InternalVideoGen.g:3416:3: RULE_INT
            {
             before(grammarAccess.getTextAccess().getSizeINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTextAccess().getSizeINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__SizeAssignment_6_1"


    // $ANTLR start "rule__FlipFilter__OrientationAssignment_1"
    // InternalVideoGen.g:3425:1: rule__FlipFilter__OrientationAssignment_1 : ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) ) ;
    public final void rule__FlipFilter__OrientationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalVideoGen.g:3429:1: ( ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) ) )
            // InternalVideoGen.g:3430:2: ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) )
            {
            // InternalVideoGen.g:3430:2: ( ( rule__FlipFilter__OrientationAlternatives_1_0 ) )
            // InternalVideoGen.g:3431:3: ( rule__FlipFilter__OrientationAlternatives_1_0 )
            {
             before(grammarAccess.getFlipFilterAccess().getOrientationAlternatives_1_0()); 
            // InternalVideoGen.g:3432:3: ( rule__FlipFilter__OrientationAlternatives_1_0 )
            // InternalVideoGen.g:3432:4: rule__FlipFilter__OrientationAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FlipFilter__OrientationAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFlipFilterAccess().getOrientationAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FlipFilter__OrientationAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001C000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003E00000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00001C0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000030000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00000000003C0000L});

}