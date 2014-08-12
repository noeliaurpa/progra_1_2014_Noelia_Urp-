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
public class cuartoEjercicio {

    private Scanner teclado;
    private int[] vec;

    public void digitarNumero() {

        teclado = new Scanner(System.in);
        vec = new int[10];

        for (int i = 0; i < 10; i++) {

            System.out.print("Digite un numero: ");

            vec[i] = teclado.nextInt();
        }
    }

    public void orden() {

        int orden = 1;

        for (int i = 0; i < 9; i++) {

            if (vec[i + 1] < vec[i]) {
                orden = 0;
            }
        }
        if (orden == 1) {
            System.out.println("Esta ordenado de menor a mayor");
        } else {
            System.out.println("No esta ordenado de menor a mayor");
        }
    }
}
