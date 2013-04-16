/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class exitStatAST extends StatementAST {
    public String system;
    public String punto;
    public String exit;
    public String numero;
    public String puntoycoma;
    public exitStatAST(String s,String p,String e,String n,String p2){
        super();
        this.system = s;
        this.punto = p;
        this.exit = e;
        this.numero = n;
        this.puntoycoma = p2;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitexitStatAST(this, arg);
   }
}
