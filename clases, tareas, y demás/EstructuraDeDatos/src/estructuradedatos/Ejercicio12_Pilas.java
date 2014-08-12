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
public class Ejercicio12_Pilas {
    
    private NodoDeListaFloat raiz;

    public Ejercicio12_Pilas() {
        raiz = null;
    }

    public void push_Pila1(float dato) {
        NodoDeListaFloat nuevo = new NodoDeListaFloat();
        nuevo.setNumero(dato);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
    }

    public void push_Pila2(float dato) {
        NodoDeListaFloat nuevo = new NodoDeListaFloat();
        nuevo.setNumero(dato);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
    }

    public void imprimir_Pila1() {
        NodoDeListaFloat recorrido = raiz;
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }
    }

    public void imprimir_Pila2() {
        NodoDeListaFloat recorrido = raiz;
        System.out.println(" Los numeros de las pilas son: ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }
    }
}
