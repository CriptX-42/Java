/*
    Nome do programador : Ricardo Sousa Vaz de Carvalho
    data da elaboracao  : 10/07/2017
    Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais tipos não serão considerados.  
 */
package Exerc18;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec29 {
    public static void main(String[]args){
        double opcao = 0, invest = 0, rend = 0,valor = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Você quer poupança [1] ou renda fixa[2]:");
        opcao = num.nextInt();
        System.out.println("Digite o valor");
        rend = num.nextInt();
        
        if (opcao  == 1){
            invest = (rend * 0.03);
            valor = (rend + invest);
            System.out.println("O a reda é de: "+valor);
        }else if (opcao  == 2){
            invest = (rend * 0.05);
            valor = (rend + invest);
            System.out.println("O a reda é de: "+valor);
        }
        
    }
}
