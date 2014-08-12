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
public class Ejercicio2 {
    
    private NodoDeListaInt raiz;
    
    public void insertarNumeros( int numero){
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
    
    public void imprimir(){
        int contador = 0;
        NodoDeListaInt recorrido = raiz;
        while(recorrido != null){
            recorrido = recorrido.getSiguiente();
            contador++;
        }
        System.out.println(" La cantidad de numeros digitados es:  " + (contador -1));
    }
}
