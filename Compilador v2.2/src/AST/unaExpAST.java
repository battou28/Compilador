/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class unaExpAST extends Cuad_ExpAST{
    public ExpAST h1;
    public unaExpAST(ExpAST e){
        super();
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitunaExpAST(this, arg);
   }
}
