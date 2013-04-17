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
public class TNamesAST extends TypeNamesAST{
    public TypeNamesAST h1;
    public Symbol id;
    public TNamesAST(Symbol i,TypeNamesAST tns){
        super();
        this.h1 = tns;
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitTNamesAST(this, arg);
   }
}
