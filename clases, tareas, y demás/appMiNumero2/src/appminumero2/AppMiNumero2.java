/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appminumero2;

import javax.swing.JOptionPane;

/**
 *
 * @author Urpina
 */
public class AppMiNumero2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // variables
        char res;
        int opt;
        int numero=0;

        // instancia
        clsMiNum2 MN2 = null;

        //ciclo do while
        do {
            // menú
            do {
                opt = Integer.parseInt(JOptionPane.showInputDialog("menú:"
                        + '\n' + "1. crear numero"
                        + '\n' + "2. Tipo Numero"
                        + '\n' + "3. Factorial"
                        + '\n' + "4. Fibonacci"
                        + '\n' + "5. Salir"));
                switch (opt) {

                    case 1:
                        // donde pide el numero
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
                        MN2 = new clsMiNum2();
                        MN2.setN(numero);
                        break;
                    case 2:
                        // llamar metodo tiponumero
                        if (MN2.TipoNumero() == 1) {
                            JOptionPane.showMessageDialog(null, "PERFECTO");
                        }
                        else if (MN2.TipoNumero() == 2) {
                            JOptionPane.showMessageDialog(null, "DEFICIENTE");
                        } else {
                            JOptionPane.showMessageDialog(null, "ABUNDANTE");
                        }
                        break;
                    case 3:
                        // factorial
                        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + MN2.Factorial());
                    
                    case 5:
                        System.exit(0);
                        break;
                }
            } while (opt < 3);

            res = JOptionPane.showInputDialog("Disea continuar").charAt(0);
        } while ((res == 'S') || (res == 's'));
    }

}
