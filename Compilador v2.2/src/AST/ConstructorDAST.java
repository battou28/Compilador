/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ConstructorDAST extends BodyDecl_1AST{
    public ConstrDeclAST h1;
    public ConstructorDAST(ConstrDeclAST cd){
        super();
        this.h1 = cd;
    }
        
      public Object visit(Visitor v,Object arg) {
       return v.visitConstructorDAST(this, arg);
   } 
}
