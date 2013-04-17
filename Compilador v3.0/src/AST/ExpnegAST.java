/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExpnegAST extends Exp_SimplAST{
    public ExpAST h1;
    public ExpnegAST(ExpAST e){
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpnegAST(this, arg);
   }
}
