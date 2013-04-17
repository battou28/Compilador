/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class conVoidAST extends IdVoidAST{
    public conVoidAST()
    {   
        super();
    }
     public Object visit(Visitor v,Object arg) {
       return v.visitconVoidAST(this, arg);
   }
}
