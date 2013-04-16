/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class DefConstrAST extends ConstrDeclAST{
    public String publico;
    public String id;
    public FormalListAST h1;
    public VarDeclsAST h2;
    public StatementsAST h3;

    public DefConstrAST(String p,String i,FormalListAST fl,VarDeclsAST vd, StatementsAST s){
        super();
        this.h1 = fl;
        this.h2 = vd;
        this.h3 = s;
        this.publico = p;
        this.id = i;
    }
    
        
      public Object visit(Visitor v,Object arg) {
       return v.visitDefConstrAST(this, arg);
   } 
}
