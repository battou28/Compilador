/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExpStatAST extends StatementAST {
    public String id;
    public Cuad_ExpAST h1;
    public String igual;
    public Exp_DemasAST h2; 
    public String puntoycoma;
    public ExpStatAST(String i, String ig, String p,Cuad_ExpAST ce,Exp_DemasAST ed){
        super();
        this.h1 = ce;
        this.h2 = ed;
        this.id = i;
        this.igual = ig;
        this.puntoycoma = p;
    }
}
