/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class Exp_SimplfalseAST extends Exp_SimplAST{
    public Exp_SimplfalseAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimplfalseAST(this, arg);
   }
}
