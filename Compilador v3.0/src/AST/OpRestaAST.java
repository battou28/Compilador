/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpRestaAST extends OpAST {
    public OpRestaAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpRestaAST(this, arg);
   }
}
