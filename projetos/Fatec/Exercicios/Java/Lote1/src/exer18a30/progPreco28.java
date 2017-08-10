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
public class progPreco28 {
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
