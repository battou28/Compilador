/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class TipoCuadrAST extends TiposAST{
    
    public ExpAST h1;
    
    public TipoCuadrAST(ExpAST e){
        super();
        this.h1 = e;
    }
}
