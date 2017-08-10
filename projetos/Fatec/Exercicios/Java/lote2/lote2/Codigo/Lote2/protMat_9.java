/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lote2;

import static javax.management.Query.lt;

/**
 *
 * @author Ricardo Sousa
 */
public class protMat_9 {
    public static void main(String[] args){    
      int [][] mat = new int [4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                mat [i][j]= ((int)(Math.random()*10));
            }
        }
      mat[0][0] = 1;
      mat[1][1] = 4;
      mat[2][2] = 16;
      mat[3][3] = 64;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j]+"\t");
            }
            System.out.println();
        }
    } 
}
