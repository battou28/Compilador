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
public class asigStatAST extends StatementAST{
    public Symbol id;
    public Exp_DemasAST h1;
    public asigStatAST(Symbol i,Exp_DemasAST ed){
        super();
        this.h1 = ed;
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitasigStatAST(this, arg);
   }
}
