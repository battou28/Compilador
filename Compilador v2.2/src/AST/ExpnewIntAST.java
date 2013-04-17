/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExpnewIntAST extends Exp_SimplAST {
    public String nuevo;
    public String numero;
    public ExpAST h1;
    public ExpnewIntAST(String nv, String nm, ExpAST e){
        super();
        this.nuevo = nv;
        this.numero = nm;
        this.h1 = e;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitExpnewIntAST(this, arg);
   }
}
