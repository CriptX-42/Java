/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.  
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec11 {
    public static void main(String[]args){
    int compr = 0, raio = 0;
    Scanner num = new Scanner(System.in);
    System.out.println("Digite o raio: ");
    raio = num.nextInt();
    compr = (int) (2*3.14*raio);
    System.out.println("O comprimento da circunferência é de: "+compr);
    }
}
