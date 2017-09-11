/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial. 
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec35 {
    public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    int n = 0, fat=1;
    System.out.println("Digite o numero ");
    n = num.nextInt();
        if(n < 0){
            System.out.println("Não da fatoria negativo");
        }    
            else
            {
                while(n > 1)
                {
                    fat *= n;
                    n--;
                    System.out.println(fat);
                }
            
            }
    }
}
