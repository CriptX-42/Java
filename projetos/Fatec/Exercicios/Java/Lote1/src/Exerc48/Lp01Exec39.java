/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N! 
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec39 {
    public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    int n = 0, fat=1, aux = 1;
    System.out.println("Digite o numero ");
    n = num.nextInt();
    aux = fat;
        if(n < 0){
            System.out.println("Não da fatoria negativo");
        }    
            else
            {
                while (aux > 0){
                while(n > 1)
                {
                    fat *= aux;
                    aux ++;
                    n--;
                    System.out.println(fat);
                }
                
            }
            }
    }
}
