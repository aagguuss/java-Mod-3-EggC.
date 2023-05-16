/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod3ejercicios;

import java.util.Scanner;

/**Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
 * restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
 * matemática y deben devolver sus resultados para imprimirlos en el main. 
 *
 * @author agust
 */
public class Javamod3ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     double num1= leer.nextInt(); 
     double num2= leer.nextInt();

     String opcion= leer.next();
     switch (opcion){
         case "suma":
        System.out.println(SUMA(num1,num2));
         case "divicion":
             System.out.println(divicion(num1,num2));
         case "multiplicacion":
             System.out.println(multiplicacion(num1,num2));
         case "resta": 
             System.out.println(resta(num1,num2));
     }
    }
    

public static double SUMA(double num1,double num2){
double resultado = num1+num2;
return resultado; 
}
public static double divicion(double num1,double num2){
double resultado = num1/num2;
return resultado;
        
}
public static double multiplicacion(double num1,double num2){
double resultado  = num1*num2;
return resultado;
}
public static double resta(double num1,double num2){
double resultado = num1-num2;
return resultado;
}


}