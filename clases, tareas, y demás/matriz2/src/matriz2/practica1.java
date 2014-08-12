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
public class practica1 {

    int matriz[][];
    Scanner teclado = new Scanner(System.in);

    public void digitarDatos() {

        double promedio = 0;
        teclado = new Scanner(System.in);
        matriz = new int[2][5];

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Ingrese el numero correpondiente");
                matriz[f][c] = teclado.nextInt();
            }
        }
    }

    public double promedio() {
        double suma = 0;
        double promedio1 = 0;
        double promedio = 0;
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                promedio1 = matriz[f][c] + promedio1;
                suma = suma + 1;
            }
        }
        promedio = promedio1 / suma;
        return promedio;
    }

    public void imprimirMatriz() {
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }

    }
}
