/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc48;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progFatora39 {
    public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    int n = 0, fat=1, aux = 1;
    System.out.println("Digite o numero ");
    n = num.nextInt();
    aux = fat;
        if(n < 0){
            System.out.println("Não da fatoria negativo");
        }    
            else
            {
                while (aux > 0){
                while(n > 1)
                {
                    fat *= aux;
                    aux ++;
                    n--;
                    System.out.println(fat);
                }
                
            }
            }
    }
}
