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
    public String punto;
    public String length;
    public TipoLengthAST(String p,String l){
        super();
        this.punto = p;
        this.length =l;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitTipoLengthAST(this, arg);
   }
}
