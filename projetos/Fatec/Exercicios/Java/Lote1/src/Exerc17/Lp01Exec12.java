/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.  
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec12 {
    public static void main(String[]args){
        int anoNasc = 0, anoAtual = 0, idade = 0,futuraId = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o ano do seu nascimento: ");
        anoNasc = num.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = num.nextInt();
        
        idade = (anoAtual-anoNasc);
         futuraId = idade +17;
         
         System.out.println("você tem "+idade+" E a sua idade daqui a 17 anos é de "+futuraId);
        
    }
}
