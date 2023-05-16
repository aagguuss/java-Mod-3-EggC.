/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod3ejercicios;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class mod3test4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        boolean resultado = primo (num);
        if (resultado==true){
            System.out.println("Es un numero primo");
        } else System.out.println("No es un numero primo");
    
}
    public static boolean primo (int num) {
        boolean resultado=true;
        
        for (int i=2; i<num; i++) {
            if (num%i==0){
            resultado=false;
            break;
            }
        } 
        
        return resultado;
    }
}
    

