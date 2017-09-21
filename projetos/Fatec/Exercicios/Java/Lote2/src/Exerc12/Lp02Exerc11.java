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
public class Lp02Exerc11 {
    public static void main(String[]args){
        int[][] mat = new int [8][8];
        int [] aux = new int [8];
        
        for (int Z = 0; Z<=4 ; Z ++){
            
            for(int X = Z; X<(8-Z); X++){
                for (int y = Z; y < (8-Z); y++) {
                    mat[Z][y]=Z +1;
                   System.out.print(mat[Z][y] + " ");
                }
                System.out.println(" ");
            }
        }
    }
}
