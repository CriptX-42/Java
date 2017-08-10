/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer18a30;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progInvestimento29 {
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
