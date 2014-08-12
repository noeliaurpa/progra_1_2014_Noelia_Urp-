/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean validar = true;
        char continuar;
        int opcion = 0;

        // Importacion del Scenner
        Scanner teclado = new Scanner(System.in);

        do {

            System.out.println(" Elija una opción ");
            System.out.println("1. Ejercicio 1 ");
            System.out.println("2. Ejercicio 2 ");
            System.out.println("3. Ejercicio 3 ");
            System.out.println("4. Ejercicio 4 ");
            System.out.println("5. Ejercicio 5 ");
            System.out.println("6. Ejercicio 6 ");
            System.out.println("7. Ejercicio 7 ");
            System.out.println("8. Ejercicio 8 ");
            System.out.println("9. Ejercicio 9 ");
            System.out.println("10. Ejercicio 10 ");
            System.out.println("10. Ejercicio 11 ");
            System.out.println("10. Ejercicio 12 ");
            System.out.println("10. Ejercicio 13 ");
            System.out.println("10. Ejercicio 14 ");
            System.out.println("10. Ejercicio 15 ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    // Variables
                    int numero = 1;
                    int cantidad = 0;
                    // Instancia al primer ejercicio
                    Ejercicio1 E1 = new Ejercicio1();

                    // ciclo para que me diga cuantos numeros desea ingresar
                    while (numero > 0) {
                        System.out.println(" Digite un numero ");

                        numero = teclado.nextInt();
                        if (numero > 0) {
                            E1.InsertarNumeros(numero);
                            cantidad++;
                        }
                    }
                    E1.hacerArreglo(cantidad);
                    E1.Imprimir();
                    break;
                case 2:
                    // Variables
                    int nume1 = 1;

                    Ejercicio2 E2 = new Ejercicio2();

                    while (nume1 > 0) {
                        System.out.println(" Digite un numero ");

                        nume1 = teclado.nextInt();
                        if (nume1 > 0) {
                            E2.insertarNumeros(nume1);
                        }
                    }

                    E2.insertarNumeros(nume1);
                    E2.imprimir();
                    break;
                case 3:
                    // Variables
                    int numero2 = 1;
                    float numero1 = 0;

                    Ejercicio3 E3 = new Ejercicio3();

                    while (numero2 > 0) {
                        numero2 = 0;
                        System.out.println(" Digite un numero ");

                        numero2 = teclado.nextInt();
                        if (numero2 > 0) {
                            E3.InsertarElementos(numero2);
                            numero2 = numero2 * numero2;
                            numero1 = numero1 + numero2;
                        }
                    }

                    System.out.println(" La suma de los cuadrados de los numeros es: " + numero1);
                    E3.Imprimir();
                    break;
                case 4:
                    // Variables
                    int numero3 = 1;
                    int num1 = 1;
                    int cont = 0;

                    Ejercicio4 E4 = new Ejercicio4();

                    System.out.println(" Elementos de la primera lista ");
                    while (numero3 > 0) {
                        System.out.println(" Digite un numero ");
                        numero3 = teclado.nextInt();
                        if (numero3 > 0) {
                            E4.InsertarElementosPrimeraLista(numero3);
                        }
                    }
                    System.out.println(" Elementos de la segunda lista ");
                    while (num1 > 0) {
                        System.out.println(" Digite un numero ");
                        num1 = teclado.nextInt();
                        if (num1 > 0) {
                            E4.InsertarElementosSegundaLista(num1);
                        }
                    }
                    E4.Imprimir();
                    break;
                case 5:
                    // Variables
                    int cantidad1 = 0;
                    int num2 = 1;

                    Ejercicio5 E5 = new Ejercicio5();

                    while (num2 > 0) {
                        System.out.println(" Digite un numero ");
                        num2 = teclado.nextInt();

                        if (num2 > 0) {
                            E5.InsertarElementos(num2);
                            cantidad1++;
                        }
                    }
                    E5.hacerArreglo(cantidad1);
                    E5.imprimir();
                    break;
                case 6:

                    // Variables
                    int numero4 = 1;
                    int cantidad4 = 0;

                    Ejercicio6 E6 = new Ejercicio6();
                    while (numero4 > 0) {
                        System.out.println(" Digite un numero ");
                        numero4 = teclado.nextInt();
                        if (numero4 > 0) {
                            if ((numero4 % 2) != 0) {
                                E6.insertarListaImpares(numero4);
                                cantidad4++;
                            } else {

                                E6.insertarListaPares(numero4);
                                cantidad4++;
                            }
                        }
                    }
                    E6.Imprimir();
                    E6.Imprimir2();

                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    int numero10 = 0;

                    Ejercicio10_Pilas pila1 = new Ejercicio10_Pilas();
                    Ejercicio10_Pilas pila2 = new Ejercicio10_Pilas();

                    do {
                        System.out.println(" Digite un numero ");
                        numero10 = teclado.nextInt();

                        if (numero10 > 0) {
                            pila1.push_Pila1(numero10);
                        }

                    } while (numero10 > 0);

                    System.out.println(" ");
                    pila1.imprimir_Pila1();

                    System.out.println(" ");
                    pila2.imprimir_Pila1();
                    pila1.imprimir_Pila2();
                    break;
                case 12:

                    float numero12;
                    float numero12_1;

                    Ejercicio12_Pilas pilas1 = new Ejercicio12_Pilas();
                    Ejercicio12_Pilas pilas2 = new Ejercicio12_Pilas();

                    do {

                        System.out.println(" Digite un numero ");
                        numero12 = teclado.nextFloat();

                        if (numero12 > 0) {
                            pilas1.push_Pila1(numero12);
                        }

                    } while (numero12 > 0);

                    do {

                        System.out.println(" Digite un numero ");
                        numero12_1 = teclado.nextFloat();

                        if (numero12_1 > 0) {
                            pilas2.push_Pila2(numero12_1);
                        }

                    } while (numero12_1 > 0);

                    pilas2.imprimir_Pila2();
                    pilas1.imprimir_Pila1();

                    break;
                case 13:
                    int numero13 = 0;
                    int numero13_1 = 0;

                    Ejercicio13_Pilas primeraPila = new Ejercicio13_Pilas();
                    Ejercicio13_Pilas segundaPila = new Ejercicio13_Pilas();
                    Ejercicio13_Pilas terceraPila = new Ejercicio13_Pilas();

                    do {

                        System.out.println(" Digite un numero ");
                        numero13 = teclado.nextInt();

                        if (numero13 > 0) {
                            primeraPila.push_Pila1(numero13);
                        }

                    } while (numero13 > 0);

                    System.out.println(" ++++++++++++++++++++++++++ ");
                    do {
                        System.out.println(" Digite un numero ");
                        numero13_1 = teclado.nextInt();

                        if (numero13_1 > 0) {
                            segundaPila.push_Pila2(numero13_1);
                        }

                    } while (numero13_1 > 0);

                    primeraPila.imprimir_Pila1();
                    segundaPila.imprimir_Pila2();
                    System.out.println("***************************************");
                    terceraPila = primeraPila;
                    primeraPila = segundaPila;
                    segundaPila = terceraPila;
                    System.out.println("***************************************");
                    primeraPila.imprimir_Pila1();
                    segundaPila.imprimir_Pila2();
                    break;
                case 14:

                    int numero14 = 0;

                    Ejercicio14_Pilas oPila = new Ejercicio14_Pilas();

                    do {
                        System.out.println(" Digite un numero ");
                        numero14 = teclado.nextInt();

                        if (numero14 > 0) {
                            oPila.push_Pila1(numero14);
                        }
                    } while (numero14 > 0);

                    oPila.imprimir_Pila1();
                    oPila.imprimir_Pila1_1();
                    break;

            }
            // donde imprime si quiere continuar con otra opcion o no
            System.out.println("Desea continuar con otra operación S/N");
            // lo que entra por teclado y se almacena en la variable continuar
            continuar = teclado.next().charAt(0);
            // si lo que entro por teclado es igual a "S" o "s"
            if ((continuar == 'S') || (continuar == 's')) {
                // si es igual a S o s continua
                validar = true;
                // si no
            } else {
                // termina el programa
                validar = false;
            }
            // condicion del ciclo do while
        } while (validar);

    }

}
