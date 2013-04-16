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
    public String whileo;
    public ExpAST h1;
    public StatementAST h2; 
    public whileStatAST(String w,ExpAST e, StatementAST s){
        super();
        this.h1 = e;
        this.h2 = s;
        this.whileo = w;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitwhileStatAST(this, arg);
   }
}
