/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 03/07/2017
Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 */
package Exerc17;

import java.util.Scanner;
/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec02 {
    public static void main(String[]args){
    int sal = 0,reajust = 0;
    Scanner num = new Scanner(System.in);
    System.out.println("Digite o seu salario:");
    sal = num.nextInt();
    reajust = (int) (sal*0.15);
    sal = (sal+ reajust);
    System.out.println("O reajuste do salário é de: R$"+reajust+" a soma dele é de: R$"+sal);
    }
}
