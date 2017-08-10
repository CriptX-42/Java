/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioAula;

/**
 *
 * @author Ricardo Sousa
 */
public class progSomaloop {
    public static void main(String[]args){
        int n = 0;
        for (n = 0; n<100;n++){
            n = n+n;
            System.out.println(n);
        }
    }
}
