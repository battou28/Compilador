/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class varImportAST extends ImportDeclsAST {
    public ImportDeclsAST h1;
    public varImportAST h2;
    public varImportAST(ImportDeclsAST d , varImportAST s){
        super();
        this.h1 = d;
        this.h2 = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitvarImportAST(this, arg);
   }
}
