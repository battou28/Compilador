/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExpredAST extends Exp_SimplAST{
    public ExpAST h1;
    public ExpredAST(ExpAST e){
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpredAST(this, arg);
   }
}
