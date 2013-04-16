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
    public String puntoycoma2;
    public exitStatAST(String s,String p,String e,String n,String p2 ,String p3){
        super();
        this.system = s;
        this.punto = p;
        this.exit = e;
        this.numero = n;
        this.puntoycoma = p2;
        this.puntoycoma2 = p3;
    }
}
