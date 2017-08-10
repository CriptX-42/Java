/*
    Nome do programador : Ricardo Sousa Vaz de Carvalho
    data da elaboracao  : 10/07/2017
    Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente
 */
package Exerc18;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec22 {
    public static void main(String[]args){
        int x = 0, y = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        x = num.nextInt();
        System.out.println("Digite o segundo numero");
        y = num.nextInt();
        if(x>y){
            System.out.println(" "+x+" "+y);
        }else if (y>x){
            System.out.println(" "+y+" "+x);
        }else{
            System.out.println("Os dois numeros são iguais");
        }
        
    }
}
