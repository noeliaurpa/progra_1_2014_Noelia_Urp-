/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package class14;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class Class14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean validar = false;
        char continuar;
        int opcion = 0;
        
        int[] arreglo = {56, 4, 85, 85, 42};
        int[] arreglo2 = {56, 4, 85, 85, 42};
        int[] arregloOrdenado;

        Scanner teclado = new Scanner(System.in);
        do {

            System.out.println("     Menú del Ejercicio      ");
            System.out.println("1. Ordenamiento seleccion ");
            System.out.println("2. Ordenamiento Burbuja ");

            opcion = Integer.parseInt(teclado.next());

            switch (opcion) {
                case 1:

                    OrdenamientoSeleccion OS = new OrdenamientoSeleccion();
                    arregloOrdenado = OS.ordenS(arreglo, "A");
                    System.out.println(" Ordenamiento Seleccion");
                    for (int i = 0; i < arregloOrdenado.length; i++) {
                        System.out.println(arregloOrdenado[i]);
                    }
                    break;
                case 2:
                    OrdenamientoBurbuja OB = new OrdenamientoBurbuja();
                    arregloOrdenado= OB.OrdenamientoB(arreglo, "A");
                    arregloOrdenado = OB.OrdenamientoAlreves(arreglo2, "A");
                    System.out.println(" Ordenamiento Burbuja");
                    for (int i = 0; i < arregloOrdenado.length; i++) {
                        System.out.println(arregloOrdenado[i]);
                        
                    }
                    break;

            }

            System.out.println(" ¿Desea continuar con otra opcion? S/N ");
            teclado = new Scanner(System.in);
            continuar = teclado.next().charAt(0);

            if (continuar == 'S' || continuar == 's') {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }
}
