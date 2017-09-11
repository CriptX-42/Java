/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 */
package Exerc48;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec44 {
    public static void main(String[]args){
    int DD1 = 0,DD2 = 0;
    while(DD1<=6){
        DD2=1;
        while(DD2<=6){
        if((DD1+DD2)==7){
            System.out.println(DD1+" e "+DD2);
        }
        DD2++;
    }
        
        DD1++;
    }
    }
}

