/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpMenorigualAST extends OpAST{
    public OpMenorigualAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMenorigualAST(this, arg);
   }
}
