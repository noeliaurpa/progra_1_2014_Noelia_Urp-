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
public class practica11 {
    
     private int[][] matriz;
    private Scanner teclado;

    public void CargarMatriz() {
        teclado = new Scanner(System.in);
        matriz = new int[2][5];

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println(" Digite un numero ");
                matriz[f][c] = teclado.nextInt();
            }

        }

    }

    public void ImprimirMayorCantidadPares() {
        
        int cont = 0;
        int cont2 = 0;

        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {

                if (matriz[f][c] % 2 == 0) {
                    cont++;
                    cont2++;
                }

            }
           
            System.out.println();
            
        }
        if (cont2 > cont) {
           System.out.println("Tiene " + cont + " cantidad de pares ");
            int f2=1;
            for (int f1 = 0; f1 < 1; f1++) {
                for (int c1 = 0; c1 < 5; c1++) {
                    
                    System.out.print(matriz[f2][c1] + " " );
                }
                System.out.println();
            }

        } else {
           System.out.println("Tiene " + cont2 + " cantidad de pares ");
            
            for (int f1 = 0; f1 < 2; f1++) {
                for (int c1 = 0; c1 < 5; c1++) {
                   
                    System.out.print(matriz[f1][c1] + " " );
                }
                System.out.println();
            }

        }

    }


}
