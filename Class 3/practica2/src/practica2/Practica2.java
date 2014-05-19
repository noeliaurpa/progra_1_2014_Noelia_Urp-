/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * fecha: 17 / 05 / 2014
 * 
 * 
 * @author Noelia
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
         //variable
        int num;

        // importar
        Scanner teclado = new Scanner(System.in);

        System.out.println("   Practica 1    ");
        // digitar los datos
        System.out.println("Digite un numero");

        // imprimir
        num = Integer.parseInt(teclado.nextLine());

        // ciclo for
        for (int i = 0; i < num; i++) {
            System.out.print("*" + "\n");
        }
            System.out.print("\n");
        

        
        // variables
        int n;
        int y;

        System.out.println("   Practica 2    ");
        // digitar los datos para comenzar el conteo
        System.out.println("Digite un primer numero");
        n = Integer.parseInt(teclado.nextLine());
        // digitar los datos para finalizar el conteo
        System.out.println("Digite un segundo numero");
        y = Integer.parseInt(teclado.nextLine());
// Ciclo for para que vaya contando y que aparezca un asterisco si el numero 
//que sigue es multiplo del segundo numero digitado por el usuario.
        for (int i = 0; i <= n; i++) {
            if ((i % y) != 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print("*" + ", ");
            }
        }
        System.out.print("\n");
        
        
        
        // variables
        float a;
        float b;
        float c;

        System.out.println("\n");
        System.out.println("   Practica 3    ");
        // para que el usuario digite el numero en que desea que inicie el conteo
        System.out.println("Digite un numero inicial");
        a = Float.parseFloat(teclado.nextLine());
        // para que el usuario digite el numero en que desea que finalice el conteo
        System.out.println("Digite un numero para finalizar");
        b = Float.parseFloat(teclado.nextLine());
        // para que el usuario digite de cuanto en cuanto quiere que vaya contando
        System.out.println("Digite de cuanto en cuanto quiere que vaya incrementando");
        c = Float.parseFloat(teclado.nextLine());
        
        // ciclo para que vaya contando los numeros dependiendo de lo q digitaron. ejemplo que vaya de 2 en 2
        for (float i = a; i <= b; i = i + c){
            System.out.print(i + "\n");
        }
            System.out.print("\n");
        
        
        
        // variables
        float f;
        int e;
        float resultado = 1;

        System.out.println("   Practica 4    ");
        // para que el usuario digite un numero
        System.out.print("Digite un número");
        f = Float.parseFloat(teclado.nextLine());
        // para que el usuario digite el numero que desea elevar
        System.out.print("Digite el número al que desea elevar");
        e = Integer.parseInt(teclado.nextLine());
        // ciclo para que me cambie de un numero decimal a uno entero
        for (int i1 = 1; i1 <= e; i1++) {
            resultado = resultado * f;
        }
        System.out.print(resultado + "\n");
        System.out.print("\n");
        
        
        
        
        
        System.out.println("   Practica 5    ");
        // ciclo para que vaya desde 11111 hasta 99999
        for (int i2 = 11111; i2 <= 99999; i2++) {
            System.out.print(i2 + "\n");
        }
        System.out.print("\n");
        
        
        // variables
        int num2;
        int n1;
        int i3 = 0;
        int acum = 0;
        int acum2 = 0;
        System.out.println("   Practica 6    ");
        // para que el usuario me diga cuantos numeros quiere ingresar
        System.out.print("Digite cuantos numeros desea ingresar");
        num2 = Integer.parseInt(teclado.nextLine());
        // ciclo para que me diga cuantos numeros pares e impares ingresa el usuario
        do {
            System.out.print("Digite un numero" + "\n");
            n1 = Integer.parseInt(teclado.nextLine());
            if ((n1 % 2) == 0) {
                acum = acum + 1;
            } else {
                acum2 = acum2 + 1;
            }
            i3++;
        } while (i3 < num2);
        System.out.print(" Hay " + acum + " pares " + " y " + acum2 + " impares ");
        System.out.print("\n");
        
        
        
        
        // variables
        int k;
        int R = 0;
        System.out.println("   Practica 7    ");
        // para que el usuario me diga a cual numero quiere que aparezca la tabla de multiplicar
        System.out.print("Digite un numero para desplegar la tabla de multiplicar con ciclo for");
        k = Integer.parseInt(teclado.nextLine());
        // ciclo para que imprima la tabla de multiplicar del numero deseado
        for (int i10 = 1; i10 <= 10; i10++) {
            R = k * i10;
            System.out.print(k + " * " + i10 + " = " + R + "\n");
        }
        //variables
        int i4 = 1;
        int k1;
        // para que el usuario me diga a cual numero quiere que aparezca la tabla de multiplicar
        System.out.print("Digite un numero para desplegar la tabla de multiplicar con ciclo while");
        k1 = Integer.parseInt(teclado.nextLine());
        // ciclo para que imprima la tabla de multiplicar del numero deseado
        while (i4 <= 10) {
            R = k1 * i4;
            System.out.print(k1 + " * " + i4 + " = " + R + "\n");
            i4++;
        }
        // variables
        int i5 = 1;
        int k2;
        // para que el usuario me diga a cual numero quiere que aparezca la tabla de multiplicar
        System.out.print("Digite un numero para desplegar la tabla de multiplicar con ciclo do while");
        k2 = Integer.parseInt(teclado.nextLine());
        // ciclo para que imprima la tabla de multiplicar del numero deseado
        do {
            R = k2 * i5;
            System.out.print(k2 + " * " + i5 + " = " + R + "\n");
            i5++;
        } while (i5 <= 10);
        System.out.print("\n");
        
        
        
        // variables
        int numeros = 0;
        int i6 = 0;
        int suma = 0;
        float promedio;

        System.out.println("   Practica 8    ");
        // ciclo para que imprima el promedio de x numeros
        while (i6 < 10) {
            System.out.print("Digite un nunero");
            numeros = Integer.parseInt(teclado.nextLine());
            suma = suma + numeros;
            i6++;
        }
        promedio = suma / i6;
        System.out.print("El promedio de los numeros es: " + promedio + "\n");
        System.out.print("\n");
        
        
        
        // variables
        int cont5 = 0;
        int numer;
        double suma1 = 0;
        double prome = 0;
        System.out.println("   Practica 9    ");
        // ciclo para que imprima el promedio de 10 numeros paro si colocan un 0 se termina el ciclo 
        // y aparece el promedio de los numeros digitados antes del 0
        do{
            System.out.print("Digite un numero");
            numer = Integer.parseInt(teclado.nextLine());
            if (numer > 0 && numer <= 10){
                suma1 = suma1 + numer;
            cont5++;
            } else{
                System.out.print(" Error por haber digitado un 0" + "\n");
                prome = suma1 / cont5;
                cont5 = numer;
            }
        }while (cont5 <= 10 && cont5 != 0);
        System.out.print("El promedio de los numeros digitados es de: " + prome);
        System.out.print("\n");
        
        
        
        
        
        // variables
        int nume;
        System.out.println("   Practica 10    ");
        // ciclo para que me imprima el valor de 1 dolar hasta 10 dolares en colones
        for (int i7 = 1; i7 <= 10; i7++) {
            nume = i7 * 560;
            System.out.print(i7 + " dolar " + " = " + nume + " colones " + "\n");
        }
        System.out.print("\n");
        
      
        
        
        
        // variable
        double inv = 1000;
        System.out.println("   Practica 11    ");
        // ciclo para que me diga cuanto puede tener una persona en un año si invierte $1000 y tiene un interes de 2%
        for (int cont = 1; cont <= 12; cont++){
            inv = ((inv * 0.02) + inv);
        }
        System.out.print("En un año tendrá " + inv + " invertido" + "\n");
        System.out.print("\n");
        
        
        
        
      System.out.println("   Practica 12    ");
      // ciclo para que me imprima la hora desde 00: 00 : 00 hasta 23: 59 : 59
        for (int h = 0; h <= 23; h++)
            for (int m = 0; m <= 59; m++)
                for (int s = 0; s <= 59; s++)
            System.out.print(h + " : " + m + " : " + s + "\n");
        System.out.print("\n");
        
        
        
        // variables
        double inv2 = 1000;
        double cont2 = 0;
        System.out.println("   Practica 13    ");
        // ciclo para que me diga en cuantos meses tiene una persona $1500, si cada mes invierte $1000 con un interes del 2% 
            for (cont2 = 0; inv2 < 1500; cont2++)
                if (inv2 <= 1500){
                    inv2 = ((inv2 * 0.02) + inv2);
                }
            System.out.print("En " + cont2 + " meses tendrá $1500 dólares" + "\n");
            System.out.print("\n");
            
            

            // variables
        int i8 = 1;
        int i9 = 1;
        int p;
        System.out.println("   Practica 14    ");
        // para que el usuario digite hasta que numero desea ver las filas
        System.out.print("Digite hasta que numero desea que aparezca en las filas");
        p = Integer.parseInt(teclado.nextLine());
        while(i8 <= p){
            if (i9 <= i8){
                System.out.print(i9);
                i9 = i9 + 2;
            }else{
                i9 = 1;
                System.out.print("\n");
                i8 = i8 + 2;
            }
        }
    }
}
