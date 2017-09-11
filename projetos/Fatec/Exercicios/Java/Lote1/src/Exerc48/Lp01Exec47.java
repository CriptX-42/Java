/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.  
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec47 {
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
