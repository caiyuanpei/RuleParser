/* Generated By:JJTree&JavaCC: Do not edit this line. Parser.java */
package com.cathysoft.ruleparser.jjt;

import java.io.*;

public class Parser/*@bgen(jjtree)*/implements ParserTreeConstants, ParserConstants {/*@bgen(jjtree)*/
  protected JJTParserState jjtree = new JJTParserState();public static void main(String args [])
  {
    InputStream is = ClassLoader.getSystemResourceAsStream("example1.txt");
    Parser parser = new Parser(is);
    try
    {
                ASTExpression root = parser.parse();
                root.dump(" >");

    }
    catch (Exception e)
    {
      System.out.println("Oops.");
      System.out.println(e.getMessage());
    }
  }

  final public ASTExpression parse() throws ParseException {
    trace_call("parse");
    try {
 /*@bgen(jjtree) Expression */
  ASTExpression jjtn000 = new ASTExpression(JJTEXPRESSION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        jj_consume_token(RULE);
        jj_consume_token(1);
        ContextClasses();
        jj_consume_token(2);
        jj_consume_token(LBRACKETS);
        if (jj_2_1(2)) {
          jj_consume_token(3);
          jj_consume_token(NOT_EMPTY);
          jj_consume_token(4);
          NotEmptyExp();
        } else {
          ;
        }
        if (jj_2_2(2)) {
          jj_consume_token(3);
          jj_consume_token(CHECK);
          jj_consume_token(4);
          label_1:
          while (true) {
            CheckExp();
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case ASSERT:
            case DERIVATION:
              ;
              break;
            default:
              jj_la1[0] = jj_gen;
              break label_1;
            }
          }
        } else {
          ;
        }
        jj_consume_token(RBRACKETS);
    jjtree.closeNodeScope(jjtn000, true);
    jjtc000 = false;
    {if (true) return jjtn000;}
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    throw new Error("Missing return statement in function");
    } finally {
      trace_return("parse");
    }
  }

