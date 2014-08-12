/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice6;

import java.util.Scanner;
import oracle.jrockit.jfr.events.Bits;

/**
 *
 * @author Angie
 */
public class Ejercicio2 {

  private int[][] matriz;
  private int []ma;
    private Scanner teclado;
    
    public void CargarMatriz(int filas,int columnas)
    {
      teclado=new Scanner(System.in);
      matriz=new int[filas][columnas];
   
      int[]alrevez=new int [filas];
      
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Ingrese el numero correpondiente");
                matriz[f][c]=teclado.nextInt();
            }
            
        }
    
    
    }
    
    public void FilasAlrevez(int filas,int columnas)
    {
        int guarda=0;
         System.out.println("Matriz");
  
        for(int c=0;c<matriz[0].length;c++) {
          guarda=matriz[0][c];
            matriz[0][c]=matriz[1][c];
            matriz[1][c]=guarda;
            
        }
        
        System.out.println("Matriz alrevez");
        
         for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                System.out.print(matriz[f][c]+" ");
            }
            System.out.println();
        }
    }
               
 
        
}
