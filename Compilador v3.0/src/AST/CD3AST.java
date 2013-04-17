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
public class CD3AST extends ClassDecl_2AST{
    public ClassDecl_3AST h1;
    public Symbol id;
    public CD3AST(Symbol i,ClassDecl_3AST cd3){
        super();
        this.h1 = cd3;
        this.id = i;
    }
        
      public Object visit(Visitor v,Object arg) {
       return v.visitCD3AST(this, arg);
   } 
}
