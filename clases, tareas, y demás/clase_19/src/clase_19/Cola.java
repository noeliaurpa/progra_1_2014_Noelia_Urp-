/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_19;

/**
 *
 * Noelia Urpi
 */
public class Cola {

    private NodoDeLista raiz;
    private NodoDeLista ultimo;

    public Cola() {
        raiz = null;
    }

    public boolean vacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void Encolar(String dato) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setSiguiente(null);
        if (vacia()) {
            raiz = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }
    
    public Object Desencolar(){
        if(!vacia()){
            Object dato = raiz.getDato();
            if(raiz == ultimo){
                raiz = null;
                ultimo = null;
            }else{
                raiz = raiz.getSiguiente();
            }
            return dato;
        }
        return new Object();
    }
    
    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println(" Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato() + "-");
            recorrido = recorrido.getSiguiente();
        }
        System.out.println();
    }
}
