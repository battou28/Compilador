/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class CD2AST extends ClassDecl_1AST{
    public String clase;
    public String id;
    public ClassDecl_2AST h1;
    public CD2AST(String c,String i,ClassDecl_2AST cd2){
        super();
        this.h1 = cd2;
        this.clase = c;
        this.id = i;
    }
        
    public Object visit(Visitor v,Object arg) {
       return v.visitCD2AST(this, arg);
   } 
}
