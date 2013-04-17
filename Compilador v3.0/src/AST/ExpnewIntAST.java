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
public class ExpnewIntAST extends Exp_SimplAST {
    public Symbol numero;
    public ExpAST h1;
    public ExpnewIntAST(Symbol nm, ExpAST e){
        super();       
        this.numero = nm;
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpnewIntAST(this, arg);
   }
}
