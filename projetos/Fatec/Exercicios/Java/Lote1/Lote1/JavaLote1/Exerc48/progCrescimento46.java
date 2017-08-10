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
public class progCrescimento46 {
    public static void main (String[]args){
        double iMaria = 1.5, iAna=1.10,anos=0;
        while(iMaria>=iAna){
            iMaria=iMaria+3;
            iAna=iAna+2;
            anos++;
            System.out.println(anos);
        }
        
    }
}
