/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject2 {

    public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in) ;
         
         int x, y, sum, rest, mult ;
         double div;
         String operacion ;
         
         System.out.print ("Digite el primer numero  ") ;
         x = entrada.nextInt();
         
         System.out.print ("Digite el segundo numero  ");
         y = entrada.nextInt();
         
         System.out.print ("¿Que operacion desea realizar? " + "  " + "+, -, * O /  ");
         operacion = entrada.next();
         
         if (operacion.equals("+")){
             sum = x + y ;
             System.out.print ("La suma es:  " + sum ); 
         } else if (operacion.equals ("-")){
             rest = x - y ;
             System.out.print ("La resta es:  " + rest);
         } else if (operacion.equals("*")){
             mult = x * y ;
             System.out.print ("La multiplicacion es:  " + mult);
             
         } else if (operacion.equals("/")){
             if (y != 0){
                div = x / y ;
             System.out.print ("La division es:  " + div); 
             }else{
                 System.out.print ("No se puede dividir por cero");
             }
           
             
                     
         }
         
         
            
         
    }
}
