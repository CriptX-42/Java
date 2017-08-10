/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizados;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progDivisivelProc24 {
    public static void main(String[]args){
        double x = 0;
        Divisivel dv = new Divisivel();
        Scanner num = new Scanner (System.in);
        System.out.println("Digite o numero a ser dividido: ");
        x = num.nextDouble();
        
        dv.x = x;
        System.out.println(dv.Divi());
    }
}
class Divisivel{
    public double num2 = 0, num3 = 0, x = 0;
    public String Divi(){
        num2 = (x%2);
        num3 = (x%3);
        if (num2 == 0 && num3 == 0 ){
            return "O numero é divisivel por 2 e por 3";
        }else if(num2 == 0){
            return "O numero é divisivel por 2";
        
        }else if(num3 == 0){
            return "O numero é divisivel por 3";
        }else{
            return "O numero não é divisivel";
        }
    }
}