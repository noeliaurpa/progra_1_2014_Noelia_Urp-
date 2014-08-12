/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice6;

import java.util.Scanner;

/**
 *
 * @author Angie
 */
public class Ejercicio1 {
    
    private int[][] matriz;
    private Scanner teclado;
    
    public void CargarMatriz()
    {
      teclado=new Scanner(System.in);
      matriz=new int[2][5];
      
        for (int c = 0; c < 5; c++) {
            for (int f = 0; f < 2; f++) {
                System.out.println("Ingrese el numero correpondiente");
                matriz[f][c]=teclado.nextInt();
            }
            
        }
    
    
    }
    
    public void ImprimirColumna()
    {
            for (int f = 0; f < 2; f++) {
                for (int c = 0; c < 5; c++){
            System.out.print(matriz[f][c] + " "); 
            }
         System.out.println();  
        }
   }
    
}
