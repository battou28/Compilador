/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class varStatementsAST extends StatementsAST{
    public StatementAST h1;
    public StatementsAST h2;
    public varStatementsAST(StatementAST s,StatementsAST ss){
        super();
        this.h1 = s;
        this.h2 = ss;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitvarStatementsAST(this, arg);
   }
}
