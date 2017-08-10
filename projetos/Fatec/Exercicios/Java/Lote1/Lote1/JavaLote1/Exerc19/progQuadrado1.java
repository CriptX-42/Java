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
public class progQuadrado1 {
    public static void main(String[]args){
        int lad1 = 0, lad2 = 0,vQuadr = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Entre com a base do quadrado:");
        lad1 = num.nextInt();
        System.out.println("Entre com a altura do quadrado:");
        lad2 = num.nextInt();
     vQuadr=(lad1*lad2);
     System.out.println("A área do quadrado é:" +vQuadr);
    }
}
