/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntroJava;

import java.util.Scanner;

/**
 *
 * @author carlos_juan
 */
public class HeloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Se crea variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        // Se crea una variable cadena 
        String nombre;
        // Se muestra mensaje en pantalla
        System.out.println("Ingrese su nombre");
        // leemos nombre de la persona
        nombre = leer.next();
        // mostramos por consola un saludo
        System.out.println("Hola mundo! Soy " + nombre + " y es mi primer programa");
    }    
}
