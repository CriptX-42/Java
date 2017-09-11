/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */
package Exerc48;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec48 {
    public static void main(String[]args){
        int num1=1, num2=0;
        System.out.println(num1);
        while(num1<15){
            num1++;
            num2=num1*num1;
            System.out.println(num1+"/"+num2);
        }
    }
}
