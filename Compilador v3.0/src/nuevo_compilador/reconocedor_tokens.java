/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo_compilador;
import java.io.*;
//import java_cup.runtime.*;

/**
 *
 * @author Jonnathan
 */

public class reconocedor_tokens {
    
    //public static java_cup.runtime.Scanner s;
    //Scanner s;
    public static void tokens(File text) throws Exception{
    try{
      Scanner s = new Scanner(new FileReader(text));
      parser p = new parser(s);
      if(Scanner.error.isEmpty()){
          System.out.println("asco...si entro");
          
          p.parse();
      }
      

    //java_cup.runtime.Symbol res;
     //Symbol res;
    /*do{
    res = s.next_token();
    
    //System.out.println(res.sym);
    }while(res.sym!=sym.EOF);*/

    }
    catch(IOException e){} 
    }
}
