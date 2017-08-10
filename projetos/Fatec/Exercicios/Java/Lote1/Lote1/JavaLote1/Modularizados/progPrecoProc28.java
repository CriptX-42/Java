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
public class progPrecoProc28 {
    public static void main(String[]args){
        int precAtual = 0, medmensal = 0;
        Scanner num = new Scanner(System.in);
        Preco pc= new Preco();
        System.out.println("Digite o preço do produto");
        precAtual = num.nextInt();
        System.out.println("Digite a media");
        medmensal = num.nextInt();
        
        pc.precAtual = precAtual;
        pc.medmensal = medmensal;
        
        System.out.println(pc.vprec());
        
    }
}
class Preco{
    public int precAtual = 0, medmensal = 0, novprec = 0, reajust = 0;
    public String vprec(){
         if (precAtual < 30 &&  medmensal < 500){
            novprec = (int) (precAtual * 0.10);
            reajust = (novprec + precAtual);
            return "o novo preço é: "+reajust;
        }else{
            return"O preço é: "+precAtual;
        }
    }
}