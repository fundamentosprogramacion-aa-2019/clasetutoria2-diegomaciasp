/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MiEjemplo4 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        String nombrePersona; //Es la variable para almacenar un nombre
        String apellidoPersona; 
        String ciudad;
        int edad;
        int nota1;
        int nota2;
        int promedio;
       
        Scanner entrada = new Scanner(System.in);//me permite ingresar info
        
        System.out.println("Ingrese sus nombres:");
        nombrePersona = entrada.nextLine();
        System.out.println("Ingrese sus apellidos:");
        apellidoPersona = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();
        System.out.println("Ingrese la nota #1:");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese la nota #2:");
        nota2 = entrada.nextInt();
        promedio = (nota1 + nota2)/2;
        entrada.nextLine();//Esto es para limpiar el buffer de entrada 
        System.out.println("Ingrese su ciudad natal:");
        ciudad = entrada.nextLine();
         
              
               
        System.out.printf("Mi nombre completo es: %s %s\nMi ciudad es: "
                + "%s\nMi edad es: %s\nMis notas son: %s , %s\nMi promedio es: "
                + "%s\n",
                nombrePersona, apellidoPersona, ciudad, edad, nota1, nota2,
                promedio);
    }
}
