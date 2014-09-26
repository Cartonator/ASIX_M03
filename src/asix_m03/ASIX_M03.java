/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asix_m03;
import java.util.Scanner;
/**
 *
 * @author Eric
 */
public class ASIX_M03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 4;
        int n2 = 5;
        int resultado;
        resultado = n1 + n2;
                
        System.out.println("resultado " + resultado);
        
       
      
      Scanner teclado = new Scanner(System.in);
     
      System.out.println("introduce el primer numero");
      n1 = teclado.nextInt();
      System.out.println("introduce el segundo numero");
      n2 = teclado.nextInt();
      resultado = n1 + n2;
      System.out.println("el resultado es:" + resultado);
      if (n1 + n2 == resultado) 
          System.out.println("correcte");
      else {
          System.out.println("error");
      }        
    }
    
}
