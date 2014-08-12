/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_17;

import java.util.Scanner;

/**
 *
 * @author Noelia Urpi
 */
public class Clase_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar = true;
        char continuar;
        int opcion = 0;

        Scanner teclado = new Scanner(System.in);

        Lista oLista = new Lista();
        oLista.Insertar("Efren", "201111-4");
        oLista.Insertar("Joss ", "3675949-5");
        oLista.Insertar("Navas", "7444455-6");
        oLista.Imprimir();

        do {
            System.out.println(" Menu del juego ");

            System.out.println("1. Parte 1 ");

            System.out.println("2. Parte 2 ");

            System.out.println("3. Parte 3 ");
            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                // parte 1 o case 1 donde se realiza el primer ejercicio
                case 1:
                    String nombre = "";
                    String cuentaBancaria = "";
                    System.out.println(" Digite el nombre que desea eliminar ");
                    nombre = teclado.nextLine();
                    oLista.eliminarDatoBuscado(nombre);
                    oLista.Imprimir();
                    break;
                case 2:
                    
                    System.out.println("   ");
                    oLista.eliminarUltimoElemento();
                    break;
                case 3:
                    System.out.println("   ");
                    oLista.eliminarPrimerElemento();
                    oLista.Imprimir();
                    break;
            }
        }while (validar);
    }

}
