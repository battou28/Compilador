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
public class varTypeNameAST  extends TypeNameAST{
    public Symbol id;
    public TypeNamesAST h1;
    public varTypeNameAST(Symbol i,TypeNamesAST tn){
        super();
        this.h1 = tn;
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitvarTypeNameAST(this, arg);
   }
}
