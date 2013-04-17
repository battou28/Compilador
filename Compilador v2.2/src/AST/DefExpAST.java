/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class DefExpAST extends ExpAST{
    public Exp_SimplAST h1;
    public Expr_IntAST h2;
    public DefExpAST(Exp_SimplAST es,Expr_IntAST ei){
        super();
        this.h1 = es;
        this.h2 = ei;
    }
    
        
    public Object visit(Visitor v,Object arg) {
       return v.visitDefExpAST(this, arg);
   } 
}
