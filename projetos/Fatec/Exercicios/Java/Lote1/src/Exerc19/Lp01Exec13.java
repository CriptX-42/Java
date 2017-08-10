
package Exerc19;

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
