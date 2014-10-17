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
public class nota {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Di tu nota");
        num = teclado.nextInt();
        String mensaje = null;
        if (num <= 10 && num >= 9) {
            mensaje = ("excelente");
        } else {
            if (num <= 8 && num >= 7) {
                mensaje = ("notable");
            } else {
                if (num == 6) {
                    mensaje = ("bien");
                } else {
                    if (num == 5) {
                        mensaje = ("suficiente");
                    } else {
                        if (num < 5 && num > 0) {
                            mensaje = ("suspenso");
                        }

                    }
                }
            } 
        }
        System.out.print(mensaje);
    }
}

       
