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
public class Exp_SimplIdAST extends Exp_SimplAST {
    public Symbol id;
    public Exp_SimplIdAST(Symbol i){
        super();
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimplIdAST(this, arg);
   }
}
