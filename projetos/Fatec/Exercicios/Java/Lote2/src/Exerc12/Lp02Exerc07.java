/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc12;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  FAZER O BOOBLE
 * @author Ricardo Sousa
 */
public class Lp02Exerc07 {
    public static void main(String[]args){
        int[] vet = new int[20];
        int meiVet = 0, iniVet = 0, fiVet = vet.length , busca = 0;
        
        Scanner ler = new Scanner(System.in);
        for (int i = 0; i <= 19; i++) {
            vet[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(vet);

        for (int i = 0; i <= 19; i++) {
            System.out.print(vet[i]);
        }

        System.out.println(" ");
        
        System.out.println("Digite o numero que você quer pesquisar: ");
        busca = ler.nextInt();
        while(iniVet<fiVet){
            meiVet = (iniVet + fiVet)/2;
            if(vet[meiVet]==busca){
                System.out.println("A busca é: "+vet[meiVet]);
                System.exit(0);
            }else if(vet[meiVet]< busca){
                meiVet= meiVet;
                System.out.println("A busca é: " +meiVet);
          
            }else if(vet[meiVet]> busca){
                fiVet =  meiVet;
                System.out.println("A busca é: " +fiVet);
            }
        }
        
        System.exit(0);
    }
}
