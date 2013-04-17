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
public class DefMainAST extends MainClassAST{
    public Symbol id1;
    //public String tString;
    public Symbol id2;
    public StatementAST h1;

    public DefMainAST(Symbol i1,Symbol i2,StatementAST s){
        super(); 
        this.h1 = s;
        this.id1 = i1;
        this.id2 = i2;
    }
    
        
    public Object visit(Visitor v,Object arg) {
       return v.visitDefMainAST(this, arg);
   } 
}
