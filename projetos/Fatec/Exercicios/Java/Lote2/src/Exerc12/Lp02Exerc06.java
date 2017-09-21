
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package Exerc12;

import java.util.Arrays;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp02Exerc06 {
    public static void main(String[] args) {
        int[] vet = new int[20];
        
        for (int i = 0; i <= 19; i++) {
            vet[i] = (int) (Math.random() * 10);
        }
 
        for(int result: OrdemNum(vet)){
            System.out.print(result);
    }

        System.out.println(" ");
        System.exit(0);
    }
    public static int[] OrdemNum(int[] vet){
        boolean control = false;
        int aux;
        for(int i = 0;i<vet.length;++i){
            control = true;
            for(int j = 0;j<(vet.length -1); ++j){
                 if(vet[j]>vet[j + 1]){
                     aux = vet[j];
                     vet[j]= vet[j + 1];
                     vet[j+1]=aux;
                     control = false;
                 }
            }
            if(control){
                break;
            }
        }
        return vet;
    }
}



