/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asix_m03.prueba;
import java.util.Scanner;
/**
 *
 * @author Eric
 */
public class Num{
    /*2 maneras de hacerlo*/
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Adivina el numero");
        num = teclado.nextInt();
        /*1a*/
        String mensaje;

        if (num == 5){
            /*1a*/
            mensaje = ("correcto");
            /*2a*/
            /*System.out.println("Correcto");*/
        }else{
            /*1a*/
            mensaje = ("incorrecto");
            /*2a*/
          /*System.out.println("Incorrecto");*/
        }
        /*1a*/
        System.out.println(mensaje);
    }
}
