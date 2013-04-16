/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class TipoListaAST extends TiposAST{
    public String punto;
    public String id;
    public ExpListAST h1; 
    public TipoListaAST(String p,String i,ExpListAST el){
        super();
        this.h1 = el;
        this.punto = p;
        this.id = i;
    }
}
