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
    public String pa;
    public conPuntoAsteriscoAST(String p){
        super();
        this.pa= p;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitconPuntoAsteriscoAST(this, arg);
   }
}
