/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpOrAST extends OpAST{
    public OpOrAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpOrAST(this, arg);
   }
}
