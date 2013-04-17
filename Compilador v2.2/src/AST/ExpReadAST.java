/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExpReadAST extends Exp_DemasAST{
    public String id;
    public String systemo;
    public String punto1;
    public String in;
    public String punto2;
    public String read ;
    public ExpReadAST(String i1,String s,String p1,String i2, String p2,String r){
        super();
        this.id = i1;
        this.systemo = s;
        this.punto1 = p1;
        this.in = i2;
        this.punto2 = p2;
        this.read  = r;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitExpReadAST(this, arg);
   } 
}
