/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote2;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progSub20vet_5 {
    public static void main(String[]args){
        int [] vet = new int[21];
        int concat=0,i=0, aux = 0,aux2 = 0;
        Scanner ler = new Scanner(System.in);
        for(i =0 ; i <= 20; i++){
            System.out.println("Digite um numero: "+i+ "/20");
            vet[i] = ler.nextInt();
            
        }
        for(aux = 20;aux>0; aux--){
            for(aux2 = 0; aux2<=20; aux2 ++){
            concat += (vet[aux]-vet[aux2]);
            }
        }
        System.out.println("O SOMA deu: " +concat);
    }
}
