/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.string;

import java.util.Scanner;

/**
 *
 * @author Noelia
 */
public class Clase7String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;
        Scanner oScanner = new Scanner(System.in);

        do {

            System.out.println("Elija una opcion: ");
            System.out.println("1. ejercicio1");
            System.out.println("2. ejercicio2");

            opcion = oScanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner = new Scanner(System.in);
                    ejercicio1 oejercicio1 = new ejercicio1(oScanner.nextLine());
                    System.out.println(oejercicio1.ValidarCorreo() + "\n");
                    break;
                    
                case 2:
                    System.out.println("Digite la cadena a evaluar" + "\n");
                    oScanner = new Scanner(System.in);
                    ejercicio2 oejercicio2 = new ejercicio2();                    
                    oejercicio2.setCadena(oScanner.nextLine());
                    // para que imprima la mitad de lo que se escribe
                    System.out.println("Imprime la mitad de la palabra introducida");
                    System.out.println(oejercicio2.MediaCadena() + "\n");
                    // para que me imprima el ultimo valor
                    System.out.println("Imprime la ultima letra de la palabra introducida");
                    System.out.println(oejercicio2.ultimoValor() + "\n");
                    // para que me imprima la palabra alrevez
                    System.out.println("Imprime al reves de la palabra introducida");
                    System.out.println(oejercicio2.Alrevez() + "\n");
                    // para que aparezca un guion entre las letras
                    System.out.println("Imprime un guion entre cada letra de la palabra introducida");
                    System.out.println(oejercicio2.guion() + "\n");
                    // para que me imprima la cantidad de vocales que tiene la palabra
                    System.out.println("Imprime la cantidad de vocales de la palabra introducida");
                    System.out.println(oejercicio2.vocales() + "\n");
                    // para que me imprima si la palabra es igual al reves que al derecho
                    System.out.println("Imprime si la palabra es igual al reves que al derecho de la palabra introducida");
                    System.out.println(oejercicio2.palindromo() + "\n");
                    
                    break;
            }
        }while(opcion <= 7);
    }

}
