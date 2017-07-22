/*
 * Sonar Groovy Plugin
 * Copyright (C) 2010-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.plugins.groovy.foundation;

import groovyjarjarantlr.*;

import java.io.InputStream;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Hashtable;

import org.codehaus.groovy.antlr.parser.GroovyLexer;

/**
 * Created by hoakn on 7/22/2017.
 */
public class GosuLexer extends GroovyLexer {
    public GosuLexer(InputStream in) {
        super(in);
    }

    public GosuLexer(Reader in) {
        this((InputBuffer)(new CharBuffer(in)));
    }

    public GosuLexer(InputBuffer ib) {
        this(new LexerSharedInputState(ib));
    }

    public GosuLexer(LexerSharedInputState state) {
        super(state);
        this.setTabSize(1);
        this.parenLevel = 0;
        this.suppressNewline = 0;
        this.stringCtorState = 0;
        this.parenLevelStack = new ArrayList();
        this.lastSigTokenType = 1;
        this.caseSensitiveLiterals = true;
        this.setCaseSensitive(true);
        this.literals = new Hashtable();
        this.literals.put(new ANTLRHashString("byte", this), new Integer(106));
        this.literals.put(new ANTLRHashString("public", this), new Integer(116));
        this.literals.put(new ANTLRHashString("trait", this), new Integer(95));
        this.literals.put(new ANTLRHashString("case", this), new Integer(150));
        this.literals.put(new ANTLRHashString("short", this), new Integer(108));
        this.literals.put(new ANTLRHashString("break", this), new Integer(144));
        this.literals.put(new ANTLRHashString("while", this), new Integer(139));
        this.literals.put(new ANTLRHashString("new", this), new Integer(159));
        this.literals.put(new ANTLRHashString("instanceof", this), new Integer(158));
        this.literals.put(new ANTLRHashString("implements", this), new Integer(131));
        this.literals.put(new ANTLRHashString("synchronized", this), new Integer(121));
        this.literals.put(new ANTLRHashString("const", this), new Integer(41));
        this.literals.put(new ANTLRHashString("float", this), new Integer(110));
        this.literals.put(new ANTLRHashString("package", this), new Integer(81));
        this.literals.put(new ANTLRHashString("return", this), new Integer(143));
        this.literals.put(new ANTLRHashString("throw", this), new Integer(146));
        this.literals.put(new ANTLRHashString("null", this), new Integer(160));
        this.literals.put(new ANTLRHashString("def", this), new Integer(84));
        this.literals.put(new ANTLRHashString("var", this), new Integer(184));
        this.literals.put(new ANTLRHashString("function", this), new Integer(284));
        this.literals.put(new ANTLRHashString("threadsafe", this), new Integer(120));
        this.literals.put(new ANTLRHashString("protected", this), new Integer(117));
        this.literals.put(new ANTLRHashString("class", this), new Integer(92));
        this.literals.put(new ANTLRHashString("throws", this), new Integer(130));
        this.literals.put(new ANTLRHashString("do", this), new Integer(42));
        this.literals.put(new ANTLRHashString("strictfp", this), new Integer(43));
        this.literals.put(new ANTLRHashString("super", this), new Integer(99));
        this.literals.put(new ANTLRHashString("transient", this), new Integer(118));
        this.literals.put(new ANTLRHashString("native", this), new Integer(119));
        this.literals.put(new ANTLRHashString("interface", this), new Integer(93));
        this.literals.put(new ANTLRHashString("final", this), new Integer(38));
        this.literals.put(new ANTLRHashString("if", this), new Integer(137));
        this.literals.put(new ANTLRHashString("double", this), new Integer(112));
        this.literals.put(new ANTLRHashString("volatile", this), new Integer(122));
        this.literals.put(new ANTLRHashString("as", this), new Integer(114));
        this.literals.put(new ANTLRHashString("assert", this), new Integer(147));
        this.literals.put(new ANTLRHashString("catch", this), new Integer(153));
        this.literals.put(new ANTLRHashString("try", this), new Integer(151));
        this.literals.put(new ANTLRHashString("goto", this), new Integer(40));
        this.literals.put(new ANTLRHashString("enum", this), new Integer(94));
        this.literals.put(new ANTLRHashString("int", this), new Integer(109));
        this.literals.put(new ANTLRHashString("for", this), new Integer(141));
        this.literals.put(new ANTLRHashString("extends", this), new Integer(98));
        this.literals.put(new ANTLRHashString("boolean", this), new Integer(105));
        this.literals.put(new ANTLRHashString("char", this), new Integer(107));
        this.literals.put(new ANTLRHashString("private", this), new Integer(115));
        this.literals.put(new ANTLRHashString("default", this), new Integer(129));
        this.literals.put(new ANTLRHashString("false", this), new Integer(157));
        this.literals.put(new ANTLRHashString("this", this), new Integer(132));
        this.literals.put(new ANTLRHashString("static", this), new Integer(83));
        this.literals.put(new ANTLRHashString("abstract", this), new Integer(39));
        this.literals.put(new ANTLRHashString("continue", this), new Integer(145));
        this.literals.put(new ANTLRHashString("finally", this), new Integer(152));
        this.literals.put(new ANTLRHashString("else", this), new Integer(138));
        this.literals.put(new ANTLRHashString("import", this), new Integer(82));
        this.literals.put(new ANTLRHashString("in", this), new Integer(142));
        this.literals.put(new ANTLRHashString("void", this), new Integer(104));
        this.literals.put(new ANTLRHashString("switch", this), new Integer(140));
        this.literals.put(new ANTLRHashString("true", this), new Integer(161));
        this.literals.put(new ANTLRHashString("long", this), new Integer(111));
    }
    
