/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 03/07/2017
Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.  
 */
package Exerc17;

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
