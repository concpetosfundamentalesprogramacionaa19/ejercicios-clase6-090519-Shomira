/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasbasicas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class EstructurasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona 1: Shomira Rosales - estudiante
        Scanner entrada = new Scanner(System.in);
        String mensajeFinal="";
        String nombre = "";
        String apellido = "";
        String profesion = "";
               
        int contador = 1;
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, 
                "Informe de la ciudad de Loja ");
        mensajeFinal = String.format("%s%s\n\n", mensajeFinal, 
                "Listado de persoans");
        while(contador < 5){
            System.out.println("Ingrese su nombre ");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su apellido ");
            apellido = entrada.nextLine();
            System.out.println("Ingrese su profesión ");
            profesion = entrada.nextLine();;
           mensajeFinal = String.format("%sPersona %d: %s %s - %s \n",
                 mensajeFinal, contador, nombre, apellido, profesion );
           contador = contador + 1 ; // que el contador se incremente 
        }
        System.out.printf("%s", mensajeFinal);
     }
    
}
