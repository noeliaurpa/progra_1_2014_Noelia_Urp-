/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int opcion = 0;
        boolean continuar = false;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("1. ejercicio 1");
            System.out.println("2. ejercicio 2");
            System.out.println("3. ejercicio 3");
            System.out.println("4. salir");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    ejercicio1 eje1 = new ejercicio1();

                    for (int i = 0; i < 5; i++) {
                        System.out.println("Digite el salario del trabajador # " + (i + 1));
                        eje1.AgregarSalario(teclado.nextDouble());
                    }
                    System.out.println(eje1.ImprimirSueldo());
                    break;
                case 2:
                    ejercicio2 eje2 = new ejercicio2();

                    for (int i = 0; i <= 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("2Digite la altura #" + (i + 1));
                        eje2.AgregarAltura(teclado.nextFloat());
                    }
                    System.out.println("El promedio es de: " + eje2.promedio());
                    System.out.println(eje2.contarPersonas());
                    break;
                case 3:
                    ejercicio3 ms = new ejercicio3();
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario del turno de la mañana # " + (i + 1));
                        ms.GuardarSalarioMañana(teclado.nextDouble());
                    }
                    for (int i = 0; i < 4; i++) {
                        teclado = new Scanner(System.in);
                        System.out.println("Digite el salario del turno de la tarde # " + (i + 1));
                        ms.GuardarSalarioTarde(teclado.nextDouble());
                    }
                    System.out.println(ms.SalarioMañana());
                    System.out.println(ms.SalarioTarde());
                    break;
                case 4:
                    break;

            }

        } while (opcion <= 3);
    }

}
