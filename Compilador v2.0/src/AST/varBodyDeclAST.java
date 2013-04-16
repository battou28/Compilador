/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class varBodyDeclAST extends BodyDeclAST {
    public BodyDecl_1AST h1;
    public BodyDeclAST h2; 
    public varBodyDeclAST(BodyDecl_1AST bd1, BodyDeclAST bd){
        super();
        this.h1 = bd1;
        this.h2 = bd;
    }
}
