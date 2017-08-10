package Exerc19;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec04 {
    public static void main(String []args){
        int grausC = 0,Fahrenheit = 0;
        Scanner grau = new Scanner(System.in); 
        
        System.out.println("Digite o valor do grau em Celsius: ");
        grausC = grau.nextInt();
        
        Fahrenheit = ((9*grausC+160)/5);
        System.out.println("O valor em Fahrenheit é:" +Fahrenheit);
    }
}
