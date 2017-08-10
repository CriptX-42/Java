/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. 
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec08 {
    public static void main(String[]args){
        int deposito = 0,rend = 0;
    Scanner num = new Scanner(System.in);
    System.out.println("Digite o valor depositado: ");
    deposito = num.nextInt();
    rend = (int) (deposito*0.13);
    deposito = (deposito+ rend);
    System.out.println("Seu deposito vai render: "+rend+" ao mês, dando um total de: "+deposito);
    }
}
