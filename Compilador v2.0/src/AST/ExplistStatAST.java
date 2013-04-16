/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExplistStatAST extends StatementAST{
    public ThisIdAST h1; 
    public String punto;
    public String id;
    public ExpListAST h2;
    public ExplistStatAST(String p, String i,ThisIdAST t,ExpListAST el){
        super();
        this.h1 = t;
        this.h2 = el;
        this.punto = p;
        this.id = i;
    }
}