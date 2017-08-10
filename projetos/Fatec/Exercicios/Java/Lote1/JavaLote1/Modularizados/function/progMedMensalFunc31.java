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
public class progMedMensalFunc31 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        progMedMensalCalc31 pm = new progMedMensalCalc31();
        double precAtual = 0, medMensal=0;
        System.out.println("Digite o preço atual do produto:");
        precAtual = num.nextInt();
        System.out.println("Digite a media mensal do produto:");
        medMensal = num.nextInt();
        
        pm.medMensal = medMensal;
        pm.precAtual = precAtual;
        
        pm.MedM();
        
    }
}

