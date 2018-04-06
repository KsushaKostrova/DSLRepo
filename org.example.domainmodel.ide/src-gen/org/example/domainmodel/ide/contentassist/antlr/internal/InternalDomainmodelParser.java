package org.example.domainmodel.ide.contentassist.antlr.internal;

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
import org.example.domainmodel.services.DomainmodelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainmodelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'('", "')'", "'<'", "'='", "'>'", "'*'", "'+'", "'-'", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'entity'", "'extends'", "':'", "'method'", "'many'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomainmodel.g"; }


    	private DomainmodelGrammarAccess grammarAccess;

    	public void setGrammarAccess(DomainmodelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainmodel"
    // InternalDomainmodel.g:53:1: entryRuleDomainmodel : ruleDomainmodel EOF ;
    public final void entryRuleDomainmodel() throws RecognitionException {
        try {
            // InternalDomainmodel.g:54:1: ( ruleDomainmodel EOF )
            // InternalDomainmodel.g:55:1: ruleDomainmodel EOF
            {
             before(grammarAccess.getDomainmodelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainmodel();

            state._fsp--;

             after(grammarAccess.getDomainmodelRule()); 
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
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // InternalDomainmodel.g:62:1: ruleDomainmodel : ( ( rule__Domainmodel__ElementsAssignment )* ) ;
    public final void ruleDomainmodel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:66:2: ( ( ( rule__Domainmodel__ElementsAssignment )* ) )
            // InternalDomainmodel.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            {
            // InternalDomainmodel.g:67:2: ( ( rule__Domainmodel__ElementsAssignment )* )
            // InternalDomainmodel.g:68:3: ( rule__Domainmodel__ElementsAssignment )*
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 
            // InternalDomainmodel.g:69:3: ( rule__Domainmodel__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==24||(LA1_0>=26 && LA1_0<=27)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDomainmodel.g:69:4: rule__Domainmodel__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Domainmodel__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getDomainmodelAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRulePackageDeclaration"
    // InternalDomainmodel.g:78:1: entryRulePackageDeclaration : rulePackageDeclaration EOF ;
    public final void entryRulePackageDeclaration() throws RecognitionException {
        try {
            // InternalDomainmodel.g:79:1: ( rulePackageDeclaration EOF )
            // InternalDomainmodel.g:80:1: rulePackageDeclaration EOF
            {
             before(grammarAccess.getPackageDeclarationRule()); 
            pushFollow(FOLLOW_1);
            rulePackageDeclaration();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationRule()); 
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
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // InternalDomainmodel.g:87:1: rulePackageDeclaration : ( ( rule__PackageDeclaration__Group__0 ) ) ;
    public final void rulePackageDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:91:2: ( ( ( rule__PackageDeclaration__Group__0 ) ) )
            // InternalDomainmodel.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            {
            // InternalDomainmodel.g:92:2: ( ( rule__PackageDeclaration__Group__0 ) )
            // InternalDomainmodel.g:93:3: ( rule__PackageDeclaration__Group__0 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getGroup()); 
            // InternalDomainmodel.g:94:3: ( rule__PackageDeclaration__Group__0 )
            // InternalDomainmodel.g:94:4: rule__PackageDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getGroup()); 

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
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalDomainmodel.g:103:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalDomainmodel.g:104:1: ( ruleAbstractElement EOF )
            // InternalDomainmodel.g:105:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalDomainmodel.g:112:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:116:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalDomainmodel.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalDomainmodel.g:117:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalDomainmodel.g:118:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalDomainmodel.g:119:3: ( rule__AbstractElement__Alternatives )
            // InternalDomainmodel.g:119:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalDomainmodel.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalDomainmodel.g:129:1: ( ruleQualifiedName EOF )
            // InternalDomainmodel.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalDomainmodel.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalDomainmodel.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalDomainmodel.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalDomainmodel.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalDomainmodel.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalDomainmodel.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // InternalDomainmodel.g:153:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalDomainmodel.g:154:1: ( ruleImport EOF )
            // InternalDomainmodel.g:155:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalDomainmodel.g:162:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:166:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalDomainmodel.g:167:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalDomainmodel.g:167:2: ( ( rule__Import__Group__0 ) )
            // InternalDomainmodel.g:168:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalDomainmodel.g:169:3: ( rule__Import__Group__0 )
            // InternalDomainmodel.g:169:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalDomainmodel.g:178:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalDomainmodel.g:179:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalDomainmodel.g:180:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalDomainmodel.g:187:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:191:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalDomainmodel.g:192:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalDomainmodel.g:192:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalDomainmodel.g:193:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalDomainmodel.g:194:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalDomainmodel.g:194:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // InternalDomainmodel.g:203:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalDomainmodel.g:204:1: ( ruleType EOF )
            // InternalDomainmodel.g:205:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalDomainmodel.g:212:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:216:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalDomainmodel.g:217:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalDomainmodel.g:217:2: ( ( rule__Type__Alternatives ) )
            // InternalDomainmodel.g:218:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalDomainmodel.g:219:3: ( rule__Type__Alternatives )
            // InternalDomainmodel.g:219:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // InternalDomainmodel.g:228:1: entryRuleDataType : ruleDataType EOF ;
    public final void entryRuleDataType() throws RecognitionException {
        try {
            // InternalDomainmodel.g:229:1: ( ruleDataType EOF )
            // InternalDomainmodel.g:230:1: ruleDataType EOF
            {
             before(grammarAccess.getDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleDataType();

            state._fsp--;

             after(grammarAccess.getDataTypeRule()); 
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
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // InternalDomainmodel.g:237:1: ruleDataType : ( ( rule__DataType__Group__0 ) ) ;
    public final void ruleDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:241:2: ( ( ( rule__DataType__Group__0 ) ) )
            // InternalDomainmodel.g:242:2: ( ( rule__DataType__Group__0 ) )
            {
            // InternalDomainmodel.g:242:2: ( ( rule__DataType__Group__0 ) )
            // InternalDomainmodel.g:243:3: ( rule__DataType__Group__0 )
            {
             before(grammarAccess.getDataTypeAccess().getGroup()); 
            // InternalDomainmodel.g:244:3: ( rule__DataType__Group__0 )
            // InternalDomainmodel.g:244:4: rule__DataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // InternalDomainmodel.g:253:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDomainmodel.g:254:1: ( ruleEntity EOF )
            // InternalDomainmodel.g:255:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomainmodel.g:262:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:266:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDomainmodel.g:267:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDomainmodel.g:267:2: ( ( rule__Entity__Group__0 ) )
            // InternalDomainmodel.g:268:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDomainmodel.g:269:3: ( rule__Entity__Group__0 )
            // InternalDomainmodel.g:269:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleValue"
    // InternalDomainmodel.g:278:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalDomainmodel.g:279:1: ( ruleValue EOF )
            // InternalDomainmodel.g:280:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalDomainmodel.g:287:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:291:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalDomainmodel.g:292:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalDomainmodel.g:292:2: ( ( rule__Value__Alternatives ) )
            // InternalDomainmodel.g:293:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalDomainmodel.g:294:3: ( rule__Value__Alternatives )
            // InternalDomainmodel.g:294:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleFeature"
    // InternalDomainmodel.g:303:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalDomainmodel.g:304:1: ( ruleFeature EOF )
            // InternalDomainmodel.g:305:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalDomainmodel.g:312:1: ruleFeature : ( ( rule__Feature__Group__0 ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:316:2: ( ( ( rule__Feature__Group__0 ) ) )
            // InternalDomainmodel.g:317:2: ( ( rule__Feature__Group__0 ) )
            {
            // InternalDomainmodel.g:317:2: ( ( rule__Feature__Group__0 ) )
            // InternalDomainmodel.g:318:3: ( rule__Feature__Group__0 )
            {
             before(grammarAccess.getFeatureAccess().getGroup()); 
            // InternalDomainmodel.g:319:3: ( rule__Feature__Group__0 )
            // InternalDomainmodel.g:319:4: rule__Feature__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getGroup()); 

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleMethod"
    // InternalDomainmodel.g:328:1: entryRuleMethod : ruleMethod EOF ;
    public final void entryRuleMethod() throws RecognitionException {
        try {
            // InternalDomainmodel.g:329:1: ( ruleMethod EOF )
            // InternalDomainmodel.g:330:1: ruleMethod EOF
            {
             before(grammarAccess.getMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getMethodRule()); 
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
    // $ANTLR end "entryRuleMethod"


    // $ANTLR start "ruleMethod"
    // InternalDomainmodel.g:337:1: ruleMethod : ( ( rule__Method__Group__0 ) ) ;
    public final void ruleMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:341:2: ( ( ( rule__Method__Group__0 ) ) )
            // InternalDomainmodel.g:342:2: ( ( rule__Method__Group__0 ) )
            {
            // InternalDomainmodel.g:342:2: ( ( rule__Method__Group__0 ) )
            // InternalDomainmodel.g:343:3: ( rule__Method__Group__0 )
            {
             before(grammarAccess.getMethodAccess().getGroup()); 
            // InternalDomainmodel.g:344:3: ( rule__Method__Group__0 )
            // InternalDomainmodel.g:344:4: rule__Method__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getGroup()); 

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
    // $ANTLR end "ruleMethod"


    // $ANTLR start "entryRuleNum"
    // InternalDomainmodel.g:353:1: entryRuleNum : ruleNum EOF ;
    public final void entryRuleNum() throws RecognitionException {
        try {
            // InternalDomainmodel.g:354:1: ( ruleNum EOF )
            // InternalDomainmodel.g:355:1: ruleNum EOF
            {
             before(grammarAccess.getNumRule()); 
            pushFollow(FOLLOW_1);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getNumRule()); 
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
    // $ANTLR end "entryRuleNum"


    // $ANTLR start "ruleNum"
    // InternalDomainmodel.g:362:1: ruleNum : ( '1' ) ;
    public final void ruleNum() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:366:2: ( ( '1' ) )
            // InternalDomainmodel.g:367:2: ( '1' )
            {
            // InternalDomainmodel.g:367:2: ( '1' )
            // InternalDomainmodel.g:368:3: '1'
            {
             before(grammarAccess.getNumAccess().getDigitOneKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNumAccess().getDigitOneKeyword()); 

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
    // $ANTLR end "ruleNum"


    // $ANTLR start "entryRuleMethodBody"
    // InternalDomainmodel.g:378:1: entryRuleMethodBody : ruleMethodBody EOF ;
    public final void entryRuleMethodBody() throws RecognitionException {
        try {
            // InternalDomainmodel.g:379:1: ( ruleMethodBody EOF )
            // InternalDomainmodel.g:380:1: ruleMethodBody EOF
            {
             before(grammarAccess.getMethodBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleMethodBody();

            state._fsp--;

             after(grammarAccess.getMethodBodyRule()); 
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
    // $ANTLR end "entryRuleMethodBody"


    // $ANTLR start "ruleMethodBody"
    // InternalDomainmodel.g:387:1: ruleMethodBody : ( ( rule__MethodBody__Group__0 ) ) ;
    public final void ruleMethodBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:391:2: ( ( ( rule__MethodBody__Group__0 ) ) )
            // InternalDomainmodel.g:392:2: ( ( rule__MethodBody__Group__0 ) )
            {
            // InternalDomainmodel.g:392:2: ( ( rule__MethodBody__Group__0 ) )
            // InternalDomainmodel.g:393:3: ( rule__MethodBody__Group__0 )
            {
             before(grammarAccess.getMethodBodyAccess().getGroup()); 
            // InternalDomainmodel.g:394:3: ( rule__MethodBody__Group__0 )
            // InternalDomainmodel.g:394:4: rule__MethodBody__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodBodyAccess().getGroup()); 

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
    // $ANTLR end "ruleMethodBody"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalDomainmodel.g:402:1: rule__AbstractElement__Alternatives : ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:406:1: ( ( rulePackageDeclaration ) | ( ruleType ) | ( ruleImport ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 26:
            case 27:
                {
                alt2=2;
                }
                break;
            case 24:
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
                    // InternalDomainmodel.g:407:2: ( rulePackageDeclaration )
                    {
                    // InternalDomainmodel.g:407:2: ( rulePackageDeclaration )
                    // InternalDomainmodel.g:408:3: rulePackageDeclaration
                    {
                     before(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePackageDeclaration();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getPackageDeclarationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:413:2: ( ruleType )
                    {
                    // InternalDomainmodel.g:413:2: ( ruleType )
                    // InternalDomainmodel.g:414:3: ruleType
                    {
                     before(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleType();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getTypeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:419:2: ( ruleImport )
                    {
                    // InternalDomainmodel.g:419:2: ( ruleImport )
                    // InternalDomainmodel.g:420:3: ruleImport
                    {
                     before(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleImport();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getImportParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalDomainmodel.g:429:1: rule__Type__Alternatives : ( ( ruleDataType ) | ( ruleEntity ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:433:1: ( ( ruleDataType ) | ( ruleEntity ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==26) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomainmodel.g:434:2: ( ruleDataType )
                    {
                    // InternalDomainmodel.g:434:2: ( ruleDataType )
                    // InternalDomainmodel.g:435:3: ruleDataType
                    {
                     before(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDataType();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:440:2: ( ruleEntity )
                    {
                    // InternalDomainmodel.g:440:2: ( ruleEntity )
                    // InternalDomainmodel.g:441:3: ruleEntity
                    {
                     before(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEntity();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getEntityParserRuleCall_1()); 

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
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalDomainmodel.g:450:1: rule__Value__Alternatives : ( ( RULE_ID ) | ( '(' ) | ( ')' ) | ( '<' ) | ( '=' ) | ( '>' ) | ( '*' ) | ( '+' ) | ( '-' ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:454:1: ( ( RULE_ID ) | ( '(' ) | ( ')' ) | ( '<' ) | ( '=' ) | ( '>' ) | ( '*' ) | ( '+' ) | ( '-' ) )
            int alt4=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            case 19:
                {
                alt4=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalDomainmodel.g:455:2: ( RULE_ID )
                    {
                    // InternalDomainmodel.g:455:2: ( RULE_ID )
                    // InternalDomainmodel.g:456:3: RULE_ID
                    {
                     before(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomainmodel.g:461:2: ( '(' )
                    {
                    // InternalDomainmodel.g:461:2: ( '(' )
                    // InternalDomainmodel.g:462:3: '('
                    {
                     before(grammarAccess.getValueAccess().getLeftParenthesisKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getLeftParenthesisKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomainmodel.g:467:2: ( ')' )
                    {
                    // InternalDomainmodel.g:467:2: ( ')' )
                    // InternalDomainmodel.g:468:3: ')'
                    {
                     before(grammarAccess.getValueAccess().getRightParenthesisKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getRightParenthesisKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalDomainmodel.g:473:2: ( '<' )
                    {
                    // InternalDomainmodel.g:473:2: ( '<' )
                    // InternalDomainmodel.g:474:3: '<'
                    {
                     before(grammarAccess.getValueAccess().getLessThanSignKeyword_3()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getLessThanSignKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalDomainmodel.g:479:2: ( '=' )
                    {
                    // InternalDomainmodel.g:479:2: ( '=' )
                    // InternalDomainmodel.g:480:3: '='
                    {
                     before(grammarAccess.getValueAccess().getEqualsSignKeyword_4()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getEqualsSignKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalDomainmodel.g:485:2: ( '>' )
                    {
                    // InternalDomainmodel.g:485:2: ( '>' )
                    // InternalDomainmodel.g:486:3: '>'
                    {
                     before(grammarAccess.getValueAccess().getGreaterThanSignKeyword_5()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getGreaterThanSignKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalDomainmodel.g:491:2: ( '*' )
                    {
                    // InternalDomainmodel.g:491:2: ( '*' )
                    // InternalDomainmodel.g:492:3: '*'
                    {
                     before(grammarAccess.getValueAccess().getAsteriskKeyword_6()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getAsteriskKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalDomainmodel.g:497:2: ( '+' )
                    {
                    // InternalDomainmodel.g:497:2: ( '+' )
                    // InternalDomainmodel.g:498:3: '+'
                    {
                     before(grammarAccess.getValueAccess().getPlusSignKeyword_7()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getPlusSignKeyword_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalDomainmodel.g:503:2: ( '-' )
                    {
                    // InternalDomainmodel.g:503:2: ( '-' )
                    // InternalDomainmodel.g:504:3: '-'
                    {
                     before(grammarAccess.getValueAccess().getHyphenMinusKeyword_8()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getValueAccess().getHyphenMinusKeyword_8()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__PackageDeclaration__Group__0"
    // InternalDomainmodel.g:513:1: rule__PackageDeclaration__Group__0 : rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 ;
    public final void rule__PackageDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:517:1: ( rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1 )
            // InternalDomainmodel.g:518:2: rule__PackageDeclaration__Group__0__Impl rule__PackageDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__PackageDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__1();

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
    // $ANTLR end "rule__PackageDeclaration__Group__0"


    // $ANTLR start "rule__PackageDeclaration__Group__0__Impl"
    // InternalDomainmodel.g:525:1: rule__PackageDeclaration__Group__0__Impl : ( 'package' ) ;
    public final void rule__PackageDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:529:1: ( ( 'package' ) )
            // InternalDomainmodel.g:530:1: ( 'package' )
            {
            // InternalDomainmodel.g:530:1: ( 'package' )
            // InternalDomainmodel.g:531:2: 'package'
            {
             before(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getPackageKeyword_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__0__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__1"
    // InternalDomainmodel.g:540:1: rule__PackageDeclaration__Group__1 : rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 ;
    public final void rule__PackageDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:544:1: ( rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2 )
            // InternalDomainmodel.g:545:2: rule__PackageDeclaration__Group__1__Impl rule__PackageDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__PackageDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__2();

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
    // $ANTLR end "rule__PackageDeclaration__Group__1"


    // $ANTLR start "rule__PackageDeclaration__Group__1__Impl"
    // InternalDomainmodel.g:552:1: rule__PackageDeclaration__Group__1__Impl : ( ( rule__PackageDeclaration__NameAssignment_1 ) ) ;
    public final void rule__PackageDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:556:1: ( ( ( rule__PackageDeclaration__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:557:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:557:1: ( ( rule__PackageDeclaration__NameAssignment_1 ) )
            // InternalDomainmodel.g:558:2: ( rule__PackageDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:559:2: ( rule__PackageDeclaration__NameAssignment_1 )
            // InternalDomainmodel.g:559:3: rule__PackageDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPackageDeclarationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__1__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__2"
    // InternalDomainmodel.g:567:1: rule__PackageDeclaration__Group__2 : rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 ;
    public final void rule__PackageDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:571:1: ( rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3 )
            // InternalDomainmodel.g:572:2: rule__PackageDeclaration__Group__2__Impl rule__PackageDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__3();

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
    // $ANTLR end "rule__PackageDeclaration__Group__2"


    // $ANTLR start "rule__PackageDeclaration__Group__2__Impl"
    // InternalDomainmodel.g:579:1: rule__PackageDeclaration__Group__2__Impl : ( '{' ) ;
    public final void rule__PackageDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:583:1: ( ( '{' ) )
            // InternalDomainmodel.g:584:1: ( '{' )
            {
            // InternalDomainmodel.g:584:1: ( '{' )
            // InternalDomainmodel.g:585:2: '{'
            {
             before(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__2__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__3"
    // InternalDomainmodel.g:594:1: rule__PackageDeclaration__Group__3 : rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 ;
    public final void rule__PackageDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:598:1: ( rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4 )
            // InternalDomainmodel.g:599:2: rule__PackageDeclaration__Group__3__Impl rule__PackageDeclaration__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__PackageDeclaration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4();

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
    // $ANTLR end "rule__PackageDeclaration__Group__3"


    // $ANTLR start "rule__PackageDeclaration__Group__3__Impl"
    // InternalDomainmodel.g:606:1: rule__PackageDeclaration__Group__3__Impl : ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) ;
    public final void rule__PackageDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:610:1: ( ( ( rule__PackageDeclaration__ElementsAssignment_3 )* ) )
            // InternalDomainmodel.g:611:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            {
            // InternalDomainmodel.g:611:1: ( ( rule__PackageDeclaration__ElementsAssignment_3 )* )
            // InternalDomainmodel.g:612:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 
            // InternalDomainmodel.g:613:2: ( rule__PackageDeclaration__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20||LA5_0==24||(LA5_0>=26 && LA5_0<=27)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalDomainmodel.g:613:3: rule__PackageDeclaration__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__PackageDeclaration__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPackageDeclarationAccess().getElementsAssignment_3()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__3__Impl"


    // $ANTLR start "rule__PackageDeclaration__Group__4"
    // InternalDomainmodel.g:621:1: rule__PackageDeclaration__Group__4 : rule__PackageDeclaration__Group__4__Impl ;
    public final void rule__PackageDeclaration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:625:1: ( rule__PackageDeclaration__Group__4__Impl )
            // InternalDomainmodel.g:626:2: rule__PackageDeclaration__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PackageDeclaration__Group__4__Impl();

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
    // $ANTLR end "rule__PackageDeclaration__Group__4"


    // $ANTLR start "rule__PackageDeclaration__Group__4__Impl"
    // InternalDomainmodel.g:632:1: rule__PackageDeclaration__Group__4__Impl : ( '}' ) ;
    public final void rule__PackageDeclaration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:636:1: ( ( '}' ) )
            // InternalDomainmodel.g:637:1: ( '}' )
            {
            // InternalDomainmodel.g:637:1: ( '}' )
            // InternalDomainmodel.g:638:2: '}'
            {
             before(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPackageDeclarationAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PackageDeclaration__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalDomainmodel.g:648:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:652:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalDomainmodel.g:653:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalDomainmodel.g:660:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:664:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:665:1: ( RULE_ID )
            {
            // InternalDomainmodel.g:665:1: ( RULE_ID )
            // InternalDomainmodel.g:666:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalDomainmodel.g:675:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:679:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalDomainmodel.g:680:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalDomainmodel.g:686:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:690:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalDomainmodel.g:691:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalDomainmodel.g:691:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalDomainmodel.g:692:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalDomainmodel.g:693:2: ( rule__QualifiedName__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDomainmodel.g:693:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalDomainmodel.g:702:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:706:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalDomainmodel.g:707:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalDomainmodel.g:714:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:718:1: ( ( '.' ) )
            // InternalDomainmodel.g:719:1: ( '.' )
            {
            // InternalDomainmodel.g:719:1: ( '.' )
            // InternalDomainmodel.g:720:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalDomainmodel.g:729:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:733:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalDomainmodel.g:734:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalDomainmodel.g:740:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:744:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:745:1: ( RULE_ID )
            {
            // InternalDomainmodel.g:745:1: ( RULE_ID )
            // InternalDomainmodel.g:746:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalDomainmodel.g:756:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:760:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalDomainmodel.g:761:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalDomainmodel.g:768:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:772:1: ( ( 'import' ) )
            // InternalDomainmodel.g:773:1: ( 'import' )
            {
            // InternalDomainmodel.g:773:1: ( 'import' )
            // InternalDomainmodel.g:774:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalDomainmodel.g:783:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:787:1: ( rule__Import__Group__1__Impl )
            // InternalDomainmodel.g:788:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalDomainmodel.g:794:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:798:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalDomainmodel.g:799:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalDomainmodel.g:799:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalDomainmodel.g:800:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalDomainmodel.g:801:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalDomainmodel.g:801:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalDomainmodel.g:810:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:814:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalDomainmodel.g:815:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalDomainmodel.g:822:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:826:1: ( ( ruleQualifiedName ) )
            // InternalDomainmodel.g:827:1: ( ruleQualifiedName )
            {
            // InternalDomainmodel.g:827:1: ( ruleQualifiedName )
            // InternalDomainmodel.g:828:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalDomainmodel.g:837:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:841:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalDomainmodel.g:842:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalDomainmodel.g:848:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:852:1: ( ( ( '.*' )? ) )
            // InternalDomainmodel.g:853:1: ( ( '.*' )? )
            {
            // InternalDomainmodel.g:853:1: ( ( '.*' )? )
            // InternalDomainmodel.g:854:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalDomainmodel.g:855:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomainmodel.g:855:3: '.*'
                    {
                    match(input,25,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__DataType__Group__0"
    // InternalDomainmodel.g:864:1: rule__DataType__Group__0 : rule__DataType__Group__0__Impl rule__DataType__Group__1 ;
    public final void rule__DataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:868:1: ( rule__DataType__Group__0__Impl rule__DataType__Group__1 )
            // InternalDomainmodel.g:869:2: rule__DataType__Group__0__Impl rule__DataType__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataType__Group__1();

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
    // $ANTLR end "rule__DataType__Group__0"


    // $ANTLR start "rule__DataType__Group__0__Impl"
    // InternalDomainmodel.g:876:1: rule__DataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__DataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:880:1: ( ( 'datatype' ) )
            // InternalDomainmodel.g:881:1: ( 'datatype' )
            {
            // InternalDomainmodel.g:881:1: ( 'datatype' )
            // InternalDomainmodel.g:882:2: 'datatype'
            {
             before(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getDatatypeKeyword_0()); 

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
    // $ANTLR end "rule__DataType__Group__0__Impl"


    // $ANTLR start "rule__DataType__Group__1"
    // InternalDomainmodel.g:891:1: rule__DataType__Group__1 : rule__DataType__Group__1__Impl ;
    public final void rule__DataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:895:1: ( rule__DataType__Group__1__Impl )
            // InternalDomainmodel.g:896:2: rule__DataType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataType__Group__1__Impl();

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
    // $ANTLR end "rule__DataType__Group__1"


    // $ANTLR start "rule__DataType__Group__1__Impl"
    // InternalDomainmodel.g:902:1: rule__DataType__Group__1__Impl : ( ( rule__DataType__NameAssignment_1 ) ) ;
    public final void rule__DataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:906:1: ( ( ( rule__DataType__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:907:1: ( ( rule__DataType__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:907:1: ( ( rule__DataType__NameAssignment_1 ) )
            // InternalDomainmodel.g:908:2: ( rule__DataType__NameAssignment_1 )
            {
             before(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:909:2: ( rule__DataType__NameAssignment_1 )
            // InternalDomainmodel.g:909:3: rule__DataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTypeAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__DataType__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDomainmodel.g:918:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:922:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDomainmodel.g:923:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDomainmodel.g:930:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:934:1: ( ( 'entity' ) )
            // InternalDomainmodel.g:935:1: ( 'entity' )
            {
            // InternalDomainmodel.g:935:1: ( 'entity' )
            // InternalDomainmodel.g:936:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDomainmodel.g:945:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:949:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDomainmodel.g:950:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDomainmodel.g:957:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:961:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:962:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:962:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalDomainmodel.g:963:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:964:2: ( rule__Entity__NameAssignment_1 )
            // InternalDomainmodel.g:964:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDomainmodel.g:972:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:976:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDomainmodel.g:977:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDomainmodel.g:984:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:988:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // InternalDomainmodel.g:989:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // InternalDomainmodel.g:989:1: ( ( rule__Entity__Group_2__0 )? )
            // InternalDomainmodel.g:990:2: ( rule__Entity__Group_2__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_2()); 
            // InternalDomainmodel.g:991:2: ( rule__Entity__Group_2__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDomainmodel.g:991:3: rule__Entity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDomainmodel.g:999:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1003:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDomainmodel.g:1004:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDomainmodel.g:1011:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1015:1: ( ( '{' ) )
            // InternalDomainmodel.g:1016:1: ( '{' )
            {
            // InternalDomainmodel.g:1016:1: ( '{' )
            // InternalDomainmodel.g:1017:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDomainmodel.g:1026:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1030:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDomainmodel.g:1031:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDomainmodel.g:1038:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__FeaturesAssignment_4 )* ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1042:1: ( ( ( rule__Entity__FeaturesAssignment_4 )* ) )
            // InternalDomainmodel.g:1043:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            {
            // InternalDomainmodel.g:1043:1: ( ( rule__Entity__FeaturesAssignment_4 )* )
            // InternalDomainmodel.g:1044:2: ( rule__Entity__FeaturesAssignment_4 )*
            {
             before(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 
            // InternalDomainmodel.g:1045:2: ( rule__Entity__FeaturesAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==31) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDomainmodel.g:1045:3: rule__Entity__FeaturesAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Entity__FeaturesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getFeaturesAssignment_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDomainmodel.g:1053:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1057:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalDomainmodel.g:1058:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDomainmodel.g:1065:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__MethodsAssignment_5 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1069:1: ( ( ( rule__Entity__MethodsAssignment_5 )* ) )
            // InternalDomainmodel.g:1070:1: ( ( rule__Entity__MethodsAssignment_5 )* )
            {
            // InternalDomainmodel.g:1070:1: ( ( rule__Entity__MethodsAssignment_5 )* )
            // InternalDomainmodel.g:1071:2: ( rule__Entity__MethodsAssignment_5 )*
            {
             before(grammarAccess.getEntityAccess().getMethodsAssignment_5()); 
            // InternalDomainmodel.g:1072:2: ( rule__Entity__MethodsAssignment_5 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDomainmodel.g:1072:3: rule__Entity__MethodsAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Entity__MethodsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getMethodsAssignment_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalDomainmodel.g:1080:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1084:1: ( rule__Entity__Group__6__Impl )
            // InternalDomainmodel.g:1085:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalDomainmodel.g:1091:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1095:1: ( ( '}' ) )
            // InternalDomainmodel.g:1096:1: ( '}' )
            {
            // InternalDomainmodel.g:1096:1: ( '}' )
            // InternalDomainmodel.g:1097:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // InternalDomainmodel.g:1107:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1111:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // InternalDomainmodel.g:1112:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // InternalDomainmodel.g:1119:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1123:1: ( ( 'extends' ) )
            // InternalDomainmodel.g:1124:1: ( 'extends' )
            {
            // InternalDomainmodel.g:1124:1: ( 'extends' )
            // InternalDomainmodel.g:1125:2: 'extends'
            {
             before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 

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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // InternalDomainmodel.g:1134:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1138:1: ( rule__Entity__Group_2__1__Impl )
            // InternalDomainmodel.g:1139:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // InternalDomainmodel.g:1145:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1149:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // InternalDomainmodel.g:1150:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // InternalDomainmodel.g:1150:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // InternalDomainmodel.g:1151:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            // InternalDomainmodel.g:1152:2: ( rule__Entity__SuperTypeAssignment_2_1 )
            // InternalDomainmodel.g:1152:3: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 

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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Feature__Group__0"
    // InternalDomainmodel.g:1161:1: rule__Feature__Group__0 : rule__Feature__Group__0__Impl rule__Feature__Group__1 ;
    public final void rule__Feature__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1165:1: ( rule__Feature__Group__0__Impl rule__Feature__Group__1 )
            // InternalDomainmodel.g:1166:2: rule__Feature__Group__0__Impl rule__Feature__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Feature__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__1();

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
    // $ANTLR end "rule__Feature__Group__0"


    // $ANTLR start "rule__Feature__Group__0__Impl"
    // InternalDomainmodel.g:1173:1: rule__Feature__Group__0__Impl : ( ( rule__Feature__ManyAssignment_0 )? ) ;
    public final void rule__Feature__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1177:1: ( ( ( rule__Feature__ManyAssignment_0 )? ) )
            // InternalDomainmodel.g:1178:1: ( ( rule__Feature__ManyAssignment_0 )? )
            {
            // InternalDomainmodel.g:1178:1: ( ( rule__Feature__ManyAssignment_0 )? )
            // InternalDomainmodel.g:1179:2: ( rule__Feature__ManyAssignment_0 )?
            {
             before(grammarAccess.getFeatureAccess().getManyAssignment_0()); 
            // InternalDomainmodel.g:1180:2: ( rule__Feature__ManyAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomainmodel.g:1180:3: rule__Feature__ManyAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__ManyAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getManyAssignment_0()); 

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
    // $ANTLR end "rule__Feature__Group__0__Impl"


    // $ANTLR start "rule__Feature__Group__1"
    // InternalDomainmodel.g:1188:1: rule__Feature__Group__1 : rule__Feature__Group__1__Impl rule__Feature__Group__2 ;
    public final void rule__Feature__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1192:1: ( rule__Feature__Group__1__Impl rule__Feature__Group__2 )
            // InternalDomainmodel.g:1193:2: rule__Feature__Group__1__Impl rule__Feature__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Feature__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__2();

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
    // $ANTLR end "rule__Feature__Group__1"


    // $ANTLR start "rule__Feature__Group__1__Impl"
    // InternalDomainmodel.g:1200:1: rule__Feature__Group__1__Impl : ( ( rule__Feature__NameAssignment_1 ) ) ;
    public final void rule__Feature__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1204:1: ( ( ( rule__Feature__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:1205:1: ( ( rule__Feature__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:1205:1: ( ( rule__Feature__NameAssignment_1 ) )
            // InternalDomainmodel.g:1206:2: ( rule__Feature__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:1207:2: ( rule__Feature__NameAssignment_1 )
            // InternalDomainmodel.g:1207:3: rule__Feature__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Feature__Group__1__Impl"


    // $ANTLR start "rule__Feature__Group__2"
    // InternalDomainmodel.g:1215:1: rule__Feature__Group__2 : rule__Feature__Group__2__Impl rule__Feature__Group__3 ;
    public final void rule__Feature__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1219:1: ( rule__Feature__Group__2__Impl rule__Feature__Group__3 )
            // InternalDomainmodel.g:1220:2: rule__Feature__Group__2__Impl rule__Feature__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Feature__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__3();

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
    // $ANTLR end "rule__Feature__Group__2"


    // $ANTLR start "rule__Feature__Group__2__Impl"
    // InternalDomainmodel.g:1227:1: rule__Feature__Group__2__Impl : ( ':' ) ;
    public final void rule__Feature__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1231:1: ( ( ':' ) )
            // InternalDomainmodel.g:1232:1: ( ':' )
            {
            // InternalDomainmodel.g:1232:1: ( ':' )
            // InternalDomainmodel.g:1233:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Feature__Group__2__Impl"


    // $ANTLR start "rule__Feature__Group__3"
    // InternalDomainmodel.g:1242:1: rule__Feature__Group__3 : rule__Feature__Group__3__Impl rule__Feature__Group__4 ;
    public final void rule__Feature__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1246:1: ( rule__Feature__Group__3__Impl rule__Feature__Group__4 )
            // InternalDomainmodel.g:1247:2: rule__Feature__Group__3__Impl rule__Feature__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__Feature__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group__4();

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
    // $ANTLR end "rule__Feature__Group__3"


    // $ANTLR start "rule__Feature__Group__3__Impl"
    // InternalDomainmodel.g:1254:1: rule__Feature__Group__3__Impl : ( ( rule__Feature__TypeAssignment_3 ) ) ;
    public final void rule__Feature__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1258:1: ( ( ( rule__Feature__TypeAssignment_3 ) ) )
            // InternalDomainmodel.g:1259:1: ( ( rule__Feature__TypeAssignment_3 ) )
            {
            // InternalDomainmodel.g:1259:1: ( ( rule__Feature__TypeAssignment_3 ) )
            // InternalDomainmodel.g:1260:2: ( rule__Feature__TypeAssignment_3 )
            {
             before(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 
            // InternalDomainmodel.g:1261:2: ( rule__Feature__TypeAssignment_3 )
            // InternalDomainmodel.g:1261:3: rule__Feature__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__Feature__Group__3__Impl"


    // $ANTLR start "rule__Feature__Group__4"
    // InternalDomainmodel.g:1269:1: rule__Feature__Group__4 : rule__Feature__Group__4__Impl ;
    public final void rule__Feature__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1273:1: ( rule__Feature__Group__4__Impl )
            // InternalDomainmodel.g:1274:2: rule__Feature__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group__4__Impl();

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
    // $ANTLR end "rule__Feature__Group__4"


    // $ANTLR start "rule__Feature__Group__4__Impl"
    // InternalDomainmodel.g:1280:1: rule__Feature__Group__4__Impl : ( ( rule__Feature__Group_4__0 )? ) ;
    public final void rule__Feature__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1284:1: ( ( ( rule__Feature__Group_4__0 )? ) )
            // InternalDomainmodel.g:1285:1: ( ( rule__Feature__Group_4__0 )? )
            {
            // InternalDomainmodel.g:1285:1: ( ( rule__Feature__Group_4__0 )? )
            // InternalDomainmodel.g:1286:2: ( rule__Feature__Group_4__0 )?
            {
             before(grammarAccess.getFeatureAccess().getGroup_4()); 
            // InternalDomainmodel.g:1287:2: ( rule__Feature__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==29) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomainmodel.g:1287:3: rule__Feature__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Feature__Group__4__Impl"


    // $ANTLR start "rule__Feature__Group_4__0"
    // InternalDomainmodel.g:1296:1: rule__Feature__Group_4__0 : rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 ;
    public final void rule__Feature__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1300:1: ( rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1 )
            // InternalDomainmodel.g:1301:2: rule__Feature__Group_4__0__Impl rule__Feature__Group_4__1
            {
            pushFollow(FOLLOW_16);
            rule__Feature__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature__Group_4__1();

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
    // $ANTLR end "rule__Feature__Group_4__0"


    // $ANTLR start "rule__Feature__Group_4__0__Impl"
    // InternalDomainmodel.g:1308:1: rule__Feature__Group_4__0__Impl : ( ':' ) ;
    public final void rule__Feature__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1312:1: ( ( ':' ) )
            // InternalDomainmodel.g:1313:1: ( ':' )
            {
            // InternalDomainmodel.g:1313:1: ( ':' )
            // InternalDomainmodel.g:1314:2: ':'
            {
             before(grammarAccess.getFeatureAccess().getColonKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getColonKeyword_4_0()); 

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
    // $ANTLR end "rule__Feature__Group_4__0__Impl"


    // $ANTLR start "rule__Feature__Group_4__1"
    // InternalDomainmodel.g:1323:1: rule__Feature__Group_4__1 : rule__Feature__Group_4__1__Impl ;
    public final void rule__Feature__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1327:1: ( rule__Feature__Group_4__1__Impl )
            // InternalDomainmodel.g:1328:2: rule__Feature__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Group_4__1__Impl();

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
    // $ANTLR end "rule__Feature__Group_4__1"


    // $ANTLR start "rule__Feature__Group_4__1__Impl"
    // InternalDomainmodel.g:1334:1: rule__Feature__Group_4__1__Impl : ( ( rule__Feature__ValueAssignment_4_1 )* ) ;
    public final void rule__Feature__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1338:1: ( ( ( rule__Feature__ValueAssignment_4_1 )* ) )
            // InternalDomainmodel.g:1339:1: ( ( rule__Feature__ValueAssignment_4_1 )* )
            {
            // InternalDomainmodel.g:1339:1: ( ( rule__Feature__ValueAssignment_4_1 )* )
            // InternalDomainmodel.g:1340:2: ( rule__Feature__ValueAssignment_4_1 )*
            {
             before(grammarAccess.getFeatureAccess().getValueAssignment_4_1()); 
            // InternalDomainmodel.g:1341:2: ( rule__Feature__ValueAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    int LA13_2 = input.LA(2);

                    if ( (LA13_2==EOF||LA13_2==RULE_ID||(LA13_2>=12 && LA13_2<=19)||LA13_2==22||(LA13_2>=30 && LA13_2<=31)) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>=12 && LA13_0<=19)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalDomainmodel.g:1341:3: rule__Feature__ValueAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__Feature__ValueAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getFeatureAccess().getValueAssignment_4_1()); 

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
    // $ANTLR end "rule__Feature__Group_4__1__Impl"


    // $ANTLR start "rule__Method__Group__0"
    // InternalDomainmodel.g:1350:1: rule__Method__Group__0 : rule__Method__Group__0__Impl rule__Method__Group__1 ;
    public final void rule__Method__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1354:1: ( rule__Method__Group__0__Impl rule__Method__Group__1 )
            // InternalDomainmodel.g:1355:2: rule__Method__Group__0__Impl rule__Method__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__1();

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
    // $ANTLR end "rule__Method__Group__0"


    // $ANTLR start "rule__Method__Group__0__Impl"
    // InternalDomainmodel.g:1362:1: rule__Method__Group__0__Impl : ( 'method' ) ;
    public final void rule__Method__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1366:1: ( ( 'method' ) )
            // InternalDomainmodel.g:1367:1: ( 'method' )
            {
            // InternalDomainmodel.g:1367:1: ( 'method' )
            // InternalDomainmodel.g:1368:2: 'method'
            {
             before(grammarAccess.getMethodAccess().getMethodKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getMethodKeyword_0()); 

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
    // $ANTLR end "rule__Method__Group__0__Impl"


    // $ANTLR start "rule__Method__Group__1"
    // InternalDomainmodel.g:1377:1: rule__Method__Group__1 : rule__Method__Group__1__Impl rule__Method__Group__2 ;
    public final void rule__Method__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1381:1: ( rule__Method__Group__1__Impl rule__Method__Group__2 )
            // InternalDomainmodel.g:1382:2: rule__Method__Group__1__Impl rule__Method__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Method__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__2();

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
    // $ANTLR end "rule__Method__Group__1"


    // $ANTLR start "rule__Method__Group__1__Impl"
    // InternalDomainmodel.g:1389:1: rule__Method__Group__1__Impl : ( ( rule__Method__NameAssignment_1 ) ) ;
    public final void rule__Method__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1393:1: ( ( ( rule__Method__NameAssignment_1 ) ) )
            // InternalDomainmodel.g:1394:1: ( ( rule__Method__NameAssignment_1 ) )
            {
            // InternalDomainmodel.g:1394:1: ( ( rule__Method__NameAssignment_1 ) )
            // InternalDomainmodel.g:1395:2: ( rule__Method__NameAssignment_1 )
            {
             before(grammarAccess.getMethodAccess().getNameAssignment_1()); 
            // InternalDomainmodel.g:1396:2: ( rule__Method__NameAssignment_1 )
            // InternalDomainmodel.g:1396:3: rule__Method__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Method__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Method__Group__1__Impl"


    // $ANTLR start "rule__Method__Group__2"
    // InternalDomainmodel.g:1404:1: rule__Method__Group__2 : rule__Method__Group__2__Impl rule__Method__Group__3 ;
    public final void rule__Method__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1408:1: ( rule__Method__Group__2__Impl rule__Method__Group__3 )
            // InternalDomainmodel.g:1409:2: rule__Method__Group__2__Impl rule__Method__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Method__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Method__Group__3();

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
    // $ANTLR end "rule__Method__Group__2"


    // $ANTLR start "rule__Method__Group__2__Impl"
    // InternalDomainmodel.g:1416:1: rule__Method__Group__2__Impl : ( ':' ) ;
    public final void rule__Method__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1420:1: ( ( ':' ) )
            // InternalDomainmodel.g:1421:1: ( ':' )
            {
            // InternalDomainmodel.g:1421:1: ( ':' )
            // InternalDomainmodel.g:1422:2: ':'
            {
             before(grammarAccess.getMethodAccess().getColonKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__Method__Group__2__Impl"


    // $ANTLR start "rule__Method__Group__3"
    // InternalDomainmodel.g:1431:1: rule__Method__Group__3 : rule__Method__Group__3__Impl ;
    public final void rule__Method__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1435:1: ( rule__Method__Group__3__Impl )
            // InternalDomainmodel.g:1436:2: rule__Method__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Method__Group__3__Impl();

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
    // $ANTLR end "rule__Method__Group__3"


    // $ANTLR start "rule__Method__Group__3__Impl"
    // InternalDomainmodel.g:1442:1: rule__Method__Group__3__Impl : ( ( rule__Method__BodyAssignment_3 ) ) ;
    public final void rule__Method__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1446:1: ( ( ( rule__Method__BodyAssignment_3 ) ) )
            // InternalDomainmodel.g:1447:1: ( ( rule__Method__BodyAssignment_3 ) )
            {
            // InternalDomainmodel.g:1447:1: ( ( rule__Method__BodyAssignment_3 ) )
            // InternalDomainmodel.g:1448:2: ( rule__Method__BodyAssignment_3 )
            {
             before(grammarAccess.getMethodAccess().getBodyAssignment_3()); 
            // InternalDomainmodel.g:1449:2: ( rule__Method__BodyAssignment_3 )
            // InternalDomainmodel.g:1449:3: rule__Method__BodyAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Method__BodyAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodAccess().getBodyAssignment_3()); 

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
    // $ANTLR end "rule__Method__Group__3__Impl"


    // $ANTLR start "rule__MethodBody__Group__0"
    // InternalDomainmodel.g:1458:1: rule__MethodBody__Group__0 : rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1 ;
    public final void rule__MethodBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1462:1: ( rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1 )
            // InternalDomainmodel.g:1463:2: rule__MethodBody__Group__0__Impl rule__MethodBody__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__MethodBody__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__1();

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
    // $ANTLR end "rule__MethodBody__Group__0"


    // $ANTLR start "rule__MethodBody__Group__0__Impl"
    // InternalDomainmodel.g:1470:1: rule__MethodBody__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__MethodBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1474:1: ( ( ruleQualifiedName ) )
            // InternalDomainmodel.g:1475:1: ( ruleQualifiedName )
            {
            // InternalDomainmodel.g:1475:1: ( ruleQualifiedName )
            // InternalDomainmodel.g:1476:2: ruleQualifiedName
            {
             before(grammarAccess.getMethodBodyAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMethodBodyAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__MethodBody__Group__0__Impl"


    // $ANTLR start "rule__MethodBody__Group__1"
    // InternalDomainmodel.g:1485:1: rule__MethodBody__Group__1 : rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2 ;
    public final void rule__MethodBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1489:1: ( rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2 )
            // InternalDomainmodel.g:1490:2: rule__MethodBody__Group__1__Impl rule__MethodBody__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__MethodBody__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__2();

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
    // $ANTLR end "rule__MethodBody__Group__1"


    // $ANTLR start "rule__MethodBody__Group__1__Impl"
    // InternalDomainmodel.g:1497:1: rule__MethodBody__Group__1__Impl : ( '(' ) ;
    public final void rule__MethodBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1501:1: ( ( '(' ) )
            // InternalDomainmodel.g:1502:1: ( '(' )
            {
            // InternalDomainmodel.g:1502:1: ( '(' )
            // InternalDomainmodel.g:1503:2: '('
            {
             before(grammarAccess.getMethodBodyAccess().getLeftParenthesisKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMethodBodyAccess().getLeftParenthesisKeyword_1()); 

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
    // $ANTLR end "rule__MethodBody__Group__1__Impl"


    // $ANTLR start "rule__MethodBody__Group__2"
    // InternalDomainmodel.g:1512:1: rule__MethodBody__Group__2 : rule__MethodBody__Group__2__Impl rule__MethodBody__Group__3 ;
    public final void rule__MethodBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1516:1: ( rule__MethodBody__Group__2__Impl rule__MethodBody__Group__3 )
            // InternalDomainmodel.g:1517:2: rule__MethodBody__Group__2__Impl rule__MethodBody__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__MethodBody__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__3();

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
    // $ANTLR end "rule__MethodBody__Group__2"


    // $ANTLR start "rule__MethodBody__Group__2__Impl"
    // InternalDomainmodel.g:1524:1: rule__MethodBody__Group__2__Impl : ( ruleNum ) ;
    public final void rule__MethodBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1528:1: ( ( ruleNum ) )
            // InternalDomainmodel.g:1529:1: ( ruleNum )
            {
            // InternalDomainmodel.g:1529:1: ( ruleNum )
            // InternalDomainmodel.g:1530:2: ruleNum
            {
             before(grammarAccess.getMethodBodyAccess().getNumParserRuleCall_2()); 
            pushFollow(FOLLOW_2);
            ruleNum();

            state._fsp--;

             after(grammarAccess.getMethodBodyAccess().getNumParserRuleCall_2()); 

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
    // $ANTLR end "rule__MethodBody__Group__2__Impl"


    // $ANTLR start "rule__MethodBody__Group__3"
    // InternalDomainmodel.g:1539:1: rule__MethodBody__Group__3 : rule__MethodBody__Group__3__Impl ;
    public final void rule__MethodBody__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1543:1: ( rule__MethodBody__Group__3__Impl )
            // InternalDomainmodel.g:1544:2: rule__MethodBody__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodBody__Group__3__Impl();

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
    // $ANTLR end "rule__MethodBody__Group__3"


    // $ANTLR start "rule__MethodBody__Group__3__Impl"
    // InternalDomainmodel.g:1550:1: rule__MethodBody__Group__3__Impl : ( ')' ) ;
    public final void rule__MethodBody__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1554:1: ( ( ')' ) )
            // InternalDomainmodel.g:1555:1: ( ')' )
            {
            // InternalDomainmodel.g:1555:1: ( ')' )
            // InternalDomainmodel.g:1556:2: ')'
            {
             before(grammarAccess.getMethodBodyAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMethodBodyAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__MethodBody__Group__3__Impl"


    // $ANTLR start "rule__Domainmodel__ElementsAssignment"
    // InternalDomainmodel.g:1566:1: rule__Domainmodel__ElementsAssignment : ( ruleAbstractElement ) ;
    public final void rule__Domainmodel__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1570:1: ( ( ruleAbstractElement ) )
            // InternalDomainmodel.g:1571:2: ( ruleAbstractElement )
            {
            // InternalDomainmodel.g:1571:2: ( ruleAbstractElement )
            // InternalDomainmodel.g:1572:3: ruleAbstractElement
            {
             before(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getDomainmodelAccess().getElementsAbstractElementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Domainmodel__ElementsAssignment"


    // $ANTLR start "rule__PackageDeclaration__NameAssignment_1"
    // InternalDomainmodel.g:1581:1: rule__PackageDeclaration__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__PackageDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1585:1: ( ( ruleQualifiedName ) )
            // InternalDomainmodel.g:1586:2: ( ruleQualifiedName )
            {
            // InternalDomainmodel.g:1586:2: ( ruleQualifiedName )
            // InternalDomainmodel.g:1587:3: ruleQualifiedName
            {
             before(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__NameAssignment_1"


    // $ANTLR start "rule__PackageDeclaration__ElementsAssignment_3"
    // InternalDomainmodel.g:1596:1: rule__PackageDeclaration__ElementsAssignment_3 : ( ruleAbstractElement ) ;
    public final void rule__PackageDeclaration__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1600:1: ( ( ruleAbstractElement ) )
            // InternalDomainmodel.g:1601:2: ( ruleAbstractElement )
            {
            // InternalDomainmodel.g:1601:2: ( ruleAbstractElement )
            // InternalDomainmodel.g:1602:3: ruleAbstractElement
            {
             before(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getPackageDeclarationAccess().getElementsAbstractElementParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__PackageDeclaration__ElementsAssignment_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalDomainmodel.g:1611:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1615:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalDomainmodel.g:1616:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalDomainmodel.g:1616:2: ( ruleQualifiedNameWithWildcard )
            // InternalDomainmodel.g:1617:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__DataType__NameAssignment_1"
    // InternalDomainmodel.g:1626:1: rule__DataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1630:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1631:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1631:2: ( RULE_ID )
            // InternalDomainmodel.g:1632:3: RULE_ID
            {
             before(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__DataType__NameAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalDomainmodel.g:1641:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1645:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1646:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1646:2: ( RULE_ID )
            // InternalDomainmodel.g:1647:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // InternalDomainmodel.g:1656:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1660:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDomainmodel.g:1661:2: ( ( ruleQualifiedName ) )
            {
            // InternalDomainmodel.g:1661:2: ( ( ruleQualifiedName ) )
            // InternalDomainmodel.g:1662:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            // InternalDomainmodel.g:1663:3: ( ruleQualifiedName )
            // InternalDomainmodel.g:1664:4: ruleQualifiedName
            {
             before(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSuperTypeEntityQualifiedNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 

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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_4"
    // InternalDomainmodel.g:1675:1: rule__Entity__FeaturesAssignment_4 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1679:1: ( ( ruleFeature ) )
            // InternalDomainmodel.g:1680:2: ( ruleFeature )
            {
            // InternalDomainmodel.g:1680:2: ( ruleFeature )
            // InternalDomainmodel.g:1681:3: ruleFeature
            {
             before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Entity__FeaturesAssignment_4"


    // $ANTLR start "rule__Entity__MethodsAssignment_5"
    // InternalDomainmodel.g:1690:1: rule__Entity__MethodsAssignment_5 : ( ruleMethod ) ;
    public final void rule__Entity__MethodsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1694:1: ( ( ruleMethod ) )
            // InternalDomainmodel.g:1695:2: ( ruleMethod )
            {
            // InternalDomainmodel.g:1695:2: ( ruleMethod )
            // InternalDomainmodel.g:1696:3: ruleMethod
            {
             before(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMethod();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getMethodsMethodParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Entity__MethodsAssignment_5"


    // $ANTLR start "rule__Feature__ManyAssignment_0"
    // InternalDomainmodel.g:1705:1: rule__Feature__ManyAssignment_0 : ( ( 'many' ) ) ;
    public final void rule__Feature__ManyAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1709:1: ( ( ( 'many' ) ) )
            // InternalDomainmodel.g:1710:2: ( ( 'many' ) )
            {
            // InternalDomainmodel.g:1710:2: ( ( 'many' ) )
            // InternalDomainmodel.g:1711:3: ( 'many' )
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            // InternalDomainmodel.g:1712:3: ( 'many' )
            // InternalDomainmodel.g:1713:4: 'many'
            {
             before(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureAccess().getManyManyKeyword_0_0()); 

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
    // $ANTLR end "rule__Feature__ManyAssignment_0"


    // $ANTLR start "rule__Feature__NameAssignment_1"
    // InternalDomainmodel.g:1724:1: rule__Feature__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Feature__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1728:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1729:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1729:2: ( RULE_ID )
            // InternalDomainmodel.g:1730:3: RULE_ID
            {
             before(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Feature__NameAssignment_1"


    // $ANTLR start "rule__Feature__TypeAssignment_3"
    // InternalDomainmodel.g:1739:1: rule__Feature__TypeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Feature__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1743:1: ( ( ( ruleQualifiedName ) ) )
            // InternalDomainmodel.g:1744:2: ( ( ruleQualifiedName ) )
            {
            // InternalDomainmodel.g:1744:2: ( ( ruleQualifiedName ) )
            // InternalDomainmodel.g:1745:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 
            // InternalDomainmodel.g:1746:3: ( ruleQualifiedName )
            // InternalDomainmodel.g:1747:4: ruleQualifiedName
            {
             before(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getTypeTypeQualifiedNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFeatureAccess().getTypeTypeCrossReference_3_0()); 

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
    // $ANTLR end "rule__Feature__TypeAssignment_3"


    // $ANTLR start "rule__Feature__ValueAssignment_4_1"
    // InternalDomainmodel.g:1758:1: rule__Feature__ValueAssignment_4_1 : ( ruleValue ) ;
    public final void rule__Feature__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1762:1: ( ( ruleValue ) )
            // InternalDomainmodel.g:1763:2: ( ruleValue )
            {
            // InternalDomainmodel.g:1763:2: ( ruleValue )
            // InternalDomainmodel.g:1764:3: ruleValue
            {
             before(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFeatureAccess().getValueValueParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Feature__ValueAssignment_4_1"


    // $ANTLR start "rule__Method__NameAssignment_1"
    // InternalDomainmodel.g:1773:1: rule__Method__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Method__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1777:1: ( ( RULE_ID ) )
            // InternalDomainmodel.g:1778:2: ( RULE_ID )
            {
            // InternalDomainmodel.g:1778:2: ( RULE_ID )
            // InternalDomainmodel.g:1779:3: RULE_ID
            {
             before(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Method__NameAssignment_1"


    // $ANTLR start "rule__Method__BodyAssignment_3"
    // InternalDomainmodel.g:1788:1: rule__Method__BodyAssignment_3 : ( ruleMethodBody ) ;
    public final void rule__Method__BodyAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomainmodel.g:1792:1: ( ( ruleMethodBody ) )
            // InternalDomainmodel.g:1793:2: ( ruleMethodBody )
            {
            // InternalDomainmodel.g:1793:2: ( ruleMethodBody )
            // InternalDomainmodel.g:1794:3: ruleMethodBody
            {
             before(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMethodBody();

            state._fsp--;

             after(grammarAccess.getMethodAccess().getBodyMethodBodyParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Method__BodyAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000D100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000D500000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000C0400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000FF010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000000000FF012L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000002000L});

}