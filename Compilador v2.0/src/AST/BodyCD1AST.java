/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class BodyCD1AST extends ClassDeclAST {
    public ClassDecl_1AST h1;
    public BodyDeclAST h2;
    public BodyCD1AST(ClassDecl_1AST cd1,BodyDeclAST bd){
        super();
        this.h1=cd1;
        this.h2 = bd;
    }
}
