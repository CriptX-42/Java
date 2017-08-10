/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizados.function;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progInvestimentoFunc32 {
     public static void main(String[]Args){
        progInvestimentoCalc32 pi = new progInvestimentoCalc32();
        double opcoes = 0, investimento = 0;
        Scanner num = new Scanner (System.in);
        System.out.println("Digite a opção[1] para poupança, ou opção [2] renda fixa: ");
        opcoes = num.nextInt();
        System.out.println("Digite o valor do investimento: ");
        investimento = num.nextInt();
        pi.opcoes = opcoes;
        pi.investimento = investimento;
        pi.InvestC();
        
    }
}
