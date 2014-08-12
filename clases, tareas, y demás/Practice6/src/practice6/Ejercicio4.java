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
public class Ejercicio4 {
    
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
    
    public void ImprimirMayor()
    {
     
        int mayor=matriz[0][0];
    	int MayorF=0;
    	int MayorC=0;
        for(int f=0;f<matriz.length;f++) {
            for(int c=0;c<matriz[f].length;c++) {
                if (matriz[f][c]>mayor) {
                    mayor=matriz[f][c];
                    MayorF=f;
                    MayorC=c;
                }
            }
        
        }
        System.out.println("El MAYOR ES"+ mayor);
        System.out.println("Se encuentra en la fila:" + MayorF + " y en la columna: "+ MayorC );
}
}
