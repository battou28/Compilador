/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class Exp_SimpltrueAST extends Exp_SimplAST{
    public Exp_SimpltrueAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimpltrueAST(this, arg);
   }
}
