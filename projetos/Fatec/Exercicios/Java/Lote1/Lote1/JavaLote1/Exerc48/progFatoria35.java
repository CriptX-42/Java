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
public class progFatoria35 {
    public static void main(String[]args){
    Scanner num = new Scanner(System.in);
    int n = 0, fat=1;
    System.out.println("Digite o numero ");
    n = num.nextInt();
        if(n < 0){
            System.out.println("Não da fatoria negativo");
        }    
            else
            {
                while(n > 1)
                {
                    fat *= n;
                    n--;
                    System.out.println(fat);
                }
            
            }
    }
}
