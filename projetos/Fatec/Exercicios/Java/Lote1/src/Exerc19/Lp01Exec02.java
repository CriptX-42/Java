
package Exerc19;

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
