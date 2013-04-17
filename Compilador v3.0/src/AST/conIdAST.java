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
public class conIdAST extends IdVoidAST{
    public Symbol id;
    public conIdAST(Symbol i){
        super();
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitconIdAST(this, arg);
   }
}
