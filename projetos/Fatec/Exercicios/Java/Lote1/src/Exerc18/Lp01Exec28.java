/*
    Nome do programador : Ricardo Sousa Vaz de Carvalho
    data da elaboracao  : 10/07/2017
    Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: 
    Venda Mensal Preço Atual Preço Novo 
        < 500 < 30 + 10% 
        >= 500 e < 1000 >= 30 
        e < 80 +15% >= 1000 >= 80 - 5% 
        Obs.: para outras condições, preço novo será igual ao preço atual.  
 */
package Exerc18;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec28 {
    public static void main(String[]args){
        int precAtual = 0, medmensal = 0, novprec = 0, reajust = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o preço do produto");
        precAtual = num.nextInt();
        System.out.println("Digite a media");
        medmensal = num.nextInt();
        
        if (precAtual < 30 &&  medmensal < 500){
            novprec = (int) (precAtual * 0.10);
            reajust = (novprec + precAtual);
            System.out.println("o novo preço é: "+reajust);
        }else{
            System.out.println("O preço é: "+precAtual);
        }
        
    }
}
