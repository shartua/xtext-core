package org.eclipse.xtext.parser.antlr.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xtext.parser.antlr.services.GH1462TestLanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/*******************************************************************************
 * Copyright (c) 2010, 2022 itemis AG (http://www.itemis.eu) and others.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
@SuppressWarnings("all")
public class InternalGH1462TestLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'#1'", "'#2'", "'#3'", "'#4'", "'#5'", "'#6'", "'#7'", "'#8'", "'#9'", "'#10'", "'#11'", "'#12'", "'s'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGH1462TestLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGH1462TestLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGH1462TestLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGH1462TestLanguage.g"; }



     	private GH1462TestLanguageGrammarAccess grammarAccess;

        public InternalGH1462TestLanguageParser(TokenStream input, GH1462TestLanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Root";
       	}

       	@Override
       	protected GH1462TestLanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRoot"
    // InternalGH1462TestLanguage.g:69:1: entryRuleRoot returns [EObject current=null] : iv_ruleRoot= ruleRoot EOF ;
    public final EObject entryRuleRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoot = null;


        try {
            // InternalGH1462TestLanguage.g:69:45: (iv_ruleRoot= ruleRoot EOF )
            // InternalGH1462TestLanguage.g:70:2: iv_ruleRoot= ruleRoot EOF
            {
             newCompositeNode(grammarAccess.getRootRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoot=ruleRoot();

            state._fsp--;

             current =iv_ruleRoot; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoot"


    // $ANTLR start "ruleRoot"
    // InternalGH1462TestLanguage.g:76:1: ruleRoot returns [EObject current=null] : ( (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) ) | (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) ) | (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) ) | (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) ) | (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) ) | (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) ) | (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) ) | (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) ) | (otherlv_22= '#12' ( (lv_element_23_0= ruleRule12 ) ) ) ) ;
    public final EObject ruleRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_element_1_0 = null;

        EObject lv_element_3_0 = null;

        EObject lv_element_5_0 = null;

        EObject lv_element_7_0 = null;

        EObject lv_element_9_0 = null;

        EObject lv_element_11_0 = null;

        EObject lv_element_13_0 = null;

        EObject lv_element_15_0 = null;

        EObject lv_element_17_0 = null;

        EObject lv_element_19_0 = null;

        EObject lv_element_21_0 = null;

        EObject lv_element_23_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:82:2: ( ( (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) ) | (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) ) | (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) ) | (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) ) | (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) ) | (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) ) | (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) ) | (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) ) | (otherlv_22= '#12' ( (lv_element_23_0= ruleRule12 ) ) ) ) )
            // InternalGH1462TestLanguage.g:83:2: ( (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) ) | (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) ) | (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) ) | (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) ) | (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) ) | (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) ) | (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) ) | (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) ) | (otherlv_22= '#12' ( (lv_element_23_0= ruleRule12 ) ) ) )
            {
            // InternalGH1462TestLanguage.g:83:2: ( (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) ) | (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) ) | (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) ) | (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) ) | (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) ) | (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) ) | (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) ) | (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) ) | (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) ) | (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) ) | (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) ) | (otherlv_22= '#12' ( (lv_element_23_0= ruleRule12 ) ) ) )
            int alt1=12;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 14:
                {
                alt1=4;
                }
                break;
            case 15:
                {
                alt1=5;
                }
                break;
            case 16:
                {
                alt1=6;
                }
                break;
            case 17:
                {
                alt1=7;
                }
                break;
            case 18:
                {
                alt1=8;
                }
                break;
            case 19:
                {
                alt1=9;
                }
                break;
            case 20:
                {
                alt1=10;
                }
                break;
            case 21:
                {
                alt1=11;
                }
                break;
            case 22:
                {
                alt1=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalGH1462TestLanguage.g:84:3: (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:84:3: (otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) ) )
                    // InternalGH1462TestLanguage.g:85:4: otherlv_0= '#1' ( (lv_element_1_0= ruleRule1 ) )
                    {
                    otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getRootAccess().getNumberSignDigitOneKeyword_0_0());
                    			
                    // InternalGH1462TestLanguage.g:89:4: ( (lv_element_1_0= ruleRule1 ) )
                    // InternalGH1462TestLanguage.g:90:5: (lv_element_1_0= ruleRule1 )
                    {
                    // InternalGH1462TestLanguage.g:90:5: (lv_element_1_0= ruleRule1 )
                    // InternalGH1462TestLanguage.g:91:6: lv_element_1_0= ruleRule1
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule1ParserRuleCall_0_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_1_0=ruleRule1();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_1_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule1");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalGH1462TestLanguage.g:110:3: (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:110:3: (otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) ) )
                    // InternalGH1462TestLanguage.g:111:4: otherlv_2= '#2' ( (lv_element_3_0= ruleRule2 ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getRootAccess().getNumberSignDigitTwoKeyword_1_0());
                    			
                    // InternalGH1462TestLanguage.g:115:4: ( (lv_element_3_0= ruleRule2 ) )
                    // InternalGH1462TestLanguage.g:116:5: (lv_element_3_0= ruleRule2 )
                    {
                    // InternalGH1462TestLanguage.g:116:5: (lv_element_3_0= ruleRule2 )
                    // InternalGH1462TestLanguage.g:117:6: lv_element_3_0= ruleRule2
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule2ParserRuleCall_1_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_3_0=ruleRule2();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_3_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule2");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalGH1462TestLanguage.g:136:3: (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:136:3: (otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) ) )
                    // InternalGH1462TestLanguage.g:137:4: otherlv_4= '#3' ( (lv_element_5_0= ruleRule3 ) )
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getRootAccess().getNumberSignDigitThreeKeyword_2_0());
                    			
                    // InternalGH1462TestLanguage.g:141:4: ( (lv_element_5_0= ruleRule3 ) )
                    // InternalGH1462TestLanguage.g:142:5: (lv_element_5_0= ruleRule3 )
                    {
                    // InternalGH1462TestLanguage.g:142:5: (lv_element_5_0= ruleRule3 )
                    // InternalGH1462TestLanguage.g:143:6: lv_element_5_0= ruleRule3
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule3ParserRuleCall_2_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_5_0=ruleRule3();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_5_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule3");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalGH1462TestLanguage.g:162:3: (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:162:3: (otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) ) )
                    // InternalGH1462TestLanguage.g:163:4: otherlv_6= '#4' ( (lv_element_7_0= ruleRule4 ) )
                    {
                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRootAccess().getNumberSignDigitFourKeyword_3_0());
                    			
                    // InternalGH1462TestLanguage.g:167:4: ( (lv_element_7_0= ruleRule4 ) )
                    // InternalGH1462TestLanguage.g:168:5: (lv_element_7_0= ruleRule4 )
                    {
                    // InternalGH1462TestLanguage.g:168:5: (lv_element_7_0= ruleRule4 )
                    // InternalGH1462TestLanguage.g:169:6: lv_element_7_0= ruleRule4
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule4ParserRuleCall_3_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_7_0=ruleRule4();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_7_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule4");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalGH1462TestLanguage.g:188:3: (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:188:3: (otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) ) )
                    // InternalGH1462TestLanguage.g:189:4: otherlv_8= '#5' ( (lv_element_9_0= ruleRule5 ) )
                    {
                    otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRootAccess().getNumberSignDigitFiveKeyword_4_0());
                    			
                    // InternalGH1462TestLanguage.g:193:4: ( (lv_element_9_0= ruleRule5 ) )
                    // InternalGH1462TestLanguage.g:194:5: (lv_element_9_0= ruleRule5 )
                    {
                    // InternalGH1462TestLanguage.g:194:5: (lv_element_9_0= ruleRule5 )
                    // InternalGH1462TestLanguage.g:195:6: lv_element_9_0= ruleRule5
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule5ParserRuleCall_4_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_9_0=ruleRule5();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_9_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule5");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalGH1462TestLanguage.g:214:3: (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:214:3: (otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) ) )
                    // InternalGH1462TestLanguage.g:215:4: otherlv_10= '#6' ( (lv_element_11_0= ruleRule6 ) )
                    {
                    otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getRootAccess().getNumberSignDigitSixKeyword_5_0());
                    			
                    // InternalGH1462TestLanguage.g:219:4: ( (lv_element_11_0= ruleRule6 ) )
                    // InternalGH1462TestLanguage.g:220:5: (lv_element_11_0= ruleRule6 )
                    {
                    // InternalGH1462TestLanguage.g:220:5: (lv_element_11_0= ruleRule6 )
                    // InternalGH1462TestLanguage.g:221:6: lv_element_11_0= ruleRule6
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule6ParserRuleCall_5_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_11_0=ruleRule6();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_11_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule6");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalGH1462TestLanguage.g:240:3: (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:240:3: (otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) ) )
                    // InternalGH1462TestLanguage.g:241:4: otherlv_12= '#7' ( (lv_element_13_0= ruleRule7 ) )
                    {
                    otherlv_12=(Token)match(input,17,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRootAccess().getNumberSignDigitSevenKeyword_6_0());
                    			
                    // InternalGH1462TestLanguage.g:245:4: ( (lv_element_13_0= ruleRule7 ) )
                    // InternalGH1462TestLanguage.g:246:5: (lv_element_13_0= ruleRule7 )
                    {
                    // InternalGH1462TestLanguage.g:246:5: (lv_element_13_0= ruleRule7 )
                    // InternalGH1462TestLanguage.g:247:6: lv_element_13_0= ruleRule7
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule7ParserRuleCall_6_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_13_0=ruleRule7();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_13_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule7");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalGH1462TestLanguage.g:266:3: (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:266:3: (otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) ) )
                    // InternalGH1462TestLanguage.g:267:4: otherlv_14= '#8' ( (lv_element_15_0= ruleRule8 ) )
                    {
                    otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getRootAccess().getNumberSignDigitEightKeyword_7_0());
                    			
                    // InternalGH1462TestLanguage.g:271:4: ( (lv_element_15_0= ruleRule8 ) )
                    // InternalGH1462TestLanguage.g:272:5: (lv_element_15_0= ruleRule8 )
                    {
                    // InternalGH1462TestLanguage.g:272:5: (lv_element_15_0= ruleRule8 )
                    // InternalGH1462TestLanguage.g:273:6: lv_element_15_0= ruleRule8
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule8ParserRuleCall_7_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_15_0=ruleRule8();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_15_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule8");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalGH1462TestLanguage.g:292:3: (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:292:3: (otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) ) )
                    // InternalGH1462TestLanguage.g:293:4: otherlv_16= '#9' ( (lv_element_17_0= ruleRule9 ) )
                    {
                    otherlv_16=(Token)match(input,19,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getRootAccess().getNumberSignDigitNineKeyword_8_0());
                    			
                    // InternalGH1462TestLanguage.g:297:4: ( (lv_element_17_0= ruleRule9 ) )
                    // InternalGH1462TestLanguage.g:298:5: (lv_element_17_0= ruleRule9 )
                    {
                    // InternalGH1462TestLanguage.g:298:5: (lv_element_17_0= ruleRule9 )
                    // InternalGH1462TestLanguage.g:299:6: lv_element_17_0= ruleRule9
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule9ParserRuleCall_8_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_17_0=ruleRule9();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_17_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule9");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalGH1462TestLanguage.g:318:3: (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:318:3: (otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) ) )
                    // InternalGH1462TestLanguage.g:319:4: otherlv_18= '#10' ( (lv_element_19_0= ruleRule10 ) )
                    {
                    otherlv_18=(Token)match(input,20,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_18, grammarAccess.getRootAccess().getNumberSignDigitOneDigitZeroKeyword_9_0());
                    			
                    // InternalGH1462TestLanguage.g:323:4: ( (lv_element_19_0= ruleRule10 ) )
                    // InternalGH1462TestLanguage.g:324:5: (lv_element_19_0= ruleRule10 )
                    {
                    // InternalGH1462TestLanguage.g:324:5: (lv_element_19_0= ruleRule10 )
                    // InternalGH1462TestLanguage.g:325:6: lv_element_19_0= ruleRule10
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule10ParserRuleCall_9_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_19_0=ruleRule10();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_19_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule10");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalGH1462TestLanguage.g:344:3: (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:344:3: (otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) ) )
                    // InternalGH1462TestLanguage.g:345:4: otherlv_20= '#11' ( (lv_element_21_0= ruleRule11 ) )
                    {
                    otherlv_20=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_20, grammarAccess.getRootAccess().getNumberSignDigitOneDigitOneKeyword_10_0());
                    			
                    // InternalGH1462TestLanguage.g:349:4: ( (lv_element_21_0= ruleRule11 ) )
                    // InternalGH1462TestLanguage.g:350:5: (lv_element_21_0= ruleRule11 )
                    {
                    // InternalGH1462TestLanguage.g:350:5: (lv_element_21_0= ruleRule11 )
                    // InternalGH1462TestLanguage.g:351:6: lv_element_21_0= ruleRule11
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule11ParserRuleCall_10_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_21_0=ruleRule11();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_21_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule11");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalGH1462TestLanguage.g:370:3: (otherlv_22= '#12' ( (lv_element_23_0= ruleRule12 ) ) )
                    {
                    // InternalGH1462TestLanguage.g:370:3: (otherlv_22= '#12' ( (lv_element_23_0= ruleRule12 ) ) )
                    // InternalGH1462TestLanguage.g:371:4: otherlv_22= '#12' ( (lv_element_23_0= ruleRule12 ) )
                    {
                    otherlv_22=(Token)match(input,22,FollowSets000.FOLLOW_3); 

                    				newLeafNode(otherlv_22, grammarAccess.getRootAccess().getNumberSignDigitOneDigitTwoKeyword_11_0());
                    			
                    // InternalGH1462TestLanguage.g:375:4: ( (lv_element_23_0= ruleRule12 ) )
                    // InternalGH1462TestLanguage.g:376:5: (lv_element_23_0= ruleRule12 )
                    {
                    // InternalGH1462TestLanguage.g:376:5: (lv_element_23_0= ruleRule12 )
                    // InternalGH1462TestLanguage.g:377:6: lv_element_23_0= ruleRule12
                    {

                    						newCompositeNode(grammarAccess.getRootAccess().getElementRule12ParserRuleCall_11_1_0());
                    					
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_element_23_0=ruleRule12();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRootRule());
                    						}
                    						set(
                    							current,
                    							"element",
                    							lv_element_23_0,
                    							"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Rule12");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleRoot"


    // $ANTLR start "entryRuleRule1"
    // InternalGH1462TestLanguage.g:399:1: entryRuleRule1 returns [EObject current=null] : iv_ruleRule1= ruleRule1 EOF ;
    public final EObject entryRuleRule1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule1 = null;


        try {
            // InternalGH1462TestLanguage.g:399:46: (iv_ruleRule1= ruleRule1 EOF )
            // InternalGH1462TestLanguage.g:400:2: iv_ruleRule1= ruleRule1 EOF
            {
             newCompositeNode(grammarAccess.getRule1Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule1=ruleRule1();

            state._fsp--;

             current =iv_ruleRule1; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule1"


    // $ANTLR start "ruleRule1"
    // InternalGH1462TestLanguage.g:406:1: ruleRule1 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule1() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:412:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:413:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:413:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:414:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:414:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:415:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:415:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:416:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule1Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:432:3: ( (lv_right_1_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:433:4: (lv_right_1_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:433:4: (lv_right_1_0= RULE_INT )
            // InternalGH1462TestLanguage.g:434:5: lv_right_1_0= RULE_INT
            {
            lv_right_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule1Access().getRightINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule1Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:450:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:451:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:451:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:452:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule1Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule1Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule1"


    // $ANTLR start "entryRuleRule2"
    // InternalGH1462TestLanguage.g:468:1: entryRuleRule2 returns [EObject current=null] : iv_ruleRule2= ruleRule2 EOF ;
    public final EObject entryRuleRule2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule2 = null;


        try {
            // InternalGH1462TestLanguage.g:468:46: (iv_ruleRule2= ruleRule2 EOF )
            // InternalGH1462TestLanguage.g:469:2: iv_ruleRule2= ruleRule2 EOF
            {
             newCompositeNode(grammarAccess.getRule2Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule2=ruleRule2();

            state._fsp--;

             current =iv_ruleRule2; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule2"


    // $ANTLR start "ruleRule2"
    // InternalGH1462TestLanguage.g:475:1: ruleRule2 returns [EObject current=null] : (this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule2() throws RecognitionException {
        EObject current = null;

        Token this_INT_0=null;
        Token lv_value_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:481:2: ( (this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:482:2: (this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:482:2: (this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:483:3: this_INT_0= RULE_INT ( (lv_value_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) )
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            			newLeafNode(this_INT_0, grammarAccess.getRule2Access().getINTTerminalRuleCall_0());
            		
            // InternalGH1462TestLanguage.g:487:3: ( (lv_value_1_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:488:4: (lv_value_1_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:488:4: (lv_value_1_0= RULE_INT )
            // InternalGH1462TestLanguage.g:489:5: lv_value_1_0= RULE_INT
            {
            lv_value_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_value_1_0, grammarAccess.getRule2Access().getValueINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule2Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:505:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:506:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:506:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:507:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule2Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule2Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule2"


    // $ANTLR start "entryRuleRule3"
    // InternalGH1462TestLanguage.g:523:1: entryRuleRule3 returns [EObject current=null] : iv_ruleRule3= ruleRule3 EOF ;
    public final EObject entryRuleRule3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule3 = null;


        try {
            // InternalGH1462TestLanguage.g:523:46: (iv_ruleRule3= ruleRule3 EOF )
            // InternalGH1462TestLanguage.g:524:2: iv_ruleRule3= ruleRule3 EOF
            {
             newCompositeNode(grammarAccess.getRule3Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule3=ruleRule3();

            state._fsp--;

             current =iv_ruleRule3; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule3"


    // $ANTLR start "ruleRule3"
    // InternalGH1462TestLanguage.g:530:1: ruleRule3 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule3() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:536:2: ( ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:537:2: ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:537:2: ( ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:538:3: ( (lv_left_0_0= RULE_ID ) ) ( (lv_right_1_0= RULE_STRING ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:538:3: ( (lv_left_0_0= RULE_ID ) )
            // InternalGH1462TestLanguage.g:539:4: (lv_left_0_0= RULE_ID )
            {
            // InternalGH1462TestLanguage.g:539:4: (lv_left_0_0= RULE_ID )
            // InternalGH1462TestLanguage.g:540:5: lv_left_0_0= RULE_ID
            {
            lv_left_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule3Access().getLeftIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGH1462TestLanguage.g:556:3: ( (lv_right_1_0= RULE_STRING ) )
            // InternalGH1462TestLanguage.g:557:4: (lv_right_1_0= RULE_STRING )
            {
            // InternalGH1462TestLanguage.g:557:4: (lv_right_1_0= RULE_STRING )
            // InternalGH1462TestLanguage.g:558:5: lv_right_1_0= RULE_STRING
            {
            lv_right_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule3Access().getRightSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule3Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGH1462TestLanguage.g:574:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:575:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:575:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:576:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule3Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule3Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule3"


    // $ANTLR start "entryRuleRule4"
    // InternalGH1462TestLanguage.g:592:1: entryRuleRule4 returns [EObject current=null] : iv_ruleRule4= ruleRule4 EOF ;
    public final EObject entryRuleRule4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule4 = null;


        try {
            // InternalGH1462TestLanguage.g:592:46: (iv_ruleRule4= ruleRule4 EOF )
            // InternalGH1462TestLanguage.g:593:2: iv_ruleRule4= ruleRule4 EOF
            {
             newCompositeNode(grammarAccess.getRule4Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule4=ruleRule4();

            state._fsp--;

             current =iv_ruleRule4; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule4"


    // $ANTLR start "ruleRule4"
    // InternalGH1462TestLanguage.g:599:1: ruleRule4 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule4() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:605:2: ( ( ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:606:2: ( ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:606:2: ( ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:607:3: ( (lv_left_0_0= RULE_STRING ) ) ( (lv_right_1_0= RULE_ID ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:607:3: ( (lv_left_0_0= RULE_STRING ) )
            // InternalGH1462TestLanguage.g:608:4: (lv_left_0_0= RULE_STRING )
            {
            // InternalGH1462TestLanguage.g:608:4: (lv_left_0_0= RULE_STRING )
            // InternalGH1462TestLanguage.g:609:5: lv_left_0_0= RULE_STRING
            {
            lv_left_0_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_4); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule4Access().getLeftSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalGH1462TestLanguage.g:625:3: ( (lv_right_1_0= RULE_ID ) )
            // InternalGH1462TestLanguage.g:626:4: (lv_right_1_0= RULE_ID )
            {
            // InternalGH1462TestLanguage.g:626:4: (lv_right_1_0= RULE_ID )
            // InternalGH1462TestLanguage.g:627:5: lv_right_1_0= RULE_ID
            {
            lv_right_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule4Access().getRightIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule4Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalGH1462TestLanguage.g:643:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:644:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:644:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:645:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule4Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule4Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule4"


    // $ANTLR start "entryRuleRule5"
    // InternalGH1462TestLanguage.g:661:1: entryRuleRule5 returns [EObject current=null] : iv_ruleRule5= ruleRule5 EOF ;
    public final EObject entryRuleRule5() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule5 = null;


        try {
            // InternalGH1462TestLanguage.g:661:46: (iv_ruleRule5= ruleRule5 EOF )
            // InternalGH1462TestLanguage.g:662:2: iv_ruleRule5= ruleRule5 EOF
            {
             newCompositeNode(grammarAccess.getRule5Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule5=ruleRule5();

            state._fsp--;

             current =iv_ruleRule5; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule5"


    // $ANTLR start "ruleRule5"
    // InternalGH1462TestLanguage.g:668:1: ruleRule5 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule5() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        AntlrDatatypeRuleToken lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:674:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:675:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:675:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:676:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:676:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:677:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:677:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:678:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule5Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule5Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:694:3: ( (lv_right_1_0= ruleInteger ) )
            // InternalGH1462TestLanguage.g:695:4: (lv_right_1_0= ruleInteger )
            {
            // InternalGH1462TestLanguage.g:695:4: (lv_right_1_0= ruleInteger )
            // InternalGH1462TestLanguage.g:696:5: lv_right_1_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getRule5Access().getRightIntegerParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule5Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Integer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:713:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:714:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:714:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:715:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule5Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule5Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule5"


    // $ANTLR start "entryRuleRule6"
    // InternalGH1462TestLanguage.g:731:1: entryRuleRule6 returns [EObject current=null] : iv_ruleRule6= ruleRule6 EOF ;
    public final EObject entryRuleRule6() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule6 = null;


        try {
            // InternalGH1462TestLanguage.g:731:46: (iv_ruleRule6= ruleRule6 EOF )
            // InternalGH1462TestLanguage.g:732:2: iv_ruleRule6= ruleRule6 EOF
            {
             newCompositeNode(grammarAccess.getRule6Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule6=ruleRule6();

            state._fsp--;

             current =iv_ruleRule6; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule6"


    // $ANTLR start "ruleRule6"
    // InternalGH1462TestLanguage.g:738:1: ruleRule6 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule6() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:744:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:745:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:745:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:746:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:746:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:747:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:747:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:748:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule6Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule6Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:764:3: ( (lv_right_1_0= ruleWrapper ) )
            // InternalGH1462TestLanguage.g:765:4: (lv_right_1_0= ruleWrapper )
            {
            // InternalGH1462TestLanguage.g:765:4: (lv_right_1_0= ruleWrapper )
            // InternalGH1462TestLanguage.g:766:5: lv_right_1_0= ruleWrapper
            {

            					newCompositeNode(grammarAccess.getRule6Access().getRightWrapperParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleWrapper();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule6Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Wrapper");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:783:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:784:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:784:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:785:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule6Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule6Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule6"


    // $ANTLR start "entryRuleRule7"
    // InternalGH1462TestLanguage.g:801:1: entryRuleRule7 returns [EObject current=null] : iv_ruleRule7= ruleRule7 EOF ;
    public final EObject entryRuleRule7() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule7 = null;


        try {
            // InternalGH1462TestLanguage.g:801:46: (iv_ruleRule7= ruleRule7 EOF )
            // InternalGH1462TestLanguage.g:802:2: iv_ruleRule7= ruleRule7 EOF
            {
             newCompositeNode(grammarAccess.getRule7Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule7=ruleRule7();

            state._fsp--;

             current =iv_ruleRule7; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule7"


    // $ANTLR start "ruleRule7"
    // InternalGH1462TestLanguage.g:808:1: ruleRule7 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule7() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:814:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:815:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:815:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:816:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= RULE_INT ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:816:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:817:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:817:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:818:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule7Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule7Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:834:3: ( (lv_right_1_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:835:4: (lv_right_1_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:835:4: (lv_right_1_0= RULE_INT )
            // InternalGH1462TestLanguage.g:836:5: lv_right_1_0= RULE_INT
            {
            lv_right_1_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule7Access().getRightINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule7Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"right",
            						lv_right_1_0 != null,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:852:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:853:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:853:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:854:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule7Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule7Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule7"


    // $ANTLR start "entryRuleRule8"
    // InternalGH1462TestLanguage.g:870:1: entryRuleRule8 returns [EObject current=null] : iv_ruleRule8= ruleRule8 EOF ;
    public final EObject entryRuleRule8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule8 = null;


        try {
            // InternalGH1462TestLanguage.g:870:46: (iv_ruleRule8= ruleRule8 EOF )
            // InternalGH1462TestLanguage.g:871:2: iv_ruleRule8= ruleRule8 EOF
            {
             newCompositeNode(grammarAccess.getRule8Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule8=ruleRule8();

            state._fsp--;

             current =iv_ruleRule8; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule8"


    // $ANTLR start "ruleRule8"
    // InternalGH1462TestLanguage.g:877:1: ruleRule8 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule8() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;
        Token lv_unit_2_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:883:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:884:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:884:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:885:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= '#1' ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:885:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:886:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:886:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:887:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_7); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule8Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule8Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:903:3: ( (lv_right_1_0= '#1' ) )
            // InternalGH1462TestLanguage.g:904:4: (lv_right_1_0= '#1' )
            {
            // InternalGH1462TestLanguage.g:904:4: (lv_right_1_0= '#1' )
            // InternalGH1462TestLanguage.g:905:5: lv_right_1_0= '#1'
            {
            lv_right_1_0=(Token)match(input,11,FollowSets000.FOLLOW_6); 

            					newLeafNode(lv_right_1_0, grammarAccess.getRule8Access().getRight1Keyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule8Rule());
            					}
            					setWithLastConsumed(current, "right", lv_right_1_0 != null, "#1");
            				

            }


            }

            // InternalGH1462TestLanguage.g:917:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:918:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:918:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:919:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule8Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule8Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule8"


    // $ANTLR start "entryRuleRule9"
    // InternalGH1462TestLanguage.g:935:1: entryRuleRule9 returns [EObject current=null] : iv_ruleRule9= ruleRule9 EOF ;
    public final EObject entryRuleRule9() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule9 = null;


        try {
            // InternalGH1462TestLanguage.g:935:46: (iv_ruleRule9= ruleRule9 EOF )
            // InternalGH1462TestLanguage.g:936:2: iv_ruleRule9= ruleRule9 EOF
            {
             newCompositeNode(grammarAccess.getRule9Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule9=ruleRule9();

            state._fsp--;

             current =iv_ruleRule9; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule9"


    // $ANTLR start "ruleRule9"
    // InternalGH1462TestLanguage.g:942:1: ruleRule9 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule9() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        AntlrDatatypeRuleToken lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:948:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:949:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:949:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:950:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:950:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:951:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:951:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:952:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_8); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule9Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule9Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:968:3: ( (lv_right_1_0= ruleMaybeEmpty ) )
            // InternalGH1462TestLanguage.g:969:4: (lv_right_1_0= ruleMaybeEmpty )
            {
            // InternalGH1462TestLanguage.g:969:4: (lv_right_1_0= ruleMaybeEmpty )
            // InternalGH1462TestLanguage.g:970:5: lv_right_1_0= ruleMaybeEmpty
            {

            					newCompositeNode(grammarAccess.getRule9Access().getRightMaybeEmptyParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleMaybeEmpty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule9Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.MaybeEmpty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:987:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:988:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:988:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:989:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule9Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule9Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule9"


    // $ANTLR start "entryRuleRule10"
    // InternalGH1462TestLanguage.g:1005:1: entryRuleRule10 returns [EObject current=null] : iv_ruleRule10= ruleRule10 EOF ;
    public final EObject entryRuleRule10() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule10 = null;


        try {
            // InternalGH1462TestLanguage.g:1005:47: (iv_ruleRule10= ruleRule10 EOF )
            // InternalGH1462TestLanguage.g:1006:2: iv_ruleRule10= ruleRule10 EOF
            {
             newCompositeNode(grammarAccess.getRule10Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule10=ruleRule10();

            state._fsp--;

             current =iv_ruleRule10; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule10"


    // $ANTLR start "ruleRule10"
    // InternalGH1462TestLanguage.g:1012:1: ruleRule10 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule10() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        AntlrDatatypeRuleToken lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1018:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:1019:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:1019:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:1020:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleMaybeEmpty ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:1020:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:1021:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:1021:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:1022:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_8); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule10Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule10Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:1038:3: ( (lv_right_1_0= ruleMaybeEmpty ) )
            // InternalGH1462TestLanguage.g:1039:4: (lv_right_1_0= ruleMaybeEmpty )
            {
            // InternalGH1462TestLanguage.g:1039:4: (lv_right_1_0= ruleMaybeEmpty )
            // InternalGH1462TestLanguage.g:1040:5: lv_right_1_0= ruleMaybeEmpty
            {

            					newCompositeNode(grammarAccess.getRule10Access().getRightMaybeEmptyParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleMaybeEmpty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule10Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0 != null,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.MaybeEmpty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:1057:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:1058:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:1058:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:1059:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule10Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule10Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule10"


    // $ANTLR start "entryRuleRule11"
    // InternalGH1462TestLanguage.g:1075:1: entryRuleRule11 returns [EObject current=null] : iv_ruleRule11= ruleRule11 EOF ;
    public final EObject entryRuleRule11() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule11 = null;


        try {
            // InternalGH1462TestLanguage.g:1075:47: (iv_ruleRule11= ruleRule11 EOF )
            // InternalGH1462TestLanguage.g:1076:2: iv_ruleRule11= ruleRule11 EOF
            {
             newCompositeNode(grammarAccess.getRule11Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule11=ruleRule11();

            state._fsp--;

             current =iv_ruleRule11; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule11"


    // $ANTLR start "ruleRule11"
    // InternalGH1462TestLanguage.g:1082:1: ruleRule11 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule11() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        AntlrDatatypeRuleToken lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1088:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:1089:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:1089:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:1090:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleInteger ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:1090:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:1091:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:1091:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:1092:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule11Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule11Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:1108:3: ( (lv_right_1_0= ruleInteger ) )
            // InternalGH1462TestLanguage.g:1109:4: (lv_right_1_0= ruleInteger )
            {
            // InternalGH1462TestLanguage.g:1109:4: (lv_right_1_0= ruleInteger )
            // InternalGH1462TestLanguage.g:1110:5: lv_right_1_0= ruleInteger
            {

            					newCompositeNode(grammarAccess.getRule11Access().getRightIntegerParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleInteger();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule11Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0 != null,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Integer");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:1127:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:1128:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:1128:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:1129:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule11Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule11Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule11"


    // $ANTLR start "entryRuleRule12"
    // InternalGH1462TestLanguage.g:1145:1: entryRuleRule12 returns [EObject current=null] : iv_ruleRule12= ruleRule12 EOF ;
    public final EObject entryRuleRule12() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule12 = null;


        try {
            // InternalGH1462TestLanguage.g:1145:47: (iv_ruleRule12= ruleRule12 EOF )
            // InternalGH1462TestLanguage.g:1146:2: iv_ruleRule12= ruleRule12 EOF
            {
             newCompositeNode(grammarAccess.getRule12Rule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRule12=ruleRule12();

            state._fsp--;

             current =iv_ruleRule12; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule12"


    // $ANTLR start "ruleRule12"
    // InternalGH1462TestLanguage.g:1152:1: ruleRule12 returns [EObject current=null] : ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) ) ;
    public final EObject ruleRule12() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_unit_2_0=null;
        EObject lv_right_1_0 = null;



        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1158:2: ( ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) ) )
            // InternalGH1462TestLanguage.g:1159:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) )
            {
            // InternalGH1462TestLanguage.g:1159:2: ( ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) ) )
            // InternalGH1462TestLanguage.g:1160:3: ( (lv_left_0_0= RULE_INT ) ) ( (lv_right_1_0= ruleWrapper ) ) ( (lv_unit_2_0= 's' ) )
            {
            // InternalGH1462TestLanguage.g:1160:3: ( (lv_left_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:1161:4: (lv_left_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:1161:4: (lv_left_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:1162:5: lv_left_0_0= RULE_INT
            {
            lv_left_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_3); 

            					newLeafNode(lv_left_0_0, grammarAccess.getRule12Access().getLeftINTTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule12Rule());
            					}
            					setWithLastConsumed(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalGH1462TestLanguage.g:1178:3: ( (lv_right_1_0= ruleWrapper ) )
            // InternalGH1462TestLanguage.g:1179:4: (lv_right_1_0= ruleWrapper )
            {
            // InternalGH1462TestLanguage.g:1179:4: (lv_right_1_0= ruleWrapper )
            // InternalGH1462TestLanguage.g:1180:5: lv_right_1_0= ruleWrapper
            {

            					newCompositeNode(grammarAccess.getRule12Access().getRightWrapperParserRuleCall_1_0());
            				
            pushFollow(FollowSets000.FOLLOW_6);
            lv_right_1_0=ruleWrapper();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRule12Rule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_1_0 != null,
            						"org.eclipse.xtext.parser.antlr.GH1462TestLanguage.Wrapper");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalGH1462TestLanguage.g:1197:3: ( (lv_unit_2_0= 's' ) )
            // InternalGH1462TestLanguage.g:1198:4: (lv_unit_2_0= 's' )
            {
            // InternalGH1462TestLanguage.g:1198:4: (lv_unit_2_0= 's' )
            // InternalGH1462TestLanguage.g:1199:5: lv_unit_2_0= 's'
            {
            lv_unit_2_0=(Token)match(input,23,FollowSets000.FOLLOW_2); 

            					newLeafNode(lv_unit_2_0, grammarAccess.getRule12Access().getUnitSKeyword_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRule12Rule());
            					}
            					setWithLastConsumed(current, "unit", lv_unit_2_0, "s");
            				

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
    // $ANTLR end "ruleRule12"


    // $ANTLR start "entryRuleInteger"
    // InternalGH1462TestLanguage.g:1215:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // InternalGH1462TestLanguage.g:1215:47: (iv_ruleInteger= ruleInteger EOF )
            // InternalGH1462TestLanguage.g:1216:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalGH1462TestLanguage.g:1222:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1228:2: (this_INT_0= RULE_INT )
            // InternalGH1462TestLanguage.g:1229:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getIntegerAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleMaybeEmpty"
    // InternalGH1462TestLanguage.g:1239:1: entryRuleMaybeEmpty returns [String current=null] : iv_ruleMaybeEmpty= ruleMaybeEmpty EOF ;
    public final String entryRuleMaybeEmpty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaybeEmpty = null;


        try {
            // InternalGH1462TestLanguage.g:1239:50: (iv_ruleMaybeEmpty= ruleMaybeEmpty EOF )
            // InternalGH1462TestLanguage.g:1240:2: iv_ruleMaybeEmpty= ruleMaybeEmpty EOF
            {
             newCompositeNode(grammarAccess.getMaybeEmptyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMaybeEmpty=ruleMaybeEmpty();

            state._fsp--;

             current =iv_ruleMaybeEmpty.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMaybeEmpty"


    // $ANTLR start "ruleMaybeEmpty"
    // InternalGH1462TestLanguage.g:1246:1: ruleMaybeEmpty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT )? ;
    public final AntlrDatatypeRuleToken ruleMaybeEmpty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1252:2: ( (this_INT_0= RULE_INT )? )
            // InternalGH1462TestLanguage.g:1253:2: (this_INT_0= RULE_INT )?
            {
            // InternalGH1462TestLanguage.g:1253:2: (this_INT_0= RULE_INT )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_INT) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalGH1462TestLanguage.g:1254:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getMaybeEmptyAccess().getINTTerminalRuleCall());
                    		

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
    // $ANTLR end "ruleMaybeEmpty"


    // $ANTLR start "entryRuleWrapper"
    // InternalGH1462TestLanguage.g:1265:1: entryRuleWrapper returns [EObject current=null] : iv_ruleWrapper= ruleWrapper EOF ;
    public final EObject entryRuleWrapper() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWrapper = null;


        try {
            // InternalGH1462TestLanguage.g:1265:48: (iv_ruleWrapper= ruleWrapper EOF )
            // InternalGH1462TestLanguage.g:1266:2: iv_ruleWrapper= ruleWrapper EOF
            {
             newCompositeNode(grammarAccess.getWrapperRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleWrapper=ruleWrapper();

            state._fsp--;

             current =iv_ruleWrapper; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWrapper"


    // $ANTLR start "ruleWrapper"
    // InternalGH1462TestLanguage.g:1272:1: ruleWrapper returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleWrapper() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalGH1462TestLanguage.g:1278:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalGH1462TestLanguage.g:1279:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalGH1462TestLanguage.g:1279:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalGH1462TestLanguage.g:1280:3: (lv_value_0_0= RULE_INT )
            {
            // InternalGH1462TestLanguage.g:1280:3: (lv_value_0_0= RULE_INT )
            // InternalGH1462TestLanguage.g:1281:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getWrapperAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getWrapperRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleWrapper"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800010L});
    }


}