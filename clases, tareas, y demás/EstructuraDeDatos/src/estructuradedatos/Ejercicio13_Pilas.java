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
public class Ejercicio13_Pilas {

    private NodoDeListaInt raiz;

    public Ejercicio13_Pilas() {
        raiz = null;
    }

    public void push_Pila1(int dato) {
        NodoDeListaInt nuevo = new NodoDeListaInt();
        nuevo.setNumero(dato);

        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
    }

    public void push_Pila2(int dato) {
        NodoDeListaInt nuevo = new NodoDeListaInt();
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
        NodoDeListaInt recorrido = raiz;
        System.out.println(" Los numeros de la pila1 son: ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

    public void imprimir_Pila2() {
        NodoDeListaInt recorrido = raiz;
        System.out.println(" Los numeros de la pila2 son: ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }

}
