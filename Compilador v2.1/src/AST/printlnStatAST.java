/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class printlnStatAST extends StatementAST {
    public String systemo;
    public String punto;
    public String outo;
    public String punto2;
    public String printlno;
    public ExpAST h1;
    public String puntoycoma;
    public printlnStatAST(String s,String p ,String o,String p2,String p3,String p4,ExpAST e){
        super();
        this.h1= e;
        this.systemo = s;
        this.punto = p;
        this.outo = o;
        this.punto2 = p2;
        this.printlno = p3;
        this.puntoycoma = p4;
    }
    
    public Object visit(Visitor v,Object arg) {
       return v.visitprintlnStatAST(this, arg);
   }
}
