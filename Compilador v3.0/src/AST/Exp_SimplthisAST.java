/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class Exp_SimplthisAST {
    public Exp_SimplthisAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExp_SimplthisAST(this, arg);
   }
}
