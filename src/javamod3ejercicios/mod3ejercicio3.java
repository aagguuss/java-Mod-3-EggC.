/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamod3ejercicios;

import java.util.Scanner;

/**Crea una aplicación que a través de una función nos convierta una cantidad 
 * de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
 * la moneda a convertir que será una cadena, este no devolverá ningún valor
 * y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 *
 * @author agust
 */
public class mod3ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
         double moneda= leer.nextDouble();
         cambio(moneda);
    }
    public static void cambio(double moneda){
        System.out.println("su cambio e libras es de "+ (moneda*0.85));
         System.out.println("su cambio e pesos es de "+ (moneda*1.28611));
          System.out.println("su cambio e yenes es de "+ (moneda*129.852));
    }
}
