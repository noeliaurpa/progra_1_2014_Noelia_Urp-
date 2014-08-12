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
public class tercerEjercicio {

    private Scanner teclado;
    private int[] cursoA;
    private int[] cursoB;

    public void notasDeCadaCurso() {

        teclado = new Scanner(System.in);
        cursoA = new int[5];
        cursoB = new int[5];

        System.out.println("    Notas del curso A    ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite las notas de los estudiantes del curso A: ");
            cursoA[i] = teclado.nextInt();
        }
        System.out.println("    Notas del curso B    ");

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite las notas de los estudiantes del curso B: ");
            cursoB[i] = teclado.nextInt();
        }
    }

    public void sumaPromedios() {
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < 5; i++) {
            suma1 = suma1 + cursoA[i];
            suma2 = suma2 + cursoB[i];
        }

        int promedioa = suma1 / cursoA.length;
        int promediob = suma2 / cursoB.length;
        if (promedioa > promediob) {
            System.out.println("El curso A tiene un promedio mayor, que es igual a: " + promedioa);
        } else {
            System.out.println("El curso B tiene un promedio mayor, que es igual a: " + promediob);
        }
    }
}
