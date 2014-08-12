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
public class Ejercicio3 {
    
     private int[][] matriz;
    private Scanner teclado;
    
    public void CargarMatriz(int filas,int columnas)
    {
      teclado=new Scanner(System.in);
      matriz=new int[filas][columnas];
   
     
      
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                System.out.println("Ingrese el numero correpondiente");
                matriz[f][c]=teclado.nextInt();
            }
            
        }
    
    
    }
    public void ImprimirVericeMatriz(int filas,int columnas)
    {
      
        System.out.println("Vértice  al frente izquierdo:");
        System.out.println(matriz[0][0]);
    	System.out.println("Vértice  al frente derecho:");        
        System.out.println(matriz[0][matriz[0].length-1]);
    	System.out.println("Vértice atras izquierdo:");        
        System.out.println(matriz[matriz.length-1][0]);
    	System.out.println("Vértice atras derecho:");        
        System.out.println(matriz[matriz.length-1][matriz[matriz.length-1].length-1]);
     
    
    }
}
