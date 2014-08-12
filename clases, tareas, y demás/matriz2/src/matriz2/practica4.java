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
public class practica4 {
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

    public void porcentajeIpares() {
        int impar = 0;
        int cont = 0;
        int cont2 = 0;
        int respuesta;
        int respuesta1 = 0;
        int cont3 = 0;
        int cont1 = 0;
        for (int f = 0; f < 1; f++) {
            for (int c = 0; c < 5; c++) {
                if (matriz[f][c]%2 == 1){
                    impar = matriz[f][c];
                    cont= cont + 1;
                }
                cont2 = cont2 + 1;
            }
        }
        for (int f1 = 0; f1 < 2; f1++) {
            for (int c1 = 0; c1 < 5; c1++) {
                if (matriz[f1][c1]%2 == 1){
                    impar = matriz[f1][c1];
                    cont1= cont1 + 1;
                }
                cont3 = cont3 + 1;
            }
        }
        respuesta = ((cont * 100)/ cont2);
        respuesta1 = ((cont1 * 100)/ cont3);
        System.out.println(" El porcentaje de la fila 1 es: " + respuesta);
        System.out.println(" El porcentaje de la fila 1 es: " + respuesta1);
    }
}
