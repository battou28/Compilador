/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class DefReturnAST extends ReturnAST{
    public String returno;
    public ExpAST h1;
    public String puntoycoma;
    public DefReturnAST(String r,String p,ExpAST e){
        super();
        this.h1 = e;
        this.returno = r;
        this.puntoycoma =p;
    }
}
