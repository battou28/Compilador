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
    public String elseo;
    public StatementAST h1;
    public elseStatAST(String e,StatementAST s){
        super();
        this.h1 = s;
        this.elseo = e;
    }
}
