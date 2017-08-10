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
public class progNotasProc21 {
    public static void main(String[]args){
        double nota1 = 0,nota2 = 0,nota3 = 0,nota4 = 0;
        Scanner num = new Scanner(System.in);
        Notas cn = new Notas();
        System.out.println("Digite a primeira nota");
        nota1 = num.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = num.nextDouble();
        System.out.println("Digite a terceira nota");
        nota3 = num.nextDouble();
        System.out.println("Digite a quarta nota");
        nota4 = num.nextDouble();
        
        cn.nota1 = nota1;
        cn.nota2 = nota2;
        cn.nota3 = nota3;
        cn.nota4 = nota4;
        
        System.out.println(cn.nt());
    }
    
}
class Notas{
    public double nota1 = 0,nota2 = 0,nota3 = 0,nota4 = 0, aprov = 0;
    public String nt(){
        aprov = ((nota1+nota2+nota3+nota4)/4);
        if(aprov>=6){
           return "Parabéns você foi aprovado, sua nota é: "+aprov+""; 
        }else if(aprov>=3 & aprov <6){
           return "Você está de exame, sua nota é: "+aprov+""; 
        }else if (aprov < 3){
           return "Você ficou retido, sua nota é: "+aprov+""; 
        }
        return null;
        
    }
}
