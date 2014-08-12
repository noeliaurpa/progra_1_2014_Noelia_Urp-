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
public class Ejercicio1DEL2{
    
    private String oracion;
    
    public String substring(int iniciar, int finalizar) throws Exception{
    
        String retorno="";  
         
         if(finalizar<iniciar)
         {
             throw new Exception("Error el final no puede ser menor al inicio");  
         }
         if(getOracion().length()<0)
         {
             throw new Exception("La hilera tiene que contener caracteres"); 
         }
          
         for (int i = iniciar-1; i < finalizar; i++) {
             retorno+=getOracion().charAt(i);
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
