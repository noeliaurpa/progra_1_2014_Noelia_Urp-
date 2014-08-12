/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package estructuradedatos;

import java.util.List;

/**
 *
 * @author Urpina
 */
public class NodoDeListaInt {
    
    private int numero;
    private NodoDeListaInt siguiente;
    private NodoDeListaInt anterior;
    
    public NodoDeListaInt(){
        numero = 0;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the siguiente
     */
    public NodoDeListaInt getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDeListaInt siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoDeListaInt getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoDeListaInt anterior) {
        this.anterior = anterior;
    }
}
