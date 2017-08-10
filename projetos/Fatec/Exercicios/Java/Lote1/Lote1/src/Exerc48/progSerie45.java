/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc48;

/**
 *
 * @author Ricardo Sousa
 */
public class progSerie45 {
    public static void main (String[]args){
        int num1 = 1, num2 = 1;
        System.out.println(num1);
        while(num1<50){
            num1++;
            num2= num2+2;
            System.out.println(num1+"/"+num2);
        }
    }
}
