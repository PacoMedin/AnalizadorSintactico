
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Tue Sep 03 21:55:41 CDT 2019
//----------------------------------------------------

package Codigo;

import java_cup.runtime.Symbol;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Tue Sep 03 21:55:41 CDT 2019
  */
public class Sintax extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public Sintax() {super();}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Sintax(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\055\000\002\002\004\000\002\002\011\000\002\002" +
    "\010\000\002\002\003\000\002\003\004\000\002\003\003" +
    "\000\002\003\004\000\002\003\003\000\002\003\004\000" +
    "\002\003\003\000\002\003\004\000\002\003\003\000\002" +
    "\003\005\000\002\003\004\000\002\003\003\000\002\004" +
    "\005\000\002\004\007\000\002\004\007\000\002\004\006" +
    "\000\002\004\006\000\002\004\005\000\002\004\007\000" +
    "\002\004\007\000\002\004\006\000\002\004\006\000\002" +
    "\004\010\000\002\004\010\000\002\004\011\000\002\004" +
    "\011\000\002\006\011\000\002\013\003\000\002\013\005" +
    "\000\002\013\005\000\002\013\005\000\002\013\006\000" +
    "\002\013\007\000\002\007\015\000\002\010\011\000\002" +
    "\011\013\000\002\012\011\000\002\014\012\000\002\014" +
    "\011\000\002\005\005\000\002\005\004\000\002\005\004" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\212\000\020\006\013\007\016\010\011\011\007\014" +
    "\005\015\020\036\021\001\002\000\024\002\ufff6\006\ufff6" +
    "\007\ufff6\010\ufff6\011\ufff6\013\ufff6\014\ufff6\015\ufff6\033" +
    "\ufff6\001\002\000\004\030\207\001\002\000\024\002\ufff3" +
    "\006\ufff3\007\ufff3\010\ufff3\011\ufff3\013\ufff3\014\ufff3\015" +
    "\ufff3\033\ufff3\001\002\000\004\030\175\001\002\000\024" +
    "\002\ufffc\006\ufffc\007\ufffc\010\ufffc\011\ufffc\013\ufffc\014" +
    "\ufffc\015\ufffc\033\ufffc\001\002\000\004\040\156\001\002" +
    "\000\004\002\155\001\002\000\006\026\141\040\140\001" +
    "\002\000\024\002\ufff8\006\ufff8\007\ufff8\010\ufff8\011\ufff8" +
    "\013\ufff8\014\ufff8\015\ufff8\033\ufff8\001\002\000\024\002" +
    "\ufffa\006\ufffa\007\ufffa\010\ufffa\011\ufffa\013\ufffa\014\ufffa" +
    "\015\ufffa\033\ufffa\001\002\000\010\026\062\036\132\040" +
    "\063\001\002\000\022\002\ufffe\006\013\007\025\010\011" +
    "\011\007\013\033\014\005\015\020\001\002\000\004\030" +
    "\077\001\002\000\004\030\022\001\002\000\004\031\023" +
    "\001\002\000\004\032\024\001\002\000\016\006\013\007" +
    "\025\010\011\011\007\014\005\015\020\001\002\000\006" +
    "\026\062\040\063\001\002\000\022\006\013\007\025\010" +
    "\011\011\007\013\033\014\005\015\020\033\035\001\002" +
    "\000\024\002\ufff7\006\ufff7\007\ufff7\010\ufff7\011\ufff7\013" +
    "\ufff7\014\ufff7\015\ufff7\033\ufff7\001\002\000\024\002\ufff4" +
    "\006\ufff4\007\ufff4\010\ufff4\011\ufff4\013\ufff4\014\ufff4\015" +
    "\ufff4\033\ufff4\001\002\000\024\002\ufffd\006\ufffd\007\ufffd" +
    "\010\ufffd\011\ufffd\013\ufffd\014\ufffd\015\ufffd\033\ufffd\001" +
    "\002\000\024\002\ufff9\006\ufff9\007\ufff9\010\ufff9\011\ufff9" +
    "\013\ufff9\014\ufff9\015\ufff9\033\ufff9\001\002\000\004\032" +
    "\040\001\002\000\024\002\ufffb\006\ufffb\007\ufffb\010\ufffb" +
    "\011\ufffb\013\ufffb\014\ufffb\015\ufffb\033\ufffb\001\002\000" +
    "\004\002\uffff\001\002\000\004\013\033\001\002\000\024" +
    "\002\ufff5\006\ufff5\007\ufff5\010\ufff5\011\ufff5\013\ufff5\014" +
    "\ufff5\015\ufff5\033\ufff5\001\002\000\016\006\013\007\025" +
    "\010\011\011\007\014\005\015\020\001\002\000\022\006" +
    "\013\007\025\010\011\011\007\013\033\014\005\015\020" +
    "\033\042\001\002\000\004\014\043\001\002\000\004\030" +
    "\044\001\002\000\006\027\046\040\047\001\002\000\004" +
    "\031\060\001\002\000\006\031\uffe3\037\uffe3\001\002\000" +
    "\004\024\050\001\002\000\012\005\052\027\053\040\054" +
    "\041\051\001\002\000\006\031\uffe1\037\uffe1\001\002\000" +
    "\006\005\055\040\056\001\002\000\006\031\uffe2\037\uffe2" +
    "\001\002\000\006\031\uffe0\037\uffe0\001\002\000\006\031" +
    "\uffdf\037\uffdf\001\002\000\004\005\057\001\002\000\006" +
    "\031\uffde\037\uffde\001\002\000\004\037\061\001\002\000" +
    "\024\002\uffdb\006\uffdb\007\uffdb\010\uffdb\011\uffdb\013\uffdb" +
    "\014\uffdb\015\uffdb\033\uffdb\001\002\000\004\040\075\001" +
    "\002\000\012\016\067\025\064\026\066\037\065\001\002" +
    "\000\004\041\073\001\002\000\024\002\ufff2\006\ufff2\007" +
    "\ufff2\010\ufff2\011\ufff2\013\ufff2\014\ufff2\015\ufff2\033\ufff2" +
    "\001\002\000\004\037\072\001\002\000\004\041\070\001" +
    "\002\000\004\037\071\001\002\000\024\002\ufff0\006\ufff0" +
    "\007\ufff0\010\ufff0\011\ufff0\013\ufff0\014\ufff0\015\ufff0\033" +
    "\ufff0\001\002\000\024\002\uffef\006\uffef\007\uffef\010\uffef" +
    "\011\uffef\013\uffef\014\uffef\015\uffef\033\uffef\001\002\000" +
    "\004\037\074\001\002\000\024\002\ufff1\006\ufff1\007\ufff1" +
    "\010\ufff1\011\ufff1\013\ufff1\014\ufff1\015\ufff1\033\ufff1\001" +
    "\002\000\004\037\076\001\002\000\024\002\uffee\006\uffee" +
    "\007\uffee\010\uffee\011\uffee\013\uffee\014\uffee\015\uffee\033" +
    "\uffee\001\002\000\006\006\101\040\102\001\002\000\004" +
    "\031\126\001\002\000\004\040\117\001\002\000\004\016" +
    "\103\001\002\000\004\041\104\001\002\000\004\037\105" +
    "\001\002\000\006\027\046\040\047\001\002\000\004\037" +
    "\107\001\002\000\006\026\111\040\112\001\002\000\004" +
    "\031\uffd8\001\002\000\004\040\116\001\002\000\006\025" +
    "\113\026\114\001\002\000\004\041\115\001\002\000\004" +
    "\031\uffd6\001\002\000\004\031\uffd7\001\002\000\004\031" +
    "\uffd5\001\002\000\004\016\120\001\002\000\004\041\121" +
    "\001\002\000\004\037\122\001\002\000\006\027\046\040" +
    "\047\001\002\000\004\037\124\001\002\000\006\026\111" +
    "\040\112\001\002\000\004\031\uffd9\001\002\000\004\032" +
    "\127\001\002\000\016\006\013\007\025\010\011\011\007" +
    "\014\005\015\020\001\002\000\022\006\013\007\025\010" +
    "\011\011\007\013\033\014\005\015\020\033\131\001\002" +
    "\000\024\002\uffda\006\uffda\007\uffda\010\uffda\011\uffda\013" +
    "\uffda\014\uffda\015\uffda\033\uffda\001\002\000\004\030\133" +
    "\001\002\000\004\031\134\001\002\000\004\032\135\001" +
    "\002\000\016\006\013\007\025\010\011\011\007\014\005" +
    "\015\020\001\002\000\022\006\013\007\025\010\011\011" +
    "\007\013\033\014\005\015\020\033\137\001\002\000\004" +
    "\002\000\001\002\000\012\016\147\025\144\026\146\037" +
    "\145\001\002\000\004\040\142\001\002\000\004\037\143" +
    "\001\002\000\024\002\uffe9\006\uffe9\007\uffe9\010\uffe9\011" +
    "\uffe9\013\uffe9\014\uffe9\015\uffe9\033\uffe9\001\002\000\004" +
    "\041\153\001\002\000\024\002\uffed\006\uffed\007\uffed\010" +
    "\uffed\011\uffed\013\uffed\014\uffed\015\uffed\033\uffed\001\002" +
    "\000\004\037\152\001\002\000\004\041\150\001\002\000" +
    "\004\037\151\001\002\000\024\002\uffeb\006\uffeb\007\uffeb" +
    "\010\uffeb\011\uffeb\013\uffeb\014\uffeb\015\uffeb\033\uffeb\001" +
    "\002\000\024\002\uffea\006\uffea\007\uffea\010\uffea\011\uffea" +
    "\013\uffea\014\uffea\015\uffea\033\uffea\001\002\000\004\037" +
    "\154\001\002\000\024\002\uffec\006\uffec\007\uffec\010\uffec" +
    "\011\uffec\013\uffec\014\uffec\015\uffec\033\uffec\001\002\000" +
    "\004\002\001\001\002\000\006\016\160\025\157\001\002" +
    "\000\004\005\167\001\002\000\004\005\161\001\002\000" +
    "\006\005\162\040\163\001\002\000\004\037\166\001\002" +
    "\000\004\005\164\001\002\000\004\037\165\001\002\000" +
    "\024\002\uffe5\006\uffe5\007\uffe5\010\uffe5\011\uffe5\013\uffe5" +
    "\014\uffe5\015\uffe5\033\uffe5\001\002\000\024\002\uffe7\006" +
    "\uffe7\007\uffe7\010\uffe7\011\uffe7\013\uffe7\014\uffe7\015\uffe7" +
    "\033\uffe7\001\002\000\006\005\170\040\171\001\002\000" +
    "\004\037\174\001\002\000\004\005\172\001\002\000\004" +
    "\037\173\001\002\000\024\002\uffe6\006\uffe6\007\uffe6\010" +
    "\uffe6\011\uffe6\013\uffe6\014\uffe6\015\uffe6\033\uffe6\001\002" +
    "\000\024\002\uffe8\006\uffe8\007\uffe8\010\uffe8\011\uffe8\013" +
    "\uffe8\014\uffe8\015\uffe8\033\uffe8\001\002\000\006\027\046" +
    "\040\047\001\002\000\004\031\177\001\002\000\004\032" +
    "\200\001\002\000\016\006\013\007\025\010\011\011\007" +
    "\014\005\015\020\001\002\000\022\006\013\007\025\010" +
    "\011\011\007\013\033\014\005\015\020\033\202\001\002" +
    "\000\026\002\uffe4\006\uffe4\007\uffe4\010\uffe4\011\uffe4\012" +
    "\203\013\uffe4\014\uffe4\015\uffe4\033\uffe4\001\002\000\004" +
    "\032\204\001\002\000\016\006\013\007\025\010\011\011" +
    "\007\014\005\015\020\001\002\000\022\006\013\007\025" +
    "\010\011\011\007\013\033\014\005\015\020\033\206\001" +
    "\002\000\024\002\uffdd\006\uffdd\007\uffdd\010\uffdd\011\uffdd" +
    "\013\uffdd\014\uffdd\015\uffdd\033\uffdd\001\002\000\006\027" +
    "\046\040\047\001\002\000\004\031\211\001\002\000\004" +
    "\032\212\001\002\000\016\006\013\007\025\010\011\011" +
    "\007\014\005\015\020\001\002\000\022\006\013\007\025" +
    "\010\011\011\007\013\033\014\005\015\020\033\214\001" +
    "\002\000\024\002\uffdc\006\uffdc\007\uffdc\010\uffdc\011\uffdc" +
    "\013\uffdc\014\uffdc\015\uffdc\033\uffdc\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\212\000\020\002\011\003\016\004\007\006\014\007" +
    "\013\010\003\012\005\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\016\004\030\006\033\007\031\010\026\011\035\012\027" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\016\003\025\004\007\006\014" +
    "\007\013\010\003\012\005\001\001\000\002\001\001\000" +
    "\016\004\030\006\033\007\031\010\026\011\035\012\027" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\011\036\001\001\000\002\001" +
    "\001\000\016\003\040\004\007\006\014\007\013\010\003" +
    "\012\005\001\001\000\016\004\030\006\033\007\031\010" +
    "\026\011\035\012\027\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\013\044\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\014\077\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\013\105\001" +
    "\001\000\002\001\001\000\004\005\107\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\013\122\001\001\000\002\001\001\000\004\005\124" +
    "\001\001\000\002\001\001\000\002\001\001\000\016\003" +
    "\127\004\007\006\014\007\013\010\003\012\005\001\001" +
    "\000\016\004\030\006\033\007\031\010\026\011\035\012" +
    "\027\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\016\003\135\004\007\006" +
    "\014\007\013\010\003\012\005\001\001\000\016\004\030" +
    "\006\033\007\031\010\026\011\035\012\027\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\013\175\001\001\000\002\001\001\000" +
    "\002\001\001\000\016\003\200\004\007\006\014\007\013" +
    "\010\003\012\005\001\001\000\016\004\030\006\033\007" +
    "\031\010\026\011\035\012\027\001\001\000\002\001\001" +
    "\000\002\001\001\000\016\003\204\004\007\006\014\007" +
    "\013\010\003\012\005\001\001\000\016\004\030\006\033" +
    "\007\031\010\026\011\035\012\027\001\001\000\002\001" +
    "\001\000\004\013\207\001\001\000\002\001\001\000\002" +
    "\001\001\000\016\003\212\004\007\006\014\007\013\010" +
    "\003\012\005\001\001\000\016\004\030\006\033\007\031" +
    "\010\026\011\035\012\027\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Sintax$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Sintax$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Sintax$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    private Symbol s;
    
    public void syntax_error(Symbol s){
       
        this.s = s;

    }
   

    public Symbol getS(){
        return this.s;
}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$Sintax$actions {
  private final Sintax parser;

  /** Constructor */
  CUP$Sintax$actions(Sintax parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$Sintax$do_action(
    int                        CUP$Sintax$act_num,
    java_cup.runtime.lr_parser CUP$Sintax$parser,
    java.util.Stack            CUP$Sintax$stack,
    int                        CUP$Sintax$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Sintax$result;

      /* select the action based on the action number */
      switch (CUP$Sintax$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // DECLARACION_FOR ::= Op_incremento Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // DECLARACION_FOR ::= Identificador Op_incremento 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // DECLARACION_FOR ::= Identificador Op_atribucion Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION_FOR",3, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // SENTENCIA_FOR ::= Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // SENTENCIA_FOR ::= T_dato Identificador Igual Numero P_coma SENTENCIA_BOOLEANA P_coma DECLARACION_FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_FOR",10, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-7)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // FOR ::= For Parentesis_a SENTENCIA_FOR Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("FOR",8, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // DO_WHILE ::= Do Llave_a SENTENCIA Llave_c While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DO_WHILE",7, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-8)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // WHILE ::= While Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("WHILE",6, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // IF_ELSE ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c Else Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF_ELSE",5, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-10)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Identificador Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Comillas Comillas 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Identificador 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Numero 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // SENTENCIA_BOOLEANA ::= Identificador Op_relacional Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // SENTENCIA_BOOLEANA ::= Op_booleano 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA_BOOLEANA",9, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // IF ::= If Parentesis_a SENTENCIA_BOOLEANA Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("IF",4, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // DECLARACION ::= Cadena Identificador Igual Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Identificador Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // DECLARACION ::= Cadena Identificador Igual Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // DECLARACION ::= Cadena Identificador Op_atribucion Comillas Comillas P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // DECLARACION ::= T_dato Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // DECLARACION ::= T_dato Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // DECLARACION ::= T_dato Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // DECLARACION ::= T_dato Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // DECLARACION ::= T_dato Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // DECLARACION ::= Int Op_incremento Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // DECLARACION ::= Int Identificador Op_incremento P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-3)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // DECLARACION ::= Int Identificador Igual Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // DECLARACION ::= Int Identificador Op_atribucion Numero P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-4)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // DECLARACION ::= Int Identificador P_coma 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("DECLARACION",2, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // SENTENCIA ::= FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // SENTENCIA ::= SENTENCIA FOR 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // SENTENCIA ::= SENTENCIA DO_WHILE DO_WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-2)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // SENTENCIA ::= WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // SENTENCIA ::= SENTENCIA WHILE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // SENTENCIA ::= IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // SENTENCIA ::= SENTENCIA IF_ELSE 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // SENTENCIA ::= IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // SENTENCIA ::= SENTENCIA IF 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // SENTENCIA ::= DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // SENTENCIA ::= SENTENCIA DECLARACION 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("SENTENCIA",1, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INICIO ::= SENTENCIA 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INICIO ::= Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-5)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= Int Main Parentesis_a Parentesis_c Llave_a SENTENCIA Llave_c 
            {
              Object RESULT =null;

              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-6)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          return CUP$Sintax$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)).value;
		RESULT = start_val;
              CUP$Sintax$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Sintax$stack.elementAt(CUP$Sintax$top-1)), ((java_cup.runtime.Symbol)CUP$Sintax$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Sintax$parser.done_parsing();
          return CUP$Sintax$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

