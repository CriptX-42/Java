/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc19;

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
