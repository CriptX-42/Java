
package Exerc19;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progComprcirco12 {
    public static void main(String[]args){
    int compr = 0, raio = 0;
    Scanner num = new Scanner(System.in);
    System.out.println("Digite o raio: ");
    raio = num.nextInt();
    compr = (int) (2*3.14*raio);
    System.out.println("O comprimento da circunferência é de: "+compr);
    }
}
