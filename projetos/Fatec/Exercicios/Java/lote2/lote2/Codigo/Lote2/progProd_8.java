/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote2;

import java.util.Scanner;


public class progProd_8 {
    public static void main(String[]args){
       int [][] mat = new int [4][3];
       int preco, soma = 0;
       Scanner ler = new Scanner(System.in);
       for (int i = 0; i < 4; i ++){
        for(int j = 0; j<3;j++){
       //System.out.println("Digite o produto numero: "+j+" da semana:"+i);
       //preco = ler.nextInt();
       mat [i][j] = (int)(Math.random()* 10);
       soma += mat [i][j];
        }
           
 
       }
       int vSem[] = new int [4];
       int vMes[] = new int [3];
       int vSem1 =0, vMes1 = 0;
       for (int i = 0; i < 4; i++) {
               for (int j = 0; j < 3; j++) {
            System.out.print(mat[i][j]+"\t");
            vSem[i] = vSem[i] + mat [i][j];
            vSem1 =+ vSem[i];
            
            vMes[j] =+ vMes[j] + mat [i][j];
            vMes1 =+ vMes[j];
               }
               System.out.println();
           }
           
       System.out.println(" ");
       System.out.println("A SOMA DE TODOS OS PRODUTOS TOTAIS É DE: "+soma);
       System.out.println("A SOMA DE TODOS OS PRODUTOS VENDIDOS NO DA SEMANA  É DE: "+vSem1);
       System.out.println("A SOMA DE TODOS OS PRODUTOS VENDIDOS NO MES  É DE: "+vMes);
       
    }
}
