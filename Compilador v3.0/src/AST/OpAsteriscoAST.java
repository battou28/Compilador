/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpAsteriscoAST extends OpAST{
    public OpAsteriscoAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpAsteriscoAST(this, arg);
   }
}
