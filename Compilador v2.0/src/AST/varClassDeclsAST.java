/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class varClassDeclsAST extends ClassDeclsAST {
    public ClassDeclAST h1;
    public ClassDeclsAST h2;
    public varClassDeclsAST(ClassDeclAST cd, ClassDeclsAST cds){
        super();
        this.h1 = cd;
        this.h2 = cds;
    }
}
