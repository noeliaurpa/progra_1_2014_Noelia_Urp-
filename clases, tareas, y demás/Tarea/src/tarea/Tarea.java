/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tarea;

import javax.swing.JOptionPane;

/**
 *
 * @author Urpina
 */
public class Tarea {
    private static char opt;
    private static Object CD;
    private static boolean res;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // Las variables         
        char respuesta = 'S', opt;
        boolean primo;
        int numero = 2;
        //instancia
        clsTarea t = new clsTarea();
        do {
            opt = JOptionPane.showInputDialog("Digite la opción:"
                    + '\n' + "1. Digitar un numero (actual "+numero+")"
                    + '\n' + "2. Suma de divisores"
                    + '\n' + "3. Es primo").charAt(0);
            switch (opt) {
                case '1':
                    // se solicita la información al usuario
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));                      
                    t.setNumero(numero);
                    break;
                case '2':
                    int sumaDivi = t.sumaDivisores();
                    JOptionPane.showMessageDialog(null, "La suma de divisores de " + numero + " es " + sumaDivi);
                    break;
                case '3':
                    primo = t.esPrimo();
                    if (primo)
                        JOptionPane.showMessageDialog(null, "El numero " + numero + " es primo");
                    else
                        JOptionPane.showMessageDialog(null, "El numero " + numero + " es compuesto");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error: Numero de opción no existe");
            }
            respuesta = JOptionPane.showInputDialog("Desea continuar").charAt(0);
        } while ((respuesta == 'S') || (respuesta == 's'));
    }
}
