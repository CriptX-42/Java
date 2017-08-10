/*
    Nome do programador : Ricardo Sousa Vaz de Carvalho
    data da elaboracao  : 10/07/2017
    Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor. 
 */
package Exerc18;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp01Exec26 {
    public static void main(String[]args){
        int x = 0,y = 0,resto = 0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        x = num.nextInt();
        System.out.println("Digite o segundo numero: ");
        y = num.nextInt();
        if (x<y){
        resto=(y%x);
        if(resto == 0){
            
            System.out.println("é divisível ");
        }else{
           System.out.println(" não é divisível "); 
        }
        }
        if (x>y){
        resto=(x%y);
            if(resto == 0){
            
            System.out.println("é divisível ");
        }else{
           System.out.println(" não é divisível "); 
        }
        }
    }
}
