/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que: 
 *  Venda Mensal        Preço Atual     Preço Novo 
 *  < 500               < 30            + 10% 
 *  >= 500 e < 1000     >= 30 e < 80    +15% 
 *  >= 1000             >= 80           - 5% 
 *  Obs.: para outras condições, preço novo será igual ao preço atual.   
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec31 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        double precAtual = 0, medMensal=0, novoPrec = 0;
        System.out.println("Digite o preço atual do produto:");
        precAtual = num.nextInt();
        System.out.println("Digite a media mensal do produto:");
        medMensal = num.nextInt();
        
        if(medMensal < 500 && precAtual <30){
            novoPrec = (precAtual*0.10);
            novoPrec += precAtual;
            System.out.println("O novo valor é de: "+novoPrec);
        }else if(medMensal >= 500 && medMensal <1000 && precAtual >=30 && precAtual <80){
            novoPrec = (precAtual*0.15);
            novoPrec += precAtual;
            System.out.println("O novo valor é de: "+novoPrec);
        }else if(medMensal >= 1000 && precAtual >=80){
            novoPrec = (precAtual*0.05);
            precAtual -= novoPrec ;
            System.out.println("O novo valor é de: "+precAtual);
        }else{
         System.out.println("Não houve alteração no preço do produto: "+precAtual);   
        }
    }
}
