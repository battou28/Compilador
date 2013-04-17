/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpMayorigualAST extends OpAST{
    public OpMayorigualAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpMayorigualAST(this, arg);
   }
}
