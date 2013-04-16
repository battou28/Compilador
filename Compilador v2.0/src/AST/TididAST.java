/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class TididAST extends  VarDeclAST {
    public String id1;
    public String id2;
    public String pyc;
    public TididAST(String i1,String i2,String p){
        super();
        this.id1 = i1;
        this.id2 = i2;
        this.pyc = p;
    }
}
