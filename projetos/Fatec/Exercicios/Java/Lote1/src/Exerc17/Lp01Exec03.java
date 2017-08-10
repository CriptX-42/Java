/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 03/07/2017
Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área. 
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec03 {
    public static void main(String[]args){
        int base = 0, altura = 0, at = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite a base do triângulo:");
        base = num.nextInt();
        System.out.println("Digite a altura do triângulo:");
        altura = num.nextInt();
        at = (base*altura/3);
        System.out.println("A área do triangulo é de: "+at);
    }
}
