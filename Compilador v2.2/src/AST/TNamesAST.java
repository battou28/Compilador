/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class TNamesAST extends TypeNamesAST{
    public TypeNamesAST h1;
    public String punto;
    public String id;
    public TNamesAST(String p, String i,TypeNamesAST tns){
        super();
        this.h1 = tns;
        this.punto =p;
        this.id = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitTNamesAST(this, arg);
   }
}
