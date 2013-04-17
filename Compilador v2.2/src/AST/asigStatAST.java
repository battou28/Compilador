/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class asigStatAST extends StatementAST{
    public String id;
    public String igual;
    public Exp_DemasAST h1;
    public String puntoycoma;
    public asigStatAST(String i, String ig,String p ,Exp_DemasAST ed){
        super();
        this.h1 = ed;
        this.id = i;
        this.igual = ig;
        this.puntoycoma = p;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitasigStatAST(this, arg);
   }
}
