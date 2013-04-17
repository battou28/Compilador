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
public class TipoListaAST extends TiposAST{
    public Symbol id;
    public ExpListAST h1; 
    public TipoListaAST(Symbol i,ExpListAST el){
        super();
        this.h1 = el;
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitTipoListaAST(this, arg);
   }
}
