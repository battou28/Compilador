/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpDivisionAST extends OpAST{
    public OpDivisionAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpDivisionAST(this, arg);
   }
}
