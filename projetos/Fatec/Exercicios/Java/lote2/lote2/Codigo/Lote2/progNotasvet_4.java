
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package lote2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progNotasvet_4 {
    public static void main(String[] args) {
        int[] vet   = new int[31];
        
        int media = 0;
        Scanner ler = new Scanner(System.in);

        for (int i = 0; i < 31; i++) {
            System.out.println("Digite a nota do aluno: " + i + "/30");
            //vet[i] = ler.nextInt();
            vet[i] = (int)(Math.random()*10);
            media  += vet[i];
        }

        
        media /= 30;
        System.out.println("================== As notas do grupo =========================");

        for (int result : Ordem(vet)){
         System.out.print(result +" ");
        }

        System.out.println(" ");
        System.out.println("As 3 maiores notas: " + vet[30] + " " + vet[29] + " " + vet[28]);
        System.out.println("As 3 menores notas: " + vet[0] + " " + vet[1] + " " + vet[3]);
        System.out.println("A media do grupo é de: " + media);
        System.exit(0);
    }
    public static int [] Ordem(int []vet){
        int aux =0;
        boolean controler;
        for(int i = 0; i<31;i++){
            controler = true;
            for (int j = 0;j<(31-1);j++){
                if(vet[j]>vet[j + 1]){
                    aux = vet[j];
                    vet[j]= vet[j+1];
                    vet[j+1]= aux;
                   
                    controler = false;
                }
                
                }
            if(controler){
                    break;
            }
            
        }
        return vet;
    }
}


