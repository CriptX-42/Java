/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progFibonacci40 {
    public static void main(String[]args){
         
        int num1 = 0, num2 = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o numero a entrar na sequencia: ");
        num1 = num.nextInt();
        System.out.println(num2);
        System.out.println(num1);
        
        for(int i = 0; i < 8; i++){
            num1 = num1 + num2;
            num2 = num1 - num2;
            System.out.println(num1);
        }

   }
}
