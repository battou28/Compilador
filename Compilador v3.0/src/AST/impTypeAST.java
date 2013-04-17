/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class impTypeAST extends ImportDeclAST{
    public TypeNameAST h1;
    public ImportDecl_1AST h2;
    
    public impTypeAST(TypeNameAST tn,ImportDecl_1AST imp1){
        super();
        this.h1 = tn;
        this.h2 = imp1;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitimpTypeAST(this, arg);
   }
}
