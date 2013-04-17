/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpMayorqueAST extends OpAST{
    public OpMayorqueAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMayorqueAST(this, arg);
   }
}
