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
public class Lp01Exec11 {
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
