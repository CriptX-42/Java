/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc12;

import java.util.Scanner;


public class Lp02Exerc08 {
    public static void main(String[]args){
       int [][] mat = new int [4][3];
       int soma = 0;
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
       int vMes = 0;
       int vSem1 =0, vMes1 = 0;
       for (int i = 0; i < 4; i++) {
               for (int j = 0; j < 3; j++) {
            System.out.print(mat[i][j]+"\t");
            vSem[i] = vSem[i] + mat [i][j];
            vSem1 =+ vSem[i];
            
            vMes =+  mat [i][j];
            
               }
               System.out.println();
           }
           
       System.out.println(" ");
       System.out.println("A SOMA DE TODOS OS PRODUTOS TOTAIS É DE: "+soma);
       System.out.println("A SOMA DE TODOS OS PRODUTOS VENDIDOS NO DA SEMANA  É DE: "+vSem1);
       System.out.println("A SOMA DE TODOS OS PRODUTOS VENDIDOS NO MES  É DE: "+vMes);
       
    }
}
