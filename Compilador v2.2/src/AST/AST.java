/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public abstract class AST {
    public AST(){
        
    }
    public abstract Object visit(Visitor v,Object arg);
}
