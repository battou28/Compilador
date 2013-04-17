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
public class exitStatAST extends StatementAST {
    public Symbol numero;
    public exitStatAST(Symbol n){
        super();
        this.numero = n; 
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitexitStatAST(this, arg);
   }
}
