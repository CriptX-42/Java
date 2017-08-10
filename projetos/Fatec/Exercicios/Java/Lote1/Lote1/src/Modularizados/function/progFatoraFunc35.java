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
public class progFatoraFunc35 {
    public static void main(String[]args){
    progFatoraCalc35 fc = new progFatoraCalc35();
    Scanner num = new Scanner(System.in);
    int n = 0, fat=1;
    System.out.println("Digite o numero ");
    n = num.nextInt();
    fc.n = n;
    
    fc.calculFatora();
    }
}
