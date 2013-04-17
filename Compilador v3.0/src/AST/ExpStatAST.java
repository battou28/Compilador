/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import com.sun.java_cup.internal.runtime.Symbol;

/**
 *
 * @author Battou
 */
public class ExpStatAST extends StatementAST {
    public Symbol id;
    public Cuad_ExpAST h1;
    public Exp_DemasAST h2;
    public ExpStatAST(Symbol i,Cuad_ExpAST ce,Exp_DemasAST ed){
        super();
        this.h1 = ce;
        this.h2 = ed;
        this.id = i;
        }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpStatAST(this, arg);
   } 
}
