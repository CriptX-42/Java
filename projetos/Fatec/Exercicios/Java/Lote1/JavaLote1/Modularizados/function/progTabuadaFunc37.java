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
public class progTabuadaFunc37 {
    public static void main(String[]args){
    progTabuadaCalc37 pt = new progTabuadaCalc37();
    int N=0;
    Scanner num = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    N = num.nextInt();
    
    pt.N = N;
    pt.TabuadaCalc();
    }
}
