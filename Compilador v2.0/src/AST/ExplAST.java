/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AST;

/**
 *
 * @author Battou
 */
public class ExplAST extends ExpListAST {
   public ExpAST h1;
   public ExpListsAST h2;
   public ExplAST(ExpAST e, ExpListsAST l){
       super();
       this.h1 = e;
       this.h2 = l;
   }
}
