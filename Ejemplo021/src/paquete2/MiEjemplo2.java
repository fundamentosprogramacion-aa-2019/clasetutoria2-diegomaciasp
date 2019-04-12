/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author Usuario
 */
public class MiEjemplo2 {
      public static void main(String[] args) {
        // TODO code application logic here
        String nombrePersona; //Es la variable para almacenar un nombre
        String apellidoPersona; 
        int edad;
        
        nombrePersona = "Diego Alexander";
        apellidoPersona = "Macías Padilla";
        edad = 20;  
        System.out.println("Mi nombre es: "+nombrePersona+"\n\n\tMi apellido "
                + "es:"+apellidoPersona);
        
        System.out.printf("Mi nombre es: %s\nMi apellido es: %s\nMi edad es: %s",
                nombrePersona, apellidoPersona, edad);
    }
}
