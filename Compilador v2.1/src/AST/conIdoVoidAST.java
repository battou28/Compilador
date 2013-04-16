/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class conIdoVoidAST extends IdVoidAST{
    public String v_toks;
    public conIdoVoidAST(String i){
        super();
        this.v_toks = i;
    }
    public Object visit(Visitor v,Object arg) {
       return v.visitconIdoVoidAST(this, arg);
   }
}
