package Exerc19;

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
