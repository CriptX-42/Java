/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizados.function;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progNumIntCalc41 {
    int num1 = 0, num2 = 0;
    public void NumIntCalc(){
        Scanner num = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro numero:");
        num1= num.nextInt();
        System.out.println("Digite o valor do segundo numero");
        num2= num.nextInt();
        
        if(num1 >= 0 && num2 >= 0){
        if (num1>num2){
        System.out.println("o maior é: "+num1+" o menor é: "+num2);
        }else if(num1 == num2){
            System.out.println("Os dois são iguais");
        }else{
              
        System.out.println("o maior é: "+num2+" o menor é: "+num1);  
        }
        }
    }
}
