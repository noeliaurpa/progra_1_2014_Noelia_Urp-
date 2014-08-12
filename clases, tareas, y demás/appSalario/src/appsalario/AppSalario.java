/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appsalario;

import javax.swing.JOptionPane;

/**
 *
 * @author Urpina
 */
public class AppSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // variable
        int montoPrestamo;
        int cantidadAbono;
        char res;

        do {

            // se piden los datos al usuario
            montoPrestamo = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del monto del prestamo"));
            cantidadAbono = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que se abona por mes"));

            //calcular cuanto se paga al terminar de canselar el prestamo
            int cont = montoPrestamo;
            double montoTotal = 0;
            double intereses;
            double abono;

            if (montoTotal == 0) {
                while (cont > 0) {
                    intereses = (cont * 0.03);
                    abono = (cantidadAbono + intereses);
                    montoTotal = (montoTotal + abono);
                    cont = cont - cantidadAbono;
                }
            }
            JOptionPane.showMessageDialog(null, "El monto a pagar es: " + montoTotal);

            res = JOptionPane.showInputDialog("¿Desea continuar?").charAt(0);
        } while ((res == 'S') || (res == 's'));

    }

}
// diseñe un algoritmo que reciba como entrada el monto de un prestamo (MontoPrestamo) y la cantidad
//que se abona (MontoAbono) por mes por dicho prestamo.Calcule e imprima el montoTotal que se ha pagado 
//al cancelar la cuenta si se sabe que cada mes además del abono debe agregarse al pago un 3% de interes 
//sobre el saldo de la cuenta antes de restar el abono.
// Nota: no se conoce el plazo del prestamo, por lo tanto se sabe que ya se canceló cuando el saldo de 
// este sea cero. El interes es un pago adicional, este no se deduce del saldo del prestamo.
