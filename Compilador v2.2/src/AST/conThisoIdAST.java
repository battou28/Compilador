/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class conThisoIdAST extends ThisIdAST{
    public String v_toks;
    public conThisoIdAST(String s){
        super();
        this.v_toks = s;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitconThisoIdAST(this, arg);
   }
}
