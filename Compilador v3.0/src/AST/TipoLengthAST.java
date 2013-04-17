/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class TipoLengthAST extends TiposAST{
    public TipoLengthAST(){
        super();
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitTipoLengthAST(this, arg);
   }
}
