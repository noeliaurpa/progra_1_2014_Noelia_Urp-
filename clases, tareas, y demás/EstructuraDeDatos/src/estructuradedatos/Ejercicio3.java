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
public class Ejercicio3 {
    
    private NodoDeListaFloat raiz;
    
    public void InsertarElementos( float numero){
        NodoDeListaFloat nuevo;
        nuevo = new NodoDeListaFloat();
        nuevo.setNumero(numero);
        if(raiz == null){
            nuevo.setSiguiente(null);
            raiz = nuevo;
        }else{
            NodoDeListaFloat auxiliar = raiz;
            while(auxiliar.getSiguiente() != null){
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
    }
    
    public void Imprimir() {
        NodoDeListaFloat recorrido = raiz;
        System.out.println("\n Numeros de la lista \n ");
        while (recorrido != null) {
            System.out.println(recorrido.getNumero());
            recorrido = recorrido.getSiguiente();
        }

        System.out.println();
    }
}
