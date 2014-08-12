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
public class PrimerEjercicio {

    private Scanner teclado;
    private int[] valores;

    public void DigitarNumero() {
        teclado = new Scanner(System.in);
        valores = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite un numero: ");
            valores[i] = teclado.nextInt();
        }
    }

    public void sumarNumerosDigitados() {
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            suma = suma + valores[i];
        }
        System.out.println("La suma de los 8 numeros digitados es: " + suma);
    }

    public void numerosMayoresQ36() {
        int suma = 0;
        for (int i = 0; i < 8; i++) {
            if (valores[i] > 36) {
                suma = suma + valores[i];
            }
        }
        System.out.println("La suma de los numeros mayores que 36 son: " + suma);
    }

    public void numerosMayoresQ50() {
        int cantidadNumeros = 0;
        for (int i = 0; i < 8; i++) {
            if (valores[i] > 50) {
                cantidadNumeros++;
            }
        }
        System.out.println("La cantidad de numeros mayores que 50 son: " + cantidadNumeros);
    }
}
