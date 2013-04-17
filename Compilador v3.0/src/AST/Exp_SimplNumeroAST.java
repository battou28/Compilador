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
public class Exp_SimplNumeroAST  extends Exp_SimplAST{
    public Symbol numero;
    public Exp_SimplNumeroAST(Symbol n){
        super();
        this.numero = n;
    }
     public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimplNumeroAST(this, arg);
   }
}
