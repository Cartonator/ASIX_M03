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
public class Ejercicio1{
    
public static final float descuento = 10;
public static final float compra_min = 40;
public static void main (String[]args){
    Scanner lector = new Scanner(System.in);
        System.out.print("Quin és el preu del producte, en euros? ");
            float preu = lector.nextFloat();
                lector.nextLine();
    if (preu >= compra_min){
        float descompteFet = preu * descuento / 100;
            preu = preu - descompteFet;
    }
System.out.println("El preu final per pagar és de " + preu + " euros.");
}
}
   
    
