/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejosswitch;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class UsoSwitch5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
desarrollar una plicacion que me permita ingresar 
placas de carros, se asume que las placas ingresadas
 pertenecen a la region costa del Ecuador en base a la placa
nuestro programa determinara y presentara la placa con la provincia 
a la que pertence V moronaSntiago
        A Azuay
        O el Oro
        E esmeraldas
        M manabi
        */
        String Letra ;
       Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese la placa de su vehiculo");
        String placa = entrada.nextLine();
        char letra = placa.charAt(0);
                
        switch(letra){
            // Validacion de placas de Azuay
            case 'a':
            case'A':
                System.out.printf("Placa con inicial %s de %s, pertenece a  Azuay", 
                        letra, placa.toUpperCase());
                break;
            // Validacion de placas de Esmeraldas
            case 'e':
            case 'E':
                System.out.printf("Placa con inicial %s de %s,pertenece a  Esmeraldas", 
                        letra, placa.toLowerCase());
                break;
                // Validacion de placas de Manabì
            case 'm':
            case 'M':
                System.out.printf("Placa con inicial %s de %s, pertenece"
                        + " a  Manabi ", letra, placa.toUpperCase());
                break;
                // Validacion de placas de Santo domingo 
            case 'j':
            case 'J':
                 System.out.printf("Placa con inicial %s de %s, pertenece "
               + "a Santo Domingo de los Tsàchilas ",letra, placa.toUpperCase()); 
                //Validacion de las placas de Los Rios 
            case 'r':
            case 'R':
                System.out.printf("Placa con inicial %s de %s,pertenece"
                        + " a Los Rios  ", letra, placa.toUpperCase()); 
            case'g':
            case'G':
               System.out.printf("Placa con inicial %s de %s,pertenece a Guayas ", 
                        letra, placa.toUpperCase()); 
            case'o':
            case'O':
               System.out.printf("Placa con inicial %s de %s,pertenece a el Oro", 
                        letra, placa.toUpperCase());
                
            default:
                System.out.println("ninguna de las anteriores");
                
        }
        
    }
}
