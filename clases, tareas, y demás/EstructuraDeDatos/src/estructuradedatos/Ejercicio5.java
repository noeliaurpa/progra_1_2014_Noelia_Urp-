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
public class Ejercicio5 {

    private NodoDeListaInt raiz;
    private int arreglo[];
    
    Scanner teclado = new Scanner(System.in);
    
    public Ejercicio5(){
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

        Ordenamiento2();
        raiz=null;
        for (int i = 0; i < cantidadElementos; i++) {
           
            InsertarElementos(arreglo[i]);
        }
        imprimir2();
        
        Ordenamiento();
        
        raiz=null;
        for (int i = 0; i < cantidadElementos; i++) {
           
            InsertarElementos(arreglo[i]);
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
                if (arreglo[indice2 + 1] > arreglo[indice2]) {
                    auxiliar = arreglo[indice2 + 1];
                    arreglo[indice2 + 1] = arreglo[indice2];
                    arreglo[indice2] = auxiliar;
                }
            }
        }
        return arreglo;
    }
    public int[] Ordenamiento2() {
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

    public void InsertarElementos(int num) {
        NodoDeListaInt nuevo = new NodoDeListaInt();
        nuevo.setNumero(num);
        
        if(raiz == null){
            nuevo.setSiguiente(null);
            raiz = nuevo;
        }else{
            NodoDeListaInt auxiliar = raiz;
            while(auxiliar.getSiguiente() != null){
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    public void imprimir2(){
        NodoDeListaInt recorrido = raiz;
        System.out.println("\n Numeros de la lista ordenados \n ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }

        System.out.println();
    }
    
    public void imprimir(){
        NodoDeListaInt recorrido = raiz;
        System.out.println("\n Numeros de las listas donde el primer nodo es el"
                + " ultimo y el ultimo es el primero \n ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }

        System.out.println();
    }
}
