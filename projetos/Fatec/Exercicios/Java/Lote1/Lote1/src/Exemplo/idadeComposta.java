/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplo;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class idadeComposta {
    public static void main(String[]args){
        int idade=0;
        Scanner num = new Scanner(System.in);
        System.out.println("Digite sua idade");
        idade = num.nextInt();
        
        if(idade>=18){
            System.out.println("Pode dirigir");
        }else{
            System.out.println("Não pode dirigir");
        }
    }
}
