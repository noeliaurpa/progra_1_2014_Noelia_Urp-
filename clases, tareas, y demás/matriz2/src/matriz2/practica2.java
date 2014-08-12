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
public class practica2 {

    Scanner teclado = new Scanner(System.in);
    int matriz[][];

    public void llenarMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[2][5];

        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Ingrese el numero correpondiente");
                matriz[f][c] = teclado.nextInt();
            }

        }

    }

    public int numerosImpares() {
        int mayor = 0;
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                if (matriz[f][c]%2 == 1){
                    if(mayor < matriz[f][c]){
                        mayor = matriz[f][c];
                    }
                }
            }
        }
        return mayor;
    }
}
