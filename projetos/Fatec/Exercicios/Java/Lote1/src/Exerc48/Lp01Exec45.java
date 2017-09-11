/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 
 */
package Exerc48;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec45 {
    public static void main (String[]args){
        int num1 = 1, num2 = 1;
        System.out.println(num1);
        while(num1<50){
            num1++;
            num2= num2+2;
            System.out.println(num1+"/"+num2);
        }
    }
}
