
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progInvestimento32 {
    public static void main(String[]Args){
        double opcoes = 0, investimento = 0, vCorrigido = 0;
        Scanner num = new Scanner (System.in);
        System.out.println("Digite a opção[1] para poupança, ou opção [2] renda fixa: ");
        opcoes = num.nextInt();
        System.out.println("Digite o valor do investimento: ");
        investimento = num.nextInt();
        
        if(opcoes == 1){
            vCorrigido =(investimento*0.03);
            vCorrigido += investimento ;
            System.out.println("O valor que a poupança rende em 30 dias é de: "+vCorrigido);
        }else if(opcoes == 2){
            vCorrigido = (investimento*0.05);
            vCorrigido += investimento ;
            System.out.println("O valor da renda fixa rende em 30 dias é de: "+vCorrigido);
        }
    }
}