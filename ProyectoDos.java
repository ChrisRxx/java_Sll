/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class ProyectoDos {
    
     public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in) ;
         
         int x, y, sum, rest, mult ;
         double div;
         String operacion ;
         
         System.out.print ("Digite el primer numero") ;
         x = entrada.nextInt();
         
         System.out.print ("Digite el segundo numero");
         y = entrada.nextInt();
         
         System.out.print ("¿Que operacion desea realizar?" + " " + "+, -, * O /");
         operacion = entrada.nextLine();
         
         if (operacion.equals("+")){
             sum = x + y ;
             System.out.print ("La suma es:" + sum );
         }
         
         
     }
    
    
}
