/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra1;

/**
 * name = Class1
 *
 * Information = this is the first class
 *
 * Date = 09/05/2014
 *
 * @author Noelia
 */
public class Progra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // 1 ejercicio-------------------------------------------------------------------------------------------------
        int N1 = 5;
        double A1 = 10.8;
        char C1 = 'a';

        System.out.print("            *** ejercicio numero 1" + "\n" + "\n");
        System.out.print("El valor de N es: " + N1 + "\n");
        System.out.print("El valor de A es: " + A1 + "\n");
        System.out.print("El valor de C es: " + C1 + "\n");
        System.out.print("La suma de N + A es: " + (N1 + A1) + "\n");
        System.out.print("La diferencia de A - N es: " + (A1 - N1) + "\n");
        System.out.print("El valor numerico de C es: " + Character.getNumericValue(C1) + "\n" + "\n");

        // 2 ejercicio -------------------------------------------------------------------------------------------------
        int X1 = 10;
        int Y1 = 56;
        double N2 = 23.9;
        double M1 = 45.7;

        System.out.print("            *** ejercicio numero 2" + "\n" + "\n");
        System.out.print("La suma de X + Y es: " + (X1 + Y1) + "\n");
        System.out.print("La resta de X - Y es: " + (X1 - Y1) + "\n");
        System.out.print("La multiplicación de X * Y es: " + (X1 * Y1) + "\n");
        System.out.print("La División de X / Y es: " + (X1 / Y1) + "\n");
        System.out.print("La suma de X + Y es: " + (N2 + M1) + "\n");
        System.out.print("La resta de X - Y es: " + (N2 - M1) + "\n");
        System.out.print("La multiplicación de X * Y es: " + (N2 * M1) + "\n");
        System.out.print("La División de X / Y es: " + (N2 / M1) + "\n" + "\n");

        // 3 ejercicio --------------------------------------------------------------------------------------------------
        int N3 = 40;

        System.out.print("            *** ejercicio numero 3" + "\n" + "\n");
        System.out.print("Al incrementar,decrementar y duplicar N da como resultado " + (((N3 + 77) - 3) * 2) + "\n");

        // 4 ejercicio ---------------------------------------------------------------------------------------------------
        int A2 = 6;
        int B1 = 10;
        int C2 = 16;
        int D1 = 19;
        int E = B1;

        System.out.print("            *** ejercicio numero 4" + "\n" + "\n");
        System.out.print("El valor de B es igual a el valor de C, o sea: " + (B1 = C2) + "\n");
        System.out.print("El valor de C es igual a el valor de A, o sea: " + (C2 = A2) + "\n");
        System.out.print("El valor de A es igual a el valor de D, o sea: " + (A2 = D1) + "\n");
        System.out.print("El valor de D es igual a el valor de B, o sea: " + (D1 = E) + "\n" + "\n");

        // 5 ejercicio ------------------------------------------------------------------------------------------------
        int A3 = 178;

        System.out.print("            *** ejercicio numero 5" + "\n" + "\n");
        if ((A3 % 2) == 0) 
        {
            System.out.print("El numero es par" + "\n" + "\n");
        } 
        else 
        {
            System.out.print("El numero es impar" + "\n" + "\n");
        }

        // 6 ejercicio -------------------------------------------------------------------------------------------------
        int B2 = 45;

        System.out.print("            *** ejercicio numero 6" + "\n" + "\n");
        if (B2 >= 0) 
        {
            System.out.print("El numero es positivo" + "\n" + "\n");
        } 
        else 
        {
            System.out.print("El numero es negativo" + "\n" + "\n");
        }

        // 7 ejercicio ------------------------------------------------------------------------------------------------
        int C3 = 150;

        System.out.print("            *** ejercicio numero 7" + "\n" + "\n");
        if (C3 >= 0) 
        {
            System.out.print("El numero es positivo" + "\n" + "\n");
        } 
        else 
        {
            System.out.print("El numero es negativo" + "\n" + "\n");
        }

        if ((C3 % 2) == 0) 
        {
            System.out.print("El numero es par" + "\n" + "\n");
        } 
        else 
        {
            System.out.print("El numero es impar" + "\n" + "\n");
        }

        if ((C3 % 5) == 0) 
        {
            System.out.print("El numero es multiplo de 5" + "\n" + "\n");
        } 
        else 
        {
            System.out.print("El numero no es multiplo de 5" + "\n" + "\n");
        }

        if ((C3 % 10) == 0) 
        {
            System.out.print("El numero es multiplo de 10" + "\n" + "\n");
        } 
        else 
        {
            System.out.print("El numero no es multiplo de 10" + "\n" + "\n");
        }

        if (C3 >= 100) 
        {
            System.out.print("El numero es mayor a 100" + "\n" + "\n");
        } 
        else 
        {
            System.out.print("El numero es menor a 100" + "\n" + "\n");
        }
    }

}
