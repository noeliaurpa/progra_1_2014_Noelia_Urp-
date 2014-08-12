/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class11;

import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class Class11 {

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
            System.out.println("5. ejercicio 5");
            System.out.println("6. ejercicio 6");
            System.out.println("7. ejercicio 7");

            opcion = oScanner.nextInt();

            switch (opcion) {

                case 1:

                    Ejercicio1 oEjercicio1 = new Ejercicio1();
                    oEjercicio1.CargaMatriz();
                    oEjercicio1.imprimir();
                    break;

                case 2:

                    Ejercicio2 oEjercicio2 = new Ejercicio2();
                    oEjercicio2.CargaMatriz();
                    oEjercicio2.ImprimirDiagonal();
                    break;

                case 3:
                    Ejercicio3 oEjercicio3 = new Ejercicio3();
                    oEjercicio3.CargaMatriz();
                    oEjercicio3.PrimeraFila();
                    oEjercicio3.UltimaFila();
                    oEjercicio3.PrimeraColumna();
                    oEjercicio3.UltimaColumna();
                    break;

                case 4:
                    practica1 prac1 = new practica1();
                    prac1.practica1();
                    prac1.imprimirPractica();
                    break;

                case 5:
                    practica2 h = new practica2();
                    int M[][] = new int[20][20];
                    System.out.print("Inserte filas de la matriz: ");
                    int f = teclado.nextInt();
                    System.out.print("Inserte columnas de la matriz: ");
                    int c = teclado.nextInt();
                    h.practica2(f, c);
                    h.FilasAlrevez(f, c);
                    break;
                case 6:
                    int colum,fil;
                    System.out.print("Inserte filas de la matriz: ");
                    fil = teclado.nextInt();
                    System.out.print("Inserte columnas de la matriz: ");
                    colum = teclado.nextInt();
                    practica3 prac3 = new practica3();
                    prac3.CargarMatriz(fil, colum);
                    prac3.ImprimirVericeMatriz(fil, colum);
                    break;
                case 7:
                    int colum1,fil1;
                    System.out.print("Inserte filas de la matriz: ");
                    fil1 = teclado.nextInt();
                    System.out.print("Inserte columnas de la matriz: ");
                    colum1 = teclado.nextInt();
                    practica4 prac4 = new practica4();
                    prac4.CargarMatriz(fil1, colum1);
                    prac4.ImprimirMayor();
                    break;
                default:
                    break;
            }
            System.out.println("Desea continuar con otra operación S/N");
            teclado=new Scanner(System.in);
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

         } while (validar);
    }
}
