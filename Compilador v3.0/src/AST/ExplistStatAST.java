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
public class ExplistStatAST extends StatementAST{
    public ThisIdAST h1; 
    public Symbol id;
    public ExpListAST h2;
    public ExplistStatAST(Symbol i,ThisIdAST t,ExpListAST el){
        super();
        this.h1 = t;
        this.h2 = el;
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExplistStatAST(this, arg);
   }
}