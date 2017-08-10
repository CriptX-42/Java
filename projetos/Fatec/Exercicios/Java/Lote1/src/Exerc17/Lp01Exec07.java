/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 06/07/2017
Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume. 
 */
package Exerc17;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec07 {
    public static void main(String[]args){
    int altura = 0, largura = 0,compriment = 0, parale = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Entre com a altura do paralelepipedo:");
        altura = num.nextInt();
        System.out.println("Entre com a largura do paralelepipedo:");
        largura = num.nextInt();
        System.out.println("Entre com o comprimento do paralelepipedo:");
        compriment = num.nextInt();
     parale=(compriment*altura*largura);
     System.out.println("O volume do paralelepipedo é de: "+parale+" m³");
    }
    }
