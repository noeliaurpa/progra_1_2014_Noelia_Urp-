/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase8;

/**
 *
 * @author Urpina
 */
public class Ejercicio3 {
    
    private String palabra;
    private String oracion;

    public String buscarPalabra(String oracion, String palabra) {
        String copia;
        int posicion = oracion.indexOf(palabra);

        if (posicion != 1) {
            copia = oracion.substring(0, posicion) + " - " + oracion.substring(posicion);
        } else {
            copia = ("No fue encontrada la palabra " + palabra + " en el texto");
        }
        return copia;
    }
    
}
