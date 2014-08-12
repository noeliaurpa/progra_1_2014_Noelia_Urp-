/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.array;

import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class HomeworkArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean validar = true;
        char continuar;
        int opcion = 0;
        Scanner oScanner = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite una opción");
            System.out.println("1. ejercicio 1");
            System.out.println("2. ejercicio 2");
            System.out.println("3. ejercicio 3");
            System.out.println("4. ejercicio 4");

            opcion = oScanner.nextInt();

            switch (opcion) {
                
                case 1:
                    
                    PrimerEjercicio p1 = new PrimerEjercicio();
                    p1.DigitarNumero();
                    p1.sumarNumerosDigitados();
                    p1.numerosMayoresQ36();
                    p1.numerosMayoresQ50();
                    break;
                    
                case 2:

                    segundoEjercicio p2 = new segundoEjercicio();
                    p2.numerosEnteros();
                    p2.sumaDeNumeros();
                    break;
                case 3:

                    tercerEjercicio p3 = new tercerEjercicio();
                    p3.notasDeCadaCurso();
                    p3.sumaPromedios();
                    break;
                case 4:
                    
                    cuartoEjercicio p4 = new cuartoEjercicio();
                    p4.digitarNumero();
                    p4.orden();
                    break;
                default:
                    break;

            }

            System.out.println("Desea continuar con otra operación S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }
}
