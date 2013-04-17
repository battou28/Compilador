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
public class ExpReadAST extends Exp_DemasAST{
    public Symbol id;
    public ExpReadAST(Symbol i1){
        super();
        this.id = i1;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitExpReadAST(this, arg);
   } 
}
