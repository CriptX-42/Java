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
public class progTabuada37 {
    public static void main(String[]args){
    int N=0,X=0,Y=0;
    Scanner num = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    N = num.nextInt();
   while(X<10){
            X++;
            Y=X*N;
            System.out.println(Y);
        }
    
    }
    
}
