/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 03/07/2017
Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado. 
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec01 {
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
