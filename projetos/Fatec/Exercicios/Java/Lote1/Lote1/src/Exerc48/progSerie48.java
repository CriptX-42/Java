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
public class progSerie48 {
    public static void main(String[]args){
        int num1=1, num2=0;
        System.out.println(num1);
        while(num1<15){
            num1++;
            num2=num1*num1;
            System.out.println(num1+"/"+num2);
        }
    }
}
