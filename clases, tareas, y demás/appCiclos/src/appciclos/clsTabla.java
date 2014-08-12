/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package appciclos;

/**
 *
 * @author Urpina
 */
public class clsTabla {
    //atributos de la clase
    private int n;
    private int n2;
    
    //metodo constructor
    public clsTabla(int pNum ,int pNum2)
    {
        this.n = pNum;
        this.n2 = pNum2;
    }
    
    // metodo que calcula la tabla de multiplicar con while
    public String calculawhile ()
    {
        String tabla = "";
        int cont = 1;
        int r;
        while (cont<= n2)
        {
            r=this.n * cont;
            tabla = tabla + '\n' + this.n + " * " + cont + " = " + r;
            cont++;
        }
        return(tabla);
    }
        // metodo que calcula la tabla de multiplicar con do while    
    public String calculaDowhile ()
    {
        String tabla = "";
        int cont = 1;
        int r;
        do
        {
            r=this.n * cont;
            tabla = tabla + '\n' + this.n + " * " + cont + " = " + r;
            cont++;
        }
        while (cont<= n2);
        return(tabla);
        }
        
    // metodo que calcula la tabla de multiplicar con un ciclo for
    public String calculaFor()
    {
        String tabla = "";
        int r;
        for(int i =1; i<=n2;i++)
        {
            r=this.n * i;
            tabla= tabla + '\n' + this.n + " * " + i + " = " + r;
        }
        return(tabla);
    }
    
}
