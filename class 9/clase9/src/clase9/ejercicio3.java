/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase9;

/**
 *
 * @author Urpina
 */
public class ejercicio3 {
    //Declaracion y creacion del array
    double mañana[] = new double[4];
    double tarde [] = new double[4];
    
    public void GuardarSalarioMañana(double pmañana)
    {
        for (int i = 0; i < mañana.length; i++) {
            if(mañana[i]==0){
            mañana[i]= pmañana;
            break;
            }
        }
    }
        public void GuardarSalarioTarde(double pTarde)
    {
        for (int i = 0; i < tarde.length; i++) {
            if(tarde[i]==0){
            tarde[i]= pTarde;
            break;
            }
        }
    }
        
    public String SalarioMañana()
    {
        String retorno="Gasto de salario de la mañana"+"\n";
     double total=0;
        for (int i = 0; i < mañana.length; i++) {
            total=total + mañana[i];
        }
        return retorno + total;
    }
      public String SalarioTarde()
    {
        String retorno="Gasto de salario de la noche" + "\n" ;
     double total=0;
        for (int i = 0; i < tarde.length; i++) {
            total+=tarde[i];
        }
        return retorno+total;
    }
    
}

