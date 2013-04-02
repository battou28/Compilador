/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;
import java.io.*;
//import java.util.Scanner;
//import compilador.Scanner;
//import java.util.Scanner;
/**
 *
 * @author Jonnathan
 */
/*public class reconocedor_tokens {
    public static void main(String args[]){
    try{
      Scanner s = new Scanner(new FileReader("prueba.txt"));

    Symbol res;
    do{
    res = s.nextToken();
    
    System.out.println(res.sym);
    }while(res.sym!=sym.EOF);

    }
    catch(IOException e){} 
    }
}*/

public class reconocedor_tokens {
    public static void tokens(File text){
    try{
      Scanner s = new Scanner(new FileReader(text));

    Symbol res;
    do{
    res = s.nextToken();
    
    //System.out.println(res.sym);
    }while(res.sym!=sym.EOF);

    }
    catch(IOException e){} 
    }
}