    @Override
    public Token nextToken() throws TokenStreamException {
        Token var1 = null;

        while(true) {
            Token _token = null;
            this.resetText();
            try {
                try {
                    switch(this.LA(1)) {
                    case '\t':
                    case '\f':
                    case ' ':
                    	this.mWS(true);
                        var1 = this._returnToken;
                        break;
                    case '\n':
                    case '\r':
                        this.mNLS(true);
                        var1 = this._returnToken;
                        break;
                    case '\u000b':
                    case '\u000e':
                    case '\u000f':
                    case '\u0010':
                    case '\u0011':
                    case '\u0012':
                    case '\u0013':
                    case '\u0014':
                    case '\u0015':
                    case '\u0016':
                    case '\u0017':
                    case '\u0018':
                    case '\u0019':
                    case '\u001a':
                    case '\u001b':
                    case '\u001c':
                    case '\u001d':
                    case '\u001e':
                    case '\u001f':
                    case '!':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '*':
                    case '+':
                    case '-':
                    case '.':
                    case '/':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                    case '|':
                    default:
                        if(this.LA(1) == 62 && this.LA(2) == 62 && this.LA(3) == 62 && this.LA(4) == 61) {
                            this.mBSR_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 47 && this.LA(2) == 42 && this.LA(3) >= 0 && this.LA(3) <= '\ufffe' && this.LA(4) >= 0 && this.LA(4) <= '\ufffe' && this.atMultiCommentStart()) {
                            this.mML_COMMENT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 60 && this.LA(2) == 61 && this.LA(3) == 62) {
                            this.mCOMPARE_TO(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 61 && this.LA(2) == 61 && this.LA(3) == 61) {
                            this.mIDENTICAL(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 33 && this.LA(2) == 61 && this.LA(3) == 61) {
                            this.mNOT_IDENTICAL(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 62 && this.LA(2) == 62 && this.LA(3) == 61) {
                            this.mSR_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 62 && this.LA(2) == 62 && this.LA(3) == 62) {
                            this.mBSR(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 60 && this.LA(2) == 60 && this.LA(3) == 61) {
                            this.mSL_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 46 && this.LA(2) == 46 && this.LA(3) == 60) {
                            this.mRANGE_EXCLUSIVE(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 46 && this.LA(2) == 46 && this.LA(3) == 46) {
                            this.mTRIPLE_DOT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 61 && this.LA(2) == 61 && this.LA(3) == 126) {
                            this.mREGEX_MATCH(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 42 && this.LA(2) == 42 && this.LA(3) == 61) {
                            this.mSTAR_STAR_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 61 && this.LA(2) == 61) {
                            this.mEQUAL(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 33 && this.LA(2) == 61) {
                            this.mNOT_EQUAL(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 43 && this.LA(2) == 61) {
                            this.mPLUS_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 43 && this.LA(2) == 43) {
                            this.mINC(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 45 && this.LA(2) == 61) {
                            this.mMINUS_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 45 && this.LA(2) == 45) {
                            this.mDEC(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 42 && this.LA(2) == 61) {
                            this.mSTAR_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 37 && this.LA(2) == 61) {
                            this.mMOD_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 62 && this.LA(2) == 62) {
                            this.mSR(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 62 && this.LA(2) == 61) {
                            this.mGE(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 60 && this.LA(2) == 60) {
                            this.mSL(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 60 && this.LA(2) == 61) {
                            this.mLE(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 94 && this.LA(2) == 61) {
                            this.mBXOR_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 124 && this.LA(2) == 61) {
                            this.mBOR_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 124 && this.LA(2) == 124) {
                            this.mLOR(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 38 && this.LA(2) == 61) {
                            this.mBAND_ASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 38 && this.LA(2) == 38) {
                            this.mLAND(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 46 && this.LA(2) == 46) {
                            this.mRANGE_INCLUSIVE(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 42 && this.LA(2) == 46) {
                            this.mSPREAD_DOT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 63 && this.LA(2) == 46) {
                            this.mOPTIONAL_DOT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 63 && this.LA(2) == 58) {
                            this.mELVIS_OPERATOR(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 46 && this.LA(2) == 38) {
                            this.mMEMBER_POINTER(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 61 && this.LA(2) == 126) {
                            this.mREGEX_FIND(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 42 && this.LA(2) == 42) {
                            this.mSTAR_STAR(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 45 && this.LA(2) == 62) {
                            this.mCLOSABLE_BLOCK_OP(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 47 && this.LA(2) == 47) {
                            this.mSL_COMMENT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 36 && this.LA(2) == 47 && this.allowRegexpLiteral()) {
                            this.mDOLLAR_REGEXP_LITERAL(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 63) {
                            this.mQUESTION(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 46) {
                            this.mDOT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 61) {
                            this.mASSIGN(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 33) {
                            this.mLNOT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 43) {
                            this.mPLUS(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 45) {
                            this.mMINUS(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 42) {
                            this.mSTAR(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 37) {
                            this.mMOD(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 62) {
                            this.mGT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 60) {
                            this.mLT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 94) {
                            this.mBXOR(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 124) {
                            this.mBOR(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 38) {
                            this.mBAND(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 35 && this.getLine() == 1 && this.getColumn() == 1) {
                            this.mSH_COMMENT(true);
                            var1 = this._returnToken;
                        } else if(this.LA(1) == 47 && !this.atMultiCommentStart()) {
                            this.mREGEXP_LITERAL(true);
                            var1 = this._returnToken;
                        } else if(_tokenSet_0.member(this.LA(1))) {
                            this.mIDENT(true);
                            var1 = this._returnToken;
                        } else {
                            if(this.LA(1) != '\uffff') {
                                throw new NoViableAltForCharException(this.LA(1), this.getFilename(), this.getLine(), this.getColumn());
                            }

                            this.uponEOF();
                            this._returnToken = this.makeToken(1);
                        }
                        break;
                    case '"':
                    case '\'':
                        this.mSTRING_LITERAL(true);
                        var1 = this._returnToken;
                        break;
                    case '(':
                        this.mLPAREN(true);
                        var1 = this._returnToken;
                        break;
                    case ')':
                        this.mRPAREN(true);
                        var1 = this._returnToken;
                        break;
                    case ',':
                        this.mCOMMA(true);
                        var1 = this._returnToken;
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        this.mNUM_INT(true);
                        var1 = this._returnToken;
                        break;
                    case ':':
                        this.mCOLON(true);
                        var1 = this._returnToken;
                        break;
                    case ';':
                        this.mSEMI(true);
                        var1 = this._returnToken;
                        break;
                    case '@':
                        this.mAT(true);
                        var1 = this._returnToken;
                        break;
                    case '[':
                        this.mLBRACK(true);
                        var1 = this._returnToken;
                        break;
                    case ']':
                        this.mRBRACK(true);
                        var1 = this._returnToken;
                        break;
                    case '{':
                        this.mLCURLY(true);
                        var1 = this._returnToken;
                        break;
                    case '}':
                        this.mRCURLY(true);
                        var1 = this._returnToken;
                        break;
                    case '~':
                        this.mBNOT(true);
                        var1 = this._returnToken;
                    }

                    if(this._returnToken != null) {
                        int _ttype = this._returnToken.getType();
                        this._returnToken.setType(_ttype);
                        return this._returnToken;
                    }
                } catch (RecognitionException var5) {
                    throw new TokenStreamRecognitionException(var5);
                }
            } catch (CharStreamException var6) {
                if(var6 instanceof CharStreamIOException) {
                    throw new TokenStreamIOException(((CharStreamIOException)var6).io);
                }

                throw new TokenStreamException(var6.getMessage());
            }
        }
    }

}
