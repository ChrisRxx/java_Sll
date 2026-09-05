/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;

/**
 *
 * @author chris
 */


public class Mavenproject2 {
    

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in) ;
        int op, suma, resta, mult, num1, num2;
        double x, y, div;
        
        System.out.println("===Calculadora===");
        System.out.println("1. Suma ");
        System.out.println("2. Resta ");
        System.out.println("3. Multiplicación ");
        System.out.println("4. División ");
        
        System.out.println("Seleccione la operacion a realizar ");
        op = entrada.nextInt();
        
        switch (op){
            case 1:
                System.out.println("A seleccionado la Suma " + "Digite el primer digito ");
                num1 = entrada.nextInt();
                System.out.println("Digite el segunto digito ");
                num2 = entrada.nextInt();
                suma = num1 + num2;
                System.out.println("La Suma es: " + suma);
            break;  
            
            case 2:
                System.out.println("A seleccionado la resta " + "Digite el primer digito ");
                num1 = entrada.nextInt();
                System.out.println("Digite el segunto digito ");
                num2 = entrada.nextInt();
                resta = num1 - num2;
                System.out.println("La Resta es: " + resta);
            break; 
            
            case 3:
                System.out.println("A seleccionado la multiplicación " + "Digite el primer digito ");
                num1 = entrada.nextInt();
                System.out.println("Digite el segunto digito ");
                num2 = entrada.nextInt();
                mult = num1 * num2;
                System.out.println("La Multiplicación es: " + mult);
            break;     
            
            case 4:
                System.out.println("A seleccionado la División " + "Digite el primer digito ");
                x = entrada.nextInt();
                System.out.println("Digite el segunto digito ");
                y = entrada.nextInt();
                div = x / y;
                System.out.println("La División es: " + div);
            break;  
            default:
                 System.out.print("La opción no es valida  ");
        }
        
    }
}       
