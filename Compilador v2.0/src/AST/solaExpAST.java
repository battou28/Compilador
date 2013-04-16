/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class solaExpAST extends Exp_DemasAST{
    public ExpAST  h1;
    public solaExpAST(ExpAST e){
        super();
        this.h1 = e;
    }
}
