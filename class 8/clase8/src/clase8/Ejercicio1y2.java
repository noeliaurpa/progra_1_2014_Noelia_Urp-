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
public class Ejercicio1y2 {

    // atributos
    private String letras;
    private String Buscar;

    // metodo para que me muestre la palabra al reves
    public String Alrevez() {
        String respuesta = "";
        for (int i = getLetras().length() - 1; i >= 0; i--) {
            //el de abajo (+=) es lo mismo que decir retorno = retorrno + getCadena...
            respuesta += getLetras().charAt(i);
        }
        return respuesta;
    }

    public String palindromoPalabrayPalabraAlreves() {
        String mismaPalabraAlrevez = "";
        for (int i = getLetras().length() - 2; i >= 0; i--) {
            //el de abajo es lo mismo que decir retorno = retorrno + getCadena...
            mismaPalabraAlrevez += getLetras().charAt(i);
        }
        return mismaPalabraAlrevez;
    }

    public String menos(String palabra) {

        for (int i = 0; i < getLetras().indexOf(letras, i); i++) {
        }
        return "-";
    }

//     Para buscar el numero de las letras en un texto usted la elige
//     public String Encontrar()
//     {
//      String retorno="";             
//      
//      
//         if (getLetras().contains(getBuscar())) 
//         {
//           retorno +=  "-" + getBuscar().length();    
//         }
//         return retorno;
//      
//     }
    
    /**
     * @return the letras
     */
    public String getLetras() {
        return letras;
    }

    /**
     * @param letras the letras to set
     */
    public void setLetras(String letras) {
        this.letras = letras;
    }

    /**
     * @return the Buscar
     */
    public String getBuscar() {
        return Buscar;
    }

    /**
     * @param Buscar the Buscar to set
     */
    public void setBuscar(String Buscar) {
        this.Buscar = Buscar;
    }

}
