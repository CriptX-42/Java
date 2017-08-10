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
public class progExponente47 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        double base = 0, exponencial = 0, potencia = 0;
        System.out.println("Digite o valor da base");
        base = num.nextInt();
        System.out.println("Digite o valor do exponencial");
        exponencial = num.nextInt();
        
        potencia = Math.pow(base, exponencial);
        System.out.println(potencia);
        
    }
}