  final public void ContextClasses() throws ParseException {
    trace_call("ContextClasses");
    try {
 /*@bgen(jjtree) ContextClasses */
  ASTContextClasses jjtn000 = new ASTContextClasses(JJTCONTEXTCLASSES);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        SignatureExp();
        label_2:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case 5:
            ;
            break;
          default:
            jj_la1[1] = jj_gen;
            break label_2;
          }
          jj_consume_token(5);
          SignatureExp();
        }
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("ContextClasses");
    }
  }

  final public void NotEmptyExp() throws ParseException {
    trace_call("NotEmptyExp");
    try {
 /*@bgen(jjtree) NotEmptyExp */
  ASTNotEmptyExp jjtn000 = new ASTNotEmptyExp(JJTNOTEMPTYEXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ALL:
          jj_consume_token(ALL);
          jj_consume_token(BUT);
          PathExp();
          label_3:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case 5:
              ;
              break;
            default:
              jj_la1[2] = jj_gen;
              break label_3;
            }
            jj_consume_token(5);
            PathExp();
          }
          break;
        case IDENTIFIER:
          PathExp();
          label_4:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
            case 5:
              ;
              break;
            default:
              jj_la1[3] = jj_gen;
              break label_4;
            }
            jj_consume_token(5);
            PathExp();
          }
          break;
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("NotEmptyExp");
    }
  }

  final public void CheckExp() throws ParseException {
    trace_call("CheckExp");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ASSERT:
        AssertionExp();
        break;
      case DERIVATION:
        DerivationExp();
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("CheckExp");
    }
  }

  final public void AssertionExp() throws ParseException {
    trace_call("AssertionExp");
    try {
 /*@bgen(jjtree) AssertionExp */
  ASTAssertionExp jjtn000 = new ASTAssertionExp(JJTASSERTIONEXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        jj_consume_token(ASSERT);
        jj_consume_token(1);
        PathExp();
        jj_consume_token(5);
        jj_consume_token(STRING_LITERAL);
        jj_consume_token(2);
        LogicalExp();
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("AssertionExp");
    }
  }

  final public void DerivationExp() throws ParseException {
    trace_call("DerivationExp");
    try {
 /*@bgen(jjtree) DerivationExp */
  ASTDerivationExp jjtn000 = new ASTDerivationExp(JJTDERIVATIONEXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        jj_consume_token(DERIVATION);
        jj_consume_token(1);
        PathExp();
        jj_consume_token(5);
        jj_consume_token(STRING_LITERAL);
        jj_consume_token(2);
        DerivationBody();
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("DerivationExp");
    }
  }

  final public void LogicalExp() throws ParseException {
    trace_call("LogicalExp");
    try {
 /*@bgen(jjtree) LogicalExp */
  ASTLogicalExp jjtn000 = new ASTLogicalExp(JJTLOGICALEXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        if (jj_2_3(2)) {
          LogicalBody();
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case IDENTIFIER:
            FunctionExp();
            break;
          default:
            jj_la1[6] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      } catch (Throwable jjte000) {
   if (jjtc000) {
     jjtree.clearNodeScope(jjtn000);
     jjtc000 = false;
   } else {
     jjtree.popNode();
   }
   if (jjte000 instanceof RuntimeException) {
     {if (true) throw (RuntimeException)jjte000;}
   }
   if (jjte000 instanceof ParseException) {
     {if (true) throw (ParseException)jjte000;}
   }
   {if (true) throw (Error)jjte000;}
      } finally {
   if (jjtc000) {
     jjtree.closeNodeScope(jjtn000, true);
   }
      }
    } finally {
      trace_return("LogicalExp");
    }
  }

  final public void LogicalBody() throws ParseException {
    trace_call("LogicalBody");
    try {
 /*@bgen(jjtree) LogicalBody */
  ASTLogicalBody jjtn000 = new ASTLogicalBody(JJTLOGICALBODY);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        OperatorExp();
        jj_consume_token(LOGIC_OPER);
        OperatorExp();
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("LogicalBody");
    }
  }

  final public void DerivationBody() throws ParseException {
    trace_call("DerivationBody");
    try {
 /*@bgen(jjtree) DerivationBody */
  ASTDerivationBody jjtn000 = new ASTDerivationBody(JJTDERIVATIONBODY);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        LogicalExp();
        jj_consume_token(DERIVATION_OPER);
        LogicalExp();
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("DerivationBody");
    }
  }

  final public void OperatorExp() throws ParseException {
    trace_call("OperatorExp");
    try {
 /*@bgen(jjtree) OperatorExp */
  ASTOperatorExp jjtn000 = new ASTOperatorExp(JJTOPERATOREXP);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        if (jj_2_4(2)) {
          PathExp();
        } else {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case IDENTIFIER:
            FunctionExp();
            break;
          case INTEGER_LITERAL:
            jj_consume_token(INTEGER_LITERAL);
            break;
          case STRING_LITERAL:
            jj_consume_token(STRING_LITERAL);
            break;
          default:
            jj_la1[7] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("OperatorExp");
    }
  }

  final public void FunctionExp() throws ParseException {
    trace_call("FunctionExp");
    try {
 /*@bgen(jjtree) Function */
  ASTFunction jjtn000 = new ASTFunction(JJTFUNCTION);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        jj_consume_token(IDENTIFIER);
        jj_consume_token(1);
        Arguments();
        jj_consume_token(2);
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("FunctionExp");
    }
  }

  final public void Arguments() throws ParseException {
    trace_call("Arguments");
    try {
 /*@bgen(jjtree) Arguments */
  ASTArguments jjtn000 = new ASTArguments(JJTARGUMENTS);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INTEGER_LITERAL:
          jj_consume_token(INTEGER_LITERAL);
          break;
        case STRING_LITERAL:
          jj_consume_token(STRING_LITERAL);
          break;
        case IDENTIFIER:
          PathExp();
          break;
        default:
          jj_la1[8] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        label_5:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case 5:
            ;
            break;
          default:
            jj_la1[9] = jj_gen;
            break label_5;
          }
          jj_consume_token(5);
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case INTEGER_LITERAL:
            jj_consume_token(INTEGER_LITERAL);
            break;
          case STRING_LITERAL:
            jj_consume_token(STRING_LITERAL);
            break;
          case IDENTIFIER:
            PathExp();
            break;
          default:
            jj_la1[10] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      } catch (Throwable jjte000) {
    if (jjtc000) {
      jjtree.clearNodeScope(jjtn000);
      jjtc000 = false;
    } else {
      jjtree.popNode();
    }
    if (jjte000 instanceof RuntimeException) {
      {if (true) throw (RuntimeException)jjte000;}
    }
    if (jjte000 instanceof ParseException) {
      {if (true) throw (ParseException)jjte000;}
    }
    {if (true) throw (Error)jjte000;}
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("Arguments");
    }
  }

  final public void PathExp() throws ParseException {
    trace_call("PathExp");
    try {
 /*@bgen(jjtree) Path */
  ASTPath jjtn000 = new ASTPath(JJTPATH);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        jj_consume_token(IDENTIFIER);
        jj_consume_token(DOT);
        jj_consume_token(IDENTIFIER);
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("PathExp");
    }
  }

  final public void SignatureExp() throws ParseException {
    trace_call("SignatureExp");
    try {
 /*@bgen(jjtree) Signature */
  ASTSignature jjtn000 = new ASTSignature(JJTSIGNATURE);
  boolean jjtc000 = true;
  jjtree.openNodeScope(jjtn000);
      try {
        jj_consume_token(IDENTIFIER);
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case DOT:
            ;
            break;
          default:
            jj_la1[11] = jj_gen;
            break label_6;
          }
          jj_consume_token(DOT);
          jj_consume_token(IDENTIFIER);
        }
      } finally {
    if (jjtc000) {
      jjtree.closeNodeScope(jjtn000, true);
    }
      }
    } finally {
      trace_return("SignatureExp");
    }
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_3_3() {
    if (jj_3R_7()) return true;
    return false;
  }

  private boolean jj_3R_8() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(DOT)) return true;
    return false;
  }

  private boolean jj_3R_11() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(1)) return true;
    return false;
  }

  private boolean jj_3_2() {
    if (jj_scan_token(3)) return true;
    if (jj_scan_token(CHECK)) return true;
    return false;
  }

  private boolean jj_3_1() {
    if (jj_scan_token(3)) return true;
    if (jj_scan_token(NOT_EMPTY)) return true;
    return false;
  }

  private boolean jj_3R_7() {
    if (jj_3R_9()) return true;
    if (jj_scan_token(LOGIC_OPER)) return true;
    return false;
  }

  private boolean jj_3R_10() {
    if (jj_3R_11()) return true;
    return false;
  }

  private boolean jj_3R_9() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_4()) {
    jj_scanpos = xsp;
    if (jj_3R_10()) {
    jj_scanpos = xsp;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(32)) return true;
    }
    }
    }
    return false;
  }

  private boolean jj_3_4() {
    if (jj_3R_8()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public ParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[12];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x60000,0x20,0x20,0x20,0x20004000,0x60000,0x20000000,0x22000000,0x22000000,0x20,0x22000000,0x200000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x1,0x0,0x1,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[4];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Parser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Parser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jjtree.reset();
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[33];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 33; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  private int trace_indent = 0;
  private boolean trace_enabled = true;

/** Enable tracing. */
  final public void enable_tracing() {
    trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
    trace_enabled = false;
  }

  private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 4; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
