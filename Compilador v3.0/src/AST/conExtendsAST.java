/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class conExtendsAST extends ClassDecl_3AST{
    public conExtendsAST(){
        super();
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitconExtendsAST(this, arg);
   }
}
