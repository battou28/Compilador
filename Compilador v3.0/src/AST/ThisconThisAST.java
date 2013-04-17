/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ThisconThisAST extends ThisIdAST {
    public ThisconThisAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitThisconThisAST(this, arg);
   }
}
