/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numparesimpares55227;

/**
 *
 * @author Blanquet
 */
public class NumParesImpares55227 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        int simpar=0;
        int spar=0;
        while(numero<101){
        if(numero%2 ==0){
            simpar= numero + simpar;
        }
        else if (numero %2 != 0){
                spar= numero + spar;
        }
        ++numero;
    }
        System.out.println("Suma de pares: "+ spar);
        System.out.println("Suma de impares:" + simpar);
}
}