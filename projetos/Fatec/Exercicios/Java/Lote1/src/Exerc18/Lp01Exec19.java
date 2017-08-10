/*
Nome do programador : Ricardo Sousa Vaz de Carvalho
data da elaboracao  : 10/07/2017
Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.   
 */
package Exerc18;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec19 {
    public static void main(String[]args){
        int x = 0, y = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        x = num.nextInt();
        System.out.println("Digite o segundo numero");
        y = num.nextInt();
        if(x>y){
            System.out.println("O numero "+x+" é maior que o numero "+y);
        }else if (y>x){
            System.out.println("O numero "+y+" é maior que o numero "+x);
        }else{
            System.out.println("Os dois numeros são iguais");
        }
        
    }
}
