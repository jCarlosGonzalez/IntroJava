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
public class Condicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Entendio Java del 1 a 5");
        opinion = leer.nextInt();
        if (opinion>=1 && opinion <=5) {
            switch(opinion){
                case 1:
                    System.out.println("Nada");
                    break;
                case 2:
                    System.out.println("Mitad -1");
                    break;
                case 3:
                    System.out.println("Mitad");
                    break;
                case 4:
                    System.out.println("Mitad +1");
                    break;
                case 5:
                    System.out.println("Todo");
                    break;
            }    
        } else if (opinion < 0){
            System.out.println("opcion negativa???");
        } else  if (opinion == 0) {
            System.out.println("seguro que 0??");
        } else if (opinion > 5) {
            System.out.println("Se agradece pero el maximo es 5");
        }                
    }   
}
