/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpDiferenteaAST extends OpAST {
    public OpDiferenteaAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpDiferenteaAST(this, arg);
   }
}
