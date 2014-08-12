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
public class Practice6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int opcion=0;
        int n;
        int f;
          
        Scanner teclado=new Scanner(System.in);
        
        do{
            System.out.println("Digite la opcion que desea");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            opcion=teclado.nextInt();
        switch(opcion)
        {
            case 1:
                Ejercicio1 E1=new Ejercicio1();
                E1.CargarMatriz();
                E1.ImprimirColumna();
                break;
            case 2:
                Ejercicio2 E2=new Ejercicio2();
                System.out.println("Digite cuantas columnas quiere");
                n=teclado.nextInt();
                System.out.println("Digite cuantas filas quiere");
                f=teclado.nextInt();
                E2.CargarMatriz(n, f);
                E2.FilasAlrevez(f, n);
               
                break;
            case 3:
                Ejercicio3 E3=new Ejercicio3();
                System.out.println("Digite cuantas columnas quiere");
                n=teclado.nextInt();
                System.out.println("Digite cuantas filas quiere");
                f=teclado.nextInt();
                E3.CargarMatriz(f, n);
                E3.ImprimirVericeMatriz(f, n);
                break;
                
            case 4:
                Ejercicio4 E4=new Ejercicio4();
                System.out.println("Digite cuantas columnas quiere");
                n=teclado.nextInt();
                System.out.println("Digite cuantas filas quiere");
                f=teclado.nextInt();
                E4.CargarMatriz(f, n);
                E4.ImprimirMayor();
                break;
        
        }
        
        
        }while(opcion<7);
    }
    
}
