/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exerc48;

/**
 *
 * @author Ricardo Sousa
 */
public class progDados44 {
    public static void main(String[]args){
    int DD1 = 0,DD2 = 0;
    while(DD1<=6){
        DD2=1;
        while(DD2<=6){
        if((DD1+DD2)==7){
            System.out.println(DD1+" e "+DD2);
        }
        DD2++;
    }
        
        DD1++;
    }
    }
}

