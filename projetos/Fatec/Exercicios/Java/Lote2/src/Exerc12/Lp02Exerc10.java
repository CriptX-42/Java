/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc12;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp02Exerc10 {
    public static void main(String[]args){
        int[][] mat = new int [2][8];
        
        for (int linha = 0; linha <2; linha ++){
            for(int coluna = 0; coluna<8; coluna++){
                mat[0][coluna]= coluna;
                mat[1][coluna] += (coluna); 
            }
        }
        for (int linha = 0; linha <2; linha ++){
            for(int coluna = 0; coluna<8; coluna++){
                
              System.out.print(mat[linha][coluna]+"\t");
            }
            System.out.println();
        }
    }
}
