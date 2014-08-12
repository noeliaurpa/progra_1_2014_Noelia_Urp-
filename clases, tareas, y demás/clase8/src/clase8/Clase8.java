/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase8;

import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        // variables
        boolean validar = true;
        char continuar;
        int opcion = 0;
        String oracion;
        String palabra;
        String palabra1;
        String oracion1;
        // llamar a escaner
        Scanner teclado = new Scanner(System.in);
        Scanner oScanner = new Scanner(System.in);

        //instancias
        Ejercicio1y2 eje1 = new Ejercicio1y2();

        do {
            System.out.println("Digite una opción");
            System.out.println("1. ejercicio 1");
            System.out.println("2. ejercicio 2");
            System.out.println("3. ejercicio 3");
            System.out.println("4. ejercicio 4");
            System.out.println("5. ejercicio 5");
            System.out.println("6. ejercicio 6");
            System.out.println("7. ejercicio 7");
            System.out.println("8. ejercicio 8");

            opcion = oScanner.nextInt();

            switch (opcion) {
                case 1:
                    oScanner = new Scanner(System.in);
                    System.out.println("Digite una palabra a la que quiera ver escrita alrevés");
                    eje1.setLetras(oScanner.nextLine());
                    System.out.println("La palabra alrevés es: " + eje1.Alrevez());
                    break;
                case 2:
                    oScanner = new Scanner(System.in);
                    System.out.println("Digite una palabra que quiera ver escrita igual al reves que al derecho");
                    eje1.setLetras(oScanner.nextLine());
                    System.out.println("La palabra alrevés " + eje1.getLetras() + eje1.palindromoPalabrayPalabraAlreves());
                    break;

                case 3:
                    System.out.println("Digie un pequeño texto");
                    oScanner = new Scanner(System.in);
                    Ejercicio3 E3 = new Ejercicio3();
                    oracion = (oScanner.nextLine());
                    System.out.println("Digite la palabra que quiere buscar");
                    oScanner = new Scanner(System.in);
                    palabra = (oScanner.nextLine());
                    System.out.println("quedaria con un guion la palabra buscada" + E3.buscarPalabra(oracion, palabra));

                    break;
                case 4:
                    System.out.println("Digie un pequeño texto");
                    oScanner = new Scanner(System.in);
                    Ejercicio4 E4 = new Ejercicio4();
                    oracion1 = (oScanner.nextLine());
                    System.out.println("Digite la palabra que quiere buscar");
                    oScanner = new Scanner(System.in);
                    palabra1 = (oScanner.nextLine());
                    System.out.println("De esa palabra hay escrita(as): " + E4.ocurrencia(oracion1, palabra1) + " vez o veces. ");

                    break;
                case 5:
                    int iniciar, finalizar;
                    Ejercicio1DEL2 oStringUp = new Ejercicio1DEL2();
                    System.out.println("Digie un pequeño texto");
                    oScanner = new Scanner(System.in);
                    iniciar = Integer.parseInt(oScanner.nextLine());
                    System.out.println("Digite la palabra que quiere buscar");
                    oScanner = new Scanner(System.in);
                    finalizar = Integer.parseInt(oScanner.nextLine());
                    System.out.println(oStringUp.substring(iniciar, finalizar));
                    break;
                case 6:
                    int inicia, finaliza;
                    Ejercicio2DEL2 oString = new Ejercicio2DEL2();
                    System.out.println("Digie un pequeño texto");
                    oScanner = new Scanner(System.in);
                    iniciar = Integer.parseInt(oScanner.nextLine());
                    System.out.println("Digite la palabra que quiere buscar");
                    oScanner = new Scanner(System.in);
                    finalizar = Integer.parseInt(oScanner.nextLine());
                    System.out.println(oString.toUpperCase());
                    break;
                case 7:

                    int numero;
                    System.out.println("Digite un numero");
                    oScanner = new Scanner(System.in);
                    Ejercicio3DEL2 ejc3 = new Ejercicio3DEL2();
                    numero = Integer.parseInt(oScanner.nextLine());
                    System.out.println("El String que representa el numero es: " + ejc3.valueOf(numero));
                    break;
                case 8:
                    String palab2;
                    String palab1;
                    System.out.println("Digie una pequeña oración o una palabra");
                    oScanner = new Scanner(System.in);
                    Ejercicio4DEL2 EJ4 = new Ejercicio4DEL2();
                    palab1 = (oScanner.nextLine());
                    System.out.println("Digite una palabra");
                    oScanner = new Scanner(System.in);
                    palab2 = (oScanner.nextLine());
                    System.out.println(" De los datos digitados: " + EJ4.indexOf(palab1, palab2));
                    break;
                default:
                    break;

            }

            System.out.println("Desea continuar con otra operación S/N");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;
            } else {
                validar = false;
            }

        } while (validar);
    }
}
