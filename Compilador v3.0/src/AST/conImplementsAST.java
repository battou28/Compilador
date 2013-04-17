/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class conImplementsAST extends ClassDecl_3AST{
    public conImplementsAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitconImplementsAST(this, arg);
   }
}
