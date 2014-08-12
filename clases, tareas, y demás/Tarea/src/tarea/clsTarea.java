/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea;

import javax.swing.JOptionPane;
import static javax.swing.text.html.HTML.Attribute.N;

/**
 *
 * @author Urpina
 */
public class clsTarea {
   

    //atributos de la clase
    private int numero;

    //metodo constructor
    public clsTarea(int pNum) {
        this.numero = pNum;
    }
    
    // constructor vacio
    public clsTarea(){
        
    }
    
    // metodo que me asigna el valor del nuevo numero
    public void setNumero(int pNumero){
        this.numero = pNumero;
    }                     

    //metodo que me lleva a los divisores del numero
    public int sumaDivisores() {
        int cont = 1;
        int CD = 0;
        while (cont <= numero) {
            if (numero % cont == 0) {
                CD = CD + cont;
            }
            cont++;
        }
        return CD;
    }

    // metodo que me diga si es primo o compuesto
    public boolean esPrimo() {
        if (sumaDivisores() == (numero + 1)) {
            return true;
        } else {
            return false;
        }
    }
}
