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
public class progHipotenusa15 {
    public static void main(String []args){
        double caOpost = 0, caAdja = 0, hipoten = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o valor do cateto oposto :");
        caOpost = num.nextInt();
        System.out.println("Digite o valor do cateto adjacente :");
        caAdja = num.nextInt();
        hipoten = ((caOpost*caOpost)+(caAdja*caAdja));
        System.out.println("A hipotenusa é de :"+Math.sqrt(hipoten));
    }
}
