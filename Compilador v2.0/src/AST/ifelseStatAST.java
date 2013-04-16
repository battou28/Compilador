/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

import java.beans.Statement;

/**
 *
 * @author Battou
 */
public class ifelseStatAST extends StatementsAST{
    public String ifo;
    public ExpAST h1;
    public StatementAST h2;
    public ElseStatementAST h3;
    public ifelseStatAST(String i,ExpAST e, StatementAST s,ElseStatementAST es){
        super();
        this.h1 = e;
        this.h2 = s;
        this.h3 = es;
        this.ifo =i;
    }
}
