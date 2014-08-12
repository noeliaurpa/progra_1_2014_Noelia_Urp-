/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_17;

/**
 *
 * @author Noelia Urpi
 */
public class Lista {

    // variable
    private NodoDeLista raiz;

    //metodo constructor
    public Lista() {
        raiz = null;
    }

    public void Insertar(String dato, String cuentaBancaria) {
        NodoDeLista nuevo;
        nuevo = new NodoDeLista();
        nuevo.setDato(dato);
        nuevo.setCuentaBancaria(cuentaBancaria);
        if (raiz == null) {
            nuevo.setSiguiente(null);
            raiz = nuevo;
        } else {
            NodoDeLista auxiliar = raiz;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            //raiz = auxiliar
        }
    }

    public void Imprimir() {
        NodoDeLista recorrido = raiz;
        System.out.println(" Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato() + "  , La cuenta bancaria es:  " + recorrido.getCuentaBancaria());
            recorrido = recorrido.getSiguiente();
        }

        System.out.println();
    }

    public boolean EstaVacia() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public void eliminarUltimoElemento() {
        NodoDeLista recorrido = raiz;
        System.out.println(" Listado de todos los elementos de la lista");
        while (recorrido != null) {
            System.out.println(recorrido.getDato() + "  , La cuenta bancaria es:  " + recorrido.getCuentaBancaria());
            recorrido = recorrido.getSiguiente();
            if (recorrido.getSiguiente() == null) {
                recorrido = null;
            }
        }

        System.out.println();
    }

    public void eliminarPrimerElemento() {
        if (raiz != null) {
            raiz = raiz.getSiguiente();
        }
    }

    public void eliminarDatoBuscado(String nombre) {
        NodoDeLista anterior = null;
        NodoDeLista siguiente = raiz;
        
        while(siguiente != null)
        {
            String nombres=siguiente.getDato();
            //.trim limpiar espacios en blanco
            if(nombres.trim().equals(nombre.trim()))
            {
                if(siguiente != null)
                {
                    anterior.setSiguiente(siguiente.getSiguiente());
                    raiz=anterior;
                    return;
                    
                }   
            }
            anterior=siguiente;
            siguiente = siguiente.getSiguiente();
        }
    }
}
