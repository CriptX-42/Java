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
public class progNumSerie36 {
    public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    int i = 0;
    System.out.println("Digite o numero:");
    i = num.nextInt();
    System.out.println(i);
    while (i > 0){
        i++;
        System.out.println("1/"+i);
    }
    }
}
