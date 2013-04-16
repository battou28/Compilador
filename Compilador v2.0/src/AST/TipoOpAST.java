/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class TipoOpAST extends TiposAST {
    public OpAST h1;
    public ExpAST h2;
    public TipoOpAST(OpAST o, ExpAST e){
        super();
        this.h1 = o;
        this.h2 = e;
    }
}
