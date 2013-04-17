/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class printlnStatAST extends StatementAST {
    public ExpAST h1;
    public printlnStatAST(ExpAST e){
        super();
        this.h1= e;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitprintlnStatAST(this, arg);
   }
}
