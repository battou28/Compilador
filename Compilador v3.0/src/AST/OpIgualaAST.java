/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpIgualaAST extends OpAST{
    public OpIgualaAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpIgualaAST(this, arg);
   }
}
