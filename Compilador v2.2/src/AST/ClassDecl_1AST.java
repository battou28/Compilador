/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public abstract class ClassDecl_1AST extends AST {
    //Epsilon
    public ClassDecl_1AST(){
        super();
    }
    public abstract Object visit(Visitor v,Object arg);
}
