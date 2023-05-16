/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod3ejercicios;

import java.util.Scanner;

/**Diseñe una función que pida el nombre y la edad de N personas
 * e imprima los datos de las personas ingresadas por teclado 
 * e indique si son mayores o menores de edad. 
 * Después de cada persona, el programa debe preguntarle al usuario
 * si quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra “No”.

 *
 * @author agust
 */
public class mod3ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String corte = "si";
       do {
      String nombre =leer.next();
       int edad = leer.nextInt();
      escribir(nombre,edad);
         corte = leer.next();
       }while (!"no".equals(corte));
        
    }
    public static void escribir(String nombre,int edad){
        System.out.println(nombre+" "+edad);
    }
   
}
