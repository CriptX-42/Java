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
public class progNumSerieFunc36 {
     public static void main(String[]args){
    progNumSerieCalc36 pn = new progNumSerieCalc36();
    Scanner num = new Scanner(System.in);
    int i = 0;
    System.out.println("Digite o numero:");
    i = num.nextInt();
    System.out.println(i);
    
    pn.i = i;
    pn.NumSCalc();
}
}
