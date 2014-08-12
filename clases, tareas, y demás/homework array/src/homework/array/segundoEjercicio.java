/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.array;

import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class segundoEjercicio {

    private Scanner teclado;
    private int[] valor1;
    private int[] valor2;
    private int[] sumaValores;

    public void numerosEnteros() {
        
        teclado = new Scanner(System.in);
        valor1 = new int[4];
        valor2 = new int[4];
        
        System.out.println(" Primer vector numerico ");
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print("Digite un numero: ");
            valor1[i] = teclado.nextInt();
        }
        
        System.out.println(" Segundo vector numerico ");
        
        
        for (int i = 0; i < 4; i++) {
            
            System.out.print("Digite un numero: ");
            valor2[i] = teclado.nextInt();
        }
    }

    public void sumaDeNumeros() {
        sumaValores = new int[4];
        
        for (int i = 0; i < 4; i++) {
            
            sumaValores[i] = valor1[i] + valor2[i];
        }
        System.out.println(" El resultado de las sumas es de: ");
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println(sumaValores[i]);
        }
    }
}
