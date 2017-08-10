/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer18a30;

import java.util.Scanner;

/**
 *
 * @author Ricardo Sousa
 */
public class progTempo25 {
    public static void main(String[]args){
        Scanner num = new Scanner(System.in);
        int hI = 0,hF = 0,mI = 0,mF = 0,tempHoras = 0, tempMinu = 0;
        
        System.out.println("Digite a hora inicial do jogo");
        hI = num.nextInt();
        System.out.println("Digite o minuto inicial do jogo");
        mI = num.nextInt();
        System.out.println("Digite a hora final do jogo");
        hF = num.nextInt();
        System.out.println("Digite a minuto final do jogo");
        mF = num.nextInt();
        
        if(hF>=hI){
            tempHoras = (hF-hI);
        }else{
            tempHoras = (hF+24-hI);
        }if(mF>=mI){
            tempMinu = mF-mI;
        }else{
            tempMinu = ((mF+59)-mI);
        }if(hI<=0&hF<=0&hI>24&hF>24&mI<=0&mF<=0&mI>59&mF>59){
            System.out.println("INVALIDO");
        }
        System.out.println("O jogo teve: "+tempHoras+" h "+tempMinu);
    
    }
    
}
