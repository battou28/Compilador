/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class varStatAST extends StatementAST{
    public StatementsAST h1;
    public varStatAST(StatementsAST s){
        super();
        this.h1 = s;
    }
}
