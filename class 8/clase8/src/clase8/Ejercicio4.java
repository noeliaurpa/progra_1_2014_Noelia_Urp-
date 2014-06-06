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
public class Ejercicio4 {

    private String oracion;
    private String palabra;

    public int ocurrencia(String oracion, String palabra) {
        int veces = 0;
        int posicion = 0;
        int Acum1 = 0;
        int Acum = 1;

        while (posicion != -1) {
            posicion = oracion.indexOf(palabra, posicion + 1);

            if (posicion != -1) {
                veces = veces + 1;
                Acum = 1;
                Acum1 = Acum + veces;
            }

        }
        return Acum1;
    }

}
