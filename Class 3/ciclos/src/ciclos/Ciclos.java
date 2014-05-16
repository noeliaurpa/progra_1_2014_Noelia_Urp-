/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ciclos;

import java.util.Scanner;

/**
 *
 * @author Noelia
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // variables
        int cantidad;
        int suma = 0;
        
        // importación de Scanner
        Scanner teclado=new Scanner(System.in);
        
        // para que digite los datos
        System.out.println("Digite el numero de impresiones que desea ver");
        
        // pasa a entero lo que está entrando por teclado
        cantidad= Integer.parseInt(teclado.nextLine());
        
         /**
         * Ciclo for
         * 
         */
        System.out.println("      Ciclo for     ");
        for (int i = 0; i <= cantidad; i++) {
            System.out.print(i + "\n");
        }
        
        System.out.println("      Inversa del Ciclo for     ");
        System.out.println("inverso");
        
        for (int i = cantidad; i >= 0; i--) {
            System.out.print(i + "\n");
        }
        System.out.print("\n");
        
        
        /**
         * Ciclo while
         * 
         */
       
        System.out.println("      Ciclo while     ");
        while (suma <= cantidad){
        
            // imprima
            System.out.print(suma);
            // para que vaya de izquierda a derecha
            System.out.print(" - ");
            suma = suma + 1;
        }
        
        System.out.print("\n");
        System.out.println("      Inversa del Ciclo while     ");
        System.out.print("\n");
        suma = cantidad;
        while (suma >= 0){
        
            // imprima
            System.out.print(suma);
            // para que vaya de izquierda a derecha
            System.out.print(" - ");
            suma = suma - 1;
        }
        
        /**
         * Ciclo do while
         * 
         */
        
        System.out.print("\n" + "\n");
        System.out.println("      Ciclo do while     ");
        suma = 0;
        
        do {
            // imprima
            System.out.print(suma);
            // para que vaya de izquierda a derecha
            System.out.print(" - ");
            suma = suma + 1;
        }while (suma <= cantidad);
        
        System.out.print("\n");
        suma = cantidad;
        
        System.out.println("      Inverso del Ciclo do while     ");
        do {
            // imprima
            System.out.print(suma);
            // para que vaya de izquierda a derecha
            System.out.print(" - ");
            suma = suma - 1;
        }while (suma >= 0);
    }
}
