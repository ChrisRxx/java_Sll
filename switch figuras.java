/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject4 {

    public static void main(String[] args) { 
         int op;
         double pi = 3.1416 ;
         double area, perimetro, areacir, perimetrocir, areatri, perimetrotri ;
         double bsrec, altrrec, bstri, altrtri;
         double lado1, lado2, lado3 ;
         double radio, D, d, B, b, h;
          Scanner entrada = new Scanner (System.in) ;
          
          System.out.println("==MENÚ DE FIGURAS GEOMETRICAS==  ") ;
          System.out.println("1. Rectangulo ") ;
          System.out.println("2. Circulo ") ;
          System.out.println("3. Triangulo ") ;
          System.out.println("4. Rombo ") ;
          System.out.println("5. Trapecio ") ;
          
          System.out.println("Seleccione una figura");
          op = entrada.nextInt();
          
          switch (op){
              case 1: 
                    System.out.print("Ingrese la base del rectangulo  ");
                    bsrec = entrada.nextDouble();
                    System.out.print("Ingrese la altura del rectangulo  ");
                    altrrec = entrada.nextDouble();
                    area = bsrec * altrrec ;
                    perimetro = 2 * (bsrec + altrrec);
                    System.out.println ("El Area es: " + area);
                    System.out.println ("El Perimetro es: " + perimetro);
               break;
                    
                case 2: 
                    System.out.print("Ingrese el radio del circulo  ");
                    radio = entrada.nextDouble();                  
                    areacir = pi * (radio * radio) ;
                    perimetrocir = 2 * (pi * radio);
                    System.out.println ("El Area es: " + areacir);
                    System.out.println ("El Perimetro es: " + perimetrocir); 
                break;
                 
                case 3: 
                    System.out.print("Ingrese la base del triangulo  ");
                    bstri = entrada.nextDouble(); 
                    System.out.print("Ingrese la altura del triangulo5 ");
                    altrtri = entrada.nextDouble();
                    System.out.print("Ingrese el lado 1  ");
                    lado1 = entrada.nextDouble();
                    System.out.print("Ingrese el lado 2  ");
                    lado2 = entrada.nextDouble();
                    System.out.print("Ingrese el lado 3  ");
                    lado3 = entrada.nextDouble();
                    areatri = (bstri * altrtri)/2;
                    perimetrotri = lado1 + lado2 + lado3 ;
                    System.out.println ("El Area es: " + areatri);
                    System.out.println ("El Perimetro es: " + perimetrotri);
                break;
                 
                case 4: 
                    System.out.print("Ingrese la diagonal mayor  ");
                    D = entrada.nextDouble();
                    System.out.print("Ingrese la diagonal menor  ");
                    d = entrada.nextDouble();
                    System.out.print("Ingrese el valor de uno de los lados  ");
                    lado1 = entrada.nextDouble();
                    area = (D * d)/2;
                    perimetro = 4 * lado1;
                    System.out.println ("El Area es: " + area);
                    System.out.println ("El Perimetro es: " + perimetro);  
                break; 
                
                case 5: 
                    System.out.print("Ingrese la base mayor ");
                    B = entrada.nextDouble(); 
                    System.out.print("Ingrese la base menor ");
                    b = entrada.nextDouble();
                    System.out.print("Ingrese la altura  ");
                    h = entrada.nextDouble();
                    System.out.print("Ingrese el lado lateral 1  ");
                    lado1 = entrada.nextDouble();
                    System.out.print("Ingrese el lado lateral 2   ");
                    lado2 = entrada.nextDouble();
                    area = ((B + b) * h)/2;
                    perimetro = B + b + lado1 + lado2 ;
                    System.out.println ("El Area es: " + area);
                    System.out.println ("El Perimetro es: " + perimetro);
                break;
                            
              default:
                 System.out.print("La opción no es valida  "); 
                     
             }
                
             
    }
}
