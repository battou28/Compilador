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
public class TididAST extends  VarDeclAST {
    public Symbol id1;
    public Symbol id2;;
    public TididAST(Symbol i1,Symbol i2){
        super();
        this.id1 = i1;
        this.id2 = i2;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitTididAST(this, arg);
   }
}
