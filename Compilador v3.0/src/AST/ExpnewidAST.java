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
public class ExpnewidAST extends Exp_SimplAST{
    public Symbol id;
    public ExpListAST h1;
    public ExpnewidAST(Symbol i, ExpListAST e){
        super();
        this.id = i;
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpnewidAST(this, arg);
   }
}
