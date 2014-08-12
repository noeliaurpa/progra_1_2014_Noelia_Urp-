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
public class practica2 {

    private int[][] matriz;
    private Scanner teclado;

    public void practica2(int f, int c) {

        teclado = new Scanner(System.in);
        matriz = new int[f][c];

        int[] alrevez = new int[f];

        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.println("Digite un numero: ");
                matriz[i][j] = teclado.nextInt();
            }

        }

    }

    public void FilasAlrevez(int filas, int columnas) {
        int guarda = 0;
        System.out.println("Matriz");

        for (int c = 0; c < matriz[0].length; c++) {
            guarda = matriz[0][c];
            matriz[0][c] = matriz[1][c];
            matriz[1][c] = guarda;

        }

        System.out.println("Matriz alrevez");

        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    }
}
