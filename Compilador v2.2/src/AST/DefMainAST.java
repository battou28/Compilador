/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class DefMainAST extends MainClassAST{
    public String clase;
    public String id1;

    public String publico;
    public String statico;
    public String voido;
    public String maino;

    public String tString;
    public String id2;
    public StatementAST h1;

    public DefMainAST(String c,String i1,String p,String st, String v, String m,String t,String i2,StatementAST s){
        super(); 
        this.h1 = s;
        this.clase = c;
        this.id1 = i1;
        this.publico = p;
        this.statico = st;
        this.voido = v;
        this.maino = m;
        this.tString = t;
        this.id2 = i2;
    }
    
        
    public Object visit(Visitor v,Object arg) {
       return v.visitDefMainAST(this, arg);
   } 
}
