/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appminumero2;

/**
 *
 * @author Urpina
 */
public class clsMiNum2 {

    // atributo
    int N;
    private int i;

    // método constructor
    public clsMiNum2() {
        this.N = 0;
    }

    // metodo set y get
    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    //metodo tipo numero que me diga si es perfecto, deficiente o abundante
    public int TipoNumero() {
        // variable
        int acum = 0;
        // metodo for
        for (int i = 1; i < N; i++) {
            if (N % i == 0) {
                acum = acum + i;
            }
        }

        if (acum == N) {
            return 1;
        }

        else if (acum < N) {
            return 2;
        }

        else{
            return 3;
        }
    }
    
    //metodo factorial
    public int Factorial (){
    // variable 
        int acum=1;
        //metodo for
        for (int i =1; i <= N; i++){
                acum = acum * i;
        }
        return acum;
    }
    
    // metodo fibonacci
    
    public String Fibonacci(){
    
        //variables
        String fibo = "0, 1";
        int N1 = 0;
        int N2 = 1;
        int suma = N1 + N2;
        
        while (suma <= N){
            fibo = fibo + ", " + suma;
            N1 = N2;
            N2 = suma;
            suma = (N1 + N2);
        }
        return fibo;
    }

}
