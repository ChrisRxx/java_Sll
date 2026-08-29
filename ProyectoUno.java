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
public class ProyectoUno {

       public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in) ;
        String nombre; 
        String apellido;
        int edad;
        double altura;
      
        System.out.print("Digite su nombre") ;
        nombre = entrada.nextLine() ;
        
        System.out.print("Digite su apellido");
        apellido = entrada.nextLine();
                
        System.out.print ("Digite su edad") ;
        edad = entrada.nextInt() ;
        
        System.out.print ("Digite su altura");
        altura = entrada.nextDouble();
        
        
       System.out.println("Su nombre y apellido es:" + nombre + " " + apellido);
       System.out.println("Su edad es:"+edad);
       System.out.print("Su altura es:"+altura);
       
    
}
}
