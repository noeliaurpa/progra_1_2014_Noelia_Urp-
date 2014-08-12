/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz2;

import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class practica8 {

    int matriz[][];
    Scanner teclado = new Scanner(System.in);

    public void llenarMatriz() {

        matriz = new int[2][5];
        teclado = new Scanner(System.in);

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println(" Digite un numero ");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public void menorDeColumna() {

        int menor = 0;
        int f2 = 1;
        int c2 = 0;
        for (int f = 0; f < 1; f++) {
            for (int c = 0; c < 5; c++) {
                
                if (matriz[f][c] < matriz[f2][c2]) {
                    
                    menor = matriz[f][c];
                    System.out.println(" El menor de las columnas es: " + menor + " ");
                    c2++;
                    
                } else if (matriz[f2][c2] < matriz[f][c]) {
                    
                    menor = matriz[f2][c2];
                    System.out.println(" El menor de las columnas es: " + menor + " ");
                    c2++;
                }
            }
        }
        System.out.println();
    }
    
    public void imprimirMatriz(){
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}