/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec40 {
    public static void main(String[]args){
         
        int num1 = 0, num2 = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o numero a entrar na sequencia: ");
        num1 = num.nextInt();
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }

   }
}
