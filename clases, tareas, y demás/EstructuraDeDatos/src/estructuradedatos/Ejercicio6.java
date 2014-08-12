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
public class Ejercicio6 {

    private NodoDeListaInt raiz;
    private NodoDeListaInt raiz2;

    public Ejercicio6() {

        raiz = null;
        raiz2 = null;
    }

    public void insertarListaImpares(int numero) {

        NodoDeListaInt nuevo = new NodoDeListaInt();
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

    public void insertarListaPares(int numero2) {

        NodoDeListaInt nuevo = new NodoDeListaInt();
        nuevo.setNumero(numero2);
        if(raiz2 == null){
            nuevo.setSiguiente(null);
            raiz2 = nuevo;
        }else{
            NodoDeListaInt auxiliar = raiz2;
            while(auxiliar.getSiguiente() != null){
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    public void Imprimir() {
        NodoDeListaInt recorrido = raiz;
        System.out.println(" Numeros de la lista Impares son: ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }
    
    public void Imprimir2() {
        NodoDeListaInt recorrido = raiz2;
        System.out.println(" Numeros de la lista Pares son: ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }

        System.out.println();
    }
}
