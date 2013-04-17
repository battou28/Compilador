/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class varExpListsAST extends ExpListsAST {
    public ExpAST h1;
    public ExpListsAST h2;
    public varExpListsAST(ExpAST e, ExpListsAST l){
        super();
        this.h1 = e;
        this.h2 = l;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitvarExpListsAST(this, arg);
   }
}
