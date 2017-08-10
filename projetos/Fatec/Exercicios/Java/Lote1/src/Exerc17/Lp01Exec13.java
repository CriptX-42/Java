/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec13 {
    public static void main(String[]args){
        int quadtAli = 0, consum = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a quantidade de alimento em Kg: ");
        quadtAli = num.nextInt();
        consum = (int) (quadtAli/0.5);
        System.out.println("O alimento durará "+consum+" dias");
    }
}
