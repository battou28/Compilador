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
public class CD2AST extends ClassDecl_1AST{
    public Symbol id;
    public ClassDecl_2AST h1;
    public CD2AST(Symbol i,ClassDecl_2AST cd2){
        super();
        this.h1 = cd2;
        this.id = i;
    }
        
    public Object visit(Visitor v,Object arg) {
       return v.visitCD2AST(this, arg);
   } 
}
