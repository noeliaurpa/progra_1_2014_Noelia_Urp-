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
public class Pila {
    private NodoDeLista raiz;
    
    public Pila (){
        raiz = null;
    }
    
    public void push (String dato){
        
        NodoDeLista nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        
        if(raiz == null){
            
            nuevo.setSiguiente(null);
            raiz = nuevo;
            
        }else{
            
            nuevo.setSiguiente(raiz);
            raiz = nuevo;
        }
    
    }
    
    public Object Pop(){
        if(raiz != null){
            Object info = raiz.getDato();
            raiz = raiz.getSiguiente();
            return info;
        }
        
        return new Object();
    }
    
    public void imprimir(){
        NodoDeLista recorrido = raiz;
        System.out.println(" Listado de todos los elementos de la pila ");
        while(recorrido != null){
            System.out.println(recorrido.getDato() + '-');
            recorrido = recorrido.getSiguiente();
        }
        System.out.println("");
    }
    
    public boolean vacia(){
        if(raiz == null){
            return true;
        }else{
            return false;
        }
    }
    
    public int Cantidad(){
        int cantidad = 0;
        NodoDeLista recorrido = raiz;
        while(recorrido != null){
            cantidad++;
            recorrido = recorrido.getSiguiente();
        }
        return cantidad;
    }
}
