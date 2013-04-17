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
    public ExpAST h1;
    public DefReturnAST(ExpAST e){
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitDefReturnAST(this, arg);
   } 
}
