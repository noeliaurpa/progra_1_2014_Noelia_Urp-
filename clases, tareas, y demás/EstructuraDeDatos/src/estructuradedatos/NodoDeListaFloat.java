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
public class NodoDeListaFloat {
    
    private float numero;
    private NodoDeListaFloat siguiente;
    
    
    public NodoDeListaFloat(){
        numero = 0;
    
    }

    /**
     * @return the numero
     */
    public float getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(float numero) {
        this.numero = numero;
    }

    /**
     * @return the siguiente
     */
    public NodoDeListaFloat getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoDeListaFloat siguiente) {
        this.siguiente = siguiente;
    }
    
}
