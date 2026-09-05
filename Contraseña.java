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
        int clave;
        Scanner entrada = new Scanner (System.in) ;
        System.out.println("Digite la contaseña ");
        clave = entrada.nextInt();
        
        while (clave !=7162003){
            System.out.println("Contraseña incorrecta ");
            System.out.println("Digite la contraseña correcta ");
            clave = entrada.nextInt();
        }
        System.out.print("Acceso otorgado ");
    }
}
