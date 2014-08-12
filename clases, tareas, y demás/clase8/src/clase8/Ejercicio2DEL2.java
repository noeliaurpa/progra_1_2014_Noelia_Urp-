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
public class Ejercicio2DEL2 {
 
    private String oracion;
    
     public String toUpperCase()
    {
        String retorno="";
        
        String mayusculas="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String minusculas="abcdefghijklmnñopqrstuvwxyz";
                
        int index=0;
        
         for (int i = 0; i < getOracion().length(); i++) {
             if(Character.isLowerCase(getOracion().charAt(i)))
             {
                index= minusculas.indexOf(getOracion().charAt(i));
                retorno+=mayusculas.charAt(index);
             }
            else
             {
                 retorno+=getOracion().charAt(i);
             }
         }
         return retorno;
     }

    /**
     * @return the oracion
     */
    public String getOracion() {
        return oracion;
    }

    /**
     * @param oracion the oracion to set
     */
    public void setOracion(String oracion) {
        this.oracion = oracion;
    }
    
}
