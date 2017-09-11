/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial. 
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec36 {
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
