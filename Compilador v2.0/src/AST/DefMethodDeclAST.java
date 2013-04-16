/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class DefMethodDeclAST extends MethodDeclAST{
    public String publico; 
    public IdVoidAST h1;
    public String id;
    public FormalListAST h2;
    public VarDeclsAST h3;
    public StatementsAST h4;
    public ReturnAST h5;
    
    public DefMethodDeclAST(String p,String i,IdVoidAST iv,FormalListAST fl,VarDeclsAST vd,StatementsAST s, ReturnAST r){
        super();
        this.h1 = iv;
        this.h2 = fl;
        this.h3 = vd;
        this.h4 = s;
        this.h5 = r;
        this.publico = p;
        this.id = i;
    }
}
