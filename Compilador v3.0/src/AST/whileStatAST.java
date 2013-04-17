/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class whileStatAST extends StatementAST{
    public ExpAST h1;
    public StatementAST h2; 
    public whileStatAST(ExpAST e, StatementAST s){
        super();
        this.h1 = e;
        this.h2 = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitwhileStatAST(this, arg);
   }
}
