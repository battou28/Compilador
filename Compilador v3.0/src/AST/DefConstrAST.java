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
public class DefConstrAST extends ConstrDeclAST{
    public Symbol id;
    public FormalListAST h1;
    public VarDeclsAST h2;
    public StatementsAST h3;

    public DefConstrAST(Symbol i,FormalListAST fl,VarDeclsAST vd, StatementsAST s){
        super();
        this.h1 = fl;
        this.h2 = vd;
        this.h3 = s;
        this.id = i;
    }
    
        
      public Object visit(Visitor v,Object arg) {
       return v.visitDefConstrAST(this, arg);
   } 
}
