
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
public class progConcat_3 {
    public static void main(String[] args) {
        
        int[] vet1 = new int[3];
        int[] vet2 = new int[3];
        int[] concat = new int[6];
        
        vet1 = PrimVet(vet1);
        vet2 = SegVet(vet2);

       

        concat = new int[vet1.length + vet2.length];
        System.arraycopy(vet1, 0, concat, 0, vet1.length);             
        System.arraycopy(vet2, 0, concat, vet1.length, vet2.length);         
        for (int result : ConcNum(concat)){
            
        }

        for (int i = 0; i <= 5; i++) {
            System.out.print(concat[i] + " ");
        }

        System.out.println(" ");
        System.exit(0);
    }
    public static int [] ConcNum(int []concat){
        boolean control;
        int aux;
        for (int i = 0; i<6 ; i++){
            control = true;
            for (int j = 0; j < (6-1); j++){
                if(concat[j]>concat[j+1]){
                aux = concat[j];
                concat[j]= concat [j+1];
                concat[j+1]= aux;
                control = false;
            }
            }
            if(control){
                break;
            }
        }
        return concat;
    }
    public static int[] PrimVet(int [] vet1){
        for (int i = 0; i <= 2; i++) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o numero do Priemiro vetor " + i + "/2: ");
            vet1[i] = ler.nextInt();
        }
    return vet1;
    }
    public static int[] SegVet(int[]vet2){
        for (int i = 0; i <= 2; i++) {
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite o numero do segundo vetor " + i + "/2: ");
            vet2[i] = ler.nextInt();
        }
        return vet2;
    }
    
}



