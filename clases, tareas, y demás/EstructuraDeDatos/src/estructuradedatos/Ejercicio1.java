/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradedatos;

import java.util.Scanner;

/**
 *
 * @author Urpina
 */
public class Ejercicio1 {

    private NodoDeListaInt raiz;
    int arreglo[];
    
    Scanner teclado = new Scanner(System.in);

    
    public Ejercicio1() {
        raiz = null;
    }
    
    public void hacerArreglo( int cantidadElementos) {
        arreglo = new int[cantidadElementos]; 
        
        
        int cantidad=0;
        
        NodoDeListaInt recorrido = raiz;
        while (recorrido != null) {
            arreglo[cantidad]=recorrido.getNumero();
            recorrido = recorrido.getSiguiente();
            cantidad++;
        }

        
        
        Ordenamiento();
        
        raiz=null;
        for (int i = 0; i < cantidadElementos; i++) {
           
            InsertarNumeros(arreglo[i]);
        }
    }
    public int[] Ordenamiento() {
        int indice;
        int indice2;
        int auxiliar;

        //cilo que lleva el metodo a ordenar
        for (indice = 0; indice < arreglo.length; indice++) {
            //intercambiando los valores/ borbujeando los valores
            for (indice2 = 0; indice2 < (((arreglo.length) - indice) - 1); indice2++) {
                if (arreglo[indice2 + 1] < arreglo[indice2]) {
                    auxiliar = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = auxiliar;
                }
            }
        }
        return arreglo;
    }

    public void InsertarNumeros(int num) {
        NodoDeListaInt nuevo;
        nuevo = new NodoDeListaInt();
        nuevo.setNumero(num);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoDeListaInt auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }

    public void Imprimir() {
        NodoDeListaInt recorrido = raiz;
        System.out.println(" Numeros de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }

        System.out.println();
    }
}
