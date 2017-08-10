/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec15 {
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
