/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExpnewidAST extends Exp_SimplAST{
    public String nuevo;
    public String id;
    public ExpListAST h1;
    public ExpnewidAST(String n, String i, ExpListAST e){
        super();
        this.nuevo =n;
        this.id = i;
        this.h1 = e;
    }
}
