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
public class practica7 {
    int matriz [][];
    Scanner teclado = new Scanner(System.in);
    
    
    public void cargarMatriz(){
        teclado = new Scanner(System.in);
        matriz = new int [2][5];
        
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                System.out.println(" Digite un numero ");
                matriz[f][c] = teclado.nextInt();
            }
        }
    
    }
    
    
    public void mayorFila(){
    
        int mayor = 0;
        
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 5; c++) {
                if (matriz [f][c] > mayor){
                    mayor = matriz [f][c];
                }
            }
             System.out.println(" El numero mayor digitado de la fila es: " + mayor);
             mayor = 0;
        }
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
