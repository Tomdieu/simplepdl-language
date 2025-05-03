package simplepdl.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import simplepdl.xtext.services.SimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'description'", "'}'", "'workdefinition'", "'assignedTo'", "','", "'requiredMaterial'", "'linksToPredecessor'", "'['", "'type'", "'='", "']'", "'linksToSuccessor'", "'worksequence'", "'predecessor'", "'successor'", "'material'", "'quantity'", "'human'", "'email'", "'role'", "'unit'", "'startToStart'", "'finishToStart'", "'startToFinish'", "'finishToFinish'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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


        public InternalSimplePDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplePDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplePDLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSimplePDL.g"; }



     	private SimplePDLGrammarAccess grammarAccess;

        public InternalSimplePDLParser(TokenStream input, SimplePDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected SimplePDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalSimplePDL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalSimplePDL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalSimplePDL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalSimplePDL.g:72:1: ruleModel returns [EObject current=null] : ( (lv_processes_0_0= ruleProcess ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_processes_0_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:78:2: ( ( (lv_processes_0_0= ruleProcess ) )* )
            // InternalSimplePDL.g:79:2: ( (lv_processes_0_0= ruleProcess ) )*
            {
            // InternalSimplePDL.g:79:2: ( (lv_processes_0_0= ruleProcess ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSimplePDL.g:80:3: (lv_processes_0_0= ruleProcess )
            	    {
            	    // InternalSimplePDL.g:80:3: (lv_processes_0_0= ruleProcess )
            	    // InternalSimplePDL.g:81:4: lv_processes_0_0= ruleProcess
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getProcessesProcessParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_processes_0_0=ruleProcess();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"processes",
            	    					lv_processes_0_0,
            	    					"simplepdl.xtext.SimplePDL.Process");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleProcess"
    // InternalSimplePDL.g:101:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // InternalSimplePDL.g:101:48: (iv_ruleProcess= ruleProcess EOF )
            // InternalSimplePDL.g:102:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // InternalSimplePDL.g:108:1: ruleProcess returns [EObject current=null] : (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_workdefinitions_5_0= ruleWorkDefinition ) )* ( (lv_worksequences_6_0= ruleWorkSequence ) )* ( (lv_resources_7_0= ruleResource ) )* otherlv_8= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_8=null;
        EObject lv_workdefinitions_5_0 = null;

        EObject lv_worksequences_6_0 = null;

        EObject lv_resources_7_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:114:2: ( (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_workdefinitions_5_0= ruleWorkDefinition ) )* ( (lv_worksequences_6_0= ruleWorkSequence ) )* ( (lv_resources_7_0= ruleResource ) )* otherlv_8= '}' ) )
            // InternalSimplePDL.g:115:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_workdefinitions_5_0= ruleWorkDefinition ) )* ( (lv_worksequences_6_0= ruleWorkSequence ) )* ( (lv_resources_7_0= ruleResource ) )* otherlv_8= '}' )
            {
            // InternalSimplePDL.g:115:2: (otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_workdefinitions_5_0= ruleWorkDefinition ) )* ( (lv_worksequences_6_0= ruleWorkSequence ) )* ( (lv_resources_7_0= ruleResource ) )* otherlv_8= '}' )
            // InternalSimplePDL.g:116:3: otherlv_0= 'process' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? ( (lv_workdefinitions_5_0= ruleWorkDefinition ) )* ( (lv_worksequences_6_0= ruleWorkSequence ) )* ( (lv_resources_7_0= ruleResource ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAccess().getProcessKeyword_0());
            		
            // InternalSimplePDL.g:120:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDL.g:121:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDL.g:121:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDL.g:122:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProcessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplePDL.g:142:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSimplePDL.g:143:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalSimplePDL.g:147:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalSimplePDL.g:148:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalSimplePDL.g:148:5: (lv_description_4_0= RULE_STRING )
                    // InternalSimplePDL.g:149:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getProcessRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSimplePDL.g:166:3: ( (lv_workdefinitions_5_0= ruleWorkDefinition ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSimplePDL.g:167:4: (lv_workdefinitions_5_0= ruleWorkDefinition )
            	    {
            	    // InternalSimplePDL.g:167:4: (lv_workdefinitions_5_0= ruleWorkDefinition )
            	    // InternalSimplePDL.g:168:5: lv_workdefinitions_5_0= ruleWorkDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getWorkdefinitionsWorkDefinitionParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_workdefinitions_5_0=ruleWorkDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"workdefinitions",
            	    						lv_workdefinitions_5_0,
            	    						"simplepdl.xtext.SimplePDL.WorkDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalSimplePDL.g:185:3: ( (lv_worksequences_6_0= ruleWorkSequence ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==25) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalSimplePDL.g:186:4: (lv_worksequences_6_0= ruleWorkSequence )
            	    {
            	    // InternalSimplePDL.g:186:4: (lv_worksequences_6_0= ruleWorkSequence )
            	    // InternalSimplePDL.g:187:5: lv_worksequences_6_0= ruleWorkSequence
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getWorksequencesWorkSequenceParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_worksequences_6_0=ruleWorkSequence();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"worksequences",
            	    						lv_worksequences_6_0,
            	    						"simplepdl.xtext.SimplePDL.WorkSequence");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalSimplePDL.g:204:3: ( (lv_resources_7_0= ruleResource ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28||LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSimplePDL.g:205:4: (lv_resources_7_0= ruleResource )
            	    {
            	    // InternalSimplePDL.g:205:4: (lv_resources_7_0= ruleResource )
            	    // InternalSimplePDL.g:206:5: lv_resources_7_0= ruleResource
            	    {

            	    					newCompositeNode(grammarAccess.getProcessAccess().getResourcesResourceParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_resources_7_0=ruleResource();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProcessRule());
            	    					}
            	    					add(
            	    						current,
            	    						"resources",
            	    						lv_resources_7_0,
            	    						"simplepdl.xtext.SimplePDL.Resource");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_8=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleWorkDefinition"
    // InternalSimplePDL.g:231:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // InternalSimplePDL.g:231:55: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // InternalSimplePDL.g:232:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // InternalSimplePDL.g:238:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'workdefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'assignedTo' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'requiredMaterial' ( (lv_requiredMaterials_10_0= ruleRequiredMaterial ) ) )* (otherlv_11= 'linksToPredecessor' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '[' otherlv_16= 'type' otherlv_17= '=' ( (lv_predType_18_0= ruleWorkSequenceType ) ) otherlv_19= ']' )? (otherlv_20= 'linksToSuccessor' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= '[' otherlv_25= 'type' otherlv_26= '=' ( (lv_succType_27_0= ruleWorkSequenceType ) ) otherlv_28= ']' )? otherlv_29= '}' ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        EObject lv_requiredMaterials_10_0 = null;

        Enumerator lv_predType_18_0 = null;

        Enumerator lv_succType_27_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:244:2: ( (otherlv_0= 'workdefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'assignedTo' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'requiredMaterial' ( (lv_requiredMaterials_10_0= ruleRequiredMaterial ) ) )* (otherlv_11= 'linksToPredecessor' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '[' otherlv_16= 'type' otherlv_17= '=' ( (lv_predType_18_0= ruleWorkSequenceType ) ) otherlv_19= ']' )? (otherlv_20= 'linksToSuccessor' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= '[' otherlv_25= 'type' otherlv_26= '=' ( (lv_succType_27_0= ruleWorkSequenceType ) ) otherlv_28= ']' )? otherlv_29= '}' ) )
            // InternalSimplePDL.g:245:2: (otherlv_0= 'workdefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'assignedTo' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'requiredMaterial' ( (lv_requiredMaterials_10_0= ruleRequiredMaterial ) ) )* (otherlv_11= 'linksToPredecessor' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '[' otherlv_16= 'type' otherlv_17= '=' ( (lv_predType_18_0= ruleWorkSequenceType ) ) otherlv_19= ']' )? (otherlv_20= 'linksToSuccessor' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= '[' otherlv_25= 'type' otherlv_26= '=' ( (lv_succType_27_0= ruleWorkSequenceType ) ) otherlv_28= ']' )? otherlv_29= '}' )
            {
            // InternalSimplePDL.g:245:2: (otherlv_0= 'workdefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'assignedTo' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'requiredMaterial' ( (lv_requiredMaterials_10_0= ruleRequiredMaterial ) ) )* (otherlv_11= 'linksToPredecessor' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '[' otherlv_16= 'type' otherlv_17= '=' ( (lv_predType_18_0= ruleWorkSequenceType ) ) otherlv_19= ']' )? (otherlv_20= 'linksToSuccessor' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= '[' otherlv_25= 'type' otherlv_26= '=' ( (lv_succType_27_0= ruleWorkSequenceType ) ) otherlv_28= ']' )? otherlv_29= '}' )
            // InternalSimplePDL.g:246:3: otherlv_0= 'workdefinition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )? otherlv_5= 'assignedTo' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* (otherlv_9= 'requiredMaterial' ( (lv_requiredMaterials_10_0= ruleRequiredMaterial ) ) )* (otherlv_11= 'linksToPredecessor' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '[' otherlv_16= 'type' otherlv_17= '=' ( (lv_predType_18_0= ruleWorkSequenceType ) ) otherlv_19= ']' )? (otherlv_20= 'linksToSuccessor' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= '[' otherlv_25= 'type' otherlv_26= '=' ( (lv_succType_27_0= ruleWorkSequenceType ) ) otherlv_28= ']' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWorkdefinitionKeyword_0());
            		
            // InternalSimplePDL.g:250:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDL.g:251:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDL.g:251:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDL.g:252:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkDefinitionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSimplePDL.g:272:3: (otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalSimplePDL.g:273:4: otherlv_3= 'description' ( (lv_description_4_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getWorkDefinitionAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalSimplePDL.g:277:4: ( (lv_description_4_0= RULE_STRING ) )
                    // InternalSimplePDL.g:278:5: (lv_description_4_0= RULE_STRING )
                    {
                    // InternalSimplePDL.g:278:5: (lv_description_4_0= RULE_STRING )
                    // InternalSimplePDL.g:279:6: lv_description_4_0= RULE_STRING
                    {
                    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_description_4_0, grammarAccess.getWorkDefinitionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"description",
                    							lv_description_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getWorkDefinitionAccess().getAssignedToKeyword_4());
            		
            // InternalSimplePDL.g:300:3: ( (otherlv_6= RULE_ID ) )
            // InternalSimplePDL.g:301:4: (otherlv_6= RULE_ID )
            {
            // InternalSimplePDL.g:301:4: (otherlv_6= RULE_ID )
            // InternalSimplePDL.g:302:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkDefinitionRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_6, grammarAccess.getWorkDefinitionAccess().getAssignedToHumanCrossReference_5_0());
            				

            }


            }

            // InternalSimplePDL.g:313:3: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSimplePDL.g:314:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    {
            	    otherlv_7=(Token)match(input,17,FOLLOW_4); 

            	    				newLeafNode(otherlv_7, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalSimplePDL.g:318:4: ( (otherlv_8= RULE_ID ) )
            	    // InternalSimplePDL.g:319:5: (otherlv_8= RULE_ID )
            	    {
            	    // InternalSimplePDL.g:319:5: (otherlv_8= RULE_ID )
            	    // InternalSimplePDL.g:320:6: otherlv_8= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
            	    						}
            	    					
            	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_13); 

            	    						newLeafNode(otherlv_8, grammarAccess.getWorkDefinitionAccess().getAssignedToHumanCrossReference_6_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalSimplePDL.g:332:3: (otherlv_9= 'requiredMaterial' ( (lv_requiredMaterials_10_0= ruleRequiredMaterial ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSimplePDL.g:333:4: otherlv_9= 'requiredMaterial' ( (lv_requiredMaterials_10_0= ruleRequiredMaterial ) )
            	    {
            	    otherlv_9=(Token)match(input,18,FOLLOW_14); 

            	    				newLeafNode(otherlv_9, grammarAccess.getWorkDefinitionAccess().getRequiredMaterialKeyword_7_0());
            	    			
            	    // InternalSimplePDL.g:337:4: ( (lv_requiredMaterials_10_0= ruleRequiredMaterial ) )
            	    // InternalSimplePDL.g:338:5: (lv_requiredMaterials_10_0= ruleRequiredMaterial )
            	    {
            	    // InternalSimplePDL.g:338:5: (lv_requiredMaterials_10_0= ruleRequiredMaterial )
            	    // InternalSimplePDL.g:339:6: lv_requiredMaterials_10_0= ruleRequiredMaterial
            	    {

            	    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getRequiredMaterialsRequiredMaterialParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_requiredMaterials_10_0=ruleRequiredMaterial();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"requiredMaterials",
            	    							lv_requiredMaterials_10_0,
            	    							"simplepdl.xtext.SimplePDL.RequiredMaterial");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalSimplePDL.g:357:3: (otherlv_11= 'linksToPredecessor' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '[' otherlv_16= 'type' otherlv_17= '=' ( (lv_predType_18_0= ruleWorkSequenceType ) ) otherlv_19= ']' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSimplePDL.g:358:4: otherlv_11= 'linksToPredecessor' ( (otherlv_12= RULE_ID ) ) (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )* otherlv_15= '[' otherlv_16= 'type' otherlv_17= '=' ( (lv_predType_18_0= ruleWorkSequenceType ) ) otherlv_19= ']'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_11, grammarAccess.getWorkDefinitionAccess().getLinksToPredecessorKeyword_8_0());
                    			
                    // InternalSimplePDL.g:362:4: ( (otherlv_12= RULE_ID ) )
                    // InternalSimplePDL.g:363:5: (otherlv_12= RULE_ID )
                    {
                    // InternalSimplePDL.g:363:5: (otherlv_12= RULE_ID )
                    // InternalSimplePDL.g:364:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_12, grammarAccess.getWorkDefinitionAccess().getPredecessorWorkDefinitionCrossReference_8_1_0());
                    					

                    }


                    }

                    // InternalSimplePDL.g:375:4: (otherlv_13= ',' ( (otherlv_14= RULE_ID ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==17) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalSimplePDL.g:376:5: otherlv_13= ',' ( (otherlv_14= RULE_ID ) )
                    	    {
                    	    otherlv_13=(Token)match(input,17,FOLLOW_4); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_8_2_0());
                    	    				
                    	    // InternalSimplePDL.g:380:5: ( (otherlv_14= RULE_ID ) )
                    	    // InternalSimplePDL.g:381:6: (otherlv_14= RULE_ID )
                    	    {
                    	    // InternalSimplePDL.g:381:6: (otherlv_14= RULE_ID )
                    	    // InternalSimplePDL.g:382:7: otherlv_14= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    							newLeafNode(otherlv_14, grammarAccess.getWorkDefinitionAccess().getPredecessorWorkDefinitionCrossReference_8_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_15, grammarAccess.getWorkDefinitionAccess().getLeftSquareBracketKeyword_8_3());
                    			
                    otherlv_16=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_16, grammarAccess.getWorkDefinitionAccess().getTypeKeyword_8_4());
                    			
                    otherlv_17=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_17, grammarAccess.getWorkDefinitionAccess().getEqualsSignKeyword_8_5());
                    			
                    // InternalSimplePDL.g:406:4: ( (lv_predType_18_0= ruleWorkSequenceType ) )
                    // InternalSimplePDL.g:407:5: (lv_predType_18_0= ruleWorkSequenceType )
                    {
                    // InternalSimplePDL.g:407:5: (lv_predType_18_0= ruleWorkSequenceType )
                    // InternalSimplePDL.g:408:6: lv_predType_18_0= ruleWorkSequenceType
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getPredTypeWorkSequenceTypeEnumRuleCall_8_6_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_predType_18_0=ruleWorkSequenceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"predType",
                    							lv_predType_18_0,
                    							"simplepdl.xtext.SimplePDL.WorkSequenceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_19=(Token)match(input,23,FOLLOW_21); 

                    				newLeafNode(otherlv_19, grammarAccess.getWorkDefinitionAccess().getRightSquareBracketKeyword_8_7());
                    			

                    }
                    break;

            }

            // InternalSimplePDL.g:430:3: (otherlv_20= 'linksToSuccessor' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= '[' otherlv_25= 'type' otherlv_26= '=' ( (lv_succType_27_0= ruleWorkSequenceType ) ) otherlv_28= ']' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSimplePDL.g:431:4: otherlv_20= 'linksToSuccessor' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= '[' otherlv_25= 'type' otherlv_26= '=' ( (lv_succType_27_0= ruleWorkSequenceType ) ) otherlv_28= ']'
                    {
                    otherlv_20=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_20, grammarAccess.getWorkDefinitionAccess().getLinksToSuccessorKeyword_9_0());
                    			
                    // InternalSimplePDL.g:435:4: ( (otherlv_21= RULE_ID ) )
                    // InternalSimplePDL.g:436:5: (otherlv_21= RULE_ID )
                    {
                    // InternalSimplePDL.g:436:5: (otherlv_21= RULE_ID )
                    // InternalSimplePDL.g:437:6: otherlv_21= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    						}
                    					
                    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_21, grammarAccess.getWorkDefinitionAccess().getSuccessorWorkDefinitionCrossReference_9_1_0());
                    					

                    }


                    }

                    // InternalSimplePDL.g:448:4: (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==17) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalSimplePDL.g:449:5: otherlv_22= ',' ( (otherlv_23= RULE_ID ) )
                    	    {
                    	    otherlv_22=(Token)match(input,17,FOLLOW_4); 

                    	    					newLeafNode(otherlv_22, grammarAccess.getWorkDefinitionAccess().getCommaKeyword_9_2_0());
                    	    				
                    	    // InternalSimplePDL.g:453:5: ( (otherlv_23= RULE_ID ) )
                    	    // InternalSimplePDL.g:454:6: (otherlv_23= RULE_ID )
                    	    {
                    	    // InternalSimplePDL.g:454:6: (otherlv_23= RULE_ID )
                    	    // InternalSimplePDL.g:455:7: otherlv_23= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getWorkDefinitionRule());
                    	    							}
                    	    						
                    	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_16); 

                    	    							newLeafNode(otherlv_23, grammarAccess.getWorkDefinitionAccess().getSuccessorWorkDefinitionCrossReference_9_2_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,20,FOLLOW_17); 

                    				newLeafNode(otherlv_24, grammarAccess.getWorkDefinitionAccess().getLeftSquareBracketKeyword_9_3());
                    			
                    otherlv_25=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_25, grammarAccess.getWorkDefinitionAccess().getTypeKeyword_9_4());
                    			
                    otherlv_26=(Token)match(input,22,FOLLOW_19); 

                    				newLeafNode(otherlv_26, grammarAccess.getWorkDefinitionAccess().getEqualsSignKeyword_9_5());
                    			
                    // InternalSimplePDL.g:479:4: ( (lv_succType_27_0= ruleWorkSequenceType ) )
                    // InternalSimplePDL.g:480:5: (lv_succType_27_0= ruleWorkSequenceType )
                    {
                    // InternalSimplePDL.g:480:5: (lv_succType_27_0= ruleWorkSequenceType )
                    // InternalSimplePDL.g:481:6: lv_succType_27_0= ruleWorkSequenceType
                    {

                    						newCompositeNode(grammarAccess.getWorkDefinitionAccess().getSuccTypeWorkSequenceTypeEnumRuleCall_9_6_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_succType_27_0=ruleWorkSequenceType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"succType",
                    							lv_succType_27_0,
                    							"simplepdl.xtext.SimplePDL.WorkSequenceType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_28=(Token)match(input,23,FOLLOW_22); 

                    				newLeafNode(otherlv_28, grammarAccess.getWorkDefinitionAccess().getRightSquareBracketKeyword_9_7());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getWorkDefinitionAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // InternalSimplePDL.g:511:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // InternalSimplePDL.g:511:53: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // InternalSimplePDL.g:512:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // InternalSimplePDL.g:518:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'worksequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'predecessor' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'successor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleWorkSequenceType ) ) otherlv_9= '}' ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_type_8_0 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:524:2: ( (otherlv_0= 'worksequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'predecessor' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'successor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleWorkSequenceType ) ) otherlv_9= '}' ) )
            // InternalSimplePDL.g:525:2: (otherlv_0= 'worksequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'predecessor' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'successor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleWorkSequenceType ) ) otherlv_9= '}' )
            {
            // InternalSimplePDL.g:525:2: (otherlv_0= 'worksequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'predecessor' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'successor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleWorkSequenceType ) ) otherlv_9= '}' )
            // InternalSimplePDL.g:526:3: otherlv_0= 'worksequence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'predecessor' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'successor' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_type_8_0= ruleWorkSequenceType ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWorksequenceKeyword_0());
            		
            // InternalSimplePDL.g:530:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDL.g:531:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDL.g:531:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDL.g:532:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWorkSequenceAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getWorkSequenceAccess().getPredecessorKeyword_3());
            		
            // InternalSimplePDL.g:556:3: ( (otherlv_4= RULE_ID ) )
            // InternalSimplePDL.g:557:4: (otherlv_4= RULE_ID )
            {
            // InternalSimplePDL.g:557:4: (otherlv_4= RULE_ID )
            // InternalSimplePDL.g:558:5: otherlv_4= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_24); 

            					newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_4_0());
            				

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getWorkSequenceAccess().getSuccessorKeyword_5());
            		
            // InternalSimplePDL.g:573:3: ( (otherlv_6= RULE_ID ) )
            // InternalSimplePDL.g:574:4: (otherlv_6= RULE_ID )
            {
            // InternalSimplePDL.g:574:4: (otherlv_6= RULE_ID )
            // InternalSimplePDL.g:575:5: otherlv_6= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWorkSequenceRule());
            					}
            				
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_6, grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_6_0());
            				

            }


            }

            otherlv_7=(Token)match(input,21,FOLLOW_19); 

            			newLeafNode(otherlv_7, grammarAccess.getWorkSequenceAccess().getTypeKeyword_7());
            		
            // InternalSimplePDL.g:590:3: ( (lv_type_8_0= ruleWorkSequenceType ) )
            // InternalSimplePDL.g:591:4: (lv_type_8_0= ruleWorkSequenceType )
            {
            // InternalSimplePDL.g:591:4: (lv_type_8_0= ruleWorkSequenceType )
            // InternalSimplePDL.g:592:5: lv_type_8_0= ruleWorkSequenceType
            {

            					newCompositeNode(grammarAccess.getWorkSequenceAccess().getTypeWorkSequenceTypeEnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_22);
            lv_type_8_0=ruleWorkSequenceType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_8_0,
            						"simplepdl.xtext.SimplePDL.WorkSequenceType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getWorkSequenceAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleRequiredMaterial"
    // InternalSimplePDL.g:617:1: entryRuleRequiredMaterial returns [EObject current=null] : iv_ruleRequiredMaterial= ruleRequiredMaterial EOF ;
    public final EObject entryRuleRequiredMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequiredMaterial = null;


        try {
            // InternalSimplePDL.g:617:57: (iv_ruleRequiredMaterial= ruleRequiredMaterial EOF )
            // InternalSimplePDL.g:618:2: iv_ruleRequiredMaterial= ruleRequiredMaterial EOF
            {
             newCompositeNode(grammarAccess.getRequiredMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequiredMaterial=ruleRequiredMaterial();

            state._fsp--;

             current =iv_ruleRequiredMaterial; 
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
    // $ANTLR end "entryRuleRequiredMaterial"


    // $ANTLR start "ruleRequiredMaterial"
    // InternalSimplePDL.g:624:1: ruleRequiredMaterial returns [EObject current=null] : (otherlv_0= '[' otherlv_1= 'material' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'quantity' otherlv_4= '=' ( (lv_quantity_5_0= RULE_INT ) ) )? otherlv_6= ']' ) ;
    public final EObject ruleRequiredMaterial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_quantity_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:630:2: ( (otherlv_0= '[' otherlv_1= 'material' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'quantity' otherlv_4= '=' ( (lv_quantity_5_0= RULE_INT ) ) )? otherlv_6= ']' ) )
            // InternalSimplePDL.g:631:2: (otherlv_0= '[' otherlv_1= 'material' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'quantity' otherlv_4= '=' ( (lv_quantity_5_0= RULE_INT ) ) )? otherlv_6= ']' )
            {
            // InternalSimplePDL.g:631:2: (otherlv_0= '[' otherlv_1= 'material' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'quantity' otherlv_4= '=' ( (lv_quantity_5_0= RULE_INT ) ) )? otherlv_6= ']' )
            // InternalSimplePDL.g:632:3: otherlv_0= '[' otherlv_1= 'material' ( (otherlv_2= RULE_ID ) ) (otherlv_3= 'quantity' otherlv_4= '=' ( (lv_quantity_5_0= RULE_INT ) ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_0, grammarAccess.getRequiredMaterialAccess().getLeftSquareBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRequiredMaterialAccess().getMaterialKeyword_1());
            		
            // InternalSimplePDL.g:640:3: ( (otherlv_2= RULE_ID ) )
            // InternalSimplePDL.g:641:4: (otherlv_2= RULE_ID )
            {
            // InternalSimplePDL.g:641:4: (otherlv_2= RULE_ID )
            // InternalSimplePDL.g:642:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRequiredMaterialRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_2, grammarAccess.getRequiredMaterialAccess().getMaterialMaterialCrossReference_2_0());
            				

            }


            }

            // InternalSimplePDL.g:653:3: (otherlv_3= 'quantity' otherlv_4= '=' ( (lv_quantity_5_0= RULE_INT ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSimplePDL.g:654:4: otherlv_3= 'quantity' otherlv_4= '=' ( (lv_quantity_5_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,29,FOLLOW_18); 

                    				newLeafNode(otherlv_3, grammarAccess.getRequiredMaterialAccess().getQuantityKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_27); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequiredMaterialAccess().getEqualsSignKeyword_3_1());
                    			
                    // InternalSimplePDL.g:662:4: ( (lv_quantity_5_0= RULE_INT ) )
                    // InternalSimplePDL.g:663:5: (lv_quantity_5_0= RULE_INT )
                    {
                    // InternalSimplePDL.g:663:5: (lv_quantity_5_0= RULE_INT )
                    // InternalSimplePDL.g:664:6: lv_quantity_5_0= RULE_INT
                    {
                    lv_quantity_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_quantity_5_0, grammarAccess.getRequiredMaterialAccess().getQuantityINTTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequiredMaterialRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"quantity",
                    							lv_quantity_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getRequiredMaterialAccess().getRightSquareBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRequiredMaterial"


    // $ANTLR start "entryRuleResource"
    // InternalSimplePDL.g:689:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalSimplePDL.g:689:49: (iv_ruleResource= ruleResource EOF )
            // InternalSimplePDL.g:690:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalSimplePDL.g:696:1: ruleResource returns [EObject current=null] : (this_Human_0= ruleHuman | this_Material_1= ruleMaterial ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        EObject this_Human_0 = null;

        EObject this_Material_1 = null;



        	enterRule();

        try {
            // InternalSimplePDL.g:702:2: ( (this_Human_0= ruleHuman | this_Material_1= ruleMaterial ) )
            // InternalSimplePDL.g:703:2: (this_Human_0= ruleHuman | this_Material_1= ruleMaterial )
            {
            // InternalSimplePDL.g:703:2: (this_Human_0= ruleHuman | this_Material_1= ruleMaterial )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                alt14=1;
            }
            else if ( (LA14_0==28) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalSimplePDL.g:704:3: this_Human_0= ruleHuman
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getHumanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Human_0=ruleHuman();

                    state._fsp--;


                    			current = this_Human_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:713:3: this_Material_1= ruleMaterial
                    {

                    			newCompositeNode(grammarAccess.getResourceAccess().getMaterialParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Material_1=ruleMaterial();

                    state._fsp--;


                    			current = this_Material_1;
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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleHuman"
    // InternalSimplePDL.g:725:1: entryRuleHuman returns [EObject current=null] : iv_ruleHuman= ruleHuman EOF ;
    public final EObject entryRuleHuman() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHuman = null;


        try {
            // InternalSimplePDL.g:725:46: (iv_ruleHuman= ruleHuman EOF )
            // InternalSimplePDL.g:726:2: iv_ruleHuman= ruleHuman EOF
            {
             newCompositeNode(grammarAccess.getHumanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHuman=ruleHuman();

            state._fsp--;

             current =iv_ruleHuman; 
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
    // $ANTLR end "entryRuleHuman"


    // $ANTLR start "ruleHuman"
    // InternalSimplePDL.g:732:1: ruleHuman returns [EObject current=null] : (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'role' ( (lv_role_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleHuman() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_email_4_0=null;
        Token otherlv_5=null;
        Token lv_role_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:738:2: ( (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'role' ( (lv_role_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // InternalSimplePDL.g:739:2: (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'role' ( (lv_role_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // InternalSimplePDL.g:739:2: (otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'role' ( (lv_role_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // InternalSimplePDL.g:740:3: otherlv_0= 'human' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'email' ( (lv_email_4_0= RULE_STRING ) ) otherlv_5= 'role' ( (lv_role_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getHumanAccess().getHumanKeyword_0());
            		
            // InternalSimplePDL.g:744:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDL.g:745:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDL.g:745:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDL.g:746:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getHumanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHumanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getHumanAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getHumanAccess().getEmailKeyword_3());
            		
            // InternalSimplePDL.g:770:3: ( (lv_email_4_0= RULE_STRING ) )
            // InternalSimplePDL.g:771:4: (lv_email_4_0= RULE_STRING )
            {
            // InternalSimplePDL.g:771:4: (lv_email_4_0= RULE_STRING )
            // InternalSimplePDL.g:772:5: lv_email_4_0= RULE_STRING
            {
            lv_email_4_0=(Token)match(input,RULE_STRING,FOLLOW_29); 

            					newLeafNode(lv_email_4_0, grammarAccess.getHumanAccess().getEmailSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHumanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"email",
            						lv_email_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getHumanAccess().getRoleKeyword_5());
            		
            // InternalSimplePDL.g:792:3: ( (lv_role_6_0= RULE_STRING ) )
            // InternalSimplePDL.g:793:4: (lv_role_6_0= RULE_STRING )
            {
            // InternalSimplePDL.g:793:4: (lv_role_6_0= RULE_STRING )
            // InternalSimplePDL.g:794:5: lv_role_6_0= RULE_STRING
            {
            lv_role_6_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_role_6_0, grammarAccess.getHumanAccess().getRoleSTRINGTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHumanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"role",
            						lv_role_6_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getHumanAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleHuman"


    // $ANTLR start "entryRuleMaterial"
    // InternalSimplePDL.g:818:1: entryRuleMaterial returns [EObject current=null] : iv_ruleMaterial= ruleMaterial EOF ;
    public final EObject entryRuleMaterial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaterial = null;


        try {
            // InternalSimplePDL.g:818:49: (iv_ruleMaterial= ruleMaterial EOF )
            // InternalSimplePDL.g:819:2: iv_ruleMaterial= ruleMaterial EOF
            {
             newCompositeNode(grammarAccess.getMaterialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaterial=ruleMaterial();

            state._fsp--;

             current =iv_ruleMaterial; 
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
    // $ANTLR end "entryRuleMaterial"


    // $ANTLR start "ruleMaterial"
    // InternalSimplePDL.g:825:1: ruleMaterial returns [EObject current=null] : (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) otherlv_5= '}' ) ;
    public final EObject ruleMaterial() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_unit_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:831:2: ( (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) otherlv_5= '}' ) )
            // InternalSimplePDL.g:832:2: (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) otherlv_5= '}' )
            {
            // InternalSimplePDL.g:832:2: (otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) otherlv_5= '}' )
            // InternalSimplePDL.g:833:3: otherlv_0= 'material' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'unit' ( (lv_unit_4_0= RULE_STRING ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getMaterialAccess().getMaterialKeyword_0());
            		
            // InternalSimplePDL.g:837:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSimplePDL.g:838:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSimplePDL.g:838:4: (lv_name_1_0= RULE_ID )
            // InternalSimplePDL.g:839:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMaterialAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaterialRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getMaterialAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMaterialAccess().getUnitKeyword_3());
            		
            // InternalSimplePDL.g:863:3: ( (lv_unit_4_0= RULE_STRING ) )
            // InternalSimplePDL.g:864:4: (lv_unit_4_0= RULE_STRING )
            {
            // InternalSimplePDL.g:864:4: (lv_unit_4_0= RULE_STRING )
            // InternalSimplePDL.g:865:5: lv_unit_4_0= RULE_STRING
            {
            lv_unit_4_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_unit_4_0, grammarAccess.getMaterialAccess().getUnitSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMaterialRule());
            					}
            					setWithLastConsumed(
            						current,
            						"unit",
            						lv_unit_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMaterialAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMaterial"


    // $ANTLR start "ruleWorkSequenceType"
    // InternalSimplePDL.g:889:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSimplePDL.g:895:2: ( ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) ) )
            // InternalSimplePDL.g:896:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            {
            // InternalSimplePDL.g:896:2: ( (enumLiteral_0= 'startToStart' ) | (enumLiteral_1= 'finishToStart' ) | (enumLiteral_2= 'startToFinish' ) | (enumLiteral_3= 'finishToFinish' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            case 37:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalSimplePDL.g:897:3: (enumLiteral_0= 'startToStart' )
                    {
                    // InternalSimplePDL.g:897:3: (enumLiteral_0= 'startToStart' )
                    // InternalSimplePDL.g:898:4: enumLiteral_0= 'startToStart'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSimplePDL.g:905:3: (enumLiteral_1= 'finishToStart' )
                    {
                    // InternalSimplePDL.g:905:3: (enumLiteral_1= 'finishToStart' )
                    // InternalSimplePDL.g:906:4: enumLiteral_1= 'finishToStart'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSimplePDL.g:913:3: (enumLiteral_2= 'startToFinish' )
                    {
                    // InternalSimplePDL.g:913:3: (enumLiteral_2= 'startToFinish' )
                    // InternalSimplePDL.g:914:4: enumLiteral_2= 'startToFinish'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSimplePDL.g:921:3: (enumLiteral_3= 'finishToFinish' )
                    {
                    // InternalSimplePDL.g:921:3: (enumLiteral_3= 'finishToFinish' )
                    // InternalSimplePDL.g:922:4: enumLiteral_3= 'finishToFinish'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3());
                    			

                    }


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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000005200E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000005200C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000052004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000050004000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000010E4000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000010C4000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000003C00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020800000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});

}