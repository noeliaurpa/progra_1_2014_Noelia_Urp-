/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class practica5 {

    int matriz[][];
    Scanner teclado = new Scanner(System.in);

    public void ordenarFila() {
         //cargar matriz y mostrar su contenido
        teclado = new Scanner(System.in);
        matriz = new int[2][5];
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println(" Digite un numero ");
                matriz[f][c] = teclado.nextInt();
            }
            
        }

        for (int f = 0; f < 2; f++) {//ordena la matriz de abajo hacia arriba
            for (int c = 0; c < 5; c++) {
                for (int f2 = 0; f2 < 2; f2++) {
                    for (int c2 = 0; c2 < 5; c2++) {
                        if (matriz[f][c] < matriz[f2][c2]) {
                            int t = matriz[f][c];
                            matriz[f][c] = matriz[f2][c2];
                            matriz[f2][c2] = t;
                        }
                    }
                }
            }
        }

// mostrar como quedó ordenada la matriz
        System.out.print("—————————–" + "\n ");
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.print(" " + "\n");
        }
    }
}

//        teclado = new Scanner(System.in);
//        matriz = new int[2][4];
//
//        for (int f = 0; f < 2; f++) {
//            for (int c = 0; c < 4; c++) {
//                System.out.println("Ingrese el numero correpondiente");
//                matriz[f][c] = teclado.nextInt();
//            }
//
//        }
//
//    }
//
//    //por columnas 
//    public void OrdenarColumnas() {
//        int f1 = 1;
//        int c1 = 0;
//        int menor = 0;
//        int mayor = 0;
//
//        for (int f = 0; f < 1; f++) {
//            for (int c = 0; c < 4; c++) {
//
//                if (matriz[f][c] < matriz[f1][c1]) {
//                    menor = matriz[f][c];
//                    System.out.print(menor + " ");
//                    c1++;
//
//                } else if (matriz[f1][c1] < matriz[f][c]) {
//                    menor = matriz[f1][c1];
//                    System.out.print(menor + " ");
//                    c1++;
//
//                }
//
//            }
//
//            System.out.println();
//        }
//
//        int f2 = 1;
//        int c2 = 0;
//
//        for (int f = 0; f < 1; f++) {
//            for (int c = 0; c < 4; c++) {
//
//                if (matriz[f][c] > matriz[f2][c2]) {
//                    mayor = matriz[f][c];
//                    System.out.print(mayor + " ");
//                    c2++;
//                } else if (matriz[f2][c2] > matriz[f][c]) {
//                    mayor = matriz[f2][c2];
//                    System.out.print(mayor + " ");
//                    c2++;
//
//                }
//
//            }
//
//            System.out.println();
//        }
//
//    }
//}
