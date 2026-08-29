/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//*una tienda ofrece 10 de descuento cuantdo la compra es mayor a 100  SOLICITAR NOMBRE DEL CLIENTE, VALORE DE LA COMPRA, SIN LA COMPRA ES MAYOR O IGUAL A 100 DEBE CALCULAR EL DESCUENTO Y DAR EL VALOR,, SI NOEL CLIENTYE PAGA COMPLETO

package com.mycompany.mavenproject3;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class Mavenproject3 {

    public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in) ;
          
          String name;
            int vc ;      
             double vfin, vdes = 100.000 ;
          System.out.println("Bienvenid@ a la tienda oficial de Astronomic");
          System.out.println("Por el mes de agosto tendremos descuentos del 10% en compras mayores a $99.999");
          System.out.print("Por favor indique su nombre completo para la factura  ");
          name = entrada.nextLine();
          System.out.print("Indique el valor de su compra");
          vc = entrada.nextInt();
          if (vc >= vdes){
              vfin = vc - (0.10);
              
          }
          
       
    }
}
