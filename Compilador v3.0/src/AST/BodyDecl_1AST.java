/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public abstract class BodyDecl_1AST extends AST {
    public BodyDecl_1AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
