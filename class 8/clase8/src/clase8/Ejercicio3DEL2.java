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
public class Ejercicio3DEL2 {
    
    public String valueOf (int i){
        String res = "";
        if (i == 0)
            res = "0";
        if (i < 0)
            res = " - " + " Es negativo ";
        if (i > 0)
            res = " + " + " Es positivo " + res.valueOf(i);
    return res;
    }
}
