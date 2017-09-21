/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc12;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class Lp02Exerc12 {
    public static void main (String[]args){
    int[][] mat = new int [8][8];
    Scanner ler = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println("[1]Peão, [2]torre,[3]Bispo,[4]Cavalo,[5]Rainha,[6]Rei,[7]Vazio \n Digite o código:");
                
                mat[i][j] =  (int)(Math.random()*7);//ler.nextInt();
            }
        }
       
        for (int result : OrgPeck (mat)){
            System.out.print(result);
        }
    System.out.println("");
    
    
    }
    
    public static int [] OrgPeck(int [][] mat){
         int [] aux= new int [7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                aux [mat[i][j]]+=1;
                
            }
        }
        return aux;
    }    
    }

