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
public class progFibonacciFunc40 {
    public static void main(String[]args){
        progFibonacciCalc40 pf = new progFibonacciCalc40();
        Scanner ler = new Scanner(System.in);
        int x = 0;
        System.out.println("Digite um numero para entrar na seguencia: ");
        x = ler.nextInt();
        
        pf.x = x;
        pf.FiboCalc();
    }
}
