/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class elseStatAST extends ElseStatementAST{
    public StatementAST h1;
    public elseStatAST(StatementAST s){
        super();
        this.h1 = s;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitelseStatAST(this, arg);
   }
}
