/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class varVarDeclsAST extends VarDeclsAST{
    public VarDeclAST h1;
    public VarDeclsAST h2;
    public varVarDeclsAST(VarDeclAST vd,VarDeclsAST vds){
        super();
        this.h1=vd;
        this.h2 = vds;
    }
}
