/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asix_m03;

/**
 *
 * @author Eric
 */
public class progama_ejemplo { 
    public static void main(String[] args){ 
       boolean a = true;
       boolean b = false;
       boolean c = false;
        boolean luz1;
        boolean luz2;
        
        luz1 = (!a && !b && c) || (!a && b && !c) || (a && !b && !c) || (a && b && c);
        if (luz1 == true) {
            System.out.println("luz1 esta encendido");
           } else {
            System.out.println("luz1 esta apagado");
        }
    }
    
}

