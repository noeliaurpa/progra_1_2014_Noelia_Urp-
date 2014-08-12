/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appciclos;

import javax.swing.JOptionPane;

/**
 *
 * @author Urpina
 */
public class AppCiclos {
    private static char respuesta;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        int numero2;
        char respuesta = 'S', opt;
        String tabla;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite hasta que numero desea multiplicar"));
        clsTabla t = new clsTabla (numero,numero2);
        do
        {
            opt = JOptionPane.showInputDialog("Digite la opción:"
                    + '\n' + "1. Ciclo while"
                    + '\n' + "2. Ciclo do while"
                    + '\n' + "3. Ciclo for").charAt(0);
            switch (opt)
            {
                case '1':
                    tabla = t.calculawhile();
                    JOptionPane.showMessageDialog(null, tabla);
                    break;
               case '2':
                    tabla = t.calculaDowhile();
                    JOptionPane.showMessageDialog(null, tabla);
                   break;
              case '3':
                    tabla = t.calculaFor();
                    JOptionPane.showMessageDialog(null, tabla);
                    break;
              default:
                  JOptionPane.showMessageDialog(null, "Error: Numero de opción no existe");
            }
            respuesta = JOptionPane.showInputDialog("Desea continuar").charAt(0);
    
        }while ((respuesta == 'S')||(respuesta == 's'));
        
    }
    
    
}
