/*
 *  Nome do programador : Ricardo Sousa Vaz de Carvalho
 *  data da elaboracao  : 17/07/2017
 *  Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número. 
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec37 {
    public static void main(String[]args){
    int N=0,X=0,Y=0;
    Scanner num = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    N = num.nextInt();
   while(X<10){
            X++;
            Y=X*N;
            System.out.println(Y);
        }
    
    }
    
}
