
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Exerc12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp02Exerc02 {
    public static void main(String[] args) {
        int[] num  = new int[5];
        
        Scanner ler  = new Scanner(System.in);
        int soma = 0,
            med  = 0;
          
        
        for (int i = 0; i <= 4; i++) {
            System.out.println("Digite um numero:");
            num[i] = ler.nextInt();
            soma += num[i];
        }
        for(int result : OrdemNum(num)){
            
        }
            med += soma / 5;
            System.out.println("O maior : " + num[0] + " o menor: " + num[4] + " a media é:" + med);
        
    }
    public static int [] OrdemNum(int []num){
        boolean control;
        int aux;
        for (int i = 0; i < 5; i ++){
            control = true;
            for(int j = 0; j < (5 - 1); j ++ ){
                if(num[j]>num[j + 1]){
                    aux = num[j];
                    num[j]= num[j+1];
                    num[j+1]= aux;
                    control = false;
                }
            }
            if (control){
                break;
            }
        }
        return num;
    }
}



