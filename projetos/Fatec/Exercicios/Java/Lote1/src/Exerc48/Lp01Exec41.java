/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec41 {
    public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    int num1 = 0, num2 = 0;
    for(int i = 0; i <=100;i ++){
        
        System.out.println("Digite o valor do primeiro numero:");
        num1= num.nextInt();
        System.out.println("Digite o valor do segundo numero");
        num2= num.nextInt();
        
        if(num1 >= 0 && num2 >= 0){
        if (num1>num2){
        System.out.println("o maior é: "+num1+" o menor é: "+num2);
        }else if(num1 == num2){
            System.out.println("Os dois são iguais");
        }else{
              
        System.out.println("o maior é: "+num2+" o menor é: "+num1);  
        }
        }
        }
}
}
