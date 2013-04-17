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
public class varFormalListsAST extends FormalListsAST {
    public Symbol id1;
    public Symbol id2;
    public FormalListsAST h1;
    public varFormalListsAST(Symbol i1,Symbol i2,FormalListsAST fls){
        super();
        this.h1 = fls;
        this.id1= i1;
        this.id2 = i2;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitvarFormalListsAST(this, arg);
   }
}
