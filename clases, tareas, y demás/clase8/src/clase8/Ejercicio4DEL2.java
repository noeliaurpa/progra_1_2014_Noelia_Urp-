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
public class Ejercicio4DEL2 {
    
    public String indexOf(String palab1, String palab2){
        String resp = "";
        int posi = palab1.indexOf(palab2);
        if (posi == -1) {
            resp = (palab2 + " ,no está contenido en: " + palab1 + " = -1");
        } else {
            resp = (palab2 + " ,está contenido en: " + palab1 + " ,a partir de la posición = " + posi);
        }
        return resp;
    }
}
