/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpSumaAST extends OpAST{
    public OpSumaAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpSumaAST(this, arg);
   }
}
