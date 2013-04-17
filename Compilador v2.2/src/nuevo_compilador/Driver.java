/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevo_compilador;

import java.io.*;
/**
 *
 * @author Jonnathan
 */
public class Driver {
    
    public static void parser_r(java_cup.runtime.Scanner s/*File text*/) {
       System.out.println("hola");
    //for (int i = 0; i < argv.length; i++) {
      try {
         // System.out.println(argv.length);
       // System.out.println("Proceso de parsing sobre el archivo ["+argv[i]+"]");
        //Scanner s = new Scanner(new FileReader(text));
        parser p = new parser(s);
        p.parse();
        
        System.out.println("No hay Errores!!!");
      }
      catch (Exception e) {
        e.printStackTrace(System.out);
        System.exit(1);
      }
    //}
  }
    
}
