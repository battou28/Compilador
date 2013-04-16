/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class OpTAST extends OpAST{
    public String v_toks;
    public OpTAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitOpTAST(this, arg);
   }
}
