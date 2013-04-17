/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class conPuntoAsteriscoAST extends ImportDecl_1AST {
    public conPuntoAsteriscoAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitconPuntoAsteriscoAST(this, arg);
   }
}
