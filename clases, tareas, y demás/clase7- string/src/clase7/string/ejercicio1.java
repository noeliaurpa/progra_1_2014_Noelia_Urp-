/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase7.string;

/**
 *
 * @author Urpina
 */
public class ejercicio1 {

    // ejercicio para saber si el correo que ingreso tiene el @
    // variable
    String email;

    // metodo costructor
    public ejercicio1(String pEmail) {

        this.email = pEmail;
    }

    public String ValidarCorreo() {

        String mensaje = "El correo no contiene @";

        // saber cuantos caracteres tiene una hilera = .length
        for (int i = 0; i < email.length(); i++) {

            if (email.charAt(i) == '@') {
                mensaje = "El correo si contiene @";
            }
        }
        return mensaje;
    }

}
