/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpMenorqueAST extends OpAST{
    public OpMenorqueAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMenorqueAST(this, arg);
   }
}
