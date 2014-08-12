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
public class ejercicio2 {

    private String cadena;

    public String MediaCadena() {

        String retorno = "";
        for (int i = 0; i < getCadena().length() / 2; i++) {
            //el de abajo es lo mismo que decir retorno = retorrno + getCadena...
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String ultimoValor() {
        // ejemplo de lo que hace el (Index)charAt empieza con 0 y para contar(length) empeza con 1
        //0 1 2 3
        //c a s a
        //1 2 3 4
        return getCadena().charAt(getCadena().length() - 1) + "";
    }

    public String Alrevez() {
        String retorno = "";
        for (int i = getCadena().length() - 1; i >= 0; i--) {
            //el de abajo es lo mismo que decir retorno = retorrno + getCadena...
            retorno += getCadena().charAt(i);
        }
        return retorno;
    }

    public String guion() {
        String retorno = "";

        for (int i = 0; i < getCadena().length(); i++) {

            if (getCadena().length() - 1 == i) {
                retorno += getCadena().charAt(i);
            } else {
                retorno += getCadena().charAt(i) + "-";
            }
        }
        return retorno;
    }

    public int vocales() {
        int cantidadVocales = 0;
        for (int i = 0; i < getCadena().length(); i++) {

            if ((getCadena().charAt(i) == 'a') || (getCadena().charAt(i) == 'A')
                    || (getCadena().charAt(i) == 'e') || (getCadena().charAt(i) == 'E')
                    || (getCadena().charAt(i) == 'i') || (getCadena().charAt(i) == 'I')
                    || (getCadena().charAt(i) == 'o') || (getCadena().charAt(i) == 'O')
                    || (getCadena().charAt(i) == 'u') || (getCadena().charAt(i) == 'U')) {
                cantidadVocales++;
            }
        }
        return cantidadVocales;
    }

    // palindromo= volver hacia atrás
    public boolean palindromo() {
        String palabraAlrevez = "";

        for (int i = getCadena().length() - 1; i >= 0; i--) {
            palabraAlrevez += getCadena().charAt(i);
        }
        if (getCadena().equals(palabraAlrevez)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

}
