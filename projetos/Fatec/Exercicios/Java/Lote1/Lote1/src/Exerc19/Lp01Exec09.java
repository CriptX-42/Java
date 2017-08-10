package Exerc19;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec09 {
    public static void main(String[]args){
        int quadr1 = 0,quadr2 = 0, sum = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero a ser elevado:");
        quadr1= num.nextInt();
        System.out.println("Digite o valor do segundo numero a ser elevado:");
        quadr2= num.nextInt();
        
        sum= ((quadr1*quadr1)+(quadr2*quadr2));
        System.out.println("O valor da soma dos quadrados é: "+sum);
    }
}
