/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuradedatos;

/**
 *
 * @author Urpina
 */
public class Ejercicio4 {
    
    NodoDeListaInt raiz;
    
    public void InsertarElementosPrimeraLista( int numero){
        NodoDeListaInt nuevo;
        nuevo = new NodoDeListaInt();
        nuevo.setNumero(numero);
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
    
    public void InsertarElementosSegundaLista( int numero){
        NodoDeListaInt nuevo;
        nuevo = new NodoDeListaInt();
        nuevo.setNumero(numero);
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
    
    public void Imprimir() {
        NodoDeListaInt recorrido = raiz;
        System.out.println("\n Numeros de las listas \n ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }

        System.out.println();
    }
}
