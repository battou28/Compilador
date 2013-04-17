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
public class Exp_SimplStringAST extends Exp_SimplAST{
    public Symbol string1;
    public Exp_SimplStringAST(Symbol s){
        super();
        this.string1 = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimplStringAST(this, arg);
   }
}
