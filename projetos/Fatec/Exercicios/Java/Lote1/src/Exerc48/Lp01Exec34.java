/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150. 
 */
package Exerc48;


public class Lp01Exec34 {
    public static void main(String[]args){
        int  i = 0;
        for (int r=10;r<=150;r++){
            i = r*r;
            r++;
            System.out.println(i);
        }
    }
}
