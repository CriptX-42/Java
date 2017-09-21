
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Exerc12;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp02Exerc01 {
    public static void main(String[] args) {
        int[] num   = new int[50];
        int total = 0,
            num2  = 0;
        Scanner ler   = new Scanner(System.in);

        for (int i = 0; i < 49; i++) {
            System.out.println("Digite o numero:(Maior que 10 e menor que 200 por favor)");
            num[i] = (int)(Math.random()*10);

            if ((num[i] % 2) != 0) {
                
            }else{
                total += num[i];
            }

            if ((num[i] > 10) && (num[i] < 200)) {
                num2 += num[i];
            }
        }

        num2 = num2 / 200;
        System.out.println("Soma impar: " + total + " Media: " + num2);
   
    }
}



