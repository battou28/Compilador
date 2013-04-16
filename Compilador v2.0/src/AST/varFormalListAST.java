/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class varFormalListAST extends FormalListAST {
    public String id1;
    public String id2;
    public FormalListsAST h1;
    public varFormalListAST(String i1,String i2,FormalListsAST fls){
        super();
        this.h1 = fls;
        this.id1 = i1;
        this.id2 = i2;
    }
}
