/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ImpClssMnAST extends ProgramAST  {
    public ImportDeclsAST h1;
    public ClassDeclsAST h2;
    public MainClassAST h3;
    public ImpClssMnAST(ImportDeclsAST i, ClassDeclsAST c, MainClassAST m){
       super();
       this.h1 = i;
       this.h2 = c;
       this.h3 = m;
    }
    /*
     public Object visit(Visitor v,Object arg) {
       return v.visitcondeclAST(this,arg);
   }
   * */
}
