/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class VariableDAST extends BodyDecl_1AST{
    public VarDeclAST h1;
    public VariableDAST(VarDeclAST vd){
        super();
        this.h1 = vd;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitVariableDAST(this, arg);
   }
}
