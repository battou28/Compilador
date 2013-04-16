/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class CD3AST extends ClassDecl_2AST{
    public ClassDecl_3AST h1;
    public String id;
    public CD3AST(String i,ClassDecl_3AST cd3){
        super();
        this.h1 = cd3;
        this.id = i;
    }
}
