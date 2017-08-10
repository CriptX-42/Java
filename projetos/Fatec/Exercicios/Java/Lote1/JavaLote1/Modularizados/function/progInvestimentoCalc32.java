/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modularizados.function;

/**
 *
 * @author Ricardo Sousa
 */
public class progInvestimentoCalc32 {
    double opcoes = 0, investimento = 0, vCorrigido = 0;
    public void InvestC(){
        if(opcoes == 1){
            vCorrigido =(investimento*0.03);
            vCorrigido += investimento ;
            System.out.println("O valor que a poupança rende em 30 dias é de: "+vCorrigido);
        }else if(opcoes == 2){
            vCorrigido = (investimento*0.05);
            vCorrigido += investimento ;
            System.out.println("O valor da renda fixa rende em 30 dias é de: "+vCorrigido);
        }
    }
}
