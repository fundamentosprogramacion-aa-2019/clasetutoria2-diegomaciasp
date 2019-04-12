/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MiEjemplo3 {
      public static void main(String[] args) {
        // TODO code application logic here
        String nombrePersona; //Es la variable para almacenar un nombre
        String apellidoPersona; 
        String ciudad;
        int edad;
       
        Scanner entrada = new Scanner(System.in);//me permite ingresar info
        
        System.out.println("Ingrese su nombre:");
        nombrePersona = entrada.nextLine();
        System.out.println("Ingrese su apellido:");
        apellidoPersona = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        entrada.nextLine();//Esto es para limpiar el buffer de entrada 
        System.out.println("Ingrese su ciudad natal:");
        ciudad = entrada.nextLine();
          
               
        System.out.printf("Mi nombre es: %s\nMi apellido es: %s\nMi edad es: "
                + "%s\nMi ciudad natal es: %s",
                nombrePersona, apellidoPersona, edad, ciudad);
    }
}
