/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class tipExpAST extends Expr_IntAST{
    public TiposAST h1;
    public Expr_IntAST h2;
    public tipExpAST(TiposAST t, Expr_IntAST e){
        super();
        this.h1 = t;
        this.h2 = e;
    }
}
