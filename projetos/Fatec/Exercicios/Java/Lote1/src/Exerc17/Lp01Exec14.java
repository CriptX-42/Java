/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec14 {
    public static void main(String[]args){
        int angul1 = 0, angul2 = 0, anguFinal = 0;
        Scanner angulo = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro ângulo: ");
        angul1 = angulo.nextInt();
        System.out.println("Digite o valor do segundo ângulo: ");
        angul2 = angulo.nextInt();
        anguFinal = (180-angul1-angul2);
        System.out.println("O valor do terceiro ângulo é de: "+anguFinal+"º");
    }
}
