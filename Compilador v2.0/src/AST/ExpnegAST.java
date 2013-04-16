/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExpnegAST extends Exp_SimplAST{
    public String neg;
    public ExpAST h1;
    public ExpnegAST(String n, ExpAST e){
        super();
        this.neg = n;
        this.h1 = e;
    }
}
